/**
 * ArrayOfCustomizationIpV6Generator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfCustomizationIpV6Generator implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.CustomizationIpV6Generator[] customizationIpV6Generator;

	public ArrayOfCustomizationIpV6Generator() {
	}

	public ArrayOfCustomizationIpV6Generator(
			com.vmware.vim25.CustomizationIpV6Generator[] customizationIpV6Generator) {
		this.customizationIpV6Generator = customizationIpV6Generator;
	}

	/**
	 * Gets the customizationIpV6Generator value for this
	 * ArrayOfCustomizationIpV6Generator.
	 * 
	 * @return customizationIpV6Generator
	 */
	public com.vmware.vim25.CustomizationIpV6Generator[] getCustomizationIpV6Generator() {
		return customizationIpV6Generator;
	}

	/**
	 * Sets the customizationIpV6Generator value for this
	 * ArrayOfCustomizationIpV6Generator.
	 * 
	 * @param customizationIpV6Generator
	 */
	public void setCustomizationIpV6Generator(
			com.vmware.vim25.CustomizationIpV6Generator[] customizationIpV6Generator) {
		this.customizationIpV6Generator = customizationIpV6Generator;
	}

	public com.vmware.vim25.CustomizationIpV6Generator getCustomizationIpV6Generator(
			int i) {
		return this.customizationIpV6Generator[i];
	}

	public void setCustomizationIpV6Generator(int i,
			com.vmware.vim25.CustomizationIpV6Generator _value) {
		this.customizationIpV6Generator[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfCustomizationIpV6Generator)) {
			return false;
		}
		ArrayOfCustomizationIpV6Generator other = (ArrayOfCustomizationIpV6Generator) obj;
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
		_equals = true && ((this.customizationIpV6Generator == null && other
				.getCustomizationIpV6Generator() == null) || (this.customizationIpV6Generator != null && java.util.Arrays
				.equals(this.customizationIpV6Generator, other
						.getCustomizationIpV6Generator())));
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
		if (getCustomizationIpV6Generator() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getCustomizationIpV6Generator()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getCustomizationIpV6Generator(), i);
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
			ArrayOfCustomizationIpV6Generator.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ArrayOfCustomizationIpV6Generator"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("customizationIpV6Generator");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"CustomizationIpV6Generator"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"CustomizationIpV6Generator"));
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
