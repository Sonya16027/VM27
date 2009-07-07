/**
 * ArrayOfDiagnosticManagerBundleInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfDiagnosticManagerBundleInfo  implements java.io.Serializable {
    private com.vmware.vim25.DiagnosticManagerBundleInfo[] diagnosticManagerBundleInfo;

    public ArrayOfDiagnosticManagerBundleInfo() {
    }

    public ArrayOfDiagnosticManagerBundleInfo(
           com.vmware.vim25.DiagnosticManagerBundleInfo[] diagnosticManagerBundleInfo) {
           this.diagnosticManagerBundleInfo = diagnosticManagerBundleInfo;
    }


    /**
     * Gets the diagnosticManagerBundleInfo value for this ArrayOfDiagnosticManagerBundleInfo.
     * 
     * @return diagnosticManagerBundleInfo
     */
    public com.vmware.vim25.DiagnosticManagerBundleInfo[] getDiagnosticManagerBundleInfo() {
        return diagnosticManagerBundleInfo;
    }


    /**
     * Sets the diagnosticManagerBundleInfo value for this ArrayOfDiagnosticManagerBundleInfo.
     * 
     * @param diagnosticManagerBundleInfo
     */
    public void setDiagnosticManagerBundleInfo(com.vmware.vim25.DiagnosticManagerBundleInfo[] diagnosticManagerBundleInfo) {
        this.diagnosticManagerBundleInfo = diagnosticManagerBundleInfo;
    }

    public com.vmware.vim25.DiagnosticManagerBundleInfo getDiagnosticManagerBundleInfo(int i) {
        return this.diagnosticManagerBundleInfo[i];
    }

    public void setDiagnosticManagerBundleInfo(int i, com.vmware.vim25.DiagnosticManagerBundleInfo _value) {
        this.diagnosticManagerBundleInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfDiagnosticManagerBundleInfo)) return false;
        ArrayOfDiagnosticManagerBundleInfo other = (ArrayOfDiagnosticManagerBundleInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.diagnosticManagerBundleInfo==null && other.getDiagnosticManagerBundleInfo()==null) || 
             (this.diagnosticManagerBundleInfo!=null &&
              java.util.Arrays.equals(this.diagnosticManagerBundleInfo, other.getDiagnosticManagerBundleInfo())));
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
        if (getDiagnosticManagerBundleInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDiagnosticManagerBundleInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDiagnosticManagerBundleInfo(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfDiagnosticManagerBundleInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfDiagnosticManagerBundleInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diagnosticManagerBundleInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "DiagnosticManagerBundleInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DiagnosticManagerBundleInfo"));
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
