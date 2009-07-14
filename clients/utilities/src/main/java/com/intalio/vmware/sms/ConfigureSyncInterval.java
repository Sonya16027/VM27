package com.intalio.vmware.sms;

import com.vmware.apputils.Log;
import com.vmware.apputils.OptionSpec;
import com.vmware.apputils.SmAppUtil;
import com.vmware.apputils.SmServiceConnection;
import com.vmware.vim.sms.SmPortType;

/**
 *<pre>
 * his sample implements a function that
 * 
 * ul&gt;
 * li&gt; Sets the frequency with which the service cache is automatically synced with
 * provider information using SMS API - ConfigureSyncInterval 
 * /ul&gt;
 * 
 * b&gt;Command: To update the sync interval &lt;/b&gt; 
 * un.bat com.intalio.vmware.sms.ConfigureSyncInterval --url &lt;webserviceurl&gt; 
 * -username &lt;username&gt; --password &lt;password&gt; --syncInterval &lt;syncInterval&gt; --ignorecert
 * 
 * ample Command Line
 * un.bat com.intalio.vmware.sms.ConfigureSyncInterval --url http://localhost/sdk --username administrator --password password* 
 * -ignorecert --syncInterval 300
 * 
 *</pre>
 */

public class ConfigureSyncInterval {
	private static SmPortType service;
	private static com.vmware.vim.sms.ManagedObjectReference si;

	private static SmAppUtil cb = null;

	private static OptionSpec[] constructOptions() {
		OptionSpec[] useroptions = new OptionSpec[1];
		useroptions[0] = new OptionSpec("syncInterval", "Integer", 1,
				"Sync interval", null);
		return useroptions;
	}

	public static void main(String[] args) throws Exception {
		ConfigureSyncInterval obj = new ConfigureSyncInterval();
		cb = SmAppUtil.initialize("ConfigureSyncInterval",
				ConfigureSyncInterval.constructOptions(), args);
		cb.connect();
		obj.execute();
		cb.disConnect();
	}

	Log log = new Log();

	public void execute() throws Exception {
		SmServiceConnection conn = cb.getSmConnection();
		service = conn.getService();

		Integer syncInterval = Integer.parseInt(cb.get_option("syncInterval"));

		service.configureSyncInterval(si, syncInterval);
		System.out.println("Configured sync interval to " + syncInterval
				+ " seconds.");
	}
}
