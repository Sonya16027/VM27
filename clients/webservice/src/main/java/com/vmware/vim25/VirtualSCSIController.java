/**
 * VirtualSCSIController.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VirtualSCSIController extends com.vmware.vim25.VirtualController
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.Boolean hotAddRemove;

	private com.vmware.vim25.VirtualSCSISharing sharedBus;

	private java.lang.Integer scsiCtlrUnitNumber;

	public VirtualSCSIController() {
	}

	public VirtualSCSIController(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty, int key,
			com.vmware.vim25.Description deviceInfo,
			com.vmware.vim25.VirtualDeviceBackingInfo backing,
			com.vmware.vim25.VirtualDeviceConnectInfo connectable,
			java.lang.Integer controllerKey, java.lang.Integer unitNumber,
			int busNumber, int[] device, java.lang.Boolean hotAddRemove,
			com.vmware.vim25.VirtualSCSISharing sharedBus,
			java.lang.Integer scsiCtlrUnitNumber) {
		super(dynamicType, dynamicProperty, key, deviceInfo, backing,
				connectable, controllerKey, unitNumber, busNumber, device);
		this.hotAddRemove = hotAddRemove;
		this.sharedBus = sharedBus;
		this.scsiCtlrUnitNumber = scsiCtlrUnitNumber;
	}

	/**
	 * Gets the hotAddRemove value for this VirtualSCSIController.
	 * 
	 * @return hotAddRemove
	 */
	public java.lang.Boolean getHotAddRemove() {
		return hotAddRemove;
	}

	/**
	 * Sets the hotAddRemove value for this VirtualSCSIController.
	 * 
	 * @param hotAddRemove
	 */
	public void setHotAddRemove(java.lang.Boolean hotAddRemove) {
		this.hotAddRemove = hotAddRemove;
	}

	/**
	 * Gets the sharedBus value for this VirtualSCSIController.
	 * 
	 * @return sharedBus
	 */
	public com.vmware.vim25.VirtualSCSISharing getSharedBus() {
		return sharedBus;
	}

	/**
	 * Sets the sharedBus value for this VirtualSCSIController.
	 * 
	 * @param sharedBus
	 */
	public void setSharedBus(com.vmware.vim25.VirtualSCSISharing sharedBus) {
		this.sharedBus = sharedBus;
	}

	/**
	 * Gets the scsiCtlrUnitNumber value for this VirtualSCSIController.
	 * 
	 * @return scsiCtlrUnitNumber
	 */
	public java.lang.Integer getScsiCtlrUnitNumber() {
		return scsiCtlrUnitNumber;
	}

	/**
	 * Sets the scsiCtlrUnitNumber value for this VirtualSCSIController.
	 * 
	 * @param scsiCtlrUnitNumber
	 */
	public void setScsiCtlrUnitNumber(java.lang.Integer scsiCtlrUnitNumber) {
		this.scsiCtlrUnitNumber = scsiCtlrUnitNumber;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof VirtualSCSIController)) {
			return false;
		}
		VirtualSCSIController other = (VirtualSCSIController) obj;
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
				&& ((this.hotAddRemove == null && other.getHotAddRemove() == null) || (this.hotAddRemove != null && this.hotAddRemove
						.equals(other.getHotAddRemove())))
				&& ((this.sharedBus == null && other.getSharedBus() == null) || (this.sharedBus != null && this.sharedBus
						.equals(other.getSharedBus())))
				&& ((this.scsiCtlrUnitNumber == null && other
						.getScsiCtlrUnitNumber() == null) || (this.scsiCtlrUnitNumber != null && this.scsiCtlrUnitNumber
						.equals(other.getScsiCtlrUnitNumber())));
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
		if (getHotAddRemove() != null) {
			_hashCode += getHotAddRemove().hashCode();
		}
		if (getSharedBus() != null) {
			_hashCode += getSharedBus().hashCode();
		}
		if (getScsiCtlrUnitNumber() != null) {
			_hashCode += getScsiCtlrUnitNumber().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			VirtualSCSIController.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VirtualSCSIController"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("hotAddRemove");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"hotAddRemove"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("sharedBus");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"sharedBus"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VirtualSCSISharing"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("scsiCtlrUnitNumber");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"scsiCtlrUnitNumber"));
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
