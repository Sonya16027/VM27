package com.vmware.apputils;

public class SmAppUtil extends AppUtil {
	private SmServiceConnection _smConnection;

	public static SmAppUtil initialize(String name, OptionSpec[] userOptions,
			String[] args) throws Exception {
		SmAppUtil cb = new SmAppUtil(name);
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

	public static SmAppUtil initialize(String name, String[] args)
			throws Exception {
		SmAppUtil cb = initialize(name, null, args);
		return cb;
	}

	public SmAppUtil(String name) {
		super(name);
	}

	@Override
	public void setup() {
		super.setup();
		_smConnection = SmServiceConnection.CreateServiceConnection();
	}

	@Override
	public void connect() throws Exception {
		super.connect();

		String url = getServiceUrl();
		url = url.replace("/sdk", "/sms/services/smService");

		String cookie = com.vmware.apputils.version.VersionUtil
				.getCookieString(this);
		cookie = cookie.split("vmware_soap_session=\"")[1];
		cookie = cookie.split("\"")[0];

		if (option_is_set("ignorecert")) {
			_smConnection.connect(url, cookie, true);
		} else {
			_smConnection.connect(url, cookie, false);
		}
	}

	@Override
	public void disConnect() throws Exception {
		super.disConnect();
		_smConnection.disconnect();
	}

	/**
	 * @return the service connection object
	 */
	public SmServiceConnection getSmConnection() {
		return _smConnection;
	}
}
