/**
 * ResourcePoolRuntimeInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ResourcePoolRuntimeInfo extends com.vmware.vim25.DynamicData
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.ResourcePoolResourceUsage memory;

	private com.vmware.vim25.ResourcePoolResourceUsage cpu;

	private com.vmware.vim25.ManagedEntityStatus overallStatus;

	public ResourcePoolRuntimeInfo() {
	}

	public ResourcePoolRuntimeInfo(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			com.vmware.vim25.ResourcePoolResourceUsage memory,
			com.vmware.vim25.ResourcePoolResourceUsage cpu,
			com.vmware.vim25.ManagedEntityStatus overallStatus) {
		super(dynamicType, dynamicProperty);
		this.memory = memory;
		this.cpu = cpu;
		this.overallStatus = overallStatus;
	}

	/**
	 * Gets the memory value for this ResourcePoolRuntimeInfo.
	 * 
	 * @return memory
	 */
	public com.vmware.vim25.ResourcePoolResourceUsage getMemory() {
		return memory;
	}

	/**
	 * Sets the memory value for this ResourcePoolRuntimeInfo.
	 * 
	 * @param memory
	 */
	public void setMemory(com.vmware.vim25.ResourcePoolResourceUsage memory) {
		this.memory = memory;
	}

	/**
	 * Gets the cpu value for this ResourcePoolRuntimeInfo.
	 * 
	 * @return cpu
	 */
	public com.vmware.vim25.ResourcePoolResourceUsage getCpu() {
		return cpu;
	}

	/**
	 * Sets the cpu value for this ResourcePoolRuntimeInfo.
	 * 
	 * @param cpu
	 */
	public void setCpu(com.vmware.vim25.ResourcePoolResourceUsage cpu) {
		this.cpu = cpu;
	}

	/**
	 * Gets the overallStatus value for this ResourcePoolRuntimeInfo.
	 * 
	 * @return overallStatus
	 */
	public com.vmware.vim25.ManagedEntityStatus getOverallStatus() {
		return overallStatus;
	}

	/**
	 * Sets the overallStatus value for this ResourcePoolRuntimeInfo.
	 * 
	 * @param overallStatus
	 */
	public void setOverallStatus(
			com.vmware.vim25.ManagedEntityStatus overallStatus) {
		this.overallStatus = overallStatus;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ResourcePoolRuntimeInfo)) {
			return false;
		}
		ResourcePoolRuntimeInfo other = (ResourcePoolRuntimeInfo) obj;
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
				&& ((this.memory == null && other.getMemory() == null) || (this.memory != null && this.memory
						.equals(other.getMemory())))
				&& ((this.cpu == null && other.getCpu() == null) || (this.cpu != null && this.cpu
						.equals(other.getCpu())))
				&& ((this.overallStatus == null && other.getOverallStatus() == null) || (this.overallStatus != null && this.overallStatus
						.equals(other.getOverallStatus())));
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
		if (getMemory() != null) {
			_hashCode += getMemory().hashCode();
		}
		if (getCpu() != null) {
			_hashCode += getCpu().hashCode();
		}
		if (getOverallStatus() != null) {
			_hashCode += getOverallStatus().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			ResourcePoolRuntimeInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ResourcePoolRuntimeInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("memory");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"memory"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ResourcePoolResourceUsage"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("cpu");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "cpu"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ResourcePoolResourceUsage"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("overallStatus");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"overallStatus"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedEntityStatus"));
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
