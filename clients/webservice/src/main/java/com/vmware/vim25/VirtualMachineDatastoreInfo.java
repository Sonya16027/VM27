/**
 * VirtualMachineDatastoreInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VirtualMachineDatastoreInfo extends
		com.vmware.vim25.VirtualMachineTargetInfo implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.DatastoreSummary datastore;

	private com.vmware.vim25.DatastoreCapability capability;

	private long maxFileSize;

	private java.lang.String mode;

	public VirtualMachineDatastoreInfo() {
	}

	public VirtualMachineDatastoreInfo(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.String name, java.lang.String[] configurationTag,
			com.vmware.vim25.DatastoreSummary datastore,
			com.vmware.vim25.DatastoreCapability capability, long maxFileSize,
			java.lang.String mode) {
		super(dynamicType, dynamicProperty, name, configurationTag);
		this.datastore = datastore;
		this.capability = capability;
		this.maxFileSize = maxFileSize;
		this.mode = mode;
	}

	/**
	 * Gets the datastore value for this VirtualMachineDatastoreInfo.
	 * 
	 * @return datastore
	 */
	public com.vmware.vim25.DatastoreSummary getDatastore() {
		return datastore;
	}

	/**
	 * Sets the datastore value for this VirtualMachineDatastoreInfo.
	 * 
	 * @param datastore
	 */
	public void setDatastore(com.vmware.vim25.DatastoreSummary datastore) {
		this.datastore = datastore;
	}

	/**
	 * Gets the capability value for this VirtualMachineDatastoreInfo.
	 * 
	 * @return capability
	 */
	public com.vmware.vim25.DatastoreCapability getCapability() {
		return capability;
	}

	/**
	 * Sets the capability value for this VirtualMachineDatastoreInfo.
	 * 
	 * @param capability
	 */
	public void setCapability(com.vmware.vim25.DatastoreCapability capability) {
		this.capability = capability;
	}

	/**
	 * Gets the maxFileSize value for this VirtualMachineDatastoreInfo.
	 * 
	 * @return maxFileSize
	 */
	public long getMaxFileSize() {
		return maxFileSize;
	}

	/**
	 * Sets the maxFileSize value for this VirtualMachineDatastoreInfo.
	 * 
	 * @param maxFileSize
	 */
	public void setMaxFileSize(long maxFileSize) {
		this.maxFileSize = maxFileSize;
	}

	/**
	 * Gets the mode value for this VirtualMachineDatastoreInfo.
	 * 
	 * @return mode
	 */
	public java.lang.String getMode() {
		return mode;
	}

	/**
	 * Sets the mode value for this VirtualMachineDatastoreInfo.
	 * 
	 * @param mode
	 */
	public void setMode(java.lang.String mode) {
		this.mode = mode;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof VirtualMachineDatastoreInfo)) {
			return false;
		}
		VirtualMachineDatastoreInfo other = (VirtualMachineDatastoreInfo) obj;
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
				&& ((this.capability == null && other.getCapability() == null) || (this.capability != null && this.capability
						.equals(other.getCapability())))
				&& this.maxFileSize == other.getMaxFileSize()
				&& ((this.mode == null && other.getMode() == null) || (this.mode != null && this.mode
						.equals(other.getMode())));
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
		if (getCapability() != null) {
			_hashCode += getCapability().hashCode();
		}
		_hashCode += new Long(getMaxFileSize()).hashCode();
		if (getMode() != null) {
			_hashCode += getMode().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			VirtualMachineDatastoreInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VirtualMachineDatastoreInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("datastore");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"datastore"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"DatastoreSummary"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("capability");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"capability"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"DatastoreCapability"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("maxFileSize");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"maxFileSize"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "long"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("mode");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "mode"));
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
