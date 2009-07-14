/**
 * CustomizationLicenseFilePrintData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class CustomizationLicenseFilePrintData extends
		com.vmware.vim25.DynamicData implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.CustomizationLicenseDataMode autoMode;

	private java.lang.Integer autoUsers;

	public CustomizationLicenseFilePrintData() {
	}

	public CustomizationLicenseFilePrintData(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			com.vmware.vim25.CustomizationLicenseDataMode autoMode,
			java.lang.Integer autoUsers) {
		super(dynamicType, dynamicProperty);
		this.autoMode = autoMode;
		this.autoUsers = autoUsers;
	}

	/**
	 * Gets the autoMode value for this CustomizationLicenseFilePrintData.
	 * 
	 * @return autoMode
	 */
	public com.vmware.vim25.CustomizationLicenseDataMode getAutoMode() {
		return autoMode;
	}

	/**
	 * Sets the autoMode value for this CustomizationLicenseFilePrintData.
	 * 
	 * @param autoMode
	 */
	public void setAutoMode(
			com.vmware.vim25.CustomizationLicenseDataMode autoMode) {
		this.autoMode = autoMode;
	}

	/**
	 * Gets the autoUsers value for this CustomizationLicenseFilePrintData.
	 * 
	 * @return autoUsers
	 */
	public java.lang.Integer getAutoUsers() {
		return autoUsers;
	}

	/**
	 * Sets the autoUsers value for this CustomizationLicenseFilePrintData.
	 * 
	 * @param autoUsers
	 */
	public void setAutoUsers(java.lang.Integer autoUsers) {
		this.autoUsers = autoUsers;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof CustomizationLicenseFilePrintData)) {
			return false;
		}
		CustomizationLicenseFilePrintData other = (CustomizationLicenseFilePrintData) obj;
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
				&& ((this.autoMode == null && other.getAutoMode() == null) || (this.autoMode != null && this.autoMode
						.equals(other.getAutoMode())))
				&& ((this.autoUsers == null && other.getAutoUsers() == null) || (this.autoUsers != null && this.autoUsers
						.equals(other.getAutoUsers())));
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
		if (getAutoMode() != null) {
			_hashCode += getAutoMode().hashCode();
		}
		if (getAutoUsers() != null) {
			_hashCode += getAutoUsers().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			CustomizationLicenseFilePrintData.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"CustomizationLicenseFilePrintData"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("autoMode");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"autoMode"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"CustomizationLicenseDataMode"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("autoUsers");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"autoUsers"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
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
