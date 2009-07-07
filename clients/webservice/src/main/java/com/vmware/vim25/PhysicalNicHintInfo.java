/**
 * PhysicalNicHintInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class PhysicalNicHintInfo  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private java.lang.String device;

    private com.vmware.vim25.PhysicalNicIpHint[] subnet;

    private com.vmware.vim25.PhysicalNicNameHint[] network;

    private com.vmware.vim25.PhysicalNicCdpInfo connectedSwitchPort;

    public PhysicalNicHintInfo() {
    }

    public PhysicalNicHintInfo(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           java.lang.String device,
           com.vmware.vim25.PhysicalNicIpHint[] subnet,
           com.vmware.vim25.PhysicalNicNameHint[] network,
           com.vmware.vim25.PhysicalNicCdpInfo connectedSwitchPort) {
        super(
            dynamicType,
            dynamicProperty);
        this.device = device;
        this.subnet = subnet;
        this.network = network;
        this.connectedSwitchPort = connectedSwitchPort;
    }


    /**
     * Gets the device value for this PhysicalNicHintInfo.
     * 
     * @return device
     */
    public java.lang.String getDevice() {
        return device;
    }


    /**
     * Sets the device value for this PhysicalNicHintInfo.
     * 
     * @param device
     */
    public void setDevice(java.lang.String device) {
        this.device = device;
    }


    /**
     * Gets the subnet value for this PhysicalNicHintInfo.
     * 
     * @return subnet
     */
    public com.vmware.vim25.PhysicalNicIpHint[] getSubnet() {
        return subnet;
    }


    /**
     * Sets the subnet value for this PhysicalNicHintInfo.
     * 
     * @param subnet
     */
    public void setSubnet(com.vmware.vim25.PhysicalNicIpHint[] subnet) {
        this.subnet = subnet;
    }

    public com.vmware.vim25.PhysicalNicIpHint getSubnet(int i) {
        return this.subnet[i];
    }

    public void setSubnet(int i, com.vmware.vim25.PhysicalNicIpHint _value) {
        this.subnet[i] = _value;
    }


    /**
     * Gets the network value for this PhysicalNicHintInfo.
     * 
     * @return network
     */
    public com.vmware.vim25.PhysicalNicNameHint[] getNetwork() {
        return network;
    }


    /**
     * Sets the network value for this PhysicalNicHintInfo.
     * 
     * @param network
     */
    public void setNetwork(com.vmware.vim25.PhysicalNicNameHint[] network) {
        this.network = network;
    }

    public com.vmware.vim25.PhysicalNicNameHint getNetwork(int i) {
        return this.network[i];
    }

    public void setNetwork(int i, com.vmware.vim25.PhysicalNicNameHint _value) {
        this.network[i] = _value;
    }


    /**
     * Gets the connectedSwitchPort value for this PhysicalNicHintInfo.
     * 
     * @return connectedSwitchPort
     */
    public com.vmware.vim25.PhysicalNicCdpInfo getConnectedSwitchPort() {
        return connectedSwitchPort;
    }


    /**
     * Sets the connectedSwitchPort value for this PhysicalNicHintInfo.
     * 
     * @param connectedSwitchPort
     */
    public void setConnectedSwitchPort(com.vmware.vim25.PhysicalNicCdpInfo connectedSwitchPort) {
        this.connectedSwitchPort = connectedSwitchPort;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PhysicalNicHintInfo)) return false;
        PhysicalNicHintInfo other = (PhysicalNicHintInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.device==null && other.getDevice()==null) || 
             (this.device!=null &&
              this.device.equals(other.getDevice()))) &&
            ((this.subnet==null && other.getSubnet()==null) || 
             (this.subnet!=null &&
              java.util.Arrays.equals(this.subnet, other.getSubnet()))) &&
            ((this.network==null && other.getNetwork()==null) || 
             (this.network!=null &&
              java.util.Arrays.equals(this.network, other.getNetwork()))) &&
            ((this.connectedSwitchPort==null && other.getConnectedSwitchPort()==null) || 
             (this.connectedSwitchPort!=null &&
              this.connectedSwitchPort.equals(other.getConnectedSwitchPort())));
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
        if (getDevice() != null) {
            _hashCode += getDevice().hashCode();
        }
        if (getSubnet() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubnet());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubnet(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNetwork() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNetwork());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNetwork(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getConnectedSwitchPort() != null) {
            _hashCode += getConnectedSwitchPort().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PhysicalNicHintInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "PhysicalNicHintInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("device");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "device"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subnet");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "subnet"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "PhysicalNicIpHint"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("network");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "network"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "PhysicalNicNameHint"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connectedSwitchPort");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "connectedSwitchPort"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "PhysicalNicCdpInfo"));
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
