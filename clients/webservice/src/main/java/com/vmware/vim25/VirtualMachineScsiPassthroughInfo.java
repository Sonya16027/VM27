/**
 * VirtualMachineScsiPassthroughInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VirtualMachineScsiPassthroughInfo extends
		com.vmware.vim25.VirtualMachineTargetInfo implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String scsiClass;

	private java.lang.String vendor;

	private int physicalUnitNumber;

	public VirtualMachineScsiPassthroughInfo() {
	}

	public VirtualMachineScsiPassthroughInfo(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.String name, java.lang.String[] configurationTag,
			java.lang.String scsiClass, java.lang.String vendor,
			int physicalUnitNumber) {
		super(dynamicType, dynamicProperty, name, configurationTag);
		this.scsiClass = scsiClass;
		this.vendor = vendor;
		this.physicalUnitNumber = physicalUnitNumber;
	}

	/**
	 * Gets the scsiClass value for this VirtualMachineScsiPassthroughInfo.
	 * 
	 * @return scsiClass
	 */
	public java.lang.String getScsiClass() {
		return scsiClass;
	}

	/**
	 * Sets the scsiClass value for this VirtualMachineScsiPassthroughInfo.
	 * 
	 * @param scsiClass
	 */
	public void setScsiClass(java.lang.String scsiClass) {
		this.scsiClass = scsiClass;
	}

	/**
	 * Gets the vendor value for this VirtualMachineScsiPassthroughInfo.
	 * 
	 * @return vendor
	 */
	public java.lang.String getVendor() {
		return vendor;
	}

	/**
	 * Sets the vendor value for this VirtualMachineScsiPassthroughInfo.
	 * 
	 * @param vendor
	 */
	public void setVendor(java.lang.String vendor) {
		this.vendor = vendor;
	}

	/**
	 * Gets the physicalUnitNumber value for this
	 * VirtualMachineScsiPassthroughInfo.
	 * 
	 * @return physicalUnitNumber
	 */
	public int getPhysicalUnitNumber() {
		return physicalUnitNumber;
	}

	/**
	 * Sets the physicalUnitNumber value for this
	 * VirtualMachineScsiPassthroughInfo.
	 * 
	 * @param physicalUnitNumber
	 */
	public void setPhysicalUnitNumber(int physicalUnitNumber) {
		this.physicalUnitNumber = physicalUnitNumber;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof VirtualMachineScsiPassthroughInfo)) {
			return false;
		}
		VirtualMachineScsiPassthroughInfo other = (VirtualMachineScsiPassthroughInfo) obj;
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
				&& ((this.scsiClass == null && other.getScsiClass() == null) || (this.scsiClass != null && this.scsiClass
						.equals(other.getScsiClass())))
				&& ((this.vendor == null && other.getVendor() == null) || (this.vendor != null && this.vendor
						.equals(other.getVendor())))
				&& this.physicalUnitNumber == other.getPhysicalUnitNumber();
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
		if (getScsiClass() != null) {
			_hashCode += getScsiClass().hashCode();
		}
		if (getVendor() != null) {
			_hashCode += getVendor().hashCode();
		}
		_hashCode += getPhysicalUnitNumber();
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			VirtualMachineScsiPassthroughInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VirtualMachineScsiPassthroughInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("scsiClass");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"scsiClass"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("vendor");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"vendor"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("physicalUnitNumber");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"physicalUnitNumber"));
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
