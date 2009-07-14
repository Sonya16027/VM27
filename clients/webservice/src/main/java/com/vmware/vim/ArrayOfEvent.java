/**
 * ArrayOfEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class ArrayOfEvent implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim.Event[] event;

	public ArrayOfEvent() {
	}

	public ArrayOfEvent(com.vmware.vim.Event[] event) {
		this.event = event;
	}

	/**
	 * Gets the event value for this ArrayOfEvent.
	 * 
	 * @return event
	 */
	public com.vmware.vim.Event[] getEvent() {
		return event;
	}

	/**
	 * Sets the event value for this ArrayOfEvent.
	 * 
	 * @param event
	 */
	public void setEvent(com.vmware.vim.Event[] event) {
		this.event = event;
	}

	public com.vmware.vim.Event getEvent(int i) {
		return this.event[i];
	}

	public void setEvent(int i, com.vmware.vim.Event _value) {
		this.event[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfEvent)) {
			return false;
		}
		ArrayOfEvent other = (ArrayOfEvent) obj;
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
		_equals = true && ((this.event == null && other.getEvent() == null) || (this.event != null && java.util.Arrays
				.equals(this.event, other.getEvent())));
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
		if (getEvent() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getEvent()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getEvent(),
						i);
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
			ArrayOfEvent.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ArrayOfEvent"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("event");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim2", "Event"));
		elemField
				.setXmlType(new javax.xml.namespace.QName("urn:vim2", "Event"));
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
