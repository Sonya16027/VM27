/**
 * DistributedVirtualSwitchHostProductSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class DistributedVirtualSwitchHostProductSpec extends
		com.vmware.vim25.DynamicData implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String productLineId;

	private java.lang.String version;

	public DistributedVirtualSwitchHostProductSpec() {
	}

	public DistributedVirtualSwitchHostProductSpec(
			java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.String productLineId, java.lang.String version) {
		super(dynamicType, dynamicProperty);
		this.productLineId = productLineId;
		this.version = version;
	}

	/**
	 * Gets the productLineId value for this
	 * DistributedVirtualSwitchHostProductSpec.
	 * 
	 * @return productLineId
	 */
	public java.lang.String getProductLineId() {
		return productLineId;
	}

	/**
	 * Sets the productLineId value for this
	 * DistributedVirtualSwitchHostProductSpec.
	 * 
	 * @param productLineId
	 */
	public void setProductLineId(java.lang.String productLineId) {
		this.productLineId = productLineId;
	}

	/**
	 * Gets the version value for this DistributedVirtualSwitchHostProductSpec.
	 * 
	 * @return version
	 */
	public java.lang.String getVersion() {
		return version;
	}

	/**
	 * Sets the version value for this DistributedVirtualSwitchHostProductSpec.
	 * 
	 * @param version
	 */
	public void setVersion(java.lang.String version) {
		this.version = version;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof DistributedVirtualSwitchHostProductSpec)) {
			return false;
		}
		DistributedVirtualSwitchHostProductSpec other = (DistributedVirtualSwitchHostProductSpec) obj;
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
				&& ((this.productLineId == null && other.getProductLineId() == null) || (this.productLineId != null && this.productLineId
						.equals(other.getProductLineId())))
				&& ((this.version == null && other.getVersion() == null) || (this.version != null && this.version
						.equals(other.getVersion())));
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
		if (getProductLineId() != null) {
			_hashCode += getProductLineId().hashCode();
		}
		if (getVersion() != null) {
			_hashCode += getVersion().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			DistributedVirtualSwitchHostProductSpec.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"DistributedVirtualSwitchHostProductSpec"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("productLineId");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"productLineId"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("version");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"version"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
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
