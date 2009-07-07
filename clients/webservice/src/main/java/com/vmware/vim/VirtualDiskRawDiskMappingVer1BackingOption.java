/**
 * VirtualDiskRawDiskMappingVer1BackingOption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class VirtualDiskRawDiskMappingVer1BackingOption  extends com.vmware.vim.VirtualDeviceDeviceBackingOption  implements java.io.Serializable {
    private com.vmware.vim.ChoiceOption descriptorFileNameExtensions;

    private com.vmware.vim.ChoiceOption compatibilityMode;

    private com.vmware.vim.ChoiceOption diskMode;

    public VirtualDiskRawDiskMappingVer1BackingOption() {
    }

    public VirtualDiskRawDiskMappingVer1BackingOption(
           java.lang.String dynamicType,
           com.vmware.vim.DynamicProperty[] dynamicProperty,
           java.lang.String type,
           com.vmware.vim.ChoiceOption descriptorFileNameExtensions,
           com.vmware.vim.ChoiceOption compatibilityMode,
           com.vmware.vim.ChoiceOption diskMode) {
        super(
            dynamicType,
            dynamicProperty,
            type);
        this.descriptorFileNameExtensions = descriptorFileNameExtensions;
        this.compatibilityMode = compatibilityMode;
        this.diskMode = diskMode;
    }


    /**
     * Gets the descriptorFileNameExtensions value for this VirtualDiskRawDiskMappingVer1BackingOption.
     * 
     * @return descriptorFileNameExtensions
     */
    public com.vmware.vim.ChoiceOption getDescriptorFileNameExtensions() {
        return descriptorFileNameExtensions;
    }


    /**
     * Sets the descriptorFileNameExtensions value for this VirtualDiskRawDiskMappingVer1BackingOption.
     * 
     * @param descriptorFileNameExtensions
     */
    public void setDescriptorFileNameExtensions(com.vmware.vim.ChoiceOption descriptorFileNameExtensions) {
        this.descriptorFileNameExtensions = descriptorFileNameExtensions;
    }


    /**
     * Gets the compatibilityMode value for this VirtualDiskRawDiskMappingVer1BackingOption.
     * 
     * @return compatibilityMode
     */
    public com.vmware.vim.ChoiceOption getCompatibilityMode() {
        return compatibilityMode;
    }


    /**
     * Sets the compatibilityMode value for this VirtualDiskRawDiskMappingVer1BackingOption.
     * 
     * @param compatibilityMode
     */
    public void setCompatibilityMode(com.vmware.vim.ChoiceOption compatibilityMode) {
        this.compatibilityMode = compatibilityMode;
    }


    /**
     * Gets the diskMode value for this VirtualDiskRawDiskMappingVer1BackingOption.
     * 
     * @return diskMode
     */
    public com.vmware.vim.ChoiceOption getDiskMode() {
        return diskMode;
    }


    /**
     * Sets the diskMode value for this VirtualDiskRawDiskMappingVer1BackingOption.
     * 
     * @param diskMode
     */
    public void setDiskMode(com.vmware.vim.ChoiceOption diskMode) {
        this.diskMode = diskMode;
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
              this.diskMode.equals(other.getDiskMode())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualDiskRawDiskMappingVer1BackingOption.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "VirtualDiskRawDiskMappingVer1BackingOption"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descriptorFileNameExtensions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "descriptorFileNameExtensions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "ChoiceOption"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("compatibilityMode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "compatibilityMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "ChoiceOption"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diskMode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "diskMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "ChoiceOption"));
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
