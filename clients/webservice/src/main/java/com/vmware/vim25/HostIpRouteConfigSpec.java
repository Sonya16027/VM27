/**
 * HostIpRouteConfigSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostIpRouteConfigSpec  extends com.vmware.vim25.HostIpRouteConfig  implements java.io.Serializable {
    private com.vmware.vim25.HostVirtualNicConnection gatewayDeviceConnection;

    private com.vmware.vim25.HostVirtualNicConnection ipV6GatewayDeviceConnection;

    public HostIpRouteConfigSpec() {
    }

    public HostIpRouteConfigSpec(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           java.lang.String defaultGateway,
           java.lang.String gatewayDevice,
           java.lang.String ipV6DefaultGateway,
           java.lang.String ipV6GatewayDevice,
           com.vmware.vim25.HostVirtualNicConnection gatewayDeviceConnection,
           com.vmware.vim25.HostVirtualNicConnection ipV6GatewayDeviceConnection) {
        super(
            dynamicType,
            dynamicProperty,
            defaultGateway,
            gatewayDevice,
            ipV6DefaultGateway,
            ipV6GatewayDevice);
        this.gatewayDeviceConnection = gatewayDeviceConnection;
        this.ipV6GatewayDeviceConnection = ipV6GatewayDeviceConnection;
    }


    /**
     * Gets the gatewayDeviceConnection value for this HostIpRouteConfigSpec.
     * 
     * @return gatewayDeviceConnection
     */
    public com.vmware.vim25.HostVirtualNicConnection getGatewayDeviceConnection() {
        return gatewayDeviceConnection;
    }


    /**
     * Sets the gatewayDeviceConnection value for this HostIpRouteConfigSpec.
     * 
     * @param gatewayDeviceConnection
     */
    public void setGatewayDeviceConnection(com.vmware.vim25.HostVirtualNicConnection gatewayDeviceConnection) {
        this.gatewayDeviceConnection = gatewayDeviceConnection;
    }


    /**
     * Gets the ipV6GatewayDeviceConnection value for this HostIpRouteConfigSpec.
     * 
     * @return ipV6GatewayDeviceConnection
     */
    public com.vmware.vim25.HostVirtualNicConnection getIpV6GatewayDeviceConnection() {
        return ipV6GatewayDeviceConnection;
    }


    /**
     * Sets the ipV6GatewayDeviceConnection value for this HostIpRouteConfigSpec.
     * 
     * @param ipV6GatewayDeviceConnection
     */
    public void setIpV6GatewayDeviceConnection(com.vmware.vim25.HostVirtualNicConnection ipV6GatewayDeviceConnection) {
        this.ipV6GatewayDeviceConnection = ipV6GatewayDeviceConnection;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostIpRouteConfigSpec)) return false;
        HostIpRouteConfigSpec other = (HostIpRouteConfigSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.gatewayDeviceConnection==null && other.getGatewayDeviceConnection()==null) || 
             (this.gatewayDeviceConnection!=null &&
              this.gatewayDeviceConnection.equals(other.getGatewayDeviceConnection()))) &&
            ((this.ipV6GatewayDeviceConnection==null && other.getIpV6GatewayDeviceConnection()==null) || 
             (this.ipV6GatewayDeviceConnection!=null &&
              this.ipV6GatewayDeviceConnection.equals(other.getIpV6GatewayDeviceConnection())));
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
        if (getGatewayDeviceConnection() != null) {
            _hashCode += getGatewayDeviceConnection().hashCode();
        }
        if (getIpV6GatewayDeviceConnection() != null) {
            _hashCode += getIpV6GatewayDeviceConnection().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostIpRouteConfigSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostIpRouteConfigSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gatewayDeviceConnection");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "gatewayDeviceConnection"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostVirtualNicConnection"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipV6GatewayDeviceConnection");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ipV6GatewayDeviceConnection"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostVirtualNicConnection"));
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
