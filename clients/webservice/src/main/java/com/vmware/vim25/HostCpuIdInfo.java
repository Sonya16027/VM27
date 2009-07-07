/**
 * HostCpuIdInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostCpuIdInfo  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private int level;

    private java.lang.String vendor;

    private java.lang.String eax;

    private java.lang.String ebx;

    private java.lang.String ecx;

    private java.lang.String edx;

    public HostCpuIdInfo() {
    }

    public HostCpuIdInfo(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           int level,
           java.lang.String vendor,
           java.lang.String eax,
           java.lang.String ebx,
           java.lang.String ecx,
           java.lang.String edx) {
        super(
            dynamicType,
            dynamicProperty);
        this.level = level;
        this.vendor = vendor;
        this.eax = eax;
        this.ebx = ebx;
        this.ecx = ecx;
        this.edx = edx;
    }


    /**
     * Gets the level value for this HostCpuIdInfo.
     * 
     * @return level
     */
    public int getLevel() {
        return level;
    }


    /**
     * Sets the level value for this HostCpuIdInfo.
     * 
     * @param level
     */
    public void setLevel(int level) {
        this.level = level;
    }


    /**
     * Gets the vendor value for this HostCpuIdInfo.
     * 
     * @return vendor
     */
    public java.lang.String getVendor() {
        return vendor;
    }


    /**
     * Sets the vendor value for this HostCpuIdInfo.
     * 
     * @param vendor
     */
    public void setVendor(java.lang.String vendor) {
        this.vendor = vendor;
    }


    /**
     * Gets the eax value for this HostCpuIdInfo.
     * 
     * @return eax
     */
    public java.lang.String getEax() {
        return eax;
    }


    /**
     * Sets the eax value for this HostCpuIdInfo.
     * 
     * @param eax
     */
    public void setEax(java.lang.String eax) {
        this.eax = eax;
    }


    /**
     * Gets the ebx value for this HostCpuIdInfo.
     * 
     * @return ebx
     */
    public java.lang.String getEbx() {
        return ebx;
    }


    /**
     * Sets the ebx value for this HostCpuIdInfo.
     * 
     * @param ebx
     */
    public void setEbx(java.lang.String ebx) {
        this.ebx = ebx;
    }


    /**
     * Gets the ecx value for this HostCpuIdInfo.
     * 
     * @return ecx
     */
    public java.lang.String getEcx() {
        return ecx;
    }


    /**
     * Sets the ecx value for this HostCpuIdInfo.
     * 
     * @param ecx
     */
    public void setEcx(java.lang.String ecx) {
        this.ecx = ecx;
    }


    /**
     * Gets the edx value for this HostCpuIdInfo.
     * 
     * @return edx
     */
    public java.lang.String getEdx() {
        return edx;
    }


    /**
     * Sets the edx value for this HostCpuIdInfo.
     * 
     * @param edx
     */
    public void setEdx(java.lang.String edx) {
        this.edx = edx;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostCpuIdInfo)) return false;
        HostCpuIdInfo other = (HostCpuIdInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.level == other.getLevel() &&
            ((this.vendor==null && other.getVendor()==null) || 
             (this.vendor!=null &&
              this.vendor.equals(other.getVendor()))) &&
            ((this.eax==null && other.getEax()==null) || 
             (this.eax!=null &&
              this.eax.equals(other.getEax()))) &&
            ((this.ebx==null && other.getEbx()==null) || 
             (this.ebx!=null &&
              this.ebx.equals(other.getEbx()))) &&
            ((this.ecx==null && other.getEcx()==null) || 
             (this.ecx!=null &&
              this.ecx.equals(other.getEcx()))) &&
            ((this.edx==null && other.getEdx()==null) || 
             (this.edx!=null &&
              this.edx.equals(other.getEdx())));
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
        _hashCode += getLevel();
        if (getVendor() != null) {
            _hashCode += getVendor().hashCode();
        }
        if (getEax() != null) {
            _hashCode += getEax().hashCode();
        }
        if (getEbx() != null) {
            _hashCode += getEbx().hashCode();
        }
        if (getEcx() != null) {
            _hashCode += getEcx().hashCode();
        }
        if (getEdx() != null) {
            _hashCode += getEdx().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostCpuIdInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostCpuIdInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("level");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "level"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vendor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eax");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "eax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ebx");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ebx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ecx");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ecx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("edx");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "edx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
