/**
 * ClusterDasFailoverLevelAdvancedRuntimeInfoHostSlots.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ClusterDasFailoverLevelAdvancedRuntimeInfoHostSlots  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private com.vmware.vim25.ManagedObjectReference host;

    private int slots;

    public ClusterDasFailoverLevelAdvancedRuntimeInfoHostSlots() {
    }

    public ClusterDasFailoverLevelAdvancedRuntimeInfoHostSlots(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           com.vmware.vim25.ManagedObjectReference host,
           int slots) {
        super(
            dynamicType,
            dynamicProperty);
        this.host = host;
        this.slots = slots;
    }


    /**
     * Gets the host value for this ClusterDasFailoverLevelAdvancedRuntimeInfoHostSlots.
     * 
     * @return host
     */
    public com.vmware.vim25.ManagedObjectReference getHost() {
        return host;
    }


    /**
     * Sets the host value for this ClusterDasFailoverLevelAdvancedRuntimeInfoHostSlots.
     * 
     * @param host
     */
    public void setHost(com.vmware.vim25.ManagedObjectReference host) {
        this.host = host;
    }


    /**
     * Gets the slots value for this ClusterDasFailoverLevelAdvancedRuntimeInfoHostSlots.
     * 
     * @return slots
     */
    public int getSlots() {
        return slots;
    }


    /**
     * Sets the slots value for this ClusterDasFailoverLevelAdvancedRuntimeInfoHostSlots.
     * 
     * @param slots
     */
    public void setSlots(int slots) {
        this.slots = slots;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ClusterDasFailoverLevelAdvancedRuntimeInfoHostSlots)) return false;
        ClusterDasFailoverLevelAdvancedRuntimeInfoHostSlots other = (ClusterDasFailoverLevelAdvancedRuntimeInfoHostSlots) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.host==null && other.getHost()==null) || 
             (this.host!=null &&
              this.host.equals(other.getHost()))) &&
            this.slots == other.getSlots();
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
        if (getHost() != null) {
            _hashCode += getHost().hashCode();
        }
        _hashCode += getSlots();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ClusterDasFailoverLevelAdvancedRuntimeInfoHostSlots.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterDasFailoverLevelAdvancedRuntimeInfoHostSlots"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("host");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "host"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("slots");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "slots"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
