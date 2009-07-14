/**
 * ArrayOfExtensionPrivilegeInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfExtensionPrivilegeInfo implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.ExtensionPrivilegeInfo[] extensionPrivilegeInfo;

	public ArrayOfExtensionPrivilegeInfo() {
	}

	public ArrayOfExtensionPrivilegeInfo(
			com.vmware.vim25.ExtensionPrivilegeInfo[] extensionPrivilegeInfo) {
		this.extensionPrivilegeInfo = extensionPrivilegeInfo;
	}

	/**
	 * Gets the extensionPrivilegeInfo value for this
	 * ArrayOfExtensionPrivilegeInfo.
	 * 
	 * @return extensionPrivilegeInfo
	 */
	public com.vmware.vim25.ExtensionPrivilegeInfo[] getExtensionPrivilegeInfo() {
		return extensionPrivilegeInfo;
	}

	/**
	 * Sets the extensionPrivilegeInfo value for this
	 * ArrayOfExtensionPrivilegeInfo.
	 * 
	 * @param extensionPrivilegeInfo
	 */
	public void setExtensionPrivilegeInfo(
			com.vmware.vim25.ExtensionPrivilegeInfo[] extensionPrivilegeInfo) {
		this.extensionPrivilegeInfo = extensionPrivilegeInfo;
	}

	public com.vmware.vim25.ExtensionPrivilegeInfo getExtensionPrivilegeInfo(
			int i) {
		return this.extensionPrivilegeInfo[i];
	}

	public void setExtensionPrivilegeInfo(int i,
			com.vmware.vim25.ExtensionPrivilegeInfo _value) {
		this.extensionPrivilegeInfo[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfExtensionPrivilegeInfo)) {
			return false;
		}
		ArrayOfExtensionPrivilegeInfo other = (ArrayOfExtensionPrivilegeInfo) obj;
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
		_equals = true && ((this.extensionPrivilegeInfo == null && other
				.getExtensionPrivilegeInfo() == null) || (this.extensionPrivilegeInfo != null && java.util.Arrays
				.equals(this.extensionPrivilegeInfo, other
						.getExtensionPrivilegeInfo())));
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
		if (getExtensionPrivilegeInfo() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getExtensionPrivilegeInfo()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getExtensionPrivilegeInfo(), i);
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
			ArrayOfExtensionPrivilegeInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ArrayOfExtensionPrivilegeInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("extensionPrivilegeInfo");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"ExtensionPrivilegeInfo"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ExtensionPrivilegeInfo"));
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
