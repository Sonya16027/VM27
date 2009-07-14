/**
 * ArrayOfVirtualMachineFloppyInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class ArrayOfVirtualMachineFloppyInfo implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim.VirtualMachineFloppyInfo[] virtualMachineFloppyInfo;

	public ArrayOfVirtualMachineFloppyInfo() {
	}

	public ArrayOfVirtualMachineFloppyInfo(
			com.vmware.vim.VirtualMachineFloppyInfo[] virtualMachineFloppyInfo) {
		this.virtualMachineFloppyInfo = virtualMachineFloppyInfo;
	}

	/**
	 * Gets the virtualMachineFloppyInfo value for this
	 * ArrayOfVirtualMachineFloppyInfo.
	 * 
	 * @return virtualMachineFloppyInfo
	 */
	public com.vmware.vim.VirtualMachineFloppyInfo[] getVirtualMachineFloppyInfo() {
		return virtualMachineFloppyInfo;
	}

	/**
	 * Sets the virtualMachineFloppyInfo value for this
	 * ArrayOfVirtualMachineFloppyInfo.
	 * 
	 * @param virtualMachineFloppyInfo
	 */
	public void setVirtualMachineFloppyInfo(
			com.vmware.vim.VirtualMachineFloppyInfo[] virtualMachineFloppyInfo) {
		this.virtualMachineFloppyInfo = virtualMachineFloppyInfo;
	}

	public com.vmware.vim.VirtualMachineFloppyInfo getVirtualMachineFloppyInfo(
			int i) {
		return this.virtualMachineFloppyInfo[i];
	}

	public void setVirtualMachineFloppyInfo(int i,
			com.vmware.vim.VirtualMachineFloppyInfo _value) {
		this.virtualMachineFloppyInfo[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfVirtualMachineFloppyInfo)) {
			return false;
		}
		ArrayOfVirtualMachineFloppyInfo other = (ArrayOfVirtualMachineFloppyInfo) obj;
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
		_equals = true && ((this.virtualMachineFloppyInfo == null && other
				.getVirtualMachineFloppyInfo() == null) || (this.virtualMachineFloppyInfo != null && java.util.Arrays
				.equals(this.virtualMachineFloppyInfo, other
						.getVirtualMachineFloppyInfo())));
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
		if (getVirtualMachineFloppyInfo() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getVirtualMachineFloppyInfo()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getVirtualMachineFloppyInfo(), i);
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
			ArrayOfVirtualMachineFloppyInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ArrayOfVirtualMachineFloppyInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("virtualMachineFloppyInfo");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"VirtualMachineFloppyInfo"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"VirtualMachineFloppyInfo"));
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
