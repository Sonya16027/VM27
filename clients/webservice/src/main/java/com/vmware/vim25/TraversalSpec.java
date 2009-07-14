/**
 * TraversalSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class TraversalSpec extends com.vmware.vim25.SelectionSpec implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String type;

	private java.lang.String path;

	private java.lang.Boolean skip;

	private com.vmware.vim25.SelectionSpec[] selectSet;

	public TraversalSpec() {
	}

	public TraversalSpec(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.String name, java.lang.String type,
			java.lang.String path, java.lang.Boolean skip,
			com.vmware.vim25.SelectionSpec[] selectSet) {
		super(dynamicType, dynamicProperty, name);
		this.type = type;
		this.path = path;
		this.skip = skip;
		this.selectSet = selectSet;
	}

	/**
	 * Gets the type value for this TraversalSpec.
	 * 
	 * @return type
	 */
	public java.lang.String getType() {
		return type;
	}

	/**
	 * Sets the type value for this TraversalSpec.
	 * 
	 * @param type
	 */
	public void setType(java.lang.String type) {
		this.type = type;
	}

	/**
	 * Gets the path value for this TraversalSpec.
	 * 
	 * @return path
	 */
	public java.lang.String getPath() {
		return path;
	}

	/**
	 * Sets the path value for this TraversalSpec.
	 * 
	 * @param path
	 */
	public void setPath(java.lang.String path) {
		this.path = path;
	}

	/**
	 * Gets the skip value for this TraversalSpec.
	 * 
	 * @return skip
	 */
	public java.lang.Boolean getSkip() {
		return skip;
	}

	/**
	 * Sets the skip value for this TraversalSpec.
	 * 
	 * @param skip
	 */
	public void setSkip(java.lang.Boolean skip) {
		this.skip = skip;
	}

	/**
	 * Gets the selectSet value for this TraversalSpec.
	 * 
	 * @return selectSet
	 */
	public com.vmware.vim25.SelectionSpec[] getSelectSet() {
		return selectSet;
	}

	/**
	 * Sets the selectSet value for this TraversalSpec.
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
		if (!(obj instanceof TraversalSpec)) {
			return false;
		}
		TraversalSpec other = (TraversalSpec) obj;
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
				&& ((this.type == null && other.getType() == null) || (this.type != null && this.type
						.equals(other.getType())))
				&& ((this.path == null && other.getPath() == null) || (this.path != null && this.path
						.equals(other.getPath())))
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
		if (getType() != null) {
			_hashCode += getType().hashCode();
		}
		if (getPath() != null) {
			_hashCode += getPath().hashCode();
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
			TraversalSpec.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"TraversalSpec"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("type");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "type"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("path");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "path"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
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
