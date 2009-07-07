/**
 * HostInternetScsiHbaIPCapabilities.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostInternetScsiHbaIPCapabilities  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private boolean addressSettable;

    private boolean ipConfigurationMethodSettable;

    private boolean subnetMaskSettable;

    private boolean defaultGatewaySettable;

    private boolean primaryDnsServerAddressSettable;

    private boolean alternateDnsServerAddressSettable;

    private java.lang.Boolean ipv6Supported;

    private java.lang.Boolean arpRedirectSettable;

    private java.lang.Boolean mtuSettable;

    private java.lang.Boolean hostNameAsTargetAddress;

    public HostInternetScsiHbaIPCapabilities() {
    }

    public HostInternetScsiHbaIPCapabilities(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           boolean addressSettable,
           boolean ipConfigurationMethodSettable,
           boolean subnetMaskSettable,
           boolean defaultGatewaySettable,
           boolean primaryDnsServerAddressSettable,
           boolean alternateDnsServerAddressSettable,
           java.lang.Boolean ipv6Supported,
           java.lang.Boolean arpRedirectSettable,
           java.lang.Boolean mtuSettable,
           java.lang.Boolean hostNameAsTargetAddress) {
        super(
            dynamicType,
            dynamicProperty);
        this.addressSettable = addressSettable;
        this.ipConfigurationMethodSettable = ipConfigurationMethodSettable;
        this.subnetMaskSettable = subnetMaskSettable;
        this.defaultGatewaySettable = defaultGatewaySettable;
        this.primaryDnsServerAddressSettable = primaryDnsServerAddressSettable;
        this.alternateDnsServerAddressSettable = alternateDnsServerAddressSettable;
        this.ipv6Supported = ipv6Supported;
        this.arpRedirectSettable = arpRedirectSettable;
        this.mtuSettable = mtuSettable;
        this.hostNameAsTargetAddress = hostNameAsTargetAddress;
    }


    /**
     * Gets the addressSettable value for this HostInternetScsiHbaIPCapabilities.
     * 
     * @return addressSettable
     */
    public boolean isAddressSettable() {
        return addressSettable;
    }


    /**
     * Sets the addressSettable value for this HostInternetScsiHbaIPCapabilities.
     * 
     * @param addressSettable
     */
    public void setAddressSettable(boolean addressSettable) {
        this.addressSettable = addressSettable;
    }


    /**
     * Gets the ipConfigurationMethodSettable value for this HostInternetScsiHbaIPCapabilities.
     * 
     * @return ipConfigurationMethodSettable
     */
    public boolean isIpConfigurationMethodSettable() {
        return ipConfigurationMethodSettable;
    }


    /**
     * Sets the ipConfigurationMethodSettable value for this HostInternetScsiHbaIPCapabilities.
     * 
     * @param ipConfigurationMethodSettable
     */
    public void setIpConfigurationMethodSettable(boolean ipConfigurationMethodSettable) {
        this.ipConfigurationMethodSettable = ipConfigurationMethodSettable;
    }


    /**
     * Gets the subnetMaskSettable value for this HostInternetScsiHbaIPCapabilities.
     * 
     * @return subnetMaskSettable
     */
    public boolean isSubnetMaskSettable() {
        return subnetMaskSettable;
    }


    /**
     * Sets the subnetMaskSettable value for this HostInternetScsiHbaIPCapabilities.
     * 
     * @param subnetMaskSettable
     */
    public void setSubnetMaskSettable(boolean subnetMaskSettable) {
        this.subnetMaskSettable = subnetMaskSettable;
    }


    /**
     * Gets the defaultGatewaySettable value for this HostInternetScsiHbaIPCapabilities.
     * 
     * @return defaultGatewaySettable
     */
    public boolean isDefaultGatewaySettable() {
        return defaultGatewaySettable;
    }


    /**
     * Sets the defaultGatewaySettable value for this HostInternetScsiHbaIPCapabilities.
     * 
     * @param defaultGatewaySettable
     */
    public void setDefaultGatewaySettable(boolean defaultGatewaySettable) {
        this.defaultGatewaySettable = defaultGatewaySettable;
    }


    /**
     * Gets the primaryDnsServerAddressSettable value for this HostInternetScsiHbaIPCapabilities.
     * 
     * @return primaryDnsServerAddressSettable
     */
    public boolean isPrimaryDnsServerAddressSettable() {
        return primaryDnsServerAddressSettable;
    }


    /**
     * Sets the primaryDnsServerAddressSettable value for this HostInternetScsiHbaIPCapabilities.
     * 
     * @param primaryDnsServerAddressSettable
     */
    public void setPrimaryDnsServerAddressSettable(boolean primaryDnsServerAddressSettable) {
        this.primaryDnsServerAddressSettable = primaryDnsServerAddressSettable;
    }


    /**
     * Gets the alternateDnsServerAddressSettable value for this HostInternetScsiHbaIPCapabilities.
     * 
     * @return alternateDnsServerAddressSettable
     */
    public boolean isAlternateDnsServerAddressSettable() {
        return alternateDnsServerAddressSettable;
    }


    /**
     * Sets the alternateDnsServerAddressSettable value for this HostInternetScsiHbaIPCapabilities.
     * 
     * @param alternateDnsServerAddressSettable
     */
    public void setAlternateDnsServerAddressSettable(boolean alternateDnsServerAddressSettable) {
        this.alternateDnsServerAddressSettable = alternateDnsServerAddressSettable;
    }


    /**
     * Gets the ipv6Supported value for this HostInternetScsiHbaIPCapabilities.
     * 
     * @return ipv6Supported
     */
    public java.lang.Boolean getIpv6Supported() {
        return ipv6Supported;
    }


    /**
     * Sets the ipv6Supported value for this HostInternetScsiHbaIPCapabilities.
     * 
     * @param ipv6Supported
     */
    public void setIpv6Supported(java.lang.Boolean ipv6Supported) {
        this.ipv6Supported = ipv6Supported;
    }


    /**
     * Gets the arpRedirectSettable value for this HostInternetScsiHbaIPCapabilities.
     * 
     * @return arpRedirectSettable
     */
    public java.lang.Boolean getArpRedirectSettable() {
        return arpRedirectSettable;
    }


    /**
     * Sets the arpRedirectSettable value for this HostInternetScsiHbaIPCapabilities.
     * 
     * @param arpRedirectSettable
     */
    public void setArpRedirectSettable(java.lang.Boolean arpRedirectSettable) {
        this.arpRedirectSettable = arpRedirectSettable;
    }


    /**
     * Gets the mtuSettable value for this HostInternetScsiHbaIPCapabilities.
     * 
     * @return mtuSettable
     */
    public java.lang.Boolean getMtuSettable() {
        return mtuSettable;
    }


    /**
     * Sets the mtuSettable value for this HostInternetScsiHbaIPCapabilities.
     * 
     * @param mtuSettable
     */
    public void setMtuSettable(java.lang.Boolean mtuSettable) {
        this.mtuSettable = mtuSettable;
    }


    /**
     * Gets the hostNameAsTargetAddress value for this HostInternetScsiHbaIPCapabilities.
     * 
     * @return hostNameAsTargetAddress
     */
    public java.lang.Boolean getHostNameAsTargetAddress() {
        return hostNameAsTargetAddress;
    }


    /**
     * Sets the hostNameAsTargetAddress value for this HostInternetScsiHbaIPCapabilities.
     * 
     * @param hostNameAsTargetAddress
     */
    public void setHostNameAsTargetAddress(java.lang.Boolean hostNameAsTargetAddress) {
        this.hostNameAsTargetAddress = hostNameAsTargetAddress;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostInternetScsiHbaIPCapabilities)) return false;
        HostInternetScsiHbaIPCapabilities other = (HostInternetScsiHbaIPCapabilities) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.addressSettable == other.isAddressSettable() &&
            this.ipConfigurationMethodSettable == other.isIpConfigurationMethodSettable() &&
            this.subnetMaskSettable == other.isSubnetMaskSettable() &&
            this.defaultGatewaySettable == other.isDefaultGatewaySettable() &&
            this.primaryDnsServerAddressSettable == other.isPrimaryDnsServerAddressSettable() &&
            this.alternateDnsServerAddressSettable == other.isAlternateDnsServerAddressSettable() &&
            ((this.ipv6Supported==null && other.getIpv6Supported()==null) || 
             (this.ipv6Supported!=null &&
              this.ipv6Supported.equals(other.getIpv6Supported()))) &&
            ((this.arpRedirectSettable==null && other.getArpRedirectSettable()==null) || 
             (this.arpRedirectSettable!=null &&
              this.arpRedirectSettable.equals(other.getArpRedirectSettable()))) &&
            ((this.mtuSettable==null && other.getMtuSettable()==null) || 
             (this.mtuSettable!=null &&
              this.mtuSettable.equals(other.getMtuSettable()))) &&
            ((this.hostNameAsTargetAddress==null && other.getHostNameAsTargetAddress()==null) || 
             (this.hostNameAsTargetAddress!=null &&
              this.hostNameAsTargetAddress.equals(other.getHostNameAsTargetAddress())));
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
        _hashCode += (isAddressSettable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIpConfigurationMethodSettable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isSubnetMaskSettable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isDefaultGatewaySettable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isPrimaryDnsServerAddressSettable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isAlternateDnsServerAddressSettable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getIpv6Supported() != null) {
            _hashCode += getIpv6Supported().hashCode();
        }
        if (getArpRedirectSettable() != null) {
            _hashCode += getArpRedirectSettable().hashCode();
        }
        if (getMtuSettable() != null) {
            _hashCode += getMtuSettable().hashCode();
        }
        if (getHostNameAsTargetAddress() != null) {
            _hashCode += getHostNameAsTargetAddress().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostInternetScsiHbaIPCapabilities.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostInternetScsiHbaIPCapabilities"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressSettable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "addressSettable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipConfigurationMethodSettable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ipConfigurationMethodSettable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subnetMaskSettable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "subnetMaskSettable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultGatewaySettable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "defaultGatewaySettable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryDnsServerAddressSettable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "primaryDnsServerAddressSettable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternateDnsServerAddressSettable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "alternateDnsServerAddressSettable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipv6Supported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ipv6Supported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arpRedirectSettable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "arpRedirectSettable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mtuSettable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "mtuSettable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostNameAsTargetAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "hostNameAsTargetAddress"));
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
