/**
 * generated by Xtext 2.9.2
 */
package hu.bme.mdsd.ztz.text.behaviourLanguage.util;

import hu.bme.mdsd.ztz.text.behaviourLanguage.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see hu.bme.mdsd.ztz.text.behaviourLanguage.BehaviourLanguagePackage
 * @generated
 */
public class BehaviourLanguageSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static BehaviourLanguagePackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BehaviourLanguageSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = BehaviourLanguagePackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case BehaviourLanguagePackage.BEHAVIOUR_LANGUAGE:
      {
        BehaviourLanguage behaviourLanguage = (BehaviourLanguage)theEObject;
        T result = caseBehaviourLanguage(behaviourLanguage);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BehaviourLanguagePackage.IMPORT:
      {
        Import import_ = (Import)theEObject;
        T result = caseImport(import_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BehaviourLanguagePackage.STATEMENT:
      {
        Statement statement = (Statement)theEObject;
        T result = caseStatement(statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BehaviourLanguagePackage.ATOMIC_STATEMENT:
      {
        AtomicStatement atomicStatement = (AtomicStatement)theEObject;
        T result = caseAtomicStatement(atomicStatement);
        if (result == null) result = caseStatement(atomicStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BehaviourLanguagePackage.CONDITIONAL_STATEMENT:
      {
        ConditionalStatement conditionalStatement = (ConditionalStatement)theEObject;
        T result = caseConditionalStatement(conditionalStatement);
        if (result == null) result = caseStatement(conditionalStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BehaviourLanguagePackage.SYNCHRONOUS_STATEMENT:
      {
        SynchronousStatement synchronousStatement = (SynchronousStatement)theEObject;
        T result = caseSynchronousStatement(synchronousStatement);
        if (result == null) result = caseStatement(synchronousStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BehaviourLanguagePackage.ACTION_STATEMENT:
      {
        ActionStatement actionStatement = (ActionStatement)theEObject;
        T result = caseActionStatement(actionStatement);
        if (result == null) result = caseAtomicStatement(actionStatement);
        if (result == null) result = caseStatement(actionStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BehaviourLanguagePackage.MESSAGE_STATEMENT:
      {
        MessageStatement messageStatement = (MessageStatement)theEObject;
        T result = caseMessageStatement(messageStatement);
        if (result == null) result = caseAtomicStatement(messageStatement);
        if (result == null) result = caseStatement(messageStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BehaviourLanguagePackage.COLLABORATION_STATEMENT:
      {
        CollaborationStatement collaborationStatement = (CollaborationStatement)theEObject;
        T result = caseCollaborationStatement(collaborationStatement);
        if (result == null) result = caseAtomicStatement(collaborationStatement);
        if (result == null) result = caseStatement(collaborationStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BehaviourLanguagePackage.DETECTION_STATEMENT:
      {
        DetectionStatement detectionStatement = (DetectionStatement)theEObject;
        T result = caseDetectionStatement(detectionStatement);
        if (result == null) result = caseAtomicStatement(detectionStatement);
        if (result == null) result = caseStatement(detectionStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BehaviourLanguagePackage.EXECUTION_STATEMENT:
      {
        ExecutionStatement executionStatement = (ExecutionStatement)theEObject;
        T result = caseExecutionStatement(executionStatement);
        if (result == null) result = caseAtomicStatement(executionStatement);
        if (result == null) result = caseStatement(executionStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BehaviourLanguagePackage.STATUS_STATEMENT:
      {
        StatusStatement statusStatement = (StatusStatement)theEObject;
        T result = caseStatusStatement(statusStatement);
        if (result == null) result = caseAtomicStatement(statusStatement);
        if (result == null) result = caseStatement(statusStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BehaviourLanguagePackage.ROBOT_STATUS_STATEMENT:
      {
        RobotStatusStatement robotStatusStatement = (RobotStatusStatement)theEObject;
        T result = caseRobotStatusStatement(robotStatusStatement);
        if (result == null) result = caseStatusStatement(robotStatusStatement);
        if (result == null) result = caseAtomicStatement(robotStatusStatement);
        if (result == null) result = caseStatement(robotStatusStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BehaviourLanguagePackage.TASK_STATUS_STATEMENT:
      {
        TaskStatusStatement taskStatusStatement = (TaskStatusStatement)theEObject;
        T result = caseTaskStatusStatement(taskStatusStatement);
        if (result == null) result = caseStatusStatement(taskStatusStatement);
        if (result == null) result = caseAtomicStatement(taskStatusStatement);
        if (result == null) result = caseStatement(taskStatusStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BehaviourLanguagePackage.MESSAGE_TARGET:
      {
        MessageTarget messageTarget = (MessageTarget)theEObject;
        T result = caseMessageTarget(messageTarget);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BehaviourLanguagePackage.UNI_TARGET:
      {
        UniTarget uniTarget = (UniTarget)theEObject;
        T result = caseUniTarget(uniTarget);
        if (result == null) result = caseMessageTarget(uniTarget);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BehaviourLanguagePackage.MULTI_TARGET:
      {
        MultiTarget multiTarget = (MultiTarget)theEObject;
        T result = caseMultiTarget(multiTarget);
        if (result == null) result = caseMessageTarget(multiTarget);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BehaviourLanguagePackage.ALL_TARGET:
      {
        AllTarget allTarget = (AllTarget)theEObject;
        T result = caseAllTarget(allTarget);
        if (result == null) result = caseMessageTarget(allTarget);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BehaviourLanguagePackage.CONDITION:
      {
        Condition condition = (Condition)theEObject;
        T result = caseCondition(condition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BehaviourLanguagePackage.TASK_STATUS_CONDITION:
      {
        TaskStatusCondition taskStatusCondition = (TaskStatusCondition)theEObject;
        T result = caseTaskStatusCondition(taskStatusCondition);
        if (result == null) result = caseCondition(taskStatusCondition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BehaviourLanguagePackage.ROBOT_STATUS_CONDITION:
      {
        RobotStatusCondition robotStatusCondition = (RobotStatusCondition)theEObject;
        T result = caseRobotStatusCondition(robotStatusCondition);
        if (result == null) result = caseCondition(robotStatusCondition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Behaviour Language</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Behaviour Language</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBehaviourLanguage(BehaviourLanguage object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImport(Import object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStatement(Statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Atomic Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Atomic Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAtomicStatement(AtomicStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Conditional Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Conditional Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConditionalStatement(ConditionalStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Synchronous Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Synchronous Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSynchronousStatement(SynchronousStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActionStatement(ActionStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Message Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Message Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMessageStatement(MessageStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Collaboration Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Collaboration Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCollaborationStatement(CollaborationStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Detection Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Detection Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDetectionStatement(DetectionStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Execution Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Execution Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExecutionStatement(ExecutionStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Status Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Status Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStatusStatement(StatusStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Robot Status Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Robot Status Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRobotStatusStatement(RobotStatusStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Task Status Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Task Status Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTaskStatusStatement(TaskStatusStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Message Target</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Message Target</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMessageTarget(MessageTarget object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Uni Target</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Uni Target</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUniTarget(UniTarget object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Multi Target</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Multi Target</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMultiTarget(MultiTarget object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>All Target</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>All Target</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAllTarget(AllTarget object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCondition(Condition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Task Status Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Task Status Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTaskStatusCondition(TaskStatusCondition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Robot Status Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Robot Status Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRobotStatusCondition(RobotStatusCondition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //BehaviourLanguageSwitch
