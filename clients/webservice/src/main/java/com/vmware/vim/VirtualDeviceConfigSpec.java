/**
 * VirtualDeviceConfigSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class VirtualDeviceConfigSpec extends com.vmware.vim.DynamicData
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim.VirtualDeviceConfigSpecOperation operation;

	private com.vmware.vim.VirtualDeviceConfigSpecFileOperation fileOperation;

	private com.vmware.vim.VirtualDevice device;

	public VirtualDeviceConfigSpec() {
	}

	public VirtualDeviceConfigSpec(java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty,
			com.vmware.vim.VirtualDeviceConfigSpecOperation operation,
			com.vmware.vim.VirtualDeviceConfigSpecFileOperation fileOperation,
			com.vmware.vim.VirtualDevice device) {
		super(dynamicType, dynamicProperty);
		this.operation = operation;
		this.fileOperation = fileOperation;
		this.device = device;
	}

	/**
	 * Gets the operation value for this VirtualDeviceConfigSpec.
	 * 
	 * @return operation
	 */
	public com.vmware.vim.VirtualDeviceConfigSpecOperation getOperation() {
		return operation;
	}

	/**
	 * Sets the operation value for this VirtualDeviceConfigSpec.
	 * 
	 * @param operation
	 */
	public void setOperation(
			com.vmware.vim.VirtualDeviceConfigSpecOperation operation) {
		this.operation = operation;
	}

	/**
	 * Gets the fileOperation value for this VirtualDeviceConfigSpec.
	 * 
	 * @return fileOperation
	 */
	public com.vmware.vim.VirtualDeviceConfigSpecFileOperation getFileOperation() {
		return fileOperation;
	}

	/**
	 * Sets the fileOperation value for this VirtualDeviceConfigSpec.
	 * 
	 * @param fileOperation
	 */
	public void setFileOperation(
			com.vmware.vim.VirtualDeviceConfigSpecFileOperation fileOperation) {
		this.fileOperation = fileOperation;
	}

	/**
	 * Gets the device value for this VirtualDeviceConfigSpec.
	 * 
	 * @return device
	 */
	public com.vmware.vim.VirtualDevice getDevice() {
		return device;
	}

	/**
	 * Sets the device value for this VirtualDeviceConfigSpec.
	 * 
	 * @param device
	 */
	public void setDevice(com.vmware.vim.VirtualDevice device) {
		this.device = device;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof VirtualDeviceConfigSpec)) {
			return false;
		}
		VirtualDeviceConfigSpec other = (VirtualDeviceConfigSpec) obj;
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
				&& ((this.operation == null && other.getOperation() == null) || (this.operation != null && this.operation
						.equals(other.getOperation())))
				&& ((this.fileOperation == null && other.getFileOperation() == null) || (this.fileOperation != null && this.fileOperation
						.equals(other.getFileOperation())))
				&& ((this.device == null && other.getDevice() == null) || (this.device != null && this.device
						.equals(other.getDevice())));
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
		if (getOperation() != null) {
			_hashCode += getOperation().hashCode();
		}
		if (getFileOperation() != null) {
			_hashCode += getFileOperation().hashCode();
		}
		if (getDevice() != null) {
			_hashCode += getDevice().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			VirtualDeviceConfigSpec.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"VirtualDeviceConfigSpec"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("operation");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"operation"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"VirtualDeviceConfigSpecOperation"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("fileOperation");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"fileOperation"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"VirtualDeviceConfigSpecFileOperation"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("device");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim2", "device"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"VirtualDevice"));
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
