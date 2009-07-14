/**
 * LicenseManagerLicenseInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class LicenseManagerLicenseInfo extends com.vmware.vim25.DynamicData
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String licenseKey;

	private java.lang.String editionKey;

	private java.lang.String name;

	private int total;

	private java.lang.Integer used;

	private java.lang.String costUnit;

	private com.vmware.vim25.KeyAnyValue[] properties;

	private com.vmware.vim25.KeyValue[] labels;

	public LicenseManagerLicenseInfo() {
	}

	public LicenseManagerLicenseInfo(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.String licenseKey, java.lang.String editionKey,
			java.lang.String name, int total, java.lang.Integer used,
			java.lang.String costUnit,
			com.vmware.vim25.KeyAnyValue[] properties,
			com.vmware.vim25.KeyValue[] labels) {
		super(dynamicType, dynamicProperty);
		this.licenseKey = licenseKey;
		this.editionKey = editionKey;
		this.name = name;
		this.total = total;
		this.used = used;
		this.costUnit = costUnit;
		this.properties = properties;
		this.labels = labels;
	}

	/**
	 * Gets the licenseKey value for this LicenseManagerLicenseInfo.
	 * 
	 * @return licenseKey
	 */
	public java.lang.String getLicenseKey() {
		return licenseKey;
	}

	/**
	 * Sets the licenseKey value for this LicenseManagerLicenseInfo.
	 * 
	 * @param licenseKey
	 */
	public void setLicenseKey(java.lang.String licenseKey) {
		this.licenseKey = licenseKey;
	}

	/**
	 * Gets the editionKey value for this LicenseManagerLicenseInfo.
	 * 
	 * @return editionKey
	 */
	public java.lang.String getEditionKey() {
		return editionKey;
	}

	/**
	 * Sets the editionKey value for this LicenseManagerLicenseInfo.
	 * 
	 * @param editionKey
	 */
	public void setEditionKey(java.lang.String editionKey) {
		this.editionKey = editionKey;
	}

	/**
	 * Gets the name value for this LicenseManagerLicenseInfo.
	 * 
	 * @return name
	 */
	public java.lang.String getName() {
		return name;
	}

	/**
	 * Sets the name value for this LicenseManagerLicenseInfo.
	 * 
	 * @param name
	 */
	public void setName(java.lang.String name) {
		this.name = name;
	}

	/**
	 * Gets the total value for this LicenseManagerLicenseInfo.
	 * 
	 * @return total
	 */
	public int getTotal() {
		return total;
	}

	/**
	 * Sets the total value for this LicenseManagerLicenseInfo.
	 * 
	 * @param total
	 */
	public void setTotal(int total) {
		this.total = total;
	}

	/**
	 * Gets the used value for this LicenseManagerLicenseInfo.
	 * 
	 * @return used
	 */
	public java.lang.Integer getUsed() {
		return used;
	}

	/**
	 * Sets the used value for this LicenseManagerLicenseInfo.
	 * 
	 * @param used
	 */
	public void setUsed(java.lang.Integer used) {
		this.used = used;
	}

	/**
	 * Gets the costUnit value for this LicenseManagerLicenseInfo.
	 * 
	 * @return costUnit
	 */
	public java.lang.String getCostUnit() {
		return costUnit;
	}

	/**
	 * Sets the costUnit value for this LicenseManagerLicenseInfo.
	 * 
	 * @param costUnit
	 */
	public void setCostUnit(java.lang.String costUnit) {
		this.costUnit = costUnit;
	}

	/**
	 * Gets the properties value for this LicenseManagerLicenseInfo.
	 * 
	 * @return properties
	 */
	public com.vmware.vim25.KeyAnyValue[] getProperties() {
		return properties;
	}

	/**
	 * Sets the properties value for this LicenseManagerLicenseInfo.
	 * 
	 * @param properties
	 */
	public void setProperties(com.vmware.vim25.KeyAnyValue[] properties) {
		this.properties = properties;
	}

	public com.vmware.vim25.KeyAnyValue getProperties(int i) {
		return this.properties[i];
	}

	public void setProperties(int i, com.vmware.vim25.KeyAnyValue _value) {
		this.properties[i] = _value;
	}

	/**
	 * Gets the labels value for this LicenseManagerLicenseInfo.
	 * 
	 * @return labels
	 */
	public com.vmware.vim25.KeyValue[] getLabels() {
		return labels;
	}

	/**
	 * Sets the labels value for this LicenseManagerLicenseInfo.
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
		if (!(obj instanceof LicenseManagerLicenseInfo)) {
			return false;
		}
		LicenseManagerLicenseInfo other = (LicenseManagerLicenseInfo) obj;
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
				&& ((this.licenseKey == null && other.getLicenseKey() == null) || (this.licenseKey != null && this.licenseKey
						.equals(other.getLicenseKey())))
				&& ((this.editionKey == null && other.getEditionKey() == null) || (this.editionKey != null && this.editionKey
						.equals(other.getEditionKey())))
				&& ((this.name == null && other.getName() == null) || (this.name != null && this.name
						.equals(other.getName())))
				&& this.total == other.getTotal()
				&& ((this.used == null && other.getUsed() == null) || (this.used != null && this.used
						.equals(other.getUsed())))
				&& ((this.costUnit == null && other.getCostUnit() == null) || (this.costUnit != null && this.costUnit
						.equals(other.getCostUnit())))
				&& ((this.properties == null && other.getProperties() == null) || (this.properties != null && java.util.Arrays
						.equals(this.properties, other.getProperties())))
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
		int _hashCode = super.hashCode();
		if (getLicenseKey() != null) {
			_hashCode += getLicenseKey().hashCode();
		}
		if (getEditionKey() != null) {
			_hashCode += getEditionKey().hashCode();
		}
		if (getName() != null) {
			_hashCode += getName().hashCode();
		}
		_hashCode += getTotal();
		if (getUsed() != null) {
			_hashCode += getUsed().hashCode();
		}
		if (getCostUnit() != null) {
			_hashCode += getCostUnit().hashCode();
		}
		if (getProperties() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getProperties()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getProperties(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
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
			LicenseManagerLicenseInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"LicenseManagerLicenseInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("licenseKey");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"licenseKey"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("editionKey");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"editionKey"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("name");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "name"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("total");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "total"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("used");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "used"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("costUnit");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"costUnit"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("properties");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"properties"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"KeyAnyValue"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
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
