package com.vmware.samples.httpfileaccess;

import com.vmware.vim.*;
import com.vmware.apputils.*;
import com.vmware.apputils.vim.*;

import java.util.*;
import java.net.*;
import java.io.*;
import javax.net.ssl.*;

import org.w3c.dom.Document;
import org.w3c.dom.*;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;

/**
*<pre>
*This sample puts VM files in specified Datacenter and Datastore
*and register and reconfigure the particular VM.
*
*<b>Parameters:</b>
*
*vmname           [required]: Name of the virtual machine
*localpath        [required]: localpath to copy files
*datacentername   [required]: Name of the datacenter
*datastorename    [required]: Name of the datastore
*
*<b>Command: cold migration of the virtual machine from the local disk to the ESX host</b>
*run.bat com.vmware.samples.httpfileaccess.ColMigration --url [webserviceurl] 
* --username [username]--password [password] --vmname [vmname] --localpath[localpath]
* --datacentername [datacentername] --datastorename [datastorename]
*</pre>
*/

public class ColdMigration {
   private static AppUtil cb = null;   
   private ArrayList vdiskName = new ArrayList();
   
   private String getVmName() {      
      return cb.get_option("vmname");
   }    
   
   private String getLocalPath() {
      return cb.get_option("localpath");
   }   
   
   private String getDataCenter() {
      return cb.get_option("datacentername");
   }   
   
   private String getDataStore() {
      return cb.get_option("datastorename");
   }
   
   private void coldMigration() throws Exception {
      boolean validated = customValidation();
      if(validated) {
         String [] listOfDir = getDirFiles(getLocalPath());
         File temp = new File(getLocalPath());      
         if(listOfDir != null && listOfDir.length != 0) {
            // Dumping All The Data
            for(int i=0; i<listOfDir.length; i++) {
               copyDir(listOfDir[i]);
            }         
            // Register The Virtual Machine
            boolean regFlag = registerVirtualMachine();
            //Reconfig All The Stuff Back
            if(regFlag) {
               reconfigVirtualMachine();
            }
         }      
         else {
            System.out.println("There are no VM Directories"
                              +" available on Specified locations");
         }
      }
      else {
         // DO NOTHING
      }   
   }
   
   private void copyDir(String dirName) throws Exception {
      System.out.println("Copying The Virtual Machine To Host..........");
      dirName = getLocalPath() + "/" + dirName;
      String [] listOfFiles = getDirFiles(dirName);
      for(int i=0; i<listOfFiles.length; i++) {                  
         String remoteFilePath = "/"+getVmName()+"/"+listOfFiles[i];
         String localFilePath = dirName+"/"+listOfFiles[i];         
         if(localFilePath.indexOf("vdisk") != -1) {             
            String dataStoreName = dirName.substring(dirName.lastIndexOf("#")+1);
            remoteFilePath = "/"+getVmName()+"/"+dataStoreName+"/"+listOfFiles[i];
            if(localFilePath.indexOf("flat") == -1) {               
               vdiskName.add(dataStoreName+"/"+listOfFiles[i]);               
            }            
         }
         else {
            remoteFilePath = "/"+getVmName()+"/"+listOfFiles[i];            
         }
         putVMFiles(remoteFilePath,localFilePath);
      }
      System.out.println("Copying The Virtual Machine To Host..........Done");
   }
   
   private boolean registerVirtualMachine() throws Exception {     
      boolean registered = false;
      System.out.println("Registering The Virtual Machine ..........");
      ManagedObjectReference host = null;
      
      // Get The Data Center
      ManagedObjectReference dcmor 
         = cb.getServiceUtil().getDecendentMoRef(null, "Datacenter", getDataCenter());
      com.vmware.vim.ManagedObjectReference vmFolderMor 
         = (com.vmware.vim.ManagedObjectReference)
            cb.getServiceUtil().getDynamicProperty(dcmor,"vmFolder");
      
      // Default Host
      com.vmware.vim.ManagedObjectReference hostFolderMor 
         = (com.vmware.vim.ManagedObjectReference)
            cb.getServiceUtil().getDynamicProperty(dcmor,"hostFolder");
      ArrayList hostList = (ArrayList)cb.getServiceUtil().getDecendentMoRefs(
         hostFolderMor,"HostSystem");

      if(hostList.size() < 1) {
         System.out.println("No host found in datacenter to"
                           +" register the Virtual Machine");
         return registered;
      }
      else {
         boolean hostFound = false; 
         for(int i=0; i<hostList.size(); i++) {
            com.vmware.vim.ManagedObjectReference hostMor 
               = (com.vmware.vim.ManagedObjectReference)hostList.get(i);
            com.vmware.vim.ManagedObjectReference [] datastores 
               = (com.vmware.vim.ManagedObjectReference [])
                  cb.getServiceUtil().getDynamicProperty(hostMor,"datastore");

            long dirSize = getDirSize(getLocalPath());        
            for(int j=0; j<datastores.length; j++) {
               com.vmware.vim.DatastoreSummary datastoreSummary 
                  = (com.vmware.vim.DatastoreSummary)
                        cb.getServiceUtil().getDynamicProperty(datastores[j],"summary");

               if(datastoreSummary.getName().equalsIgnoreCase(getDataStore())) {
                  com.vmware.vim.DatastoreInfo datastoreInfo 
                     = (com.vmware.vim.DatastoreInfo)
                        cb.getServiceUtil().getDynamicProperty(datastores[j],"info");

                  if(datastoreInfo.getFreeSpace() > dirSize) {
                     host = hostMor;
                     hostFound = true;
                     i = hostList.size()+1;
                     j = datastores.length+1;
                  }
               }
            }
         }
         if(hostFound) {
            // Get The vmx path
            String vmxPath = "["+getDataStore()+"]"+getVmName()+"/"+getVmName()+".vmx";
            // Resource Pool
            ManagedObjectReference resourcePool 
               = cb.getServiceUtil().getFirstDecendentMoRef(null, "ResourcePool");
            // Registering The Virtual machine
            ManagedObjectReference taskmor 
               = cb.getConnection().getService().registerVM_Task(
                  vmFolderMor,vmxPath,getVmName(),false,resourcePool,host);

            String result = cb.getServiceUtil().waitForTask(taskmor);
            if (result.equalsIgnoreCase("Sucess")) {
               System.out.println("Registering The Virtual Machine ..........Done");
               registered = true;
            }
            else {
               System.out.println("Some Exception While Registering The VM");
               registered = false;
            }
            return registered;
         }
         else {
            System.out.println("No host in datacenter got the"
                              +" specified datastore and free space");
            return registered;
         }
      }
   }
   
   private void reconfigVirtualMachine() throws Exception {     
      System.out.println("ReConfigure The Virtual Machine ..........");
      com.vmware.vim.VirtualMachineFileInfo vmFileInfo 
         = new com.vmware.vim.VirtualMachineFileInfo();
      vmFileInfo.setLogDirectory("["+getDataStore()+"]"+getVmName());
      vmFileInfo.setSnapshotDirectory("["+getDataStore()+"]"+getVmName());
      vmFileInfo.setSuspendDirectory("["+getDataStore()+"]"+getVmName());
      vmFileInfo.setVmPathName("["+getDataStore()
                                  +"]"+getVmName()+"/"+getVmName()+".vmx");
      
      com.vmware.vim.VirtualMachineConfigSpec vmConfigSpec 
         = new com.vmware.vim.VirtualMachineConfigSpec();
      vmConfigSpec.setFiles(vmFileInfo);     
 
      ManagedObjectReference taskmor 
         = cb.getConnection().getService().reconfigVM_Task(
              getVmMor(getVmName()),vmConfigSpec);

      Object[] result = cb.getServiceUtil().waitForValues(
            taskmor, new String[] { "info.state", "info.error" }, 
            new String[] { "state" },                  
            new Object[][] { new Object[] { TaskInfoState.success, TaskInfoState.error }}
      );
      if (result[0].equals(TaskInfoState.success)) {
         System.out.println("ReConfigure The Virtual Machine .......... Done");
      }
      else {
         System.out.println("Some Exception While Reconfiguring The VM " + result[0]);
      }      
   }
   
   private String [] getDirFiles(String localDir) throws Exception {
      File temp = new File(localDir);      
      String [] listOfFiles = temp.list();
      if(listOfFiles != null) {
         return listOfFiles;
      }
      else {
         System.out.println("Local Path Doesn't Exist");
         return null;
      }
   }
   
   private long getDirSize(String localDir) throws Exception {
      File tempe = new File(localDir);      
      String [] fileList = tempe.list();
      long size = 0;       
      if(fileList.length != 0) {       
         for(int i=0; i<fileList.length; i++) {         
            File temp = new File(localDir+"/"+fileList[i]);
            if(temp.isDirectory()) {               
               size = size + getDirSize(temp.getCanonicalPath());
            }
            else {
               size = size + temp.length();
            }
         }
      }
      else {
         // DO NOTHING
      }
      return size;
   }
   
   private void putVMFiles(String remoteFilePath, String localFilePath) 
         throws Exception {
      String serviceUrl = cb.getServiceUrl();
      serviceUrl = serviceUrl.substring(0,serviceUrl.lastIndexOf("sdk")-1); 
      String httpUrl = serviceUrl+"/folder"+remoteFilePath+"?dcPath="
                                 +getDataCenter()+"&dsName="+getDataStore();
      httpUrl = httpUrl.replaceAll("\\ ","%20");                
      System.out.println("Putting VM File " + httpUrl);
      HttpURLConnection conn = getHTTPConnection(httpUrl);
      conn.setRequestProperty(
         org.apache.axis.transport.http.HTTPConstants.HEADER_CONTENT_LENGTH,"1024");
      long fileLen = new File(localFilePath).length();
      if(fileLen > 2147483647) {
         System.out.println("Files of size more than 2 GB are not supported");
         System.exit(0);
      }               
      conn.setFixedLengthStreamingMode((int)fileLen);
         
      OutputStream out = conn.getOutputStream();      
      FileInputStream in = new FileInputStream(new File(localFilePath));
      
      byte[] buf = new byte[1024];
      int len = 0;
      while ((len = in.read(buf)) > 0) {
         out.write(buf, 0, len);
      }  
      conn.getResponseMessage();
      conn.disconnect();
      out.close();
   }
   
   private String getCookie() throws Exception{
      com.vmware.vim.VimPortType test = cb.getConnection().getService();
      org.apache.axis.client.Stub st = (org.apache.axis.client.Stub)test;
      org.apache.axis.client.Call callObj = st._getCall();
      org.apache.axis.MessageContext msgContext = callObj.getMessageContext();
      String cookieString 
         = (String)msgContext.getProperty(
              org.apache.axis.transport.http.HTTPConstants.HEADER_COOKIE); 
      return cookieString;
   }
   
   private HttpURLConnection getHTTPConnection(String urlString) throws Exception {
      String cookieString = getCookie();
      trustAllHttpsCertificates();
      HostnameVerifier hv = new HostnameVerifier() {
         public boolean verify(String urlHostName, SSLSession session) {
            return true;
         }
      };     
        
      HttpsURLConnection.setDefaultHostnameVerifier(hv);
      URL url = new URL(urlString);               
      HttpURLConnection conn = (HttpURLConnection) url.openConnection();
      conn.setDoOutput(true);
      
      conn.setRequestProperty(
         org.apache.axis.transport.http.HTTPConstants.HEADER_COOKIE,
         cookieString);

      conn.setRequestProperty(
         org.apache.axis.transport.http.HTTPConstants.HEADER_CONTENT_TYPE,
         "application/octet-stream");

      conn.setRequestProperty(
         org.apache.axis.transport.http.HTTPConstants.HEADER_EXPECT,
         "100-continue");      
      conn.setRequestMethod("PUT");
      return conn;
   }
   
   private static void trustAllHttpsCertificates() throws Exception {    
       javax.net.ssl.TrustManager[] trustAllCerts = new javax.net.ssl.TrustManager[1]; 
       javax.net.ssl.TrustManager tm = new miTM(); 
       trustAllCerts[0] = tm; 
       javax.net.ssl.SSLContext sc = javax.net.ssl.SSLContext.getInstance("SSL"); 
       sc.init(null, trustAllCerts, null); 
       javax.net.ssl.HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory()); 
   }
   
   private ManagedObjectReference getVmMor(String vmName) throws Exception {
      ManagedObjectReference vmmor 
         = cb.getServiceUtil().getDecendentMoRef(null, "VirtualMachine", getVmName());
      return vmmor;
   }
   
   private boolean customValidation() throws Exception{
      boolean validate = false;
      String datacenterName = getDataCenter();
      String datastoreName = getDataStore();      
      if(datacenterName.length() != 0 && datacenterName != null
            && datastoreName.length() != 0 && datastoreName != null) {
         ManagedObjectReference dcmor 
            = cb.getServiceUtil().getDecendentMoRef(null, "Datacenter", getDataCenter());
         if(dcmor != null) {
            com.vmware.vim.ManagedObjectReference [] datastores 
               = (com.vmware.vim.ManagedObjectReference [])
                    cb.getServiceUtil().getDynamicProperty(dcmor,"datastore");
            if(datastores.length != 0) {
               for(int i=0; i<datastores.length; i++) {
                  com.vmware.vim.DatastoreSummary dsSummary 
                     = (com.vmware.vim.DatastoreSummary)
                          cb.getServiceUtil().getDynamicProperty(datastores[i],
                                                                "summary");
                  if(dsSummary.getName().equalsIgnoreCase(datastoreName)) {
                     i = datastores.length + 1;
                     validate = true;
                  }
               }
               if(!validate) {
                  System.out.println("Specified Datastore is not"
                                    +" found in specified Datacenter");
               }
               return validate;
            }
            else {
               System.out.println("No Datastore found in specified Datacenter");
               return validate;
            }
         }
         else {
            System.out.println("Specified Datacenter Not Found");
            return validate;
         }   
      }      
      return validate;
   }
   private static OptionSpec[] constructOptions() {
      OptionSpec [] useroptions = new OptionSpec[4];
      useroptions[0] = new OptionSpec("vmname","String",1
                                     ,"Name of the virtual machine"
                                     ,null);
      useroptions[1] = new OptionSpec("localpath","String",1,
                                      "Localpath to copy files",
                                      null);
      useroptions[2] = new OptionSpec("datacentername","String",1,
                                      "Name of the datacenter",
                                      null);
      useroptions[3] = new OptionSpec("datastorename","String",1,
                                      "Name of the datastore",
                                      null);
      return useroptions;
   }
   public static void main(String args []) throws Exception {      
      ColdMigration obj = new ColdMigration();            
      cb = AppUtil.initialize("ColdMigration"
                              ,ColdMigration.constructOptions()
                              ,args);      
      cb.connect();           
      obj.coldMigration();          
      cb.disConnect();
   }
   public static class miTM implements javax.net.ssl.TrustManager,
          javax.net.ssl.X509TrustManager {
      public java.security.cert.X509Certificate[] getAcceptedIssuers() {
         return null;
      } 
      public boolean isServerTrusted(
             java.security.cert.X509Certificate[] certs) {
         return true;
      }
      public boolean isClientTrusted(
             java.security.cert.X509Certificate[] certs) {
         return true;
      } 
      public void checkServerTrusted(
             java.security.cert.X509Certificate[] certs, String authType)
             throws java.security.cert.CertificateException {
         return;
      } 
      public void checkClientTrusted(
             java.security.cert.X509Certificate[] certs, String authType)
             throws java.security.cert.CertificateException {
         return;
      }
   }  
}
