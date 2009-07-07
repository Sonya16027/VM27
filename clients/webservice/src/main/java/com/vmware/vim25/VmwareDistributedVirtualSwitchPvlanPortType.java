/**
 * VmwareDistributedVirtualSwitchPvlanPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VmwareDistributedVirtualSwitchPvlanPortType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected VmwareDistributedVirtualSwitchPvlanPortType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _promiscuous = "promiscuous";
    public static final java.lang.String _isolated = "isolated";
    public static final java.lang.String _community = "community";
    public static final VmwareDistributedVirtualSwitchPvlanPortType promiscuous = new VmwareDistributedVirtualSwitchPvlanPortType(_promiscuous);
    public static final VmwareDistributedVirtualSwitchPvlanPortType isolated = new VmwareDistributedVirtualSwitchPvlanPortType(_isolated);
    public static final VmwareDistributedVirtualSwitchPvlanPortType community = new VmwareDistributedVirtualSwitchPvlanPortType(_community);
    public java.lang.String getValue() { return _value_;}
    public static VmwareDistributedVirtualSwitchPvlanPortType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        VmwareDistributedVirtualSwitchPvlanPortType enumeration = (VmwareDistributedVirtualSwitchPvlanPortType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static VmwareDistributedVirtualSwitchPvlanPortType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(VmwareDistributedVirtualSwitchPvlanPortType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VmwareDistributedVirtualSwitchPvlanPortType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
