/**
 * VAppOvfSectionInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VAppOvfSectionInfo extends com.vmware.vim25.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.Integer key;

	private java.lang.String namespace;

	private java.lang.String type;

	private java.lang.Boolean atEnvelopeLevel;

	private java.lang.String contents;

	public VAppOvfSectionInfo() {
	}

	public VAppOvfSectionInfo(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.Integer key, java.lang.String namespace,
			java.lang.String type, java.lang.Boolean atEnvelopeLevel,
			java.lang.String contents) {
		super(dynamicType, dynamicProperty);
		this.key = key;
		this.namespace = namespace;
		this.type = type;
		this.atEnvelopeLevel = atEnvelopeLevel;
		this.contents = contents;
	}

	/**
	 * Gets the key value for this VAppOvfSectionInfo.
	 * 
	 * @return key
	 */
	public java.lang.Integer getKey() {
		return key;
	}

	/**
	 * Sets the key value for this VAppOvfSectionInfo.
	 * 
	 * @param key
	 */
	public void setKey(java.lang.Integer key) {
		this.key = key;
	}

	/**
	 * Gets the namespace value for this VAppOvfSectionInfo.
	 * 
	 * @return namespace
	 */
	public java.lang.String getNamespace() {
		return namespace;
	}

	/**
	 * Sets the namespace value for this VAppOvfSectionInfo.
	 * 
	 * @param namespace
	 */
	public void setNamespace(java.lang.String namespace) {
		this.namespace = namespace;
	}

	/**
	 * Gets the type value for this VAppOvfSectionInfo.
	 * 
	 * @return type
	 */
	public java.lang.String getType() {
		return type;
	}

	/**
	 * Sets the type value for this VAppOvfSectionInfo.
	 * 
	 * @param type
	 */
	public void setType(java.lang.String type) {
		this.type = type;
	}

	/**
	 * Gets the atEnvelopeLevel value for this VAppOvfSectionInfo.
	 * 
	 * @return atEnvelopeLevel
	 */
	public java.lang.Boolean getAtEnvelopeLevel() {
		return atEnvelopeLevel;
	}

	/**
	 * Sets the atEnvelopeLevel value for this VAppOvfSectionInfo.
	 * 
	 * @param atEnvelopeLevel
	 */
	public void setAtEnvelopeLevel(java.lang.Boolean atEnvelopeLevel) {
		this.atEnvelopeLevel = atEnvelopeLevel;
	}

	/**
	 * Gets the contents value for this VAppOvfSectionInfo.
	 * 
	 * @return contents
	 */
	public java.lang.String getContents() {
		return contents;
	}

	/**
	 * Sets the contents value for this VAppOvfSectionInfo.
	 * 
	 * @param contents
	 */
	public void setContents(java.lang.String contents) {
		this.contents = contents;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof VAppOvfSectionInfo)) {
			return false;
		}
		VAppOvfSectionInfo other = (VAppOvfSectionInfo) obj;
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
				&& ((this.namespace == null && other.getNamespace() == null) || (this.namespace != null && this.namespace
						.equals(other.getNamespace())))
				&& ((this.type == null && other.getType() == null) || (this.type != null && this.type
						.equals(other.getType())))
				&& ((this.atEnvelopeLevel == null && other.getAtEnvelopeLevel() == null) || (this.atEnvelopeLevel != null && this.atEnvelopeLevel
						.equals(other.getAtEnvelopeLevel())))
				&& ((this.contents == null && other.getContents() == null) || (this.contents != null && this.contents
						.equals(other.getContents())));
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
		if (getNamespace() != null) {
			_hashCode += getNamespace().hashCode();
		}
		if (getType() != null) {
			_hashCode += getType().hashCode();
		}
		if (getAtEnvelopeLevel() != null) {
			_hashCode += getAtEnvelopeLevel().hashCode();
		}
		if (getContents() != null) {
			_hashCode += getContents().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			VAppOvfSectionInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VAppOvfSectionInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("key");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "key"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("namespace");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"namespace"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("type");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "type"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("atEnvelopeLevel");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"atEnvelopeLevel"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("contents");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"contents"));
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
