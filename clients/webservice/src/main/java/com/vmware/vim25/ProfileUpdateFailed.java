/**
 * ProfileUpdateFailed.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ProfileUpdateFailed  extends com.vmware.vim25.VimFault  implements java.io.Serializable {
    private com.vmware.vim25.ProfileUpdateFailedUpdateFailure[] failure;

    public ProfileUpdateFailed() {
    }

    public ProfileUpdateFailed(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           com.vmware.vim25.LocalizedMethodFault faultCause,
           com.vmware.vim25.LocalizableMessage[] faultMessage,
           com.vmware.vim25.ProfileUpdateFailedUpdateFailure[] failure) {
        super(
            dynamicType,
            dynamicProperty,
            faultCause,
            faultMessage);
        this.failure = failure;
    }


    /**
     * Gets the failure value for this ProfileUpdateFailed.
     * 
     * @return failure
     */
    public com.vmware.vim25.ProfileUpdateFailedUpdateFailure[] getFailure() {
        return failure;
    }


    /**
     * Sets the failure value for this ProfileUpdateFailed.
     * 
     * @param failure
     */
    public void setFailure(com.vmware.vim25.ProfileUpdateFailedUpdateFailure[] failure) {
        this.failure = failure;
    }

    public com.vmware.vim25.ProfileUpdateFailedUpdateFailure getFailure(int i) {
        return this.failure[i];
    }

    public void setFailure(int i, com.vmware.vim25.ProfileUpdateFailedUpdateFailure _value) {
        this.failure[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProfileUpdateFailed)) return false;
        ProfileUpdateFailed other = (ProfileUpdateFailed) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.failure==null && other.getFailure()==null) || 
             (this.failure!=null &&
              java.util.Arrays.equals(this.failure, other.getFailure())));
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
        if (getFailure() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFailure());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFailure(), i);
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
        new org.apache.axis.description.TypeDesc(ProfileUpdateFailed.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ProfileUpdateFailed"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failure");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "failure"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ProfileUpdateFailedUpdateFailure"));
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
