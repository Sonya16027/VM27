/**
 * ArrayOfKeyValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfKeyValue implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.KeyValue[] keyValue;

	public ArrayOfKeyValue() {
	}

	public ArrayOfKeyValue(com.vmware.vim25.KeyValue[] keyValue) {
		this.keyValue = keyValue;
	}

	/**
	 * Gets the keyValue value for this ArrayOfKeyValue.
	 * 
	 * @return keyValue
	 */
	public com.vmware.vim25.KeyValue[] getKeyValue() {
		return keyValue;
	}

	/**
	 * Sets the keyValue value for this ArrayOfKeyValue.
	 * 
	 * @param keyValue
	 */
	public void setKeyValue(com.vmware.vim25.KeyValue[] keyValue) {
		this.keyValue = keyValue;
	}

	public com.vmware.vim25.KeyValue getKeyValue(int i) {
		return this.keyValue[i];
	}

	public void setKeyValue(int i, com.vmware.vim25.KeyValue _value) {
		this.keyValue[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfKeyValue)) {
			return false;
		}
		ArrayOfKeyValue other = (ArrayOfKeyValue) obj;
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
		_equals = true && ((this.keyValue == null && other.getKeyValue() == null) || (this.keyValue != null && java.util.Arrays
				.equals(this.keyValue, other.getKeyValue())));
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
		if (getKeyValue() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getKeyValue()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getKeyValue(), i);
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
			ArrayOfKeyValue.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ArrayOfKeyValue"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("keyValue");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"KeyValue"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"KeyValue"));
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
