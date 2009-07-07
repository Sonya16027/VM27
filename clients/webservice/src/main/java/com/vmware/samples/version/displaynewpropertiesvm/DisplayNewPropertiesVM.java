package com.vmware.samples.version.displaynewpropertiesvm;

import java.util.ArrayList;
import java.util.Calendar;
import com.vmware.apputils.*;
import com.vmware.apputils.version.*;
import com.vmware.vim.*;

/**
*<pre>
*This samples displays following properties of the virtual machine as per version 
*of ESX / vCenter Server.
*<ul><li>Virtual Machine Name</li></ul>
*<ul><li>Virtual Machine UUID</li></ul>
*<ul><li>Virtual Machine Last Modified</li></ul>
*<ul><li>Is Virtual Machine Template</li></ul>
*<ul><li>Virtual Machine Name</li></ul>
*<ul><li>Virtual Machine Gustest Id</li></ul>
*If server supports VI API 2.5, this sample displays
*<ul><li>bootOptionsSupported</ul>
*<ul><li>diskSharesSupported</ul>
*If server supports vsphere API 4.0, this sample displays
*<ul><li>bootOptionsSupported</ul>
*<ul><li>recordReplaySupported</ul>
*<ul><li>faultToleranceState</ul>
*<b>Parameters:</b>
*hostname      [required]:  Name of the virtual machine.
*
*<b>Command Line: To diaply the properties of the host machine</b>
*run.bat com.vmware.samples.version.displaynewproperties.DisplayNewProperties 
*--url [webserviceurl] --username [username] --password  [password] 
*--vmname [Name of the virtual machine]
*
*</pre>
*/


public class DisplayNewPropertiesVM {   
   private static AppUtil cb = null;
   private void displayVMProperties(String [] args) throws Exception {            
      String vmName = cb.get_option("vmname");               
      ManagedObjectReference vmmor  = cb.getServiceUtil().getDecendentMoRef(null,
                                                                           "VirtualMachine"
                                                                           ,vmName);
            
      if(vmmor != null) {      
         ArrayList apiVersions = VersionUtil.getSupportedVersions(
                                             cb.get_option("url"));
         
         System.out.println("\nVirtual Machine Properties \n");
         String name 
               = (String)cb.getServiceUtil().getDynamicProperty(vmmor,"name");          
         System.out.println("Virtual Machine Name :- " + name);            
         
         String uuid 
               = (String)cb.getServiceUtil().getDynamicProperty(vmmor,
                                                               "config.uuid");          
         System.out.println("Virtual Machine UUID :- " + uuid);            
         
         Calendar modified 
            = (Calendar)cb.getServiceUtil().getDynamicProperty(vmmor,
                                                              "config.modified");          
         System.out.println("Virtual Machine Last Modified :- " 
                            + modified.getTime());            
            
         Boolean template
            = (Boolean)cb.getServiceUtil().getDynamicProperty(vmmor,
                                                              "config.template");
         System.out.println("Is Virtual Machine Template :- " + template);               
             
         String guestId
            = (String)cb.getServiceUtil().getDynamicProperty(vmmor,
                                                             "config.guestId");
         System.out.println("Virtual Machine Guest ID :- " + guestId);        
         
         
         if(VersionUtil.isApiVersionSupported(apiVersions,"2.5")) {
            String cookieString = VersionUtil.getCookieString(cb);
            DisplayNewPropertiesVMV25.displayVMProperties(vmmor,apiVersions,args
                                                          ,cookieString);            
         }
         else {            
            // DO NOTHING   
         }     
      }      
      else {
         System.out.println("Virtual Machine Not Found");
      }      
   }  

   public static OptionSpec[] constructOptions() {
     OptionSpec [] useroptions = new OptionSpec[1];
     useroptions[0] = new OptionSpec("vmname","String",1
                                     ,"Name of the Virtial Machine"
                                     ,null);
     return useroptions;
   }
   public static void main(String[] args) throws Exception {  
      DisplayNewPropertiesVM obj = new DisplayNewPropertiesVM(); 
      cb = AppUtil.initialize("DisplayNewPropertiesVM"
                              ,DisplayNewPropertiesVM.constructOptions()
                             ,args);      
      
      cb.connect();
      obj.displayVMProperties(args);                      
      cb.disConnect();
   }
}