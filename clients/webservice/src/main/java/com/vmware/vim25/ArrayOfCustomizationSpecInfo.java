/**
 * ArrayOfCustomizationSpecInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfCustomizationSpecInfo implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.CustomizationSpecInfo[] customizationSpecInfo;

	public ArrayOfCustomizationSpecInfo() {
	}

	public ArrayOfCustomizationSpecInfo(
			com.vmware.vim25.CustomizationSpecInfo[] customizationSpecInfo) {
		this.customizationSpecInfo = customizationSpecInfo;
	}

	/**
	 * Gets the customizationSpecInfo value for this
	 * ArrayOfCustomizationSpecInfo.
	 * 
	 * @return customizationSpecInfo
	 */
	public com.vmware.vim25.CustomizationSpecInfo[] getCustomizationSpecInfo() {
		return customizationSpecInfo;
	}

	/**
	 * Sets the customizationSpecInfo value for this
	 * ArrayOfCustomizationSpecInfo.
	 * 
	 * @param customizationSpecInfo
	 */
	public void setCustomizationSpecInfo(
			com.vmware.vim25.CustomizationSpecInfo[] customizationSpecInfo) {
		this.customizationSpecInfo = customizationSpecInfo;
	}

	public com.vmware.vim25.CustomizationSpecInfo getCustomizationSpecInfo(int i) {
		return this.customizationSpecInfo[i];
	}

	public void setCustomizationSpecInfo(int i,
			com.vmware.vim25.CustomizationSpecInfo _value) {
		this.customizationSpecInfo[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfCustomizationSpecInfo)) {
			return false;
		}
		ArrayOfCustomizationSpecInfo other = (ArrayOfCustomizationSpecInfo) obj;
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
		_equals = true && ((this.customizationSpecInfo == null && other
				.getCustomizationSpecInfo() == null) || (this.customizationSpecInfo != null && java.util.Arrays
				.equals(this.customizationSpecInfo, other
						.getCustomizationSpecInfo())));
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
		if (getCustomizationSpecInfo() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getCustomizationSpecInfo()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getCustomizationSpecInfo(), i);
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
			ArrayOfCustomizationSpecInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ArrayOfCustomizationSpecInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("customizationSpecInfo");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"CustomizationSpecInfo"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"CustomizationSpecInfo"));
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
