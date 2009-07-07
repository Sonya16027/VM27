/**
 * ClusterDasAamNodeState.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ClusterDasAamNodeState  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private com.vmware.vim25.ManagedObjectReference host;

    private java.lang.String name;

    private java.lang.String configState;

    private java.lang.String runtimeState;

    public ClusterDasAamNodeState() {
    }

    public ClusterDasAamNodeState(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           com.vmware.vim25.ManagedObjectReference host,
           java.lang.String name,
           java.lang.String configState,
           java.lang.String runtimeState) {
        super(
            dynamicType,
            dynamicProperty);
        this.host = host;
        this.name = name;
        this.configState = configState;
        this.runtimeState = runtimeState;
    }


    /**
     * Gets the host value for this ClusterDasAamNodeState.
     * 
     * @return host
     */
    public com.vmware.vim25.ManagedObjectReference getHost() {
        return host;
    }


    /**
     * Sets the host value for this ClusterDasAamNodeState.
     * 
     * @param host
     */
    public void setHost(com.vmware.vim25.ManagedObjectReference host) {
        this.host = host;
    }


    /**
     * Gets the name value for this ClusterDasAamNodeState.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ClusterDasAamNodeState.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the configState value for this ClusterDasAamNodeState.
     * 
     * @return configState
     */
    public java.lang.String getConfigState() {
        return configState;
    }


    /**
     * Sets the configState value for this ClusterDasAamNodeState.
     * 
     * @param configState
     */
    public void setConfigState(java.lang.String configState) {
        this.configState = configState;
    }


    /**
     * Gets the runtimeState value for this ClusterDasAamNodeState.
     * 
     * @return runtimeState
     */
    public java.lang.String getRuntimeState() {
        return runtimeState;
    }


    /**
     * Sets the runtimeState value for this ClusterDasAamNodeState.
     * 
     * @param runtimeState
     */
    public void setRuntimeState(java.lang.String runtimeState) {
        this.runtimeState = runtimeState;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ClusterDasAamNodeState)) return false;
        ClusterDasAamNodeState other = (ClusterDasAamNodeState) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.host==null && other.getHost()==null) || 
             (this.host!=null &&
              this.host.equals(other.getHost()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.configState==null && other.getConfigState()==null) || 
             (this.configState!=null &&
              this.configState.equals(other.getConfigState()))) &&
            ((this.runtimeState==null && other.getRuntimeState()==null) || 
             (this.runtimeState!=null &&
              this.runtimeState.equals(other.getRuntimeState())));
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
        if (getHost() != null) {
            _hashCode += getHost().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getConfigState() != null) {
            _hashCode += getConfigState().hashCode();
        }
        if (getRuntimeState() != null) {
            _hashCode += getRuntimeState().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ClusterDasAamNodeState.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterDasAamNodeState"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("host");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "host"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("configState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "configState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("runtimeState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "runtimeState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
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
