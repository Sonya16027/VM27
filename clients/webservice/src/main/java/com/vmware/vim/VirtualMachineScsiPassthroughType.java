/**
 * VirtualMachineScsiPassthroughType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class VirtualMachineScsiPassthroughType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected VirtualMachineScsiPassthroughType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _disk = "disk";
    public static final java.lang.String _tape = "tape";
    public static final java.lang.String _printer = "printer";
    public static final java.lang.String _processor = "processor";
    public static final java.lang.String _worm = "worm";
    public static final java.lang.String _cdrom = "cdrom";
    public static final java.lang.String _scanner = "scanner";
    public static final java.lang.String _optical = "optical";
    public static final java.lang.String _media = "media";
    public static final java.lang.String _com = "com";
    public static final java.lang.String _raid = "raid";
    public static final java.lang.String _unknown = "unknown";
    public static final VirtualMachineScsiPassthroughType disk = new VirtualMachineScsiPassthroughType(_disk);
    public static final VirtualMachineScsiPassthroughType tape = new VirtualMachineScsiPassthroughType(_tape);
    public static final VirtualMachineScsiPassthroughType printer = new VirtualMachineScsiPassthroughType(_printer);
    public static final VirtualMachineScsiPassthroughType processor = new VirtualMachineScsiPassthroughType(_processor);
    public static final VirtualMachineScsiPassthroughType worm = new VirtualMachineScsiPassthroughType(_worm);
    public static final VirtualMachineScsiPassthroughType cdrom = new VirtualMachineScsiPassthroughType(_cdrom);
    public static final VirtualMachineScsiPassthroughType scanner = new VirtualMachineScsiPassthroughType(_scanner);
    public static final VirtualMachineScsiPassthroughType optical = new VirtualMachineScsiPassthroughType(_optical);
    public static final VirtualMachineScsiPassthroughType media = new VirtualMachineScsiPassthroughType(_media);
    public static final VirtualMachineScsiPassthroughType com = new VirtualMachineScsiPassthroughType(_com);
    public static final VirtualMachineScsiPassthroughType raid = new VirtualMachineScsiPassthroughType(_raid);
    public static final VirtualMachineScsiPassthroughType unknown = new VirtualMachineScsiPassthroughType(_unknown);
    public java.lang.String getValue() { return _value_;}
    public static VirtualMachineScsiPassthroughType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        VirtualMachineScsiPassthroughType enumeration = (VirtualMachineScsiPassthroughType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static VirtualMachineScsiPassthroughType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(VirtualMachineScsiPassthroughType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "VirtualMachineScsiPassthroughType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
