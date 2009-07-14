/**
 * HostVirtualNicConnection.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostVirtualNicConnection extends com.vmware.vim25.DynamicData
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String portgroup;

	private com.vmware.vim25.DistributedVirtualSwitchPortConnection dvPort;

	public HostVirtualNicConnection() {
	}

	public HostVirtualNicConnection(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.String portgroup,
			com.vmware.vim25.DistributedVirtualSwitchPortConnection dvPort) {
		super(dynamicType, dynamicProperty);
		this.portgroup = portgroup;
		this.dvPort = dvPort;
	}

	/**
	 * Gets the portgroup value for this HostVirtualNicConnection.
	 * 
	 * @return portgroup
	 */
	public java.lang.String getPortgroup() {
		return portgroup;
	}

	/**
	 * Sets the portgroup value for this HostVirtualNicConnection.
	 * 
	 * @param portgroup
	 */
	public void setPortgroup(java.lang.String portgroup) {
		this.portgroup = portgroup;
	}

	/**
	 * Gets the dvPort value for this HostVirtualNicConnection.
	 * 
	 * @return dvPort
	 */
	public com.vmware.vim25.DistributedVirtualSwitchPortConnection getDvPort() {
		return dvPort;
	}

	/**
	 * Sets the dvPort value for this HostVirtualNicConnection.
	 * 
	 * @param dvPort
	 */
	public void setDvPort(
			com.vmware.vim25.DistributedVirtualSwitchPortConnection dvPort) {
		this.dvPort = dvPort;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof HostVirtualNicConnection)) {
			return false;
		}
		HostVirtualNicConnection other = (HostVirtualNicConnection) obj;
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
				&& ((this.portgroup == null && other.getPortgroup() == null) || (this.portgroup != null && this.portgroup
						.equals(other.getPortgroup())))
				&& ((this.dvPort == null && other.getDvPort() == null) || (this.dvPort != null && this.dvPort
						.equals(other.getDvPort())));
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
		if (getPortgroup() != null) {
			_hashCode += getPortgroup().hashCode();
		}
		if (getDvPort() != null) {
			_hashCode += getDvPort().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			HostVirtualNicConnection.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostVirtualNicConnection"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("portgroup");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"portgroup"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("dvPort");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"dvPort"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"DistributedVirtualSwitchPortConnection"));
		elemField.setMinOccurs(0);
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
