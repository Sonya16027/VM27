/**
 * DistributedVirtualSwitchHostMemberPnicBacking.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class DistributedVirtualSwitchHostMemberPnicBacking  extends com.vmware.vim25.DistributedVirtualSwitchHostMemberBacking  implements java.io.Serializable {
    private com.vmware.vim25.DistributedVirtualSwitchHostMemberPnicSpec[] pnicSpec;

    public DistributedVirtualSwitchHostMemberPnicBacking() {
    }

    public DistributedVirtualSwitchHostMemberPnicBacking(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           com.vmware.vim25.DistributedVirtualSwitchHostMemberPnicSpec[] pnicSpec) {
        super(
            dynamicType,
            dynamicProperty);
        this.pnicSpec = pnicSpec;
    }


    /**
     * Gets the pnicSpec value for this DistributedVirtualSwitchHostMemberPnicBacking.
     * 
     * @return pnicSpec
     */
    public com.vmware.vim25.DistributedVirtualSwitchHostMemberPnicSpec[] getPnicSpec() {
        return pnicSpec;
    }


    /**
     * Sets the pnicSpec value for this DistributedVirtualSwitchHostMemberPnicBacking.
     * 
     * @param pnicSpec
     */
    public void setPnicSpec(com.vmware.vim25.DistributedVirtualSwitchHostMemberPnicSpec[] pnicSpec) {
        this.pnicSpec = pnicSpec;
    }

    public com.vmware.vim25.DistributedVirtualSwitchHostMemberPnicSpec getPnicSpec(int i) {
        return this.pnicSpec[i];
    }

    public void setPnicSpec(int i, com.vmware.vim25.DistributedVirtualSwitchHostMemberPnicSpec _value) {
        this.pnicSpec[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DistributedVirtualSwitchHostMemberPnicBacking)) return false;
        DistributedVirtualSwitchHostMemberPnicBacking other = (DistributedVirtualSwitchHostMemberPnicBacking) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.pnicSpec==null && other.getPnicSpec()==null) || 
             (this.pnicSpec!=null &&
              java.util.Arrays.equals(this.pnicSpec, other.getPnicSpec())));
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
        if (getPnicSpec() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPnicSpec());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPnicSpec(), i);
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
        new org.apache.axis.description.TypeDesc(DistributedVirtualSwitchHostMemberPnicBacking.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DistributedVirtualSwitchHostMemberPnicBacking"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pnicSpec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "pnicSpec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DistributedVirtualSwitchHostMemberPnicSpec"));
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
