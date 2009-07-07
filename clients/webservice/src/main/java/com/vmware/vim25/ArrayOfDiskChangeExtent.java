/**
 * ArrayOfDiskChangeExtent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfDiskChangeExtent  implements java.io.Serializable {
    private com.vmware.vim25.DiskChangeExtent[] diskChangeExtent;

    public ArrayOfDiskChangeExtent() {
    }

    public ArrayOfDiskChangeExtent(
           com.vmware.vim25.DiskChangeExtent[] diskChangeExtent) {
           this.diskChangeExtent = diskChangeExtent;
    }


    /**
     * Gets the diskChangeExtent value for this ArrayOfDiskChangeExtent.
     * 
     * @return diskChangeExtent
     */
    public com.vmware.vim25.DiskChangeExtent[] getDiskChangeExtent() {
        return diskChangeExtent;
    }


    /**
     * Sets the diskChangeExtent value for this ArrayOfDiskChangeExtent.
     * 
     * @param diskChangeExtent
     */
    public void setDiskChangeExtent(com.vmware.vim25.DiskChangeExtent[] diskChangeExtent) {
        this.diskChangeExtent = diskChangeExtent;
    }

    public com.vmware.vim25.DiskChangeExtent getDiskChangeExtent(int i) {
        return this.diskChangeExtent[i];
    }

    public void setDiskChangeExtent(int i, com.vmware.vim25.DiskChangeExtent _value) {
        this.diskChangeExtent[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfDiskChangeExtent)) return false;
        ArrayOfDiskChangeExtent other = (ArrayOfDiskChangeExtent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.diskChangeExtent==null && other.getDiskChangeExtent()==null) || 
             (this.diskChangeExtent!=null &&
              java.util.Arrays.equals(this.diskChangeExtent, other.getDiskChangeExtent())));
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
        if (getDiskChangeExtent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDiskChangeExtent());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDiskChangeExtent(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfDiskChangeExtent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfDiskChangeExtent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diskChangeExtent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "DiskChangeExtent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DiskChangeExtent"));
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
