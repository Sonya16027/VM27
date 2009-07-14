/**
 * DynamicArray.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim.sms;

public class DynamicArray implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String dynamicType;

	private java.lang.Object[] val;

	public DynamicArray() {
	}

	public DynamicArray(java.lang.String dynamicType, java.lang.Object[] val) {
		this.dynamicType = dynamicType;
		this.val = val;
	}

	/**
	 * Gets the dynamicType value for this DynamicArray.
	 * 
	 * @return dynamicType
	 */
	public java.lang.String getDynamicType() {
		return dynamicType;
	}

	/**
	 * Sets the dynamicType value for this DynamicArray.
	 * 
	 * @param dynamicType
	 */
	public void setDynamicType(java.lang.String dynamicType) {
		this.dynamicType = dynamicType;
	}

	/**
	 * Gets the val value for this DynamicArray.
	 * 
	 * @return val
	 */
	public java.lang.Object[] getVal() {
		return val;
	}

	/**
	 * Sets the val value for this DynamicArray.
	 * 
	 * @param val
	 */
	public void setVal(java.lang.Object[] val) {
		this.val = val;
	}

	public java.lang.Object getVal(int i) {
		return this.val[i];
	}

	public void setVal(int i, java.lang.Object _value) {
		this.val[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof DynamicArray)) {
			return false;
		}
		DynamicArray other = (DynamicArray) obj;
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
				&& ((this.val == null && other.getVal() == null) || (this.val != null && java.util.Arrays
						.equals(this.val, other.getVal())));
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
		if (getVal() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getVal()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getVal(), i);
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
			DynamicArray.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sm1",
				"DynamicArray"));
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
		elemField.setFieldName("val");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:sm1", "val"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "anyType"));
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
