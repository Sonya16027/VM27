/**
 * LockerReconfiguredEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class LockerReconfiguredEvent extends com.vmware.vim25.Event implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.DatastoreEventArgument oldDatastore;

	private com.vmware.vim25.DatastoreEventArgument newDatastore;

	public LockerReconfiguredEvent() {
	}

	public LockerReconfiguredEvent(java.lang.String dynamicType,
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
			com.vmware.vim25.DatastoreEventArgument oldDatastore,
			com.vmware.vim25.DatastoreEventArgument newDatastore) {
		super(dynamicType, dynamicProperty, key, chainId, createdTime,
				userName, datacenter, computeResource, host, vm, ds, net, dvs,
				fullFormattedMessage, changeTag);
		this.oldDatastore = oldDatastore;
		this.newDatastore = newDatastore;
	}

	/**
	 * Gets the oldDatastore value for this LockerReconfiguredEvent.
	 * 
	 * @return oldDatastore
	 */
	public com.vmware.vim25.DatastoreEventArgument getOldDatastore() {
		return oldDatastore;
	}

	/**
	 * Sets the oldDatastore value for this LockerReconfiguredEvent.
	 * 
	 * @param oldDatastore
	 */
	public void setOldDatastore(
			com.vmware.vim25.DatastoreEventArgument oldDatastore) {
		this.oldDatastore = oldDatastore;
	}

	/**
	 * Gets the newDatastore value for this LockerReconfiguredEvent.
	 * 
	 * @return newDatastore
	 */
	public com.vmware.vim25.DatastoreEventArgument getNewDatastore() {
		return newDatastore;
	}

	/**
	 * Sets the newDatastore value for this LockerReconfiguredEvent.
	 * 
	 * @param newDatastore
	 */
	public void setNewDatastore(
			com.vmware.vim25.DatastoreEventArgument newDatastore) {
		this.newDatastore = newDatastore;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof LockerReconfiguredEvent)) {
			return false;
		}
		LockerReconfiguredEvent other = (LockerReconfiguredEvent) obj;
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
				&& ((this.oldDatastore == null && other.getOldDatastore() == null) || (this.oldDatastore != null && this.oldDatastore
						.equals(other.getOldDatastore())))
				&& ((this.newDatastore == null && other.getNewDatastore() == null) || (this.newDatastore != null && this.newDatastore
						.equals(other.getNewDatastore())));
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
		if (getOldDatastore() != null) {
			_hashCode += getOldDatastore().hashCode();
		}
		if (getNewDatastore() != null) {
			_hashCode += getNewDatastore().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			LockerReconfiguredEvent.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"LockerReconfiguredEvent"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("oldDatastore");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"oldDatastore"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"DatastoreEventArgument"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("newDatastore");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"newDatastore"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"DatastoreEventArgument"));
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
