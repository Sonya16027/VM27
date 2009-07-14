/**
 * HostUnresolvedVmfsExtent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostUnresolvedVmfsExtent extends com.vmware.vim25.DynamicData
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.HostScsiDiskPartition device;

	private java.lang.String devicePath;

	private java.lang.String vmfsUuid;

	private boolean isHeadExtent;

	private int ordinal;

	private int startBlock;

	private int endBlock;

	private java.lang.String reason;

	public HostUnresolvedVmfsExtent() {
	}

	public HostUnresolvedVmfsExtent(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			com.vmware.vim25.HostScsiDiskPartition device,
			java.lang.String devicePath, java.lang.String vmfsUuid,
			boolean isHeadExtent, int ordinal, int startBlock, int endBlock,
			java.lang.String reason) {
		super(dynamicType, dynamicProperty);
		this.device = device;
		this.devicePath = devicePath;
		this.vmfsUuid = vmfsUuid;
		this.isHeadExtent = isHeadExtent;
		this.ordinal = ordinal;
		this.startBlock = startBlock;
		this.endBlock = endBlock;
		this.reason = reason;
	}

	/**
	 * Gets the device value for this HostUnresolvedVmfsExtent.
	 * 
	 * @return device
	 */
	public com.vmware.vim25.HostScsiDiskPartition getDevice() {
		return device;
	}

	/**
	 * Sets the device value for this HostUnresolvedVmfsExtent.
	 * 
	 * @param device
	 */
	public void setDevice(com.vmware.vim25.HostScsiDiskPartition device) {
		this.device = device;
	}

	/**
	 * Gets the devicePath value for this HostUnresolvedVmfsExtent.
	 * 
	 * @return devicePath
	 */
	public java.lang.String getDevicePath() {
		return devicePath;
	}

	/**
	 * Sets the devicePath value for this HostUnresolvedVmfsExtent.
	 * 
	 * @param devicePath
	 */
	public void setDevicePath(java.lang.String devicePath) {
		this.devicePath = devicePath;
	}

	/**
	 * Gets the vmfsUuid value for this HostUnresolvedVmfsExtent.
	 * 
	 * @return vmfsUuid
	 */
	public java.lang.String getVmfsUuid() {
		return vmfsUuid;
	}

	/**
	 * Sets the vmfsUuid value for this HostUnresolvedVmfsExtent.
	 * 
	 * @param vmfsUuid
	 */
	public void setVmfsUuid(java.lang.String vmfsUuid) {
		this.vmfsUuid = vmfsUuid;
	}

	/**
	 * Gets the isHeadExtent value for this HostUnresolvedVmfsExtent.
	 * 
	 * @return isHeadExtent
	 */
	public boolean isIsHeadExtent() {
		return isHeadExtent;
	}

	/**
	 * Sets the isHeadExtent value for this HostUnresolvedVmfsExtent.
	 * 
	 * @param isHeadExtent
	 */
	public void setIsHeadExtent(boolean isHeadExtent) {
		this.isHeadExtent = isHeadExtent;
	}

	/**
	 * Gets the ordinal value for this HostUnresolvedVmfsExtent.
	 * 
	 * @return ordinal
	 */
	public int getOrdinal() {
		return ordinal;
	}

	/**
	 * Sets the ordinal value for this HostUnresolvedVmfsExtent.
	 * 
	 * @param ordinal
	 */
	public void setOrdinal(int ordinal) {
		this.ordinal = ordinal;
	}

	/**
	 * Gets the startBlock value for this HostUnresolvedVmfsExtent.
	 * 
	 * @return startBlock
	 */
	public int getStartBlock() {
		return startBlock;
	}

	/**
	 * Sets the startBlock value for this HostUnresolvedVmfsExtent.
	 * 
	 * @param startBlock
	 */
	public void setStartBlock(int startBlock) {
		this.startBlock = startBlock;
	}

	/**
	 * Gets the endBlock value for this HostUnresolvedVmfsExtent.
	 * 
	 * @return endBlock
	 */
	public int getEndBlock() {
		return endBlock;
	}

	/**
	 * Sets the endBlock value for this HostUnresolvedVmfsExtent.
	 * 
	 * @param endBlock
	 */
	public void setEndBlock(int endBlock) {
		this.endBlock = endBlock;
	}

	/**
	 * Gets the reason value for this HostUnresolvedVmfsExtent.
	 * 
	 * @return reason
	 */
	public java.lang.String getReason() {
		return reason;
	}

	/**
	 * Sets the reason value for this HostUnresolvedVmfsExtent.
	 * 
	 * @param reason
	 */
	public void setReason(java.lang.String reason) {
		this.reason = reason;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof HostUnresolvedVmfsExtent)) {
			return false;
		}
		HostUnresolvedVmfsExtent other = (HostUnresolvedVmfsExtent) obj;
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
				&& ((this.device == null && other.getDevice() == null) || (this.device != null && this.device
						.equals(other.getDevice())))
				&& ((this.devicePath == null && other.getDevicePath() == null) || (this.devicePath != null && this.devicePath
						.equals(other.getDevicePath())))
				&& ((this.vmfsUuid == null && other.getVmfsUuid() == null) || (this.vmfsUuid != null && this.vmfsUuid
						.equals(other.getVmfsUuid())))
				&& this.isHeadExtent == other.isIsHeadExtent()
				&& this.ordinal == other.getOrdinal()
				&& this.startBlock == other.getStartBlock()
				&& this.endBlock == other.getEndBlock()
				&& ((this.reason == null && other.getReason() == null) || (this.reason != null && this.reason
						.equals(other.getReason())));
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
		if (getDevice() != null) {
			_hashCode += getDevice().hashCode();
		}
		if (getDevicePath() != null) {
			_hashCode += getDevicePath().hashCode();
		}
		if (getVmfsUuid() != null) {
			_hashCode += getVmfsUuid().hashCode();
		}
		_hashCode += (isIsHeadExtent() ? Boolean.TRUE : Boolean.FALSE)
				.hashCode();
		_hashCode += getOrdinal();
		_hashCode += getStartBlock();
		_hashCode += getEndBlock();
		if (getReason() != null) {
			_hashCode += getReason().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			HostUnresolvedVmfsExtent.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostUnresolvedVmfsExtent"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("device");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"device"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostScsiDiskPartition"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("devicePath");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"devicePath"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("vmfsUuid");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"vmfsUuid"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("isHeadExtent");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"isHeadExtent"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("ordinal");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"ordinal"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("startBlock");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"startBlock"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("endBlock");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"endBlock"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("reason");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"reason"));
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
