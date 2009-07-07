/**
 * PerformanceManagerUnit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class PerformanceManagerUnit implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PerformanceManagerUnit(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _percent = "percent";
    public static final java.lang.String _kiloBytes = "kiloBytes";
    public static final java.lang.String _megaBytes = "megaBytes";
    public static final java.lang.String _megaHertz = "megaHertz";
    public static final java.lang.String _number = "number";
    public static final java.lang.String _microsecond = "microsecond";
    public static final java.lang.String _millisecond = "millisecond";
    public static final java.lang.String _second = "second";
    public static final java.lang.String _kiloBytesPerSecond = "kiloBytesPerSecond";
    public static final java.lang.String _megaBytesPerSecond = "megaBytesPerSecond";
    public static final PerformanceManagerUnit percent = new PerformanceManagerUnit(_percent);
    public static final PerformanceManagerUnit kiloBytes = new PerformanceManagerUnit(_kiloBytes);
    public static final PerformanceManagerUnit megaBytes = new PerformanceManagerUnit(_megaBytes);
    public static final PerformanceManagerUnit megaHertz = new PerformanceManagerUnit(_megaHertz);
    public static final PerformanceManagerUnit number = new PerformanceManagerUnit(_number);
    public static final PerformanceManagerUnit microsecond = new PerformanceManagerUnit(_microsecond);
    public static final PerformanceManagerUnit millisecond = new PerformanceManagerUnit(_millisecond);
    public static final PerformanceManagerUnit second = new PerformanceManagerUnit(_second);
    public static final PerformanceManagerUnit kiloBytesPerSecond = new PerformanceManagerUnit(_kiloBytesPerSecond);
    public static final PerformanceManagerUnit megaBytesPerSecond = new PerformanceManagerUnit(_megaBytesPerSecond);
    public java.lang.String getValue() { return _value_;}
    public static PerformanceManagerUnit fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        PerformanceManagerUnit enumeration = (PerformanceManagerUnit)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static PerformanceManagerUnit fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(PerformanceManagerUnit.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "PerformanceManagerUnit"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
