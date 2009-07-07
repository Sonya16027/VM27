/**
 * ArrayOfOvfFileItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfOvfFileItem  implements java.io.Serializable {
    private com.vmware.vim25.OvfFileItem[] ovfFileItem;

    public ArrayOfOvfFileItem() {
    }

    public ArrayOfOvfFileItem(
           com.vmware.vim25.OvfFileItem[] ovfFileItem) {
           this.ovfFileItem = ovfFileItem;
    }


    /**
     * Gets the ovfFileItem value for this ArrayOfOvfFileItem.
     * 
     * @return ovfFileItem
     */
    public com.vmware.vim25.OvfFileItem[] getOvfFileItem() {
        return ovfFileItem;
    }


    /**
     * Sets the ovfFileItem value for this ArrayOfOvfFileItem.
     * 
     * @param ovfFileItem
     */
    public void setOvfFileItem(com.vmware.vim25.OvfFileItem[] ovfFileItem) {
        this.ovfFileItem = ovfFileItem;
    }

    public com.vmware.vim25.OvfFileItem getOvfFileItem(int i) {
        return this.ovfFileItem[i];
    }

    public void setOvfFileItem(int i, com.vmware.vim25.OvfFileItem _value) {
        this.ovfFileItem[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfOvfFileItem)) return false;
        ArrayOfOvfFileItem other = (ArrayOfOvfFileItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ovfFileItem==null && other.getOvfFileItem()==null) || 
             (this.ovfFileItem!=null &&
              java.util.Arrays.equals(this.ovfFileItem, other.getOvfFileItem())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getOvfFileItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOvfFileItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOvfFileItem(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ArrayOfOvfFileItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfOvfFileItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ovfFileItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "OvfFileItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "OvfFileItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
