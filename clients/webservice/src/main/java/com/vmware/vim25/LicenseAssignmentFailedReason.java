/**
 * LicenseAssignmentFailedReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class LicenseAssignmentFailedReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected LicenseAssignmentFailedReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _keyEntityMismatch = "keyEntityMismatch";
    public static final java.lang.String _downgradeDisallowed = "downgradeDisallowed";
    public static final java.lang.String _inventoryNotManageableByVirtualCenter = "inventoryNotManageableByVirtualCenter";
    public static final java.lang.String _hostsUnmanageableByVirtualCenterWithoutLicenseServer = "hostsUnmanageableByVirtualCenterWithoutLicenseServer";
    public static final LicenseAssignmentFailedReason keyEntityMismatch = new LicenseAssignmentFailedReason(_keyEntityMismatch);
    public static final LicenseAssignmentFailedReason downgradeDisallowed = new LicenseAssignmentFailedReason(_downgradeDisallowed);
    public static final LicenseAssignmentFailedReason inventoryNotManageableByVirtualCenter = new LicenseAssignmentFailedReason(_inventoryNotManageableByVirtualCenter);
    public static final LicenseAssignmentFailedReason hostsUnmanageableByVirtualCenterWithoutLicenseServer = new LicenseAssignmentFailedReason(_hostsUnmanageableByVirtualCenterWithoutLicenseServer);
    public java.lang.String getValue() { return _value_;}
    public static LicenseAssignmentFailedReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        LicenseAssignmentFailedReason enumeration = (LicenseAssignmentFailedReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static LicenseAssignmentFailedReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(LicenseAssignmentFailedReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "LicenseAssignmentFailedReason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
