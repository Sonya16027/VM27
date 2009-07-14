/**
 * ArrayOfAlarmAction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfAlarmAction implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.AlarmAction[] alarmAction;

	public ArrayOfAlarmAction() {
	}

	public ArrayOfAlarmAction(com.vmware.vim25.AlarmAction[] alarmAction) {
		this.alarmAction = alarmAction;
	}

	/**
	 * Gets the alarmAction value for this ArrayOfAlarmAction.
	 * 
	 * @return alarmAction
	 */
	public com.vmware.vim25.AlarmAction[] getAlarmAction() {
		return alarmAction;
	}

	/**
	 * Sets the alarmAction value for this ArrayOfAlarmAction.
	 * 
	 * @param alarmAction
	 */
	public void setAlarmAction(com.vmware.vim25.AlarmAction[] alarmAction) {
		this.alarmAction = alarmAction;
	}

	public com.vmware.vim25.AlarmAction getAlarmAction(int i) {
		return this.alarmAction[i];
	}

	public void setAlarmAction(int i, com.vmware.vim25.AlarmAction _value) {
		this.alarmAction[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfAlarmAction)) {
			return false;
		}
		ArrayOfAlarmAction other = (ArrayOfAlarmAction) obj;
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
		_equals = true && ((this.alarmAction == null && other.getAlarmAction() == null) || (this.alarmAction != null && java.util.Arrays
				.equals(this.alarmAction, other.getAlarmAction())));
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
		if (getAlarmAction() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getAlarmAction()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getAlarmAction(), i);
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
			ArrayOfAlarmAction.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ArrayOfAlarmAction"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("alarmAction");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"AlarmAction"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"AlarmAction"));
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
