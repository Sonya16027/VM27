/**
 * ArrayOfHostDiagnosticPartition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfHostDiagnosticPartition  implements java.io.Serializable {
    private com.vmware.vim25.HostDiagnosticPartition[] hostDiagnosticPartition;

    public ArrayOfHostDiagnosticPartition() {
    }

    public ArrayOfHostDiagnosticPartition(
           com.vmware.vim25.HostDiagnosticPartition[] hostDiagnosticPartition) {
           this.hostDiagnosticPartition = hostDiagnosticPartition;
    }


    /**
     * Gets the hostDiagnosticPartition value for this ArrayOfHostDiagnosticPartition.
     * 
     * @return hostDiagnosticPartition
     */
    public com.vmware.vim25.HostDiagnosticPartition[] getHostDiagnosticPartition() {
        return hostDiagnosticPartition;
    }


    /**
     * Sets the hostDiagnosticPartition value for this ArrayOfHostDiagnosticPartition.
     * 
     * @param hostDiagnosticPartition
     */
    public void setHostDiagnosticPartition(com.vmware.vim25.HostDiagnosticPartition[] hostDiagnosticPartition) {
        this.hostDiagnosticPartition = hostDiagnosticPartition;
    }

    public com.vmware.vim25.HostDiagnosticPartition getHostDiagnosticPartition(int i) {
        return this.hostDiagnosticPartition[i];
    }

    public void setHostDiagnosticPartition(int i, com.vmware.vim25.HostDiagnosticPartition _value) {
        this.hostDiagnosticPartition[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfHostDiagnosticPartition)) return false;
        ArrayOfHostDiagnosticPartition other = (ArrayOfHostDiagnosticPartition) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hostDiagnosticPartition==null && other.getHostDiagnosticPartition()==null) || 
             (this.hostDiagnosticPartition!=null &&
              java.util.Arrays.equals(this.hostDiagnosticPartition, other.getHostDiagnosticPartition())));
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
        if (getHostDiagnosticPartition() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostDiagnosticPartition());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostDiagnosticPartition(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfHostDiagnosticPartition.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfHostDiagnosticPartition"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostDiagnosticPartition");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "HostDiagnosticPartition"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostDiagnosticPartition"));
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
