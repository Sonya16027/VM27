/**
 * VirtualMachineQuickStats.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class VirtualMachineQuickStats extends com.vmware.vim.DynamicData
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.Integer overallCpuUsage;

	private java.lang.Integer guestMemoryUsage;

	private java.lang.Integer hostMemoryUsage;

	private com.vmware.vim.ManagedEntityStatus guestHeartbeatStatus;

	private java.lang.Integer distributedCpuEntitlement;

	private java.lang.Integer distributedMemoryEntitlement;

	public VirtualMachineQuickStats() {
	}

	public VirtualMachineQuickStats(java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty,
			java.lang.Integer overallCpuUsage,
			java.lang.Integer guestMemoryUsage,
			java.lang.Integer hostMemoryUsage,
			com.vmware.vim.ManagedEntityStatus guestHeartbeatStatus,
			java.lang.Integer distributedCpuEntitlement,
			java.lang.Integer distributedMemoryEntitlement) {
		super(dynamicType, dynamicProperty);
		this.overallCpuUsage = overallCpuUsage;
		this.guestMemoryUsage = guestMemoryUsage;
		this.hostMemoryUsage = hostMemoryUsage;
		this.guestHeartbeatStatus = guestHeartbeatStatus;
		this.distributedCpuEntitlement = distributedCpuEntitlement;
		this.distributedMemoryEntitlement = distributedMemoryEntitlement;
	}

	/**
	 * Gets the overallCpuUsage value for this VirtualMachineQuickStats.
	 * 
	 * @return overallCpuUsage
	 */
	public java.lang.Integer getOverallCpuUsage() {
		return overallCpuUsage;
	}

	/**
	 * Sets the overallCpuUsage value for this VirtualMachineQuickStats.
	 * 
	 * @param overallCpuUsage
	 */
	public void setOverallCpuUsage(java.lang.Integer overallCpuUsage) {
		this.overallCpuUsage = overallCpuUsage;
	}

	/**
	 * Gets the guestMemoryUsage value for this VirtualMachineQuickStats.
	 * 
	 * @return guestMemoryUsage
	 */
	public java.lang.Integer getGuestMemoryUsage() {
		return guestMemoryUsage;
	}

	/**
	 * Sets the guestMemoryUsage value for this VirtualMachineQuickStats.
	 * 
	 * @param guestMemoryUsage
	 */
	public void setGuestMemoryUsage(java.lang.Integer guestMemoryUsage) {
		this.guestMemoryUsage = guestMemoryUsage;
	}

	/**
	 * Gets the hostMemoryUsage value for this VirtualMachineQuickStats.
	 * 
	 * @return hostMemoryUsage
	 */
	public java.lang.Integer getHostMemoryUsage() {
		return hostMemoryUsage;
	}

	/**
	 * Sets the hostMemoryUsage value for this VirtualMachineQuickStats.
	 * 
	 * @param hostMemoryUsage
	 */
	public void setHostMemoryUsage(java.lang.Integer hostMemoryUsage) {
		this.hostMemoryUsage = hostMemoryUsage;
	}

	/**
	 * Gets the guestHeartbeatStatus value for this VirtualMachineQuickStats.
	 * 
	 * @return guestHeartbeatStatus
	 */
	public com.vmware.vim.ManagedEntityStatus getGuestHeartbeatStatus() {
		return guestHeartbeatStatus;
	}

	/**
	 * Sets the guestHeartbeatStatus value for this VirtualMachineQuickStats.
	 * 
	 * @param guestHeartbeatStatus
	 */
	public void setGuestHeartbeatStatus(
			com.vmware.vim.ManagedEntityStatus guestHeartbeatStatus) {
		this.guestHeartbeatStatus = guestHeartbeatStatus;
	}

	/**
	 * Gets the distributedCpuEntitlement value for this
	 * VirtualMachineQuickStats.
	 * 
	 * @return distributedCpuEntitlement
	 */
	public java.lang.Integer getDistributedCpuEntitlement() {
		return distributedCpuEntitlement;
	}

	/**
	 * Sets the distributedCpuEntitlement value for this
	 * VirtualMachineQuickStats.
	 * 
	 * @param distributedCpuEntitlement
	 */
	public void setDistributedCpuEntitlement(
			java.lang.Integer distributedCpuEntitlement) {
		this.distributedCpuEntitlement = distributedCpuEntitlement;
	}

	/**
	 * Gets the distributedMemoryEntitlement value for this
	 * VirtualMachineQuickStats.
	 * 
	 * @return distributedMemoryEntitlement
	 */
	public java.lang.Integer getDistributedMemoryEntitlement() {
		return distributedMemoryEntitlement;
	}

	/**
	 * Sets the distributedMemoryEntitlement value for this
	 * VirtualMachineQuickStats.
	 * 
	 * @param distributedMemoryEntitlement
	 */
	public void setDistributedMemoryEntitlement(
			java.lang.Integer distributedMemoryEntitlement) {
		this.distributedMemoryEntitlement = distributedMemoryEntitlement;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof VirtualMachineQuickStats)) {
			return false;
		}
		VirtualMachineQuickStats other = (VirtualMachineQuickStats) obj;
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
				&& ((this.overallCpuUsage == null && other.getOverallCpuUsage() == null) || (this.overallCpuUsage != null && this.overallCpuUsage
						.equals(other.getOverallCpuUsage())))
				&& ((this.guestMemoryUsage == null && other
						.getGuestMemoryUsage() == null) || (this.guestMemoryUsage != null && this.guestMemoryUsage
						.equals(other.getGuestMemoryUsage())))
				&& ((this.hostMemoryUsage == null && other.getHostMemoryUsage() == null) || (this.hostMemoryUsage != null && this.hostMemoryUsage
						.equals(other.getHostMemoryUsage())))
				&& ((this.guestHeartbeatStatus == null && other
						.getGuestHeartbeatStatus() == null) || (this.guestHeartbeatStatus != null && this.guestHeartbeatStatus
						.equals(other.getGuestHeartbeatStatus())))
				&& ((this.distributedCpuEntitlement == null && other
						.getDistributedCpuEntitlement() == null) || (this.distributedCpuEntitlement != null && this.distributedCpuEntitlement
						.equals(other.getDistributedCpuEntitlement())))
				&& ((this.distributedMemoryEntitlement == null && other
						.getDistributedMemoryEntitlement() == null) || (this.distributedMemoryEntitlement != null && this.distributedMemoryEntitlement
						.equals(other.getDistributedMemoryEntitlement())));
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
		if (getOverallCpuUsage() != null) {
			_hashCode += getOverallCpuUsage().hashCode();
		}
		if (getGuestMemoryUsage() != null) {
			_hashCode += getGuestMemoryUsage().hashCode();
		}
		if (getHostMemoryUsage() != null) {
			_hashCode += getHostMemoryUsage().hashCode();
		}
		if (getGuestHeartbeatStatus() != null) {
			_hashCode += getGuestHeartbeatStatus().hashCode();
		}
		if (getDistributedCpuEntitlement() != null) {
			_hashCode += getDistributedCpuEntitlement().hashCode();
		}
		if (getDistributedMemoryEntitlement() != null) {
			_hashCode += getDistributedMemoryEntitlement().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			VirtualMachineQuickStats.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"VirtualMachineQuickStats"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("overallCpuUsage");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"overallCpuUsage"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("guestMemoryUsage");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"guestMemoryUsage"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("hostMemoryUsage");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"hostMemoryUsage"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("guestHeartbeatStatus");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"guestHeartbeatStatus"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ManagedEntityStatus"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("distributedCpuEntitlement");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"distributedCpuEntitlement"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("distributedMemoryEntitlement");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"distributedMemoryEntitlement"));
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
