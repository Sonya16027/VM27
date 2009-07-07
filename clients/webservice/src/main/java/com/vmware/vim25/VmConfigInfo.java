/**
 * VmConfigInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VmConfigInfo  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private com.vmware.vim25.VAppProductInfo[] product;

    private com.vmware.vim25.VAppPropertyInfo[] property;

    private com.vmware.vim25.VAppIPAssignmentInfo ipAssignment;

    private java.lang.String[] eula;

    private com.vmware.vim25.VAppOvfSectionInfo[] ovfSection;

    private java.lang.String[] ovfEnvironmentTransport;

    private boolean installBootRequired;

    private int installBootStopDelay;

    public VmConfigInfo() {
    }

    public VmConfigInfo(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           com.vmware.vim25.VAppProductInfo[] product,
           com.vmware.vim25.VAppPropertyInfo[] property,
           com.vmware.vim25.VAppIPAssignmentInfo ipAssignment,
           java.lang.String[] eula,
           com.vmware.vim25.VAppOvfSectionInfo[] ovfSection,
           java.lang.String[] ovfEnvironmentTransport,
           boolean installBootRequired,
           int installBootStopDelay) {
        super(
            dynamicType,
            dynamicProperty);
        this.product = product;
        this.property = property;
        this.ipAssignment = ipAssignment;
        this.eula = eula;
        this.ovfSection = ovfSection;
        this.ovfEnvironmentTransport = ovfEnvironmentTransport;
        this.installBootRequired = installBootRequired;
        this.installBootStopDelay = installBootStopDelay;
    }


    /**
     * Gets the product value for this VmConfigInfo.
     * 
     * @return product
     */
    public com.vmware.vim25.VAppProductInfo[] getProduct() {
        return product;
    }


    /**
     * Sets the product value for this VmConfigInfo.
     * 
     * @param product
     */
    public void setProduct(com.vmware.vim25.VAppProductInfo[] product) {
        this.product = product;
    }

    public com.vmware.vim25.VAppProductInfo getProduct(int i) {
        return this.product[i];
    }

    public void setProduct(int i, com.vmware.vim25.VAppProductInfo _value) {
        this.product[i] = _value;
    }


    /**
     * Gets the property value for this VmConfigInfo.
     * 
     * @return property
     */
    public com.vmware.vim25.VAppPropertyInfo[] getProperty() {
        return property;
    }


    /**
     * Sets the property value for this VmConfigInfo.
     * 
     * @param property
     */
    public void setProperty(com.vmware.vim25.VAppPropertyInfo[] property) {
        this.property = property;
    }

    public com.vmware.vim25.VAppPropertyInfo getProperty(int i) {
        return this.property[i];
    }

    public void setProperty(int i, com.vmware.vim25.VAppPropertyInfo _value) {
        this.property[i] = _value;
    }


    /**
     * Gets the ipAssignment value for this VmConfigInfo.
     * 
     * @return ipAssignment
     */
    public com.vmware.vim25.VAppIPAssignmentInfo getIpAssignment() {
        return ipAssignment;
    }


    /**
     * Sets the ipAssignment value for this VmConfigInfo.
     * 
     * @param ipAssignment
     */
    public void setIpAssignment(com.vmware.vim25.VAppIPAssignmentInfo ipAssignment) {
        this.ipAssignment = ipAssignment;
    }


    /**
     * Gets the eula value for this VmConfigInfo.
     * 
     * @return eula
     */
    public java.lang.String[] getEula() {
        return eula;
    }


    /**
     * Sets the eula value for this VmConfigInfo.
     * 
     * @param eula
     */
    public void setEula(java.lang.String[] eula) {
        this.eula = eula;
    }

    public java.lang.String getEula(int i) {
        return this.eula[i];
    }

    public void setEula(int i, java.lang.String _value) {
        this.eula[i] = _value;
    }


    /**
     * Gets the ovfSection value for this VmConfigInfo.
     * 
     * @return ovfSection
     */
    public com.vmware.vim25.VAppOvfSectionInfo[] getOvfSection() {
        return ovfSection;
    }


    /**
     * Sets the ovfSection value for this VmConfigInfo.
     * 
     * @param ovfSection
     */
    public void setOvfSection(com.vmware.vim25.VAppOvfSectionInfo[] ovfSection) {
        this.ovfSection = ovfSection;
    }

    public com.vmware.vim25.VAppOvfSectionInfo getOvfSection(int i) {
        return this.ovfSection[i];
    }

    public void setOvfSection(int i, com.vmware.vim25.VAppOvfSectionInfo _value) {
        this.ovfSection[i] = _value;
    }


    /**
     * Gets the ovfEnvironmentTransport value for this VmConfigInfo.
     * 
     * @return ovfEnvironmentTransport
     */
    public java.lang.String[] getOvfEnvironmentTransport() {
        return ovfEnvironmentTransport;
    }


    /**
     * Sets the ovfEnvironmentTransport value for this VmConfigInfo.
     * 
     * @param ovfEnvironmentTransport
     */
    public void setOvfEnvironmentTransport(java.lang.String[] ovfEnvironmentTransport) {
        this.ovfEnvironmentTransport = ovfEnvironmentTransport;
    }

    public java.lang.String getOvfEnvironmentTransport(int i) {
        return this.ovfEnvironmentTransport[i];
    }

    public void setOvfEnvironmentTransport(int i, java.lang.String _value) {
        this.ovfEnvironmentTransport[i] = _value;
    }


    /**
     * Gets the installBootRequired value for this VmConfigInfo.
     * 
     * @return installBootRequired
     */
    public boolean isInstallBootRequired() {
        return installBootRequired;
    }


    /**
     * Sets the installBootRequired value for this VmConfigInfo.
     * 
     * @param installBootRequired
     */
    public void setInstallBootRequired(boolean installBootRequired) {
        this.installBootRequired = installBootRequired;
    }


    /**
     * Gets the installBootStopDelay value for this VmConfigInfo.
     * 
     * @return installBootStopDelay
     */
    public int getInstallBootStopDelay() {
        return installBootStopDelay;
    }


    /**
     * Sets the installBootStopDelay value for this VmConfigInfo.
     * 
     * @param installBootStopDelay
     */
    public void setInstallBootStopDelay(int installBootStopDelay) {
        this.installBootStopDelay = installBootStopDelay;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VmConfigInfo)) return false;
        VmConfigInfo other = (VmConfigInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.product==null && other.getProduct()==null) || 
             (this.product!=null &&
              java.util.Arrays.equals(this.product, other.getProduct()))) &&
            ((this.property==null && other.getProperty()==null) || 
             (this.property!=null &&
              java.util.Arrays.equals(this.property, other.getProperty()))) &&
            ((this.ipAssignment==null && other.getIpAssignment()==null) || 
             (this.ipAssignment!=null &&
              this.ipAssignment.equals(other.getIpAssignment()))) &&
            ((this.eula==null && other.getEula()==null) || 
             (this.eula!=null &&
              java.util.Arrays.equals(this.eula, other.getEula()))) &&
            ((this.ovfSection==null && other.getOvfSection()==null) || 
             (this.ovfSection!=null &&
              java.util.Arrays.equals(this.ovfSection, other.getOvfSection()))) &&
            ((this.ovfEnvironmentTransport==null && other.getOvfEnvironmentTransport()==null) || 
             (this.ovfEnvironmentTransport!=null &&
              java.util.Arrays.equals(this.ovfEnvironmentTransport, other.getOvfEnvironmentTransport()))) &&
            this.installBootRequired == other.isInstallBootRequired() &&
            this.installBootStopDelay == other.getInstallBootStopDelay();
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
        if (getProduct() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProduct());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProduct(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProperty() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProperty());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProperty(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIpAssignment() != null) {
            _hashCode += getIpAssignment().hashCode();
        }
        if (getEula() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEula());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEula(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOvfSection() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOvfSection());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOvfSection(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOvfEnvironmentTransport() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOvfEnvironmentTransport());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOvfEnvironmentTransport(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isInstallBootRequired() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getInstallBootStopDelay();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VmConfigInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VmConfigInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "product"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VAppProductInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("property");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "property"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VAppPropertyInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipAssignment");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ipAssignment"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VAppIPAssignmentInfo"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eula");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "eula"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ovfSection");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ovfSection"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VAppOvfSectionInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ovfEnvironmentTransport");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ovfEnvironmentTransport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("installBootRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "installBootRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("installBootStopDelay");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "installBootStopDelay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
