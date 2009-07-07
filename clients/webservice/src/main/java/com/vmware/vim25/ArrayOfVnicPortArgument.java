/**
 * ArrayOfVnicPortArgument.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfVnicPortArgument  implements java.io.Serializable {
    private com.vmware.vim25.VnicPortArgument[] vnicPortArgument;

    public ArrayOfVnicPortArgument() {
    }

    public ArrayOfVnicPortArgument(
           com.vmware.vim25.VnicPortArgument[] vnicPortArgument) {
           this.vnicPortArgument = vnicPortArgument;
    }


    /**
     * Gets the vnicPortArgument value for this ArrayOfVnicPortArgument.
     * 
     * @return vnicPortArgument
     */
    public com.vmware.vim25.VnicPortArgument[] getVnicPortArgument() {
        return vnicPortArgument;
    }


    /**
     * Sets the vnicPortArgument value for this ArrayOfVnicPortArgument.
     * 
     * @param vnicPortArgument
     */
    public void setVnicPortArgument(com.vmware.vim25.VnicPortArgument[] vnicPortArgument) {
        this.vnicPortArgument = vnicPortArgument;
    }

    public com.vmware.vim25.VnicPortArgument getVnicPortArgument(int i) {
        return this.vnicPortArgument[i];
    }

    public void setVnicPortArgument(int i, com.vmware.vim25.VnicPortArgument _value) {
        this.vnicPortArgument[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfVnicPortArgument)) return false;
        ArrayOfVnicPortArgument other = (ArrayOfVnicPortArgument) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.vnicPortArgument==null && other.getVnicPortArgument()==null) || 
             (this.vnicPortArgument!=null &&
              java.util.Arrays.equals(this.vnicPortArgument, other.getVnicPortArgument())));
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
        if (getVnicPortArgument() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVnicPortArgument());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVnicPortArgument(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfVnicPortArgument.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfVnicPortArgument"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vnicPortArgument");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "VnicPortArgument"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VnicPortArgument"));
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
