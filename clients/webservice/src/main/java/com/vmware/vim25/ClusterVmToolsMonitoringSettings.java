/**
 * ClusterVmToolsMonitoringSettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ClusterVmToolsMonitoringSettings extends
		com.vmware.vim25.DynamicData implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.Boolean enabled;

	private java.lang.Boolean clusterSettings;

	private java.lang.Integer failureInterval;

	private java.lang.Integer minUpTime;

	private java.lang.Integer maxFailures;

	private java.lang.Integer maxFailureWindow;

	public ClusterVmToolsMonitoringSettings() {
	}

	public ClusterVmToolsMonitoringSettings(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.Boolean enabled, java.lang.Boolean clusterSettings,
			java.lang.Integer failureInterval, java.lang.Integer minUpTime,
			java.lang.Integer maxFailures, java.lang.Integer maxFailureWindow) {
		super(dynamicType, dynamicProperty);
		this.enabled = enabled;
		this.clusterSettings = clusterSettings;
		this.failureInterval = failureInterval;
		this.minUpTime = minUpTime;
		this.maxFailures = maxFailures;
		this.maxFailureWindow = maxFailureWindow;
	}

	/**
	 * Gets the enabled value for this ClusterVmToolsMonitoringSettings.
	 * 
	 * @return enabled
	 */
	public java.lang.Boolean getEnabled() {
		return enabled;
	}

	/**
	 * Sets the enabled value for this ClusterVmToolsMonitoringSettings.
	 * 
	 * @param enabled
	 */
	public void setEnabled(java.lang.Boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * Gets the clusterSettings value for this ClusterVmToolsMonitoringSettings.
	 * 
	 * @return clusterSettings
	 */
	public java.lang.Boolean getClusterSettings() {
		return clusterSettings;
	}

	/**
	 * Sets the clusterSettings value for this ClusterVmToolsMonitoringSettings.
	 * 
	 * @param clusterSettings
	 */
	public void setClusterSettings(java.lang.Boolean clusterSettings) {
		this.clusterSettings = clusterSettings;
	}

	/**
	 * Gets the failureInterval value for this ClusterVmToolsMonitoringSettings.
	 * 
	 * @return failureInterval
	 */
	public java.lang.Integer getFailureInterval() {
		return failureInterval;
	}

	/**
	 * Sets the failureInterval value for this ClusterVmToolsMonitoringSettings.
	 * 
	 * @param failureInterval
	 */
	public void setFailureInterval(java.lang.Integer failureInterval) {
		this.failureInterval = failureInterval;
	}

	/**
	 * Gets the minUpTime value for this ClusterVmToolsMonitoringSettings.
	 * 
	 * @return minUpTime
	 */
	public java.lang.Integer getMinUpTime() {
		return minUpTime;
	}

	/**
	 * Sets the minUpTime value for this ClusterVmToolsMonitoringSettings.
	 * 
	 * @param minUpTime
	 */
	public void setMinUpTime(java.lang.Integer minUpTime) {
		this.minUpTime = minUpTime;
	}

	/**
	 * Gets the maxFailures value for this ClusterVmToolsMonitoringSettings.
	 * 
	 * @return maxFailures
	 */
	public java.lang.Integer getMaxFailures() {
		return maxFailures;
	}

	/**
	 * Sets the maxFailures value for this ClusterVmToolsMonitoringSettings.
	 * 
	 * @param maxFailures
	 */
	public void setMaxFailures(java.lang.Integer maxFailures) {
		this.maxFailures = maxFailures;
	}

	/**
	 * Gets the maxFailureWindow value for this
	 * ClusterVmToolsMonitoringSettings.
	 * 
	 * @return maxFailureWindow
	 */
	public java.lang.Integer getMaxFailureWindow() {
		return maxFailureWindow;
	}

	/**
	 * Sets the maxFailureWindow value for this
	 * ClusterVmToolsMonitoringSettings.
	 * 
	 * @param maxFailureWindow
	 */
	public void setMaxFailureWindow(java.lang.Integer maxFailureWindow) {
		this.maxFailureWindow = maxFailureWindow;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ClusterVmToolsMonitoringSettings)) {
			return false;
		}
		ClusterVmToolsMonitoringSettings other = (ClusterVmToolsMonitoringSettings) obj;
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
				&& ((this.enabled == null && other.getEnabled() == null) || (this.enabled != null && this.enabled
						.equals(other.getEnabled())))
				&& ((this.clusterSettings == null && other.getClusterSettings() == null) || (this.clusterSettings != null && this.clusterSettings
						.equals(other.getClusterSettings())))
				&& ((this.failureInterval == null && other.getFailureInterval() == null) || (this.failureInterval != null && this.failureInterval
						.equals(other.getFailureInterval())))
				&& ((this.minUpTime == null && other.getMinUpTime() == null) || (this.minUpTime != null && this.minUpTime
						.equals(other.getMinUpTime())))
				&& ((this.maxFailures == null && other.getMaxFailures() == null) || (this.maxFailures != null && this.maxFailures
						.equals(other.getMaxFailures())))
				&& ((this.maxFailureWindow == null && other
						.getMaxFailureWindow() == null) || (this.maxFailureWindow != null && this.maxFailureWindow
						.equals(other.getMaxFailureWindow())));
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
		if (getEnabled() != null) {
			_hashCode += getEnabled().hashCode();
		}
		if (getClusterSettings() != null) {
			_hashCode += getClusterSettings().hashCode();
		}
		if (getFailureInterval() != null) {
			_hashCode += getFailureInterval().hashCode();
		}
		if (getMinUpTime() != null) {
			_hashCode += getMinUpTime().hashCode();
		}
		if (getMaxFailures() != null) {
			_hashCode += getMaxFailures().hashCode();
		}
		if (getMaxFailureWindow() != null) {
			_hashCode += getMaxFailureWindow().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			ClusterVmToolsMonitoringSettings.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ClusterVmToolsMonitoringSettings"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("enabled");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"enabled"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("clusterSettings");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"clusterSettings"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("failureInterval");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"failureInterval"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("minUpTime");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"minUpTime"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("maxFailures");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"maxFailures"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("maxFailureWindow");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"maxFailureWindow"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
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
