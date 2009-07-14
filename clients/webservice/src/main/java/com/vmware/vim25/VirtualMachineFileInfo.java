/**
 * VirtualMachineFileInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VirtualMachineFileInfo extends com.vmware.vim25.DynamicData
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String vmPathName;

	private java.lang.String snapshotDirectory;

	private java.lang.String suspendDirectory;

	private java.lang.String logDirectory;

	public VirtualMachineFileInfo() {
	}

	public VirtualMachineFileInfo(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.String vmPathName, java.lang.String snapshotDirectory,
			java.lang.String suspendDirectory, java.lang.String logDirectory) {
		super(dynamicType, dynamicProperty);
		this.vmPathName = vmPathName;
		this.snapshotDirectory = snapshotDirectory;
		this.suspendDirectory = suspendDirectory;
		this.logDirectory = logDirectory;
	}

	/**
	 * Gets the vmPathName value for this VirtualMachineFileInfo.
	 * 
	 * @return vmPathName
	 */
	public java.lang.String getVmPathName() {
		return vmPathName;
	}

	/**
	 * Sets the vmPathName value for this VirtualMachineFileInfo.
	 * 
	 * @param vmPathName
	 */
	public void setVmPathName(java.lang.String vmPathName) {
		this.vmPathName = vmPathName;
	}

	/**
	 * Gets the snapshotDirectory value for this VirtualMachineFileInfo.
	 * 
	 * @return snapshotDirectory
	 */
	public java.lang.String getSnapshotDirectory() {
		return snapshotDirectory;
	}

	/**
	 * Sets the snapshotDirectory value for this VirtualMachineFileInfo.
	 * 
	 * @param snapshotDirectory
	 */
	public void setSnapshotDirectory(java.lang.String snapshotDirectory) {
		this.snapshotDirectory = snapshotDirectory;
	}

	/**
	 * Gets the suspendDirectory value for this VirtualMachineFileInfo.
	 * 
	 * @return suspendDirectory
	 */
	public java.lang.String getSuspendDirectory() {
		return suspendDirectory;
	}

	/**
	 * Sets the suspendDirectory value for this VirtualMachineFileInfo.
	 * 
	 * @param suspendDirectory
	 */
	public void setSuspendDirectory(java.lang.String suspendDirectory) {
		this.suspendDirectory = suspendDirectory;
	}

	/**
	 * Gets the logDirectory value for this VirtualMachineFileInfo.
	 * 
	 * @return logDirectory
	 */
	public java.lang.String getLogDirectory() {
		return logDirectory;
	}

	/**
	 * Sets the logDirectory value for this VirtualMachineFileInfo.
	 * 
	 * @param logDirectory
	 */
	public void setLogDirectory(java.lang.String logDirectory) {
		this.logDirectory = logDirectory;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof VirtualMachineFileInfo)) {
			return false;
		}
		VirtualMachineFileInfo other = (VirtualMachineFileInfo) obj;
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
				&& ((this.vmPathName == null && other.getVmPathName() == null) || (this.vmPathName != null && this.vmPathName
						.equals(other.getVmPathName())))
				&& ((this.snapshotDirectory == null && other
						.getSnapshotDirectory() == null) || (this.snapshotDirectory != null && this.snapshotDirectory
						.equals(other.getSnapshotDirectory())))
				&& ((this.suspendDirectory == null && other
						.getSuspendDirectory() == null) || (this.suspendDirectory != null && this.suspendDirectory
						.equals(other.getSuspendDirectory())))
				&& ((this.logDirectory == null && other.getLogDirectory() == null) || (this.logDirectory != null && this.logDirectory
						.equals(other.getLogDirectory())));
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
		if (getVmPathName() != null) {
			_hashCode += getVmPathName().hashCode();
		}
		if (getSnapshotDirectory() != null) {
			_hashCode += getSnapshotDirectory().hashCode();
		}
		if (getSuspendDirectory() != null) {
			_hashCode += getSuspendDirectory().hashCode();
		}
		if (getLogDirectory() != null) {
			_hashCode += getLogDirectory().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			VirtualMachineFileInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VirtualMachineFileInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("vmPathName");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"vmPathName"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("snapshotDirectory");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"snapshotDirectory"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("suspendDirectory");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"suspendDirectory"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("logDirectory");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"logDirectory"));
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
