/**
 * VirtualMachineFaultToleranceState.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VirtualMachineFaultToleranceState implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected VirtualMachineFaultToleranceState(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _notConfigured = "notConfigured";
    public static final java.lang.String _disabled = "disabled";
    public static final java.lang.String _enabled = "enabled";
    public static final java.lang.String _needSecondary = "needSecondary";
    public static final java.lang.String _starting = "starting";
    public static final java.lang.String _running = "running";
    public static final VirtualMachineFaultToleranceState notConfigured = new VirtualMachineFaultToleranceState(_notConfigured);
    public static final VirtualMachineFaultToleranceState disabled = new VirtualMachineFaultToleranceState(_disabled);
    public static final VirtualMachineFaultToleranceState enabled = new VirtualMachineFaultToleranceState(_enabled);
    public static final VirtualMachineFaultToleranceState needSecondary = new VirtualMachineFaultToleranceState(_needSecondary);
    public static final VirtualMachineFaultToleranceState starting = new VirtualMachineFaultToleranceState(_starting);
    public static final VirtualMachineFaultToleranceState running = new VirtualMachineFaultToleranceState(_running);
    public java.lang.String getValue() { return _value_;}
    public static VirtualMachineFaultToleranceState fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        VirtualMachineFaultToleranceState enumeration = (VirtualMachineFaultToleranceState)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static VirtualMachineFaultToleranceState fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(VirtualMachineFaultToleranceState.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineFaultToleranceState"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
