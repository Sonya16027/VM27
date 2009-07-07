/**
 * DatastoreHostMount.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class DatastoreHostMount  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private com.vmware.vim25.ManagedObjectReference key;

    private com.vmware.vim25.HostMountInfo mountInfo;

    public DatastoreHostMount() {
    }

    public DatastoreHostMount(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           com.vmware.vim25.ManagedObjectReference key,
           com.vmware.vim25.HostMountInfo mountInfo) {
        super(
            dynamicType,
            dynamicProperty);
        this.key = key;
        this.mountInfo = mountInfo;
    }


    /**
     * Gets the key value for this DatastoreHostMount.
     * 
     * @return key
     */
    public com.vmware.vim25.ManagedObjectReference getKey() {
        return key;
    }


    /**
     * Sets the key value for this DatastoreHostMount.
     * 
     * @param key
     */
    public void setKey(com.vmware.vim25.ManagedObjectReference key) {
        this.key = key;
    }


    /**
     * Gets the mountInfo value for this DatastoreHostMount.
     * 
     * @return mountInfo
     */
    public com.vmware.vim25.HostMountInfo getMountInfo() {
        return mountInfo;
    }


    /**
     * Sets the mountInfo value for this DatastoreHostMount.
     * 
     * @param mountInfo
     */
    public void setMountInfo(com.vmware.vim25.HostMountInfo mountInfo) {
        this.mountInfo = mountInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DatastoreHostMount)) return false;
        DatastoreHostMount other = (DatastoreHostMount) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.key==null && other.getKey()==null) || 
             (this.key!=null &&
              this.key.equals(other.getKey()))) &&
            ((this.mountInfo==null && other.getMountInfo()==null) || 
             (this.mountInfo!=null &&
              this.mountInfo.equals(other.getMountInfo())));
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
        if (getKey() != null) {
            _hashCode += getKey().hashCode();
        }
        if (getMountInfo() != null) {
            _hashCode += getMountInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DatastoreHostMount.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DatastoreHostMount"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "key"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mountInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "mountInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostMountInfo"));
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