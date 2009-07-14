package com.vmware.samples.version.getvirtualdiskfiles;

import java.util.ArrayList;

import com.vmware.apputils.AppUtil;
import com.vmware.apputils.OptionSpec;
import com.vmware.apputils.version.VersionUtil;
import com.vmware.vim.ArrayOfHostDatastoreBrowserSearchResults;
import com.vmware.vim.DatastoreSummary;
import com.vmware.vim.FileInfo;
import com.vmware.vim.HostDatastoreBrowserSearchResults;
import com.vmware.vim.HostDatastoreBrowserSearchSpec;
import com.vmware.vim.ManagedObjectReference;
import com.vmware.vim.TaskInfo;

/**
 * 
 *<pre>
 * his sample searches the Virtual disk files in all the datastores available in
 * pecified host using new properties ControllerType and Thin Property.
 * f server supports 2.5 API then it uses ControllerType property in filter
 * f server supports 3.0 API then it uses both ControllerType and Thin property in the filter
 * therwise no properties is specified in the filter.
 * 
 * b&gt;Parameters:&lt;/b&gt;
 * ostname        [required]:Name of the host
 * 
 * b&gt;Command:&lt;/b&gt;
 * un.bat com.vmware.samples.version.getvirtualdiskfiles.GetVirtualDiskFiles --url [webserviceurl] 
 * -username [username] --password [password] --hostname [hostname]
 *</pre>
 */

public class GetVirtualDiskFiles {
	private static AppUtil cb = null;

	private void displayControllers(String[] args) throws Exception {
		String hostName = cb.getOption("hostname");

		ManagedObjectReference hostmor = cb.getServiceUtil().getDecendentMoRef(
				null, "HostSystem", hostName);

		if (hostmor == null) {
			System.out.println("No Host Found");
			return;
		}
		ManagedObjectReference[] datastores = (ManagedObjectReference[]) cb
				.getServiceUtil().getDynamicProperty(hostmor, "datastore");

		ArrayList apiVersions = VersionUtil.getSupportedVersions(cb
				.getOption("url"));
		if (VersionUtil.isApiVersionSupported(apiVersions, "2.5")) {
			String cookieString = VersionUtil.getCookieString(cb);
			GetVirtualDiskFilesV25.getVirtualDiskFiles(datastores, apiVersions,
					args, cookieString);
		} else {
			System.out.println("Searching The Datastores");
			for (ManagedObjectReference datastore : datastores) {
				ManagedObjectReference dsBrowser = (ManagedObjectReference) cb
						.getServiceUtil().getDynamicProperty(datastore,
								"browser");

				DatastoreSummary ds = (DatastoreSummary) cb.getServiceUtil()
						.getDynamicProperty(datastore, "summary");

				String dsName = ds.getName();

				System.out.println("");
				System.out.println("Searching The Datastore " + dsName);

				HostDatastoreBrowserSearchSpec searchSpec = new HostDatastoreBrowserSearchSpec();

				ManagedObjectReference taskmor = cb.getConnection()
						.getService().searchDatastoreSubFolders_Task(dsBrowser,
								"[" + dsName + "]", searchSpec);

				String res = cb.getServiceUtil().waitForTask(taskmor);
				TaskInfo tInfo = (TaskInfo) cb.getServiceUtil()
						.getDynamicProperty(taskmor, "info");

				ArrayOfHostDatastoreBrowserSearchResults searchResult = (ArrayOfHostDatastoreBrowserSearchResults) tInfo
						.getResult();

				int len = searchResult.getHostDatastoreBrowserSearchResults().length;
				for (int j = 0; j < len; j++) {
					HostDatastoreBrowserSearchResults sres = searchResult
							.getHostDatastoreBrowserSearchResults(j);
					FileInfo[] fileArray = sres.getFile();
					for (FileInfo element : fileArray) {
						System.out.println("Virtual Disks Files "
								+ element.getPath());
					}
				}
			}
		}
	}

	public static OptionSpec[] constructOptions() {
		OptionSpec[] useroptions = new OptionSpec[1];
		useroptions[0] = new OptionSpec("hostname", "String", 1,
				"Name of the host", null);
		return useroptions;
	}

	public static void main(String args[]) throws Exception {
		GetVirtualDiskFiles obj = new GetVirtualDiskFiles();
		cb = AppUtil.initialize("GetVirtualDiskFiles", GetVirtualDiskFiles
				.constructOptions(), args);
		cb.connect();
		obj.displayControllers(args);
		cb.disConnect();
	}
}