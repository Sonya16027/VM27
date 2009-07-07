/**
 * ArrayOfVirtualSwitchProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfVirtualSwitchProfile  implements java.io.Serializable {
    private com.vmware.vim25.VirtualSwitchProfile[] virtualSwitchProfile;

    public ArrayOfVirtualSwitchProfile() {
    }

    public ArrayOfVirtualSwitchProfile(
           com.vmware.vim25.VirtualSwitchProfile[] virtualSwitchProfile) {
           this.virtualSwitchProfile = virtualSwitchProfile;
    }


    /**
     * Gets the virtualSwitchProfile value for this ArrayOfVirtualSwitchProfile.
     * 
     * @return virtualSwitchProfile
     */
    public com.vmware.vim25.VirtualSwitchProfile[] getVirtualSwitchProfile() {
        return virtualSwitchProfile;
    }


    /**
     * Sets the virtualSwitchProfile value for this ArrayOfVirtualSwitchProfile.
     * 
     * @param virtualSwitchProfile
     */
    public void setVirtualSwitchProfile(com.vmware.vim25.VirtualSwitchProfile[] virtualSwitchProfile) {
        this.virtualSwitchProfile = virtualSwitchProfile;
    }

    public com.vmware.vim25.VirtualSwitchProfile getVirtualSwitchProfile(int i) {
        return this.virtualSwitchProfile[i];
    }

    public void setVirtualSwitchProfile(int i, com.vmware.vim25.VirtualSwitchProfile _value) {
        this.virtualSwitchProfile[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfVirtualSwitchProfile)) return false;
        ArrayOfVirtualSwitchProfile other = (ArrayOfVirtualSwitchProfile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.virtualSwitchProfile==null && other.getVirtualSwitchProfile()==null) || 
             (this.virtualSwitchProfile!=null &&
              java.util.Arrays.equals(this.virtualSwitchProfile, other.getVirtualSwitchProfile())));
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
        if (getVirtualSwitchProfile() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVirtualSwitchProfile());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVirtualSwitchProfile(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfVirtualSwitchProfile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfVirtualSwitchProfile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("virtualSwitchProfile");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "VirtualSwitchProfile"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualSwitchProfile"));
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
