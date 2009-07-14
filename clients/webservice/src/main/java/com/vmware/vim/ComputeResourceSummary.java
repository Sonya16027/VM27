/**
 * ComputeResourceSummary.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class ComputeResourceSummary extends com.vmware.vim.DynamicData
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int totalCpu;

	private long totalMemory;

	private short numCpuCores;

	private short numCpuThreads;

	private int effectiveCpu;

	private long effectiveMemory;

	private int numHosts;

	private int numEffectiveHosts;

	private com.vmware.vim.ManagedEntityStatus overallStatus;

	public ComputeResourceSummary() {
	}

	public ComputeResourceSummary(java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty, int totalCpu,
			long totalMemory, short numCpuCores, short numCpuThreads,
			int effectiveCpu, long effectiveMemory, int numHosts,
			int numEffectiveHosts,
			com.vmware.vim.ManagedEntityStatus overallStatus) {
		super(dynamicType, dynamicProperty);
		this.totalCpu = totalCpu;
		this.totalMemory = totalMemory;
		this.numCpuCores = numCpuCores;
		this.numCpuThreads = numCpuThreads;
		this.effectiveCpu = effectiveCpu;
		this.effectiveMemory = effectiveMemory;
		this.numHosts = numHosts;
		this.numEffectiveHosts = numEffectiveHosts;
		this.overallStatus = overallStatus;
	}

	/**
	 * Gets the totalCpu value for this ComputeResourceSummary.
	 * 
	 * @return totalCpu
	 */
	public int getTotalCpu() {
		return totalCpu;
	}

	/**
	 * Sets the totalCpu value for this ComputeResourceSummary.
	 * 
	 * @param totalCpu
	 */
	public void setTotalCpu(int totalCpu) {
		this.totalCpu = totalCpu;
	}

	/**
	 * Gets the totalMemory value for this ComputeResourceSummary.
	 * 
	 * @return totalMemory
	 */
	public long getTotalMemory() {
		return totalMemory;
	}

	/**
	 * Sets the totalMemory value for this ComputeResourceSummary.
	 * 
	 * @param totalMemory
	 */
	public void setTotalMemory(long totalMemory) {
		this.totalMemory = totalMemory;
	}

	/**
	 * Gets the numCpuCores value for this ComputeResourceSummary.
	 * 
	 * @return numCpuCores
	 */
	public short getNumCpuCores() {
		return numCpuCores;
	}

	/**
	 * Sets the numCpuCores value for this ComputeResourceSummary.
	 * 
	 * @param numCpuCores
	 */
	public void setNumCpuCores(short numCpuCores) {
		this.numCpuCores = numCpuCores;
	}

	/**
	 * Gets the numCpuThreads value for this ComputeResourceSummary.
	 * 
	 * @return numCpuThreads
	 */
	public short getNumCpuThreads() {
		return numCpuThreads;
	}

	/**
	 * Sets the numCpuThreads value for this ComputeResourceSummary.
	 * 
	 * @param numCpuThreads
	 */
	public void setNumCpuThreads(short numCpuThreads) {
		this.numCpuThreads = numCpuThreads;
	}

	/**
	 * Gets the effectiveCpu value for this ComputeResourceSummary.
	 * 
	 * @return effectiveCpu
	 */
	public int getEffectiveCpu() {
		return effectiveCpu;
	}

	/**
	 * Sets the effectiveCpu value for this ComputeResourceSummary.
	 * 
	 * @param effectiveCpu
	 */
	public void setEffectiveCpu(int effectiveCpu) {
		this.effectiveCpu = effectiveCpu;
	}

	/**
	 * Gets the effectiveMemory value for this ComputeResourceSummary.
	 * 
	 * @return effectiveMemory
	 */
	public long getEffectiveMemory() {
		return effectiveMemory;
	}

	/**
	 * Sets the effectiveMemory value for this ComputeResourceSummary.
	 * 
	 * @param effectiveMemory
	 */
	public void setEffectiveMemory(long effectiveMemory) {
		this.effectiveMemory = effectiveMemory;
	}

	/**
	 * Gets the numHosts value for this ComputeResourceSummary.
	 * 
	 * @return numHosts
	 */
	public int getNumHosts() {
		return numHosts;
	}

	/**
	 * Sets the numHosts value for this ComputeResourceSummary.
	 * 
	 * @param numHosts
	 */
	public void setNumHosts(int numHosts) {
		this.numHosts = numHosts;
	}

	/**
	 * Gets the numEffectiveHosts value for this ComputeResourceSummary.
	 * 
	 * @return numEffectiveHosts
	 */
	public int getNumEffectiveHosts() {
		return numEffectiveHosts;
	}

	/**
	 * Sets the numEffectiveHosts value for this ComputeResourceSummary.
	 * 
	 * @param numEffectiveHosts
	 */
	public void setNumEffectiveHosts(int numEffectiveHosts) {
		this.numEffectiveHosts = numEffectiveHosts;
	}

	/**
	 * Gets the overallStatus value for this ComputeResourceSummary.
	 * 
	 * @return overallStatus
	 */
	public com.vmware.vim.ManagedEntityStatus getOverallStatus() {
		return overallStatus;
	}

	/**
	 * Sets the overallStatus value for this ComputeResourceSummary.
	 * 
	 * @param overallStatus
	 */
	public void setOverallStatus(
			com.vmware.vim.ManagedEntityStatus overallStatus) {
		this.overallStatus = overallStatus;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ComputeResourceSummary)) {
			return false;
		}
		ComputeResourceSummary other = (ComputeResourceSummary) obj;
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
				&& this.totalCpu == other.getTotalCpu()
				&& this.totalMemory == other.getTotalMemory()
				&& this.numCpuCores == other.getNumCpuCores()
				&& this.numCpuThreads == other.getNumCpuThreads()
				&& this.effectiveCpu == other.getEffectiveCpu()
				&& this.effectiveMemory == other.getEffectiveMemory()
				&& this.numHosts == other.getNumHosts()
				&& this.numEffectiveHosts == other.getNumEffectiveHosts()
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
		_hashCode += getTotalCpu();
		_hashCode += new Long(getTotalMemory()).hashCode();
		_hashCode += getNumCpuCores();
		_hashCode += getNumCpuThreads();
		_hashCode += getEffectiveCpu();
		_hashCode += new Long(getEffectiveMemory()).hashCode();
		_hashCode += getNumHosts();
		_hashCode += getNumEffectiveHosts();
		if (getOverallStatus() != null) {
			_hashCode += getOverallStatus().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			ComputeResourceSummary.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ComputeResourceSummary"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("totalCpu");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"totalCpu"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("totalMemory");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"totalMemory"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "long"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("numCpuCores");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"numCpuCores"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "short"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("numCpuThreads");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"numCpuThreads"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "short"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("effectiveCpu");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"effectiveCpu"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("effectiveMemory");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"effectiveMemory"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "long"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("numHosts");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"numHosts"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("numEffectiveHosts");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"numEffectiveHosts"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("overallStatus");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"overallStatus"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
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
