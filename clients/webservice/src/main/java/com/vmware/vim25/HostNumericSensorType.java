/**
 * HostNumericSensorType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostNumericSensorType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected HostNumericSensorType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _fan = "fan";
    public static final java.lang.String _power = "power";
    public static final java.lang.String _temperature = "temperature";
    public static final java.lang.String _voltage = "voltage";
    public static final java.lang.String _other = "other";
    public static final HostNumericSensorType fan = new HostNumericSensorType(_fan);
    public static final HostNumericSensorType power = new HostNumericSensorType(_power);
    public static final HostNumericSensorType temperature = new HostNumericSensorType(_temperature);
    public static final HostNumericSensorType voltage = new HostNumericSensorType(_voltage);
    public static final HostNumericSensorType other = new HostNumericSensorType(_other);
    public java.lang.String getValue() { return _value_;}
    public static HostNumericSensorType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        HostNumericSensorType enumeration = (HostNumericSensorType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static HostNumericSensorType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(HostNumericSensorType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostNumericSensorType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
