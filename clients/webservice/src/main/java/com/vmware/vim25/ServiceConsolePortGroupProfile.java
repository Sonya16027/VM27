/**
 * ServiceConsolePortGroupProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ServiceConsolePortGroupProfile  extends com.vmware.vim25.PortGroupProfile  implements java.io.Serializable {
    private com.vmware.vim25.IpAddressProfile ipConfig;

    public ServiceConsolePortGroupProfile() {
    }

    public ServiceConsolePortGroupProfile(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           boolean enabled,
           com.vmware.vim25.ProfilePolicy[] policy,
           java.lang.String key,
           java.lang.String name,
           com.vmware.vim25.VlanProfile vlan,
           com.vmware.vim25.VirtualSwitchSelectionProfile vswitch,
           com.vmware.vim25.NetworkPolicyProfile networkPolicy,
           com.vmware.vim25.IpAddressProfile ipConfig) {
        super(
            dynamicType,
            dynamicProperty,
            enabled,
            policy,
            key,
            name,
            vlan,
            vswitch,
            networkPolicy);
        this.ipConfig = ipConfig;
    }


    /**
     * Gets the ipConfig value for this ServiceConsolePortGroupProfile.
     * 
     * @return ipConfig
     */
    public com.vmware.vim25.IpAddressProfile getIpConfig() {
        return ipConfig;
    }


    /**
     * Sets the ipConfig value for this ServiceConsolePortGroupProfile.
     * 
     * @param ipConfig
     */
    public void setIpConfig(com.vmware.vim25.IpAddressProfile ipConfig) {
        this.ipConfig = ipConfig;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServiceConsolePortGroupProfile)) return false;
        ServiceConsolePortGroupProfile other = (ServiceConsolePortGroupProfile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.ipConfig==null && other.getIpConfig()==null) || 
             (this.ipConfig!=null &&
              this.ipConfig.equals(other.getIpConfig())));
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
        if (getIpConfig() != null) {
            _hashCode += getIpConfig().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServiceConsolePortGroupProfile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ServiceConsolePortGroupProfile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ipConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "IpAddressProfile"));
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
