package com.intalio.vmware.version.displaynewpropertieshost;

import java.util.ArrayList;

import com.vmware.apputils.AppUtil;
import com.vmware.apputils.OptionSpec;
import com.vmware.apputils.version.VersionUtil;
import com.vmware.vim.ManagedObjectReference;

/**
 *<pre>
 * his sample displays properties of the host based on the API version supported by
 * SX or vCenter Server.
 * ul&gt;&lt;li&gt;Host Name&lt;/li&gt;&lt;/ul&gt;
 * f server supports VI API 2.5, this sample displays
 * ul&gt;&lt;li&gt;Boot Time&lt;/ul&gt;
 * ul&gt;&lt;li&gt;Power State&lt;/ul&gt;
 * ul&gt;&lt;li&gt;Time Zone&lt;/ul&gt;
 * f server supports vSphere API 4.0, this sample also displays
 * ul&gt;&lt;li&gt;IPMI Supported&lt;/ul&gt;
 * ul&gt;&lt;li&gt;TPM Supported&lt;/ul&gt;
 * b&gt;Parameters:&lt;/b&gt;
 * ostname      [required]:  Name of the host.
 * 
 * b&gt;Command Line: To display the properties of the host machine&lt;/b&gt;
 * un.bat com.intalio.vmware.version.displaynewpropertieshost.DisplayNewPropertiesHost 
 * -url [webserviceurl] --username [username] --password  [password] 
 * -hostname [Name of the host]
 * 
 *</pre>
 */

public class DisplayNewPropertiesHost {
	private static AppUtil cb = null;

	public static OptionSpec[] constructOptions() {
		OptionSpec[] useroptions = new OptionSpec[1];
		useroptions[0] = new OptionSpec("hostname", "String", 1,
				"Name of the host", null);
		return useroptions;
	}

	public static void main(String[] args) throws Exception {
		DisplayNewPropertiesHost obj = new DisplayNewPropertiesHost();
		cb = AppUtil.initialize("DisplayNewPropertiesHost",
				DisplayNewPropertiesHost.constructOptions(), args);

		cb.connect();
		obj.displayProperties(args);
		cb.disConnect();
	}

	private void displayProperties(String[] args) throws Exception {
		String hostName = cb.get_option("hostname");
		ManagedObjectReference hmor = cb.getServiceUtil().getDecendentMoRef(
				null, "HostSystem", hostName);

		if (hmor != null) {
			ArrayList apiVersions = VersionUtil.getSupportedVersions(cb
					.get_option("url"));
			String serverName = (String) cb.getServiceUtil()
					.getDynamicProperty(hmor, "name");
			System.out.println("Server Name :- " + serverName);

			if (VersionUtil.isApiVersionSupported(apiVersions, "2.5")) {
				String cookieString = VersionUtil.getCookieString(cb);
				DisplayNewPropertiesHostV25.displayNewProperties(hmor,
						apiVersions, args, cookieString);
			} else {
				// Do Nothing
			}

		} else {
			System.out.println("Host Not Found");
		}
	}
}