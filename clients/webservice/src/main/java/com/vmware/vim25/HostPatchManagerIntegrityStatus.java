/**
 * HostPatchManagerIntegrityStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostPatchManagerIntegrityStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected HostPatchManagerIntegrityStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _validated = "validated";
    public static final java.lang.String _keyNotFound = "keyNotFound";
    public static final java.lang.String _keyRevoked = "keyRevoked";
    public static final java.lang.String _keyExpired = "keyExpired";
    public static final java.lang.String _digestMismatch = "digestMismatch";
    public static final java.lang.String _notEnoughSignatures = "notEnoughSignatures";
    public static final java.lang.String _validationError = "validationError";
    public static final HostPatchManagerIntegrityStatus validated = new HostPatchManagerIntegrityStatus(_validated);
    public static final HostPatchManagerIntegrityStatus keyNotFound = new HostPatchManagerIntegrityStatus(_keyNotFound);
    public static final HostPatchManagerIntegrityStatus keyRevoked = new HostPatchManagerIntegrityStatus(_keyRevoked);
    public static final HostPatchManagerIntegrityStatus keyExpired = new HostPatchManagerIntegrityStatus(_keyExpired);
    public static final HostPatchManagerIntegrityStatus digestMismatch = new HostPatchManagerIntegrityStatus(_digestMismatch);
    public static final HostPatchManagerIntegrityStatus notEnoughSignatures = new HostPatchManagerIntegrityStatus(_notEnoughSignatures);
    public static final HostPatchManagerIntegrityStatus validationError = new HostPatchManagerIntegrityStatus(_validationError);
    public java.lang.String getValue() { return _value_;}
    public static HostPatchManagerIntegrityStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        HostPatchManagerIntegrityStatus enumeration = (HostPatchManagerIntegrityStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static HostPatchManagerIntegrityStatus fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(HostPatchManagerIntegrityStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostPatchManagerIntegrityStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
