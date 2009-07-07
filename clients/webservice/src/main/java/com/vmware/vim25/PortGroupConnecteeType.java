/**
 * PortGroupConnecteeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class PortGroupConnecteeType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PortGroupConnecteeType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _virtualMachine = "virtualMachine";
    public static final java.lang.String _systemManagement = "systemManagement";
    public static final java.lang.String _host = "host";
    public static final java.lang.String _unknown = "unknown";
    public static final PortGroupConnecteeType virtualMachine = new PortGroupConnecteeType(_virtualMachine);
    public static final PortGroupConnecteeType systemManagement = new PortGroupConnecteeType(_systemManagement);
    public static final PortGroupConnecteeType host = new PortGroupConnecteeType(_host);
    public static final PortGroupConnecteeType unknown = new PortGroupConnecteeType(_unknown);
    public java.lang.String getValue() { return _value_;}
    public static PortGroupConnecteeType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        PortGroupConnecteeType enumeration = (PortGroupConnecteeType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static PortGroupConnecteeType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(PortGroupConnecteeType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "PortGroupConnecteeType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
