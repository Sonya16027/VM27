/**
 * CustomizationSpecInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class CustomizationSpecInfo extends com.vmware.vim25.DynamicData
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String name;

	private java.lang.String description;

	private java.lang.String type;

	private java.lang.String changeVersion;

	private java.util.Calendar lastUpdateTime;

	public CustomizationSpecInfo() {
	}

	public CustomizationSpecInfo(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.String name, java.lang.String description,
			java.lang.String type, java.lang.String changeVersion,
			java.util.Calendar lastUpdateTime) {
		super(dynamicType, dynamicProperty);
		this.name = name;
		this.description = description;
		this.type = type;
		this.changeVersion = changeVersion;
		this.lastUpdateTime = lastUpdateTime;
	}

	/**
	 * Gets the name value for this CustomizationSpecInfo.
	 * 
	 * @return name
	 */
	public java.lang.String getName() {
		return name;
	}

	/**
	 * Sets the name value for this CustomizationSpecInfo.
	 * 
	 * @param name
	 */
	public void setName(java.lang.String name) {
		this.name = name;
	}

	/**
	 * Gets the description value for this CustomizationSpecInfo.
	 * 
	 * @return description
	 */
	public java.lang.String getDescription() {
		return description;
	}

	/**
	 * Sets the description value for this CustomizationSpecInfo.
	 * 
	 * @param description
	 */
	public void setDescription(java.lang.String description) {
		this.description = description;
	}

	/**
	 * Gets the type value for this CustomizationSpecInfo.
	 * 
	 * @return type
	 */
	public java.lang.String getType() {
		return type;
	}

	/**
	 * Sets the type value for this CustomizationSpecInfo.
	 * 
	 * @param type
	 */
	public void setType(java.lang.String type) {
		this.type = type;
	}

	/**
	 * Gets the changeVersion value for this CustomizationSpecInfo.
	 * 
	 * @return changeVersion
	 */
	public java.lang.String getChangeVersion() {
		return changeVersion;
	}

	/**
	 * Sets the changeVersion value for this CustomizationSpecInfo.
	 * 
	 * @param changeVersion
	 */
	public void setChangeVersion(java.lang.String changeVersion) {
		this.changeVersion = changeVersion;
	}

	/**
	 * Gets the lastUpdateTime value for this CustomizationSpecInfo.
	 * 
	 * @return lastUpdateTime
	 */
	public java.util.Calendar getLastUpdateTime() {
		return lastUpdateTime;
	}

	/**
	 * Sets the lastUpdateTime value for this CustomizationSpecInfo.
	 * 
	 * @param lastUpdateTime
	 */
	public void setLastUpdateTime(java.util.Calendar lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof CustomizationSpecInfo)) {
			return false;
		}
		CustomizationSpecInfo other = (CustomizationSpecInfo) obj;
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
				&& ((this.name == null && other.getName() == null) || (this.name != null && this.name
						.equals(other.getName())))
				&& ((this.description == null && other.getDescription() == null) || (this.description != null && this.description
						.equals(other.getDescription())))
				&& ((this.type == null && other.getType() == null) || (this.type != null && this.type
						.equals(other.getType())))
				&& ((this.changeVersion == null && other.getChangeVersion() == null) || (this.changeVersion != null && this.changeVersion
						.equals(other.getChangeVersion())))
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
		if (getName() != null) {
			_hashCode += getName().hashCode();
		}
		if (getDescription() != null) {
			_hashCode += getDescription().hashCode();
		}
		if (getType() != null) {
			_hashCode += getType().hashCode();
		}
		if (getChangeVersion() != null) {
			_hashCode += getChangeVersion().hashCode();
		}
		if (getLastUpdateTime() != null) {
			_hashCode += getLastUpdateTime().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			CustomizationSpecInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"CustomizationSpecInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("name");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "name"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("description");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"description"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("type");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "type"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("changeVersion");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"changeVersion"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("lastUpdateTime");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
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
