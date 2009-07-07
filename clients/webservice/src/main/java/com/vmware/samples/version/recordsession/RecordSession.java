package com.vmware.samples.version.recordsession;

import java.util.ArrayList;
import com.vmware.apputils.*;
import com.vmware.apputils.version.*;
import com.vmware.vim.*;

/**
*<pre>
*This samples demostrates the new functionality for session recording.
*If server supports 3.0, then it will initate the recording session
*Otherwise, it only removes all the snapshots of the specified virtual machine.
*
*<b>Parameters:</b>
*vmname       [required]:  Name of the virtual machine.
*snapshotname [optional]:  Name of the snapshot generated due to recording session
*description  [optional]:  Description of the snapshot generated due to recording session
*
*<b>Command Line: To diaply the properties of the host machine</b>
*run.bat com.vmware.samples.version.displaynewproperties.DisplayNewProperties 
*--url [webserviceurl] --username [username] --password  [password] 
*--vmnname [Name of the virtual machine] --snapshotname [Snapshot name]
*--description [Description]
*
*</pre>
*/


public class RecordSession {   
   private static AppUtil cb = null;
   private void recordSession(String [] args) throws Exception {            
      String vmName = cb.get_option("vmname");               
      ManagedObjectReference vmmor  = cb.getServiceUtil().getDecendentMoRef(null,
                                                                            "VirtualMachine",
                                                                            vmName);
            
      if(vmmor != null) {      
         ArrayList apiVersions = VersionUtil.getSupportedVersions(
                                            cb.get_option("url"));         
         if(VersionUtil.isApiVersionSupported(apiVersions,"2.5")) {
            String cookieString = VersionUtil.getCookieString(cb);
            RecordSessionV25.recordSession(vmmor,apiVersions,args,cookieString);            
         }                                            
         else {
            VirtualMachineSnapshotTree [] tree = 
               (VirtualMachineSnapshotTree[])cb.getServiceUtil().getDynamicProperty(
                                                   vmmor,
                                                   "snapshot.rootSnapshotList");                                     
            if(tree !=null && tree.length != 0) {
               ManagedObjectReference taskMor = 
                  cb.getConnection().getService().removeAllSnapshots_Task(vmmor);
               String res = cb.getServiceUtil().waitForTask(taskMor);
               if(res.equalsIgnoreCase("sucess")) {
                  System.out.println("Removed all the snapshot successfully");
               }
            }
            else {
                System.out.println("No snapshot found for this virtual machine");
            }
         }     
      }      
      else {
         System.out.println("Virtual Machine Not Found");
      }      
   }  

   public static OptionSpec[] constructOptions() {
     OptionSpec [] useroptions = new OptionSpec[3];
     useroptions[0] = new OptionSpec("vmname","String",1
                                     ,"Name of the virtual machine"
                                     ,null);
     useroptions[1] = new OptionSpec("snapshotname","String",0
                                     ,"Name of the resulting snapshot"
                                     ,null);
     useroptions[2] = new OptionSpec("description","String",0
                                     ,"Description for the resulting snapshot"
                                     ,null);
     return useroptions;
   }
   public static void main(String[] args) throws Exception {  
      RecordSession obj = new RecordSession(); 
      cb = AppUtil.initialize("RecordSession"
                              ,RecordSession.constructOptions()
                              ,args);      
      
      cb.connect();
      obj.recordSession(args);                      
      cb.disConnect();
   }
}