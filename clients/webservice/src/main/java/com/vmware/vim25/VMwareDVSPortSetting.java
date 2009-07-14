/**
 * VMwareDVSPortSetting.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VMwareDVSPortSetting extends com.vmware.vim25.DVPortSetting
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.VmwareDistributedVirtualSwitchVlanSpec vlan;

	private com.vmware.vim25.IntPolicy qosTag;

	private com.vmware.vim25.VmwareUplinkPortTeamingPolicy uplinkTeamingPolicy;

	private com.vmware.vim25.DVSSecurityPolicy securityPolicy;

	private com.vmware.vim25.BoolPolicy txUplink;

	public VMwareDVSPortSetting() {
	}

	public VMwareDVSPortSetting(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			com.vmware.vim25.BoolPolicy blocked,
			com.vmware.vim25.DVSTrafficShapingPolicy inShapingPolicy,
			com.vmware.vim25.DVSTrafficShapingPolicy outShapingPolicy,
			com.vmware.vim25.DVSVendorSpecificConfig vendorSpecificConfig,
			com.vmware.vim25.VmwareDistributedVirtualSwitchVlanSpec vlan,
			com.vmware.vim25.IntPolicy qosTag,
			com.vmware.vim25.VmwareUplinkPortTeamingPolicy uplinkTeamingPolicy,
			com.vmware.vim25.DVSSecurityPolicy securityPolicy,
			com.vmware.vim25.BoolPolicy txUplink) {
		super(dynamicType, dynamicProperty, blocked, inShapingPolicy,
				outShapingPolicy, vendorSpecificConfig);
		this.vlan = vlan;
		this.qosTag = qosTag;
		this.uplinkTeamingPolicy = uplinkTeamingPolicy;
		this.securityPolicy = securityPolicy;
		this.txUplink = txUplink;
	}

	/**
	 * Gets the vlan value for this VMwareDVSPortSetting.
	 * 
	 * @return vlan
	 */
	public com.vmware.vim25.VmwareDistributedVirtualSwitchVlanSpec getVlan() {
		return vlan;
	}

	/**
	 * Sets the vlan value for this VMwareDVSPortSetting.
	 * 
	 * @param vlan
	 */
	public void setVlan(
			com.vmware.vim25.VmwareDistributedVirtualSwitchVlanSpec vlan) {
		this.vlan = vlan;
	}

	/**
	 * Gets the qosTag value for this VMwareDVSPortSetting.
	 * 
	 * @return qosTag
	 */
	public com.vmware.vim25.IntPolicy getQosTag() {
		return qosTag;
	}

	/**
	 * Sets the qosTag value for this VMwareDVSPortSetting.
	 * 
	 * @param qosTag
	 */
	public void setQosTag(com.vmware.vim25.IntPolicy qosTag) {
		this.qosTag = qosTag;
	}

	/**
	 * Gets the uplinkTeamingPolicy value for this VMwareDVSPortSetting.
	 * 
	 * @return uplinkTeamingPolicy
	 */
	public com.vmware.vim25.VmwareUplinkPortTeamingPolicy getUplinkTeamingPolicy() {
		return uplinkTeamingPolicy;
	}

	/**
	 * Sets the uplinkTeamingPolicy value for this VMwareDVSPortSetting.
	 * 
	 * @param uplinkTeamingPolicy
	 */
	public void setUplinkTeamingPolicy(
			com.vmware.vim25.VmwareUplinkPortTeamingPolicy uplinkTeamingPolicy) {
		this.uplinkTeamingPolicy = uplinkTeamingPolicy;
	}

	/**
	 * Gets the securityPolicy value for this VMwareDVSPortSetting.
	 * 
	 * @return securityPolicy
	 */
	public com.vmware.vim25.DVSSecurityPolicy getSecurityPolicy() {
		return securityPolicy;
	}

	/**
	 * Sets the securityPolicy value for this VMwareDVSPortSetting.
	 * 
	 * @param securityPolicy
	 */
	public void setSecurityPolicy(
			com.vmware.vim25.DVSSecurityPolicy securityPolicy) {
		this.securityPolicy = securityPolicy;
	}

	/**
	 * Gets the txUplink value for this VMwareDVSPortSetting.
	 * 
	 * @return txUplink
	 */
	public com.vmware.vim25.BoolPolicy getTxUplink() {
		return txUplink;
	}

	/**
	 * Sets the txUplink value for this VMwareDVSPortSetting.
	 * 
	 * @param txUplink
	 */
	public void setTxUplink(com.vmware.vim25.BoolPolicy txUplink) {
		this.txUplink = txUplink;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof VMwareDVSPortSetting)) {
			return false;
		}
		VMwareDVSPortSetting other = (VMwareDVSPortSetting) obj;
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
				&& ((this.vlan == null && other.getVlan() == null) || (this.vlan != null && this.vlan
						.equals(other.getVlan())))
				&& ((this.qosTag == null && other.getQosTag() == null) || (this.qosTag != null && this.qosTag
						.equals(other.getQosTag())))
				&& ((this.uplinkTeamingPolicy == null && other
						.getUplinkTeamingPolicy() == null) || (this.uplinkTeamingPolicy != null && this.uplinkTeamingPolicy
						.equals(other.getUplinkTeamingPolicy())))
				&& ((this.securityPolicy == null && other.getSecurityPolicy() == null) || (this.securityPolicy != null && this.securityPolicy
						.equals(other.getSecurityPolicy())))
				&& ((this.txUplink == null && other.getTxUplink() == null) || (this.txUplink != null && this.txUplink
						.equals(other.getTxUplink())));
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
		if (getVlan() != null) {
			_hashCode += getVlan().hashCode();
		}
		if (getQosTag() != null) {
			_hashCode += getQosTag().hashCode();
		}
		if (getUplinkTeamingPolicy() != null) {
			_hashCode += getUplinkTeamingPolicy().hashCode();
		}
		if (getSecurityPolicy() != null) {
			_hashCode += getSecurityPolicy().hashCode();
		}
		if (getTxUplink() != null) {
			_hashCode += getTxUplink().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			VMwareDVSPortSetting.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VMwareDVSPortSetting"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("vlan");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vlan"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VmwareDistributedVirtualSwitchVlanSpec"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("qosTag");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"qosTag"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"IntPolicy"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("uplinkTeamingPolicy");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"uplinkTeamingPolicy"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VmwareUplinkPortTeamingPolicy"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("securityPolicy");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"securityPolicy"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"DVSSecurityPolicy"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("txUplink");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"txUplink"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"BoolPolicy"));
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
