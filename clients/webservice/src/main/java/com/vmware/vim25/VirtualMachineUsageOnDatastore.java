/**
 * VirtualMachineUsageOnDatastore.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VirtualMachineUsageOnDatastore extends
		com.vmware.vim25.DynamicData implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.ManagedObjectReference datastore;

	private long committed;

	private long uncommitted;

	private long unshared;

	public VirtualMachineUsageOnDatastore() {
	}

	public VirtualMachineUsageOnDatastore(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			com.vmware.vim25.ManagedObjectReference datastore, long committed,
			long uncommitted, long unshared) {
		super(dynamicType, dynamicProperty);
		this.datastore = datastore;
		this.committed = committed;
		this.uncommitted = uncommitted;
		this.unshared = unshared;
	}

	/**
	 * Gets the datastore value for this VirtualMachineUsageOnDatastore.
	 * 
	 * @return datastore
	 */
	public com.vmware.vim25.ManagedObjectReference getDatastore() {
		return datastore;
	}

	/**
	 * Sets the datastore value for this VirtualMachineUsageOnDatastore.
	 * 
	 * @param datastore
	 */
	public void setDatastore(com.vmware.vim25.ManagedObjectReference datastore) {
		this.datastore = datastore;
	}

	/**
	 * Gets the committed value for this VirtualMachineUsageOnDatastore.
	 * 
	 * @return committed
	 */
	public long getCommitted() {
		return committed;
	}

	/**
	 * Sets the committed value for this VirtualMachineUsageOnDatastore.
	 * 
	 * @param committed
	 */
	public void setCommitted(long committed) {
		this.committed = committed;
	}

	/**
	 * Gets the uncommitted value for this VirtualMachineUsageOnDatastore.
	 * 
	 * @return uncommitted
	 */
	public long getUncommitted() {
		return uncommitted;
	}

	/**
	 * Sets the uncommitted value for this VirtualMachineUsageOnDatastore.
	 * 
	 * @param uncommitted
	 */
	public void setUncommitted(long uncommitted) {
		this.uncommitted = uncommitted;
	}

	/**
	 * Gets the unshared value for this VirtualMachineUsageOnDatastore.
	 * 
	 * @return unshared
	 */
	public long getUnshared() {
		return unshared;
	}

	/**
	 * Sets the unshared value for this VirtualMachineUsageOnDatastore.
	 * 
	 * @param unshared
	 */
	public void setUnshared(long unshared) {
		this.unshared = unshared;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof VirtualMachineUsageOnDatastore)) {
			return false;
		}
		VirtualMachineUsageOnDatastore other = (VirtualMachineUsageOnDatastore) obj;
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
				&& ((this.datastore == null && other.getDatastore() == null) || (this.datastore != null && this.datastore
						.equals(other.getDatastore())))
				&& this.committed == other.getCommitted()
				&& this.uncommitted == other.getUncommitted()
				&& this.unshared == other.getUnshared();
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
		if (getDatastore() != null) {
			_hashCode += getDatastore().hashCode();
		}
		_hashCode += new Long(getCommitted()).hashCode();
		_hashCode += new Long(getUncommitted()).hashCode();
		_hashCode += new Long(getUnshared()).hashCode();
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			VirtualMachineUsageOnDatastore.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VirtualMachineUsageOnDatastore"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("datastore");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"datastore"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("committed");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"committed"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "long"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("uncommitted");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"uncommitted"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "long"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("unshared");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"unshared"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "long"));
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
