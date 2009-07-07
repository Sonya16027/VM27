/**
 * ArrayOfPropertySpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfPropertySpec  implements java.io.Serializable {
    private com.vmware.vim25.PropertySpec[] propertySpec;

    public ArrayOfPropertySpec() {
    }

    public ArrayOfPropertySpec(
           com.vmware.vim25.PropertySpec[] propertySpec) {
           this.propertySpec = propertySpec;
    }


    /**
     * Gets the propertySpec value for this ArrayOfPropertySpec.
     * 
     * @return propertySpec
     */
    public com.vmware.vim25.PropertySpec[] getPropertySpec() {
        return propertySpec;
    }


    /**
     * Sets the propertySpec value for this ArrayOfPropertySpec.
     * 
     * @param propertySpec
     */
    public void setPropertySpec(com.vmware.vim25.PropertySpec[] propertySpec) {
        this.propertySpec = propertySpec;
    }

    public com.vmware.vim25.PropertySpec getPropertySpec(int i) {
        return this.propertySpec[i];
    }

    public void setPropertySpec(int i, com.vmware.vim25.PropertySpec _value) {
        this.propertySpec[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfPropertySpec)) return false;
        ArrayOfPropertySpec other = (ArrayOfPropertySpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.propertySpec==null && other.getPropertySpec()==null) || 
             (this.propertySpec!=null &&
              java.util.Arrays.equals(this.propertySpec, other.getPropertySpec())));
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
        if (getPropertySpec() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPropertySpec());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPropertySpec(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfPropertySpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfPropertySpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("propertySpec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "PropertySpec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "PropertySpec"));
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