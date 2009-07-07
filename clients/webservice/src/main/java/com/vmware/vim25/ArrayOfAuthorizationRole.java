/**
 * ArrayOfAuthorizationRole.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfAuthorizationRole  implements java.io.Serializable {
    private com.vmware.vim25.AuthorizationRole[] authorizationRole;

    public ArrayOfAuthorizationRole() {
    }

    public ArrayOfAuthorizationRole(
           com.vmware.vim25.AuthorizationRole[] authorizationRole) {
           this.authorizationRole = authorizationRole;
    }


    /**
     * Gets the authorizationRole value for this ArrayOfAuthorizationRole.
     * 
     * @return authorizationRole
     */
    public com.vmware.vim25.AuthorizationRole[] getAuthorizationRole() {
        return authorizationRole;
    }


    /**
     * Sets the authorizationRole value for this ArrayOfAuthorizationRole.
     * 
     * @param authorizationRole
     */
    public void setAuthorizationRole(com.vmware.vim25.AuthorizationRole[] authorizationRole) {
        this.authorizationRole = authorizationRole;
    }

    public com.vmware.vim25.AuthorizationRole getAuthorizationRole(int i) {
        return this.authorizationRole[i];
    }

    public void setAuthorizationRole(int i, com.vmware.vim25.AuthorizationRole _value) {
        this.authorizationRole[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfAuthorizationRole)) return false;
        ArrayOfAuthorizationRole other = (ArrayOfAuthorizationRole) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.authorizationRole==null && other.getAuthorizationRole()==null) || 
             (this.authorizationRole!=null &&
              java.util.Arrays.equals(this.authorizationRole, other.getAuthorizationRole())));
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
        if (getAuthorizationRole() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAuthorizationRole());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAuthorizationRole(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfAuthorizationRole.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfAuthorizationRole"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorizationRole");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "AuthorizationRole"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "AuthorizationRole"));
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
