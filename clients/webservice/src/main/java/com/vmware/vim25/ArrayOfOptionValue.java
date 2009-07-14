/**
 * ArrayOfOptionValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfOptionValue implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.OptionValue[] optionValue;

	public ArrayOfOptionValue() {
	}

	public ArrayOfOptionValue(com.vmware.vim25.OptionValue[] optionValue) {
		this.optionValue = optionValue;
	}

	/**
	 * Gets the optionValue value for this ArrayOfOptionValue.
	 * 
	 * @return optionValue
	 */
	public com.vmware.vim25.OptionValue[] getOptionValue() {
		return optionValue;
	}

	/**
	 * Sets the optionValue value for this ArrayOfOptionValue.
	 * 
	 * @param optionValue
	 */
	public void setOptionValue(com.vmware.vim25.OptionValue[] optionValue) {
		this.optionValue = optionValue;
	}

	public com.vmware.vim25.OptionValue getOptionValue(int i) {
		return this.optionValue[i];
	}

	public void setOptionValue(int i, com.vmware.vim25.OptionValue _value) {
		this.optionValue[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfOptionValue)) {
			return false;
		}
		ArrayOfOptionValue other = (ArrayOfOptionValue) obj;
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
		_equals = true && ((this.optionValue == null && other.getOptionValue() == null) || (this.optionValue != null && java.util.Arrays
				.equals(this.optionValue, other.getOptionValue())));
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
		if (getOptionValue() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getOptionValue()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getOptionValue(), i);
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
			ArrayOfOptionValue.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ArrayOfOptionValue"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("optionValue");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"OptionValue"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"OptionValue"));
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
