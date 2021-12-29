/**
 */
package bbqvtomm.model.mymodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see bbqvtomm.model.mymodel.MymodelFactory
 * @model kind="package"
 * @generated
 */
public interface MymodelPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "mymodel"; //$NON-NLS-1$

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.example.org/mymodel"; //$NON-NLS-1$

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "mymodel"; //$NON-NLS-1$

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    MymodelPackage eINSTANCE = bbqvtomm.model.mymodel.impl.MymodelPackageImpl.init();

    /**
     * The meta object id for the '{@link bbqvtomm.model.mymodel.impl.TestClassImpl <em>Test Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see bbqvtomm.model.mymodel.impl.TestClassImpl
     * @see bbqvtomm.model.mymodel.impl.MymodelPackageImpl#getTestClass()
     * @generated
     */
    int TEST_CLASS = 0;

    /**
     * The feature id for the '<em><b>Attr</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEST_CLASS__ATTR = 0;

    /**
     * The number of structural features of the '<em>Test Class</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEST_CLASS_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Test Class</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEST_CLASS_OPERATION_COUNT = 0;

    /**
     * Returns the meta object for class '{@link bbqvtomm.model.mymodel.TestClass <em>Test Class</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Test Class</em>'.
     * @see bbqvtomm.model.mymodel.TestClass
     * @generated
     */
    EClass getTestClass();

    /**
     * Returns the meta object for the attribute '{@link bbqvtomm.model.mymodel.TestClass#getAttr <em>Attr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Attr</em>'.
     * @see bbqvtomm.model.mymodel.TestClass#getAttr()
     * @see #getTestClass()
     * @generated
     */
    EAttribute getTestClass_Attr();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    MymodelFactory getMymodelFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each operation of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link bbqvtomm.model.mymodel.impl.TestClassImpl <em>Test Class</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see bbqvtomm.model.mymodel.impl.TestClassImpl
         * @see bbqvtomm.model.mymodel.impl.MymodelPackageImpl#getTestClass()
         * @generated
         */
        EClass TEST_CLASS = eINSTANCE.getTestClass();

        /**
         * The meta object literal for the '<em><b>Attr</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TEST_CLASS__ATTR = eINSTANCE.getTestClass_Attr();

    }

} //MymodelPackage
