package com.vmware.samples.version.displaynewpropertieshost;

import java.util.ArrayList;
import com.vmware.apputils.*;
import com.vmware.apputils.version.*;
import com.vmware.vim.*;

/**
*<pre>
*This sample displays properties of the host based on the API version supported by
*ESX or vCenter Server.
*<ul><li>Host Name</li></ul>
*If server supports VI API 2.5, this sample displays
*<ul><li>Boot Time</ul>
*<ul><li>Power State</ul>
*<ul><li>Time Zone</ul>
*If server supports vSphere API 4.0, this sample also displays
*<ul><li>IPMI Supported</ul>
*<ul><li>TPM Supported</ul>
*<b>Parameters:</b>
*hostname      [required]:  Name of the host.
*
*<b>Command Line: To display the properties of the host machine</b>
*run.bat com.vmware.samples.version.displaynewpropertieshost.DisplayNewPropertiesHost 
*--url [webserviceurl] --username [username] --password  [password] 
*--hostname [Name of the host]
*
*</pre>
*/


public class DisplayNewPropertiesHost {   
   private static AppUtil cb = null;
   private void displayProperties(String [] args) throws Exception {            
      String hostName = cb.get_option("hostname");               
      ManagedObjectReference hmor  = cb.getServiceUtil().getDecendentMoRef(null,
                                                                           "HostSystem",
                                                                           hostName);
            
      if(hmor != null) {
         ArrayList apiVersions = VersionUtil.getSupportedVersions(
                                              cb.get_option("url"));              
         String serverName 
               = (String)cb.getServiceUtil().getDynamicProperty(hmor,"name");          
         System.out.println("Server Name :- " + serverName);                              
         
         if(VersionUtil.isApiVersionSupported(apiVersions,"2.5")) {
            String cookieString = VersionUtil.getCookieString(cb);
            DisplayNewPropertiesHostV25.displayNewProperties(hmor,apiVersions,
                                                             args,cookieString);            
         }
         else {
             // Do Nothing  
         }       
         
      }      
      else {
         System.out.println("Host Not Found");
      }      
   }  

   public static OptionSpec[] constructOptions() {
     OptionSpec [] useroptions = new OptionSpec[1];
     useroptions[0] = new OptionSpec("hostname","String",1
                                     ,"Name of the host"
                                     ,null);
     return useroptions;
   }
   public static void main(String[] args) throws Exception {  
      DisplayNewPropertiesHost obj = new DisplayNewPropertiesHost(); 
      cb = AppUtil.initialize("DisplayNewPropertiesHost"
                              ,DisplayNewPropertiesHost.constructOptions()
                              ,args);      
      
      cb.connect();
      obj.displayProperties(args);                      
      cb.disConnect();
   }
}