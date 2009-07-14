/**
 * ArrayOfEdge.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim.sms;

public class ArrayOfEdge implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim.sms.Edge[] edge;

	public ArrayOfEdge() {
	}

	public ArrayOfEdge(com.vmware.vim.sms.Edge[] edge) {
		this.edge = edge;
	}

	/**
	 * Gets the edge value for this ArrayOfEdge.
	 * 
	 * @return edge
	 */
	public com.vmware.vim.sms.Edge[] getEdge() {
		return edge;
	}

	/**
	 * Sets the edge value for this ArrayOfEdge.
	 * 
	 * @param edge
	 */
	public void setEdge(com.vmware.vim.sms.Edge[] edge) {
		this.edge = edge;
	}

	public com.vmware.vim.sms.Edge getEdge(int i) {
		return this.edge[i];
	}

	public void setEdge(int i, com.vmware.vim.sms.Edge _value) {
		this.edge[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfEdge)) {
			return false;
		}
		ArrayOfEdge other = (ArrayOfEdge) obj;
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
		_equals = true && ((this.edge == null && other.getEdge() == null) || (this.edge != null && java.util.Arrays
				.equals(this.edge, other.getEdge())));
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
		if (getEdge() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getEdge()); i++) {
				java.lang.Object obj = java.lang.reflect.Array
						.get(getEdge(), i);
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
			ArrayOfEdge.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sm1",
				"ArrayOfEdge"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("edge");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:sm1", "Edge"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:sm1", "Edge"));
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
