/**
 * ArrayOfHostInternetScsiHbaParamValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfHostInternetScsiHbaParamValue  implements java.io.Serializable {
    private com.vmware.vim25.HostInternetScsiHbaParamValue[] hostInternetScsiHbaParamValue;

    public ArrayOfHostInternetScsiHbaParamValue() {
    }

    public ArrayOfHostInternetScsiHbaParamValue(
           com.vmware.vim25.HostInternetScsiHbaParamValue[] hostInternetScsiHbaParamValue) {
           this.hostInternetScsiHbaParamValue = hostInternetScsiHbaParamValue;
    }


    /**
     * Gets the hostInternetScsiHbaParamValue value for this ArrayOfHostInternetScsiHbaParamValue.
     * 
     * @return hostInternetScsiHbaParamValue
     */
    public com.vmware.vim25.HostInternetScsiHbaParamValue[] getHostInternetScsiHbaParamValue() {
        return hostInternetScsiHbaParamValue;
    }


    /**
     * Sets the hostInternetScsiHbaParamValue value for this ArrayOfHostInternetScsiHbaParamValue.
     * 
     * @param hostInternetScsiHbaParamValue
     */
    public void setHostInternetScsiHbaParamValue(com.vmware.vim25.HostInternetScsiHbaParamValue[] hostInternetScsiHbaParamValue) {
        this.hostInternetScsiHbaParamValue = hostInternetScsiHbaParamValue;
    }

    public com.vmware.vim25.HostInternetScsiHbaParamValue getHostInternetScsiHbaParamValue(int i) {
        return this.hostInternetScsiHbaParamValue[i];
    }

    public void setHostInternetScsiHbaParamValue(int i, com.vmware.vim25.HostInternetScsiHbaParamValue _value) {
        this.hostInternetScsiHbaParamValue[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfHostInternetScsiHbaParamValue)) return false;
        ArrayOfHostInternetScsiHbaParamValue other = (ArrayOfHostInternetScsiHbaParamValue) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hostInternetScsiHbaParamValue==null && other.getHostInternetScsiHbaParamValue()==null) || 
             (this.hostInternetScsiHbaParamValue!=null &&
              java.util.Arrays.equals(this.hostInternetScsiHbaParamValue, other.getHostInternetScsiHbaParamValue())));
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
        if (getHostInternetScsiHbaParamValue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostInternetScsiHbaParamValue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostInternetScsiHbaParamValue(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfHostInternetScsiHbaParamValue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfHostInternetScsiHbaParamValue"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostInternetScsiHbaParamValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "HostInternetScsiHbaParamValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostInternetScsiHbaParamValue"));
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
