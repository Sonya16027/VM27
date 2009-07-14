/**
 * VirtualMachineQuickStats.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VirtualMachineQuickStats extends com.vmware.vim25.DynamicData
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.Integer overallCpuUsage;

	private java.lang.Integer overallCpuDemand;

	private java.lang.Integer guestMemoryUsage;

	private java.lang.Integer hostMemoryUsage;

	private com.vmware.vim25.ManagedEntityStatus guestHeartbeatStatus;

	private java.lang.Integer distributedCpuEntitlement;

	private java.lang.Integer distributedMemoryEntitlement;

	private java.lang.Integer staticCpuEntitlement;

	private java.lang.Integer staticMemoryEntitlement;

	private java.lang.Integer privateMemory;

	private java.lang.Integer sharedMemory;

	private java.lang.Integer swappedMemory;

	private java.lang.Integer balloonedMemory;

	private java.lang.Integer consumedOverheadMemory;

	private java.lang.Integer ftLogBandwidth;

	private java.lang.Integer ftSecondaryLatency;

	private com.vmware.vim25.ManagedEntityStatus ftLatencyStatus;

	public VirtualMachineQuickStats() {
	}

	public VirtualMachineQuickStats(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.Integer overallCpuUsage,
			java.lang.Integer overallCpuDemand,
			java.lang.Integer guestMemoryUsage,
			java.lang.Integer hostMemoryUsage,
			com.vmware.vim25.ManagedEntityStatus guestHeartbeatStatus,
			java.lang.Integer distributedCpuEntitlement,
			java.lang.Integer distributedMemoryEntitlement,
			java.lang.Integer staticCpuEntitlement,
			java.lang.Integer staticMemoryEntitlement,
			java.lang.Integer privateMemory, java.lang.Integer sharedMemory,
			java.lang.Integer swappedMemory, java.lang.Integer balloonedMemory,
			java.lang.Integer consumedOverheadMemory,
			java.lang.Integer ftLogBandwidth,
			java.lang.Integer ftSecondaryLatency,
			com.vmware.vim25.ManagedEntityStatus ftLatencyStatus) {
		super(dynamicType, dynamicProperty);
		this.overallCpuUsage = overallCpuUsage;
		this.overallCpuDemand = overallCpuDemand;
		this.guestMemoryUsage = guestMemoryUsage;
		this.hostMemoryUsage = hostMemoryUsage;
		this.guestHeartbeatStatus = guestHeartbeatStatus;
		this.distributedCpuEntitlement = distributedCpuEntitlement;
		this.distributedMemoryEntitlement = distributedMemoryEntitlement;
		this.staticCpuEntitlement = staticCpuEntitlement;
		this.staticMemoryEntitlement = staticMemoryEntitlement;
		this.privateMemory = privateMemory;
		this.sharedMemory = sharedMemory;
		this.swappedMemory = swappedMemory;
		this.balloonedMemory = balloonedMemory;
		this.consumedOverheadMemory = consumedOverheadMemory;
		this.ftLogBandwidth = ftLogBandwidth;
		this.ftSecondaryLatency = ftSecondaryLatency;
		this.ftLatencyStatus = ftLatencyStatus;
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
	 * Gets the overallCpuDemand value for this VirtualMachineQuickStats.
	 * 
	 * @return overallCpuDemand
	 */
	public java.lang.Integer getOverallCpuDemand() {
		return overallCpuDemand;
	}

	/**
	 * Sets the overallCpuDemand value for this VirtualMachineQuickStats.
	 * 
	 * @param overallCpuDemand
	 */
	public void setOverallCpuDemand(java.lang.Integer overallCpuDemand) {
		this.overallCpuDemand = overallCpuDemand;
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
	public com.vmware.vim25.ManagedEntityStatus getGuestHeartbeatStatus() {
		return guestHeartbeatStatus;
	}

	/**
	 * Sets the guestHeartbeatStatus value for this VirtualMachineQuickStats.
	 * 
	 * @param guestHeartbeatStatus
	 */
	public void setGuestHeartbeatStatus(
			com.vmware.vim25.ManagedEntityStatus guestHeartbeatStatus) {
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

	/**
	 * Gets the staticCpuEntitlement value for this VirtualMachineQuickStats.
	 * 
	 * @return staticCpuEntitlement
	 */
	public java.lang.Integer getStaticCpuEntitlement() {
		return staticCpuEntitlement;
	}

	/**
	 * Sets the staticCpuEntitlement value for this VirtualMachineQuickStats.
	 * 
	 * @param staticCpuEntitlement
	 */
	public void setStaticCpuEntitlement(java.lang.Integer staticCpuEntitlement) {
		this.staticCpuEntitlement = staticCpuEntitlement;
	}

	/**
	 * Gets the staticMemoryEntitlement value for this VirtualMachineQuickStats.
	 * 
	 * @return staticMemoryEntitlement
	 */
	public java.lang.Integer getStaticMemoryEntitlement() {
		return staticMemoryEntitlement;
	}

	/**
	 * Sets the staticMemoryEntitlement value for this VirtualMachineQuickStats.
	 * 
	 * @param staticMemoryEntitlement
	 */
	public void setStaticMemoryEntitlement(
			java.lang.Integer staticMemoryEntitlement) {
		this.staticMemoryEntitlement = staticMemoryEntitlement;
	}

	/**
	 * Gets the privateMemory value for this VirtualMachineQuickStats.
	 * 
	 * @return privateMemory
	 */
	public java.lang.Integer getPrivateMemory() {
		return privateMemory;
	}

	/**
	 * Sets the privateMemory value for this VirtualMachineQuickStats.
	 * 
	 * @param privateMemory
	 */
	public void setPrivateMemory(java.lang.Integer privateMemory) {
		this.privateMemory = privateMemory;
	}

	/**
	 * Gets the sharedMemory value for this VirtualMachineQuickStats.
	 * 
	 * @return sharedMemory
	 */
	public java.lang.Integer getSharedMemory() {
		return sharedMemory;
	}

	/**
	 * Sets the sharedMemory value for this VirtualMachineQuickStats.
	 * 
	 * @param sharedMemory
	 */
	public void setSharedMemory(java.lang.Integer sharedMemory) {
		this.sharedMemory = sharedMemory;
	}

	/**
	 * Gets the swappedMemory value for this VirtualMachineQuickStats.
	 * 
	 * @return swappedMemory
	 */
	public java.lang.Integer getSwappedMemory() {
		return swappedMemory;
	}

	/**
	 * Sets the swappedMemory value for this VirtualMachineQuickStats.
	 * 
	 * @param swappedMemory
	 */
	public void setSwappedMemory(java.lang.Integer swappedMemory) {
		this.swappedMemory = swappedMemory;
	}

	/**
	 * Gets the balloonedMemory value for this VirtualMachineQuickStats.
	 * 
	 * @return balloonedMemory
	 */
	public java.lang.Integer getBalloonedMemory() {
		return balloonedMemory;
	}

	/**
	 * Sets the balloonedMemory value for this VirtualMachineQuickStats.
	 * 
	 * @param balloonedMemory
	 */
	public void setBalloonedMemory(java.lang.Integer balloonedMemory) {
		this.balloonedMemory = balloonedMemory;
	}

	/**
	 * Gets the consumedOverheadMemory value for this VirtualMachineQuickStats.
	 * 
	 * @return consumedOverheadMemory
	 */
	public java.lang.Integer getConsumedOverheadMemory() {
		return consumedOverheadMemory;
	}

	/**
	 * Sets the consumedOverheadMemory value for this VirtualMachineQuickStats.
	 * 
	 * @param consumedOverheadMemory
	 */
	public void setConsumedOverheadMemory(
			java.lang.Integer consumedOverheadMemory) {
		this.consumedOverheadMemory = consumedOverheadMemory;
	}

	/**
	 * Gets the ftLogBandwidth value for this VirtualMachineQuickStats.
	 * 
	 * @return ftLogBandwidth
	 */
	public java.lang.Integer getFtLogBandwidth() {
		return ftLogBandwidth;
	}

	/**
	 * Sets the ftLogBandwidth value for this VirtualMachineQuickStats.
	 * 
	 * @param ftLogBandwidth
	 */
	public void setFtLogBandwidth(java.lang.Integer ftLogBandwidth) {
		this.ftLogBandwidth = ftLogBandwidth;
	}

	/**
	 * Gets the ftSecondaryLatency value for this VirtualMachineQuickStats.
	 * 
	 * @return ftSecondaryLatency
	 */
	public java.lang.Integer getFtSecondaryLatency() {
		return ftSecondaryLatency;
	}

	/**
	 * Sets the ftSecondaryLatency value for this VirtualMachineQuickStats.
	 * 
	 * @param ftSecondaryLatency
	 */
	public void setFtSecondaryLatency(java.lang.Integer ftSecondaryLatency) {
		this.ftSecondaryLatency = ftSecondaryLatency;
	}

	/**
	 * Gets the ftLatencyStatus value for this VirtualMachineQuickStats.
	 * 
	 * @return ftLatencyStatus
	 */
	public com.vmware.vim25.ManagedEntityStatus getFtLatencyStatus() {
		return ftLatencyStatus;
	}

	/**
	 * Sets the ftLatencyStatus value for this VirtualMachineQuickStats.
	 * 
	 * @param ftLatencyStatus
	 */
	public void setFtLatencyStatus(
			com.vmware.vim25.ManagedEntityStatus ftLatencyStatus) {
		this.ftLatencyStatus = ftLatencyStatus;
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
				&& ((this.overallCpuDemand == null && other
						.getOverallCpuDemand() == null) || (this.overallCpuDemand != null && this.overallCpuDemand
						.equals(other.getOverallCpuDemand())))
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
						.equals(other.getDistributedMemoryEntitlement())))
				&& ((this.staticCpuEntitlement == null && other
						.getStaticCpuEntitlement() == null) || (this.staticCpuEntitlement != null && this.staticCpuEntitlement
						.equals(other.getStaticCpuEntitlement())))
				&& ((this.staticMemoryEntitlement == null && other
						.getStaticMemoryEntitlement() == null) || (this.staticMemoryEntitlement != null && this.staticMemoryEntitlement
						.equals(other.getStaticMemoryEntitlement())))
				&& ((this.privateMemory == null && other.getPrivateMemory() == null) || (this.privateMemory != null && this.privateMemory
						.equals(other.getPrivateMemory())))
				&& ((this.sharedMemory == null && other.getSharedMemory() == null) || (this.sharedMemory != null && this.sharedMemory
						.equals(other.getSharedMemory())))
				&& ((this.swappedMemory == null && other.getSwappedMemory() == null) || (this.swappedMemory != null && this.swappedMemory
						.equals(other.getSwappedMemory())))
				&& ((this.balloonedMemory == null && other.getBalloonedMemory() == null) || (this.balloonedMemory != null && this.balloonedMemory
						.equals(other.getBalloonedMemory())))
				&& ((this.consumedOverheadMemory == null && other
						.getConsumedOverheadMemory() == null) || (this.consumedOverheadMemory != null && this.consumedOverheadMemory
						.equals(other.getConsumedOverheadMemory())))
				&& ((this.ftLogBandwidth == null && other.getFtLogBandwidth() == null) || (this.ftLogBandwidth != null && this.ftLogBandwidth
						.equals(other.getFtLogBandwidth())))
				&& ((this.ftSecondaryLatency == null && other
						.getFtSecondaryLatency() == null) || (this.ftSecondaryLatency != null && this.ftSecondaryLatency
						.equals(other.getFtSecondaryLatency())))
				&& ((this.ftLatencyStatus == null && other.getFtLatencyStatus() == null) || (this.ftLatencyStatus != null && this.ftLatencyStatus
						.equals(other.getFtLatencyStatus())));
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
		if (getOverallCpuDemand() != null) {
			_hashCode += getOverallCpuDemand().hashCode();
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
		if (getStaticCpuEntitlement() != null) {
			_hashCode += getStaticCpuEntitlement().hashCode();
		}
		if (getStaticMemoryEntitlement() != null) {
			_hashCode += getStaticMemoryEntitlement().hashCode();
		}
		if (getPrivateMemory() != null) {
			_hashCode += getPrivateMemory().hashCode();
		}
		if (getSharedMemory() != null) {
			_hashCode += getSharedMemory().hashCode();
		}
		if (getSwappedMemory() != null) {
			_hashCode += getSwappedMemory().hashCode();
		}
		if (getBalloonedMemory() != null) {
			_hashCode += getBalloonedMemory().hashCode();
		}
		if (getConsumedOverheadMemory() != null) {
			_hashCode += getConsumedOverheadMemory().hashCode();
		}
		if (getFtLogBandwidth() != null) {
			_hashCode += getFtLogBandwidth().hashCode();
		}
		if (getFtSecondaryLatency() != null) {
			_hashCode += getFtSecondaryLatency().hashCode();
		}
		if (getFtLatencyStatus() != null) {
			_hashCode += getFtLatencyStatus().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			VirtualMachineQuickStats.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VirtualMachineQuickStats"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("overallCpuUsage");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"overallCpuUsage"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("overallCpuDemand");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"overallCpuDemand"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("guestMemoryUsage");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"guestMemoryUsage"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("hostMemoryUsage");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"hostMemoryUsage"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("guestHeartbeatStatus");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"guestHeartbeatStatus"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedEntityStatus"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("distributedCpuEntitlement");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"distributedCpuEntitlement"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("distributedMemoryEntitlement");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"distributedMemoryEntitlement"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("staticCpuEntitlement");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"staticCpuEntitlement"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("staticMemoryEntitlement");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"staticMemoryEntitlement"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("privateMemory");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"privateMemory"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("sharedMemory");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"sharedMemory"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("swappedMemory");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"swappedMemory"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("balloonedMemory");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"balloonedMemory"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("consumedOverheadMemory");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"consumedOverheadMemory"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("ftLogBandwidth");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"ftLogBandwidth"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("ftSecondaryLatency");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"ftSecondaryLatency"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("ftLatencyStatus");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"ftLatencyStatus"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedEntityStatus"));
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
