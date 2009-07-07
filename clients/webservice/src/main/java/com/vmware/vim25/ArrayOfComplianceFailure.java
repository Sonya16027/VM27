/**
 * ArrayOfComplianceFailure.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfComplianceFailure  implements java.io.Serializable {
    private com.vmware.vim25.ComplianceFailure[] complianceFailure;

    public ArrayOfComplianceFailure() {
    }

    public ArrayOfComplianceFailure(
           com.vmware.vim25.ComplianceFailure[] complianceFailure) {
           this.complianceFailure = complianceFailure;
    }


    /**
     * Gets the complianceFailure value for this ArrayOfComplianceFailure.
     * 
     * @return complianceFailure
     */
    public com.vmware.vim25.ComplianceFailure[] getComplianceFailure() {
        return complianceFailure;
    }


    /**
     * Sets the complianceFailure value for this ArrayOfComplianceFailure.
     * 
     * @param complianceFailure
     */
    public void setComplianceFailure(com.vmware.vim25.ComplianceFailure[] complianceFailure) {
        this.complianceFailure = complianceFailure;
    }

    public com.vmware.vim25.ComplianceFailure getComplianceFailure(int i) {
        return this.complianceFailure[i];
    }

    public void setComplianceFailure(int i, com.vmware.vim25.ComplianceFailure _value) {
        this.complianceFailure[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfComplianceFailure)) return false;
        ArrayOfComplianceFailure other = (ArrayOfComplianceFailure) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.complianceFailure==null && other.getComplianceFailure()==null) || 
             (this.complianceFailure!=null &&
              java.util.Arrays.equals(this.complianceFailure, other.getComplianceFailure())));
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
        if (getComplianceFailure() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getComplianceFailure());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getComplianceFailure(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfComplianceFailure.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfComplianceFailure"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complianceFailure");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ComplianceFailure"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ComplianceFailure"));
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
