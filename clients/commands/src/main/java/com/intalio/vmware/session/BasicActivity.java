package com.intalio.vmware.session;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;

import com.vmware.apputils.AppUtil;
import com.vmware.apputils.OptionSpec;

public class BasicActivity implements Activity {
	protected Object activityObject;
	protected Class<? extends Object> activityClass;
	protected HashMap<String, String> arguments;
	protected String operationName;
	
	public BasicActivity() {		
	}
	
	public BasicActivity(Object activityObject) {
		this.activityObject = activityObject;
		this.activityClass = activityObject.getClass();
	}
	
	public BasicActivity(Object activityObject, HashMap<String, String> arguments) {
		this.activityObject = activityObject;
		this.activityClass = activityObject.getClass();
		this.arguments = arguments;
	}

	public HashMap<String, String> getArguments() {
		return arguments;
	}

	public void setArguments(HashMap<String, String> arguments) {
		this.arguments = arguments;
	}

	public String getOperationName() {
		return operationName;
	}

	public void setOperationName(String operationName) {
		this.operationName = operationName;
	}

	public OptionSpec[] constructOptions() {
		try {
			Method method = activityClass.getMethod("constructOptions");
			return (OptionSpec[]) method.invoke(activityObject);
		} catch (Exception e) {
			System.out.println("Could not invoke constructOptions on " + activityObject);
			return null;
		}
	}

	public String[] getArgs() {
		ArrayList<String> arguments = new ArrayList<String>();
		OptionSpec[] options = constructOptions();
		if (options != null) {
			for (OptionSpec option : options) {
				String optionName = option.getOptionName();
				String optionValue = this.arguments.get(optionName);
				if (optionValue != null) {
					arguments.add("--" + optionName);
					arguments.add(optionValue);
				}
			}
		}
		return arguments.toArray(new String[] {});
	}

	public void run(AppUtil cb) throws Exception {
		try {
			Method operation = activityClass.getMethod(operationName);
			Class<?>[] parameterTypes = operation.getParameterTypes();
			ArrayList<Object> parameters = new ArrayList<Object>(parameterTypes.length);
			for (Class<?> parameterType : parameterTypes) {
				if (AppUtil.class.equals(parameterType)) {
					parameters.add(cb);
				} else if (String[].class.equals(parameterType)) {
					parameters.add(getArgs());
				}
			}
			operation.invoke(activityObject, parameters.toArray());
		} catch (Exception e) {
			System.out.println("Could not invoke " + operationName + " on " + activityObject);
		}
	}

}
