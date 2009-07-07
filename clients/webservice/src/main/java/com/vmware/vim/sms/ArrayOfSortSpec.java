/**
 * ArrayOfSortSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim.sms;

public class ArrayOfSortSpec  implements java.io.Serializable {
    private com.vmware.vim.sms.SortSpec[] sortSpec;

    public ArrayOfSortSpec() {
    }

    public ArrayOfSortSpec(
           com.vmware.vim.sms.SortSpec[] sortSpec) {
           this.sortSpec = sortSpec;
    }


    /**
     * Gets the sortSpec value for this ArrayOfSortSpec.
     * 
     * @return sortSpec
     */
    public com.vmware.vim.sms.SortSpec[] getSortSpec() {
        return sortSpec;
    }


    /**
     * Sets the sortSpec value for this ArrayOfSortSpec.
     * 
     * @param sortSpec
     */
    public void setSortSpec(com.vmware.vim.sms.SortSpec[] sortSpec) {
        this.sortSpec = sortSpec;
    }

    public com.vmware.vim.sms.SortSpec getSortSpec(int i) {
        return this.sortSpec[i];
    }

    public void setSortSpec(int i, com.vmware.vim.sms.SortSpec _value) {
        this.sortSpec[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfSortSpec)) return false;
        ArrayOfSortSpec other = (ArrayOfSortSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sortSpec==null && other.getSortSpec()==null) || 
             (this.sortSpec!=null &&
              java.util.Arrays.equals(this.sortSpec, other.getSortSpec())));
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
        if (getSortSpec() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSortSpec());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSortSpec(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfSortSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sm1", "ArrayOfSortSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sortSpec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sm1", "SortSpec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sm1", "SortSpec"));
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
