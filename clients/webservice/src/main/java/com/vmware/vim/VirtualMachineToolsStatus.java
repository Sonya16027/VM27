/**
 * VirtualMachineToolsStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class VirtualMachineToolsStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected VirtualMachineToolsStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _toolsNotInstalled = "toolsNotInstalled";
    public static final java.lang.String _toolsNotRunning = "toolsNotRunning";
    public static final java.lang.String _toolsOld = "toolsOld";
    public static final java.lang.String _toolsOk = "toolsOk";
    public static final VirtualMachineToolsStatus toolsNotInstalled = new VirtualMachineToolsStatus(_toolsNotInstalled);
    public static final VirtualMachineToolsStatus toolsNotRunning = new VirtualMachineToolsStatus(_toolsNotRunning);
    public static final VirtualMachineToolsStatus toolsOld = new VirtualMachineToolsStatus(_toolsOld);
    public static final VirtualMachineToolsStatus toolsOk = new VirtualMachineToolsStatus(_toolsOk);
    public java.lang.String getValue() { return _value_;}
    public static VirtualMachineToolsStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        VirtualMachineToolsStatus enumeration = (VirtualMachineToolsStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static VirtualMachineToolsStatus fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(VirtualMachineToolsStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "VirtualMachineToolsStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
