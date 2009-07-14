/**
 * ArrayOfAutoStartPowerInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class ArrayOfAutoStartPowerInfo implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim.AutoStartPowerInfo[] autoStartPowerInfo;

	public ArrayOfAutoStartPowerInfo() {
	}

	public ArrayOfAutoStartPowerInfo(
			com.vmware.vim.AutoStartPowerInfo[] autoStartPowerInfo) {
		this.autoStartPowerInfo = autoStartPowerInfo;
	}

	/**
	 * Gets the autoStartPowerInfo value for this ArrayOfAutoStartPowerInfo.
	 * 
	 * @return autoStartPowerInfo
	 */
	public com.vmware.vim.AutoStartPowerInfo[] getAutoStartPowerInfo() {
		return autoStartPowerInfo;
	}

	/**
	 * Sets the autoStartPowerInfo value for this ArrayOfAutoStartPowerInfo.
	 * 
	 * @param autoStartPowerInfo
	 */
	public void setAutoStartPowerInfo(
			com.vmware.vim.AutoStartPowerInfo[] autoStartPowerInfo) {
		this.autoStartPowerInfo = autoStartPowerInfo;
	}

	public com.vmware.vim.AutoStartPowerInfo getAutoStartPowerInfo(int i) {
		return this.autoStartPowerInfo[i];
	}

	public void setAutoStartPowerInfo(int i,
			com.vmware.vim.AutoStartPowerInfo _value) {
		this.autoStartPowerInfo[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfAutoStartPowerInfo)) {
			return false;
		}
		ArrayOfAutoStartPowerInfo other = (ArrayOfAutoStartPowerInfo) obj;
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
		_equals = true && ((this.autoStartPowerInfo == null && other
				.getAutoStartPowerInfo() == null) || (this.autoStartPowerInfo != null && java.util.Arrays
				.equals(this.autoStartPowerInfo, other.getAutoStartPowerInfo())));
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
		if (getAutoStartPowerInfo() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getAutoStartPowerInfo()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getAutoStartPowerInfo(), i);
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
			ArrayOfAutoStartPowerInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ArrayOfAutoStartPowerInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("autoStartPowerInfo");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"AutoStartPowerInfo"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"AutoStartPowerInfo"));
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
