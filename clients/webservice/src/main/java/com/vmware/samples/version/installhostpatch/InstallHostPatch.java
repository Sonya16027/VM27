package com.vmware.samples.version.installhostpatch;

import java.util.*;
import java.net.*;
import java.io.*;
import javax.net.ssl.*;
import org.w3c.dom.*;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.*;
import javax.xml.xpath.*;

import com.vmware.apputils.*;
import com.vmware.apputils.version.*;
import com.vmware.vim.*;

/**
*<pre>
*This sample uses the Patch Manager MOR to upgrade the components in Embedded ESX.
*This Managed Object Reference is not available in VC 3.0.1 and ESX 3.0.1
*
*<b>Parameters:</b>
*operation        [required]:[query|install]
*bundle...........[optional]: Location of upgrade bundle
*targetdirectory..[optional]: Location of target directory to unpack the bundle
*<b>Command:</b>
*run.bat com.vmware.samples.version.installhostpatch.InstallHostPatch --url [webserviceurl] 
*--username [username] --password [password] --operation query 
*
*run.bat com.vmware.samples.version.installhostpatch.InstallHostPatch --url [webserviceurl] 
*--username [username] --password [password] --operation install --bundle <bundle directory>
*--targetdirectory <targetdirectory>
*</pre>
*/

public class InstallHostPatch {
   private final String BUNDLE_METADATA = "metadata.xml";
   private final String CONTENTS_METADATA = "contents.xml";
   private final String ESXHW_PRODUCTLINE_ID = "embeddedEsx";
   private final String PATCH_DIR = "rcli_patch";
   private static AppUtil cb = null;
   private ArrayList apiVersions;   

   private void operation(String [] args) throws Exception {
      String operation = cb.get_option("operation"); 
      apiVersions = VersionUtil.getSupportedVersions(
                                          cb.get_option("url"));      
      if(operation.equalsIgnoreCase("query")){
         queryHostComponents(args);
      }
      else if(operation.equalsIgnoreCase("install")) {
         installHostComponents(args);
      }
      else {
         System.out.println("Argument operation must be either query or install");
      }
   }

   private void queryHostComponents(String [] args) throws Exception{
      ManagedObjectReference sic = cb.getConnection().getServiceInstanceRef();
      ServiceContent sc = 
         (ServiceContent)cb.getServiceUtil().getDynamicProperty(sic,"content");
         
      String productLineId = sc.getAbout().getProductLineId();
      String version = sc.getAbout().getVersion();
      String localVersion = sc.getAbout().getLocaleVersion();
      String fullName = sc.getAbout().getFullName();
      
      System.out.println("Prodcut Line Id   " + productLineId);
      System.out.println("Version           " + version);
      System.out.println("Local Version     " + localVersion);
      System.out.println("Full Name         " + fullName);     
      if(VersionUtil.isApiVersionSupported(apiVersions,"2.5")) {
         String cookieString = VersionUtil.getCookieString(cb);
         if(!productLineId.equalsIgnoreCase(ESXHW_PRODUCTLINE_ID)) {
            System.out.println("This tool currently only supports patching of " 
                               + "ESX HW hosts.");
            System.exit(0);
         }         
         InstallHostPatchV25.queryHostComponents(sic,args,cookieString);         
      }
      else {
         System.out.println("Operation to query host about product components "
                            +"is not supported in earlier version than ESX 3.5");
      }      
   }

   private void installHostComponents(String [] args) throws Exception {
      if(VersionUtil.isApiVersionSupported(apiVersions,"2.5")) {
         String cookieString = VersionUtil.getCookieString(cb);
         InstallHostPatchV25.installHostComponents(args,cookieString);         
      }
      else {
         System.out.println("Operation to host upgrade "
                            +"is not supported in earlier version than ESX 3.5");
      }      
   }
   
   private boolean customValidation() throws Exception{
      boolean flag = true;
      String operation = cb.get_option("operation");      
      if(operation.equalsIgnoreCase("install")) {      	 
         if(!cb.option_is_set("bundle")) {
            flag = false;
            System.out.println("For install operation bundle"
                               +" is the Mandatory option");
            return flag;
         }
         if(!cb.option_is_set("targetDirectory")) {
            System.out.println("For install operation targetDirectory"
                               +" is the Mandatory option");
            flag = false;
            return flag;            
         }
      }
      return flag;
   }
   
   public static OptionSpec[] constructOptions() {
     OptionSpec [] useroptions = new OptionSpec[3];
     useroptions[0] = new OptionSpec("operation","String",1
                                     ,"Query host for installed packages or "
                                     +"Install update package from a given " 
                                     +"directory [query | install]"
                                     ,null);
     useroptions[1] = new OptionSpec("bundle","String",0
                                     ,"The zip bundle containing the update"
                                     ,null);
     useroptions[2] = new OptionSpec("targetDirectory","String",0
                                     ,"Target Directory to extract the zip bundle"
                                     ,null);          
     return useroptions;
   }
   
   public static void main(String [] args) throws Exception {
      InstallHostPatch obj = new InstallHostPatch(); 
      cb = AppUtil.initialize("InstallHostPatch"
                              ,InstallHostPatch.constructOptions()
                              ,args);      
      if(obj.customValidation()) {
         cb.connect();
         obj.operation(args);               
         cb.disConnect();
      }
   }
}
