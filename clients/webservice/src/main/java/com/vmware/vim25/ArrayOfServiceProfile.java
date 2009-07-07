/**
 * ArrayOfServiceProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfServiceProfile  implements java.io.Serializable {
    private com.vmware.vim25.ServiceProfile[] serviceProfile;

    public ArrayOfServiceProfile() {
    }

    public ArrayOfServiceProfile(
           com.vmware.vim25.ServiceProfile[] serviceProfile) {
           this.serviceProfile = serviceProfile;
    }


    /**
     * Gets the serviceProfile value for this ArrayOfServiceProfile.
     * 
     * @return serviceProfile
     */
    public com.vmware.vim25.ServiceProfile[] getServiceProfile() {
        return serviceProfile;
    }


    /**
     * Sets the serviceProfile value for this ArrayOfServiceProfile.
     * 
     * @param serviceProfile
     */
    public void setServiceProfile(com.vmware.vim25.ServiceProfile[] serviceProfile) {
        this.serviceProfile = serviceProfile;
    }

    public com.vmware.vim25.ServiceProfile getServiceProfile(int i) {
        return this.serviceProfile[i];
    }

    public void setServiceProfile(int i, com.vmware.vim25.ServiceProfile _value) {
        this.serviceProfile[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfServiceProfile)) return false;
        ArrayOfServiceProfile other = (ArrayOfServiceProfile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.serviceProfile==null && other.getServiceProfile()==null) || 
             (this.serviceProfile!=null &&
              java.util.Arrays.equals(this.serviceProfile, other.getServiceProfile())));
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
        if (getServiceProfile() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServiceProfile());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServiceProfile(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfServiceProfile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfServiceProfile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceProfile");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ServiceProfile"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ServiceProfile"));
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
