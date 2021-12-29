/**
 */
package bbqvtomm.model.mymodel.impl;

import bbqvtomm.model.mymodel.MymodelPackage;
import bbqvtomm.model.mymodel.TestClass;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bbqvtomm.model.mymodel.impl.TestClassImpl#getAttr <em>Attr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestClassImpl extends MinimalEObjectImpl.Container implements TestClass {
    /**
     * The default value of the '{@link #getAttr() <em>Attr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAttr()
     * @generated
     * @ordered
     */
    protected static final String ATTR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAttr() <em>Attr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAttr()
     * @generated
     * @ordered
     */
    protected String attr = ATTR_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TestClassImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MymodelPackage.Literals.TEST_CLASS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getAttr() {
        return attr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAttr(String newAttr) {
        String oldAttr = attr;
        attr = newAttr;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MymodelPackage.TEST_CLASS__ATTR, oldAttr, attr));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case MymodelPackage.TEST_CLASS__ATTR:
            return getAttr();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case MymodelPackage.TEST_CLASS__ATTR:
            setAttr((String) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
        case MymodelPackage.TEST_CLASS__ATTR:
            setAttr(ATTR_EDEFAULT);
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
        case MymodelPackage.TEST_CLASS__ATTR:
            return ATTR_EDEFAULT == null ? attr != null : !ATTR_EDEFAULT.equals(attr);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy())
            return super.toString();

        StringBuilder result = new StringBuilder(super.toString());
        result.append(" (attr: "); //$NON-NLS-1$
        result.append(attr);
        result.append(')');
        return result.toString();
    }

} //TestClassImpl
