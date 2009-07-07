/**
 * ArrayOfFirewallProfileRulesetProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfFirewallProfileRulesetProfile  implements java.io.Serializable {
    private com.vmware.vim25.FirewallProfileRulesetProfile[] firewallProfileRulesetProfile;

    public ArrayOfFirewallProfileRulesetProfile() {
    }

    public ArrayOfFirewallProfileRulesetProfile(
           com.vmware.vim25.FirewallProfileRulesetProfile[] firewallProfileRulesetProfile) {
           this.firewallProfileRulesetProfile = firewallProfileRulesetProfile;
    }


    /**
     * Gets the firewallProfileRulesetProfile value for this ArrayOfFirewallProfileRulesetProfile.
     * 
     * @return firewallProfileRulesetProfile
     */
    public com.vmware.vim25.FirewallProfileRulesetProfile[] getFirewallProfileRulesetProfile() {
        return firewallProfileRulesetProfile;
    }


    /**
     * Sets the firewallProfileRulesetProfile value for this ArrayOfFirewallProfileRulesetProfile.
     * 
     * @param firewallProfileRulesetProfile
     */
    public void setFirewallProfileRulesetProfile(com.vmware.vim25.FirewallProfileRulesetProfile[] firewallProfileRulesetProfile) {
        this.firewallProfileRulesetProfile = firewallProfileRulesetProfile;
    }

    public com.vmware.vim25.FirewallProfileRulesetProfile getFirewallProfileRulesetProfile(int i) {
        return this.firewallProfileRulesetProfile[i];
    }

    public void setFirewallProfileRulesetProfile(int i, com.vmware.vim25.FirewallProfileRulesetProfile _value) {
        this.firewallProfileRulesetProfile[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfFirewallProfileRulesetProfile)) return false;
        ArrayOfFirewallProfileRulesetProfile other = (ArrayOfFirewallProfileRulesetProfile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.firewallProfileRulesetProfile==null && other.getFirewallProfileRulesetProfile()==null) || 
             (this.firewallProfileRulesetProfile!=null &&
              java.util.Arrays.equals(this.firewallProfileRulesetProfile, other.getFirewallProfileRulesetProfile())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getFirewallProfileRulesetProfile() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFirewallProfileRulesetProfile());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFirewallProfileRulesetProfile(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ArrayOfFirewallProfileRulesetProfile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfFirewallProfileRulesetProfile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firewallProfileRulesetProfile");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "FirewallProfileRulesetProfile"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "FirewallProfileRulesetProfile"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
