package com.vmware.samples.scsilun;

import com.vmware.apputils.AppUtil;
import com.vmware.apputils.OptionSpec;
import com.vmware.vim.ArrayOfManagedObjectReference;
import com.vmware.vim.ArrayOfScsiLun;
import com.vmware.vim.DynamicProperty;
import com.vmware.vim.HostScsiDiskPartition;
import com.vmware.vim.HostVmfsVolume;
import com.vmware.vim.ManagedObjectReference;
import com.vmware.vim.ObjectContent;
import com.vmware.vim.ScsiLun;
import com.vmware.vim.ScsiLunDurableName;
import com.vmware.vim.VmfsDatastoreInfo;

/**
 *<Pre>
 * This sample displays the CanonicalName,Vendor,Model,Data,Namespace and NamespaceId of the host
 * CSI LUN name. 
 * 
 * b&gt;Parameters:&lt;/b&gt;
 * ostname        [required]:  Name of the host
 * b&gt;Command: displays the CanonicalName,Vendor,Model,Data,Namespace and 
 * NamespaceId of the host  SCSI LUN name.&lt;/b&gt;
 * 
 * un.bat com.vmware.samples.scsilun.SCSILunName --url [webserviceurl] 
 * -username [username] --password [password] --hostname [hostname]
 *</pre>
 */

public class SCSILunName {
	private static AppUtil cb = null;

	private void displayScsiLuns() throws Exception {
		String hostname = cb.getOption("hostname");
		ManagedObjectReference hmor = cb.getServiceUtil().getDecendentMoRef(
				null, "HostSystem", hostname);
		if (hmor != null) {
			DynamicProperty[] scsiArry = getDynamicProarray(hmor,
					"config.storageDevice.scsiLun");
			ArrayOfScsiLun scsiLUNarr = ((ArrayOfScsiLun) (scsiArry[0])
					.getVal());
			ScsiLun scsiLun[] = scsiLUNarr.getScsiLun();
			try {
				if (scsiLun != null && scsiLun.length > 0) {
					for (int j = 0; j < scsiLun.length; j++) {
						System.out.println("\nSCSI LUN " + (j + 1));
						System.out.println("--------------");
						String canName = scsiLun[j].getCanonicalName();
						String vendor = scsiLun[j].getVendor();
						String model = scsiLun[j].getModel();
						if (scsiLun[j].getDurableName() != null) {
							ScsiLunDurableName scsiLunDurableName = scsiLun[j]
									.getDurableName();
							byte data[] = scsiLunDurableName.getData();
							String namespace = scsiLunDurableName
									.getNamespace();
							byte namespaceId = scsiLunDurableName
									.getNamespaceId();
							System.out.print("\nData            : ");
							for (byte element : data) {
								System.out.print(element + " ");
							}
							System.out
									.println("\nCanonical Name  : " + canName);
							System.out
									.println("Namespace       : " + namespace);
							System.out.println("Namespace ID    : "
									+ namespaceId);
							System.out.println("\nVMFS Affected ");
							getVMFS(hmor, canName);
							System.out.println("Virtual Machines ");
							getVMs(hmor, canName);
						} else {
							System.out.println("\nDurable name for "
									+ scsiLun[j].getCanonicalName()
									+ " does not exist");
						}

					}
				}
			} catch (Exception e) {
				System.out.println("error" + e);
				e.printStackTrace();
			}
		} else {
			System.out.println("Host " + cb.getOption("hostname")
					+ " not found");
		}
	}

	/*
	 * This subroutine prints the virtual machine file system volumes affected
	 * by the given SCSI LUN.
	 * 
	 * @param hmor A HostSystem object of the given host.
	 * 
	 * @param canName Canonical name of the SCSI logical unit
	 */

	private void getVMFS(ManagedObjectReference hmor, String canName)
			throws Exception {
		DynamicProperty[] dsArr = getDynamicProarray(hmor, "datastore");
		ArrayOfManagedObjectReference ds = ((ArrayOfManagedObjectReference) (dsArr[0])
				.getVal());
		ManagedObjectReference dataStoresMOR[] = ds.getManagedObjectReference();
		boolean vmfsFlag = false;
		try {
			for (ManagedObjectReference element : dataStoresMOR) {
				DynamicProperty[] infoArr = getDynamicProarray(element, "info");
				String infoClass = infoArr[0].getVal().getClass().toString();
				if (infoClass.equals("class com.vmware.vim.VmfsDatastoreInfo")) {
					VmfsDatastoreInfo vds = (VmfsDatastoreInfo) (infoArr[0])
							.getVal();
					HostVmfsVolume hvms = vds.getVmfs();
					String vmfsName = vds.getName();
					HostScsiDiskPartition hdp[] = hvms.getExtent();
					for (HostScsiDiskPartition element2 : hdp) {
						if (element2.getDiskName().equals(canName)) {
							vmfsFlag = true;
							System.out.println(" " + vmfsName + "\n");
						}
					}
				}
			}
			if (!vmfsFlag) {
				System.out.println(" None\n");
			}
		} catch (Exception e) {
			System.out.println("error" + e);
			e.printStackTrace();
		}
	}

	/*
	 * This subroutine prints the virtual machineaffected by the given SCSI LUN.
	 * 
	 * @param hmor ManagedObjectReference of the host
	 * 
	 * @param canName Canonical name of the SCSI logical unit
	 */

	private void getVMs(ManagedObjectReference hmor, String canName)
			throws Exception {
		DynamicProperty[] dsArr = getDynamicProarray(hmor, "datastore");
		ArrayOfManagedObjectReference ds = ((ArrayOfManagedObjectReference) (dsArr[0])
				.getVal());
		ManagedObjectReference dataStoresMOR[] = ds.getManagedObjectReference();
		boolean vmfsFlag = false;
		try {
			for (ManagedObjectReference element : dataStoresMOR) {
				DynamicProperty[] infoArr = getDynamicProarray(element, "info");
				String infoClass = infoArr[0].getVal().getClass().toString();
				if (infoClass.equals("class com.vmware.vim.VmfsDatastoreInfo")) {
					VmfsDatastoreInfo vds = (VmfsDatastoreInfo) (infoArr[0])
							.getVal();
					HostVmfsVolume hvms = vds.getVmfs();
					String vmfsName = vds.getName();
					HostScsiDiskPartition hdp[] = hvms.getExtent();
					for (HostScsiDiskPartition element2 : hdp) {
						if (element2.getDiskName().equals(canName)) {
							DynamicProperty[] vmArr = getDynamicProarray(
									element, "vm");
							ArrayOfManagedObjectReference vms = ((ArrayOfManagedObjectReference) (vmArr[0])
									.getVal());
							ManagedObjectReference vmsMOR[] = vms
									.getManagedObjectReference();

							if (vmsMOR != null) {
								for (ManagedObjectReference element3 : vmsMOR) {
									vmfsFlag = true;
									DynamicProperty[] nameArr = getDynamicProarray(
											element3, "name");
									String vmname = nameArr[0].getVal()
											.toString();
									System.out.println(" " + vmname);
								}
							}
						}
					}
				}
			}
			if (!vmfsFlag) {
				System.out.println(" None\n");
			}
		} catch (Exception e) {
			System.out.println("error" + e);
			e.printStackTrace();
		}
	}

	private DynamicProperty[] getDynamicProarray(ManagedObjectReference MOR,
			String pName) throws Exception {

		ObjectContent[] objContent = cb.getServiceUtil().getObjectProperties(
				null, MOR, new String[] { pName });
		ObjectContent contentObj = objContent[0];
		DynamicProperty[] objArr = contentObj.getPropSet();
		return objArr;
	}

	private static OptionSpec[] constructOptions() {
		OptionSpec[] useroptions = new OptionSpec[1];
		useroptions[0] = new OptionSpec("hostname", "String", 1,
				"Name of the host", null);
		return useroptions;
	}

	public static void main(String args[]) throws Exception {
		SCSILunName obj = new SCSILunName();
		cb = AppUtil.initialize("SCSILunName", SCSILunName.constructOptions(),
				args);
		cb.connect();
		obj.displayScsiLuns();
		cb.disConnect();
	}
}
