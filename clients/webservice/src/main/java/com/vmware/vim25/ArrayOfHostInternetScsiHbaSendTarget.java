/**
 * ArrayOfHostInternetScsiHbaSendTarget.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfHostInternetScsiHbaSendTarget  implements java.io.Serializable {
    private com.vmware.vim25.HostInternetScsiHbaSendTarget[] hostInternetScsiHbaSendTarget;

    public ArrayOfHostInternetScsiHbaSendTarget() {
    }

    public ArrayOfHostInternetScsiHbaSendTarget(
           com.vmware.vim25.HostInternetScsiHbaSendTarget[] hostInternetScsiHbaSendTarget) {
           this.hostInternetScsiHbaSendTarget = hostInternetScsiHbaSendTarget;
    }


    /**
     * Gets the hostInternetScsiHbaSendTarget value for this ArrayOfHostInternetScsiHbaSendTarget.
     * 
     * @return hostInternetScsiHbaSendTarget
     */
    public com.vmware.vim25.HostInternetScsiHbaSendTarget[] getHostInternetScsiHbaSendTarget() {
        return hostInternetScsiHbaSendTarget;
    }


    /**
     * Sets the hostInternetScsiHbaSendTarget value for this ArrayOfHostInternetScsiHbaSendTarget.
     * 
     * @param hostInternetScsiHbaSendTarget
     */
    public void setHostInternetScsiHbaSendTarget(com.vmware.vim25.HostInternetScsiHbaSendTarget[] hostInternetScsiHbaSendTarget) {
        this.hostInternetScsiHbaSendTarget = hostInternetScsiHbaSendTarget;
    }

    public com.vmware.vim25.HostInternetScsiHbaSendTarget getHostInternetScsiHbaSendTarget(int i) {
        return this.hostInternetScsiHbaSendTarget[i];
    }

    public void setHostInternetScsiHbaSendTarget(int i, com.vmware.vim25.HostInternetScsiHbaSendTarget _value) {
        this.hostInternetScsiHbaSendTarget[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfHostInternetScsiHbaSendTarget)) return false;
        ArrayOfHostInternetScsiHbaSendTarget other = (ArrayOfHostInternetScsiHbaSendTarget) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hostInternetScsiHbaSendTarget==null && other.getHostInternetScsiHbaSendTarget()==null) || 
             (this.hostInternetScsiHbaSendTarget!=null &&
              java.util.Arrays.equals(this.hostInternetScsiHbaSendTarget, other.getHostInternetScsiHbaSendTarget())));
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
        if (getHostInternetScsiHbaSendTarget() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostInternetScsiHbaSendTarget());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostInternetScsiHbaSendTarget(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfHostInternetScsiHbaSendTarget.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfHostInternetScsiHbaSendTarget"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostInternetScsiHbaSendTarget");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "HostInternetScsiHbaSendTarget"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostInternetScsiHbaSendTarget"));
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
