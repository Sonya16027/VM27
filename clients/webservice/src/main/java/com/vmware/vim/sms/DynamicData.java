/**
 * DynamicData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim.sms;

public class DynamicData implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String dynamicType;

	private com.vmware.vim.sms.DynamicProperty[] dynamicProperty;

	public DynamicData() {
	}

	public DynamicData(java.lang.String dynamicType,
			com.vmware.vim.sms.DynamicProperty[] dynamicProperty) {
		this.dynamicType = dynamicType;
		this.dynamicProperty = dynamicProperty;
	}

	/**
	 * Gets the dynamicType value for this DynamicData.
	 * 
	 * @return dynamicType
	 */
	public java.lang.String getDynamicType() {
		return dynamicType;
	}

	/**
	 * Sets the dynamicType value for this DynamicData.
	 * 
	 * @param dynamicType
	 */
	public void setDynamicType(java.lang.String dynamicType) {
		this.dynamicType = dynamicType;
	}

	/**
	 * Gets the dynamicProperty value for this DynamicData.
	 * 
	 * @return dynamicProperty
	 */
	public com.vmware.vim.sms.DynamicProperty[] getDynamicProperty() {
		return dynamicProperty;
	}

	/**
	 * Sets the dynamicProperty value for this DynamicData.
	 * 
	 * @param dynamicProperty
	 */
	public void setDynamicProperty(
			com.vmware.vim.sms.DynamicProperty[] dynamicProperty) {
		this.dynamicProperty = dynamicProperty;
	}

	public com.vmware.vim.sms.DynamicProperty getDynamicProperty(int i) {
		return this.dynamicProperty[i];
	}

	public void setDynamicProperty(int i,
			com.vmware.vim.sms.DynamicProperty _value) {
		this.dynamicProperty[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof DynamicData)) {
			return false;
		}
		DynamicData other = (DynamicData) obj;
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
				&& ((this.dynamicType == null && other.getDynamicType() == null) || (this.dynamicType != null && this.dynamicType
						.equals(other.getDynamicType())))
				&& ((this.dynamicProperty == null && other.getDynamicProperty() == null) || (this.dynamicProperty != null && java.util.Arrays
						.equals(this.dynamicProperty, other
								.getDynamicProperty())));
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
		if (getDynamicType() != null) {
			_hashCode += getDynamicType().hashCode();
		}
		if (getDynamicProperty() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getDynamicProperty()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getDynamicProperty(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			DynamicData.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sm1",
				"DynamicData"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("dynamicType");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:sm1",
				"dynamicType"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("dynamicProperty");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:sm1",
				"dynamicProperty"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:sm1",
				"DynamicProperty"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
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
