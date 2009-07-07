/**
 * ArrayOfHostMultipathInfoPath.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfHostMultipathInfoPath  implements java.io.Serializable {
    private com.vmware.vim25.HostMultipathInfoPath[] hostMultipathInfoPath;

    public ArrayOfHostMultipathInfoPath() {
    }

    public ArrayOfHostMultipathInfoPath(
           com.vmware.vim25.HostMultipathInfoPath[] hostMultipathInfoPath) {
           this.hostMultipathInfoPath = hostMultipathInfoPath;
    }


    /**
     * Gets the hostMultipathInfoPath value for this ArrayOfHostMultipathInfoPath.
     * 
     * @return hostMultipathInfoPath
     */
    public com.vmware.vim25.HostMultipathInfoPath[] getHostMultipathInfoPath() {
        return hostMultipathInfoPath;
    }


    /**
     * Sets the hostMultipathInfoPath value for this ArrayOfHostMultipathInfoPath.
     * 
     * @param hostMultipathInfoPath
     */
    public void setHostMultipathInfoPath(com.vmware.vim25.HostMultipathInfoPath[] hostMultipathInfoPath) {
        this.hostMultipathInfoPath = hostMultipathInfoPath;
    }

    public com.vmware.vim25.HostMultipathInfoPath getHostMultipathInfoPath(int i) {
        return this.hostMultipathInfoPath[i];
    }

    public void setHostMultipathInfoPath(int i, com.vmware.vim25.HostMultipathInfoPath _value) {
        this.hostMultipathInfoPath[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfHostMultipathInfoPath)) return false;
        ArrayOfHostMultipathInfoPath other = (ArrayOfHostMultipathInfoPath) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hostMultipathInfoPath==null && other.getHostMultipathInfoPath()==null) || 
             (this.hostMultipathInfoPath!=null &&
              java.util.Arrays.equals(this.hostMultipathInfoPath, other.getHostMultipathInfoPath())));
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
        if (getHostMultipathInfoPath() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostMultipathInfoPath());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostMultipathInfoPath(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfHostMultipathInfoPath.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfHostMultipathInfoPath"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostMultipathInfoPath");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "HostMultipathInfoPath"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostMultipathInfoPath"));
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
