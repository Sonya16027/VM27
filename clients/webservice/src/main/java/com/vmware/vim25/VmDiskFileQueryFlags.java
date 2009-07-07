/**
 * VmDiskFileQueryFlags.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VmDiskFileQueryFlags  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private boolean diskType;

    private boolean capacityKb;

    private boolean hardwareVersion;

    private java.lang.Boolean controllerType;

    private java.lang.Boolean diskExtents;

    private java.lang.Boolean thin;

    public VmDiskFileQueryFlags() {
    }

    public VmDiskFileQueryFlags(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           boolean diskType,
           boolean capacityKb,
           boolean hardwareVersion,
           java.lang.Boolean controllerType,
           java.lang.Boolean diskExtents,
           java.lang.Boolean thin) {
        super(
            dynamicType,
            dynamicProperty);
        this.diskType = diskType;
        this.capacityKb = capacityKb;
        this.hardwareVersion = hardwareVersion;
        this.controllerType = controllerType;
        this.diskExtents = diskExtents;
        this.thin = thin;
    }


    /**
     * Gets the diskType value for this VmDiskFileQueryFlags.
     * 
     * @return diskType
     */
    public boolean isDiskType() {
        return diskType;
    }


    /**
     * Sets the diskType value for this VmDiskFileQueryFlags.
     * 
     * @param diskType
     */
    public void setDiskType(boolean diskType) {
        this.diskType = diskType;
    }


    /**
     * Gets the capacityKb value for this VmDiskFileQueryFlags.
     * 
     * @return capacityKb
     */
    public boolean isCapacityKb() {
        return capacityKb;
    }


    /**
     * Sets the capacityKb value for this VmDiskFileQueryFlags.
     * 
     * @param capacityKb
     */
    public void setCapacityKb(boolean capacityKb) {
        this.capacityKb = capacityKb;
    }


    /**
     * Gets the hardwareVersion value for this VmDiskFileQueryFlags.
     * 
     * @return hardwareVersion
     */
    public boolean isHardwareVersion() {
        return hardwareVersion;
    }


    /**
     * Sets the hardwareVersion value for this VmDiskFileQueryFlags.
     * 
     * @param hardwareVersion
     */
    public void setHardwareVersion(boolean hardwareVersion) {
        this.hardwareVersion = hardwareVersion;
    }


    /**
     * Gets the controllerType value for this VmDiskFileQueryFlags.
     * 
     * @return controllerType
     */
    public java.lang.Boolean getControllerType() {
        return controllerType;
    }


    /**
     * Sets the controllerType value for this VmDiskFileQueryFlags.
     * 
     * @param controllerType
     */
    public void setControllerType(java.lang.Boolean controllerType) {
        this.controllerType = controllerType;
    }


    /**
     * Gets the diskExtents value for this VmDiskFileQueryFlags.
     * 
     * @return diskExtents
     */
    public java.lang.Boolean getDiskExtents() {
        return diskExtents;
    }


    /**
     * Sets the diskExtents value for this VmDiskFileQueryFlags.
     * 
     * @param diskExtents
     */
    public void setDiskExtents(java.lang.Boolean diskExtents) {
        this.diskExtents = diskExtents;
    }


    /**
     * Gets the thin value for this VmDiskFileQueryFlags.
     * 
     * @return thin
     */
    public java.lang.Boolean getThin() {
        return thin;
    }


    /**
     * Sets the thin value for this VmDiskFileQueryFlags.
     * 
     * @param thin
     */
    public void setThin(java.lang.Boolean thin) {
        this.thin = thin;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VmDiskFileQueryFlags)) return false;
        VmDiskFileQueryFlags other = (VmDiskFileQueryFlags) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.diskType == other.isDiskType() &&
            this.capacityKb == other.isCapacityKb() &&
            this.hardwareVersion == other.isHardwareVersion() &&
            ((this.controllerType==null && other.getControllerType()==null) || 
             (this.controllerType!=null &&
              this.controllerType.equals(other.getControllerType()))) &&
            ((this.diskExtents==null && other.getDiskExtents()==null) || 
             (this.diskExtents!=null &&
              this.diskExtents.equals(other.getDiskExtents()))) &&
            ((this.thin==null && other.getThin()==null) || 
             (this.thin!=null &&
              this.thin.equals(other.getThin())));
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
        _hashCode += (isDiskType() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isCapacityKb() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isHardwareVersion() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getControllerType() != null) {
            _hashCode += getControllerType().hashCode();
        }
        if (getDiskExtents() != null) {
            _hashCode += getDiskExtents().hashCode();
        }
        if (getThin() != null) {
            _hashCode += getThin().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VmDiskFileQueryFlags.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VmDiskFileQueryFlags"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diskType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "diskType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capacityKb");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "capacityKb"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hardwareVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "hardwareVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("controllerType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "controllerType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diskExtents");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "diskExtents"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "thin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
