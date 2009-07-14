/**
 * VirtualMachineDiskDeviceInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VirtualMachineDiskDeviceInfo extends
		com.vmware.vim25.VirtualMachineTargetInfo implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.Long capacity;

	private com.vmware.vim25.ManagedObjectReference[] vm;

	public VirtualMachineDiskDeviceInfo() {
	}

	public VirtualMachineDiskDeviceInfo(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.String name, java.lang.String[] configurationTag,
			java.lang.Long capacity,
			com.vmware.vim25.ManagedObjectReference[] vm) {
		super(dynamicType, dynamicProperty, name, configurationTag);
		this.capacity = capacity;
		this.vm = vm;
	}

	/**
	 * Gets the capacity value for this VirtualMachineDiskDeviceInfo.
	 * 
	 * @return capacity
	 */
	public java.lang.Long getCapacity() {
		return capacity;
	}

	/**
	 * Sets the capacity value for this VirtualMachineDiskDeviceInfo.
	 * 
	 * @param capacity
	 */
	public void setCapacity(java.lang.Long capacity) {
		this.capacity = capacity;
	}

	/**
	 * Gets the vm value for this VirtualMachineDiskDeviceInfo.
	 * 
	 * @return vm
	 */
	public com.vmware.vim25.ManagedObjectReference[] getVm() {
		return vm;
	}

	/**
	 * Sets the vm value for this VirtualMachineDiskDeviceInfo.
	 * 
	 * @param vm
	 */
	public void setVm(com.vmware.vim25.ManagedObjectReference[] vm) {
		this.vm = vm;
	}

	public com.vmware.vim25.ManagedObjectReference getVm(int i) {
		return this.vm[i];
	}

	public void setVm(int i, com.vmware.vim25.ManagedObjectReference _value) {
		this.vm[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof VirtualMachineDiskDeviceInfo)) {
			return false;
		}
		VirtualMachineDiskDeviceInfo other = (VirtualMachineDiskDeviceInfo) obj;
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
				&& ((this.capacity == null && other.getCapacity() == null) || (this.capacity != null && this.capacity
						.equals(other.getCapacity())))
				&& ((this.vm == null && other.getVm() == null) || (this.vm != null && java.util.Arrays
						.equals(this.vm, other.getVm())));
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
		if (getCapacity() != null) {
			_hashCode += getCapacity().hashCode();
		}
		if (getVm() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getVm()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getVm(), i);
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
			VirtualMachineDiskDeviceInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VirtualMachineDiskDeviceInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("capacity");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"capacity"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "long"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("vm");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vm"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
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
