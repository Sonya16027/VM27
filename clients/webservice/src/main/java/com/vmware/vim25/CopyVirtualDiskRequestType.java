/**
 * CopyVirtualDiskRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class CopyVirtualDiskRequestType implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.ManagedObjectReference _this;

	private java.lang.String sourceName;

	private com.vmware.vim25.ManagedObjectReference sourceDatacenter;

	private java.lang.String destName;

	private com.vmware.vim25.ManagedObjectReference destDatacenter;

	private com.vmware.vim25.VirtualDiskSpec destSpec;

	private java.lang.Boolean force;

	public CopyVirtualDiskRequestType() {
	}

	public CopyVirtualDiskRequestType(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String sourceName,
			com.vmware.vim25.ManagedObjectReference sourceDatacenter,
			java.lang.String destName,
			com.vmware.vim25.ManagedObjectReference destDatacenter,
			com.vmware.vim25.VirtualDiskSpec destSpec, java.lang.Boolean force) {
		this._this = _this;
		this.sourceName = sourceName;
		this.sourceDatacenter = sourceDatacenter;
		this.destName = destName;
		this.destDatacenter = destDatacenter;
		this.destSpec = destSpec;
		this.force = force;
	}

	/**
	 * Gets the _this value for this CopyVirtualDiskRequestType.
	 * 
	 * @return _this
	 */
	public com.vmware.vim25.ManagedObjectReference get_this() {
		return _this;
	}

	/**
	 * Sets the _this value for this CopyVirtualDiskRequestType.
	 * 
	 * @param _this
	 */
	public void set_this(com.vmware.vim25.ManagedObjectReference _this) {
		this._this = _this;
	}

	/**
	 * Gets the sourceName value for this CopyVirtualDiskRequestType.
	 * 
	 * @return sourceName
	 */
	public java.lang.String getSourceName() {
		return sourceName;
	}

	/**
	 * Sets the sourceName value for this CopyVirtualDiskRequestType.
	 * 
	 * @param sourceName
	 */
	public void setSourceName(java.lang.String sourceName) {
		this.sourceName = sourceName;
	}

	/**
	 * Gets the sourceDatacenter value for this CopyVirtualDiskRequestType.
	 * 
	 * @return sourceDatacenter
	 */
	public com.vmware.vim25.ManagedObjectReference getSourceDatacenter() {
		return sourceDatacenter;
	}

	/**
	 * Sets the sourceDatacenter value for this CopyVirtualDiskRequestType.
	 * 
	 * @param sourceDatacenter
	 */
	public void setSourceDatacenter(
			com.vmware.vim25.ManagedObjectReference sourceDatacenter) {
		this.sourceDatacenter = sourceDatacenter;
	}

	/**
	 * Gets the destName value for this CopyVirtualDiskRequestType.
	 * 
	 * @return destName
	 */
	public java.lang.String getDestName() {
		return destName;
	}

	/**
	 * Sets the destName value for this CopyVirtualDiskRequestType.
	 * 
	 * @param destName
	 */
	public void setDestName(java.lang.String destName) {
		this.destName = destName;
	}

	/**
	 * Gets the destDatacenter value for this CopyVirtualDiskRequestType.
	 * 
	 * @return destDatacenter
	 */
	public com.vmware.vim25.ManagedObjectReference getDestDatacenter() {
		return destDatacenter;
	}

	/**
	 * Sets the destDatacenter value for this CopyVirtualDiskRequestType.
	 * 
	 * @param destDatacenter
	 */
	public void setDestDatacenter(
			com.vmware.vim25.ManagedObjectReference destDatacenter) {
		this.destDatacenter = destDatacenter;
	}

	/**
	 * Gets the destSpec value for this CopyVirtualDiskRequestType.
	 * 
	 * @return destSpec
	 */
	public com.vmware.vim25.VirtualDiskSpec getDestSpec() {
		return destSpec;
	}

	/**
	 * Sets the destSpec value for this CopyVirtualDiskRequestType.
	 * 
	 * @param destSpec
	 */
	public void setDestSpec(com.vmware.vim25.VirtualDiskSpec destSpec) {
		this.destSpec = destSpec;
	}

	/**
	 * Gets the force value for this CopyVirtualDiskRequestType.
	 * 
	 * @return force
	 */
	public java.lang.Boolean getForce() {
		return force;
	}

	/**
	 * Sets the force value for this CopyVirtualDiskRequestType.
	 * 
	 * @param force
	 */
	public void setForce(java.lang.Boolean force) {
		this.force = force;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof CopyVirtualDiskRequestType)) {
			return false;
		}
		CopyVirtualDiskRequestType other = (CopyVirtualDiskRequestType) obj;
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
		_equals = true
				&& ((this._this == null && other.get_this() == null) || (this._this != null && this._this
						.equals(other.get_this())))
				&& ((this.sourceName == null && other.getSourceName() == null) || (this.sourceName != null && this.sourceName
						.equals(other.getSourceName())))
				&& ((this.sourceDatacenter == null && other
						.getSourceDatacenter() == null) || (this.sourceDatacenter != null && this.sourceDatacenter
						.equals(other.getSourceDatacenter())))
				&& ((this.destName == null && other.getDestName() == null) || (this.destName != null && this.destName
						.equals(other.getDestName())))
				&& ((this.destDatacenter == null && other.getDestDatacenter() == null) || (this.destDatacenter != null && this.destDatacenter
						.equals(other.getDestDatacenter())))
				&& ((this.destSpec == null && other.getDestSpec() == null) || (this.destSpec != null && this.destSpec
						.equals(other.getDestSpec())))
				&& ((this.force == null && other.getForce() == null) || (this.force != null && this.force
						.equals(other.getForce())));
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
		int _hashCode = 1;
		if (get_this() != null) {
			_hashCode += get_this().hashCode();
		}
		if (getSourceName() != null) {
			_hashCode += getSourceName().hashCode();
		}
		if (getSourceDatacenter() != null) {
			_hashCode += getSourceDatacenter().hashCode();
		}
		if (getDestName() != null) {
			_hashCode += getDestName().hashCode();
		}
		if (getDestDatacenter() != null) {
			_hashCode += getDestDatacenter().hashCode();
		}
		if (getDestSpec() != null) {
			_hashCode += getDestSpec().hashCode();
		}
		if (getForce() != null) {
			_hashCode += getForce().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			CopyVirtualDiskRequestType.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"CopyVirtualDiskRequestType"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("_this");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "_this"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("sourceName");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"sourceName"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("sourceDatacenter");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"sourceDatacenter"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("destName");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"destName"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("destDatacenter");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"destDatacenter"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("destSpec");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"destSpec"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VirtualDiskSpec"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("force");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "force"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
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
