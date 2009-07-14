/**
 * CreateTaskRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class CreateTaskRequestType implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.ManagedObjectReference _this;

	private com.vmware.vim25.ManagedObjectReference obj;

	private java.lang.String taskTypeId;

	private java.lang.String initiatedBy;

	private boolean cancelable;

	private java.lang.String parentTaskKey;

	public CreateTaskRequestType() {
	}

	public CreateTaskRequestType(com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference obj,
			java.lang.String taskTypeId, java.lang.String initiatedBy,
			boolean cancelable, java.lang.String parentTaskKey) {
		this._this = _this;
		this.obj = obj;
		this.taskTypeId = taskTypeId;
		this.initiatedBy = initiatedBy;
		this.cancelable = cancelable;
		this.parentTaskKey = parentTaskKey;
	}

	/**
	 * Gets the _this value for this CreateTaskRequestType.
	 * 
	 * @return _this
	 */
	public com.vmware.vim25.ManagedObjectReference get_this() {
		return _this;
	}

	/**
	 * Sets the _this value for this CreateTaskRequestType.
	 * 
	 * @param _this
	 */
	public void set_this(com.vmware.vim25.ManagedObjectReference _this) {
		this._this = _this;
	}

	/**
	 * Gets the obj value for this CreateTaskRequestType.
	 * 
	 * @return obj
	 */
	public com.vmware.vim25.ManagedObjectReference getObj() {
		return obj;
	}

	/**
	 * Sets the obj value for this CreateTaskRequestType.
	 * 
	 * @param obj
	 */
	public void setObj(com.vmware.vim25.ManagedObjectReference obj) {
		this.obj = obj;
	}

	/**
	 * Gets the taskTypeId value for this CreateTaskRequestType.
	 * 
	 * @return taskTypeId
	 */
	public java.lang.String getTaskTypeId() {
		return taskTypeId;
	}

	/**
	 * Sets the taskTypeId value for this CreateTaskRequestType.
	 * 
	 * @param taskTypeId
	 */
	public void setTaskTypeId(java.lang.String taskTypeId) {
		this.taskTypeId = taskTypeId;
	}

	/**
	 * Gets the initiatedBy value for this CreateTaskRequestType.
	 * 
	 * @return initiatedBy
	 */
	public java.lang.String getInitiatedBy() {
		return initiatedBy;
	}

	/**
	 * Sets the initiatedBy value for this CreateTaskRequestType.
	 * 
	 * @param initiatedBy
	 */
	public void setInitiatedBy(java.lang.String initiatedBy) {
		this.initiatedBy = initiatedBy;
	}

	/**
	 * Gets the cancelable value for this CreateTaskRequestType.
	 * 
	 * @return cancelable
	 */
	public boolean isCancelable() {
		return cancelable;
	}

	/**
	 * Sets the cancelable value for this CreateTaskRequestType.
	 * 
	 * @param cancelable
	 */
	public void setCancelable(boolean cancelable) {
		this.cancelable = cancelable;
	}

	/**
	 * Gets the parentTaskKey value for this CreateTaskRequestType.
	 * 
	 * @return parentTaskKey
	 */
	public java.lang.String getParentTaskKey() {
		return parentTaskKey;
	}

	/**
	 * Sets the parentTaskKey value for this CreateTaskRequestType.
	 * 
	 * @param parentTaskKey
	 */
	public void setParentTaskKey(java.lang.String parentTaskKey) {
		this.parentTaskKey = parentTaskKey;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof CreateTaskRequestType)) {
			return false;
		}
		CreateTaskRequestType other = (CreateTaskRequestType) obj;
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
				&& ((this.obj == null && other.getObj() == null) || (this.obj != null && this.obj
						.equals(other.getObj())))
				&& ((this.taskTypeId == null && other.getTaskTypeId() == null) || (this.taskTypeId != null && this.taskTypeId
						.equals(other.getTaskTypeId())))
				&& ((this.initiatedBy == null && other.getInitiatedBy() == null) || (this.initiatedBy != null && this.initiatedBy
						.equals(other.getInitiatedBy())))
				&& this.cancelable == other.isCancelable()
				&& ((this.parentTaskKey == null && other.getParentTaskKey() == null) || (this.parentTaskKey != null && this.parentTaskKey
						.equals(other.getParentTaskKey())));
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
		if (getObj() != null) {
			_hashCode += getObj().hashCode();
		}
		if (getTaskTypeId() != null) {
			_hashCode += getTaskTypeId().hashCode();
		}
		if (getInitiatedBy() != null) {
			_hashCode += getInitiatedBy().hashCode();
		}
		_hashCode += (isCancelable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
		if (getParentTaskKey() != null) {
			_hashCode += getParentTaskKey().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			CreateTaskRequestType.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"CreateTaskRequestType"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("_this");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "_this"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("obj");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "obj"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("taskTypeId");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"taskTypeId"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("initiatedBy");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"initiatedBy"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("cancelable");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"cancelable"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("parentTaskKey");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"parentTaskKey"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
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
