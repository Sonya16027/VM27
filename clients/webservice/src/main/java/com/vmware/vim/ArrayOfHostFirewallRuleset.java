/**
 * ArrayOfHostFirewallRuleset.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class ArrayOfHostFirewallRuleset  implements java.io.Serializable {
    private com.vmware.vim.HostFirewallRuleset[] hostFirewallRuleset;

    public ArrayOfHostFirewallRuleset() {
    }

    public ArrayOfHostFirewallRuleset(
           com.vmware.vim.HostFirewallRuleset[] hostFirewallRuleset) {
           this.hostFirewallRuleset = hostFirewallRuleset;
    }


    /**
     * Gets the hostFirewallRuleset value for this ArrayOfHostFirewallRuleset.
     * 
     * @return hostFirewallRuleset
     */
    public com.vmware.vim.HostFirewallRuleset[] getHostFirewallRuleset() {
        return hostFirewallRuleset;
    }


    /**
     * Sets the hostFirewallRuleset value for this ArrayOfHostFirewallRuleset.
     * 
     * @param hostFirewallRuleset
     */
    public void setHostFirewallRuleset(com.vmware.vim.HostFirewallRuleset[] hostFirewallRuleset) {
        this.hostFirewallRuleset = hostFirewallRuleset;
    }

    public com.vmware.vim.HostFirewallRuleset getHostFirewallRuleset(int i) {
        return this.hostFirewallRuleset[i];
    }

    public void setHostFirewallRuleset(int i, com.vmware.vim.HostFirewallRuleset _value) {
        this.hostFirewallRuleset[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfHostFirewallRuleset)) return false;
        ArrayOfHostFirewallRuleset other = (ArrayOfHostFirewallRuleset) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hostFirewallRuleset==null && other.getHostFirewallRuleset()==null) || 
             (this.hostFirewallRuleset!=null &&
              java.util.Arrays.equals(this.hostFirewallRuleset, other.getHostFirewallRuleset())));
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
        if (getHostFirewallRuleset() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostFirewallRuleset());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostFirewallRuleset(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfHostFirewallRuleset.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "ArrayOfHostFirewallRuleset"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostFirewallRuleset");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "HostFirewallRuleset"));
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
