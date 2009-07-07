/**
 * ArrayOfHostPortGroupProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfHostPortGroupProfile  implements java.io.Serializable {
    private com.vmware.vim25.HostPortGroupProfile[] hostPortGroupProfile;

    public ArrayOfHostPortGroupProfile() {
    }

    public ArrayOfHostPortGroupProfile(
           com.vmware.vim25.HostPortGroupProfile[] hostPortGroupProfile) {
           this.hostPortGroupProfile = hostPortGroupProfile;
    }


    /**
     * Gets the hostPortGroupProfile value for this ArrayOfHostPortGroupProfile.
     * 
     * @return hostPortGroupProfile
     */
    public com.vmware.vim25.HostPortGroupProfile[] getHostPortGroupProfile() {
        return hostPortGroupProfile;
    }


    /**
     * Sets the hostPortGroupProfile value for this ArrayOfHostPortGroupProfile.
     * 
     * @param hostPortGroupProfile
     */
    public void setHostPortGroupProfile(com.vmware.vim25.HostPortGroupProfile[] hostPortGroupProfile) {
        this.hostPortGroupProfile = hostPortGroupProfile;
    }

    public com.vmware.vim25.HostPortGroupProfile getHostPortGroupProfile(int i) {
        return this.hostPortGroupProfile[i];
    }

    public void setHostPortGroupProfile(int i, com.vmware.vim25.HostPortGroupProfile _value) {
        this.hostPortGroupProfile[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfHostPortGroupProfile)) return false;
        ArrayOfHostPortGroupProfile other = (ArrayOfHostPortGroupProfile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hostPortGroupProfile==null && other.getHostPortGroupProfile()==null) || 
             (this.hostPortGroupProfile!=null &&
              java.util.Arrays.equals(this.hostPortGroupProfile, other.getHostPortGroupProfile())));
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
        if (getHostPortGroupProfile() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostPortGroupProfile());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostPortGroupProfile(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfHostPortGroupProfile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfHostPortGroupProfile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostPortGroupProfile");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "HostPortGroupProfile"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostPortGroupProfile"));
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
