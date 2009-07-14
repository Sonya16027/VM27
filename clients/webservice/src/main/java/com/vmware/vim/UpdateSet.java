/**
 * UpdateSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class UpdateSet extends com.vmware.vim.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String version;

	private com.vmware.vim.PropertyFilterUpdate[] filterSet;

	public UpdateSet() {
	}

	public UpdateSet(java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty,
			java.lang.String version,
			com.vmware.vim.PropertyFilterUpdate[] filterSet) {
		super(dynamicType, dynamicProperty);
		this.version = version;
		this.filterSet = filterSet;
	}

	/**
	 * Gets the version value for this UpdateSet.
	 * 
	 * @return version
	 */
	public java.lang.String getVersion() {
		return version;
	}

	/**
	 * Sets the version value for this UpdateSet.
	 * 
	 * @param version
	 */
	public void setVersion(java.lang.String version) {
		this.version = version;
	}

	/**
	 * Gets the filterSet value for this UpdateSet.
	 * 
	 * @return filterSet
	 */
	public com.vmware.vim.PropertyFilterUpdate[] getFilterSet() {
		return filterSet;
	}

	/**
	 * Sets the filterSet value for this UpdateSet.
	 * 
	 * @param filterSet
	 */
	public void setFilterSet(com.vmware.vim.PropertyFilterUpdate[] filterSet) {
		this.filterSet = filterSet;
	}

	public com.vmware.vim.PropertyFilterUpdate getFilterSet(int i) {
		return this.filterSet[i];
	}

	public void setFilterSet(int i, com.vmware.vim.PropertyFilterUpdate _value) {
		this.filterSet[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof UpdateSet)) {
			return false;
		}
		UpdateSet other = (UpdateSet) obj;
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
				&& ((this.version == null && other.getVersion() == null) || (this.version != null && this.version
						.equals(other.getVersion())))
				&& ((this.filterSet == null && other.getFilterSet() == null) || (this.filterSet != null && java.util.Arrays
						.equals(this.filterSet, other.getFilterSet())));
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
		if (getVersion() != null) {
			_hashCode += getVersion().hashCode();
		}
		if (getFilterSet() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getFilterSet()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getFilterSet(), i);
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
			UpdateSet.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"UpdateSet"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("version");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"version"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("filterSet");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"filterSet"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"PropertyFilterUpdate"));
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
