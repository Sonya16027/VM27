/**
 * ArrayOfHostIpRouteEntry.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfHostIpRouteEntry  implements java.io.Serializable {
    private com.vmware.vim25.HostIpRouteEntry[] hostIpRouteEntry;

    public ArrayOfHostIpRouteEntry() {
    }

    public ArrayOfHostIpRouteEntry(
           com.vmware.vim25.HostIpRouteEntry[] hostIpRouteEntry) {
           this.hostIpRouteEntry = hostIpRouteEntry;
    }


    /**
     * Gets the hostIpRouteEntry value for this ArrayOfHostIpRouteEntry.
     * 
     * @return hostIpRouteEntry
     */
    public com.vmware.vim25.HostIpRouteEntry[] getHostIpRouteEntry() {
        return hostIpRouteEntry;
    }


    /**
     * Sets the hostIpRouteEntry value for this ArrayOfHostIpRouteEntry.
     * 
     * @param hostIpRouteEntry
     */
    public void setHostIpRouteEntry(com.vmware.vim25.HostIpRouteEntry[] hostIpRouteEntry) {
        this.hostIpRouteEntry = hostIpRouteEntry;
    }

    public com.vmware.vim25.HostIpRouteEntry getHostIpRouteEntry(int i) {
        return this.hostIpRouteEntry[i];
    }

    public void setHostIpRouteEntry(int i, com.vmware.vim25.HostIpRouteEntry _value) {
        this.hostIpRouteEntry[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfHostIpRouteEntry)) return false;
        ArrayOfHostIpRouteEntry other = (ArrayOfHostIpRouteEntry) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hostIpRouteEntry==null && other.getHostIpRouteEntry()==null) || 
             (this.hostIpRouteEntry!=null &&
              java.util.Arrays.equals(this.hostIpRouteEntry, other.getHostIpRouteEntry())));
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
        if (getHostIpRouteEntry() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostIpRouteEntry());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostIpRouteEntry(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfHostIpRouteEntry.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfHostIpRouteEntry"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostIpRouteEntry");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "HostIpRouteEntry"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostIpRouteEntry"));
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
