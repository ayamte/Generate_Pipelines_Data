/**
 */
package org.example.pipelinedefinition.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.example.pipelinedefinition.CleanTransform;
import org.example.pipelinedefinition.PipelinedefinitionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clean Transform</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.example.pipelinedefinition.impl.CleanTransformImpl#isRemoveNulls <em>Remove Nulls</em>}</li>
 *   <li>{@link org.example.pipelinedefinition.impl.CleanTransformImpl#isTrim <em>Trim</em>}</li>
 *   <li>{@link org.example.pipelinedefinition.impl.CleanTransformImpl#isDeduplicate <em>Deduplicate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CleanTransformImpl extends TransformationImpl implements CleanTransform {
	/**
	 * The default value of the '{@link #isRemoveNulls() <em>Remove Nulls</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRemoveNulls()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REMOVE_NULLS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRemoveNulls() <em>Remove Nulls</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRemoveNulls()
	 * @generated
	 * @ordered
	 */
	protected boolean removeNulls = REMOVE_NULLS_EDEFAULT;

	/**
	 * The default value of the '{@link #isTrim() <em>Trim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTrim()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRIM_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTrim() <em>Trim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTrim()
	 * @generated
	 * @ordered
	 */
	protected boolean trim = TRIM_EDEFAULT;

	/**
	 * The default value of the '{@link #isDeduplicate() <em>Deduplicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDeduplicate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEDUPLICATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDeduplicate() <em>Deduplicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDeduplicate()
	 * @generated
	 * @ordered
	 */
	protected boolean deduplicate = DEDUPLICATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CleanTransformImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PipelinedefinitionPackage.Literals.CLEAN_TRANSFORM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRemoveNulls() {
		return removeNulls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemoveNulls(boolean newRemoveNulls) {
		boolean oldRemoveNulls = removeNulls;
		removeNulls = newRemoveNulls;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipelinedefinitionPackage.CLEAN_TRANSFORM__REMOVE_NULLS, oldRemoveNulls, removeNulls));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isTrim() {
		return trim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrim(boolean newTrim) {
		boolean oldTrim = trim;
		trim = newTrim;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipelinedefinitionPackage.CLEAN_TRANSFORM__TRIM, oldTrim, trim));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDeduplicate() {
		return deduplicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeduplicate(boolean newDeduplicate) {
		boolean oldDeduplicate = deduplicate;
		deduplicate = newDeduplicate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipelinedefinitionPackage.CLEAN_TRANSFORM__DEDUPLICATE, oldDeduplicate, deduplicate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PipelinedefinitionPackage.CLEAN_TRANSFORM__REMOVE_NULLS:
				return isRemoveNulls();
			case PipelinedefinitionPackage.CLEAN_TRANSFORM__TRIM:
				return isTrim();
			case PipelinedefinitionPackage.CLEAN_TRANSFORM__DEDUPLICATE:
				return isDeduplicate();
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
			case PipelinedefinitionPackage.CLEAN_TRANSFORM__REMOVE_NULLS:
				setRemoveNulls((Boolean)newValue);
				return;
			case PipelinedefinitionPackage.CLEAN_TRANSFORM__TRIM:
				setTrim((Boolean)newValue);
				return;
			case PipelinedefinitionPackage.CLEAN_TRANSFORM__DEDUPLICATE:
				setDeduplicate((Boolean)newValue);
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
			case PipelinedefinitionPackage.CLEAN_TRANSFORM__REMOVE_NULLS:
				setRemoveNulls(REMOVE_NULLS_EDEFAULT);
				return;
			case PipelinedefinitionPackage.CLEAN_TRANSFORM__TRIM:
				setTrim(TRIM_EDEFAULT);
				return;
			case PipelinedefinitionPackage.CLEAN_TRANSFORM__DEDUPLICATE:
				setDeduplicate(DEDUPLICATE_EDEFAULT);
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
			case PipelinedefinitionPackage.CLEAN_TRANSFORM__REMOVE_NULLS:
				return removeNulls != REMOVE_NULLS_EDEFAULT;
			case PipelinedefinitionPackage.CLEAN_TRANSFORM__TRIM:
				return trim != TRIM_EDEFAULT;
			case PipelinedefinitionPackage.CLEAN_TRANSFORM__DEDUPLICATE:
				return deduplicate != DEDUPLICATE_EDEFAULT;
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
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (removeNulls: ");
		result.append(removeNulls);
		result.append(", trim: ");
		result.append(trim);
		result.append(", deduplicate: ");
		result.append(deduplicate);
		result.append(')');
		return result.toString();
	}

} //CleanTransformImpl
