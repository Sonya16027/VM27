/**
 * CustomizationSysprep.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class CustomizationSysprep  extends com.vmware.vim.CustomizationIdentitySettings  implements java.io.Serializable {
    private com.vmware.vim.CustomizationGuiUnattended guiUnattended;

    private com.vmware.vim.CustomizationUserData userData;

    private com.vmware.vim.CustomizationGuiRunOnce guiRunOnce;

    private com.vmware.vim.CustomizationIdentification identification;

    private com.vmware.vim.CustomizationLicenseFilePrintData licenseFilePrintData;

    public CustomizationSysprep() {
    }

    public CustomizationSysprep(
           java.lang.String dynamicType,
           com.vmware.vim.DynamicProperty[] dynamicProperty,
           com.vmware.vim.CustomizationGuiUnattended guiUnattended,
           com.vmware.vim.CustomizationUserData userData,
           com.vmware.vim.CustomizationGuiRunOnce guiRunOnce,
           com.vmware.vim.CustomizationIdentification identification,
           com.vmware.vim.CustomizationLicenseFilePrintData licenseFilePrintData) {
        super(
            dynamicType,
            dynamicProperty);
        this.guiUnattended = guiUnattended;
        this.userData = userData;
        this.guiRunOnce = guiRunOnce;
        this.identification = identification;
        this.licenseFilePrintData = licenseFilePrintData;
    }


    /**
     * Gets the guiUnattended value for this CustomizationSysprep.
     * 
     * @return guiUnattended
     */
    public com.vmware.vim.CustomizationGuiUnattended getGuiUnattended() {
        return guiUnattended;
    }


    /**
     * Sets the guiUnattended value for this CustomizationSysprep.
     * 
     * @param guiUnattended
     */
    public void setGuiUnattended(com.vmware.vim.CustomizationGuiUnattended guiUnattended) {
        this.guiUnattended = guiUnattended;
    }


    /**
     * Gets the userData value for this CustomizationSysprep.
     * 
     * @return userData
     */
    public com.vmware.vim.CustomizationUserData getUserData() {
        return userData;
    }


    /**
     * Sets the userData value for this CustomizationSysprep.
     * 
     * @param userData
     */
    public void setUserData(com.vmware.vim.CustomizationUserData userData) {
        this.userData = userData;
    }


    /**
     * Gets the guiRunOnce value for this CustomizationSysprep.
     * 
     * @return guiRunOnce
     */
    public com.vmware.vim.CustomizationGuiRunOnce getGuiRunOnce() {
        return guiRunOnce;
    }


    /**
     * Sets the guiRunOnce value for this CustomizationSysprep.
     * 
     * @param guiRunOnce
     */
    public void setGuiRunOnce(com.vmware.vim.CustomizationGuiRunOnce guiRunOnce) {
        this.guiRunOnce = guiRunOnce;
    }


    /**
     * Gets the identification value for this CustomizationSysprep.
     * 
     * @return identification
     */
    public com.vmware.vim.CustomizationIdentification getIdentification() {
        return identification;
    }


    /**
     * Sets the identification value for this CustomizationSysprep.
     * 
     * @param identification
     */
    public void setIdentification(com.vmware.vim.CustomizationIdentification identification) {
        this.identification = identification;
    }


    /**
     * Gets the licenseFilePrintData value for this CustomizationSysprep.
     * 
     * @return licenseFilePrintData
     */
    public com.vmware.vim.CustomizationLicenseFilePrintData getLicenseFilePrintData() {
        return licenseFilePrintData;
    }


    /**
     * Sets the licenseFilePrintData value for this CustomizationSysprep.
     * 
     * @param licenseFilePrintData
     */
    public void setLicenseFilePrintData(com.vmware.vim.CustomizationLicenseFilePrintData licenseFilePrintData) {
        this.licenseFilePrintData = licenseFilePrintData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomizationSysprep)) return false;
        CustomizationSysprep other = (CustomizationSysprep) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.guiUnattended==null && other.getGuiUnattended()==null) || 
             (this.guiUnattended!=null &&
              this.guiUnattended.equals(other.getGuiUnattended()))) &&
            ((this.userData==null && other.getUserData()==null) || 
             (this.userData!=null &&
              this.userData.equals(other.getUserData()))) &&
            ((this.guiRunOnce==null && other.getGuiRunOnce()==null) || 
             (this.guiRunOnce!=null &&
              this.guiRunOnce.equals(other.getGuiRunOnce()))) &&
            ((this.identification==null && other.getIdentification()==null) || 
             (this.identification!=null &&
              this.identification.equals(other.getIdentification()))) &&
            ((this.licenseFilePrintData==null && other.getLicenseFilePrintData()==null) || 
             (this.licenseFilePrintData!=null &&
              this.licenseFilePrintData.equals(other.getLicenseFilePrintData())));
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
        if (getGuiUnattended() != null) {
            _hashCode += getGuiUnattended().hashCode();
        }
        if (getUserData() != null) {
            _hashCode += getUserData().hashCode();
        }
        if (getGuiRunOnce() != null) {
            _hashCode += getGuiRunOnce().hashCode();
        }
        if (getIdentification() != null) {
            _hashCode += getIdentification().hashCode();
        }
        if (getLicenseFilePrintData() != null) {
            _hashCode += getLicenseFilePrintData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomizationSysprep.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "CustomizationSysprep"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("guiUnattended");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "guiUnattended"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "CustomizationGuiUnattended"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userData");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "userData"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "CustomizationUserData"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("guiRunOnce");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "guiRunOnce"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "CustomizationGuiRunOnce"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identification");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "identification"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "CustomizationIdentification"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("licenseFilePrintData");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "licenseFilePrintData"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "CustomizationLicenseFilePrintData"));
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
