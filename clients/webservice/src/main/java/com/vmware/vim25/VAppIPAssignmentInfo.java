/**
 * VAppIPAssignmentInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VAppIPAssignmentInfo  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private java.lang.String[] supportedAllocationScheme;

    private java.lang.String ipAllocationPolicy;

    private java.lang.String[] supportedIpProtocol;

    private java.lang.String ipProtocol;

    public VAppIPAssignmentInfo() {
    }

    public VAppIPAssignmentInfo(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           java.lang.String[] supportedAllocationScheme,
           java.lang.String ipAllocationPolicy,
           java.lang.String[] supportedIpProtocol,
           java.lang.String ipProtocol) {
        super(
            dynamicType,
            dynamicProperty);
        this.supportedAllocationScheme = supportedAllocationScheme;
        this.ipAllocationPolicy = ipAllocationPolicy;
        this.supportedIpProtocol = supportedIpProtocol;
        this.ipProtocol = ipProtocol;
    }


    /**
     * Gets the supportedAllocationScheme value for this VAppIPAssignmentInfo.
     * 
     * @return supportedAllocationScheme
     */
    public java.lang.String[] getSupportedAllocationScheme() {
        return supportedAllocationScheme;
    }


    /**
     * Sets the supportedAllocationScheme value for this VAppIPAssignmentInfo.
     * 
     * @param supportedAllocationScheme
     */
    public void setSupportedAllocationScheme(java.lang.String[] supportedAllocationScheme) {
        this.supportedAllocationScheme = supportedAllocationScheme;
    }

    public java.lang.String getSupportedAllocationScheme(int i) {
        return this.supportedAllocationScheme[i];
    }

    public void setSupportedAllocationScheme(int i, java.lang.String _value) {
        this.supportedAllocationScheme[i] = _value;
    }


    /**
     * Gets the ipAllocationPolicy value for this VAppIPAssignmentInfo.
     * 
     * @return ipAllocationPolicy
     */
    public java.lang.String getIpAllocationPolicy() {
        return ipAllocationPolicy;
    }


    /**
     * Sets the ipAllocationPolicy value for this VAppIPAssignmentInfo.
     * 
     * @param ipAllocationPolicy
     */
    public void setIpAllocationPolicy(java.lang.String ipAllocationPolicy) {
        this.ipAllocationPolicy = ipAllocationPolicy;
    }


    /**
     * Gets the supportedIpProtocol value for this VAppIPAssignmentInfo.
     * 
     * @return supportedIpProtocol
     */
    public java.lang.String[] getSupportedIpProtocol() {
        return supportedIpProtocol;
    }


    /**
     * Sets the supportedIpProtocol value for this VAppIPAssignmentInfo.
     * 
     * @param supportedIpProtocol
     */
    public void setSupportedIpProtocol(java.lang.String[] supportedIpProtocol) {
        this.supportedIpProtocol = supportedIpProtocol;
    }

    public java.lang.String getSupportedIpProtocol(int i) {
        return this.supportedIpProtocol[i];
    }

    public void setSupportedIpProtocol(int i, java.lang.String _value) {
        this.supportedIpProtocol[i] = _value;
    }


    /**
     * Gets the ipProtocol value for this VAppIPAssignmentInfo.
     * 
     * @return ipProtocol
     */
    public java.lang.String getIpProtocol() {
        return ipProtocol;
    }


    /**
     * Sets the ipProtocol value for this VAppIPAssignmentInfo.
     * 
     * @param ipProtocol
     */
    public void setIpProtocol(java.lang.String ipProtocol) {
        this.ipProtocol = ipProtocol;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VAppIPAssignmentInfo)) return false;
        VAppIPAssignmentInfo other = (VAppIPAssignmentInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.supportedAllocationScheme==null && other.getSupportedAllocationScheme()==null) || 
             (this.supportedAllocationScheme!=null &&
              java.util.Arrays.equals(this.supportedAllocationScheme, other.getSupportedAllocationScheme()))) &&
            ((this.ipAllocationPolicy==null && other.getIpAllocationPolicy()==null) || 
             (this.ipAllocationPolicy!=null &&
              this.ipAllocationPolicy.equals(other.getIpAllocationPolicy()))) &&
            ((this.supportedIpProtocol==null && other.getSupportedIpProtocol()==null) || 
             (this.supportedIpProtocol!=null &&
              java.util.Arrays.equals(this.supportedIpProtocol, other.getSupportedIpProtocol()))) &&
            ((this.ipProtocol==null && other.getIpProtocol()==null) || 
             (this.ipProtocol!=null &&
              this.ipProtocol.equals(other.getIpProtocol())));
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
        if (getSupportedAllocationScheme() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSupportedAllocationScheme());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSupportedAllocationScheme(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIpAllocationPolicy() != null) {
            _hashCode += getIpAllocationPolicy().hashCode();
        }
        if (getSupportedIpProtocol() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSupportedIpProtocol());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSupportedIpProtocol(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIpProtocol() != null) {
            _hashCode += getIpProtocol().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VAppIPAssignmentInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VAppIPAssignmentInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supportedAllocationScheme");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "supportedAllocationScheme"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipAllocationPolicy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ipAllocationPolicy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supportedIpProtocol");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "supportedIpProtocol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipProtocol");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ipProtocol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
