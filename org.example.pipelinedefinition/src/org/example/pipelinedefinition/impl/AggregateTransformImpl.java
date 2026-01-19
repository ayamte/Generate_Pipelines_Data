/**
 */
package org.example.pipelinedefinition.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.example.pipelinedefinition.AggregateTransform;
import org.example.pipelinedefinition.PipelinedefinitionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aggregate Transform</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.example.pipelinedefinition.impl.AggregateTransformImpl#getGroupBy <em>Group By</em>}</li>
 *   <li>{@link org.example.pipelinedefinition.impl.AggregateTransformImpl#getAggregation <em>Aggregation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AggregateTransformImpl extends TransformationImpl implements AggregateTransform {
	/**
	 * The default value of the '{@link #getGroupBy() <em>Group By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupBy()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_BY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroupBy() <em>Group By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupBy()
	 * @generated
	 * @ordered
	 */
	protected String groupBy = GROUP_BY_EDEFAULT;

	/**
	 * The default value of the '{@link #getAggregation() <em>Aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregation()
	 * @generated
	 * @ordered
	 */
	protected static final String AGGREGATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAggregation() <em>Aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregation()
	 * @generated
	 * @ordered
	 */
	protected String aggregation = AGGREGATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AggregateTransformImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PipelinedefinitionPackage.Literals.AGGREGATE_TRANSFORM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGroupBy() {
		return groupBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroupBy(String newGroupBy) {
		String oldGroupBy = groupBy;
		groupBy = newGroupBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipelinedefinitionPackage.AGGREGATE_TRANSFORM__GROUP_BY, oldGroupBy, groupBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAggregation() {
		return aggregation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAggregation(String newAggregation) {
		String oldAggregation = aggregation;
		aggregation = newAggregation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipelinedefinitionPackage.AGGREGATE_TRANSFORM__AGGREGATION, oldAggregation, aggregation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PipelinedefinitionPackage.AGGREGATE_TRANSFORM__GROUP_BY:
				return getGroupBy();
			case PipelinedefinitionPackage.AGGREGATE_TRANSFORM__AGGREGATION:
				return getAggregation();
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
			case PipelinedefinitionPackage.AGGREGATE_TRANSFORM__GROUP_BY:
				setGroupBy((String)newValue);
				return;
			case PipelinedefinitionPackage.AGGREGATE_TRANSFORM__AGGREGATION:
				setAggregation((String)newValue);
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
			case PipelinedefinitionPackage.AGGREGATE_TRANSFORM__GROUP_BY:
				setGroupBy(GROUP_BY_EDEFAULT);
				return;
			case PipelinedefinitionPackage.AGGREGATE_TRANSFORM__AGGREGATION:
				setAggregation(AGGREGATION_EDEFAULT);
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
			case PipelinedefinitionPackage.AGGREGATE_TRANSFORM__GROUP_BY:
				return GROUP_BY_EDEFAULT == null ? groupBy != null : !GROUP_BY_EDEFAULT.equals(groupBy);
			case PipelinedefinitionPackage.AGGREGATE_TRANSFORM__AGGREGATION:
				return AGGREGATION_EDEFAULT == null ? aggregation != null : !AGGREGATION_EDEFAULT.equals(aggregation);
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
		result.append(" (groupBy: ");
		result.append(groupBy);
		result.append(", aggregation: ");
		result.append(aggregation);
		result.append(')');
		return result.toString();
	}

} //AggregateTransformImpl
