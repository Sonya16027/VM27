/**
 * HostNatServiceSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostNatServiceSpec  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private java.lang.String virtualSwitch;

    private boolean activeFtp;

    private boolean allowAnyOui;

    private boolean configPort;

    private java.lang.String ipGatewayAddress;

    private int udpTimeout;

    private com.vmware.vim25.HostNatServicePortForwardSpec[] portForward;

    private com.vmware.vim25.HostNatServiceNameServiceSpec nameService;

    public HostNatServiceSpec() {
    }

    public HostNatServiceSpec(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           java.lang.String virtualSwitch,
           boolean activeFtp,
           boolean allowAnyOui,
           boolean configPort,
           java.lang.String ipGatewayAddress,
           int udpTimeout,
           com.vmware.vim25.HostNatServicePortForwardSpec[] portForward,
           com.vmware.vim25.HostNatServiceNameServiceSpec nameService) {
        super(
            dynamicType,
            dynamicProperty);
        this.virtualSwitch = virtualSwitch;
        this.activeFtp = activeFtp;
        this.allowAnyOui = allowAnyOui;
        this.configPort = configPort;
        this.ipGatewayAddress = ipGatewayAddress;
        this.udpTimeout = udpTimeout;
        this.portForward = portForward;
        this.nameService = nameService;
    }


    /**
     * Gets the virtualSwitch value for this HostNatServiceSpec.
     * 
     * @return virtualSwitch
     */
    public java.lang.String getVirtualSwitch() {
        return virtualSwitch;
    }


    /**
     * Sets the virtualSwitch value for this HostNatServiceSpec.
     * 
     * @param virtualSwitch
     */
    public void setVirtualSwitch(java.lang.String virtualSwitch) {
        this.virtualSwitch = virtualSwitch;
    }


    /**
     * Gets the activeFtp value for this HostNatServiceSpec.
     * 
     * @return activeFtp
     */
    public boolean isActiveFtp() {
        return activeFtp;
    }


    /**
     * Sets the activeFtp value for this HostNatServiceSpec.
     * 
     * @param activeFtp
     */
    public void setActiveFtp(boolean activeFtp) {
        this.activeFtp = activeFtp;
    }


    /**
     * Gets the allowAnyOui value for this HostNatServiceSpec.
     * 
     * @return allowAnyOui
     */
    public boolean isAllowAnyOui() {
        return allowAnyOui;
    }


    /**
     * Sets the allowAnyOui value for this HostNatServiceSpec.
     * 
     * @param allowAnyOui
     */
    public void setAllowAnyOui(boolean allowAnyOui) {
        this.allowAnyOui = allowAnyOui;
    }


    /**
     * Gets the configPort value for this HostNatServiceSpec.
     * 
     * @return configPort
     */
    public boolean isConfigPort() {
        return configPort;
    }


    /**
     * Sets the configPort value for this HostNatServiceSpec.
     * 
     * @param configPort
     */
    public void setConfigPort(boolean configPort) {
        this.configPort = configPort;
    }


    /**
     * Gets the ipGatewayAddress value for this HostNatServiceSpec.
     * 
     * @return ipGatewayAddress
     */
    public java.lang.String getIpGatewayAddress() {
        return ipGatewayAddress;
    }


    /**
     * Sets the ipGatewayAddress value for this HostNatServiceSpec.
     * 
     * @param ipGatewayAddress
     */
    public void setIpGatewayAddress(java.lang.String ipGatewayAddress) {
        this.ipGatewayAddress = ipGatewayAddress;
    }


    /**
     * Gets the udpTimeout value for this HostNatServiceSpec.
     * 
     * @return udpTimeout
     */
    public int getUdpTimeout() {
        return udpTimeout;
    }


    /**
     * Sets the udpTimeout value for this HostNatServiceSpec.
     * 
     * @param udpTimeout
     */
    public void setUdpTimeout(int udpTimeout) {
        this.udpTimeout = udpTimeout;
    }


    /**
     * Gets the portForward value for this HostNatServiceSpec.
     * 
     * @return portForward
     */
    public com.vmware.vim25.HostNatServicePortForwardSpec[] getPortForward() {
        return portForward;
    }


    /**
     * Sets the portForward value for this HostNatServiceSpec.
     * 
     * @param portForward
     */
    public void setPortForward(com.vmware.vim25.HostNatServicePortForwardSpec[] portForward) {
        this.portForward = portForward;
    }

    public com.vmware.vim25.HostNatServicePortForwardSpec getPortForward(int i) {
        return this.portForward[i];
    }

    public void setPortForward(int i, com.vmware.vim25.HostNatServicePortForwardSpec _value) {
        this.portForward[i] = _value;
    }


    /**
     * Gets the nameService value for this HostNatServiceSpec.
     * 
     * @return nameService
     */
    public com.vmware.vim25.HostNatServiceNameServiceSpec getNameService() {
        return nameService;
    }


    /**
     * Sets the nameService value for this HostNatServiceSpec.
     * 
     * @param nameService
     */
    public void setNameService(com.vmware.vim25.HostNatServiceNameServiceSpec nameService) {
        this.nameService = nameService;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostNatServiceSpec)) return false;
        HostNatServiceSpec other = (HostNatServiceSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.virtualSwitch==null && other.getVirtualSwitch()==null) || 
             (this.virtualSwitch!=null &&
              this.virtualSwitch.equals(other.getVirtualSwitch()))) &&
            this.activeFtp == other.isActiveFtp() &&
            this.allowAnyOui == other.isAllowAnyOui() &&
            this.configPort == other.isConfigPort() &&
            ((this.ipGatewayAddress==null && other.getIpGatewayAddress()==null) || 
             (this.ipGatewayAddress!=null &&
              this.ipGatewayAddress.equals(other.getIpGatewayAddress()))) &&
            this.udpTimeout == other.getUdpTimeout() &&
            ((this.portForward==null && other.getPortForward()==null) || 
             (this.portForward!=null &&
              java.util.Arrays.equals(this.portForward, other.getPortForward()))) &&
            ((this.nameService==null && other.getNameService()==null) || 
             (this.nameService!=null &&
              this.nameService.equals(other.getNameService())));
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
        if (getVirtualSwitch() != null) {
            _hashCode += getVirtualSwitch().hashCode();
        }
        _hashCode += (isActiveFtp() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isAllowAnyOui() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isConfigPort() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getIpGatewayAddress() != null) {
            _hashCode += getIpGatewayAddress().hashCode();
        }
        _hashCode += getUdpTimeout();
        if (getPortForward() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPortForward());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPortForward(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNameService() != null) {
            _hashCode += getNameService().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostNatServiceSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostNatServiceSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("virtualSwitch");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "virtualSwitch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activeFtp");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "activeFtp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowAnyOui");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "allowAnyOui"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("configPort");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "configPort"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipGatewayAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ipGatewayAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("udpTimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "udpTimeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portForward");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "portForward"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostNatServicePortForwardSpec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameService");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "nameService"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostNatServiceNameServiceSpec"));
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
