/**
 * VirtualMachineFileLayout.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class VirtualMachineFileLayout extends com.vmware.vim.DynamicData
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String[] configFile;

	private java.lang.String[] logFile;

	private com.vmware.vim.VirtualMachineFileLayoutDiskLayout[] disk;

	private com.vmware.vim.VirtualMachineFileLayoutSnapshotLayout[] snapshot;

	private java.lang.String swapFile;

	public VirtualMachineFileLayout() {
	}

	public VirtualMachineFileLayout(java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty,
			java.lang.String[] configFile, java.lang.String[] logFile,
			com.vmware.vim.VirtualMachineFileLayoutDiskLayout[] disk,
			com.vmware.vim.VirtualMachineFileLayoutSnapshotLayout[] snapshot,
			java.lang.String swapFile) {
		super(dynamicType, dynamicProperty);
		this.configFile = configFile;
		this.logFile = logFile;
		this.disk = disk;
		this.snapshot = snapshot;
		this.swapFile = swapFile;
	}

	/**
	 * Gets the configFile value for this VirtualMachineFileLayout.
	 * 
	 * @return configFile
	 */
	public java.lang.String[] getConfigFile() {
		return configFile;
	}

	/**
	 * Sets the configFile value for this VirtualMachineFileLayout.
	 * 
	 * @param configFile
	 */
	public void setConfigFile(java.lang.String[] configFile) {
		this.configFile = configFile;
	}

	public java.lang.String getConfigFile(int i) {
		return this.configFile[i];
	}

	public void setConfigFile(int i, java.lang.String _value) {
		this.configFile[i] = _value;
	}

	/**
	 * Gets the logFile value for this VirtualMachineFileLayout.
	 * 
	 * @return logFile
	 */
	public java.lang.String[] getLogFile() {
		return logFile;
	}

	/**
	 * Sets the logFile value for this VirtualMachineFileLayout.
	 * 
	 * @param logFile
	 */
	public void setLogFile(java.lang.String[] logFile) {
		this.logFile = logFile;
	}

	public java.lang.String getLogFile(int i) {
		return this.logFile[i];
	}

	public void setLogFile(int i, java.lang.String _value) {
		this.logFile[i] = _value;
	}

	/**
	 * Gets the disk value for this VirtualMachineFileLayout.
	 * 
	 * @return disk
	 */
	public com.vmware.vim.VirtualMachineFileLayoutDiskLayout[] getDisk() {
		return disk;
	}

	/**
	 * Sets the disk value for this VirtualMachineFileLayout.
	 * 
	 * @param disk
	 */
	public void setDisk(com.vmware.vim.VirtualMachineFileLayoutDiskLayout[] disk) {
		this.disk = disk;
	}

	public com.vmware.vim.VirtualMachineFileLayoutDiskLayout getDisk(int i) {
		return this.disk[i];
	}

	public void setDisk(int i,
			com.vmware.vim.VirtualMachineFileLayoutDiskLayout _value) {
		this.disk[i] = _value;
	}

	/**
	 * Gets the snapshot value for this VirtualMachineFileLayout.
	 * 
	 * @return snapshot
	 */
	public com.vmware.vim.VirtualMachineFileLayoutSnapshotLayout[] getSnapshot() {
		return snapshot;
	}

	/**
	 * Sets the snapshot value for this VirtualMachineFileLayout.
	 * 
	 * @param snapshot
	 */
	public void setSnapshot(
			com.vmware.vim.VirtualMachineFileLayoutSnapshotLayout[] snapshot) {
		this.snapshot = snapshot;
	}

	public com.vmware.vim.VirtualMachineFileLayoutSnapshotLayout getSnapshot(
			int i) {
		return this.snapshot[i];
	}

	public void setSnapshot(int i,
			com.vmware.vim.VirtualMachineFileLayoutSnapshotLayout _value) {
		this.snapshot[i] = _value;
	}

	/**
	 * Gets the swapFile value for this VirtualMachineFileLayout.
	 * 
	 * @return swapFile
	 */
	public java.lang.String getSwapFile() {
		return swapFile;
	}

	/**
	 * Sets the swapFile value for this VirtualMachineFileLayout.
	 * 
	 * @param swapFile
	 */
	public void setSwapFile(java.lang.String swapFile) {
		this.swapFile = swapFile;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof VirtualMachineFileLayout)) {
			return false;
		}
		VirtualMachineFileLayout other = (VirtualMachineFileLayout) obj;
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
				&& ((this.configFile == null && other.getConfigFile() == null) || (this.configFile != null && java.util.Arrays
						.equals(this.configFile, other.getConfigFile())))
				&& ((this.logFile == null && other.getLogFile() == null) || (this.logFile != null && java.util.Arrays
						.equals(this.logFile, other.getLogFile())))
				&& ((this.disk == null && other.getDisk() == null) || (this.disk != null && java.util.Arrays
						.equals(this.disk, other.getDisk())))
				&& ((this.snapshot == null && other.getSnapshot() == null) || (this.snapshot != null && java.util.Arrays
						.equals(this.snapshot, other.getSnapshot())))
				&& ((this.swapFile == null && other.getSwapFile() == null) || (this.swapFile != null && this.swapFile
						.equals(other.getSwapFile())));
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
		if (getConfigFile() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getConfigFile()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getConfigFile(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getLogFile() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getLogFile()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getLogFile(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getDisk() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getDisk()); i++) {
				java.lang.Object obj = java.lang.reflect.Array
						.get(getDisk(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getSnapshot() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getSnapshot()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getSnapshot(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getSwapFile() != null) {
			_hashCode += getSwapFile().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			VirtualMachineFileLayout.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"VirtualMachineFileLayout"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("configFile");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"configFile"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("logFile");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"logFile"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("disk");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "disk"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"VirtualMachineFileLayoutDiskLayout"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("snapshot");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"snapshot"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"VirtualMachineFileLayoutSnapshotLayout"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("swapFile");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"swapFile"));
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
