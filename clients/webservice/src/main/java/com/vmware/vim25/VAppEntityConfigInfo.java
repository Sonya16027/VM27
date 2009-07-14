/**
 * VAppEntityConfigInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VAppEntityConfigInfo extends com.vmware.vim25.DynamicData
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.ManagedObjectReference key;

	private java.lang.String tag;

	private java.lang.Integer startOrder;

	private java.lang.Integer startDelay;

	private java.lang.Boolean waitingForGuest;

	private java.lang.String startAction;

	private java.lang.Integer stopDelay;

	private java.lang.String stopAction;

	public VAppEntityConfigInfo() {
	}

	public VAppEntityConfigInfo(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			com.vmware.vim25.ManagedObjectReference key, java.lang.String tag,
			java.lang.Integer startOrder, java.lang.Integer startDelay,
			java.lang.Boolean waitingForGuest, java.lang.String startAction,
			java.lang.Integer stopDelay, java.lang.String stopAction) {
		super(dynamicType, dynamicProperty);
		this.key = key;
		this.tag = tag;
		this.startOrder = startOrder;
		this.startDelay = startDelay;
		this.waitingForGuest = waitingForGuest;
		this.startAction = startAction;
		this.stopDelay = stopDelay;
		this.stopAction = stopAction;
	}

	/**
	 * Gets the key value for this VAppEntityConfigInfo.
	 * 
	 * @return key
	 */
	public com.vmware.vim25.ManagedObjectReference getKey() {
		return key;
	}

	/**
	 * Sets the key value for this VAppEntityConfigInfo.
	 * 
	 * @param key
	 */
	public void setKey(com.vmware.vim25.ManagedObjectReference key) {
		this.key = key;
	}

	/**
	 * Gets the tag value for this VAppEntityConfigInfo.
	 * 
	 * @return tag
	 */
	public java.lang.String getTag() {
		return tag;
	}

	/**
	 * Sets the tag value for this VAppEntityConfigInfo.
	 * 
	 * @param tag
	 */
	public void setTag(java.lang.String tag) {
		this.tag = tag;
	}

	/**
	 * Gets the startOrder value for this VAppEntityConfigInfo.
	 * 
	 * @return startOrder
	 */
	public java.lang.Integer getStartOrder() {
		return startOrder;
	}

	/**
	 * Sets the startOrder value for this VAppEntityConfigInfo.
	 * 
	 * @param startOrder
	 */
	public void setStartOrder(java.lang.Integer startOrder) {
		this.startOrder = startOrder;
	}

	/**
	 * Gets the startDelay value for this VAppEntityConfigInfo.
	 * 
	 * @return startDelay
	 */
	public java.lang.Integer getStartDelay() {
		return startDelay;
	}

	/**
	 * Sets the startDelay value for this VAppEntityConfigInfo.
	 * 
	 * @param startDelay
	 */
	public void setStartDelay(java.lang.Integer startDelay) {
		this.startDelay = startDelay;
	}

	/**
	 * Gets the waitingForGuest value for this VAppEntityConfigInfo.
	 * 
	 * @return waitingForGuest
	 */
	public java.lang.Boolean getWaitingForGuest() {
		return waitingForGuest;
	}

	/**
	 * Sets the waitingForGuest value for this VAppEntityConfigInfo.
	 * 
	 * @param waitingForGuest
	 */
	public void setWaitingForGuest(java.lang.Boolean waitingForGuest) {
		this.waitingForGuest = waitingForGuest;
	}

	/**
	 * Gets the startAction value for this VAppEntityConfigInfo.
	 * 
	 * @return startAction
	 */
	public java.lang.String getStartAction() {
		return startAction;
	}

	/**
	 * Sets the startAction value for this VAppEntityConfigInfo.
	 * 
	 * @param startAction
	 */
	public void setStartAction(java.lang.String startAction) {
		this.startAction = startAction;
	}

	/**
	 * Gets the stopDelay value for this VAppEntityConfigInfo.
	 * 
	 * @return stopDelay
	 */
	public java.lang.Integer getStopDelay() {
		return stopDelay;
	}

	/**
	 * Sets the stopDelay value for this VAppEntityConfigInfo.
	 * 
	 * @param stopDelay
	 */
	public void setStopDelay(java.lang.Integer stopDelay) {
		this.stopDelay = stopDelay;
	}

	/**
	 * Gets the stopAction value for this VAppEntityConfigInfo.
	 * 
	 * @return stopAction
	 */
	public java.lang.String getStopAction() {
		return stopAction;
	}

	/**
	 * Sets the stopAction value for this VAppEntityConfigInfo.
	 * 
	 * @param stopAction
	 */
	public void setStopAction(java.lang.String stopAction) {
		this.stopAction = stopAction;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof VAppEntityConfigInfo)) {
			return false;
		}
		VAppEntityConfigInfo other = (VAppEntityConfigInfo) obj;
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
				&& ((this.tag == null && other.getTag() == null) || (this.tag != null && this.tag
						.equals(other.getTag())))
				&& ((this.startOrder == null && other.getStartOrder() == null) || (this.startOrder != null && this.startOrder
						.equals(other.getStartOrder())))
				&& ((this.startDelay == null && other.getStartDelay() == null) || (this.startDelay != null && this.startDelay
						.equals(other.getStartDelay())))
				&& ((this.waitingForGuest == null && other.getWaitingForGuest() == null) || (this.waitingForGuest != null && this.waitingForGuest
						.equals(other.getWaitingForGuest())))
				&& ((this.startAction == null && other.getStartAction() == null) || (this.startAction != null && this.startAction
						.equals(other.getStartAction())))
				&& ((this.stopDelay == null && other.getStopDelay() == null) || (this.stopDelay != null && this.stopDelay
						.equals(other.getStopDelay())))
				&& ((this.stopAction == null && other.getStopAction() == null) || (this.stopAction != null && this.stopAction
						.equals(other.getStopAction())));
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
		if (getTag() != null) {
			_hashCode += getTag().hashCode();
		}
		if (getStartOrder() != null) {
			_hashCode += getStartOrder().hashCode();
		}
		if (getStartDelay() != null) {
			_hashCode += getStartDelay().hashCode();
		}
		if (getWaitingForGuest() != null) {
			_hashCode += getWaitingForGuest().hashCode();
		}
		if (getStartAction() != null) {
			_hashCode += getStartAction().hashCode();
		}
		if (getStopDelay() != null) {
			_hashCode += getStopDelay().hashCode();
		}
		if (getStopAction() != null) {
			_hashCode += getStopAction().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			VAppEntityConfigInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VAppEntityConfigInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("key");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "key"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("tag");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "tag"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("startOrder");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"startOrder"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("startDelay");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"startDelay"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("waitingForGuest");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"waitingForGuest"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("startAction");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"startAction"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("stopDelay");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"stopDelay"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("stopAction");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"stopAction"));
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
