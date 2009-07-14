/**
 * DistributedVirtualSwitchPortConnection.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class DistributedVirtualSwitchPortConnection extends
		com.vmware.vim25.DynamicData implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String switchUuid;

	private java.lang.String portgroupKey;

	private java.lang.String portKey;

	private java.lang.Integer connectionCookie;

	public DistributedVirtualSwitchPortConnection() {
	}

	public DistributedVirtualSwitchPortConnection(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.String switchUuid, java.lang.String portgroupKey,
			java.lang.String portKey, java.lang.Integer connectionCookie) {
		super(dynamicType, dynamicProperty);
		this.switchUuid = switchUuid;
		this.portgroupKey = portgroupKey;
		this.portKey = portKey;
		this.connectionCookie = connectionCookie;
	}

	/**
	 * Gets the switchUuid value for this
	 * DistributedVirtualSwitchPortConnection.
	 * 
	 * @return switchUuid
	 */
	public java.lang.String getSwitchUuid() {
		return switchUuid;
	}

	/**
	 * Sets the switchUuid value for this
	 * DistributedVirtualSwitchPortConnection.
	 * 
	 * @param switchUuid
	 */
	public void setSwitchUuid(java.lang.String switchUuid) {
		this.switchUuid = switchUuid;
	}

	/**
	 * Gets the portgroupKey value for this
	 * DistributedVirtualSwitchPortConnection.
	 * 
	 * @return portgroupKey
	 */
	public java.lang.String getPortgroupKey() {
		return portgroupKey;
	}

	/**
	 * Sets the portgroupKey value for this
	 * DistributedVirtualSwitchPortConnection.
	 * 
	 * @param portgroupKey
	 */
	public void setPortgroupKey(java.lang.String portgroupKey) {
		this.portgroupKey = portgroupKey;
	}

	/**
	 * Gets the portKey value for this DistributedVirtualSwitchPortConnection.
	 * 
	 * @return portKey
	 */
	public java.lang.String getPortKey() {
		return portKey;
	}

	/**
	 * Sets the portKey value for this DistributedVirtualSwitchPortConnection.
	 * 
	 * @param portKey
	 */
	public void setPortKey(java.lang.String portKey) {
		this.portKey = portKey;
	}

	/**
	 * Gets the connectionCookie value for this
	 * DistributedVirtualSwitchPortConnection.
	 * 
	 * @return connectionCookie
	 */
	public java.lang.Integer getConnectionCookie() {
		return connectionCookie;
	}

	/**
	 * Sets the connectionCookie value for this
	 * DistributedVirtualSwitchPortConnection.
	 * 
	 * @param connectionCookie
	 */
	public void setConnectionCookie(java.lang.Integer connectionCookie) {
		this.connectionCookie = connectionCookie;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof DistributedVirtualSwitchPortConnection)) {
			return false;
		}
		DistributedVirtualSwitchPortConnection other = (DistributedVirtualSwitchPortConnection) obj;
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
				&& ((this.switchUuid == null && other.getSwitchUuid() == null) || (this.switchUuid != null && this.switchUuid
						.equals(other.getSwitchUuid())))
				&& ((this.portgroupKey == null && other.getPortgroupKey() == null) || (this.portgroupKey != null && this.portgroupKey
						.equals(other.getPortgroupKey())))
				&& ((this.portKey == null && other.getPortKey() == null) || (this.portKey != null && this.portKey
						.equals(other.getPortKey())))
				&& ((this.connectionCookie == null && other
						.getConnectionCookie() == null) || (this.connectionCookie != null && this.connectionCookie
						.equals(other.getConnectionCookie())));
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
		if (getSwitchUuid() != null) {
			_hashCode += getSwitchUuid().hashCode();
		}
		if (getPortgroupKey() != null) {
			_hashCode += getPortgroupKey().hashCode();
		}
		if (getPortKey() != null) {
			_hashCode += getPortKey().hashCode();
		}
		if (getConnectionCookie() != null) {
			_hashCode += getConnectionCookie().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			DistributedVirtualSwitchPortConnection.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"DistributedVirtualSwitchPortConnection"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("switchUuid");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"switchUuid"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("portgroupKey");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"portgroupKey"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("portKey");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"portKey"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("connectionCookie");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"connectionCookie"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
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
