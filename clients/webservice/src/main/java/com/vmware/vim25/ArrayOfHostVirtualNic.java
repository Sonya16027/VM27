/**
 * ArrayOfHostVirtualNic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfHostVirtualNic  implements java.io.Serializable {
    private com.vmware.vim25.HostVirtualNic[] hostVirtualNic;

    public ArrayOfHostVirtualNic() {
    }

    public ArrayOfHostVirtualNic(
           com.vmware.vim25.HostVirtualNic[] hostVirtualNic) {
           this.hostVirtualNic = hostVirtualNic;
    }


    /**
     * Gets the hostVirtualNic value for this ArrayOfHostVirtualNic.
     * 
     * @return hostVirtualNic
     */
    public com.vmware.vim25.HostVirtualNic[] getHostVirtualNic() {
        return hostVirtualNic;
    }


    /**
     * Sets the hostVirtualNic value for this ArrayOfHostVirtualNic.
     * 
     * @param hostVirtualNic
     */
    public void setHostVirtualNic(com.vmware.vim25.HostVirtualNic[] hostVirtualNic) {
        this.hostVirtualNic = hostVirtualNic;
    }

    public com.vmware.vim25.HostVirtualNic getHostVirtualNic(int i) {
        return this.hostVirtualNic[i];
    }

    public void setHostVirtualNic(int i, com.vmware.vim25.HostVirtualNic _value) {
        this.hostVirtualNic[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfHostVirtualNic)) return false;
        ArrayOfHostVirtualNic other = (ArrayOfHostVirtualNic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hostVirtualNic==null && other.getHostVirtualNic()==null) || 
             (this.hostVirtualNic!=null &&
              java.util.Arrays.equals(this.hostVirtualNic, other.getHostVirtualNic())));
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
        if (getHostVirtualNic() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostVirtualNic());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostVirtualNic(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfHostVirtualNic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfHostVirtualNic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostVirtualNic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "HostVirtualNic"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostVirtualNic"));
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
