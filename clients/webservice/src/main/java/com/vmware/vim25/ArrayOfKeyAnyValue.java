/**
 * ArrayOfKeyAnyValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfKeyAnyValue implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.KeyAnyValue[] keyAnyValue;

	public ArrayOfKeyAnyValue() {
	}

	public ArrayOfKeyAnyValue(com.vmware.vim25.KeyAnyValue[] keyAnyValue) {
		this.keyAnyValue = keyAnyValue;
	}

	/**
	 * Gets the keyAnyValue value for this ArrayOfKeyAnyValue.
	 * 
	 * @return keyAnyValue
	 */
	public com.vmware.vim25.KeyAnyValue[] getKeyAnyValue() {
		return keyAnyValue;
	}

	/**
	 * Sets the keyAnyValue value for this ArrayOfKeyAnyValue.
	 * 
	 * @param keyAnyValue
	 */
	public void setKeyAnyValue(com.vmware.vim25.KeyAnyValue[] keyAnyValue) {
		this.keyAnyValue = keyAnyValue;
	}

	public com.vmware.vim25.KeyAnyValue getKeyAnyValue(int i) {
		return this.keyAnyValue[i];
	}

	public void setKeyAnyValue(int i, com.vmware.vim25.KeyAnyValue _value) {
		this.keyAnyValue[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfKeyAnyValue)) {
			return false;
		}
		ArrayOfKeyAnyValue other = (ArrayOfKeyAnyValue) obj;
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
		_equals = true && ((this.keyAnyValue == null && other.getKeyAnyValue() == null) || (this.keyAnyValue != null && java.util.Arrays
				.equals(this.keyAnyValue, other.getKeyAnyValue())));
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
		if (getKeyAnyValue() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getKeyAnyValue()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getKeyAnyValue(), i);
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
			ArrayOfKeyAnyValue.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ArrayOfKeyAnyValue"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("keyAnyValue");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"KeyAnyValue"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"KeyAnyValue"));
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
