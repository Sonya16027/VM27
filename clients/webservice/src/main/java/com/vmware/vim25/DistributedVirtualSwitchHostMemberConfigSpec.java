/**
 * DistributedVirtualSwitchHostMemberConfigSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class DistributedVirtualSwitchHostMemberConfigSpec  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private java.lang.String operation;

    private com.vmware.vim25.ManagedObjectReference host;

    private com.vmware.vim25.DistributedVirtualSwitchHostMemberBacking backing;

    private java.lang.Integer maxProxySwitchPorts;

    private com.vmware.vim25.DistributedVirtualSwitchKeyedOpaqueBlob[] vendorSpecificConfig;

    public DistributedVirtualSwitchHostMemberConfigSpec() {
    }

    public DistributedVirtualSwitchHostMemberConfigSpec(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           java.lang.String operation,
           com.vmware.vim25.ManagedObjectReference host,
           com.vmware.vim25.DistributedVirtualSwitchHostMemberBacking backing,
           java.lang.Integer maxProxySwitchPorts,
           com.vmware.vim25.DistributedVirtualSwitchKeyedOpaqueBlob[] vendorSpecificConfig) {
        super(
            dynamicType,
            dynamicProperty);
        this.operation = operation;
        this.host = host;
        this.backing = backing;
        this.maxProxySwitchPorts = maxProxySwitchPorts;
        this.vendorSpecificConfig = vendorSpecificConfig;
    }


    /**
     * Gets the operation value for this DistributedVirtualSwitchHostMemberConfigSpec.
     * 
     * @return operation
     */
    public java.lang.String getOperation() {
        return operation;
    }


    /**
     * Sets the operation value for this DistributedVirtualSwitchHostMemberConfigSpec.
     * 
     * @param operation
     */
    public void setOperation(java.lang.String operation) {
        this.operation = operation;
    }


    /**
     * Gets the host value for this DistributedVirtualSwitchHostMemberConfigSpec.
     * 
     * @return host
     */
    public com.vmware.vim25.ManagedObjectReference getHost() {
        return host;
    }


    /**
     * Sets the host value for this DistributedVirtualSwitchHostMemberConfigSpec.
     * 
     * @param host
     */
    public void setHost(com.vmware.vim25.ManagedObjectReference host) {
        this.host = host;
    }


    /**
     * Gets the backing value for this DistributedVirtualSwitchHostMemberConfigSpec.
     * 
     * @return backing
     */
    public com.vmware.vim25.DistributedVirtualSwitchHostMemberBacking getBacking() {
        return backing;
    }


    /**
     * Sets the backing value for this DistributedVirtualSwitchHostMemberConfigSpec.
     * 
     * @param backing
     */
    public void setBacking(com.vmware.vim25.DistributedVirtualSwitchHostMemberBacking backing) {
        this.backing = backing;
    }


    /**
     * Gets the maxProxySwitchPorts value for this DistributedVirtualSwitchHostMemberConfigSpec.
     * 
     * @return maxProxySwitchPorts
     */
    public java.lang.Integer getMaxProxySwitchPorts() {
        return maxProxySwitchPorts;
    }


    /**
     * Sets the maxProxySwitchPorts value for this DistributedVirtualSwitchHostMemberConfigSpec.
     * 
     * @param maxProxySwitchPorts
     */
    public void setMaxProxySwitchPorts(java.lang.Integer maxProxySwitchPorts) {
        this.maxProxySwitchPorts = maxProxySwitchPorts;
    }


    /**
     * Gets the vendorSpecificConfig value for this DistributedVirtualSwitchHostMemberConfigSpec.
     * 
     * @return vendorSpecificConfig
     */
    public com.vmware.vim25.DistributedVirtualSwitchKeyedOpaqueBlob[] getVendorSpecificConfig() {
        return vendorSpecificConfig;
    }


    /**
     * Sets the vendorSpecificConfig value for this DistributedVirtualSwitchHostMemberConfigSpec.
     * 
     * @param vendorSpecificConfig
     */
    public void setVendorSpecificConfig(com.vmware.vim25.DistributedVirtualSwitchKeyedOpaqueBlob[] vendorSpecificConfig) {
        this.vendorSpecificConfig = vendorSpecificConfig;
    }

    public com.vmware.vim25.DistributedVirtualSwitchKeyedOpaqueBlob getVendorSpecificConfig(int i) {
        return this.vendorSpecificConfig[i];
    }

    public void setVendorSpecificConfig(int i, com.vmware.vim25.DistributedVirtualSwitchKeyedOpaqueBlob _value) {
        this.vendorSpecificConfig[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DistributedVirtualSwitchHostMemberConfigSpec)) return false;
        DistributedVirtualSwitchHostMemberConfigSpec other = (DistributedVirtualSwitchHostMemberConfigSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.operation==null && other.getOperation()==null) || 
             (this.operation!=null &&
              this.operation.equals(other.getOperation()))) &&
            ((this.host==null && other.getHost()==null) || 
             (this.host!=null &&
              this.host.equals(other.getHost()))) &&
            ((this.backing==null && other.getBacking()==null) || 
             (this.backing!=null &&
              this.backing.equals(other.getBacking()))) &&
            ((this.maxProxySwitchPorts==null && other.getMaxProxySwitchPorts()==null) || 
             (this.maxProxySwitchPorts!=null &&
              this.maxProxySwitchPorts.equals(other.getMaxProxySwitchPorts()))) &&
            ((this.vendorSpecificConfig==null && other.getVendorSpecificConfig()==null) || 
             (this.vendorSpecificConfig!=null &&
              java.util.Arrays.equals(this.vendorSpecificConfig, other.getVendorSpecificConfig())));
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
        if (getOperation() != null) {
            _hashCode += getOperation().hashCode();
        }
        if (getHost() != null) {
            _hashCode += getHost().hashCode();
        }
        if (getBacking() != null) {
            _hashCode += getBacking().hashCode();
        }
        if (getMaxProxySwitchPorts() != null) {
            _hashCode += getMaxProxySwitchPorts().hashCode();
        }
        if (getVendorSpecificConfig() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVendorSpecificConfig());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVendorSpecificConfig(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DistributedVirtualSwitchHostMemberConfigSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DistributedVirtualSwitchHostMemberConfigSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "operation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("host");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "host"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("backing");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "backing"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DistributedVirtualSwitchHostMemberBacking"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxProxySwitchPorts");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "maxProxySwitchPorts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorSpecificConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vendorSpecificConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DistributedVirtualSwitchKeyedOpaqueBlob"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
