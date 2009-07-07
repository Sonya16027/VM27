/**
 * EVCAdmissionFailedCPUVendor.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class EVCAdmissionFailedCPUVendor  extends com.vmware.vim25.EVCAdmissionFailed  implements java.io.Serializable {
    private java.lang.String clusterCPUVendor;

    private java.lang.String hostCPUVendor;

    public EVCAdmissionFailedCPUVendor() {
    }

    public EVCAdmissionFailedCPUVendor(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           com.vmware.vim25.LocalizedMethodFault faultCause,
           com.vmware.vim25.LocalizableMessage[] faultMessage,
           java.lang.String productName,
           java.lang.String productVersion,
           java.lang.String clusterCPUVendor,
           java.lang.String hostCPUVendor) {
        super(
            dynamicType,
            dynamicProperty,
            faultCause,
            faultMessage,
            productName,
            productVersion);
        this.clusterCPUVendor = clusterCPUVendor;
        this.hostCPUVendor = hostCPUVendor;
    }


    /**
     * Gets the clusterCPUVendor value for this EVCAdmissionFailedCPUVendor.
     * 
     * @return clusterCPUVendor
     */
    public java.lang.String getClusterCPUVendor() {
        return clusterCPUVendor;
    }


    /**
     * Sets the clusterCPUVendor value for this EVCAdmissionFailedCPUVendor.
     * 
     * @param clusterCPUVendor
     */
    public void setClusterCPUVendor(java.lang.String clusterCPUVendor) {
        this.clusterCPUVendor = clusterCPUVendor;
    }


    /**
     * Gets the hostCPUVendor value for this EVCAdmissionFailedCPUVendor.
     * 
     * @return hostCPUVendor
     */
    public java.lang.String getHostCPUVendor() {
        return hostCPUVendor;
    }


    /**
     * Sets the hostCPUVendor value for this EVCAdmissionFailedCPUVendor.
     * 
     * @param hostCPUVendor
     */
    public void setHostCPUVendor(java.lang.String hostCPUVendor) {
        this.hostCPUVendor = hostCPUVendor;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EVCAdmissionFailedCPUVendor)) return false;
        EVCAdmissionFailedCPUVendor other = (EVCAdmissionFailedCPUVendor) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.clusterCPUVendor==null && other.getClusterCPUVendor()==null) || 
             (this.clusterCPUVendor!=null &&
              this.clusterCPUVendor.equals(other.getClusterCPUVendor()))) &&
            ((this.hostCPUVendor==null && other.getHostCPUVendor()==null) || 
             (this.hostCPUVendor!=null &&
              this.hostCPUVendor.equals(other.getHostCPUVendor())));
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
        if (getClusterCPUVendor() != null) {
            _hashCode += getClusterCPUVendor().hashCode();
        }
        if (getHostCPUVendor() != null) {
            _hashCode += getHostCPUVendor().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EVCAdmissionFailedCPUVendor.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "EVCAdmissionFailedCPUVendor"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clusterCPUVendor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "clusterCPUVendor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostCPUVendor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "hostCPUVendor"));
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


    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, this);
    }
}
