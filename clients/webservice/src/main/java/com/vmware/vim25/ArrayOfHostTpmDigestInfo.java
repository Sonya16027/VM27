/**
 * ArrayOfHostTpmDigestInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfHostTpmDigestInfo implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.HostTpmDigestInfo[] hostTpmDigestInfo;

	public ArrayOfHostTpmDigestInfo() {
	}

	public ArrayOfHostTpmDigestInfo(
			com.vmware.vim25.HostTpmDigestInfo[] hostTpmDigestInfo) {
		this.hostTpmDigestInfo = hostTpmDigestInfo;
	}

	/**
	 * Gets the hostTpmDigestInfo value for this ArrayOfHostTpmDigestInfo.
	 * 
	 * @return hostTpmDigestInfo
	 */
	public com.vmware.vim25.HostTpmDigestInfo[] getHostTpmDigestInfo() {
		return hostTpmDigestInfo;
	}

	/**
	 * Sets the hostTpmDigestInfo value for this ArrayOfHostTpmDigestInfo.
	 * 
	 * @param hostTpmDigestInfo
	 */
	public void setHostTpmDigestInfo(
			com.vmware.vim25.HostTpmDigestInfo[] hostTpmDigestInfo) {
		this.hostTpmDigestInfo = hostTpmDigestInfo;
	}

	public com.vmware.vim25.HostTpmDigestInfo getHostTpmDigestInfo(int i) {
		return this.hostTpmDigestInfo[i];
	}

	public void setHostTpmDigestInfo(int i,
			com.vmware.vim25.HostTpmDigestInfo _value) {
		this.hostTpmDigestInfo[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfHostTpmDigestInfo)) {
			return false;
		}
		ArrayOfHostTpmDigestInfo other = (ArrayOfHostTpmDigestInfo) obj;
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
		_equals = true && ((this.hostTpmDigestInfo == null && other
				.getHostTpmDigestInfo() == null) || (this.hostTpmDigestInfo != null && java.util.Arrays
				.equals(this.hostTpmDigestInfo, other.getHostTpmDigestInfo())));
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
		if (getHostTpmDigestInfo() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getHostTpmDigestInfo()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getHostTpmDigestInfo(), i);
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
			ArrayOfHostTpmDigestInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ArrayOfHostTpmDigestInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("hostTpmDigestInfo");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"HostTpmDigestInfo"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostTpmDigestInfo"));
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
