package com.vmware.samples.version.getvirtualdiskfiles;

import java.util.Calendar;
import java.util.ArrayList;
import com.vmware.apputils.*;
import com.vmware.apputils.version.*;
import com.vmware.vim.*;

/**
*
*<pre>
*This sample searches the Virtual disk files in all the datastores available in
*specified host using new properties ControllerType and Thin Property.
*If server supports 2.5 API then it uses ControllerType property in filter
*If server supports 3.0 API then it uses both ControllerType and Thin property in the filter
*Otherwise no properties is specified in the filter.
*
*<b>Parameters:</b>
*hostname        [required]:Name of the host
*
*<b>Command:</b>
*run.bat com.vmware.samples.version.getvirtualdiskfiles.GetVirtualDiskFiles --url [webserviceurl] 
*--username [username] --password [password] --hostname [hostname]
*</pre>
*/

public class GetVirtualDiskFiles {
   private static AppUtil cb = null;   
   
   private void displayControllers(String [] args) throws Exception {     
      String hostName = cb.get_option("hostname");     
      
      ManagedObjectReference hostmor  = 
         cb.getServiceUtil().getDecendentMoRef(null,"HostSystem",hostName);
      
      if(hostmor == null) {
         System.out.println("No Host Found");
         return;
      }
      ManagedObjectReference [] datastores = (ManagedObjectReference [])
         cb.getServiceUtil().getDynamicProperty(hostmor,"datastore");
          
      ArrayList apiVersions = VersionUtil.getSupportedVersions(
                                         cb.get_option("url"));      
      if(VersionUtil.isApiVersionSupported(apiVersions,"2.5")) {
         String cookieString = VersionUtil.getCookieString(cb);
         GetVirtualDiskFilesV25.getVirtualDiskFiles(datastores,apiVersions,args,
                                                    cookieString);
      }      
      else {
         System.out.println("Searching The Datastores");
         for(int k = 0; k < datastores.length; k++) {                            
            ManagedObjectReference dsBrowser = (ManagedObjectReference)
                  cb.getServiceUtil().getDynamicProperty(datastores[k],"browser");
                  
            DatastoreSummary ds = (DatastoreSummary)
                  cb.getServiceUtil().getDynamicProperty(datastores[k],"summary");
                  
            String dsName = ds.getName();
            
            System.out.println("");
            System.out.println("Searching The Datastore " + dsName);
            
            HostDatastoreBrowserSearchSpec searchSpec = 
               new HostDatastoreBrowserSearchSpec();
               
            ManagedObjectReference taskmor = 
               cb.getConnection().getService().searchDatastoreSubFolders_Task(
               dsBrowser,"["+dsName+"]",searchSpec);
            
            String res = cb.getServiceUtil().waitForTask(taskmor);
            TaskInfo tInfo = (TaskInfo)
               cb.getServiceUtil().getDynamicProperty(taskmor,"info");
               
            ArrayOfHostDatastoreBrowserSearchResults searchResult = 
               (ArrayOfHostDatastoreBrowserSearchResults)tInfo.getResult();
                        
            int len = searchResult.getHostDatastoreBrowserSearchResults().length;                        
            for(int j=0 ; j<len; j++) {
               HostDatastoreBrowserSearchResults sres 
                  =  searchResult.getHostDatastoreBrowserSearchResults(j);
               FileInfo [] fileArray = sres.getFile();
               for(int z=0 ; z<fileArray.length; z++) {
                  System.out.println("Virtual Disks Files " + fileArray[z].getPath());
               }
            }
         }                  
      }               
   }        
   
   public static OptionSpec[] constructOptions() {
      OptionSpec [] useroptions = new OptionSpec[1];
      useroptions[0] = new OptionSpec("hostname","String",1
                                      ,"Name of the host"
                                      ,null);
      return useroptions;
    }
   
   public static void main(String args[]) throws Exception {
      GetVirtualDiskFiles obj = new GetVirtualDiskFiles();      
      cb = AppUtil.initialize("GetVirtualDiskFiles"
                              ,GetVirtualDiskFiles.constructOptions()
                              ,args);
      cb.connect();
      obj.displayControllers(args);
      cb.disConnect();        
   }
}