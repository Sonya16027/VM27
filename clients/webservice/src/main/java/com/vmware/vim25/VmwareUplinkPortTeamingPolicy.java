/**
 * VmwareUplinkPortTeamingPolicy.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VmwareUplinkPortTeamingPolicy extends
		com.vmware.vim25.InheritablePolicy implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.StringPolicy policy;

	private com.vmware.vim25.BoolPolicy reversePolicy;

	private com.vmware.vim25.BoolPolicy notifySwitches;

	private com.vmware.vim25.BoolPolicy rollingOrder;

	private com.vmware.vim25.DVSFailureCriteria failureCriteria;

	private com.vmware.vim25.VMwareUplinkPortOrderPolicy uplinkPortOrder;

	public VmwareUplinkPortTeamingPolicy() {
	}

	public VmwareUplinkPortTeamingPolicy(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			boolean inherited, com.vmware.vim25.StringPolicy policy,
			com.vmware.vim25.BoolPolicy reversePolicy,
			com.vmware.vim25.BoolPolicy notifySwitches,
			com.vmware.vim25.BoolPolicy rollingOrder,
			com.vmware.vim25.DVSFailureCriteria failureCriteria,
			com.vmware.vim25.VMwareUplinkPortOrderPolicy uplinkPortOrder) {
		super(dynamicType, dynamicProperty, inherited);
		this.policy = policy;
		this.reversePolicy = reversePolicy;
		this.notifySwitches = notifySwitches;
		this.rollingOrder = rollingOrder;
		this.failureCriteria = failureCriteria;
		this.uplinkPortOrder = uplinkPortOrder;
	}

	/**
	 * Gets the policy value for this VmwareUplinkPortTeamingPolicy.
	 * 
	 * @return policy
	 */
	public com.vmware.vim25.StringPolicy getPolicy() {
		return policy;
	}

	/**
	 * Sets the policy value for this VmwareUplinkPortTeamingPolicy.
	 * 
	 * @param policy
	 */
	public void setPolicy(com.vmware.vim25.StringPolicy policy) {
		this.policy = policy;
	}

	/**
	 * Gets the reversePolicy value for this VmwareUplinkPortTeamingPolicy.
	 * 
	 * @return reversePolicy
	 */
	public com.vmware.vim25.BoolPolicy getReversePolicy() {
		return reversePolicy;
	}

	/**
	 * Sets the reversePolicy value for this VmwareUplinkPortTeamingPolicy.
	 * 
	 * @param reversePolicy
	 */
	public void setReversePolicy(com.vmware.vim25.BoolPolicy reversePolicy) {
		this.reversePolicy = reversePolicy;
	}

	/**
	 * Gets the notifySwitches value for this VmwareUplinkPortTeamingPolicy.
	 * 
	 * @return notifySwitches
	 */
	public com.vmware.vim25.BoolPolicy getNotifySwitches() {
		return notifySwitches;
	}

	/**
	 * Sets the notifySwitches value for this VmwareUplinkPortTeamingPolicy.
	 * 
	 * @param notifySwitches
	 */
	public void setNotifySwitches(com.vmware.vim25.BoolPolicy notifySwitches) {
		this.notifySwitches = notifySwitches;
	}

	/**
	 * Gets the rollingOrder value for this VmwareUplinkPortTeamingPolicy.
	 * 
	 * @return rollingOrder
	 */
	public com.vmware.vim25.BoolPolicy getRollingOrder() {
		return rollingOrder;
	}

	/**
	 * Sets the rollingOrder value for this VmwareUplinkPortTeamingPolicy.
	 * 
	 * @param rollingOrder
	 */
	public void setRollingOrder(com.vmware.vim25.BoolPolicy rollingOrder) {
		this.rollingOrder = rollingOrder;
	}

	/**
	 * Gets the failureCriteria value for this VmwareUplinkPortTeamingPolicy.
	 * 
	 * @return failureCriteria
	 */
	public com.vmware.vim25.DVSFailureCriteria getFailureCriteria() {
		return failureCriteria;
	}

	/**
	 * Sets the failureCriteria value for this VmwareUplinkPortTeamingPolicy.
	 * 
	 * @param failureCriteria
	 */
	public void setFailureCriteria(
			com.vmware.vim25.DVSFailureCriteria failureCriteria) {
		this.failureCriteria = failureCriteria;
	}

	/**
	 * Gets the uplinkPortOrder value for this VmwareUplinkPortTeamingPolicy.
	 * 
	 * @return uplinkPortOrder
	 */
	public com.vmware.vim25.VMwareUplinkPortOrderPolicy getUplinkPortOrder() {
		return uplinkPortOrder;
	}

	/**
	 * Sets the uplinkPortOrder value for this VmwareUplinkPortTeamingPolicy.
	 * 
	 * @param uplinkPortOrder
	 */
	public void setUplinkPortOrder(
			com.vmware.vim25.VMwareUplinkPortOrderPolicy uplinkPortOrder) {
		this.uplinkPortOrder = uplinkPortOrder;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof VmwareUplinkPortTeamingPolicy)) {
			return false;
		}
		VmwareUplinkPortTeamingPolicy other = (VmwareUplinkPortTeamingPolicy) obj;
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
				&& ((this.policy == null && other.getPolicy() == null) || (this.policy != null && this.policy
						.equals(other.getPolicy())))
				&& ((this.reversePolicy == null && other.getReversePolicy() == null) || (this.reversePolicy != null && this.reversePolicy
						.equals(other.getReversePolicy())))
				&& ((this.notifySwitches == null && other.getNotifySwitches() == null) || (this.notifySwitches != null && this.notifySwitches
						.equals(other.getNotifySwitches())))
				&& ((this.rollingOrder == null && other.getRollingOrder() == null) || (this.rollingOrder != null && this.rollingOrder
						.equals(other.getRollingOrder())))
				&& ((this.failureCriteria == null && other.getFailureCriteria() == null) || (this.failureCriteria != null && this.failureCriteria
						.equals(other.getFailureCriteria())))
				&& ((this.uplinkPortOrder == null && other.getUplinkPortOrder() == null) || (this.uplinkPortOrder != null && this.uplinkPortOrder
						.equals(other.getUplinkPortOrder())));
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
		if (getPolicy() != null) {
			_hashCode += getPolicy().hashCode();
		}
		if (getReversePolicy() != null) {
			_hashCode += getReversePolicy().hashCode();
		}
		if (getNotifySwitches() != null) {
			_hashCode += getNotifySwitches().hashCode();
		}
		if (getRollingOrder() != null) {
			_hashCode += getRollingOrder().hashCode();
		}
		if (getFailureCriteria() != null) {
			_hashCode += getFailureCriteria().hashCode();
		}
		if (getUplinkPortOrder() != null) {
			_hashCode += getUplinkPortOrder().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			VmwareUplinkPortTeamingPolicy.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VmwareUplinkPortTeamingPolicy"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("policy");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"policy"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"StringPolicy"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("reversePolicy");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"reversePolicy"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"BoolPolicy"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("notifySwitches");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"notifySwitches"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"BoolPolicy"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("rollingOrder");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"rollingOrder"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"BoolPolicy"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("failureCriteria");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"failureCriteria"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"DVSFailureCriteria"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("uplinkPortOrder");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"uplinkPortOrder"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VMwareUplinkPortOrderPolicy"));
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
