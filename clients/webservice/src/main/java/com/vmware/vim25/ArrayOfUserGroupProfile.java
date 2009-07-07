/**
 * ArrayOfUserGroupProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfUserGroupProfile  implements java.io.Serializable {
    private com.vmware.vim25.UserGroupProfile[] userGroupProfile;

    public ArrayOfUserGroupProfile() {
    }

    public ArrayOfUserGroupProfile(
           com.vmware.vim25.UserGroupProfile[] userGroupProfile) {
           this.userGroupProfile = userGroupProfile;
    }


    /**
     * Gets the userGroupProfile value for this ArrayOfUserGroupProfile.
     * 
     * @return userGroupProfile
     */
    public com.vmware.vim25.UserGroupProfile[] getUserGroupProfile() {
        return userGroupProfile;
    }


    /**
     * Sets the userGroupProfile value for this ArrayOfUserGroupProfile.
     * 
     * @param userGroupProfile
     */
    public void setUserGroupProfile(com.vmware.vim25.UserGroupProfile[] userGroupProfile) {
        this.userGroupProfile = userGroupProfile;
    }

    public com.vmware.vim25.UserGroupProfile getUserGroupProfile(int i) {
        return this.userGroupProfile[i];
    }

    public void setUserGroupProfile(int i, com.vmware.vim25.UserGroupProfile _value) {
        this.userGroupProfile[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfUserGroupProfile)) return false;
        ArrayOfUserGroupProfile other = (ArrayOfUserGroupProfile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userGroupProfile==null && other.getUserGroupProfile()==null) || 
             (this.userGroupProfile!=null &&
              java.util.Arrays.equals(this.userGroupProfile, other.getUserGroupProfile())));
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
        if (getUserGroupProfile() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUserGroupProfile());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUserGroupProfile(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfUserGroupProfile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfUserGroupProfile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userGroupProfile");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "UserGroupProfile"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "UserGroupProfile"));
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
