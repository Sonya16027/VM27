/**
 * DVSSummary.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class DVSSummary extends com.vmware.vim25.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String name;

	private java.lang.String uuid;

	private int numPorts;

	private com.vmware.vim25.DistributedVirtualSwitchProductSpec productInfo;

	private com.vmware.vim25.ManagedObjectReference[] hostMember;

	private com.vmware.vim25.ManagedObjectReference[] vm;

	private com.vmware.vim25.ManagedObjectReference[] host;

	private java.lang.String[] portgroupName;

	private java.lang.String description;

	private com.vmware.vim25.DVSContactInfo contact;

	public DVSSummary() {
	}

	public DVSSummary(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.String name, java.lang.String uuid, int numPorts,
			com.vmware.vim25.DistributedVirtualSwitchProductSpec productInfo,
			com.vmware.vim25.ManagedObjectReference[] hostMember,
			com.vmware.vim25.ManagedObjectReference[] vm,
			com.vmware.vim25.ManagedObjectReference[] host,
			java.lang.String[] portgroupName, java.lang.String description,
			com.vmware.vim25.DVSContactInfo contact) {
		super(dynamicType, dynamicProperty);
		this.name = name;
		this.uuid = uuid;
		this.numPorts = numPorts;
		this.productInfo = productInfo;
		this.hostMember = hostMember;
		this.vm = vm;
		this.host = host;
		this.portgroupName = portgroupName;
		this.description = description;
		this.contact = contact;
	}

	/**
	 * Gets the name value for this DVSSummary.
	 * 
	 * @return name
	 */
	public java.lang.String getName() {
		return name;
	}

	/**
	 * Sets the name value for this DVSSummary.
	 * 
	 * @param name
	 */
	public void setName(java.lang.String name) {
		this.name = name;
	}

	/**
	 * Gets the uuid value for this DVSSummary.
	 * 
	 * @return uuid
	 */
	public java.lang.String getUuid() {
		return uuid;
	}

	/**
	 * Sets the uuid value for this DVSSummary.
	 * 
	 * @param uuid
	 */
	public void setUuid(java.lang.String uuid) {
		this.uuid = uuid;
	}

	/**
	 * Gets the numPorts value for this DVSSummary.
	 * 
	 * @return numPorts
	 */
	public int getNumPorts() {
		return numPorts;
	}

	/**
	 * Sets the numPorts value for this DVSSummary.
	 * 
	 * @param numPorts
	 */
	public void setNumPorts(int numPorts) {
		this.numPorts = numPorts;
	}

	/**
	 * Gets the productInfo value for this DVSSummary.
	 * 
	 * @return productInfo
	 */
	public com.vmware.vim25.DistributedVirtualSwitchProductSpec getProductInfo() {
		return productInfo;
	}

	/**
	 * Sets the productInfo value for this DVSSummary.
	 * 
	 * @param productInfo
	 */
	public void setProductInfo(
			com.vmware.vim25.DistributedVirtualSwitchProductSpec productInfo) {
		this.productInfo = productInfo;
	}

	/**
	 * Gets the hostMember value for this DVSSummary.
	 * 
	 * @return hostMember
	 */
	public com.vmware.vim25.ManagedObjectReference[] getHostMember() {
		return hostMember;
	}

	/**
	 * Sets the hostMember value for this DVSSummary.
	 * 
	 * @param hostMember
	 */
	public void setHostMember(
			com.vmware.vim25.ManagedObjectReference[] hostMember) {
		this.hostMember = hostMember;
	}

	public com.vmware.vim25.ManagedObjectReference getHostMember(int i) {
		return this.hostMember[i];
	}

	public void setHostMember(int i,
			com.vmware.vim25.ManagedObjectReference _value) {
		this.hostMember[i] = _value;
	}

	/**
	 * Gets the vm value for this DVSSummary.
	 * 
	 * @return vm
	 */
	public com.vmware.vim25.ManagedObjectReference[] getVm() {
		return vm;
	}

	/**
	 * Sets the vm value for this DVSSummary.
	 * 
	 * @param vm
	 */
	public void setVm(com.vmware.vim25.ManagedObjectReference[] vm) {
		this.vm = vm;
	}

	public com.vmware.vim25.ManagedObjectReference getVm(int i) {
		return this.vm[i];
	}

	public void setVm(int i, com.vmware.vim25.ManagedObjectReference _value) {
		this.vm[i] = _value;
	}

	/**
	 * Gets the host value for this DVSSummary.
	 * 
	 * @return host
	 */
	public com.vmware.vim25.ManagedObjectReference[] getHost() {
		return host;
	}

	/**
	 * Sets the host value for this DVSSummary.
	 * 
	 * @param host
	 */
	public void setHost(com.vmware.vim25.ManagedObjectReference[] host) {
		this.host = host;
	}

	public com.vmware.vim25.ManagedObjectReference getHost(int i) {
		return this.host[i];
	}

	public void setHost(int i, com.vmware.vim25.ManagedObjectReference _value) {
		this.host[i] = _value;
	}

	/**
	 * Gets the portgroupName value for this DVSSummary.
	 * 
	 * @return portgroupName
	 */
	public java.lang.String[] getPortgroupName() {
		return portgroupName;
	}

	/**
	 * Sets the portgroupName value for this DVSSummary.
	 * 
	 * @param portgroupName
	 */
	public void setPortgroupName(java.lang.String[] portgroupName) {
		this.portgroupName = portgroupName;
	}

	public java.lang.String getPortgroupName(int i) {
		return this.portgroupName[i];
	}

	public void setPortgroupName(int i, java.lang.String _value) {
		this.portgroupName[i] = _value;
	}

	/**
	 * Gets the description value for this DVSSummary.
	 * 
	 * @return description
	 */
	public java.lang.String getDescription() {
		return description;
	}

	/**
	 * Sets the description value for this DVSSummary.
	 * 
	 * @param description
	 */
	public void setDescription(java.lang.String description) {
		this.description = description;
	}

	/**
	 * Gets the contact value for this DVSSummary.
	 * 
	 * @return contact
	 */
	public com.vmware.vim25.DVSContactInfo getContact() {
		return contact;
	}

	/**
	 * Sets the contact value for this DVSSummary.
	 * 
	 * @param contact
	 */
	public void setContact(com.vmware.vim25.DVSContactInfo contact) {
		this.contact = contact;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof DVSSummary)) {
			return false;
		}
		DVSSummary other = (DVSSummary) obj;
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
				&& ((this.name == null && other.getName() == null) || (this.name != null && this.name
						.equals(other.getName())))
				&& ((this.uuid == null && other.getUuid() == null) || (this.uuid != null && this.uuid
						.equals(other.getUuid())))
				&& this.numPorts == other.getNumPorts()
				&& ((this.productInfo == null && other.getProductInfo() == null) || (this.productInfo != null && this.productInfo
						.equals(other.getProductInfo())))
				&& ((this.hostMember == null && other.getHostMember() == null) || (this.hostMember != null && java.util.Arrays
						.equals(this.hostMember, other.getHostMember())))
				&& ((this.vm == null && other.getVm() == null) || (this.vm != null && java.util.Arrays
						.equals(this.vm, other.getVm())))
				&& ((this.host == null && other.getHost() == null) || (this.host != null && java.util.Arrays
						.equals(this.host, other.getHost())))
				&& ((this.portgroupName == null && other.getPortgroupName() == null) || (this.portgroupName != null && java.util.Arrays
						.equals(this.portgroupName, other.getPortgroupName())))
				&& ((this.description == null && other.getDescription() == null) || (this.description != null && this.description
						.equals(other.getDescription())))
				&& ((this.contact == null && other.getContact() == null) || (this.contact != null && this.contact
						.equals(other.getContact())));
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
		if (getName() != null) {
			_hashCode += getName().hashCode();
		}
		if (getUuid() != null) {
			_hashCode += getUuid().hashCode();
		}
		_hashCode += getNumPorts();
		if (getProductInfo() != null) {
			_hashCode += getProductInfo().hashCode();
		}
		if (getHostMember() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getHostMember()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getHostMember(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getVm() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getVm()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getVm(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getHost() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getHost()); i++) {
				java.lang.Object obj = java.lang.reflect.Array
						.get(getHost(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getPortgroupName() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getPortgroupName()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getPortgroupName(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getDescription() != null) {
			_hashCode += getDescription().hashCode();
		}
		if (getContact() != null) {
			_hashCode += getContact().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			DVSSummary.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"DVSSummary"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("name");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "name"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("uuid");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "uuid"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("numPorts");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"numPorts"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("productInfo");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"productInfo"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"DistributedVirtualSwitchProductSpec"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("hostMember");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"hostMember"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("vm");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vm"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("host");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "host"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("portgroupName");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"portgroupName"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("description");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"description"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("contact");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"contact"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"DVSContactInfo"));
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
