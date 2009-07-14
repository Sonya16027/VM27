/**
 * ArrayOfGuestOsDescriptor.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfGuestOsDescriptor implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.GuestOsDescriptor[] guestOsDescriptor;

	public ArrayOfGuestOsDescriptor() {
	}

	public ArrayOfGuestOsDescriptor(
			com.vmware.vim25.GuestOsDescriptor[] guestOsDescriptor) {
		this.guestOsDescriptor = guestOsDescriptor;
	}

	/**
	 * Gets the guestOsDescriptor value for this ArrayOfGuestOsDescriptor.
	 * 
	 * @return guestOsDescriptor
	 */
	public com.vmware.vim25.GuestOsDescriptor[] getGuestOsDescriptor() {
		return guestOsDescriptor;
	}

	/**
	 * Sets the guestOsDescriptor value for this ArrayOfGuestOsDescriptor.
	 * 
	 * @param guestOsDescriptor
	 */
	public void setGuestOsDescriptor(
			com.vmware.vim25.GuestOsDescriptor[] guestOsDescriptor) {
		this.guestOsDescriptor = guestOsDescriptor;
	}

	public com.vmware.vim25.GuestOsDescriptor getGuestOsDescriptor(int i) {
		return this.guestOsDescriptor[i];
	}

	public void setGuestOsDescriptor(int i,
			com.vmware.vim25.GuestOsDescriptor _value) {
		this.guestOsDescriptor[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfGuestOsDescriptor)) {
			return false;
		}
		ArrayOfGuestOsDescriptor other = (ArrayOfGuestOsDescriptor) obj;
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
		_equals = true && ((this.guestOsDescriptor == null && other
				.getGuestOsDescriptor() == null) || (this.guestOsDescriptor != null && java.util.Arrays
				.equals(this.guestOsDescriptor, other.getGuestOsDescriptor())));
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
		if (getGuestOsDescriptor() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getGuestOsDescriptor()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getGuestOsDescriptor(), i);
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
			ArrayOfGuestOsDescriptor.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ArrayOfGuestOsDescriptor"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("guestOsDescriptor");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"GuestOsDescriptor"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"GuestOsDescriptor"));
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
