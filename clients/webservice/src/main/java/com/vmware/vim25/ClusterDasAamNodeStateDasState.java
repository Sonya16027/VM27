/**
 * ClusterDasAamNodeStateDasState.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ClusterDasAamNodeStateDasState implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ClusterDasAamNodeStateDasState(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _uninitialized = "uninitialized";
    public static final java.lang.String _initialized = "initialized";
    public static final java.lang.String _configuring = "configuring";
    public static final java.lang.String _unconfiguring = "unconfiguring";
    public static final java.lang.String _running = "running";
    public static final java.lang.String _error = "error";
    public static final java.lang.String _agentShutdown = "agentShutdown";
    public static final java.lang.String _nodeFailed = "nodeFailed";
    public static final ClusterDasAamNodeStateDasState uninitialized = new ClusterDasAamNodeStateDasState(_uninitialized);
    public static final ClusterDasAamNodeStateDasState initialized = new ClusterDasAamNodeStateDasState(_initialized);
    public static final ClusterDasAamNodeStateDasState configuring = new ClusterDasAamNodeStateDasState(_configuring);
    public static final ClusterDasAamNodeStateDasState unconfiguring = new ClusterDasAamNodeStateDasState(_unconfiguring);
    public static final ClusterDasAamNodeStateDasState running = new ClusterDasAamNodeStateDasState(_running);
    public static final ClusterDasAamNodeStateDasState error = new ClusterDasAamNodeStateDasState(_error);
    public static final ClusterDasAamNodeStateDasState agentShutdown = new ClusterDasAamNodeStateDasState(_agentShutdown);
    public static final ClusterDasAamNodeStateDasState nodeFailed = new ClusterDasAamNodeStateDasState(_nodeFailed);
    public java.lang.String getValue() { return _value_;}
    public static ClusterDasAamNodeStateDasState fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ClusterDasAamNodeStateDasState enumeration = (ClusterDasAamNodeStateDasState)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ClusterDasAamNodeStateDasState fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ClusterDasAamNodeStateDasState.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterDasAamNodeStateDasState"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
