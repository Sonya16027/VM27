package com.vmware.samples.host;

import com.vmware.vim.*;
import com.vmware.apputils.*;
import com.vmware.apputils.vim.*;
import com.vmware.apputils.vim.VMUtils;



/**
*<pre>This sample is used to add a Virtual Nic  
*
*<b>To run this samples following parameters are used:</b>
*
*vsiwtchid      [required]: Name of the switch 
*portgroupname  [required]: Name of the port group
*ipaddress      [required]: ipaddress for the nic
*host           [optional]: Name of the host
*datacenter     [optional]: Name of the datacenter
*
*<b>Command Line:To add a Host VirtualNic to a PortGroup on a Virtual Switch as: -</b>
*run.bat com.vmware.samples.host.AddVirtualNic --url [webserviceurl] --username [username] --password  [password] 
*--vsiwtchid [mySwitch] --host [hostname]  --datacenter [mydatacenter] --portgroupname [myportgroup] --ipaddress[AAA.AAA.AAA.AAA]
*
*<b>Command Line:To add a Host VirtualNic to a PortGroup on a Virtual Switch as 
*without specifying the host name</b>
*<br>run.bat com.vmware.samples.host.AddVirtualNic --url [webserviceurl] --username [username] --password  [password] 
*--vsiwtchid [mySwitch] --datacenter [mydatacenter] --portgroupname [myportgroup] --ipaddress[AAA.AAA.AAA.AAA]

*<b>Command Line:To add a Host VirtualNic to a PortGroup on a Virtual Switch as </b>
*without specifying the datacenter name
*<br>run.bat com.vmware.samples.host.AddVirtualNic --url [webserviceurl] --username [username] --password  [password] 
*--vsiwtchid [mySwitch] --portgroupname[myportgroup] --ipaddress[AAA.AAA.AAA.AAA]

</pre>

*/

public class AddVirtualNic {

   private static AppUtil cb = null;
   private static VMUtils vmUtils = null;   
   String datacenter = null;
   String host = null;
   String vswitchId = null;
   String portGroup = null;
   String ipAddr= null;

   private void validate() throws Exception {
      ManagedObjectReference sic = cb.getConnection().getServiceInstanceRef();
      ServiceContent serCont 
         = (ServiceContent)cb.getServiceUtil().getDynamicProperty(sic,"content");
      String apiType = serCont.getAbout().getApiType();
      datacenter = cb.get_option("datacenter");
      host = cb.get_option("host");
      portGroup = cb.get_option("portgroupname");
      vswitchId = cb.get_option("vswitchid");
      try {
         if(apiType.equalsIgnoreCase("HostAgent")){
            if(host!=null){
               System.out.println("Host should not be specified when running via Host");
               throw new ArgumentHandlingException("Host Specified");
            }
            if(datacenter ==null){
               System.out.println("Datacenter should be specified when running via Host");
               throw new ArgumentHandlingException("Host Specified");
            }
         }
         else if(apiType.equalsIgnoreCase("VirtualCenter")){
            if((datacenter == null) && (host ==null)){
               System.out.println("Atleast one from datacenter ");
               System.out.println("or host should be specified");
               throw new ArgumentHandlingException("Invalid Argument Specified");
            }
         }
      }
      catch(Exception e){
         throw e;
      }   
   }

   private HostVirtualNicSpec createVNicSpecification() {
      HostVirtualNicSpec vNicSpec = new HostVirtualNicSpec();
      HostIpConfig ipConfig = new HostIpConfig();
      ipConfig.setDhcp(false);
      ipAddr = cb.get_option("ipaddress");
      ipConfig.setIpAddress(ipAddr);
      ipConfig.setSubnetMask("255.255.255.0");      
      vNicSpec.setIp(ipConfig);
      return vNicSpec;
   }

   private void doAddVirtualNic() throws Exception {
      ManagedObjectReference dcmor ;
      ManagedObjectReference hostfoldermor ;
      ManagedObjectReference hostmor = null; 
      datacenter = cb.get_option("datacenter");
      host = cb.get_option("host");
      vswitchId = cb.get_option("vswitchid");
      portGroup = cb.get_option("portgroupname");
     
      try {
         if(((datacenter !=null) && (host !=null)) 
               || ((datacenter !=null) && (host ==null))) {
            dcmor 
               = cb.getServiceUtil().getDecendentMoRef(null, "Datacenter", datacenter);
            if(dcmor == null) {
               System.out.println("Datacenter not found");
               return;
            }
            hostfoldermor = vmUtils.getHostFolder(dcmor);
            hostmor = vmUtils.getHost(hostfoldermor, host);
         }
         else if ((datacenter ==null) && (host !=null)) {
            hostmor = vmUtils.getHost(null, host); 
         }
         if(hostmor != null) {
            Object cmobj 
               = cb.getServiceUtil().getDynamicProperty(hostmor, "configManager");
            HostConfigManager configMgr = (HostConfigManager)cmobj;
            ManagedObjectReference nwSystem = configMgr.getNetworkSystem();
   
            HostPortGroupSpec portgrp = new HostPortGroupSpec();
            portgrp.setName(portGroup);
   
            HostVirtualNicSpec vNicSpec = createVNicSpecification();
            cb.getConnection().getService().addVirtualNic(nwSystem, portGroup, vNicSpec);
            
            System.out.println(cb.getAppName() + " : Successful creating nic : " 
                               + portGroup);
         }
         else {
            System.out.println("Host not found");
         }      
      }
      catch (InvalidArgument e) {
         System.out.println(cb.getAppName() + " : Failed : IP address or subnet " 
                            + "mask in the IP configuration are invalid ");
      }
      catch (AlreadyExists e) {
         System.out.println(cb.getAppName() + " : Failed : The specific key,name "
                            +"or identifier already exists ");
      }
      catch (HostConfigFault e) {
         System.out.println(cb.getAppName() + " : Failed : Configuration failures. ");
      }
      catch (NotFound e) {
         System.out.println(cb.getAppName() + " : Failed : switch not found ");
      } 
      catch (Exception e) {
         System.out.println(cb.getAppName() + " : Failed creating nic: "+ portGroup);
         throw e;
      }
   }
   
   private static OptionSpec[] constructOptions() {
      OptionSpec [] useroptions = new OptionSpec[5];
      useroptions[0] = new OptionSpec("vswitchid","String",1
                                     ,"Name of the switch"
                                     ,null);
      useroptions[1] = new OptionSpec("host","String",0,
                                      "Name of the host",
                                      null);
      useroptions[2] = new OptionSpec("portgroupname","String",1
                                      ,"Name of the portgroup"
                                      ,null);
      useroptions[3] = new OptionSpec("ipaddress","String",1,
                                      "Ipaddress of the nic",
                                      null);
      useroptions[4] = new OptionSpec("datacenter","String",0,
                                      "Name of the datacenter",
                                      null);
      return useroptions;
   }

   public static void main(String[] args) throws Exception {
      AddVirtualNic app = new AddVirtualNic();
      cb = AppUtil.initialize("AddVirtualNic",
                              AddVirtualNic.constructOptions(),
                              args);
      cb.connect();
      vmUtils = new VMUtils(cb);
      app.validate();
      app.doAddVirtualNic();
      cb.disConnect();
   }
}

