/**
 * ArrayOfPerfQuerySpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class ArrayOfPerfQuerySpec  implements java.io.Serializable {
    private com.vmware.vim.PerfQuerySpec[] perfQuerySpec;

    public ArrayOfPerfQuerySpec() {
    }

    public ArrayOfPerfQuerySpec(
           com.vmware.vim.PerfQuerySpec[] perfQuerySpec) {
           this.perfQuerySpec = perfQuerySpec;
    }


    /**
     * Gets the perfQuerySpec value for this ArrayOfPerfQuerySpec.
     * 
     * @return perfQuerySpec
     */
    public com.vmware.vim.PerfQuerySpec[] getPerfQuerySpec() {
        return perfQuerySpec;
    }


    /**
     * Sets the perfQuerySpec value for this ArrayOfPerfQuerySpec.
     * 
     * @param perfQuerySpec
     */
    public void setPerfQuerySpec(com.vmware.vim.PerfQuerySpec[] perfQuerySpec) {
        this.perfQuerySpec = perfQuerySpec;
    }

    public com.vmware.vim.PerfQuerySpec getPerfQuerySpec(int i) {
        return this.perfQuerySpec[i];
    }

    public void setPerfQuerySpec(int i, com.vmware.vim.PerfQuerySpec _value) {
        this.perfQuerySpec[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfPerfQuerySpec)) return false;
        ArrayOfPerfQuerySpec other = (ArrayOfPerfQuerySpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.perfQuerySpec==null && other.getPerfQuerySpec()==null) || 
             (this.perfQuerySpec!=null &&
              java.util.Arrays.equals(this.perfQuerySpec, other.getPerfQuerySpec())));
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
        if (getPerfQuerySpec() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPerfQuerySpec());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPerfQuerySpec(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfPerfQuerySpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "ArrayOfPerfQuerySpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("perfQuerySpec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "PerfQuerySpec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "PerfQuerySpec"));
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
