/**
 */
package org.example.airflowpipeline.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.example.airflowpipeline.AirflowpipelinePackage;
import org.example.airflowpipeline.Connection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.example.airflowpipeline.impl.ConnectionImpl#getConnId <em>Conn Id</em>}</li>
 *   <li>{@link org.example.airflowpipeline.impl.ConnectionImpl#getConnType <em>Conn Type</em>}</li>
 *   <li>{@link org.example.airflowpipeline.impl.ConnectionImpl#getHost <em>Host</em>}</li>
 *   <li>{@link org.example.airflowpipeline.impl.ConnectionImpl#getPort <em>Port</em>}</li>
 *   <li>{@link org.example.airflowpipeline.impl.ConnectionImpl#getLogin <em>Login</em>}</li>
 *   <li>{@link org.example.airflowpipeline.impl.ConnectionImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link org.example.airflowpipeline.impl.ConnectionImpl#getSchema <em>Schema</em>}</li>
 *   <li>{@link org.example.airflowpipeline.impl.ConnectionImpl#getExtra <em>Extra</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectionImpl extends MinimalEObjectImpl.Container implements Connection {
	/**
	 * The default value of the '{@link #getConnId() <em>Conn Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnId()
	 * @generated
	 * @ordered
	 */
	protected static final String CONN_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConnId() <em>Conn Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnId()
	 * @generated
	 * @ordered
	 */
	protected String connId = CONN_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getConnType() <em>Conn Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnType()
	 * @generated
	 * @ordered
	 */
	protected static final String CONN_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConnType() <em>Conn Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnType()
	 * @generated
	 * @ordered
	 */
	protected String connType = CONN_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHost() <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected static final String HOST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHost() <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected String host = HOST_EDEFAULT;

	/**
	 * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected static final int PORT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected int port = PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogin() <em>Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogin()
	 * @generated
	 * @ordered
	 */
	protected static final String LOGIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogin() <em>Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogin()
	 * @generated
	 * @ordered
	 */
	protected String login = LOGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getSchema() <em>Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchema()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEMA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSchema() <em>Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchema()
	 * @generated
	 * @ordered
	 */
	protected String schema = SCHEMA_EDEFAULT;

	/**
	 * The default value of the '{@link #getExtra() <em>Extra</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtra()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTRA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtra() <em>Extra</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtra()
	 * @generated
	 * @ordered
	 */
	protected String extra = EXTRA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AirflowpipelinePackage.Literals.CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConnId() {
		return connId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConnId(String newConnId) {
		String oldConnId = connId;
		connId = newConnId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AirflowpipelinePackage.CONNECTION__CONN_ID, oldConnId, connId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConnType() {
		return connType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConnType(String newConnType) {
		String oldConnType = connType;
		connType = newConnType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AirflowpipelinePackage.CONNECTION__CONN_TYPE, oldConnType, connType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHost() {
		return host;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHost(String newHost) {
		String oldHost = host;
		host = newHost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AirflowpipelinePackage.CONNECTION__HOST, oldHost, host));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPort(int newPort) {
		int oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AirflowpipelinePackage.CONNECTION__PORT, oldPort, port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLogin() {
		return login;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogin(String newLogin) {
		String oldLogin = login;
		login = newLogin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AirflowpipelinePackage.CONNECTION__LOGIN, oldLogin, login));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AirflowpipelinePackage.CONNECTION__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSchema() {
		return schema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSchema(String newSchema) {
		String oldSchema = schema;
		schema = newSchema;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AirflowpipelinePackage.CONNECTION__SCHEMA, oldSchema, schema));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExtra() {
		return extra;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExtra(String newExtra) {
		String oldExtra = extra;
		extra = newExtra;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AirflowpipelinePackage.CONNECTION__EXTRA, oldExtra, extra));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AirflowpipelinePackage.CONNECTION__CONN_ID:
				return getConnId();
			case AirflowpipelinePackage.CONNECTION__CONN_TYPE:
				return getConnType();
			case AirflowpipelinePackage.CONNECTION__HOST:
				return getHost();
			case AirflowpipelinePackage.CONNECTION__PORT:
				return getPort();
			case AirflowpipelinePackage.CONNECTION__LOGIN:
				return getLogin();
			case AirflowpipelinePackage.CONNECTION__PASSWORD:
				return getPassword();
			case AirflowpipelinePackage.CONNECTION__SCHEMA:
				return getSchema();
			case AirflowpipelinePackage.CONNECTION__EXTRA:
				return getExtra();
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
			case AirflowpipelinePackage.CONNECTION__CONN_ID:
				setConnId((String)newValue);
				return;
			case AirflowpipelinePackage.CONNECTION__CONN_TYPE:
				setConnType((String)newValue);
				return;
			case AirflowpipelinePackage.CONNECTION__HOST:
				setHost((String)newValue);
				return;
			case AirflowpipelinePackage.CONNECTION__PORT:
				setPort((Integer)newValue);
				return;
			case AirflowpipelinePackage.CONNECTION__LOGIN:
				setLogin((String)newValue);
				return;
			case AirflowpipelinePackage.CONNECTION__PASSWORD:
				setPassword((String)newValue);
				return;
			case AirflowpipelinePackage.CONNECTION__SCHEMA:
				setSchema((String)newValue);
				return;
			case AirflowpipelinePackage.CONNECTION__EXTRA:
				setExtra((String)newValue);
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
			case AirflowpipelinePackage.CONNECTION__CONN_ID:
				setConnId(CONN_ID_EDEFAULT);
				return;
			case AirflowpipelinePackage.CONNECTION__CONN_TYPE:
				setConnType(CONN_TYPE_EDEFAULT);
				return;
			case AirflowpipelinePackage.CONNECTION__HOST:
				setHost(HOST_EDEFAULT);
				return;
			case AirflowpipelinePackage.CONNECTION__PORT:
				setPort(PORT_EDEFAULT);
				return;
			case AirflowpipelinePackage.CONNECTION__LOGIN:
				setLogin(LOGIN_EDEFAULT);
				return;
			case AirflowpipelinePackage.CONNECTION__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case AirflowpipelinePackage.CONNECTION__SCHEMA:
				setSchema(SCHEMA_EDEFAULT);
				return;
			case AirflowpipelinePackage.CONNECTION__EXTRA:
				setExtra(EXTRA_EDEFAULT);
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
			case AirflowpipelinePackage.CONNECTION__CONN_ID:
				return CONN_ID_EDEFAULT == null ? connId != null : !CONN_ID_EDEFAULT.equals(connId);
			case AirflowpipelinePackage.CONNECTION__CONN_TYPE:
				return CONN_TYPE_EDEFAULT == null ? connType != null : !CONN_TYPE_EDEFAULT.equals(connType);
			case AirflowpipelinePackage.CONNECTION__HOST:
				return HOST_EDEFAULT == null ? host != null : !HOST_EDEFAULT.equals(host);
			case AirflowpipelinePackage.CONNECTION__PORT:
				return port != PORT_EDEFAULT;
			case AirflowpipelinePackage.CONNECTION__LOGIN:
				return LOGIN_EDEFAULT == null ? login != null : !LOGIN_EDEFAULT.equals(login);
			case AirflowpipelinePackage.CONNECTION__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case AirflowpipelinePackage.CONNECTION__SCHEMA:
				return SCHEMA_EDEFAULT == null ? schema != null : !SCHEMA_EDEFAULT.equals(schema);
			case AirflowpipelinePackage.CONNECTION__EXTRA:
				return EXTRA_EDEFAULT == null ? extra != null : !EXTRA_EDEFAULT.equals(extra);
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
		result.append(" (connId: ");
		result.append(connId);
		result.append(", connType: ");
		result.append(connType);
		result.append(", host: ");
		result.append(host);
		result.append(", port: ");
		result.append(port);
		result.append(", login: ");
		result.append(login);
		result.append(", password: ");
		result.append(password);
		result.append(", schema: ");
		result.append(schema);
		result.append(", extra: ");
		result.append(extra);
		result.append(')');
		return result.toString();
	}

} //ConnectionImpl
