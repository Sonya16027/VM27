package com.vmware.apputils.vim;

import com.vmware.vim.*;
import com.vmware.apputils.*;
import com.vmware.apputils.vim.*;

import java.util.*;

public class VMUtils{
   public AppUtil cb = null;
   
   public VMUtils(AppUtil argCB){
     cb = argCB;
   }

   public ArrayList getVMs(String entity, String datacenter,String folder,String pool,String vmname,String host, String [][] filter)throws Exception{
      ManagedObjectReference dsMOR = null;
      ManagedObjectReference hostMOR = null;
      ManagedObjectReference poolMOR = null;
      ManagedObjectReference vmMOR = null;
      ManagedObjectReference folderMOR = null;
      ManagedObjectReference tempMOR = null;
      ManagedObjectReference folderMOR2 = null;
      ManagedObjectReference dcMORChk  = null;
      ArrayList vmList = new ArrayList();
       String [][] filterData = null;
       
      if(datacenter != null){
            dsMOR = cb.getServiceUtil().getDecendentMoRef(null,"Datacenter",datacenter);
            if(dsMOR == null){
               System.out.println("Datacenter Not found");
               return null;
            }
            else{
               tempMOR = dsMOR;
            }
      }
      if(folder != null){
            folderMOR = cb.getServiceUtil().getDecendentMoRef(tempMOR,"Folder",folder);
            if( folderMOR == null){
               folderMOR2 = cb.getServiceUtil().getDecendentMoRef(null,"Folder",folder);
               if(folderMOR2 == null) {
                 System.out.println("Folder Not found");
                 return null;
               }
               else {
               	if(datacenter != null) {
                   dcMORChk = cb.getServiceUtil().getDecendentMoRef(folderMOR2,"Datacenter",datacenter);
                   if(dcMORChk != null) {
                   	  tempMOR = folderMOR2;
                   }
                   else {
                     dcMORChk = cb.getServiceUtil().getDecendentMoRef(null,"Datacenter",datacenter);
                     if(dcMORChk != null) {
                        System.out.println("Datacenter is not under the folder "+folder);
                        return null;
                     }
                   }
                 }
               }
            }
            else{
               tempMOR = folderMOR;
            }
      }
      if(pool != null){
            poolMOR = cb.getServiceUtil().getDecendentMoRef(tempMOR,"ResourcePool",pool);
            if( poolMOR == null){
              System.out.println("Resource pool Not found");
               return null;
            }
            else{
               tempMOR = poolMOR;
            }
      }
      if(host != null){
            hostMOR = cb.getServiceUtil().getDecendentMoRef(tempMOR,"HostSystem",host);
            if( hostMOR == null){
               System.out.println("Host Not found");
               return null;
            }
            else{
               tempMOR = hostMOR;
            }
      }
      
      if(vmname != null){
         int i=0;
         filterData = new String[filter.length + 1][2];
         for (i=0;i<filter.length;i++) {
            filterData[i][0] = filter[i][0];
            filterData[i][1] = filter[i][1];
          }
          // Adding the vmname in the filter
          filterData[i][0] = "name";
          filterData[i][1] = vmname;
       }
       else if(vmname == null){
        int i=0;
         filterData = new String[filter.length + 1][2];
         for (i=0;i<filter.length;i++) {
            filterData[i][0] = filter[i][0];
            filterData[i][1] = filter[i][1];
          }
       }
       vmList = cb.getServiceUtil().getDecendentMoRefs(tempMOR,"VirtualMachine",filterData);
       if(( vmList == null)||(vmList.size() == 0)){
          System.out.println("NO Virtual Machine found");
          return null;
       }
      return vmList;
      
   }
      
   /**
    * This method returns the contents of the hostFolder property from the
    * supplied Datacenter MoRef
    * @param dcmor MoRef to the Datacenter
    * @return MoRef to a Folder returned by the hostFolder property or
    * null if dcmor is NOT a MoRef to a Datacenter or if the hostFolder 
    * doesn't exist
    * @throws Exception
    */
   public ManagedObjectReference getHostFolder(ManagedObjectReference dcmor) throws Exception {
      ManagedObjectReference hfmor = 
         cb.getServiceUtil().getMoRefProp(dcmor, "hostFolder");
      return hfmor;
   }
     /**
    * This method returns a MoRef to the HostSystem with the supplied name 
    * under the supplied Folder. If hostname is null, it returns the first
    * HostSystem found under the supplied Folder
    * @param hostFolderMor MoRef to the Folder to look in
    * @param hostname Name of the HostSystem you are looking for
    * @return MoRef to the HostSystem or null if not found
    * @throws Exception
    */
   public ManagedObjectReference getHost(ManagedObjectReference hostFolderMor, String hostname) throws Exception {
      ManagedObjectReference hostmor = null;

      if (hostname != null) {
         hostmor = 
            cb.getServiceUtil().getDecendentMoRef(hostFolderMor, "HostSystem", hostname);
      } else {
         hostmor = cb.getServiceUtil().getFirstDecendentMoRef(hostFolderMor, "HostSystem");
      }

      return hostmor;
   }

   public void browseMOR(ManagedObjectReference MOR){
      try {
         ObjectContent[] ocary = cb.getServiceUtil().getContentsRecursively(MOR, true);
         ObjectContent oc = null;
         ManagedObjectReference mor = null;
         DynamicProperty[] pcary = null;
         DynamicProperty pc = null;
         if(ocary != null) {
            for (int oci = 0; oci < ocary.length; oci++) {
              oc = ocary[oci];
              mor = oc.getObj();
              pcary = oc.getPropSet();
              if (pcary != null) {
                 for (int pci = 0; pci < pcary.length; pci++) {
                    pc = pcary[pci];
                    if(pc.getName().equalsIgnoreCase("name"))
                       System.out.println(pc.getVal().toString());   
                       
                 }
              }
           }
        }

      }
      catch (Exception e)
      {
          System.out.println("ClassCastException");
           e.printStackTrace();
      }
   }   
   
   public void browseArrayList(ArrayList arrList){
      try
      {
         
        Iterator iterator = arrList.iterator();
           while(iterator.hasNext()){
              ObjectContent[] ocary = cb.getServiceUtil().getContentsRecursively((ManagedObjectReference)iterator.next(), true);
               ObjectContent oc = null;
               ManagedObjectReference mor = null;
               DynamicProperty[] pcary = null;
               DynamicProperty pc = null;
               if(ocary != null) {
                  for (int oci = 0; oci < ocary.length; oci++) {
                    oc = ocary[oci];
                    mor = oc.getObj();
                    pcary = oc.getPropSet();
                    if (pcary != null) {
                       for (int pci = 0; pci < pcary.length; pci++) {
                          pc = pcary[pci];      
                          if(pc.getName().equalsIgnoreCase("name"))
                             System.out.println(pc.getVal());       
                       }
                    }
                 }
              }
          }
      }
      catch (Exception e){
         System.out.println(" Exceptions ");
         e.printStackTrace();
      }
   }
   
   public VirtualMachineConfigSpec createVmConfigSpec(String vmName, 
                                                      String datastoreName,
                                                      int diskSizeMB,
                                                      ManagedObjectReference computeResMor,
                                                      ManagedObjectReference hostMor) throws Exception {

      ConfigTarget configTarget = getConfigTargetForHost(computeResMor, hostMor);
      VirtualDevice[] defaultDevices = getDefaultDevices(computeResMor, hostMor);
      VirtualMachineConfigSpec configSpec = new VirtualMachineConfigSpec();
      String networkName = null;
      if(configTarget.getNetwork() != null) {
         for (int i = 0; i < configTarget.getNetwork().length; i++) {
            VirtualMachineNetworkInfo netInfo = configTarget.getNetwork(i);
            NetworkSummary netSummary = netInfo.getNetwork();
            if (netSummary.isAccessible()) {
               networkName = netSummary.getName();
               break;
            }
         }
      }
      ManagedObjectReference datastoreRef = null;
      if(datastoreName != null) {
      	 boolean flag = false;
         for (int i = 0; i < configTarget.getDatastore().length; i++) {
            VirtualMachineDatastoreInfo vdsInfo = configTarget.getDatastore(i);
            DatastoreSummary dsSummary = vdsInfo.getDatastore();         
            if (dsSummary.getName().equals(datastoreName)) {
               flag = true;
               if(dsSummary.isAccessible())	{
                  datastoreName = dsSummary.getName();
                  datastoreRef = dsSummary.getDatastore();
               }
               else {
                  throw new Exception("Specified Datastore is not accessible");
               }
               break;
            }
         }
         if(!flag) {
         	throw new Exception("Specified Datastore is not Found");
         }         
      }
      else {      	 
         boolean flag = false;
         for (int i = 0; i < configTarget.getDatastore().length; i++) {
            VirtualMachineDatastoreInfo vdsInfo = configTarget.getDatastore(i);
            DatastoreSummary dsSummary = vdsInfo.getDatastore();         
            if(dsSummary.isAccessible())	{
               datastoreName = dsSummary.getName();
               datastoreRef = dsSummary.getDatastore();
               flag = true;
               break;
            }            
         }
         if(!flag) {
            throw new Exception("No Datastore found on host");
         }
      }
      String datastoreVolume = getVolumeName(datastoreName);
      VirtualMachineFileInfo vmfi = new VirtualMachineFileInfo();
      vmfi.setVmPathName(datastoreVolume);
      configSpec.setFiles(vmfi);
      // Add a scsi controller
      int diskCtlrKey = 1;
      VirtualDeviceConfigSpec scsiCtrlSpec = new VirtualDeviceConfigSpec();
      scsiCtrlSpec.setOperation(VirtualDeviceConfigSpecOperation.add);
      VirtualLsiLogicController scsiCtrl = new VirtualLsiLogicController();
      scsiCtrl.setBusNumber(0);
      scsiCtrlSpec.setDevice(scsiCtrl);
      scsiCtrl.setKey(diskCtlrKey);
      scsiCtrl.setSharedBus(VirtualSCSISharing.physicalSharing);
      String ctlrType = scsiCtrl.getClass().getName();
      ctlrType = ctlrType.substring(ctlrType.lastIndexOf(".") + 1);

      // Find the IDE controller
      VirtualDevice ideCtlr = null;
      for (int di = 0; di < defaultDevices.length; di++) {
         if (defaultDevices[di] instanceof VirtualIDEController) {
            ideCtlr = defaultDevices[di];
            break;
         }
      }

      // Add a floppy
      VirtualDeviceConfigSpec floppySpec = new VirtualDeviceConfigSpec();
      floppySpec.setOperation(VirtualDeviceConfigSpecOperation.add);
      VirtualFloppy floppy =  new VirtualFloppy();
      VirtualFloppyDeviceBackingInfo flpBacking = new VirtualFloppyDeviceBackingInfo();
      flpBacking.setDeviceName("/dev/fd0");
      floppy.setBacking(flpBacking);
      floppy.setKey(3);
      floppySpec.setDevice(floppy);

      // Add a cdrom based on a physical device
      VirtualDeviceConfigSpec cdSpec = null;

      if (ideCtlr != null) {
         cdSpec = new VirtualDeviceConfigSpec();
         cdSpec.setOperation(VirtualDeviceConfigSpecOperation.add);
         VirtualCdrom cdrom =  new VirtualCdrom();
         VirtualCdromIsoBackingInfo cdDeviceBacking = new  VirtualCdromIsoBackingInfo();
         cdDeviceBacking.setDatastore(datastoreRef);
         cdDeviceBacking.setFileName(datastoreVolume + "testcd.iso");
         cdrom.setBacking(cdDeviceBacking);
         cdrom.setKey(20);
         cdrom.setControllerKey(new Integer(ideCtlr.getKey()));
         cdrom.setUnitNumber(new Integer(0));
         cdSpec.setDevice(cdrom);
      }

      // Create a new disk - file based - for the vm
      VirtualDeviceConfigSpec diskSpec = null;
   	  diskSpec = createVirtualDisk(datastoreName, diskCtlrKey, datastoreRef, diskSizeMB);

      // Add a NIC. the network Name must be set as the device name to create the NIC.
      VirtualDeviceConfigSpec nicSpec = new VirtualDeviceConfigSpec();
      if(networkName != null) {
         nicSpec.setOperation(VirtualDeviceConfigSpecOperation.add);
         VirtualEthernetCard nic =  new VirtualPCNet32();
         VirtualEthernetCardNetworkBackingInfo nicBacking = new VirtualEthernetCardNetworkBackingInfo();
         nicBacking.setDeviceName(networkName);
         nic.setAddressType("generated");
         nic.setBacking(nicBacking);
         nic.setKey(4);
         nicSpec.setDevice(nic);
      }

      VirtualDeviceConfigSpec[] deviceConfigSpec = null;
      if (ideCtlr != null) {
         deviceConfigSpec = new VirtualDeviceConfigSpec[5];

         deviceConfigSpec[3] = cdSpec;
         deviceConfigSpec[4] = nicSpec;
      } else {
         deviceConfigSpec = new VirtualDeviceConfigSpec[4];
         deviceConfigSpec[3] = nicSpec;
      }

      deviceConfigSpec[0] = scsiCtrlSpec;
      deviceConfigSpec[1] = floppySpec;
      deviceConfigSpec[2] = diskSpec;

      configSpec.setDeviceChange(deviceConfigSpec);
      return configSpec;
   }        
   /**
    * This method returns the ConfigTarget for a HostSystem
    * @param computeResMor A MoRef to the ComputeResource used by the HostSystem
    * @param hostMor A MoRef to the HostSystem
    * @return Instance of ConfigTarget for the supplied 
    * HostSystem/ComputeResource
    * @throws Exception When no ConfigTarget can be found
    */
   public ConfigTarget getConfigTargetForHost(ManagedObjectReference computeResMor, 
                                                               ManagedObjectReference hostMor) throws Exception {
      ManagedObjectReference envBrowseMor = 
         cb.getServiceUtil().getMoRefProp(computeResMor, "environmentBrowser");

      ConfigTarget configTarget = 
         cb.getConnection().getService().queryConfigTarget(envBrowseMor, hostMor);

      if (configTarget == null) {
         throw new Exception("No ConfigTarget found in ComputeResource");
      }

      return configTarget;
   }
   /** 
    * The method returns the default devices from the HostSystem
    * @param computeResMor A MoRef to the ComputeResource used by the HostSystem
    * @param hostMor A MoRef to the HostSystem
    * @return Array of VirtualDevice containing the default devices for 
    * the HostSystem
    * @throws Exception
    */
   public VirtualDevice[] getDefaultDevices(ManagedObjectReference computeResMor, 
                                            ManagedObjectReference hostMor) throws Exception {
      ManagedObjectReference envBrowseMor = 
         cb.getServiceUtil().getMoRefProp(computeResMor, "environmentBrowser");

      VirtualMachineConfigOption cfgOpt = 
         cb.getConnection().getService().queryConfigOption(envBrowseMor, null, hostMor);

      VirtualDevice[] defaultDevs = null;

      if (cfgOpt == null) {
         throw new Exception("No VirtualHardwareInfo found in ComputeResource");
      } else {
         defaultDevs = cfgOpt.getDefaultDevice();
         if (defaultDevs == null) {
            throw new Exception("No Datastore found in ComputeResource");
         }
      }

      return defaultDevs;
   }
   private String getVolumeName(String volName) {
      String volumeName = null;
      if (volName != null && volName.length() > 0) {
         volumeName = "[" + volName + "]";
      } else {
         volumeName = "[Local]";
      }

      return volumeName;
   }
   public VirtualDeviceConfigSpec createVirtualDisk(String volName, 
                                                    int diskCtlrKey, 
                                                    ManagedObjectReference datastoreRef,
                                                    int diskSizeMB) {
      String volumeName = getVolumeName(volName);
      VirtualDeviceConfigSpec diskSpec = new VirtualDeviceConfigSpec();
      
      diskSpec.setFileOperation(VirtualDeviceConfigSpecFileOperation.create);
      diskSpec.setOperation(VirtualDeviceConfigSpecOperation.add);
      
      VirtualDisk disk =  new VirtualDisk();
      VirtualDiskFlatVer2BackingInfo diskfileBacking = new VirtualDiskFlatVer2BackingInfo();
      
      diskfileBacking.setFileName(volumeName);
      diskfileBacking.setDiskMode("persistent");
      
      disk.setKey(new Integer(0));
      disk.setControllerKey(new Integer(diskCtlrKey));
      disk.setUnitNumber(new Integer(0));
      disk.setBacking(diskfileBacking);
      disk.setCapacityInKB(1024);      
      
      diskSpec.setDevice(disk);
      
      return diskSpec;
   }
}
