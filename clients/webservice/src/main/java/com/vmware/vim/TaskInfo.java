/**
 * TaskInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class TaskInfo extends com.vmware.vim.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String key;

	private com.vmware.vim.ManagedObjectReference task;

	private java.lang.String name;

	private java.lang.String descriptionId;

	private com.vmware.vim.ManagedObjectReference entity;

	private java.lang.String entityName;

	private com.vmware.vim.ManagedObjectReference[] locked;

	private com.vmware.vim.TaskInfoState state;

	private boolean cancelled;

	private boolean cancelable;

	private com.vmware.vim.LocalizedMethodFault error;

	private java.lang.Object result;

	private java.lang.Integer progress;

	private com.vmware.vim.TaskReason reason;

	private java.util.Calendar queueTime;

	private java.util.Calendar startTime;

	private java.util.Calendar completeTime;

	private int eventChainId;

	public TaskInfo() {
	}

	public TaskInfo(java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty,
			java.lang.String key, com.vmware.vim.ManagedObjectReference task,
			java.lang.String name, java.lang.String descriptionId,
			com.vmware.vim.ManagedObjectReference entity,
			java.lang.String entityName,
			com.vmware.vim.ManagedObjectReference[] locked,
			com.vmware.vim.TaskInfoState state, boolean cancelled,
			boolean cancelable, com.vmware.vim.LocalizedMethodFault error,
			java.lang.Object result, java.lang.Integer progress,
			com.vmware.vim.TaskReason reason, java.util.Calendar queueTime,
			java.util.Calendar startTime, java.util.Calendar completeTime,
			int eventChainId) {
		super(dynamicType, dynamicProperty);
		this.key = key;
		this.task = task;
		this.name = name;
		this.descriptionId = descriptionId;
		this.entity = entity;
		this.entityName = entityName;
		this.locked = locked;
		this.state = state;
		this.cancelled = cancelled;
		this.cancelable = cancelable;
		this.error = error;
		this.result = result;
		this.progress = progress;
		this.reason = reason;
		this.queueTime = queueTime;
		this.startTime = startTime;
		this.completeTime = completeTime;
		this.eventChainId = eventChainId;
	}

	/**
	 * Gets the key value for this TaskInfo.
	 * 
	 * @return key
	 */
	public java.lang.String getKey() {
		return key;
	}

	/**
	 * Sets the key value for this TaskInfo.
	 * 
	 * @param key
	 */
	public void setKey(java.lang.String key) {
		this.key = key;
	}

	/**
	 * Gets the task value for this TaskInfo.
	 * 
	 * @return task
	 */
	public com.vmware.vim.ManagedObjectReference getTask() {
		return task;
	}

	/**
	 * Sets the task value for this TaskInfo.
	 * 
	 * @param task
	 */
	public void setTask(com.vmware.vim.ManagedObjectReference task) {
		this.task = task;
	}

	/**
	 * Gets the name value for this TaskInfo.
	 * 
	 * @return name
	 */
	public java.lang.String getName() {
		return name;
	}

	/**
	 * Sets the name value for this TaskInfo.
	 * 
	 * @param name
	 */
	public void setName(java.lang.String name) {
		this.name = name;
	}

	/**
	 * Gets the descriptionId value for this TaskInfo.
	 * 
	 * @return descriptionId
	 */
	public java.lang.String getDescriptionId() {
		return descriptionId;
	}

	/**
	 * Sets the descriptionId value for this TaskInfo.
	 * 
	 * @param descriptionId
	 */
	public void setDescriptionId(java.lang.String descriptionId) {
		this.descriptionId = descriptionId;
	}

	/**
	 * Gets the entity value for this TaskInfo.
	 * 
	 * @return entity
	 */
	public com.vmware.vim.ManagedObjectReference getEntity() {
		return entity;
	}

	/**
	 * Sets the entity value for this TaskInfo.
	 * 
	 * @param entity
	 */
	public void setEntity(com.vmware.vim.ManagedObjectReference entity) {
		this.entity = entity;
	}

	/**
	 * Gets the entityName value for this TaskInfo.
	 * 
	 * @return entityName
	 */
	public java.lang.String getEntityName() {
		return entityName;
	}

	/**
	 * Sets the entityName value for this TaskInfo.
	 * 
	 * @param entityName
	 */
	public void setEntityName(java.lang.String entityName) {
		this.entityName = entityName;
	}

	/**
	 * Gets the locked value for this TaskInfo.
	 * 
	 * @return locked
	 */
	public com.vmware.vim.ManagedObjectReference[] getLocked() {
		return locked;
	}

	/**
	 * Sets the locked value for this TaskInfo.
	 * 
	 * @param locked
	 */
	public void setLocked(com.vmware.vim.ManagedObjectReference[] locked) {
		this.locked = locked;
	}

	public com.vmware.vim.ManagedObjectReference getLocked(int i) {
		return this.locked[i];
	}

	public void setLocked(int i, com.vmware.vim.ManagedObjectReference _value) {
		this.locked[i] = _value;
	}

	/**
	 * Gets the state value for this TaskInfo.
	 * 
	 * @return state
	 */
	public com.vmware.vim.TaskInfoState getState() {
		return state;
	}

	/**
	 * Sets the state value for this TaskInfo.
	 * 
	 * @param state
	 */
	public void setState(com.vmware.vim.TaskInfoState state) {
		this.state = state;
	}

	/**
	 * Gets the cancelled value for this TaskInfo.
	 * 
	 * @return cancelled
	 */
	public boolean isCancelled() {
		return cancelled;
	}

	/**
	 * Sets the cancelled value for this TaskInfo.
	 * 
	 * @param cancelled
	 */
	public void setCancelled(boolean cancelled) {
		this.cancelled = cancelled;
	}

	/**
	 * Gets the cancelable value for this TaskInfo.
	 * 
	 * @return cancelable
	 */
	public boolean isCancelable() {
		return cancelable;
	}

	/**
	 * Sets the cancelable value for this TaskInfo.
	 * 
	 * @param cancelable
	 */
	public void setCancelable(boolean cancelable) {
		this.cancelable = cancelable;
	}

	/**
	 * Gets the error value for this TaskInfo.
	 * 
	 * @return error
	 */
	public com.vmware.vim.LocalizedMethodFault getError() {
		return error;
	}

	/**
	 * Sets the error value for this TaskInfo.
	 * 
	 * @param error
	 */
	public void setError(com.vmware.vim.LocalizedMethodFault error) {
		this.error = error;
	}

	/**
	 * Gets the result value for this TaskInfo.
	 * 
	 * @return result
	 */
	public java.lang.Object getResult() {
		return result;
	}

	/**
	 * Sets the result value for this TaskInfo.
	 * 
	 * @param result
	 */
	public void setResult(java.lang.Object result) {
		this.result = result;
	}

	/**
	 * Gets the progress value for this TaskInfo.
	 * 
	 * @return progress
	 */
	public java.lang.Integer getProgress() {
		return progress;
	}

	/**
	 * Sets the progress value for this TaskInfo.
	 * 
	 * @param progress
	 */
	public void setProgress(java.lang.Integer progress) {
		this.progress = progress;
	}

	/**
	 * Gets the reason value for this TaskInfo.
	 * 
	 * @return reason
	 */
	public com.vmware.vim.TaskReason getReason() {
		return reason;
	}

	/**
	 * Sets the reason value for this TaskInfo.
	 * 
	 * @param reason
	 */
	public void setReason(com.vmware.vim.TaskReason reason) {
		this.reason = reason;
	}

	/**
	 * Gets the queueTime value for this TaskInfo.
	 * 
	 * @return queueTime
	 */
	public java.util.Calendar getQueueTime() {
		return queueTime;
	}

	/**
	 * Sets the queueTime value for this TaskInfo.
	 * 
	 * @param queueTime
	 */
	public void setQueueTime(java.util.Calendar queueTime) {
		this.queueTime = queueTime;
	}

	/**
	 * Gets the startTime value for this TaskInfo.
	 * 
	 * @return startTime
	 */
	public java.util.Calendar getStartTime() {
		return startTime;
	}

	/**
	 * Sets the startTime value for this TaskInfo.
	 * 
	 * @param startTime
	 */
	public void setStartTime(java.util.Calendar startTime) {
		this.startTime = startTime;
	}

	/**
	 * Gets the completeTime value for this TaskInfo.
	 * 
	 * @return completeTime
	 */
	public java.util.Calendar getCompleteTime() {
		return completeTime;
	}

	/**
	 * Sets the completeTime value for this TaskInfo.
	 * 
	 * @param completeTime
	 */
	public void setCompleteTime(java.util.Calendar completeTime) {
		this.completeTime = completeTime;
	}

	/**
	 * Gets the eventChainId value for this TaskInfo.
	 * 
	 * @return eventChainId
	 */
	public int getEventChainId() {
		return eventChainId;
	}

	/**
	 * Sets the eventChainId value for this TaskInfo.
	 * 
	 * @param eventChainId
	 */
	public void setEventChainId(int eventChainId) {
		this.eventChainId = eventChainId;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof TaskInfo)) {
			return false;
		}
		TaskInfo other = (TaskInfo) obj;
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
				&& ((this.task == null && other.getTask() == null) || (this.task != null && this.task
						.equals(other.getTask())))
				&& ((this.name == null && other.getName() == null) || (this.name != null && this.name
						.equals(other.getName())))
				&& ((this.descriptionId == null && other.getDescriptionId() == null) || (this.descriptionId != null && this.descriptionId
						.equals(other.getDescriptionId())))
				&& ((this.entity == null && other.getEntity() == null) || (this.entity != null && this.entity
						.equals(other.getEntity())))
				&& ((this.entityName == null && other.getEntityName() == null) || (this.entityName != null && this.entityName
						.equals(other.getEntityName())))
				&& ((this.locked == null && other.getLocked() == null) || (this.locked != null && java.util.Arrays
						.equals(this.locked, other.getLocked())))
				&& ((this.state == null && other.getState() == null) || (this.state != null && this.state
						.equals(other.getState())))
				&& this.cancelled == other.isCancelled()
				&& this.cancelable == other.isCancelable()
				&& ((this.error == null && other.getError() == null) || (this.error != null && this.error
						.equals(other.getError())))
				&& ((this.result == null && other.getResult() == null) || (this.result != null && this.result
						.equals(other.getResult())))
				&& ((this.progress == null && other.getProgress() == null) || (this.progress != null && this.progress
						.equals(other.getProgress())))
				&& ((this.reason == null && other.getReason() == null) || (this.reason != null && this.reason
						.equals(other.getReason())))
				&& ((this.queueTime == null && other.getQueueTime() == null) || (this.queueTime != null && this.queueTime
						.equals(other.getQueueTime())))
				&& ((this.startTime == null && other.getStartTime() == null) || (this.startTime != null && this.startTime
						.equals(other.getStartTime())))
				&& ((this.completeTime == null && other.getCompleteTime() == null) || (this.completeTime != null && this.completeTime
						.equals(other.getCompleteTime())))
				&& this.eventChainId == other.getEventChainId();
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
		if (getTask() != null) {
			_hashCode += getTask().hashCode();
		}
		if (getName() != null) {
			_hashCode += getName().hashCode();
		}
		if (getDescriptionId() != null) {
			_hashCode += getDescriptionId().hashCode();
		}
		if (getEntity() != null) {
			_hashCode += getEntity().hashCode();
		}
		if (getEntityName() != null) {
			_hashCode += getEntityName().hashCode();
		}
		if (getLocked() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getLocked()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getLocked(),
						i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getState() != null) {
			_hashCode += getState().hashCode();
		}
		_hashCode += (isCancelled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
		_hashCode += (isCancelable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
		if (getError() != null) {
			_hashCode += getError().hashCode();
		}
		if (getResult() != null) {
			_hashCode += getResult().hashCode();
		}
		if (getProgress() != null) {
			_hashCode += getProgress().hashCode();
		}
		if (getReason() != null) {
			_hashCode += getReason().hashCode();
		}
		if (getQueueTime() != null) {
			_hashCode += getQueueTime().hashCode();
		}
		if (getStartTime() != null) {
			_hashCode += getStartTime().hashCode();
		}
		if (getCompleteTime() != null) {
			_hashCode += getCompleteTime().hashCode();
		}
		_hashCode += getEventChainId();
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			TaskInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"TaskInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("key");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "key"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("task");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "task"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("name");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "name"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("descriptionId");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"descriptionId"));
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
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("entityName");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"entityName"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("locked");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim2", "locked"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ManagedObjectReference"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("state");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim2", "state"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"TaskInfoState"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("cancelled");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"cancelled"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("cancelable");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"cancelable"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("error");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim2", "error"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"LocalizedMethodFault"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("result");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim2", "result"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "anyType"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("progress");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"progress"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("reason");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim2", "reason"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"TaskReason"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("queueTime");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"queueTime"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "dateTime"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("startTime");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"startTime"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "dateTime"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("completeTime");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"completeTime"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "dateTime"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("eventChainId");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"eventChainId"));
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
