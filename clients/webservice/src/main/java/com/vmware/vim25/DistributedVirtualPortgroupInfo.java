/**
 * DistributedVirtualPortgroupInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class DistributedVirtualPortgroupInfo extends
		com.vmware.vim25.DynamicData implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String switchName;

	private java.lang.String switchUuid;

	private java.lang.String portgroupName;

	private java.lang.String portgroupKey;

	private java.lang.String portgroupType;

	private boolean uplinkPortgroup;

	private com.vmware.vim25.ManagedObjectReference portgroup;

	public DistributedVirtualPortgroupInfo() {
	}

	public DistributedVirtualPortgroupInfo(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.String switchName, java.lang.String switchUuid,
			java.lang.String portgroupName, java.lang.String portgroupKey,
			java.lang.String portgroupType, boolean uplinkPortgroup,
			com.vmware.vim25.ManagedObjectReference portgroup) {
		super(dynamicType, dynamicProperty);
		this.switchName = switchName;
		this.switchUuid = switchUuid;
		this.portgroupName = portgroupName;
		this.portgroupKey = portgroupKey;
		this.portgroupType = portgroupType;
		this.uplinkPortgroup = uplinkPortgroup;
		this.portgroup = portgroup;
	}

	/**
	 * Gets the switchName value for this DistributedVirtualPortgroupInfo.
	 * 
	 * @return switchName
	 */
	public java.lang.String getSwitchName() {
		return switchName;
	}

	/**
	 * Sets the switchName value for this DistributedVirtualPortgroupInfo.
	 * 
	 * @param switchName
	 */
	public void setSwitchName(java.lang.String switchName) {
		this.switchName = switchName;
	}

	/**
	 * Gets the switchUuid value for this DistributedVirtualPortgroupInfo.
	 * 
	 * @return switchUuid
	 */
	public java.lang.String getSwitchUuid() {
		return switchUuid;
	}

	/**
	 * Sets the switchUuid value for this DistributedVirtualPortgroupInfo.
	 * 
	 * @param switchUuid
	 */
	public void setSwitchUuid(java.lang.String switchUuid) {
		this.switchUuid = switchUuid;
	}

	/**
	 * Gets the portgroupName value for this DistributedVirtualPortgroupInfo.
	 * 
	 * @return portgroupName
	 */
	public java.lang.String getPortgroupName() {
		return portgroupName;
	}

	/**
	 * Sets the portgroupName value for this DistributedVirtualPortgroupInfo.
	 * 
	 * @param portgroupName
	 */
	public void setPortgroupName(java.lang.String portgroupName) {
		this.portgroupName = portgroupName;
	}

	/**
	 * Gets the portgroupKey value for this DistributedVirtualPortgroupInfo.
	 * 
	 * @return portgroupKey
	 */
	public java.lang.String getPortgroupKey() {
		return portgroupKey;
	}

	/**
	 * Sets the portgroupKey value for this DistributedVirtualPortgroupInfo.
	 * 
	 * @param portgroupKey
	 */
	public void setPortgroupKey(java.lang.String portgroupKey) {
		this.portgroupKey = portgroupKey;
	}

	/**
	 * Gets the portgroupType value for this DistributedVirtualPortgroupInfo.
	 * 
	 * @return portgroupType
	 */
	public java.lang.String getPortgroupType() {
		return portgroupType;
	}

	/**
	 * Sets the portgroupType value for this DistributedVirtualPortgroupInfo.
	 * 
	 * @param portgroupType
	 */
	public void setPortgroupType(java.lang.String portgroupType) {
		this.portgroupType = portgroupType;
	}

	/**
	 * Gets the uplinkPortgroup value for this DistributedVirtualPortgroupInfo.
	 * 
	 * @return uplinkPortgroup
	 */
	public boolean isUplinkPortgroup() {
		return uplinkPortgroup;
	}

	/**
	 * Sets the uplinkPortgroup value for this DistributedVirtualPortgroupInfo.
	 * 
	 * @param uplinkPortgroup
	 */
	public void setUplinkPortgroup(boolean uplinkPortgroup) {
		this.uplinkPortgroup = uplinkPortgroup;
	}

	/**
	 * Gets the portgroup value for this DistributedVirtualPortgroupInfo.
	 * 
	 * @return portgroup
	 */
	public com.vmware.vim25.ManagedObjectReference getPortgroup() {
		return portgroup;
	}

	/**
	 * Sets the portgroup value for this DistributedVirtualPortgroupInfo.
	 * 
	 * @param portgroup
	 */
	public void setPortgroup(com.vmware.vim25.ManagedObjectReference portgroup) {
		this.portgroup = portgroup;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof DistributedVirtualPortgroupInfo)) {
			return false;
		}
		DistributedVirtualPortgroupInfo other = (DistributedVirtualPortgroupInfo) obj;
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
				&& ((this.switchName == null && other.getSwitchName() == null) || (this.switchName != null && this.switchName
						.equals(other.getSwitchName())))
				&& ((this.switchUuid == null && other.getSwitchUuid() == null) || (this.switchUuid != null && this.switchUuid
						.equals(other.getSwitchUuid())))
				&& ((this.portgroupName == null && other.getPortgroupName() == null) || (this.portgroupName != null && this.portgroupName
						.equals(other.getPortgroupName())))
				&& ((this.portgroupKey == null && other.getPortgroupKey() == null) || (this.portgroupKey != null && this.portgroupKey
						.equals(other.getPortgroupKey())))
				&& ((this.portgroupType == null && other.getPortgroupType() == null) || (this.portgroupType != null && this.portgroupType
						.equals(other.getPortgroupType())))
				&& this.uplinkPortgroup == other.isUplinkPortgroup()
				&& ((this.portgroup == null && other.getPortgroup() == null) || (this.portgroup != null && this.portgroup
						.equals(other.getPortgroup())));
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
		if (getSwitchName() != null) {
			_hashCode += getSwitchName().hashCode();
		}
		if (getSwitchUuid() != null) {
			_hashCode += getSwitchUuid().hashCode();
		}
		if (getPortgroupName() != null) {
			_hashCode += getPortgroupName().hashCode();
		}
		if (getPortgroupKey() != null) {
			_hashCode += getPortgroupKey().hashCode();
		}
		if (getPortgroupType() != null) {
			_hashCode += getPortgroupType().hashCode();
		}
		_hashCode += (isUplinkPortgroup() ? Boolean.TRUE : Boolean.FALSE)
				.hashCode();
		if (getPortgroup() != null) {
			_hashCode += getPortgroup().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			DistributedVirtualPortgroupInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"DistributedVirtualPortgroupInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("switchName");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"switchName"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("switchUuid");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"switchUuid"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("portgroupName");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"portgroupName"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("portgroupKey");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"portgroupKey"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("portgroupType");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"portgroupType"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("uplinkPortgroup");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"uplinkPortgroup"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("portgroup");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"portgroup"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
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
