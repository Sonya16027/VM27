package com.vmware.apputils.vim;

import java.net.*;
import java.io.*;

import com.vmware.vim.*;
import com.vmware.apputils.*;

/**
 * Connection Handler for WebService
 */
public class ServiceConnection{

   public static int ConnectionState_Connected = 0;
   public static int ConnectionState_Disconnected = 1;

   protected VimServiceLocator _locator;
   protected VimPortType _service;
   protected int _svcState;
   protected ServiceContent _sic;
   protected ManagedObjectReference _svcRef;

   public ServiceConnection(String svcRefVal) {
      _svcState = ConnectionState_Disconnected;

      _svcRef = new ManagedObjectReference();
      _svcRef.setType("ServiceInstance");
      _svcRef.set_value(svcRefVal);
   }
   
   public static com.vmware.apputils.vim.ServiceConnection CreateServiceConnection(String inst){
       return new com.vmware.apputils.vim.ServiceConnection(inst);
   }

   /**
    * Creates an instance of the VMA proxy and establishes a connection
    *
    * @param urlStr web service url 
    * @param username authorized user
    * @param password authorized password for user
    */
   public void connect(String urlStr, String username, String password, boolean ignoreCerts) throws Exception {
      if (_service != null) {
         disconnect();
      }
      
      if(ignoreCerts) {
         ignoreCert();
      }
      
      _locator = new VimServiceLocator();
      _locator.setMaintainSession(true);      
      _service = _locator.getVimPort(new URL(urlStr));
      _sic = _service.retrieveServiceContent(_svcRef);
      if (_sic.getSessionManager() != null) {      	 
         _service.login(_sic.getSessionManager(), username, password, null);
         // This Code Is To Save The Session In The Test File.         
      }
      _svcState = ConnectionState_Connected;            
   }
   
   public void ignoreCert() {
      System.setProperty("org.apache.axis.components.net.SecureSocketFactory",
                            "org.apache.axis.components.net.SunFakeTrustSocketFactory");
   } 
   
   
   public void saveSession(String fileName) throws Exception{
      String sessionString = getSessionString();
      writeData(sessionString,fileName);
   }
   
   private String getSessionString() throws Exception{      
      org.apache.axis.client.Stub st = (org.apache.axis.client.Stub)_service;
      org.apache.axis.client.Call callObj = st._getCall();
      org.apache.axis.MessageContext msgContext = callObj.getMessageContext();
      String sessionString = (String)msgContext.getProperty(
         org.apache.axis.transport.http.HTTPConstants.HEADER_COOKIE);
      return sessionString;
   }
   
   private void writeData(String sessionString,String fileName) throws Exception {
      FileOutputStream fos = new FileOutputStream(fileName);      
      BufferedOutputStream bos = new BufferedOutputStream(fos);  
      DataOutputStream dos = new DataOutputStream(bos);  
      dos.writeBytes(sessionString);
      dos.flush();
   }
   
   public void loadSession(String url, String fileName, boolean ignoreCerts) throws Exception {       
      if (_service != null){
         disconnect();
      }     
      
      if(ignoreCerts) {
         ignoreCert();
      }
      
      _locator = new VimServiceLocator();
      _locator.setMaintainSession(true);
      _service = _locator.getVimPort(new URL(url));   
      org.apache.axis.client.Stub st = (org.apache.axis.client.Stub)_service;
      String cookieString = readData(fileName);
      st._setProperty(org.apache.axis.transport.http.HTTPConstants.HEADER_COOKIE,
                      cookieString);                  
      _sic = _service.retrieveServiceContent(_svcRef);     
   }
   
   private String readData(String fileName) throws IOException, ClassNotFoundException { 
      FileInputStream in = new FileInputStream(fileName);       
      BufferedInputStream bis = new BufferedInputStream(in);  
      DataInputStream dis = new DataInputStream(bis);  
      String cookie = dis.readLine();
      return cookie;
   }   

   /**
    * Check if Connection is established or not.
    * 
    * @return true if connected, false otherwise
    */
   public boolean isConnected() {
      return _svcState == ConnectionState_Connected;
   }

   /**
    * @return Service instance
    */
   public VimPortType getService() {	  
      return _service;
   }
   
   /**
    * @return Service MO Reference
    */
   public ManagedObjectReference getServiceInstanceRef() {
      return _svcRef;
   }

   /**
    * @return Service instance content
    */
   public ServiceContent getServiceContent() {
      return _sic;
   }

   /**
    * @return Service property collector
    */
   public ManagedObjectReference getPropCol() {
      return _sic.getPropertyCollector();
   }

   /**
    * @return Root folder
    */
   public ManagedObjectReference getRootFolder() {
      return _sic.getRootFolder();
   }

   /**
    * @return Service instance
    */
   public int ServiceState() {
      return _svcState;
   }

   /**
    * Disconnects from the WebService
    */
   public void disconnect() throws Exception {
      if (_service != null) {
         _service.logout(_sic.getSessionManager());
         _service = null;
         _sic = null;
         _svcState = ConnectionState_Disconnected;
      }
   }

}

