/**
 * PatchMissingDependencies.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class PatchMissingDependencies  extends com.vmware.vim25.PatchNotApplicable  implements java.io.Serializable {
    private java.lang.String[] prerequisitePatch;

    private java.lang.String[] prerequisiteLib;

    public PatchMissingDependencies() {
    }

    public PatchMissingDependencies(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           com.vmware.vim25.LocalizedMethodFault faultCause,
           com.vmware.vim25.LocalizableMessage[] faultMessage,
           java.lang.String patchID,
           java.lang.String[] prerequisitePatch,
           java.lang.String[] prerequisiteLib) {
        super(
            dynamicType,
            dynamicProperty,
            faultCause,
            faultMessage,
            patchID);
        this.prerequisitePatch = prerequisitePatch;
        this.prerequisiteLib = prerequisiteLib;
    }


    /**
     * Gets the prerequisitePatch value for this PatchMissingDependencies.
     * 
     * @return prerequisitePatch
     */
    public java.lang.String[] getPrerequisitePatch() {
        return prerequisitePatch;
    }


    /**
     * Sets the prerequisitePatch value for this PatchMissingDependencies.
     * 
     * @param prerequisitePatch
     */
    public void setPrerequisitePatch(java.lang.String[] prerequisitePatch) {
        this.prerequisitePatch = prerequisitePatch;
    }

    public java.lang.String getPrerequisitePatch(int i) {
        return this.prerequisitePatch[i];
    }

    public void setPrerequisitePatch(int i, java.lang.String _value) {
        this.prerequisitePatch[i] = _value;
    }


    /**
     * Gets the prerequisiteLib value for this PatchMissingDependencies.
     * 
     * @return prerequisiteLib
     */
    public java.lang.String[] getPrerequisiteLib() {
        return prerequisiteLib;
    }


    /**
     * Sets the prerequisiteLib value for this PatchMissingDependencies.
     * 
     * @param prerequisiteLib
     */
    public void setPrerequisiteLib(java.lang.String[] prerequisiteLib) {
        this.prerequisiteLib = prerequisiteLib;
    }

    public java.lang.String getPrerequisiteLib(int i) {
        return this.prerequisiteLib[i];
    }

    public void setPrerequisiteLib(int i, java.lang.String _value) {
        this.prerequisiteLib[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PatchMissingDependencies)) return false;
        PatchMissingDependencies other = (PatchMissingDependencies) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.prerequisitePatch==null && other.getPrerequisitePatch()==null) || 
             (this.prerequisitePatch!=null &&
              java.util.Arrays.equals(this.prerequisitePatch, other.getPrerequisitePatch()))) &&
            ((this.prerequisiteLib==null && other.getPrerequisiteLib()==null) || 
             (this.prerequisiteLib!=null &&
              java.util.Arrays.equals(this.prerequisiteLib, other.getPrerequisiteLib())));
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
        if (getPrerequisitePatch() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPrerequisitePatch());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPrerequisitePatch(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPrerequisiteLib() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPrerequisiteLib());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPrerequisiteLib(), i);
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
        new org.apache.axis.description.TypeDesc(PatchMissingDependencies.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "PatchMissingDependencies"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prerequisitePatch");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "prerequisitePatch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prerequisiteLib");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "prerequisiteLib"));
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


    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, this);
    }
}
