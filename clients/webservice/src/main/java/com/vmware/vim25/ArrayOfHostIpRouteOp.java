/**
 * ArrayOfHostIpRouteOp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfHostIpRouteOp  implements java.io.Serializable {
    private com.vmware.vim25.HostIpRouteOp[] hostIpRouteOp;

    public ArrayOfHostIpRouteOp() {
    }

    public ArrayOfHostIpRouteOp(
           com.vmware.vim25.HostIpRouteOp[] hostIpRouteOp) {
           this.hostIpRouteOp = hostIpRouteOp;
    }


    /**
     * Gets the hostIpRouteOp value for this ArrayOfHostIpRouteOp.
     * 
     * @return hostIpRouteOp
     */
    public com.vmware.vim25.HostIpRouteOp[] getHostIpRouteOp() {
        return hostIpRouteOp;
    }


    /**
     * Sets the hostIpRouteOp value for this ArrayOfHostIpRouteOp.
     * 
     * @param hostIpRouteOp
     */
    public void setHostIpRouteOp(com.vmware.vim25.HostIpRouteOp[] hostIpRouteOp) {
        this.hostIpRouteOp = hostIpRouteOp;
    }

    public com.vmware.vim25.HostIpRouteOp getHostIpRouteOp(int i) {
        return this.hostIpRouteOp[i];
    }

    public void setHostIpRouteOp(int i, com.vmware.vim25.HostIpRouteOp _value) {
        this.hostIpRouteOp[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfHostIpRouteOp)) return false;
        ArrayOfHostIpRouteOp other = (ArrayOfHostIpRouteOp) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hostIpRouteOp==null && other.getHostIpRouteOp()==null) || 
             (this.hostIpRouteOp!=null &&
              java.util.Arrays.equals(this.hostIpRouteOp, other.getHostIpRouteOp())));
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
        if (getHostIpRouteOp() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostIpRouteOp());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostIpRouteOp(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfHostIpRouteOp.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfHostIpRouteOp"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostIpRouteOp");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "HostIpRouteOp"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostIpRouteOp"));
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
