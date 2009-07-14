/**
 * HealthSystemRuntime.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HealthSystemRuntime extends com.vmware.vim25.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.HostSystemHealthInfo systemHealthInfo;

	private com.vmware.vim25.HostHardwareStatusInfo hardwareStatusInfo;

	public HealthSystemRuntime() {
	}

	public HealthSystemRuntime(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			com.vmware.vim25.HostSystemHealthInfo systemHealthInfo,
			com.vmware.vim25.HostHardwareStatusInfo hardwareStatusInfo) {
		super(dynamicType, dynamicProperty);
		this.systemHealthInfo = systemHealthInfo;
		this.hardwareStatusInfo = hardwareStatusInfo;
	}

	/**
	 * Gets the systemHealthInfo value for this HealthSystemRuntime.
	 * 
	 * @return systemHealthInfo
	 */
	public com.vmware.vim25.HostSystemHealthInfo getSystemHealthInfo() {
		return systemHealthInfo;
	}

	/**
	 * Sets the systemHealthInfo value for this HealthSystemRuntime.
	 * 
	 * @param systemHealthInfo
	 */
	public void setSystemHealthInfo(
			com.vmware.vim25.HostSystemHealthInfo systemHealthInfo) {
		this.systemHealthInfo = systemHealthInfo;
	}

	/**
	 * Gets the hardwareStatusInfo value for this HealthSystemRuntime.
	 * 
	 * @return hardwareStatusInfo
	 */
	public com.vmware.vim25.HostHardwareStatusInfo getHardwareStatusInfo() {
		return hardwareStatusInfo;
	}

	/**
	 * Sets the hardwareStatusInfo value for this HealthSystemRuntime.
	 * 
	 * @param hardwareStatusInfo
	 */
	public void setHardwareStatusInfo(
			com.vmware.vim25.HostHardwareStatusInfo hardwareStatusInfo) {
		this.hardwareStatusInfo = hardwareStatusInfo;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof HealthSystemRuntime)) {
			return false;
		}
		HealthSystemRuntime other = (HealthSystemRuntime) obj;
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
				&& ((this.systemHealthInfo == null && other
						.getSystemHealthInfo() == null) || (this.systemHealthInfo != null && this.systemHealthInfo
						.equals(other.getSystemHealthInfo())))
				&& ((this.hardwareStatusInfo == null && other
						.getHardwareStatusInfo() == null) || (this.hardwareStatusInfo != null && this.hardwareStatusInfo
						.equals(other.getHardwareStatusInfo())));
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
		if (getSystemHealthInfo() != null) {
			_hashCode += getSystemHealthInfo().hashCode();
		}
		if (getHardwareStatusInfo() != null) {
			_hashCode += getHardwareStatusInfo().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			HealthSystemRuntime.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HealthSystemRuntime"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("systemHealthInfo");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"systemHealthInfo"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostSystemHealthInfo"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("hardwareStatusInfo");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"hardwareStatusInfo"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostHardwareStatusInfo"));
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
