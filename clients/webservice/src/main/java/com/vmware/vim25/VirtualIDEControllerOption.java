/**
 * VirtualIDEControllerOption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VirtualIDEControllerOption extends
		com.vmware.vim25.VirtualControllerOption implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.IntOption numIDEDisks;

	private com.vmware.vim25.IntOption numIDECdroms;

	public VirtualIDEControllerOption() {
	}

	public VirtualIDEControllerOption(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.String type,
			com.vmware.vim25.VirtualDeviceConnectOption connectOption,
			java.lang.String controllerType,
			com.vmware.vim25.BoolOption autoAssignController,
			com.vmware.vim25.VirtualDeviceBackingOption[] backingOption,
			java.lang.Integer defaultBackingOptionIndex,
			java.lang.String[] licensingLimit, boolean deprecated,
			boolean plugAndPlay, java.lang.Boolean hotRemoveSupported,
			com.vmware.vim25.IntOption devices,
			java.lang.String[] supportedDevice,
			com.vmware.vim25.IntOption numIDEDisks,
			com.vmware.vim25.IntOption numIDECdroms) {
		super(dynamicType, dynamicProperty, type, connectOption,
				controllerType, autoAssignController, backingOption,
				defaultBackingOptionIndex, licensingLimit, deprecated,
				plugAndPlay, hotRemoveSupported, devices, supportedDevice);
		this.numIDEDisks = numIDEDisks;
		this.numIDECdroms = numIDECdroms;
	}

	/**
	 * Gets the numIDEDisks value for this VirtualIDEControllerOption.
	 * 
	 * @return numIDEDisks
	 */
	public com.vmware.vim25.IntOption getNumIDEDisks() {
		return numIDEDisks;
	}

	/**
	 * Sets the numIDEDisks value for this VirtualIDEControllerOption.
	 * 
	 * @param numIDEDisks
	 */
	public void setNumIDEDisks(com.vmware.vim25.IntOption numIDEDisks) {
		this.numIDEDisks = numIDEDisks;
	}

	/**
	 * Gets the numIDECdroms value for this VirtualIDEControllerOption.
	 * 
	 * @return numIDECdroms
	 */
	public com.vmware.vim25.IntOption getNumIDECdroms() {
		return numIDECdroms;
	}

	/**
	 * Sets the numIDECdroms value for this VirtualIDEControllerOption.
	 * 
	 * @param numIDECdroms
	 */
	public void setNumIDECdroms(com.vmware.vim25.IntOption numIDECdroms) {
		this.numIDECdroms = numIDECdroms;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof VirtualIDEControllerOption)) {
			return false;
		}
		VirtualIDEControllerOption other = (VirtualIDEControllerOption) obj;
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
				&& ((this.numIDEDisks == null && other.getNumIDEDisks() == null) || (this.numIDEDisks != null && this.numIDEDisks
						.equals(other.getNumIDEDisks())))
				&& ((this.numIDECdroms == null && other.getNumIDECdroms() == null) || (this.numIDECdroms != null && this.numIDECdroms
						.equals(other.getNumIDECdroms())));
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
		if (getNumIDEDisks() != null) {
			_hashCode += getNumIDEDisks().hashCode();
		}
		if (getNumIDECdroms() != null) {
			_hashCode += getNumIDECdroms().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			VirtualIDEControllerOption.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VirtualIDEControllerOption"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("numIDEDisks");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"numIDEDisks"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"IntOption"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("numIDECdroms");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"numIDECdroms"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"IntOption"));
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
