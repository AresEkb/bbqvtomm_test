/**
 */
package bbqvtomm.model.mymodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bbqvtomm.model.mymodel.TestClass#getAttr <em>Attr</em>}</li>
 * </ul>
 *
 * @see bbqvtomm.model.mymodel.MymodelPackage#getTestClass()
 * @model
 * @generated
 */
public interface TestClass extends EObject {
    /**
     * Returns the value of the '<em><b>Attr</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Attr</em>' attribute.
     * @see #setAttr(String)
     * @see bbqvtomm.model.mymodel.MymodelPackage#getTestClass_Attr()
     * @model
     * @generated
     */
    String getAttr();

    /**
     * Sets the value of the '{@link bbqvtomm.model.mymodel.TestClass#getAttr <em>Attr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Attr</em>' attribute.
     * @see #getAttr()
     * @generated
     */
    void setAttr(String value);

} // TestClass
