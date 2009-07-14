/**
 * ArrayOfNodeProperty.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim.sms;

public class ArrayOfNodeProperty implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim.sms.NodeProperty[] nodeProperty;

	public ArrayOfNodeProperty() {
	}

	public ArrayOfNodeProperty(com.vmware.vim.sms.NodeProperty[] nodeProperty) {
		this.nodeProperty = nodeProperty;
	}

	/**
	 * Gets the nodeProperty value for this ArrayOfNodeProperty.
	 * 
	 * @return nodeProperty
	 */
	public com.vmware.vim.sms.NodeProperty[] getNodeProperty() {
		return nodeProperty;
	}

	/**
	 * Sets the nodeProperty value for this ArrayOfNodeProperty.
	 * 
	 * @param nodeProperty
	 */
	public void setNodeProperty(com.vmware.vim.sms.NodeProperty[] nodeProperty) {
		this.nodeProperty = nodeProperty;
	}

	public com.vmware.vim.sms.NodeProperty getNodeProperty(int i) {
		return this.nodeProperty[i];
	}

	public void setNodeProperty(int i, com.vmware.vim.sms.NodeProperty _value) {
		this.nodeProperty[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfNodeProperty)) {
			return false;
		}
		ArrayOfNodeProperty other = (ArrayOfNodeProperty) obj;
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
		_equals = true && ((this.nodeProperty == null && other
				.getNodeProperty() == null) || (this.nodeProperty != null && java.util.Arrays
				.equals(this.nodeProperty, other.getNodeProperty())));
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
		int _hashCode = 1;
		if (getNodeProperty() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getNodeProperty()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getNodeProperty(), i);
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
			ArrayOfNodeProperty.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sm1",
				"ArrayOfNodeProperty"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("nodeProperty");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:sm1",
				"NodeProperty"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:sm1",
				"NodeProperty"));
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
