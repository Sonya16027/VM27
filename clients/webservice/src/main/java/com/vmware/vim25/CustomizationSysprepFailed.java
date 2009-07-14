/**
 * CustomizationSysprepFailed.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class CustomizationSysprepFailed extends
		com.vmware.vim25.CustomizationFailed implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String sysprepVersion;

	private java.lang.String systemVersion;

	public CustomizationSysprepFailed() {
	}

	public CustomizationSysprepFailed(java.lang.String dynamicType,
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
			boolean template, java.lang.String logLocation,
			java.lang.String sysprepVersion, java.lang.String systemVersion) {
		super(dynamicType, dynamicProperty, key, chainId, createdTime,
				userName, datacenter, computeResource, host, vm, ds, net, dvs,
				fullFormattedMessage, changeTag, template, logLocation);
		this.sysprepVersion = sysprepVersion;
		this.systemVersion = systemVersion;
	}

	/**
	 * Gets the sysprepVersion value for this CustomizationSysprepFailed.
	 * 
	 * @return sysprepVersion
	 */
	public java.lang.String getSysprepVersion() {
		return sysprepVersion;
	}

	/**
	 * Sets the sysprepVersion value for this CustomizationSysprepFailed.
	 * 
	 * @param sysprepVersion
	 */
	public void setSysprepVersion(java.lang.String sysprepVersion) {
		this.sysprepVersion = sysprepVersion;
	}

	/**
	 * Gets the systemVersion value for this CustomizationSysprepFailed.
	 * 
	 * @return systemVersion
	 */
	public java.lang.String getSystemVersion() {
		return systemVersion;
	}

	/**
	 * Sets the systemVersion value for this CustomizationSysprepFailed.
	 * 
	 * @param systemVersion
	 */
	public void setSystemVersion(java.lang.String systemVersion) {
		this.systemVersion = systemVersion;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof CustomizationSysprepFailed)) {
			return false;
		}
		CustomizationSysprepFailed other = (CustomizationSysprepFailed) obj;
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
				&& ((this.sysprepVersion == null && other.getSysprepVersion() == null) || (this.sysprepVersion != null && this.sysprepVersion
						.equals(other.getSysprepVersion())))
				&& ((this.systemVersion == null && other.getSystemVersion() == null) || (this.systemVersion != null && this.systemVersion
						.equals(other.getSystemVersion())));
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
		if (getSysprepVersion() != null) {
			_hashCode += getSysprepVersion().hashCode();
		}
		if (getSystemVersion() != null) {
			_hashCode += getSystemVersion().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			CustomizationSysprepFailed.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"CustomizationSysprepFailed"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("sysprepVersion");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"sysprepVersion"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("systemVersion");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"systemVersion"));
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
