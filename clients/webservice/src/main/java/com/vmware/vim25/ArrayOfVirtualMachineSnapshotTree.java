/**
 * ArrayOfVirtualMachineSnapshotTree.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfVirtualMachineSnapshotTree implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.VirtualMachineSnapshotTree[] virtualMachineSnapshotTree;

	public ArrayOfVirtualMachineSnapshotTree() {
	}

	public ArrayOfVirtualMachineSnapshotTree(
			com.vmware.vim25.VirtualMachineSnapshotTree[] virtualMachineSnapshotTree) {
		this.virtualMachineSnapshotTree = virtualMachineSnapshotTree;
	}

	/**
	 * Gets the virtualMachineSnapshotTree value for this
	 * ArrayOfVirtualMachineSnapshotTree.
	 * 
	 * @return virtualMachineSnapshotTree
	 */
	public com.vmware.vim25.VirtualMachineSnapshotTree[] getVirtualMachineSnapshotTree() {
		return virtualMachineSnapshotTree;
	}

	/**
	 * Sets the virtualMachineSnapshotTree value for this
	 * ArrayOfVirtualMachineSnapshotTree.
	 * 
	 * @param virtualMachineSnapshotTree
	 */
	public void setVirtualMachineSnapshotTree(
			com.vmware.vim25.VirtualMachineSnapshotTree[] virtualMachineSnapshotTree) {
		this.virtualMachineSnapshotTree = virtualMachineSnapshotTree;
	}

	public com.vmware.vim25.VirtualMachineSnapshotTree getVirtualMachineSnapshotTree(
			int i) {
		return this.virtualMachineSnapshotTree[i];
	}

	public void setVirtualMachineSnapshotTree(int i,
			com.vmware.vim25.VirtualMachineSnapshotTree _value) {
		this.virtualMachineSnapshotTree[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfVirtualMachineSnapshotTree)) {
			return false;
		}
		ArrayOfVirtualMachineSnapshotTree other = (ArrayOfVirtualMachineSnapshotTree) obj;
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
		_equals = true && ((this.virtualMachineSnapshotTree == null && other
				.getVirtualMachineSnapshotTree() == null) || (this.virtualMachineSnapshotTree != null && java.util.Arrays
				.equals(this.virtualMachineSnapshotTree, other
						.getVirtualMachineSnapshotTree())));
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
		int _hashCode = 1;
		if (getVirtualMachineSnapshotTree() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getVirtualMachineSnapshotTree()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getVirtualMachineSnapshotTree(), i);
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
			ArrayOfVirtualMachineSnapshotTree.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ArrayOfVirtualMachineSnapshotTree"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("virtualMachineSnapshotTree");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"VirtualMachineSnapshotTree"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VirtualMachineSnapshotTree"));
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
