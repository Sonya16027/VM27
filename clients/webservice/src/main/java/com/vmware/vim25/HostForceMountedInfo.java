/**
 * HostForceMountedInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostForceMountedInfo  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private boolean persist;

    private boolean mounted;

    public HostForceMountedInfo() {
    }

    public HostForceMountedInfo(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           boolean persist,
           boolean mounted) {
        super(
            dynamicType,
            dynamicProperty);
        this.persist = persist;
        this.mounted = mounted;
    }


    /**
     * Gets the persist value for this HostForceMountedInfo.
     * 
     * @return persist
     */
    public boolean isPersist() {
        return persist;
    }


    /**
     * Sets the persist value for this HostForceMountedInfo.
     * 
     * @param persist
     */
    public void setPersist(boolean persist) {
        this.persist = persist;
    }


    /**
     * Gets the mounted value for this HostForceMountedInfo.
     * 
     * @return mounted
     */
    public boolean isMounted() {
        return mounted;
    }


    /**
     * Sets the mounted value for this HostForceMountedInfo.
     * 
     * @param mounted
     */
    public void setMounted(boolean mounted) {
        this.mounted = mounted;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostForceMountedInfo)) return false;
        HostForceMountedInfo other = (HostForceMountedInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.persist == other.isPersist() &&
            this.mounted == other.isMounted();
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
        _hashCode += (isPersist() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isMounted() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostForceMountedInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostForceMountedInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("persist");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "persist"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mounted");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "mounted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
