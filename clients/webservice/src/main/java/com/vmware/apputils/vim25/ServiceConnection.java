package com.vmware.apputils.vim25;

import java.net.*;
import java.io.*;

import com.vmware.vim25.*;
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
   
   public static com.vmware.apputils.vim25.ServiceConnection CreateServiceConnection(String inst){
       return new com.vmware.apputils.vim25.ServiceConnection(inst);
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
   
   public void init(String urlStr,String cookieString) throws Exception {
      if (_service != null) {
         disconnect();
      }
      _locator = new VimServiceLocator();
      _locator.setMaintainSession(true);      
      _service = _locator.getVimPort(new URL(urlStr));
      _sic = _service.retrieveServiceContent(_svcRef);
      
              
      org.apache.axis.client.Stub st = (org.apache.axis.client.Stub)_service;        
      org.apache.axis.client.Call callObj = st._getCall();
      org.apache.axis.MessageContext msgContext = callObj.getMessageContext();       
      msgContext.setProperty(org.apache.axis.transport.http.HTTPConstants.HEADER_COOKIE,cookieString);               
      
      _svcState = ConnectionState_Connected;            
   }
   
   public void saveSession(String fileName) throws Exception{
      writeData(_sic.getSessionManager(),fileName);
   }
   
   private void writeData(ManagedObjectReference moref,String fileName) throws Exception {
      FileOutputStream fos = new FileOutputStream(fileName);
      ObjectOutputStream s = new ObjectOutputStream(fos);
      s.writeObject(moref);
      s.flush();
   }
   
   public void loadSession(String url, String cookieString) throws Exception {       
      if (_service != null){
         disconnect();
      }
      _locator = new VimServiceLocator();
      _locator.setMaintainSession(true);
      _service = _locator.getVimPort(new URL(url));   
      org.apache.axis.client.Stub st = (org.apache.axis.client.Stub)_service;
      st._setProperty(org.apache.axis.transport.http.HTTPConstants.HEADER_COOKIE,cookieString);
      _locator.setMaintainSession(true); 
      _sic = _service.retrieveServiceContent(_svcRef);

   }
   
   private ManagedObjectReference readData(String fileName) throws IOException, ClassNotFoundException { 
      FileInputStream in = new FileInputStream(fileName); 
      ObjectInputStream s = new ObjectInputStream(in); 
      ManagedObjectReference U2;
      U2 = (ManagedObjectReference) s.readObject(); 
      return U2;
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

