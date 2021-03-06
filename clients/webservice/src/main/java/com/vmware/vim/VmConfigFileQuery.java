/**
 * VmConfigFileQuery.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class VmConfigFileQuery extends com.vmware.vim.FileQuery implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim.VmConfigFileQueryFilter filter;

	private com.vmware.vim.VmConfigFileQueryFlags details;

	public VmConfigFileQuery() {
	}

	public VmConfigFileQuery(java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty,
			com.vmware.vim.VmConfigFileQueryFilter filter,
			com.vmware.vim.VmConfigFileQueryFlags details) {
		super(dynamicType, dynamicProperty);
		this.filter = filter;
		this.details = details;
	}

	/**
	 * Gets the filter value for this VmConfigFileQuery.
	 * 
	 * @return filter
	 */
	public com.vmware.vim.VmConfigFileQueryFilter getFilter() {
		return filter;
	}

	/**
	 * Sets the filter value for this VmConfigFileQuery.
	 * 
	 * @param filter
	 */
	public void setFilter(com.vmware.vim.VmConfigFileQueryFilter filter) {
		this.filter = filter;
	}

	/**
	 * Gets the details value for this VmConfigFileQuery.
	 * 
	 * @return details
	 */
	public com.vmware.vim.VmConfigFileQueryFlags getDetails() {
		return details;
	}

	/**
	 * Sets the details value for this VmConfigFileQuery.
	 * 
	 * @param details
	 */
	public void setDetails(com.vmware.vim.VmConfigFileQueryFlags details) {
		this.details = details;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof VmConfigFileQuery)) {
			return false;
		}
		VmConfigFileQuery other = (VmConfigFileQuery) obj;
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
				&& ((this.filter == null && other.getFilter() == null) || (this.filter != null && this.filter
						.equals(other.getFilter())))
				&& ((this.details == null && other.getDetails() == null) || (this.details != null && this.details
						.equals(other.getDetails())));
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
		if (getFilter() != null) {
			_hashCode += getFilter().hashCode();
		}
		if (getDetails() != null) {
			_hashCode += getDetails().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			VmConfigFileQuery.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"VmConfigFileQuery"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("filter");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim2", "filter"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"VmConfigFileQueryFilter"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("details");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"details"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"VmConfigFileQueryFlags"));
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
