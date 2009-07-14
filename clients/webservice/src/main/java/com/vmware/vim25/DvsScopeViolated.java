/**
 * DvsScopeViolated.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class DvsScopeViolated extends com.vmware.vim25.DvsFault implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.ManagedObjectReference[] scope;

	private com.vmware.vim25.ManagedObjectReference entity;

	public DvsScopeViolated() {
	}

	public DvsScopeViolated(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			com.vmware.vim25.LocalizedMethodFault faultCause,
			com.vmware.vim25.LocalizableMessage[] faultMessage,
			com.vmware.vim25.ManagedObjectReference[] scope,
			com.vmware.vim25.ManagedObjectReference entity) {
		super(dynamicType, dynamicProperty, faultCause, faultMessage);
		this.scope = scope;
		this.entity = entity;
	}

	/**
	 * Gets the scope value for this DvsScopeViolated.
	 * 
	 * @return scope
	 */
	public com.vmware.vim25.ManagedObjectReference[] getScope() {
		return scope;
	}

	/**
	 * Sets the scope value for this DvsScopeViolated.
	 * 
	 * @param scope
	 */
	public void setScope(com.vmware.vim25.ManagedObjectReference[] scope) {
		this.scope = scope;
	}

	public com.vmware.vim25.ManagedObjectReference getScope(int i) {
		return this.scope[i];
	}

	public void setScope(int i, com.vmware.vim25.ManagedObjectReference _value) {
		this.scope[i] = _value;
	}

	/**
	 * Gets the entity value for this DvsScopeViolated.
	 * 
	 * @return entity
	 */
	public com.vmware.vim25.ManagedObjectReference getEntity() {
		return entity;
	}

	/**
	 * Sets the entity value for this DvsScopeViolated.
	 * 
	 * @param entity
	 */
	public void setEntity(com.vmware.vim25.ManagedObjectReference entity) {
		this.entity = entity;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof DvsScopeViolated)) {
			return false;
		}
		DvsScopeViolated other = (DvsScopeViolated) obj;
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
				&& ((this.scope == null && other.getScope() == null) || (this.scope != null && java.util.Arrays
						.equals(this.scope, other.getScope())))
				&& ((this.entity == null && other.getEntity() == null) || (this.entity != null && this.entity
						.equals(other.getEntity())));
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
		if (getScope() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getScope()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getScope(),
						i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getEntity() != null) {
			_hashCode += getEntity().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			DvsScopeViolated.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"DvsScopeViolated"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("scope");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "scope"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("entity");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"entity"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
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

	/**
	 * Writes the exception data to the faultDetails
	 */
	@Override
	public void writeDetails(javax.xml.namespace.QName qname,
			org.apache.axis.encoding.SerializationContext context)
			throws java.io.IOException {
		context.serialize(qname, null, this);
	}
}
