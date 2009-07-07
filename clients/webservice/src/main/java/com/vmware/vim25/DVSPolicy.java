/**
 * DVSPolicy.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class DVSPolicy  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private java.lang.Boolean autoPreInstallAllowed;

    private java.lang.Boolean autoUpgradeAllowed;

    private java.lang.Boolean partialUpgradeAllowed;

    public DVSPolicy() {
    }

    public DVSPolicy(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           java.lang.Boolean autoPreInstallAllowed,
           java.lang.Boolean autoUpgradeAllowed,
           java.lang.Boolean partialUpgradeAllowed) {
        super(
            dynamicType,
            dynamicProperty);
        this.autoPreInstallAllowed = autoPreInstallAllowed;
        this.autoUpgradeAllowed = autoUpgradeAllowed;
        this.partialUpgradeAllowed = partialUpgradeAllowed;
    }


    /**
     * Gets the autoPreInstallAllowed value for this DVSPolicy.
     * 
     * @return autoPreInstallAllowed
     */
    public java.lang.Boolean getAutoPreInstallAllowed() {
        return autoPreInstallAllowed;
    }


    /**
     * Sets the autoPreInstallAllowed value for this DVSPolicy.
     * 
     * @param autoPreInstallAllowed
     */
    public void setAutoPreInstallAllowed(java.lang.Boolean autoPreInstallAllowed) {
        this.autoPreInstallAllowed = autoPreInstallAllowed;
    }


    /**
     * Gets the autoUpgradeAllowed value for this DVSPolicy.
     * 
     * @return autoUpgradeAllowed
     */
    public java.lang.Boolean getAutoUpgradeAllowed() {
        return autoUpgradeAllowed;
    }


    /**
     * Sets the autoUpgradeAllowed value for this DVSPolicy.
     * 
     * @param autoUpgradeAllowed
     */
    public void setAutoUpgradeAllowed(java.lang.Boolean autoUpgradeAllowed) {
        this.autoUpgradeAllowed = autoUpgradeAllowed;
    }


    /**
     * Gets the partialUpgradeAllowed value for this DVSPolicy.
     * 
     * @return partialUpgradeAllowed
     */
    public java.lang.Boolean getPartialUpgradeAllowed() {
        return partialUpgradeAllowed;
    }


    /**
     * Sets the partialUpgradeAllowed value for this DVSPolicy.
     * 
     * @param partialUpgradeAllowed
     */
    public void setPartialUpgradeAllowed(java.lang.Boolean partialUpgradeAllowed) {
        this.partialUpgradeAllowed = partialUpgradeAllowed;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DVSPolicy)) return false;
        DVSPolicy other = (DVSPolicy) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.autoPreInstallAllowed==null && other.getAutoPreInstallAllowed()==null) || 
             (this.autoPreInstallAllowed!=null &&
              this.autoPreInstallAllowed.equals(other.getAutoPreInstallAllowed()))) &&
            ((this.autoUpgradeAllowed==null && other.getAutoUpgradeAllowed()==null) || 
             (this.autoUpgradeAllowed!=null &&
              this.autoUpgradeAllowed.equals(other.getAutoUpgradeAllowed()))) &&
            ((this.partialUpgradeAllowed==null && other.getPartialUpgradeAllowed()==null) || 
             (this.partialUpgradeAllowed!=null &&
              this.partialUpgradeAllowed.equals(other.getPartialUpgradeAllowed())));
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
        if (getAutoPreInstallAllowed() != null) {
            _hashCode += getAutoPreInstallAllowed().hashCode();
        }
        if (getAutoUpgradeAllowed() != null) {
            _hashCode += getAutoUpgradeAllowed().hashCode();
        }
        if (getPartialUpgradeAllowed() != null) {
            _hashCode += getPartialUpgradeAllowed().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DVSPolicy.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DVSPolicy"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoPreInstallAllowed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "autoPreInstallAllowed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoUpgradeAllowed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "autoUpgradeAllowed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partialUpgradeAllowed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "partialUpgradeAllowed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
