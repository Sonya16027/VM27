/**
 * HostStorageDeviceInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class HostStorageDeviceInfo extends com.vmware.vim.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim.HostHostBusAdapter[] hostBusAdapter;

	private com.vmware.vim.ScsiLun[] scsiLun;

	private com.vmware.vim.HostScsiTopology scsiTopology;

	private com.vmware.vim.HostMultipathInfo multipathInfo;

	private boolean softwareInternetScsiEnabled;

	public HostStorageDeviceInfo() {
	}

	public HostStorageDeviceInfo(java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty,
			com.vmware.vim.HostHostBusAdapter[] hostBusAdapter,
			com.vmware.vim.ScsiLun[] scsiLun,
			com.vmware.vim.HostScsiTopology scsiTopology,
			com.vmware.vim.HostMultipathInfo multipathInfo,
			boolean softwareInternetScsiEnabled) {
		super(dynamicType, dynamicProperty);
		this.hostBusAdapter = hostBusAdapter;
		this.scsiLun = scsiLun;
		this.scsiTopology = scsiTopology;
		this.multipathInfo = multipathInfo;
		this.softwareInternetScsiEnabled = softwareInternetScsiEnabled;
	}

	/**
	 * Gets the hostBusAdapter value for this HostStorageDeviceInfo.
	 * 
	 * @return hostBusAdapter
	 */
	public com.vmware.vim.HostHostBusAdapter[] getHostBusAdapter() {
		return hostBusAdapter;
	}

	/**
	 * Sets the hostBusAdapter value for this HostStorageDeviceInfo.
	 * 
	 * @param hostBusAdapter
	 */
	public void setHostBusAdapter(
			com.vmware.vim.HostHostBusAdapter[] hostBusAdapter) {
		this.hostBusAdapter = hostBusAdapter;
	}

	public com.vmware.vim.HostHostBusAdapter getHostBusAdapter(int i) {
		return this.hostBusAdapter[i];
	}

	public void setHostBusAdapter(int i,
			com.vmware.vim.HostHostBusAdapter _value) {
		this.hostBusAdapter[i] = _value;
	}

	/**
	 * Gets the scsiLun value for this HostStorageDeviceInfo.
	 * 
	 * @return scsiLun
	 */
	public com.vmware.vim.ScsiLun[] getScsiLun() {
		return scsiLun;
	}

	/**
	 * Sets the scsiLun value for this HostStorageDeviceInfo.
	 * 
	 * @param scsiLun
	 */
	public void setScsiLun(com.vmware.vim.ScsiLun[] scsiLun) {
		this.scsiLun = scsiLun;
	}

	public com.vmware.vim.ScsiLun getScsiLun(int i) {
		return this.scsiLun[i];
	}

	public void setScsiLun(int i, com.vmware.vim.ScsiLun _value) {
		this.scsiLun[i] = _value;
	}

	/**
	 * Gets the scsiTopology value for this HostStorageDeviceInfo.
	 * 
	 * @return scsiTopology
	 */
	public com.vmware.vim.HostScsiTopology getScsiTopology() {
		return scsiTopology;
	}

	/**
	 * Sets the scsiTopology value for this HostStorageDeviceInfo.
	 * 
	 * @param scsiTopology
	 */
	public void setScsiTopology(com.vmware.vim.HostScsiTopology scsiTopology) {
		this.scsiTopology = scsiTopology;
	}

	/**
	 * Gets the multipathInfo value for this HostStorageDeviceInfo.
	 * 
	 * @return multipathInfo
	 */
	public com.vmware.vim.HostMultipathInfo getMultipathInfo() {
		return multipathInfo;
	}

	/**
	 * Sets the multipathInfo value for this HostStorageDeviceInfo.
	 * 
	 * @param multipathInfo
	 */
	public void setMultipathInfo(com.vmware.vim.HostMultipathInfo multipathInfo) {
		this.multipathInfo = multipathInfo;
	}

	/**
	 * Gets the softwareInternetScsiEnabled value for this
	 * HostStorageDeviceInfo.
	 * 
	 * @return softwareInternetScsiEnabled
	 */
	public boolean isSoftwareInternetScsiEnabled() {
		return softwareInternetScsiEnabled;
	}

	/**
	 * Sets the softwareInternetScsiEnabled value for this
	 * HostStorageDeviceInfo.
	 * 
	 * @param softwareInternetScsiEnabled
	 */
	public void setSoftwareInternetScsiEnabled(
			boolean softwareInternetScsiEnabled) {
		this.softwareInternetScsiEnabled = softwareInternetScsiEnabled;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof HostStorageDeviceInfo)) {
			return false;
		}
		HostStorageDeviceInfo other = (HostStorageDeviceInfo) obj;
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
				&& ((this.hostBusAdapter == null && other.getHostBusAdapter() == null) || (this.hostBusAdapter != null && java.util.Arrays
						.equals(this.hostBusAdapter, other.getHostBusAdapter())))
				&& ((this.scsiLun == null && other.getScsiLun() == null) || (this.scsiLun != null && java.util.Arrays
						.equals(this.scsiLun, other.getScsiLun())))
				&& ((this.scsiTopology == null && other.getScsiTopology() == null) || (this.scsiTopology != null && this.scsiTopology
						.equals(other.getScsiTopology())))
				&& ((this.multipathInfo == null && other.getMultipathInfo() == null) || (this.multipathInfo != null && this.multipathInfo
						.equals(other.getMultipathInfo())))
				&& this.softwareInternetScsiEnabled == other
						.isSoftwareInternetScsiEnabled();
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
		if (getHostBusAdapter() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getHostBusAdapter()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getHostBusAdapter(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getScsiLun() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getScsiLun()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getScsiLun(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getScsiTopology() != null) {
			_hashCode += getScsiTopology().hashCode();
		}
		if (getMultipathInfo() != null) {
			_hashCode += getMultipathInfo().hashCode();
		}
		_hashCode += (isSoftwareInternetScsiEnabled() ? Boolean.TRUE
				: Boolean.FALSE).hashCode();
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			HostStorageDeviceInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"HostStorageDeviceInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("hostBusAdapter");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"hostBusAdapter"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"HostHostBusAdapter"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("scsiLun");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"scsiLun"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ScsiLun"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("scsiTopology");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"scsiTopology"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"HostScsiTopology"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("multipathInfo");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"multipathInfo"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"HostMultipathInfo"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("softwareInternetScsiEnabled");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"softwareInternetScsiEnabled"));
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
