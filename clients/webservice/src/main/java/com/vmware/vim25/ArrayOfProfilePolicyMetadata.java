/**
 * ArrayOfProfilePolicyMetadata.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfProfilePolicyMetadata  implements java.io.Serializable {
    private com.vmware.vim25.ProfilePolicyMetadata[] profilePolicyMetadata;

    public ArrayOfProfilePolicyMetadata() {
    }

    public ArrayOfProfilePolicyMetadata(
           com.vmware.vim25.ProfilePolicyMetadata[] profilePolicyMetadata) {
           this.profilePolicyMetadata = profilePolicyMetadata;
    }


    /**
     * Gets the profilePolicyMetadata value for this ArrayOfProfilePolicyMetadata.
     * 
     * @return profilePolicyMetadata
     */
    public com.vmware.vim25.ProfilePolicyMetadata[] getProfilePolicyMetadata() {
        return profilePolicyMetadata;
    }


    /**
     * Sets the profilePolicyMetadata value for this ArrayOfProfilePolicyMetadata.
     * 
     * @param profilePolicyMetadata
     */
    public void setProfilePolicyMetadata(com.vmware.vim25.ProfilePolicyMetadata[] profilePolicyMetadata) {
        this.profilePolicyMetadata = profilePolicyMetadata;
    }

    public com.vmware.vim25.ProfilePolicyMetadata getProfilePolicyMetadata(int i) {
        return this.profilePolicyMetadata[i];
    }

    public void setProfilePolicyMetadata(int i, com.vmware.vim25.ProfilePolicyMetadata _value) {
        this.profilePolicyMetadata[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfProfilePolicyMetadata)) return false;
        ArrayOfProfilePolicyMetadata other = (ArrayOfProfilePolicyMetadata) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.profilePolicyMetadata==null && other.getProfilePolicyMetadata()==null) || 
             (this.profilePolicyMetadata!=null &&
              java.util.Arrays.equals(this.profilePolicyMetadata, other.getProfilePolicyMetadata())));
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
        if (getProfilePolicyMetadata() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProfilePolicyMetadata());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProfilePolicyMetadata(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfProfilePolicyMetadata.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfProfilePolicyMetadata"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profilePolicyMetadata");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ProfilePolicyMetadata"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ProfilePolicyMetadata"));
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
