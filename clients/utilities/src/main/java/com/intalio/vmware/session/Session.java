package com.intalio.vmware.session;

import com.vmware.apputils.AppUtil;
import com.vmware.apputils.OptionSpec;

public class Session {
	private static AppUtil cb = null;

	private static OptionSpec[] constructOptions() {
		OptionSpec[] useroptions = new OptionSpec[3];
		useroptions[0] = new OptionSpec("DatacenterName", "String", 1,
				"Name of the Datacenter", null);
		useroptions[1] = new OptionSpec("vmPath", "String", 1,
				"Path to the VM inventory", null);
		useroptions[2] = new OptionSpec("CloneName", "String", 1,
				"Name of the Clone", null);
		return useroptions;
	}

	public static void execute(Activity activity) {
		try {
			cb = AppUtil.initialize("VMClone", activity.constructOptions(),
					activity.getArgs());
			cb.connect();
			activity.run(cb);
			cb.disConnect();
		} catch (Exception e) {
			System.out.println("Could not execute task " + activity);
		}
	}
}
