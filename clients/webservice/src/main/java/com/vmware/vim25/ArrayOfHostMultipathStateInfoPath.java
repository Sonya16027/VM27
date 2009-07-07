/**
 * ArrayOfHostMultipathStateInfoPath.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfHostMultipathStateInfoPath  implements java.io.Serializable {
    private com.vmware.vim25.HostMultipathStateInfoPath[] hostMultipathStateInfoPath;

    public ArrayOfHostMultipathStateInfoPath() {
    }

    public ArrayOfHostMultipathStateInfoPath(
           com.vmware.vim25.HostMultipathStateInfoPath[] hostMultipathStateInfoPath) {
           this.hostMultipathStateInfoPath = hostMultipathStateInfoPath;
    }


    /**
     * Gets the hostMultipathStateInfoPath value for this ArrayOfHostMultipathStateInfoPath.
     * 
     * @return hostMultipathStateInfoPath
     */
    public com.vmware.vim25.HostMultipathStateInfoPath[] getHostMultipathStateInfoPath() {
        return hostMultipathStateInfoPath;
    }


    /**
     * Sets the hostMultipathStateInfoPath value for this ArrayOfHostMultipathStateInfoPath.
     * 
     * @param hostMultipathStateInfoPath
     */
    public void setHostMultipathStateInfoPath(com.vmware.vim25.HostMultipathStateInfoPath[] hostMultipathStateInfoPath) {
        this.hostMultipathStateInfoPath = hostMultipathStateInfoPath;
    }

    public com.vmware.vim25.HostMultipathStateInfoPath getHostMultipathStateInfoPath(int i) {
        return this.hostMultipathStateInfoPath[i];
    }

    public void setHostMultipathStateInfoPath(int i, com.vmware.vim25.HostMultipathStateInfoPath _value) {
        this.hostMultipathStateInfoPath[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfHostMultipathStateInfoPath)) return false;
        ArrayOfHostMultipathStateInfoPath other = (ArrayOfHostMultipathStateInfoPath) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hostMultipathStateInfoPath==null && other.getHostMultipathStateInfoPath()==null) || 
             (this.hostMultipathStateInfoPath!=null &&
              java.util.Arrays.equals(this.hostMultipathStateInfoPath, other.getHostMultipathStateInfoPath())));
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
        if (getHostMultipathStateInfoPath() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostMultipathStateInfoPath());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostMultipathStateInfoPath(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfHostMultipathStateInfoPath.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfHostMultipathStateInfoPath"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostMultipathStateInfoPath");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "HostMultipathStateInfoPath"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostMultipathStateInfoPath"));
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
