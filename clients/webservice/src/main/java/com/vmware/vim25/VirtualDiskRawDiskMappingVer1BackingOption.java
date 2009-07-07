/**
 * VirtualDiskRawDiskMappingVer1BackingOption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VirtualDiskRawDiskMappingVer1BackingOption  extends com.vmware.vim25.VirtualDeviceDeviceBackingOption  implements java.io.Serializable {
    private com.vmware.vim25.ChoiceOption descriptorFileNameExtensions;

    private com.vmware.vim25.ChoiceOption compatibilityMode;

    private com.vmware.vim25.ChoiceOption diskMode;

    private boolean uuid;

    public VirtualDiskRawDiskMappingVer1BackingOption() {
    }

    public VirtualDiskRawDiskMappingVer1BackingOption(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           java.lang.String type,
           com.vmware.vim25.BoolOption autoDetectAvailable,
           com.vmware.vim25.ChoiceOption descriptorFileNameExtensions,
           com.vmware.vim25.ChoiceOption compatibilityMode,
           com.vmware.vim25.ChoiceOption diskMode,
           boolean uuid) {
        super(
            dynamicType,
            dynamicProperty,
            type,
            autoDetectAvailable);
        this.descriptorFileNameExtensions = descriptorFileNameExtensions;
        this.compatibilityMode = compatibilityMode;
        this.diskMode = diskMode;
        this.uuid = uuid;
    }


    /**
     * Gets the descriptorFileNameExtensions value for this VirtualDiskRawDiskMappingVer1BackingOption.
     * 
     * @return descriptorFileNameExtensions
     */
    public com.vmware.vim25.ChoiceOption getDescriptorFileNameExtensions() {
        return descriptorFileNameExtensions;
    }


    /**
     * Sets the descriptorFileNameExtensions value for this VirtualDiskRawDiskMappingVer1BackingOption.
     * 
     * @param descriptorFileNameExtensions
     */
    public void setDescriptorFileNameExtensions(com.vmware.vim25.ChoiceOption descriptorFileNameExtensions) {
        this.descriptorFileNameExtensions = descriptorFileNameExtensions;
    }


    /**
     * Gets the compatibilityMode value for this VirtualDiskRawDiskMappingVer1BackingOption.
     * 
     * @return compatibilityMode
     */
    public com.vmware.vim25.ChoiceOption getCompatibilityMode() {
        return compatibilityMode;
    }


    /**
     * Sets the compatibilityMode value for this VirtualDiskRawDiskMappingVer1BackingOption.
     * 
     * @param compatibilityMode
     */
    public void setCompatibilityMode(com.vmware.vim25.ChoiceOption compatibilityMode) {
        this.compatibilityMode = compatibilityMode;
    }


    /**
     * Gets the diskMode value for this VirtualDiskRawDiskMappingVer1BackingOption.
     * 
     * @return diskMode
     */
    public com.vmware.vim25.ChoiceOption getDiskMode() {
        return diskMode;
    }


    /**
     * Sets the diskMode value for this VirtualDiskRawDiskMappingVer1BackingOption.
     * 
     * @param diskMode
     */
    public void setDiskMode(com.vmware.vim25.ChoiceOption diskMode) {
        this.diskMode = diskMode;
    }


    /**
     * Gets the uuid value for this VirtualDiskRawDiskMappingVer1BackingOption.
     * 
     * @return uuid
     */
    public boolean isUuid() {
        return uuid;
    }


    /**
     * Sets the uuid value for this VirtualDiskRawDiskMappingVer1BackingOption.
     * 
     * @param uuid
     */
    public void setUuid(boolean uuid) {
        this.uuid = uuid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualDiskRawDiskMappingVer1BackingOption)) return false;
        VirtualDiskRawDiskMappingVer1BackingOption other = (VirtualDiskRawDiskMappingVer1BackingOption) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.descriptorFileNameExtensions==null && other.getDescriptorFileNameExtensions()==null) || 
             (this.descriptorFileNameExtensions!=null &&
              this.descriptorFileNameExtensions.equals(other.getDescriptorFileNameExtensions()))) &&
            ((this.compatibilityMode==null && other.getCompatibilityMode()==null) || 
             (this.compatibilityMode!=null &&
              this.compatibilityMode.equals(other.getCompatibilityMode()))) &&
            ((this.diskMode==null && other.getDiskMode()==null) || 
             (this.diskMode!=null &&
              this.diskMode.equals(other.getDiskMode()))) &&
            this.uuid == other.isUuid();
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
        if (getDescriptorFileNameExtensions() != null) {
            _hashCode += getDescriptorFileNameExtensions().hashCode();
        }
        if (getCompatibilityMode() != null) {
            _hashCode += getCompatibilityMode().hashCode();
        }
        if (getDiskMode() != null) {
            _hashCode += getDiskMode().hashCode();
        }
        _hashCode += (isUuid() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualDiskRawDiskMappingVer1BackingOption.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualDiskRawDiskMappingVer1BackingOption"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descriptorFileNameExtensions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "descriptorFileNameExtensions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ChoiceOption"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("compatibilityMode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "compatibilityMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ChoiceOption"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diskMode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "diskMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ChoiceOption"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uuid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "uuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
