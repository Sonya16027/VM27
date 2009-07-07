/**
 * ArrayOfPropertyFilterSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfPropertyFilterSpec  implements java.io.Serializable {
    private com.vmware.vim25.PropertyFilterSpec[] propertyFilterSpec;

    public ArrayOfPropertyFilterSpec() {
    }

    public ArrayOfPropertyFilterSpec(
           com.vmware.vim25.PropertyFilterSpec[] propertyFilterSpec) {
           this.propertyFilterSpec = propertyFilterSpec;
    }


    /**
     * Gets the propertyFilterSpec value for this ArrayOfPropertyFilterSpec.
     * 
     * @return propertyFilterSpec
     */
    public com.vmware.vim25.PropertyFilterSpec[] getPropertyFilterSpec() {
        return propertyFilterSpec;
    }


    /**
     * Sets the propertyFilterSpec value for this ArrayOfPropertyFilterSpec.
     * 
     * @param propertyFilterSpec
     */
    public void setPropertyFilterSpec(com.vmware.vim25.PropertyFilterSpec[] propertyFilterSpec) {
        this.propertyFilterSpec = propertyFilterSpec;
    }

    public com.vmware.vim25.PropertyFilterSpec getPropertyFilterSpec(int i) {
        return this.propertyFilterSpec[i];
    }

    public void setPropertyFilterSpec(int i, com.vmware.vim25.PropertyFilterSpec _value) {
        this.propertyFilterSpec[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfPropertyFilterSpec)) return false;
        ArrayOfPropertyFilterSpec other = (ArrayOfPropertyFilterSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.propertyFilterSpec==null && other.getPropertyFilterSpec()==null) || 
             (this.propertyFilterSpec!=null &&
              java.util.Arrays.equals(this.propertyFilterSpec, other.getPropertyFilterSpec())));
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
        if (getPropertyFilterSpec() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPropertyFilterSpec());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPropertyFilterSpec(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfPropertyFilterSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfPropertyFilterSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("propertyFilterSpec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "PropertyFilterSpec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "PropertyFilterSpec"));
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
