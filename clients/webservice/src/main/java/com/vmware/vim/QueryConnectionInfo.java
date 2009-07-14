/**
 * QueryConnectionInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class QueryConnectionInfo implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim.ManagedObjectReference _this;

	private java.lang.String hostname;

	private int port;

	private java.lang.String username;

	private java.lang.String password;

	public QueryConnectionInfo() {
	}

	public QueryConnectionInfo(com.vmware.vim.ManagedObjectReference _this,
			java.lang.String hostname, int port, java.lang.String username,
			java.lang.String password) {
		this._this = _this;
		this.hostname = hostname;
		this.port = port;
		this.username = username;
		this.password = password;
	}

	/**
	 * Gets the _this value for this QueryConnectionInfo.
	 * 
	 * @return _this
	 */
	public com.vmware.vim.ManagedObjectReference get_this() {
		return _this;
	}

	/**
	 * Sets the _this value for this QueryConnectionInfo.
	 * 
	 * @param _this
	 */
	public void set_this(com.vmware.vim.ManagedObjectReference _this) {
		this._this = _this;
	}

	/**
	 * Gets the hostname value for this QueryConnectionInfo.
	 * 
	 * @return hostname
	 */
	public java.lang.String getHostname() {
		return hostname;
	}

	/**
	 * Sets the hostname value for this QueryConnectionInfo.
	 * 
	 * @param hostname
	 */
	public void setHostname(java.lang.String hostname) {
		this.hostname = hostname;
	}

	/**
	 * Gets the port value for this QueryConnectionInfo.
	 * 
	 * @return port
	 */
	public int getPort() {
		return port;
	}

	/**
	 * Sets the port value for this QueryConnectionInfo.
	 * 
	 * @param port
	 */
	public void setPort(int port) {
		this.port = port;
	}

	/**
	 * Gets the username value for this QueryConnectionInfo.
	 * 
	 * @return username
	 */
	public java.lang.String getUsername() {
		return username;
	}

	/**
	 * Sets the username value for this QueryConnectionInfo.
	 * 
	 * @param username
	 */
	public void setUsername(java.lang.String username) {
		this.username = username;
	}

	/**
	 * Gets the password value for this QueryConnectionInfo.
	 * 
	 * @return password
	 */
	public java.lang.String getPassword() {
		return password;
	}

	/**
	 * Sets the password value for this QueryConnectionInfo.
	 * 
	 * @param password
	 */
	public void setPassword(java.lang.String password) {
		this.password = password;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof QueryConnectionInfo)) {
			return false;
		}
		QueryConnectionInfo other = (QueryConnectionInfo) obj;
		if (obj == null) {
			return false;
		}
		if (this == obj) {
			return true;
		}
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true
				&& ((this._this == null && other.get_this() == null) || (this._this != null && this._this
						.equals(other.get_this())))
				&& ((this.hostname == null && other.getHostname() == null) || (this.hostname != null && this.hostname
						.equals(other.getHostname())))
				&& this.port == other.getPort()
				&& ((this.username == null && other.getUsername() == null) || (this.username != null && this.username
						.equals(other.getUsername())))
				&& ((this.password == null && other.getPassword() == null) || (this.password != null && this.password
						.equals(other.getPassword())));
		__equalsCalc = null;
		return _equals;
	}

	private boolean __hashCodeCalc = false;

	@Override
	public synchronized int hashCode() {
		if (__hashCodeCalc) {
			return 0;
		}
		__hashCodeCalc = true;
		int _hashCode = 1;
		if (get_this() != null) {
			_hashCode += get_this().hashCode();
		}
		if (getHostname() != null) {
			_hashCode += getHostname().hashCode();
		}
		_hashCode += getPort();
		if (getUsername() != null) {
			_hashCode += getUsername().hashCode();
		}
		if (getPassword() != null) {
			_hashCode += getPassword().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			QueryConnectionInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				">QueryConnectionInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("_this");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim2", "_this"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("hostname");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"hostname"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("port");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "port"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("username");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"username"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("password");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"password"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
	}

	/**
	 * Return type metadata object
	 */
	public static org.apache.axis.description.TypeDesc getTypeDesc() {
		return typeDesc;
	}

	/**
	 * Get Custom Serializer
	 */
	public static org.apache.axis.encoding.Serializer getSerializer(
			java.lang.String mechType, java.lang.Class _javaType,
			javax.xml.namespace.QName _xmlType) {
		return new org.apache.axis.encoding.ser.BeanSerializer(_javaType,
				_xmlType, typeDesc);
	}

	/**
	 * Get Custom Deserializer
	 */
	public static org.apache.axis.encoding.Deserializer getDeserializer(
			java.lang.String mechType, java.lang.Class _javaType,
			javax.xml.namespace.QName _xmlType) {
		return new org.apache.axis.encoding.ser.BeanDeserializer(_javaType,
				_xmlType, typeDesc);
	}

}
