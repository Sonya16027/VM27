/**
 * ArrayOfHostNatServicePortForwardSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfHostNatServicePortForwardSpec  implements java.io.Serializable {
    private com.vmware.vim25.HostNatServicePortForwardSpec[] hostNatServicePortForwardSpec;

    public ArrayOfHostNatServicePortForwardSpec() {
    }

    public ArrayOfHostNatServicePortForwardSpec(
           com.vmware.vim25.HostNatServicePortForwardSpec[] hostNatServicePortForwardSpec) {
           this.hostNatServicePortForwardSpec = hostNatServicePortForwardSpec;
    }


    /**
     * Gets the hostNatServicePortForwardSpec value for this ArrayOfHostNatServicePortForwardSpec.
     * 
     * @return hostNatServicePortForwardSpec
     */
    public com.vmware.vim25.HostNatServicePortForwardSpec[] getHostNatServicePortForwardSpec() {
        return hostNatServicePortForwardSpec;
    }


    /**
     * Sets the hostNatServicePortForwardSpec value for this ArrayOfHostNatServicePortForwardSpec.
     * 
     * @param hostNatServicePortForwardSpec
     */
    public void setHostNatServicePortForwardSpec(com.vmware.vim25.HostNatServicePortForwardSpec[] hostNatServicePortForwardSpec) {
        this.hostNatServicePortForwardSpec = hostNatServicePortForwardSpec;
    }

    public com.vmware.vim25.HostNatServicePortForwardSpec getHostNatServicePortForwardSpec(int i) {
        return this.hostNatServicePortForwardSpec[i];
    }

    public void setHostNatServicePortForwardSpec(int i, com.vmware.vim25.HostNatServicePortForwardSpec _value) {
        this.hostNatServicePortForwardSpec[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfHostNatServicePortForwardSpec)) return false;
        ArrayOfHostNatServicePortForwardSpec other = (ArrayOfHostNatServicePortForwardSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hostNatServicePortForwardSpec==null && other.getHostNatServicePortForwardSpec()==null) || 
             (this.hostNatServicePortForwardSpec!=null &&
              java.util.Arrays.equals(this.hostNatServicePortForwardSpec, other.getHostNatServicePortForwardSpec())));
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
        if (getHostNatServicePortForwardSpec() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostNatServicePortForwardSpec());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostNatServicePortForwardSpec(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfHostNatServicePortForwardSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfHostNatServicePortForwardSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostNatServicePortForwardSpec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "HostNatServicePortForwardSpec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostNatServicePortForwardSpec"));
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
