/**
 * SmService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim.sms;

public interface SmService extends javax.xml.rpc.Service {
    public java.lang.String getsmPortAddress();

    public com.vmware.vim.sms.SmPortType getsmPort() throws javax.xml.rpc.ServiceException;

    public com.vmware.vim.sms.SmPortType getsmPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
