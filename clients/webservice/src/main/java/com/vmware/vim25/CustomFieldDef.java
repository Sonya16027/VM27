/**
 * CustomFieldDef.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class CustomFieldDef extends com.vmware.vim25.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int key;

	private java.lang.String name;

	private java.lang.String type;

	private java.lang.String managedObjectType;

	private com.vmware.vim25.PrivilegePolicyDef fieldDefPrivileges;

	private com.vmware.vim25.PrivilegePolicyDef fieldInstancePrivileges;

	public CustomFieldDef() {
	}

	public CustomFieldDef(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty, int key,
			java.lang.String name, java.lang.String type,
			java.lang.String managedObjectType,
			com.vmware.vim25.PrivilegePolicyDef fieldDefPrivileges,
			com.vmware.vim25.PrivilegePolicyDef fieldInstancePrivileges) {
		super(dynamicType, dynamicProperty);
		this.key = key;
		this.name = name;
		this.type = type;
		this.managedObjectType = managedObjectType;
		this.fieldDefPrivileges = fieldDefPrivileges;
		this.fieldInstancePrivileges = fieldInstancePrivileges;
	}

	/**
	 * Gets the key value for this CustomFieldDef.
	 * 
	 * @return key
	 */
	public int getKey() {
		return key;
	}

	/**
	 * Sets the key value for this CustomFieldDef.
	 * 
	 * @param key
	 */
	public void setKey(int key) {
		this.key = key;
	}

	/**
	 * Gets the name value for this CustomFieldDef.
	 * 
	 * @return name
	 */
	public java.lang.String getName() {
		return name;
	}

	/**
	 * Sets the name value for this CustomFieldDef.
	 * 
	 * @param name
	 */
	public void setName(java.lang.String name) {
		this.name = name;
	}

	/**
	 * Gets the type value for this CustomFieldDef.
	 * 
	 * @return type
	 */
	public java.lang.String getType() {
		return type;
	}

	/**
	 * Sets the type value for this CustomFieldDef.
	 * 
	 * @param type
	 */
	public void setType(java.lang.String type) {
		this.type = type;
	}

	/**
	 * Gets the managedObjectType value for this CustomFieldDef.
	 * 
	 * @return managedObjectType
	 */
	public java.lang.String getManagedObjectType() {
		return managedObjectType;
	}

	/**
	 * Sets the managedObjectType value for this CustomFieldDef.
	 * 
	 * @param managedObjectType
	 */
	public void setManagedObjectType(java.lang.String managedObjectType) {
		this.managedObjectType = managedObjectType;
	}

	/**
	 * Gets the fieldDefPrivileges value for this CustomFieldDef.
	 * 
	 * @return fieldDefPrivileges
	 */
	public com.vmware.vim25.PrivilegePolicyDef getFieldDefPrivileges() {
		return fieldDefPrivileges;
	}

	/**
	 * Sets the fieldDefPrivileges value for this CustomFieldDef.
	 * 
	 * @param fieldDefPrivileges
	 */
	public void setFieldDefPrivileges(
			com.vmware.vim25.PrivilegePolicyDef fieldDefPrivileges) {
		this.fieldDefPrivileges = fieldDefPrivileges;
	}

	/**
	 * Gets the fieldInstancePrivileges value for this CustomFieldDef.
	 * 
	 * @return fieldInstancePrivileges
	 */
	public com.vmware.vim25.PrivilegePolicyDef getFieldInstancePrivileges() {
		return fieldInstancePrivileges;
	}

	/**
	 * Sets the fieldInstancePrivileges value for this CustomFieldDef.
	 * 
	 * @param fieldInstancePrivileges
	 */
	public void setFieldInstancePrivileges(
			com.vmware.vim25.PrivilegePolicyDef fieldInstancePrivileges) {
		this.fieldInstancePrivileges = fieldInstancePrivileges;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof CustomFieldDef)) {
			return false;
		}
		CustomFieldDef other = (CustomFieldDef) obj;
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
				&& this.key == other.getKey()
				&& ((this.name == null && other.getName() == null) || (this.name != null && this.name
						.equals(other.getName())))
				&& ((this.type == null && other.getType() == null) || (this.type != null && this.type
						.equals(other.getType())))
				&& ((this.managedObjectType == null && other
						.getManagedObjectType() == null) || (this.managedObjectType != null && this.managedObjectType
						.equals(other.getManagedObjectType())))
				&& ((this.fieldDefPrivileges == null && other
						.getFieldDefPrivileges() == null) || (this.fieldDefPrivileges != null && this.fieldDefPrivileges
						.equals(other.getFieldDefPrivileges())))
				&& ((this.fieldInstancePrivileges == null && other
						.getFieldInstancePrivileges() == null) || (this.fieldInstancePrivileges != null && this.fieldInstancePrivileges
						.equals(other.getFieldInstancePrivileges())));
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
		_hashCode += getKey();
		if (getName() != null) {
			_hashCode += getName().hashCode();
		}
		if (getType() != null) {
			_hashCode += getType().hashCode();
		}
		if (getManagedObjectType() != null) {
			_hashCode += getManagedObjectType().hashCode();
		}
		if (getFieldDefPrivileges() != null) {
			_hashCode += getFieldDefPrivileges().hashCode();
		}
		if (getFieldInstancePrivileges() != null) {
			_hashCode += getFieldInstancePrivileges().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			CustomFieldDef.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"CustomFieldDef"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("key");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "key"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
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
		elemField.setFieldName("type");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "type"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("managedObjectType");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"managedObjectType"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("fieldDefPrivileges");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"fieldDefPrivileges"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"PrivilegePolicyDef"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("fieldInstancePrivileges");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"fieldInstancePrivileges"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"PrivilegePolicyDef"));
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
