/**
 * ArrayOfHostPathSelectionPolicyOption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfHostPathSelectionPolicyOption  implements java.io.Serializable {
    private com.vmware.vim25.HostPathSelectionPolicyOption[] hostPathSelectionPolicyOption;

    public ArrayOfHostPathSelectionPolicyOption() {
    }

    public ArrayOfHostPathSelectionPolicyOption(
           com.vmware.vim25.HostPathSelectionPolicyOption[] hostPathSelectionPolicyOption) {
           this.hostPathSelectionPolicyOption = hostPathSelectionPolicyOption;
    }


    /**
     * Gets the hostPathSelectionPolicyOption value for this ArrayOfHostPathSelectionPolicyOption.
     * 
     * @return hostPathSelectionPolicyOption
     */
    public com.vmware.vim25.HostPathSelectionPolicyOption[] getHostPathSelectionPolicyOption() {
        return hostPathSelectionPolicyOption;
    }


    /**
     * Sets the hostPathSelectionPolicyOption value for this ArrayOfHostPathSelectionPolicyOption.
     * 
     * @param hostPathSelectionPolicyOption
     */
    public void setHostPathSelectionPolicyOption(com.vmware.vim25.HostPathSelectionPolicyOption[] hostPathSelectionPolicyOption) {
        this.hostPathSelectionPolicyOption = hostPathSelectionPolicyOption;
    }

    public com.vmware.vim25.HostPathSelectionPolicyOption getHostPathSelectionPolicyOption(int i) {
        return this.hostPathSelectionPolicyOption[i];
    }

    public void setHostPathSelectionPolicyOption(int i, com.vmware.vim25.HostPathSelectionPolicyOption _value) {
        this.hostPathSelectionPolicyOption[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfHostPathSelectionPolicyOption)) return false;
        ArrayOfHostPathSelectionPolicyOption other = (ArrayOfHostPathSelectionPolicyOption) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hostPathSelectionPolicyOption==null && other.getHostPathSelectionPolicyOption()==null) || 
             (this.hostPathSelectionPolicyOption!=null &&
              java.util.Arrays.equals(this.hostPathSelectionPolicyOption, other.getHostPathSelectionPolicyOption())));
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
        if (getHostPathSelectionPolicyOption() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostPathSelectionPolicyOption());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostPathSelectionPolicyOption(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfHostPathSelectionPolicyOption.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfHostPathSelectionPolicyOption"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostPathSelectionPolicyOption");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "HostPathSelectionPolicyOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostPathSelectionPolicyOption"));
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
