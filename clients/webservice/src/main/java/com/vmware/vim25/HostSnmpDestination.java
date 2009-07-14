/**
 * HostSnmpDestination.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostSnmpDestination extends com.vmware.vim25.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String hostName;

	private int port;

	private java.lang.String community;

	public HostSnmpDestination() {
	}

	public HostSnmpDestination(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.String hostName, int port, java.lang.String community) {
		super(dynamicType, dynamicProperty);
		this.hostName = hostName;
		this.port = port;
		this.community = community;
	}

	/**
	 * Gets the hostName value for this HostSnmpDestination.
	 * 
	 * @return hostName
	 */
	public java.lang.String getHostName() {
		return hostName;
	}

	/**
	 * Sets the hostName value for this HostSnmpDestination.
	 * 
	 * @param hostName
	 */
	public void setHostName(java.lang.String hostName) {
		this.hostName = hostName;
	}

	/**
	 * Gets the port value for this HostSnmpDestination.
	 * 
	 * @return port
	 */
	public int getPort() {
		return port;
	}

	/**
	 * Sets the port value for this HostSnmpDestination.
	 * 
	 * @param port
	 */
	public void setPort(int port) {
		this.port = port;
	}

	/**
	 * Gets the community value for this HostSnmpDestination.
	 * 
	 * @return community
	 */
	public java.lang.String getCommunity() {
		return community;
	}

	/**
	 * Sets the community value for this HostSnmpDestination.
	 * 
	 * @param community
	 */
	public void setCommunity(java.lang.String community) {
		this.community = community;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof HostSnmpDestination)) {
			return false;
		}
		HostSnmpDestination other = (HostSnmpDestination) obj;
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
				&& ((this.hostName == null && other.getHostName() == null) || (this.hostName != null && this.hostName
						.equals(other.getHostName())))
				&& this.port == other.getPort()
				&& ((this.community == null && other.getCommunity() == null) || (this.community != null && this.community
						.equals(other.getCommunity())));
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
		if (getHostName() != null) {
			_hashCode += getHostName().hashCode();
		}
		_hashCode += getPort();
		if (getCommunity() != null) {
			_hashCode += getCommunity().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			HostSnmpDestination.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostSnmpDestination"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("hostName");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"hostName"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("port");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "port"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("community");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"community"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
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
