/**
 * VirtualMachineScsiDiskDeviceInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VirtualMachineScsiDiskDeviceInfo extends
		com.vmware.vim25.VirtualMachineDiskDeviceInfo implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.HostScsiDisk disk;

	private java.lang.String transportHint;

	private java.lang.Integer lunNumber;

	public VirtualMachineScsiDiskDeviceInfo() {
	}

	public VirtualMachineScsiDiskDeviceInfo(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.String name, java.lang.String[] configurationTag,
			java.lang.Long capacity,
			com.vmware.vim25.ManagedObjectReference[] vm,
			com.vmware.vim25.HostScsiDisk disk, java.lang.String transportHint,
			java.lang.Integer lunNumber) {
		super(dynamicType, dynamicProperty, name, configurationTag, capacity,
				vm);
		this.disk = disk;
		this.transportHint = transportHint;
		this.lunNumber = lunNumber;
	}

	/**
	 * Gets the disk value for this VirtualMachineScsiDiskDeviceInfo.
	 * 
	 * @return disk
	 */
	public com.vmware.vim25.HostScsiDisk getDisk() {
		return disk;
	}

	/**
	 * Sets the disk value for this VirtualMachineScsiDiskDeviceInfo.
	 * 
	 * @param disk
	 */
	public void setDisk(com.vmware.vim25.HostScsiDisk disk) {
		this.disk = disk;
	}

	/**
	 * Gets the transportHint value for this VirtualMachineScsiDiskDeviceInfo.
	 * 
	 * @return transportHint
	 */
	public java.lang.String getTransportHint() {
		return transportHint;
	}

	/**
	 * Sets the transportHint value for this VirtualMachineScsiDiskDeviceInfo.
	 * 
	 * @param transportHint
	 */
	public void setTransportHint(java.lang.String transportHint) {
		this.transportHint = transportHint;
	}

	/**
	 * Gets the lunNumber value for this VirtualMachineScsiDiskDeviceInfo.
	 * 
	 * @return lunNumber
	 */
	public java.lang.Integer getLunNumber() {
		return lunNumber;
	}

	/**
	 * Sets the lunNumber value for this VirtualMachineScsiDiskDeviceInfo.
	 * 
	 * @param lunNumber
	 */
	public void setLunNumber(java.lang.Integer lunNumber) {
		this.lunNumber = lunNumber;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof VirtualMachineScsiDiskDeviceInfo)) {
			return false;
		}
		VirtualMachineScsiDiskDeviceInfo other = (VirtualMachineScsiDiskDeviceInfo) obj;
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
				&& ((this.disk == null && other.getDisk() == null) || (this.disk != null && this.disk
						.equals(other.getDisk())))
				&& ((this.transportHint == null && other.getTransportHint() == null) || (this.transportHint != null && this.transportHint
						.equals(other.getTransportHint())))
				&& ((this.lunNumber == null && other.getLunNumber() == null) || (this.lunNumber != null && this.lunNumber
						.equals(other.getLunNumber())));
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
		if (getDisk() != null) {
			_hashCode += getDisk().hashCode();
		}
		if (getTransportHint() != null) {
			_hashCode += getTransportHint().hashCode();
		}
		if (getLunNumber() != null) {
			_hashCode += getLunNumber().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			VirtualMachineScsiDiskDeviceInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VirtualMachineScsiDiskDeviceInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("disk");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "disk"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostScsiDisk"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("transportHint");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"transportHint"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("lunNumber");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"lunNumber"));
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
