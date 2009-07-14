/**
 * ArrayOfHostCpuPackage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class ArrayOfHostCpuPackage implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim.HostCpuPackage[] hostCpuPackage;

	public ArrayOfHostCpuPackage() {
	}

	public ArrayOfHostCpuPackage(com.vmware.vim.HostCpuPackage[] hostCpuPackage) {
		this.hostCpuPackage = hostCpuPackage;
	}

	/**
	 * Gets the hostCpuPackage value for this ArrayOfHostCpuPackage.
	 * 
	 * @return hostCpuPackage
	 */
	public com.vmware.vim.HostCpuPackage[] getHostCpuPackage() {
		return hostCpuPackage;
	}

	/**
	 * Sets the hostCpuPackage value for this ArrayOfHostCpuPackage.
	 * 
	 * @param hostCpuPackage
	 */
	public void setHostCpuPackage(com.vmware.vim.HostCpuPackage[] hostCpuPackage) {
		this.hostCpuPackage = hostCpuPackage;
	}

	public com.vmware.vim.HostCpuPackage getHostCpuPackage(int i) {
		return this.hostCpuPackage[i];
	}

	public void setHostCpuPackage(int i, com.vmware.vim.HostCpuPackage _value) {
		this.hostCpuPackage[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfHostCpuPackage)) {
			return false;
		}
		ArrayOfHostCpuPackage other = (ArrayOfHostCpuPackage) obj;
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
		_equals = true && ((this.hostCpuPackage == null && other
				.getHostCpuPackage() == null) || (this.hostCpuPackage != null && java.util.Arrays
				.equals(this.hostCpuPackage, other.getHostCpuPackage())));
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
		if (getHostCpuPackage() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getHostCpuPackage()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getHostCpuPackage(), i);
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
			ArrayOfHostCpuPackage.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ArrayOfHostCpuPackage"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("hostCpuPackage");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"HostCpuPackage"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"HostCpuPackage"));
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
