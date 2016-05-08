/*
 * generated by Xtext 2.9.2
 */
package hu.bme.mdsd.ztz.text.scoping

import hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage
import hu.bme.mdsd.ztz.model.behaviour.DynamicRobot
import hu.bme.mdsd.ztz.model.behaviour.Message
import hu.bme.mdsd.ztz.model.behaviour.TaskExecution
import hu.bme.mdsd.ztz.model.behaviour.TaskRequirement
import hu.bme.mdsd.ztz.model.drone.AreaObject
import hu.bme.mdsd.ztz.model.drone.Capability
import hu.bme.mdsd.ztz.model.drone.Robot
import hu.bme.mdsd.ztz.model.drone.RobotMissionContainer
import hu.bme.mdsd.ztz.model.drone.Task
import hu.bme.mdsd.ztz.text.manager.ResourceManager
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes
import hu.bme.mdsd.ztz.model.drone.DronePackage
import hu.bme.mdsd.ztz.model.drone.PropertyKey
import hu.bme.mdsd.ztz.model.drone.MeasureValue
import hu.bme.mdsd.ztz.model.drone.MeasureDimension
import hu.bme.mdsd.ztz.model.drone.CapabilityProperties
import hu.bme.mdsd.ztz.text.behaviourLanguage.DetectionStatement
import hu.bme.mdsd.ztz.text.behaviourLanguage.BehaviourLanguagePackage
import hu.bme.mdsd.ztz.text.behaviourLanguage.BehaviourLanguage
import hu.bme.mdsd.ztz.text.behaviourLanguage.TaskStatusCondition
import hu.bme.mdsd.ztz.text.behaviourLanguage.RobotStatusCondition

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class BehaviourLanguageScopeProvider extends AbstractBehaviourLanguageScopeProvider {

	override getScope(EObject context, EReference reference) {
		val manager = ResourceManager.instance
		if (manager.importedModelPath.empty) {
			val imp = (context.eResource.contents.get(0) as BehaviourLanguage).importModel
			if (imp.importURI.endsWith(manager.acceptedDomain)){
				manager.load(imp)
			}	
		}
		return scopeForContext(context, reference, manager)
	}
	
	def dispatch IScope scopeForContext(EObject context, EReference reference, ResourceManager manager) {
		super.getScope(context, reference)
	}

	def dispatch IScope scopeForContext(DynamicRobot context, EReference reference, ResourceManager manager) {
		if (reference == BehaviourPackage.Literals.DYNAMIC_ROBOT__ROBOT && manager.resource != null) {
			return Scopes.scopeFor(EcoreUtil2.getAllContentsOfType(getContainer(manager), Robot))
		}

		super.getScope(context, reference)
	}


	def dispatch IScope scopeForContext(TaskExecution context, EReference reference, ResourceManager manager) {
		if (reference == BehaviourPackage.Literals.TASK_EXECUTION__TASK && manager.resource != null) {
			return Scopes.scopeFor(EcoreUtil2.getAllContentsOfType(getContainer(manager), Task))
		}

		super.getScope(context, reference)
	}


	def dispatch IScope scopeForContext(Message context, EReference reference, ResourceManager manager) {
		if (reference == BehaviourPackage.Literals.MESSAGE__REFERRED_OBJECTS && manager.resource != null) {
			return Scopes.scopeFor(EcoreUtil2.getAllContentsOfType(getContainer(manager), AreaObject))
		}
		super.getScope(context, reference)
	}
	

	def dispatch IScope scopeForContext(TaskRequirement context, EReference reference, ResourceManager manager) {
		if (reference == BehaviourPackage.Literals.TASK_REQUIREMENT__REQUIRED_CAPABILITIES && manager.resource != null) {
			return Scopes.scopeFor(EcoreUtil2.getAllContentsOfType(getContainer(manager), Capability))
		}
		super.getScope(context, reference)
	}
	
	
	def dispatch IScope scopeForContext(DetectionStatement context, EReference reference, ResourceManager manager) {
		if (manager.resource != null) {
			if (reference == BehaviourLanguagePackage.Literals.DETECTION_STATEMENT__OBJECT) {
				return Scopes.scopeFor(EcoreUtil2.getAllContentsOfType(getContainer(manager), AreaObject))
			}
		}
		super.getScope(context, reference)
	}
	
	def dispatch IScope scopeForContext(hu.bme.mdsd.ztz.model.drone.Property context, EReference reference, ResourceManager manager) {
		if (reference == DronePackage.Literals.PROPERTY__KEY && manager.resource != null) {
			val droneProperties = EcoreUtil2.getAllContentsOfType(getContainer(manager), PropertyKey).toSet
			droneProperties.addAll(context.eResource.allContents.filter(PropertyKey).toSet)
			return Scopes.scopeFor(droneProperties)
		}
		super.getScope(context, reference)
	}
	
	def dispatch IScope scopeForContext(MeasureValue context, EReference reference, ResourceManager manager) {
		if (reference == DronePackage.Literals.MEASURE_VALUE__DIMENSION && manager.resource != null) {
			return Scopes.scopeFor(EcoreUtil2.getAllContentsOfType(getContainer(manager), MeasureDimension))
		}
		super.getScope(context, reference)
	}
	
	def dispatch IScope scopeForContext(CapabilityProperties context, EReference reference, ResourceManager manager) {
		if (reference == DronePackage.Literals.CAPABILITY_PROPERTIES__CAPABILITY && manager.resource != null) {
			return Scopes.scopeFor(EcoreUtil2.getAllContentsOfType(getContainer(manager), Capability))
		}
		super.getScope(context, reference)
	}
	
	def dispatch IScope scopeForContext(TaskStatusCondition context, EReference reference, ResourceManager manager) {
		if (reference == BehaviourLanguagePackage.Literals.TASK_STATUS_CONDITION__TASK_STATUS) {
			return Scopes.scopeFor(BehaviourPackage.Literals.TASK_EXECUTION_STATUS.ELiterals)
		}
		super.getScope(context, reference)
	}
	
	def dispatch IScope scopeForContext(RobotStatusCondition context, EReference reference, ResourceManager manager) {
		if (reference == BehaviourLanguagePackage.Literals.ROBOT_STATUS_CONDITION__ROBOT_STATUS) {
			return Scopes.scopeFor(BehaviourPackage.Literals.ROBOT_STATUS.ELiterals)
		}
		super.getScope(context, reference)
	}
	
	protected def RobotMissionContainer getContainer(ResourceManager manager) {
		manager.resource.contents.get(0) as RobotMissionContainer
	}

	

}
