/**
 * ProfileUpdateFailedUpdateFailure.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ProfileUpdateFailedUpdateFailure  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private com.vmware.vim25.ProfilePropertyPath profilePath;

    private com.vmware.vim25.LocalizableMessage errMsg;

    public ProfileUpdateFailedUpdateFailure() {
    }

    public ProfileUpdateFailedUpdateFailure(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           com.vmware.vim25.ProfilePropertyPath profilePath,
           com.vmware.vim25.LocalizableMessage errMsg) {
        super(
            dynamicType,
            dynamicProperty);
        this.profilePath = profilePath;
        this.errMsg = errMsg;
    }


    /**
     * Gets the profilePath value for this ProfileUpdateFailedUpdateFailure.
     * 
     * @return profilePath
     */
    public com.vmware.vim25.ProfilePropertyPath getProfilePath() {
        return profilePath;
    }


    /**
     * Sets the profilePath value for this ProfileUpdateFailedUpdateFailure.
     * 
     * @param profilePath
     */
    public void setProfilePath(com.vmware.vim25.ProfilePropertyPath profilePath) {
        this.profilePath = profilePath;
    }


    /**
     * Gets the errMsg value for this ProfileUpdateFailedUpdateFailure.
     * 
     * @return errMsg
     */
    public com.vmware.vim25.LocalizableMessage getErrMsg() {
        return errMsg;
    }


    /**
     * Sets the errMsg value for this ProfileUpdateFailedUpdateFailure.
     * 
     * @param errMsg
     */
    public void setErrMsg(com.vmware.vim25.LocalizableMessage errMsg) {
        this.errMsg = errMsg;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProfileUpdateFailedUpdateFailure)) return false;
        ProfileUpdateFailedUpdateFailure other = (ProfileUpdateFailedUpdateFailure) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.profilePath==null && other.getProfilePath()==null) || 
             (this.profilePath!=null &&
              this.profilePath.equals(other.getProfilePath()))) &&
            ((this.errMsg==null && other.getErrMsg()==null) || 
             (this.errMsg!=null &&
              this.errMsg.equals(other.getErrMsg())));
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
        if (getProfilePath() != null) {
            _hashCode += getProfilePath().hashCode();
        }
        if (getErrMsg() != null) {
            _hashCode += getErrMsg().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProfileUpdateFailedUpdateFailure.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ProfileUpdateFailedUpdateFailure"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profilePath");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "profilePath"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ProfilePropertyPath"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errMsg");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "errMsg"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "LocalizableMessage"));
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
