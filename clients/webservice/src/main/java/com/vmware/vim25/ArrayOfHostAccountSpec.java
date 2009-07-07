/**
 * ArrayOfHostAccountSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfHostAccountSpec  implements java.io.Serializable {
    private com.vmware.vim25.HostAccountSpec[] hostAccountSpec;

    public ArrayOfHostAccountSpec() {
    }

    public ArrayOfHostAccountSpec(
           com.vmware.vim25.HostAccountSpec[] hostAccountSpec) {
           this.hostAccountSpec = hostAccountSpec;
    }


    /**
     * Gets the hostAccountSpec value for this ArrayOfHostAccountSpec.
     * 
     * @return hostAccountSpec
     */
    public com.vmware.vim25.HostAccountSpec[] getHostAccountSpec() {
        return hostAccountSpec;
    }


    /**
     * Sets the hostAccountSpec value for this ArrayOfHostAccountSpec.
     * 
     * @param hostAccountSpec
     */
    public void setHostAccountSpec(com.vmware.vim25.HostAccountSpec[] hostAccountSpec) {
        this.hostAccountSpec = hostAccountSpec;
    }

    public com.vmware.vim25.HostAccountSpec getHostAccountSpec(int i) {
        return this.hostAccountSpec[i];
    }

    public void setHostAccountSpec(int i, com.vmware.vim25.HostAccountSpec _value) {
        this.hostAccountSpec[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfHostAccountSpec)) return false;
        ArrayOfHostAccountSpec other = (ArrayOfHostAccountSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hostAccountSpec==null && other.getHostAccountSpec()==null) || 
             (this.hostAccountSpec!=null &&
              java.util.Arrays.equals(this.hostAccountSpec, other.getHostAccountSpec())));
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
        if (getHostAccountSpec() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostAccountSpec());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostAccountSpec(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfHostAccountSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfHostAccountSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostAccountSpec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "HostAccountSpec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostAccountSpec"));
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
