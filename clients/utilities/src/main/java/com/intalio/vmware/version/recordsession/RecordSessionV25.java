package com.intalio.vmware.version.recordsession;

import java.util.ArrayList;

import com.vmware.apputils.version.ExtendedAppUtil;
import com.vmware.apputils.version.VersionUtil;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.VirtualMachineConfigSpec;
import com.vmware.vim25.VirtualMachineFlagInfo;
import com.vmware.vim25.VirtualMachineSnapshotTree;

public class RecordSessionV25 {
	public static void recordSession(
			com.vmware.vim.ManagedObjectReference vmmor, ArrayList apiVersions,
			String[] args, String cookieString) throws Exception {
		ExtendedAppUtil ecb = null;
		ecb = ExtendedAppUtil.initialize("RecordSession", RecordSession
				.constructOptions(), args);
		ecb.connect(cookieString);
		ManagedObjectReference vmmor1 = VersionUtil
				.convertManagedObjectReference(vmmor);

		try {
			boolean flag = VersionUtil
					.isApiVersionSupported(apiVersions, "4.0");
			if (flag) {
				if (ecb.get_option("snapshotname") == null
						|| ecb.get_option("description") == null) {
					System.out
							.println("snapshotname and description arguments are "
									+ "mandatory for recording session feature");
					return;
				}
				VirtualMachineFlagInfo flagInfo = new VirtualMachineFlagInfo();
				flagInfo.setRecordReplayEnabled(true);
				VirtualMachineConfigSpec configSpec = new VirtualMachineConfigSpec();
				configSpec.setFlags(flagInfo);
				ManagedObjectReference reconfigTaskMOR = ecb
						.getServiceConnection3().getService().reconfigVM_Task(
								vmmor1, configSpec);
				String reconfigResult = ecb.getServiceUtil3().waitForTask(
						reconfigTaskMOR);
				if (reconfigResult.equalsIgnoreCase("sucess")) {
					ManagedObjectReference recordingTaskMOR = ecb
							.getServiceConnection3().getService()
							.startRecording_Task(vmmor1,
									ecb.get_option("snapshotname"),
									ecb.get_option("description"));
					String recordingResult = ecb.getServiceUtil3().waitForTask(
							recordingTaskMOR);
					if (recordingResult.equalsIgnoreCase("sucess")) {
						ManagedObjectReference stopRecordingTaskMOR = ecb
								.getServiceConnection3().getService()
								.stopRecording_Task(vmmor1);
						String stopResult = ecb.getServiceUtil3().waitForTask(
								stopRecordingTaskMOR);

						if (stopResult.equalsIgnoreCase("sucess")) {
							System.out.println("Session recorded successfully");
						} else {
							System.out.println("Stop Recording failed");
						}
					} else {
						System.out.println("Recording operation failed");
					}
				} else {
					System.out.println("Reconfig operation failed");
				}
			} else {
				VirtualMachineSnapshotTree[] tree = (VirtualMachineSnapshotTree[]) ecb
						.getServiceUtil3().getDynamicProperty(vmmor1,
								"snapshot.rootSnapshotList");
				if (tree != null && tree.length != 0) {
					ManagedObjectReference taskMor = ecb
							.getServiceConnection3().getService()
							.removeAllSnapshots_Task(vmmor1);
					String res = ecb.getServiceUtil3().waitForTask(taskMor);
					if (res.equalsIgnoreCase("sucess")) {
						System.out
								.println("Removed all the snapshot successfully");
					}
				} else {
					System.out
							.println("No snapshot found for this virtual machine");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}