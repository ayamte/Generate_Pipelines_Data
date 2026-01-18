/**
 */
package org.example.airflowpipeline.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.example.airflowpipeline.AirflowpipelinePackage;
import org.example.airflowpipeline.TaskDependency;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.example.airflowpipeline.impl.TaskDependencyImpl#getUpstreamTaskId <em>Upstream Task Id</em>}</li>
 *   <li>{@link org.example.airflowpipeline.impl.TaskDependencyImpl#getDownstreamTaskId <em>Downstream Task Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskDependencyImpl extends MinimalEObjectImpl.Container implements TaskDependency {
	/**
	 * The default value of the '{@link #getUpstreamTaskId() <em>Upstream Task Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpstreamTaskId()
	 * @generated
	 * @ordered
	 */
	protected static final String UPSTREAM_TASK_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUpstreamTaskId() <em>Upstream Task Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpstreamTaskId()
	 * @generated
	 * @ordered
	 */
	protected String upstreamTaskId = UPSTREAM_TASK_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDownstreamTaskId() <em>Downstream Task Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDownstreamTaskId()
	 * @generated
	 * @ordered
	 */
	protected static final String DOWNSTREAM_TASK_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDownstreamTaskId() <em>Downstream Task Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDownstreamTaskId()
	 * @generated
	 * @ordered
	 */
	protected String downstreamTaskId = DOWNSTREAM_TASK_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskDependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AirflowpipelinePackage.Literals.TASK_DEPENDENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUpstreamTaskId() {
		return upstreamTaskId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpstreamTaskId(String newUpstreamTaskId) {
		String oldUpstreamTaskId = upstreamTaskId;
		upstreamTaskId = newUpstreamTaskId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AirflowpipelinePackage.TASK_DEPENDENCY__UPSTREAM_TASK_ID, oldUpstreamTaskId, upstreamTaskId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDownstreamTaskId() {
		return downstreamTaskId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDownstreamTaskId(String newDownstreamTaskId) {
		String oldDownstreamTaskId = downstreamTaskId;
		downstreamTaskId = newDownstreamTaskId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AirflowpipelinePackage.TASK_DEPENDENCY__DOWNSTREAM_TASK_ID, oldDownstreamTaskId, downstreamTaskId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AirflowpipelinePackage.TASK_DEPENDENCY__UPSTREAM_TASK_ID:
				return getUpstreamTaskId();
			case AirflowpipelinePackage.TASK_DEPENDENCY__DOWNSTREAM_TASK_ID:
				return getDownstreamTaskId();
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
			case AirflowpipelinePackage.TASK_DEPENDENCY__UPSTREAM_TASK_ID:
				setUpstreamTaskId((String)newValue);
				return;
			case AirflowpipelinePackage.TASK_DEPENDENCY__DOWNSTREAM_TASK_ID:
				setDownstreamTaskId((String)newValue);
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
			case AirflowpipelinePackage.TASK_DEPENDENCY__UPSTREAM_TASK_ID:
				setUpstreamTaskId(UPSTREAM_TASK_ID_EDEFAULT);
				return;
			case AirflowpipelinePackage.TASK_DEPENDENCY__DOWNSTREAM_TASK_ID:
				setDownstreamTaskId(DOWNSTREAM_TASK_ID_EDEFAULT);
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
			case AirflowpipelinePackage.TASK_DEPENDENCY__UPSTREAM_TASK_ID:
				return UPSTREAM_TASK_ID_EDEFAULT == null ? upstreamTaskId != null : !UPSTREAM_TASK_ID_EDEFAULT.equals(upstreamTaskId);
			case AirflowpipelinePackage.TASK_DEPENDENCY__DOWNSTREAM_TASK_ID:
				return DOWNSTREAM_TASK_ID_EDEFAULT == null ? downstreamTaskId != null : !DOWNSTREAM_TASK_ID_EDEFAULT.equals(downstreamTaskId);
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
		result.append(" (upstreamTaskId: ");
		result.append(upstreamTaskId);
		result.append(", downstreamTaskId: ");
		result.append(downstreamTaskId);
		result.append(')');
		return result.toString();
	}

} //TaskDependencyImpl
