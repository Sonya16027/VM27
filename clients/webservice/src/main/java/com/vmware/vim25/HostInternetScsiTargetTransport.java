/**
 * HostInternetScsiTargetTransport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostInternetScsiTargetTransport  extends com.vmware.vim25.HostTargetTransport  implements java.io.Serializable {
    private java.lang.String iScsiName;

    private java.lang.String iScsiAlias;

    private java.lang.String[] address;

    public HostInternetScsiTargetTransport() {
    }

    public HostInternetScsiTargetTransport(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           java.lang.String iScsiName,
           java.lang.String iScsiAlias,
           java.lang.String[] address) {
        super(
            dynamicType,
            dynamicProperty);
        this.iScsiName = iScsiName;
        this.iScsiAlias = iScsiAlias;
        this.address = address;
    }


    /**
     * Gets the iScsiName value for this HostInternetScsiTargetTransport.
     * 
     * @return iScsiName
     */
    public java.lang.String getIScsiName() {
        return iScsiName;
    }


    /**
     * Sets the iScsiName value for this HostInternetScsiTargetTransport.
     * 
     * @param iScsiName
     */
    public void setIScsiName(java.lang.String iScsiName) {
        this.iScsiName = iScsiName;
    }


    /**
     * Gets the iScsiAlias value for this HostInternetScsiTargetTransport.
     * 
     * @return iScsiAlias
     */
    public java.lang.String getIScsiAlias() {
        return iScsiAlias;
    }


    /**
     * Sets the iScsiAlias value for this HostInternetScsiTargetTransport.
     * 
     * @param iScsiAlias
     */
    public void setIScsiAlias(java.lang.String iScsiAlias) {
        this.iScsiAlias = iScsiAlias;
    }


    /**
     * Gets the address value for this HostInternetScsiTargetTransport.
     * 
     * @return address
     */
    public java.lang.String[] getAddress() {
        return address;
    }


    /**
     * Sets the address value for this HostInternetScsiTargetTransport.
     * 
     * @param address
     */
    public void setAddress(java.lang.String[] address) {
        this.address = address;
    }

    public java.lang.String getAddress(int i) {
        return this.address[i];
    }

    public void setAddress(int i, java.lang.String _value) {
        this.address[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostInternetScsiTargetTransport)) return false;
        HostInternetScsiTargetTransport other = (HostInternetScsiTargetTransport) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.iScsiName==null && other.getIScsiName()==null) || 
             (this.iScsiName!=null &&
              this.iScsiName.equals(other.getIScsiName()))) &&
            ((this.iScsiAlias==null && other.getIScsiAlias()==null) || 
             (this.iScsiAlias!=null &&
              this.iScsiAlias.equals(other.getIScsiAlias()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              java.util.Arrays.equals(this.address, other.getAddress())));
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
        if (getIScsiName() != null) {
            _hashCode += getIScsiName().hashCode();
        }
        if (getIScsiAlias() != null) {
            _hashCode += getIScsiAlias().hashCode();
        }
        if (getAddress() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddress());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddress(), i);
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
        new org.apache.axis.description.TypeDesc(HostInternetScsiTargetTransport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostInternetScsiTargetTransport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IScsiName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "iScsiName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IScsiAlias");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "iScsiAlias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
