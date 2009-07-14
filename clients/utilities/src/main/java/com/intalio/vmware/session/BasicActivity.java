package com.intalio.vmware.session;

import java.lang.reflect.Method;

import com.vmware.apputils.AppUtil;
import com.vmware.apputils.OptionSpec;

public abstract class BasicActivity implements Activity {
	private Object activityObject;
	private Class<? extends Object> activityClass;
	
	public BasicActivity(Object activityObject) {
		this.activityObject = activityObject;
		this.activityClass = activityObject.getClass();
	}

	@Override
	public OptionSpec[] constructOptions() {
		try {
			Method method = activityClass.getMethod("constructOptions");
			return (OptionSpec[]) method.invoke(activityObject);
		} catch (Exception e) {
			System.out.println("Could not invoke constructOptions on " + activityObject);
			return null;
		}
	}

	public abstract String[] getArgs();

	public abstract void run(AppUtil cb) throws Exception;

}
