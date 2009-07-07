/**
 * HostSystemInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostSystemInfo  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private java.lang.String vendor;

    private java.lang.String model;

    private java.lang.String uuid;

    private com.vmware.vim25.HostSystemIdentificationInfo[] otherIdentifyingInfo;

    public HostSystemInfo() {
    }

    public HostSystemInfo(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           java.lang.String vendor,
           java.lang.String model,
           java.lang.String uuid,
           com.vmware.vim25.HostSystemIdentificationInfo[] otherIdentifyingInfo) {
        super(
            dynamicType,
            dynamicProperty);
        this.vendor = vendor;
        this.model = model;
        this.uuid = uuid;
        this.otherIdentifyingInfo = otherIdentifyingInfo;
    }


    /**
     * Gets the vendor value for this HostSystemInfo.
     * 
     * @return vendor
     */
    public java.lang.String getVendor() {
        return vendor;
    }


    /**
     * Sets the vendor value for this HostSystemInfo.
     * 
     * @param vendor
     */
    public void setVendor(java.lang.String vendor) {
        this.vendor = vendor;
    }


    /**
     * Gets the model value for this HostSystemInfo.
     * 
     * @return model
     */
    public java.lang.String getModel() {
        return model;
    }


    /**
     * Sets the model value for this HostSystemInfo.
     * 
     * @param model
     */
    public void setModel(java.lang.String model) {
        this.model = model;
    }


    /**
     * Gets the uuid value for this HostSystemInfo.
     * 
     * @return uuid
     */
    public java.lang.String getUuid() {
        return uuid;
    }


    /**
     * Sets the uuid value for this HostSystemInfo.
     * 
     * @param uuid
     */
    public void setUuid(java.lang.String uuid) {
        this.uuid = uuid;
    }


    /**
     * Gets the otherIdentifyingInfo value for this HostSystemInfo.
     * 
     * @return otherIdentifyingInfo
     */
    public com.vmware.vim25.HostSystemIdentificationInfo[] getOtherIdentifyingInfo() {
        return otherIdentifyingInfo;
    }


    /**
     * Sets the otherIdentifyingInfo value for this HostSystemInfo.
     * 
     * @param otherIdentifyingInfo
     */
    public void setOtherIdentifyingInfo(com.vmware.vim25.HostSystemIdentificationInfo[] otherIdentifyingInfo) {
        this.otherIdentifyingInfo = otherIdentifyingInfo;
    }

    public com.vmware.vim25.HostSystemIdentificationInfo getOtherIdentifyingInfo(int i) {
        return this.otherIdentifyingInfo[i];
    }

    public void setOtherIdentifyingInfo(int i, com.vmware.vim25.HostSystemIdentificationInfo _value) {
        this.otherIdentifyingInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostSystemInfo)) return false;
        HostSystemInfo other = (HostSystemInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.vendor==null && other.getVendor()==null) || 
             (this.vendor!=null &&
              this.vendor.equals(other.getVendor()))) &&
            ((this.model==null && other.getModel()==null) || 
             (this.model!=null &&
              this.model.equals(other.getModel()))) &&
            ((this.uuid==null && other.getUuid()==null) || 
             (this.uuid!=null &&
              this.uuid.equals(other.getUuid()))) &&
            ((this.otherIdentifyingInfo==null && other.getOtherIdentifyingInfo()==null) || 
             (this.otherIdentifyingInfo!=null &&
              java.util.Arrays.equals(this.otherIdentifyingInfo, other.getOtherIdentifyingInfo())));
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
        if (getVendor() != null) {
            _hashCode += getVendor().hashCode();
        }
        if (getModel() != null) {
            _hashCode += getModel().hashCode();
        }
        if (getUuid() != null) {
            _hashCode += getUuid().hashCode();
        }
        if (getOtherIdentifyingInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOtherIdentifyingInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOtherIdentifyingInfo(), i);
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
        new org.apache.axis.description.TypeDesc(HostSystemInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostSystemInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vendor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("model");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "model"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uuid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "uuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherIdentifyingInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "otherIdentifyingInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostSystemIdentificationInfo"));
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
