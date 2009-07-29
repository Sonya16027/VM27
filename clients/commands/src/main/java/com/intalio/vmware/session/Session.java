package com.intalio.vmware.session;

import java.util.ArrayList;
import java.util.HashMap;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import com.vmware.apputils.AppUtil;

public class Session {
	protected static AppUtil cb = null;
	protected Document sd;
	protected ArrayList<Activity> activities = new ArrayList<Activity>();
	
	public Session(Document sd) {
		this.sd = sd;
	}

	public void execute() {
		Element session = sd.getDocumentElement();
		HashMap<String, String> globalArgs = new HashMap<String, String>();
		HashMap<String, String> compoundArgs = new HashMap<String, String>();
		HashMap<String, String> activityArgs = new HashMap<String, String>();
		
		collectArguments(session.getElementsByTagName("argument"), globalArgs);
		
		NodeList topLevelActivities = session.getElementsByTagName("activity");
		for (int index = 0; index < topLevelActivities.getLength(); index++) {
			Element topLevelActivity = (Element) topLevelActivities.item(index);
			String activityName = topLevelActivity.getAttribute("name");

			NodeList compoundActivities = topLevelActivity.getElementsByTagName("activity");
			boolean compound = compoundActivities.getLength() > 0;
			
			Activity activity = null;
			
			if (compound) {
				collectArguments(topLevelActivity.getElementsByTagName("argument"), compoundArgs);
				
				activity = new CompoundActivity(compoundArgs);
				for (int compoundIndex = 0; compoundIndex < compoundActivities.getLength(); compoundIndex++) {
					Element nestedActivity = (Element) compoundActivities.item(compoundIndex);
					String nestedActivityName = nestedActivity.getAttribute("name");
					collectArguments(nestedActivity.getElementsByTagName("argument"), activityArgs);
					Object activityObject = ActivityMappings.getActivityObject(activityName);
					activity.setOperationName(ActivityMappings.getActivityOperation(nestedActivityName));
					((CompoundActivity) activity).addActivity((Activity) activityObject);
				}
				
			} else {
				collectArguments(topLevelActivity.getElementsByTagName("argument"), activityArgs);
				Object activityObject = ActivityMappings.getActivityObject(activityName);
				activity = new BasicActivity(activityObject, mergeArguments(globalArgs, activityArgs));
				activity.setOperationName(ActivityMappings.getActivityOperation(activityName));
			}
			
			if (activity != null) {
				activities.add(activity);
			}
			
		}
		
		for (Activity activity : activities) {
			executeTopLevelActivity(activity);
		}

	}
	
	protected void executeTopLevelActivity(Activity activity) {
		try {
			cb = AppUtil.initialize(activity.getClass().getSimpleName(), activity.constructOptions(), activity.getArgs());
			cb.connect();
			activity.run(cb);
			cb.disConnect();
		} catch (Exception e) {
			System.out.println("Could not execute task " + activity);
		}
	}
	
	protected void collectArguments(NodeList arguments, HashMap<String, String> argumentMap) {
		argumentMap.clear();
		if (arguments == null) {
			return;
		}
		for (int index = 0; index < arguments.getLength(); index++) {
			Element argument = (Element) arguments.item(index);
			String argumentName = argument.getAttribute("name");
			String argumentValue = argument.getNodeValue();
			if (argumentName != null && argumentValue != null) {
				argumentMap.put(argumentName, argumentValue);
			}
		}
	}
	
	protected HashMap<String, String> mergeArguments(HashMap<String, String> leftArgs, HashMap<String, String> rightArgs) {
		HashMap<String, String> mergedArgs = new HashMap<String, String>();
		mergedArgs.putAll(leftArgs);
		mergedArgs.putAll(rightArgs);
		return mergedArgs;
	}
}
