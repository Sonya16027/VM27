/**
 * ArrayOfVirtualMachineScsiPassthroughInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfVirtualMachineScsiPassthroughInfo implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.VirtualMachineScsiPassthroughInfo[] virtualMachineScsiPassthroughInfo;

	public ArrayOfVirtualMachineScsiPassthroughInfo() {
	}

	public ArrayOfVirtualMachineScsiPassthroughInfo(
			com.vmware.vim25.VirtualMachineScsiPassthroughInfo[] virtualMachineScsiPassthroughInfo) {
		this.virtualMachineScsiPassthroughInfo = virtualMachineScsiPassthroughInfo;
	}

	/**
	 * Gets the virtualMachineScsiPassthroughInfo value for this
	 * ArrayOfVirtualMachineScsiPassthroughInfo.
	 * 
	 * @return virtualMachineScsiPassthroughInfo
	 */
	public com.vmware.vim25.VirtualMachineScsiPassthroughInfo[] getVirtualMachineScsiPassthroughInfo() {
		return virtualMachineScsiPassthroughInfo;
	}

	/**
	 * Sets the virtualMachineScsiPassthroughInfo value for this
	 * ArrayOfVirtualMachineScsiPassthroughInfo.
	 * 
	 * @param virtualMachineScsiPassthroughInfo
	 */
	public void setVirtualMachineScsiPassthroughInfo(
			com.vmware.vim25.VirtualMachineScsiPassthroughInfo[] virtualMachineScsiPassthroughInfo) {
		this.virtualMachineScsiPassthroughInfo = virtualMachineScsiPassthroughInfo;
	}

	public com.vmware.vim25.VirtualMachineScsiPassthroughInfo getVirtualMachineScsiPassthroughInfo(
			int i) {
		return this.virtualMachineScsiPassthroughInfo[i];
	}

	public void setVirtualMachineScsiPassthroughInfo(int i,
			com.vmware.vim25.VirtualMachineScsiPassthroughInfo _value) {
		this.virtualMachineScsiPassthroughInfo[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfVirtualMachineScsiPassthroughInfo)) {
			return false;
		}
		ArrayOfVirtualMachineScsiPassthroughInfo other = (ArrayOfVirtualMachineScsiPassthroughInfo) obj;
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
		_equals = true && ((this.virtualMachineScsiPassthroughInfo == null && other
				.getVirtualMachineScsiPassthroughInfo() == null) || (this.virtualMachineScsiPassthroughInfo != null && java.util.Arrays
				.equals(this.virtualMachineScsiPassthroughInfo, other
						.getVirtualMachineScsiPassthroughInfo())));
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
		if (getVirtualMachineScsiPassthroughInfo() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getVirtualMachineScsiPassthroughInfo()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getVirtualMachineScsiPassthroughInfo(), i);
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
			ArrayOfVirtualMachineScsiPassthroughInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ArrayOfVirtualMachineScsiPassthroughInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("virtualMachineScsiPassthroughInfo");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"VirtualMachineScsiPassthroughInfo"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VirtualMachineScsiPassthroughInfo"));
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
