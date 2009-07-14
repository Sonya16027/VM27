/**
 * ConfigTarget.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class ConfigTarget extends com.vmware.vim.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int numCpus;

	private int numCpuCores;

	private int numNumaNodes;

	private com.vmware.vim.VirtualMachineDatastoreInfo[] datastore;

	private com.vmware.vim.VirtualMachineNetworkInfo[] network;

	private com.vmware.vim.VirtualMachineCdromInfo[] cdRom;

	private com.vmware.vim.VirtualMachineSerialInfo[] serial;

	private com.vmware.vim.VirtualMachineParallelInfo[] parallel;

	private com.vmware.vim.VirtualMachineFloppyInfo[] floppy;

	private com.vmware.vim.VirtualMachineLegacyNetworkSwitchInfo[] legacyNetworkInfo;

	private com.vmware.vim.VirtualMachineScsiPassthroughInfo[] scsiPassthrough;

	private com.vmware.vim.VirtualMachineScsiDiskDeviceInfo[] scsiDisk;

	private com.vmware.vim.VirtualMachineIdeDiskDeviceInfo[] ideDisk;

	private int maxMemMBOptimalPerf;

	private com.vmware.vim.ResourcePoolRuntimeInfo resourcePool;

	private java.lang.Boolean autoVmotion;

	public ConfigTarget() {
	}

	public ConfigTarget(
			java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty,
			int numCpus,
			int numCpuCores,
			int numNumaNodes,
			com.vmware.vim.VirtualMachineDatastoreInfo[] datastore,
			com.vmware.vim.VirtualMachineNetworkInfo[] network,
			com.vmware.vim.VirtualMachineCdromInfo[] cdRom,
			com.vmware.vim.VirtualMachineSerialInfo[] serial,
			com.vmware.vim.VirtualMachineParallelInfo[] parallel,
			com.vmware.vim.VirtualMachineFloppyInfo[] floppy,
			com.vmware.vim.VirtualMachineLegacyNetworkSwitchInfo[] legacyNetworkInfo,
			com.vmware.vim.VirtualMachineScsiPassthroughInfo[] scsiPassthrough,
			com.vmware.vim.VirtualMachineScsiDiskDeviceInfo[] scsiDisk,
			com.vmware.vim.VirtualMachineIdeDiskDeviceInfo[] ideDisk,
			int maxMemMBOptimalPerf,
			com.vmware.vim.ResourcePoolRuntimeInfo resourcePool,
			java.lang.Boolean autoVmotion) {
		super(dynamicType, dynamicProperty);
		this.numCpus = numCpus;
		this.numCpuCores = numCpuCores;
		this.numNumaNodes = numNumaNodes;
		this.datastore = datastore;
		this.network = network;
		this.cdRom = cdRom;
		this.serial = serial;
		this.parallel = parallel;
		this.floppy = floppy;
		this.legacyNetworkInfo = legacyNetworkInfo;
		this.scsiPassthrough = scsiPassthrough;
		this.scsiDisk = scsiDisk;
		this.ideDisk = ideDisk;
		this.maxMemMBOptimalPerf = maxMemMBOptimalPerf;
		this.resourcePool = resourcePool;
		this.autoVmotion = autoVmotion;
	}

	/**
	 * Gets the numCpus value for this ConfigTarget.
	 * 
	 * @return numCpus
	 */
	public int getNumCpus() {
		return numCpus;
	}

	/**
	 * Sets the numCpus value for this ConfigTarget.
	 * 
	 * @param numCpus
	 */
	public void setNumCpus(int numCpus) {
		this.numCpus = numCpus;
	}

	/**
	 * Gets the numCpuCores value for this ConfigTarget.
	 * 
	 * @return numCpuCores
	 */
	public int getNumCpuCores() {
		return numCpuCores;
	}

	/**
	 * Sets the numCpuCores value for this ConfigTarget.
	 * 
	 * @param numCpuCores
	 */
	public void setNumCpuCores(int numCpuCores) {
		this.numCpuCores = numCpuCores;
	}

	/**
	 * Gets the numNumaNodes value for this ConfigTarget.
	 * 
	 * @return numNumaNodes
	 */
	public int getNumNumaNodes() {
		return numNumaNodes;
	}

	/**
	 * Sets the numNumaNodes value for this ConfigTarget.
	 * 
	 * @param numNumaNodes
	 */
	public void setNumNumaNodes(int numNumaNodes) {
		this.numNumaNodes = numNumaNodes;
	}

	/**
	 * Gets the datastore value for this ConfigTarget.
	 * 
	 * @return datastore
	 */
	public com.vmware.vim.VirtualMachineDatastoreInfo[] getDatastore() {
		return datastore;
	}

	/**
	 * Sets the datastore value for this ConfigTarget.
	 * 
	 * @param datastore
	 */
	public void setDatastore(
			com.vmware.vim.VirtualMachineDatastoreInfo[] datastore) {
		this.datastore = datastore;
	}

	public com.vmware.vim.VirtualMachineDatastoreInfo getDatastore(int i) {
		return this.datastore[i];
	}

	public void setDatastore(int i,
			com.vmware.vim.VirtualMachineDatastoreInfo _value) {
		this.datastore[i] = _value;
	}

	/**
	 * Gets the network value for this ConfigTarget.
	 * 
	 * @return network
	 */
	public com.vmware.vim.VirtualMachineNetworkInfo[] getNetwork() {
		return network;
	}

	/**
	 * Sets the network value for this ConfigTarget.
	 * 
	 * @param network
	 */
	public void setNetwork(com.vmware.vim.VirtualMachineNetworkInfo[] network) {
		this.network = network;
	}

	public com.vmware.vim.VirtualMachineNetworkInfo getNetwork(int i) {
		return this.network[i];
	}

	public void setNetwork(int i,
			com.vmware.vim.VirtualMachineNetworkInfo _value) {
		this.network[i] = _value;
	}

	/**
	 * Gets the cdRom value for this ConfigTarget.
	 * 
	 * @return cdRom
	 */
	public com.vmware.vim.VirtualMachineCdromInfo[] getCdRom() {
		return cdRom;
	}

	/**
	 * Sets the cdRom value for this ConfigTarget.
	 * 
	 * @param cdRom
	 */
	public void setCdRom(com.vmware.vim.VirtualMachineCdromInfo[] cdRom) {
		this.cdRom = cdRom;
	}

	public com.vmware.vim.VirtualMachineCdromInfo getCdRom(int i) {
		return this.cdRom[i];
	}

	public void setCdRom(int i, com.vmware.vim.VirtualMachineCdromInfo _value) {
		this.cdRom[i] = _value;
	}

	/**
	 * Gets the serial value for this ConfigTarget.
	 * 
	 * @return serial
	 */
	public com.vmware.vim.VirtualMachineSerialInfo[] getSerial() {
		return serial;
	}

	/**
	 * Sets the serial value for this ConfigTarget.
	 * 
	 * @param serial
	 */
	public void setSerial(com.vmware.vim.VirtualMachineSerialInfo[] serial) {
		this.serial = serial;
	}

	public com.vmware.vim.VirtualMachineSerialInfo getSerial(int i) {
		return this.serial[i];
	}

	public void setSerial(int i, com.vmware.vim.VirtualMachineSerialInfo _value) {
		this.serial[i] = _value;
	}

	/**
	 * Gets the parallel value for this ConfigTarget.
	 * 
	 * @return parallel
	 */
	public com.vmware.vim.VirtualMachineParallelInfo[] getParallel() {
		return parallel;
	}

	/**
	 * Sets the parallel value for this ConfigTarget.
	 * 
	 * @param parallel
	 */
	public void setParallel(com.vmware.vim.VirtualMachineParallelInfo[] parallel) {
		this.parallel = parallel;
	}

	public com.vmware.vim.VirtualMachineParallelInfo getParallel(int i) {
		return this.parallel[i];
	}

	public void setParallel(int i,
			com.vmware.vim.VirtualMachineParallelInfo _value) {
		this.parallel[i] = _value;
	}

	/**
	 * Gets the floppy value for this ConfigTarget.
	 * 
	 * @return floppy
	 */
	public com.vmware.vim.VirtualMachineFloppyInfo[] getFloppy() {
		return floppy;
	}

	/**
	 * Sets the floppy value for this ConfigTarget.
	 * 
	 * @param floppy
	 */
	public void setFloppy(com.vmware.vim.VirtualMachineFloppyInfo[] floppy) {
		this.floppy = floppy;
	}

	public com.vmware.vim.VirtualMachineFloppyInfo getFloppy(int i) {
		return this.floppy[i];
	}

	public void setFloppy(int i, com.vmware.vim.VirtualMachineFloppyInfo _value) {
		this.floppy[i] = _value;
	}

	/**
	 * Gets the legacyNetworkInfo value for this ConfigTarget.
	 * 
	 * @return legacyNetworkInfo
	 */
	public com.vmware.vim.VirtualMachineLegacyNetworkSwitchInfo[] getLegacyNetworkInfo() {
		return legacyNetworkInfo;
	}

	/**
	 * Sets the legacyNetworkInfo value for this ConfigTarget.
	 * 
	 * @param legacyNetworkInfo
	 */
	public void setLegacyNetworkInfo(
			com.vmware.vim.VirtualMachineLegacyNetworkSwitchInfo[] legacyNetworkInfo) {
		this.legacyNetworkInfo = legacyNetworkInfo;
	}

	public com.vmware.vim.VirtualMachineLegacyNetworkSwitchInfo getLegacyNetworkInfo(
			int i) {
		return this.legacyNetworkInfo[i];
	}

	public void setLegacyNetworkInfo(int i,
			com.vmware.vim.VirtualMachineLegacyNetworkSwitchInfo _value) {
		this.legacyNetworkInfo[i] = _value;
	}

	/**
	 * Gets the scsiPassthrough value for this ConfigTarget.
	 * 
	 * @return scsiPassthrough
	 */
	public com.vmware.vim.VirtualMachineScsiPassthroughInfo[] getScsiPassthrough() {
		return scsiPassthrough;
	}

	/**
	 * Sets the scsiPassthrough value for this ConfigTarget.
	 * 
	 * @param scsiPassthrough
	 */
	public void setScsiPassthrough(
			com.vmware.vim.VirtualMachineScsiPassthroughInfo[] scsiPassthrough) {
		this.scsiPassthrough = scsiPassthrough;
	}

	public com.vmware.vim.VirtualMachineScsiPassthroughInfo getScsiPassthrough(
			int i) {
		return this.scsiPassthrough[i];
	}

	public void setScsiPassthrough(int i,
			com.vmware.vim.VirtualMachineScsiPassthroughInfo _value) {
		this.scsiPassthrough[i] = _value;
	}

	/**
	 * Gets the scsiDisk value for this ConfigTarget.
	 * 
	 * @return scsiDisk
	 */
	public com.vmware.vim.VirtualMachineScsiDiskDeviceInfo[] getScsiDisk() {
		return scsiDisk;
	}

	/**
	 * Sets the scsiDisk value for this ConfigTarget.
	 * 
	 * @param scsiDisk
	 */
	public void setScsiDisk(
			com.vmware.vim.VirtualMachineScsiDiskDeviceInfo[] scsiDisk) {
		this.scsiDisk = scsiDisk;
	}

	public com.vmware.vim.VirtualMachineScsiDiskDeviceInfo getScsiDisk(int i) {
		return this.scsiDisk[i];
	}

	public void setScsiDisk(int i,
			com.vmware.vim.VirtualMachineScsiDiskDeviceInfo _value) {
		this.scsiDisk[i] = _value;
	}

	/**
	 * Gets the ideDisk value for this ConfigTarget.
	 * 
	 * @return ideDisk
	 */
	public com.vmware.vim.VirtualMachineIdeDiskDeviceInfo[] getIdeDisk() {
		return ideDisk;
	}

	/**
	 * Sets the ideDisk value for this ConfigTarget.
	 * 
	 * @param ideDisk
	 */
	public void setIdeDisk(
			com.vmware.vim.VirtualMachineIdeDiskDeviceInfo[] ideDisk) {
		this.ideDisk = ideDisk;
	}

	public com.vmware.vim.VirtualMachineIdeDiskDeviceInfo getIdeDisk(int i) {
		return this.ideDisk[i];
	}

	public void setIdeDisk(int i,
			com.vmware.vim.VirtualMachineIdeDiskDeviceInfo _value) {
		this.ideDisk[i] = _value;
	}

	/**
	 * Gets the maxMemMBOptimalPerf value for this ConfigTarget.
	 * 
	 * @return maxMemMBOptimalPerf
	 */
	public int getMaxMemMBOptimalPerf() {
		return maxMemMBOptimalPerf;
	}

	/**
	 * Sets the maxMemMBOptimalPerf value for this ConfigTarget.
	 * 
	 * @param maxMemMBOptimalPerf
	 */
	public void setMaxMemMBOptimalPerf(int maxMemMBOptimalPerf) {
		this.maxMemMBOptimalPerf = maxMemMBOptimalPerf;
	}

	/**
	 * Gets the resourcePool value for this ConfigTarget.
	 * 
	 * @return resourcePool
	 */
	public com.vmware.vim.ResourcePoolRuntimeInfo getResourcePool() {
		return resourcePool;
	}

	/**
	 * Sets the resourcePool value for this ConfigTarget.
	 * 
	 * @param resourcePool
	 */
	public void setResourcePool(
			com.vmware.vim.ResourcePoolRuntimeInfo resourcePool) {
		this.resourcePool = resourcePool;
	}

	/**
	 * Gets the autoVmotion value for this ConfigTarget.
	 * 
	 * @return autoVmotion
	 */
	public java.lang.Boolean getAutoVmotion() {
		return autoVmotion;
	}

	/**
	 * Sets the autoVmotion value for this ConfigTarget.
	 * 
	 * @param autoVmotion
	 */
	public void setAutoVmotion(java.lang.Boolean autoVmotion) {
		this.autoVmotion = autoVmotion;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ConfigTarget)) {
			return false;
		}
		ConfigTarget other = (ConfigTarget) obj;
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
				&& this.numCpus == other.getNumCpus()
				&& this.numCpuCores == other.getNumCpuCores()
				&& this.numNumaNodes == other.getNumNumaNodes()
				&& ((this.datastore == null && other.getDatastore() == null) || (this.datastore != null && java.util.Arrays
						.equals(this.datastore, other.getDatastore())))
				&& ((this.network == null && other.getNetwork() == null) || (this.network != null && java.util.Arrays
						.equals(this.network, other.getNetwork())))
				&& ((this.cdRom == null && other.getCdRom() == null) || (this.cdRom != null && java.util.Arrays
						.equals(this.cdRom, other.getCdRom())))
				&& ((this.serial == null && other.getSerial() == null) || (this.serial != null && java.util.Arrays
						.equals(this.serial, other.getSerial())))
				&& ((this.parallel == null && other.getParallel() == null) || (this.parallel != null && java.util.Arrays
						.equals(this.parallel, other.getParallel())))
				&& ((this.floppy == null && other.getFloppy() == null) || (this.floppy != null && java.util.Arrays
						.equals(this.floppy, other.getFloppy())))
				&& ((this.legacyNetworkInfo == null && other
						.getLegacyNetworkInfo() == null) || (this.legacyNetworkInfo != null && java.util.Arrays
						.equals(this.legacyNetworkInfo, other
								.getLegacyNetworkInfo())))
				&& ((this.scsiPassthrough == null && other.getScsiPassthrough() == null) || (this.scsiPassthrough != null && java.util.Arrays
						.equals(this.scsiPassthrough, other
								.getScsiPassthrough())))
				&& ((this.scsiDisk == null && other.getScsiDisk() == null) || (this.scsiDisk != null && java.util.Arrays
						.equals(this.scsiDisk, other.getScsiDisk())))
				&& ((this.ideDisk == null && other.getIdeDisk() == null) || (this.ideDisk != null && java.util.Arrays
						.equals(this.ideDisk, other.getIdeDisk())))
				&& this.maxMemMBOptimalPerf == other.getMaxMemMBOptimalPerf()
				&& ((this.resourcePool == null && other.getResourcePool() == null) || (this.resourcePool != null && this.resourcePool
						.equals(other.getResourcePool())))
				&& ((this.autoVmotion == null && other.getAutoVmotion() == null) || (this.autoVmotion != null && this.autoVmotion
						.equals(other.getAutoVmotion())));
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
		_hashCode += getNumCpus();
		_hashCode += getNumCpuCores();
		_hashCode += getNumNumaNodes();
		if (getDatastore() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getDatastore()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getDatastore(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getNetwork() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getNetwork()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getNetwork(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getCdRom() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getCdRom()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getCdRom(),
						i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getSerial() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getSerial()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getSerial(),
						i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getParallel() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getParallel()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getParallel(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getFloppy() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getFloppy()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getFloppy(),
						i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getLegacyNetworkInfo() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getLegacyNetworkInfo()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getLegacyNetworkInfo(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getScsiPassthrough() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getScsiPassthrough()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getScsiPassthrough(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getScsiDisk() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getScsiDisk()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getScsiDisk(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getIdeDisk() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getIdeDisk()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getIdeDisk(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		_hashCode += getMaxMemMBOptimalPerf();
		if (getResourcePool() != null) {
			_hashCode += getResourcePool().hashCode();
		}
		if (getAutoVmotion() != null) {
			_hashCode += getAutoVmotion().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			ConfigTarget.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ConfigTarget"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("numCpus");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"numCpus"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("numCpuCores");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"numCpuCores"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("numNumaNodes");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"numNumaNodes"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("datastore");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"datastore"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"VirtualMachineDatastoreInfo"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("network");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"network"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"VirtualMachineNetworkInfo"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("cdRom");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim2", "cdRom"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"VirtualMachineCdromInfo"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("serial");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim2", "serial"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"VirtualMachineSerialInfo"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("parallel");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"parallel"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"VirtualMachineParallelInfo"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("floppy");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim2", "floppy"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"VirtualMachineFloppyInfo"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("legacyNetworkInfo");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"legacyNetworkInfo"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"VirtualMachineLegacyNetworkSwitchInfo"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("scsiPassthrough");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"scsiPassthrough"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"VirtualMachineScsiPassthroughInfo"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("scsiDisk");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"scsiDisk"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"VirtualMachineScsiDiskDeviceInfo"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("ideDisk");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"ideDisk"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"VirtualMachineIdeDiskDeviceInfo"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("maxMemMBOptimalPerf");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"maxMemMBOptimalPerf"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("resourcePool");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"resourcePool"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ResourcePoolRuntimeInfo"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("autoVmotion");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"autoVmotion"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
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
