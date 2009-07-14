package com.vmware.samples.version.recordsession;

import java.util.ArrayList;

import com.vmware.apputils.AppUtil;
import com.vmware.apputils.OptionSpec;
import com.vmware.apputils.version.VersionUtil;
import com.vmware.vim.ManagedObjectReference;
import com.vmware.vim.VirtualMachineSnapshotTree;

/**
 *<pre>
 * his samples demostrates the new functionality for session recording.
 * f server supports 3.0, then it will initate the recording session
 * therwise, it only removes all the snapshots of the specified virtual machine.
 * 
 * b&gt;Parameters:&lt;/b&gt;
 * mname       [required]:  Name of the virtual machine.
 * napshotname [optional]:  Name of the snapshot generated due to recording session
 * escription  [optional]:  Description of the snapshot generated due to recording session
 * 
 * b&gt;Command Line: To diaply the properties of the host machine&lt;/b&gt;
 * un.bat com.vmware.samples.version.displaynewproperties.DisplayNewProperties 
 * -url [webserviceurl] --username [username] --password  [password] 
 * -vmnname [Name of the virtual machine] --snapshotname [Snapshot name]
 * -description [Description]
 * 
 *</pre>
 */

public class RecordSession {
	private static AppUtil cb = null;

	private void recordSession(String[] args) throws Exception {
		String vmName = cb.getOption("vmname");
		ManagedObjectReference vmmor = cb.getServiceUtil().getDecendentMoRef(
				null, "VirtualMachine", vmName);

		if (vmmor != null) {
			ArrayList apiVersions = VersionUtil.getSupportedVersions(cb
					.getOption("url"));
			if (VersionUtil.isApiVersionSupported(apiVersions, "2.5")) {
				String cookieString = VersionUtil.getCookieString(cb);
				RecordSessionV25.recordSession(vmmor, apiVersions, args,
						cookieString);
			} else {
				VirtualMachineSnapshotTree[] tree = (VirtualMachineSnapshotTree[]) cb
						.getServiceUtil().getDynamicProperty(vmmor,
								"snapshot.rootSnapshotList");
				if (tree != null && tree.length != 0) {
					ManagedObjectReference taskMor = cb.getConnection()
							.getService().removeAllSnapshots_Task(vmmor);
					String res = cb.getServiceUtil().waitForTask(taskMor);
					if (res.equalsIgnoreCase("sucess")) {
						System.out
								.println("Removed all the snapshot successfully");
					}
				} else {
					System.out
							.println("No snapshot found for this virtual machine");
				}
			}
		} else {
			System.out.println("Virtual Machine Not Found");
		}
	}

	public static OptionSpec[] constructOptions() {
		OptionSpec[] useroptions = new OptionSpec[3];
		useroptions[0] = new OptionSpec("vmname", "String", 1,
				"Name of the virtual machine", null);
		useroptions[1] = new OptionSpec("snapshotname", "String", 0,
				"Name of the resulting snapshot", null);
		useroptions[2] = new OptionSpec("description", "String", 0,
				"Description for the resulting snapshot", null);
		return useroptions;
	}

	public static void main(String[] args) throws Exception {
		RecordSession obj = new RecordSession();
		cb = AppUtil.initialize("RecordSession", RecordSession
				.constructOptions(), args);

		cb.connect();
		obj.recordSession(args);
		cb.disConnect();
	}
}