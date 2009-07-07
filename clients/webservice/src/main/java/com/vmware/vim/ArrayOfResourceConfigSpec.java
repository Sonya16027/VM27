/**
 * ArrayOfResourceConfigSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class ArrayOfResourceConfigSpec  implements java.io.Serializable {
    private com.vmware.vim.ResourceConfigSpec[] resourceConfigSpec;

    public ArrayOfResourceConfigSpec() {
    }

    public ArrayOfResourceConfigSpec(
           com.vmware.vim.ResourceConfigSpec[] resourceConfigSpec) {
           this.resourceConfigSpec = resourceConfigSpec;
    }


    /**
     * Gets the resourceConfigSpec value for this ArrayOfResourceConfigSpec.
     * 
     * @return resourceConfigSpec
     */
    public com.vmware.vim.ResourceConfigSpec[] getResourceConfigSpec() {
        return resourceConfigSpec;
    }


    /**
     * Sets the resourceConfigSpec value for this ArrayOfResourceConfigSpec.
     * 
     * @param resourceConfigSpec
     */
    public void setResourceConfigSpec(com.vmware.vim.ResourceConfigSpec[] resourceConfigSpec) {
        this.resourceConfigSpec = resourceConfigSpec;
    }

    public com.vmware.vim.ResourceConfigSpec getResourceConfigSpec(int i) {
        return this.resourceConfigSpec[i];
    }

    public void setResourceConfigSpec(int i, com.vmware.vim.ResourceConfigSpec _value) {
        this.resourceConfigSpec[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfResourceConfigSpec)) return false;
        ArrayOfResourceConfigSpec other = (ArrayOfResourceConfigSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.resourceConfigSpec==null && other.getResourceConfigSpec()==null) || 
             (this.resourceConfigSpec!=null &&
              java.util.Arrays.equals(this.resourceConfigSpec, other.getResourceConfigSpec())));
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
        if (getResourceConfigSpec() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResourceConfigSpec());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResourceConfigSpec(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfResourceConfigSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "ArrayOfResourceConfigSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourceConfigSpec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "ResourceConfigSpec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "ResourceConfigSpec"));
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