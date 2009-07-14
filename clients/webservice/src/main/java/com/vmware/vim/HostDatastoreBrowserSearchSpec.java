/**
 * HostDatastoreBrowserSearchSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class HostDatastoreBrowserSearchSpec extends com.vmware.vim.DynamicData
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim.FileQuery[] query;

	private com.vmware.vim.FileQueryFlags details;

	private java.lang.Boolean searchCaseInsensitive;

	private java.lang.String[] matchPattern;

	private java.lang.Boolean sortFoldersFirst;

	public HostDatastoreBrowserSearchSpec() {
	}

	public HostDatastoreBrowserSearchSpec(java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty,
			com.vmware.vim.FileQuery[] query,
			com.vmware.vim.FileQueryFlags details,
			java.lang.Boolean searchCaseInsensitive,
			java.lang.String[] matchPattern, java.lang.Boolean sortFoldersFirst) {
		super(dynamicType, dynamicProperty);
		this.query = query;
		this.details = details;
		this.searchCaseInsensitive = searchCaseInsensitive;
		this.matchPattern = matchPattern;
		this.sortFoldersFirst = sortFoldersFirst;
	}

	/**
	 * Gets the query value for this HostDatastoreBrowserSearchSpec.
	 * 
	 * @return query
	 */
	public com.vmware.vim.FileQuery[] getQuery() {
		return query;
	}

	/**
	 * Sets the query value for this HostDatastoreBrowserSearchSpec.
	 * 
	 * @param query
	 */
	public void setQuery(com.vmware.vim.FileQuery[] query) {
		this.query = query;
	}

	public com.vmware.vim.FileQuery getQuery(int i) {
		return this.query[i];
	}

	public void setQuery(int i, com.vmware.vim.FileQuery _value) {
		this.query[i] = _value;
	}

	/**
	 * Gets the details value for this HostDatastoreBrowserSearchSpec.
	 * 
	 * @return details
	 */
	public com.vmware.vim.FileQueryFlags getDetails() {
		return details;
	}

	/**
	 * Sets the details value for this HostDatastoreBrowserSearchSpec.
	 * 
	 * @param details
	 */
	public void setDetails(com.vmware.vim.FileQueryFlags details) {
		this.details = details;
	}

	/**
	 * Gets the searchCaseInsensitive value for this
	 * HostDatastoreBrowserSearchSpec.
	 * 
	 * @return searchCaseInsensitive
	 */
	public java.lang.Boolean getSearchCaseInsensitive() {
		return searchCaseInsensitive;
	}

	/**
	 * Sets the searchCaseInsensitive value for this
	 * HostDatastoreBrowserSearchSpec.
	 * 
	 * @param searchCaseInsensitive
	 */
	public void setSearchCaseInsensitive(java.lang.Boolean searchCaseInsensitive) {
		this.searchCaseInsensitive = searchCaseInsensitive;
	}

	/**
	 * Gets the matchPattern value for this HostDatastoreBrowserSearchSpec.
	 * 
	 * @return matchPattern
	 */
	public java.lang.String[] getMatchPattern() {
		return matchPattern;
	}

	/**
	 * Sets the matchPattern value for this HostDatastoreBrowserSearchSpec.
	 * 
	 * @param matchPattern
	 */
	public void setMatchPattern(java.lang.String[] matchPattern) {
		this.matchPattern = matchPattern;
	}

	public java.lang.String getMatchPattern(int i) {
		return this.matchPattern[i];
	}

	public void setMatchPattern(int i, java.lang.String _value) {
		this.matchPattern[i] = _value;
	}

	/**
	 * Gets the sortFoldersFirst value for this HostDatastoreBrowserSearchSpec.
	 * 
	 * @return sortFoldersFirst
	 */
	public java.lang.Boolean getSortFoldersFirst() {
		return sortFoldersFirst;
	}

	/**
	 * Sets the sortFoldersFirst value for this HostDatastoreBrowserSearchSpec.
	 * 
	 * @param sortFoldersFirst
	 */
	public void setSortFoldersFirst(java.lang.Boolean sortFoldersFirst) {
		this.sortFoldersFirst = sortFoldersFirst;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof HostDatastoreBrowserSearchSpec)) {
			return false;
		}
		HostDatastoreBrowserSearchSpec other = (HostDatastoreBrowserSearchSpec) obj;
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
				&& ((this.query == null && other.getQuery() == null) || (this.query != null && java.util.Arrays
						.equals(this.query, other.getQuery())))
				&& ((this.details == null && other.getDetails() == null) || (this.details != null && this.details
						.equals(other.getDetails())))
				&& ((this.searchCaseInsensitive == null && other
						.getSearchCaseInsensitive() == null) || (this.searchCaseInsensitive != null && this.searchCaseInsensitive
						.equals(other.getSearchCaseInsensitive())))
				&& ((this.matchPattern == null && other.getMatchPattern() == null) || (this.matchPattern != null && java.util.Arrays
						.equals(this.matchPattern, other.getMatchPattern())))
				&& ((this.sortFoldersFirst == null && other
						.getSortFoldersFirst() == null) || (this.sortFoldersFirst != null && this.sortFoldersFirst
						.equals(other.getSortFoldersFirst())));
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
		if (getQuery() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getQuery()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getQuery(),
						i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getDetails() != null) {
			_hashCode += getDetails().hashCode();
		}
		if (getSearchCaseInsensitive() != null) {
			_hashCode += getSearchCaseInsensitive().hashCode();
		}
		if (getMatchPattern() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getMatchPattern()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getMatchPattern(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getSortFoldersFirst() != null) {
			_hashCode += getSortFoldersFirst().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			HostDatastoreBrowserSearchSpec.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"HostDatastoreBrowserSearchSpec"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("query");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim2", "query"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"FileQuery"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("details");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"details"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"FileQueryFlags"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("searchCaseInsensitive");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"searchCaseInsensitive"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("matchPattern");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"matchPattern"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("sortFoldersFirst");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"sortFoldersFirst"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
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
