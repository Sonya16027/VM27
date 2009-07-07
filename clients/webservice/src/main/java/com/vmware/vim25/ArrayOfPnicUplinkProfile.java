/**
 * ArrayOfPnicUplinkProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfPnicUplinkProfile  implements java.io.Serializable {
    private com.vmware.vim25.PnicUplinkProfile[] pnicUplinkProfile;

    public ArrayOfPnicUplinkProfile() {
    }

    public ArrayOfPnicUplinkProfile(
           com.vmware.vim25.PnicUplinkProfile[] pnicUplinkProfile) {
           this.pnicUplinkProfile = pnicUplinkProfile;
    }


    /**
     * Gets the pnicUplinkProfile value for this ArrayOfPnicUplinkProfile.
     * 
     * @return pnicUplinkProfile
     */
    public com.vmware.vim25.PnicUplinkProfile[] getPnicUplinkProfile() {
        return pnicUplinkProfile;
    }


    /**
     * Sets the pnicUplinkProfile value for this ArrayOfPnicUplinkProfile.
     * 
     * @param pnicUplinkProfile
     */
    public void setPnicUplinkProfile(com.vmware.vim25.PnicUplinkProfile[] pnicUplinkProfile) {
        this.pnicUplinkProfile = pnicUplinkProfile;
    }

    public com.vmware.vim25.PnicUplinkProfile getPnicUplinkProfile(int i) {
        return this.pnicUplinkProfile[i];
    }

    public void setPnicUplinkProfile(int i, com.vmware.vim25.PnicUplinkProfile _value) {
        this.pnicUplinkProfile[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfPnicUplinkProfile)) return false;
        ArrayOfPnicUplinkProfile other = (ArrayOfPnicUplinkProfile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pnicUplinkProfile==null && other.getPnicUplinkProfile()==null) || 
             (this.pnicUplinkProfile!=null &&
              java.util.Arrays.equals(this.pnicUplinkProfile, other.getPnicUplinkProfile())));
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
        if (getPnicUplinkProfile() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPnicUplinkProfile());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPnicUplinkProfile(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfPnicUplinkProfile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfPnicUplinkProfile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pnicUplinkProfile");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "PnicUplinkProfile"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "PnicUplinkProfile"));
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
