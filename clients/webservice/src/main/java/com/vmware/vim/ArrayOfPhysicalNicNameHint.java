/**
 * ArrayOfPhysicalNicNameHint.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class ArrayOfPhysicalNicNameHint  implements java.io.Serializable {
    private com.vmware.vim.PhysicalNicNameHint[] physicalNicNameHint;

    public ArrayOfPhysicalNicNameHint() {
    }

    public ArrayOfPhysicalNicNameHint(
           com.vmware.vim.PhysicalNicNameHint[] physicalNicNameHint) {
           this.physicalNicNameHint = physicalNicNameHint;
    }


    /**
     * Gets the physicalNicNameHint value for this ArrayOfPhysicalNicNameHint.
     * 
     * @return physicalNicNameHint
     */
    public com.vmware.vim.PhysicalNicNameHint[] getPhysicalNicNameHint() {
        return physicalNicNameHint;
    }


    /**
     * Sets the physicalNicNameHint value for this ArrayOfPhysicalNicNameHint.
     * 
     * @param physicalNicNameHint
     */
    public void setPhysicalNicNameHint(com.vmware.vim.PhysicalNicNameHint[] physicalNicNameHint) {
        this.physicalNicNameHint = physicalNicNameHint;
    }

    public com.vmware.vim.PhysicalNicNameHint getPhysicalNicNameHint(int i) {
        return this.physicalNicNameHint[i];
    }

    public void setPhysicalNicNameHint(int i, com.vmware.vim.PhysicalNicNameHint _value) {
        this.physicalNicNameHint[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfPhysicalNicNameHint)) return false;
        ArrayOfPhysicalNicNameHint other = (ArrayOfPhysicalNicNameHint) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.physicalNicNameHint==null && other.getPhysicalNicNameHint()==null) || 
             (this.physicalNicNameHint!=null &&
              java.util.Arrays.equals(this.physicalNicNameHint, other.getPhysicalNicNameHint())));
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
        if (getPhysicalNicNameHint() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPhysicalNicNameHint());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPhysicalNicNameHint(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfPhysicalNicNameHint.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "ArrayOfPhysicalNicNameHint"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("physicalNicNameHint");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "PhysicalNicNameHint"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "PhysicalNicNameHint"));
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
