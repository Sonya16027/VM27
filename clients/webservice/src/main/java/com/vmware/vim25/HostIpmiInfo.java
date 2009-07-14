/**
 * HostIpmiInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostIpmiInfo extends com.vmware.vim25.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String bmcIpAddress;

	private java.lang.String bmcMacAddress;

	private java.lang.String login;

	private java.lang.String password;

	public HostIpmiInfo() {
	}

	public HostIpmiInfo(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.String bmcIpAddress, java.lang.String bmcMacAddress,
			java.lang.String login, java.lang.String password) {
		super(dynamicType, dynamicProperty);
		this.bmcIpAddress = bmcIpAddress;
		this.bmcMacAddress = bmcMacAddress;
		this.login = login;
		this.password = password;
	}

	/**
	 * Gets the bmcIpAddress value for this HostIpmiInfo.
	 * 
	 * @return bmcIpAddress
	 */
	public java.lang.String getBmcIpAddress() {
		return bmcIpAddress;
	}

	/**
	 * Sets the bmcIpAddress value for this HostIpmiInfo.
	 * 
	 * @param bmcIpAddress
	 */
	public void setBmcIpAddress(java.lang.String bmcIpAddress) {
		this.bmcIpAddress = bmcIpAddress;
	}

	/**
	 * Gets the bmcMacAddress value for this HostIpmiInfo.
	 * 
	 * @return bmcMacAddress
	 */
	public java.lang.String getBmcMacAddress() {
		return bmcMacAddress;
	}

	/**
	 * Sets the bmcMacAddress value for this HostIpmiInfo.
	 * 
	 * @param bmcMacAddress
	 */
	public void setBmcMacAddress(java.lang.String bmcMacAddress) {
		this.bmcMacAddress = bmcMacAddress;
	}

	/**
	 * Gets the login value for this HostIpmiInfo.
	 * 
	 * @return login
	 */
	public java.lang.String getLogin() {
		return login;
	}

	/**
	 * Sets the login value for this HostIpmiInfo.
	 * 
	 * @param login
	 */
	public void setLogin(java.lang.String login) {
		this.login = login;
	}

	/**
	 * Gets the password value for this HostIpmiInfo.
	 * 
	 * @return password
	 */
	public java.lang.String getPassword() {
		return password;
	}

	/**
	 * Sets the password value for this HostIpmiInfo.
	 * 
	 * @param password
	 */
	public void setPassword(java.lang.String password) {
		this.password = password;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof HostIpmiInfo)) {
			return false;
		}
		HostIpmiInfo other = (HostIpmiInfo) obj;
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
				&& ((this.bmcIpAddress == null && other.getBmcIpAddress() == null) || (this.bmcIpAddress != null && this.bmcIpAddress
						.equals(other.getBmcIpAddress())))
				&& ((this.bmcMacAddress == null && other.getBmcMacAddress() == null) || (this.bmcMacAddress != null && this.bmcMacAddress
						.equals(other.getBmcMacAddress())))
				&& ((this.login == null && other.getLogin() == null) || (this.login != null && this.login
						.equals(other.getLogin())))
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
		int _hashCode = super.hashCode();
		if (getBmcIpAddress() != null) {
			_hashCode += getBmcIpAddress().hashCode();
		}
		if (getBmcMacAddress() != null) {
			_hashCode += getBmcMacAddress().hashCode();
		}
		if (getLogin() != null) {
			_hashCode += getLogin().hashCode();
		}
		if (getPassword() != null) {
			_hashCode += getPassword().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			HostIpmiInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostIpmiInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("bmcIpAddress");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"bmcIpAddress"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("bmcMacAddress");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"bmcMacAddress"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("login");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "login"));
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
