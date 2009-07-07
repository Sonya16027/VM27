package com.vmware.samples.general;

import com.vmware.vim.*;
import com.vmware.apputils.*;
import com.vmware.apputils.vim.*;
import java.util.*;
import java.io.*;

 /**
 *<pre>
 *This sample create managed entity like Host-Standalone Cluster
 *Datacenter, and folder.
 *
 *<b>To run this samples following parameters are used :</b>
 *
 *parentName [required]   : specifies the name of the parent folder  
 *itemType   [required]   : Type of the object to be added e.g "Host-Standalone","Cluster", "Datacenter", "Folder",
 *itemName   [required]   : Name of the item added.
 *
 *<b>Command:
 *
 *To create a folder named myFolder under root folder Root:</b>
 *run.bat com.vmware.samples.general.Create --url [webserviceurl]
 *--username [username] --password [password] --parentName [Root]
 *--itemType [Folder] --itemName [myFolder]
 *
 *<b>To create a datacenter named myDatacenter under root folder Root:</b>
 *run.bat com.vmware.samples.general.Create --url [webserviceurl]
 *--username [username] --password [password] --parentName [Root]
 *--itemType [Datacenter] --itemName [myDatacenter]
 *
 *<b>To create a cluster named myCluster under root folder Root:</b>
 *run.bat com.vmware.samples.general.Create --url [webserviceurl]
 *--username [username] --password [password] --parentName [Root]
 *--itemType [Cluster] --itemName [myCluster]
 *</pre>
 */

public class Create {  
   private static AppUtil cb = null;
   Log log = new Log();

   private String getParentName() throws Exception {
      return cb.get_option("parentName");
   }

   private String getItemType() throws Exception {
      return cb.get_option("itemType");
   }

   private String getItemName() throws Exception {
      return cb.get_option("itemName");
   }

   private String getparentType() throws Exception {
      return cb.get_option("parentType");
   }

   private static String getUserName() throws Exception {
      System.out.print("Enter the userName for the host: ");
      BufferedReader reader = new BufferedReader(new InputStreamReader(
            System.in));
      return (reader.readLine());
   }

   private static String getPassword() throws Exception {
      System.out.print("Enter the password for the host: ");
      BufferedReader reader = new BufferedReader(new InputStreamReader(
            System.in));
      return (reader.readLine());
   }

   private static Integer getPort() throws Exception {
      System.out.print("Enter the port for the host : "
            + "[Hit enter for default:] ");
      BufferedReader reader = new BufferedReader(new InputStreamReader(
         System.in));

      String portStr = reader.readLine();
      if ((portStr == null) || portStr.length() == 0)
         return new Integer(902);
      else
         return Integer.valueOf(portStr);
   }

   private void doCreate() throws Exception {
      try {
         String type = getItemType();
         String name = getItemName();

         ManagedObjectReference taskMoRef = null;

         ManagedObjectReference folderMoRef = cb.getServiceUtil()
               .getDecendentMoRef(null, "Folder", getParentName());

         if (folderMoRef == null) {
            System.out.println("Parent folder '" + getParentName()
                  + "' not found");
         } else {
            if (type.equals("Folder")) {
               cb.getConnection().getService().createFolder(folderMoRef,
                     name);
               System.out.println("Sucessfully created::" + name);
            } else if (type.equals("Datacenter")) {
               cb.getConnection().getService().createDatacenter(
                  folderMoRef, name);
            System.out.println("Sucessfully created::" + name);
            } else if (type.equals("Cluster")) {
               ClusterConfigSpec clusterSpec = new ClusterConfigSpec();
               cb.getConnection().getService().createCluster(folderMoRef,
                    name, clusterSpec);
               System.out.println("Sucessfully created::" + name);
            } else if (type.equals("Host-Standalone")) {
               HostConnectSpec hostSpec = new HostConnectSpec();
               hostSpec.setHostName(name);
               hostSpec.setUserName(getUserName());
               hostSpec.setPassword(getPassword());
               hostSpec.setPort(getPort());
               if (type.equals("Host-Standalone")) {
                  taskMoRef = cb.getConnection().getService()
                        .addStandaloneHost_Task(folderMoRef, hostSpec,
                              true);

                  if (taskMoRef != null) {
                     String status = cb.getServiceUtil().waitForTask(
                           taskMoRef);
                     if (status.equalsIgnoreCase("sucess")) {
                        System.out.println("Sucessfully created::"
                              + name);
                     } else {
                        System.out.println("Host'" + name
                           + " not created::");
                     }
                  }
               }
            } else {
               System.out.println("Unknown Type. Allowed types are:");
               System.out.println(" Host-Standalone");
               System.out.println(" Cluster");
               System.out.println(" Datacenter");
               System.out.println(" Folder");
            }
         }
      } catch (Exception e) {
         if (e instanceof org.apache.axis.AxisFault) {
            org.apache.axis.AxisFault fault = (org.apache.axis.AxisFault) e;
            org.w3c.dom.Element[] errors = fault.getFaultDetails();
            for (int i = 0; i < errors.length; i++) {
               if (errors[i].toString().indexOf("DuplicateName") != -1) {
                  System.out.println("Managed Entity with the name already exists");
               } else if (errors[i].toString().indexOf("InvalidArgument") != -1) {
                  System.out.println("Specification is invalid");
               } else if (errors[i].toString().indexOf("InvalidName") != -1) {
                  System.out
                        .println("Managed Entity Name is empty or too long");
               } else if (errors[i].toString().indexOf("RuntimeFault") != -1) {
                  System.out.println(errors[i].toString() + " "
                     + "Either parent name or item name is invalid");
               } else if (errors[i].toString().indexOf(
                     "NotSupportedFault: null") != -1) {
                  System.out
                        .println(errors[i].toString()
                              + " "
                              + "The Operation is not supported on this object");
               } else {
                        System.out.println(errors[i].toString() + " "
                        + "The Operation is not supported on this object");
               }
            }
         } else {
            throw e;
         }
      }
   }
   private static OptionSpec[] constructOptions() {
      OptionSpec [] useroptions = new OptionSpec[3];
      useroptions[0] = new OptionSpec("parentName","String",1
                                     ,"Specifies the name of the parent folder"
                                     ,null);
      useroptions[1] = new OptionSpec("itemType","String",1,
                                      "Host-Standalone|Cluster|Datacenter|Folder",
                                      null);
      useroptions[2] = new OptionSpec("itemName","String",1,
                                      "Name of the item being added: For Host " 
                                      + "please specify the name of the host machine.",
                                      null);
      return useroptions;
   }
   public static void main(String[] args) throws Exception {
      Create app = new Create();
      cb = AppUtil.initialize("Create", Create.constructOptions(), args);
      cb.connect();
      app.doCreate();
      cb.disConnect();
   }
}
