/**
 * ArrayOfVirtualMachineFileLayoutDiskLayout.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class ArrayOfVirtualMachineFileLayoutDiskLayout implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim.VirtualMachineFileLayoutDiskLayout[] virtualMachineFileLayoutDiskLayout;

	public ArrayOfVirtualMachineFileLayoutDiskLayout() {
	}

	public ArrayOfVirtualMachineFileLayoutDiskLayout(
			com.vmware.vim.VirtualMachineFileLayoutDiskLayout[] virtualMachineFileLayoutDiskLayout) {
		this.virtualMachineFileLayoutDiskLayout = virtualMachineFileLayoutDiskLayout;
	}

	/**
	 * Gets the virtualMachineFileLayoutDiskLayout value for this
	 * ArrayOfVirtualMachineFileLayoutDiskLayout.
	 * 
	 * @return virtualMachineFileLayoutDiskLayout
	 */
	public com.vmware.vim.VirtualMachineFileLayoutDiskLayout[] getVirtualMachineFileLayoutDiskLayout() {
		return virtualMachineFileLayoutDiskLayout;
	}

	/**
	 * Sets the virtualMachineFileLayoutDiskLayout value for this
	 * ArrayOfVirtualMachineFileLayoutDiskLayout.
	 * 
	 * @param virtualMachineFileLayoutDiskLayout
	 */
	public void setVirtualMachineFileLayoutDiskLayout(
			com.vmware.vim.VirtualMachineFileLayoutDiskLayout[] virtualMachineFileLayoutDiskLayout) {
		this.virtualMachineFileLayoutDiskLayout = virtualMachineFileLayoutDiskLayout;
	}

	public com.vmware.vim.VirtualMachineFileLayoutDiskLayout getVirtualMachineFileLayoutDiskLayout(
			int i) {
		return this.virtualMachineFileLayoutDiskLayout[i];
	}

	public void setVirtualMachineFileLayoutDiskLayout(int i,
			com.vmware.vim.VirtualMachineFileLayoutDiskLayout _value) {
		this.virtualMachineFileLayoutDiskLayout[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfVirtualMachineFileLayoutDiskLayout)) {
			return false;
		}
		ArrayOfVirtualMachineFileLayoutDiskLayout other = (ArrayOfVirtualMachineFileLayoutDiskLayout) obj;
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
		_equals = true && ((this.virtualMachineFileLayoutDiskLayout == null && other
				.getVirtualMachineFileLayoutDiskLayout() == null) || (this.virtualMachineFileLayoutDiskLayout != null && java.util.Arrays
				.equals(this.virtualMachineFileLayoutDiskLayout, other
						.getVirtualMachineFileLayoutDiskLayout())));
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
		if (getVirtualMachineFileLayoutDiskLayout() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getVirtualMachineFileLayoutDiskLayout()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getVirtualMachineFileLayoutDiskLayout(), i);
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
			ArrayOfVirtualMachineFileLayoutDiskLayout.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ArrayOfVirtualMachineFileLayoutDiskLayout"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("virtualMachineFileLayoutDiskLayout");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"VirtualMachineFileLayoutDiskLayout"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"VirtualMachineFileLayoutDiskLayout"));
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
