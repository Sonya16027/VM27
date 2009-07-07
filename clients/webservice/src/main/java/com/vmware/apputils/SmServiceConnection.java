package com.vmware.apputils;

import java.net.*;
import java.io.*;

import javax.xml.soap.SOAPElement;

import org.apache.axis.message.*; 
import org.apache.axis.client.*;

import com.vmware.vim.sms.*;

/**
 * Connection Handler for SMS WebService
 */
public class SmServiceConnection {

   public static int ConnectionState_Connected = 0;
   public static int ConnectionState_Disconnected = 1;

   protected SmServiceLocator _locator;
   protected SmPortType _service;
   protected int _svcState;

   public SmServiceConnection() {
      _svcState = ConnectionState_Disconnected;
   }
   
   public static SmServiceConnection CreateServiceConnection(){
       return new SmServiceConnection();
   }

   /**
    * Creates an instance of the VMA proxy and establishes a connection
    *
    * @param urlStr web service url 
    * @param cookie VC (HTTP) session cookie
    * @param ignoreCerts indicates whether peer certificate
    *                    should be validated
    */
   public void connect(String urlStr, String cookie, boolean ignoreCerts) throws Exception {
      if (_service != null) {
         disconnect();
      }
      
      if(ignoreCerts) {
         ignoreCert();
      }
      
      _locator = new SmServiceLocator();
      _locator.setMaintainSession(true);      
      _service = _locator.getsmPort(new URL(urlStr));

      addAuthHeader(cookie);

      _svcState = ConnectionState_Connected;            
   }

   private void addAuthHeader(String cookie) throws Exception {
      SOAPHeaderElement header = new SOAPHeaderElement("urn:sm1", "AuthHeader");
      SOAPElement node = header.addChildElement("vcSessionCookie");
      node.addTextNode(cookie);
      ((Stub) _service).setHeader(header);
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
      
      _locator = new SmServiceLocator();
      _locator.setMaintainSession(true);
      _service = _locator.getsmPort(new URL(url));   
      org.apache.axis.client.Stub st = (org.apache.axis.client.Stub)_service;
      String cookieString = readData(fileName);

      // TODO XXX: Use this when we support session cookies in the HTTP header
      //st._setProperty(org.apache.axis.transport.http.HTTPConstants.HEADER_COOKIE,
      //                cookieString);                  
      addAuthHeader(cookieString);
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
   public SmPortType getService() {	  
      return _service;
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
         _service = null;
         _svcState = ConnectionState_Disconnected;
      }
   }
}

