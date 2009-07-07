/**
 * VirtualMachineConnectionState.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class VirtualMachineConnectionState implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected VirtualMachineConnectionState(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _connected = "connected";
    public static final java.lang.String _disconnected = "disconnected";
    public static final java.lang.String _orphaned = "orphaned";
    public static final java.lang.String _inaccessible = "inaccessible";
    public static final java.lang.String _invalid = "invalid";
    public static final VirtualMachineConnectionState connected = new VirtualMachineConnectionState(_connected);
    public static final VirtualMachineConnectionState disconnected = new VirtualMachineConnectionState(_disconnected);
    public static final VirtualMachineConnectionState orphaned = new VirtualMachineConnectionState(_orphaned);
    public static final VirtualMachineConnectionState inaccessible = new VirtualMachineConnectionState(_inaccessible);
    public static final VirtualMachineConnectionState invalid = new VirtualMachineConnectionState(_invalid);
    public java.lang.String getValue() { return _value_;}
    public static VirtualMachineConnectionState fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        VirtualMachineConnectionState enumeration = (VirtualMachineConnectionState)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static VirtualMachineConnectionState fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(VirtualMachineConnectionState.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "VirtualMachineConnectionState"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
