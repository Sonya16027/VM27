/**
 * PerfCompositeMetric.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class PerfCompositeMetric extends com.vmware.vim.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim.PerfEntityMetricBase entity;

	private com.vmware.vim.PerfEntityMetricBase[] childEntity;

	public PerfCompositeMetric() {
	}

	public PerfCompositeMetric(java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty,
			com.vmware.vim.PerfEntityMetricBase entity,
			com.vmware.vim.PerfEntityMetricBase[] childEntity) {
		super(dynamicType, dynamicProperty);
		this.entity = entity;
		this.childEntity = childEntity;
	}

	/**
	 * Gets the entity value for this PerfCompositeMetric.
	 * 
	 * @return entity
	 */
	public com.vmware.vim.PerfEntityMetricBase getEntity() {
		return entity;
	}

	/**
	 * Sets the entity value for this PerfCompositeMetric.
	 * 
	 * @param entity
	 */
	public void setEntity(com.vmware.vim.PerfEntityMetricBase entity) {
		this.entity = entity;
	}

	/**
	 * Gets the childEntity value for this PerfCompositeMetric.
	 * 
	 * @return childEntity
	 */
	public com.vmware.vim.PerfEntityMetricBase[] getChildEntity() {
		return childEntity;
	}

	/**
	 * Sets the childEntity value for this PerfCompositeMetric.
	 * 
	 * @param childEntity
	 */
	public void setChildEntity(com.vmware.vim.PerfEntityMetricBase[] childEntity) {
		this.childEntity = childEntity;
	}

	public com.vmware.vim.PerfEntityMetricBase getChildEntity(int i) {
		return this.childEntity[i];
	}

	public void setChildEntity(int i, com.vmware.vim.PerfEntityMetricBase _value) {
		this.childEntity[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof PerfCompositeMetric)) {
			return false;
		}
		PerfCompositeMetric other = (PerfCompositeMetric) obj;
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
				&& ((this.childEntity == null && other.getChildEntity() == null) || (this.childEntity != null && java.util.Arrays
						.equals(this.childEntity, other.getChildEntity())));
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
		if (getChildEntity() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getChildEntity()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getChildEntity(), i);
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
			PerfCompositeMetric.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"PerfCompositeMetric"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("entity");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim2", "entity"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"PerfEntityMetricBase"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("childEntity");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"childEntity"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"PerfEntityMetricBase"));
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
