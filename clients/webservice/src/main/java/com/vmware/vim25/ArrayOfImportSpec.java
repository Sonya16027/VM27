/**
 * ArrayOfImportSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfImportSpec  implements java.io.Serializable {
    private com.vmware.vim25.ImportSpec[] importSpec;

    public ArrayOfImportSpec() {
    }

    public ArrayOfImportSpec(
           com.vmware.vim25.ImportSpec[] importSpec) {
           this.importSpec = importSpec;
    }


    /**
     * Gets the importSpec value for this ArrayOfImportSpec.
     * 
     * @return importSpec
     */
    public com.vmware.vim25.ImportSpec[] getImportSpec() {
        return importSpec;
    }


    /**
     * Sets the importSpec value for this ArrayOfImportSpec.
     * 
     * @param importSpec
     */
    public void setImportSpec(com.vmware.vim25.ImportSpec[] importSpec) {
        this.importSpec = importSpec;
    }

    public com.vmware.vim25.ImportSpec getImportSpec(int i) {
        return this.importSpec[i];
    }

    public void setImportSpec(int i, com.vmware.vim25.ImportSpec _value) {
        this.importSpec[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfImportSpec)) return false;
        ArrayOfImportSpec other = (ArrayOfImportSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.importSpec==null && other.getImportSpec()==null) || 
             (this.importSpec!=null &&
              java.util.Arrays.equals(this.importSpec, other.getImportSpec())));
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
        if (getImportSpec() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getImportSpec());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getImportSpec(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfImportSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfImportSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("importSpec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ImportSpec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ImportSpec"));
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
