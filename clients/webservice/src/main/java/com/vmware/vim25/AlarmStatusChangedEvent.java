/**
 * AlarmStatusChangedEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class AlarmStatusChangedEvent extends com.vmware.vim25.AlarmEvent
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.ManagedEntityEventArgument source;

	private com.vmware.vim25.ManagedEntityEventArgument entity;

	private java.lang.String from;

	private java.lang.String to;

	public AlarmStatusChangedEvent() {
	}

	public AlarmStatusChangedEvent(java.lang.String dynamicType,
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
			com.vmware.vim25.ManagedEntityEventArgument source,
			com.vmware.vim25.ManagedEntityEventArgument entity,
			java.lang.String from, java.lang.String to) {
		super(dynamicType, dynamicProperty, key, chainId, createdTime,
				userName, datacenter, computeResource, host, vm, ds, net, dvs,
				fullFormattedMessage, changeTag, alarm);
		this.source = source;
		this.entity = entity;
		this.from = from;
		this.to = to;
	}

	/**
	 * Gets the source value for this AlarmStatusChangedEvent.
	 * 
	 * @return source
	 */
	public com.vmware.vim25.ManagedEntityEventArgument getSource() {
		return source;
	}

	/**
	 * Sets the source value for this AlarmStatusChangedEvent.
	 * 
	 * @param source
	 */
	public void setSource(com.vmware.vim25.ManagedEntityEventArgument source) {
		this.source = source;
	}

	/**
	 * Gets the entity value for this AlarmStatusChangedEvent.
	 * 
	 * @return entity
	 */
	public com.vmware.vim25.ManagedEntityEventArgument getEntity() {
		return entity;
	}

	/**
	 * Sets the entity value for this AlarmStatusChangedEvent.
	 * 
	 * @param entity
	 */
	public void setEntity(com.vmware.vim25.ManagedEntityEventArgument entity) {
		this.entity = entity;
	}

	/**
	 * Gets the from value for this AlarmStatusChangedEvent.
	 * 
	 * @return from
	 */
	public java.lang.String getFrom() {
		return from;
	}

	/**
	 * Sets the from value for this AlarmStatusChangedEvent.
	 * 
	 * @param from
	 */
	public void setFrom(java.lang.String from) {
		this.from = from;
	}

	/**
	 * Gets the to value for this AlarmStatusChangedEvent.
	 * 
	 * @return to
	 */
	public java.lang.String getTo() {
		return to;
	}

	/**
	 * Sets the to value for this AlarmStatusChangedEvent.
	 * 
	 * @param to
	 */
	public void setTo(java.lang.String to) {
		this.to = to;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof AlarmStatusChangedEvent)) {
			return false;
		}
		AlarmStatusChangedEvent other = (AlarmStatusChangedEvent) obj;
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
				&& ((this.source == null && other.getSource() == null) || (this.source != null && this.source
						.equals(other.getSource())))
				&& ((this.entity == null && other.getEntity() == null) || (this.entity != null && this.entity
						.equals(other.getEntity())))
				&& ((this.from == null && other.getFrom() == null) || (this.from != null && this.from
						.equals(other.getFrom())))
				&& ((this.to == null && other.getTo() == null) || (this.to != null && this.to
						.equals(other.getTo())));
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
		if (getSource() != null) {
			_hashCode += getSource().hashCode();
		}
		if (getEntity() != null) {
			_hashCode += getEntity().hashCode();
		}
		if (getFrom() != null) {
			_hashCode += getFrom().hashCode();
		}
		if (getTo() != null) {
			_hashCode += getTo().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			AlarmStatusChangedEvent.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"AlarmStatusChangedEvent"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("source");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"source"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedEntityEventArgument"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("entity");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"entity"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedEntityEventArgument"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("from");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "from"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("to");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "to"));
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
