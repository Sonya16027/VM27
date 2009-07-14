/**
 * VimService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public interface VimService extends javax.xml.rpc.Service {
	public java.lang.String getVimPortAddress();

	public com.vmware.vim.VimPortType getVimPort()
			throws javax.xml.rpc.ServiceException;

	public com.vmware.vim.VimPortType getVimPort(java.net.URL portAddress)
			throws javax.xml.rpc.ServiceException;
}
