/**
 * ToolsConfigInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ToolsConfigInfo extends com.vmware.vim25.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.Integer toolsVersion;

	private java.lang.Boolean afterPowerOn;

	private java.lang.Boolean afterResume;

	private java.lang.Boolean beforeGuestStandby;

	private java.lang.Boolean beforeGuestShutdown;

	private java.lang.Boolean beforeGuestReboot;

	private java.lang.String toolsUpgradePolicy;

	private java.lang.String pendingCustomization;

	private java.lang.Boolean syncTimeWithHost;

	public ToolsConfigInfo() {
	}

	public ToolsConfigInfo(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.Integer toolsVersion, java.lang.Boolean afterPowerOn,
			java.lang.Boolean afterResume,
			java.lang.Boolean beforeGuestStandby,
			java.lang.Boolean beforeGuestShutdown,
			java.lang.Boolean beforeGuestReboot,
			java.lang.String toolsUpgradePolicy,
			java.lang.String pendingCustomization,
			java.lang.Boolean syncTimeWithHost) {
		super(dynamicType, dynamicProperty);
		this.toolsVersion = toolsVersion;
		this.afterPowerOn = afterPowerOn;
		this.afterResume = afterResume;
		this.beforeGuestStandby = beforeGuestStandby;
		this.beforeGuestShutdown = beforeGuestShutdown;
		this.beforeGuestReboot = beforeGuestReboot;
		this.toolsUpgradePolicy = toolsUpgradePolicy;
		this.pendingCustomization = pendingCustomization;
		this.syncTimeWithHost = syncTimeWithHost;
	}

	/**
	 * Gets the toolsVersion value for this ToolsConfigInfo.
	 * 
	 * @return toolsVersion
	 */
	public java.lang.Integer getToolsVersion() {
		return toolsVersion;
	}

	/**
	 * Sets the toolsVersion value for this ToolsConfigInfo.
	 * 
	 * @param toolsVersion
	 */
	public void setToolsVersion(java.lang.Integer toolsVersion) {
		this.toolsVersion = toolsVersion;
	}

	/**
	 * Gets the afterPowerOn value for this ToolsConfigInfo.
	 * 
	 * @return afterPowerOn
	 */
	public java.lang.Boolean getAfterPowerOn() {
		return afterPowerOn;
	}

	/**
	 * Sets the afterPowerOn value for this ToolsConfigInfo.
	 * 
	 * @param afterPowerOn
	 */
	public void setAfterPowerOn(java.lang.Boolean afterPowerOn) {
		this.afterPowerOn = afterPowerOn;
	}

	/**
	 * Gets the afterResume value for this ToolsConfigInfo.
	 * 
	 * @return afterResume
	 */
	public java.lang.Boolean getAfterResume() {
		return afterResume;
	}

	/**
	 * Sets the afterResume value for this ToolsConfigInfo.
	 * 
	 * @param afterResume
	 */
	public void setAfterResume(java.lang.Boolean afterResume) {
		this.afterResume = afterResume;
	}

	/**
	 * Gets the beforeGuestStandby value for this ToolsConfigInfo.
	 * 
	 * @return beforeGuestStandby
	 */
	public java.lang.Boolean getBeforeGuestStandby() {
		return beforeGuestStandby;
	}

	/**
	 * Sets the beforeGuestStandby value for this ToolsConfigInfo.
	 * 
	 * @param beforeGuestStandby
	 */
	public void setBeforeGuestStandby(java.lang.Boolean beforeGuestStandby) {
		this.beforeGuestStandby = beforeGuestStandby;
	}

	/**
	 * Gets the beforeGuestShutdown value for this ToolsConfigInfo.
	 * 
	 * @return beforeGuestShutdown
	 */
	public java.lang.Boolean getBeforeGuestShutdown() {
		return beforeGuestShutdown;
	}

	/**
	 * Sets the beforeGuestShutdown value for this ToolsConfigInfo.
	 * 
	 * @param beforeGuestShutdown
	 */
	public void setBeforeGuestShutdown(java.lang.Boolean beforeGuestShutdown) {
		this.beforeGuestShutdown = beforeGuestShutdown;
	}

	/**
	 * Gets the beforeGuestReboot value for this ToolsConfigInfo.
	 * 
	 * @return beforeGuestReboot
	 */
	public java.lang.Boolean getBeforeGuestReboot() {
		return beforeGuestReboot;
	}

	/**
	 * Sets the beforeGuestReboot value for this ToolsConfigInfo.
	 * 
	 * @param beforeGuestReboot
	 */
	public void setBeforeGuestReboot(java.lang.Boolean beforeGuestReboot) {
		this.beforeGuestReboot = beforeGuestReboot;
	}

	/**
	 * Gets the toolsUpgradePolicy value for this ToolsConfigInfo.
	 * 
	 * @return toolsUpgradePolicy
	 */
	public java.lang.String getToolsUpgradePolicy() {
		return toolsUpgradePolicy;
	}

	/**
	 * Sets the toolsUpgradePolicy value for this ToolsConfigInfo.
	 * 
	 * @param toolsUpgradePolicy
	 */
	public void setToolsUpgradePolicy(java.lang.String toolsUpgradePolicy) {
		this.toolsUpgradePolicy = toolsUpgradePolicy;
	}

	/**
	 * Gets the pendingCustomization value for this ToolsConfigInfo.
	 * 
	 * @return pendingCustomization
	 */
	public java.lang.String getPendingCustomization() {
		return pendingCustomization;
	}

	/**
	 * Sets the pendingCustomization value for this ToolsConfigInfo.
	 * 
	 * @param pendingCustomization
	 */
	public void setPendingCustomization(java.lang.String pendingCustomization) {
		this.pendingCustomization = pendingCustomization;
	}

	/**
	 * Gets the syncTimeWithHost value for this ToolsConfigInfo.
	 * 
	 * @return syncTimeWithHost
	 */
	public java.lang.Boolean getSyncTimeWithHost() {
		return syncTimeWithHost;
	}

	/**
	 * Sets the syncTimeWithHost value for this ToolsConfigInfo.
	 * 
	 * @param syncTimeWithHost
	 */
	public void setSyncTimeWithHost(java.lang.Boolean syncTimeWithHost) {
		this.syncTimeWithHost = syncTimeWithHost;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ToolsConfigInfo)) {
			return false;
		}
		ToolsConfigInfo other = (ToolsConfigInfo) obj;
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
				&& ((this.toolsVersion == null && other.getToolsVersion() == null) || (this.toolsVersion != null && this.toolsVersion
						.equals(other.getToolsVersion())))
				&& ((this.afterPowerOn == null && other.getAfterPowerOn() == null) || (this.afterPowerOn != null && this.afterPowerOn
						.equals(other.getAfterPowerOn())))
				&& ((this.afterResume == null && other.getAfterResume() == null) || (this.afterResume != null && this.afterResume
						.equals(other.getAfterResume())))
				&& ((this.beforeGuestStandby == null && other
						.getBeforeGuestStandby() == null) || (this.beforeGuestStandby != null && this.beforeGuestStandby
						.equals(other.getBeforeGuestStandby())))
				&& ((this.beforeGuestShutdown == null && other
						.getBeforeGuestShutdown() == null) || (this.beforeGuestShutdown != null && this.beforeGuestShutdown
						.equals(other.getBeforeGuestShutdown())))
				&& ((this.beforeGuestReboot == null && other
						.getBeforeGuestReboot() == null) || (this.beforeGuestReboot != null && this.beforeGuestReboot
						.equals(other.getBeforeGuestReboot())))
				&& ((this.toolsUpgradePolicy == null && other
						.getToolsUpgradePolicy() == null) || (this.toolsUpgradePolicy != null && this.toolsUpgradePolicy
						.equals(other.getToolsUpgradePolicy())))
				&& ((this.pendingCustomization == null && other
						.getPendingCustomization() == null) || (this.pendingCustomization != null && this.pendingCustomization
						.equals(other.getPendingCustomization())))
				&& ((this.syncTimeWithHost == null && other
						.getSyncTimeWithHost() == null) || (this.syncTimeWithHost != null && this.syncTimeWithHost
						.equals(other.getSyncTimeWithHost())));
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
		if (getToolsVersion() != null) {
			_hashCode += getToolsVersion().hashCode();
		}
		if (getAfterPowerOn() != null) {
			_hashCode += getAfterPowerOn().hashCode();
		}
		if (getAfterResume() != null) {
			_hashCode += getAfterResume().hashCode();
		}
		if (getBeforeGuestStandby() != null) {
			_hashCode += getBeforeGuestStandby().hashCode();
		}
		if (getBeforeGuestShutdown() != null) {
			_hashCode += getBeforeGuestShutdown().hashCode();
		}
		if (getBeforeGuestReboot() != null) {
			_hashCode += getBeforeGuestReboot().hashCode();
		}
		if (getToolsUpgradePolicy() != null) {
			_hashCode += getToolsUpgradePolicy().hashCode();
		}
		if (getPendingCustomization() != null) {
			_hashCode += getPendingCustomization().hashCode();
		}
		if (getSyncTimeWithHost() != null) {
			_hashCode += getSyncTimeWithHost().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			ToolsConfigInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ToolsConfigInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("toolsVersion");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"toolsVersion"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("afterPowerOn");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"afterPowerOn"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("afterResume");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"afterResume"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("beforeGuestStandby");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"beforeGuestStandby"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("beforeGuestShutdown");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"beforeGuestShutdown"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("beforeGuestReboot");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"beforeGuestReboot"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("toolsUpgradePolicy");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"toolsUpgradePolicy"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("pendingCustomization");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"pendingCustomization"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("syncTimeWithHost");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"syncTimeWithHost"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
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
