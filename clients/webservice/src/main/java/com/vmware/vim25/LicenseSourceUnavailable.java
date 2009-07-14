/**
 * LicenseSourceUnavailable.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class LicenseSourceUnavailable extends
		com.vmware.vim25.NotEnoughLicenses implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.LicenseSource licenseSource;

	public LicenseSourceUnavailable() {
	}

	public LicenseSourceUnavailable(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			com.vmware.vim25.LocalizedMethodFault faultCause,
			com.vmware.vim25.LocalizableMessage[] faultMessage,
			com.vmware.vim25.LicenseSource licenseSource) {
		super(dynamicType, dynamicProperty, faultCause, faultMessage);
		this.licenseSource = licenseSource;
	}

	/**
	 * Gets the licenseSource value for this LicenseSourceUnavailable.
	 * 
	 * @return licenseSource
	 */
	public com.vmware.vim25.LicenseSource getLicenseSource() {
		return licenseSource;
	}

	/**
	 * Sets the licenseSource value for this LicenseSourceUnavailable.
	 * 
	 * @param licenseSource
	 */
	public void setLicenseSource(com.vmware.vim25.LicenseSource licenseSource) {
		this.licenseSource = licenseSource;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof LicenseSourceUnavailable)) {
			return false;
		}
		LicenseSourceUnavailable other = (LicenseSourceUnavailable) obj;
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
		_equals = super.equals(obj)
				&& ((this.licenseSource == null && other.getLicenseSource() == null) || (this.licenseSource != null && this.licenseSource
						.equals(other.getLicenseSource())));
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
		int _hashCode = super.hashCode();
		if (getLicenseSource() != null) {
			_hashCode += getLicenseSource().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			LicenseSourceUnavailable.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"LicenseSourceUnavailable"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("licenseSource");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"licenseSource"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"LicenseSource"));
		elemField.setNillable(false);
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

	/**
	 * Writes the exception data to the faultDetails
	 */
	@Override
	public void writeDetails(javax.xml.namespace.QName qname,
			org.apache.axis.encoding.SerializationContext context)
			throws java.io.IOException {
		context.serialize(qname, null, this);
	}
}
