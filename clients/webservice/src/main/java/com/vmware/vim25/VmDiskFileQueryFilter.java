/**
 * VmDiskFileQueryFilter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VmDiskFileQueryFilter  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private java.lang.String[] diskType;

    private int[] matchHardwareVersion;

    private java.lang.String[] controllerType;

    private java.lang.Boolean thin;

    public VmDiskFileQueryFilter() {
    }

    public VmDiskFileQueryFilter(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           java.lang.String[] diskType,
           int[] matchHardwareVersion,
           java.lang.String[] controllerType,
           java.lang.Boolean thin) {
        super(
            dynamicType,
            dynamicProperty);
        this.diskType = diskType;
        this.matchHardwareVersion = matchHardwareVersion;
        this.controllerType = controllerType;
        this.thin = thin;
    }


    /**
     * Gets the diskType value for this VmDiskFileQueryFilter.
     * 
     * @return diskType
     */
    public java.lang.String[] getDiskType() {
        return diskType;
    }


    /**
     * Sets the diskType value for this VmDiskFileQueryFilter.
     * 
     * @param diskType
     */
    public void setDiskType(java.lang.String[] diskType) {
        this.diskType = diskType;
    }

    public java.lang.String getDiskType(int i) {
        return this.diskType[i];
    }

    public void setDiskType(int i, java.lang.String _value) {
        this.diskType[i] = _value;
    }


    /**
     * Gets the matchHardwareVersion value for this VmDiskFileQueryFilter.
     * 
     * @return matchHardwareVersion
     */
    public int[] getMatchHardwareVersion() {
        return matchHardwareVersion;
    }


    /**
     * Sets the matchHardwareVersion value for this VmDiskFileQueryFilter.
     * 
     * @param matchHardwareVersion
     */
    public void setMatchHardwareVersion(int[] matchHardwareVersion) {
        this.matchHardwareVersion = matchHardwareVersion;
    }

    public int getMatchHardwareVersion(int i) {
        return this.matchHardwareVersion[i];
    }

    public void setMatchHardwareVersion(int i, int _value) {
        this.matchHardwareVersion[i] = _value;
    }


    /**
     * Gets the controllerType value for this VmDiskFileQueryFilter.
     * 
     * @return controllerType
     */
    public java.lang.String[] getControllerType() {
        return controllerType;
    }


    /**
     * Sets the controllerType value for this VmDiskFileQueryFilter.
     * 
     * @param controllerType
     */
    public void setControllerType(java.lang.String[] controllerType) {
        this.controllerType = controllerType;
    }

    public java.lang.String getControllerType(int i) {
        return this.controllerType[i];
    }

    public void setControllerType(int i, java.lang.String _value) {
        this.controllerType[i] = _value;
    }


    /**
     * Gets the thin value for this VmDiskFileQueryFilter.
     * 
     * @return thin
     */
    public java.lang.Boolean getThin() {
        return thin;
    }


    /**
     * Sets the thin value for this VmDiskFileQueryFilter.
     * 
     * @param thin
     */
    public void setThin(java.lang.Boolean thin) {
        this.thin = thin;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VmDiskFileQueryFilter)) return false;
        VmDiskFileQueryFilter other = (VmDiskFileQueryFilter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.diskType==null && other.getDiskType()==null) || 
             (this.diskType!=null &&
              java.util.Arrays.equals(this.diskType, other.getDiskType()))) &&
            ((this.matchHardwareVersion==null && other.getMatchHardwareVersion()==null) || 
             (this.matchHardwareVersion!=null &&
              java.util.Arrays.equals(this.matchHardwareVersion, other.getMatchHardwareVersion()))) &&
            ((this.controllerType==null && other.getControllerType()==null) || 
             (this.controllerType!=null &&
              java.util.Arrays.equals(this.controllerType, other.getControllerType()))) &&
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
        if (getDiskType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDiskType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDiskType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMatchHardwareVersion() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMatchHardwareVersion());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMatchHardwareVersion(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getControllerType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getControllerType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getControllerType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getThin() != null) {
            _hashCode += getThin().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VmDiskFileQueryFilter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VmDiskFileQueryFilter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diskType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "diskType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchHardwareVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "matchHardwareVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("controllerType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "controllerType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
