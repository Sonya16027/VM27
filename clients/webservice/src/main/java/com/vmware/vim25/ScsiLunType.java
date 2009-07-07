/**
 * ScsiLunType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ScsiLunType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ScsiLunType(java.lang.String value) {
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
    public static final java.lang.String _opticalDevice = "opticalDevice";
    public static final java.lang.String _mediaChanger = "mediaChanger";
    public static final java.lang.String _communications = "communications";
    public static final java.lang.String _storageArrayController = "storageArrayController";
    public static final java.lang.String _enclosure = "enclosure";
    public static final java.lang.String _unknown = "unknown";
    public static final ScsiLunType disk = new ScsiLunType(_disk);
    public static final ScsiLunType tape = new ScsiLunType(_tape);
    public static final ScsiLunType printer = new ScsiLunType(_printer);
    public static final ScsiLunType processor = new ScsiLunType(_processor);
    public static final ScsiLunType worm = new ScsiLunType(_worm);
    public static final ScsiLunType cdrom = new ScsiLunType(_cdrom);
    public static final ScsiLunType scanner = new ScsiLunType(_scanner);
    public static final ScsiLunType opticalDevice = new ScsiLunType(_opticalDevice);
    public static final ScsiLunType mediaChanger = new ScsiLunType(_mediaChanger);
    public static final ScsiLunType communications = new ScsiLunType(_communications);
    public static final ScsiLunType storageArrayController = new ScsiLunType(_storageArrayController);
    public static final ScsiLunType enclosure = new ScsiLunType(_enclosure);
    public static final ScsiLunType unknown = new ScsiLunType(_unknown);
    public java.lang.String getValue() { return _value_;}
    public static ScsiLunType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ScsiLunType enumeration = (ScsiLunType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ScsiLunType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ScsiLunType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ScsiLunType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
