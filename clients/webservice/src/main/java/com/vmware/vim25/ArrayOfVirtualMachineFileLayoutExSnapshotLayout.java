/**
 * ArrayOfVirtualMachineFileLayoutExSnapshotLayout.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfVirtualMachineFileLayoutExSnapshotLayout implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.VirtualMachineFileLayoutExSnapshotLayout[] virtualMachineFileLayoutExSnapshotLayout;

	public ArrayOfVirtualMachineFileLayoutExSnapshotLayout() {
	}

	public ArrayOfVirtualMachineFileLayoutExSnapshotLayout(
			com.vmware.vim25.VirtualMachineFileLayoutExSnapshotLayout[] virtualMachineFileLayoutExSnapshotLayout) {
		this.virtualMachineFileLayoutExSnapshotLayout = virtualMachineFileLayoutExSnapshotLayout;
	}

	/**
	 * Gets the virtualMachineFileLayoutExSnapshotLayout value for this
	 * ArrayOfVirtualMachineFileLayoutExSnapshotLayout.
	 * 
	 * @return virtualMachineFileLayoutExSnapshotLayout
	 */
	public com.vmware.vim25.VirtualMachineFileLayoutExSnapshotLayout[] getVirtualMachineFileLayoutExSnapshotLayout() {
		return virtualMachineFileLayoutExSnapshotLayout;
	}

	/**
	 * Sets the virtualMachineFileLayoutExSnapshotLayout value for this
	 * ArrayOfVirtualMachineFileLayoutExSnapshotLayout.
	 * 
	 * @param virtualMachineFileLayoutExSnapshotLayout
	 */
	public void setVirtualMachineFileLayoutExSnapshotLayout(
			com.vmware.vim25.VirtualMachineFileLayoutExSnapshotLayout[] virtualMachineFileLayoutExSnapshotLayout) {
		this.virtualMachineFileLayoutExSnapshotLayout = virtualMachineFileLayoutExSnapshotLayout;
	}

	public com.vmware.vim25.VirtualMachineFileLayoutExSnapshotLayout getVirtualMachineFileLayoutExSnapshotLayout(
			int i) {
		return this.virtualMachineFileLayoutExSnapshotLayout[i];
	}

	public void setVirtualMachineFileLayoutExSnapshotLayout(int i,
			com.vmware.vim25.VirtualMachineFileLayoutExSnapshotLayout _value) {
		this.virtualMachineFileLayoutExSnapshotLayout[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfVirtualMachineFileLayoutExSnapshotLayout)) {
			return false;
		}
		ArrayOfVirtualMachineFileLayoutExSnapshotLayout other = (ArrayOfVirtualMachineFileLayoutExSnapshotLayout) obj;
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
		_equals = true && ((this.virtualMachineFileLayoutExSnapshotLayout == null && other
				.getVirtualMachineFileLayoutExSnapshotLayout() == null) || (this.virtualMachineFileLayoutExSnapshotLayout != null && java.util.Arrays
				.equals(this.virtualMachineFileLayoutExSnapshotLayout, other
						.getVirtualMachineFileLayoutExSnapshotLayout())));
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
		if (getVirtualMachineFileLayoutExSnapshotLayout() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getVirtualMachineFileLayoutExSnapshotLayout()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getVirtualMachineFileLayoutExSnapshotLayout(), i);
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
			ArrayOfVirtualMachineFileLayoutExSnapshotLayout.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ArrayOfVirtualMachineFileLayoutExSnapshotLayout"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("virtualMachineFileLayoutExSnapshotLayout");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"VirtualMachineFileLayoutExSnapshotLayout"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VirtualMachineFileLayoutExSnapshotLayout"));
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
