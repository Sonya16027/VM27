/**
 * HostFirewallDefaultPolicy.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class HostFirewallDefaultPolicy  extends com.vmware.vim.DynamicData  implements java.io.Serializable {
    private java.lang.Boolean incomingBlocked;

    private java.lang.Boolean outgoingBlocked;

    public HostFirewallDefaultPolicy() {
    }

    public HostFirewallDefaultPolicy(
           java.lang.String dynamicType,
           com.vmware.vim.DynamicProperty[] dynamicProperty,
           java.lang.Boolean incomingBlocked,
           java.lang.Boolean outgoingBlocked) {
        super(
            dynamicType,
            dynamicProperty);
        this.incomingBlocked = incomingBlocked;
        this.outgoingBlocked = outgoingBlocked;
    }


    /**
     * Gets the incomingBlocked value for this HostFirewallDefaultPolicy.
     * 
     * @return incomingBlocked
     */
    public java.lang.Boolean getIncomingBlocked() {
        return incomingBlocked;
    }


    /**
     * Sets the incomingBlocked value for this HostFirewallDefaultPolicy.
     * 
     * @param incomingBlocked
     */
    public void setIncomingBlocked(java.lang.Boolean incomingBlocked) {
        this.incomingBlocked = incomingBlocked;
    }


    /**
     * Gets the outgoingBlocked value for this HostFirewallDefaultPolicy.
     * 
     * @return outgoingBlocked
     */
    public java.lang.Boolean getOutgoingBlocked() {
        return outgoingBlocked;
    }


    /**
     * Sets the outgoingBlocked value for this HostFirewallDefaultPolicy.
     * 
     * @param outgoingBlocked
     */
    public void setOutgoingBlocked(java.lang.Boolean outgoingBlocked) {
        this.outgoingBlocked = outgoingBlocked;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostFirewallDefaultPolicy)) return false;
        HostFirewallDefaultPolicy other = (HostFirewallDefaultPolicy) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.incomingBlocked==null && other.getIncomingBlocked()==null) || 
             (this.incomingBlocked!=null &&
              this.incomingBlocked.equals(other.getIncomingBlocked()))) &&
            ((this.outgoingBlocked==null && other.getOutgoingBlocked()==null) || 
             (this.outgoingBlocked!=null &&
              this.outgoingBlocked.equals(other.getOutgoingBlocked())));
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
        if (getIncomingBlocked() != null) {
            _hashCode += getIncomingBlocked().hashCode();
        }
        if (getOutgoingBlocked() != null) {
            _hashCode += getOutgoingBlocked().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostFirewallDefaultPolicy.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "HostFirewallDefaultPolicy"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("incomingBlocked");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "incomingBlocked"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outgoingBlocked");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "outgoingBlocked"));
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
