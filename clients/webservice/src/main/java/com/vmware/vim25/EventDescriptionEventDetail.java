/**
 * EventDescriptionEventDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class EventDescriptionEventDetail  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private java.lang.String key;

    private java.lang.String description;

    private java.lang.String category;

    private java.lang.String formatOnDatacenter;

    private java.lang.String formatOnComputeResource;

    private java.lang.String formatOnHost;

    private java.lang.String formatOnVm;

    private java.lang.String fullFormat;

    public EventDescriptionEventDetail() {
    }

    public EventDescriptionEventDetail(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           java.lang.String key,
           java.lang.String description,
           java.lang.String category,
           java.lang.String formatOnDatacenter,
           java.lang.String formatOnComputeResource,
           java.lang.String formatOnHost,
           java.lang.String formatOnVm,
           java.lang.String fullFormat) {
        super(
            dynamicType,
            dynamicProperty);
        this.key = key;
        this.description = description;
        this.category = category;
        this.formatOnDatacenter = formatOnDatacenter;
        this.formatOnComputeResource = formatOnComputeResource;
        this.formatOnHost = formatOnHost;
        this.formatOnVm = formatOnVm;
        this.fullFormat = fullFormat;
    }


    /**
     * Gets the key value for this EventDescriptionEventDetail.
     * 
     * @return key
     */
    public java.lang.String getKey() {
        return key;
    }


    /**
     * Sets the key value for this EventDescriptionEventDetail.
     * 
     * @param key
     */
    public void setKey(java.lang.String key) {
        this.key = key;
    }


    /**
     * Gets the description value for this EventDescriptionEventDetail.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this EventDescriptionEventDetail.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the category value for this EventDescriptionEventDetail.
     * 
     * @return category
     */
    public java.lang.String getCategory() {
        return category;
    }


    /**
     * Sets the category value for this EventDescriptionEventDetail.
     * 
     * @param category
     */
    public void setCategory(java.lang.String category) {
        this.category = category;
    }


    /**
     * Gets the formatOnDatacenter value for this EventDescriptionEventDetail.
     * 
     * @return formatOnDatacenter
     */
    public java.lang.String getFormatOnDatacenter() {
        return formatOnDatacenter;
    }


    /**
     * Sets the formatOnDatacenter value for this EventDescriptionEventDetail.
     * 
     * @param formatOnDatacenter
     */
    public void setFormatOnDatacenter(java.lang.String formatOnDatacenter) {
        this.formatOnDatacenter = formatOnDatacenter;
    }


    /**
     * Gets the formatOnComputeResource value for this EventDescriptionEventDetail.
     * 
     * @return formatOnComputeResource
     */
    public java.lang.String getFormatOnComputeResource() {
        return formatOnComputeResource;
    }


    /**
     * Sets the formatOnComputeResource value for this EventDescriptionEventDetail.
     * 
     * @param formatOnComputeResource
     */
    public void setFormatOnComputeResource(java.lang.String formatOnComputeResource) {
        this.formatOnComputeResource = formatOnComputeResource;
    }


    /**
     * Gets the formatOnHost value for this EventDescriptionEventDetail.
     * 
     * @return formatOnHost
     */
    public java.lang.String getFormatOnHost() {
        return formatOnHost;
    }


    /**
     * Sets the formatOnHost value for this EventDescriptionEventDetail.
     * 
     * @param formatOnHost
     */
    public void setFormatOnHost(java.lang.String formatOnHost) {
        this.formatOnHost = formatOnHost;
    }


    /**
     * Gets the formatOnVm value for this EventDescriptionEventDetail.
     * 
     * @return formatOnVm
     */
    public java.lang.String getFormatOnVm() {
        return formatOnVm;
    }


    /**
     * Sets the formatOnVm value for this EventDescriptionEventDetail.
     * 
     * @param formatOnVm
     */
    public void setFormatOnVm(java.lang.String formatOnVm) {
        this.formatOnVm = formatOnVm;
    }


    /**
     * Gets the fullFormat value for this EventDescriptionEventDetail.
     * 
     * @return fullFormat
     */
    public java.lang.String getFullFormat() {
        return fullFormat;
    }


    /**
     * Sets the fullFormat value for this EventDescriptionEventDetail.
     * 
     * @param fullFormat
     */
    public void setFullFormat(java.lang.String fullFormat) {
        this.fullFormat = fullFormat;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EventDescriptionEventDetail)) return false;
        EventDescriptionEventDetail other = (EventDescriptionEventDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.key==null && other.getKey()==null) || 
             (this.key!=null &&
              this.key.equals(other.getKey()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              this.category.equals(other.getCategory()))) &&
            ((this.formatOnDatacenter==null && other.getFormatOnDatacenter()==null) || 
             (this.formatOnDatacenter!=null &&
              this.formatOnDatacenter.equals(other.getFormatOnDatacenter()))) &&
            ((this.formatOnComputeResource==null && other.getFormatOnComputeResource()==null) || 
             (this.formatOnComputeResource!=null &&
              this.formatOnComputeResource.equals(other.getFormatOnComputeResource()))) &&
            ((this.formatOnHost==null && other.getFormatOnHost()==null) || 
             (this.formatOnHost!=null &&
              this.formatOnHost.equals(other.getFormatOnHost()))) &&
            ((this.formatOnVm==null && other.getFormatOnVm()==null) || 
             (this.formatOnVm!=null &&
              this.formatOnVm.equals(other.getFormatOnVm()))) &&
            ((this.fullFormat==null && other.getFullFormat()==null) || 
             (this.fullFormat!=null &&
              this.fullFormat.equals(other.getFullFormat())));
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
        if (getKey() != null) {
            _hashCode += getKey().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getCategory() != null) {
            _hashCode += getCategory().hashCode();
        }
        if (getFormatOnDatacenter() != null) {
            _hashCode += getFormatOnDatacenter().hashCode();
        }
        if (getFormatOnComputeResource() != null) {
            _hashCode += getFormatOnComputeResource().hashCode();
        }
        if (getFormatOnHost() != null) {
            _hashCode += getFormatOnHost().hashCode();
        }
        if (getFormatOnVm() != null) {
            _hashCode += getFormatOnVm().hashCode();
        }
        if (getFullFormat() != null) {
            _hashCode += getFullFormat().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EventDescriptionEventDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "EventDescriptionEventDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "category"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formatOnDatacenter");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "formatOnDatacenter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formatOnComputeResource");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "formatOnComputeResource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formatOnHost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "formatOnHost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formatOnVm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "formatOnVm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fullFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "fullFormat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
