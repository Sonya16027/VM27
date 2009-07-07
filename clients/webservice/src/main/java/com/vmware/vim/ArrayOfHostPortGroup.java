/**
 * ArrayOfHostPortGroup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class ArrayOfHostPortGroup  implements java.io.Serializable {
    private com.vmware.vim.HostPortGroup[] hostPortGroup;

    public ArrayOfHostPortGroup() {
    }

    public ArrayOfHostPortGroup(
           com.vmware.vim.HostPortGroup[] hostPortGroup) {
           this.hostPortGroup = hostPortGroup;
    }


    /**
     * Gets the hostPortGroup value for this ArrayOfHostPortGroup.
     * 
     * @return hostPortGroup
     */
    public com.vmware.vim.HostPortGroup[] getHostPortGroup() {
        return hostPortGroup;
    }


    /**
     * Sets the hostPortGroup value for this ArrayOfHostPortGroup.
     * 
     * @param hostPortGroup
     */
    public void setHostPortGroup(com.vmware.vim.HostPortGroup[] hostPortGroup) {
        this.hostPortGroup = hostPortGroup;
    }

    public com.vmware.vim.HostPortGroup getHostPortGroup(int i) {
        return this.hostPortGroup[i];
    }

    public void setHostPortGroup(int i, com.vmware.vim.HostPortGroup _value) {
        this.hostPortGroup[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfHostPortGroup)) return false;
        ArrayOfHostPortGroup other = (ArrayOfHostPortGroup) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hostPortGroup==null && other.getHostPortGroup()==null) || 
             (this.hostPortGroup!=null &&
              java.util.Arrays.equals(this.hostPortGroup, other.getHostPortGroup())));
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
        if (getHostPortGroup() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostPortGroup());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostPortGroup(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfHostPortGroup.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "ArrayOfHostPortGroup"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostPortGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "HostPortGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "HostPortGroup"));
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
