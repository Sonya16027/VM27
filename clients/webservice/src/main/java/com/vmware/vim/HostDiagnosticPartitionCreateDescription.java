/**
 * HostDiagnosticPartitionCreateDescription.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class HostDiagnosticPartitionCreateDescription extends
		com.vmware.vim.DynamicData implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim.HostDiskPartitionLayout layout;

	private java.lang.String diskUuid;

	private com.vmware.vim.HostDiagnosticPartitionCreateSpec spec;

	public HostDiagnosticPartitionCreateDescription() {
	}

	public HostDiagnosticPartitionCreateDescription(
			java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty,
			com.vmware.vim.HostDiskPartitionLayout layout,
			java.lang.String diskUuid,
			com.vmware.vim.HostDiagnosticPartitionCreateSpec spec) {
		super(dynamicType, dynamicProperty);
		this.layout = layout;
		this.diskUuid = diskUuid;
		this.spec = spec;
	}

	/**
	 * Gets the layout value for this HostDiagnosticPartitionCreateDescription.
	 * 
	 * @return layout
	 */
	public com.vmware.vim.HostDiskPartitionLayout getLayout() {
		return layout;
	}

	/**
	 * Sets the layout value for this HostDiagnosticPartitionCreateDescription.
	 * 
	 * @param layout
	 */
	public void setLayout(com.vmware.vim.HostDiskPartitionLayout layout) {
		this.layout = layout;
	}

	/**
	 * Gets the diskUuid value for this
	 * HostDiagnosticPartitionCreateDescription.
	 * 
	 * @return diskUuid
	 */
	public java.lang.String getDiskUuid() {
		return diskUuid;
	}

	/**
	 * Sets the diskUuid value for this
	 * HostDiagnosticPartitionCreateDescription.
	 * 
	 * @param diskUuid
	 */
	public void setDiskUuid(java.lang.String diskUuid) {
		this.diskUuid = diskUuid;
	}

	/**
	 * Gets the spec value for this HostDiagnosticPartitionCreateDescription.
	 * 
	 * @return spec
	 */
	public com.vmware.vim.HostDiagnosticPartitionCreateSpec getSpec() {
		return spec;
	}

	/**
	 * Sets the spec value for this HostDiagnosticPartitionCreateDescription.
	 * 
	 * @param spec
	 */
	public void setSpec(com.vmware.vim.HostDiagnosticPartitionCreateSpec spec) {
		this.spec = spec;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof HostDiagnosticPartitionCreateDescription)) {
			return false;
		}
		HostDiagnosticPartitionCreateDescription other = (HostDiagnosticPartitionCreateDescription) obj;
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
				&& ((this.layout == null && other.getLayout() == null) || (this.layout != null && this.layout
						.equals(other.getLayout())))
				&& ((this.diskUuid == null && other.getDiskUuid() == null) || (this.diskUuid != null && this.diskUuid
						.equals(other.getDiskUuid())))
				&& ((this.spec == null && other.getSpec() == null) || (this.spec != null && this.spec
						.equals(other.getSpec())));
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
		if (getLayout() != null) {
			_hashCode += getLayout().hashCode();
		}
		if (getDiskUuid() != null) {
			_hashCode += getDiskUuid().hashCode();
		}
		if (getSpec() != null) {
			_hashCode += getSpec().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			HostDiagnosticPartitionCreateDescription.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"HostDiagnosticPartitionCreateDescription"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("layout");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim2", "layout"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"HostDiskPartitionLayout"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("diskUuid");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"diskUuid"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("spec");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "spec"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"HostDiagnosticPartitionCreateSpec"));
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
