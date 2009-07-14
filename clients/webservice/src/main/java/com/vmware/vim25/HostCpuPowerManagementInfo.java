/**
 * HostCpuPowerManagementInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostCpuPowerManagementInfo extends com.vmware.vim25.DynamicData
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String currentPolicy;

	private java.lang.String hardwareSupport;

	public HostCpuPowerManagementInfo() {
	}

	public HostCpuPowerManagementInfo(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.String currentPolicy, java.lang.String hardwareSupport) {
		super(dynamicType, dynamicProperty);
		this.currentPolicy = currentPolicy;
		this.hardwareSupport = hardwareSupport;
	}

	/**
	 * Gets the currentPolicy value for this HostCpuPowerManagementInfo.
	 * 
	 * @return currentPolicy
	 */
	public java.lang.String getCurrentPolicy() {
		return currentPolicy;
	}

	/**
	 * Sets the currentPolicy value for this HostCpuPowerManagementInfo.
	 * 
	 * @param currentPolicy
	 */
	public void setCurrentPolicy(java.lang.String currentPolicy) {
		this.currentPolicy = currentPolicy;
	}

	/**
	 * Gets the hardwareSupport value for this HostCpuPowerManagementInfo.
	 * 
	 * @return hardwareSupport
	 */
	public java.lang.String getHardwareSupport() {
		return hardwareSupport;
	}

	/**
	 * Sets the hardwareSupport value for this HostCpuPowerManagementInfo.
	 * 
	 * @param hardwareSupport
	 */
	public void setHardwareSupport(java.lang.String hardwareSupport) {
		this.hardwareSupport = hardwareSupport;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof HostCpuPowerManagementInfo)) {
			return false;
		}
		HostCpuPowerManagementInfo other = (HostCpuPowerManagementInfo) obj;
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
				&& ((this.currentPolicy == null && other.getCurrentPolicy() == null) || (this.currentPolicy != null && this.currentPolicy
						.equals(other.getCurrentPolicy())))
				&& ((this.hardwareSupport == null && other.getHardwareSupport() == null) || (this.hardwareSupport != null && this.hardwareSupport
						.equals(other.getHardwareSupport())));
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
		if (getCurrentPolicy() != null) {
			_hashCode += getCurrentPolicy().hashCode();
		}
		if (getHardwareSupport() != null) {
			_hashCode += getHardwareSupport().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			HostCpuPowerManagementInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostCpuPowerManagementInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("currentPolicy");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"currentPolicy"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("hardwareSupport");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"hardwareSupport"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
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
