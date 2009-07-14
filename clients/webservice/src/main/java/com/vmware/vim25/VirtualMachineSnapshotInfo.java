/**
 * VirtualMachineSnapshotInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VirtualMachineSnapshotInfo extends com.vmware.vim25.DynamicData
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.ManagedObjectReference currentSnapshot;

	private com.vmware.vim25.VirtualMachineSnapshotTree[] rootSnapshotList;

	public VirtualMachineSnapshotInfo() {
	}

	public VirtualMachineSnapshotInfo(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			com.vmware.vim25.ManagedObjectReference currentSnapshot,
			com.vmware.vim25.VirtualMachineSnapshotTree[] rootSnapshotList) {
		super(dynamicType, dynamicProperty);
		this.currentSnapshot = currentSnapshot;
		this.rootSnapshotList = rootSnapshotList;
	}

	/**
	 * Gets the currentSnapshot value for this VirtualMachineSnapshotInfo.
	 * 
	 * @return currentSnapshot
	 */
	public com.vmware.vim25.ManagedObjectReference getCurrentSnapshot() {
		return currentSnapshot;
	}

	/**
	 * Sets the currentSnapshot value for this VirtualMachineSnapshotInfo.
	 * 
	 * @param currentSnapshot
	 */
	public void setCurrentSnapshot(
			com.vmware.vim25.ManagedObjectReference currentSnapshot) {
		this.currentSnapshot = currentSnapshot;
	}

	/**
	 * Gets the rootSnapshotList value for this VirtualMachineSnapshotInfo.
	 * 
	 * @return rootSnapshotList
	 */
	public com.vmware.vim25.VirtualMachineSnapshotTree[] getRootSnapshotList() {
		return rootSnapshotList;
	}

	/**
	 * Sets the rootSnapshotList value for this VirtualMachineSnapshotInfo.
	 * 
	 * @param rootSnapshotList
	 */
	public void setRootSnapshotList(
			com.vmware.vim25.VirtualMachineSnapshotTree[] rootSnapshotList) {
		this.rootSnapshotList = rootSnapshotList;
	}

	public com.vmware.vim25.VirtualMachineSnapshotTree getRootSnapshotList(int i) {
		return this.rootSnapshotList[i];
	}

	public void setRootSnapshotList(int i,
			com.vmware.vim25.VirtualMachineSnapshotTree _value) {
		this.rootSnapshotList[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof VirtualMachineSnapshotInfo)) {
			return false;
		}
		VirtualMachineSnapshotInfo other = (VirtualMachineSnapshotInfo) obj;
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
				&& ((this.currentSnapshot == null && other.getCurrentSnapshot() == null) || (this.currentSnapshot != null && this.currentSnapshot
						.equals(other.getCurrentSnapshot())))
				&& ((this.rootSnapshotList == null && other
						.getRootSnapshotList() == null) || (this.rootSnapshotList != null && java.util.Arrays
						.equals(this.rootSnapshotList, other
								.getRootSnapshotList())));
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
		if (getCurrentSnapshot() != null) {
			_hashCode += getCurrentSnapshot().hashCode();
		}
		if (getRootSnapshotList() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getRootSnapshotList()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getRootSnapshotList(), i);
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
			VirtualMachineSnapshotInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VirtualMachineSnapshotInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("currentSnapshot");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"currentSnapshot"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("rootSnapshotList");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"rootSnapshotList"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VirtualMachineSnapshotTree"));
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
