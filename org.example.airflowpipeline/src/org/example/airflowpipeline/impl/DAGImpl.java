/**
 */
package org.example.airflowpipeline.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.example.airflowpipeline.AirflowpipelinePackage;
import org.example.airflowpipeline.Connection;
import org.example.airflowpipeline.DAG;
import org.example.airflowpipeline.PythonOperator;
import org.example.airflowpipeline.TaskDependency;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DAG</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.example.airflowpipeline.impl.DAGImpl#getDagId <em>Dag Id</em>}</li>
 *   <li>{@link org.example.airflowpipeline.impl.DAGImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.example.airflowpipeline.impl.DAGImpl#getScheduleInterval <em>Schedule Interval</em>}</li>
 *   <li>{@link org.example.airflowpipeline.impl.DAGImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link org.example.airflowpipeline.impl.DAGImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link org.example.airflowpipeline.impl.DAGImpl#getOperators <em>Operators</em>}</li>
 *   <li>{@link org.example.airflowpipeline.impl.DAGImpl#getConnections <em>Connections</em>}</li>
 *   <li>{@link org.example.airflowpipeline.impl.DAGImpl#getDependencies <em>Dependencies</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DAGImpl extends MinimalEObjectImpl.Container implements DAG {
	/**
	 * The default value of the '{@link #getDagId() <em>Dag Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDagId()
	 * @generated
	 * @ordered
	 */
	protected static final String DAG_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDagId() <em>Dag Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDagId()
	 * @generated
	 * @ordered
	 */
	protected String dagId = DAG_ID_EDEFAULT;

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
	 * The default value of the '{@link #getScheduleInterval() <em>Schedule Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduleInterval()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEDULE_INTERVAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScheduleInterval() <em>Schedule Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduleInterval()
	 * @generated
	 * @ordered
	 */
	protected String scheduleInterval = SCHEDULE_INTERVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final String START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected String startDate = START_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTags() <em>Tags</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTags()
	 * @generated
	 * @ordered
	 */
	protected EList<String> tags;

	/**
	 * The cached value of the '{@link #getOperators() <em>Operators</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperators()
	 * @generated
	 * @ordered
	 */
	protected EList<PythonOperator> operators;

	/**
	 * The cached value of the '{@link #getConnections() <em>Connections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection> connections;

	/**
	 * The cached value of the '{@link #getDependencies() <em>Dependencies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskDependency> dependencies;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DAGImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AirflowpipelinePackage.Literals.DAG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDagId() {
		return dagId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDagId(String newDagId) {
		String oldDagId = dagId;
		dagId = newDagId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AirflowpipelinePackage.DAG__DAG_ID, oldDagId, dagId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AirflowpipelinePackage.DAG__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getScheduleInterval() {
		return scheduleInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScheduleInterval(String newScheduleInterval) {
		String oldScheduleInterval = scheduleInterval;
		scheduleInterval = newScheduleInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AirflowpipelinePackage.DAG__SCHEDULE_INTERVAL, oldScheduleInterval, scheduleInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStartDate() {
		return startDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartDate(String newStartDate) {
		String oldStartDate = startDate;
		startDate = newStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AirflowpipelinePackage.DAG__START_DATE, oldStartDate, startDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getTags() {
		if (tags == null) {
			tags = new EDataTypeUniqueEList<String>(String.class, this, AirflowpipelinePackage.DAG__TAGS);
		}
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PythonOperator> getOperators() {
		if (operators == null) {
			operators = new EObjectContainmentEList<PythonOperator>(PythonOperator.class, this, AirflowpipelinePackage.DAG__OPERATORS);
		}
		return operators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Connection> getConnections() {
		if (connections == null) {
			connections = new EObjectContainmentEList<Connection>(Connection.class, this, AirflowpipelinePackage.DAG__CONNECTIONS);
		}
		return connections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TaskDependency> getDependencies() {
		if (dependencies == null) {
			dependencies = new EObjectContainmentEList<TaskDependency>(TaskDependency.class, this, AirflowpipelinePackage.DAG__DEPENDENCIES);
		}
		return dependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AirflowpipelinePackage.DAG__OPERATORS:
				return ((InternalEList<?>)getOperators()).basicRemove(otherEnd, msgs);
			case AirflowpipelinePackage.DAG__CONNECTIONS:
				return ((InternalEList<?>)getConnections()).basicRemove(otherEnd, msgs);
			case AirflowpipelinePackage.DAG__DEPENDENCIES:
				return ((InternalEList<?>)getDependencies()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AirflowpipelinePackage.DAG__DAG_ID:
				return getDagId();
			case AirflowpipelinePackage.DAG__DESCRIPTION:
				return getDescription();
			case AirflowpipelinePackage.DAG__SCHEDULE_INTERVAL:
				return getScheduleInterval();
			case AirflowpipelinePackage.DAG__START_DATE:
				return getStartDate();
			case AirflowpipelinePackage.DAG__TAGS:
				return getTags();
			case AirflowpipelinePackage.DAG__OPERATORS:
				return getOperators();
			case AirflowpipelinePackage.DAG__CONNECTIONS:
				return getConnections();
			case AirflowpipelinePackage.DAG__DEPENDENCIES:
				return getDependencies();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AirflowpipelinePackage.DAG__DAG_ID:
				setDagId((String)newValue);
				return;
			case AirflowpipelinePackage.DAG__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case AirflowpipelinePackage.DAG__SCHEDULE_INTERVAL:
				setScheduleInterval((String)newValue);
				return;
			case AirflowpipelinePackage.DAG__START_DATE:
				setStartDate((String)newValue);
				return;
			case AirflowpipelinePackage.DAG__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends String>)newValue);
				return;
			case AirflowpipelinePackage.DAG__OPERATORS:
				getOperators().clear();
				getOperators().addAll((Collection<? extends PythonOperator>)newValue);
				return;
			case AirflowpipelinePackage.DAG__CONNECTIONS:
				getConnections().clear();
				getConnections().addAll((Collection<? extends Connection>)newValue);
				return;
			case AirflowpipelinePackage.DAG__DEPENDENCIES:
				getDependencies().clear();
				getDependencies().addAll((Collection<? extends TaskDependency>)newValue);
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
			case AirflowpipelinePackage.DAG__DAG_ID:
				setDagId(DAG_ID_EDEFAULT);
				return;
			case AirflowpipelinePackage.DAG__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case AirflowpipelinePackage.DAG__SCHEDULE_INTERVAL:
				setScheduleInterval(SCHEDULE_INTERVAL_EDEFAULT);
				return;
			case AirflowpipelinePackage.DAG__START_DATE:
				setStartDate(START_DATE_EDEFAULT);
				return;
			case AirflowpipelinePackage.DAG__TAGS:
				getTags().clear();
				return;
			case AirflowpipelinePackage.DAG__OPERATORS:
				getOperators().clear();
				return;
			case AirflowpipelinePackage.DAG__CONNECTIONS:
				getConnections().clear();
				return;
			case AirflowpipelinePackage.DAG__DEPENDENCIES:
				getDependencies().clear();
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
			case AirflowpipelinePackage.DAG__DAG_ID:
				return DAG_ID_EDEFAULT == null ? dagId != null : !DAG_ID_EDEFAULT.equals(dagId);
			case AirflowpipelinePackage.DAG__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case AirflowpipelinePackage.DAG__SCHEDULE_INTERVAL:
				return SCHEDULE_INTERVAL_EDEFAULT == null ? scheduleInterval != null : !SCHEDULE_INTERVAL_EDEFAULT.equals(scheduleInterval);
			case AirflowpipelinePackage.DAG__START_DATE:
				return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
			case AirflowpipelinePackage.DAG__TAGS:
				return tags != null && !tags.isEmpty();
			case AirflowpipelinePackage.DAG__OPERATORS:
				return operators != null && !operators.isEmpty();
			case AirflowpipelinePackage.DAG__CONNECTIONS:
				return connections != null && !connections.isEmpty();
			case AirflowpipelinePackage.DAG__DEPENDENCIES:
				return dependencies != null && !dependencies.isEmpty();
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
		result.append(" (dagId: ");
		result.append(dagId);
		result.append(", description: ");
		result.append(description);
		result.append(", scheduleInterval: ");
		result.append(scheduleInterval);
		result.append(", startDate: ");
		result.append(startDate);
		result.append(", tags: ");
		result.append(tags);
		result.append(')');
		return result.toString();
	}

} //DAGImpl
