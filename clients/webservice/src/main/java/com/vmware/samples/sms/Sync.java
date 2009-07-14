package com.vmware.samples.sms;

import com.vmware.apputils.Log;
import com.vmware.apputils.SmAppUtil;
import com.vmware.apputils.SmServiceConnection;
import com.vmware.vim.sms.SmPortType;

/**
 *<pre>
 * his sample implements a function that
 * 
 * ul&gt;
 * Syncs the service cache from provider information (such as the vCenter database provider).
 * /ul&gt;
 * 
 * b&gt;Command: To start a sync operation &lt;/b&gt; 
 * un.bat com.vmware.samples.sms.Sync --url &lt;webserviceurl&gt; 
 * -username &lt;username&gt; --password &lt;password&gt;  --ignorecert
 * 
 * ample Command Line
 * un.bat com.vmware.samples.sms.ConfigureSyncInterval --url http://localhost/sdk --username administrator --password password* 
 * -ignorecert
 * 
 *</pre>
 */

public class Sync {
	private static SmPortType service;
	private static com.vmware.vim.sms.ManagedObjectReference si;

	private static SmAppUtil cb = null;
	Log log = new Log();

	public void execute() throws Exception {
		SmServiceConnection conn = cb.getSmConnection();
		service = conn.getService();
		service.sync(si);
		System.out.println("Sync operation completed successfully!");
	}

	public static void main(String[] args) throws Exception {
		Sync obj = new Sync();
		cb = SmAppUtil.initialize("Sync", args);
		cb.connect();
		obj.execute();
		cb.disConnect();
	}
}
