/**
 * GuestNicInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class GuestNicInfo extends com.vmware.vim.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String network;

	private java.lang.String[] ipAddress;

	private java.lang.String macAddress;

	private boolean connected;

	private int deviceConfigId;

	public GuestNicInfo() {
	}

	public GuestNicInfo(java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty,
			java.lang.String network, java.lang.String[] ipAddress,
			java.lang.String macAddress, boolean connected, int deviceConfigId) {
		super(dynamicType, dynamicProperty);
		this.network = network;
		this.ipAddress = ipAddress;
		this.macAddress = macAddress;
		this.connected = connected;
		this.deviceConfigId = deviceConfigId;
	}

	/**
	 * Gets the network value for this GuestNicInfo.
	 * 
	 * @return network
	 */
	public java.lang.String getNetwork() {
		return network;
	}

	/**
	 * Sets the network value for this GuestNicInfo.
	 * 
	 * @param network
	 */
	public void setNetwork(java.lang.String network) {
		this.network = network;
	}

	/**
	 * Gets the ipAddress value for this GuestNicInfo.
	 * 
	 * @return ipAddress
	 */
	public java.lang.String[] getIpAddress() {
		return ipAddress;
	}

	/**
	 * Sets the ipAddress value for this GuestNicInfo.
	 * 
	 * @param ipAddress
	 */
	public void setIpAddress(java.lang.String[] ipAddress) {
		this.ipAddress = ipAddress;
	}

	public java.lang.String getIpAddress(int i) {
		return this.ipAddress[i];
	}

	public void setIpAddress(int i, java.lang.String _value) {
		this.ipAddress[i] = _value;
	}

	/**
	 * Gets the macAddress value for this GuestNicInfo.
	 * 
	 * @return macAddress
	 */
	public java.lang.String getMacAddress() {
		return macAddress;
	}

	/**
	 * Sets the macAddress value for this GuestNicInfo.
	 * 
	 * @param macAddress
	 */
	public void setMacAddress(java.lang.String macAddress) {
		this.macAddress = macAddress;
	}

	/**
	 * Gets the connected value for this GuestNicInfo.
	 * 
	 * @return connected
	 */
	public boolean isConnected() {
		return connected;
	}

	/**
	 * Sets the connected value for this GuestNicInfo.
	 * 
	 * @param connected
	 */
	public void setConnected(boolean connected) {
		this.connected = connected;
	}

	/**
	 * Gets the deviceConfigId value for this GuestNicInfo.
	 * 
	 * @return deviceConfigId
	 */
	public int getDeviceConfigId() {
		return deviceConfigId;
	}

	/**
	 * Sets the deviceConfigId value for this GuestNicInfo.
	 * 
	 * @param deviceConfigId
	 */
	public void setDeviceConfigId(int deviceConfigId) {
		this.deviceConfigId = deviceConfigId;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof GuestNicInfo)) {
			return false;
		}
		GuestNicInfo other = (GuestNicInfo) obj;
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
				&& ((this.network == null && other.getNetwork() == null) || (this.network != null && this.network
						.equals(other.getNetwork())))
				&& ((this.ipAddress == null && other.getIpAddress() == null) || (this.ipAddress != null && java.util.Arrays
						.equals(this.ipAddress, other.getIpAddress())))
				&& ((this.macAddress == null && other.getMacAddress() == null) || (this.macAddress != null && this.macAddress
						.equals(other.getMacAddress())))
				&& this.connected == other.isConnected()
				&& this.deviceConfigId == other.getDeviceConfigId();
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
		if (getNetwork() != null) {
			_hashCode += getNetwork().hashCode();
		}
		if (getIpAddress() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getIpAddress()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getIpAddress(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getMacAddress() != null) {
			_hashCode += getMacAddress().hashCode();
		}
		_hashCode += (isConnected() ? Boolean.TRUE : Boolean.FALSE).hashCode();
		_hashCode += getDeviceConfigId();
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			GuestNicInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"GuestNicInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("network");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"network"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("ipAddress");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"ipAddress"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("macAddress");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"macAddress"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("connected");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"connected"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("deviceConfigId");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"deviceConfigId"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
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
