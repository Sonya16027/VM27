/**
 * ParseDescriptorRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ParseDescriptorRequestType implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.ManagedObjectReference _this;

	private java.lang.String ovfDescriptor;

	private com.vmware.vim25.OvfParseDescriptorParams pdp;

	public ParseDescriptorRequestType() {
	}

	public ParseDescriptorRequestType(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String ovfDescriptor,
			com.vmware.vim25.OvfParseDescriptorParams pdp) {
		this._this = _this;
		this.ovfDescriptor = ovfDescriptor;
		this.pdp = pdp;
	}

	/**
	 * Gets the _this value for this ParseDescriptorRequestType.
	 * 
	 * @return _this
	 */
	public com.vmware.vim25.ManagedObjectReference get_this() {
		return _this;
	}

	/**
	 * Sets the _this value for this ParseDescriptorRequestType.
	 * 
	 * @param _this
	 */
	public void set_this(com.vmware.vim25.ManagedObjectReference _this) {
		this._this = _this;
	}

	/**
	 * Gets the ovfDescriptor value for this ParseDescriptorRequestType.
	 * 
	 * @return ovfDescriptor
	 */
	public java.lang.String getOvfDescriptor() {
		return ovfDescriptor;
	}

	/**
	 * Sets the ovfDescriptor value for this ParseDescriptorRequestType.
	 * 
	 * @param ovfDescriptor
	 */
	public void setOvfDescriptor(java.lang.String ovfDescriptor) {
		this.ovfDescriptor = ovfDescriptor;
	}

	/**
	 * Gets the pdp value for this ParseDescriptorRequestType.
	 * 
	 * @return pdp
	 */
	public com.vmware.vim25.OvfParseDescriptorParams getPdp() {
		return pdp;
	}

	/**
	 * Sets the pdp value for this ParseDescriptorRequestType.
	 * 
	 * @param pdp
	 */
	public void setPdp(com.vmware.vim25.OvfParseDescriptorParams pdp) {
		this.pdp = pdp;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ParseDescriptorRequestType)) {
			return false;
		}
		ParseDescriptorRequestType other = (ParseDescriptorRequestType) obj;
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
				&& ((this.ovfDescriptor == null && other.getOvfDescriptor() == null) || (this.ovfDescriptor != null && this.ovfDescriptor
						.equals(other.getOvfDescriptor())))
				&& ((this.pdp == null && other.getPdp() == null) || (this.pdp != null && this.pdp
						.equals(other.getPdp())));
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
		if (getOvfDescriptor() != null) {
			_hashCode += getOvfDescriptor().hashCode();
		}
		if (getPdp() != null) {
			_hashCode += getPdp().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			ParseDescriptorRequestType.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ParseDescriptorRequestType"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("_this");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "_this"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("ovfDescriptor");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"ovfDescriptor"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("pdp");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "pdp"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"OvfParseDescriptorParams"));
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
