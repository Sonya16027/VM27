/**
 * ArrayOfHostProxySwitchConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfHostProxySwitchConfig implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.HostProxySwitchConfig[] hostProxySwitchConfig;

	public ArrayOfHostProxySwitchConfig() {
	}

	public ArrayOfHostProxySwitchConfig(
			com.vmware.vim25.HostProxySwitchConfig[] hostProxySwitchConfig) {
		this.hostProxySwitchConfig = hostProxySwitchConfig;
	}

	/**
	 * Gets the hostProxySwitchConfig value for this
	 * ArrayOfHostProxySwitchConfig.
	 * 
	 * @return hostProxySwitchConfig
	 */
	public com.vmware.vim25.HostProxySwitchConfig[] getHostProxySwitchConfig() {
		return hostProxySwitchConfig;
	}

	/**
	 * Sets the hostProxySwitchConfig value for this
	 * ArrayOfHostProxySwitchConfig.
	 * 
	 * @param hostProxySwitchConfig
	 */
	public void setHostProxySwitchConfig(
			com.vmware.vim25.HostProxySwitchConfig[] hostProxySwitchConfig) {
		this.hostProxySwitchConfig = hostProxySwitchConfig;
	}

	public com.vmware.vim25.HostProxySwitchConfig getHostProxySwitchConfig(int i) {
		return this.hostProxySwitchConfig[i];
	}

	public void setHostProxySwitchConfig(int i,
			com.vmware.vim25.HostProxySwitchConfig _value) {
		this.hostProxySwitchConfig[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfHostProxySwitchConfig)) {
			return false;
		}
		ArrayOfHostProxySwitchConfig other = (ArrayOfHostProxySwitchConfig) obj;
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
		_equals = true && ((this.hostProxySwitchConfig == null && other
				.getHostProxySwitchConfig() == null) || (this.hostProxySwitchConfig != null && java.util.Arrays
				.equals(this.hostProxySwitchConfig, other
						.getHostProxySwitchConfig())));
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
		if (getHostProxySwitchConfig() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getHostProxySwitchConfig()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getHostProxySwitchConfig(), i);
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
			ArrayOfHostProxySwitchConfig.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ArrayOfHostProxySwitchConfig"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("hostProxySwitchConfig");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"HostProxySwitchConfig"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostProxySwitchConfig"));
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
