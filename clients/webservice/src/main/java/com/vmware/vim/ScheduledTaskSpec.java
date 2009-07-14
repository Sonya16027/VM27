/**
 * ScheduledTaskSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class ScheduledTaskSpec extends com.vmware.vim.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String name;

	private java.lang.String description;

	private boolean enabled;

	private com.vmware.vim.TaskScheduler scheduler;

	private com.vmware.vim.Action action;

	private java.lang.String notification;

	public ScheduledTaskSpec() {
	}

	public ScheduledTaskSpec(java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty,
			java.lang.String name, java.lang.String description,
			boolean enabled, com.vmware.vim.TaskScheduler scheduler,
			com.vmware.vim.Action action, java.lang.String notification) {
		super(dynamicType, dynamicProperty);
		this.name = name;
		this.description = description;
		this.enabled = enabled;
		this.scheduler = scheduler;
		this.action = action;
		this.notification = notification;
	}

	/**
	 * Gets the name value for this ScheduledTaskSpec.
	 * 
	 * @return name
	 */
	public java.lang.String getName() {
		return name;
	}

	/**
	 * Sets the name value for this ScheduledTaskSpec.
	 * 
	 * @param name
	 */
	public void setName(java.lang.String name) {
		this.name = name;
	}

	/**
	 * Gets the description value for this ScheduledTaskSpec.
	 * 
	 * @return description
	 */
	public java.lang.String getDescription() {
		return description;
	}

	/**
	 * Sets the description value for this ScheduledTaskSpec.
	 * 
	 * @param description
	 */
	public void setDescription(java.lang.String description) {
		this.description = description;
	}

	/**
	 * Gets the enabled value for this ScheduledTaskSpec.
	 * 
	 * @return enabled
	 */
	public boolean isEnabled() {
		return enabled;
	}

	/**
	 * Sets the enabled value for this ScheduledTaskSpec.
	 * 
	 * @param enabled
	 */
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * Gets the scheduler value for this ScheduledTaskSpec.
	 * 
	 * @return scheduler
	 */
	public com.vmware.vim.TaskScheduler getScheduler() {
		return scheduler;
	}

	/**
	 * Sets the scheduler value for this ScheduledTaskSpec.
	 * 
	 * @param scheduler
	 */
	public void setScheduler(com.vmware.vim.TaskScheduler scheduler) {
		this.scheduler = scheduler;
	}

	/**
	 * Gets the action value for this ScheduledTaskSpec.
	 * 
	 * @return action
	 */
	public com.vmware.vim.Action getAction() {
		return action;
	}

	/**
	 * Sets the action value for this ScheduledTaskSpec.
	 * 
	 * @param action
	 */
	public void setAction(com.vmware.vim.Action action) {
		this.action = action;
	}

	/**
	 * Gets the notification value for this ScheduledTaskSpec.
	 * 
	 * @return notification
	 */
	public java.lang.String getNotification() {
		return notification;
	}

	/**
	 * Sets the notification value for this ScheduledTaskSpec.
	 * 
	 * @param notification
	 */
	public void setNotification(java.lang.String notification) {
		this.notification = notification;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ScheduledTaskSpec)) {
			return false;
		}
		ScheduledTaskSpec other = (ScheduledTaskSpec) obj;
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
				&& ((this.name == null && other.getName() == null) || (this.name != null && this.name
						.equals(other.getName())))
				&& ((this.description == null && other.getDescription() == null) || (this.description != null && this.description
						.equals(other.getDescription())))
				&& this.enabled == other.isEnabled()
				&& ((this.scheduler == null && other.getScheduler() == null) || (this.scheduler != null && this.scheduler
						.equals(other.getScheduler())))
				&& ((this.action == null && other.getAction() == null) || (this.action != null && this.action
						.equals(other.getAction())))
				&& ((this.notification == null && other.getNotification() == null) || (this.notification != null && this.notification
						.equals(other.getNotification())));
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
		if (getName() != null) {
			_hashCode += getName().hashCode();
		}
		if (getDescription() != null) {
			_hashCode += getDescription().hashCode();
		}
		_hashCode += (isEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
		if (getScheduler() != null) {
			_hashCode += getScheduler().hashCode();
		}
		if (getAction() != null) {
			_hashCode += getAction().hashCode();
		}
		if (getNotification() != null) {
			_hashCode += getNotification().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			ScheduledTaskSpec.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ScheduledTaskSpec"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("name");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "name"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("description");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"description"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("enabled");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"enabled"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("scheduler");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"scheduler"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"TaskScheduler"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("action");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim2", "action"));
		elemField
				.setXmlType(new javax.xml.namespace.QName("urn:vim2", "Action"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("notification");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"notification"));
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
