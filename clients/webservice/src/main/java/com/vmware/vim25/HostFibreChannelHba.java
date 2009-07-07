/**
 * HostFibreChannelHba.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostFibreChannelHba  extends com.vmware.vim25.HostHostBusAdapter  implements java.io.Serializable {
    private long portWorldWideName;

    private long nodeWorldWideName;

    private com.vmware.vim25.FibreChannelPortType portType;

    private long speed;

    public HostFibreChannelHba() {
    }

    public HostFibreChannelHba(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           java.lang.String key,
           java.lang.String device,
           int bus,
           java.lang.String status,
           java.lang.String model,
           java.lang.String driver,
           java.lang.String pci,
           long portWorldWideName,
           long nodeWorldWideName,
           com.vmware.vim25.FibreChannelPortType portType,
           long speed) {
        super(
            dynamicType,
            dynamicProperty,
            key,
            device,
            bus,
            status,
            model,
            driver,
            pci);
        this.portWorldWideName = portWorldWideName;
        this.nodeWorldWideName = nodeWorldWideName;
        this.portType = portType;
        this.speed = speed;
    }


    /**
     * Gets the portWorldWideName value for this HostFibreChannelHba.
     * 
     * @return portWorldWideName
     */
    public long getPortWorldWideName() {
        return portWorldWideName;
    }


    /**
     * Sets the portWorldWideName value for this HostFibreChannelHba.
     * 
     * @param portWorldWideName
     */
    public void setPortWorldWideName(long portWorldWideName) {
        this.portWorldWideName = portWorldWideName;
    }


    /**
     * Gets the nodeWorldWideName value for this HostFibreChannelHba.
     * 
     * @return nodeWorldWideName
     */
    public long getNodeWorldWideName() {
        return nodeWorldWideName;
    }


    /**
     * Sets the nodeWorldWideName value for this HostFibreChannelHba.
     * 
     * @param nodeWorldWideName
     */
    public void setNodeWorldWideName(long nodeWorldWideName) {
        this.nodeWorldWideName = nodeWorldWideName;
    }


    /**
     * Gets the portType value for this HostFibreChannelHba.
     * 
     * @return portType
     */
    public com.vmware.vim25.FibreChannelPortType getPortType() {
        return portType;
    }


    /**
     * Sets the portType value for this HostFibreChannelHba.
     * 
     * @param portType
     */
    public void setPortType(com.vmware.vim25.FibreChannelPortType portType) {
        this.portType = portType;
    }


    /**
     * Gets the speed value for this HostFibreChannelHba.
     * 
     * @return speed
     */
    public long getSpeed() {
        return speed;
    }


    /**
     * Sets the speed value for this HostFibreChannelHba.
     * 
     * @param speed
     */
    public void setSpeed(long speed) {
        this.speed = speed;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostFibreChannelHba)) return false;
        HostFibreChannelHba other = (HostFibreChannelHba) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.portWorldWideName == other.getPortWorldWideName() &&
            this.nodeWorldWideName == other.getNodeWorldWideName() &&
            ((this.portType==null && other.getPortType()==null) || 
             (this.portType!=null &&
              this.portType.equals(other.getPortType()))) &&
            this.speed == other.getSpeed();
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
        _hashCode += new Long(getPortWorldWideName()).hashCode();
        _hashCode += new Long(getNodeWorldWideName()).hashCode();
        if (getPortType() != null) {
            _hashCode += getPortType().hashCode();
        }
        _hashCode += new Long(getSpeed()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostFibreChannelHba.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostFibreChannelHba"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portWorldWideName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "portWorldWideName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nodeWorldWideName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "nodeWorldWideName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "portType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "FibreChannelPortType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("speed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "speed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
