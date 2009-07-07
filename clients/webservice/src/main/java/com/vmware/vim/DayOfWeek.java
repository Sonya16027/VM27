/**
 * DayOfWeek.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class DayOfWeek implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DayOfWeek(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _sunday = "sunday";
    public static final java.lang.String _monday = "monday";
    public static final java.lang.String _tuesday = "tuesday";
    public static final java.lang.String _wednesday = "wednesday";
    public static final java.lang.String _thursday = "thursday";
    public static final java.lang.String _friday = "friday";
    public static final java.lang.String _saturday = "saturday";
    public static final DayOfWeek sunday = new DayOfWeek(_sunday);
    public static final DayOfWeek monday = new DayOfWeek(_monday);
    public static final DayOfWeek tuesday = new DayOfWeek(_tuesday);
    public static final DayOfWeek wednesday = new DayOfWeek(_wednesday);
    public static final DayOfWeek thursday = new DayOfWeek(_thursday);
    public static final DayOfWeek friday = new DayOfWeek(_friday);
    public static final DayOfWeek saturday = new DayOfWeek(_saturday);
    public java.lang.String getValue() { return _value_;}
    public static DayOfWeek fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        DayOfWeek enumeration = (DayOfWeek)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static DayOfWeek fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(DayOfWeek.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "DayOfWeek"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
