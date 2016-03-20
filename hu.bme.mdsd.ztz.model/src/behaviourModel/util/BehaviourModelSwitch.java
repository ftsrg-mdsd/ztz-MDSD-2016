/**
 */
package behaviourModel.util;

import behaviourModel.*;

import drone.Action;

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
 * @see behaviourModel.BehaviourModelPackage
 * @generated
 */
public class BehaviourModelSwitch<T> extends Switch<T> {
        /**
         * The cached model package
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected static BehaviourModelPackage modelPackage;

        /**
         * Creates an instance of the switch.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public BehaviourModelSwitch() {
                if (modelPackage == null) {
                        modelPackage = BehaviourModelPackage.eINSTANCE;
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
        protected boolean isSwitchFor(EPackage ePackage) {
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
        protected T doSwitch(int classifierID, EObject theEObject) {
                switch (classifierID) {
                        case BehaviourModelPackage.UNICAST: {
                                Unicast unicast = (Unicast)theEObject;
                                T result = caseUnicast(unicast);
                                if (result == null) result = caseCommunicationAction(unicast);
                                if (result == null) result = caseAction(unicast);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case BehaviourModelPackage.MULTICAST: {
                                Multicast multicast = (Multicast)theEObject;
                                T result = caseMulticast(multicast);
                                if (result == null) result = caseCommunicationAction(multicast);
                                if (result == null) result = caseAction(multicast);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case BehaviourModelPackage.BROADCAST: {
                                Broadcast broadcast = (Broadcast)theEObject;
                                T result = caseBroadcast(broadcast);
                                if (result == null) result = caseCommunicationAction(broadcast);
                                if (result == null) result = caseAction(broadcast);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case BehaviourModelPackage.COMMUNICATION_ACTION: {
                                CommunicationAction communicationAction = (CommunicationAction)theEObject;
                                T result = caseCommunicationAction(communicationAction);
                                if (result == null) result = caseAction(communicationAction);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case BehaviourModelPackage.MESSAGE: {
                                Message message = (Message)theEObject;
                                T result = caseMessage(message);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        default: return defaultCase(theEObject);
                }
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Unicast</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Unicast</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseUnicast(Unicast object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Multicast</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Multicast</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseMulticast(Multicast object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Broadcast</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Broadcast</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseBroadcast(Broadcast object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Communication Action</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Communication Action</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseCommunicationAction(CommunicationAction object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Message</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Message</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseMessage(Message object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Action</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseAction(Action object) {
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
        public T defaultCase(EObject object) {
                return null;
        }

} //BehaviourModelSwitch