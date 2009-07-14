/**
 * VmDiskFileInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VmDiskFileInfo extends com.vmware.vim25.FileInfo implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String diskType;

	private java.lang.Long capacityKb;

	private java.lang.Integer hardwareVersion;

	private java.lang.String controllerType;

	private java.lang.String[] diskExtents;

	private java.lang.Boolean thin;

	public VmDiskFileInfo() {
	}

	public VmDiskFileInfo(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.String path, java.lang.Long fileSize,
			java.util.Calendar modification, java.lang.String owner,
			java.lang.String diskType, java.lang.Long capacityKb,
			java.lang.Integer hardwareVersion, java.lang.String controllerType,
			java.lang.String[] diskExtents, java.lang.Boolean thin) {
		super(dynamicType, dynamicProperty, path, fileSize, modification, owner);
		this.diskType = diskType;
		this.capacityKb = capacityKb;
		this.hardwareVersion = hardwareVersion;
		this.controllerType = controllerType;
		this.diskExtents = diskExtents;
		this.thin = thin;
	}

	/**
	 * Gets the diskType value for this VmDiskFileInfo.
	 * 
	 * @return diskType
	 */
	public java.lang.String getDiskType() {
		return diskType;
	}

	/**
	 * Sets the diskType value for this VmDiskFileInfo.
	 * 
	 * @param diskType
	 */
	public void setDiskType(java.lang.String diskType) {
		this.diskType = diskType;
	}

	/**
	 * Gets the capacityKb value for this VmDiskFileInfo.
	 * 
	 * @return capacityKb
	 */
	public java.lang.Long getCapacityKb() {
		return capacityKb;
	}

	/**
	 * Sets the capacityKb value for this VmDiskFileInfo.
	 * 
	 * @param capacityKb
	 */
	public void setCapacityKb(java.lang.Long capacityKb) {
		this.capacityKb = capacityKb;
	}

	/**
	 * Gets the hardwareVersion value for this VmDiskFileInfo.
	 * 
	 * @return hardwareVersion
	 */
	public java.lang.Integer getHardwareVersion() {
		return hardwareVersion;
	}

	/**
	 * Sets the hardwareVersion value for this VmDiskFileInfo.
	 * 
	 * @param hardwareVersion
	 */
	public void setHardwareVersion(java.lang.Integer hardwareVersion) {
		this.hardwareVersion = hardwareVersion;
	}

	/**
	 * Gets the controllerType value for this VmDiskFileInfo.
	 * 
	 * @return controllerType
	 */
	public java.lang.String getControllerType() {
		return controllerType;
	}

	/**
	 * Sets the controllerType value for this VmDiskFileInfo.
	 * 
	 * @param controllerType
	 */
	public void setControllerType(java.lang.String controllerType) {
		this.controllerType = controllerType;
	}

	/**
	 * Gets the diskExtents value for this VmDiskFileInfo.
	 * 
	 * @return diskExtents
	 */
	public java.lang.String[] getDiskExtents() {
		return diskExtents;
	}

	/**
	 * Sets the diskExtents value for this VmDiskFileInfo.
	 * 
	 * @param diskExtents
	 */
	public void setDiskExtents(java.lang.String[] diskExtents) {
		this.diskExtents = diskExtents;
	}

	public java.lang.String getDiskExtents(int i) {
		return this.diskExtents[i];
	}

	public void setDiskExtents(int i, java.lang.String _value) {
		this.diskExtents[i] = _value;
	}

	/**
	 * Gets the thin value for this VmDiskFileInfo.
	 * 
	 * @return thin
	 */
	public java.lang.Boolean getThin() {
		return thin;
	}

	/**
	 * Sets the thin value for this VmDiskFileInfo.
	 * 
	 * @param thin
	 */
	public void setThin(java.lang.Boolean thin) {
		this.thin = thin;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof VmDiskFileInfo)) {
			return false;
		}
		VmDiskFileInfo other = (VmDiskFileInfo) obj;
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
				&& ((this.diskType == null && other.getDiskType() == null) || (this.diskType != null && this.diskType
						.equals(other.getDiskType())))
				&& ((this.capacityKb == null && other.getCapacityKb() == null) || (this.capacityKb != null && this.capacityKb
						.equals(other.getCapacityKb())))
				&& ((this.hardwareVersion == null && other.getHardwareVersion() == null) || (this.hardwareVersion != null && this.hardwareVersion
						.equals(other.getHardwareVersion())))
				&& ((this.controllerType == null && other.getControllerType() == null) || (this.controllerType != null && this.controllerType
						.equals(other.getControllerType())))
				&& ((this.diskExtents == null && other.getDiskExtents() == null) || (this.diskExtents != null && java.util.Arrays
						.equals(this.diskExtents, other.getDiskExtents())))
				&& ((this.thin == null && other.getThin() == null) || (this.thin != null && this.thin
						.equals(other.getThin())));
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
		if (getDiskType() != null) {
			_hashCode += getDiskType().hashCode();
		}
		if (getCapacityKb() != null) {
			_hashCode += getCapacityKb().hashCode();
		}
		if (getHardwareVersion() != null) {
			_hashCode += getHardwareVersion().hashCode();
		}
		if (getControllerType() != null) {
			_hashCode += getControllerType().hashCode();
		}
		if (getDiskExtents() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getDiskExtents()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getDiskExtents(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getThin() != null) {
			_hashCode += getThin().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			VmDiskFileInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VmDiskFileInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("diskType");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"diskType"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("capacityKb");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"capacityKb"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "long"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("hardwareVersion");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"hardwareVersion"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("controllerType");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"controllerType"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("diskExtents");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"diskExtents"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("thin");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "thin"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
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
