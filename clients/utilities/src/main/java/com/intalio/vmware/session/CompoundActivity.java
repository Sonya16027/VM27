package com.intalio.vmware.session;

import java.util.ArrayList;

import com.vmware.apputils.AppUtil;
import com.vmware.apputils.OptionSpec;

public class CompoundActivity implements Activity {
	private ArrayList<Activity> activities = new ArrayList<Activity>();

	public CompoundActivity() {
	}

	public void addActivity(Activity activity) {
		activities.add(activity);
	}

	@Override
	public OptionSpec[] constructOptions() {
		return null;
	}

	@Override
	public String[] getArgs() {
		return null;
	}

	public void removeActivity(Activity activity) {
		activities.remove(activity);
	}

	@Override
	public void run(AppUtil cb) throws Exception {
		for (Activity activity : activities) {
			cb.addOptions(activity.constructOptions());
			cb.parseInput(activity.getArgs());
			cb.validate();
			activity.run(cb);
		}
	}

}
