/**
 * ProfileNumericComparator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ProfileNumericComparator implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ProfileNumericComparator(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _lessThan = "lessThan";
    public static final java.lang.String _lessThanEqual = "lessThanEqual";
    public static final java.lang.String _equal = "equal";
    public static final java.lang.String _notEqual = "notEqual";
    public static final java.lang.String _greaterThanEqual = "greaterThanEqual";
    public static final java.lang.String _greaterThan = "greaterThan";
    public static final ProfileNumericComparator lessThan = new ProfileNumericComparator(_lessThan);
    public static final ProfileNumericComparator lessThanEqual = new ProfileNumericComparator(_lessThanEqual);
    public static final ProfileNumericComparator equal = new ProfileNumericComparator(_equal);
    public static final ProfileNumericComparator notEqual = new ProfileNumericComparator(_notEqual);
    public static final ProfileNumericComparator greaterThanEqual = new ProfileNumericComparator(_greaterThanEqual);
    public static final ProfileNumericComparator greaterThan = new ProfileNumericComparator(_greaterThan);
    public java.lang.String getValue() { return _value_;}
    public static ProfileNumericComparator fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ProfileNumericComparator enumeration = (ProfileNumericComparator)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ProfileNumericComparator fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ProfileNumericComparator.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ProfileNumericComparator"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
