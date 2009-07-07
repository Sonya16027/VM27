/**
 * WeekOfMonth.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class WeekOfMonth implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected WeekOfMonth(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _first = "first";
    public static final java.lang.String _second = "second";
    public static final java.lang.String _third = "third";
    public static final java.lang.String _fourth = "fourth";
    public static final java.lang.String _last = "last";
    public static final WeekOfMonth first = new WeekOfMonth(_first);
    public static final WeekOfMonth second = new WeekOfMonth(_second);
    public static final WeekOfMonth third = new WeekOfMonth(_third);
    public static final WeekOfMonth fourth = new WeekOfMonth(_fourth);
    public static final WeekOfMonth last = new WeekOfMonth(_last);
    public java.lang.String getValue() { return _value_;}
    public static WeekOfMonth fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        WeekOfMonth enumeration = (WeekOfMonth)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static WeekOfMonth fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(WeekOfMonth.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "WeekOfMonth"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
