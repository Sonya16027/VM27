/**
 * HostIpChangedEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostIpChangedEvent extends com.vmware.vim25.HostEvent implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String oldIP;

	private java.lang.String newIP;

	public HostIpChangedEvent() {
	}

	public HostIpChangedEvent(java.lang.String dynamicType,
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
			java.lang.String oldIP, java.lang.String newIP) {
		super(dynamicType, dynamicProperty, key, chainId, createdTime,
				userName, datacenter, computeResource, host, vm, ds, net, dvs,
				fullFormattedMessage, changeTag);
		this.oldIP = oldIP;
		this.newIP = newIP;
	}

	/**
	 * Gets the oldIP value for this HostIpChangedEvent.
	 * 
	 * @return oldIP
	 */
	public java.lang.String getOldIP() {
		return oldIP;
	}

	/**
	 * Sets the oldIP value for this HostIpChangedEvent.
	 * 
	 * @param oldIP
	 */
	public void setOldIP(java.lang.String oldIP) {
		this.oldIP = oldIP;
	}

	/**
	 * Gets the newIP value for this HostIpChangedEvent.
	 * 
	 * @return newIP
	 */
	public java.lang.String getNewIP() {
		return newIP;
	}

	/**
	 * Sets the newIP value for this HostIpChangedEvent.
	 * 
	 * @param newIP
	 */
	public void setNewIP(java.lang.String newIP) {
		this.newIP = newIP;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof HostIpChangedEvent)) {
			return false;
		}
		HostIpChangedEvent other = (HostIpChangedEvent) obj;
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
				&& ((this.oldIP == null && other.getOldIP() == null) || (this.oldIP != null && this.oldIP
						.equals(other.getOldIP())))
				&& ((this.newIP == null && other.getNewIP() == null) || (this.newIP != null && this.newIP
						.equals(other.getNewIP())));
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
		if (getOldIP() != null) {
			_hashCode += getOldIP().hashCode();
		}
		if (getNewIP() != null) {
			_hashCode += getNewIP().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			HostIpChangedEvent.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostIpChangedEvent"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("oldIP");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "oldIP"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("newIP");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "newIP"));
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
