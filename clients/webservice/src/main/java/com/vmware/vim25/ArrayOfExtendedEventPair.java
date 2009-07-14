/**
 * ArrayOfExtendedEventPair.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfExtendedEventPair implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.ExtendedEventPair[] extendedEventPair;

	public ArrayOfExtendedEventPair() {
	}

	public ArrayOfExtendedEventPair(
			com.vmware.vim25.ExtendedEventPair[] extendedEventPair) {
		this.extendedEventPair = extendedEventPair;
	}

	/**
	 * Gets the extendedEventPair value for this ArrayOfExtendedEventPair.
	 * 
	 * @return extendedEventPair
	 */
	public com.vmware.vim25.ExtendedEventPair[] getExtendedEventPair() {
		return extendedEventPair;
	}

	/**
	 * Sets the extendedEventPair value for this ArrayOfExtendedEventPair.
	 * 
	 * @param extendedEventPair
	 */
	public void setExtendedEventPair(
			com.vmware.vim25.ExtendedEventPair[] extendedEventPair) {
		this.extendedEventPair = extendedEventPair;
	}

	public com.vmware.vim25.ExtendedEventPair getExtendedEventPair(int i) {
		return this.extendedEventPair[i];
	}

	public void setExtendedEventPair(int i,
			com.vmware.vim25.ExtendedEventPair _value) {
		this.extendedEventPair[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfExtendedEventPair)) {
			return false;
		}
		ArrayOfExtendedEventPair other = (ArrayOfExtendedEventPair) obj;
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
		_equals = true && ((this.extendedEventPair == null && other
				.getExtendedEventPair() == null) || (this.extendedEventPair != null && java.util.Arrays
				.equals(this.extendedEventPair, other.getExtendedEventPair())));
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
		if (getExtendedEventPair() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getExtendedEventPair()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getExtendedEventPair(), i);
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
			ArrayOfExtendedEventPair.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ArrayOfExtendedEventPair"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("extendedEventPair");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"ExtendedEventPair"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ExtendedEventPair"));
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
