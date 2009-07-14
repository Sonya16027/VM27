/**
 * ClusterDasVmConfigInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ClusterDasVmConfigInfo extends com.vmware.vim25.DynamicData
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.ManagedObjectReference key;

	private com.vmware.vim25.DasVmPriority restartPriority;

	private java.lang.Boolean powerOffOnIsolation;

	private com.vmware.vim25.ClusterDasVmSettings dasSettings;

	public ClusterDasVmConfigInfo() {
	}

	public ClusterDasVmConfigInfo(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			com.vmware.vim25.ManagedObjectReference key,
			com.vmware.vim25.DasVmPriority restartPriority,
			java.lang.Boolean powerOffOnIsolation,
			com.vmware.vim25.ClusterDasVmSettings dasSettings) {
		super(dynamicType, dynamicProperty);
		this.key = key;
		this.restartPriority = restartPriority;
		this.powerOffOnIsolation = powerOffOnIsolation;
		this.dasSettings = dasSettings;
	}

	/**
	 * Gets the key value for this ClusterDasVmConfigInfo.
	 * 
	 * @return key
	 */
	public com.vmware.vim25.ManagedObjectReference getKey() {
		return key;
	}

	/**
	 * Sets the key value for this ClusterDasVmConfigInfo.
	 * 
	 * @param key
	 */
	public void setKey(com.vmware.vim25.ManagedObjectReference key) {
		this.key = key;
	}

	/**
	 * Gets the restartPriority value for this ClusterDasVmConfigInfo.
	 * 
	 * @return restartPriority
	 */
	public com.vmware.vim25.DasVmPriority getRestartPriority() {
		return restartPriority;
	}

	/**
	 * Sets the restartPriority value for this ClusterDasVmConfigInfo.
	 * 
	 * @param restartPriority
	 */
	public void setRestartPriority(
			com.vmware.vim25.DasVmPriority restartPriority) {
		this.restartPriority = restartPriority;
	}

	/**
	 * Gets the powerOffOnIsolation value for this ClusterDasVmConfigInfo.
	 * 
	 * @return powerOffOnIsolation
	 */
	public java.lang.Boolean getPowerOffOnIsolation() {
		return powerOffOnIsolation;
	}

	/**
	 * Sets the powerOffOnIsolation value for this ClusterDasVmConfigInfo.
	 * 
	 * @param powerOffOnIsolation
	 */
	public void setPowerOffOnIsolation(java.lang.Boolean powerOffOnIsolation) {
		this.powerOffOnIsolation = powerOffOnIsolation;
	}

	/**
	 * Gets the dasSettings value for this ClusterDasVmConfigInfo.
	 * 
	 * @return dasSettings
	 */
	public com.vmware.vim25.ClusterDasVmSettings getDasSettings() {
		return dasSettings;
	}

	/**
	 * Sets the dasSettings value for this ClusterDasVmConfigInfo.
	 * 
	 * @param dasSettings
	 */
	public void setDasSettings(com.vmware.vim25.ClusterDasVmSettings dasSettings) {
		this.dasSettings = dasSettings;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ClusterDasVmConfigInfo)) {
			return false;
		}
		ClusterDasVmConfigInfo other = (ClusterDasVmConfigInfo) obj;
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
				&& ((this.key == null && other.getKey() == null) || (this.key != null && this.key
						.equals(other.getKey())))
				&& ((this.restartPriority == null && other.getRestartPriority() == null) || (this.restartPriority != null && this.restartPriority
						.equals(other.getRestartPriority())))
				&& ((this.powerOffOnIsolation == null && other
						.getPowerOffOnIsolation() == null) || (this.powerOffOnIsolation != null && this.powerOffOnIsolation
						.equals(other.getPowerOffOnIsolation())))
				&& ((this.dasSettings == null && other.getDasSettings() == null) || (this.dasSettings != null && this.dasSettings
						.equals(other.getDasSettings())));
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
		if (getKey() != null) {
			_hashCode += getKey().hashCode();
		}
		if (getRestartPriority() != null) {
			_hashCode += getRestartPriority().hashCode();
		}
		if (getPowerOffOnIsolation() != null) {
			_hashCode += getPowerOffOnIsolation().hashCode();
		}
		if (getDasSettings() != null) {
			_hashCode += getDasSettings().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			ClusterDasVmConfigInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ClusterDasVmConfigInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("key");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "key"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("restartPriority");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"restartPriority"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"DasVmPriority"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("powerOffOnIsolation");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"powerOffOnIsolation"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("dasSettings");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"dasSettings"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ClusterDasVmSettings"));
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
