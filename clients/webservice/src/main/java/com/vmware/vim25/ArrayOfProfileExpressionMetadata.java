/**
 * ArrayOfProfileExpressionMetadata.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfProfileExpressionMetadata  implements java.io.Serializable {
    private com.vmware.vim25.ProfileExpressionMetadata[] profileExpressionMetadata;

    public ArrayOfProfileExpressionMetadata() {
    }

    public ArrayOfProfileExpressionMetadata(
           com.vmware.vim25.ProfileExpressionMetadata[] profileExpressionMetadata) {
           this.profileExpressionMetadata = profileExpressionMetadata;
    }


    /**
     * Gets the profileExpressionMetadata value for this ArrayOfProfileExpressionMetadata.
     * 
     * @return profileExpressionMetadata
     */
    public com.vmware.vim25.ProfileExpressionMetadata[] getProfileExpressionMetadata() {
        return profileExpressionMetadata;
    }


    /**
     * Sets the profileExpressionMetadata value for this ArrayOfProfileExpressionMetadata.
     * 
     * @param profileExpressionMetadata
     */
    public void setProfileExpressionMetadata(com.vmware.vim25.ProfileExpressionMetadata[] profileExpressionMetadata) {
        this.profileExpressionMetadata = profileExpressionMetadata;
    }

    public com.vmware.vim25.ProfileExpressionMetadata getProfileExpressionMetadata(int i) {
        return this.profileExpressionMetadata[i];
    }

    public void setProfileExpressionMetadata(int i, com.vmware.vim25.ProfileExpressionMetadata _value) {
        this.profileExpressionMetadata[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfProfileExpressionMetadata)) return false;
        ArrayOfProfileExpressionMetadata other = (ArrayOfProfileExpressionMetadata) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.profileExpressionMetadata==null && other.getProfileExpressionMetadata()==null) || 
             (this.profileExpressionMetadata!=null &&
              java.util.Arrays.equals(this.profileExpressionMetadata, other.getProfileExpressionMetadata())));
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
        if (getProfileExpressionMetadata() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProfileExpressionMetadata());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProfileExpressionMetadata(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfProfileExpressionMetadata.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfProfileExpressionMetadata"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profileExpressionMetadata");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ProfileExpressionMetadata"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ProfileExpressionMetadata"));
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
