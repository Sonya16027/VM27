/**
 * AutoStartAction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class AutoStartAction implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AutoStartAction(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _none = "none";
    public static final java.lang.String _systemDefault = "systemDefault";
    public static final java.lang.String _powerOn = "powerOn";
    public static final java.lang.String _powerOff = "powerOff";
    public static final java.lang.String _guestShutdown = "guestShutdown";
    public static final java.lang.String _suspend = "suspend";
    public static final AutoStartAction none = new AutoStartAction(_none);
    public static final AutoStartAction systemDefault = new AutoStartAction(_systemDefault);
    public static final AutoStartAction powerOn = new AutoStartAction(_powerOn);
    public static final AutoStartAction powerOff = new AutoStartAction(_powerOff);
    public static final AutoStartAction guestShutdown = new AutoStartAction(_guestShutdown);
    public static final AutoStartAction suspend = new AutoStartAction(_suspend);
    public java.lang.String getValue() { return _value_;}
    public static AutoStartAction fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AutoStartAction enumeration = (AutoStartAction)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AutoStartAction fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(AutoStartAction.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "AutoStartAction"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
