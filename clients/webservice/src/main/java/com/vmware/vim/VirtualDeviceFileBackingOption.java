/**
 * VirtualDeviceFileBackingOption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class VirtualDeviceFileBackingOption  extends com.vmware.vim.VirtualDeviceBackingOption  implements java.io.Serializable {
    private com.vmware.vim.ChoiceOption fileNameExtensions;

    public VirtualDeviceFileBackingOption() {
    }

    public VirtualDeviceFileBackingOption(
           java.lang.String dynamicType,
           com.vmware.vim.DynamicProperty[] dynamicProperty,
           java.lang.String type,
           com.vmware.vim.ChoiceOption fileNameExtensions) {
        super(
            dynamicType,
            dynamicProperty,
            type);
        this.fileNameExtensions = fileNameExtensions;
    }


    /**
     * Gets the fileNameExtensions value for this VirtualDeviceFileBackingOption.
     * 
     * @return fileNameExtensions
     */
    public com.vmware.vim.ChoiceOption getFileNameExtensions() {
        return fileNameExtensions;
    }


    /**
     * Sets the fileNameExtensions value for this VirtualDeviceFileBackingOption.
     * 
     * @param fileNameExtensions
     */
    public void setFileNameExtensions(com.vmware.vim.ChoiceOption fileNameExtensions) {
        this.fileNameExtensions = fileNameExtensions;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualDeviceFileBackingOption)) return false;
        VirtualDeviceFileBackingOption other = (VirtualDeviceFileBackingOption) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.fileNameExtensions==null && other.getFileNameExtensions()==null) || 
             (this.fileNameExtensions!=null &&
              this.fileNameExtensions.equals(other.getFileNameExtensions())));
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
        if (getFileNameExtensions() != null) {
            _hashCode += getFileNameExtensions().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualDeviceFileBackingOption.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "VirtualDeviceFileBackingOption"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileNameExtensions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "fileNameExtensions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "ChoiceOption"));
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
