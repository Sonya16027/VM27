/**
 * ArrayOfHostDateTimeSystemTimeZone.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfHostDateTimeSystemTimeZone implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.HostDateTimeSystemTimeZone[] hostDateTimeSystemTimeZone;

	public ArrayOfHostDateTimeSystemTimeZone() {
	}

	public ArrayOfHostDateTimeSystemTimeZone(
			com.vmware.vim25.HostDateTimeSystemTimeZone[] hostDateTimeSystemTimeZone) {
		this.hostDateTimeSystemTimeZone = hostDateTimeSystemTimeZone;
	}

	/**
	 * Gets the hostDateTimeSystemTimeZone value for this
	 * ArrayOfHostDateTimeSystemTimeZone.
	 * 
	 * @return hostDateTimeSystemTimeZone
	 */
	public com.vmware.vim25.HostDateTimeSystemTimeZone[] getHostDateTimeSystemTimeZone() {
		return hostDateTimeSystemTimeZone;
	}

	/**
	 * Sets the hostDateTimeSystemTimeZone value for this
	 * ArrayOfHostDateTimeSystemTimeZone.
	 * 
	 * @param hostDateTimeSystemTimeZone
	 */
	public void setHostDateTimeSystemTimeZone(
			com.vmware.vim25.HostDateTimeSystemTimeZone[] hostDateTimeSystemTimeZone) {
		this.hostDateTimeSystemTimeZone = hostDateTimeSystemTimeZone;
	}

	public com.vmware.vim25.HostDateTimeSystemTimeZone getHostDateTimeSystemTimeZone(
			int i) {
		return this.hostDateTimeSystemTimeZone[i];
	}

	public void setHostDateTimeSystemTimeZone(int i,
			com.vmware.vim25.HostDateTimeSystemTimeZone _value) {
		this.hostDateTimeSystemTimeZone[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfHostDateTimeSystemTimeZone)) {
			return false;
		}
		ArrayOfHostDateTimeSystemTimeZone other = (ArrayOfHostDateTimeSystemTimeZone) obj;
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
		_equals = true && ((this.hostDateTimeSystemTimeZone == null && other
				.getHostDateTimeSystemTimeZone() == null) || (this.hostDateTimeSystemTimeZone != null && java.util.Arrays
				.equals(this.hostDateTimeSystemTimeZone, other
						.getHostDateTimeSystemTimeZone())));
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
		if (getHostDateTimeSystemTimeZone() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getHostDateTimeSystemTimeZone()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getHostDateTimeSystemTimeZone(), i);
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
			ArrayOfHostDateTimeSystemTimeZone.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ArrayOfHostDateTimeSystemTimeZone"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("hostDateTimeSystemTimeZone");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"HostDateTimeSystemTimeZone"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostDateTimeSystemTimeZone"));
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
