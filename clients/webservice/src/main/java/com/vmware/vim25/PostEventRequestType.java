/**
 * PostEventRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class PostEventRequestType implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.ManagedObjectReference _this;

	private com.vmware.vim25.Event eventToPost;

	private com.vmware.vim25.TaskInfo taskInfo;

	public PostEventRequestType() {
	}

	public PostEventRequestType(com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.Event eventToPost,
			com.vmware.vim25.TaskInfo taskInfo) {
		this._this = _this;
		this.eventToPost = eventToPost;
		this.taskInfo = taskInfo;
	}

	/**
	 * Gets the _this value for this PostEventRequestType.
	 * 
	 * @return _this
	 */
	public com.vmware.vim25.ManagedObjectReference get_this() {
		return _this;
	}

	/**
	 * Sets the _this value for this PostEventRequestType.
	 * 
	 * @param _this
	 */
	public void set_this(com.vmware.vim25.ManagedObjectReference _this) {
		this._this = _this;
	}

	/**
	 * Gets the eventToPost value for this PostEventRequestType.
	 * 
	 * @return eventToPost
	 */
	public com.vmware.vim25.Event getEventToPost() {
		return eventToPost;
	}

	/**
	 * Sets the eventToPost value for this PostEventRequestType.
	 * 
	 * @param eventToPost
	 */
	public void setEventToPost(com.vmware.vim25.Event eventToPost) {
		this.eventToPost = eventToPost;
	}

	/**
	 * Gets the taskInfo value for this PostEventRequestType.
	 * 
	 * @return taskInfo
	 */
	public com.vmware.vim25.TaskInfo getTaskInfo() {
		return taskInfo;
	}

	/**
	 * Sets the taskInfo value for this PostEventRequestType.
	 * 
	 * @param taskInfo
	 */
	public void setTaskInfo(com.vmware.vim25.TaskInfo taskInfo) {
		this.taskInfo = taskInfo;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof PostEventRequestType)) {
			return false;
		}
		PostEventRequestType other = (PostEventRequestType) obj;
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
				&& ((this.eventToPost == null && other.getEventToPost() == null) || (this.eventToPost != null && this.eventToPost
						.equals(other.getEventToPost())))
				&& ((this.taskInfo == null && other.getTaskInfo() == null) || (this.taskInfo != null && this.taskInfo
						.equals(other.getTaskInfo())));
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
		if (getEventToPost() != null) {
			_hashCode += getEventToPost().hashCode();
		}
		if (getTaskInfo() != null) {
			_hashCode += getTaskInfo().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			PostEventRequestType.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"PostEventRequestType"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("_this");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "_this"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("eventToPost");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"eventToPost"));
		elemField
				.setXmlType(new javax.xml.namespace.QName("urn:vim25", "Event"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("taskInfo");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"taskInfo"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"TaskInfo"));
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
