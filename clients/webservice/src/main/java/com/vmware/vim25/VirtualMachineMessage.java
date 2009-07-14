/**
 * VirtualMachineMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VirtualMachineMessage extends com.vmware.vim25.DynamicData
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String id;

	private java.lang.Object[] argument;

	private java.lang.String text;

	public VirtualMachineMessage() {
	}

	public VirtualMachineMessage(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.String id, java.lang.Object[] argument,
			java.lang.String text) {
		super(dynamicType, dynamicProperty);
		this.id = id;
		this.argument = argument;
		this.text = text;
	}

	/**
	 * Gets the id value for this VirtualMachineMessage.
	 * 
	 * @return id
	 */
	public java.lang.String getId() {
		return id;
	}

	/**
	 * Sets the id value for this VirtualMachineMessage.
	 * 
	 * @param id
	 */
	public void setId(java.lang.String id) {
		this.id = id;
	}

	/**
	 * Gets the argument value for this VirtualMachineMessage.
	 * 
	 * @return argument
	 */
	public java.lang.Object[] getArgument() {
		return argument;
	}

	/**
	 * Sets the argument value for this VirtualMachineMessage.
	 * 
	 * @param argument
	 */
	public void setArgument(java.lang.Object[] argument) {
		this.argument = argument;
	}

	public java.lang.Object getArgument(int i) {
		return this.argument[i];
	}

	public void setArgument(int i, java.lang.Object _value) {
		this.argument[i] = _value;
	}

	/**
	 * Gets the text value for this VirtualMachineMessage.
	 * 
	 * @return text
	 */
	public java.lang.String getText() {
		return text;
	}

	/**
	 * Sets the text value for this VirtualMachineMessage.
	 * 
	 * @param text
	 */
	public void setText(java.lang.String text) {
		this.text = text;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof VirtualMachineMessage)) {
			return false;
		}
		VirtualMachineMessage other = (VirtualMachineMessage) obj;
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
				&& ((this.id == null && other.getId() == null) || (this.id != null && this.id
						.equals(other.getId())))
				&& ((this.argument == null && other.getArgument() == null) || (this.argument != null && java.util.Arrays
						.equals(this.argument, other.getArgument())))
				&& ((this.text == null && other.getText() == null) || (this.text != null && this.text
						.equals(other.getText())));
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
		if (getId() != null) {
			_hashCode += getId().hashCode();
		}
		if (getArgument() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getArgument()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getArgument(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getText() != null) {
			_hashCode += getText().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			VirtualMachineMessage.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VirtualMachineMessage"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("id");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "id"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("argument");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"argument"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "anyType"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("text");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "text"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
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
