/**
 */
package bbqvtomm.model.mymodel.impl;

import bbqvtomm.model.mymodel.MymodelFactory;
import bbqvtomm.model.mymodel.MymodelPackage;
import bbqvtomm.model.mymodel.TestClass;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MymodelPackageImpl extends EPackageImpl implements MymodelPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass testClassEClass = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see bbqvtomm.model.mymodel.MymodelPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private MymodelPackageImpl() {
        super(eNS_URI, MymodelFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     *
     * <p>This method is used to initialize {@link MymodelPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static MymodelPackage init() {
        if (isInited)
            return (MymodelPackage) EPackage.Registry.INSTANCE.getEPackage(MymodelPackage.eNS_URI);

        // Obtain or create and register package
        Object registeredMymodelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
        MymodelPackageImpl theMymodelPackage = registeredMymodelPackage instanceof MymodelPackageImpl
                ? (MymodelPackageImpl) registeredMymodelPackage
                : new MymodelPackageImpl();

        isInited = true;

        // Create package meta-data objects
        theMymodelPackage.createPackageContents();

        // Initialize created meta-data
        theMymodelPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theMymodelPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(MymodelPackage.eNS_URI, theMymodelPackage);
        return theMymodelPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getTestClass() {
        return testClassEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTestClass_Attr() {
        return (EAttribute) testClassEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public MymodelFactory getMymodelFactory() {
        return (MymodelFactory) getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
        if (isCreated)
            return;
        isCreated = true;

        // Create classes and their features
        testClassEClass = createEClass(TEST_CLASS);
        createEAttribute(testClassEClass, TEST_CLASS__ATTR);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents() {
        if (isInitialized)
            return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes

        // Initialize classes, features, and operations; add parameters
        initEClass(testClassEClass, TestClass.class, "TestClass", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
                IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getTestClass_Attr(), ecorePackage.getEString(), "attr", null, 0, 1, TestClass.class, //$NON-NLS-1$
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Create resource
        createResource(eNS_URI);
    }

} //MymodelPackageImpl
