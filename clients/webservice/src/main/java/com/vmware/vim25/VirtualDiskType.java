/**
 * VirtualDiskType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VirtualDiskType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected VirtualDiskType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _preallocated = "preallocated";
    public static final java.lang.String _thin = "thin";
    public static final java.lang.String _rdm = "rdm";
    public static final java.lang.String _rdmp = "rdmp";
    public static final java.lang.String _raw = "raw";
    public static final java.lang.String _sparse2Gb = "sparse2Gb";
    public static final java.lang.String _thick2Gb = "thick2Gb";
    public static final java.lang.String _eagerZeroedThick = "eagerZeroedThick";
    public static final java.lang.String _sparseMonolithic = "sparseMonolithic";
    public static final java.lang.String _flatMonolithic = "flatMonolithic";
    public static final java.lang.String _thick = "thick";
    public static final VirtualDiskType preallocated = new VirtualDiskType(_preallocated);
    public static final VirtualDiskType thin = new VirtualDiskType(_thin);
    public static final VirtualDiskType rdm = new VirtualDiskType(_rdm);
    public static final VirtualDiskType rdmp = new VirtualDiskType(_rdmp);
    public static final VirtualDiskType raw = new VirtualDiskType(_raw);
    public static final VirtualDiskType sparse2Gb = new VirtualDiskType(_sparse2Gb);
    public static final VirtualDiskType thick2Gb = new VirtualDiskType(_thick2Gb);
    public static final VirtualDiskType eagerZeroedThick = new VirtualDiskType(_eagerZeroedThick);
    public static final VirtualDiskType sparseMonolithic = new VirtualDiskType(_sparseMonolithic);
    public static final VirtualDiskType flatMonolithic = new VirtualDiskType(_flatMonolithic);
    public static final VirtualDiskType thick = new VirtualDiskType(_thick);
    public java.lang.String getValue() { return _value_;}
    public static VirtualDiskType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        VirtualDiskType enumeration = (VirtualDiskType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static VirtualDiskType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(VirtualDiskType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualDiskType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
