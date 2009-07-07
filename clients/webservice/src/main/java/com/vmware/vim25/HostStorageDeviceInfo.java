/**
 * HostStorageDeviceInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostStorageDeviceInfo  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private com.vmware.vim25.HostHostBusAdapter[] hostBusAdapter;

    private com.vmware.vim25.ScsiLun[] scsiLun;

    private com.vmware.vim25.HostScsiTopology scsiTopology;

    private com.vmware.vim25.HostMultipathInfo multipathInfo;

    private com.vmware.vim25.HostPlugStoreTopology plugStoreTopology;

    private boolean softwareInternetScsiEnabled;

    public HostStorageDeviceInfo() {
    }

    public HostStorageDeviceInfo(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           com.vmware.vim25.HostHostBusAdapter[] hostBusAdapter,
           com.vmware.vim25.ScsiLun[] scsiLun,
           com.vmware.vim25.HostScsiTopology scsiTopology,
           com.vmware.vim25.HostMultipathInfo multipathInfo,
           com.vmware.vim25.HostPlugStoreTopology plugStoreTopology,
           boolean softwareInternetScsiEnabled) {
        super(
            dynamicType,
            dynamicProperty);
        this.hostBusAdapter = hostBusAdapter;
        this.scsiLun = scsiLun;
        this.scsiTopology = scsiTopology;
        this.multipathInfo = multipathInfo;
        this.plugStoreTopology = plugStoreTopology;
        this.softwareInternetScsiEnabled = softwareInternetScsiEnabled;
    }


    /**
     * Gets the hostBusAdapter value for this HostStorageDeviceInfo.
     * 
     * @return hostBusAdapter
     */
    public com.vmware.vim25.HostHostBusAdapter[] getHostBusAdapter() {
        return hostBusAdapter;
    }


    /**
     * Sets the hostBusAdapter value for this HostStorageDeviceInfo.
     * 
     * @param hostBusAdapter
     */
    public void setHostBusAdapter(com.vmware.vim25.HostHostBusAdapter[] hostBusAdapter) {
        this.hostBusAdapter = hostBusAdapter;
    }

    public com.vmware.vim25.HostHostBusAdapter getHostBusAdapter(int i) {
        return this.hostBusAdapter[i];
    }

    public void setHostBusAdapter(int i, com.vmware.vim25.HostHostBusAdapter _value) {
        this.hostBusAdapter[i] = _value;
    }


    /**
     * Gets the scsiLun value for this HostStorageDeviceInfo.
     * 
     * @return scsiLun
     */
    public com.vmware.vim25.ScsiLun[] getScsiLun() {
        return scsiLun;
    }


    /**
     * Sets the scsiLun value for this HostStorageDeviceInfo.
     * 
     * @param scsiLun
     */
    public void setScsiLun(com.vmware.vim25.ScsiLun[] scsiLun) {
        this.scsiLun = scsiLun;
    }

    public com.vmware.vim25.ScsiLun getScsiLun(int i) {
        return this.scsiLun[i];
    }

    public void setScsiLun(int i, com.vmware.vim25.ScsiLun _value) {
        this.scsiLun[i] = _value;
    }


    /**
     * Gets the scsiTopology value for this HostStorageDeviceInfo.
     * 
     * @return scsiTopology
     */
    public com.vmware.vim25.HostScsiTopology getScsiTopology() {
        return scsiTopology;
    }


    /**
     * Sets the scsiTopology value for this HostStorageDeviceInfo.
     * 
     * @param scsiTopology
     */
    public void setScsiTopology(com.vmware.vim25.HostScsiTopology scsiTopology) {
        this.scsiTopology = scsiTopology;
    }


    /**
     * Gets the multipathInfo value for this HostStorageDeviceInfo.
     * 
     * @return multipathInfo
     */
    public com.vmware.vim25.HostMultipathInfo getMultipathInfo() {
        return multipathInfo;
    }


    /**
     * Sets the multipathInfo value for this HostStorageDeviceInfo.
     * 
     * @param multipathInfo
     */
    public void setMultipathInfo(com.vmware.vim25.HostMultipathInfo multipathInfo) {
        this.multipathInfo = multipathInfo;
    }


    /**
     * Gets the plugStoreTopology value for this HostStorageDeviceInfo.
     * 
     * @return plugStoreTopology
     */
    public com.vmware.vim25.HostPlugStoreTopology getPlugStoreTopology() {
        return plugStoreTopology;
    }


    /**
     * Sets the plugStoreTopology value for this HostStorageDeviceInfo.
     * 
     * @param plugStoreTopology
     */
    public void setPlugStoreTopology(com.vmware.vim25.HostPlugStoreTopology plugStoreTopology) {
        this.plugStoreTopology = plugStoreTopology;
    }


    /**
     * Gets the softwareInternetScsiEnabled value for this HostStorageDeviceInfo.
     * 
     * @return softwareInternetScsiEnabled
     */
    public boolean isSoftwareInternetScsiEnabled() {
        return softwareInternetScsiEnabled;
    }


    /**
     * Sets the softwareInternetScsiEnabled value for this HostStorageDeviceInfo.
     * 
     * @param softwareInternetScsiEnabled
     */
    public void setSoftwareInternetScsiEnabled(boolean softwareInternetScsiEnabled) {
        this.softwareInternetScsiEnabled = softwareInternetScsiEnabled;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostStorageDeviceInfo)) return false;
        HostStorageDeviceInfo other = (HostStorageDeviceInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.hostBusAdapter==null && other.getHostBusAdapter()==null) || 
             (this.hostBusAdapter!=null &&
              java.util.Arrays.equals(this.hostBusAdapter, other.getHostBusAdapter()))) &&
            ((this.scsiLun==null && other.getScsiLun()==null) || 
             (this.scsiLun!=null &&
              java.util.Arrays.equals(this.scsiLun, other.getScsiLun()))) &&
            ((this.scsiTopology==null && other.getScsiTopology()==null) || 
             (this.scsiTopology!=null &&
              this.scsiTopology.equals(other.getScsiTopology()))) &&
            ((this.multipathInfo==null && other.getMultipathInfo()==null) || 
             (this.multipathInfo!=null &&
              this.multipathInfo.equals(other.getMultipathInfo()))) &&
            ((this.plugStoreTopology==null && other.getPlugStoreTopology()==null) || 
             (this.plugStoreTopology!=null &&
              this.plugStoreTopology.equals(other.getPlugStoreTopology()))) &&
            this.softwareInternetScsiEnabled == other.isSoftwareInternetScsiEnabled();
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
        if (getHostBusAdapter() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostBusAdapter());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostBusAdapter(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getScsiLun() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getScsiLun());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getScsiLun(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getScsiTopology() != null) {
            _hashCode += getScsiTopology().hashCode();
        }
        if (getMultipathInfo() != null) {
            _hashCode += getMultipathInfo().hashCode();
        }
        if (getPlugStoreTopology() != null) {
            _hashCode += getPlugStoreTopology().hashCode();
        }
        _hashCode += (isSoftwareInternetScsiEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostStorageDeviceInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostStorageDeviceInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostBusAdapter");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "hostBusAdapter"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostHostBusAdapter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scsiLun");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "scsiLun"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ScsiLun"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scsiTopology");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "scsiTopology"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostScsiTopology"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("multipathInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "multipathInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostMultipathInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plugStoreTopology");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "plugStoreTopology"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostPlugStoreTopology"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("softwareInternetScsiEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "softwareInternetScsiEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
