/**
 * VmMessageWarningEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VmMessageWarningEvent extends com.vmware.vim25.VmEvent implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String message;

	private com.vmware.vim25.VirtualMachineMessage[] messageInfo;

	public VmMessageWarningEvent() {
	}

	public VmMessageWarningEvent(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty, int key,
			int chainId, java.util.Calendar createdTime,
			java.lang.String userName,
			com.vmware.vim25.DatacenterEventArgument datacenter,
			com.vmware.vim25.ComputeResourceEventArgument computeResource,
			com.vmware.vim25.HostEventArgument host,
			com.vmware.vim25.VmEventArgument vm,
			com.vmware.vim25.DatastoreEventArgument ds,
			com.vmware.vim25.NetworkEventArgument net,
			com.vmware.vim25.DvsEventArgument dvs,
			java.lang.String fullFormattedMessage, java.lang.String changeTag,
			boolean template, java.lang.String message,
			com.vmware.vim25.VirtualMachineMessage[] messageInfo) {
		super(dynamicType, dynamicProperty, key, chainId, createdTime,
				userName, datacenter, computeResource, host, vm, ds, net, dvs,
				fullFormattedMessage, changeTag, template);
		this.message = message;
		this.messageInfo = messageInfo;
	}

	/**
	 * Gets the message value for this VmMessageWarningEvent.
	 * 
	 * @return message
	 */
	public java.lang.String getMessage() {
		return message;
	}

	/**
	 * Sets the message value for this VmMessageWarningEvent.
	 * 
	 * @param message
	 */
	public void setMessage(java.lang.String message) {
		this.message = message;
	}

	/**
	 * Gets the messageInfo value for this VmMessageWarningEvent.
	 * 
	 * @return messageInfo
	 */
	public com.vmware.vim25.VirtualMachineMessage[] getMessageInfo() {
		return messageInfo;
	}

	/**
	 * Sets the messageInfo value for this VmMessageWarningEvent.
	 * 
	 * @param messageInfo
	 */
	public void setMessageInfo(
			com.vmware.vim25.VirtualMachineMessage[] messageInfo) {
		this.messageInfo = messageInfo;
	}

	public com.vmware.vim25.VirtualMachineMessage getMessageInfo(int i) {
		return this.messageInfo[i];
	}

	public void setMessageInfo(int i,
			com.vmware.vim25.VirtualMachineMessage _value) {
		this.messageInfo[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof VmMessageWarningEvent)) {
			return false;
		}
		VmMessageWarningEvent other = (VmMessageWarningEvent) obj;
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
				&& ((this.message == null && other.getMessage() == null) || (this.message != null && this.message
						.equals(other.getMessage())))
				&& ((this.messageInfo == null && other.getMessageInfo() == null) || (this.messageInfo != null && java.util.Arrays
						.equals(this.messageInfo, other.getMessageInfo())));
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
		if (getMessage() != null) {
			_hashCode += getMessage().hashCode();
		}
		if (getMessageInfo() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getMessageInfo()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getMessageInfo(), i);
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
			VmMessageWarningEvent.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VmMessageWarningEvent"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("message");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"message"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("messageInfo");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"messageInfo"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VirtualMachineMessage"));
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
