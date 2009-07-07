/**
 * DistributedVirtualSwitchHostMemberHostComponentState.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class DistributedVirtualSwitchHostMemberHostComponentState implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DistributedVirtualSwitchHostMemberHostComponentState(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _up = "up";
    public static final java.lang.String _pending = "pending";
    public static final java.lang.String _outOfSync = "outOfSync";
    public static final java.lang.String _warning = "warning";
    public static final java.lang.String _disconnected = "disconnected";
    public static final java.lang.String _down = "down";
    public static final DistributedVirtualSwitchHostMemberHostComponentState up = new DistributedVirtualSwitchHostMemberHostComponentState(_up);
    public static final DistributedVirtualSwitchHostMemberHostComponentState pending = new DistributedVirtualSwitchHostMemberHostComponentState(_pending);
    public static final DistributedVirtualSwitchHostMemberHostComponentState outOfSync = new DistributedVirtualSwitchHostMemberHostComponentState(_outOfSync);
    public static final DistributedVirtualSwitchHostMemberHostComponentState warning = new DistributedVirtualSwitchHostMemberHostComponentState(_warning);
    public static final DistributedVirtualSwitchHostMemberHostComponentState disconnected = new DistributedVirtualSwitchHostMemberHostComponentState(_disconnected);
    public static final DistributedVirtualSwitchHostMemberHostComponentState down = new DistributedVirtualSwitchHostMemberHostComponentState(_down);
    public java.lang.String getValue() { return _value_;}
    public static DistributedVirtualSwitchHostMemberHostComponentState fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        DistributedVirtualSwitchHostMemberHostComponentState enumeration = (DistributedVirtualSwitchHostMemberHostComponentState)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static DistributedVirtualSwitchHostMemberHostComponentState fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(DistributedVirtualSwitchHostMemberHostComponentState.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DistributedVirtualSwitchHostMemberHostComponentState"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
