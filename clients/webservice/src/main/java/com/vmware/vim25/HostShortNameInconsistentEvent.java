/**
 * HostShortNameInconsistentEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostShortNameInconsistentEvent extends
		com.vmware.vim25.HostDasEvent implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String shortName;

	private java.lang.String shortName2;

	public HostShortNameInconsistentEvent() {
	}

	public HostShortNameInconsistentEvent(java.lang.String dynamicType,
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
			java.lang.String shortName, java.lang.String shortName2) {
		super(dynamicType, dynamicProperty, key, chainId, createdTime,
				userName, datacenter, computeResource, host, vm, ds, net, dvs,
				fullFormattedMessage, changeTag);
		this.shortName = shortName;
		this.shortName2 = shortName2;
	}

	/**
	 * Gets the shortName value for this HostShortNameInconsistentEvent.
	 * 
	 * @return shortName
	 */
	public java.lang.String getShortName() {
		return shortName;
	}

	/**
	 * Sets the shortName value for this HostShortNameInconsistentEvent.
	 * 
	 * @param shortName
	 */
	public void setShortName(java.lang.String shortName) {
		this.shortName = shortName;
	}

	/**
	 * Gets the shortName2 value for this HostShortNameInconsistentEvent.
	 * 
	 * @return shortName2
	 */
	public java.lang.String getShortName2() {
		return shortName2;
	}

	/**
	 * Sets the shortName2 value for this HostShortNameInconsistentEvent.
	 * 
	 * @param shortName2
	 */
	public void setShortName2(java.lang.String shortName2) {
		this.shortName2 = shortName2;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof HostShortNameInconsistentEvent)) {
			return false;
		}
		HostShortNameInconsistentEvent other = (HostShortNameInconsistentEvent) obj;
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
				&& ((this.shortName == null && other.getShortName() == null) || (this.shortName != null && this.shortName
						.equals(other.getShortName())))
				&& ((this.shortName2 == null && other.getShortName2() == null) || (this.shortName2 != null && this.shortName2
						.equals(other.getShortName2())));
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
		if (getShortName() != null) {
			_hashCode += getShortName().hashCode();
		}
		if (getShortName2() != null) {
			_hashCode += getShortName2().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			HostShortNameInconsistentEvent.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostShortNameInconsistentEvent"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("shortName");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"shortName"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("shortName2");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"shortName2"));
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
