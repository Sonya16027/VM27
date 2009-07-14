/**
 * LicenseFeatureInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class LicenseFeatureInfo extends com.vmware.vim.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String key;

	private java.lang.String featureName;

	private com.vmware.vim.LicenseFeatureInfoState state;

	private java.lang.String costUnit;

	public LicenseFeatureInfo() {
	}

	public LicenseFeatureInfo(java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty,
			java.lang.String key, java.lang.String featureName,
			com.vmware.vim.LicenseFeatureInfoState state,
			java.lang.String costUnit) {
		super(dynamicType, dynamicProperty);
		this.key = key;
		this.featureName = featureName;
		this.state = state;
		this.costUnit = costUnit;
	}

	/**
	 * Gets the key value for this LicenseFeatureInfo.
	 * 
	 * @return key
	 */
	public java.lang.String getKey() {
		return key;
	}

	/**
	 * Sets the key value for this LicenseFeatureInfo.
	 * 
	 * @param key
	 */
	public void setKey(java.lang.String key) {
		this.key = key;
	}

	/**
	 * Gets the featureName value for this LicenseFeatureInfo.
	 * 
	 * @return featureName
	 */
	public java.lang.String getFeatureName() {
		return featureName;
	}

	/**
	 * Sets the featureName value for this LicenseFeatureInfo.
	 * 
	 * @param featureName
	 */
	public void setFeatureName(java.lang.String featureName) {
		this.featureName = featureName;
	}

	/**
	 * Gets the state value for this LicenseFeatureInfo.
	 * 
	 * @return state
	 */
	public com.vmware.vim.LicenseFeatureInfoState getState() {
		return state;
	}

	/**
	 * Sets the state value for this LicenseFeatureInfo.
	 * 
	 * @param state
	 */
	public void setState(com.vmware.vim.LicenseFeatureInfoState state) {
		this.state = state;
	}

	/**
	 * Gets the costUnit value for this LicenseFeatureInfo.
	 * 
	 * @return costUnit
	 */
	public java.lang.String getCostUnit() {
		return costUnit;
	}

	/**
	 * Sets the costUnit value for this LicenseFeatureInfo.
	 * 
	 * @param costUnit
	 */
	public void setCostUnit(java.lang.String costUnit) {
		this.costUnit = costUnit;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof LicenseFeatureInfo)) {
			return false;
		}
		LicenseFeatureInfo other = (LicenseFeatureInfo) obj;
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
				&& ((this.key == null && other.getKey() == null) || (this.key != null && this.key
						.equals(other.getKey())))
				&& ((this.featureName == null && other.getFeatureName() == null) || (this.featureName != null && this.featureName
						.equals(other.getFeatureName())))
				&& ((this.state == null && other.getState() == null) || (this.state != null && this.state
						.equals(other.getState())))
				&& ((this.costUnit == null && other.getCostUnit() == null) || (this.costUnit != null && this.costUnit
						.equals(other.getCostUnit())));
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
		if (getKey() != null) {
			_hashCode += getKey().hashCode();
		}
		if (getFeatureName() != null) {
			_hashCode += getFeatureName().hashCode();
		}
		if (getState() != null) {
			_hashCode += getState().hashCode();
		}
		if (getCostUnit() != null) {
			_hashCode += getCostUnit().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			LicenseFeatureInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"LicenseFeatureInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("key");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "key"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("featureName");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"featureName"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("state");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim2", "state"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"LicenseFeatureInfoState"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("costUnit");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"costUnit"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
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
