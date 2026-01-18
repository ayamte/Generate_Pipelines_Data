/**
 */
package org.example.airflowpipeline.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.example.airflowpipeline.AirflowpipelinePackage;
import org.example.airflowpipeline.Task;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.example.airflowpipeline.impl.TaskImpl#getTaskId <em>Task Id</em>}</li>
 *   <li>{@link org.example.airflowpipeline.impl.TaskImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.example.airflowpipeline.impl.TaskImpl#getRetry <em>Retry</em>}</li>
 *   <li>{@link org.example.airflowpipeline.impl.TaskImpl#getTimeout <em>Timeout</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TaskImpl extends MinimalEObjectImpl.Container implements Task {
	/**
	 * The default value of the '{@link #getTaskId() <em>Task Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskId()
	 * @generated
	 * @ordered
	 */
	protected static final String TASK_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTaskId() <em>Task Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskId()
	 * @generated
	 * @ordered
	 */
	protected String taskId = TASK_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRetry() <em>Retry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetry()
	 * @generated
	 * @ordered
	 */
	protected static final int RETRY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRetry() <em>Retry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetry()
	 * @generated
	 * @ordered
	 */
	protected int retry = RETRY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final int TIMEOUT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeout()
	 * @generated
	 * @ordered
	 */
	protected int timeout = TIMEOUT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AirflowpipelinePackage.Literals.TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTaskId() {
		return taskId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaskId(String newTaskId) {
		String oldTaskId = taskId;
		taskId = newTaskId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AirflowpipelinePackage.TASK__TASK_ID, oldTaskId, taskId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AirflowpipelinePackage.TASK__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getRetry() {
		return retry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRetry(int newRetry) {
		int oldRetry = retry;
		retry = newRetry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AirflowpipelinePackage.TASK__RETRY, oldRetry, retry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTimeout() {
		return timeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeout(int newTimeout) {
		int oldTimeout = timeout;
		timeout = newTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AirflowpipelinePackage.TASK__TIMEOUT, oldTimeout, timeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AirflowpipelinePackage.TASK__TASK_ID:
				return getTaskId();
			case AirflowpipelinePackage.TASK__DESCRIPTION:
				return getDescription();
			case AirflowpipelinePackage.TASK__RETRY:
				return getRetry();
			case AirflowpipelinePackage.TASK__TIMEOUT:
				return getTimeout();
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
			case AirflowpipelinePackage.TASK__TASK_ID:
				setTaskId((String)newValue);
				return;
			case AirflowpipelinePackage.TASK__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case AirflowpipelinePackage.TASK__RETRY:
				setRetry((Integer)newValue);
				return;
			case AirflowpipelinePackage.TASK__TIMEOUT:
				setTimeout((Integer)newValue);
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
			case AirflowpipelinePackage.TASK__TASK_ID:
				setTaskId(TASK_ID_EDEFAULT);
				return;
			case AirflowpipelinePackage.TASK__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case AirflowpipelinePackage.TASK__RETRY:
				setRetry(RETRY_EDEFAULT);
				return;
			case AirflowpipelinePackage.TASK__TIMEOUT:
				setTimeout(TIMEOUT_EDEFAULT);
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
			case AirflowpipelinePackage.TASK__TASK_ID:
				return TASK_ID_EDEFAULT == null ? taskId != null : !TASK_ID_EDEFAULT.equals(taskId);
			case AirflowpipelinePackage.TASK__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case AirflowpipelinePackage.TASK__RETRY:
				return retry != RETRY_EDEFAULT;
			case AirflowpipelinePackage.TASK__TIMEOUT:
				return timeout != TIMEOUT_EDEFAULT;
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
		result.append(" (taskId: ");
		result.append(taskId);
		result.append(", description: ");
		result.append(description);
		result.append(", retry: ");
		result.append(retry);
		result.append(", timeout: ");
		result.append(timeout);
		result.append(')');
		return result.toString();
	}

} //TaskImpl
