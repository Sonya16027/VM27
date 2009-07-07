/**
 * ArrayOfPropertyFilterUpdate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim.sms;

public class ArrayOfPropertyFilterUpdate  implements java.io.Serializable {
    private com.vmware.vim.sms.PropertyFilterUpdate[] propertyFilterUpdate;

    public ArrayOfPropertyFilterUpdate() {
    }

    public ArrayOfPropertyFilterUpdate(
           com.vmware.vim.sms.PropertyFilterUpdate[] propertyFilterUpdate) {
           this.propertyFilterUpdate = propertyFilterUpdate;
    }


    /**
     * Gets the propertyFilterUpdate value for this ArrayOfPropertyFilterUpdate.
     * 
     * @return propertyFilterUpdate
     */
    public com.vmware.vim.sms.PropertyFilterUpdate[] getPropertyFilterUpdate() {
        return propertyFilterUpdate;
    }


    /**
     * Sets the propertyFilterUpdate value for this ArrayOfPropertyFilterUpdate.
     * 
     * @param propertyFilterUpdate
     */
    public void setPropertyFilterUpdate(com.vmware.vim.sms.PropertyFilterUpdate[] propertyFilterUpdate) {
        this.propertyFilterUpdate = propertyFilterUpdate;
    }

    public com.vmware.vim.sms.PropertyFilterUpdate getPropertyFilterUpdate(int i) {
        return this.propertyFilterUpdate[i];
    }

    public void setPropertyFilterUpdate(int i, com.vmware.vim.sms.PropertyFilterUpdate _value) {
        this.propertyFilterUpdate[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfPropertyFilterUpdate)) return false;
        ArrayOfPropertyFilterUpdate other = (ArrayOfPropertyFilterUpdate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.propertyFilterUpdate==null && other.getPropertyFilterUpdate()==null) || 
             (this.propertyFilterUpdate!=null &&
              java.util.Arrays.equals(this.propertyFilterUpdate, other.getPropertyFilterUpdate())));
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
        if (getPropertyFilterUpdate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPropertyFilterUpdate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPropertyFilterUpdate(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfPropertyFilterUpdate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sm1", "ArrayOfPropertyFilterUpdate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("propertyFilterUpdate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sm1", "PropertyFilterUpdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sm1", "PropertyFilterUpdate"));
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
