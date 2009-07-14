/**
 * GuestDiskInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class GuestDiskInfo extends com.vmware.vim25.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String diskPath;

	private java.lang.Long capacity;

	private java.lang.Long freeSpace;

	public GuestDiskInfo() {
	}

	public GuestDiskInfo(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.String diskPath, java.lang.Long capacity,
			java.lang.Long freeSpace) {
		super(dynamicType, dynamicProperty);
		this.diskPath = diskPath;
		this.capacity = capacity;
		this.freeSpace = freeSpace;
	}

	/**
	 * Gets the diskPath value for this GuestDiskInfo.
	 * 
	 * @return diskPath
	 */
	public java.lang.String getDiskPath() {
		return diskPath;
	}

	/**
	 * Sets the diskPath value for this GuestDiskInfo.
	 * 
	 * @param diskPath
	 */
	public void setDiskPath(java.lang.String diskPath) {
		this.diskPath = diskPath;
	}

	/**
	 * Gets the capacity value for this GuestDiskInfo.
	 * 
	 * @return capacity
	 */
	public java.lang.Long getCapacity() {
		return capacity;
	}

	/**
	 * Sets the capacity value for this GuestDiskInfo.
	 * 
	 * @param capacity
	 */
	public void setCapacity(java.lang.Long capacity) {
		this.capacity = capacity;
	}

	/**
	 * Gets the freeSpace value for this GuestDiskInfo.
	 * 
	 * @return freeSpace
	 */
	public java.lang.Long getFreeSpace() {
		return freeSpace;
	}

	/**
	 * Sets the freeSpace value for this GuestDiskInfo.
	 * 
	 * @param freeSpace
	 */
	public void setFreeSpace(java.lang.Long freeSpace) {
		this.freeSpace = freeSpace;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof GuestDiskInfo)) {
			return false;
		}
		GuestDiskInfo other = (GuestDiskInfo) obj;
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
				&& ((this.diskPath == null && other.getDiskPath() == null) || (this.diskPath != null && this.diskPath
						.equals(other.getDiskPath())))
				&& ((this.capacity == null && other.getCapacity() == null) || (this.capacity != null && this.capacity
						.equals(other.getCapacity())))
				&& ((this.freeSpace == null && other.getFreeSpace() == null) || (this.freeSpace != null && this.freeSpace
						.equals(other.getFreeSpace())));
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
		if (getDiskPath() != null) {
			_hashCode += getDiskPath().hashCode();
		}
		if (getCapacity() != null) {
			_hashCode += getCapacity().hashCode();
		}
		if (getFreeSpace() != null) {
			_hashCode += getFreeSpace().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			GuestDiskInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"GuestDiskInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("diskPath");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"diskPath"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("capacity");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"capacity"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "long"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("freeSpace");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"freeSpace"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "long"));
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
