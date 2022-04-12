/**
 * generated by Xtext 2.25.0
 */
package uk.ac.kcl.inf.group19.easySql.easySql;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.group19.easySql.easySql.TableDeclaration#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.group19.easySql.easySql.EasySqlPackage#getTableDeclaration()
 * @model
 * @generated
 */
public interface TableDeclaration extends Statement
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see uk.ac.kcl.inf.group19.easySql.easySql.EasySqlPackage#getTableDeclaration_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.group19.easySql.easySql.TableDeclaration#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // TableDeclaration