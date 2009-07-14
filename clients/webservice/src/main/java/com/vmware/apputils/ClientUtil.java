package com.vmware.apputils;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.vmware.vim.MethodFault;

/*
 * Useful Client utility functions.
 */
public class ClientUtil {

	private AppUtil _cb;

	public ClientUtil(AppUtil c) {
		_cb = c;
	}

	public void printUsage() {
		_cb.displayUsage();
	}

	/*
	 * Prompt user for an integer value
	 */
	public int getIntInput(String prompt, int defaultVal) throws Exception {
		String input = getStrInput(prompt);
		if (input == null || input.length() == 0) {
			return defaultVal;
		} else {
			return Integer.parseInt(input);
		}
	}

	/*
	 * Prompt user for an integer value
	 */
	public long getLongInput(String prompt, long defaultVal) throws Exception {
		String input = getStrInput(prompt);
		if (input == null || input.length() == 0) {
			return defaultVal;
		} else {
			return Long.parseLong(input);
		}
	}

	public String getStrInput(String prompt) throws Exception {
		System.out.print(prompt);
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		return reader.readLine();
	}

	/**
	 * Log the Exception - fault or otherwise TODO: Enhance to handle different
	 * detail contents.
	 */
	public void logException(Exception e) {
		if (e instanceof MethodFault) {
			MethodFault mf = (MethodFault) e;
			logFault(mf);
		} else {
			_cb.getLog().logLine(
					"Caught Exception : " + " Exception : "
							+ e.getClass().getName() + " Message : "
							+ e.getMessage() + " StackTrace : ");
			e.printStackTrace();
		}
	}

	/**
	 * Log a fault.
	 */
	public void logFault(MethodFault mf) {
		_cb.getLog().logLine(
				"Caught Fault - " + "\n Type : " + mf.getClass().getName()
						+ "\n Actor : " + mf.getFaultActor() + "\n Code : "
						+ mf.getFaultNode() + "\n Reason : "
						+ mf.getFaultReason() + "\n Fault String : "
						+ mf.getFaultString());
	}
}
