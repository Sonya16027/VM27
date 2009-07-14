/**
 * VirtualMachineRuntimeInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VirtualMachineRuntimeInfo extends com.vmware.vim25.DynamicData
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.ManagedObjectReference host;

	private com.vmware.vim25.VirtualMachineConnectionState connectionState;

	private com.vmware.vim25.VirtualMachinePowerState powerState;

	private com.vmware.vim25.VirtualMachineFaultToleranceState faultToleranceState;

	private boolean toolsInstallerMounted;

	private java.util.Calendar suspendTime;

	private java.util.Calendar bootTime;

	private java.lang.Long suspendInterval;

	private com.vmware.vim25.VirtualMachineQuestionInfo question;

	private java.lang.Long memoryOverhead;

	private java.lang.Integer maxCpuUsage;

	private java.lang.Integer maxMemoryUsage;

	private int numMksConnections;

	private com.vmware.vim25.VirtualMachineRecordReplayState recordReplayState;

	private java.lang.Boolean cleanPowerOff;

	private java.lang.String needSecondaryReason;

	public VirtualMachineRuntimeInfo() {
	}

	public VirtualMachineRuntimeInfo(
			java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			com.vmware.vim25.ManagedObjectReference host,
			com.vmware.vim25.VirtualMachineConnectionState connectionState,
			com.vmware.vim25.VirtualMachinePowerState powerState,
			com.vmware.vim25.VirtualMachineFaultToleranceState faultToleranceState,
			boolean toolsInstallerMounted, java.util.Calendar suspendTime,
			java.util.Calendar bootTime, java.lang.Long suspendInterval,
			com.vmware.vim25.VirtualMachineQuestionInfo question,
			java.lang.Long memoryOverhead, java.lang.Integer maxCpuUsage,
			java.lang.Integer maxMemoryUsage, int numMksConnections,
			com.vmware.vim25.VirtualMachineRecordReplayState recordReplayState,
			java.lang.Boolean cleanPowerOff,
			java.lang.String needSecondaryReason) {
		super(dynamicType, dynamicProperty);
		this.host = host;
		this.connectionState = connectionState;
		this.powerState = powerState;
		this.faultToleranceState = faultToleranceState;
		this.toolsInstallerMounted = toolsInstallerMounted;
		this.suspendTime = suspendTime;
		this.bootTime = bootTime;
		this.suspendInterval = suspendInterval;
		this.question = question;
		this.memoryOverhead = memoryOverhead;
		this.maxCpuUsage = maxCpuUsage;
		this.maxMemoryUsage = maxMemoryUsage;
		this.numMksConnections = numMksConnections;
		this.recordReplayState = recordReplayState;
		this.cleanPowerOff = cleanPowerOff;
		this.needSecondaryReason = needSecondaryReason;
	}

	/**
	 * Gets the host value for this VirtualMachineRuntimeInfo.
	 * 
	 * @return host
	 */
	public com.vmware.vim25.ManagedObjectReference getHost() {
		return host;
	}

	/**
	 * Sets the host value for this VirtualMachineRuntimeInfo.
	 * 
	 * @param host
	 */
	public void setHost(com.vmware.vim25.ManagedObjectReference host) {
		this.host = host;
	}

	/**
	 * Gets the connectionState value for this VirtualMachineRuntimeInfo.
	 * 
	 * @return connectionState
	 */
	public com.vmware.vim25.VirtualMachineConnectionState getConnectionState() {
		return connectionState;
	}

	/**
	 * Sets the connectionState value for this VirtualMachineRuntimeInfo.
	 * 
	 * @param connectionState
	 */
	public void setConnectionState(
			com.vmware.vim25.VirtualMachineConnectionState connectionState) {
		this.connectionState = connectionState;
	}

	/**
	 * Gets the powerState value for this VirtualMachineRuntimeInfo.
	 * 
	 * @return powerState
	 */
	public com.vmware.vim25.VirtualMachinePowerState getPowerState() {
		return powerState;
	}

	/**
	 * Sets the powerState value for this VirtualMachineRuntimeInfo.
	 * 
	 * @param powerState
	 */
	public void setPowerState(
			com.vmware.vim25.VirtualMachinePowerState powerState) {
		this.powerState = powerState;
	}

	/**
	 * Gets the faultToleranceState value for this VirtualMachineRuntimeInfo.
	 * 
	 * @return faultToleranceState
	 */
	public com.vmware.vim25.VirtualMachineFaultToleranceState getFaultToleranceState() {
		return faultToleranceState;
	}

	/**
	 * Sets the faultToleranceState value for this VirtualMachineRuntimeInfo.
	 * 
	 * @param faultToleranceState
	 */
	public void setFaultToleranceState(
			com.vmware.vim25.VirtualMachineFaultToleranceState faultToleranceState) {
		this.faultToleranceState = faultToleranceState;
	}

	/**
	 * Gets the toolsInstallerMounted value for this VirtualMachineRuntimeInfo.
	 * 
	 * @return toolsInstallerMounted
	 */
	public boolean isToolsInstallerMounted() {
		return toolsInstallerMounted;
	}

	/**
	 * Sets the toolsInstallerMounted value for this VirtualMachineRuntimeInfo.
	 * 
	 * @param toolsInstallerMounted
	 */
	public void setToolsInstallerMounted(boolean toolsInstallerMounted) {
		this.toolsInstallerMounted = toolsInstallerMounted;
	}

	/**
	 * Gets the suspendTime value for this VirtualMachineRuntimeInfo.
	 * 
	 * @return suspendTime
	 */
	public java.util.Calendar getSuspendTime() {
		return suspendTime;
	}

	/**
	 * Sets the suspendTime value for this VirtualMachineRuntimeInfo.
	 * 
	 * @param suspendTime
	 */
	public void setSuspendTime(java.util.Calendar suspendTime) {
		this.suspendTime = suspendTime;
	}

	/**
	 * Gets the bootTime value for this VirtualMachineRuntimeInfo.
	 * 
	 * @return bootTime
	 */
	public java.util.Calendar getBootTime() {
		return bootTime;
	}

	/**
	 * Sets the bootTime value for this VirtualMachineRuntimeInfo.
	 * 
	 * @param bootTime
	 */
	public void setBootTime(java.util.Calendar bootTime) {
		this.bootTime = bootTime;
	}

	/**
	 * Gets the suspendInterval value for this VirtualMachineRuntimeInfo.
	 * 
	 * @return suspendInterval
	 */
	public java.lang.Long getSuspendInterval() {
		return suspendInterval;
	}

	/**
	 * Sets the suspendInterval value for this VirtualMachineRuntimeInfo.
	 * 
	 * @param suspendInterval
	 */
	public void setSuspendInterval(java.lang.Long suspendInterval) {
		this.suspendInterval = suspendInterval;
	}

	/**
	 * Gets the question value for this VirtualMachineRuntimeInfo.
	 * 
	 * @return question
	 */
	public com.vmware.vim25.VirtualMachineQuestionInfo getQuestion() {
		return question;
	}

	/**
	 * Sets the question value for this VirtualMachineRuntimeInfo.
	 * 
	 * @param question
	 */
	public void setQuestion(com.vmware.vim25.VirtualMachineQuestionInfo question) {
		this.question = question;
	}

	/**
	 * Gets the memoryOverhead value for this VirtualMachineRuntimeInfo.
	 * 
	 * @return memoryOverhead
	 */
	public java.lang.Long getMemoryOverhead() {
		return memoryOverhead;
	}

	/**
	 * Sets the memoryOverhead value for this VirtualMachineRuntimeInfo.
	 * 
	 * @param memoryOverhead
	 */
	public void setMemoryOverhead(java.lang.Long memoryOverhead) {
		this.memoryOverhead = memoryOverhead;
	}

	/**
	 * Gets the maxCpuUsage value for this VirtualMachineRuntimeInfo.
	 * 
	 * @return maxCpuUsage
	 */
	public java.lang.Integer getMaxCpuUsage() {
		return maxCpuUsage;
	}

	/**
	 * Sets the maxCpuUsage value for this VirtualMachineRuntimeInfo.
	 * 
	 * @param maxCpuUsage
	 */
	public void setMaxCpuUsage(java.lang.Integer maxCpuUsage) {
		this.maxCpuUsage = maxCpuUsage;
	}

	/**
	 * Gets the maxMemoryUsage value for this VirtualMachineRuntimeInfo.
	 * 
	 * @return maxMemoryUsage
	 */
	public java.lang.Integer getMaxMemoryUsage() {
		return maxMemoryUsage;
	}

	/**
	 * Sets the maxMemoryUsage value for this VirtualMachineRuntimeInfo.
	 * 
	 * @param maxMemoryUsage
	 */
	public void setMaxMemoryUsage(java.lang.Integer maxMemoryUsage) {
		this.maxMemoryUsage = maxMemoryUsage;
	}

	/**
	 * Gets the numMksConnections value for this VirtualMachineRuntimeInfo.
	 * 
	 * @return numMksConnections
	 */
	public int getNumMksConnections() {
		return numMksConnections;
	}

	/**
	 * Sets the numMksConnections value for this VirtualMachineRuntimeInfo.
	 * 
	 * @param numMksConnections
	 */
	public void setNumMksConnections(int numMksConnections) {
		this.numMksConnections = numMksConnections;
	}

	/**
	 * Gets the recordReplayState value for this VirtualMachineRuntimeInfo.
	 * 
	 * @return recordReplayState
	 */
	public com.vmware.vim25.VirtualMachineRecordReplayState getRecordReplayState() {
		return recordReplayState;
	}

	/**
	 * Sets the recordReplayState value for this VirtualMachineRuntimeInfo.
	 * 
	 * @param recordReplayState
	 */
	public void setRecordReplayState(
			com.vmware.vim25.VirtualMachineRecordReplayState recordReplayState) {
		this.recordReplayState = recordReplayState;
	}

	/**
	 * Gets the cleanPowerOff value for this VirtualMachineRuntimeInfo.
	 * 
	 * @return cleanPowerOff
	 */
	public java.lang.Boolean getCleanPowerOff() {
		return cleanPowerOff;
	}

	/**
	 * Sets the cleanPowerOff value for this VirtualMachineRuntimeInfo.
	 * 
	 * @param cleanPowerOff
	 */
	public void setCleanPowerOff(java.lang.Boolean cleanPowerOff) {
		this.cleanPowerOff = cleanPowerOff;
	}

	/**
	 * Gets the needSecondaryReason value for this VirtualMachineRuntimeInfo.
	 * 
	 * @return needSecondaryReason
	 */
	public java.lang.String getNeedSecondaryReason() {
		return needSecondaryReason;
	}

	/**
	 * Sets the needSecondaryReason value for this VirtualMachineRuntimeInfo.
	 * 
	 * @param needSecondaryReason
	 */
	public void setNeedSecondaryReason(java.lang.String needSecondaryReason) {
		this.needSecondaryReason = needSecondaryReason;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof VirtualMachineRuntimeInfo)) {
			return false;
		}
		VirtualMachineRuntimeInfo other = (VirtualMachineRuntimeInfo) obj;
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
				&& ((this.host == null && other.getHost() == null) || (this.host != null && this.host
						.equals(other.getHost())))
				&& ((this.connectionState == null && other.getConnectionState() == null) || (this.connectionState != null && this.connectionState
						.equals(other.getConnectionState())))
				&& ((this.powerState == null && other.getPowerState() == null) || (this.powerState != null && this.powerState
						.equals(other.getPowerState())))
				&& ((this.faultToleranceState == null && other
						.getFaultToleranceState() == null) || (this.faultToleranceState != null && this.faultToleranceState
						.equals(other.getFaultToleranceState())))
				&& this.toolsInstallerMounted == other
						.isToolsInstallerMounted()
				&& ((this.suspendTime == null && other.getSuspendTime() == null) || (this.suspendTime != null && this.suspendTime
						.equals(other.getSuspendTime())))
				&& ((this.bootTime == null && other.getBootTime() == null) || (this.bootTime != null && this.bootTime
						.equals(other.getBootTime())))
				&& ((this.suspendInterval == null && other.getSuspendInterval() == null) || (this.suspendInterval != null && this.suspendInterval
						.equals(other.getSuspendInterval())))
				&& ((this.question == null && other.getQuestion() == null) || (this.question != null && this.question
						.equals(other.getQuestion())))
				&& ((this.memoryOverhead == null && other.getMemoryOverhead() == null) || (this.memoryOverhead != null && this.memoryOverhead
						.equals(other.getMemoryOverhead())))
				&& ((this.maxCpuUsage == null && other.getMaxCpuUsage() == null) || (this.maxCpuUsage != null && this.maxCpuUsage
						.equals(other.getMaxCpuUsage())))
				&& ((this.maxMemoryUsage == null && other.getMaxMemoryUsage() == null) || (this.maxMemoryUsage != null && this.maxMemoryUsage
						.equals(other.getMaxMemoryUsage())))
				&& this.numMksConnections == other.getNumMksConnections()
				&& ((this.recordReplayState == null && other
						.getRecordReplayState() == null) || (this.recordReplayState != null && this.recordReplayState
						.equals(other.getRecordReplayState())))
				&& ((this.cleanPowerOff == null && other.getCleanPowerOff() == null) || (this.cleanPowerOff != null && this.cleanPowerOff
						.equals(other.getCleanPowerOff())))
				&& ((this.needSecondaryReason == null && other
						.getNeedSecondaryReason() == null) || (this.needSecondaryReason != null && this.needSecondaryReason
						.equals(other.getNeedSecondaryReason())));
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
		if (getHost() != null) {
			_hashCode += getHost().hashCode();
		}
		if (getConnectionState() != null) {
			_hashCode += getConnectionState().hashCode();
		}
		if (getPowerState() != null) {
			_hashCode += getPowerState().hashCode();
		}
		if (getFaultToleranceState() != null) {
			_hashCode += getFaultToleranceState().hashCode();
		}
		_hashCode += (isToolsInstallerMounted() ? Boolean.TRUE : Boolean.FALSE)
				.hashCode();
		if (getSuspendTime() != null) {
			_hashCode += getSuspendTime().hashCode();
		}
		if (getBootTime() != null) {
			_hashCode += getBootTime().hashCode();
		}
		if (getSuspendInterval() != null) {
			_hashCode += getSuspendInterval().hashCode();
		}
		if (getQuestion() != null) {
			_hashCode += getQuestion().hashCode();
		}
		if (getMemoryOverhead() != null) {
			_hashCode += getMemoryOverhead().hashCode();
		}
		if (getMaxCpuUsage() != null) {
			_hashCode += getMaxCpuUsage().hashCode();
		}
		if (getMaxMemoryUsage() != null) {
			_hashCode += getMaxMemoryUsage().hashCode();
		}
		_hashCode += getNumMksConnections();
		if (getRecordReplayState() != null) {
			_hashCode += getRecordReplayState().hashCode();
		}
		if (getCleanPowerOff() != null) {
			_hashCode += getCleanPowerOff().hashCode();
		}
		if (getNeedSecondaryReason() != null) {
			_hashCode += getNeedSecondaryReason().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			VirtualMachineRuntimeInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VirtualMachineRuntimeInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("host");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "host"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("connectionState");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"connectionState"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VirtualMachineConnectionState"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("powerState");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"powerState"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VirtualMachinePowerState"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("faultToleranceState");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"faultToleranceState"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VirtualMachineFaultToleranceState"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("toolsInstallerMounted");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"toolsInstallerMounted"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("suspendTime");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"suspendTime"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "dateTime"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("bootTime");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"bootTime"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "dateTime"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("suspendInterval");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"suspendInterval"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "long"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("question");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"question"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VirtualMachineQuestionInfo"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("memoryOverhead");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"memoryOverhead"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "long"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("maxCpuUsage");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"maxCpuUsage"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("maxMemoryUsage");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"maxMemoryUsage"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("numMksConnections");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"numMksConnections"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("recordReplayState");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"recordReplayState"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VirtualMachineRecordReplayState"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("cleanPowerOff");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"cleanPowerOff"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("needSecondaryReason");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"needSecondaryReason"));
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
