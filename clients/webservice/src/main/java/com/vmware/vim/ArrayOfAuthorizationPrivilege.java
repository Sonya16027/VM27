/**
 * ArrayOfAuthorizationPrivilege.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class ArrayOfAuthorizationPrivilege  implements java.io.Serializable {
    private com.vmware.vim.AuthorizationPrivilege[] authorizationPrivilege;

    public ArrayOfAuthorizationPrivilege() {
    }

    public ArrayOfAuthorizationPrivilege(
           com.vmware.vim.AuthorizationPrivilege[] authorizationPrivilege) {
           this.authorizationPrivilege = authorizationPrivilege;
    }


    /**
     * Gets the authorizationPrivilege value for this ArrayOfAuthorizationPrivilege.
     * 
     * @return authorizationPrivilege
     */
    public com.vmware.vim.AuthorizationPrivilege[] getAuthorizationPrivilege() {
        return authorizationPrivilege;
    }


    /**
     * Sets the authorizationPrivilege value for this ArrayOfAuthorizationPrivilege.
     * 
     * @param authorizationPrivilege
     */
    public void setAuthorizationPrivilege(com.vmware.vim.AuthorizationPrivilege[] authorizationPrivilege) {
        this.authorizationPrivilege = authorizationPrivilege;
    }

    public com.vmware.vim.AuthorizationPrivilege getAuthorizationPrivilege(int i) {
        return this.authorizationPrivilege[i];
    }

    public void setAuthorizationPrivilege(int i, com.vmware.vim.AuthorizationPrivilege _value) {
        this.authorizationPrivilege[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfAuthorizationPrivilege)) return false;
        ArrayOfAuthorizationPrivilege other = (ArrayOfAuthorizationPrivilege) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.authorizationPrivilege==null && other.getAuthorizationPrivilege()==null) || 
             (this.authorizationPrivilege!=null &&
              java.util.Arrays.equals(this.authorizationPrivilege, other.getAuthorizationPrivilege())));
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
        if (getAuthorizationPrivilege() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAuthorizationPrivilege());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAuthorizationPrivilege(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfAuthorizationPrivilege.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "ArrayOfAuthorizationPrivilege"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorizationPrivilege");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "AuthorizationPrivilege"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "AuthorizationPrivilege"));
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
