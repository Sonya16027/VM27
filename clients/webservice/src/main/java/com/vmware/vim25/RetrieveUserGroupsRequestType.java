/**
 * RetrieveUserGroupsRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class RetrieveUserGroupsRequestType implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.ManagedObjectReference _this;

	private java.lang.String domain;

	private java.lang.String searchStr;

	private java.lang.String belongsToGroup;

	private java.lang.String belongsToUser;

	private boolean exactMatch;

	private boolean findUsers;

	private boolean findGroups;

	public RetrieveUserGroupsRequestType() {
	}

	public RetrieveUserGroupsRequestType(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String domain, java.lang.String searchStr,
			java.lang.String belongsToGroup, java.lang.String belongsToUser,
			boolean exactMatch, boolean findUsers, boolean findGroups) {
		this._this = _this;
		this.domain = domain;
		this.searchStr = searchStr;
		this.belongsToGroup = belongsToGroup;
		this.belongsToUser = belongsToUser;
		this.exactMatch = exactMatch;
		this.findUsers = findUsers;
		this.findGroups = findGroups;
	}

	/**
	 * Gets the _this value for this RetrieveUserGroupsRequestType.
	 * 
	 * @return _this
	 */
	public com.vmware.vim25.ManagedObjectReference get_this() {
		return _this;
	}

	/**
	 * Sets the _this value for this RetrieveUserGroupsRequestType.
	 * 
	 * @param _this
	 */
	public void set_this(com.vmware.vim25.ManagedObjectReference _this) {
		this._this = _this;
	}

	/**
	 * Gets the domain value for this RetrieveUserGroupsRequestType.
	 * 
	 * @return domain
	 */
	public java.lang.String getDomain() {
		return domain;
	}

	/**
	 * Sets the domain value for this RetrieveUserGroupsRequestType.
	 * 
	 * @param domain
	 */
	public void setDomain(java.lang.String domain) {
		this.domain = domain;
	}

	/**
	 * Gets the searchStr value for this RetrieveUserGroupsRequestType.
	 * 
	 * @return searchStr
	 */
	public java.lang.String getSearchStr() {
		return searchStr;
	}

	/**
	 * Sets the searchStr value for this RetrieveUserGroupsRequestType.
	 * 
	 * @param searchStr
	 */
	public void setSearchStr(java.lang.String searchStr) {
		this.searchStr = searchStr;
	}

	/**
	 * Gets the belongsToGroup value for this RetrieveUserGroupsRequestType.
	 * 
	 * @return belongsToGroup
	 */
	public java.lang.String getBelongsToGroup() {
		return belongsToGroup;
	}

	/**
	 * Sets the belongsToGroup value for this RetrieveUserGroupsRequestType.
	 * 
	 * @param belongsToGroup
	 */
	public void setBelongsToGroup(java.lang.String belongsToGroup) {
		this.belongsToGroup = belongsToGroup;
	}

	/**
	 * Gets the belongsToUser value for this RetrieveUserGroupsRequestType.
	 * 
	 * @return belongsToUser
	 */
	public java.lang.String getBelongsToUser() {
		return belongsToUser;
	}

	/**
	 * Sets the belongsToUser value for this RetrieveUserGroupsRequestType.
	 * 
	 * @param belongsToUser
	 */
	public void setBelongsToUser(java.lang.String belongsToUser) {
		this.belongsToUser = belongsToUser;
	}

	/**
	 * Gets the exactMatch value for this RetrieveUserGroupsRequestType.
	 * 
	 * @return exactMatch
	 */
	public boolean isExactMatch() {
		return exactMatch;
	}

	/**
	 * Sets the exactMatch value for this RetrieveUserGroupsRequestType.
	 * 
	 * @param exactMatch
	 */
	public void setExactMatch(boolean exactMatch) {
		this.exactMatch = exactMatch;
	}

	/**
	 * Gets the findUsers value for this RetrieveUserGroupsRequestType.
	 * 
	 * @return findUsers
	 */
	public boolean isFindUsers() {
		return findUsers;
	}

	/**
	 * Sets the findUsers value for this RetrieveUserGroupsRequestType.
	 * 
	 * @param findUsers
	 */
	public void setFindUsers(boolean findUsers) {
		this.findUsers = findUsers;
	}

	/**
	 * Gets the findGroups value for this RetrieveUserGroupsRequestType.
	 * 
	 * @return findGroups
	 */
	public boolean isFindGroups() {
		return findGroups;
	}

	/**
	 * Sets the findGroups value for this RetrieveUserGroupsRequestType.
	 * 
	 * @param findGroups
	 */
	public void setFindGroups(boolean findGroups) {
		this.findGroups = findGroups;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof RetrieveUserGroupsRequestType)) {
			return false;
		}
		RetrieveUserGroupsRequestType other = (RetrieveUserGroupsRequestType) obj;
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
		_equals = true
				&& ((this._this == null && other.get_this() == null) || (this._this != null && this._this
						.equals(other.get_this())))
				&& ((this.domain == null && other.getDomain() == null) || (this.domain != null && this.domain
						.equals(other.getDomain())))
				&& ((this.searchStr == null && other.getSearchStr() == null) || (this.searchStr != null && this.searchStr
						.equals(other.getSearchStr())))
				&& ((this.belongsToGroup == null && other.getBelongsToGroup() == null) || (this.belongsToGroup != null && this.belongsToGroup
						.equals(other.getBelongsToGroup())))
				&& ((this.belongsToUser == null && other.getBelongsToUser() == null) || (this.belongsToUser != null && this.belongsToUser
						.equals(other.getBelongsToUser())))
				&& this.exactMatch == other.isExactMatch()
				&& this.findUsers == other.isFindUsers()
				&& this.findGroups == other.isFindGroups();
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
		int _hashCode = 1;
		if (get_this() != null) {
			_hashCode += get_this().hashCode();
		}
		if (getDomain() != null) {
			_hashCode += getDomain().hashCode();
		}
		if (getSearchStr() != null) {
			_hashCode += getSearchStr().hashCode();
		}
		if (getBelongsToGroup() != null) {
			_hashCode += getBelongsToGroup().hashCode();
		}
		if (getBelongsToUser() != null) {
			_hashCode += getBelongsToUser().hashCode();
		}
		_hashCode += (isExactMatch() ? Boolean.TRUE : Boolean.FALSE).hashCode();
		_hashCode += (isFindUsers() ? Boolean.TRUE : Boolean.FALSE).hashCode();
		_hashCode += (isFindGroups() ? Boolean.TRUE : Boolean.FALSE).hashCode();
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			RetrieveUserGroupsRequestType.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"RetrieveUserGroupsRequestType"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("_this");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "_this"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("domain");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"domain"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("searchStr");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"searchStr"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("belongsToGroup");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"belongsToGroup"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("belongsToUser");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"belongsToUser"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("exactMatch");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"exactMatch"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("findUsers");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"findUsers"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("findGroups");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"findGroups"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
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
