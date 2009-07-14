/**
 * PropertyChange.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim.sms;

public class PropertyChange extends com.vmware.vim.sms.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String name;

	private com.vmware.vim.sms.PropertyChangeOp op;

	private java.lang.Object val;

	public PropertyChange() {
	}

	public PropertyChange(java.lang.String dynamicType,
			com.vmware.vim.sms.DynamicProperty[] dynamicProperty,
			java.lang.String name, com.vmware.vim.sms.PropertyChangeOp op,
			java.lang.Object val) {
		super(dynamicType, dynamicProperty);
		this.name = name;
		this.op = op;
		this.val = val;
	}

	/**
	 * Gets the name value for this PropertyChange.
	 * 
	 * @return name
	 */
	public java.lang.String getName() {
		return name;
	}

	/**
	 * Sets the name value for this PropertyChange.
	 * 
	 * @param name
	 */
	public void setName(java.lang.String name) {
		this.name = name;
	}

	/**
	 * Gets the op value for this PropertyChange.
	 * 
	 * @return op
	 */
	public com.vmware.vim.sms.PropertyChangeOp getOp() {
		return op;
	}

	/**
	 * Sets the op value for this PropertyChange.
	 * 
	 * @param op
	 */
	public void setOp(com.vmware.vim.sms.PropertyChangeOp op) {
		this.op = op;
	}

	/**
	 * Gets the val value for this PropertyChange.
	 * 
	 * @return val
	 */
	public java.lang.Object getVal() {
		return val;
	}

	/**
	 * Sets the val value for this PropertyChange.
	 * 
	 * @param val
	 */
	public void setVal(java.lang.Object val) {
		this.val = val;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof PropertyChange)) {
			return false;
		}
		PropertyChange other = (PropertyChange) obj;
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
				&& ((this.op == null && other.getOp() == null) || (this.op != null && this.op
						.equals(other.getOp())))
				&& ((this.val == null && other.getVal() == null) || (this.val != null && this.val
						.equals(other.getVal())));
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
		if (getOp() != null) {
			_hashCode += getOp().hashCode();
		}
		if (getVal() != null) {
			_hashCode += getVal().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			PropertyChange.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sm1",
				"PropertyChange"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("name");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:sm1", "name"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("op");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:sm1", "op"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:sm1",
				"PropertyChangeOp"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("val");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:sm1", "val"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "anyType"));
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
