/**
 * DVPortgroupPolicy.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class DVPortgroupPolicy  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private boolean blockOverrideAllowed;

    private boolean shapingOverrideAllowed;

    private boolean vendorConfigOverrideAllowed;

    private boolean livePortMovingAllowed;

    private boolean portConfigResetAtDisconnect;

    public DVPortgroupPolicy() {
    }

    public DVPortgroupPolicy(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           boolean blockOverrideAllowed,
           boolean shapingOverrideAllowed,
           boolean vendorConfigOverrideAllowed,
           boolean livePortMovingAllowed,
           boolean portConfigResetAtDisconnect) {
        super(
            dynamicType,
            dynamicProperty);
        this.blockOverrideAllowed = blockOverrideAllowed;
        this.shapingOverrideAllowed = shapingOverrideAllowed;
        this.vendorConfigOverrideAllowed = vendorConfigOverrideAllowed;
        this.livePortMovingAllowed = livePortMovingAllowed;
        this.portConfigResetAtDisconnect = portConfigResetAtDisconnect;
    }


    /**
     * Gets the blockOverrideAllowed value for this DVPortgroupPolicy.
     * 
     * @return blockOverrideAllowed
     */
    public boolean isBlockOverrideAllowed() {
        return blockOverrideAllowed;
    }


    /**
     * Sets the blockOverrideAllowed value for this DVPortgroupPolicy.
     * 
     * @param blockOverrideAllowed
     */
    public void setBlockOverrideAllowed(boolean blockOverrideAllowed) {
        this.blockOverrideAllowed = blockOverrideAllowed;
    }


    /**
     * Gets the shapingOverrideAllowed value for this DVPortgroupPolicy.
     * 
     * @return shapingOverrideAllowed
     */
    public boolean isShapingOverrideAllowed() {
        return shapingOverrideAllowed;
    }


    /**
     * Sets the shapingOverrideAllowed value for this DVPortgroupPolicy.
     * 
     * @param shapingOverrideAllowed
     */
    public void setShapingOverrideAllowed(boolean shapingOverrideAllowed) {
        this.shapingOverrideAllowed = shapingOverrideAllowed;
    }


    /**
     * Gets the vendorConfigOverrideAllowed value for this DVPortgroupPolicy.
     * 
     * @return vendorConfigOverrideAllowed
     */
    public boolean isVendorConfigOverrideAllowed() {
        return vendorConfigOverrideAllowed;
    }


    /**
     * Sets the vendorConfigOverrideAllowed value for this DVPortgroupPolicy.
     * 
     * @param vendorConfigOverrideAllowed
     */
    public void setVendorConfigOverrideAllowed(boolean vendorConfigOverrideAllowed) {
        this.vendorConfigOverrideAllowed = vendorConfigOverrideAllowed;
    }


    /**
     * Gets the livePortMovingAllowed value for this DVPortgroupPolicy.
     * 
     * @return livePortMovingAllowed
     */
    public boolean isLivePortMovingAllowed() {
        return livePortMovingAllowed;
    }


    /**
     * Sets the livePortMovingAllowed value for this DVPortgroupPolicy.
     * 
     * @param livePortMovingAllowed
     */
    public void setLivePortMovingAllowed(boolean livePortMovingAllowed) {
        this.livePortMovingAllowed = livePortMovingAllowed;
    }


    /**
     * Gets the portConfigResetAtDisconnect value for this DVPortgroupPolicy.
     * 
     * @return portConfigResetAtDisconnect
     */
    public boolean isPortConfigResetAtDisconnect() {
        return portConfigResetAtDisconnect;
    }


    /**
     * Sets the portConfigResetAtDisconnect value for this DVPortgroupPolicy.
     * 
     * @param portConfigResetAtDisconnect
     */
    public void setPortConfigResetAtDisconnect(boolean portConfigResetAtDisconnect) {
        this.portConfigResetAtDisconnect = portConfigResetAtDisconnect;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DVPortgroupPolicy)) return false;
        DVPortgroupPolicy other = (DVPortgroupPolicy) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.blockOverrideAllowed == other.isBlockOverrideAllowed() &&
            this.shapingOverrideAllowed == other.isShapingOverrideAllowed() &&
            this.vendorConfigOverrideAllowed == other.isVendorConfigOverrideAllowed() &&
            this.livePortMovingAllowed == other.isLivePortMovingAllowed() &&
            this.portConfigResetAtDisconnect == other.isPortConfigResetAtDisconnect();
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
        _hashCode += (isBlockOverrideAllowed() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isShapingOverrideAllowed() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isVendorConfigOverrideAllowed() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isLivePortMovingAllowed() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isPortConfigResetAtDisconnect() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DVPortgroupPolicy.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DVPortgroupPolicy"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blockOverrideAllowed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "blockOverrideAllowed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shapingOverrideAllowed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "shapingOverrideAllowed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorConfigOverrideAllowed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vendorConfigOverrideAllowed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("livePortMovingAllowed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "livePortMovingAllowed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portConfigResetAtDisconnect");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "portConfigResetAtDisconnect"));
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
