/**
 * VirtualMachineRuntimeInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class VirtualMachineRuntimeInfo extends com.vmware.vim.DynamicData
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim.ManagedObjectReference host;

	private com.vmware.vim.VirtualMachineConnectionState connectionState;

	private com.vmware.vim.VirtualMachinePowerState powerState;

	private boolean toolsInstallerMounted;

	private java.util.Calendar suspendTime;

	private java.util.Calendar bootTime;

	private java.lang.Long suspendInterval;

	private com.vmware.vim.VirtualMachineQuestionInfo question;

	private java.lang.Long memoryOverhead;

	private java.lang.Integer maxCpuUsage;

	private java.lang.Integer maxMemoryUsage;

	private int numMksConnections;

	public VirtualMachineRuntimeInfo() {
	}

	public VirtualMachineRuntimeInfo(java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty,
			com.vmware.vim.ManagedObjectReference host,
			com.vmware.vim.VirtualMachineConnectionState connectionState,
			com.vmware.vim.VirtualMachinePowerState powerState,
			boolean toolsInstallerMounted, java.util.Calendar suspendTime,
			java.util.Calendar bootTime, java.lang.Long suspendInterval,
			com.vmware.vim.VirtualMachineQuestionInfo question,
			java.lang.Long memoryOverhead, java.lang.Integer maxCpuUsage,
			java.lang.Integer maxMemoryUsage, int numMksConnections) {
		super(dynamicType, dynamicProperty);
		this.host = host;
		this.connectionState = connectionState;
		this.powerState = powerState;
		this.toolsInstallerMounted = toolsInstallerMounted;
		this.suspendTime = suspendTime;
		this.bootTime = bootTime;
		this.suspendInterval = suspendInterval;
		this.question = question;
		this.memoryOverhead = memoryOverhead;
		this.maxCpuUsage = maxCpuUsage;
		this.maxMemoryUsage = maxMemoryUsage;
		this.numMksConnections = numMksConnections;
	}

	/**
	 * Gets the host value for this VirtualMachineRuntimeInfo.
	 * 
	 * @return host
	 */
	public com.vmware.vim.ManagedObjectReference getHost() {
		return host;
	}

	/**
	 * Sets the host value for this VirtualMachineRuntimeInfo.
	 * 
	 * @param host
	 */
	public void setHost(com.vmware.vim.ManagedObjectReference host) {
		this.host = host;
	}

	/**
	 * Gets the connectionState value for this VirtualMachineRuntimeInfo.
	 * 
	 * @return connectionState
	 */
	public com.vmware.vim.VirtualMachineConnectionState getConnectionState() {
		return connectionState;
	}

	/**
	 * Sets the connectionState value for this VirtualMachineRuntimeInfo.
	 * 
	 * @param connectionState
	 */
	public void setConnectionState(
			com.vmware.vim.VirtualMachineConnectionState connectionState) {
		this.connectionState = connectionState;
	}

	/**
	 * Gets the powerState value for this VirtualMachineRuntimeInfo.
	 * 
	 * @return powerState
	 */
	public com.vmware.vim.VirtualMachinePowerState getPowerState() {
		return powerState;
	}

	/**
	 * Sets the powerState value for this VirtualMachineRuntimeInfo.
	 * 
	 * @param powerState
	 */
	public void setPowerState(com.vmware.vim.VirtualMachinePowerState powerState) {
		this.powerState = powerState;
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
	public com.vmware.vim.VirtualMachineQuestionInfo getQuestion() {
		return question;
	}

	/**
	 * Sets the question value for this VirtualMachineRuntimeInfo.
	 * 
	 * @param question
	 */
	public void setQuestion(com.vmware.vim.VirtualMachineQuestionInfo question) {
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
				&& this.numMksConnections == other.getNumMksConnections();
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
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			VirtualMachineRuntimeInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"VirtualMachineRuntimeInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("host");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "host"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ManagedObjectReference"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("connectionState");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"connectionState"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"VirtualMachineConnectionState"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("powerState");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"powerState"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"VirtualMachinePowerState"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("toolsInstallerMounted");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"toolsInstallerMounted"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("suspendTime");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"suspendTime"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "dateTime"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("bootTime");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"bootTime"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "dateTime"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("suspendInterval");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"suspendInterval"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "long"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("question");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"question"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"VirtualMachineQuestionInfo"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("memoryOverhead");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"memoryOverhead"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "long"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("maxCpuUsage");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"maxCpuUsage"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("maxMemoryUsage");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"maxMemoryUsage"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("numMksConnections");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"numMksConnections"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
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
