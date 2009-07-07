/**
 * ArrayOfUserSession.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfUserSession  implements java.io.Serializable {
    private com.vmware.vim25.UserSession[] userSession;

    public ArrayOfUserSession() {
    }

    public ArrayOfUserSession(
           com.vmware.vim25.UserSession[] userSession) {
           this.userSession = userSession;
    }


    /**
     * Gets the userSession value for this ArrayOfUserSession.
     * 
     * @return userSession
     */
    public com.vmware.vim25.UserSession[] getUserSession() {
        return userSession;
    }


    /**
     * Sets the userSession value for this ArrayOfUserSession.
     * 
     * @param userSession
     */
    public void setUserSession(com.vmware.vim25.UserSession[] userSession) {
        this.userSession = userSession;
    }

    public com.vmware.vim25.UserSession getUserSession(int i) {
        return this.userSession[i];
    }

    public void setUserSession(int i, com.vmware.vim25.UserSession _value) {
        this.userSession[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfUserSession)) return false;
        ArrayOfUserSession other = (ArrayOfUserSession) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userSession==null && other.getUserSession()==null) || 
             (this.userSession!=null &&
              java.util.Arrays.equals(this.userSession, other.getUserSession())));
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
        if (getUserSession() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUserSession());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUserSession(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfUserSession.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfUserSession"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userSession");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "UserSession"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "UserSession"));
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
