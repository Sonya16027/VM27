/**
 * ArrayOfPhysicalNicHintInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class ArrayOfPhysicalNicHintInfo implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim.PhysicalNicHintInfo[] physicalNicHintInfo;

	public ArrayOfPhysicalNicHintInfo() {
	}

	public ArrayOfPhysicalNicHintInfo(
			com.vmware.vim.PhysicalNicHintInfo[] physicalNicHintInfo) {
		this.physicalNicHintInfo = physicalNicHintInfo;
	}

	/**
	 * Gets the physicalNicHintInfo value for this ArrayOfPhysicalNicHintInfo.
	 * 
	 * @return physicalNicHintInfo
	 */
	public com.vmware.vim.PhysicalNicHintInfo[] getPhysicalNicHintInfo() {
		return physicalNicHintInfo;
	}

	/**
	 * Sets the physicalNicHintInfo value for this ArrayOfPhysicalNicHintInfo.
	 * 
	 * @param physicalNicHintInfo
	 */
	public void setPhysicalNicHintInfo(
			com.vmware.vim.PhysicalNicHintInfo[] physicalNicHintInfo) {
		this.physicalNicHintInfo = physicalNicHintInfo;
	}

	public com.vmware.vim.PhysicalNicHintInfo getPhysicalNicHintInfo(int i) {
		return this.physicalNicHintInfo[i];
	}

	public void setPhysicalNicHintInfo(int i,
			com.vmware.vim.PhysicalNicHintInfo _value) {
		this.physicalNicHintInfo[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfPhysicalNicHintInfo)) {
			return false;
		}
		ArrayOfPhysicalNicHintInfo other = (ArrayOfPhysicalNicHintInfo) obj;
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
		_equals = true && ((this.physicalNicHintInfo == null && other
				.getPhysicalNicHintInfo() == null) || (this.physicalNicHintInfo != null && java.util.Arrays
				.equals(this.physicalNicHintInfo, other
						.getPhysicalNicHintInfo())));
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
		if (getPhysicalNicHintInfo() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getPhysicalNicHintInfo()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getPhysicalNicHintInfo(), i);
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
			ArrayOfPhysicalNicHintInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ArrayOfPhysicalNicHintInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("physicalNicHintInfo");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"PhysicalNicHintInfo"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"PhysicalNicHintInfo"));
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
