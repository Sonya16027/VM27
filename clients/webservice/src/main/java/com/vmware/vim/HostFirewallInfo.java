/**
 * HostFirewallInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class HostFirewallInfo  extends com.vmware.vim.DynamicData  implements java.io.Serializable {
    private com.vmware.vim.HostFirewallDefaultPolicy defaultPolicy;

    private com.vmware.vim.HostFirewallRuleset[] ruleset;

    public HostFirewallInfo() {
    }

    public HostFirewallInfo(
           java.lang.String dynamicType,
           com.vmware.vim.DynamicProperty[] dynamicProperty,
           com.vmware.vim.HostFirewallDefaultPolicy defaultPolicy,
           com.vmware.vim.HostFirewallRuleset[] ruleset) {
        super(
            dynamicType,
            dynamicProperty);
        this.defaultPolicy = defaultPolicy;
        this.ruleset = ruleset;
    }


    /**
     * Gets the defaultPolicy value for this HostFirewallInfo.
     * 
     * @return defaultPolicy
     */
    public com.vmware.vim.HostFirewallDefaultPolicy getDefaultPolicy() {
        return defaultPolicy;
    }


    /**
     * Sets the defaultPolicy value for this HostFirewallInfo.
     * 
     * @param defaultPolicy
     */
    public void setDefaultPolicy(com.vmware.vim.HostFirewallDefaultPolicy defaultPolicy) {
        this.defaultPolicy = defaultPolicy;
    }


    /**
     * Gets the ruleset value for this HostFirewallInfo.
     * 
     * @return ruleset
     */
    public com.vmware.vim.HostFirewallRuleset[] getRuleset() {
        return ruleset;
    }


    /**
     * Sets the ruleset value for this HostFirewallInfo.
     * 
     * @param ruleset
     */
    public void setRuleset(com.vmware.vim.HostFirewallRuleset[] ruleset) {
        this.ruleset = ruleset;
    }

    public com.vmware.vim.HostFirewallRuleset getRuleset(int i) {
        return this.ruleset[i];
    }

    public void setRuleset(int i, com.vmware.vim.HostFirewallRuleset _value) {
        this.ruleset[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostFirewallInfo)) return false;
        HostFirewallInfo other = (HostFirewallInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.defaultPolicy==null && other.getDefaultPolicy()==null) || 
             (this.defaultPolicy!=null &&
              this.defaultPolicy.equals(other.getDefaultPolicy()))) &&
            ((this.ruleset==null && other.getRuleset()==null) || 
             (this.ruleset!=null &&
              java.util.Arrays.equals(this.ruleset, other.getRuleset())));
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
        if (getDefaultPolicy() != null) {
            _hashCode += getDefaultPolicy().hashCode();
        }
        if (getRuleset() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRuleset());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRuleset(), i);
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
        new org.apache.axis.description.TypeDesc(HostFirewallInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "HostFirewallInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultPolicy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "defaultPolicy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "HostFirewallDefaultPolicy"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ruleset");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "ruleset"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "HostFirewallRuleset"));
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
