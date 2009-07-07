package com.vmware.samples.scsilun;

import com.vmware.vim.*;
import com.vmware.apputils.*;


/**
*<Pre>This sample displays the CanonicalName,Vendor,Model,Data,Namespace and NamespaceId of the host
*SCSI LUN name. 
*
*<b>Parameters:</b>
*hostname        [required]:  Name of the host
*<b>Command: displays the CanonicalName,Vendor,Model,Data,Namespace and 
NamespaceId of the host  SCSI LUN name.</b>

*run.bat com.vmware.samples.scsilun.SCSILunName --url [webserviceurl] 
*--username [username] --password [password] --hostname [hostname]
*</pre>
*/


public class SCSILunName {
   private static AppUtil cb = null;   
   
   private void displayScsiLuns() throws Exception{      
      String hostname = cb.get_option("hostname");
      ManagedObjectReference hmor  = 
            cb.getServiceUtil().getDecendentMoRef(null,"HostSystem",hostname);
      if(hmor != null) {
         DynamicProperty[]  scsiArry = 
            getDynamicProarray(hmor,"config.storageDevice.scsiLun");
         ArrayOfScsiLun scsiLUNarr = ((ArrayOfScsiLun)(scsiArry[0]).getVal());
         ScsiLun scsiLun[] = scsiLUNarr.getScsiLun();
         try{
            if (scsiLun != null && scsiLun.length > 0) {
               for (int j=0;j < scsiLun.length;j++ ){
                  System.out.println("\nSCSI LUN " + (j+1));
                  System.out.println("--------------");
                  String canName = scsiLun[j].getCanonicalName();
                  String vendor = scsiLun[j].getVendor();
                  String model = scsiLun[j].getModel();
                  if(scsiLun[j].getDurableName() != null) {
                    ScsiLunDurableName scsiLunDurableName = scsiLun[j].getDurableName();
                    byte data[] = scsiLunDurableName.getData();
                    String namespace = scsiLunDurableName.getNamespace();
                    byte namespaceId = scsiLunDurableName.getNamespaceId();
                    System.out.print("\nData            : ");
                     for (int i = 0;i < data.length ; i++ ){
                       System.out.print(data[i] + " ");
                     }
	                  System.out.println("\nCanonical Name  : " + canName);
	                  System.out.println("Namespace       : " + namespace);
	                  System.out.println("Namespace ID    : " + namespaceId);
	                  System.out.println("\nVMFS Affected ");
	                  getVMFS(hmor,canName);
	                  System.out.println("Virtual Machines ");
	                  getVMs(hmor,canName);
	              }
	              else {
	              	 System.out.println("\nDurable name for " + scsiLun[j].getCanonicalName() + " does not exist");
	              }
                  
               }
            }
         }
         catch(Exception e) {
            System.out.println("error" + e);
            e.printStackTrace();
         }
      }
      else {
         System.out.println("Host "+ cb.get_option("hostname")+" not found");
      }
   }
   
    /*
   * This subroutine prints the virtual machine file
   * system volumes affected by the given SCSI LUN.
   * @param  hmor      A HostSystem object of the given host.
   * @param canName    Canonical name of the SCSI logical unit
   */

   private void getVMFS(ManagedObjectReference hmor,String canName) throws Exception{
      DynamicProperty[]  dsArr = getDynamicProarray(hmor,"datastore");
      ArrayOfManagedObjectReference ds = 
               ((ArrayOfManagedObjectReference)(dsArr[0]).getVal());
      ManagedObjectReference dataStoresMOR[] = ds.getManagedObjectReference();
      boolean vmfsFlag = false;
      try {
         for (int j=0;j<dataStoresMOR.length ; j++ ) {
            DynamicProperty[]  infoArr = getDynamicProarray(dataStoresMOR[j],"info");
            String infoClass = infoArr[0].getVal().getClass().toString();
            if(infoClass.equals("class com.vmware.vim.VmfsDatastoreInfo")){
               VmfsDatastoreInfo vds = (VmfsDatastoreInfo)(infoArr[0]).getVal();
               HostVmfsVolume hvms = vds.getVmfs();
               String vmfsName  = vds.getName();
               HostScsiDiskPartition hdp[] = hvms.getExtent();
               for (int k =0;k< hdp.length ; k++ )  {
                  if(hdp[k].getDiskName().equals(canName)){
                     vmfsFlag = true;
                     System.out.println(" " + vmfsName + "\n");
                  }
               }
            }
         }
         if (!vmfsFlag) {
            System.out.println(" None\n");
         }
      }
      catch(Exception e) {
         System.out.println("error" + e);
         e.printStackTrace();
      }
   }

   /*
    *This subroutine prints the virtual machine
    *affected by the given SCSI LUN.
    *@param  hmor      ManagedObjectReference of the host
    *@param  canName   Canonical name of the SCSI logical unit
    */

   private void getVMs(ManagedObjectReference hmor,String canName) throws Exception {
      DynamicProperty[]  dsArr = getDynamicProarray(hmor,"datastore");
      ArrayOfManagedObjectReference ds = 
               ((ArrayOfManagedObjectReference)(dsArr[0]).getVal()); 
      ManagedObjectReference dataStoresMOR[] = ds.getManagedObjectReference();   
      boolean vmfsFlag = false;
      try{
         for (int j=0;j<dataStoresMOR.length ; j++ ) {
            DynamicProperty[]  infoArr = getDynamicProarray(dataStoresMOR[j],"info");
            String infoClass = infoArr[0].getVal().getClass().toString();
            if(infoClass.equals("class com.vmware.vim.VmfsDatastoreInfo")){
               VmfsDatastoreInfo vds = (VmfsDatastoreInfo)(infoArr[0]).getVal(); 
               HostVmfsVolume hvms = vds.getVmfs();
               String vmfsName  = vds.getName();
               HostScsiDiskPartition hdp[] = hvms.getExtent();
               for (int k =0;k< hdp.length ; k++ ) {
                  if(hdp[k].getDiskName().equals(canName)){
                     DynamicProperty[]  vmArr 
                        = getDynamicProarray(dataStoresMOR[j],"vm");
                     ArrayOfManagedObjectReference vms = 
                              ((ArrayOfManagedObjectReference)(vmArr[0]).getVal());
                     ManagedObjectReference vmsMOR[] = 
                               vms.getManagedObjectReference();
                    
                     if(vmsMOR != null){
                        for (int l=0;l<vmsMOR.length ; l++ ) {
                           vmfsFlag = true;
                           DynamicProperty[]  nameArr = 
                              getDynamicProarray(vmsMOR[l],"name");
                           String vmname = nameArr[0].getVal().toString();
                           System.out.println(" "+vmname);
                        }
                     }
                  }
               }
            }
         }
         if (!vmfsFlag) {
            System.out.println(" None\n");
         }
      }
      catch(Exception e){
         System.out.println("error" + e);
         e.printStackTrace();
      }           
   }
   
   private  DynamicProperty[] getDynamicProarray
                    (ManagedObjectReference MOR,String pName )throws Exception{

      ObjectContent[] objContent = 
           cb.getServiceUtil().getObjectProperties(null, MOR,
              new String[] { pName });
      ObjectContent contentObj = objContent[0];
      DynamicProperty[] objArr = contentObj.getPropSet();
      return objArr;
   }   

   private static OptionSpec[] constructOptions() {
      OptionSpec [] useroptions = new OptionSpec[1];
      useroptions[0] = new OptionSpec("hostname","String",1
                                      ,"Name of the host"
                                      ,null);
      return useroptions;
   }

   public static void main(String args[]) throws Exception{     
      SCSILunName obj = new SCSILunName();      
      cb = AppUtil.initialize("SCSILunName"
                             ,SCSILunName.constructOptions()
                             ,args);
      cb.connect();
      obj.displayScsiLuns();
      cb.disConnect();
   }
}
