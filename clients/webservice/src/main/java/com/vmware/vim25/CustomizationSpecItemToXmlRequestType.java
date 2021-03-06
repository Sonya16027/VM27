/**
 * CustomizationSpecItemToXmlRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class CustomizationSpecItemToXmlRequestType implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.ManagedObjectReference _this;

	private com.vmware.vim25.CustomizationSpecItem item;

	public CustomizationSpecItemToXmlRequestType() {
	}

	public CustomizationSpecItemToXmlRequestType(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.CustomizationSpecItem item) {
		this._this = _this;
		this.item = item;
	}

	/**
	 * Gets the _this value for this CustomizationSpecItemToXmlRequestType.
	 * 
	 * @return _this
	 */
	public com.vmware.vim25.ManagedObjectReference get_this() {
		return _this;
	}

	/**
	 * Sets the _this value for this CustomizationSpecItemToXmlRequestType.
	 * 
	 * @param _this
	 */
	public void set_this(com.vmware.vim25.ManagedObjectReference _this) {
		this._this = _this;
	}

	/**
	 * Gets the item value for this CustomizationSpecItemToXmlRequestType.
	 * 
	 * @return item
	 */
	public com.vmware.vim25.CustomizationSpecItem getItem() {
		return item;
	}

	/**
	 * Sets the item value for this CustomizationSpecItemToXmlRequestType.
	 * 
	 * @param item
	 */
	public void setItem(com.vmware.vim25.CustomizationSpecItem item) {
		this.item = item;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof CustomizationSpecItemToXmlRequestType)) {
			return false;
		}
		CustomizationSpecItemToXmlRequestType other = (CustomizationSpecItemToXmlRequestType) obj;
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
				&& ((this.item == null && other.getItem() == null) || (this.item != null && this.item
						.equals(other.getItem())));
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
		if (getItem() != null) {
			_hashCode += getItem().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			CustomizationSpecItemToXmlRequestType.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"CustomizationSpecItemToXmlRequestType"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("_this");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "_this"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("item");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "item"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"CustomizationSpecItem"));
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
