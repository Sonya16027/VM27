/**
 * VmBeingClonedEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class VmBeingClonedEvent extends com.vmware.vim.VmCloneEvent implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim.FolderEventArgument destFolder;

	private java.lang.String destName;

	private com.vmware.vim.HostEventArgument destHost;

	public VmBeingClonedEvent() {
	}

	public VmBeingClonedEvent(java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty, int key,
			int chainId, java.util.Calendar createdTime,
			java.lang.String userName,
			com.vmware.vim.DatacenterEventArgument datacenter,
			com.vmware.vim.ComputeResourceEventArgument computeResource,
			com.vmware.vim.HostEventArgument host,
			com.vmware.vim.VmEventArgument vm,
			java.lang.String fullFormattedMessage, boolean template,
			com.vmware.vim.FolderEventArgument destFolder,
			java.lang.String destName, com.vmware.vim.HostEventArgument destHost) {
		super(dynamicType, dynamicProperty, key, chainId, createdTime,
				userName, datacenter, computeResource, host, vm,
				fullFormattedMessage, template);
		this.destFolder = destFolder;
		this.destName = destName;
		this.destHost = destHost;
	}

	/**
	 * Gets the destFolder value for this VmBeingClonedEvent.
	 * 
	 * @return destFolder
	 */
	public com.vmware.vim.FolderEventArgument getDestFolder() {
		return destFolder;
	}

	/**
	 * Sets the destFolder value for this VmBeingClonedEvent.
	 * 
	 * @param destFolder
	 */
	public void setDestFolder(com.vmware.vim.FolderEventArgument destFolder) {
		this.destFolder = destFolder;
	}

	/**
	 * Gets the destName value for this VmBeingClonedEvent.
	 * 
	 * @return destName
	 */
	public java.lang.String getDestName() {
		return destName;
	}

	/**
	 * Sets the destName value for this VmBeingClonedEvent.
	 * 
	 * @param destName
	 */
	public void setDestName(java.lang.String destName) {
		this.destName = destName;
	}

	/**
	 * Gets the destHost value for this VmBeingClonedEvent.
	 * 
	 * @return destHost
	 */
	public com.vmware.vim.HostEventArgument getDestHost() {
		return destHost;
	}

	/**
	 * Sets the destHost value for this VmBeingClonedEvent.
	 * 
	 * @param destHost
	 */
	public void setDestHost(com.vmware.vim.HostEventArgument destHost) {
		this.destHost = destHost;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof VmBeingClonedEvent)) {
			return false;
		}
		VmBeingClonedEvent other = (VmBeingClonedEvent) obj;
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
						.equals(other.getDestHost())));
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
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			VmBeingClonedEvent.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"VmBeingClonedEvent"));
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
