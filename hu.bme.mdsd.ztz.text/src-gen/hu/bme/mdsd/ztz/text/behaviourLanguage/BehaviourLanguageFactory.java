/**
 * generated by Xtext 2.9.2
 */
package hu.bme.mdsd.ztz.text.behaviourLanguage;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.bme.mdsd.ztz.text.behaviourLanguage.BehaviourLanguagePackage
 * @generated
 */
public interface BehaviourLanguageFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  BehaviourLanguageFactory eINSTANCE = hu.bme.mdsd.ztz.text.behaviourLanguage.impl.BehaviourLanguageFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Behaviour Language</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Behaviour Language</em>'.
   * @generated
   */
  BehaviourLanguage createBehaviourLanguage();

  /**
   * Returns a new object of class '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import</em>'.
   * @generated
   */
  Import createImport();

  /**
   * Returns a new object of class '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Statement</em>'.
   * @generated
   */
  Statement createStatement();

  /**
   * Returns a new object of class '<em>Action Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Action Statement</em>'.
   * @generated
   */
  ActionStatement createActionStatement();

  /**
   * Returns a new object of class '<em>Message Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Message Statement</em>'.
   * @generated
   */
  MessageStatement createMessageStatement();

  /**
   * Returns a new object of class '<em>Collaboration Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Collaboration Statement</em>'.
   * @generated
   */
  CollaborationStatement createCollaborationStatement();

  /**
   * Returns a new object of class '<em>Detection Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Detection Statement</em>'.
   * @generated
   */
  DetectionStatement createDetectionStatement();

  /**
   * Returns a new object of class '<em>Message Target</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Message Target</em>'.
   * @generated
   */
  MessageTarget createMessageTarget();

  /**
   * Returns a new object of class '<em>Uni Target</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Uni Target</em>'.
   * @generated
   */
  UniTarget createUniTarget();

  /**
   * Returns a new object of class '<em>Multi Target</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Multi Target</em>'.
   * @generated
   */
  MultiTarget createMultiTarget();

  /**
   * Returns a new object of class '<em>All Target</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>All Target</em>'.
   * @generated
   */
  AllTarget createAllTarget();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  BehaviourLanguagePackage getBehaviourLanguagePackage();

} //BehaviourLanguageFactory
