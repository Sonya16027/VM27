/**
 * ArrayOfDistributedVirtualPort.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfDistributedVirtualPort  implements java.io.Serializable {
    private com.vmware.vim25.DistributedVirtualPort[] distributedVirtualPort;

    public ArrayOfDistributedVirtualPort() {
    }

    public ArrayOfDistributedVirtualPort(
           com.vmware.vim25.DistributedVirtualPort[] distributedVirtualPort) {
           this.distributedVirtualPort = distributedVirtualPort;
    }


    /**
     * Gets the distributedVirtualPort value for this ArrayOfDistributedVirtualPort.
     * 
     * @return distributedVirtualPort
     */
    public com.vmware.vim25.DistributedVirtualPort[] getDistributedVirtualPort() {
        return distributedVirtualPort;
    }


    /**
     * Sets the distributedVirtualPort value for this ArrayOfDistributedVirtualPort.
     * 
     * @param distributedVirtualPort
     */
    public void setDistributedVirtualPort(com.vmware.vim25.DistributedVirtualPort[] distributedVirtualPort) {
        this.distributedVirtualPort = distributedVirtualPort;
    }

    public com.vmware.vim25.DistributedVirtualPort getDistributedVirtualPort(int i) {
        return this.distributedVirtualPort[i];
    }

    public void setDistributedVirtualPort(int i, com.vmware.vim25.DistributedVirtualPort _value) {
        this.distributedVirtualPort[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfDistributedVirtualPort)) return false;
        ArrayOfDistributedVirtualPort other = (ArrayOfDistributedVirtualPort) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.distributedVirtualPort==null && other.getDistributedVirtualPort()==null) || 
             (this.distributedVirtualPort!=null &&
              java.util.Arrays.equals(this.distributedVirtualPort, other.getDistributedVirtualPort())));
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
        if (getDistributedVirtualPort() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDistributedVirtualPort());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDistributedVirtualPort(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfDistributedVirtualPort.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfDistributedVirtualPort"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("distributedVirtualPort");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "DistributedVirtualPort"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DistributedVirtualPort"));
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
