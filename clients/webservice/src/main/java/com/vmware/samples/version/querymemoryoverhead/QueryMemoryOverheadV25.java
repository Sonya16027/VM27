package com.vmware.samples.version.querymemoryoverhead;

import java.util.Calendar;

import com.vmware.apputils.version.ExtendedAppUtil;
import com.vmware.apputils.version.VersionUtil;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.VirtualHardware;
import com.vmware.vim25.VirtualMachineConfigInfo;
import com.vmware.vim25.VirtualMachineDefaultPowerOpInfo;
import com.vmware.vim25.VirtualMachineFileInfo;
import com.vmware.vim25.VirtualMachineFlagInfo;

public class QueryMemoryOverheadV25 {
	public static void queryMemoryOverhead(
			com.vmware.vim.ManagedObjectReference hmor, String[] args,
			String cookieString) throws Exception {
		ExtendedAppUtil ecb = null;
		ecb = ExtendedAppUtil.initialize("QueryMemoryOverhead",
				QueryMemoryOverhead.constructOptions(), args);
		ecb.connect(cookieString);
		ManagedObjectReference sic = ecb.getServiceConnection3()
				.getServiceInstanceRef();

		// Convert the vim managed object to vim25 managed object
		ManagedObjectReference hmor1 = VersionUtil
				.convertManagedObjectReference(hmor);

		VirtualMachineConfigInfo vmConfigInfo = new VirtualMachineConfigInfo();

		vmConfigInfo.setChangeVersion("1");

		Calendar cal = ecb.getServiceConnection3().getService()
				.currentTime(sic);
		vmConfigInfo.setModified(cal);

		VirtualMachineDefaultPowerOpInfo defaultInfo = new VirtualMachineDefaultPowerOpInfo();
		vmConfigInfo.setDefaultPowerOps(defaultInfo);

		VirtualMachineFileInfo fileInfo = new VirtualMachineFileInfo();
		vmConfigInfo.setFiles(fileInfo);

		VirtualMachineFlagInfo flagInfo = new VirtualMachineFlagInfo();
		vmConfigInfo.setFlags(flagInfo);

		vmConfigInfo.setGuestFullName("Full Name");
		vmConfigInfo.setGuestId("Id");

		VirtualHardware vhardware = new VirtualHardware();
		vhardware.setMemoryMB(Integer.parseInt(ecb.getOption("memorysize")));
		vhardware.setNumCPU(Integer.parseInt(ecb.getOption("cpucount")));
		vmConfigInfo.setHardware(vhardware);

		// Not Required For Computing The Overhead
		vmConfigInfo.setName("OnlyFoeInfo");
		vmConfigInfo.setUuid("12345678-abcd-1234-cdef-123456789abc");
		vmConfigInfo.setVersion("First");
		vmConfigInfo.setTemplate(false);
		vmConfigInfo.setAlternateGuestName("Alternate");

		Long overhead = ecb.getServiceConnection3().getService()
				.queryMemoryOverheadEx(hmor1, vmConfigInfo);
		System.out
				.println("Using queryMemoryOverheadEx API using vmReconfigInfo");
		System.out.println("Memory overhead necessary to "
				+ "poweron a virtual machine with memory "
				+ ecb.getOption("memorysize") + " MB and cpu count "
				+ ecb.getOption("cpucount") + " -: " + overhead + " bytes");
	}
}