/**
 * ObjectSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ObjectSpec extends com.vmware.vim25.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.ManagedObjectReference obj;

	private java.lang.Boolean skip;

	private com.vmware.vim25.SelectionSpec[] selectSet;

	public ObjectSpec() {
	}

	public ObjectSpec(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			com.vmware.vim25.ManagedObjectReference obj,
			java.lang.Boolean skip, com.vmware.vim25.SelectionSpec[] selectSet) {
		super(dynamicType, dynamicProperty);
		this.obj = obj;
		this.skip = skip;
		this.selectSet = selectSet;
	}

	/**
	 * Gets the obj value for this ObjectSpec.
	 * 
	 * @return obj
	 */
	public com.vmware.vim25.ManagedObjectReference getObj() {
		return obj;
	}

	/**
	 * Sets the obj value for this ObjectSpec.
	 * 
	 * @param obj
	 */
	public void setObj(com.vmware.vim25.ManagedObjectReference obj) {
		this.obj = obj;
	}

	/**
	 * Gets the skip value for this ObjectSpec.
	 * 
	 * @return skip
	 */
	public java.lang.Boolean getSkip() {
		return skip;
	}

	/**
	 * Sets the skip value for this ObjectSpec.
	 * 
	 * @param skip
	 */
	public void setSkip(java.lang.Boolean skip) {
		this.skip = skip;
	}

	/**
	 * Gets the selectSet value for this ObjectSpec.
	 * 
	 * @return selectSet
	 */
	public com.vmware.vim25.SelectionSpec[] getSelectSet() {
		return selectSet;
	}

	/**
	 * Sets the selectSet value for this ObjectSpec.
	 * 
	 * @param selectSet
	 */
	public void setSelectSet(com.vmware.vim25.SelectionSpec[] selectSet) {
		this.selectSet = selectSet;
	}

	public com.vmware.vim25.SelectionSpec getSelectSet(int i) {
		return this.selectSet[i];
	}

	public void setSelectSet(int i, com.vmware.vim25.SelectionSpec _value) {
		this.selectSet[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ObjectSpec)) {
			return false;
		}
		ObjectSpec other = (ObjectSpec) obj;
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
				&& ((this.obj == null && other.getObj() == null) || (this.obj != null && this.obj
						.equals(other.getObj())))
				&& ((this.skip == null && other.getSkip() == null) || (this.skip != null && this.skip
						.equals(other.getSkip())))
				&& ((this.selectSet == null && other.getSelectSet() == null) || (this.selectSet != null && java.util.Arrays
						.equals(this.selectSet, other.getSelectSet())));
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
		if (getObj() != null) {
			_hashCode += getObj().hashCode();
		}
		if (getSkip() != null) {
			_hashCode += getSkip().hashCode();
		}
		if (getSelectSet() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getSelectSet()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getSelectSet(), i);
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
			ObjectSpec.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ObjectSpec"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("obj");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "obj"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("skip");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "skip"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("selectSet");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"selectSet"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"SelectionSpec"));
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
