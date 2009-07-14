/**
 * VmFaultToleranceInvalidFileBacking.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VmFaultToleranceInvalidFileBacking extends
		com.vmware.vim25.VmFaultToleranceIssue implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String backingType;

	private java.lang.String backingFilename;

	public VmFaultToleranceInvalidFileBacking() {
	}

	public VmFaultToleranceInvalidFileBacking(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			com.vmware.vim25.LocalizedMethodFault faultCause,
			com.vmware.vim25.LocalizableMessage[] faultMessage,
			java.lang.String backingType, java.lang.String backingFilename) {
		super(dynamicType, dynamicProperty, faultCause, faultMessage);
		this.backingType = backingType;
		this.backingFilename = backingFilename;
	}

	/**
	 * Gets the backingType value for this VmFaultToleranceInvalidFileBacking.
	 * 
	 * @return backingType
	 */
	public java.lang.String getBackingType() {
		return backingType;
	}

	/**
	 * Sets the backingType value for this VmFaultToleranceInvalidFileBacking.
	 * 
	 * @param backingType
	 */
	public void setBackingType(java.lang.String backingType) {
		this.backingType = backingType;
	}

	/**
	 * Gets the backingFilename value for this
	 * VmFaultToleranceInvalidFileBacking.
	 * 
	 * @return backingFilename
	 */
	public java.lang.String getBackingFilename() {
		return backingFilename;
	}

	/**
	 * Sets the backingFilename value for this
	 * VmFaultToleranceInvalidFileBacking.
	 * 
	 * @param backingFilename
	 */
	public void setBackingFilename(java.lang.String backingFilename) {
		this.backingFilename = backingFilename;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof VmFaultToleranceInvalidFileBacking)) {
			return false;
		}
		VmFaultToleranceInvalidFileBacking other = (VmFaultToleranceInvalidFileBacking) obj;
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
				&& ((this.backingType == null && other.getBackingType() == null) || (this.backingType != null && this.backingType
						.equals(other.getBackingType())))
				&& ((this.backingFilename == null && other.getBackingFilename() == null) || (this.backingFilename != null && this.backingFilename
						.equals(other.getBackingFilename())));
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
		if (getBackingType() != null) {
			_hashCode += getBackingType().hashCode();
		}
		if (getBackingFilename() != null) {
			_hashCode += getBackingFilename().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			VmFaultToleranceInvalidFileBacking.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VmFaultToleranceInvalidFileBacking"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("backingType");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"backingType"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("backingFilename");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"backingFilename"));
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

	/**
	 * Writes the exception data to the faultDetails
	 */
	@Override
	public void writeDetails(javax.xml.namespace.QName qname,
			org.apache.axis.encoding.SerializationContext context)
			throws java.io.IOException {
		context.serialize(qname, null, this);
	}
}
