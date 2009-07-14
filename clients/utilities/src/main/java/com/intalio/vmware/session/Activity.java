package com.intalio.vmware.session;

import com.vmware.apputils.AppUtil;
import com.vmware.apputils.OptionSpec;

public interface Activity {
	public OptionSpec[] constructOptions();

	public String[] getArgs();

	public void run(AppUtil cb) throws Exception;
}
