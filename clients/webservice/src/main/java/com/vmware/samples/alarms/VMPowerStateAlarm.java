package com.vmware.samples.alarms;

import org.w3c.dom.Element;

import com.vmware.apputils.AppUtil;
import com.vmware.apputils.OptionSpec;
import com.vmware.vim.AlarmAction;
import com.vmware.vim.AlarmExpression;
import com.vmware.vim.AlarmSpec;
import com.vmware.vim.AlarmTriggeringAction;
import com.vmware.vim.ManagedObjectReference;
import com.vmware.vim.MethodAction;
import com.vmware.vim.MethodActionArgument;
import com.vmware.vim.StateAlarmExpression;
import com.vmware.vim.StateAlarmOperator;

/**
 *<pre>
 * his is a sample which creates an Alarm to monitor the virtual
 * achine's power state
 * 
 * b&gt;Parameters:&lt;/b&gt;
 * mname     [required] Name of the virtual machine
 * larm      [required] Name of the alarms
 * 
 * b&gt;Command Line to create an alarm &quot;AlarmABC&quot; on a virtual machine&lt;/b&gt;
 * un.bat com.vmware.samples.vm.VMPowerStateAlarm --url [webserviceurl]
 * --username [username] --password  [password] --vmname [vmname]
 * --alarm [alarm]
 *</pre>
 */

public class VMPowerStateAlarm {
	private static AppUtil cb = null;
	private ManagedObjectReference _virtualMachine = null;
	private ManagedObjectReference _alarmManager;

	private void getVmMor(String vmName) throws Exception {
		_virtualMachine = cb.getServiceUtil().getDecendentMoRef(null,
				"VirtualMachine", vmName);
	}

	private StateAlarmExpression createStateAlarmExpression() throws Exception {
		StateAlarmExpression expression = new StateAlarmExpression();
		expression.setType("VirtualMachine");
		expression.setStatePath("runtime.powerState");
		expression.setOperator(StateAlarmOperator.isEqual);
		expression.setRed("poweredOff");
		return expression;
	}

	private MethodAction createPowerOnAction() {
		MethodAction action = new MethodAction();
		action.setName("PowerOnVM_Task");
		MethodActionArgument argument = new MethodActionArgument();
		argument.setValue(null);
		action.setArgument(new MethodActionArgument[] { argument });
		return action;
	}

	private AlarmTriggeringAction createAlarmTriggerAction(
			MethodAction methodAction) throws Exception {
		com.vmware.vim.AlarmTriggeringAction alarmAction = new com.vmware.vim.AlarmTriggeringAction();
		alarmAction.setYellow2Red(true);
		alarmAction.setAction(methodAction);
		return alarmAction;
	}

	private AlarmSpec createAlarmSpec(AlarmAction action,
			AlarmExpression expression) throws Exception {
		AlarmSpec spec = new AlarmSpec();
		spec.setAction(action);
		spec.setExpression(expression);
		spec.setName(cb.getOption("alarm"));
		spec
				.setDescription("Monitor VM state and send email if VM power's off");
		spec.setEnabled(true);
		return spec;
	}

	private void createAlarm(AlarmSpec alarmSpec) throws Exception {
		try {
			_alarmManager = cb.getConnection().getServiceContent()
					.getAlarmManager();
			ManagedObjectReference alarm = cb.getConnection().getService()
					.createAlarm(_alarmManager, _virtualMachine, alarmSpec);
			System.out.println("Successfully created Alarm: "
					+ alarm.get_value());
		} catch (Exception e) {
			if (e instanceof org.apache.axis.AxisFault) {
				org.apache.axis.AxisFault fault = (org.apache.axis.AxisFault) e;
				org.w3c.dom.Element[] errors = fault.getFaultDetails();
				for (Element error : errors) {
					if (error.toString().indexOf("DuplicateName") != -1) {
						System.out
								.println("Alarm with the name already exists");
					} else if (error.toString().indexOf("InvalidArgument") != -1) {
						System.out.println("Specification is invalid");
					} else if (error.toString().indexOf("InvalidName") != -1) {
						System.out.println("Alarm name is empty or too long");
					} else if (error.toString().indexOf("RuntimeFault") != -1) {
						System.out.println(error.toString());
					} else {
						System.out.println(error.toString());
					}
				}
			} else {
				throw e;
			}
		}
	}

	private static OptionSpec[] constructOptions() {
		OptionSpec[] useroptions = new OptionSpec[2];
		useroptions[0] = new OptionSpec("vmname", "String", 1,
				"Name of the virtual machine", null);
		useroptions[1] = new OptionSpec("alarm", "String", 1,
				"Name of the alarm", null);
		return useroptions;
	}

	public static void main(String[] args) throws Exception {
		VMPowerStateAlarm obj = new VMPowerStateAlarm();
		cb = AppUtil.initialize("VMPowerStateAlarm", VMPowerStateAlarm
				.constructOptions(), args);
		cb.connect();
		obj.getVmMor(cb.getOption("vmname"));
		if (obj._virtualMachine != null) {
			StateAlarmExpression expression = obj.createStateAlarmExpression();
			MethodAction methodAction = obj.createPowerOnAction();
			AlarmAction alarmAction = obj
					.createAlarmTriggerAction(methodAction);
			AlarmSpec alarmSpec = obj.createAlarmSpec(alarmAction, expression);
			obj.createAlarm(alarmSpec);
		} else {
			System.out.println("Virtual Machine " + cb.getOption("vmname")
					+ " Not Found");
		}
		cb.disConnect();
	}
}
