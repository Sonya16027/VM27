package com.vmware.samples.version.getvirtualdiskfiles;

import java.util.*;
import com.vmware.apputils.version.*;
import com.vmware.vim25.*;

public class GetVirtualDiskFilesV25 {
    public static void getVirtualDiskFiles(
       com.vmware.vim.ManagedObjectReference [] datastores
       ,ArrayList apiVersions
       ,String [] args,String cookieString) throws Exception {
       ExtendedAppUtil ecb = null;                  
       ecb = ExtendedAppUtil.initialize("GetVirtualDiskFiles"
                                        ,GetVirtualDiskFiles.constructOptions()
                                        ,args);
       ecb.connect(cookieString);       
       for(int k = 0; k < datastores.length; k++) {         
         ManagedObjectReference dsmor1 
            = VersionUtil.convertManagedObjectReference(datastores[k]);         
               
         ManagedObjectReference dsBrowser = (ManagedObjectReference)
            ecb.getServiceUtil3().getDynamicProperty(dsmor1,"browser");
         
         DatastoreSummary ds = (DatastoreSummary)
            ecb.getServiceUtil3().getDynamicProperty(dsmor1,"summary");
            
         String dsName = ds.getName();           
         System.out.println("\nSearching The Datastore " + dsName);
                       
         VmDiskFileQueryFilter vdiskFilter = 
            new VmDiskFileQueryFilter();                          
         
         System.out.println("Adding the controller type property in filter");  
         String [] type = {"VirtualBusLogicController"};
         vdiskFilter.setControllerType(type);
                   
         boolean flag = VersionUtil.isApiVersionSupported(apiVersions,"4.0"); 
         if(flag) {
            System.out.println("Adding the thin property in filter");
            vdiskFilter.setThin(true);
         }      
         
         VmDiskFileQuery fQuery = 
            new VmDiskFileQuery();
         fQuery.setFilter(vdiskFilter);

         HostDatastoreBrowserSearchSpec searchSpec = 
            new HostDatastoreBrowserSearchSpec();
         
         FileQuery [] arr = {fQuery};            
         searchSpec.setQuery(arr);
         //searchSpec.setMatchPattern(matchPattern);
         ManagedObjectReference taskmor = 
            ecb.getServiceConnection3().getService().searchDatastoreSubFolders_Task(
            dsBrowser,"["+dsName+"]",searchSpec);          
            
         String res = ecb.getServiceUtil3().waitForTask(taskmor);           
         TaskInfo tInfo 
            = (TaskInfo)ecb.getServiceUtil3().getDynamicProperty(
                    taskmor,"info");          
         
         ArrayOfHostDatastoreBrowserSearchResults searchResult = 
            (ArrayOfHostDatastoreBrowserSearchResults)
             tInfo.getResult();
            
         int len = searchResult.getHostDatastoreBrowserSearchResults().length;                        
         for(int j=0 ; j<len; j++) {
            HostDatastoreBrowserSearchResults sres 
               =  searchResult.getHostDatastoreBrowserSearchResults(j);
            FileInfo [] fileArray = sres.getFile();
            if(fileArray != null) {
               for(int z=0 ; z<fileArray.length; z++) {
                  System.out.println("Virtual Disks Files " 
                                     + fileArray[z].getPath());
               }
            }
            else {
               System.out.println("No Files Found");
            }
         }
      }
   }
}