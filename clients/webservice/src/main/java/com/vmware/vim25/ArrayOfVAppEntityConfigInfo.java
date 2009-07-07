/**
 * ArrayOfVAppEntityConfigInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfVAppEntityConfigInfo  implements java.io.Serializable {
    private com.vmware.vim25.VAppEntityConfigInfo[] VAppEntityConfigInfo;

    public ArrayOfVAppEntityConfigInfo() {
    }

    public ArrayOfVAppEntityConfigInfo(
           com.vmware.vim25.VAppEntityConfigInfo[] VAppEntityConfigInfo) {
           this.VAppEntityConfigInfo = VAppEntityConfigInfo;
    }


    /**
     * Gets the VAppEntityConfigInfo value for this ArrayOfVAppEntityConfigInfo.
     * 
     * @return VAppEntityConfigInfo
     */
    public com.vmware.vim25.VAppEntityConfigInfo[] getVAppEntityConfigInfo() {
        return VAppEntityConfigInfo;
    }


    /**
     * Sets the VAppEntityConfigInfo value for this ArrayOfVAppEntityConfigInfo.
     * 
     * @param VAppEntityConfigInfo
     */
    public void setVAppEntityConfigInfo(com.vmware.vim25.VAppEntityConfigInfo[] VAppEntityConfigInfo) {
        this.VAppEntityConfigInfo = VAppEntityConfigInfo;
    }

    public com.vmware.vim25.VAppEntityConfigInfo getVAppEntityConfigInfo(int i) {
        return this.VAppEntityConfigInfo[i];
    }

    public void setVAppEntityConfigInfo(int i, com.vmware.vim25.VAppEntityConfigInfo _value) {
        this.VAppEntityConfigInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfVAppEntityConfigInfo)) return false;
        ArrayOfVAppEntityConfigInfo other = (ArrayOfVAppEntityConfigInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.VAppEntityConfigInfo==null && other.getVAppEntityConfigInfo()==null) || 
             (this.VAppEntityConfigInfo!=null &&
              java.util.Arrays.equals(this.VAppEntityConfigInfo, other.getVAppEntityConfigInfo())));
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
        if (getVAppEntityConfigInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVAppEntityConfigInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVAppEntityConfigInfo(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfVAppEntityConfigInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfVAppEntityConfigInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VAppEntityConfigInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "VAppEntityConfigInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VAppEntityConfigInfo"));
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
