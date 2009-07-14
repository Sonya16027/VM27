/**
 * MoveDVPortRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class MoveDVPortRequestType implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.ManagedObjectReference _this;

	private java.lang.String[] portKey;

	private java.lang.String destinationPortgroupKey;

	public MoveDVPortRequestType() {
	}

	public MoveDVPortRequestType(com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String[] portKey, java.lang.String destinationPortgroupKey) {
		this._this = _this;
		this.portKey = portKey;
		this.destinationPortgroupKey = destinationPortgroupKey;
	}

	/**
	 * Gets the _this value for this MoveDVPortRequestType.
	 * 
	 * @return _this
	 */
	public com.vmware.vim25.ManagedObjectReference get_this() {
		return _this;
	}

	/**
	 * Sets the _this value for this MoveDVPortRequestType.
	 * 
	 * @param _this
	 */
	public void set_this(com.vmware.vim25.ManagedObjectReference _this) {
		this._this = _this;
	}

	/**
	 * Gets the portKey value for this MoveDVPortRequestType.
	 * 
	 * @return portKey
	 */
	public java.lang.String[] getPortKey() {
		return portKey;
	}

	/**
	 * Sets the portKey value for this MoveDVPortRequestType.
	 * 
	 * @param portKey
	 */
	public void setPortKey(java.lang.String[] portKey) {
		this.portKey = portKey;
	}

	public java.lang.String getPortKey(int i) {
		return this.portKey[i];
	}

	public void setPortKey(int i, java.lang.String _value) {
		this.portKey[i] = _value;
	}

	/**
	 * Gets the destinationPortgroupKey value for this MoveDVPortRequestType.
	 * 
	 * @return destinationPortgroupKey
	 */
	public java.lang.String getDestinationPortgroupKey() {
		return destinationPortgroupKey;
	}

	/**
	 * Sets the destinationPortgroupKey value for this MoveDVPortRequestType.
	 * 
	 * @param destinationPortgroupKey
	 */
	public void setDestinationPortgroupKey(
			java.lang.String destinationPortgroupKey) {
		this.destinationPortgroupKey = destinationPortgroupKey;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof MoveDVPortRequestType)) {
			return false;
		}
		MoveDVPortRequestType other = (MoveDVPortRequestType) obj;
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
		_equals = true
				&& ((this._this == null && other.get_this() == null) || (this._this != null && this._this
						.equals(other.get_this())))
				&& ((this.portKey == null && other.getPortKey() == null) || (this.portKey != null && java.util.Arrays
						.equals(this.portKey, other.getPortKey())))
				&& ((this.destinationPortgroupKey == null && other
						.getDestinationPortgroupKey() == null) || (this.destinationPortgroupKey != null && this.destinationPortgroupKey
						.equals(other.getDestinationPortgroupKey())));
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
		if (get_this() != null) {
			_hashCode += get_this().hashCode();
		}
		if (getPortKey() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getPortKey()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getPortKey(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getDestinationPortgroupKey() != null) {
			_hashCode += getDestinationPortgroupKey().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			MoveDVPortRequestType.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"MoveDVPortRequestType"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("_this");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "_this"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("portKey");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"portKey"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("destinationPortgroupKey");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"destinationPortgroupKey"));
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
