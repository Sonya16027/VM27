/**
 * MethodAction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class MethodAction extends com.vmware.vim.Action implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String name;

	private com.vmware.vim.MethodActionArgument[] argument;

	public MethodAction() {
	}

	public MethodAction(java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty,
			java.lang.String name,
			com.vmware.vim.MethodActionArgument[] argument) {
		super(dynamicType, dynamicProperty);
		this.name = name;
		this.argument = argument;
	}

	/**
	 * Gets the name value for this MethodAction.
	 * 
	 * @return name
	 */
	public java.lang.String getName() {
		return name;
	}

	/**
	 * Sets the name value for this MethodAction.
	 * 
	 * @param name
	 */
	public void setName(java.lang.String name) {
		this.name = name;
	}

	/**
	 * Gets the argument value for this MethodAction.
	 * 
	 * @return argument
	 */
	public com.vmware.vim.MethodActionArgument[] getArgument() {
		return argument;
	}

	/**
	 * Sets the argument value for this MethodAction.
	 * 
	 * @param argument
	 */
	public void setArgument(com.vmware.vim.MethodActionArgument[] argument) {
		this.argument = argument;
	}

	public com.vmware.vim.MethodActionArgument getArgument(int i) {
		return this.argument[i];
	}

	public void setArgument(int i, com.vmware.vim.MethodActionArgument _value) {
		this.argument[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof MethodAction)) {
			return false;
		}
		MethodAction other = (MethodAction) obj;
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
				&& ((this.name == null && other.getName() == null) || (this.name != null && this.name
						.equals(other.getName())))
				&& ((this.argument == null && other.getArgument() == null) || (this.argument != null && java.util.Arrays
						.equals(this.argument, other.getArgument())));
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
		if (getName() != null) {
			_hashCode += getName().hashCode();
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
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			MethodAction.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"MethodAction"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("name");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "name"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("argument");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"argument"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"MethodActionArgument"));
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
