/**
 * DatacenterEventArgument.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class DatacenterEventArgument  extends com.vmware.vim.EntityEventArgument  implements java.io.Serializable {
    private com.vmware.vim.ManagedObjectReference datacenter;

    public DatacenterEventArgument() {
    }

    public DatacenterEventArgument(
           java.lang.String dynamicType,
           com.vmware.vim.DynamicProperty[] dynamicProperty,
           java.lang.String name,
           com.vmware.vim.ManagedObjectReference datacenter) {
        super(
            dynamicType,
            dynamicProperty,
            name);
        this.datacenter = datacenter;
    }


    /**
     * Gets the datacenter value for this DatacenterEventArgument.
     * 
     * @return datacenter
     */
    public com.vmware.vim.ManagedObjectReference getDatacenter() {
        return datacenter;
    }


    /**
     * Sets the datacenter value for this DatacenterEventArgument.
     * 
     * @param datacenter
     */
    public void setDatacenter(com.vmware.vim.ManagedObjectReference datacenter) {
        this.datacenter = datacenter;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DatacenterEventArgument)) return false;
        DatacenterEventArgument other = (DatacenterEventArgument) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.datacenter==null && other.getDatacenter()==null) || 
             (this.datacenter!=null &&
              this.datacenter.equals(other.getDatacenter())));
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
        if (getDatacenter() != null) {
            _hashCode += getDatacenter().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DatacenterEventArgument.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "DatacenterEventArgument"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datacenter");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "datacenter"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "ManagedObjectReference"));
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
