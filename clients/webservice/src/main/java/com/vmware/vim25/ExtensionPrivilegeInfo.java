/**
 * ExtensionPrivilegeInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ExtensionPrivilegeInfo  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private java.lang.String privID;

    private java.lang.String privGroupName;

    public ExtensionPrivilegeInfo() {
    }

    public ExtensionPrivilegeInfo(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           java.lang.String privID,
           java.lang.String privGroupName) {
        super(
            dynamicType,
            dynamicProperty);
        this.privID = privID;
        this.privGroupName = privGroupName;
    }


    /**
     * Gets the privID value for this ExtensionPrivilegeInfo.
     * 
     * @return privID
     */
    public java.lang.String getPrivID() {
        return privID;
    }


    /**
     * Sets the privID value for this ExtensionPrivilegeInfo.
     * 
     * @param privID
     */
    public void setPrivID(java.lang.String privID) {
        this.privID = privID;
    }


    /**
     * Gets the privGroupName value for this ExtensionPrivilegeInfo.
     * 
     * @return privGroupName
     */
    public java.lang.String getPrivGroupName() {
        return privGroupName;
    }


    /**
     * Sets the privGroupName value for this ExtensionPrivilegeInfo.
     * 
     * @param privGroupName
     */
    public void setPrivGroupName(java.lang.String privGroupName) {
        this.privGroupName = privGroupName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExtensionPrivilegeInfo)) return false;
        ExtensionPrivilegeInfo other = (ExtensionPrivilegeInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.privID==null && other.getPrivID()==null) || 
             (this.privID!=null &&
              this.privID.equals(other.getPrivID()))) &&
            ((this.privGroupName==null && other.getPrivGroupName()==null) || 
             (this.privGroupName!=null &&
              this.privGroupName.equals(other.getPrivGroupName())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getPrivID() != null) {
            _hashCode += getPrivID().hashCode();
        }
        if (getPrivGroupName() != null) {
            _hashCode += getPrivGroupName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExtensionPrivilegeInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ExtensionPrivilegeInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("privID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "privID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("privGroupName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "privGroupName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
