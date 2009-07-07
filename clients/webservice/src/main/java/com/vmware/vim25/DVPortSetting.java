/**
 * DVPortSetting.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class DVPortSetting  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private com.vmware.vim25.BoolPolicy blocked;

    private com.vmware.vim25.DVSTrafficShapingPolicy inShapingPolicy;

    private com.vmware.vim25.DVSTrafficShapingPolicy outShapingPolicy;

    private com.vmware.vim25.DVSVendorSpecificConfig vendorSpecificConfig;

    public DVPortSetting() {
    }

    public DVPortSetting(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           com.vmware.vim25.BoolPolicy blocked,
           com.vmware.vim25.DVSTrafficShapingPolicy inShapingPolicy,
           com.vmware.vim25.DVSTrafficShapingPolicy outShapingPolicy,
           com.vmware.vim25.DVSVendorSpecificConfig vendorSpecificConfig) {
        super(
            dynamicType,
            dynamicProperty);
        this.blocked = blocked;
        this.inShapingPolicy = inShapingPolicy;
        this.outShapingPolicy = outShapingPolicy;
        this.vendorSpecificConfig = vendorSpecificConfig;
    }


    /**
     * Gets the blocked value for this DVPortSetting.
     * 
     * @return blocked
     */
    public com.vmware.vim25.BoolPolicy getBlocked() {
        return blocked;
    }


    /**
     * Sets the blocked value for this DVPortSetting.
     * 
     * @param blocked
     */
    public void setBlocked(com.vmware.vim25.BoolPolicy blocked) {
        this.blocked = blocked;
    }


    /**
     * Gets the inShapingPolicy value for this DVPortSetting.
     * 
     * @return inShapingPolicy
     */
    public com.vmware.vim25.DVSTrafficShapingPolicy getInShapingPolicy() {
        return inShapingPolicy;
    }


    /**
     * Sets the inShapingPolicy value for this DVPortSetting.
     * 
     * @param inShapingPolicy
     */
    public void setInShapingPolicy(com.vmware.vim25.DVSTrafficShapingPolicy inShapingPolicy) {
        this.inShapingPolicy = inShapingPolicy;
    }


    /**
     * Gets the outShapingPolicy value for this DVPortSetting.
     * 
     * @return outShapingPolicy
     */
    public com.vmware.vim25.DVSTrafficShapingPolicy getOutShapingPolicy() {
        return outShapingPolicy;
    }


    /**
     * Sets the outShapingPolicy value for this DVPortSetting.
     * 
     * @param outShapingPolicy
     */
    public void setOutShapingPolicy(com.vmware.vim25.DVSTrafficShapingPolicy outShapingPolicy) {
        this.outShapingPolicy = outShapingPolicy;
    }


    /**
     * Gets the vendorSpecificConfig value for this DVPortSetting.
     * 
     * @return vendorSpecificConfig
     */
    public com.vmware.vim25.DVSVendorSpecificConfig getVendorSpecificConfig() {
        return vendorSpecificConfig;
    }


    /**
     * Sets the vendorSpecificConfig value for this DVPortSetting.
     * 
     * @param vendorSpecificConfig
     */
    public void setVendorSpecificConfig(com.vmware.vim25.DVSVendorSpecificConfig vendorSpecificConfig) {
        this.vendorSpecificConfig = vendorSpecificConfig;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DVPortSetting)) return false;
        DVPortSetting other = (DVPortSetting) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.blocked==null && other.getBlocked()==null) || 
             (this.blocked!=null &&
              this.blocked.equals(other.getBlocked()))) &&
            ((this.inShapingPolicy==null && other.getInShapingPolicy()==null) || 
             (this.inShapingPolicy!=null &&
              this.inShapingPolicy.equals(other.getInShapingPolicy()))) &&
            ((this.outShapingPolicy==null && other.getOutShapingPolicy()==null) || 
             (this.outShapingPolicy!=null &&
              this.outShapingPolicy.equals(other.getOutShapingPolicy()))) &&
            ((this.vendorSpecificConfig==null && other.getVendorSpecificConfig()==null) || 
             (this.vendorSpecificConfig!=null &&
              this.vendorSpecificConfig.equals(other.getVendorSpecificConfig())));
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
        if (getBlocked() != null) {
            _hashCode += getBlocked().hashCode();
        }
        if (getInShapingPolicy() != null) {
            _hashCode += getInShapingPolicy().hashCode();
        }
        if (getOutShapingPolicy() != null) {
            _hashCode += getOutShapingPolicy().hashCode();
        }
        if (getVendorSpecificConfig() != null) {
            _hashCode += getVendorSpecificConfig().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DVPortSetting.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DVPortSetting"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blocked");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "blocked"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "BoolPolicy"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inShapingPolicy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "inShapingPolicy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DVSTrafficShapingPolicy"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outShapingPolicy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "outShapingPolicy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DVSTrafficShapingPolicy"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorSpecificConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vendorSpecificConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DVSVendorSpecificConfig"));
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
