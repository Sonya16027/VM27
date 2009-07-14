/**
 * HostFibreChannelTargetTransport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class HostFibreChannelTargetTransport extends
		com.vmware.vim.HostTargetTransport implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private long portWorldWideName;

	private long nodeWorldWideName;

	public HostFibreChannelTargetTransport() {
	}

	public HostFibreChannelTargetTransport(java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty,
			long portWorldWideName, long nodeWorldWideName) {
		super(dynamicType, dynamicProperty);
		this.portWorldWideName = portWorldWideName;
		this.nodeWorldWideName = nodeWorldWideName;
	}

	/**
	 * Gets the portWorldWideName value for this
	 * HostFibreChannelTargetTransport.
	 * 
	 * @return portWorldWideName
	 */
	public long getPortWorldWideName() {
		return portWorldWideName;
	}

	/**
	 * Sets the portWorldWideName value for this
	 * HostFibreChannelTargetTransport.
	 * 
	 * @param portWorldWideName
	 */
	public void setPortWorldWideName(long portWorldWideName) {
		this.portWorldWideName = portWorldWideName;
	}

	/**
	 * Gets the nodeWorldWideName value for this
	 * HostFibreChannelTargetTransport.
	 * 
	 * @return nodeWorldWideName
	 */
	public long getNodeWorldWideName() {
		return nodeWorldWideName;
	}

	/**
	 * Sets the nodeWorldWideName value for this
	 * HostFibreChannelTargetTransport.
	 * 
	 * @param nodeWorldWideName
	 */
	public void setNodeWorldWideName(long nodeWorldWideName) {
		this.nodeWorldWideName = nodeWorldWideName;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof HostFibreChannelTargetTransport)) {
			return false;
		}
		HostFibreChannelTargetTransport other = (HostFibreChannelTargetTransport) obj;
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
				&& this.portWorldWideName == other.getPortWorldWideName()
				&& this.nodeWorldWideName == other.getNodeWorldWideName();
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
		_hashCode += new Long(getPortWorldWideName()).hashCode();
		_hashCode += new Long(getNodeWorldWideName()).hashCode();
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			HostFibreChannelTargetTransport.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"HostFibreChannelTargetTransport"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("portWorldWideName");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"portWorldWideName"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "long"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("nodeWorldWideName");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"nodeWorldWideName"));
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
