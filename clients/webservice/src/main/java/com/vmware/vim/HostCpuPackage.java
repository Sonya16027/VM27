/**
 * HostCpuPackage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class HostCpuPackage  extends com.vmware.vim.DynamicData  implements java.io.Serializable {
    private short index;

    private java.lang.String vendor;

    private long hz;

    private long busHz;

    private java.lang.String description;

    private short[] threadId;

    private com.vmware.vim.HostCpuIdInfo[] cpuFeature;

    public HostCpuPackage() {
    }

    public HostCpuPackage(
           java.lang.String dynamicType,
           com.vmware.vim.DynamicProperty[] dynamicProperty,
           short index,
           java.lang.String vendor,
           long hz,
           long busHz,
           java.lang.String description,
           short[] threadId,
           com.vmware.vim.HostCpuIdInfo[] cpuFeature) {
        super(
            dynamicType,
            dynamicProperty);
        this.index = index;
        this.vendor = vendor;
        this.hz = hz;
        this.busHz = busHz;
        this.description = description;
        this.threadId = threadId;
        this.cpuFeature = cpuFeature;
    }


    /**
     * Gets the index value for this HostCpuPackage.
     * 
     * @return index
     */
    public short getIndex() {
        return index;
    }


    /**
     * Sets the index value for this HostCpuPackage.
     * 
     * @param index
     */
    public void setIndex(short index) {
        this.index = index;
    }


    /**
     * Gets the vendor value for this HostCpuPackage.
     * 
     * @return vendor
     */
    public java.lang.String getVendor() {
        return vendor;
    }


    /**
     * Sets the vendor value for this HostCpuPackage.
     * 
     * @param vendor
     */
    public void setVendor(java.lang.String vendor) {
        this.vendor = vendor;
    }


    /**
     * Gets the hz value for this HostCpuPackage.
     * 
     * @return hz
     */
    public long getHz() {
        return hz;
    }


    /**
     * Sets the hz value for this HostCpuPackage.
     * 
     * @param hz
     */
    public void setHz(long hz) {
        this.hz = hz;
    }


    /**
     * Gets the busHz value for this HostCpuPackage.
     * 
     * @return busHz
     */
    public long getBusHz() {
        return busHz;
    }


    /**
     * Sets the busHz value for this HostCpuPackage.
     * 
     * @param busHz
     */
    public void setBusHz(long busHz) {
        this.busHz = busHz;
    }


    /**
     * Gets the description value for this HostCpuPackage.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this HostCpuPackage.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the threadId value for this HostCpuPackage.
     * 
     * @return threadId
     */
    public short[] getThreadId() {
        return threadId;
    }


    /**
     * Sets the threadId value for this HostCpuPackage.
     * 
     * @param threadId
     */
    public void setThreadId(short[] threadId) {
        this.threadId = threadId;
    }

    public short getThreadId(int i) {
        return this.threadId[i];
    }

    public void setThreadId(int i, short _value) {
        this.threadId[i] = _value;
    }


    /**
     * Gets the cpuFeature value for this HostCpuPackage.
     * 
     * @return cpuFeature
     */
    public com.vmware.vim.HostCpuIdInfo[] getCpuFeature() {
        return cpuFeature;
    }


    /**
     * Sets the cpuFeature value for this HostCpuPackage.
     * 
     * @param cpuFeature
     */
    public void setCpuFeature(com.vmware.vim.HostCpuIdInfo[] cpuFeature) {
        this.cpuFeature = cpuFeature;
    }

    public com.vmware.vim.HostCpuIdInfo getCpuFeature(int i) {
        return this.cpuFeature[i];
    }

    public void setCpuFeature(int i, com.vmware.vim.HostCpuIdInfo _value) {
        this.cpuFeature[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostCpuPackage)) return false;
        HostCpuPackage other = (HostCpuPackage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.index == other.getIndex() &&
            ((this.vendor==null && other.getVendor()==null) || 
             (this.vendor!=null &&
              this.vendor.equals(other.getVendor()))) &&
            this.hz == other.getHz() &&
            this.busHz == other.getBusHz() &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.threadId==null && other.getThreadId()==null) || 
             (this.threadId!=null &&
              java.util.Arrays.equals(this.threadId, other.getThreadId()))) &&
            ((this.cpuFeature==null && other.getCpuFeature()==null) || 
             (this.cpuFeature!=null &&
              java.util.Arrays.equals(this.cpuFeature, other.getCpuFeature())));
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
        _hashCode += getIndex();
        if (getVendor() != null) {
            _hashCode += getVendor().hashCode();
        }
        _hashCode += new Long(getHz()).hashCode();
        _hashCode += new Long(getBusHz()).hashCode();
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getThreadId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getThreadId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getThreadId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCpuFeature() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCpuFeature());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCpuFeature(), i);
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
        new org.apache.axis.description.TypeDesc(HostCpuPackage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "HostCpuPackage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("index");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "index"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "vendor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hz");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "hz"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("busHz");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "busHz"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("threadId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "threadId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpuFeature");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "cpuFeature"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "HostCpuIdInfo"));
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
