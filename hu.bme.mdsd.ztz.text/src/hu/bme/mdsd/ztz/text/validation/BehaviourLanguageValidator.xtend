/*
 * generated by Xtext 2.9.2
 */
package hu.bme.mdsd.ztz.text.validation

import hu.bme.mdsd.ztz.model.behaviour.BehaviourContainer
import hu.bme.mdsd.ztz.model.behaviour.DynamicRobot
import hu.bme.mdsd.ztz.model.behaviour.Message
import hu.bme.mdsd.ztz.model.behaviour.RobotCollaboration
import hu.bme.mdsd.ztz.model.behaviour.TaskExecution
import hu.bme.mdsd.ztz.model.drone.DronePackage
import hu.bme.mdsd.ztz.text.behaviourLanguage.AllTarget
import hu.bme.mdsd.ztz.text.behaviourLanguage.BehaviourLanguage
import hu.bme.mdsd.ztz.text.behaviourLanguage.BehaviourLanguagePackage
import hu.bme.mdsd.ztz.text.behaviourLanguage.CollaborationStatement
import hu.bme.mdsd.ztz.text.behaviourLanguage.Import
import hu.bme.mdsd.ztz.text.behaviourLanguage.MessageStatement
import hu.bme.mdsd.ztz.text.behaviourLanguage.MultiTarget
import hu.bme.mdsd.ztz.text.behaviourLanguage.UniTarget
import hu.bme.mdsd.ztz.text.manager.ResourceManager
import org.eclipse.xtext.validation.Check


/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class BehaviourLanguageValidator extends AbstractBehaviourLanguageValidator {
	
	
	@Check
	def handleImport(Import imp) {
		if (imp.importURI.empty) {
			error("Import cannot be empty", BehaviourLanguagePackage.Literals.IMPORT__IMPORT_URI, ErrorCodes.INVALID_IMPORT)
		} else if (imp.importURI.endsWith(ResourceManager.instance.acceptedDomain)){
			val manager = ResourceManager.instance
			try {
				manager.load(imp)
			}
			catch (Exception e) {
				error(e.message, BehaviourLanguagePackage.Literals.IMPORT__IMPORT_URI, ErrorCodes.INVALID_IMPORT)
			}
		} else {
			error("The resource must be an instance of " + ResourceManager.instance.acceptedDomain, 
				BehaviourLanguagePackage.Literals.IMPORT__IMPORT_URI, ErrorCodes.INVALID_IMPORT
			)
		}
	}
	
	@Check
	def checkSelfKnowing(CollaborationStatement statement) {
		for (RobotCollaboration collab : statement.collaboration) {
			if (statement.robot == collab.collaborator) {
				error("Robots cannot know themselves", BehaviourLanguagePackage.Literals.COLLABORATION_STATEMENT__ROBOT, ErrorCodes.SAME_COLLABORATOR)
			}
		}
	}
	
	@Check
	def checkUniqueRobotNames(DynamicRobot robot) {
		val container = robot.eContainer as BehaviourContainer
		for (DynamicRobot otherRobot : container.dynamicRobots) {
			if (otherRobot != robot) {
				if (otherRobot.name.equals(robot.name)) {
					error("Robots cannot have the same name", robot, DronePackage.Literals.NAMED_ELEMENT__NAME, ErrorCodes.SAME_ROBOT_NAME)
				}
			}
		}
	}
	
	
	@Check
	def checkUniqueMessageNames(Message message) {
		val messagesIterator = message.eResource.allContents.filter(Message)
		while (messagesIterator.hasNext) {
			var otherMessage = messagesIterator.next()
			if (otherMessage != message) {
				if (otherMessage.name.equals(message.name)) {
					error("Messages cannot have the same name", message, DronePackage.Literals.NAMED_ELEMENT__NAME, ErrorCodes.SAME_MESSAGE_NAME)
				}
			}
			
		}
	}
	
	@Check
	def checkUniqueTaskExecutionNames(TaskExecution taskExecution) {
		val taskIterator = taskExecution.eResource.allContents.filter(TaskExecution)
		while (taskIterator.hasNext) {
			var otherMessage = taskIterator.next()
			if (otherMessage != taskExecution) {
				if (otherMessage.name.equals(taskExecution.name)) {
					error("Messages cannot have the same name", taskExecution, DronePackage.Literals.NAMED_ELEMENT__NAME, ErrorCodes.SAME_TASK_EXECUTION_NAME)
				}
			}
		}
	}
	
	
	@Check
	def checkUniqueMessageStatement(MessageStatement statement) {
		val robot = statement.robot
		val collabStatements = (statement.eContainer as BehaviourLanguage).statements.filter(CollaborationStatement)
		val target = statement.target 
		
		if (target instanceof UniTarget) {
			if (!inCollaboration(collabStatements, robot, target.target)) {
				error("Target robot is not in collaboration with the sender robot", target, BehaviourLanguagePackage.Literals.UNI_TARGET__TARGET, ErrorCodes.NOT_IN_COLLABORATION)
			}
		} else if (target instanceof MultiTarget) {
			for (DynamicRobot targetRobot : target.target) {
				if (!inCollaboration(collabStatements, robot, targetRobot)) {
					error("Target robot is not in collaboration with the sender robot", target, BehaviourLanguagePackage.Literals.MULTI_TARGET__TARGET, ErrorCodes.NOT_IN_COLLABORATION)
				}
			}
		} else if (target instanceof AllTarget) {
			if (!hasCollaboration(collabStatements, robot)) {
				error("The sender robot is not in collaboration with anyone", target, BehaviourLanguagePackage.Literals.ALL_TARGET__TARGET, ErrorCodes.NOT_IN_COLLABORATION)
			}
			
		}
	}
	
	def boolean hasCollaboration(Iterable<CollaborationStatement> collabStatements, DynamicRobot robot) {
		for (CollaborationStatement stat : collabStatements) {
				if (stat.robot == robot) {
					return true		
				} else {
					for (RobotCollaboration collab : stat.collaboration) {
						if (collab.collaborator == robot) {
							return true
						}
					}
				}
			}
		return false
	}
	
	def inCollaboration(Iterable<CollaborationStatement> collabStatements, DynamicRobot robot, DynamicRobot targetRobot) {
		for (CollaborationStatement stat : collabStatements) {
			if (stat.robot == targetRobot) {
				return true
			} else if (stat.robot == robot) {
				for (RobotCollaboration collab : stat.collaboration) {
					if (collab.collaborator == targetRobot) {
						return true
					}
				}
			} 
		}
		return false
	}
}
