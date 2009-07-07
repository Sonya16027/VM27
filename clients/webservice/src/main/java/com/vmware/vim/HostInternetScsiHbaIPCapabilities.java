/**
 * HostInternetScsiHbaIPCapabilities.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class HostInternetScsiHbaIPCapabilities  extends com.vmware.vim.DynamicData  implements java.io.Serializable {
    private boolean addressSettable;

    private boolean ipConfigurationMethodSettable;

    private boolean subnetMaskSettable;

    private boolean defaultGatewaySettable;

    private boolean primaryDnsServerAddressSettable;

    private boolean alternateDnsServerAddressSettable;

    public HostInternetScsiHbaIPCapabilities() {
    }

    public HostInternetScsiHbaIPCapabilities(
           java.lang.String dynamicType,
           com.vmware.vim.DynamicProperty[] dynamicProperty,
           boolean addressSettable,
           boolean ipConfigurationMethodSettable,
           boolean subnetMaskSettable,
           boolean defaultGatewaySettable,
           boolean primaryDnsServerAddressSettable,
           boolean alternateDnsServerAddressSettable) {
        super(
            dynamicType,
            dynamicProperty);
        this.addressSettable = addressSettable;
        this.ipConfigurationMethodSettable = ipConfigurationMethodSettable;
        this.subnetMaskSettable = subnetMaskSettable;
        this.defaultGatewaySettable = defaultGatewaySettable;
        this.primaryDnsServerAddressSettable = primaryDnsServerAddressSettable;
        this.alternateDnsServerAddressSettable = alternateDnsServerAddressSettable;
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
            this.alternateDnsServerAddressSettable == other.isAlternateDnsServerAddressSettable();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostInternetScsiHbaIPCapabilities.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "HostInternetScsiHbaIPCapabilities"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressSettable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "addressSettable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipConfigurationMethodSettable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "ipConfigurationMethodSettable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subnetMaskSettable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "subnetMaskSettable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultGatewaySettable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "defaultGatewaySettable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryDnsServerAddressSettable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "primaryDnsServerAddressSettable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternateDnsServerAddressSettable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "alternateDnsServerAddressSettable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
