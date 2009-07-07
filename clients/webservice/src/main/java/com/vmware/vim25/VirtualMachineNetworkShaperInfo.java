/**
 * VirtualMachineNetworkShaperInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VirtualMachineNetworkShaperInfo  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private java.lang.Boolean enabled;

    private java.lang.Long peakBps;

    private java.lang.Long averageBps;

    private java.lang.Long burstSize;

    public VirtualMachineNetworkShaperInfo() {
    }

    public VirtualMachineNetworkShaperInfo(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           java.lang.Boolean enabled,
           java.lang.Long peakBps,
           java.lang.Long averageBps,
           java.lang.Long burstSize) {
        super(
            dynamicType,
            dynamicProperty);
        this.enabled = enabled;
        this.peakBps = peakBps;
        this.averageBps = averageBps;
        this.burstSize = burstSize;
    }


    /**
     * Gets the enabled value for this VirtualMachineNetworkShaperInfo.
     * 
     * @return enabled
     */
    public java.lang.Boolean getEnabled() {
        return enabled;
    }


    /**
     * Sets the enabled value for this VirtualMachineNetworkShaperInfo.
     * 
     * @param enabled
     */
    public void setEnabled(java.lang.Boolean enabled) {
        this.enabled = enabled;
    }


    /**
     * Gets the peakBps value for this VirtualMachineNetworkShaperInfo.
     * 
     * @return peakBps
     */
    public java.lang.Long getPeakBps() {
        return peakBps;
    }


    /**
     * Sets the peakBps value for this VirtualMachineNetworkShaperInfo.
     * 
     * @param peakBps
     */
    public void setPeakBps(java.lang.Long peakBps) {
        this.peakBps = peakBps;
    }


    /**
     * Gets the averageBps value for this VirtualMachineNetworkShaperInfo.
     * 
     * @return averageBps
     */
    public java.lang.Long getAverageBps() {
        return averageBps;
    }


    /**
     * Sets the averageBps value for this VirtualMachineNetworkShaperInfo.
     * 
     * @param averageBps
     */
    public void setAverageBps(java.lang.Long averageBps) {
        this.averageBps = averageBps;
    }


    /**
     * Gets the burstSize value for this VirtualMachineNetworkShaperInfo.
     * 
     * @return burstSize
     */
    public java.lang.Long getBurstSize() {
        return burstSize;
    }


    /**
     * Sets the burstSize value for this VirtualMachineNetworkShaperInfo.
     * 
     * @param burstSize
     */
    public void setBurstSize(java.lang.Long burstSize) {
        this.burstSize = burstSize;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualMachineNetworkShaperInfo)) return false;
        VirtualMachineNetworkShaperInfo other = (VirtualMachineNetworkShaperInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.enabled==null && other.getEnabled()==null) || 
             (this.enabled!=null &&
              this.enabled.equals(other.getEnabled()))) &&
            ((this.peakBps==null && other.getPeakBps()==null) || 
             (this.peakBps!=null &&
              this.peakBps.equals(other.getPeakBps()))) &&
            ((this.averageBps==null && other.getAverageBps()==null) || 
             (this.averageBps!=null &&
              this.averageBps.equals(other.getAverageBps()))) &&
            ((this.burstSize==null && other.getBurstSize()==null) || 
             (this.burstSize!=null &&
              this.burstSize.equals(other.getBurstSize())));
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
        if (getEnabled() != null) {
            _hashCode += getEnabled().hashCode();
        }
        if (getPeakBps() != null) {
            _hashCode += getPeakBps().hashCode();
        }
        if (getAverageBps() != null) {
            _hashCode += getAverageBps().hashCode();
        }
        if (getBurstSize() != null) {
            _hashCode += getBurstSize().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualMachineNetworkShaperInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineNetworkShaperInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "enabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("peakBps");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "peakBps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("averageBps");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "averageBps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("burstSize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "burstSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
