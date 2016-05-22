/**
 * generated by Xtext 2.9.2
 */
package hu.bme.mdsd.ztz.text.behaviourLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Status Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mdsd.ztz.text.behaviourLanguage.StatusStatement#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see hu.bme.mdsd.ztz.text.behaviourLanguage.BehaviourLanguagePackage#getStatusStatement()
 * @model
 * @generated
 */
public interface StatusStatement extends AtomicStatement
{
  /**
   * Returns the value of the '<em><b>Status</b></em>' attribute.
   * The literals are from the enumeration {@link hu.bme.mdsd.ztz.text.behaviourLanguage.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Status</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Status</em>' attribute.
   * @see hu.bme.mdsd.ztz.text.behaviourLanguage.EObject
   * @see #setStatus(EObject)
   * @see hu.bme.mdsd.ztz.text.behaviourLanguage.BehaviourLanguagePackage#getStatusStatement_Status()
   * @model
   * @generated
   */
  EObject getStatus();

  /**
   * Sets the value of the '{@link hu.bme.mdsd.ztz.text.behaviourLanguage.StatusStatement#getStatus <em>Status</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Status</em>' attribute.
   * @see hu.bme.mdsd.ztz.text.behaviourLanguage.EObject
   * @see #getStatus()
   * @generated
   */
  void setStatus(EObject value);

} // StatusStatement
