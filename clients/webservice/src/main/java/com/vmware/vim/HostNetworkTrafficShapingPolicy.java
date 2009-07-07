/**
 * HostNetworkTrafficShapingPolicy.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class HostNetworkTrafficShapingPolicy  extends com.vmware.vim.DynamicData  implements java.io.Serializable {
    private java.lang.Boolean enabled;

    private java.lang.Long averageBandwidth;

    private java.lang.Long peakBandwidth;

    private java.lang.Long burstSize;

    public HostNetworkTrafficShapingPolicy() {
    }

    public HostNetworkTrafficShapingPolicy(
           java.lang.String dynamicType,
           com.vmware.vim.DynamicProperty[] dynamicProperty,
           java.lang.Boolean enabled,
           java.lang.Long averageBandwidth,
           java.lang.Long peakBandwidth,
           java.lang.Long burstSize) {
        super(
            dynamicType,
            dynamicProperty);
        this.enabled = enabled;
        this.averageBandwidth = averageBandwidth;
        this.peakBandwidth = peakBandwidth;
        this.burstSize = burstSize;
    }


    /**
     * Gets the enabled value for this HostNetworkTrafficShapingPolicy.
     * 
     * @return enabled
     */
    public java.lang.Boolean getEnabled() {
        return enabled;
    }


    /**
     * Sets the enabled value for this HostNetworkTrafficShapingPolicy.
     * 
     * @param enabled
     */
    public void setEnabled(java.lang.Boolean enabled) {
        this.enabled = enabled;
    }


    /**
     * Gets the averageBandwidth value for this HostNetworkTrafficShapingPolicy.
     * 
     * @return averageBandwidth
     */
    public java.lang.Long getAverageBandwidth() {
        return averageBandwidth;
    }


    /**
     * Sets the averageBandwidth value for this HostNetworkTrafficShapingPolicy.
     * 
     * @param averageBandwidth
     */
    public void setAverageBandwidth(java.lang.Long averageBandwidth) {
        this.averageBandwidth = averageBandwidth;
    }


    /**
     * Gets the peakBandwidth value for this HostNetworkTrafficShapingPolicy.
     * 
     * @return peakBandwidth
     */
    public java.lang.Long getPeakBandwidth() {
        return peakBandwidth;
    }


    /**
     * Sets the peakBandwidth value for this HostNetworkTrafficShapingPolicy.
     * 
     * @param peakBandwidth
     */
    public void setPeakBandwidth(java.lang.Long peakBandwidth) {
        this.peakBandwidth = peakBandwidth;
    }


    /**
     * Gets the burstSize value for this HostNetworkTrafficShapingPolicy.
     * 
     * @return burstSize
     */
    public java.lang.Long getBurstSize() {
        return burstSize;
    }


    /**
     * Sets the burstSize value for this HostNetworkTrafficShapingPolicy.
     * 
     * @param burstSize
     */
    public void setBurstSize(java.lang.Long burstSize) {
        this.burstSize = burstSize;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostNetworkTrafficShapingPolicy)) return false;
        HostNetworkTrafficShapingPolicy other = (HostNetworkTrafficShapingPolicy) obj;
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
            ((this.averageBandwidth==null && other.getAverageBandwidth()==null) || 
             (this.averageBandwidth!=null &&
              this.averageBandwidth.equals(other.getAverageBandwidth()))) &&
            ((this.peakBandwidth==null && other.getPeakBandwidth()==null) || 
             (this.peakBandwidth!=null &&
              this.peakBandwidth.equals(other.getPeakBandwidth()))) &&
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
        if (getAverageBandwidth() != null) {
            _hashCode += getAverageBandwidth().hashCode();
        }
        if (getPeakBandwidth() != null) {
            _hashCode += getPeakBandwidth().hashCode();
        }
        if (getBurstSize() != null) {
            _hashCode += getBurstSize().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostNetworkTrafficShapingPolicy.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "HostNetworkTrafficShapingPolicy"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "enabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("averageBandwidth");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "averageBandwidth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("peakBandwidth");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "peakBandwidth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("burstSize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "burstSize"));
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
