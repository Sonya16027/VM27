package com.intalio.vmware.version.hostpowerops;

import java.util.ArrayList;

import com.vmware.apputils.AppUtil;
import com.vmware.apputils.OptionSpec;
import com.vmware.apputils.version.VersionUtil;
import com.vmware.vim.ManagedObjectReference;

/**
 *<pre>
 * his sample uses the powerDownHostToStandBy API to power down. the host.
 * his API is not available in VC 3.0.1 and ESX 3.0.1
 * 
 * b&gt;Parameters:&lt;/b&gt;
 * ostname        [required]:Name of the host
 * 
 * b&gt;Command:&lt;/b&gt;
 * un.bat com.intalio.vmware.version.hostpowerops.HostPowerOps --url [webserviceurl] 
 * -username [username] --password [password] --hostname [hostname]
 *</pre>
 */

public class HostPowerOps {
	protected static AppUtil cb = null;

	public static OptionSpec[] constructOptions() {
		OptionSpec[] useroptions = new OptionSpec[2];
		useroptions[0] = new OptionSpec("hostname", "String", 1,
				"Name of the host", null);
		useroptions[1] = new OptionSpec("operation", "String", 1,
				"Name of the operation", null);
		return useroptions;
	}

	public static void main(String args[]) throws Exception {
		HostPowerOps obj = new HostPowerOps();
		cb = AppUtil.initialize("PowerDownHostToStandBy", HostPowerOps
				.constructOptions(), args);
		boolean valid = obj.customValidation();
		if (valid) {
			cb.connect();
			obj.PowerDownHost(args);
			cb.disConnect();
		}
	}

	protected boolean customValidation() throws Exception {
		boolean flag = true;
		String operation = cb.get_option("operation");
		if ((!operation.equalsIgnoreCase("reboot"))
				&& (!operation.equalsIgnoreCase("shutdown"))
				&& (!operation.equalsIgnoreCase("powerdowntostandby"))) {
			System.out
					.println("Invalid operations ; [reboot | shutdown | powerdowntostandby]");
			flag = false;
		}
		return flag;
	}

	protected void PowerDownHost(String[] args) throws Exception {
		String hostname = cb.get_option("hostname");
		ManagedObjectReference hmor = cb.getServiceUtil().getDecendentMoRef(
				null, "HostSystem", hostname);

		ArrayList apiVersions = VersionUtil.getSupportedVersions(cb
				.get_option("url"));
		if (hmor != null) {
			if (cb.get_option("operation").equalsIgnoreCase("reboot")) {
				ManagedObjectReference taskmor = cb.getConnection()
						.getService().rebootHost_Task(hmor, true);
				String result = cb.getServiceUtil().waitForTask(taskmor);
				if (result.equalsIgnoreCase("sucess")) {
					System.out.println("Operation reboot host"
							+ " completed sucessfully");
				}
			} else if (cb.get_option("operation").equalsIgnoreCase("shutdown")) {
				ManagedObjectReference taskmor = cb.getConnection()
						.getService().shutdownHost_Task(hmor, true);
				String result = cb.getServiceUtil().waitForTask(taskmor);
				if (result.equalsIgnoreCase("sucess")) {
					System.out.println("Operation shutdown host"
							+ " completed sucessfully");
				}
			} else if (cb.get_option("operation").equalsIgnoreCase(
					"powerdowntostandby")) {
				if (VersionUtil.isApiVersionSupported(apiVersions, "2.5")) {
					String cookieString = VersionUtil.getCookieString(cb);
					HostPowerOpsV25.powerDownHost(hmor, args, cookieString);
				} else {
					System.out
							.println("Operation Not Supported On ESX 3.0.1 and VC 2.0.1");
				}
			}
		} else {
			System.out.println("Host " + cb.get_option("hostname")
					+ " not found");
		}
	}
}