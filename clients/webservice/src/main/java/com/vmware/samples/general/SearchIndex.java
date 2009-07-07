package com.vmware.samples.general;

import java.net.*;
import java.rmi.RemoteException;
import java.util.*;
import java.io.*;
import com.vmware.vim.*;
import com.vmware.apputils.*;

/**
*<pre>
* This sample excercise the SearchIndex API
*
* <b>To run this samples following parameters are used :</b>
*
*dcName        [required]   : name of the datacenter.
*vmDnsName     [optional]   : Dns of a virtual machine
*hostDnsName   [optional]   : Dns of the host machine
*vmPath        [optional]   : Inventory path of a virtual machine
*vmIP          [optional]   : IP Address of a virtual machine.
*
*<b> Command:
*
*Run the search index giving the valid dcName myDatacenter </b>
*run.bat com.vmware.samples.general.SearchIndex --url [webserviceurl]
*--username [username] --password [password] --dcName [myDatacenter]
*
*<b>Run the search index giving the valid dcName myDatacenter and vmpath
*to virtual machine named Test </b>
*run.bat com.vmware.samples.general.SearchIndex --url [webserviceurl]
*--username [username] --password [password] --dcName [myDatacenter] 
*--vmpath ["/DatacenterName/vm/Test"]
* 
*<b>Run the search index giving the valid dcName myDatacenter and hostdns
*name as 'abc.bcd.com' </b>
*run.bat com.vmware.samples.general.SearchIndex --url [webserviceurl]
*--username [username] --password [password] --dcName [myDatacenter] 
*--hostDns [abc.bcd.com]
*
*
*<b>Run the search index giving the valid dcName myDatacenter and ip of the
*vm as 111.123.155.21 </b>
*
*run.bat com.vmware.samples.general.SearchIndex --url [webserviceurl]
*--username [username] --password [password] --dcName [myDatacenter] 
*--vmIP [111.123.155.21]
*</pre> 
*/

public class SearchIndex {
    static VimPortType service;   // All Methods
    static ServiceContent content;    
    private static AppUtil cb = null;   
    Log log = new Log();
    public SearchIndex() {
    }
    private static OptionSpec[] constructOptions() {
      OptionSpec [] useroptions = new OptionSpec[5];
      useroptions[0] = new OptionSpec("dcName","String",1
                                     ,"Name of the Datacenter"
                                     ,null);
      useroptions[1] = new OptionSpec("vmDnsName","String",0,
                                      "Virtual machine dns name",
                                      null);
      useroptions[2] = new OptionSpec("hostDnsName","String",0
                                      ,"Host machine DNS name"
                                      ,null);
      useroptions[3] = new OptionSpec("vmPath","String",0,
                                      "VM path",
                                      null);
      useroptions[4] = new OptionSpec("vmIP","String",0
                                      ,"VM IP Address"
                                      ,null);
      return useroptions;
    } 
    /** Excercise the SearchIndex API
     * 
     * @param args Usage is:
     *  <url> <user> <password> <Datacenter Name> <A VM DNS Name>
     *  <A Host DNS Name> <A VM Inventory Path> 
     */
    public static void main(String[] args) throws Exception{
        
       try {
          SearchIndex app = new SearchIndex();
            cb = AppUtil.initialize("SearchIndex"
                                    ,SearchIndex.constructOptions()
                                    ,args);
            cb.connect();
            String dcName = cb.get_option("dcName");
            String vmDnsName = cb.get_option("vmDnsName");
            String hostDnsName =cb.get_option("hostDnsName");
            String vmPath = cb.get_option("vmPath");
            String vmIP = cb.get_option("vmIP");
            com.vmware.apputils.vim.ServiceConnection  S1 = cb.getConnection();
            content = S1.getServiceContent();
            service = S1.getService();
            // Find the Datacenter by using findChild()
            ManagedObjectReference dcMoRef = 
            cb.getServiceUtil().getDecendentMoRef(null, "Datacenter", dcName);
            if (dcMoRef !=null){
                    System.out.println("Found Datacenter with name: "
                                       +dcName+", MoRef: " + 
                    dcMoRef.get_value());
            }else{
                   System.out.println("Datacenter not Found with name: "+dcName);
            }
            if (vmDnsName != null){
                ManagedObjectReference vmMoRef = 
                service.findByDnsName(content.getSearchIndex(),
                                      dcMoRef,
                                      vmDnsName,
                                      true);
               if (vmMoRef !=null){
                 System.out.println("Found VirtualMachine with DNS name: "+
                      vmDnsName+", MoRef: " + vmMoRef.get_value());
               }
               else{
                 System.out.println("VirtualMachine not Found with DNS name: "
                                  + vmDnsName);
               }
            }
            if (vmPath != null){
              ManagedObjectReference   vmMoRef = service.findByInventoryPath(
                    content.getSearchIndex(), vmPath);
               if (vmMoRef !=null) {
                  System.out.println("Found VirtualMachine with Path: "+
                      vmPath+", MoRef: " + vmMoRef.get_value());
            
               }
               else{
                      System.out.println("VirtualMachine not found with vmPath "+
                      "address: "+ vmPath);
                }
             }
             if (vmIP != null){
                ManagedObjectReference vmMoRef =
                service.findByIp(content.getSearchIndex(),
                                 dcMoRef,
                                 vmIP,
                                 true);
              if (vmMoRef !=null){
                    System.out.println("Found VirtualMachine with IP "+
                    "address "+ vmIP + ", MoRef: " + vmMoRef.get_value());
              }else{
                   System.out.println("VirtualMachine not found with IP "+
                   "address: "+vmIP);
               }
            }
            if (hostDnsName != null) {
               ManagedObjectReference hostMoRef =
                service.findByDnsName(content.getSearchIndex(),
                        null,
                        hostDnsName,
                        false);
               if (hostMoRef !=null) {
                  System.out.println("Found HostSystem with DNS name "+
                  hostDnsName+", MoRef: " + hostMoRef.get_value());
               }
               else{
                  System.out.println("HostSystem not Found with DNS name:"+
                  hostDnsName);
               }
            }
          cb.disConnect();
       } 
       catch(Exception e) {
          if(e instanceof org.apache.axis.AxisFault) {
             org.apache.axis.AxisFault fault = (org.apache.axis.AxisFault)e;
             org.w3c.dom.Element [] errors = fault.getFaultDetails();
             for(int i=0; i<errors.length; i++) {
                if(errors[i].toString().indexOf("DuplicateName") != -1) {
                   System.out.println("Alarm with the name already exists");
                }
                else if(errors[i].toString().indexOf("InvalidArgument") != -1) {
                   System.out.println("Specification is invalid");
                }
                else if(errors[i].toString().indexOf("InvalidName") != -1) {
                   System.out.println("Alarm name is empty or too long");
                }
                else if(errors[i].toString().indexOf("RuntimeFault") != -1) {
                   System.out.println(errors[i].toString());
                }
                else {
                   System.out.println(errors[i].toString());
                }
             }
          }
          else {
             throw e;
          }
       }
    }
}
