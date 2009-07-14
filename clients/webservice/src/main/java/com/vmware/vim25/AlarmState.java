/**
 * AlarmState.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class AlarmState extends com.vmware.vim25.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String key;

	private com.vmware.vim25.ManagedObjectReference entity;

	private com.vmware.vim25.ManagedObjectReference alarm;

	private com.vmware.vim25.ManagedEntityStatus overallStatus;

	private java.util.Calendar time;

	private java.lang.Boolean acknowledged;

	private java.lang.String acknowledgedByUser;

	private java.util.Calendar acknowledgedTime;

	public AlarmState() {
	}

	public AlarmState(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.String key,
			com.vmware.vim25.ManagedObjectReference entity,
			com.vmware.vim25.ManagedObjectReference alarm,
			com.vmware.vim25.ManagedEntityStatus overallStatus,
			java.util.Calendar time, java.lang.Boolean acknowledged,
			java.lang.String acknowledgedByUser,
			java.util.Calendar acknowledgedTime) {
		super(dynamicType, dynamicProperty);
		this.key = key;
		this.entity = entity;
		this.alarm = alarm;
		this.overallStatus = overallStatus;
		this.time = time;
		this.acknowledged = acknowledged;
		this.acknowledgedByUser = acknowledgedByUser;
		this.acknowledgedTime = acknowledgedTime;
	}

	/**
	 * Gets the key value for this AlarmState.
	 * 
	 * @return key
	 */
	public java.lang.String getKey() {
		return key;
	}

	/**
	 * Sets the key value for this AlarmState.
	 * 
	 * @param key
	 */
	public void setKey(java.lang.String key) {
		this.key = key;
	}

	/**
	 * Gets the entity value for this AlarmState.
	 * 
	 * @return entity
	 */
	public com.vmware.vim25.ManagedObjectReference getEntity() {
		return entity;
	}

	/**
	 * Sets the entity value for this AlarmState.
	 * 
	 * @param entity
	 */
	public void setEntity(com.vmware.vim25.ManagedObjectReference entity) {
		this.entity = entity;
	}

	/**
	 * Gets the alarm value for this AlarmState.
	 * 
	 * @return alarm
	 */
	public com.vmware.vim25.ManagedObjectReference getAlarm() {
		return alarm;
	}

	/**
	 * Sets the alarm value for this AlarmState.
	 * 
	 * @param alarm
	 */
	public void setAlarm(com.vmware.vim25.ManagedObjectReference alarm) {
		this.alarm = alarm;
	}

	/**
	 * Gets the overallStatus value for this AlarmState.
	 * 
	 * @return overallStatus
	 */
	public com.vmware.vim25.ManagedEntityStatus getOverallStatus() {
		return overallStatus;
	}

	/**
	 * Sets the overallStatus value for this AlarmState.
	 * 
	 * @param overallStatus
	 */
	public void setOverallStatus(
			com.vmware.vim25.ManagedEntityStatus overallStatus) {
		this.overallStatus = overallStatus;
	}

	/**
	 * Gets the time value for this AlarmState.
	 * 
	 * @return time
	 */
	public java.util.Calendar getTime() {
		return time;
	}

	/**
	 * Sets the time value for this AlarmState.
	 * 
	 * @param time
	 */
	public void setTime(java.util.Calendar time) {
		this.time = time;
	}

	/**
	 * Gets the acknowledged value for this AlarmState.
	 * 
	 * @return acknowledged
	 */
	public java.lang.Boolean getAcknowledged() {
		return acknowledged;
	}

	/**
	 * Sets the acknowledged value for this AlarmState.
	 * 
	 * @param acknowledged
	 */
	public void setAcknowledged(java.lang.Boolean acknowledged) {
		this.acknowledged = acknowledged;
	}

	/**
	 * Gets the acknowledgedByUser value for this AlarmState.
	 * 
	 * @return acknowledgedByUser
	 */
	public java.lang.String getAcknowledgedByUser() {
		return acknowledgedByUser;
	}

	/**
	 * Sets the acknowledgedByUser value for this AlarmState.
	 * 
	 * @param acknowledgedByUser
	 */
	public void setAcknowledgedByUser(java.lang.String acknowledgedByUser) {
		this.acknowledgedByUser = acknowledgedByUser;
	}

	/**
	 * Gets the acknowledgedTime value for this AlarmState.
	 * 
	 * @return acknowledgedTime
	 */
	public java.util.Calendar getAcknowledgedTime() {
		return acknowledgedTime;
	}

	/**
	 * Sets the acknowledgedTime value for this AlarmState.
	 * 
	 * @param acknowledgedTime
	 */
	public void setAcknowledgedTime(java.util.Calendar acknowledgedTime) {
		this.acknowledgedTime = acknowledgedTime;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof AlarmState)) {
			return false;
		}
		AlarmState other = (AlarmState) obj;
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
				&& ((this.entity == null && other.getEntity() == null) || (this.entity != null && this.entity
						.equals(other.getEntity())))
				&& ((this.alarm == null && other.getAlarm() == null) || (this.alarm != null && this.alarm
						.equals(other.getAlarm())))
				&& ((this.overallStatus == null && other.getOverallStatus() == null) || (this.overallStatus != null && this.overallStatus
						.equals(other.getOverallStatus())))
				&& ((this.time == null && other.getTime() == null) || (this.time != null && this.time
						.equals(other.getTime())))
				&& ((this.acknowledged == null && other.getAcknowledged() == null) || (this.acknowledged != null && this.acknowledged
						.equals(other.getAcknowledged())))
				&& ((this.acknowledgedByUser == null && other
						.getAcknowledgedByUser() == null) || (this.acknowledgedByUser != null && this.acknowledgedByUser
						.equals(other.getAcknowledgedByUser())))
				&& ((this.acknowledgedTime == null && other
						.getAcknowledgedTime() == null) || (this.acknowledgedTime != null && this.acknowledgedTime
						.equals(other.getAcknowledgedTime())));
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
		if (getEntity() != null) {
			_hashCode += getEntity().hashCode();
		}
		if (getAlarm() != null) {
			_hashCode += getAlarm().hashCode();
		}
		if (getOverallStatus() != null) {
			_hashCode += getOverallStatus().hashCode();
		}
		if (getTime() != null) {
			_hashCode += getTime().hashCode();
		}
		if (getAcknowledged() != null) {
			_hashCode += getAcknowledged().hashCode();
		}
		if (getAcknowledgedByUser() != null) {
			_hashCode += getAcknowledgedByUser().hashCode();
		}
		if (getAcknowledgedTime() != null) {
			_hashCode += getAcknowledgedTime().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			AlarmState.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"AlarmState"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("key");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "key"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("entity");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"entity"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("alarm");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "alarm"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("overallStatus");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"overallStatus"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedEntityStatus"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("time");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "time"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "dateTime"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("acknowledged");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"acknowledged"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("acknowledgedByUser");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"acknowledgedByUser"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("acknowledgedTime");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"acknowledgedTime"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "dateTime"));
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
