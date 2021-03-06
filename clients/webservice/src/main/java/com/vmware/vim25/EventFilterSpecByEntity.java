/**
 * EventFilterSpecByEntity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class EventFilterSpecByEntity extends com.vmware.vim25.DynamicData
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.ManagedObjectReference entity;

	private com.vmware.vim25.EventFilterSpecRecursionOption recursion;

	public EventFilterSpecByEntity() {
	}

	public EventFilterSpecByEntity(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			com.vmware.vim25.ManagedObjectReference entity,
			com.vmware.vim25.EventFilterSpecRecursionOption recursion) {
		super(dynamicType, dynamicProperty);
		this.entity = entity;
		this.recursion = recursion;
	}

	/**
	 * Gets the entity value for this EventFilterSpecByEntity.
	 * 
	 * @return entity
	 */
	public com.vmware.vim25.ManagedObjectReference getEntity() {
		return entity;
	}

	/**
	 * Sets the entity value for this EventFilterSpecByEntity.
	 * 
	 * @param entity
	 */
	public void setEntity(com.vmware.vim25.ManagedObjectReference entity) {
		this.entity = entity;
	}

	/**
	 * Gets the recursion value for this EventFilterSpecByEntity.
	 * 
	 * @return recursion
	 */
	public com.vmware.vim25.EventFilterSpecRecursionOption getRecursion() {
		return recursion;
	}

	/**
	 * Sets the recursion value for this EventFilterSpecByEntity.
	 * 
	 * @param recursion
	 */
	public void setRecursion(
			com.vmware.vim25.EventFilterSpecRecursionOption recursion) {
		this.recursion = recursion;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof EventFilterSpecByEntity)) {
			return false;
		}
		EventFilterSpecByEntity other = (EventFilterSpecByEntity) obj;
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
				&& ((this.entity == null && other.getEntity() == null) || (this.entity != null && this.entity
						.equals(other.getEntity())))
				&& ((this.recursion == null && other.getRecursion() == null) || (this.recursion != null && this.recursion
						.equals(other.getRecursion())));
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
		if (getEntity() != null) {
			_hashCode += getEntity().hashCode();
		}
		if (getRecursion() != null) {
			_hashCode += getRecursion().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			EventFilterSpecByEntity.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"EventFilterSpecByEntity"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("entity");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"entity"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("recursion");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"recursion"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"EventFilterSpecRecursionOption"));
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
