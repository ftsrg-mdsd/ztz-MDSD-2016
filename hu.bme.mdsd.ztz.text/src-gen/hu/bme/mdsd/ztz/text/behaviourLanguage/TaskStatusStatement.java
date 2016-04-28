/**
 * generated by Xtext 2.9.2
 */
package hu.bme.mdsd.ztz.text.behaviourLanguage;

import hu.bme.mdsd.ztz.model.behaviour.TaskExecution;
import hu.bme.mdsd.ztz.model.behaviour.TaskExecutionStatus;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Status Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mdsd.ztz.text.behaviourLanguage.TaskStatusStatement#getTask <em>Task</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.text.behaviourLanguage.TaskStatusStatement#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see hu.bme.mdsd.ztz.text.behaviourLanguage.BehaviourLanguagePackage#getTaskStatusStatement()
 * @model
 * @generated
 */
public interface TaskStatusStatement extends StatusStatement
{
  /**
   * Returns the value of the '<em><b>Task</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Task</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Task</em>' reference.
   * @see #setTask(TaskExecution)
   * @see hu.bme.mdsd.ztz.text.behaviourLanguage.BehaviourLanguagePackage#getTaskStatusStatement_Task()
   * @model
   * @generated
   */
  TaskExecution getTask();

  /**
   * Sets the value of the '{@link hu.bme.mdsd.ztz.text.behaviourLanguage.TaskStatusStatement#getTask <em>Task</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Task</em>' reference.
   * @see #getTask()
   * @generated
   */
  void setTask(TaskExecution value);

  /**
   * Returns the value of the '<em><b>Status</b></em>' attribute.
   * The literals are from the enumeration {@link hu.bme.mdsd.ztz.model.behaviour.TaskExecutionStatus}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Status</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Status</em>' attribute.
   * @see hu.bme.mdsd.ztz.model.behaviour.TaskExecutionStatus
   * @see #setStatus(TaskExecutionStatus)
   * @see hu.bme.mdsd.ztz.text.behaviourLanguage.BehaviourLanguagePackage#getTaskStatusStatement_Status()
   * @model
   * @generated
   */
  TaskExecutionStatus getStatus();

  /**
   * Sets the value of the '{@link hu.bme.mdsd.ztz.text.behaviourLanguage.TaskStatusStatement#getStatus <em>Status</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Status</em>' attribute.
   * @see hu.bme.mdsd.ztz.model.behaviour.TaskExecutionStatus
   * @see #getStatus()
   * @generated
   */
  void setStatus(TaskExecutionStatus value);

} // TaskStatusStatement