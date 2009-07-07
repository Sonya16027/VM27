/**
 * HostInternetScsiHbaIPProperties.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class HostInternetScsiHbaIPProperties  extends com.vmware.vim.DynamicData  implements java.io.Serializable {
    private java.lang.String mac;

    private java.lang.String address;

    private boolean dhcpConfigurationEnabled;

    private java.lang.String subnetMask;

    private java.lang.String defaultGateway;

    private java.lang.String primaryDnsServerAddress;

    private java.lang.String alternateDnsServerAddress;

    public HostInternetScsiHbaIPProperties() {
    }

    public HostInternetScsiHbaIPProperties(
           java.lang.String dynamicType,
           com.vmware.vim.DynamicProperty[] dynamicProperty,
           java.lang.String mac,
           java.lang.String address,
           boolean dhcpConfigurationEnabled,
           java.lang.String subnetMask,
           java.lang.String defaultGateway,
           java.lang.String primaryDnsServerAddress,
           java.lang.String alternateDnsServerAddress) {
        super(
            dynamicType,
            dynamicProperty);
        this.mac = mac;
        this.address = address;
        this.dhcpConfigurationEnabled = dhcpConfigurationEnabled;
        this.subnetMask = subnetMask;
        this.defaultGateway = defaultGateway;
        this.primaryDnsServerAddress = primaryDnsServerAddress;
        this.alternateDnsServerAddress = alternateDnsServerAddress;
    }


    /**
     * Gets the mac value for this HostInternetScsiHbaIPProperties.
     * 
     * @return mac
     */
    public java.lang.String getMac() {
        return mac;
    }


    /**
     * Sets the mac value for this HostInternetScsiHbaIPProperties.
     * 
     * @param mac
     */
    public void setMac(java.lang.String mac) {
        this.mac = mac;
    }


    /**
     * Gets the address value for this HostInternetScsiHbaIPProperties.
     * 
     * @return address
     */
    public java.lang.String getAddress() {
        return address;
    }


    /**
     * Sets the address value for this HostInternetScsiHbaIPProperties.
     * 
     * @param address
     */
    public void setAddress(java.lang.String address) {
        this.address = address;
    }


    /**
     * Gets the dhcpConfigurationEnabled value for this HostInternetScsiHbaIPProperties.
     * 
     * @return dhcpConfigurationEnabled
     */
    public boolean isDhcpConfigurationEnabled() {
        return dhcpConfigurationEnabled;
    }


    /**
     * Sets the dhcpConfigurationEnabled value for this HostInternetScsiHbaIPProperties.
     * 
     * @param dhcpConfigurationEnabled
     */
    public void setDhcpConfigurationEnabled(boolean dhcpConfigurationEnabled) {
        this.dhcpConfigurationEnabled = dhcpConfigurationEnabled;
    }


    /**
     * Gets the subnetMask value for this HostInternetScsiHbaIPProperties.
     * 
     * @return subnetMask
     */
    public java.lang.String getSubnetMask() {
        return subnetMask;
    }


    /**
     * Sets the subnetMask value for this HostInternetScsiHbaIPProperties.
     * 
     * @param subnetMask
     */
    public void setSubnetMask(java.lang.String subnetMask) {
        this.subnetMask = subnetMask;
    }


    /**
     * Gets the defaultGateway value for this HostInternetScsiHbaIPProperties.
     * 
     * @return defaultGateway
     */
    public java.lang.String getDefaultGateway() {
        return defaultGateway;
    }


    /**
     * Sets the defaultGateway value for this HostInternetScsiHbaIPProperties.
     * 
     * @param defaultGateway
     */
    public void setDefaultGateway(java.lang.String defaultGateway) {
        this.defaultGateway = defaultGateway;
    }


    /**
     * Gets the primaryDnsServerAddress value for this HostInternetScsiHbaIPProperties.
     * 
     * @return primaryDnsServerAddress
     */
    public java.lang.String getPrimaryDnsServerAddress() {
        return primaryDnsServerAddress;
    }


    /**
     * Sets the primaryDnsServerAddress value for this HostInternetScsiHbaIPProperties.
     * 
     * @param primaryDnsServerAddress
     */
    public void setPrimaryDnsServerAddress(java.lang.String primaryDnsServerAddress) {
        this.primaryDnsServerAddress = primaryDnsServerAddress;
    }


    /**
     * Gets the alternateDnsServerAddress value for this HostInternetScsiHbaIPProperties.
     * 
     * @return alternateDnsServerAddress
     */
    public java.lang.String getAlternateDnsServerAddress() {
        return alternateDnsServerAddress;
    }


    /**
     * Sets the alternateDnsServerAddress value for this HostInternetScsiHbaIPProperties.
     * 
     * @param alternateDnsServerAddress
     */
    public void setAlternateDnsServerAddress(java.lang.String alternateDnsServerAddress) {
        this.alternateDnsServerAddress = alternateDnsServerAddress;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostInternetScsiHbaIPProperties)) return false;
        HostInternetScsiHbaIPProperties other = (HostInternetScsiHbaIPProperties) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.mac==null && other.getMac()==null) || 
             (this.mac!=null &&
              this.mac.equals(other.getMac()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            this.dhcpConfigurationEnabled == other.isDhcpConfigurationEnabled() &&
            ((this.subnetMask==null && other.getSubnetMask()==null) || 
             (this.subnetMask!=null &&
              this.subnetMask.equals(other.getSubnetMask()))) &&
            ((this.defaultGateway==null && other.getDefaultGateway()==null) || 
             (this.defaultGateway!=null &&
              this.defaultGateway.equals(other.getDefaultGateway()))) &&
            ((this.primaryDnsServerAddress==null && other.getPrimaryDnsServerAddress()==null) || 
             (this.primaryDnsServerAddress!=null &&
              this.primaryDnsServerAddress.equals(other.getPrimaryDnsServerAddress()))) &&
            ((this.alternateDnsServerAddress==null && other.getAlternateDnsServerAddress()==null) || 
             (this.alternateDnsServerAddress!=null &&
              this.alternateDnsServerAddress.equals(other.getAlternateDnsServerAddress())));
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
        if (getMac() != null) {
            _hashCode += getMac().hashCode();
        }
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        _hashCode += (isDhcpConfigurationEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getSubnetMask() != null) {
            _hashCode += getSubnetMask().hashCode();
        }
        if (getDefaultGateway() != null) {
            _hashCode += getDefaultGateway().hashCode();
        }
        if (getPrimaryDnsServerAddress() != null) {
            _hashCode += getPrimaryDnsServerAddress().hashCode();
        }
        if (getAlternateDnsServerAddress() != null) {
            _hashCode += getAlternateDnsServerAddress().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostInternetScsiHbaIPProperties.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "HostInternetScsiHbaIPProperties"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mac");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "mac"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dhcpConfigurationEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "dhcpConfigurationEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subnetMask");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "subnetMask"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultGateway");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "defaultGateway"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryDnsServerAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "primaryDnsServerAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternateDnsServerAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "alternateDnsServerAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
