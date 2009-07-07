/**
 * ArrayOfHostPlugStoreTopologyAdapter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfHostPlugStoreTopologyAdapter  implements java.io.Serializable {
    private com.vmware.vim25.HostPlugStoreTopologyAdapter[] hostPlugStoreTopologyAdapter;

    public ArrayOfHostPlugStoreTopologyAdapter() {
    }

    public ArrayOfHostPlugStoreTopologyAdapter(
           com.vmware.vim25.HostPlugStoreTopologyAdapter[] hostPlugStoreTopologyAdapter) {
           this.hostPlugStoreTopologyAdapter = hostPlugStoreTopologyAdapter;
    }


    /**
     * Gets the hostPlugStoreTopologyAdapter value for this ArrayOfHostPlugStoreTopologyAdapter.
     * 
     * @return hostPlugStoreTopologyAdapter
     */
    public com.vmware.vim25.HostPlugStoreTopologyAdapter[] getHostPlugStoreTopologyAdapter() {
        return hostPlugStoreTopologyAdapter;
    }


    /**
     * Sets the hostPlugStoreTopologyAdapter value for this ArrayOfHostPlugStoreTopologyAdapter.
     * 
     * @param hostPlugStoreTopologyAdapter
     */
    public void setHostPlugStoreTopologyAdapter(com.vmware.vim25.HostPlugStoreTopologyAdapter[] hostPlugStoreTopologyAdapter) {
        this.hostPlugStoreTopologyAdapter = hostPlugStoreTopologyAdapter;
    }

    public com.vmware.vim25.HostPlugStoreTopologyAdapter getHostPlugStoreTopologyAdapter(int i) {
        return this.hostPlugStoreTopologyAdapter[i];
    }

    public void setHostPlugStoreTopologyAdapter(int i, com.vmware.vim25.HostPlugStoreTopologyAdapter _value) {
        this.hostPlugStoreTopologyAdapter[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfHostPlugStoreTopologyAdapter)) return false;
        ArrayOfHostPlugStoreTopologyAdapter other = (ArrayOfHostPlugStoreTopologyAdapter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hostPlugStoreTopologyAdapter==null && other.getHostPlugStoreTopologyAdapter()==null) || 
             (this.hostPlugStoreTopologyAdapter!=null &&
              java.util.Arrays.equals(this.hostPlugStoreTopologyAdapter, other.getHostPlugStoreTopologyAdapter())));
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
        if (getHostPlugStoreTopologyAdapter() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostPlugStoreTopologyAdapter());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostPlugStoreTopologyAdapter(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfHostPlugStoreTopologyAdapter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfHostPlugStoreTopologyAdapter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostPlugStoreTopologyAdapter");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "HostPlugStoreTopologyAdapter"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostPlugStoreTopologyAdapter"));
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
