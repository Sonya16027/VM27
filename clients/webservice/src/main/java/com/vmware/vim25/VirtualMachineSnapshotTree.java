/**
 * VirtualMachineSnapshotTree.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VirtualMachineSnapshotTree extends com.vmware.vim25.DynamicData
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.ManagedObjectReference snapshot;

	private com.vmware.vim25.ManagedObjectReference vm;

	private java.lang.String name;

	private java.lang.String description;

	private java.lang.Integer id;

	private java.util.Calendar createTime;

	private com.vmware.vim25.VirtualMachinePowerState state;

	private boolean quiesced;

	private java.lang.String backupManifest;

	private com.vmware.vim25.VirtualMachineSnapshotTree[] childSnapshotList;

	private java.lang.Boolean replaySupported;

	public VirtualMachineSnapshotTree() {
	}

	public VirtualMachineSnapshotTree(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			com.vmware.vim25.ManagedObjectReference snapshot,
			com.vmware.vim25.ManagedObjectReference vm, java.lang.String name,
			java.lang.String description, java.lang.Integer id,
			java.util.Calendar createTime,
			com.vmware.vim25.VirtualMachinePowerState state, boolean quiesced,
			java.lang.String backupManifest,
			com.vmware.vim25.VirtualMachineSnapshotTree[] childSnapshotList,
			java.lang.Boolean replaySupported) {
		super(dynamicType, dynamicProperty);
		this.snapshot = snapshot;
		this.vm = vm;
		this.name = name;
		this.description = description;
		this.id = id;
		this.createTime = createTime;
		this.state = state;
		this.quiesced = quiesced;
		this.backupManifest = backupManifest;
		this.childSnapshotList = childSnapshotList;
		this.replaySupported = replaySupported;
	}

	/**
	 * Gets the snapshot value for this VirtualMachineSnapshotTree.
	 * 
	 * @return snapshot
	 */
	public com.vmware.vim25.ManagedObjectReference getSnapshot() {
		return snapshot;
	}

	/**
	 * Sets the snapshot value for this VirtualMachineSnapshotTree.
	 * 
	 * @param snapshot
	 */
	public void setSnapshot(com.vmware.vim25.ManagedObjectReference snapshot) {
		this.snapshot = snapshot;
	}

	/**
	 * Gets the vm value for this VirtualMachineSnapshotTree.
	 * 
	 * @return vm
	 */
	public com.vmware.vim25.ManagedObjectReference getVm() {
		return vm;
	}

	/**
	 * Sets the vm value for this VirtualMachineSnapshotTree.
	 * 
	 * @param vm
	 */
	public void setVm(com.vmware.vim25.ManagedObjectReference vm) {
		this.vm = vm;
	}

	/**
	 * Gets the name value for this VirtualMachineSnapshotTree.
	 * 
	 * @return name
	 */
	public java.lang.String getName() {
		return name;
	}

	/**
	 * Sets the name value for this VirtualMachineSnapshotTree.
	 * 
	 * @param name
	 */
	public void setName(java.lang.String name) {
		this.name = name;
	}

	/**
	 * Gets the description value for this VirtualMachineSnapshotTree.
	 * 
	 * @return description
	 */
	public java.lang.String getDescription() {
		return description;
	}

	/**
	 * Sets the description value for this VirtualMachineSnapshotTree.
	 * 
	 * @param description
	 */
	public void setDescription(java.lang.String description) {
		this.description = description;
	}

	/**
	 * Gets the id value for this VirtualMachineSnapshotTree.
	 * 
	 * @return id
	 */
	public java.lang.Integer getId() {
		return id;
	}

	/**
	 * Sets the id value for this VirtualMachineSnapshotTree.
	 * 
	 * @param id
	 */
	public void setId(java.lang.Integer id) {
		this.id = id;
	}

	/**
	 * Gets the createTime value for this VirtualMachineSnapshotTree.
	 * 
	 * @return createTime
	 */
	public java.util.Calendar getCreateTime() {
		return createTime;
	}

	/**
	 * Sets the createTime value for this VirtualMachineSnapshotTree.
	 * 
	 * @param createTime
	 */
	public void setCreateTime(java.util.Calendar createTime) {
		this.createTime = createTime;
	}

	/**
	 * Gets the state value for this VirtualMachineSnapshotTree.
	 * 
	 * @return state
	 */
	public com.vmware.vim25.VirtualMachinePowerState getState() {
		return state;
	}

	/**
	 * Sets the state value for this VirtualMachineSnapshotTree.
	 * 
	 * @param state
	 */
	public void setState(com.vmware.vim25.VirtualMachinePowerState state) {
		this.state = state;
	}

	/**
	 * Gets the quiesced value for this VirtualMachineSnapshotTree.
	 * 
	 * @return quiesced
	 */
	public boolean isQuiesced() {
		return quiesced;
	}

	/**
	 * Sets the quiesced value for this VirtualMachineSnapshotTree.
	 * 
	 * @param quiesced
	 */
	public void setQuiesced(boolean quiesced) {
		this.quiesced = quiesced;
	}

	/**
	 * Gets the backupManifest value for this VirtualMachineSnapshotTree.
	 * 
	 * @return backupManifest
	 */
	public java.lang.String getBackupManifest() {
		return backupManifest;
	}

	/**
	 * Sets the backupManifest value for this VirtualMachineSnapshotTree.
	 * 
	 * @param backupManifest
	 */
	public void setBackupManifest(java.lang.String backupManifest) {
		this.backupManifest = backupManifest;
	}

	/**
	 * Gets the childSnapshotList value for this VirtualMachineSnapshotTree.
	 * 
	 * @return childSnapshotList
	 */
	public com.vmware.vim25.VirtualMachineSnapshotTree[] getChildSnapshotList() {
		return childSnapshotList;
	}

	/**
	 * Sets the childSnapshotList value for this VirtualMachineSnapshotTree.
	 * 
	 * @param childSnapshotList
	 */
	public void setChildSnapshotList(
			com.vmware.vim25.VirtualMachineSnapshotTree[] childSnapshotList) {
		this.childSnapshotList = childSnapshotList;
	}

	public com.vmware.vim25.VirtualMachineSnapshotTree getChildSnapshotList(
			int i) {
		return this.childSnapshotList[i];
	}

	public void setChildSnapshotList(int i,
			com.vmware.vim25.VirtualMachineSnapshotTree _value) {
		this.childSnapshotList[i] = _value;
	}

	/**
	 * Gets the replaySupported value for this VirtualMachineSnapshotTree.
	 * 
	 * @return replaySupported
	 */
	public java.lang.Boolean getReplaySupported() {
		return replaySupported;
	}

	/**
	 * Sets the replaySupported value for this VirtualMachineSnapshotTree.
	 * 
	 * @param replaySupported
	 */
	public void setReplaySupported(java.lang.Boolean replaySupported) {
		this.replaySupported = replaySupported;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof VirtualMachineSnapshotTree)) {
			return false;
		}
		VirtualMachineSnapshotTree other = (VirtualMachineSnapshotTree) obj;
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
				&& ((this.snapshot == null && other.getSnapshot() == null) || (this.snapshot != null && this.snapshot
						.equals(other.getSnapshot())))
				&& ((this.vm == null && other.getVm() == null) || (this.vm != null && this.vm
						.equals(other.getVm())))
				&& ((this.name == null && other.getName() == null) || (this.name != null && this.name
						.equals(other.getName())))
				&& ((this.description == null && other.getDescription() == null) || (this.description != null && this.description
						.equals(other.getDescription())))
				&& ((this.id == null && other.getId() == null) || (this.id != null && this.id
						.equals(other.getId())))
				&& ((this.createTime == null && other.getCreateTime() == null) || (this.createTime != null && this.createTime
						.equals(other.getCreateTime())))
				&& ((this.state == null && other.getState() == null) || (this.state != null && this.state
						.equals(other.getState())))
				&& this.quiesced == other.isQuiesced()
				&& ((this.backupManifest == null && other.getBackupManifest() == null) || (this.backupManifest != null && this.backupManifest
						.equals(other.getBackupManifest())))
				&& ((this.childSnapshotList == null && other
						.getChildSnapshotList() == null) || (this.childSnapshotList != null && java.util.Arrays
						.equals(this.childSnapshotList, other
								.getChildSnapshotList())))
				&& ((this.replaySupported == null && other.getReplaySupported() == null) || (this.replaySupported != null && this.replaySupported
						.equals(other.getReplaySupported())));
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
		if (getSnapshot() != null) {
			_hashCode += getSnapshot().hashCode();
		}
		if (getVm() != null) {
			_hashCode += getVm().hashCode();
		}
		if (getName() != null) {
			_hashCode += getName().hashCode();
		}
		if (getDescription() != null) {
			_hashCode += getDescription().hashCode();
		}
		if (getId() != null) {
			_hashCode += getId().hashCode();
		}
		if (getCreateTime() != null) {
			_hashCode += getCreateTime().hashCode();
		}
		if (getState() != null) {
			_hashCode += getState().hashCode();
		}
		_hashCode += (isQuiesced() ? Boolean.TRUE : Boolean.FALSE).hashCode();
		if (getBackupManifest() != null) {
			_hashCode += getBackupManifest().hashCode();
		}
		if (getChildSnapshotList() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getChildSnapshotList()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getChildSnapshotList(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getReplaySupported() != null) {
			_hashCode += getReplaySupported().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			VirtualMachineSnapshotTree.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VirtualMachineSnapshotTree"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("snapshot");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"snapshot"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("vm");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vm"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("name");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "name"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("description");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"description"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("id");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "id"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("createTime");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"createTime"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "dateTime"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("state");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "state"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VirtualMachinePowerState"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("quiesced");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"quiesced"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("backupManifest");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"backupManifest"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("childSnapshotList");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"childSnapshotList"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VirtualMachineSnapshotTree"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("replaySupported");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"replaySupported"));
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
