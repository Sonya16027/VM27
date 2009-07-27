package com.intalio.vmware.session;

import java.util.ArrayList;
import java.util.HashMap;

import com.vmware.apputils.AppUtil;
import com.vmware.apputils.OptionSpec;

public class CompoundActivity extends BasicActivity implements Activity {
	private ArrayList<Activity> activities = new ArrayList<Activity>();

	public CompoundActivity() {
		super();
	}
	
	public CompoundActivity(HashMap<String, String> arguments) {
		super();
		setArguments(arguments);
	}

	public void addActivity(Activity activity) {
		activities.add(activity);
	}

	public void removeActivity(Activity activity) {
		activities.remove(activity);
	}

	@Override
	public OptionSpec[] constructOptions() {
		return null;
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
