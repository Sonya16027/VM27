/**
 * HostNatServicePortForwardSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostNatServicePortForwardSpec  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private java.lang.String type;

    private java.lang.String name;

    private int hostPort;

    private int guestPort;

    private java.lang.String guestIpAddress;

    public HostNatServicePortForwardSpec() {
    }

    public HostNatServicePortForwardSpec(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           java.lang.String type,
           java.lang.String name,
           int hostPort,
           int guestPort,
           java.lang.String guestIpAddress) {
        super(
            dynamicType,
            dynamicProperty);
        this.type = type;
        this.name = name;
        this.hostPort = hostPort;
        this.guestPort = guestPort;
        this.guestIpAddress = guestIpAddress;
    }


    /**
     * Gets the type value for this HostNatServicePortForwardSpec.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this HostNatServicePortForwardSpec.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the name value for this HostNatServicePortForwardSpec.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this HostNatServicePortForwardSpec.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the hostPort value for this HostNatServicePortForwardSpec.
     * 
     * @return hostPort
     */
    public int getHostPort() {
        return hostPort;
    }


    /**
     * Sets the hostPort value for this HostNatServicePortForwardSpec.
     * 
     * @param hostPort
     */
    public void setHostPort(int hostPort) {
        this.hostPort = hostPort;
    }


    /**
     * Gets the guestPort value for this HostNatServicePortForwardSpec.
     * 
     * @return guestPort
     */
    public int getGuestPort() {
        return guestPort;
    }


    /**
     * Sets the guestPort value for this HostNatServicePortForwardSpec.
     * 
     * @param guestPort
     */
    public void setGuestPort(int guestPort) {
        this.guestPort = guestPort;
    }


    /**
     * Gets the guestIpAddress value for this HostNatServicePortForwardSpec.
     * 
     * @return guestIpAddress
     */
    public java.lang.String getGuestIpAddress() {
        return guestIpAddress;
    }


    /**
     * Sets the guestIpAddress value for this HostNatServicePortForwardSpec.
     * 
     * @param guestIpAddress
     */
    public void setGuestIpAddress(java.lang.String guestIpAddress) {
        this.guestIpAddress = guestIpAddress;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostNatServicePortForwardSpec)) return false;
        HostNatServicePortForwardSpec other = (HostNatServicePortForwardSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            this.hostPort == other.getHostPort() &&
            this.guestPort == other.getGuestPort() &&
            ((this.guestIpAddress==null && other.getGuestIpAddress()==null) || 
             (this.guestIpAddress!=null &&
              this.guestIpAddress.equals(other.getGuestIpAddress())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        _hashCode += getHostPort();
        _hashCode += getGuestPort();
        if (getGuestIpAddress() != null) {
            _hashCode += getGuestIpAddress().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostNatServicePortForwardSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostNatServicePortForwardSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostPort");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "hostPort"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("guestPort");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "guestPort"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("guestIpAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "guestIpAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
