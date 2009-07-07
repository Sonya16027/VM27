/**
 * ArrayOfDvsServiceConsoleVNicProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfDvsServiceConsoleVNicProfile  implements java.io.Serializable {
    private com.vmware.vim25.DvsServiceConsoleVNicProfile[] dvsServiceConsoleVNicProfile;

    public ArrayOfDvsServiceConsoleVNicProfile() {
    }

    public ArrayOfDvsServiceConsoleVNicProfile(
           com.vmware.vim25.DvsServiceConsoleVNicProfile[] dvsServiceConsoleVNicProfile) {
           this.dvsServiceConsoleVNicProfile = dvsServiceConsoleVNicProfile;
    }


    /**
     * Gets the dvsServiceConsoleVNicProfile value for this ArrayOfDvsServiceConsoleVNicProfile.
     * 
     * @return dvsServiceConsoleVNicProfile
     */
    public com.vmware.vim25.DvsServiceConsoleVNicProfile[] getDvsServiceConsoleVNicProfile() {
        return dvsServiceConsoleVNicProfile;
    }


    /**
     * Sets the dvsServiceConsoleVNicProfile value for this ArrayOfDvsServiceConsoleVNicProfile.
     * 
     * @param dvsServiceConsoleVNicProfile
     */
    public void setDvsServiceConsoleVNicProfile(com.vmware.vim25.DvsServiceConsoleVNicProfile[] dvsServiceConsoleVNicProfile) {
        this.dvsServiceConsoleVNicProfile = dvsServiceConsoleVNicProfile;
    }

    public com.vmware.vim25.DvsServiceConsoleVNicProfile getDvsServiceConsoleVNicProfile(int i) {
        return this.dvsServiceConsoleVNicProfile[i];
    }

    public void setDvsServiceConsoleVNicProfile(int i, com.vmware.vim25.DvsServiceConsoleVNicProfile _value) {
        this.dvsServiceConsoleVNicProfile[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfDvsServiceConsoleVNicProfile)) return false;
        ArrayOfDvsServiceConsoleVNicProfile other = (ArrayOfDvsServiceConsoleVNicProfile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dvsServiceConsoleVNicProfile==null && other.getDvsServiceConsoleVNicProfile()==null) || 
             (this.dvsServiceConsoleVNicProfile!=null &&
              java.util.Arrays.equals(this.dvsServiceConsoleVNicProfile, other.getDvsServiceConsoleVNicProfile())));
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
        if (getDvsServiceConsoleVNicProfile() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDvsServiceConsoleVNicProfile());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDvsServiceConsoleVNicProfile(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfDvsServiceConsoleVNicProfile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfDvsServiceConsoleVNicProfile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dvsServiceConsoleVNicProfile");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "DvsServiceConsoleVNicProfile"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DvsServiceConsoleVNicProfile"));
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
