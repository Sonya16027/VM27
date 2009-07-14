/**
 * PropertySpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class PropertySpec extends com.vmware.vim.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String type;

	private java.lang.Boolean all;

	private java.lang.String[] pathSet;

	public PropertySpec() {
	}

	public PropertySpec(java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty,
			java.lang.String type, java.lang.Boolean all,
			java.lang.String[] pathSet) {
		super(dynamicType, dynamicProperty);
		this.type = type;
		this.all = all;
		this.pathSet = pathSet;
	}

	/**
	 * Gets the type value for this PropertySpec.
	 * 
	 * @return type
	 */
	public java.lang.String getType() {
		return type;
	}

	/**
	 * Sets the type value for this PropertySpec.
	 * 
	 * @param type
	 */
	public void setType(java.lang.String type) {
		this.type = type;
	}

	/**
	 * Gets the all value for this PropertySpec.
	 * 
	 * @return all
	 */
	public java.lang.Boolean getAll() {
		return all;
	}

	/**
	 * Sets the all value for this PropertySpec.
	 * 
	 * @param all
	 */
	public void setAll(java.lang.Boolean all) {
		this.all = all;
	}

	/**
	 * Gets the pathSet value for this PropertySpec.
	 * 
	 * @return pathSet
	 */
	public java.lang.String[] getPathSet() {
		return pathSet;
	}

	/**
	 * Sets the pathSet value for this PropertySpec.
	 * 
	 * @param pathSet
	 */
	public void setPathSet(java.lang.String[] pathSet) {
		this.pathSet = pathSet;
	}

	public java.lang.String getPathSet(int i) {
		return this.pathSet[i];
	}

	public void setPathSet(int i, java.lang.String _value) {
		this.pathSet[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof PropertySpec)) {
			return false;
		}
		PropertySpec other = (PropertySpec) obj;
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
				&& ((this.all == null && other.getAll() == null) || (this.all != null && this.all
						.equals(other.getAll())))
				&& ((this.pathSet == null && other.getPathSet() == null) || (this.pathSet != null && java.util.Arrays
						.equals(this.pathSet, other.getPathSet())));
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
		if (getAll() != null) {
			_hashCode += getAll().hashCode();
		}
		if (getPathSet() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getPathSet()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getPathSet(), i);
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
			PropertySpec.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"PropertySpec"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("type");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "type"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("all");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "all"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("pathSet");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"pathSet"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
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
