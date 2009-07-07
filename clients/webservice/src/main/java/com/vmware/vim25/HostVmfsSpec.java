/**
 * HostVmfsSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostVmfsSpec  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private com.vmware.vim25.HostScsiDiskPartition extent;

    private java.lang.Integer blockSizeMb;

    private int majorVersion;

    private java.lang.String volumeName;

    public HostVmfsSpec() {
    }

    public HostVmfsSpec(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           com.vmware.vim25.HostScsiDiskPartition extent,
           java.lang.Integer blockSizeMb,
           int majorVersion,
           java.lang.String volumeName) {
        super(
            dynamicType,
            dynamicProperty);
        this.extent = extent;
        this.blockSizeMb = blockSizeMb;
        this.majorVersion = majorVersion;
        this.volumeName = volumeName;
    }


    /**
     * Gets the extent value for this HostVmfsSpec.
     * 
     * @return extent
     */
    public com.vmware.vim25.HostScsiDiskPartition getExtent() {
        return extent;
    }


    /**
     * Sets the extent value for this HostVmfsSpec.
     * 
     * @param extent
     */
    public void setExtent(com.vmware.vim25.HostScsiDiskPartition extent) {
        this.extent = extent;
    }


    /**
     * Gets the blockSizeMb value for this HostVmfsSpec.
     * 
     * @return blockSizeMb
     */
    public java.lang.Integer getBlockSizeMb() {
        return blockSizeMb;
    }


    /**
     * Sets the blockSizeMb value for this HostVmfsSpec.
     * 
     * @param blockSizeMb
     */
    public void setBlockSizeMb(java.lang.Integer blockSizeMb) {
        this.blockSizeMb = blockSizeMb;
    }


    /**
     * Gets the majorVersion value for this HostVmfsSpec.
     * 
     * @return majorVersion
     */
    public int getMajorVersion() {
        return majorVersion;
    }


    /**
     * Sets the majorVersion value for this HostVmfsSpec.
     * 
     * @param majorVersion
     */
    public void setMajorVersion(int majorVersion) {
        this.majorVersion = majorVersion;
    }


    /**
     * Gets the volumeName value for this HostVmfsSpec.
     * 
     * @return volumeName
     */
    public java.lang.String getVolumeName() {
        return volumeName;
    }


    /**
     * Sets the volumeName value for this HostVmfsSpec.
     * 
     * @param volumeName
     */
    public void setVolumeName(java.lang.String volumeName) {
        this.volumeName = volumeName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostVmfsSpec)) return false;
        HostVmfsSpec other = (HostVmfsSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.extent==null && other.getExtent()==null) || 
             (this.extent!=null &&
              this.extent.equals(other.getExtent()))) &&
            ((this.blockSizeMb==null && other.getBlockSizeMb()==null) || 
             (this.blockSizeMb!=null &&
              this.blockSizeMb.equals(other.getBlockSizeMb()))) &&
            this.majorVersion == other.getMajorVersion() &&
            ((this.volumeName==null && other.getVolumeName()==null) || 
             (this.volumeName!=null &&
              this.volumeName.equals(other.getVolumeName())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getExtent() != null) {
            _hashCode += getExtent().hashCode();
        }
        if (getBlockSizeMb() != null) {
            _hashCode += getBlockSizeMb().hashCode();
        }
        _hashCode += getMajorVersion();
        if (getVolumeName() != null) {
            _hashCode += getVolumeName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostVmfsSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostVmfsSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "extent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostScsiDiskPartition"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blockSizeMb");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "blockSizeMb"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("majorVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "majorVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("volumeName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "volumeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
