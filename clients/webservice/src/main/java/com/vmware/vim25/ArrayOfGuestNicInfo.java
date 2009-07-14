/**
 * ArrayOfGuestNicInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfGuestNicInfo implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.GuestNicInfo[] guestNicInfo;

	public ArrayOfGuestNicInfo() {
	}

	public ArrayOfGuestNicInfo(com.vmware.vim25.GuestNicInfo[] guestNicInfo) {
		this.guestNicInfo = guestNicInfo;
	}

	/**
	 * Gets the guestNicInfo value for this ArrayOfGuestNicInfo.
	 * 
	 * @return guestNicInfo
	 */
	public com.vmware.vim25.GuestNicInfo[] getGuestNicInfo() {
		return guestNicInfo;
	}

	/**
	 * Sets the guestNicInfo value for this ArrayOfGuestNicInfo.
	 * 
	 * @param guestNicInfo
	 */
	public void setGuestNicInfo(com.vmware.vim25.GuestNicInfo[] guestNicInfo) {
		this.guestNicInfo = guestNicInfo;
	}

	public com.vmware.vim25.GuestNicInfo getGuestNicInfo(int i) {
		return this.guestNicInfo[i];
	}

	public void setGuestNicInfo(int i, com.vmware.vim25.GuestNicInfo _value) {
		this.guestNicInfo[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfGuestNicInfo)) {
			return false;
		}
		ArrayOfGuestNicInfo other = (ArrayOfGuestNicInfo) obj;
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
		_equals = true && ((this.guestNicInfo == null && other
				.getGuestNicInfo() == null) || (this.guestNicInfo != null && java.util.Arrays
				.equals(this.guestNicInfo, other.getGuestNicInfo())));
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
		if (getGuestNicInfo() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getGuestNicInfo()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getGuestNicInfo(), i);
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
			ArrayOfGuestNicInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ArrayOfGuestNicInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("guestNicInfo");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"GuestNicInfo"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"GuestNicInfo"));
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
