package com.vmware.apputils.version;

import com.vmware.apputils.OptionSpec;

public class ExtendedAppUtil extends com.vmware.apputils.AppUtil {

	private com.vmware.apputils.vim25.ServiceConnection _connection;
	private com.vmware.apputils.vim25.ServiceUtil _svcUtil;

	public static ExtendedAppUtil initialize(String name,
			OptionSpec[] userOptions, String[] args) throws Exception {
		ExtendedAppUtil cb = new ExtendedAppUtil(name);
		if (userOptions != null) {
			cb.addOptions(userOptions);
			cb.parseInput(args);
			cb.validate();
		} else {
			cb.parseInput(args);
			cb.validate();
		}
		return cb;
	}

	public static ExtendedAppUtil initialize(String name, String[] args)
			throws Exception {
		ExtendedAppUtil cb = initialize(name, null, args);
		return cb;
	}

	public ExtendedAppUtil(String name) {
		super(name);
		setup(name);
	}

	public void setup(String name) {
		_svcUtil = com.vmware.apputils.vim25.ServiceUtil.CreateServiceUtil();
		_connection = com.vmware.apputils.vim25.ServiceConnection
				.CreateServiceConnection("ServiceInstance");
	}

	public void connect(String cookieString) throws Exception {
		// log.logLine("Started " );
		try {
			initConnection();
			getServiceUtil3().clientLoadSession(cookieString);
		} catch (Exception e) {
			log.logLine("Exception running : " + getAppName());
			getUtil().logException(e);
			log.close();
			throw new com.vmware.apputils.ArgumentHandlingException(
					"Exception running : " + getAppName());
		}
	}

	@Override
	public void initConnection() throws Exception {
		getServiceUtil3().init(this, _connection);
	}

	public com.vmware.apputils.vim25.ServiceUtil getServiceUtil3() {
		return _svcUtil;
	}

	public com.vmware.apputils.vim25.ServiceConnection getServiceConnection3() {
		return _connection;
	}

	@Override
	public void disConnect() throws Exception {
		// log.logLine("Ended " + getAppName());
		try {
			getServiceUtil3().clientDisconnect();
		} catch (Exception e) {
			log.logLine("Exception running : " + getAppName());
			getUtil().logException(e);
			log.close();
			throw new com.vmware.apputils.ArgumentHandlingException(
					"Exception running : " + getAppName());
		}
	}

	@Override
	public void validate(Object className, String functionName)
			throws Exception {
		// DO NOTHING
	}
}