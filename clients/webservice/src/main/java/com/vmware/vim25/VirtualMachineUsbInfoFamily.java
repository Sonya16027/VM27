/**
 * VirtualMachineUsbInfoFamily.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VirtualMachineUsbInfoFamily implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected VirtualMachineUsbInfoFamily(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _audio = "audio";
    public static final java.lang.String _hid = "hid";
    public static final java.lang.String _hid_bootable = "hid_bootable";
    public static final java.lang.String _physical = "physical";
    public static final java.lang.String _communication = "communication";
    public static final java.lang.String _imaging = "imaging";
    public static final java.lang.String _printer = "printer";
    public static final java.lang.String _storage = "storage";
    public static final java.lang.String _hub = "hub";
    public static final java.lang.String _smart_card = "smart_card";
    public static final java.lang.String _security = "security";
    public static final java.lang.String _video = "video";
    public static final java.lang.String _wireless = "wireless";
    public static final java.lang.String _bluetooth = "bluetooth";
    public static final java.lang.String _wusb = "wusb";
    public static final java.lang.String _pda = "pda";
    public static final java.lang.String _vendor_specific = "vendor_specific";
    public static final java.lang.String _other = "other";
    public static final java.lang.String _unknownFamily = "unknownFamily";
    public static final VirtualMachineUsbInfoFamily audio = new VirtualMachineUsbInfoFamily(_audio);
    public static final VirtualMachineUsbInfoFamily hid = new VirtualMachineUsbInfoFamily(_hid);
    public static final VirtualMachineUsbInfoFamily hid_bootable = new VirtualMachineUsbInfoFamily(_hid_bootable);
    public static final VirtualMachineUsbInfoFamily physical = new VirtualMachineUsbInfoFamily(_physical);
    public static final VirtualMachineUsbInfoFamily communication = new VirtualMachineUsbInfoFamily(_communication);
    public static final VirtualMachineUsbInfoFamily imaging = new VirtualMachineUsbInfoFamily(_imaging);
    public static final VirtualMachineUsbInfoFamily printer = new VirtualMachineUsbInfoFamily(_printer);
    public static final VirtualMachineUsbInfoFamily storage = new VirtualMachineUsbInfoFamily(_storage);
    public static final VirtualMachineUsbInfoFamily hub = new VirtualMachineUsbInfoFamily(_hub);
    public static final VirtualMachineUsbInfoFamily smart_card = new VirtualMachineUsbInfoFamily(_smart_card);
    public static final VirtualMachineUsbInfoFamily security = new VirtualMachineUsbInfoFamily(_security);
    public static final VirtualMachineUsbInfoFamily video = new VirtualMachineUsbInfoFamily(_video);
    public static final VirtualMachineUsbInfoFamily wireless = new VirtualMachineUsbInfoFamily(_wireless);
    public static final VirtualMachineUsbInfoFamily bluetooth = new VirtualMachineUsbInfoFamily(_bluetooth);
    public static final VirtualMachineUsbInfoFamily wusb = new VirtualMachineUsbInfoFamily(_wusb);
    public static final VirtualMachineUsbInfoFamily pda = new VirtualMachineUsbInfoFamily(_pda);
    public static final VirtualMachineUsbInfoFamily vendor_specific = new VirtualMachineUsbInfoFamily(_vendor_specific);
    public static final VirtualMachineUsbInfoFamily other = new VirtualMachineUsbInfoFamily(_other);
    public static final VirtualMachineUsbInfoFamily unknownFamily = new VirtualMachineUsbInfoFamily(_unknownFamily);
    public java.lang.String getValue() { return _value_;}
    public static VirtualMachineUsbInfoFamily fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        VirtualMachineUsbInfoFamily enumeration = (VirtualMachineUsbInfoFamily)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static VirtualMachineUsbInfoFamily fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(VirtualMachineUsbInfoFamily.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineUsbInfoFamily"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
