/**
 * ArrayOfVAppOvfSectionInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfVAppOvfSectionInfo implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.VAppOvfSectionInfo[] VAppOvfSectionInfo;

	public ArrayOfVAppOvfSectionInfo() {
	}

	public ArrayOfVAppOvfSectionInfo(
			com.vmware.vim25.VAppOvfSectionInfo[] VAppOvfSectionInfo) {
		this.VAppOvfSectionInfo = VAppOvfSectionInfo;
	}

	/**
	 * Gets the VAppOvfSectionInfo value for this ArrayOfVAppOvfSectionInfo.
	 * 
	 * @return VAppOvfSectionInfo
	 */
	public com.vmware.vim25.VAppOvfSectionInfo[] getVAppOvfSectionInfo() {
		return VAppOvfSectionInfo;
	}

	/**
	 * Sets the VAppOvfSectionInfo value for this ArrayOfVAppOvfSectionInfo.
	 * 
	 * @param VAppOvfSectionInfo
	 */
	public void setVAppOvfSectionInfo(
			com.vmware.vim25.VAppOvfSectionInfo[] VAppOvfSectionInfo) {
		this.VAppOvfSectionInfo = VAppOvfSectionInfo;
	}

	public com.vmware.vim25.VAppOvfSectionInfo getVAppOvfSectionInfo(int i) {
		return this.VAppOvfSectionInfo[i];
	}

	public void setVAppOvfSectionInfo(int i,
			com.vmware.vim25.VAppOvfSectionInfo _value) {
		this.VAppOvfSectionInfo[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfVAppOvfSectionInfo)) {
			return false;
		}
		ArrayOfVAppOvfSectionInfo other = (ArrayOfVAppOvfSectionInfo) obj;
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
		_equals = true && ((this.VAppOvfSectionInfo == null && other
				.getVAppOvfSectionInfo() == null) || (this.VAppOvfSectionInfo != null && java.util.Arrays
				.equals(this.VAppOvfSectionInfo, other.getVAppOvfSectionInfo())));
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
		if (getVAppOvfSectionInfo() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getVAppOvfSectionInfo()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getVAppOvfSectionInfo(), i);
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
			ArrayOfVAppOvfSectionInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ArrayOfVAppOvfSectionInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("VAppOvfSectionInfo");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"VAppOvfSectionInfo"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VAppOvfSectionInfo"));
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
