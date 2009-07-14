/**
 * ArrayOfVirtualMachineSoundInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfVirtualMachineSoundInfo implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.VirtualMachineSoundInfo[] virtualMachineSoundInfo;

	public ArrayOfVirtualMachineSoundInfo() {
	}

	public ArrayOfVirtualMachineSoundInfo(
			com.vmware.vim25.VirtualMachineSoundInfo[] virtualMachineSoundInfo) {
		this.virtualMachineSoundInfo = virtualMachineSoundInfo;
	}

	/**
	 * Gets the virtualMachineSoundInfo value for this
	 * ArrayOfVirtualMachineSoundInfo.
	 * 
	 * @return virtualMachineSoundInfo
	 */
	public com.vmware.vim25.VirtualMachineSoundInfo[] getVirtualMachineSoundInfo() {
		return virtualMachineSoundInfo;
	}

	/**
	 * Sets the virtualMachineSoundInfo value for this
	 * ArrayOfVirtualMachineSoundInfo.
	 * 
	 * @param virtualMachineSoundInfo
	 */
	public void setVirtualMachineSoundInfo(
			com.vmware.vim25.VirtualMachineSoundInfo[] virtualMachineSoundInfo) {
		this.virtualMachineSoundInfo = virtualMachineSoundInfo;
	}

	public com.vmware.vim25.VirtualMachineSoundInfo getVirtualMachineSoundInfo(
			int i) {
		return this.virtualMachineSoundInfo[i];
	}

	public void setVirtualMachineSoundInfo(int i,
			com.vmware.vim25.VirtualMachineSoundInfo _value) {
		this.virtualMachineSoundInfo[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfVirtualMachineSoundInfo)) {
			return false;
		}
		ArrayOfVirtualMachineSoundInfo other = (ArrayOfVirtualMachineSoundInfo) obj;
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
		_equals = true && ((this.virtualMachineSoundInfo == null && other
				.getVirtualMachineSoundInfo() == null) || (this.virtualMachineSoundInfo != null && java.util.Arrays
				.equals(this.virtualMachineSoundInfo, other
						.getVirtualMachineSoundInfo())));
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
		if (getVirtualMachineSoundInfo() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getVirtualMachineSoundInfo()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getVirtualMachineSoundInfo(), i);
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
			ArrayOfVirtualMachineSoundInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ArrayOfVirtualMachineSoundInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("virtualMachineSoundInfo");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"VirtualMachineSoundInfo"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VirtualMachineSoundInfo"));
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
