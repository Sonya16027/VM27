/**
 * ArrayOfHostNatServiceConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfHostNatServiceConfig implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.HostNatServiceConfig[] hostNatServiceConfig;

	public ArrayOfHostNatServiceConfig() {
	}

	public ArrayOfHostNatServiceConfig(
			com.vmware.vim25.HostNatServiceConfig[] hostNatServiceConfig) {
		this.hostNatServiceConfig = hostNatServiceConfig;
	}

	/**
	 * Gets the hostNatServiceConfig value for this ArrayOfHostNatServiceConfig.
	 * 
	 * @return hostNatServiceConfig
	 */
	public com.vmware.vim25.HostNatServiceConfig[] getHostNatServiceConfig() {
		return hostNatServiceConfig;
	}

	/**
	 * Sets the hostNatServiceConfig value for this ArrayOfHostNatServiceConfig.
	 * 
	 * @param hostNatServiceConfig
	 */
	public void setHostNatServiceConfig(
			com.vmware.vim25.HostNatServiceConfig[] hostNatServiceConfig) {
		this.hostNatServiceConfig = hostNatServiceConfig;
	}

	public com.vmware.vim25.HostNatServiceConfig getHostNatServiceConfig(int i) {
		return this.hostNatServiceConfig[i];
	}

	public void setHostNatServiceConfig(int i,
			com.vmware.vim25.HostNatServiceConfig _value) {
		this.hostNatServiceConfig[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfHostNatServiceConfig)) {
			return false;
		}
		ArrayOfHostNatServiceConfig other = (ArrayOfHostNatServiceConfig) obj;
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
		_equals = true && ((this.hostNatServiceConfig == null && other
				.getHostNatServiceConfig() == null) || (this.hostNatServiceConfig != null && java.util.Arrays
				.equals(this.hostNatServiceConfig, other
						.getHostNatServiceConfig())));
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
		if (getHostNatServiceConfig() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getHostNatServiceConfig()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getHostNatServiceConfig(), i);
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
			ArrayOfHostNatServiceConfig.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ArrayOfHostNatServiceConfig"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("hostNatServiceConfig");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"HostNatServiceConfig"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostNatServiceConfig"));
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
