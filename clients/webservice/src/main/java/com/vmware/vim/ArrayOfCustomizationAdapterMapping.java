/**
 * ArrayOfCustomizationAdapterMapping.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class ArrayOfCustomizationAdapterMapping implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim.CustomizationAdapterMapping[] customizationAdapterMapping;

	public ArrayOfCustomizationAdapterMapping() {
	}

	public ArrayOfCustomizationAdapterMapping(
			com.vmware.vim.CustomizationAdapterMapping[] customizationAdapterMapping) {
		this.customizationAdapterMapping = customizationAdapterMapping;
	}

	/**
	 * Gets the customizationAdapterMapping value for this
	 * ArrayOfCustomizationAdapterMapping.
	 * 
	 * @return customizationAdapterMapping
	 */
	public com.vmware.vim.CustomizationAdapterMapping[] getCustomizationAdapterMapping() {
		return customizationAdapterMapping;
	}

	/**
	 * Sets the customizationAdapterMapping value for this
	 * ArrayOfCustomizationAdapterMapping.
	 * 
	 * @param customizationAdapterMapping
	 */
	public void setCustomizationAdapterMapping(
			com.vmware.vim.CustomizationAdapterMapping[] customizationAdapterMapping) {
		this.customizationAdapterMapping = customizationAdapterMapping;
	}

	public com.vmware.vim.CustomizationAdapterMapping getCustomizationAdapterMapping(
			int i) {
		return this.customizationAdapterMapping[i];
	}

	public void setCustomizationAdapterMapping(int i,
			com.vmware.vim.CustomizationAdapterMapping _value) {
		this.customizationAdapterMapping[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfCustomizationAdapterMapping)) {
			return false;
		}
		ArrayOfCustomizationAdapterMapping other = (ArrayOfCustomizationAdapterMapping) obj;
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
		_equals = true && ((this.customizationAdapterMapping == null && other
				.getCustomizationAdapterMapping() == null) || (this.customizationAdapterMapping != null && java.util.Arrays
				.equals(this.customizationAdapterMapping, other
						.getCustomizationAdapterMapping())));
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
		if (getCustomizationAdapterMapping() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getCustomizationAdapterMapping()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getCustomizationAdapterMapping(), i);
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
			ArrayOfCustomizationAdapterMapping.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ArrayOfCustomizationAdapterMapping"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("customizationAdapterMapping");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"CustomizationAdapterMapping"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"CustomizationAdapterMapping"));
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
