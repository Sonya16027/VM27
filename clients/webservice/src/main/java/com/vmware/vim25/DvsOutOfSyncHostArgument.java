/**
 * DvsOutOfSyncHostArgument.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class DvsOutOfSyncHostArgument  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private com.vmware.vim25.HostEventArgument outOfSyncHost;

    private java.lang.String[] configParamters;

    public DvsOutOfSyncHostArgument() {
    }

    public DvsOutOfSyncHostArgument(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           com.vmware.vim25.HostEventArgument outOfSyncHost,
           java.lang.String[] configParamters) {
        super(
            dynamicType,
            dynamicProperty);
        this.outOfSyncHost = outOfSyncHost;
        this.configParamters = configParamters;
    }


    /**
     * Gets the outOfSyncHost value for this DvsOutOfSyncHostArgument.
     * 
     * @return outOfSyncHost
     */
    public com.vmware.vim25.HostEventArgument getOutOfSyncHost() {
        return outOfSyncHost;
    }


    /**
     * Sets the outOfSyncHost value for this DvsOutOfSyncHostArgument.
     * 
     * @param outOfSyncHost
     */
    public void setOutOfSyncHost(com.vmware.vim25.HostEventArgument outOfSyncHost) {
        this.outOfSyncHost = outOfSyncHost;
    }


    /**
     * Gets the configParamters value for this DvsOutOfSyncHostArgument.
     * 
     * @return configParamters
     */
    public java.lang.String[] getConfigParamters() {
        return configParamters;
    }


    /**
     * Sets the configParamters value for this DvsOutOfSyncHostArgument.
     * 
     * @param configParamters
     */
    public void setConfigParamters(java.lang.String[] configParamters) {
        this.configParamters = configParamters;
    }

    public java.lang.String getConfigParamters(int i) {
        return this.configParamters[i];
    }

    public void setConfigParamters(int i, java.lang.String _value) {
        this.configParamters[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DvsOutOfSyncHostArgument)) return false;
        DvsOutOfSyncHostArgument other = (DvsOutOfSyncHostArgument) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.outOfSyncHost==null && other.getOutOfSyncHost()==null) || 
             (this.outOfSyncHost!=null &&
              this.outOfSyncHost.equals(other.getOutOfSyncHost()))) &&
            ((this.configParamters==null && other.getConfigParamters()==null) || 
             (this.configParamters!=null &&
              java.util.Arrays.equals(this.configParamters, other.getConfigParamters())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getOutOfSyncHost() != null) {
            _hashCode += getOutOfSyncHost().hashCode();
        }
        if (getConfigParamters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConfigParamters());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConfigParamters(), i);
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
        new org.apache.axis.description.TypeDesc(DvsOutOfSyncHostArgument.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DvsOutOfSyncHostArgument"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outOfSyncHost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "outOfSyncHost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostEventArgument"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("configParamters");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "configParamters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
