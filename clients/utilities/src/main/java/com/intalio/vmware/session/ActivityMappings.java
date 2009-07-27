package com.intalio.vmware.session;

import java.util.HashMap;

public class ActivityMappings {
	private static HashMap<String, Object> activityObjects = new HashMap<String, Object>();
	private static HashMap<String, String> operationNames = new HashMap<String, String>();
	
	static {
		// map activity name to activity class name
		activityObjects.put("vmclone", new com.intalio.vmware.vm.VMClone());
		
		// map activiy name to activity operation's method name
		operationNames.put("vmclone", "cloneVM");
	}
	
	
	public static Object getActivityObject(String activityName) {
		return activityObjects.get(activityName);
		
	}
	
	public static String getActivityOperation(String activityName) {
		return operationNames.get(activityName);
	}
}
