/**
 * VmMacChangedEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VmMacChangedEvent extends com.vmware.vim25.VmEvent implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String adapter;

	private java.lang.String oldMac;

	private java.lang.String newMac;

	public VmMacChangedEvent() {
	}

	public VmMacChangedEvent(java.lang.String dynamicType,
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
			boolean template, java.lang.String adapter,
			java.lang.String oldMac, java.lang.String newMac) {
		super(dynamicType, dynamicProperty, key, chainId, createdTime,
				userName, datacenter, computeResource, host, vm, ds, net, dvs,
				fullFormattedMessage, changeTag, template);
		this.adapter = adapter;
		this.oldMac = oldMac;
		this.newMac = newMac;
	}

	/**
	 * Gets the adapter value for this VmMacChangedEvent.
	 * 
	 * @return adapter
	 */
	public java.lang.String getAdapter() {
		return adapter;
	}

	/**
	 * Sets the adapter value for this VmMacChangedEvent.
	 * 
	 * @param adapter
	 */
	public void setAdapter(java.lang.String adapter) {
		this.adapter = adapter;
	}

	/**
	 * Gets the oldMac value for this VmMacChangedEvent.
	 * 
	 * @return oldMac
	 */
	public java.lang.String getOldMac() {
		return oldMac;
	}

	/**
	 * Sets the oldMac value for this VmMacChangedEvent.
	 * 
	 * @param oldMac
	 */
	public void setOldMac(java.lang.String oldMac) {
		this.oldMac = oldMac;
	}

	/**
	 * Gets the newMac value for this VmMacChangedEvent.
	 * 
	 * @return newMac
	 */
	public java.lang.String getNewMac() {
		return newMac;
	}

	/**
	 * Sets the newMac value for this VmMacChangedEvent.
	 * 
	 * @param newMac
	 */
	public void setNewMac(java.lang.String newMac) {
		this.newMac = newMac;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof VmMacChangedEvent)) {
			return false;
		}
		VmMacChangedEvent other = (VmMacChangedEvent) obj;
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
				&& ((this.adapter == null && other.getAdapter() == null) || (this.adapter != null && this.adapter
						.equals(other.getAdapter())))
				&& ((this.oldMac == null && other.getOldMac() == null) || (this.oldMac != null && this.oldMac
						.equals(other.getOldMac())))
				&& ((this.newMac == null && other.getNewMac() == null) || (this.newMac != null && this.newMac
						.equals(other.getNewMac())));
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
		if (getAdapter() != null) {
			_hashCode += getAdapter().hashCode();
		}
		if (getOldMac() != null) {
			_hashCode += getOldMac().hashCode();
		}
		if (getNewMac() != null) {
			_hashCode += getNewMac().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			VmMacChangedEvent.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VmMacChangedEvent"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("adapter");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"adapter"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("oldMac");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"oldMac"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("newMac");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"newMac"));
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
