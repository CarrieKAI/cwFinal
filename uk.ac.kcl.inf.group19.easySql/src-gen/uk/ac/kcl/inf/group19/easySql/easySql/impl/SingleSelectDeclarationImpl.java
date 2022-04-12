/**
 * generated by Xtext 2.25.0
 */
package uk.ac.kcl.inf.group19.easySql.easySql.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.kcl.inf.group19.easySql.easySql.EasySqlPackage;
import uk.ac.kcl.inf.group19.easySql.easySql.SimpleSelectQuery;
import uk.ac.kcl.inf.group19.easySql.easySql.SingleSelectDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Single Select Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.group19.easySql.easySql.impl.SingleSelectDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.group19.easySql.easySql.impl.SingleSelectDeclarationImpl#getSingleSelect <em>Single Select</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SingleSelectDeclarationImpl extends StatementImpl implements SingleSelectDeclaration
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getSingleSelect() <em>Single Select</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSingleSelect()
   * @generated
   * @ordered
   */
  protected SimpleSelectQuery singleSelect;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SingleSelectDeclarationImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return EasySqlPackage.Literals.SINGLE_SELECT_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EasySqlPackage.SINGLE_SELECT_DECLARATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SimpleSelectQuery getSingleSelect()
  {
    return singleSelect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSingleSelect(SimpleSelectQuery newSingleSelect, NotificationChain msgs)
  {
    SimpleSelectQuery oldSingleSelect = singleSelect;
    singleSelect = newSingleSelect;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EasySqlPackage.SINGLE_SELECT_DECLARATION__SINGLE_SELECT, oldSingleSelect, newSingleSelect);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSingleSelect(SimpleSelectQuery newSingleSelect)
  {
    if (newSingleSelect != singleSelect)
    {
      NotificationChain msgs = null;
      if (singleSelect != null)
        msgs = ((InternalEObject)singleSelect).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EasySqlPackage.SINGLE_SELECT_DECLARATION__SINGLE_SELECT, null, msgs);
      if (newSingleSelect != null)
        msgs = ((InternalEObject)newSingleSelect).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EasySqlPackage.SINGLE_SELECT_DECLARATION__SINGLE_SELECT, null, msgs);
      msgs = basicSetSingleSelect(newSingleSelect, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EasySqlPackage.SINGLE_SELECT_DECLARATION__SINGLE_SELECT, newSingleSelect, newSingleSelect));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case EasySqlPackage.SINGLE_SELECT_DECLARATION__SINGLE_SELECT:
        return basicSetSingleSelect(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case EasySqlPackage.SINGLE_SELECT_DECLARATION__NAME:
        return getName();
      case EasySqlPackage.SINGLE_SELECT_DECLARATION__SINGLE_SELECT:
        return getSingleSelect();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EasySqlPackage.SINGLE_SELECT_DECLARATION__NAME:
        setName((String)newValue);
        return;
      case EasySqlPackage.SINGLE_SELECT_DECLARATION__SINGLE_SELECT:
        setSingleSelect((SimpleSelectQuery)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case EasySqlPackage.SINGLE_SELECT_DECLARATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EasySqlPackage.SINGLE_SELECT_DECLARATION__SINGLE_SELECT:
        setSingleSelect((SimpleSelectQuery)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case EasySqlPackage.SINGLE_SELECT_DECLARATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EasySqlPackage.SINGLE_SELECT_DECLARATION__SINGLE_SELECT:
        return singleSelect != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //SingleSelectDeclarationImpl