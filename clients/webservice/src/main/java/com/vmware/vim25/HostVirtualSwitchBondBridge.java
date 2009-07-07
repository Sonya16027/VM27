/**
 * HostVirtualSwitchBondBridge.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostVirtualSwitchBondBridge  extends com.vmware.vim25.HostVirtualSwitchBridge  implements java.io.Serializable {
    private java.lang.String[] nicDevice;

    private com.vmware.vim25.HostVirtualSwitchBeaconConfig beacon;

    private com.vmware.vim25.LinkDiscoveryProtocolConfig linkDiscoveryProtocolConfig;

    public HostVirtualSwitchBondBridge() {
    }

    public HostVirtualSwitchBondBridge(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           java.lang.String[] nicDevice,
           com.vmware.vim25.HostVirtualSwitchBeaconConfig beacon,
           com.vmware.vim25.LinkDiscoveryProtocolConfig linkDiscoveryProtocolConfig) {
        super(
            dynamicType,
            dynamicProperty);
        this.nicDevice = nicDevice;
        this.beacon = beacon;
        this.linkDiscoveryProtocolConfig = linkDiscoveryProtocolConfig;
    }


    /**
     * Gets the nicDevice value for this HostVirtualSwitchBondBridge.
     * 
     * @return nicDevice
     */
    public java.lang.String[] getNicDevice() {
        return nicDevice;
    }


    /**
     * Sets the nicDevice value for this HostVirtualSwitchBondBridge.
     * 
     * @param nicDevice
     */
    public void setNicDevice(java.lang.String[] nicDevice) {
        this.nicDevice = nicDevice;
    }

    public java.lang.String getNicDevice(int i) {
        return this.nicDevice[i];
    }

    public void setNicDevice(int i, java.lang.String _value) {
        this.nicDevice[i] = _value;
    }


    /**
     * Gets the beacon value for this HostVirtualSwitchBondBridge.
     * 
     * @return beacon
     */
    public com.vmware.vim25.HostVirtualSwitchBeaconConfig getBeacon() {
        return beacon;
    }


    /**
     * Sets the beacon value for this HostVirtualSwitchBondBridge.
     * 
     * @param beacon
     */
    public void setBeacon(com.vmware.vim25.HostVirtualSwitchBeaconConfig beacon) {
        this.beacon = beacon;
    }


    /**
     * Gets the linkDiscoveryProtocolConfig value for this HostVirtualSwitchBondBridge.
     * 
     * @return linkDiscoveryProtocolConfig
     */
    public com.vmware.vim25.LinkDiscoveryProtocolConfig getLinkDiscoveryProtocolConfig() {
        return linkDiscoveryProtocolConfig;
    }


    /**
     * Sets the linkDiscoveryProtocolConfig value for this HostVirtualSwitchBondBridge.
     * 
     * @param linkDiscoveryProtocolConfig
     */
    public void setLinkDiscoveryProtocolConfig(com.vmware.vim25.LinkDiscoveryProtocolConfig linkDiscoveryProtocolConfig) {
        this.linkDiscoveryProtocolConfig = linkDiscoveryProtocolConfig;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostVirtualSwitchBondBridge)) return false;
        HostVirtualSwitchBondBridge other = (HostVirtualSwitchBondBridge) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.nicDevice==null && other.getNicDevice()==null) || 
             (this.nicDevice!=null &&
              java.util.Arrays.equals(this.nicDevice, other.getNicDevice()))) &&
            ((this.beacon==null && other.getBeacon()==null) || 
             (this.beacon!=null &&
              this.beacon.equals(other.getBeacon()))) &&
            ((this.linkDiscoveryProtocolConfig==null && other.getLinkDiscoveryProtocolConfig()==null) || 
             (this.linkDiscoveryProtocolConfig!=null &&
              this.linkDiscoveryProtocolConfig.equals(other.getLinkDiscoveryProtocolConfig())));
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
        if (getNicDevice() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNicDevice());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNicDevice(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBeacon() != null) {
            _hashCode += getBeacon().hashCode();
        }
        if (getLinkDiscoveryProtocolConfig() != null) {
            _hashCode += getLinkDiscoveryProtocolConfig().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostVirtualSwitchBondBridge.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostVirtualSwitchBondBridge"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nicDevice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "nicDevice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beacon");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "beacon"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostVirtualSwitchBeaconConfig"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkDiscoveryProtocolConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "linkDiscoveryProtocolConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "LinkDiscoveryProtocolConfig"));
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
