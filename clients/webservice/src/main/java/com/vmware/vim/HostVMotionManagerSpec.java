/**
 * HostVMotionManagerSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class HostVMotionManagerSpec extends com.vmware.vim.DynamicData
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private long migrationId;

	private java.lang.String srcIp;

	private java.lang.String dstIp;

	private java.lang.String srcUuid;

	private java.lang.String dstUuid;

	private com.vmware.vim.VirtualMachineMovePriority priority;

	public HostVMotionManagerSpec() {
	}

	public HostVMotionManagerSpec(java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty, long migrationId,
			java.lang.String srcIp, java.lang.String dstIp,
			java.lang.String srcUuid, java.lang.String dstUuid,
			com.vmware.vim.VirtualMachineMovePriority priority) {
		super(dynamicType, dynamicProperty);
		this.migrationId = migrationId;
		this.srcIp = srcIp;
		this.dstIp = dstIp;
		this.srcUuid = srcUuid;
		this.dstUuid = dstUuid;
		this.priority = priority;
	}

	/**
	 * Gets the migrationId value for this HostVMotionManagerSpec.
	 * 
	 * @return migrationId
	 */
	public long getMigrationId() {
		return migrationId;
	}

	/**
	 * Sets the migrationId value for this HostVMotionManagerSpec.
	 * 
	 * @param migrationId
	 */
	public void setMigrationId(long migrationId) {
		this.migrationId = migrationId;
	}

	/**
	 * Gets the srcIp value for this HostVMotionManagerSpec.
	 * 
	 * @return srcIp
	 */
	public java.lang.String getSrcIp() {
		return srcIp;
	}

	/**
	 * Sets the srcIp value for this HostVMotionManagerSpec.
	 * 
	 * @param srcIp
	 */
	public void setSrcIp(java.lang.String srcIp) {
		this.srcIp = srcIp;
	}

	/**
	 * Gets the dstIp value for this HostVMotionManagerSpec.
	 * 
	 * @return dstIp
	 */
	public java.lang.String getDstIp() {
		return dstIp;
	}

	/**
	 * Sets the dstIp value for this HostVMotionManagerSpec.
	 * 
	 * @param dstIp
	 */
	public void setDstIp(java.lang.String dstIp) {
		this.dstIp = dstIp;
	}

	/**
	 * Gets the srcUuid value for this HostVMotionManagerSpec.
	 * 
	 * @return srcUuid
	 */
	public java.lang.String getSrcUuid() {
		return srcUuid;
	}

	/**
	 * Sets the srcUuid value for this HostVMotionManagerSpec.
	 * 
	 * @param srcUuid
	 */
	public void setSrcUuid(java.lang.String srcUuid) {
		this.srcUuid = srcUuid;
	}

	/**
	 * Gets the dstUuid value for this HostVMotionManagerSpec.
	 * 
	 * @return dstUuid
	 */
	public java.lang.String getDstUuid() {
		return dstUuid;
	}

	/**
	 * Sets the dstUuid value for this HostVMotionManagerSpec.
	 * 
	 * @param dstUuid
	 */
	public void setDstUuid(java.lang.String dstUuid) {
		this.dstUuid = dstUuid;
	}

	/**
	 * Gets the priority value for this HostVMotionManagerSpec.
	 * 
	 * @return priority
	 */
	public com.vmware.vim.VirtualMachineMovePriority getPriority() {
		return priority;
	}

	/**
	 * Sets the priority value for this HostVMotionManagerSpec.
	 * 
	 * @param priority
	 */
	public void setPriority(com.vmware.vim.VirtualMachineMovePriority priority) {
		this.priority = priority;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof HostVMotionManagerSpec)) {
			return false;
		}
		HostVMotionManagerSpec other = (HostVMotionManagerSpec) obj;
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
				&& this.migrationId == other.getMigrationId()
				&& ((this.srcIp == null && other.getSrcIp() == null) || (this.srcIp != null && this.srcIp
						.equals(other.getSrcIp())))
				&& ((this.dstIp == null && other.getDstIp() == null) || (this.dstIp != null && this.dstIp
						.equals(other.getDstIp())))
				&& ((this.srcUuid == null && other.getSrcUuid() == null) || (this.srcUuid != null && this.srcUuid
						.equals(other.getSrcUuid())))
				&& ((this.dstUuid == null && other.getDstUuid() == null) || (this.dstUuid != null && this.dstUuid
						.equals(other.getDstUuid())))
				&& ((this.priority == null && other.getPriority() == null) || (this.priority != null && this.priority
						.equals(other.getPriority())));
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
		_hashCode += new Long(getMigrationId()).hashCode();
		if (getSrcIp() != null) {
			_hashCode += getSrcIp().hashCode();
		}
		if (getDstIp() != null) {
			_hashCode += getDstIp().hashCode();
		}
		if (getSrcUuid() != null) {
			_hashCode += getSrcUuid().hashCode();
		}
		if (getDstUuid() != null) {
			_hashCode += getDstUuid().hashCode();
		}
		if (getPriority() != null) {
			_hashCode += getPriority().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			HostVMotionManagerSpec.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"HostVMotionManagerSpec"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("migrationId");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"migrationId"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "long"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("srcIp");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim2", "srcIp"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("dstIp");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim2", "dstIp"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("srcUuid");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"srcUuid"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("dstUuid");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"dstUuid"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("priority");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"priority"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"VirtualMachineMovePriority"));
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
