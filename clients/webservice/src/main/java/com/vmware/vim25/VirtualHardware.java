/**
 * VirtualHardware.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VirtualHardware extends com.vmware.vim25.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int numCPU;

	private int memoryMB;

	private com.vmware.vim25.VirtualDevice[] device;

	public VirtualHardware() {
	}

	public VirtualHardware(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty, int numCPU,
			int memoryMB, com.vmware.vim25.VirtualDevice[] device) {
		super(dynamicType, dynamicProperty);
		this.numCPU = numCPU;
		this.memoryMB = memoryMB;
		this.device = device;
	}

	/**
	 * Gets the numCPU value for this VirtualHardware.
	 * 
	 * @return numCPU
	 */
	public int getNumCPU() {
		return numCPU;
	}

	/**
	 * Sets the numCPU value for this VirtualHardware.
	 * 
	 * @param numCPU
	 */
	public void setNumCPU(int numCPU) {
		this.numCPU = numCPU;
	}

	/**
	 * Gets the memoryMB value for this VirtualHardware.
	 * 
	 * @return memoryMB
	 */
	public int getMemoryMB() {
		return memoryMB;
	}

	/**
	 * Sets the memoryMB value for this VirtualHardware.
	 * 
	 * @param memoryMB
	 */
	public void setMemoryMB(int memoryMB) {
		this.memoryMB = memoryMB;
	}

	/**
	 * Gets the device value for this VirtualHardware.
	 * 
	 * @return device
	 */
	public com.vmware.vim25.VirtualDevice[] getDevice() {
		return device;
	}

	/**
	 * Sets the device value for this VirtualHardware.
	 * 
	 * @param device
	 */
	public void setDevice(com.vmware.vim25.VirtualDevice[] device) {
		this.device = device;
	}

	public com.vmware.vim25.VirtualDevice getDevice(int i) {
		return this.device[i];
	}

	public void setDevice(int i, com.vmware.vim25.VirtualDevice _value) {
		this.device[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof VirtualHardware)) {
			return false;
		}
		VirtualHardware other = (VirtualHardware) obj;
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
				&& this.numCPU == other.getNumCPU()
				&& this.memoryMB == other.getMemoryMB()
				&& ((this.device == null && other.getDevice() == null) || (this.device != null && java.util.Arrays
						.equals(this.device, other.getDevice())));
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
		_hashCode += getNumCPU();
		_hashCode += getMemoryMB();
		if (getDevice() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getDevice()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getDevice(),
						i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			VirtualHardware.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VirtualHardware"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("numCPU");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"numCPU"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("memoryMB");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"memoryMB"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("device");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"device"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VirtualDevice"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
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
