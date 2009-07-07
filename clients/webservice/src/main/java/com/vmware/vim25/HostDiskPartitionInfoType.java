/**
 * HostDiskPartitionInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostDiskPartitionInfoType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected HostDiskPartitionInfoType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _none = "none";
    public static final java.lang.String _vmfs = "vmfs";
    public static final java.lang.String _linuxNative = "linuxNative";
    public static final java.lang.String _linuxSwap = "linuxSwap";
    public static final java.lang.String _extended = "extended";
    public static final java.lang.String _ntfs = "ntfs";
    public static final java.lang.String _vmkDiagnostic = "vmkDiagnostic";
    public static final HostDiskPartitionInfoType none = new HostDiskPartitionInfoType(_none);
    public static final HostDiskPartitionInfoType vmfs = new HostDiskPartitionInfoType(_vmfs);
    public static final HostDiskPartitionInfoType linuxNative = new HostDiskPartitionInfoType(_linuxNative);
    public static final HostDiskPartitionInfoType linuxSwap = new HostDiskPartitionInfoType(_linuxSwap);
    public static final HostDiskPartitionInfoType extended = new HostDiskPartitionInfoType(_extended);
    public static final HostDiskPartitionInfoType ntfs = new HostDiskPartitionInfoType(_ntfs);
    public static final HostDiskPartitionInfoType vmkDiagnostic = new HostDiskPartitionInfoType(_vmkDiagnostic);
    public java.lang.String getValue() { return _value_;}
    public static HostDiskPartitionInfoType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        HostDiskPartitionInfoType enumeration = (HostDiskPartitionInfoType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static HostDiskPartitionInfoType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(HostDiskPartitionInfoType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostDiskPartitionInfoType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
