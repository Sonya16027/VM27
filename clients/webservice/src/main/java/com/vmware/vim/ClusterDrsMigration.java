/**
 * ClusterDrsMigration.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class ClusterDrsMigration extends com.vmware.vim.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String key;

	private java.util.Calendar time;

	private com.vmware.vim.ManagedObjectReference vm;

	private java.lang.Integer cpuLoad;

	private java.lang.Long memoryLoad;

	private com.vmware.vim.ManagedObjectReference source;

	private java.lang.Integer sourceCpuLoad;

	private java.lang.Long sourceMemoryLoad;

	private com.vmware.vim.ManagedObjectReference destination;

	private java.lang.Integer destinationCpuLoad;

	private java.lang.Long destinationMemoryLoad;

	public ClusterDrsMigration() {
	}

	public ClusterDrsMigration(java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty,
			java.lang.String key, java.util.Calendar time,
			com.vmware.vim.ManagedObjectReference vm,
			java.lang.Integer cpuLoad, java.lang.Long memoryLoad,
			com.vmware.vim.ManagedObjectReference source,
			java.lang.Integer sourceCpuLoad, java.lang.Long sourceMemoryLoad,
			com.vmware.vim.ManagedObjectReference destination,
			java.lang.Integer destinationCpuLoad,
			java.lang.Long destinationMemoryLoad) {
		super(dynamicType, dynamicProperty);
		this.key = key;
		this.time = time;
		this.vm = vm;
		this.cpuLoad = cpuLoad;
		this.memoryLoad = memoryLoad;
		this.source = source;
		this.sourceCpuLoad = sourceCpuLoad;
		this.sourceMemoryLoad = sourceMemoryLoad;
		this.destination = destination;
		this.destinationCpuLoad = destinationCpuLoad;
		this.destinationMemoryLoad = destinationMemoryLoad;
	}

	/**
	 * Gets the key value for this ClusterDrsMigration.
	 * 
	 * @return key
	 */
	public java.lang.String getKey() {
		return key;
	}

	/**
	 * Sets the key value for this ClusterDrsMigration.
	 * 
	 * @param key
	 */
	public void setKey(java.lang.String key) {
		this.key = key;
	}

	/**
	 * Gets the time value for this ClusterDrsMigration.
	 * 
	 * @return time
	 */
	public java.util.Calendar getTime() {
		return time;
	}

	/**
	 * Sets the time value for this ClusterDrsMigration.
	 * 
	 * @param time
	 */
	public void setTime(java.util.Calendar time) {
		this.time = time;
	}

	/**
	 * Gets the vm value for this ClusterDrsMigration.
	 * 
	 * @return vm
	 */
	public com.vmware.vim.ManagedObjectReference getVm() {
		return vm;
	}

	/**
	 * Sets the vm value for this ClusterDrsMigration.
	 * 
	 * @param vm
	 */
	public void setVm(com.vmware.vim.ManagedObjectReference vm) {
		this.vm = vm;
	}

	/**
	 * Gets the cpuLoad value for this ClusterDrsMigration.
	 * 
	 * @return cpuLoad
	 */
	public java.lang.Integer getCpuLoad() {
		return cpuLoad;
	}

	/**
	 * Sets the cpuLoad value for this ClusterDrsMigration.
	 * 
	 * @param cpuLoad
	 */
	public void setCpuLoad(java.lang.Integer cpuLoad) {
		this.cpuLoad = cpuLoad;
	}

	/**
	 * Gets the memoryLoad value for this ClusterDrsMigration.
	 * 
	 * @return memoryLoad
	 */
	public java.lang.Long getMemoryLoad() {
		return memoryLoad;
	}

	/**
	 * Sets the memoryLoad value for this ClusterDrsMigration.
	 * 
	 * @param memoryLoad
	 */
	public void setMemoryLoad(java.lang.Long memoryLoad) {
		this.memoryLoad = memoryLoad;
	}

	/**
	 * Gets the source value for this ClusterDrsMigration.
	 * 
	 * @return source
	 */
	public com.vmware.vim.ManagedObjectReference getSource() {
		return source;
	}

	/**
	 * Sets the source value for this ClusterDrsMigration.
	 * 
	 * @param source
	 */
	public void setSource(com.vmware.vim.ManagedObjectReference source) {
		this.source = source;
	}

	/**
	 * Gets the sourceCpuLoad value for this ClusterDrsMigration.
	 * 
	 * @return sourceCpuLoad
	 */
	public java.lang.Integer getSourceCpuLoad() {
		return sourceCpuLoad;
	}

	/**
	 * Sets the sourceCpuLoad value for this ClusterDrsMigration.
	 * 
	 * @param sourceCpuLoad
	 */
	public void setSourceCpuLoad(java.lang.Integer sourceCpuLoad) {
		this.sourceCpuLoad = sourceCpuLoad;
	}

	/**
	 * Gets the sourceMemoryLoad value for this ClusterDrsMigration.
	 * 
	 * @return sourceMemoryLoad
	 */
	public java.lang.Long getSourceMemoryLoad() {
		return sourceMemoryLoad;
	}

	/**
	 * Sets the sourceMemoryLoad value for this ClusterDrsMigration.
	 * 
	 * @param sourceMemoryLoad
	 */
	public void setSourceMemoryLoad(java.lang.Long sourceMemoryLoad) {
		this.sourceMemoryLoad = sourceMemoryLoad;
	}

	/**
	 * Gets the destination value for this ClusterDrsMigration.
	 * 
	 * @return destination
	 */
	public com.vmware.vim.ManagedObjectReference getDestination() {
		return destination;
	}

	/**
	 * Sets the destination value for this ClusterDrsMigration.
	 * 
	 * @param destination
	 */
	public void setDestination(com.vmware.vim.ManagedObjectReference destination) {
		this.destination = destination;
	}

	/**
	 * Gets the destinationCpuLoad value for this ClusterDrsMigration.
	 * 
	 * @return destinationCpuLoad
	 */
	public java.lang.Integer getDestinationCpuLoad() {
		return destinationCpuLoad;
	}

	/**
	 * Sets the destinationCpuLoad value for this ClusterDrsMigration.
	 * 
	 * @param destinationCpuLoad
	 */
	public void setDestinationCpuLoad(java.lang.Integer destinationCpuLoad) {
		this.destinationCpuLoad = destinationCpuLoad;
	}

	/**
	 * Gets the destinationMemoryLoad value for this ClusterDrsMigration.
	 * 
	 * @return destinationMemoryLoad
	 */
	public java.lang.Long getDestinationMemoryLoad() {
		return destinationMemoryLoad;
	}

	/**
	 * Sets the destinationMemoryLoad value for this ClusterDrsMigration.
	 * 
	 * @param destinationMemoryLoad
	 */
	public void setDestinationMemoryLoad(java.lang.Long destinationMemoryLoad) {
		this.destinationMemoryLoad = destinationMemoryLoad;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ClusterDrsMigration)) {
			return false;
		}
		ClusterDrsMigration other = (ClusterDrsMigration) obj;
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
				&& ((this.key == null && other.getKey() == null) || (this.key != null && this.key
						.equals(other.getKey())))
				&& ((this.time == null && other.getTime() == null) || (this.time != null && this.time
						.equals(other.getTime())))
				&& ((this.vm == null && other.getVm() == null) || (this.vm != null && this.vm
						.equals(other.getVm())))
				&& ((this.cpuLoad == null && other.getCpuLoad() == null) || (this.cpuLoad != null && this.cpuLoad
						.equals(other.getCpuLoad())))
				&& ((this.memoryLoad == null && other.getMemoryLoad() == null) || (this.memoryLoad != null && this.memoryLoad
						.equals(other.getMemoryLoad())))
				&& ((this.source == null && other.getSource() == null) || (this.source != null && this.source
						.equals(other.getSource())))
				&& ((this.sourceCpuLoad == null && other.getSourceCpuLoad() == null) || (this.sourceCpuLoad != null && this.sourceCpuLoad
						.equals(other.getSourceCpuLoad())))
				&& ((this.sourceMemoryLoad == null && other
						.getSourceMemoryLoad() == null) || (this.sourceMemoryLoad != null && this.sourceMemoryLoad
						.equals(other.getSourceMemoryLoad())))
				&& ((this.destination == null && other.getDestination() == null) || (this.destination != null && this.destination
						.equals(other.getDestination())))
				&& ((this.destinationCpuLoad == null && other
						.getDestinationCpuLoad() == null) || (this.destinationCpuLoad != null && this.destinationCpuLoad
						.equals(other.getDestinationCpuLoad())))
				&& ((this.destinationMemoryLoad == null && other
						.getDestinationMemoryLoad() == null) || (this.destinationMemoryLoad != null && this.destinationMemoryLoad
						.equals(other.getDestinationMemoryLoad())));
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
		if (getKey() != null) {
			_hashCode += getKey().hashCode();
		}
		if (getTime() != null) {
			_hashCode += getTime().hashCode();
		}
		if (getVm() != null) {
			_hashCode += getVm().hashCode();
		}
		if (getCpuLoad() != null) {
			_hashCode += getCpuLoad().hashCode();
		}
		if (getMemoryLoad() != null) {
			_hashCode += getMemoryLoad().hashCode();
		}
		if (getSource() != null) {
			_hashCode += getSource().hashCode();
		}
		if (getSourceCpuLoad() != null) {
			_hashCode += getSourceCpuLoad().hashCode();
		}
		if (getSourceMemoryLoad() != null) {
			_hashCode += getSourceMemoryLoad().hashCode();
		}
		if (getDestination() != null) {
			_hashCode += getDestination().hashCode();
		}
		if (getDestinationCpuLoad() != null) {
			_hashCode += getDestinationCpuLoad().hashCode();
		}
		if (getDestinationMemoryLoad() != null) {
			_hashCode += getDestinationMemoryLoad().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			ClusterDrsMigration.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ClusterDrsMigration"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("key");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "key"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("time");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "time"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "dateTime"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("vm");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "vm"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("cpuLoad");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"cpuLoad"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("memoryLoad");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"memoryLoad"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "long"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("source");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim2", "source"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("sourceCpuLoad");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"sourceCpuLoad"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("sourceMemoryLoad");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"sourceMemoryLoad"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "long"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("destination");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"destination"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("destinationCpuLoad");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"destinationCpuLoad"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("destinationMemoryLoad");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"destinationMemoryLoad"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "long"));
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
