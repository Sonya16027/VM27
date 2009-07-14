/**
 * ScsiLunDurableName.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ScsiLunDurableName extends com.vmware.vim25.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String namespace;

	private byte namespaceId;

	private byte[] data;

	public ScsiLunDurableName() {
	}

	public ScsiLunDurableName(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.String namespace, byte namespaceId, byte[] data) {
		super(dynamicType, dynamicProperty);
		this.namespace = namespace;
		this.namespaceId = namespaceId;
		this.data = data;
	}

	/**
	 * Gets the namespace value for this ScsiLunDurableName.
	 * 
	 * @return namespace
	 */
	public java.lang.String getNamespace() {
		return namespace;
	}

	/**
	 * Sets the namespace value for this ScsiLunDurableName.
	 * 
	 * @param namespace
	 */
	public void setNamespace(java.lang.String namespace) {
		this.namespace = namespace;
	}

	/**
	 * Gets the namespaceId value for this ScsiLunDurableName.
	 * 
	 * @return namespaceId
	 */
	public byte getNamespaceId() {
		return namespaceId;
	}

	/**
	 * Sets the namespaceId value for this ScsiLunDurableName.
	 * 
	 * @param namespaceId
	 */
	public void setNamespaceId(byte namespaceId) {
		this.namespaceId = namespaceId;
	}

	/**
	 * Gets the data value for this ScsiLunDurableName.
	 * 
	 * @return data
	 */
	public byte[] getData() {
		return data;
	}

	/**
	 * Sets the data value for this ScsiLunDurableName.
	 * 
	 * @param data
	 */
	public void setData(byte[] data) {
		this.data = data;
	}

	public byte getData(int i) {
		return this.data[i];
	}

	public void setData(int i, byte _value) {
		this.data[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ScsiLunDurableName)) {
			return false;
		}
		ScsiLunDurableName other = (ScsiLunDurableName) obj;
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
				&& ((this.namespace == null && other.getNamespace() == null) || (this.namespace != null && this.namespace
						.equals(other.getNamespace())))
				&& this.namespaceId == other.getNamespaceId()
				&& ((this.data == null && other.getData() == null) || (this.data != null && java.util.Arrays
						.equals(this.data, other.getData())));
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
		if (getNamespace() != null) {
			_hashCode += getNamespace().hashCode();
		}
		_hashCode += getNamespaceId();
		if (getData() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getData()); i++) {
				java.lang.Object obj = java.lang.reflect.Array
						.get(getData(), i);
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
			ScsiLunDurableName.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ScsiLunDurableName"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("namespace");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"namespace"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("namespaceId");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"namespaceId"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "byte"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("data");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "data"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "byte"));
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
