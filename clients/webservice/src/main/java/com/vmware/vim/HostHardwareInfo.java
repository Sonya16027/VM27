/**
 * HostHardwareInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class HostHardwareInfo extends com.vmware.vim.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim.HostSystemInfo systemInfo;

	private com.vmware.vim.HostCpuInfo cpuInfo;

	private com.vmware.vim.HostCpuPackage[] cpuPkg;

	private long memorySize;

	private com.vmware.vim.HostNumaInfo numaInfo;

	private com.vmware.vim.HostPciDevice[] pciDevice;

	private com.vmware.vim.HostCpuIdInfo[] cpuFeature;

	public HostHardwareInfo() {
	}

	public HostHardwareInfo(java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty,
			com.vmware.vim.HostSystemInfo systemInfo,
			com.vmware.vim.HostCpuInfo cpuInfo,
			com.vmware.vim.HostCpuPackage[] cpuPkg, long memorySize,
			com.vmware.vim.HostNumaInfo numaInfo,
			com.vmware.vim.HostPciDevice[] pciDevice,
			com.vmware.vim.HostCpuIdInfo[] cpuFeature) {
		super(dynamicType, dynamicProperty);
		this.systemInfo = systemInfo;
		this.cpuInfo = cpuInfo;
		this.cpuPkg = cpuPkg;
		this.memorySize = memorySize;
		this.numaInfo = numaInfo;
		this.pciDevice = pciDevice;
		this.cpuFeature = cpuFeature;
	}

	/**
	 * Gets the systemInfo value for this HostHardwareInfo.
	 * 
	 * @return systemInfo
	 */
	public com.vmware.vim.HostSystemInfo getSystemInfo() {
		return systemInfo;
	}

	/**
	 * Sets the systemInfo value for this HostHardwareInfo.
	 * 
	 * @param systemInfo
	 */
	public void setSystemInfo(com.vmware.vim.HostSystemInfo systemInfo) {
		this.systemInfo = systemInfo;
	}

	/**
	 * Gets the cpuInfo value for this HostHardwareInfo.
	 * 
	 * @return cpuInfo
	 */
	public com.vmware.vim.HostCpuInfo getCpuInfo() {
		return cpuInfo;
	}

	/**
	 * Sets the cpuInfo value for this HostHardwareInfo.
	 * 
	 * @param cpuInfo
	 */
	public void setCpuInfo(com.vmware.vim.HostCpuInfo cpuInfo) {
		this.cpuInfo = cpuInfo;
	}

	/**
	 * Gets the cpuPkg value for this HostHardwareInfo.
	 * 
	 * @return cpuPkg
	 */
	public com.vmware.vim.HostCpuPackage[] getCpuPkg() {
		return cpuPkg;
	}

	/**
	 * Sets the cpuPkg value for this HostHardwareInfo.
	 * 
	 * @param cpuPkg
	 */
	public void setCpuPkg(com.vmware.vim.HostCpuPackage[] cpuPkg) {
		this.cpuPkg = cpuPkg;
	}

	public com.vmware.vim.HostCpuPackage getCpuPkg(int i) {
		return this.cpuPkg[i];
	}

	public void setCpuPkg(int i, com.vmware.vim.HostCpuPackage _value) {
		this.cpuPkg[i] = _value;
	}

	/**
	 * Gets the memorySize value for this HostHardwareInfo.
	 * 
	 * @return memorySize
	 */
	public long getMemorySize() {
		return memorySize;
	}

	/**
	 * Sets the memorySize value for this HostHardwareInfo.
	 * 
	 * @param memorySize
	 */
	public void setMemorySize(long memorySize) {
		this.memorySize = memorySize;
	}

	/**
	 * Gets the numaInfo value for this HostHardwareInfo.
	 * 
	 * @return numaInfo
	 */
	public com.vmware.vim.HostNumaInfo getNumaInfo() {
		return numaInfo;
	}

	/**
	 * Sets the numaInfo value for this HostHardwareInfo.
	 * 
	 * @param numaInfo
	 */
	public void setNumaInfo(com.vmware.vim.HostNumaInfo numaInfo) {
		this.numaInfo = numaInfo;
	}

	/**
	 * Gets the pciDevice value for this HostHardwareInfo.
	 * 
	 * @return pciDevice
	 */
	public com.vmware.vim.HostPciDevice[] getPciDevice() {
		return pciDevice;
	}

	/**
	 * Sets the pciDevice value for this HostHardwareInfo.
	 * 
	 * @param pciDevice
	 */
	public void setPciDevice(com.vmware.vim.HostPciDevice[] pciDevice) {
		this.pciDevice = pciDevice;
	}

	public com.vmware.vim.HostPciDevice getPciDevice(int i) {
		return this.pciDevice[i];
	}

	public void setPciDevice(int i, com.vmware.vim.HostPciDevice _value) {
		this.pciDevice[i] = _value;
	}

	/**
	 * Gets the cpuFeature value for this HostHardwareInfo.
	 * 
	 * @return cpuFeature
	 */
	public com.vmware.vim.HostCpuIdInfo[] getCpuFeature() {
		return cpuFeature;
	}

	/**
	 * Sets the cpuFeature value for this HostHardwareInfo.
	 * 
	 * @param cpuFeature
	 */
	public void setCpuFeature(com.vmware.vim.HostCpuIdInfo[] cpuFeature) {
		this.cpuFeature = cpuFeature;
	}

	public com.vmware.vim.HostCpuIdInfo getCpuFeature(int i) {
		return this.cpuFeature[i];
	}

	public void setCpuFeature(int i, com.vmware.vim.HostCpuIdInfo _value) {
		this.cpuFeature[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof HostHardwareInfo)) {
			return false;
		}
		HostHardwareInfo other = (HostHardwareInfo) obj;
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
				&& ((this.systemInfo == null && other.getSystemInfo() == null) || (this.systemInfo != null && this.systemInfo
						.equals(other.getSystemInfo())))
				&& ((this.cpuInfo == null && other.getCpuInfo() == null) || (this.cpuInfo != null && this.cpuInfo
						.equals(other.getCpuInfo())))
				&& ((this.cpuPkg == null && other.getCpuPkg() == null) || (this.cpuPkg != null && java.util.Arrays
						.equals(this.cpuPkg, other.getCpuPkg())))
				&& this.memorySize == other.getMemorySize()
				&& ((this.numaInfo == null && other.getNumaInfo() == null) || (this.numaInfo != null && this.numaInfo
						.equals(other.getNumaInfo())))
				&& ((this.pciDevice == null && other.getPciDevice() == null) || (this.pciDevice != null && java.util.Arrays
						.equals(this.pciDevice, other.getPciDevice())))
				&& ((this.cpuFeature == null && other.getCpuFeature() == null) || (this.cpuFeature != null && java.util.Arrays
						.equals(this.cpuFeature, other.getCpuFeature())));
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
		if (getSystemInfo() != null) {
			_hashCode += getSystemInfo().hashCode();
		}
		if (getCpuInfo() != null) {
			_hashCode += getCpuInfo().hashCode();
		}
		if (getCpuPkg() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getCpuPkg()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getCpuPkg(),
						i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		_hashCode += new Long(getMemorySize()).hashCode();
		if (getNumaInfo() != null) {
			_hashCode += getNumaInfo().hashCode();
		}
		if (getPciDevice() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getPciDevice()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getPciDevice(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getCpuFeature() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getCpuFeature()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getCpuFeature(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			HostHardwareInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"HostHardwareInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("systemInfo");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"systemInfo"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"HostSystemInfo"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("cpuInfo");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"cpuInfo"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"HostCpuInfo"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("cpuPkg");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim2", "cpuPkg"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"HostCpuPackage"));
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("memorySize");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"memorySize"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "long"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("numaInfo");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"numaInfo"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"HostNumaInfo"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("pciDevice");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"pciDevice"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"HostPciDevice"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("cpuFeature");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"cpuFeature"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"HostCpuIdInfo"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
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
