/**
 * ArrayOfHostScsiDisk.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfHostScsiDisk  implements java.io.Serializable {
    private com.vmware.vim25.HostScsiDisk[] hostScsiDisk;

    public ArrayOfHostScsiDisk() {
    }

    public ArrayOfHostScsiDisk(
           com.vmware.vim25.HostScsiDisk[] hostScsiDisk) {
           this.hostScsiDisk = hostScsiDisk;
    }


    /**
     * Gets the hostScsiDisk value for this ArrayOfHostScsiDisk.
     * 
     * @return hostScsiDisk
     */
    public com.vmware.vim25.HostScsiDisk[] getHostScsiDisk() {
        return hostScsiDisk;
    }


    /**
     * Sets the hostScsiDisk value for this ArrayOfHostScsiDisk.
     * 
     * @param hostScsiDisk
     */
    public void setHostScsiDisk(com.vmware.vim25.HostScsiDisk[] hostScsiDisk) {
        this.hostScsiDisk = hostScsiDisk;
    }

    public com.vmware.vim25.HostScsiDisk getHostScsiDisk(int i) {
        return this.hostScsiDisk[i];
    }

    public void setHostScsiDisk(int i, com.vmware.vim25.HostScsiDisk _value) {
        this.hostScsiDisk[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfHostScsiDisk)) return false;
        ArrayOfHostScsiDisk other = (ArrayOfHostScsiDisk) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hostScsiDisk==null && other.getHostScsiDisk()==null) || 
             (this.hostScsiDisk!=null &&
              java.util.Arrays.equals(this.hostScsiDisk, other.getHostScsiDisk())));
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
        if (getHostScsiDisk() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostScsiDisk());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostScsiDisk(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfHostScsiDisk.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfHostScsiDisk"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostScsiDisk");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "HostScsiDisk"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostScsiDisk"));
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
