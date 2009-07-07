/**
 * DVPortState.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class DVPortState  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private com.vmware.vim25.DVPortStatus runtimeInfo;

    private com.vmware.vim25.DistributedVirtualSwitchPortStatistics stats;

    private com.vmware.vim25.DistributedVirtualSwitchKeyedOpaqueBlob[] vendorSpecificState;

    public DVPortState() {
    }

    public DVPortState(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           com.vmware.vim25.DVPortStatus runtimeInfo,
           com.vmware.vim25.DistributedVirtualSwitchPortStatistics stats,
           com.vmware.vim25.DistributedVirtualSwitchKeyedOpaqueBlob[] vendorSpecificState) {
        super(
            dynamicType,
            dynamicProperty);
        this.runtimeInfo = runtimeInfo;
        this.stats = stats;
        this.vendorSpecificState = vendorSpecificState;
    }


    /**
     * Gets the runtimeInfo value for this DVPortState.
     * 
     * @return runtimeInfo
     */
    public com.vmware.vim25.DVPortStatus getRuntimeInfo() {
        return runtimeInfo;
    }


    /**
     * Sets the runtimeInfo value for this DVPortState.
     * 
     * @param runtimeInfo
     */
    public void setRuntimeInfo(com.vmware.vim25.DVPortStatus runtimeInfo) {
        this.runtimeInfo = runtimeInfo;
    }


    /**
     * Gets the stats value for this DVPortState.
     * 
     * @return stats
     */
    public com.vmware.vim25.DistributedVirtualSwitchPortStatistics getStats() {
        return stats;
    }


    /**
     * Sets the stats value for this DVPortState.
     * 
     * @param stats
     */
    public void setStats(com.vmware.vim25.DistributedVirtualSwitchPortStatistics stats) {
        this.stats = stats;
    }


    /**
     * Gets the vendorSpecificState value for this DVPortState.
     * 
     * @return vendorSpecificState
     */
    public com.vmware.vim25.DistributedVirtualSwitchKeyedOpaqueBlob[] getVendorSpecificState() {
        return vendorSpecificState;
    }


    /**
     * Sets the vendorSpecificState value for this DVPortState.
     * 
     * @param vendorSpecificState
     */
    public void setVendorSpecificState(com.vmware.vim25.DistributedVirtualSwitchKeyedOpaqueBlob[] vendorSpecificState) {
        this.vendorSpecificState = vendorSpecificState;
    }

    public com.vmware.vim25.DistributedVirtualSwitchKeyedOpaqueBlob getVendorSpecificState(int i) {
        return this.vendorSpecificState[i];
    }

    public void setVendorSpecificState(int i, com.vmware.vim25.DistributedVirtualSwitchKeyedOpaqueBlob _value) {
        this.vendorSpecificState[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DVPortState)) return false;
        DVPortState other = (DVPortState) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.runtimeInfo==null && other.getRuntimeInfo()==null) || 
             (this.runtimeInfo!=null &&
              this.runtimeInfo.equals(other.getRuntimeInfo()))) &&
            ((this.stats==null && other.getStats()==null) || 
             (this.stats!=null &&
              this.stats.equals(other.getStats()))) &&
            ((this.vendorSpecificState==null && other.getVendorSpecificState()==null) || 
             (this.vendorSpecificState!=null &&
              java.util.Arrays.equals(this.vendorSpecificState, other.getVendorSpecificState())));
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
        if (getRuntimeInfo() != null) {
            _hashCode += getRuntimeInfo().hashCode();
        }
        if (getStats() != null) {
            _hashCode += getStats().hashCode();
        }
        if (getVendorSpecificState() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVendorSpecificState());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVendorSpecificState(), i);
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
        new org.apache.axis.description.TypeDesc(DVPortState.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DVPortState"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("runtimeInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "runtimeInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DVPortStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stats");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "stats"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DistributedVirtualSwitchPortStatistics"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorSpecificState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vendorSpecificState"));
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
