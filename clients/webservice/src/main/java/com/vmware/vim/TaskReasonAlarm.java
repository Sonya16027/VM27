/**
 * TaskReasonAlarm.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class TaskReasonAlarm extends com.vmware.vim.TaskReason implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String alarmName;

	private com.vmware.vim.ManagedObjectReference alarm;

	private java.lang.String entityName;

	private com.vmware.vim.ManagedObjectReference entity;

	public TaskReasonAlarm() {
	}

	public TaskReasonAlarm(java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty,
			java.lang.String alarmName,
			com.vmware.vim.ManagedObjectReference alarm,
			java.lang.String entityName,
			com.vmware.vim.ManagedObjectReference entity) {
		super(dynamicType, dynamicProperty);
		this.alarmName = alarmName;
		this.alarm = alarm;
		this.entityName = entityName;
		this.entity = entity;
	}

	/**
	 * Gets the alarmName value for this TaskReasonAlarm.
	 * 
	 * @return alarmName
	 */
	public java.lang.String getAlarmName() {
		return alarmName;
	}

	/**
	 * Sets the alarmName value for this TaskReasonAlarm.
	 * 
	 * @param alarmName
	 */
	public void setAlarmName(java.lang.String alarmName) {
		this.alarmName = alarmName;
	}

	/**
	 * Gets the alarm value for this TaskReasonAlarm.
	 * 
	 * @return alarm
	 */
	public com.vmware.vim.ManagedObjectReference getAlarm() {
		return alarm;
	}

	/**
	 * Sets the alarm value for this TaskReasonAlarm.
	 * 
	 * @param alarm
	 */
	public void setAlarm(com.vmware.vim.ManagedObjectReference alarm) {
		this.alarm = alarm;
	}

	/**
	 * Gets the entityName value for this TaskReasonAlarm.
	 * 
	 * @return entityName
	 */
	public java.lang.String getEntityName() {
		return entityName;
	}

	/**
	 * Sets the entityName value for this TaskReasonAlarm.
	 * 
	 * @param entityName
	 */
	public void setEntityName(java.lang.String entityName) {
		this.entityName = entityName;
	}

	/**
	 * Gets the entity value for this TaskReasonAlarm.
	 * 
	 * @return entity
	 */
	public com.vmware.vim.ManagedObjectReference getEntity() {
		return entity;
	}

	/**
	 * Sets the entity value for this TaskReasonAlarm.
	 * 
	 * @param entity
	 */
	public void setEntity(com.vmware.vim.ManagedObjectReference entity) {
		this.entity = entity;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof TaskReasonAlarm)) {
			return false;
		}
		TaskReasonAlarm other = (TaskReasonAlarm) obj;
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
				&& ((this.alarmName == null && other.getAlarmName() == null) || (this.alarmName != null && this.alarmName
						.equals(other.getAlarmName())))
				&& ((this.alarm == null && other.getAlarm() == null) || (this.alarm != null && this.alarm
						.equals(other.getAlarm())))
				&& ((this.entityName == null && other.getEntityName() == null) || (this.entityName != null && this.entityName
						.equals(other.getEntityName())))
				&& ((this.entity == null && other.getEntity() == null) || (this.entity != null && this.entity
						.equals(other.getEntity())));
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
		if (getAlarmName() != null) {
			_hashCode += getAlarmName().hashCode();
		}
		if (getAlarm() != null) {
			_hashCode += getAlarm().hashCode();
		}
		if (getEntityName() != null) {
			_hashCode += getEntityName().hashCode();
		}
		if (getEntity() != null) {
			_hashCode += getEntity().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			TaskReasonAlarm.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"TaskReasonAlarm"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("alarmName");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"alarmName"));
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
		elemField.setFieldName("entityName");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"entityName"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
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
