/**
 * ArrayOfDvsProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfDvsProfile  implements java.io.Serializable {
    private com.vmware.vim25.DvsProfile[] dvsProfile;

    public ArrayOfDvsProfile() {
    }

    public ArrayOfDvsProfile(
           com.vmware.vim25.DvsProfile[] dvsProfile) {
           this.dvsProfile = dvsProfile;
    }


    /**
     * Gets the dvsProfile value for this ArrayOfDvsProfile.
     * 
     * @return dvsProfile
     */
    public com.vmware.vim25.DvsProfile[] getDvsProfile() {
        return dvsProfile;
    }


    /**
     * Sets the dvsProfile value for this ArrayOfDvsProfile.
     * 
     * @param dvsProfile
     */
    public void setDvsProfile(com.vmware.vim25.DvsProfile[] dvsProfile) {
        this.dvsProfile = dvsProfile;
    }

    public com.vmware.vim25.DvsProfile getDvsProfile(int i) {
        return this.dvsProfile[i];
    }

    public void setDvsProfile(int i, com.vmware.vim25.DvsProfile _value) {
        this.dvsProfile[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfDvsProfile)) return false;
        ArrayOfDvsProfile other = (ArrayOfDvsProfile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dvsProfile==null && other.getDvsProfile()==null) || 
             (this.dvsProfile!=null &&
              java.util.Arrays.equals(this.dvsProfile, other.getDvsProfile())));
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
        if (getDvsProfile() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDvsProfile());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDvsProfile(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfDvsProfile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfDvsProfile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dvsProfile");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "DvsProfile"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DvsProfile"));
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
