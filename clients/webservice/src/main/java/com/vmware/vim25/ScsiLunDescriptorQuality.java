/**
 * ScsiLunDescriptorQuality.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ScsiLunDescriptorQuality implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ScsiLunDescriptorQuality(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _highQuality = "highQuality";
    public static final java.lang.String _mediumQuality = "mediumQuality";
    public static final java.lang.String _lowQuality = "lowQuality";
    public static final java.lang.String _unknownQuality = "unknownQuality";
    public static final ScsiLunDescriptorQuality highQuality = new ScsiLunDescriptorQuality(_highQuality);
    public static final ScsiLunDescriptorQuality mediumQuality = new ScsiLunDescriptorQuality(_mediumQuality);
    public static final ScsiLunDescriptorQuality lowQuality = new ScsiLunDescriptorQuality(_lowQuality);
    public static final ScsiLunDescriptorQuality unknownQuality = new ScsiLunDescriptorQuality(_unknownQuality);
    public java.lang.String getValue() { return _value_;}
    public static ScsiLunDescriptorQuality fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ScsiLunDescriptorQuality enumeration = (ScsiLunDescriptorQuality)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ScsiLunDescriptorQuality fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ScsiLunDescriptorQuality.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ScsiLunDescriptorQuality"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
