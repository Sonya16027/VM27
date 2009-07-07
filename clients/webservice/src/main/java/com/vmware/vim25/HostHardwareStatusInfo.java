/**
 * HostHardwareStatusInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostHardwareStatusInfo  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private com.vmware.vim25.HostHardwareElementInfo[] memoryStatusInfo;

    private com.vmware.vim25.HostHardwareElementInfo[] cpuStatusInfo;

    private com.vmware.vim25.HostStorageElementInfo[] storageStatusInfo;

    public HostHardwareStatusInfo() {
    }

    public HostHardwareStatusInfo(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           com.vmware.vim25.HostHardwareElementInfo[] memoryStatusInfo,
           com.vmware.vim25.HostHardwareElementInfo[] cpuStatusInfo,
           com.vmware.vim25.HostStorageElementInfo[] storageStatusInfo) {
        super(
            dynamicType,
            dynamicProperty);
        this.memoryStatusInfo = memoryStatusInfo;
        this.cpuStatusInfo = cpuStatusInfo;
        this.storageStatusInfo = storageStatusInfo;
    }


    /**
     * Gets the memoryStatusInfo value for this HostHardwareStatusInfo.
     * 
     * @return memoryStatusInfo
     */
    public com.vmware.vim25.HostHardwareElementInfo[] getMemoryStatusInfo() {
        return memoryStatusInfo;
    }


    /**
     * Sets the memoryStatusInfo value for this HostHardwareStatusInfo.
     * 
     * @param memoryStatusInfo
     */
    public void setMemoryStatusInfo(com.vmware.vim25.HostHardwareElementInfo[] memoryStatusInfo) {
        this.memoryStatusInfo = memoryStatusInfo;
    }

    public com.vmware.vim25.HostHardwareElementInfo getMemoryStatusInfo(int i) {
        return this.memoryStatusInfo[i];
    }

    public void setMemoryStatusInfo(int i, com.vmware.vim25.HostHardwareElementInfo _value) {
        this.memoryStatusInfo[i] = _value;
    }


    /**
     * Gets the cpuStatusInfo value for this HostHardwareStatusInfo.
     * 
     * @return cpuStatusInfo
     */
    public com.vmware.vim25.HostHardwareElementInfo[] getCpuStatusInfo() {
        return cpuStatusInfo;
    }


    /**
     * Sets the cpuStatusInfo value for this HostHardwareStatusInfo.
     * 
     * @param cpuStatusInfo
     */
    public void setCpuStatusInfo(com.vmware.vim25.HostHardwareElementInfo[] cpuStatusInfo) {
        this.cpuStatusInfo = cpuStatusInfo;
    }

    public com.vmware.vim25.HostHardwareElementInfo getCpuStatusInfo(int i) {
        return this.cpuStatusInfo[i];
    }

    public void setCpuStatusInfo(int i, com.vmware.vim25.HostHardwareElementInfo _value) {
        this.cpuStatusInfo[i] = _value;
    }


    /**
     * Gets the storageStatusInfo value for this HostHardwareStatusInfo.
     * 
     * @return storageStatusInfo
     */
    public com.vmware.vim25.HostStorageElementInfo[] getStorageStatusInfo() {
        return storageStatusInfo;
    }


    /**
     * Sets the storageStatusInfo value for this HostHardwareStatusInfo.
     * 
     * @param storageStatusInfo
     */
    public void setStorageStatusInfo(com.vmware.vim25.HostStorageElementInfo[] storageStatusInfo) {
        this.storageStatusInfo = storageStatusInfo;
    }

    public com.vmware.vim25.HostStorageElementInfo getStorageStatusInfo(int i) {
        return this.storageStatusInfo[i];
    }

    public void setStorageStatusInfo(int i, com.vmware.vim25.HostStorageElementInfo _value) {
        this.storageStatusInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostHardwareStatusInfo)) return false;
        HostHardwareStatusInfo other = (HostHardwareStatusInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.memoryStatusInfo==null && other.getMemoryStatusInfo()==null) || 
             (this.memoryStatusInfo!=null &&
              java.util.Arrays.equals(this.memoryStatusInfo, other.getMemoryStatusInfo()))) &&
            ((this.cpuStatusInfo==null && other.getCpuStatusInfo()==null) || 
             (this.cpuStatusInfo!=null &&
              java.util.Arrays.equals(this.cpuStatusInfo, other.getCpuStatusInfo()))) &&
            ((this.storageStatusInfo==null && other.getStorageStatusInfo()==null) || 
             (this.storageStatusInfo!=null &&
              java.util.Arrays.equals(this.storageStatusInfo, other.getStorageStatusInfo())));
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
        if (getMemoryStatusInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMemoryStatusInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMemoryStatusInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCpuStatusInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCpuStatusInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCpuStatusInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStorageStatusInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStorageStatusInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStorageStatusInfo(), i);
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
        new org.apache.axis.description.TypeDesc(HostHardwareStatusInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostHardwareStatusInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memoryStatusInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "memoryStatusInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostHardwareElementInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpuStatusInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "cpuStatusInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostHardwareElementInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storageStatusInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "storageStatusInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostStorageElementInfo"));
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
