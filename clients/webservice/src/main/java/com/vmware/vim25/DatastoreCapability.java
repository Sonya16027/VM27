/**
 * DatastoreCapability.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class DatastoreCapability extends com.vmware.vim25.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private boolean directoryHierarchySupported;

	private boolean rawDiskMappingsSupported;

	private boolean perFileThinProvisioningSupported;

	public DatastoreCapability() {
	}

	public DatastoreCapability(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			boolean directoryHierarchySupported,
			boolean rawDiskMappingsSupported,
			boolean perFileThinProvisioningSupported) {
		super(dynamicType, dynamicProperty);
		this.directoryHierarchySupported = directoryHierarchySupported;
		this.rawDiskMappingsSupported = rawDiskMappingsSupported;
		this.perFileThinProvisioningSupported = perFileThinProvisioningSupported;
	}

	/**
	 * Gets the directoryHierarchySupported value for this DatastoreCapability.
	 * 
	 * @return directoryHierarchySupported
	 */
	public boolean isDirectoryHierarchySupported() {
		return directoryHierarchySupported;
	}

	/**
	 * Sets the directoryHierarchySupported value for this DatastoreCapability.
	 * 
	 * @param directoryHierarchySupported
	 */
	public void setDirectoryHierarchySupported(
			boolean directoryHierarchySupported) {
		this.directoryHierarchySupported = directoryHierarchySupported;
	}

	/**
	 * Gets the rawDiskMappingsSupported value for this DatastoreCapability.
	 * 
	 * @return rawDiskMappingsSupported
	 */
	public boolean isRawDiskMappingsSupported() {
		return rawDiskMappingsSupported;
	}

	/**
	 * Sets the rawDiskMappingsSupported value for this DatastoreCapability.
	 * 
	 * @param rawDiskMappingsSupported
	 */
	public void setRawDiskMappingsSupported(boolean rawDiskMappingsSupported) {
		this.rawDiskMappingsSupported = rawDiskMappingsSupported;
	}

	/**
	 * Gets the perFileThinProvisioningSupported value for this
	 * DatastoreCapability.
	 * 
	 * @return perFileThinProvisioningSupported
	 */
	public boolean isPerFileThinProvisioningSupported() {
		return perFileThinProvisioningSupported;
	}

	/**
	 * Sets the perFileThinProvisioningSupported value for this
	 * DatastoreCapability.
	 * 
	 * @param perFileThinProvisioningSupported
	 */
	public void setPerFileThinProvisioningSupported(
			boolean perFileThinProvisioningSupported) {
		this.perFileThinProvisioningSupported = perFileThinProvisioningSupported;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof DatastoreCapability)) {
			return false;
		}
		DatastoreCapability other = (DatastoreCapability) obj;
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
				&& this.directoryHierarchySupported == other
						.isDirectoryHierarchySupported()
				&& this.rawDiskMappingsSupported == other
						.isRawDiskMappingsSupported()
				&& this.perFileThinProvisioningSupported == other
						.isPerFileThinProvisioningSupported();
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
		_hashCode += (isDirectoryHierarchySupported() ? Boolean.TRUE
				: Boolean.FALSE).hashCode();
		_hashCode += (isRawDiskMappingsSupported() ? Boolean.TRUE
				: Boolean.FALSE).hashCode();
		_hashCode += (isPerFileThinProvisioningSupported() ? Boolean.TRUE
				: Boolean.FALSE).hashCode();
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			DatastoreCapability.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"DatastoreCapability"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("directoryHierarchySupported");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"directoryHierarchySupported"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("rawDiskMappingsSupported");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"rawDiskMappingsSupported"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("perFileThinProvisioningSupported");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"perFileThinProvisioningSupported"));
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
