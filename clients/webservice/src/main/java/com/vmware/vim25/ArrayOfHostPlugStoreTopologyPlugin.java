/**
 * ArrayOfHostPlugStoreTopologyPlugin.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfHostPlugStoreTopologyPlugin implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.HostPlugStoreTopologyPlugin[] hostPlugStoreTopologyPlugin;

	public ArrayOfHostPlugStoreTopologyPlugin() {
	}

	public ArrayOfHostPlugStoreTopologyPlugin(
			com.vmware.vim25.HostPlugStoreTopologyPlugin[] hostPlugStoreTopologyPlugin) {
		this.hostPlugStoreTopologyPlugin = hostPlugStoreTopologyPlugin;
	}

	/**
	 * Gets the hostPlugStoreTopologyPlugin value for this
	 * ArrayOfHostPlugStoreTopologyPlugin.
	 * 
	 * @return hostPlugStoreTopologyPlugin
	 */
	public com.vmware.vim25.HostPlugStoreTopologyPlugin[] getHostPlugStoreTopologyPlugin() {
		return hostPlugStoreTopologyPlugin;
	}

	/**
	 * Sets the hostPlugStoreTopologyPlugin value for this
	 * ArrayOfHostPlugStoreTopologyPlugin.
	 * 
	 * @param hostPlugStoreTopologyPlugin
	 */
	public void setHostPlugStoreTopologyPlugin(
			com.vmware.vim25.HostPlugStoreTopologyPlugin[] hostPlugStoreTopologyPlugin) {
		this.hostPlugStoreTopologyPlugin = hostPlugStoreTopologyPlugin;
	}

	public com.vmware.vim25.HostPlugStoreTopologyPlugin getHostPlugStoreTopologyPlugin(
			int i) {
		return this.hostPlugStoreTopologyPlugin[i];
	}

	public void setHostPlugStoreTopologyPlugin(int i,
			com.vmware.vim25.HostPlugStoreTopologyPlugin _value) {
		this.hostPlugStoreTopologyPlugin[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfHostPlugStoreTopologyPlugin)) {
			return false;
		}
		ArrayOfHostPlugStoreTopologyPlugin other = (ArrayOfHostPlugStoreTopologyPlugin) obj;
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
		_equals = true && ((this.hostPlugStoreTopologyPlugin == null && other
				.getHostPlugStoreTopologyPlugin() == null) || (this.hostPlugStoreTopologyPlugin != null && java.util.Arrays
				.equals(this.hostPlugStoreTopologyPlugin, other
						.getHostPlugStoreTopologyPlugin())));
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
		if (getHostPlugStoreTopologyPlugin() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getHostPlugStoreTopologyPlugin()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getHostPlugStoreTopologyPlugin(), i);
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
			ArrayOfHostPlugStoreTopologyPlugin.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ArrayOfHostPlugStoreTopologyPlugin"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("hostPlugStoreTopologyPlugin");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"HostPlugStoreTopologyPlugin"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostPlugStoreTopologyPlugin"));
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
