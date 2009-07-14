/**
 * ArrayOfHostNatService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfHostNatService implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.HostNatService[] hostNatService;

	public ArrayOfHostNatService() {
	}

	public ArrayOfHostNatService(
			com.vmware.vim25.HostNatService[] hostNatService) {
		this.hostNatService = hostNatService;
	}

	/**
	 * Gets the hostNatService value for this ArrayOfHostNatService.
	 * 
	 * @return hostNatService
	 */
	public com.vmware.vim25.HostNatService[] getHostNatService() {
		return hostNatService;
	}

	/**
	 * Sets the hostNatService value for this ArrayOfHostNatService.
	 * 
	 * @param hostNatService
	 */
	public void setHostNatService(
			com.vmware.vim25.HostNatService[] hostNatService) {
		this.hostNatService = hostNatService;
	}

	public com.vmware.vim25.HostNatService getHostNatService(int i) {
		return this.hostNatService[i];
	}

	public void setHostNatService(int i, com.vmware.vim25.HostNatService _value) {
		this.hostNatService[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfHostNatService)) {
			return false;
		}
		ArrayOfHostNatService other = (ArrayOfHostNatService) obj;
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
		_equals = true && ((this.hostNatService == null && other
				.getHostNatService() == null) || (this.hostNatService != null && java.util.Arrays
				.equals(this.hostNatService, other.getHostNatService())));
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
		if (getHostNatService() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getHostNatService()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getHostNatService(), i);
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
			ArrayOfHostNatService.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ArrayOfHostNatService"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("hostNatService");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"HostNatService"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostNatService"));
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
