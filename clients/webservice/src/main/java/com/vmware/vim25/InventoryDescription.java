/**
 * InventoryDescription.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class InventoryDescription extends com.vmware.vim25.DynamicData
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int numHosts;

	private int numVirtualMachines;

	private java.lang.Integer numResourcePools;

	private java.lang.Integer numClusters;

	private java.lang.Integer numCpuDev;

	private java.lang.Integer numNetDev;

	private java.lang.Integer numDiskDev;

	private java.lang.Integer numvCpuDev;

	private java.lang.Integer numvNetDev;

	private java.lang.Integer numvDiskDev;

	public InventoryDescription() {
	}

	public InventoryDescription(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty, int numHosts,
			int numVirtualMachines, java.lang.Integer numResourcePools,
			java.lang.Integer numClusters, java.lang.Integer numCpuDev,
			java.lang.Integer numNetDev, java.lang.Integer numDiskDev,
			java.lang.Integer numvCpuDev, java.lang.Integer numvNetDev,
			java.lang.Integer numvDiskDev) {
		super(dynamicType, dynamicProperty);
		this.numHosts = numHosts;
		this.numVirtualMachines = numVirtualMachines;
		this.numResourcePools = numResourcePools;
		this.numClusters = numClusters;
		this.numCpuDev = numCpuDev;
		this.numNetDev = numNetDev;
		this.numDiskDev = numDiskDev;
		this.numvCpuDev = numvCpuDev;
		this.numvNetDev = numvNetDev;
		this.numvDiskDev = numvDiskDev;
	}

	/**
	 * Gets the numHosts value for this InventoryDescription.
	 * 
	 * @return numHosts
	 */
	public int getNumHosts() {
		return numHosts;
	}

	/**
	 * Sets the numHosts value for this InventoryDescription.
	 * 
	 * @param numHosts
	 */
	public void setNumHosts(int numHosts) {
		this.numHosts = numHosts;
	}

	/**
	 * Gets the numVirtualMachines value for this InventoryDescription.
	 * 
	 * @return numVirtualMachines
	 */
	public int getNumVirtualMachines() {
		return numVirtualMachines;
	}

	/**
	 * Sets the numVirtualMachines value for this InventoryDescription.
	 * 
	 * @param numVirtualMachines
	 */
	public void setNumVirtualMachines(int numVirtualMachines) {
		this.numVirtualMachines = numVirtualMachines;
	}

	/**
	 * Gets the numResourcePools value for this InventoryDescription.
	 * 
	 * @return numResourcePools
	 */
	public java.lang.Integer getNumResourcePools() {
		return numResourcePools;
	}

	/**
	 * Sets the numResourcePools value for this InventoryDescription.
	 * 
	 * @param numResourcePools
	 */
	public void setNumResourcePools(java.lang.Integer numResourcePools) {
		this.numResourcePools = numResourcePools;
	}

	/**
	 * Gets the numClusters value for this InventoryDescription.
	 * 
	 * @return numClusters
	 */
	public java.lang.Integer getNumClusters() {
		return numClusters;
	}

	/**
	 * Sets the numClusters value for this InventoryDescription.
	 * 
	 * @param numClusters
	 */
	public void setNumClusters(java.lang.Integer numClusters) {
		this.numClusters = numClusters;
	}

	/**
	 * Gets the numCpuDev value for this InventoryDescription.
	 * 
	 * @return numCpuDev
	 */
	public java.lang.Integer getNumCpuDev() {
		return numCpuDev;
	}

	/**
	 * Sets the numCpuDev value for this InventoryDescription.
	 * 
	 * @param numCpuDev
	 */
	public void setNumCpuDev(java.lang.Integer numCpuDev) {
		this.numCpuDev = numCpuDev;
	}

	/**
	 * Gets the numNetDev value for this InventoryDescription.
	 * 
	 * @return numNetDev
	 */
	public java.lang.Integer getNumNetDev() {
		return numNetDev;
	}

	/**
	 * Sets the numNetDev value for this InventoryDescription.
	 * 
	 * @param numNetDev
	 */
	public void setNumNetDev(java.lang.Integer numNetDev) {
		this.numNetDev = numNetDev;
	}

	/**
	 * Gets the numDiskDev value for this InventoryDescription.
	 * 
	 * @return numDiskDev
	 */
	public java.lang.Integer getNumDiskDev() {
		return numDiskDev;
	}

	/**
	 * Sets the numDiskDev value for this InventoryDescription.
	 * 
	 * @param numDiskDev
	 */
	public void setNumDiskDev(java.lang.Integer numDiskDev) {
		this.numDiskDev = numDiskDev;
	}

	/**
	 * Gets the numvCpuDev value for this InventoryDescription.
	 * 
	 * @return numvCpuDev
	 */
	public java.lang.Integer getNumvCpuDev() {
		return numvCpuDev;
	}

	/**
	 * Sets the numvCpuDev value for this InventoryDescription.
	 * 
	 * @param numvCpuDev
	 */
	public void setNumvCpuDev(java.lang.Integer numvCpuDev) {
		this.numvCpuDev = numvCpuDev;
	}

	/**
	 * Gets the numvNetDev value for this InventoryDescription.
	 * 
	 * @return numvNetDev
	 */
	public java.lang.Integer getNumvNetDev() {
		return numvNetDev;
	}

	/**
	 * Sets the numvNetDev value for this InventoryDescription.
	 * 
	 * @param numvNetDev
	 */
	public void setNumvNetDev(java.lang.Integer numvNetDev) {
		this.numvNetDev = numvNetDev;
	}

	/**
	 * Gets the numvDiskDev value for this InventoryDescription.
	 * 
	 * @return numvDiskDev
	 */
	public java.lang.Integer getNumvDiskDev() {
		return numvDiskDev;
	}

	/**
	 * Sets the numvDiskDev value for this InventoryDescription.
	 * 
	 * @param numvDiskDev
	 */
	public void setNumvDiskDev(java.lang.Integer numvDiskDev) {
		this.numvDiskDev = numvDiskDev;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof InventoryDescription)) {
			return false;
		}
		InventoryDescription other = (InventoryDescription) obj;
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
				&& this.numHosts == other.getNumHosts()
				&& this.numVirtualMachines == other.getNumVirtualMachines()
				&& ((this.numResourcePools == null && other
						.getNumResourcePools() == null) || (this.numResourcePools != null && this.numResourcePools
						.equals(other.getNumResourcePools())))
				&& ((this.numClusters == null && other.getNumClusters() == null) || (this.numClusters != null && this.numClusters
						.equals(other.getNumClusters())))
				&& ((this.numCpuDev == null && other.getNumCpuDev() == null) || (this.numCpuDev != null && this.numCpuDev
						.equals(other.getNumCpuDev())))
				&& ((this.numNetDev == null && other.getNumNetDev() == null) || (this.numNetDev != null && this.numNetDev
						.equals(other.getNumNetDev())))
				&& ((this.numDiskDev == null && other.getNumDiskDev() == null) || (this.numDiskDev != null && this.numDiskDev
						.equals(other.getNumDiskDev())))
				&& ((this.numvCpuDev == null && other.getNumvCpuDev() == null) || (this.numvCpuDev != null && this.numvCpuDev
						.equals(other.getNumvCpuDev())))
				&& ((this.numvNetDev == null && other.getNumvNetDev() == null) || (this.numvNetDev != null && this.numvNetDev
						.equals(other.getNumvNetDev())))
				&& ((this.numvDiskDev == null && other.getNumvDiskDev() == null) || (this.numvDiskDev != null && this.numvDiskDev
						.equals(other.getNumvDiskDev())));
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
		_hashCode += getNumHosts();
		_hashCode += getNumVirtualMachines();
		if (getNumResourcePools() != null) {
			_hashCode += getNumResourcePools().hashCode();
		}
		if (getNumClusters() != null) {
			_hashCode += getNumClusters().hashCode();
		}
		if (getNumCpuDev() != null) {
			_hashCode += getNumCpuDev().hashCode();
		}
		if (getNumNetDev() != null) {
			_hashCode += getNumNetDev().hashCode();
		}
		if (getNumDiskDev() != null) {
			_hashCode += getNumDiskDev().hashCode();
		}
		if (getNumvCpuDev() != null) {
			_hashCode += getNumvCpuDev().hashCode();
		}
		if (getNumvNetDev() != null) {
			_hashCode += getNumvNetDev().hashCode();
		}
		if (getNumvDiskDev() != null) {
			_hashCode += getNumvDiskDev().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			InventoryDescription.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"InventoryDescription"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("numHosts");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"numHosts"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("numVirtualMachines");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"numVirtualMachines"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("numResourcePools");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"numResourcePools"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("numClusters");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"numClusters"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("numCpuDev");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"numCpuDev"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("numNetDev");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"numNetDev"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("numDiskDev");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"numDiskDev"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("numvCpuDev");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"numvCpuDev"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("numvNetDev");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"numvNetDev"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("numvDiskDev");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"numvDiskDev"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
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
