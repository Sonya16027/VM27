/**
 * ArrayOfVMwareDVSPvlanMapEntry.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfVMwareDVSPvlanMapEntry  implements java.io.Serializable {
    private com.vmware.vim25.VMwareDVSPvlanMapEntry[] VMwareDVSPvlanMapEntry;

    public ArrayOfVMwareDVSPvlanMapEntry() {
    }

    public ArrayOfVMwareDVSPvlanMapEntry(
           com.vmware.vim25.VMwareDVSPvlanMapEntry[] VMwareDVSPvlanMapEntry) {
           this.VMwareDVSPvlanMapEntry = VMwareDVSPvlanMapEntry;
    }


    /**
     * Gets the VMwareDVSPvlanMapEntry value for this ArrayOfVMwareDVSPvlanMapEntry.
     * 
     * @return VMwareDVSPvlanMapEntry
     */
    public com.vmware.vim25.VMwareDVSPvlanMapEntry[] getVMwareDVSPvlanMapEntry() {
        return VMwareDVSPvlanMapEntry;
    }


    /**
     * Sets the VMwareDVSPvlanMapEntry value for this ArrayOfVMwareDVSPvlanMapEntry.
     * 
     * @param VMwareDVSPvlanMapEntry
     */
    public void setVMwareDVSPvlanMapEntry(com.vmware.vim25.VMwareDVSPvlanMapEntry[] VMwareDVSPvlanMapEntry) {
        this.VMwareDVSPvlanMapEntry = VMwareDVSPvlanMapEntry;
    }

    public com.vmware.vim25.VMwareDVSPvlanMapEntry getVMwareDVSPvlanMapEntry(int i) {
        return this.VMwareDVSPvlanMapEntry[i];
    }

    public void setVMwareDVSPvlanMapEntry(int i, com.vmware.vim25.VMwareDVSPvlanMapEntry _value) {
        this.VMwareDVSPvlanMapEntry[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfVMwareDVSPvlanMapEntry)) return false;
        ArrayOfVMwareDVSPvlanMapEntry other = (ArrayOfVMwareDVSPvlanMapEntry) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.VMwareDVSPvlanMapEntry==null && other.getVMwareDVSPvlanMapEntry()==null) || 
             (this.VMwareDVSPvlanMapEntry!=null &&
              java.util.Arrays.equals(this.VMwareDVSPvlanMapEntry, other.getVMwareDVSPvlanMapEntry())));
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
        if (getVMwareDVSPvlanMapEntry() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVMwareDVSPvlanMapEntry());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVMwareDVSPvlanMapEntry(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfVMwareDVSPvlanMapEntry.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfVMwareDVSPvlanMapEntry"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VMwareDVSPvlanMapEntry");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "VMwareDVSPvlanMapEntry"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VMwareDVSPvlanMapEntry"));
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
