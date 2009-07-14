/**
 * Map.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim.sms;

public class Map extends com.vmware.vim.sms.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim.sms.Node[] node;

	private com.vmware.vim.sms.Edge[] edge;

	private java.util.Calendar lastUpdateTime;

	public Map() {
	}

	public Map(java.lang.String dynamicType,
			com.vmware.vim.sms.DynamicProperty[] dynamicProperty,
			com.vmware.vim.sms.Node[] node, com.vmware.vim.sms.Edge[] edge,
			java.util.Calendar lastUpdateTime) {
		super(dynamicType, dynamicProperty);
		this.node = node;
		this.edge = edge;
		this.lastUpdateTime = lastUpdateTime;
	}

	/**
	 * Gets the node value for this Map.
	 * 
	 * @return node
	 */
	public com.vmware.vim.sms.Node[] getNode() {
		return node;
	}

	/**
	 * Sets the node value for this Map.
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

	/**
	 * Gets the edge value for this Map.
	 * 
	 * @return edge
	 */
	public com.vmware.vim.sms.Edge[] getEdge() {
		return edge;
	}

	/**
	 * Sets the edge value for this Map.
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

	/**
	 * Gets the lastUpdateTime value for this Map.
	 * 
	 * @return lastUpdateTime
	 */
	public java.util.Calendar getLastUpdateTime() {
		return lastUpdateTime;
	}

	/**
	 * Sets the lastUpdateTime value for this Map.
	 * 
	 * @param lastUpdateTime
	 */
	public void setLastUpdateTime(java.util.Calendar lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof Map)) {
			return false;
		}
		Map other = (Map) obj;
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
				&& ((this.node == null && other.getNode() == null) || (this.node != null && java.util.Arrays
						.equals(this.node, other.getNode())))
				&& ((this.edge == null && other.getEdge() == null) || (this.edge != null && java.util.Arrays
						.equals(this.edge, other.getEdge())))
				&& ((this.lastUpdateTime == null && other.getLastUpdateTime() == null) || (this.lastUpdateTime != null && this.lastUpdateTime
						.equals(other.getLastUpdateTime())));
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
		if (getNode() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getNode()); i++) {
				java.lang.Object obj = java.lang.reflect.Array
						.get(getNode(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getEdge() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getEdge()); i++) {
				java.lang.Object obj = java.lang.reflect.Array
						.get(getEdge(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getLastUpdateTime() != null) {
			_hashCode += getLastUpdateTime().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			Map.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sm1", "Map"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("node");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:sm1", "node"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:sm1", "Node"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("edge");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:sm1", "edge"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:sm1", "Edge"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("lastUpdateTime");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:sm1",
				"lastUpdateTime"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "dateTime"));
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
