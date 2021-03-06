/**
 * ArrayOfNode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim.sms;

public class ArrayOfNode implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim.sms.Node[] node;

	public ArrayOfNode() {
	}

	public ArrayOfNode(com.vmware.vim.sms.Node[] node) {
		this.node = node;
	}

	/**
	 * Gets the node value for this ArrayOfNode.
	 * 
	 * @return node
	 */
	public com.vmware.vim.sms.Node[] getNode() {
		return node;
	}

	/**
	 * Sets the node value for this ArrayOfNode.
	 * 
	 * @param node
	 */
	public void setNode(com.vmware.vim.sms.Node[] node) {
		this.node = node;
	}

	public com.vmware.vim.sms.Node getNode(int i) {
		return this.node[i];
	}

	public void setNode(int i, com.vmware.vim.sms.Node _value) {
		this.node[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfNode)) {
			return false;
		}
		ArrayOfNode other = (ArrayOfNode) obj;
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
		_equals = true && ((this.node == null && other.getNode() == null) || (this.node != null && java.util.Arrays
				.equals(this.node, other.getNode())));
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
		if (getNode() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getNode()); i++) {
				java.lang.Object obj = java.lang.reflect.Array
						.get(getNode(), i);
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
			ArrayOfNode.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sm1",
				"ArrayOfNode"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("node");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:sm1", "Node"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:sm1", "Node"));
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
