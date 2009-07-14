/**
 * GroupAlarmAction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class GroupAlarmAction extends com.vmware.vim25.AlarmAction implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.AlarmAction[] action;

	public GroupAlarmAction() {
	}

	public GroupAlarmAction(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			com.vmware.vim25.AlarmAction[] action) {
		super(dynamicType, dynamicProperty);
		this.action = action;
	}

	/**
	 * Gets the action value for this GroupAlarmAction.
	 * 
	 * @return action
	 */
	public com.vmware.vim25.AlarmAction[] getAction() {
		return action;
	}

	/**
	 * Sets the action value for this GroupAlarmAction.
	 * 
	 * @param action
	 */
	public void setAction(com.vmware.vim25.AlarmAction[] action) {
		this.action = action;
	}

	public com.vmware.vim25.AlarmAction getAction(int i) {
		return this.action[i];
	}

	public void setAction(int i, com.vmware.vim25.AlarmAction _value) {
		this.action[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof GroupAlarmAction)) {
			return false;
		}
		GroupAlarmAction other = (GroupAlarmAction) obj;
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
				&& ((this.action == null && other.getAction() == null) || (this.action != null && java.util.Arrays
						.equals(this.action, other.getAction())));
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
			for (int i = 0; i < java.lang.reflect.Array.getLength(getAction()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getAction(),
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
			GroupAlarmAction.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"GroupAlarmAction"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("action");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"action"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"AlarmAction"));
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
