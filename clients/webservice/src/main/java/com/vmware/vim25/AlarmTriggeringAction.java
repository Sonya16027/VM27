/**
 * AlarmTriggeringAction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class AlarmTriggeringAction extends com.vmware.vim25.AlarmAction
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.Action action;

	private com.vmware.vim25.AlarmTriggeringActionTransitionSpec[] transitionSpecs;

	private boolean green2Yellow;

	private boolean yellow2Red;

	private boolean red2Yellow;

	private boolean yellow2Green;

	public AlarmTriggeringAction() {
	}

	public AlarmTriggeringAction(
			java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			com.vmware.vim25.Action action,
			com.vmware.vim25.AlarmTriggeringActionTransitionSpec[] transitionSpecs,
			boolean green2Yellow, boolean yellow2Red, boolean red2Yellow,
			boolean yellow2Green) {
		super(dynamicType, dynamicProperty);
		this.action = action;
		this.transitionSpecs = transitionSpecs;
		this.green2Yellow = green2Yellow;
		this.yellow2Red = yellow2Red;
		this.red2Yellow = red2Yellow;
		this.yellow2Green = yellow2Green;
	}

	/**
	 * Gets the action value for this AlarmTriggeringAction.
	 * 
	 * @return action
	 */
	public com.vmware.vim25.Action getAction() {
		return action;
	}

	/**
	 * Sets the action value for this AlarmTriggeringAction.
	 * 
	 * @param action
	 */
	public void setAction(com.vmware.vim25.Action action) {
		this.action = action;
	}

	/**
	 * Gets the transitionSpecs value for this AlarmTriggeringAction.
	 * 
	 * @return transitionSpecs
	 */
	public com.vmware.vim25.AlarmTriggeringActionTransitionSpec[] getTransitionSpecs() {
		return transitionSpecs;
	}

	/**
	 * Sets the transitionSpecs value for this AlarmTriggeringAction.
	 * 
	 * @param transitionSpecs
	 */
	public void setTransitionSpecs(
			com.vmware.vim25.AlarmTriggeringActionTransitionSpec[] transitionSpecs) {
		this.transitionSpecs = transitionSpecs;
	}

	public com.vmware.vim25.AlarmTriggeringActionTransitionSpec getTransitionSpecs(
			int i) {
		return this.transitionSpecs[i];
	}

	public void setTransitionSpecs(int i,
			com.vmware.vim25.AlarmTriggeringActionTransitionSpec _value) {
		this.transitionSpecs[i] = _value;
	}

	/**
	 * Gets the green2Yellow value for this AlarmTriggeringAction.
	 * 
	 * @return green2Yellow
	 */
	public boolean isGreen2Yellow() {
		return green2Yellow;
	}

	/**
	 * Sets the green2Yellow value for this AlarmTriggeringAction.
	 * 
	 * @param green2Yellow
	 */
	public void setGreen2Yellow(boolean green2Yellow) {
		this.green2Yellow = green2Yellow;
	}

	/**
	 * Gets the yellow2Red value for this AlarmTriggeringAction.
	 * 
	 * @return yellow2Red
	 */
	public boolean isYellow2Red() {
		return yellow2Red;
	}

	/**
	 * Sets the yellow2Red value for this AlarmTriggeringAction.
	 * 
	 * @param yellow2Red
	 */
	public void setYellow2Red(boolean yellow2Red) {
		this.yellow2Red = yellow2Red;
	}

	/**
	 * Gets the red2Yellow value for this AlarmTriggeringAction.
	 * 
	 * @return red2Yellow
	 */
	public boolean isRed2Yellow() {
		return red2Yellow;
	}

	/**
	 * Sets the red2Yellow value for this AlarmTriggeringAction.
	 * 
	 * @param red2Yellow
	 */
	public void setRed2Yellow(boolean red2Yellow) {
		this.red2Yellow = red2Yellow;
	}

	/**
	 * Gets the yellow2Green value for this AlarmTriggeringAction.
	 * 
	 * @return yellow2Green
	 */
	public boolean isYellow2Green() {
		return yellow2Green;
	}

	/**
	 * Sets the yellow2Green value for this AlarmTriggeringAction.
	 * 
	 * @param yellow2Green
	 */
	public void setYellow2Green(boolean yellow2Green) {
		this.yellow2Green = yellow2Green;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof AlarmTriggeringAction)) {
			return false;
		}
		AlarmTriggeringAction other = (AlarmTriggeringAction) obj;
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
				&& ((this.transitionSpecs == null && other.getTransitionSpecs() == null) || (this.transitionSpecs != null && java.util.Arrays
						.equals(this.transitionSpecs, other
								.getTransitionSpecs())))
				&& this.green2Yellow == other.isGreen2Yellow()
				&& this.yellow2Red == other.isYellow2Red()
				&& this.red2Yellow == other.isRed2Yellow()
				&& this.yellow2Green == other.isYellow2Green();
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
		if (getTransitionSpecs() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getTransitionSpecs()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getTransitionSpecs(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		_hashCode += (isGreen2Yellow() ? Boolean.TRUE : Boolean.FALSE)
				.hashCode();
		_hashCode += (isYellow2Red() ? Boolean.TRUE : Boolean.FALSE).hashCode();
		_hashCode += (isRed2Yellow() ? Boolean.TRUE : Boolean.FALSE).hashCode();
		_hashCode += (isYellow2Green() ? Boolean.TRUE : Boolean.FALSE)
				.hashCode();
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			AlarmTriggeringAction.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"AlarmTriggeringAction"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("action");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"action"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"Action"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("transitionSpecs");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"transitionSpecs"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"AlarmTriggeringActionTransitionSpec"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("green2Yellow");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"green2yellow"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("yellow2Red");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"yellow2red"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("red2Yellow");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"red2yellow"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("yellow2Green");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"yellow2green"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
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
