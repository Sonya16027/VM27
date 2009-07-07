/**
 * ArrayOfVMwareDVSPvlanConfigSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfVMwareDVSPvlanConfigSpec  implements java.io.Serializable {
    private com.vmware.vim25.VMwareDVSPvlanConfigSpec[] VMwareDVSPvlanConfigSpec;

    public ArrayOfVMwareDVSPvlanConfigSpec() {
    }

    public ArrayOfVMwareDVSPvlanConfigSpec(
           com.vmware.vim25.VMwareDVSPvlanConfigSpec[] VMwareDVSPvlanConfigSpec) {
           this.VMwareDVSPvlanConfigSpec = VMwareDVSPvlanConfigSpec;
    }


    /**
     * Gets the VMwareDVSPvlanConfigSpec value for this ArrayOfVMwareDVSPvlanConfigSpec.
     * 
     * @return VMwareDVSPvlanConfigSpec
     */
    public com.vmware.vim25.VMwareDVSPvlanConfigSpec[] getVMwareDVSPvlanConfigSpec() {
        return VMwareDVSPvlanConfigSpec;
    }


    /**
     * Sets the VMwareDVSPvlanConfigSpec value for this ArrayOfVMwareDVSPvlanConfigSpec.
     * 
     * @param VMwareDVSPvlanConfigSpec
     */
    public void setVMwareDVSPvlanConfigSpec(com.vmware.vim25.VMwareDVSPvlanConfigSpec[] VMwareDVSPvlanConfigSpec) {
        this.VMwareDVSPvlanConfigSpec = VMwareDVSPvlanConfigSpec;
    }

    public com.vmware.vim25.VMwareDVSPvlanConfigSpec getVMwareDVSPvlanConfigSpec(int i) {
        return this.VMwareDVSPvlanConfigSpec[i];
    }

    public void setVMwareDVSPvlanConfigSpec(int i, com.vmware.vim25.VMwareDVSPvlanConfigSpec _value) {
        this.VMwareDVSPvlanConfigSpec[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfVMwareDVSPvlanConfigSpec)) return false;
        ArrayOfVMwareDVSPvlanConfigSpec other = (ArrayOfVMwareDVSPvlanConfigSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.VMwareDVSPvlanConfigSpec==null && other.getVMwareDVSPvlanConfigSpec()==null) || 
             (this.VMwareDVSPvlanConfigSpec!=null &&
              java.util.Arrays.equals(this.VMwareDVSPvlanConfigSpec, other.getVMwareDVSPvlanConfigSpec())));
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
        if (getVMwareDVSPvlanConfigSpec() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVMwareDVSPvlanConfigSpec());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVMwareDVSPvlanConfigSpec(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfVMwareDVSPvlanConfigSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfVMwareDVSPvlanConfigSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VMwareDVSPvlanConfigSpec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "VMwareDVSPvlanConfigSpec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VMwareDVSPvlanConfigSpec"));
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
