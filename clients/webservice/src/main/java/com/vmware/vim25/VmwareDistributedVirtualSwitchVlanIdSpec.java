/**
 * VmwareDistributedVirtualSwitchVlanIdSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VmwareDistributedVirtualSwitchVlanIdSpec  extends com.vmware.vim25.VmwareDistributedVirtualSwitchVlanSpec  implements java.io.Serializable {
    private int vlanId;

    public VmwareDistributedVirtualSwitchVlanIdSpec() {
    }

    public VmwareDistributedVirtualSwitchVlanIdSpec(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           boolean inherited,
           int vlanId) {
        super(
            dynamicType,
            dynamicProperty,
            inherited);
        this.vlanId = vlanId;
    }


    /**
     * Gets the vlanId value for this VmwareDistributedVirtualSwitchVlanIdSpec.
     * 
     * @return vlanId
     */
    public int getVlanId() {
        return vlanId;
    }


    /**
     * Sets the vlanId value for this VmwareDistributedVirtualSwitchVlanIdSpec.
     * 
     * @param vlanId
     */
    public void setVlanId(int vlanId) {
        this.vlanId = vlanId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VmwareDistributedVirtualSwitchVlanIdSpec)) return false;
        VmwareDistributedVirtualSwitchVlanIdSpec other = (VmwareDistributedVirtualSwitchVlanIdSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.vlanId == other.getVlanId();
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
        _hashCode += getVlanId();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VmwareDistributedVirtualSwitchVlanIdSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VmwareDistributedVirtualSwitchVlanIdSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlanId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vlanId"));
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
