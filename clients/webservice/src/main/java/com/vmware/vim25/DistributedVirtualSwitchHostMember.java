/**
 * DistributedVirtualSwitchHostMember.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class DistributedVirtualSwitchHostMember  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private com.vmware.vim25.DistributedVirtualSwitchHostMemberConfigInfo config;

    private com.vmware.vim25.DistributedVirtualSwitchProductSpec productInfo;

    private java.lang.String[] uplinkPortKey;

    private java.lang.String status;

    public DistributedVirtualSwitchHostMember() {
    }

    public DistributedVirtualSwitchHostMember(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           com.vmware.vim25.DistributedVirtualSwitchHostMemberConfigInfo config,
           com.vmware.vim25.DistributedVirtualSwitchProductSpec productInfo,
           java.lang.String[] uplinkPortKey,
           java.lang.String status) {
        super(
            dynamicType,
            dynamicProperty);
        this.config = config;
        this.productInfo = productInfo;
        this.uplinkPortKey = uplinkPortKey;
        this.status = status;
    }


    /**
     * Gets the config value for this DistributedVirtualSwitchHostMember.
     * 
     * @return config
     */
    public com.vmware.vim25.DistributedVirtualSwitchHostMemberConfigInfo getConfig() {
        return config;
    }


    /**
     * Sets the config value for this DistributedVirtualSwitchHostMember.
     * 
     * @param config
     */
    public void setConfig(com.vmware.vim25.DistributedVirtualSwitchHostMemberConfigInfo config) {
        this.config = config;
    }


    /**
     * Gets the productInfo value for this DistributedVirtualSwitchHostMember.
     * 
     * @return productInfo
     */
    public com.vmware.vim25.DistributedVirtualSwitchProductSpec getProductInfo() {
        return productInfo;
    }


    /**
     * Sets the productInfo value for this DistributedVirtualSwitchHostMember.
     * 
     * @param productInfo
     */
    public void setProductInfo(com.vmware.vim25.DistributedVirtualSwitchProductSpec productInfo) {
        this.productInfo = productInfo;
    }


    /**
     * Gets the uplinkPortKey value for this DistributedVirtualSwitchHostMember.
     * 
     * @return uplinkPortKey
     */
    public java.lang.String[] getUplinkPortKey() {
        return uplinkPortKey;
    }


    /**
     * Sets the uplinkPortKey value for this DistributedVirtualSwitchHostMember.
     * 
     * @param uplinkPortKey
     */
    public void setUplinkPortKey(java.lang.String[] uplinkPortKey) {
        this.uplinkPortKey = uplinkPortKey;
    }

    public java.lang.String getUplinkPortKey(int i) {
        return this.uplinkPortKey[i];
    }

    public void setUplinkPortKey(int i, java.lang.String _value) {
        this.uplinkPortKey[i] = _value;
    }


    /**
     * Gets the status value for this DistributedVirtualSwitchHostMember.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this DistributedVirtualSwitchHostMember.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DistributedVirtualSwitchHostMember)) return false;
        DistributedVirtualSwitchHostMember other = (DistributedVirtualSwitchHostMember) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.config==null && other.getConfig()==null) || 
             (this.config!=null &&
              this.config.equals(other.getConfig()))) &&
            ((this.productInfo==null && other.getProductInfo()==null) || 
             (this.productInfo!=null &&
              this.productInfo.equals(other.getProductInfo()))) &&
            ((this.uplinkPortKey==null && other.getUplinkPortKey()==null) || 
             (this.uplinkPortKey!=null &&
              java.util.Arrays.equals(this.uplinkPortKey, other.getUplinkPortKey()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus())));
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
        if (getConfig() != null) {
            _hashCode += getConfig().hashCode();
        }
        if (getProductInfo() != null) {
            _hashCode += getProductInfo().hashCode();
        }
        if (getUplinkPortKey() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUplinkPortKey());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUplinkPortKey(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DistributedVirtualSwitchHostMember.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DistributedVirtualSwitchHostMember"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("config");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "config"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DistributedVirtualSwitchHostMemberConfigInfo"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "productInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DistributedVirtualSwitchProductSpec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uplinkPortKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "uplinkPortKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "status"));
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
