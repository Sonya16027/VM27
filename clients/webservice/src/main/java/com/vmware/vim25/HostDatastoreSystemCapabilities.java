/**
 * HostDatastoreSystemCapabilities.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostDatastoreSystemCapabilities extends
		com.vmware.vim25.DynamicData implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private boolean nfsMountCreationRequired;

	private boolean nfsMountCreationSupported;

	private boolean localDatastoreSupported;

	private java.lang.Boolean vmfsExtentExpansionSupported;

	public HostDatastoreSystemCapabilities() {
	}

	public HostDatastoreSystemCapabilities(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			boolean nfsMountCreationRequired,
			boolean nfsMountCreationSupported, boolean localDatastoreSupported,
			java.lang.Boolean vmfsExtentExpansionSupported) {
		super(dynamicType, dynamicProperty);
		this.nfsMountCreationRequired = nfsMountCreationRequired;
		this.nfsMountCreationSupported = nfsMountCreationSupported;
		this.localDatastoreSupported = localDatastoreSupported;
		this.vmfsExtentExpansionSupported = vmfsExtentExpansionSupported;
	}

	/**
	 * Gets the nfsMountCreationRequired value for this
	 * HostDatastoreSystemCapabilities.
	 * 
	 * @return nfsMountCreationRequired
	 */
	public boolean isNfsMountCreationRequired() {
		return nfsMountCreationRequired;
	}

	/**
	 * Sets the nfsMountCreationRequired value for this
	 * HostDatastoreSystemCapabilities.
	 * 
	 * @param nfsMountCreationRequired
	 */
	public void setNfsMountCreationRequired(boolean nfsMountCreationRequired) {
		this.nfsMountCreationRequired = nfsMountCreationRequired;
	}

	/**
	 * Gets the nfsMountCreationSupported value for this
	 * HostDatastoreSystemCapabilities.
	 * 
	 * @return nfsMountCreationSupported
	 */
	public boolean isNfsMountCreationSupported() {
		return nfsMountCreationSupported;
	}

	/**
	 * Sets the nfsMountCreationSupported value for this
	 * HostDatastoreSystemCapabilities.
	 * 
	 * @param nfsMountCreationSupported
	 */
	public void setNfsMountCreationSupported(boolean nfsMountCreationSupported) {
		this.nfsMountCreationSupported = nfsMountCreationSupported;
	}

	/**
	 * Gets the localDatastoreSupported value for this
	 * HostDatastoreSystemCapabilities.
	 * 
	 * @return localDatastoreSupported
	 */
	public boolean isLocalDatastoreSupported() {
		return localDatastoreSupported;
	}

	/**
	 * Sets the localDatastoreSupported value for this
	 * HostDatastoreSystemCapabilities.
	 * 
	 * @param localDatastoreSupported
	 */
	public void setLocalDatastoreSupported(boolean localDatastoreSupported) {
		this.localDatastoreSupported = localDatastoreSupported;
	}

	/**
	 * Gets the vmfsExtentExpansionSupported value for this
	 * HostDatastoreSystemCapabilities.
	 * 
	 * @return vmfsExtentExpansionSupported
	 */
	public java.lang.Boolean getVmfsExtentExpansionSupported() {
		return vmfsExtentExpansionSupported;
	}

	/**
	 * Sets the vmfsExtentExpansionSupported value for this
	 * HostDatastoreSystemCapabilities.
	 * 
	 * @param vmfsExtentExpansionSupported
	 */
	public void setVmfsExtentExpansionSupported(
			java.lang.Boolean vmfsExtentExpansionSupported) {
		this.vmfsExtentExpansionSupported = vmfsExtentExpansionSupported;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof HostDatastoreSystemCapabilities)) {
			return false;
		}
		HostDatastoreSystemCapabilities other = (HostDatastoreSystemCapabilities) obj;
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
				&& this.nfsMountCreationRequired == other
						.isNfsMountCreationRequired()
				&& this.nfsMountCreationSupported == other
						.isNfsMountCreationSupported()
				&& this.localDatastoreSupported == other
						.isLocalDatastoreSupported()
				&& ((this.vmfsExtentExpansionSupported == null && other
						.getVmfsExtentExpansionSupported() == null) || (this.vmfsExtentExpansionSupported != null && this.vmfsExtentExpansionSupported
						.equals(other.getVmfsExtentExpansionSupported())));
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
		_hashCode += (isNfsMountCreationRequired() ? Boolean.TRUE
				: Boolean.FALSE).hashCode();
		_hashCode += (isNfsMountCreationSupported() ? Boolean.TRUE
				: Boolean.FALSE).hashCode();
		_hashCode += (isLocalDatastoreSupported() ? Boolean.TRUE
				: Boolean.FALSE).hashCode();
		if (getVmfsExtentExpansionSupported() != null) {
			_hashCode += getVmfsExtentExpansionSupported().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			HostDatastoreSystemCapabilities.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostDatastoreSystemCapabilities"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("nfsMountCreationRequired");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"nfsMountCreationRequired"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("nfsMountCreationSupported");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"nfsMountCreationSupported"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("localDatastoreSupported");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"localDatastoreSupported"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("vmfsExtentExpansionSupported");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"vmfsExtentExpansionSupported"));
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
