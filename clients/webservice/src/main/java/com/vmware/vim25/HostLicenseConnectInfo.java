/**
 * HostLicenseConnectInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostLicenseConnectInfo extends com.vmware.vim25.DynamicData
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.LicenseManagerLicenseInfo license;

	private com.vmware.vim25.LicenseManagerEvaluationInfo evaluation;

	public HostLicenseConnectInfo() {
	}

	public HostLicenseConnectInfo(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			com.vmware.vim25.LicenseManagerLicenseInfo license,
			com.vmware.vim25.LicenseManagerEvaluationInfo evaluation) {
		super(dynamicType, dynamicProperty);
		this.license = license;
		this.evaluation = evaluation;
	}

	/**
	 * Gets the license value for this HostLicenseConnectInfo.
	 * 
	 * @return license
	 */
	public com.vmware.vim25.LicenseManagerLicenseInfo getLicense() {
		return license;
	}

	/**
	 * Sets the license value for this HostLicenseConnectInfo.
	 * 
	 * @param license
	 */
	public void setLicense(com.vmware.vim25.LicenseManagerLicenseInfo license) {
		this.license = license;
	}

	/**
	 * Gets the evaluation value for this HostLicenseConnectInfo.
	 * 
	 * @return evaluation
	 */
	public com.vmware.vim25.LicenseManagerEvaluationInfo getEvaluation() {
		return evaluation;
	}

	/**
	 * Sets the evaluation value for this HostLicenseConnectInfo.
	 * 
	 * @param evaluation
	 */
	public void setEvaluation(
			com.vmware.vim25.LicenseManagerEvaluationInfo evaluation) {
		this.evaluation = evaluation;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof HostLicenseConnectInfo)) {
			return false;
		}
		HostLicenseConnectInfo other = (HostLicenseConnectInfo) obj;
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
				&& ((this.license == null && other.getLicense() == null) || (this.license != null && this.license
						.equals(other.getLicense())))
				&& ((this.evaluation == null && other.getEvaluation() == null) || (this.evaluation != null && this.evaluation
						.equals(other.getEvaluation())));
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
		if (getLicense() != null) {
			_hashCode += getLicense().hashCode();
		}
		if (getEvaluation() != null) {
			_hashCode += getEvaluation().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			HostLicenseConnectInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostLicenseConnectInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("license");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"license"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"LicenseManagerLicenseInfo"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("evaluation");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"evaluation"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"LicenseManagerEvaluationInfo"));
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

}
