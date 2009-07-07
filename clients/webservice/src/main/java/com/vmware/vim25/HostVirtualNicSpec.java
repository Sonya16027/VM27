/**
 * HostVirtualNicSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostVirtualNicSpec  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private com.vmware.vim25.HostIpConfig ip;

    private java.lang.String mac;

    private com.vmware.vim25.DistributedVirtualSwitchPortConnection distributedVirtualPort;

    private java.lang.String portgroup;

    private java.lang.Integer mtu;

    private java.lang.Boolean tsoEnabled;

    public HostVirtualNicSpec() {
    }

    public HostVirtualNicSpec(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           com.vmware.vim25.HostIpConfig ip,
           java.lang.String mac,
           com.vmware.vim25.DistributedVirtualSwitchPortConnection distributedVirtualPort,
           java.lang.String portgroup,
           java.lang.Integer mtu,
           java.lang.Boolean tsoEnabled) {
        super(
            dynamicType,
            dynamicProperty);
        this.ip = ip;
        this.mac = mac;
        this.distributedVirtualPort = distributedVirtualPort;
        this.portgroup = portgroup;
        this.mtu = mtu;
        this.tsoEnabled = tsoEnabled;
    }


    /**
     * Gets the ip value for this HostVirtualNicSpec.
     * 
     * @return ip
     */
    public com.vmware.vim25.HostIpConfig getIp() {
        return ip;
    }


    /**
     * Sets the ip value for this HostVirtualNicSpec.
     * 
     * @param ip
     */
    public void setIp(com.vmware.vim25.HostIpConfig ip) {
        this.ip = ip;
    }


    /**
     * Gets the mac value for this HostVirtualNicSpec.
     * 
     * @return mac
     */
    public java.lang.String getMac() {
        return mac;
    }


    /**
     * Sets the mac value for this HostVirtualNicSpec.
     * 
     * @param mac
     */
    public void setMac(java.lang.String mac) {
        this.mac = mac;
    }


    /**
     * Gets the distributedVirtualPort value for this HostVirtualNicSpec.
     * 
     * @return distributedVirtualPort
     */
    public com.vmware.vim25.DistributedVirtualSwitchPortConnection getDistributedVirtualPort() {
        return distributedVirtualPort;
    }


    /**
     * Sets the distributedVirtualPort value for this HostVirtualNicSpec.
     * 
     * @param distributedVirtualPort
     */
    public void setDistributedVirtualPort(com.vmware.vim25.DistributedVirtualSwitchPortConnection distributedVirtualPort) {
        this.distributedVirtualPort = distributedVirtualPort;
    }


    /**
     * Gets the portgroup value for this HostVirtualNicSpec.
     * 
     * @return portgroup
     */
    public java.lang.String getPortgroup() {
        return portgroup;
    }


    /**
     * Sets the portgroup value for this HostVirtualNicSpec.
     * 
     * @param portgroup
     */
    public void setPortgroup(java.lang.String portgroup) {
        this.portgroup = portgroup;
    }


    /**
     * Gets the mtu value for this HostVirtualNicSpec.
     * 
     * @return mtu
     */
    public java.lang.Integer getMtu() {
        return mtu;
    }


    /**
     * Sets the mtu value for this HostVirtualNicSpec.
     * 
     * @param mtu
     */
    public void setMtu(java.lang.Integer mtu) {
        this.mtu = mtu;
    }


    /**
     * Gets the tsoEnabled value for this HostVirtualNicSpec.
     * 
     * @return tsoEnabled
     */
    public java.lang.Boolean getTsoEnabled() {
        return tsoEnabled;
    }


    /**
     * Sets the tsoEnabled value for this HostVirtualNicSpec.
     * 
     * @param tsoEnabled
     */
    public void setTsoEnabled(java.lang.Boolean tsoEnabled) {
        this.tsoEnabled = tsoEnabled;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostVirtualNicSpec)) return false;
        HostVirtualNicSpec other = (HostVirtualNicSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.ip==null && other.getIp()==null) || 
             (this.ip!=null &&
              this.ip.equals(other.getIp()))) &&
            ((this.mac==null && other.getMac()==null) || 
             (this.mac!=null &&
              this.mac.equals(other.getMac()))) &&
            ((this.distributedVirtualPort==null && other.getDistributedVirtualPort()==null) || 
             (this.distributedVirtualPort!=null &&
              this.distributedVirtualPort.equals(other.getDistributedVirtualPort()))) &&
            ((this.portgroup==null && other.getPortgroup()==null) || 
             (this.portgroup!=null &&
              this.portgroup.equals(other.getPortgroup()))) &&
            ((this.mtu==null && other.getMtu()==null) || 
             (this.mtu!=null &&
              this.mtu.equals(other.getMtu()))) &&
            ((this.tsoEnabled==null && other.getTsoEnabled()==null) || 
             (this.tsoEnabled!=null &&
              this.tsoEnabled.equals(other.getTsoEnabled())));
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
        if (getIp() != null) {
            _hashCode += getIp().hashCode();
        }
        if (getMac() != null) {
            _hashCode += getMac().hashCode();
        }
        if (getDistributedVirtualPort() != null) {
            _hashCode += getDistributedVirtualPort().hashCode();
        }
        if (getPortgroup() != null) {
            _hashCode += getPortgroup().hashCode();
        }
        if (getMtu() != null) {
            _hashCode += getMtu().hashCode();
        }
        if (getTsoEnabled() != null) {
            _hashCode += getTsoEnabled().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostVirtualNicSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostVirtualNicSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ip");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ip"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostIpConfig"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mac");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "mac"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("distributedVirtualPort");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "distributedVirtualPort"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DistributedVirtualSwitchPortConnection"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portgroup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "portgroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tsoEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "tsoEnabled"));
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
