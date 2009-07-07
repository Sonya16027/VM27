/**
 * ArrayOfPropertyChange.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfPropertyChange  implements java.io.Serializable {
    private com.vmware.vim25.PropertyChange[] propertyChange;

    public ArrayOfPropertyChange() {
    }

    public ArrayOfPropertyChange(
           com.vmware.vim25.PropertyChange[] propertyChange) {
           this.propertyChange = propertyChange;
    }


    /**
     * Gets the propertyChange value for this ArrayOfPropertyChange.
     * 
     * @return propertyChange
     */
    public com.vmware.vim25.PropertyChange[] getPropertyChange() {
        return propertyChange;
    }


    /**
     * Sets the propertyChange value for this ArrayOfPropertyChange.
     * 
     * @param propertyChange
     */
    public void setPropertyChange(com.vmware.vim25.PropertyChange[] propertyChange) {
        this.propertyChange = propertyChange;
    }

    public com.vmware.vim25.PropertyChange getPropertyChange(int i) {
        return this.propertyChange[i];
    }

    public void setPropertyChange(int i, com.vmware.vim25.PropertyChange _value) {
        this.propertyChange[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfPropertyChange)) return false;
        ArrayOfPropertyChange other = (ArrayOfPropertyChange) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.propertyChange==null && other.getPropertyChange()==null) || 
             (this.propertyChange!=null &&
              java.util.Arrays.equals(this.propertyChange, other.getPropertyChange())));
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
        if (getPropertyChange() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPropertyChange());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPropertyChange(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfPropertyChange.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfPropertyChange"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("propertyChange");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "PropertyChange"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "PropertyChange"));
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
