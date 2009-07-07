/**
 * ArrayOfMethodActionArgument.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class ArrayOfMethodActionArgument  implements java.io.Serializable {
    private com.vmware.vim.MethodActionArgument[] methodActionArgument;

    public ArrayOfMethodActionArgument() {
    }

    public ArrayOfMethodActionArgument(
           com.vmware.vim.MethodActionArgument[] methodActionArgument) {
           this.methodActionArgument = methodActionArgument;
    }


    /**
     * Gets the methodActionArgument value for this ArrayOfMethodActionArgument.
     * 
     * @return methodActionArgument
     */
    public com.vmware.vim.MethodActionArgument[] getMethodActionArgument() {
        return methodActionArgument;
    }


    /**
     * Sets the methodActionArgument value for this ArrayOfMethodActionArgument.
     * 
     * @param methodActionArgument
     */
    public void setMethodActionArgument(com.vmware.vim.MethodActionArgument[] methodActionArgument) {
        this.methodActionArgument = methodActionArgument;
    }

    public com.vmware.vim.MethodActionArgument getMethodActionArgument(int i) {
        return this.methodActionArgument[i];
    }

    public void setMethodActionArgument(int i, com.vmware.vim.MethodActionArgument _value) {
        this.methodActionArgument[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfMethodActionArgument)) return false;
        ArrayOfMethodActionArgument other = (ArrayOfMethodActionArgument) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.methodActionArgument==null && other.getMethodActionArgument()==null) || 
             (this.methodActionArgument!=null &&
              java.util.Arrays.equals(this.methodActionArgument, other.getMethodActionArgument())));
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
        if (getMethodActionArgument() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMethodActionArgument());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMethodActionArgument(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfMethodActionArgument.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "ArrayOfMethodActionArgument"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("methodActionArgument");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "MethodActionArgument"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "MethodActionArgument"));
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
