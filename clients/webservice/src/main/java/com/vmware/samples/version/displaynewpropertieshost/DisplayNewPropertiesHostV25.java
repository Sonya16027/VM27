package com.vmware.samples.version.displaynewpropertieshost;

import java.util.ArrayList;
import java.util.Calendar;

import com.vmware.apputils.version.ExtendedAppUtil;
import com.vmware.apputils.version.VersionUtil;
import com.vmware.vim25.HostConfigInfo;
import com.vmware.vim25.HostRuntimeInfo;
import com.vmware.vim25.ManagedObjectReference;

public class DisplayNewPropertiesHostV25 {
	public static void displayNewProperties(
			com.vmware.vim.ManagedObjectReference hmor, ArrayList apiVersions,
			String[] args, String cookieString) throws Exception {
		ExtendedAppUtil ecb = null;
		ecb = ExtendedAppUtil.initialize("DisplayNewPropertiesHost",
				DisplayNewPropertiesHost.constructOptions(), args);
		ecb.connect(cookieString);
		ManagedObjectReference hmor1 = VersionUtil
				.convertManagedObjectReference(hmor);

		System.out.println("\nProperties added in 2.5 VI API\n");
		HostRuntimeInfo runtimeInfo = (HostRuntimeInfo) ecb.getServiceUtil3()
				.getDynamicProperty(hmor1, "runtime");

		Calendar cal = runtimeInfo.getBootTime();
		System.out.println("Boot Time :- " + cal.getTime().toGMTString());

		String powerState = runtimeInfo.getPowerState().getValue();
		System.out.println("Power State :- " + powerState);

		HostConfigInfo configInfo = (HostConfigInfo) ecb.getServiceUtil3()
				.getDynamicProperty(hmor1, "config");
		String timeZone = configInfo.getDateTimeInfo().getTimeZone().getKey();
		System.out.println("Time Zone :- " + timeZone);

		boolean flag = VersionUtil.isApiVersionSupported(apiVersions, "4.0");
		if (flag) {
			System.out.println("\nProperties added in 4.0 VI API\n");
			Boolean infoFlag = (Boolean) ecb.getServiceUtil3()
					.getDynamicProperty(hmor1, "capability.ipmiSupported");
			System.out.println("IPMI Supported :- " + infoFlag);
			infoFlag = (Boolean) ecb.getServiceUtil3().getDynamicProperty(
					hmor1, "capability.tpmSupported");
			System.out.println("TPM Supported :- " + infoFlag);
		}
	}
}