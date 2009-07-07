package com.vmware.samples.general;

import com.vmware.vim.*;
import com.vmware.apputils.*;
import com.vmware.apputils.vim.*;
import java.util.*;

/**
 *<pre>
 *This sample dipslays a list of tasks performed on some managed 
 *object. The sample display the tasks in the following format:
 * 
 *Operation:
 *Name:
 *Type:
 *State:
 *Error:
 *
 *If there is no task running when this sample is used, then it
 *displays a messsage.
 *
 *<b>Command:</b>
 *run.bat com.vmware.samples.general.TaskList --url [webserviceurl]
 *--username [username] --password [password]
 *</pre>
 */


public class TaskList {
   private static AppUtil cb = null;    
   private PropertyFilterSpec[] createPFSForRecentTasks(
      ManagedObjectReference taskManagerRef) {      
      PropertySpec pSpec = new PropertySpec();
      pSpec.setAll(Boolean.FALSE);
      pSpec.setType("Task");
      pSpec.setPathSet(
            new String[]
           {"info.entity",
            "info.entityName",
            "info.name",
            "info.state",
            "info.cancelled",
            "info.error"});
      
      ObjectSpec oSpec = new ObjectSpec();
      oSpec.setObj(taskManagerRef);
      oSpec.setSkip(Boolean.FALSE);
      
      TraversalSpec tSpec = new TraversalSpec();
      tSpec.setType("TaskManager");
      tSpec.setPath("recentTask");
      tSpec.setSkip(Boolean.FALSE);
            
      
      oSpec.setSelectSet(new SelectionSpec[]{tSpec});      
      
      PropertyFilterSpec pfSpec = new PropertyFilterSpec();      
      pfSpec.setPropSet(new PropertySpec[]{pSpec});      
      pfSpec.setObjectSet(new ObjectSpec[]{oSpec});
      
      return new PropertyFilterSpec[]{pfSpec};
   }
   
   private void displayTasks(ObjectContent[] oContents) {      
      for(int oci=0; oci<oContents.length; ++oci) {
         System.out.println("Task");
         DynamicProperty[] dps = oContents[oci].getPropSet();
         if(dps!=null) {
            String op="", name="", type="", state="", error="";
            for(int dpi=0; dpi<dps.length; ++dpi) {               
               DynamicProperty dp = dps[dpi];
               if("info.entity".equals(dp.getName())) {
                  type = ((ManagedObjectReference)dp.getVal()).getType();
               } else if ("info.entityName".equals(dp.getName())) {
                  name = ((String)dp.getVal());
               } else if ("info.name".equals(dp.getName())) {
                  op = ((String)dp.getVal());
               } else if ("info.state".equals(dp.getName())) {
                  TaskInfoState tis = (TaskInfoState)dp.getVal();
                  if(TaskInfoState.error.equals(tis)) {
                     state = "-Error";
                  } else if(TaskInfoState.queued.equals(tis)) {
                     state = "-Queued";
                  } else if(TaskInfoState.running.equals(tis)) {
                     state = "-Running";
                  } else if(TaskInfoState.success.equals(tis)) {
                     state = "-Success";
                  }
               } else if ("info.cancelled".equals(dp.getName())) {
                  Boolean b = (Boolean)dp.getVal();
                  if(b != null && b.booleanValue()) {
                     state += "-Cancelled";
                  }
               } else if ("info.error".equals(dp.getName())) {
                  LocalizedMethodFault mf = (LocalizedMethodFault)dp.getVal();
                  if(mf != null) {
                     error = mf.getLocalizedMessage();
                  }
               } else {
                  op = "Got unexpected property: "+dp.getName()
                      +" Value: "+dp.getVal().toString();
               }
            }
            System.out.println("Operation " + op);
            System.out.println("Name " + name);
            System.out.println("Type " + type);
            System.out.println("State " + state);
            System.out.println("Error " + error);
            System.out.println("======================");
         }
      }
      if(oContents.length == 0) {
         System.out.println("Currently no task running");
      }
   }
   public static void main(String [] args) throws Exception{
      TaskList obj = new TaskList();
      cb = AppUtil.initialize("TaskList",args);      
      cb.connect();      
      
      PropertyFilterSpec [] pfs;
      ManagedObjectReference taskManagerRef 
         = cb.getConnection().getServiceContent().getTaskManager(); 
      pfs = obj.createPFSForRecentTasks(taskManagerRef);

      ManagedObjectReference propColl = cb.getConnection().getPropCol();      
      ObjectContent[] oContents 
         = cb.getConnection().getService().retrieveProperties(propColl, pfs);
      if(oContents != null) {
         obj.displayTasks(oContents);         
      }
      else {
         System.out.println("Currently no task running");
      }      
      cb.disConnect();
   }     
}