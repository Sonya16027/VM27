/**
 * ArrayOfHostSnmpDestination.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfHostSnmpDestination implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.HostSnmpDestination[] hostSnmpDestination;

	public ArrayOfHostSnmpDestination() {
	}

	public ArrayOfHostSnmpDestination(
			com.vmware.vim25.HostSnmpDestination[] hostSnmpDestination) {
		this.hostSnmpDestination = hostSnmpDestination;
	}

	/**
	 * Gets the hostSnmpDestination value for this ArrayOfHostSnmpDestination.
	 * 
	 * @return hostSnmpDestination
	 */
	public com.vmware.vim25.HostSnmpDestination[] getHostSnmpDestination() {
		return hostSnmpDestination;
	}

	/**
	 * Sets the hostSnmpDestination value for this ArrayOfHostSnmpDestination.
	 * 
	 * @param hostSnmpDestination
	 */
	public void setHostSnmpDestination(
			com.vmware.vim25.HostSnmpDestination[] hostSnmpDestination) {
		this.hostSnmpDestination = hostSnmpDestination;
	}

	public com.vmware.vim25.HostSnmpDestination getHostSnmpDestination(int i) {
		return this.hostSnmpDestination[i];
	}

	public void setHostSnmpDestination(int i,
			com.vmware.vim25.HostSnmpDestination _value) {
		this.hostSnmpDestination[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfHostSnmpDestination)) {
			return false;
		}
		ArrayOfHostSnmpDestination other = (ArrayOfHostSnmpDestination) obj;
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
		_equals = true && ((this.hostSnmpDestination == null && other
				.getHostSnmpDestination() == null) || (this.hostSnmpDestination != null && java.util.Arrays
				.equals(this.hostSnmpDestination, other
						.getHostSnmpDestination())));
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
		if (getHostSnmpDestination() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getHostSnmpDestination()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getHostSnmpDestination(), i);
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
			ArrayOfHostSnmpDestination.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ArrayOfHostSnmpDestination"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("hostSnmpDestination");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"HostSnmpDestination"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostSnmpDestination"));
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
