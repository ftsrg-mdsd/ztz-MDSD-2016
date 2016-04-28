package hu.bme.mdsd.ztz.text.parser

import hu.bme.mdsd.ztz.model.behaviour.Action
import hu.bme.mdsd.ztz.model.behaviour.BehaviourFactory
import hu.bme.mdsd.ztz.model.behaviour.DynamicRobot
import hu.bme.mdsd.ztz.model.behaviour.Message
import hu.bme.mdsd.ztz.model.behaviour.RobotCollaboration
import hu.bme.mdsd.ztz.text.behaviourLanguage.ActionStatement
import hu.bme.mdsd.ztz.text.behaviourLanguage.AllTarget
import hu.bme.mdsd.ztz.text.behaviourLanguage.CollaborationStatement
import hu.bme.mdsd.ztz.text.behaviourLanguage.DetectionStatement
import hu.bme.mdsd.ztz.text.behaviourLanguage.ExecutionStatement
import hu.bme.mdsd.ztz.text.behaviourLanguage.MessageStatement
import hu.bme.mdsd.ztz.text.behaviourLanguage.MultiTarget
import hu.bme.mdsd.ztz.text.behaviourLanguage.UniTarget
import java.util.HashSet
import java.util.Set
import org.eclipse.emf.ecore.resource.Resource
import hu.bme.mdsd.ztz.text.behaviourLanguage.BehaviourLanguage
import hu.bme.mdsd.ztz.text.behaviourLanguage.Statement
import hu.bme.mdsd.ztz.text.behaviourLanguage.ConditionalStatement
import hu.bme.mdsd.ztz.text.behaviourLanguage.TaskStatusCondition
import hu.bme.mdsd.ztz.text.behaviourLanguage.RobotStatusCondition
import hu.bme.mdsd.ztz.text.behaviourLanguage.RobotStatusStatement
import hu.bme.mdsd.ztz.text.behaviourLanguage.TaskStatusStatement
import static extension hu.bme.mdsd.ztz.text.util.RobotUtil.*

class StatementParser {
	
	def parseStatements(Resource resource, Resource resourceOfBehaviour) {
		val statements = (resource.contents.get(0) as BehaviourLanguage).statements
	
		for (Statement statement : statements) {
			statement.parseStatement(resourceOfBehaviour)
		}
	}

	def dispatch parseStatement(ConditionalStatement conditionalStatement, Resource resourceOfBehaviour) {
		if (conditionalStatement.condition.trueCondition()) {
			for (Statement st : conditionalStatement.statements) {
				st.parseStatement(resourceOfBehaviour)
			}
		} else if (conditionalStatement.otherStatements != null){
			for (Statement st : conditionalStatement.otherStatements) {
				st.parseStatement(resourceOfBehaviour)
			}
		}
	}

	def dispatch trueCondition(TaskStatusCondition condition) {
		if (condition.equal) {
			return condition.task.status == condition.taskStatus	
		} else if (condition.notEqual) {
			return condition.task.status != condition.taskStatus
		}
	}
	
	def dispatch trueCondition(RobotStatusCondition condition) {
		if (condition.equal) {
			return condition.robot.status == condition.robotStatus	
		} else if (condition.notEqual) {
			return condition.robot.status != condition.robotStatus
		}
		
	}

	def dispatch parseStatement(ActionStatement statement, Resource resourceOfBehaviour) {
		val robot = statement.robot 
		var execution = statement.action.currentTaskExecution
		
		robot.addExecution(execution)
		robot.actions.add(statement.action)
		if (!statement.moreactions.empty) {
			for (Action action : statement.moreactions) {
				execution = action.currentTaskExecution
				robot.addExecution(execution)
			}
			statement.robot.actions.addAll(statement.moreactions)
		}
	}
	
	def dispatch parseStatement(DetectionStatement statement, Resource resourceOfBehaviour) {
		val robot = statement.robot
		robot.removeAreaObject(statement.object)
		
		val detectedObject = BehaviourFactory.eINSTANCE.createDetectedObject
		detectedObject.object = statement.object
		detectedObject.obstacle = statement.obstacle
		robot.detectedObjects.add(detectedObject)
	}

	def dispatch parseStatement(ExecutionStatement statement, Resource resourceOfBehaviour) {
		val robot = statement.robot
		
		if (!robot.executedTasks.contains(statement.execution)) {
			robot.executedTasks.add(statement.execution)
		}
	}
	
	def dispatch parseStatement(MessageStatement statement, Resource resourceOfBehaviour) {
		val senderRobot = statement.robot
		initMessageRepository(senderRobot)

		var messageTarget = statement.target
		var message = statement.message

		messageTarget.parseMessageTarget(senderRobot, message)
		
	}
	
	def dispatch parseStatement(RobotStatusStatement statement, Resource resourceOfBehaviour) {
		val robot = statement.robot
		
		robot.status = statement.status	
	}
	
	def dispatch parseStatement(TaskStatusStatement statement, Resource resourceOfBehaviour) {
		val task = statement.task
		task.status = statement.status		
	}
	
	def dispatch parseMessageTarget(UniTarget target, DynamicRobot senderRobot, Message message) {
		if (!reachableRobot(senderRobot, target.target)) {
			println("not reachable")
			return null
		}
		target.target.initMessageRepository()
		val action = BehaviourFactory.eINSTANCE.createUnicastCommunication()
		action.message = message
		action.target = target.target
		senderRobot.addAction(action)
		addSendedMessage(senderRobot, message)
	}
	
	def dispatch parseMessageTarget(MultiTarget target, DynamicRobot senderRobot, Message message) {
		for (DynamicRobot targetRobot : target.target) {
			if (!reachableRobot(senderRobot, targetRobot)) {
				return null
			}
		}
		for (DynamicRobot targetRobot : target.target) {
			targetRobot.initMessageRepository()
		}
		val action = BehaviourFactory.eINSTANCE.createMulticastCommunication()
		action.message = message
		action.targets.addAll(target.target)
		senderRobot.addAction(action)
		addSendedMessage(senderRobot, message)
	}
	
	def dispatch parseMessageTarget(AllTarget target, DynamicRobot senderRobot, Message message) {
		if (senderRobot.collaborations.empty) {
			return null
		}
		val action = BehaviourFactory.eINSTANCE.createBroadcastCommunication
		action.message = message
		
		val Set<DynamicRobot> targetRobots = new HashSet<DynamicRobot>()
		for (RobotCollaboration collab : senderRobot.collaborations) {
			targetRobots.add(collab.collaborator)
		}
		
		for (DynamicRobot robot : targetRobots) {
			robot.initMessageRepository()
		}
		
		action.targets.addAll(targetRobots)
		senderRobot.addAction(action)
		addSendedMessage(senderRobot, message)
	}
	
	def dispatch parseStatement(CollaborationStatement statement, Resource resourceOfBehaviour) {
		val robot = statement.robot

		val connectedRobots = new HashSet<DynamicRobot>()
		for (RobotCollaboration possibleCollaboration : statement.collaboration) {
			var inCollaboration = false
			for (RobotCollaboration collaboration : robot.collaborations) {
				if (collaboration.collaborator == possibleCollaboration.collaborator) {
					inCollaboration = true
				}
			}
			if (!inCollaboration) {
				if (robot != possibleCollaboration.collaborator) {
					connectedRobots.add(possibleCollaboration.collaborator)
				}
			}
		}

		for (DynamicRobot r : connectedRobots) {
			val newCollaboration = BehaviourFactory.eINSTANCE.createRobotCollaboration()
			newCollaboration.collaborator = r
			robot.collaborations.add(newCollaboration)

			val newOppositeCollaboration = BehaviourFactory.eINSTANCE.createRobotCollaboration()
			newOppositeCollaboration.collaborator = robot
			r.collaborations.add(newOppositeCollaboration)
		}
	}
	
	
}