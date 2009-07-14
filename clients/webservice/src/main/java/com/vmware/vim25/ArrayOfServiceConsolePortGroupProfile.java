/**
 * ArrayOfServiceConsolePortGroupProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfServiceConsolePortGroupProfile implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.ServiceConsolePortGroupProfile[] serviceConsolePortGroupProfile;

	public ArrayOfServiceConsolePortGroupProfile() {
	}

	public ArrayOfServiceConsolePortGroupProfile(
			com.vmware.vim25.ServiceConsolePortGroupProfile[] serviceConsolePortGroupProfile) {
		this.serviceConsolePortGroupProfile = serviceConsolePortGroupProfile;
	}

	/**
	 * Gets the serviceConsolePortGroupProfile value for this
	 * ArrayOfServiceConsolePortGroupProfile.
	 * 
	 * @return serviceConsolePortGroupProfile
	 */
	public com.vmware.vim25.ServiceConsolePortGroupProfile[] getServiceConsolePortGroupProfile() {
		return serviceConsolePortGroupProfile;
	}

	/**
	 * Sets the serviceConsolePortGroupProfile value for this
	 * ArrayOfServiceConsolePortGroupProfile.
	 * 
	 * @param serviceConsolePortGroupProfile
	 */
	public void setServiceConsolePortGroupProfile(
			com.vmware.vim25.ServiceConsolePortGroupProfile[] serviceConsolePortGroupProfile) {
		this.serviceConsolePortGroupProfile = serviceConsolePortGroupProfile;
	}

	public com.vmware.vim25.ServiceConsolePortGroupProfile getServiceConsolePortGroupProfile(
			int i) {
		return this.serviceConsolePortGroupProfile[i];
	}

	public void setServiceConsolePortGroupProfile(int i,
			com.vmware.vim25.ServiceConsolePortGroupProfile _value) {
		this.serviceConsolePortGroupProfile[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfServiceConsolePortGroupProfile)) {
			return false;
		}
		ArrayOfServiceConsolePortGroupProfile other = (ArrayOfServiceConsolePortGroupProfile) obj;
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
		_equals = true && ((this.serviceConsolePortGroupProfile == null && other
				.getServiceConsolePortGroupProfile() == null) || (this.serviceConsolePortGroupProfile != null && java.util.Arrays
				.equals(this.serviceConsolePortGroupProfile, other
						.getServiceConsolePortGroupProfile())));
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
		if (getServiceConsolePortGroupProfile() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getServiceConsolePortGroupProfile()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getServiceConsolePortGroupProfile(), i);
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
			ArrayOfServiceConsolePortGroupProfile.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ArrayOfServiceConsolePortGroupProfile"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("serviceConsolePortGroupProfile");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"ServiceConsolePortGroupProfile"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ServiceConsolePortGroupProfile"));
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
