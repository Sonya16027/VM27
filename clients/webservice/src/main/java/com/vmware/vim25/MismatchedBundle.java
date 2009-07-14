/**
 * MismatchedBundle.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class MismatchedBundle extends com.vmware.vim25.VimFault implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String bundleUuid;

	private java.lang.String hostUuid;

	private int bundleBuildNumber;

	private int hostBuildNumber;

	public MismatchedBundle() {
	}

	public MismatchedBundle(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			com.vmware.vim25.LocalizedMethodFault faultCause,
			com.vmware.vim25.LocalizableMessage[] faultMessage,
			java.lang.String bundleUuid, java.lang.String hostUuid,
			int bundleBuildNumber, int hostBuildNumber) {
		super(dynamicType, dynamicProperty, faultCause, faultMessage);
		this.bundleUuid = bundleUuid;
		this.hostUuid = hostUuid;
		this.bundleBuildNumber = bundleBuildNumber;
		this.hostBuildNumber = hostBuildNumber;
	}

	/**
	 * Gets the bundleUuid value for this MismatchedBundle.
	 * 
	 * @return bundleUuid
	 */
	public java.lang.String getBundleUuid() {
		return bundleUuid;
	}

	/**
	 * Sets the bundleUuid value for this MismatchedBundle.
	 * 
	 * @param bundleUuid
	 */
	public void setBundleUuid(java.lang.String bundleUuid) {
		this.bundleUuid = bundleUuid;
	}

	/**
	 * Gets the hostUuid value for this MismatchedBundle.
	 * 
	 * @return hostUuid
	 */
	public java.lang.String getHostUuid() {
		return hostUuid;
	}

	/**
	 * Sets the hostUuid value for this MismatchedBundle.
	 * 
	 * @param hostUuid
	 */
	public void setHostUuid(java.lang.String hostUuid) {
		this.hostUuid = hostUuid;
	}

	/**
	 * Gets the bundleBuildNumber value for this MismatchedBundle.
	 * 
	 * @return bundleBuildNumber
	 */
	public int getBundleBuildNumber() {
		return bundleBuildNumber;
	}

	/**
	 * Sets the bundleBuildNumber value for this MismatchedBundle.
	 * 
	 * @param bundleBuildNumber
	 */
	public void setBundleBuildNumber(int bundleBuildNumber) {
		this.bundleBuildNumber = bundleBuildNumber;
	}

	/**
	 * Gets the hostBuildNumber value for this MismatchedBundle.
	 * 
	 * @return hostBuildNumber
	 */
	public int getHostBuildNumber() {
		return hostBuildNumber;
	}

	/**
	 * Sets the hostBuildNumber value for this MismatchedBundle.
	 * 
	 * @param hostBuildNumber
	 */
	public void setHostBuildNumber(int hostBuildNumber) {
		this.hostBuildNumber = hostBuildNumber;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof MismatchedBundle)) {
			return false;
		}
		MismatchedBundle other = (MismatchedBundle) obj;
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
				&& ((this.bundleUuid == null && other.getBundleUuid() == null) || (this.bundleUuid != null && this.bundleUuid
						.equals(other.getBundleUuid())))
				&& ((this.hostUuid == null && other.getHostUuid() == null) || (this.hostUuid != null && this.hostUuid
						.equals(other.getHostUuid())))
				&& this.bundleBuildNumber == other.getBundleBuildNumber()
				&& this.hostBuildNumber == other.getHostBuildNumber();
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
		if (getBundleUuid() != null) {
			_hashCode += getBundleUuid().hashCode();
		}
		if (getHostUuid() != null) {
			_hashCode += getHostUuid().hashCode();
		}
		_hashCode += getBundleBuildNumber();
		_hashCode += getHostBuildNumber();
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			MismatchedBundle.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"MismatchedBundle"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("bundleUuid");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"bundleUuid"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("hostUuid");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"hostUuid"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("bundleBuildNumber");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"bundleBuildNumber"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("hostBuildNumber");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"hostBuildNumber"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
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
