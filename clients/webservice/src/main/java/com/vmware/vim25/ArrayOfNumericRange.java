/**
 * ArrayOfNumericRange.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfNumericRange  implements java.io.Serializable {
    private com.vmware.vim25.NumericRange[] numericRange;

    public ArrayOfNumericRange() {
    }

    public ArrayOfNumericRange(
           com.vmware.vim25.NumericRange[] numericRange) {
           this.numericRange = numericRange;
    }


    /**
     * Gets the numericRange value for this ArrayOfNumericRange.
     * 
     * @return numericRange
     */
    public com.vmware.vim25.NumericRange[] getNumericRange() {
        return numericRange;
    }


    /**
     * Sets the numericRange value for this ArrayOfNumericRange.
     * 
     * @param numericRange
     */
    public void setNumericRange(com.vmware.vim25.NumericRange[] numericRange) {
        this.numericRange = numericRange;
    }

    public com.vmware.vim25.NumericRange getNumericRange(int i) {
        return this.numericRange[i];
    }

    public void setNumericRange(int i, com.vmware.vim25.NumericRange _value) {
        this.numericRange[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfNumericRange)) return false;
        ArrayOfNumericRange other = (ArrayOfNumericRange) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.numericRange==null && other.getNumericRange()==null) || 
             (this.numericRange!=null &&
              java.util.Arrays.equals(this.numericRange, other.getNumericRange())));
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
        if (getNumericRange() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNumericRange());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNumericRange(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfNumericRange.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfNumericRange"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numericRange");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "NumericRange"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "NumericRange"));
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
