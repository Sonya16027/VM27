/**
 * ArrayOfTaskInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfTaskInfo implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.TaskInfo[] taskInfo;

	public ArrayOfTaskInfo() {
	}

	public ArrayOfTaskInfo(com.vmware.vim25.TaskInfo[] taskInfo) {
		this.taskInfo = taskInfo;
	}

	/**
	 * Gets the taskInfo value for this ArrayOfTaskInfo.
	 * 
	 * @return taskInfo
	 */
	public com.vmware.vim25.TaskInfo[] getTaskInfo() {
		return taskInfo;
	}

	/**
	 * Sets the taskInfo value for this ArrayOfTaskInfo.
	 * 
	 * @param taskInfo
	 */
	public void setTaskInfo(com.vmware.vim25.TaskInfo[] taskInfo) {
		this.taskInfo = taskInfo;
	}

	public com.vmware.vim25.TaskInfo getTaskInfo(int i) {
		return this.taskInfo[i];
	}

	public void setTaskInfo(int i, com.vmware.vim25.TaskInfo _value) {
		this.taskInfo[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfTaskInfo)) {
			return false;
		}
		ArrayOfTaskInfo other = (ArrayOfTaskInfo) obj;
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
		_equals = true && ((this.taskInfo == null && other.getTaskInfo() == null) || (this.taskInfo != null && java.util.Arrays
				.equals(this.taskInfo, other.getTaskInfo())));
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
		if (getTaskInfo() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getTaskInfo()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getTaskInfo(), i);
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
			ArrayOfTaskInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ArrayOfTaskInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("taskInfo");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"TaskInfo"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"TaskInfo"));
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
