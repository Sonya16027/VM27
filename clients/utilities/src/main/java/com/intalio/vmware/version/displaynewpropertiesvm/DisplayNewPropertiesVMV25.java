package com.intalio.vmware.version.displaynewpropertiesvm;

import java.util.ArrayList;

import com.vmware.apputils.version.ExtendedAppUtil;
import com.vmware.apputils.version.VersionUtil;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.VirtualMachineFaultToleranceState;

public class DisplayNewPropertiesVMV25 {
	public static void displayVMProperties(
			com.vmware.vim.ManagedObjectReference vmmor, ArrayList apiVersions,
			String[] args, String cookieString) throws Exception {
		ExtendedAppUtil ecb = null;
		ecb = ExtendedAppUtil.initialize("DisplayNewPropertiesVM",
				DisplayNewPropertiesVM.constructOptions(), args);
		ecb.connect(cookieString);
		// Convert the vim managed object to vim25 managed object
		ManagedObjectReference vmmor1 = VersionUtil
				.convertManagedObjectReference(vmmor);

		System.out.println("\nProperties added in 2.5 VI API\n");
		Boolean bootOptionsSupported = (Boolean) ecb.getServiceUtil3()
				.getDynamicProperty(vmmor1, "capability.bootOptionsSupported");
		System.out.println("Boot Options Supported :- " + bootOptionsSupported);

		Boolean diskSharesSupported = (Boolean) ecb.getServiceUtil3()
				.getDynamicProperty(vmmor1, "capability.diskSharesSupported");
		System.out.println("Disk Shares Supported :- " + diskSharesSupported);

		boolean flag = VersionUtil.isApiVersionSupported(apiVersions, "4.0");
		if (flag) {
			System.out.println("\nProperties added in 4.0 VI API\n");
			Boolean changeTrackingSupported = (Boolean) ecb.getServiceUtil3()
					.getDynamicProperty(vmmor1,
							"capability.changeTrackingSupported");
			System.out.println("Change Tracking Supported :- "
					+ changeTrackingSupported);
			Boolean recordReplaySupported = (Boolean) ecb.getServiceUtil3()
					.getDynamicProperty(vmmor1,
							"capability.recordReplaySupported");
			System.out.println("Record Replay Supported :- "
					+ recordReplaySupported);
			VirtualMachineFaultToleranceState faultToleranceState = (VirtualMachineFaultToleranceState) ecb
					.getServiceUtil3().getDynamicProperty(vmmor1,
							"runtime.faultToleranceState");
			System.out.println("Fault Tolerance State :- "
					+ faultToleranceState.getValue());
		}
	}
}