/**
 * ArrayOfMissingProperty.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfMissingProperty  implements java.io.Serializable {
    private com.vmware.vim25.MissingProperty[] missingProperty;

    public ArrayOfMissingProperty() {
    }

    public ArrayOfMissingProperty(
           com.vmware.vim25.MissingProperty[] missingProperty) {
           this.missingProperty = missingProperty;
    }


    /**
     * Gets the missingProperty value for this ArrayOfMissingProperty.
     * 
     * @return missingProperty
     */
    public com.vmware.vim25.MissingProperty[] getMissingProperty() {
        return missingProperty;
    }


    /**
     * Sets the missingProperty value for this ArrayOfMissingProperty.
     * 
     * @param missingProperty
     */
    public void setMissingProperty(com.vmware.vim25.MissingProperty[] missingProperty) {
        this.missingProperty = missingProperty;
    }

    public com.vmware.vim25.MissingProperty getMissingProperty(int i) {
        return this.missingProperty[i];
    }

    public void setMissingProperty(int i, com.vmware.vim25.MissingProperty _value) {
        this.missingProperty[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfMissingProperty)) return false;
        ArrayOfMissingProperty other = (ArrayOfMissingProperty) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.missingProperty==null && other.getMissingProperty()==null) || 
             (this.missingProperty!=null &&
              java.util.Arrays.equals(this.missingProperty, other.getMissingProperty())));
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
        if (getMissingProperty() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMissingProperty());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMissingProperty(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfMissingProperty.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfMissingProperty"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("missingProperty");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "MissingProperty"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "MissingProperty"));
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
