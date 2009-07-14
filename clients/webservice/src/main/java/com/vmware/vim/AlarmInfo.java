/**
 * AlarmInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class AlarmInfo extends com.vmware.vim.AlarmSpec implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String key;

	private com.vmware.vim.ManagedObjectReference alarm;

	private com.vmware.vim.ManagedObjectReference entity;

	private java.util.Calendar lastModifiedTime;

	private java.lang.String lastModifiedUser;

	private int creationEventId;

	public AlarmInfo() {
	}

	public AlarmInfo(java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty,
			java.lang.String name, java.lang.String description,
			boolean enabled, com.vmware.vim.AlarmExpression expression,
			com.vmware.vim.AlarmAction action,
			com.vmware.vim.AlarmSetting setting, java.lang.String key,
			com.vmware.vim.ManagedObjectReference alarm,
			com.vmware.vim.ManagedObjectReference entity,
			java.util.Calendar lastModifiedTime,
			java.lang.String lastModifiedUser, int creationEventId) {
		super(dynamicType, dynamicProperty, name, description, enabled,
				expression, action, setting);
		this.key = key;
		this.alarm = alarm;
		this.entity = entity;
		this.lastModifiedTime = lastModifiedTime;
		this.lastModifiedUser = lastModifiedUser;
		this.creationEventId = creationEventId;
	}

	/**
	 * Gets the key value for this AlarmInfo.
	 * 
	 * @return key
	 */
	public java.lang.String getKey() {
		return key;
	}

	/**
	 * Sets the key value for this AlarmInfo.
	 * 
	 * @param key
	 */
	public void setKey(java.lang.String key) {
		this.key = key;
	}

	/**
	 * Gets the alarm value for this AlarmInfo.
	 * 
	 * @return alarm
	 */
	public com.vmware.vim.ManagedObjectReference getAlarm() {
		return alarm;
	}

	/**
	 * Sets the alarm value for this AlarmInfo.
	 * 
	 * @param alarm
	 */
	public void setAlarm(com.vmware.vim.ManagedObjectReference alarm) {
		this.alarm = alarm;
	}

	/**
	 * Gets the entity value for this AlarmInfo.
	 * 
	 * @return entity
	 */
	public com.vmware.vim.ManagedObjectReference getEntity() {
		return entity;
	}

	/**
	 * Sets the entity value for this AlarmInfo.
	 * 
	 * @param entity
	 */
	public void setEntity(com.vmware.vim.ManagedObjectReference entity) {
		this.entity = entity;
	}

	/**
	 * Gets the lastModifiedTime value for this AlarmInfo.
	 * 
	 * @return lastModifiedTime
	 */
	public java.util.Calendar getLastModifiedTime() {
		return lastModifiedTime;
	}

	/**
	 * Sets the lastModifiedTime value for this AlarmInfo.
	 * 
	 * @param lastModifiedTime
	 */
	public void setLastModifiedTime(java.util.Calendar lastModifiedTime) {
		this.lastModifiedTime = lastModifiedTime;
	}

	/**
	 * Gets the lastModifiedUser value for this AlarmInfo.
	 * 
	 * @return lastModifiedUser
	 */
	public java.lang.String getLastModifiedUser() {
		return lastModifiedUser;
	}

	/**
	 * Sets the lastModifiedUser value for this AlarmInfo.
	 * 
	 * @param lastModifiedUser
	 */
	public void setLastModifiedUser(java.lang.String lastModifiedUser) {
		this.lastModifiedUser = lastModifiedUser;
	}

	/**
	 * Gets the creationEventId value for this AlarmInfo.
	 * 
	 * @return creationEventId
	 */
	public int getCreationEventId() {
		return creationEventId;
	}

	/**
	 * Sets the creationEventId value for this AlarmInfo.
	 * 
	 * @param creationEventId
	 */
	public void setCreationEventId(int creationEventId) {
		this.creationEventId = creationEventId;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof AlarmInfo)) {
			return false;
		}
		AlarmInfo other = (AlarmInfo) obj;
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
				&& ((this.key == null && other.getKey() == null) || (this.key != null && this.key
						.equals(other.getKey())))
				&& ((this.alarm == null && other.getAlarm() == null) || (this.alarm != null && this.alarm
						.equals(other.getAlarm())))
				&& ((this.entity == null && other.getEntity() == null) || (this.entity != null && this.entity
						.equals(other.getEntity())))
				&& ((this.lastModifiedTime == null && other
						.getLastModifiedTime() == null) || (this.lastModifiedTime != null && this.lastModifiedTime
						.equals(other.getLastModifiedTime())))
				&& ((this.lastModifiedUser == null && other
						.getLastModifiedUser() == null) || (this.lastModifiedUser != null && this.lastModifiedUser
						.equals(other.getLastModifiedUser())))
				&& this.creationEventId == other.getCreationEventId();
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
		if (getKey() != null) {
			_hashCode += getKey().hashCode();
		}
		if (getAlarm() != null) {
			_hashCode += getAlarm().hashCode();
		}
		if (getEntity() != null) {
			_hashCode += getEntity().hashCode();
		}
		if (getLastModifiedTime() != null) {
			_hashCode += getLastModifiedTime().hashCode();
		}
		if (getLastModifiedUser() != null) {
			_hashCode += getLastModifiedUser().hashCode();
		}
		_hashCode += getCreationEventId();
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			AlarmInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"AlarmInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("key");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "key"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("alarm");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim2", "alarm"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("entity");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim2", "entity"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("lastModifiedTime");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"lastModifiedTime"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "dateTime"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("lastModifiedUser");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"lastModifiedUser"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("creationEventId");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"creationEventId"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
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
