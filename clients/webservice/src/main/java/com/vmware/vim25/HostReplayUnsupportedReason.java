/**
 * HostReplayUnsupportedReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostReplayUnsupportedReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected HostReplayUnsupportedReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _incompatibleProduct = "incompatibleProduct";
    public static final java.lang.String _incompatibleCpu = "incompatibleCpu";
    public static final java.lang.String _hvDisabled = "hvDisabled";
    public static final java.lang.String _cpuidLimitSet = "cpuidLimitSet";
    public static final java.lang.String _oldBIOS = "oldBIOS";
    public static final java.lang.String _unknown = "unknown";
    public static final HostReplayUnsupportedReason incompatibleProduct = new HostReplayUnsupportedReason(_incompatibleProduct);
    public static final HostReplayUnsupportedReason incompatibleCpu = new HostReplayUnsupportedReason(_incompatibleCpu);
    public static final HostReplayUnsupportedReason hvDisabled = new HostReplayUnsupportedReason(_hvDisabled);
    public static final HostReplayUnsupportedReason cpuidLimitSet = new HostReplayUnsupportedReason(_cpuidLimitSet);
    public static final HostReplayUnsupportedReason oldBIOS = new HostReplayUnsupportedReason(_oldBIOS);
    public static final HostReplayUnsupportedReason unknown = new HostReplayUnsupportedReason(_unknown);
    public java.lang.String getValue() { return _value_;}
    public static HostReplayUnsupportedReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        HostReplayUnsupportedReason enumeration = (HostReplayUnsupportedReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static HostReplayUnsupportedReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(HostReplayUnsupportedReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostReplayUnsupportedReason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
