/**
 * CustomizationGuiUnattended.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class CustomizationGuiUnattended extends com.vmware.vim.DynamicData
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim.CustomizationPassword password;

	private int timeZone;

	private boolean autoLogon;

	private int autoLogonCount;

	public CustomizationGuiUnattended() {
	}

	public CustomizationGuiUnattended(java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty,
			com.vmware.vim.CustomizationPassword password, int timeZone,
			boolean autoLogon, int autoLogonCount) {
		super(dynamicType, dynamicProperty);
		this.password = password;
		this.timeZone = timeZone;
		this.autoLogon = autoLogon;
		this.autoLogonCount = autoLogonCount;
	}

	/**
	 * Gets the password value for this CustomizationGuiUnattended.
	 * 
	 * @return password
	 */
	public com.vmware.vim.CustomizationPassword getPassword() {
		return password;
	}

	/**
	 * Sets the password value for this CustomizationGuiUnattended.
	 * 
	 * @param password
	 */
	public void setPassword(com.vmware.vim.CustomizationPassword password) {
		this.password = password;
	}

	/**
	 * Gets the timeZone value for this CustomizationGuiUnattended.
	 * 
	 * @return timeZone
	 */
	public int getTimeZone() {
		return timeZone;
	}

	/**
	 * Sets the timeZone value for this CustomizationGuiUnattended.
	 * 
	 * @param timeZone
	 */
	public void setTimeZone(int timeZone) {
		this.timeZone = timeZone;
	}

	/**
	 * Gets the autoLogon value for this CustomizationGuiUnattended.
	 * 
	 * @return autoLogon
	 */
	public boolean isAutoLogon() {
		return autoLogon;
	}

	/**
	 * Sets the autoLogon value for this CustomizationGuiUnattended.
	 * 
	 * @param autoLogon
	 */
	public void setAutoLogon(boolean autoLogon) {
		this.autoLogon = autoLogon;
	}

	/**
	 * Gets the autoLogonCount value for this CustomizationGuiUnattended.
	 * 
	 * @return autoLogonCount
	 */
	public int getAutoLogonCount() {
		return autoLogonCount;
	}

	/**
	 * Sets the autoLogonCount value for this CustomizationGuiUnattended.
	 * 
	 * @param autoLogonCount
	 */
	public void setAutoLogonCount(int autoLogonCount) {
		this.autoLogonCount = autoLogonCount;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof CustomizationGuiUnattended)) {
			return false;
		}
		CustomizationGuiUnattended other = (CustomizationGuiUnattended) obj;
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
				&& ((this.password == null && other.getPassword() == null) || (this.password != null && this.password
						.equals(other.getPassword())))
				&& this.timeZone == other.getTimeZone()
				&& this.autoLogon == other.isAutoLogon()
				&& this.autoLogonCount == other.getAutoLogonCount();
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
		if (getPassword() != null) {
			_hashCode += getPassword().hashCode();
		}
		_hashCode += getTimeZone();
		_hashCode += (isAutoLogon() ? Boolean.TRUE : Boolean.FALSE).hashCode();
		_hashCode += getAutoLogonCount();
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			CustomizationGuiUnattended.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"CustomizationGuiUnattended"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("password");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"password"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"CustomizationPassword"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("timeZone");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"timeZone"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("autoLogon");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"autoLogon"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("autoLogonCount");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"autoLogonCount"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
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
