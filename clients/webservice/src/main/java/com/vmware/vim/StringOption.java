/**
 * StringOption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class StringOption extends com.vmware.vim.OptionType implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String defaultValue;

	private java.lang.String validCharacters;

	public StringOption() {
	}

	public StringOption(java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty,
			java.lang.Boolean valueIsReadonly, java.lang.String defaultValue,
			java.lang.String validCharacters) {
		super(dynamicType, dynamicProperty, valueIsReadonly);
		this.defaultValue = defaultValue;
		this.validCharacters = validCharacters;
	}

	/**
	 * Gets the defaultValue value for this StringOption.
	 * 
	 * @return defaultValue
	 */
	public java.lang.String getDefaultValue() {
		return defaultValue;
	}

	/**
	 * Sets the defaultValue value for this StringOption.
	 * 
	 * @param defaultValue
	 */
	public void setDefaultValue(java.lang.String defaultValue) {
		this.defaultValue = defaultValue;
	}

	/**
	 * Gets the validCharacters value for this StringOption.
	 * 
	 * @return validCharacters
	 */
	public java.lang.String getValidCharacters() {
		return validCharacters;
	}

	/**
	 * Sets the validCharacters value for this StringOption.
	 * 
	 * @param validCharacters
	 */
	public void setValidCharacters(java.lang.String validCharacters) {
		this.validCharacters = validCharacters;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof StringOption)) {
			return false;
		}
		StringOption other = (StringOption) obj;
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
				&& ((this.defaultValue == null && other.getDefaultValue() == null) || (this.defaultValue != null && this.defaultValue
						.equals(other.getDefaultValue())))
				&& ((this.validCharacters == null && other.getValidCharacters() == null) || (this.validCharacters != null && this.validCharacters
						.equals(other.getValidCharacters())));
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
		if (getDefaultValue() != null) {
			_hashCode += getDefaultValue().hashCode();
		}
		if (getValidCharacters() != null) {
			_hashCode += getValidCharacters().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			StringOption.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"StringOption"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("defaultValue");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"defaultValue"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("validCharacters");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"validCharacters"));
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
