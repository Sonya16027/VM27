/**
 * HostNetCapabilities.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostNetCapabilities  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private boolean canSetPhysicalNicLinkSpeed;

    private boolean supportsNicTeaming;

    private java.lang.String[] nicTeamingPolicy;

    private boolean supportsVlan;

    private boolean usesServiceConsoleNic;

    private boolean supportsNetworkHints;

    private java.lang.Integer maxPortGroupsPerVswitch;

    private boolean vswitchConfigSupported;

    private boolean vnicConfigSupported;

    private boolean ipRouteConfigSupported;

    private boolean dnsConfigSupported;

    private boolean dhcpOnVnicSupported;

    private java.lang.Boolean ipV6Supported;

    public HostNetCapabilities() {
    }

    public HostNetCapabilities(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           boolean canSetPhysicalNicLinkSpeed,
           boolean supportsNicTeaming,
           java.lang.String[] nicTeamingPolicy,
           boolean supportsVlan,
           boolean usesServiceConsoleNic,
           boolean supportsNetworkHints,
           java.lang.Integer maxPortGroupsPerVswitch,
           boolean vswitchConfigSupported,
           boolean vnicConfigSupported,
           boolean ipRouteConfigSupported,
           boolean dnsConfigSupported,
           boolean dhcpOnVnicSupported,
           java.lang.Boolean ipV6Supported) {
        super(
            dynamicType,
            dynamicProperty);
        this.canSetPhysicalNicLinkSpeed = canSetPhysicalNicLinkSpeed;
        this.supportsNicTeaming = supportsNicTeaming;
        this.nicTeamingPolicy = nicTeamingPolicy;
        this.supportsVlan = supportsVlan;
        this.usesServiceConsoleNic = usesServiceConsoleNic;
        this.supportsNetworkHints = supportsNetworkHints;
        this.maxPortGroupsPerVswitch = maxPortGroupsPerVswitch;
        this.vswitchConfigSupported = vswitchConfigSupported;
        this.vnicConfigSupported = vnicConfigSupported;
        this.ipRouteConfigSupported = ipRouteConfigSupported;
        this.dnsConfigSupported = dnsConfigSupported;
        this.dhcpOnVnicSupported = dhcpOnVnicSupported;
        this.ipV6Supported = ipV6Supported;
    }


    /**
     * Gets the canSetPhysicalNicLinkSpeed value for this HostNetCapabilities.
     * 
     * @return canSetPhysicalNicLinkSpeed
     */
    public boolean isCanSetPhysicalNicLinkSpeed() {
        return canSetPhysicalNicLinkSpeed;
    }


    /**
     * Sets the canSetPhysicalNicLinkSpeed value for this HostNetCapabilities.
     * 
     * @param canSetPhysicalNicLinkSpeed
     */
    public void setCanSetPhysicalNicLinkSpeed(boolean canSetPhysicalNicLinkSpeed) {
        this.canSetPhysicalNicLinkSpeed = canSetPhysicalNicLinkSpeed;
    }


    /**
     * Gets the supportsNicTeaming value for this HostNetCapabilities.
     * 
     * @return supportsNicTeaming
     */
    public boolean isSupportsNicTeaming() {
        return supportsNicTeaming;
    }


    /**
     * Sets the supportsNicTeaming value for this HostNetCapabilities.
     * 
     * @param supportsNicTeaming
     */
    public void setSupportsNicTeaming(boolean supportsNicTeaming) {
        this.supportsNicTeaming = supportsNicTeaming;
    }


    /**
     * Gets the nicTeamingPolicy value for this HostNetCapabilities.
     * 
     * @return nicTeamingPolicy
     */
    public java.lang.String[] getNicTeamingPolicy() {
        return nicTeamingPolicy;
    }


    /**
     * Sets the nicTeamingPolicy value for this HostNetCapabilities.
     * 
     * @param nicTeamingPolicy
     */
    public void setNicTeamingPolicy(java.lang.String[] nicTeamingPolicy) {
        this.nicTeamingPolicy = nicTeamingPolicy;
    }

    public java.lang.String getNicTeamingPolicy(int i) {
        return this.nicTeamingPolicy[i];
    }

    public void setNicTeamingPolicy(int i, java.lang.String _value) {
        this.nicTeamingPolicy[i] = _value;
    }


    /**
     * Gets the supportsVlan value for this HostNetCapabilities.
     * 
     * @return supportsVlan
     */
    public boolean isSupportsVlan() {
        return supportsVlan;
    }


    /**
     * Sets the supportsVlan value for this HostNetCapabilities.
     * 
     * @param supportsVlan
     */
    public void setSupportsVlan(boolean supportsVlan) {
        this.supportsVlan = supportsVlan;
    }


    /**
     * Gets the usesServiceConsoleNic value for this HostNetCapabilities.
     * 
     * @return usesServiceConsoleNic
     */
    public boolean isUsesServiceConsoleNic() {
        return usesServiceConsoleNic;
    }


    /**
     * Sets the usesServiceConsoleNic value for this HostNetCapabilities.
     * 
     * @param usesServiceConsoleNic
     */
    public void setUsesServiceConsoleNic(boolean usesServiceConsoleNic) {
        this.usesServiceConsoleNic = usesServiceConsoleNic;
    }


    /**
     * Gets the supportsNetworkHints value for this HostNetCapabilities.
     * 
     * @return supportsNetworkHints
     */
    public boolean isSupportsNetworkHints() {
        return supportsNetworkHints;
    }


    /**
     * Sets the supportsNetworkHints value for this HostNetCapabilities.
     * 
     * @param supportsNetworkHints
     */
    public void setSupportsNetworkHints(boolean supportsNetworkHints) {
        this.supportsNetworkHints = supportsNetworkHints;
    }


    /**
     * Gets the maxPortGroupsPerVswitch value for this HostNetCapabilities.
     * 
     * @return maxPortGroupsPerVswitch
     */
    public java.lang.Integer getMaxPortGroupsPerVswitch() {
        return maxPortGroupsPerVswitch;
    }


    /**
     * Sets the maxPortGroupsPerVswitch value for this HostNetCapabilities.
     * 
     * @param maxPortGroupsPerVswitch
     */
    public void setMaxPortGroupsPerVswitch(java.lang.Integer maxPortGroupsPerVswitch) {
        this.maxPortGroupsPerVswitch = maxPortGroupsPerVswitch;
    }


    /**
     * Gets the vswitchConfigSupported value for this HostNetCapabilities.
     * 
     * @return vswitchConfigSupported
     */
    public boolean isVswitchConfigSupported() {
        return vswitchConfigSupported;
    }


    /**
     * Sets the vswitchConfigSupported value for this HostNetCapabilities.
     * 
     * @param vswitchConfigSupported
     */
    public void setVswitchConfigSupported(boolean vswitchConfigSupported) {
        this.vswitchConfigSupported = vswitchConfigSupported;
    }


    /**
     * Gets the vnicConfigSupported value for this HostNetCapabilities.
     * 
     * @return vnicConfigSupported
     */
    public boolean isVnicConfigSupported() {
        return vnicConfigSupported;
    }


    /**
     * Sets the vnicConfigSupported value for this HostNetCapabilities.
     * 
     * @param vnicConfigSupported
     */
    public void setVnicConfigSupported(boolean vnicConfigSupported) {
        this.vnicConfigSupported = vnicConfigSupported;
    }


    /**
     * Gets the ipRouteConfigSupported value for this HostNetCapabilities.
     * 
     * @return ipRouteConfigSupported
     */
    public boolean isIpRouteConfigSupported() {
        return ipRouteConfigSupported;
    }


    /**
     * Sets the ipRouteConfigSupported value for this HostNetCapabilities.
     * 
     * @param ipRouteConfigSupported
     */
    public void setIpRouteConfigSupported(boolean ipRouteConfigSupported) {
        this.ipRouteConfigSupported = ipRouteConfigSupported;
    }


    /**
     * Gets the dnsConfigSupported value for this HostNetCapabilities.
     * 
     * @return dnsConfigSupported
     */
    public boolean isDnsConfigSupported() {
        return dnsConfigSupported;
    }


    /**
     * Sets the dnsConfigSupported value for this HostNetCapabilities.
     * 
     * @param dnsConfigSupported
     */
    public void setDnsConfigSupported(boolean dnsConfigSupported) {
        this.dnsConfigSupported = dnsConfigSupported;
    }


    /**
     * Gets the dhcpOnVnicSupported value for this HostNetCapabilities.
     * 
     * @return dhcpOnVnicSupported
     */
    public boolean isDhcpOnVnicSupported() {
        return dhcpOnVnicSupported;
    }


    /**
     * Sets the dhcpOnVnicSupported value for this HostNetCapabilities.
     * 
     * @param dhcpOnVnicSupported
     */
    public void setDhcpOnVnicSupported(boolean dhcpOnVnicSupported) {
        this.dhcpOnVnicSupported = dhcpOnVnicSupported;
    }


    /**
     * Gets the ipV6Supported value for this HostNetCapabilities.
     * 
     * @return ipV6Supported
     */
    public java.lang.Boolean getIpV6Supported() {
        return ipV6Supported;
    }


    /**
     * Sets the ipV6Supported value for this HostNetCapabilities.
     * 
     * @param ipV6Supported
     */
    public void setIpV6Supported(java.lang.Boolean ipV6Supported) {
        this.ipV6Supported = ipV6Supported;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostNetCapabilities)) return false;
        HostNetCapabilities other = (HostNetCapabilities) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.canSetPhysicalNicLinkSpeed == other.isCanSetPhysicalNicLinkSpeed() &&
            this.supportsNicTeaming == other.isSupportsNicTeaming() &&
            ((this.nicTeamingPolicy==null && other.getNicTeamingPolicy()==null) || 
             (this.nicTeamingPolicy!=null &&
              java.util.Arrays.equals(this.nicTeamingPolicy, other.getNicTeamingPolicy()))) &&
            this.supportsVlan == other.isSupportsVlan() &&
            this.usesServiceConsoleNic == other.isUsesServiceConsoleNic() &&
            this.supportsNetworkHints == other.isSupportsNetworkHints() &&
            ((this.maxPortGroupsPerVswitch==null && other.getMaxPortGroupsPerVswitch()==null) || 
             (this.maxPortGroupsPerVswitch!=null &&
              this.maxPortGroupsPerVswitch.equals(other.getMaxPortGroupsPerVswitch()))) &&
            this.vswitchConfigSupported == other.isVswitchConfigSupported() &&
            this.vnicConfigSupported == other.isVnicConfigSupported() &&
            this.ipRouteConfigSupported == other.isIpRouteConfigSupported() &&
            this.dnsConfigSupported == other.isDnsConfigSupported() &&
            this.dhcpOnVnicSupported == other.isDhcpOnVnicSupported() &&
            ((this.ipV6Supported==null && other.getIpV6Supported()==null) || 
             (this.ipV6Supported!=null &&
              this.ipV6Supported.equals(other.getIpV6Supported())));
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
        _hashCode += (isCanSetPhysicalNicLinkSpeed() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isSupportsNicTeaming() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getNicTeamingPolicy() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNicTeamingPolicy());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNicTeamingPolicy(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isSupportsVlan() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isUsesServiceConsoleNic() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isSupportsNetworkHints() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getMaxPortGroupsPerVswitch() != null) {
            _hashCode += getMaxPortGroupsPerVswitch().hashCode();
        }
        _hashCode += (isVswitchConfigSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isVnicConfigSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIpRouteConfigSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isDnsConfigSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isDhcpOnVnicSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getIpV6Supported() != null) {
            _hashCode += getIpV6Supported().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostNetCapabilities.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostNetCapabilities"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canSetPhysicalNicLinkSpeed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "canSetPhysicalNicLinkSpeed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supportsNicTeaming");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "supportsNicTeaming"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nicTeamingPolicy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "nicTeamingPolicy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supportsVlan");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "supportsVlan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usesServiceConsoleNic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "usesServiceConsoleNic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supportsNetworkHints");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "supportsNetworkHints"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxPortGroupsPerVswitch");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "maxPortGroupsPerVswitch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vswitchConfigSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vswitchConfigSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vnicConfigSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vnicConfigSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipRouteConfigSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ipRouteConfigSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dnsConfigSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "dnsConfigSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dhcpOnVnicSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "dhcpOnVnicSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipV6Supported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ipV6Supported"));
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
