/*
 * generated by Xtext 2.9.2
 */
package hu.bme.mdsd.ztz.text.serializer;

import com.google.inject.Inject;
import hu.bme.mdsd.ztz.model.behaviour.BehaviourContainer;
import hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage;
import hu.bme.mdsd.ztz.model.behaviour.BehaviouralPropertyKeyContainer;
import hu.bme.mdsd.ztz.model.behaviour.BroadcastCommunication;
import hu.bme.mdsd.ztz.model.behaviour.DetectedObject;
import hu.bme.mdsd.ztz.model.behaviour.DynamicRobot;
import hu.bme.mdsd.ztz.model.behaviour.Message;
import hu.bme.mdsd.ztz.model.behaviour.MessageRepository;
import hu.bme.mdsd.ztz.model.behaviour.MulticastCommunication;
import hu.bme.mdsd.ztz.model.behaviour.RobotCollaboration;
import hu.bme.mdsd.ztz.model.behaviour.TaskExecution;
import hu.bme.mdsd.ztz.model.behaviour.TaskRequirement;
import hu.bme.mdsd.ztz.model.behaviour.UnicastCommunication;
import hu.bme.mdsd.ztz.model.drone.CapabilityProperties;
import hu.bme.mdsd.ztz.model.drone.DronePackage;
import hu.bme.mdsd.ztz.model.drone.MeasureValue;
import hu.bme.mdsd.ztz.model.drone.Property;
import hu.bme.mdsd.ztz.model.drone.PropertyKey;
import hu.bme.mdsd.ztz.model.drone.StringValue;
import hu.bme.mdsd.ztz.text.behaviourLanguage.ActionStatement;
import hu.bme.mdsd.ztz.text.behaviourLanguage.AllTarget;
import hu.bme.mdsd.ztz.text.behaviourLanguage.BehaviourLanguage;
import hu.bme.mdsd.ztz.text.behaviourLanguage.BehaviourLanguagePackage;
import hu.bme.mdsd.ztz.text.behaviourLanguage.CollaborationStatement;
import hu.bme.mdsd.ztz.text.behaviourLanguage.Import;
import hu.bme.mdsd.ztz.text.behaviourLanguage.MessageStatement;
import hu.bme.mdsd.ztz.text.behaviourLanguage.MultiTarget;
import hu.bme.mdsd.ztz.text.behaviourLanguage.UniTarget;
import hu.bme.mdsd.ztz.text.services.BehaviourLanguageGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class BehaviourLanguageSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private BehaviourLanguageGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == BehaviourPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case BehaviourPackage.ACTION:
				sequence_Action_Impl(context, (hu.bme.mdsd.ztz.model.behaviour.Action) semanticObject); 
				return; 
			case BehaviourPackage.BEHAVIOUR_CONTAINER:
				sequence_BehaviourContainer(context, (BehaviourContainer) semanticObject); 
				return; 
			case BehaviourPackage.BEHAVIOURAL_PROPERTY_KEY_CONTAINER:
				sequence_BehaviouralPropertyKeyContainer(context, (BehaviouralPropertyKeyContainer) semanticObject); 
				return; 
			case BehaviourPackage.BROADCAST_COMMUNICATION:
				sequence_BroadcastCommunication(context, (BroadcastCommunication) semanticObject); 
				return; 
			case BehaviourPackage.DETECTED_OBJECT:
				sequence_DetectedObject(context, (DetectedObject) semanticObject); 
				return; 
			case BehaviourPackage.DYNAMIC_ROBOT:
				sequence_DynamicRobot(context, (DynamicRobot) semanticObject); 
				return; 
			case BehaviourPackage.MESSAGE:
				sequence_Message(context, (Message) semanticObject); 
				return; 
			case BehaviourPackage.MESSAGE_REPOSITORY:
				sequence_MessageRepository(context, (MessageRepository) semanticObject); 
				return; 
			case BehaviourPackage.MULTICAST_COMMUNICATION:
				sequence_MulticastCommunication(context, (MulticastCommunication) semanticObject); 
				return; 
			case BehaviourPackage.ROBOT_COLLABORATION:
				sequence_RobotCollaboration(context, (RobotCollaboration) semanticObject); 
				return; 
			case BehaviourPackage.TASK_EXECUTION:
				sequence_TaskExecution(context, (TaskExecution) semanticObject); 
				return; 
			case BehaviourPackage.TASK_REQUIREMENT:
				sequence_TaskRequirement(context, (TaskRequirement) semanticObject); 
				return; 
			case BehaviourPackage.UNICAST_COMMUNICATION:
				sequence_UnicastCommunication(context, (UnicastCommunication) semanticObject); 
				return; 
			}
		else if (epackage == BehaviourLanguagePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case BehaviourLanguagePackage.ACTION_STATEMENT:
				sequence_ActionStatement(context, (ActionStatement) semanticObject); 
				return; 
			case BehaviourLanguagePackage.ALL_TARGET:
				sequence_AllTarget(context, (AllTarget) semanticObject); 
				return; 
			case BehaviourLanguagePackage.BEHAVIOUR_LANGUAGE:
				sequence_BehaviourLanguage(context, (BehaviourLanguage) semanticObject); 
				return; 
			case BehaviourLanguagePackage.COLLABORATION_STATEMENT:
				sequence_CollaborationStatement(context, (CollaborationStatement) semanticObject); 
				return; 
			case BehaviourLanguagePackage.IMPORT:
				sequence_Import(context, (Import) semanticObject); 
				return; 
			case BehaviourLanguagePackage.MESSAGE_STATEMENT:
				sequence_MessageStatement(context, (MessageStatement) semanticObject); 
				return; 
			case BehaviourLanguagePackage.MULTI_TARGET:
				sequence_MultiTarget(context, (MultiTarget) semanticObject); 
				return; 
			case BehaviourLanguagePackage.UNI_TARGET:
				sequence_UniTarget(context, (UniTarget) semanticObject); 
				return; 
			}
		else if (epackage == DronePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case DronePackage.CAPABILITY_PROPERTIES:
				sequence_CapabilityProperties(context, (CapabilityProperties) semanticObject); 
				return; 
			case DronePackage.MEASURE_VALUE:
				sequence_MeasureValue(context, (MeasureValue) semanticObject); 
				return; 
			case DronePackage.PROPERTY:
				sequence_Property(context, (Property) semanticObject); 
				return; 
			case DronePackage.PROPERTY_KEY:
				sequence_PropertyKey(context, (PropertyKey) semanticObject); 
				return; 
			case DronePackage.STRING_VALUE:
				sequence_StringValue(context, (StringValue) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Statement returns ActionStatement
	 *     ActionStatement returns ActionStatement
	 *
	 * Constraint:
	 *     (robot=[DynamicRobot|ID] action=Action_Impl moreactions+=Action_Impl*)
	 */
	protected void sequence_ActionStatement(ISerializationContext context, ActionStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Action_Impl returns Action
	 *
	 * Constraint:
	 *     (name=EString currentTaskExecution=[TaskExecution|ID]? (properties+=Property properties+=Property*)?)
	 */
	protected void sequence_Action_Impl(ISerializationContext context, hu.bme.mdsd.ztz.model.behaviour.Action semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MessageTarget returns AllTarget
	 *     AllTarget returns AllTarget
	 *
	 * Constraint:
	 *     target='*'
	 */
	protected void sequence_AllTarget(ISerializationContext context, AllTarget semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BehaviourLanguagePackage.Literals.ALL_TARGET__TARGET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BehaviourLanguagePackage.Literals.ALL_TARGET__TARGET));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAllTargetAccess().getTargetAsteriskKeyword_0(), semanticObject.getTarget());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     BehaviourContainer returns BehaviourContainer
	 *
	 * Constraint:
	 *     (
	 *         (dynamicRobots+=DynamicRobot dynamicRobots+=DynamicRobot*)? 
	 *         (taskExecutions+=TaskExecution taskExecutions+=TaskExecution*)? 
	 *         (taskRequirements+=TaskRequirement taskRequirements+=TaskRequirement*)? 
	 *         behaviourKeysContainer=BehaviouralPropertyKeyContainer?
	 *     )
	 */
	protected void sequence_BehaviourContainer(ISerializationContext context, BehaviourContainer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     BehaviourLanguage returns BehaviourLanguage
	 *
	 * Constraint:
	 *     (importModel=Import container=BehaviourContainer statements+=Statement*)
	 */
	protected void sequence_BehaviourLanguage(ISerializationContext context, BehaviourLanguage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     BehaviouralPropertyKeyContainer returns BehaviouralPropertyKeyContainer
	 *
	 * Constraint:
	 *     (name=EString (keys+=PropertyKey keys+=PropertyKey*)?)
	 */
	protected void sequence_BehaviouralPropertyKeyContainer(ISerializationContext context, BehaviouralPropertyKeyContainer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     BroadcastCommunication returns BroadcastCommunication
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         currentTaskExecution=[TaskExecution|EString]? 
	 *         message=[Message|EString] 
	 *         targets+=[DynamicRobot|EString] 
	 *         targets+=[DynamicRobot|EString]* 
	 *         (properties+=Property properties+=Property*)?
	 *     )
	 */
	protected void sequence_BroadcastCommunication(ISerializationContext context, BroadcastCommunication semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     CapabilityProperties returns CapabilityProperties
	 *
	 * Constraint:
	 *     (capability=[Capability|EString] (properties+=Property properties+=Property*)?)
	 */
	protected void sequence_CapabilityProperties(ISerializationContext context, CapabilityProperties semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns CollaborationStatement
	 *     CollaborationStatement returns CollaborationStatement
	 *
	 * Constraint:
	 *     (robot=[DynamicRobot|ID] collaboration+=RobotCollaboration)
	 */
	protected void sequence_CollaborationStatement(ISerializationContext context, CollaborationStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DetectedObject returns DetectedObject
	 *
	 * Constraint:
	 *     (obstacle?='obstacle'? object=[AreaObject|ID])
	 */
	protected void sequence_DetectedObject(ISerializationContext context, DetectedObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DynamicRobot returns DynamicRobot
	 *
	 * Constraint:
	 *     (name=EString robot=[Robot|ID])
	 */
	protected void sequence_DynamicRobot(ISerializationContext context, DynamicRobot semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DronePackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DronePackage.Literals.NAMED_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, BehaviourPackage.Literals.DYNAMIC_ROBOT__ROBOT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BehaviourPackage.Literals.DYNAMIC_ROBOT__ROBOT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDynamicRobotAccess().getNameEStringParserRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getDynamicRobotAccess().getRobotRobotIDTerminalRuleCall_2_0_1(), semanticObject.getRobot());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Import returns Import
	 *
	 * Constraint:
	 *     importURI=STRING
	 */
	protected void sequence_Import(ISerializationContext context, Import semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BehaviourLanguagePackage.Literals.IMPORT__IMPORT_URI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BehaviourLanguagePackage.Literals.IMPORT__IMPORT_URI));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0(), semanticObject.getImportURI());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     PropertyValue returns MeasureValue
	 *     MeasureValue returns MeasureValue
	 *
	 * Constraint:
	 *     (value=EFloat? dimension=[MeasureDimension|EString])
	 */
	protected void sequence_MeasureValue(ISerializationContext context, MeasureValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MessageRepository returns MessageRepository
	 *
	 * Constraint:
	 *     (name=EString (sendedMessages+=Message sendedMessages+=Message*)?)
	 */
	protected void sequence_MessageRepository(ISerializationContext context, MessageRepository semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns MessageStatement
	 *     MessageStatement returns MessageStatement
	 *
	 * Constraint:
	 *     (robot=[DynamicRobot|ID] target=MessageTarget message=Message)
	 */
	protected void sequence_MessageStatement(ISerializationContext context, MessageStatement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BehaviourLanguagePackage.Literals.STATEMENT__ROBOT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BehaviourLanguagePackage.Literals.STATEMENT__ROBOT));
			if (transientValues.isValueTransient(semanticObject, BehaviourLanguagePackage.Literals.MESSAGE_STATEMENT__TARGET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BehaviourLanguagePackage.Literals.MESSAGE_STATEMENT__TARGET));
			if (transientValues.isValueTransient(semanticObject, BehaviourLanguagePackage.Literals.MESSAGE_STATEMENT__MESSAGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BehaviourLanguagePackage.Literals.MESSAGE_STATEMENT__MESSAGE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMessageStatementAccess().getRobotDynamicRobotIDTerminalRuleCall_0_0_1(), semanticObject.getRobot());
		feeder.accept(grammarAccess.getMessageStatementAccess().getTargetMessageTargetParserRuleCall_2_0(), semanticObject.getTarget());
		feeder.accept(grammarAccess.getMessageStatementAccess().getMessageMessageParserRuleCall_3_0(), semanticObject.getMessage());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Message returns Message
	 *
	 * Constraint:
	 *     (
	 *         needResponse?='needResponse' 
	 *         name=EString 
	 *         timestamp=EDate? 
	 *         (involvedTaskExecutions+=[TaskExecution|EString] involvedTaskExecutions+=[TaskExecution|EString]*)? 
	 *         (referredObjects+=[AreaObject|EString] referredObjects+=[AreaObject|EString]*)? 
	 *         follows=[Message|EString]? 
	 *         (properties+=Property properties+=Property*)? 
	 *         TTL=MeasureValue?
	 *     )
	 */
	protected void sequence_Message(ISerializationContext context, Message semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MessageTarget returns MultiTarget
	 *     MultiTarget returns MultiTarget
	 *
	 * Constraint:
	 *     target+=[DynamicRobot|ID]
	 */
	protected void sequence_MultiTarget(ISerializationContext context, MultiTarget semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MulticastCommunication returns MulticastCommunication
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         currentTaskExecution=[TaskExecution|EString]? 
	 *         message=[Message|EString] 
	 *         targets+=[DynamicRobot|EString] 
	 *         targets+=[DynamicRobot|EString]* 
	 *         (properties+=Property properties+=Property*)?
	 *     )
	 */
	protected void sequence_MulticastCommunication(ISerializationContext context, MulticastCommunication semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PropertyKey returns PropertyKey
	 *
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_PropertyKey(ISerializationContext context, PropertyKey semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DronePackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DronePackage.Literals.NAMED_ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPropertyKeyAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Property returns Property
	 *
	 * Constraint:
	 *     (key=[PropertyKey|EString] value=PropertyValue)
	 */
	protected void sequence_Property(ISerializationContext context, Property semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DronePackage.Literals.PROPERTY__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DronePackage.Literals.PROPERTY__KEY));
			if (transientValues.isValueTransient(semanticObject, DronePackage.Literals.PROPERTY__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DronePackage.Literals.PROPERTY__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPropertyAccess().getKeyPropertyKeyEStringParserRuleCall_3_0_1(), semanticObject.getKey());
		feeder.accept(grammarAccess.getPropertyAccess().getValuePropertyValueParserRuleCall_5_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     RobotCollaboration returns RobotCollaboration
	 *
	 * Constraint:
	 *     (collaborator=[DynamicRobot|ID] (properties+=Property properties+=Property*)?)
	 */
	protected void sequence_RobotCollaboration(ISerializationContext context, RobotCollaboration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PropertyValue returns StringValue
	 *     StringValue returns StringValue
	 *
	 * Constraint:
	 *     value=EString
	 */
	protected void sequence_StringValue(ISerializationContext context, StringValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DronePackage.Literals.STRING_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DronePackage.Literals.STRING_VALUE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStringValueAccess().getValueEStringParserRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TaskExecution returns TaskExecution
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         status=TaskExecutionStatus 
	 *         (executors+=[DynamicRobot|EString] executors+=[DynamicRobot|EString]*)? 
	 *         task=[Task|EString] 
	 *         requirement=[TaskRequirement|EString]? 
	 *         executionTime=MeasureValue?
	 *     )
	 */
	protected void sequence_TaskExecution(ISerializationContext context, TaskExecution semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TaskRequirement returns TaskRequirement
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         participants=EInt 
	 *         taskExecution=[TaskExecution|EString] 
	 *         prerequisite=[TaskExecution|EString]? 
	 *         (requiredCapabilities+=[Capability|EString] requiredCapabilities+=[Capability|EString]*)? 
	 *         (properties+=Property properties+=Property*)? 
	 *         (capabilityProperties+=CapabilityProperties capabilityProperties+=CapabilityProperties*)?
	 *     )
	 */
	protected void sequence_TaskRequirement(ISerializationContext context, TaskRequirement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MessageTarget returns UniTarget
	 *     UniTarget returns UniTarget
	 *
	 * Constraint:
	 *     target=[DynamicRobot|ID]
	 */
	protected void sequence_UniTarget(ISerializationContext context, UniTarget semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BehaviourLanguagePackage.Literals.UNI_TARGET__TARGET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BehaviourLanguagePackage.Literals.UNI_TARGET__TARGET));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getUniTargetAccess().getTargetDynamicRobotIDTerminalRuleCall_0_1(), semanticObject.getTarget());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     UnicastCommunication returns UnicastCommunication
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         currentTaskExecution=[TaskExecution|EString]? 
	 *         message=[Message|EString] 
	 *         target=[DynamicRobot|EString] 
	 *         (properties+=Property properties+=Property*)?
	 *     )
	 */
	protected void sequence_UnicastCommunication(ISerializationContext context, UnicastCommunication semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
