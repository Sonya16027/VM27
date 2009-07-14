/**
 * VMwareDVSPortgroupPolicy.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VMwareDVSPortgroupPolicy extends
		com.vmware.vim25.DVPortgroupPolicy implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private boolean vlanOverrideAllowed;

	private boolean uplinkTeamingOverrideAllowed;

	private boolean securityPolicyOverrideAllowed;

	public VMwareDVSPortgroupPolicy() {
	}

	public VMwareDVSPortgroupPolicy(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			boolean blockOverrideAllowed, boolean shapingOverrideAllowed,
			boolean vendorConfigOverrideAllowed, boolean livePortMovingAllowed,
			boolean portConfigResetAtDisconnect, boolean vlanOverrideAllowed,
			boolean uplinkTeamingOverrideAllowed,
			boolean securityPolicyOverrideAllowed) {
		super(dynamicType, dynamicProperty, blockOverrideAllowed,
				shapingOverrideAllowed, vendorConfigOverrideAllowed,
				livePortMovingAllowed, portConfigResetAtDisconnect);
		this.vlanOverrideAllowed = vlanOverrideAllowed;
		this.uplinkTeamingOverrideAllowed = uplinkTeamingOverrideAllowed;
		this.securityPolicyOverrideAllowed = securityPolicyOverrideAllowed;
	}

	/**
	 * Gets the vlanOverrideAllowed value for this VMwareDVSPortgroupPolicy.
	 * 
	 * @return vlanOverrideAllowed
	 */
	public boolean isVlanOverrideAllowed() {
		return vlanOverrideAllowed;
	}

	/**
	 * Sets the vlanOverrideAllowed value for this VMwareDVSPortgroupPolicy.
	 * 
	 * @param vlanOverrideAllowed
	 */
	public void setVlanOverrideAllowed(boolean vlanOverrideAllowed) {
		this.vlanOverrideAllowed = vlanOverrideAllowed;
	}

	/**
	 * Gets the uplinkTeamingOverrideAllowed value for this
	 * VMwareDVSPortgroupPolicy.
	 * 
	 * @return uplinkTeamingOverrideAllowed
	 */
	public boolean isUplinkTeamingOverrideAllowed() {
		return uplinkTeamingOverrideAllowed;
	}

	/**
	 * Sets the uplinkTeamingOverrideAllowed value for this
	 * VMwareDVSPortgroupPolicy.
	 * 
	 * @param uplinkTeamingOverrideAllowed
	 */
	public void setUplinkTeamingOverrideAllowed(
			boolean uplinkTeamingOverrideAllowed) {
		this.uplinkTeamingOverrideAllowed = uplinkTeamingOverrideAllowed;
	}

	/**
	 * Gets the securityPolicyOverrideAllowed value for this
	 * VMwareDVSPortgroupPolicy.
	 * 
	 * @return securityPolicyOverrideAllowed
	 */
	public boolean isSecurityPolicyOverrideAllowed() {
		return securityPolicyOverrideAllowed;
	}

	/**
	 * Sets the securityPolicyOverrideAllowed value for this
	 * VMwareDVSPortgroupPolicy.
	 * 
	 * @param securityPolicyOverrideAllowed
	 */
	public void setSecurityPolicyOverrideAllowed(
			boolean securityPolicyOverrideAllowed) {
		this.securityPolicyOverrideAllowed = securityPolicyOverrideAllowed;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof VMwareDVSPortgroupPolicy)) {
			return false;
		}
		VMwareDVSPortgroupPolicy other = (VMwareDVSPortgroupPolicy) obj;
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
				&& this.vlanOverrideAllowed == other.isVlanOverrideAllowed()
				&& this.uplinkTeamingOverrideAllowed == other
						.isUplinkTeamingOverrideAllowed()
				&& this.securityPolicyOverrideAllowed == other
						.isSecurityPolicyOverrideAllowed();
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
		_hashCode += (isVlanOverrideAllowed() ? Boolean.TRUE : Boolean.FALSE)
				.hashCode();
		_hashCode += (isUplinkTeamingOverrideAllowed() ? Boolean.TRUE
				: Boolean.FALSE).hashCode();
		_hashCode += (isSecurityPolicyOverrideAllowed() ? Boolean.TRUE
				: Boolean.FALSE).hashCode();
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			VMwareDVSPortgroupPolicy.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VMwareDVSPortgroupPolicy"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("vlanOverrideAllowed");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"vlanOverrideAllowed"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("uplinkTeamingOverrideAllowed");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"uplinkTeamingOverrideAllowed"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("securityPolicyOverrideAllowed");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"securityPolicyOverrideAllowed"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
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
