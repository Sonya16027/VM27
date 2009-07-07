/**
 * VirtualMachineFlagInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class VirtualMachineFlagInfo  extends com.vmware.vim.DynamicData  implements java.io.Serializable {
    private java.lang.Boolean disableAcceleration;

    private java.lang.Boolean enableLogging;

    private java.lang.Boolean useToe;

    private java.lang.Boolean runWithDebugInfo;

    private java.lang.String htSharing;

    public VirtualMachineFlagInfo() {
    }

    public VirtualMachineFlagInfo(
           java.lang.String dynamicType,
           com.vmware.vim.DynamicProperty[] dynamicProperty,
           java.lang.Boolean disableAcceleration,
           java.lang.Boolean enableLogging,
           java.lang.Boolean useToe,
           java.lang.Boolean runWithDebugInfo,
           java.lang.String htSharing) {
        super(
            dynamicType,
            dynamicProperty);
        this.disableAcceleration = disableAcceleration;
        this.enableLogging = enableLogging;
        this.useToe = useToe;
        this.runWithDebugInfo = runWithDebugInfo;
        this.htSharing = htSharing;
    }


    /**
     * Gets the disableAcceleration value for this VirtualMachineFlagInfo.
     * 
     * @return disableAcceleration
     */
    public java.lang.Boolean getDisableAcceleration() {
        return disableAcceleration;
    }


    /**
     * Sets the disableAcceleration value for this VirtualMachineFlagInfo.
     * 
     * @param disableAcceleration
     */
    public void setDisableAcceleration(java.lang.Boolean disableAcceleration) {
        this.disableAcceleration = disableAcceleration;
    }


    /**
     * Gets the enableLogging value for this VirtualMachineFlagInfo.
     * 
     * @return enableLogging
     */
    public java.lang.Boolean getEnableLogging() {
        return enableLogging;
    }


    /**
     * Sets the enableLogging value for this VirtualMachineFlagInfo.
     * 
     * @param enableLogging
     */
    public void setEnableLogging(java.lang.Boolean enableLogging) {
        this.enableLogging = enableLogging;
    }


    /**
     * Gets the useToe value for this VirtualMachineFlagInfo.
     * 
     * @return useToe
     */
    public java.lang.Boolean getUseToe() {
        return useToe;
    }


    /**
     * Sets the useToe value for this VirtualMachineFlagInfo.
     * 
     * @param useToe
     */
    public void setUseToe(java.lang.Boolean useToe) {
        this.useToe = useToe;
    }


    /**
     * Gets the runWithDebugInfo value for this VirtualMachineFlagInfo.
     * 
     * @return runWithDebugInfo
     */
    public java.lang.Boolean getRunWithDebugInfo() {
        return runWithDebugInfo;
    }


    /**
     * Sets the runWithDebugInfo value for this VirtualMachineFlagInfo.
     * 
     * @param runWithDebugInfo
     */
    public void setRunWithDebugInfo(java.lang.Boolean runWithDebugInfo) {
        this.runWithDebugInfo = runWithDebugInfo;
    }


    /**
     * Gets the htSharing value for this VirtualMachineFlagInfo.
     * 
     * @return htSharing
     */
    public java.lang.String getHtSharing() {
        return htSharing;
    }


    /**
     * Sets the htSharing value for this VirtualMachineFlagInfo.
     * 
     * @param htSharing
     */
    public void setHtSharing(java.lang.String htSharing) {
        this.htSharing = htSharing;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualMachineFlagInfo)) return false;
        VirtualMachineFlagInfo other = (VirtualMachineFlagInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.disableAcceleration==null && other.getDisableAcceleration()==null) || 
             (this.disableAcceleration!=null &&
              this.disableAcceleration.equals(other.getDisableAcceleration()))) &&
            ((this.enableLogging==null && other.getEnableLogging()==null) || 
             (this.enableLogging!=null &&
              this.enableLogging.equals(other.getEnableLogging()))) &&
            ((this.useToe==null && other.getUseToe()==null) || 
             (this.useToe!=null &&
              this.useToe.equals(other.getUseToe()))) &&
            ((this.runWithDebugInfo==null && other.getRunWithDebugInfo()==null) || 
             (this.runWithDebugInfo!=null &&
              this.runWithDebugInfo.equals(other.getRunWithDebugInfo()))) &&
            ((this.htSharing==null && other.getHtSharing()==null) || 
             (this.htSharing!=null &&
              this.htSharing.equals(other.getHtSharing())));
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
        if (getDisableAcceleration() != null) {
            _hashCode += getDisableAcceleration().hashCode();
        }
        if (getEnableLogging() != null) {
            _hashCode += getEnableLogging().hashCode();
        }
        if (getUseToe() != null) {
            _hashCode += getUseToe().hashCode();
        }
        if (getRunWithDebugInfo() != null) {
            _hashCode += getRunWithDebugInfo().hashCode();
        }
        if (getHtSharing() != null) {
            _hashCode += getHtSharing().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualMachineFlagInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "VirtualMachineFlagInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disableAcceleration");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "disableAcceleration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableLogging");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "enableLogging"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useToe");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "useToe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("runWithDebugInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "runWithDebugInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("htSharing");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "htSharing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
