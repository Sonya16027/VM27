/**
 * AlarmScriptCompleteEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class AlarmScriptCompleteEvent extends com.vmware.vim25.AlarmEvent
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.ManagedEntityEventArgument entity;

	private java.lang.String script;

	public AlarmScriptCompleteEvent() {
	}

	public AlarmScriptCompleteEvent(java.lang.String dynamicType,
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
			com.vmware.vim25.AlarmEventArgument alarm,
			com.vmware.vim25.ManagedEntityEventArgument entity,
			java.lang.String script) {
		super(dynamicType, dynamicProperty, key, chainId, createdTime,
				userName, datacenter, computeResource, host, vm, ds, net, dvs,
				fullFormattedMessage, changeTag, alarm);
		this.entity = entity;
		this.script = script;
	}

	/**
	 * Gets the entity value for this AlarmScriptCompleteEvent.
	 * 
	 * @return entity
	 */
	public com.vmware.vim25.ManagedEntityEventArgument getEntity() {
		return entity;
	}

	/**
	 * Sets the entity value for this AlarmScriptCompleteEvent.
	 * 
	 * @param entity
	 */
	public void setEntity(com.vmware.vim25.ManagedEntityEventArgument entity) {
		this.entity = entity;
	}

	/**
	 * Gets the script value for this AlarmScriptCompleteEvent.
	 * 
	 * @return script
	 */
	public java.lang.String getScript() {
		return script;
	}

	/**
	 * Sets the script value for this AlarmScriptCompleteEvent.
	 * 
	 * @param script
	 */
	public void setScript(java.lang.String script) {
		this.script = script;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof AlarmScriptCompleteEvent)) {
			return false;
		}
		AlarmScriptCompleteEvent other = (AlarmScriptCompleteEvent) obj;
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
				&& ((this.entity == null && other.getEntity() == null) || (this.entity != null && this.entity
						.equals(other.getEntity())))
				&& ((this.script == null && other.getScript() == null) || (this.script != null && this.script
						.equals(other.getScript())));
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
		if (getEntity() != null) {
			_hashCode += getEntity().hashCode();
		}
		if (getScript() != null) {
			_hashCode += getScript().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			AlarmScriptCompleteEvent.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"AlarmScriptCompleteEvent"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("entity");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"entity"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedEntityEventArgument"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("script");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"script"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
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
