/**
 * DvsOperationBulkFaultFaultOnHost.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class DvsOperationBulkFaultFaultOnHost  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private com.vmware.vim25.ManagedObjectReference host;

    private com.vmware.vim25.LocalizedMethodFault fault;

    public DvsOperationBulkFaultFaultOnHost() {
    }

    public DvsOperationBulkFaultFaultOnHost(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           com.vmware.vim25.ManagedObjectReference host,
           com.vmware.vim25.LocalizedMethodFault fault) {
        super(
            dynamicType,
            dynamicProperty);
        this.host = host;
        this.fault = fault;
    }


    /**
     * Gets the host value for this DvsOperationBulkFaultFaultOnHost.
     * 
     * @return host
     */
    public com.vmware.vim25.ManagedObjectReference getHost() {
        return host;
    }


    /**
     * Sets the host value for this DvsOperationBulkFaultFaultOnHost.
     * 
     * @param host
     */
    public void setHost(com.vmware.vim25.ManagedObjectReference host) {
        this.host = host;
    }


    /**
     * Gets the fault value for this DvsOperationBulkFaultFaultOnHost.
     * 
     * @return fault
     */
    public com.vmware.vim25.LocalizedMethodFault getFault() {
        return fault;
    }


    /**
     * Sets the fault value for this DvsOperationBulkFaultFaultOnHost.
     * 
     * @param fault
     */
    public void setFault(com.vmware.vim25.LocalizedMethodFault fault) {
        this.fault = fault;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DvsOperationBulkFaultFaultOnHost)) return false;
        DvsOperationBulkFaultFaultOnHost other = (DvsOperationBulkFaultFaultOnHost) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.host==null && other.getHost()==null) || 
             (this.host!=null &&
              this.host.equals(other.getHost()))) &&
            ((this.fault==null && other.getFault()==null) || 
             (this.fault!=null &&
              this.fault.equals(other.getFault())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getHost() != null) {
            _hashCode += getHost().hashCode();
        }
        if (getFault() != null) {
            _hashCode += getFault().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DvsOperationBulkFaultFaultOnHost.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DvsOperationBulkFaultFaultOnHost"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("host");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "host"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fault");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "fault"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "LocalizedMethodFault"));
        elemField.setNillable(false);
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
