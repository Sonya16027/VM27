/**
 * ArrayOfLicenseAvailabilityInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfLicenseAvailabilityInfo implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.LicenseAvailabilityInfo[] licenseAvailabilityInfo;

	public ArrayOfLicenseAvailabilityInfo() {
	}

	public ArrayOfLicenseAvailabilityInfo(
			com.vmware.vim25.LicenseAvailabilityInfo[] licenseAvailabilityInfo) {
		this.licenseAvailabilityInfo = licenseAvailabilityInfo;
	}

	/**
	 * Gets the licenseAvailabilityInfo value for this
	 * ArrayOfLicenseAvailabilityInfo.
	 * 
	 * @return licenseAvailabilityInfo
	 */
	public com.vmware.vim25.LicenseAvailabilityInfo[] getLicenseAvailabilityInfo() {
		return licenseAvailabilityInfo;
	}

	/**
	 * Sets the licenseAvailabilityInfo value for this
	 * ArrayOfLicenseAvailabilityInfo.
	 * 
	 * @param licenseAvailabilityInfo
	 */
	public void setLicenseAvailabilityInfo(
			com.vmware.vim25.LicenseAvailabilityInfo[] licenseAvailabilityInfo) {
		this.licenseAvailabilityInfo = licenseAvailabilityInfo;
	}

	public com.vmware.vim25.LicenseAvailabilityInfo getLicenseAvailabilityInfo(
			int i) {
		return this.licenseAvailabilityInfo[i];
	}

	public void setLicenseAvailabilityInfo(int i,
			com.vmware.vim25.LicenseAvailabilityInfo _value) {
		this.licenseAvailabilityInfo[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfLicenseAvailabilityInfo)) {
			return false;
		}
		ArrayOfLicenseAvailabilityInfo other = (ArrayOfLicenseAvailabilityInfo) obj;
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
		_equals = true && ((this.licenseAvailabilityInfo == null && other
				.getLicenseAvailabilityInfo() == null) || (this.licenseAvailabilityInfo != null && java.util.Arrays
				.equals(this.licenseAvailabilityInfo, other
						.getLicenseAvailabilityInfo())));
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
		if (getLicenseAvailabilityInfo() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getLicenseAvailabilityInfo()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getLicenseAvailabilityInfo(), i);
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
			ArrayOfLicenseAvailabilityInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ArrayOfLicenseAvailabilityInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("licenseAvailabilityInfo");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"LicenseAvailabilityInfo"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"LicenseAvailabilityInfo"));
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
