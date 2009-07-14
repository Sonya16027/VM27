/**
 * ResourceConfigSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class ResourceConfigSpec extends com.vmware.vim.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim.ManagedObjectReference entity;

	private java.lang.String changeVersion;

	private java.util.Calendar lastModified;

	private com.vmware.vim.ResourceAllocationInfo cpuAllocation;

	private com.vmware.vim.ResourceAllocationInfo memoryAllocation;

	public ResourceConfigSpec() {
	}

	public ResourceConfigSpec(java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty,
			com.vmware.vim.ManagedObjectReference entity,
			java.lang.String changeVersion, java.util.Calendar lastModified,
			com.vmware.vim.ResourceAllocationInfo cpuAllocation,
			com.vmware.vim.ResourceAllocationInfo memoryAllocation) {
		super(dynamicType, dynamicProperty);
		this.entity = entity;
		this.changeVersion = changeVersion;
		this.lastModified = lastModified;
		this.cpuAllocation = cpuAllocation;
		this.memoryAllocation = memoryAllocation;
	}

	/**
	 * Gets the entity value for this ResourceConfigSpec.
	 * 
	 * @return entity
	 */
	public com.vmware.vim.ManagedObjectReference getEntity() {
		return entity;
	}

	/**
	 * Sets the entity value for this ResourceConfigSpec.
	 * 
	 * @param entity
	 */
	public void setEntity(com.vmware.vim.ManagedObjectReference entity) {
		this.entity = entity;
	}

	/**
	 * Gets the changeVersion value for this ResourceConfigSpec.
	 * 
	 * @return changeVersion
	 */
	public java.lang.String getChangeVersion() {
		return changeVersion;
	}

	/**
	 * Sets the changeVersion value for this ResourceConfigSpec.
	 * 
	 * @param changeVersion
	 */
	public void setChangeVersion(java.lang.String changeVersion) {
		this.changeVersion = changeVersion;
	}

	/**
	 * Gets the lastModified value for this ResourceConfigSpec.
	 * 
	 * @return lastModified
	 */
	public java.util.Calendar getLastModified() {
		return lastModified;
	}

	/**
	 * Sets the lastModified value for this ResourceConfigSpec.
	 * 
	 * @param lastModified
	 */
	public void setLastModified(java.util.Calendar lastModified) {
		this.lastModified = lastModified;
	}

	/**
	 * Gets the cpuAllocation value for this ResourceConfigSpec.
	 * 
	 * @return cpuAllocation
	 */
	public com.vmware.vim.ResourceAllocationInfo getCpuAllocation() {
		return cpuAllocation;
	}

	/**
	 * Sets the cpuAllocation value for this ResourceConfigSpec.
	 * 
	 * @param cpuAllocation
	 */
	public void setCpuAllocation(
			com.vmware.vim.ResourceAllocationInfo cpuAllocation) {
		this.cpuAllocation = cpuAllocation;
	}

	/**
	 * Gets the memoryAllocation value for this ResourceConfigSpec.
	 * 
	 * @return memoryAllocation
	 */
	public com.vmware.vim.ResourceAllocationInfo getMemoryAllocation() {
		return memoryAllocation;
	}

	/**
	 * Sets the memoryAllocation value for this ResourceConfigSpec.
	 * 
	 * @param memoryAllocation
	 */
	public void setMemoryAllocation(
			com.vmware.vim.ResourceAllocationInfo memoryAllocation) {
		this.memoryAllocation = memoryAllocation;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ResourceConfigSpec)) {
			return false;
		}
		ResourceConfigSpec other = (ResourceConfigSpec) obj;
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
				&& ((this.entity == null && other.getEntity() == null) || (this.entity != null && this.entity
						.equals(other.getEntity())))
				&& ((this.changeVersion == null && other.getChangeVersion() == null) || (this.changeVersion != null && this.changeVersion
						.equals(other.getChangeVersion())))
				&& ((this.lastModified == null && other.getLastModified() == null) || (this.lastModified != null && this.lastModified
						.equals(other.getLastModified())))
				&& ((this.cpuAllocation == null && other.getCpuAllocation() == null) || (this.cpuAllocation != null && this.cpuAllocation
						.equals(other.getCpuAllocation())))
				&& ((this.memoryAllocation == null && other
						.getMemoryAllocation() == null) || (this.memoryAllocation != null && this.memoryAllocation
						.equals(other.getMemoryAllocation())));
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
		if (getEntity() != null) {
			_hashCode += getEntity().hashCode();
		}
		if (getChangeVersion() != null) {
			_hashCode += getChangeVersion().hashCode();
		}
		if (getLastModified() != null) {
			_hashCode += getLastModified().hashCode();
		}
		if (getCpuAllocation() != null) {
			_hashCode += getCpuAllocation().hashCode();
		}
		if (getMemoryAllocation() != null) {
			_hashCode += getMemoryAllocation().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			ResourceConfigSpec.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ResourceConfigSpec"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("entity");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim2", "entity"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ManagedObjectReference"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("changeVersion");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"changeVersion"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("lastModified");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"lastModified"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "dateTime"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("cpuAllocation");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"cpuAllocation"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ResourceAllocationInfo"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("memoryAllocation");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"memoryAllocation"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ResourceAllocationInfo"));
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
