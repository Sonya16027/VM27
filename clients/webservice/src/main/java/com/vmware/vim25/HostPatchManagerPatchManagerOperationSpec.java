/**
 * HostPatchManagerPatchManagerOperationSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostPatchManagerPatchManagerOperationSpec extends
		com.vmware.vim25.DynamicData implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String proxy;

	private java.lang.Integer port;

	private java.lang.String userName;

	private java.lang.String password;

	private java.lang.String cmdOption;

	public HostPatchManagerPatchManagerOperationSpec() {
	}

	public HostPatchManagerPatchManagerOperationSpec(
			java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.String proxy, java.lang.Integer port,
			java.lang.String userName, java.lang.String password,
			java.lang.String cmdOption) {
		super(dynamicType, dynamicProperty);
		this.proxy = proxy;
		this.port = port;
		this.userName = userName;
		this.password = password;
		this.cmdOption = cmdOption;
	}

	/**
	 * Gets the proxy value for this HostPatchManagerPatchManagerOperationSpec.
	 * 
	 * @return proxy
	 */
	public java.lang.String getProxy() {
		return proxy;
	}

	/**
	 * Sets the proxy value for this HostPatchManagerPatchManagerOperationSpec.
	 * 
	 * @param proxy
	 */
	public void setProxy(java.lang.String proxy) {
		this.proxy = proxy;
	}

	/**
	 * Gets the port value for this HostPatchManagerPatchManagerOperationSpec.
	 * 
	 * @return port
	 */
	public java.lang.Integer getPort() {
		return port;
	}

	/**
	 * Sets the port value for this HostPatchManagerPatchManagerOperationSpec.
	 * 
	 * @param port
	 */
	public void setPort(java.lang.Integer port) {
		this.port = port;
	}

	/**
	 * Gets the userName value for this
	 * HostPatchManagerPatchManagerOperationSpec.
	 * 
	 * @return userName
	 */
	public java.lang.String getUserName() {
		return userName;
	}

	/**
	 * Sets the userName value for this
	 * HostPatchManagerPatchManagerOperationSpec.
	 * 
	 * @param userName
	 */
	public void setUserName(java.lang.String userName) {
		this.userName = userName;
	}

	/**
	 * Gets the password value for this
	 * HostPatchManagerPatchManagerOperationSpec.
	 * 
	 * @return password
	 */
	public java.lang.String getPassword() {
		return password;
	}

	/**
	 * Sets the password value for this
	 * HostPatchManagerPatchManagerOperationSpec.
	 * 
	 * @param password
	 */
	public void setPassword(java.lang.String password) {
		this.password = password;
	}

	/**
	 * Gets the cmdOption value for this
	 * HostPatchManagerPatchManagerOperationSpec.
	 * 
	 * @return cmdOption
	 */
	public java.lang.String getCmdOption() {
		return cmdOption;
	}

	/**
	 * Sets the cmdOption value for this
	 * HostPatchManagerPatchManagerOperationSpec.
	 * 
	 * @param cmdOption
	 */
	public void setCmdOption(java.lang.String cmdOption) {
		this.cmdOption = cmdOption;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof HostPatchManagerPatchManagerOperationSpec)) {
			return false;
		}
		HostPatchManagerPatchManagerOperationSpec other = (HostPatchManagerPatchManagerOperationSpec) obj;
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
		_equals = super.equals(obj)
				&& ((this.proxy == null && other.getProxy() == null) || (this.proxy != null && this.proxy
						.equals(other.getProxy())))
				&& ((this.port == null && other.getPort() == null) || (this.port != null && this.port
						.equals(other.getPort())))
				&& ((this.userName == null && other.getUserName() == null) || (this.userName != null && this.userName
						.equals(other.getUserName())))
				&& ((this.password == null && other.getPassword() == null) || (this.password != null && this.password
						.equals(other.getPassword())))
				&& ((this.cmdOption == null && other.getCmdOption() == null) || (this.cmdOption != null && this.cmdOption
						.equals(other.getCmdOption())));
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
		int _hashCode = super.hashCode();
		if (getProxy() != null) {
			_hashCode += getProxy().hashCode();
		}
		if (getPort() != null) {
			_hashCode += getPort().hashCode();
		}
		if (getUserName() != null) {
			_hashCode += getUserName().hashCode();
		}
		if (getPassword() != null) {
			_hashCode += getPassword().hashCode();
		}
		if (getCmdOption() != null) {
			_hashCode += getCmdOption().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			HostPatchManagerPatchManagerOperationSpec.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostPatchManagerPatchManagerOperationSpec"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("proxy");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "proxy"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("port");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "port"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("userName");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"userName"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("password");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"password"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("cmdOption");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"cmdOption"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
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
