/**
 * DVSCapability.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class DVSCapability  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private java.lang.Boolean dvsOperationSupported;

    private java.lang.Boolean dvPortGroupOperationSupported;

    private java.lang.Boolean dvPortOperationSupported;

    private com.vmware.vim25.DistributedVirtualSwitchHostProductSpec[] compatibleHostComponentProductInfo;

    public DVSCapability() {
    }

    public DVSCapability(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           java.lang.Boolean dvsOperationSupported,
           java.lang.Boolean dvPortGroupOperationSupported,
           java.lang.Boolean dvPortOperationSupported,
           com.vmware.vim25.DistributedVirtualSwitchHostProductSpec[] compatibleHostComponentProductInfo) {
        super(
            dynamicType,
            dynamicProperty);
        this.dvsOperationSupported = dvsOperationSupported;
        this.dvPortGroupOperationSupported = dvPortGroupOperationSupported;
        this.dvPortOperationSupported = dvPortOperationSupported;
        this.compatibleHostComponentProductInfo = compatibleHostComponentProductInfo;
    }


    /**
     * Gets the dvsOperationSupported value for this DVSCapability.
     * 
     * @return dvsOperationSupported
     */
    public java.lang.Boolean getDvsOperationSupported() {
        return dvsOperationSupported;
    }


    /**
     * Sets the dvsOperationSupported value for this DVSCapability.
     * 
     * @param dvsOperationSupported
     */
    public void setDvsOperationSupported(java.lang.Boolean dvsOperationSupported) {
        this.dvsOperationSupported = dvsOperationSupported;
    }


    /**
     * Gets the dvPortGroupOperationSupported value for this DVSCapability.
     * 
     * @return dvPortGroupOperationSupported
     */
    public java.lang.Boolean getDvPortGroupOperationSupported() {
        return dvPortGroupOperationSupported;
    }


    /**
     * Sets the dvPortGroupOperationSupported value for this DVSCapability.
     * 
     * @param dvPortGroupOperationSupported
     */
    public void setDvPortGroupOperationSupported(java.lang.Boolean dvPortGroupOperationSupported) {
        this.dvPortGroupOperationSupported = dvPortGroupOperationSupported;
    }


    /**
     * Gets the dvPortOperationSupported value for this DVSCapability.
     * 
     * @return dvPortOperationSupported
     */
    public java.lang.Boolean getDvPortOperationSupported() {
        return dvPortOperationSupported;
    }


    /**
     * Sets the dvPortOperationSupported value for this DVSCapability.
     * 
     * @param dvPortOperationSupported
     */
    public void setDvPortOperationSupported(java.lang.Boolean dvPortOperationSupported) {
        this.dvPortOperationSupported = dvPortOperationSupported;
    }


    /**
     * Gets the compatibleHostComponentProductInfo value for this DVSCapability.
     * 
     * @return compatibleHostComponentProductInfo
     */
    public com.vmware.vim25.DistributedVirtualSwitchHostProductSpec[] getCompatibleHostComponentProductInfo() {
        return compatibleHostComponentProductInfo;
    }


    /**
     * Sets the compatibleHostComponentProductInfo value for this DVSCapability.
     * 
     * @param compatibleHostComponentProductInfo
     */
    public void setCompatibleHostComponentProductInfo(com.vmware.vim25.DistributedVirtualSwitchHostProductSpec[] compatibleHostComponentProductInfo) {
        this.compatibleHostComponentProductInfo = compatibleHostComponentProductInfo;
    }

    public com.vmware.vim25.DistributedVirtualSwitchHostProductSpec getCompatibleHostComponentProductInfo(int i) {
        return this.compatibleHostComponentProductInfo[i];
    }

    public void setCompatibleHostComponentProductInfo(int i, com.vmware.vim25.DistributedVirtualSwitchHostProductSpec _value) {
        this.compatibleHostComponentProductInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DVSCapability)) return false;
        DVSCapability other = (DVSCapability) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.dvsOperationSupported==null && other.getDvsOperationSupported()==null) || 
             (this.dvsOperationSupported!=null &&
              this.dvsOperationSupported.equals(other.getDvsOperationSupported()))) &&
            ((this.dvPortGroupOperationSupported==null && other.getDvPortGroupOperationSupported()==null) || 
             (this.dvPortGroupOperationSupported!=null &&
              this.dvPortGroupOperationSupported.equals(other.getDvPortGroupOperationSupported()))) &&
            ((this.dvPortOperationSupported==null && other.getDvPortOperationSupported()==null) || 
             (this.dvPortOperationSupported!=null &&
              this.dvPortOperationSupported.equals(other.getDvPortOperationSupported()))) &&
            ((this.compatibleHostComponentProductInfo==null && other.getCompatibleHostComponentProductInfo()==null) || 
             (this.compatibleHostComponentProductInfo!=null &&
              java.util.Arrays.equals(this.compatibleHostComponentProductInfo, other.getCompatibleHostComponentProductInfo())));
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
        if (getDvsOperationSupported() != null) {
            _hashCode += getDvsOperationSupported().hashCode();
        }
        if (getDvPortGroupOperationSupported() != null) {
            _hashCode += getDvPortGroupOperationSupported().hashCode();
        }
        if (getDvPortOperationSupported() != null) {
            _hashCode += getDvPortOperationSupported().hashCode();
        }
        if (getCompatibleHostComponentProductInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCompatibleHostComponentProductInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCompatibleHostComponentProductInfo(), i);
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
        new org.apache.axis.description.TypeDesc(DVSCapability.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DVSCapability"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dvsOperationSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "dvsOperationSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dvPortGroupOperationSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "dvPortGroupOperationSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dvPortOperationSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "dvPortOperationSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("compatibleHostComponentProductInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "compatibleHostComponentProductInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DistributedVirtualSwitchHostProductSpec"));
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
