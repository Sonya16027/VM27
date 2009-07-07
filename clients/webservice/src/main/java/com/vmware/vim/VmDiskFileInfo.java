/**
 * VmDiskFileInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class VmDiskFileInfo  extends com.vmware.vim.FileInfo  implements java.io.Serializable {
    private java.lang.String diskType;

    private java.lang.Long capacityKb;

    private java.lang.Integer hardwareVersion;

    public VmDiskFileInfo() {
    }

    public VmDiskFileInfo(
           java.lang.String dynamicType,
           com.vmware.vim.DynamicProperty[] dynamicProperty,
           java.lang.String path,
           java.lang.Long fileSize,
           java.util.Calendar modification,
           java.lang.String diskType,
           java.lang.Long capacityKb,
           java.lang.Integer hardwareVersion) {
        super(
            dynamicType,
            dynamicProperty,
            path,
            fileSize,
            modification);
        this.diskType = diskType;
        this.capacityKb = capacityKb;
        this.hardwareVersion = hardwareVersion;
    }


    /**
     * Gets the diskType value for this VmDiskFileInfo.
     * 
     * @return diskType
     */
    public java.lang.String getDiskType() {
        return diskType;
    }


    /**
     * Sets the diskType value for this VmDiskFileInfo.
     * 
     * @param diskType
     */
    public void setDiskType(java.lang.String diskType) {
        this.diskType = diskType;
    }


    /**
     * Gets the capacityKb value for this VmDiskFileInfo.
     * 
     * @return capacityKb
     */
    public java.lang.Long getCapacityKb() {
        return capacityKb;
    }


    /**
     * Sets the capacityKb value for this VmDiskFileInfo.
     * 
     * @param capacityKb
     */
    public void setCapacityKb(java.lang.Long capacityKb) {
        this.capacityKb = capacityKb;
    }


    /**
     * Gets the hardwareVersion value for this VmDiskFileInfo.
     * 
     * @return hardwareVersion
     */
    public java.lang.Integer getHardwareVersion() {
        return hardwareVersion;
    }


    /**
     * Sets the hardwareVersion value for this VmDiskFileInfo.
     * 
     * @param hardwareVersion
     */
    public void setHardwareVersion(java.lang.Integer hardwareVersion) {
        this.hardwareVersion = hardwareVersion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VmDiskFileInfo)) return false;
        VmDiskFileInfo other = (VmDiskFileInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.diskType==null && other.getDiskType()==null) || 
             (this.diskType!=null &&
              this.diskType.equals(other.getDiskType()))) &&
            ((this.capacityKb==null && other.getCapacityKb()==null) || 
             (this.capacityKb!=null &&
              this.capacityKb.equals(other.getCapacityKb()))) &&
            ((this.hardwareVersion==null && other.getHardwareVersion()==null) || 
             (this.hardwareVersion!=null &&
              this.hardwareVersion.equals(other.getHardwareVersion())));
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
        if (getDiskType() != null) {
            _hashCode += getDiskType().hashCode();
        }
        if (getCapacityKb() != null) {
            _hashCode += getCapacityKb().hashCode();
        }
        if (getHardwareVersion() != null) {
            _hashCode += getHardwareVersion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VmDiskFileInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "VmDiskFileInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diskType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "diskType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capacityKb");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "capacityKb"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hardwareVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "hardwareVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
