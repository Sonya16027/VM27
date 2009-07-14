/**
 * HostPciDevice.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostPciDevice extends com.vmware.vim25.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String id;

	private short classId;

	private byte bus;

	private byte slot;

	private byte function;

	private short vendorId;

	private short subVendorId;

	private java.lang.String vendorName;

	private short deviceId;

	private short subDeviceId;

	private java.lang.String parentBridge;

	private java.lang.String deviceName;

	public HostPciDevice() {
	}

	public HostPciDevice(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.String id, short classId, byte bus, byte slot,
			byte function, short vendorId, short subVendorId,
			java.lang.String vendorName, short deviceId, short subDeviceId,
			java.lang.String parentBridge, java.lang.String deviceName) {
		super(dynamicType, dynamicProperty);
		this.id = id;
		this.classId = classId;
		this.bus = bus;
		this.slot = slot;
		this.function = function;
		this.vendorId = vendorId;
		this.subVendorId = subVendorId;
		this.vendorName = vendorName;
		this.deviceId = deviceId;
		this.subDeviceId = subDeviceId;
		this.parentBridge = parentBridge;
		this.deviceName = deviceName;
	}

	/**
	 * Gets the id value for this HostPciDevice.
	 * 
	 * @return id
	 */
	public java.lang.String getId() {
		return id;
	}

	/**
	 * Sets the id value for this HostPciDevice.
	 * 
	 * @param id
	 */
	public void setId(java.lang.String id) {
		this.id = id;
	}

	/**
	 * Gets the classId value for this HostPciDevice.
	 * 
	 * @return classId
	 */
	public short getClassId() {
		return classId;
	}

	/**
	 * Sets the classId value for this HostPciDevice.
	 * 
	 * @param classId
	 */
	public void setClassId(short classId) {
		this.classId = classId;
	}

	/**
	 * Gets the bus value for this HostPciDevice.
	 * 
	 * @return bus
	 */
	public byte getBus() {
		return bus;
	}

	/**
	 * Sets the bus value for this HostPciDevice.
	 * 
	 * @param bus
	 */
	public void setBus(byte bus) {
		this.bus = bus;
	}

	/**
	 * Gets the slot value for this HostPciDevice.
	 * 
	 * @return slot
	 */
	public byte getSlot() {
		return slot;
	}

	/**
	 * Sets the slot value for this HostPciDevice.
	 * 
	 * @param slot
	 */
	public void setSlot(byte slot) {
		this.slot = slot;
	}

	/**
	 * Gets the function value for this HostPciDevice.
	 * 
	 * @return function
	 */
	public byte getFunction() {
		return function;
	}

	/**
	 * Sets the function value for this HostPciDevice.
	 * 
	 * @param function
	 */
	public void setFunction(byte function) {
		this.function = function;
	}

	/**
	 * Gets the vendorId value for this HostPciDevice.
	 * 
	 * @return vendorId
	 */
	public short getVendorId() {
		return vendorId;
	}

	/**
	 * Sets the vendorId value for this HostPciDevice.
	 * 
	 * @param vendorId
	 */
	public void setVendorId(short vendorId) {
		this.vendorId = vendorId;
	}

	/**
	 * Gets the subVendorId value for this HostPciDevice.
	 * 
	 * @return subVendorId
	 */
	public short getSubVendorId() {
		return subVendorId;
	}

	/**
	 * Sets the subVendorId value for this HostPciDevice.
	 * 
	 * @param subVendorId
	 */
	public void setSubVendorId(short subVendorId) {
		this.subVendorId = subVendorId;
	}

	/**
	 * Gets the vendorName value for this HostPciDevice.
	 * 
	 * @return vendorName
	 */
	public java.lang.String getVendorName() {
		return vendorName;
	}

	/**
	 * Sets the vendorName value for this HostPciDevice.
	 * 
	 * @param vendorName
	 */
	public void setVendorName(java.lang.String vendorName) {
		this.vendorName = vendorName;
	}

	/**
	 * Gets the deviceId value for this HostPciDevice.
	 * 
	 * @return deviceId
	 */
	public short getDeviceId() {
		return deviceId;
	}

	/**
	 * Sets the deviceId value for this HostPciDevice.
	 * 
	 * @param deviceId
	 */
	public void setDeviceId(short deviceId) {
		this.deviceId = deviceId;
	}

	/**
	 * Gets the subDeviceId value for this HostPciDevice.
	 * 
	 * @return subDeviceId
	 */
	public short getSubDeviceId() {
		return subDeviceId;
	}

	/**
	 * Sets the subDeviceId value for this HostPciDevice.
	 * 
	 * @param subDeviceId
	 */
	public void setSubDeviceId(short subDeviceId) {
		this.subDeviceId = subDeviceId;
	}

	/**
	 * Gets the parentBridge value for this HostPciDevice.
	 * 
	 * @return parentBridge
	 */
	public java.lang.String getParentBridge() {
		return parentBridge;
	}

	/**
	 * Sets the parentBridge value for this HostPciDevice.
	 * 
	 * @param parentBridge
	 */
	public void setParentBridge(java.lang.String parentBridge) {
		this.parentBridge = parentBridge;
	}

	/**
	 * Gets the deviceName value for this HostPciDevice.
	 * 
	 * @return deviceName
	 */
	public java.lang.String getDeviceName() {
		return deviceName;
	}

	/**
	 * Sets the deviceName value for this HostPciDevice.
	 * 
	 * @param deviceName
	 */
	public void setDeviceName(java.lang.String deviceName) {
		this.deviceName = deviceName;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof HostPciDevice)) {
			return false;
		}
		HostPciDevice other = (HostPciDevice) obj;
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
				&& ((this.id == null && other.getId() == null) || (this.id != null && this.id
						.equals(other.getId())))
				&& this.classId == other.getClassId()
				&& this.bus == other.getBus()
				&& this.slot == other.getSlot()
				&& this.function == other.getFunction()
				&& this.vendorId == other.getVendorId()
				&& this.subVendorId == other.getSubVendorId()
				&& ((this.vendorName == null && other.getVendorName() == null) || (this.vendorName != null && this.vendorName
						.equals(other.getVendorName())))
				&& this.deviceId == other.getDeviceId()
				&& this.subDeviceId == other.getSubDeviceId()
				&& ((this.parentBridge == null && other.getParentBridge() == null) || (this.parentBridge != null && this.parentBridge
						.equals(other.getParentBridge())))
				&& ((this.deviceName == null && other.getDeviceName() == null) || (this.deviceName != null && this.deviceName
						.equals(other.getDeviceName())));
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
		if (getId() != null) {
			_hashCode += getId().hashCode();
		}
		_hashCode += getClassId();
		_hashCode += getBus();
		_hashCode += getSlot();
		_hashCode += getFunction();
		_hashCode += getVendorId();
		_hashCode += getSubVendorId();
		if (getVendorName() != null) {
			_hashCode += getVendorName().hashCode();
		}
		_hashCode += getDeviceId();
		_hashCode += getSubDeviceId();
		if (getParentBridge() != null) {
			_hashCode += getParentBridge().hashCode();
		}
		if (getDeviceName() != null) {
			_hashCode += getDeviceName().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			HostPciDevice.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostPciDevice"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("id");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "id"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("classId");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"classId"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "short"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("bus");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "bus"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "byte"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("slot");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "slot"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "byte"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("function");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"function"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "byte"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("vendorId");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"vendorId"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "short"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("subVendorId");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"subVendorId"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "short"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("vendorName");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"vendorName"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("deviceId");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"deviceId"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "short"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("subDeviceId");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"subDeviceId"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "short"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("parentBridge");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"parentBridge"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("deviceName");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"deviceName"));
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
