/**
 * ArrayOfVAppPropertySpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfVAppPropertySpec  implements java.io.Serializable {
    private com.vmware.vim25.VAppPropertySpec[] VAppPropertySpec;

    public ArrayOfVAppPropertySpec() {
    }

    public ArrayOfVAppPropertySpec(
           com.vmware.vim25.VAppPropertySpec[] VAppPropertySpec) {
           this.VAppPropertySpec = VAppPropertySpec;
    }


    /**
     * Gets the VAppPropertySpec value for this ArrayOfVAppPropertySpec.
     * 
     * @return VAppPropertySpec
     */
    public com.vmware.vim25.VAppPropertySpec[] getVAppPropertySpec() {
        return VAppPropertySpec;
    }


    /**
     * Sets the VAppPropertySpec value for this ArrayOfVAppPropertySpec.
     * 
     * @param VAppPropertySpec
     */
    public void setVAppPropertySpec(com.vmware.vim25.VAppPropertySpec[] VAppPropertySpec) {
        this.VAppPropertySpec = VAppPropertySpec;
    }

    public com.vmware.vim25.VAppPropertySpec getVAppPropertySpec(int i) {
        return this.VAppPropertySpec[i];
    }

    public void setVAppPropertySpec(int i, com.vmware.vim25.VAppPropertySpec _value) {
        this.VAppPropertySpec[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfVAppPropertySpec)) return false;
        ArrayOfVAppPropertySpec other = (ArrayOfVAppPropertySpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.VAppPropertySpec==null && other.getVAppPropertySpec()==null) || 
             (this.VAppPropertySpec!=null &&
              java.util.Arrays.equals(this.VAppPropertySpec, other.getVAppPropertySpec())));
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
        if (getVAppPropertySpec() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVAppPropertySpec());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVAppPropertySpec(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfVAppPropertySpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfVAppPropertySpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VAppPropertySpec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "VAppPropertySpec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VAppPropertySpec"));
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
