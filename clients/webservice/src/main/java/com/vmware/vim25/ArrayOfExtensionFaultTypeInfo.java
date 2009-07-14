/**
 * ArrayOfExtensionFaultTypeInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfExtensionFaultTypeInfo implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.ExtensionFaultTypeInfo[] extensionFaultTypeInfo;

	public ArrayOfExtensionFaultTypeInfo() {
	}

	public ArrayOfExtensionFaultTypeInfo(
			com.vmware.vim25.ExtensionFaultTypeInfo[] extensionFaultTypeInfo) {
		this.extensionFaultTypeInfo = extensionFaultTypeInfo;
	}

	/**
	 * Gets the extensionFaultTypeInfo value for this
	 * ArrayOfExtensionFaultTypeInfo.
	 * 
	 * @return extensionFaultTypeInfo
	 */
	public com.vmware.vim25.ExtensionFaultTypeInfo[] getExtensionFaultTypeInfo() {
		return extensionFaultTypeInfo;
	}

	/**
	 * Sets the extensionFaultTypeInfo value for this
	 * ArrayOfExtensionFaultTypeInfo.
	 * 
	 * @param extensionFaultTypeInfo
	 */
	public void setExtensionFaultTypeInfo(
			com.vmware.vim25.ExtensionFaultTypeInfo[] extensionFaultTypeInfo) {
		this.extensionFaultTypeInfo = extensionFaultTypeInfo;
	}

	public com.vmware.vim25.ExtensionFaultTypeInfo getExtensionFaultTypeInfo(
			int i) {
		return this.extensionFaultTypeInfo[i];
	}

	public void setExtensionFaultTypeInfo(int i,
			com.vmware.vim25.ExtensionFaultTypeInfo _value) {
		this.extensionFaultTypeInfo[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfExtensionFaultTypeInfo)) {
			return false;
		}
		ArrayOfExtensionFaultTypeInfo other = (ArrayOfExtensionFaultTypeInfo) obj;
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
		_equals = true && ((this.extensionFaultTypeInfo == null && other
				.getExtensionFaultTypeInfo() == null) || (this.extensionFaultTypeInfo != null && java.util.Arrays
				.equals(this.extensionFaultTypeInfo, other
						.getExtensionFaultTypeInfo())));
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
		if (getExtensionFaultTypeInfo() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getExtensionFaultTypeInfo()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getExtensionFaultTypeInfo(), i);
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
			ArrayOfExtensionFaultTypeInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ArrayOfExtensionFaultTypeInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("extensionFaultTypeInfo");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"ExtensionFaultTypeInfo"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ExtensionFaultTypeInfo"));
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
