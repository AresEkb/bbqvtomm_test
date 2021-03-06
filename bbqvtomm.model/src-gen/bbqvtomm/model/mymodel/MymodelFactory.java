/**
 */
package bbqvtomm.model.mymodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see bbqvtomm.model.mymodel.MymodelPackage
 * @generated
 */
public interface MymodelFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    MymodelFactory eINSTANCE = bbqvtomm.model.mymodel.impl.MymodelFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Test Class</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Test Class</em>'.
     * @generated
     */
    TestClass createTestClass();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    MymodelPackage getMymodelPackage();

} //MymodelFactory
