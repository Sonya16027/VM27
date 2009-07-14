/**
 * ArrayOfHostPlugStoreTopologyPath.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfHostPlugStoreTopologyPath implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.HostPlugStoreTopologyPath[] hostPlugStoreTopologyPath;

	public ArrayOfHostPlugStoreTopologyPath() {
	}

	public ArrayOfHostPlugStoreTopologyPath(
			com.vmware.vim25.HostPlugStoreTopologyPath[] hostPlugStoreTopologyPath) {
		this.hostPlugStoreTopologyPath = hostPlugStoreTopologyPath;
	}

	/**
	 * Gets the hostPlugStoreTopologyPath value for this
	 * ArrayOfHostPlugStoreTopologyPath.
	 * 
	 * @return hostPlugStoreTopologyPath
	 */
	public com.vmware.vim25.HostPlugStoreTopologyPath[] getHostPlugStoreTopologyPath() {
		return hostPlugStoreTopologyPath;
	}

	/**
	 * Sets the hostPlugStoreTopologyPath value for this
	 * ArrayOfHostPlugStoreTopologyPath.
	 * 
	 * @param hostPlugStoreTopologyPath
	 */
	public void setHostPlugStoreTopologyPath(
			com.vmware.vim25.HostPlugStoreTopologyPath[] hostPlugStoreTopologyPath) {
		this.hostPlugStoreTopologyPath = hostPlugStoreTopologyPath;
	}

	public com.vmware.vim25.HostPlugStoreTopologyPath getHostPlugStoreTopologyPath(
			int i) {
		return this.hostPlugStoreTopologyPath[i];
	}

	public void setHostPlugStoreTopologyPath(int i,
			com.vmware.vim25.HostPlugStoreTopologyPath _value) {
		this.hostPlugStoreTopologyPath[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfHostPlugStoreTopologyPath)) {
			return false;
		}
		ArrayOfHostPlugStoreTopologyPath other = (ArrayOfHostPlugStoreTopologyPath) obj;
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
		_equals = true && ((this.hostPlugStoreTopologyPath == null && other
				.getHostPlugStoreTopologyPath() == null) || (this.hostPlugStoreTopologyPath != null && java.util.Arrays
				.equals(this.hostPlugStoreTopologyPath, other
						.getHostPlugStoreTopologyPath())));
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
		if (getHostPlugStoreTopologyPath() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getHostPlugStoreTopologyPath()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getHostPlugStoreTopologyPath(), i);
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
			ArrayOfHostPlugStoreTopologyPath.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ArrayOfHostPlugStoreTopologyPath"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("hostPlugStoreTopologyPath");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"HostPlugStoreTopologyPath"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostPlugStoreTopologyPath"));
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
