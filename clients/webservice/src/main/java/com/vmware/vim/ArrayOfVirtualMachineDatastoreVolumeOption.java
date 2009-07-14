/**
 * ArrayOfVirtualMachineDatastoreVolumeOption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class ArrayOfVirtualMachineDatastoreVolumeOption implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim.VirtualMachineDatastoreVolumeOption[] virtualMachineDatastoreVolumeOption;

	public ArrayOfVirtualMachineDatastoreVolumeOption() {
	}

	public ArrayOfVirtualMachineDatastoreVolumeOption(
			com.vmware.vim.VirtualMachineDatastoreVolumeOption[] virtualMachineDatastoreVolumeOption) {
		this.virtualMachineDatastoreVolumeOption = virtualMachineDatastoreVolumeOption;
	}

	/**
	 * Gets the virtualMachineDatastoreVolumeOption value for this
	 * ArrayOfVirtualMachineDatastoreVolumeOption.
	 * 
	 * @return virtualMachineDatastoreVolumeOption
	 */
	public com.vmware.vim.VirtualMachineDatastoreVolumeOption[] getVirtualMachineDatastoreVolumeOption() {
		return virtualMachineDatastoreVolumeOption;
	}

	/**
	 * Sets the virtualMachineDatastoreVolumeOption value for this
	 * ArrayOfVirtualMachineDatastoreVolumeOption.
	 * 
	 * @param virtualMachineDatastoreVolumeOption
	 */
	public void setVirtualMachineDatastoreVolumeOption(
			com.vmware.vim.VirtualMachineDatastoreVolumeOption[] virtualMachineDatastoreVolumeOption) {
		this.virtualMachineDatastoreVolumeOption = virtualMachineDatastoreVolumeOption;
	}

	public com.vmware.vim.VirtualMachineDatastoreVolumeOption getVirtualMachineDatastoreVolumeOption(
			int i) {
		return this.virtualMachineDatastoreVolumeOption[i];
	}

	public void setVirtualMachineDatastoreVolumeOption(int i,
			com.vmware.vim.VirtualMachineDatastoreVolumeOption _value) {
		this.virtualMachineDatastoreVolumeOption[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfVirtualMachineDatastoreVolumeOption)) {
			return false;
		}
		ArrayOfVirtualMachineDatastoreVolumeOption other = (ArrayOfVirtualMachineDatastoreVolumeOption) obj;
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
		_equals = true && ((this.virtualMachineDatastoreVolumeOption == null && other
				.getVirtualMachineDatastoreVolumeOption() == null) || (this.virtualMachineDatastoreVolumeOption != null && java.util.Arrays
				.equals(this.virtualMachineDatastoreVolumeOption, other
						.getVirtualMachineDatastoreVolumeOption())));
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
		if (getVirtualMachineDatastoreVolumeOption() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getVirtualMachineDatastoreVolumeOption()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getVirtualMachineDatastoreVolumeOption(), i);
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
			ArrayOfVirtualMachineDatastoreVolumeOption.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ArrayOfVirtualMachineDatastoreVolumeOption"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("virtualMachineDatastoreVolumeOption");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"VirtualMachineDatastoreVolumeOption"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"VirtualMachineDatastoreVolumeOption"));
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
