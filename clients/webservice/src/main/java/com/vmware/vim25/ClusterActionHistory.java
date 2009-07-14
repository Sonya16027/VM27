/**
 * ClusterActionHistory.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ClusterActionHistory extends com.vmware.vim25.DynamicData
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.ClusterAction action;

	private java.util.Calendar time;

	public ClusterActionHistory() {
	}

	public ClusterActionHistory(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			com.vmware.vim25.ClusterAction action, java.util.Calendar time) {
		super(dynamicType, dynamicProperty);
		this.action = action;
		this.time = time;
	}

	/**
	 * Gets the action value for this ClusterActionHistory.
	 * 
	 * @return action
	 */
	public com.vmware.vim25.ClusterAction getAction() {
		return action;
	}

	/**
	 * Sets the action value for this ClusterActionHistory.
	 * 
	 * @param action
	 */
	public void setAction(com.vmware.vim25.ClusterAction action) {
		this.action = action;
	}

	/**
	 * Gets the time value for this ClusterActionHistory.
	 * 
	 * @return time
	 */
	public java.util.Calendar getTime() {
		return time;
	}

	/**
	 * Sets the time value for this ClusterActionHistory.
	 * 
	 * @param time
	 */
	public void setTime(java.util.Calendar time) {
		this.time = time;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ClusterActionHistory)) {
			return false;
		}
		ClusterActionHistory other = (ClusterActionHistory) obj;
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
				&& ((this.action == null && other.getAction() == null) || (this.action != null && this.action
						.equals(other.getAction())))
				&& ((this.time == null && other.getTime() == null) || (this.time != null && this.time
						.equals(other.getTime())));
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
		if (getAction() != null) {
			_hashCode += getAction().hashCode();
		}
		if (getTime() != null) {
			_hashCode += getTime().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			ClusterActionHistory.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ClusterActionHistory"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("action");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"action"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ClusterAction"));
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
