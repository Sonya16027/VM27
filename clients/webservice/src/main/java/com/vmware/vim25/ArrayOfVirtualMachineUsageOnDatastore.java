/**
 * ArrayOfVirtualMachineUsageOnDatastore.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfVirtualMachineUsageOnDatastore implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.VirtualMachineUsageOnDatastore[] virtualMachineUsageOnDatastore;

	public ArrayOfVirtualMachineUsageOnDatastore() {
	}

	public ArrayOfVirtualMachineUsageOnDatastore(
			com.vmware.vim25.VirtualMachineUsageOnDatastore[] virtualMachineUsageOnDatastore) {
		this.virtualMachineUsageOnDatastore = virtualMachineUsageOnDatastore;
	}

	/**
	 * Gets the virtualMachineUsageOnDatastore value for this
	 * ArrayOfVirtualMachineUsageOnDatastore.
	 * 
	 * @return virtualMachineUsageOnDatastore
	 */
	public com.vmware.vim25.VirtualMachineUsageOnDatastore[] getVirtualMachineUsageOnDatastore() {
		return virtualMachineUsageOnDatastore;
	}

	/**
	 * Sets the virtualMachineUsageOnDatastore value for this
	 * ArrayOfVirtualMachineUsageOnDatastore.
	 * 
	 * @param virtualMachineUsageOnDatastore
	 */
	public void setVirtualMachineUsageOnDatastore(
			com.vmware.vim25.VirtualMachineUsageOnDatastore[] virtualMachineUsageOnDatastore) {
		this.virtualMachineUsageOnDatastore = virtualMachineUsageOnDatastore;
	}

	public com.vmware.vim25.VirtualMachineUsageOnDatastore getVirtualMachineUsageOnDatastore(
			int i) {
		return this.virtualMachineUsageOnDatastore[i];
	}

	public void setVirtualMachineUsageOnDatastore(int i,
			com.vmware.vim25.VirtualMachineUsageOnDatastore _value) {
		this.virtualMachineUsageOnDatastore[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfVirtualMachineUsageOnDatastore)) {
			return false;
		}
		ArrayOfVirtualMachineUsageOnDatastore other = (ArrayOfVirtualMachineUsageOnDatastore) obj;
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
		_equals = true && ((this.virtualMachineUsageOnDatastore == null && other
				.getVirtualMachineUsageOnDatastore() == null) || (this.virtualMachineUsageOnDatastore != null && java.util.Arrays
				.equals(this.virtualMachineUsageOnDatastore, other
						.getVirtualMachineUsageOnDatastore())));
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
		if (getVirtualMachineUsageOnDatastore() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getVirtualMachineUsageOnDatastore()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getVirtualMachineUsageOnDatastore(), i);
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
			ArrayOfVirtualMachineUsageOnDatastore.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ArrayOfVirtualMachineUsageOnDatastore"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("virtualMachineUsageOnDatastore");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"VirtualMachineUsageOnDatastore"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VirtualMachineUsageOnDatastore"));
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
