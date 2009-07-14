/**
 * ArrayOfHostIpConfigIpV6Address.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfHostIpConfigIpV6Address implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.HostIpConfigIpV6Address[] hostIpConfigIpV6Address;

	public ArrayOfHostIpConfigIpV6Address() {
	}

	public ArrayOfHostIpConfigIpV6Address(
			com.vmware.vim25.HostIpConfigIpV6Address[] hostIpConfigIpV6Address) {
		this.hostIpConfigIpV6Address = hostIpConfigIpV6Address;
	}

	/**
	 * Gets the hostIpConfigIpV6Address value for this
	 * ArrayOfHostIpConfigIpV6Address.
	 * 
	 * @return hostIpConfigIpV6Address
	 */
	public com.vmware.vim25.HostIpConfigIpV6Address[] getHostIpConfigIpV6Address() {
		return hostIpConfigIpV6Address;
	}

	/**
	 * Sets the hostIpConfigIpV6Address value for this
	 * ArrayOfHostIpConfigIpV6Address.
	 * 
	 * @param hostIpConfigIpV6Address
	 */
	public void setHostIpConfigIpV6Address(
			com.vmware.vim25.HostIpConfigIpV6Address[] hostIpConfigIpV6Address) {
		this.hostIpConfigIpV6Address = hostIpConfigIpV6Address;
	}

	public com.vmware.vim25.HostIpConfigIpV6Address getHostIpConfigIpV6Address(
			int i) {
		return this.hostIpConfigIpV6Address[i];
	}

	public void setHostIpConfigIpV6Address(int i,
			com.vmware.vim25.HostIpConfigIpV6Address _value) {
		this.hostIpConfigIpV6Address[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfHostIpConfigIpV6Address)) {
			return false;
		}
		ArrayOfHostIpConfigIpV6Address other = (ArrayOfHostIpConfigIpV6Address) obj;
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
		_equals = true && ((this.hostIpConfigIpV6Address == null && other
				.getHostIpConfigIpV6Address() == null) || (this.hostIpConfigIpV6Address != null && java.util.Arrays
				.equals(this.hostIpConfigIpV6Address, other
						.getHostIpConfigIpV6Address())));
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
		if (getHostIpConfigIpV6Address() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getHostIpConfigIpV6Address()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getHostIpConfigIpV6Address(), i);
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
			ArrayOfHostIpConfigIpV6Address.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ArrayOfHostIpConfigIpV6Address"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("hostIpConfigIpV6Address");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"HostIpConfigIpV6Address"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostIpConfigIpV6Address"));
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
