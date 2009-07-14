/**
 * UpdateLicenseRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class UpdateLicenseRequestType implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.ManagedObjectReference _this;

	private java.lang.String licenseKey;

	private com.vmware.vim25.KeyValue[] labels;

	public UpdateLicenseRequestType() {
	}

	public UpdateLicenseRequestType(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String licenseKey, com.vmware.vim25.KeyValue[] labels) {
		this._this = _this;
		this.licenseKey = licenseKey;
		this.labels = labels;
	}

	/**
	 * Gets the _this value for this UpdateLicenseRequestType.
	 * 
	 * @return _this
	 */
	public com.vmware.vim25.ManagedObjectReference get_this() {
		return _this;
	}

	/**
	 * Sets the _this value for this UpdateLicenseRequestType.
	 * 
	 * @param _this
	 */
	public void set_this(com.vmware.vim25.ManagedObjectReference _this) {
		this._this = _this;
	}

	/**
	 * Gets the licenseKey value for this UpdateLicenseRequestType.
	 * 
	 * @return licenseKey
	 */
	public java.lang.String getLicenseKey() {
		return licenseKey;
	}

	/**
	 * Sets the licenseKey value for this UpdateLicenseRequestType.
	 * 
	 * @param licenseKey
	 */
	public void setLicenseKey(java.lang.String licenseKey) {
		this.licenseKey = licenseKey;
	}

	/**
	 * Gets the labels value for this UpdateLicenseRequestType.
	 * 
	 * @return labels
	 */
	public com.vmware.vim25.KeyValue[] getLabels() {
		return labels;
	}

	/**
	 * Sets the labels value for this UpdateLicenseRequestType.
	 * 
	 * @param labels
	 */
	public void setLabels(com.vmware.vim25.KeyValue[] labels) {
		this.labels = labels;
	}

	public com.vmware.vim25.KeyValue getLabels(int i) {
		return this.labels[i];
	}

	public void setLabels(int i, com.vmware.vim25.KeyValue _value) {
		this.labels[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof UpdateLicenseRequestType)) {
			return false;
		}
		UpdateLicenseRequestType other = (UpdateLicenseRequestType) obj;
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
				&& ((this.licenseKey == null && other.getLicenseKey() == null) || (this.licenseKey != null && this.licenseKey
						.equals(other.getLicenseKey())))
				&& ((this.labels == null && other.getLabels() == null) || (this.labels != null && java.util.Arrays
						.equals(this.labels, other.getLabels())));
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
		if (getLicenseKey() != null) {
			_hashCode += getLicenseKey().hashCode();
		}
		if (getLabels() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getLabels()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getLabels(),
						i);
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
			UpdateLicenseRequestType.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"UpdateLicenseRequestType"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("_this");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "_this"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("licenseKey");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"licenseKey"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("labels");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"labels"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"KeyValue"));
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
