/**
 * HostFirewallConfigRuleSetConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostFirewallConfigRuleSetConfig  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private java.lang.String rulesetId;

    private boolean enabled;

    public HostFirewallConfigRuleSetConfig() {
    }

    public HostFirewallConfigRuleSetConfig(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           java.lang.String rulesetId,
           boolean enabled) {
        super(
            dynamicType,
            dynamicProperty);
        this.rulesetId = rulesetId;
        this.enabled = enabled;
    }


    /**
     * Gets the rulesetId value for this HostFirewallConfigRuleSetConfig.
     * 
     * @return rulesetId
     */
    public java.lang.String getRulesetId() {
        return rulesetId;
    }


    /**
     * Sets the rulesetId value for this HostFirewallConfigRuleSetConfig.
     * 
     * @param rulesetId
     */
    public void setRulesetId(java.lang.String rulesetId) {
        this.rulesetId = rulesetId;
    }


    /**
     * Gets the enabled value for this HostFirewallConfigRuleSetConfig.
     * 
     * @return enabled
     */
    public boolean isEnabled() {
        return enabled;
    }


    /**
     * Sets the enabled value for this HostFirewallConfigRuleSetConfig.
     * 
     * @param enabled
     */
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostFirewallConfigRuleSetConfig)) return false;
        HostFirewallConfigRuleSetConfig other = (HostFirewallConfigRuleSetConfig) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.rulesetId==null && other.getRulesetId()==null) || 
             (this.rulesetId!=null &&
              this.rulesetId.equals(other.getRulesetId()))) &&
            this.enabled == other.isEnabled();
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
        if (getRulesetId() != null) {
            _hashCode += getRulesetId().hashCode();
        }
        _hashCode += (isEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostFirewallConfigRuleSetConfig.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostFirewallConfigRuleSetConfig"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rulesetId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "rulesetId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "enabled"));
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
