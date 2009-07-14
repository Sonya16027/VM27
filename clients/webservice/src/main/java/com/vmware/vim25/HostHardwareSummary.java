/**
 * HostHardwareSummary.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostHardwareSummary extends com.vmware.vim25.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String vendor;

	private java.lang.String model;

	private java.lang.String uuid;

	private com.vmware.vim25.HostSystemIdentificationInfo[] otherIdentifyingInfo;

	private long memorySize;

	private java.lang.String cpuModel;

	private int cpuMhz;

	private short numCpuPkgs;

	private short numCpuCores;

	private short numCpuThreads;

	private int numNics;

	private int numHBAs;

	public HostHardwareSummary() {
	}

	public HostHardwareSummary(
			java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.String vendor,
			java.lang.String model,
			java.lang.String uuid,
			com.vmware.vim25.HostSystemIdentificationInfo[] otherIdentifyingInfo,
			long memorySize, java.lang.String cpuModel, int cpuMhz,
			short numCpuPkgs, short numCpuCores, short numCpuThreads,
			int numNics, int numHBAs) {
		super(dynamicType, dynamicProperty);
		this.vendor = vendor;
		this.model = model;
		this.uuid = uuid;
		this.otherIdentifyingInfo = otherIdentifyingInfo;
		this.memorySize = memorySize;
		this.cpuModel = cpuModel;
		this.cpuMhz = cpuMhz;
		this.numCpuPkgs = numCpuPkgs;
		this.numCpuCores = numCpuCores;
		this.numCpuThreads = numCpuThreads;
		this.numNics = numNics;
		this.numHBAs = numHBAs;
	}

	/**
	 * Gets the vendor value for this HostHardwareSummary.
	 * 
	 * @return vendor
	 */
	public java.lang.String getVendor() {
		return vendor;
	}

	/**
	 * Sets the vendor value for this HostHardwareSummary.
	 * 
	 * @param vendor
	 */
	public void setVendor(java.lang.String vendor) {
		this.vendor = vendor;
	}

	/**
	 * Gets the model value for this HostHardwareSummary.
	 * 
	 * @return model
	 */
	public java.lang.String getModel() {
		return model;
	}

	/**
	 * Sets the model value for this HostHardwareSummary.
	 * 
	 * @param model
	 */
	public void setModel(java.lang.String model) {
		this.model = model;
	}

	/**
	 * Gets the uuid value for this HostHardwareSummary.
	 * 
	 * @return uuid
	 */
	public java.lang.String getUuid() {
		return uuid;
	}

	/**
	 * Sets the uuid value for this HostHardwareSummary.
	 * 
	 * @param uuid
	 */
	public void setUuid(java.lang.String uuid) {
		this.uuid = uuid;
	}

	/**
	 * Gets the otherIdentifyingInfo value for this HostHardwareSummary.
	 * 
	 * @return otherIdentifyingInfo
	 */
	public com.vmware.vim25.HostSystemIdentificationInfo[] getOtherIdentifyingInfo() {
		return otherIdentifyingInfo;
	}

	/**
	 * Sets the otherIdentifyingInfo value for this HostHardwareSummary.
	 * 
	 * @param otherIdentifyingInfo
	 */
	public void setOtherIdentifyingInfo(
			com.vmware.vim25.HostSystemIdentificationInfo[] otherIdentifyingInfo) {
		this.otherIdentifyingInfo = otherIdentifyingInfo;
	}

	public com.vmware.vim25.HostSystemIdentificationInfo getOtherIdentifyingInfo(
			int i) {
		return this.otherIdentifyingInfo[i];
	}

	public void setOtherIdentifyingInfo(int i,
			com.vmware.vim25.HostSystemIdentificationInfo _value) {
		this.otherIdentifyingInfo[i] = _value;
	}

	/**
	 * Gets the memorySize value for this HostHardwareSummary.
	 * 
	 * @return memorySize
	 */
	public long getMemorySize() {
		return memorySize;
	}

	/**
	 * Sets the memorySize value for this HostHardwareSummary.
	 * 
	 * @param memorySize
	 */
	public void setMemorySize(long memorySize) {
		this.memorySize = memorySize;
	}

	/**
	 * Gets the cpuModel value for this HostHardwareSummary.
	 * 
	 * @return cpuModel
	 */
	public java.lang.String getCpuModel() {
		return cpuModel;
	}

	/**
	 * Sets the cpuModel value for this HostHardwareSummary.
	 * 
	 * @param cpuModel
	 */
	public void setCpuModel(java.lang.String cpuModel) {
		this.cpuModel = cpuModel;
	}

	/**
	 * Gets the cpuMhz value for this HostHardwareSummary.
	 * 
	 * @return cpuMhz
	 */
	public int getCpuMhz() {
		return cpuMhz;
	}

	/**
	 * Sets the cpuMhz value for this HostHardwareSummary.
	 * 
	 * @param cpuMhz
	 */
	public void setCpuMhz(int cpuMhz) {
		this.cpuMhz = cpuMhz;
	}

	/**
	 * Gets the numCpuPkgs value for this HostHardwareSummary.
	 * 
	 * @return numCpuPkgs
	 */
	public short getNumCpuPkgs() {
		return numCpuPkgs;
	}

	/**
	 * Sets the numCpuPkgs value for this HostHardwareSummary.
	 * 
	 * @param numCpuPkgs
	 */
	public void setNumCpuPkgs(short numCpuPkgs) {
		this.numCpuPkgs = numCpuPkgs;
	}

	/**
	 * Gets the numCpuCores value for this HostHardwareSummary.
	 * 
	 * @return numCpuCores
	 */
	public short getNumCpuCores() {
		return numCpuCores;
	}

	/**
	 * Sets the numCpuCores value for this HostHardwareSummary.
	 * 
	 * @param numCpuCores
	 */
	public void setNumCpuCores(short numCpuCores) {
		this.numCpuCores = numCpuCores;
	}

	/**
	 * Gets the numCpuThreads value for this HostHardwareSummary.
	 * 
	 * @return numCpuThreads
	 */
	public short getNumCpuThreads() {
		return numCpuThreads;
	}

	/**
	 * Sets the numCpuThreads value for this HostHardwareSummary.
	 * 
	 * @param numCpuThreads
	 */
	public void setNumCpuThreads(short numCpuThreads) {
		this.numCpuThreads = numCpuThreads;
	}

	/**
	 * Gets the numNics value for this HostHardwareSummary.
	 * 
	 * @return numNics
	 */
	public int getNumNics() {
		return numNics;
	}

	/**
	 * Sets the numNics value for this HostHardwareSummary.
	 * 
	 * @param numNics
	 */
	public void setNumNics(int numNics) {
		this.numNics = numNics;
	}

	/**
	 * Gets the numHBAs value for this HostHardwareSummary.
	 * 
	 * @return numHBAs
	 */
	public int getNumHBAs() {
		return numHBAs;
	}

	/**
	 * Sets the numHBAs value for this HostHardwareSummary.
	 * 
	 * @param numHBAs
	 */
	public void setNumHBAs(int numHBAs) {
		this.numHBAs = numHBAs;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof HostHardwareSummary)) {
			return false;
		}
		HostHardwareSummary other = (HostHardwareSummary) obj;
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
				&& ((this.vendor == null && other.getVendor() == null) || (this.vendor != null && this.vendor
						.equals(other.getVendor())))
				&& ((this.model == null && other.getModel() == null) || (this.model != null && this.model
						.equals(other.getModel())))
				&& ((this.uuid == null && other.getUuid() == null) || (this.uuid != null && this.uuid
						.equals(other.getUuid())))
				&& ((this.otherIdentifyingInfo == null && other
						.getOtherIdentifyingInfo() == null) || (this.otherIdentifyingInfo != null && java.util.Arrays
						.equals(this.otherIdentifyingInfo, other
								.getOtherIdentifyingInfo())))
				&& this.memorySize == other.getMemorySize()
				&& ((this.cpuModel == null && other.getCpuModel() == null) || (this.cpuModel != null && this.cpuModel
						.equals(other.getCpuModel())))
				&& this.cpuMhz == other.getCpuMhz()
				&& this.numCpuPkgs == other.getNumCpuPkgs()
				&& this.numCpuCores == other.getNumCpuCores()
				&& this.numCpuThreads == other.getNumCpuThreads()
				&& this.numNics == other.getNumNics()
				&& this.numHBAs == other.getNumHBAs();
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
		if (getVendor() != null) {
			_hashCode += getVendor().hashCode();
		}
		if (getModel() != null) {
			_hashCode += getModel().hashCode();
		}
		if (getUuid() != null) {
			_hashCode += getUuid().hashCode();
		}
		if (getOtherIdentifyingInfo() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getOtherIdentifyingInfo()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getOtherIdentifyingInfo(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		_hashCode += new Long(getMemorySize()).hashCode();
		if (getCpuModel() != null) {
			_hashCode += getCpuModel().hashCode();
		}
		_hashCode += getCpuMhz();
		_hashCode += getNumCpuPkgs();
		_hashCode += getNumCpuCores();
		_hashCode += getNumCpuThreads();
		_hashCode += getNumNics();
		_hashCode += getNumHBAs();
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			HostHardwareSummary.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostHardwareSummary"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("vendor");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"vendor"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("model");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "model"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("uuid");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "uuid"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("otherIdentifyingInfo");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"otherIdentifyingInfo"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostSystemIdentificationInfo"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("memorySize");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"memorySize"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "long"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("cpuModel");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"cpuModel"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("cpuMhz");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"cpuMhz"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("numCpuPkgs");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"numCpuPkgs"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "short"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("numCpuCores");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"numCpuCores"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "short"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("numCpuThreads");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"numCpuThreads"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "short"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("numNics");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"numNics"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("numHBAs");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"numHBAs"));
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
