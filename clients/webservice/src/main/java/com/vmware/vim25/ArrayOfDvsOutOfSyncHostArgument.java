/**
 * ArrayOfDvsOutOfSyncHostArgument.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfDvsOutOfSyncHostArgument  implements java.io.Serializable {
    private com.vmware.vim25.DvsOutOfSyncHostArgument[] dvsOutOfSyncHostArgument;

    public ArrayOfDvsOutOfSyncHostArgument() {
    }

    public ArrayOfDvsOutOfSyncHostArgument(
           com.vmware.vim25.DvsOutOfSyncHostArgument[] dvsOutOfSyncHostArgument) {
           this.dvsOutOfSyncHostArgument = dvsOutOfSyncHostArgument;
    }


    /**
     * Gets the dvsOutOfSyncHostArgument value for this ArrayOfDvsOutOfSyncHostArgument.
     * 
     * @return dvsOutOfSyncHostArgument
     */
    public com.vmware.vim25.DvsOutOfSyncHostArgument[] getDvsOutOfSyncHostArgument() {
        return dvsOutOfSyncHostArgument;
    }


    /**
     * Sets the dvsOutOfSyncHostArgument value for this ArrayOfDvsOutOfSyncHostArgument.
     * 
     * @param dvsOutOfSyncHostArgument
     */
    public void setDvsOutOfSyncHostArgument(com.vmware.vim25.DvsOutOfSyncHostArgument[] dvsOutOfSyncHostArgument) {
        this.dvsOutOfSyncHostArgument = dvsOutOfSyncHostArgument;
    }

    public com.vmware.vim25.DvsOutOfSyncHostArgument getDvsOutOfSyncHostArgument(int i) {
        return this.dvsOutOfSyncHostArgument[i];
    }

    public void setDvsOutOfSyncHostArgument(int i, com.vmware.vim25.DvsOutOfSyncHostArgument _value) {
        this.dvsOutOfSyncHostArgument[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfDvsOutOfSyncHostArgument)) return false;
        ArrayOfDvsOutOfSyncHostArgument other = (ArrayOfDvsOutOfSyncHostArgument) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dvsOutOfSyncHostArgument==null && other.getDvsOutOfSyncHostArgument()==null) || 
             (this.dvsOutOfSyncHostArgument!=null &&
              java.util.Arrays.equals(this.dvsOutOfSyncHostArgument, other.getDvsOutOfSyncHostArgument())));
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
        if (getDvsOutOfSyncHostArgument() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDvsOutOfSyncHostArgument());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDvsOutOfSyncHostArgument(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfDvsOutOfSyncHostArgument.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfDvsOutOfSyncHostArgument"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dvsOutOfSyncHostArgument");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "DvsOutOfSyncHostArgument"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DvsOutOfSyncHostArgument"));
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
