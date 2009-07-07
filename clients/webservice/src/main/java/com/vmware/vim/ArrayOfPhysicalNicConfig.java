/**
 * ArrayOfPhysicalNicConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class ArrayOfPhysicalNicConfig  implements java.io.Serializable {
    private com.vmware.vim.PhysicalNicConfig[] physicalNicConfig;

    public ArrayOfPhysicalNicConfig() {
    }

    public ArrayOfPhysicalNicConfig(
           com.vmware.vim.PhysicalNicConfig[] physicalNicConfig) {
           this.physicalNicConfig = physicalNicConfig;
    }


    /**
     * Gets the physicalNicConfig value for this ArrayOfPhysicalNicConfig.
     * 
     * @return physicalNicConfig
     */
    public com.vmware.vim.PhysicalNicConfig[] getPhysicalNicConfig() {
        return physicalNicConfig;
    }


    /**
     * Sets the physicalNicConfig value for this ArrayOfPhysicalNicConfig.
     * 
     * @param physicalNicConfig
     */
    public void setPhysicalNicConfig(com.vmware.vim.PhysicalNicConfig[] physicalNicConfig) {
        this.physicalNicConfig = physicalNicConfig;
    }

    public com.vmware.vim.PhysicalNicConfig getPhysicalNicConfig(int i) {
        return this.physicalNicConfig[i];
    }

    public void setPhysicalNicConfig(int i, com.vmware.vim.PhysicalNicConfig _value) {
        this.physicalNicConfig[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfPhysicalNicConfig)) return false;
        ArrayOfPhysicalNicConfig other = (ArrayOfPhysicalNicConfig) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.physicalNicConfig==null && other.getPhysicalNicConfig()==null) || 
             (this.physicalNicConfig!=null &&
              java.util.Arrays.equals(this.physicalNicConfig, other.getPhysicalNicConfig())));
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
        if (getPhysicalNicConfig() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPhysicalNicConfig());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPhysicalNicConfig(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfPhysicalNicConfig.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "ArrayOfPhysicalNicConfig"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("physicalNicConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "PhysicalNicConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "PhysicalNicConfig"));
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
