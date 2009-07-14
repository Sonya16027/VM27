/**
 * VirtualMachineFileLayoutExFileInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VirtualMachineFileLayoutExFileInfo extends
		com.vmware.vim25.DynamicData implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int key;

	private java.lang.String name;

	private java.lang.String type;

	private long size;

	public VirtualMachineFileLayoutExFileInfo() {
	}

	public VirtualMachineFileLayoutExFileInfo(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty, int key,
			java.lang.String name, java.lang.String type, long size) {
		super(dynamicType, dynamicProperty);
		this.key = key;
		this.name = name;
		this.type = type;
		this.size = size;
	}

	/**
	 * Gets the key value for this VirtualMachineFileLayoutExFileInfo.
	 * 
	 * @return key
	 */
	public int getKey() {
		return key;
	}

	/**
	 * Sets the key value for this VirtualMachineFileLayoutExFileInfo.
	 * 
	 * @param key
	 */
	public void setKey(int key) {
		this.key = key;
	}

	/**
	 * Gets the name value for this VirtualMachineFileLayoutExFileInfo.
	 * 
	 * @return name
	 */
	public java.lang.String getName() {
		return name;
	}

	/**
	 * Sets the name value for this VirtualMachineFileLayoutExFileInfo.
	 * 
	 * @param name
	 */
	public void setName(java.lang.String name) {
		this.name = name;
	}

	/**
	 * Gets the type value for this VirtualMachineFileLayoutExFileInfo.
	 * 
	 * @return type
	 */
	public java.lang.String getType() {
		return type;
	}

	/**
	 * Sets the type value for this VirtualMachineFileLayoutExFileInfo.
	 * 
	 * @param type
	 */
	public void setType(java.lang.String type) {
		this.type = type;
	}

	/**
	 * Gets the size value for this VirtualMachineFileLayoutExFileInfo.
	 * 
	 * @return size
	 */
	public long getSize() {
		return size;
	}

	/**
	 * Sets the size value for this VirtualMachineFileLayoutExFileInfo.
	 * 
	 * @param size
	 */
	public void setSize(long size) {
		this.size = size;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof VirtualMachineFileLayoutExFileInfo)) {
			return false;
		}
		VirtualMachineFileLayoutExFileInfo other = (VirtualMachineFileLayoutExFileInfo) obj;
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
				&& this.key == other.getKey()
				&& ((this.name == null && other.getName() == null) || (this.name != null && this.name
						.equals(other.getName())))
				&& ((this.type == null && other.getType() == null) || (this.type != null && this.type
						.equals(other.getType())))
				&& this.size == other.getSize();
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
		_hashCode += getKey();
		if (getName() != null) {
			_hashCode += getName().hashCode();
		}
		if (getType() != null) {
			_hashCode += getType().hashCode();
		}
		_hashCode += new Long(getSize()).hashCode();
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			VirtualMachineFileLayoutExFileInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VirtualMachineFileLayoutExFileInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("key");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "key"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("name");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "name"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("type");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "type"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("size");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "size"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "long"));
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
