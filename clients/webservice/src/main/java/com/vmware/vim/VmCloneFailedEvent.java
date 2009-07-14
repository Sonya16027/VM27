/**
 * VmCloneFailedEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class VmCloneFailedEvent extends com.vmware.vim.VmCloneEvent implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim.FolderEventArgument destFolder;

	private java.lang.String destName;

	private com.vmware.vim.HostEventArgument destHost;

	private com.vmware.vim.LocalizedMethodFault reason;

	public VmCloneFailedEvent() {
	}

	public VmCloneFailedEvent(java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty, int key,
			int chainId, java.util.Calendar createdTime,
			java.lang.String userName,
			com.vmware.vim.DatacenterEventArgument datacenter,
			com.vmware.vim.ComputeResourceEventArgument computeResource,
			com.vmware.vim.HostEventArgument host,
			com.vmware.vim.VmEventArgument vm,
			java.lang.String fullFormattedMessage, boolean template,
			com.vmware.vim.FolderEventArgument destFolder,
			java.lang.String destName,
			com.vmware.vim.HostEventArgument destHost,
			com.vmware.vim.LocalizedMethodFault reason) {
		super(dynamicType, dynamicProperty, key, chainId, createdTime,
				userName, datacenter, computeResource, host, vm,
				fullFormattedMessage, template);
		this.destFolder = destFolder;
		this.destName = destName;
		this.destHost = destHost;
		this.reason = reason;
	}

	/**
	 * Gets the destFolder value for this VmCloneFailedEvent.
	 * 
	 * @return destFolder
	 */
	public com.vmware.vim.FolderEventArgument getDestFolder() {
		return destFolder;
	}

	/**
	 * Sets the destFolder value for this VmCloneFailedEvent.
	 * 
	 * @param destFolder
	 */
	public void setDestFolder(com.vmware.vim.FolderEventArgument destFolder) {
		this.destFolder = destFolder;
	}

	/**
	 * Gets the destName value for this VmCloneFailedEvent.
	 * 
	 * @return destName
	 */
	public java.lang.String getDestName() {
		return destName;
	}

	/**
	 * Sets the destName value for this VmCloneFailedEvent.
	 * 
	 * @param destName
	 */
	public void setDestName(java.lang.String destName) {
		this.destName = destName;
	}

	/**
	 * Gets the destHost value for this VmCloneFailedEvent.
	 * 
	 * @return destHost
	 */
	public com.vmware.vim.HostEventArgument getDestHost() {
		return destHost;
	}

	/**
	 * Sets the destHost value for this VmCloneFailedEvent.
	 * 
	 * @param destHost
	 */
	public void setDestHost(com.vmware.vim.HostEventArgument destHost) {
		this.destHost = destHost;
	}

	/**
	 * Gets the reason value for this VmCloneFailedEvent.
	 * 
	 * @return reason
	 */
	public com.vmware.vim.LocalizedMethodFault getReason() {
		return reason;
	}

	/**
	 * Sets the reason value for this VmCloneFailedEvent.
	 * 
	 * @param reason
	 */
	public void setReason(com.vmware.vim.LocalizedMethodFault reason) {
		this.reason = reason;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof VmCloneFailedEvent)) {
			return false;
		}
		VmCloneFailedEvent other = (VmCloneFailedEvent) obj;
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
				&& ((this.destFolder == null && other.getDestFolder() == null) || (this.destFolder != null && this.destFolder
						.equals(other.getDestFolder())))
				&& ((this.destName == null && other.getDestName() == null) || (this.destName != null && this.destName
						.equals(other.getDestName())))
				&& ((this.destHost == null && other.getDestHost() == null) || (this.destHost != null && this.destHost
						.equals(other.getDestHost())))
				&& ((this.reason == null && other.getReason() == null) || (this.reason != null && this.reason
						.equals(other.getReason())));
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
		if (getDestFolder() != null) {
			_hashCode += getDestFolder().hashCode();
		}
		if (getDestName() != null) {
			_hashCode += getDestName().hashCode();
		}
		if (getDestHost() != null) {
			_hashCode += getDestHost().hashCode();
		}
		if (getReason() != null) {
			_hashCode += getReason().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			VmCloneFailedEvent.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"VmCloneFailedEvent"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("destFolder");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"destFolder"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"FolderEventArgument"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("destName");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"destName"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("destHost");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"destHost"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"HostEventArgument"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("reason");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim2", "reason"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"LocalizedMethodFault"));
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
