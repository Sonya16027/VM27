/**
 * PortGroupProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class PortGroupProfile  extends com.vmware.vim25.ApplyProfile  implements java.io.Serializable {
    private java.lang.String key;

    private java.lang.String name;

    private com.vmware.vim25.VlanProfile vlan;

    private com.vmware.vim25.VirtualSwitchSelectionProfile vswitch;

    private com.vmware.vim25.NetworkPolicyProfile networkPolicy;

    public PortGroupProfile() {
    }

    public PortGroupProfile(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           boolean enabled,
           com.vmware.vim25.ProfilePolicy[] policy,
           java.lang.String key,
           java.lang.String name,
           com.vmware.vim25.VlanProfile vlan,
           com.vmware.vim25.VirtualSwitchSelectionProfile vswitch,
           com.vmware.vim25.NetworkPolicyProfile networkPolicy) {
        super(
            dynamicType,
            dynamicProperty,
            enabled,
            policy);
        this.key = key;
        this.name = name;
        this.vlan = vlan;
        this.vswitch = vswitch;
        this.networkPolicy = networkPolicy;
    }


    /**
     * Gets the key value for this PortGroupProfile.
     * 
     * @return key
     */
    public java.lang.String getKey() {
        return key;
    }


    /**
     * Sets the key value for this PortGroupProfile.
     * 
     * @param key
     */
    public void setKey(java.lang.String key) {
        this.key = key;
    }


    /**
     * Gets the name value for this PortGroupProfile.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this PortGroupProfile.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the vlan value for this PortGroupProfile.
     * 
     * @return vlan
     */
    public com.vmware.vim25.VlanProfile getVlan() {
        return vlan;
    }


    /**
     * Sets the vlan value for this PortGroupProfile.
     * 
     * @param vlan
     */
    public void setVlan(com.vmware.vim25.VlanProfile vlan) {
        this.vlan = vlan;
    }


    /**
     * Gets the vswitch value for this PortGroupProfile.
     * 
     * @return vswitch
     */
    public com.vmware.vim25.VirtualSwitchSelectionProfile getVswitch() {
        return vswitch;
    }


    /**
     * Sets the vswitch value for this PortGroupProfile.
     * 
     * @param vswitch
     */
    public void setVswitch(com.vmware.vim25.VirtualSwitchSelectionProfile vswitch) {
        this.vswitch = vswitch;
    }


    /**
     * Gets the networkPolicy value for this PortGroupProfile.
     * 
     * @return networkPolicy
     */
    public com.vmware.vim25.NetworkPolicyProfile getNetworkPolicy() {
        return networkPolicy;
    }


    /**
     * Sets the networkPolicy value for this PortGroupProfile.
     * 
     * @param networkPolicy
     */
    public void setNetworkPolicy(com.vmware.vim25.NetworkPolicyProfile networkPolicy) {
        this.networkPolicy = networkPolicy;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PortGroupProfile)) return false;
        PortGroupProfile other = (PortGroupProfile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.key==null && other.getKey()==null) || 
             (this.key!=null &&
              this.key.equals(other.getKey()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.vlan==null && other.getVlan()==null) || 
             (this.vlan!=null &&
              this.vlan.equals(other.getVlan()))) &&
            ((this.vswitch==null && other.getVswitch()==null) || 
             (this.vswitch!=null &&
              this.vswitch.equals(other.getVswitch()))) &&
            ((this.networkPolicy==null && other.getNetworkPolicy()==null) || 
             (this.networkPolicy!=null &&
              this.networkPolicy.equals(other.getNetworkPolicy())));
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
        if (getKey() != null) {
            _hashCode += getKey().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getVlan() != null) {
            _hashCode += getVlan().hashCode();
        }
        if (getVswitch() != null) {
            _hashCode += getVswitch().hashCode();
        }
        if (getNetworkPolicy() != null) {
            _hashCode += getNetworkPolicy().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PortGroupProfile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "PortGroupProfile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "key"));
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
        elemField.setFieldName("vlan");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vlan"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VlanProfile"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vswitch");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vswitch"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualSwitchSelectionProfile"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkPolicy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "networkPolicy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "NetworkPolicyProfile"));
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
