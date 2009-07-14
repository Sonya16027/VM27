/**
 * ArrayOfHostDhcpService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfHostDhcpService implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.HostDhcpService[] hostDhcpService;

	public ArrayOfHostDhcpService() {
	}

	public ArrayOfHostDhcpService(
			com.vmware.vim25.HostDhcpService[] hostDhcpService) {
		this.hostDhcpService = hostDhcpService;
	}

	/**
	 * Gets the hostDhcpService value for this ArrayOfHostDhcpService.
	 * 
	 * @return hostDhcpService
	 */
	public com.vmware.vim25.HostDhcpService[] getHostDhcpService() {
		return hostDhcpService;
	}

	/**
	 * Sets the hostDhcpService value for this ArrayOfHostDhcpService.
	 * 
	 * @param hostDhcpService
	 */
	public void setHostDhcpService(
			com.vmware.vim25.HostDhcpService[] hostDhcpService) {
		this.hostDhcpService = hostDhcpService;
	}

	public com.vmware.vim25.HostDhcpService getHostDhcpService(int i) {
		return this.hostDhcpService[i];
	}

	public void setHostDhcpService(int i,
			com.vmware.vim25.HostDhcpService _value) {
		this.hostDhcpService[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfHostDhcpService)) {
			return false;
		}
		ArrayOfHostDhcpService other = (ArrayOfHostDhcpService) obj;
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
		_equals = true && ((this.hostDhcpService == null && other
				.getHostDhcpService() == null) || (this.hostDhcpService != null && java.util.Arrays
				.equals(this.hostDhcpService, other.getHostDhcpService())));
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
		if (getHostDhcpService() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getHostDhcpService()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getHostDhcpService(), i);
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
			ArrayOfHostDhcpService.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ArrayOfHostDhcpService"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("hostDhcpService");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"HostDhcpService"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostDhcpService"));
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
