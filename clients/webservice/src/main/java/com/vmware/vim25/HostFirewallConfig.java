/**
 * HostFirewallConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostFirewallConfig  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private com.vmware.vim25.HostFirewallConfigRuleSetConfig[] rule;

    private com.vmware.vim25.HostFirewallDefaultPolicy defaultBlockingPolicy;

    public HostFirewallConfig() {
    }

    public HostFirewallConfig(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           com.vmware.vim25.HostFirewallConfigRuleSetConfig[] rule,
           com.vmware.vim25.HostFirewallDefaultPolicy defaultBlockingPolicy) {
        super(
            dynamicType,
            dynamicProperty);
        this.rule = rule;
        this.defaultBlockingPolicy = defaultBlockingPolicy;
    }


    /**
     * Gets the rule value for this HostFirewallConfig.
     * 
     * @return rule
     */
    public com.vmware.vim25.HostFirewallConfigRuleSetConfig[] getRule() {
        return rule;
    }


    /**
     * Sets the rule value for this HostFirewallConfig.
     * 
     * @param rule
     */
    public void setRule(com.vmware.vim25.HostFirewallConfigRuleSetConfig[] rule) {
        this.rule = rule;
    }

    public com.vmware.vim25.HostFirewallConfigRuleSetConfig getRule(int i) {
        return this.rule[i];
    }

    public void setRule(int i, com.vmware.vim25.HostFirewallConfigRuleSetConfig _value) {
        this.rule[i] = _value;
    }


    /**
     * Gets the defaultBlockingPolicy value for this HostFirewallConfig.
     * 
     * @return defaultBlockingPolicy
     */
    public com.vmware.vim25.HostFirewallDefaultPolicy getDefaultBlockingPolicy() {
        return defaultBlockingPolicy;
    }


    /**
     * Sets the defaultBlockingPolicy value for this HostFirewallConfig.
     * 
     * @param defaultBlockingPolicy
     */
    public void setDefaultBlockingPolicy(com.vmware.vim25.HostFirewallDefaultPolicy defaultBlockingPolicy) {
        this.defaultBlockingPolicy = defaultBlockingPolicy;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostFirewallConfig)) return false;
        HostFirewallConfig other = (HostFirewallConfig) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.rule==null && other.getRule()==null) || 
             (this.rule!=null &&
              java.util.Arrays.equals(this.rule, other.getRule()))) &&
            ((this.defaultBlockingPolicy==null && other.getDefaultBlockingPolicy()==null) || 
             (this.defaultBlockingPolicy!=null &&
              this.defaultBlockingPolicy.equals(other.getDefaultBlockingPolicy())));
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
        if (getRule() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRule());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRule(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDefaultBlockingPolicy() != null) {
            _hashCode += getDefaultBlockingPolicy().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostFirewallConfig.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostFirewallConfig"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rule");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "rule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostFirewallConfigRuleSetConfig"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultBlockingPolicy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "defaultBlockingPolicy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostFirewallDefaultPolicy"));
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
