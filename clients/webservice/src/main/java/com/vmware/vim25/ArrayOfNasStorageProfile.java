/**
 * ArrayOfNasStorageProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfNasStorageProfile implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.NasStorageProfile[] nasStorageProfile;

	public ArrayOfNasStorageProfile() {
	}

	public ArrayOfNasStorageProfile(
			com.vmware.vim25.NasStorageProfile[] nasStorageProfile) {
		this.nasStorageProfile = nasStorageProfile;
	}

	/**
	 * Gets the nasStorageProfile value for this ArrayOfNasStorageProfile.
	 * 
	 * @return nasStorageProfile
	 */
	public com.vmware.vim25.NasStorageProfile[] getNasStorageProfile() {
		return nasStorageProfile;
	}

	/**
	 * Sets the nasStorageProfile value for this ArrayOfNasStorageProfile.
	 * 
	 * @param nasStorageProfile
	 */
	public void setNasStorageProfile(
			com.vmware.vim25.NasStorageProfile[] nasStorageProfile) {
		this.nasStorageProfile = nasStorageProfile;
	}

	public com.vmware.vim25.NasStorageProfile getNasStorageProfile(int i) {
		return this.nasStorageProfile[i];
	}

	public void setNasStorageProfile(int i,
			com.vmware.vim25.NasStorageProfile _value) {
		this.nasStorageProfile[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfNasStorageProfile)) {
			return false;
		}
		ArrayOfNasStorageProfile other = (ArrayOfNasStorageProfile) obj;
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
		_equals = true && ((this.nasStorageProfile == null && other
				.getNasStorageProfile() == null) || (this.nasStorageProfile != null && java.util.Arrays
				.equals(this.nasStorageProfile, other.getNasStorageProfile())));
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
		if (getNasStorageProfile() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getNasStorageProfile()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getNasStorageProfile(), i);
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
			ArrayOfNasStorageProfile.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ArrayOfNasStorageProfile"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("nasStorageProfile");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"NasStorageProfile"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"NasStorageProfile"));
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
