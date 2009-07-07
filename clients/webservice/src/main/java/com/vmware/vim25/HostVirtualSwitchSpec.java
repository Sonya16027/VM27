/**
 * HostVirtualSwitchSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostVirtualSwitchSpec  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private int numPorts;

    private com.vmware.vim25.HostVirtualSwitchBridge bridge;

    private com.vmware.vim25.HostNetworkPolicy policy;

    private java.lang.Integer mtu;

    public HostVirtualSwitchSpec() {
    }

    public HostVirtualSwitchSpec(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           int numPorts,
           com.vmware.vim25.HostVirtualSwitchBridge bridge,
           com.vmware.vim25.HostNetworkPolicy policy,
           java.lang.Integer mtu) {
        super(
            dynamicType,
            dynamicProperty);
        this.numPorts = numPorts;
        this.bridge = bridge;
        this.policy = policy;
        this.mtu = mtu;
    }


    /**
     * Gets the numPorts value for this HostVirtualSwitchSpec.
     * 
     * @return numPorts
     */
    public int getNumPorts() {
        return numPorts;
    }


    /**
     * Sets the numPorts value for this HostVirtualSwitchSpec.
     * 
     * @param numPorts
     */
    public void setNumPorts(int numPorts) {
        this.numPorts = numPorts;
    }


    /**
     * Gets the bridge value for this HostVirtualSwitchSpec.
     * 
     * @return bridge
     */
    public com.vmware.vim25.HostVirtualSwitchBridge getBridge() {
        return bridge;
    }


    /**
     * Sets the bridge value for this HostVirtualSwitchSpec.
     * 
     * @param bridge
     */
    public void setBridge(com.vmware.vim25.HostVirtualSwitchBridge bridge) {
        this.bridge = bridge;
    }


    /**
     * Gets the policy value for this HostVirtualSwitchSpec.
     * 
     * @return policy
     */
    public com.vmware.vim25.HostNetworkPolicy getPolicy() {
        return policy;
    }


    /**
     * Sets the policy value for this HostVirtualSwitchSpec.
     * 
     * @param policy
     */
    public void setPolicy(com.vmware.vim25.HostNetworkPolicy policy) {
        this.policy = policy;
    }


    /**
     * Gets the mtu value for this HostVirtualSwitchSpec.
     * 
     * @return mtu
     */
    public java.lang.Integer getMtu() {
        return mtu;
    }


    /**
     * Sets the mtu value for this HostVirtualSwitchSpec.
     * 
     * @param mtu
     */
    public void setMtu(java.lang.Integer mtu) {
        this.mtu = mtu;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostVirtualSwitchSpec)) return false;
        HostVirtualSwitchSpec other = (HostVirtualSwitchSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.numPorts == other.getNumPorts() &&
            ((this.bridge==null && other.getBridge()==null) || 
             (this.bridge!=null &&
              this.bridge.equals(other.getBridge()))) &&
            ((this.policy==null && other.getPolicy()==null) || 
             (this.policy!=null &&
              this.policy.equals(other.getPolicy()))) &&
            ((this.mtu==null && other.getMtu()==null) || 
             (this.mtu!=null &&
              this.mtu.equals(other.getMtu())));
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
        _hashCode += getNumPorts();
        if (getBridge() != null) {
            _hashCode += getBridge().hashCode();
        }
        if (getPolicy() != null) {
            _hashCode += getPolicy().hashCode();
        }
        if (getMtu() != null) {
            _hashCode += getMtu().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostVirtualSwitchSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostVirtualSwitchSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numPorts");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "numPorts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bridge");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "bridge"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostVirtualSwitchBridge"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "policy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostNetworkPolicy"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mtu");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "mtu"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
