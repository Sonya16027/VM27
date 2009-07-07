/**
 * ArrayOfProfileMetadata.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfProfileMetadata  implements java.io.Serializable {
    private com.vmware.vim25.ProfileMetadata[] profileMetadata;

    public ArrayOfProfileMetadata() {
    }

    public ArrayOfProfileMetadata(
           com.vmware.vim25.ProfileMetadata[] profileMetadata) {
           this.profileMetadata = profileMetadata;
    }


    /**
     * Gets the profileMetadata value for this ArrayOfProfileMetadata.
     * 
     * @return profileMetadata
     */
    public com.vmware.vim25.ProfileMetadata[] getProfileMetadata() {
        return profileMetadata;
    }


    /**
     * Sets the profileMetadata value for this ArrayOfProfileMetadata.
     * 
     * @param profileMetadata
     */
    public void setProfileMetadata(com.vmware.vim25.ProfileMetadata[] profileMetadata) {
        this.profileMetadata = profileMetadata;
    }

    public com.vmware.vim25.ProfileMetadata getProfileMetadata(int i) {
        return this.profileMetadata[i];
    }

    public void setProfileMetadata(int i, com.vmware.vim25.ProfileMetadata _value) {
        this.profileMetadata[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfProfileMetadata)) return false;
        ArrayOfProfileMetadata other = (ArrayOfProfileMetadata) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.profileMetadata==null && other.getProfileMetadata()==null) || 
             (this.profileMetadata!=null &&
              java.util.Arrays.equals(this.profileMetadata, other.getProfileMetadata())));
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
        if (getProfileMetadata() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProfileMetadata());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProfileMetadata(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfProfileMetadata.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfProfileMetadata"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profileMetadata");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ProfileMetadata"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ProfileMetadata"));
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
