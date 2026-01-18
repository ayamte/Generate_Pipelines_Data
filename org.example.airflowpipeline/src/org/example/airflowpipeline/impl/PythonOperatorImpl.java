/**
 */
package org.example.airflowpipeline.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.example.airflowpipeline.AirflowpipelinePackage;
import org.example.airflowpipeline.Connection;
import org.example.airflowpipeline.PythonOperator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Python Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.example.airflowpipeline.impl.PythonOperatorImpl#getPythonCallable <em>Python Callable</em>}</li>
 *   <li>{@link org.example.airflowpipeline.impl.PythonOperatorImpl#getOpcode <em>Opcode</em>}</li>
 *   <li>{@link org.example.airflowpipeline.impl.PythonOperatorImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.example.airflowpipeline.impl.PythonOperatorImpl#getConnection <em>Connection</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PythonOperatorImpl extends TaskImpl implements PythonOperator {
	/**
	 * The default value of the '{@link #getPythonCallable() <em>Python Callable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPythonCallable()
	 * @generated
	 * @ordered
	 */
	protected static final String PYTHON_CALLABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPythonCallable() <em>Python Callable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPythonCallable()
	 * @generated
	 * @ordered
	 */
	protected String pythonCallable = PYTHON_CALLABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOpcode() <em>Opcode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpcode()
	 * @generated
	 * @ordered
	 */
	protected static final String OPCODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOpcode() <em>Opcode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpcode()
	 * @generated
	 * @ordered
	 */
	protected String opcode = OPCODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getParameters() <em>Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected static final String PARAMETERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected String parameters = PARAMETERS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConnection() <em>Connection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnection()
	 * @generated
	 * @ordered
	 */
	protected Connection connection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PythonOperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AirflowpipelinePackage.Literals.PYTHON_OPERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPythonCallable() {
		return pythonCallable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPythonCallable(String newPythonCallable) {
		String oldPythonCallable = pythonCallable;
		pythonCallable = newPythonCallable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AirflowpipelinePackage.PYTHON_OPERATOR__PYTHON_CALLABLE, oldPythonCallable, pythonCallable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOpcode() {
		return opcode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOpcode(String newOpcode) {
		String oldOpcode = opcode;
		opcode = newOpcode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AirflowpipelinePackage.PYTHON_OPERATOR__OPCODE, oldOpcode, opcode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getParameters() {
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParameters(String newParameters) {
		String oldParameters = parameters;
		parameters = newParameters;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AirflowpipelinePackage.PYTHON_OPERATOR__PARAMETERS, oldParameters, parameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Connection getConnection() {
		if (connection != null && connection.eIsProxy()) {
			InternalEObject oldConnection = (InternalEObject)connection;
			connection = (Connection)eResolveProxy(oldConnection);
			if (connection != oldConnection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AirflowpipelinePackage.PYTHON_OPERATOR__CONNECTION, oldConnection, connection));
			}
		}
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection basicGetConnection() {
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConnection(Connection newConnection) {
		Connection oldConnection = connection;
		connection = newConnection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AirflowpipelinePackage.PYTHON_OPERATOR__CONNECTION, oldConnection, connection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AirflowpipelinePackage.PYTHON_OPERATOR__PYTHON_CALLABLE:
				return getPythonCallable();
			case AirflowpipelinePackage.PYTHON_OPERATOR__OPCODE:
				return getOpcode();
			case AirflowpipelinePackage.PYTHON_OPERATOR__PARAMETERS:
				return getParameters();
			case AirflowpipelinePackage.PYTHON_OPERATOR__CONNECTION:
				if (resolve) return getConnection();
				return basicGetConnection();
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
			case AirflowpipelinePackage.PYTHON_OPERATOR__PYTHON_CALLABLE:
				setPythonCallable((String)newValue);
				return;
			case AirflowpipelinePackage.PYTHON_OPERATOR__OPCODE:
				setOpcode((String)newValue);
				return;
			case AirflowpipelinePackage.PYTHON_OPERATOR__PARAMETERS:
				setParameters((String)newValue);
				return;
			case AirflowpipelinePackage.PYTHON_OPERATOR__CONNECTION:
				setConnection((Connection)newValue);
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
			case AirflowpipelinePackage.PYTHON_OPERATOR__PYTHON_CALLABLE:
				setPythonCallable(PYTHON_CALLABLE_EDEFAULT);
				return;
			case AirflowpipelinePackage.PYTHON_OPERATOR__OPCODE:
				setOpcode(OPCODE_EDEFAULT);
				return;
			case AirflowpipelinePackage.PYTHON_OPERATOR__PARAMETERS:
				setParameters(PARAMETERS_EDEFAULT);
				return;
			case AirflowpipelinePackage.PYTHON_OPERATOR__CONNECTION:
				setConnection((Connection)null);
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
			case AirflowpipelinePackage.PYTHON_OPERATOR__PYTHON_CALLABLE:
				return PYTHON_CALLABLE_EDEFAULT == null ? pythonCallable != null : !PYTHON_CALLABLE_EDEFAULT.equals(pythonCallable);
			case AirflowpipelinePackage.PYTHON_OPERATOR__OPCODE:
				return OPCODE_EDEFAULT == null ? opcode != null : !OPCODE_EDEFAULT.equals(opcode);
			case AirflowpipelinePackage.PYTHON_OPERATOR__PARAMETERS:
				return PARAMETERS_EDEFAULT == null ? parameters != null : !PARAMETERS_EDEFAULT.equals(parameters);
			case AirflowpipelinePackage.PYTHON_OPERATOR__CONNECTION:
				return connection != null;
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
		result.append(" (pythonCallable: ");
		result.append(pythonCallable);
		result.append(", opcode: ");
		result.append(opcode);
		result.append(", parameters: ");
		result.append(parameters);
		result.append(')');
		return result.toString();
	}

} //PythonOperatorImpl
