/**
 * DatastoreFileCopiedEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class DatastoreFileCopiedEvent extends
		com.vmware.vim25.DatastoreFileEvent implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.DatastoreEventArgument sourceDatastore;

	private java.lang.String sourceFile;

	public DatastoreFileCopiedEvent() {
	}

	public DatastoreFileCopiedEvent(java.lang.String dynamicType,
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
			com.vmware.vim25.DatastoreEventArgument datastore,
			java.lang.String targetFile,
			com.vmware.vim25.DatastoreEventArgument sourceDatastore,
			java.lang.String sourceFile) {
		super(dynamicType, dynamicProperty, key, chainId, createdTime,
				userName, datacenter, computeResource, host, vm, ds, net, dvs,
				fullFormattedMessage, changeTag, datastore, targetFile);
		this.sourceDatastore = sourceDatastore;
		this.sourceFile = sourceFile;
	}

	/**
	 * Gets the sourceDatastore value for this DatastoreFileCopiedEvent.
	 * 
	 * @return sourceDatastore
	 */
	public com.vmware.vim25.DatastoreEventArgument getSourceDatastore() {
		return sourceDatastore;
	}

	/**
	 * Sets the sourceDatastore value for this DatastoreFileCopiedEvent.
	 * 
	 * @param sourceDatastore
	 */
	public void setSourceDatastore(
			com.vmware.vim25.DatastoreEventArgument sourceDatastore) {
		this.sourceDatastore = sourceDatastore;
	}

	/**
	 * Gets the sourceFile value for this DatastoreFileCopiedEvent.
	 * 
	 * @return sourceFile
	 */
	public java.lang.String getSourceFile() {
		return sourceFile;
	}

	/**
	 * Sets the sourceFile value for this DatastoreFileCopiedEvent.
	 * 
	 * @param sourceFile
	 */
	public void setSourceFile(java.lang.String sourceFile) {
		this.sourceFile = sourceFile;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof DatastoreFileCopiedEvent)) {
			return false;
		}
		DatastoreFileCopiedEvent other = (DatastoreFileCopiedEvent) obj;
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
				&& ((this.sourceDatastore == null && other.getSourceDatastore() == null) || (this.sourceDatastore != null && this.sourceDatastore
						.equals(other.getSourceDatastore())))
				&& ((this.sourceFile == null && other.getSourceFile() == null) || (this.sourceFile != null && this.sourceFile
						.equals(other.getSourceFile())));
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
		if (getSourceDatastore() != null) {
			_hashCode += getSourceDatastore().hashCode();
		}
		if (getSourceFile() != null) {
			_hashCode += getSourceFile().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			DatastoreFileCopiedEvent.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"DatastoreFileCopiedEvent"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("sourceDatastore");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"sourceDatastore"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"DatastoreEventArgument"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("sourceFile");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"sourceFile"));
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
