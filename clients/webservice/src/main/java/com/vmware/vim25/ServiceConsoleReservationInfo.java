/**
 * ServiceConsoleReservationInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ServiceConsoleReservationInfo extends com.vmware.vim25.DynamicData
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private long serviceConsoleReservedCfg;

	private long serviceConsoleReserved;

	private long unreserved;

	public ServiceConsoleReservationInfo() {
	}

	public ServiceConsoleReservationInfo(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			long serviceConsoleReservedCfg, long serviceConsoleReserved,
			long unreserved) {
		super(dynamicType, dynamicProperty);
		this.serviceConsoleReservedCfg = serviceConsoleReservedCfg;
		this.serviceConsoleReserved = serviceConsoleReserved;
		this.unreserved = unreserved;
	}

	/**
	 * Gets the serviceConsoleReservedCfg value for this
	 * ServiceConsoleReservationInfo.
	 * 
	 * @return serviceConsoleReservedCfg
	 */
	public long getServiceConsoleReservedCfg() {
		return serviceConsoleReservedCfg;
	}

	/**
	 * Sets the serviceConsoleReservedCfg value for this
	 * ServiceConsoleReservationInfo.
	 * 
	 * @param serviceConsoleReservedCfg
	 */
	public void setServiceConsoleReservedCfg(long serviceConsoleReservedCfg) {
		this.serviceConsoleReservedCfg = serviceConsoleReservedCfg;
	}

	/**
	 * Gets the serviceConsoleReserved value for this
	 * ServiceConsoleReservationInfo.
	 * 
	 * @return serviceConsoleReserved
	 */
	public long getServiceConsoleReserved() {
		return serviceConsoleReserved;
	}

	/**
	 * Sets the serviceConsoleReserved value for this
	 * ServiceConsoleReservationInfo.
	 * 
	 * @param serviceConsoleReserved
	 */
	public void setServiceConsoleReserved(long serviceConsoleReserved) {
		this.serviceConsoleReserved = serviceConsoleReserved;
	}

	/**
	 * Gets the unreserved value for this ServiceConsoleReservationInfo.
	 * 
	 * @return unreserved
	 */
	public long getUnreserved() {
		return unreserved;
	}

	/**
	 * Sets the unreserved value for this ServiceConsoleReservationInfo.
	 * 
	 * @param unreserved
	 */
	public void setUnreserved(long unreserved) {
		this.unreserved = unreserved;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ServiceConsoleReservationInfo)) {
			return false;
		}
		ServiceConsoleReservationInfo other = (ServiceConsoleReservationInfo) obj;
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
		_equals = super.equals(obj)
				&& this.serviceConsoleReservedCfg == other
						.getServiceConsoleReservedCfg()
				&& this.serviceConsoleReserved == other
						.getServiceConsoleReserved()
				&& this.unreserved == other.getUnreserved();
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
		int _hashCode = super.hashCode();
		_hashCode += new Long(getServiceConsoleReservedCfg()).hashCode();
		_hashCode += new Long(getServiceConsoleReserved()).hashCode();
		_hashCode += new Long(getUnreserved()).hashCode();
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			ServiceConsoleReservationInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ServiceConsoleReservationInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("serviceConsoleReservedCfg");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"serviceConsoleReservedCfg"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "long"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("serviceConsoleReserved");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"serviceConsoleReserved"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "long"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("unreserved");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"unreserved"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "long"));
		elemField.setNillable(false);
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
