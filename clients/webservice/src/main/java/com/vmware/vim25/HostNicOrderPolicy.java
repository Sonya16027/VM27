/**
 * HostNicOrderPolicy.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostNicOrderPolicy  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private java.lang.String[] activeNic;

    private java.lang.String[] standbyNic;

    public HostNicOrderPolicy() {
    }

    public HostNicOrderPolicy(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           java.lang.String[] activeNic,
           java.lang.String[] standbyNic) {
        super(
            dynamicType,
            dynamicProperty);
        this.activeNic = activeNic;
        this.standbyNic = standbyNic;
    }


    /**
     * Gets the activeNic value for this HostNicOrderPolicy.
     * 
     * @return activeNic
     */
    public java.lang.String[] getActiveNic() {
        return activeNic;
    }


    /**
     * Sets the activeNic value for this HostNicOrderPolicy.
     * 
     * @param activeNic
     */
    public void setActiveNic(java.lang.String[] activeNic) {
        this.activeNic = activeNic;
    }

    public java.lang.String getActiveNic(int i) {
        return this.activeNic[i];
    }

    public void setActiveNic(int i, java.lang.String _value) {
        this.activeNic[i] = _value;
    }


    /**
     * Gets the standbyNic value for this HostNicOrderPolicy.
     * 
     * @return standbyNic
     */
    public java.lang.String[] getStandbyNic() {
        return standbyNic;
    }


    /**
     * Sets the standbyNic value for this HostNicOrderPolicy.
     * 
     * @param standbyNic
     */
    public void setStandbyNic(java.lang.String[] standbyNic) {
        this.standbyNic = standbyNic;
    }

    public java.lang.String getStandbyNic(int i) {
        return this.standbyNic[i];
    }

    public void setStandbyNic(int i, java.lang.String _value) {
        this.standbyNic[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostNicOrderPolicy)) return false;
        HostNicOrderPolicy other = (HostNicOrderPolicy) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.activeNic==null && other.getActiveNic()==null) || 
             (this.activeNic!=null &&
              java.util.Arrays.equals(this.activeNic, other.getActiveNic()))) &&
            ((this.standbyNic==null && other.getStandbyNic()==null) || 
             (this.standbyNic!=null &&
              java.util.Arrays.equals(this.standbyNic, other.getStandbyNic())));
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
        if (getActiveNic() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getActiveNic());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getActiveNic(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStandbyNic() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStandbyNic());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStandbyNic(), i);
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
        new org.apache.axis.description.TypeDesc(HostNicOrderPolicy.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostNicOrderPolicy"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activeNic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "activeNic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("standbyNic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "standbyNic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
