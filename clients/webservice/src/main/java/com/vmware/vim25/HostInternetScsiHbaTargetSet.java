/**
 * HostInternetScsiHbaTargetSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostInternetScsiHbaTargetSet  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private com.vmware.vim25.HostInternetScsiHbaStaticTarget[] staticTargets;

    private com.vmware.vim25.HostInternetScsiHbaSendTarget[] sendTargets;

    public HostInternetScsiHbaTargetSet() {
    }

    public HostInternetScsiHbaTargetSet(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           com.vmware.vim25.HostInternetScsiHbaStaticTarget[] staticTargets,
           com.vmware.vim25.HostInternetScsiHbaSendTarget[] sendTargets) {
        super(
            dynamicType,
            dynamicProperty);
        this.staticTargets = staticTargets;
        this.sendTargets = sendTargets;
    }


    /**
     * Gets the staticTargets value for this HostInternetScsiHbaTargetSet.
     * 
     * @return staticTargets
     */
    public com.vmware.vim25.HostInternetScsiHbaStaticTarget[] getStaticTargets() {
        return staticTargets;
    }


    /**
     * Sets the staticTargets value for this HostInternetScsiHbaTargetSet.
     * 
     * @param staticTargets
     */
    public void setStaticTargets(com.vmware.vim25.HostInternetScsiHbaStaticTarget[] staticTargets) {
        this.staticTargets = staticTargets;
    }

    public com.vmware.vim25.HostInternetScsiHbaStaticTarget getStaticTargets(int i) {
        return this.staticTargets[i];
    }

    public void setStaticTargets(int i, com.vmware.vim25.HostInternetScsiHbaStaticTarget _value) {
        this.staticTargets[i] = _value;
    }


    /**
     * Gets the sendTargets value for this HostInternetScsiHbaTargetSet.
     * 
     * @return sendTargets
     */
    public com.vmware.vim25.HostInternetScsiHbaSendTarget[] getSendTargets() {
        return sendTargets;
    }


    /**
     * Sets the sendTargets value for this HostInternetScsiHbaTargetSet.
     * 
     * @param sendTargets
     */
    public void setSendTargets(com.vmware.vim25.HostInternetScsiHbaSendTarget[] sendTargets) {
        this.sendTargets = sendTargets;
    }

    public com.vmware.vim25.HostInternetScsiHbaSendTarget getSendTargets(int i) {
        return this.sendTargets[i];
    }

    public void setSendTargets(int i, com.vmware.vim25.HostInternetScsiHbaSendTarget _value) {
        this.sendTargets[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostInternetScsiHbaTargetSet)) return false;
        HostInternetScsiHbaTargetSet other = (HostInternetScsiHbaTargetSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.staticTargets==null && other.getStaticTargets()==null) || 
             (this.staticTargets!=null &&
              java.util.Arrays.equals(this.staticTargets, other.getStaticTargets()))) &&
            ((this.sendTargets==null && other.getSendTargets()==null) || 
             (this.sendTargets!=null &&
              java.util.Arrays.equals(this.sendTargets, other.getSendTargets())));
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
        if (getStaticTargets() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStaticTargets());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStaticTargets(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSendTargets() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSendTargets());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSendTargets(), i);
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
        new org.apache.axis.description.TypeDesc(HostInternetScsiHbaTargetSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostInternetScsiHbaTargetSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("staticTargets");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "staticTargets"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostInternetScsiHbaStaticTarget"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendTargets");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "sendTargets"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostInternetScsiHbaSendTarget"));
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
