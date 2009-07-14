package com.vmware.samples.ciminfo;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

import javax.wbem.cim.CIMInstance;
import javax.wbem.cim.CIMNameSpace;
import javax.wbem.cim.CIMObjectPath;
import javax.wbem.cim.CIMProperty;
import javax.wbem.cim.CIMValue;
import javax.wbem.client.CIMClient;
import javax.wbem.client.PasswordCredential;
import javax.wbem.client.UserPrincipal;

public class CIMUtil {
	// pretty printing constants
	private final int TABSTOP = 3;
	private final int KEYPREFIXLEN = 6;
	private final int VALSUFFIXLEN = 2;

	private CIMClient client = null;

	private boolean printNullValues;
	private boolean printOnlyKeys;
	private boolean ignoreCerts;

	public CIMUtil(boolean printNullVals, boolean printKeys, boolean ignorecerts) {
		printNullValues = printNullVals;
		printOnlyKeys = printKeys;
		ignoreCerts = ignorecerts;
	}

	public void init(String nsStr, String url, String userName, String password) {
		if (ignoreCerts) {
			System.setProperty(
					"org.apache.axis.components.net.SecureSocketFactory",
					"org.apache.axis.components.net.SunFakeTrustSocketFactory");
		}

		try {
			CIMNameSpace ns = new CIMNameSpace(url, nsStr);
			UserPrincipal user = new UserPrincipal(userName);
			PasswordCredential passwordCre = new PasswordCredential(password);

			// CIMClient is deprecated, but, the WBEMClient interface doesnt
			// exist
			client = new CIMClient(ns, user, passwordCre, CIMClient.CIM_XML);
		} catch (Exception e) {
			System.out.println("Unable to initialize CIMUtil : "
					+ e.getMessage());
		}
	}

	/**
	 * enumerateCIMInstances
	 * 
	 * wrapper to provide an enumerator over all the instances of the class
	 * specified parameters are a subset of the enumerateInstance params.
	 * parameters are as defined in the Wbem Javadoc.
	 * 
	 * @param className
	 * @param deep
	 * @param propertyList
	 * @return Enumeration over the instances or null
	 */
	public Enumeration enumerateCIMInstances(String className, boolean deep,
			String[] propertyList) {
		if (client == null) {
			System.out.println("WBEMClient not initialized");
			return null;
		}

		Enumeration enu = null;

		try {
			CIMObjectPath cop = new CIMObjectPath(className);
			enu = client.enumerateInstances(cop, deep, false, false, false,
					propertyList);
		} catch (Exception e) {
			System.out.println("Enumerating : " + className + " : Exception "
					+ e.getMessage());
		}

		return enu;
	}

	/**
	 * enumerateCIMInstances
	 * 
	 * simpler wrappers to enumerate over instances of the class specified
	 * 
	 * @param className
	 * @return Enumeration over the instances or null
	 */
	public Enumeration enumerateCIMInstances(String className) {
		Enumeration enu = enumerateCIMInstances(className, false, null);
		return enu;
	}

	public Enumeration enumerateCIMInstances(String className, boolean deep) {
		Enumeration enu = enumerateCIMInstances(className, deep, null);
		return enu;
	}

	public Enumeration enumerateCIMInstances(String className,
			String[] propertyList) throws Exception {
		Enumeration enu = enumerateCIMInstances(className, false, propertyList);
		return enu;
	}

	/**
	 * associatedCIMInstances
	 * 
	 * wrapper for associators call with some basic error handling parameters
	 * are as defined in the Wbem Javadoc.
	 * 
	 * @param inst
	 * @param assocatedClassName
	 * @param resultClassName
	 * @param role
	 * @param resultRole
	 * @param includeQualifiers
	 * @param includeClassOrigin
	 * @param propertyList
	 * @return Enumeration
	 */
	public Enumeration associatedCIMInstances(CIMInstance inst,
			String assocatedClassName, String resultClassName, String role,
			String resultRole, boolean includeQualifiers,
			boolean includeClassOrigin, String[] propertyList) {

		if (client == null) {
			System.out.println("WBEMClient not initialized");
			return null;
		}

		Enumeration enu = null;

		if (inst != null) {
			try {
				enu = client.associators(inst.getObjectPath(),
						assocatedClassName, resultClassName, role, resultRole,
						includeQualifiers, includeClassOrigin, propertyList);
			} catch (Exception e) {
				System.out.println("Associators : "
						+ inst.getObjectPath().getObjectName()
						+ " Exception : " + e.getMessage());
			}
		}

		return enu;
	}

	/**
	 * associatedCIMInstances
	 * 
	 * another simpler wrapper with fewer parameters.
	 * 
	 * @param cimInst
	 * @param assocatedClassName
	 * @return Enumeration
	 */
	public Enumeration associatedCIMInstances(CIMInstance cimInst,
			String assocatedClassName) {

		Enumeration enu = associatedCIMInstances(cimInst, assocatedClassName,
				null, null, null, true, true, null);

		return enu;
	}

	/**
	 * execOperation
	 * 
	 * execute the specified operation on the instance passed in
	 * 
	 * @param inst
	 *            instance to execute operation on
	 * @param op
	 *            the operation to execute
	 */
	public void execOperation(CIMInstance inst, String op) {
		if (client == null) {
			System.out.println("WBEMClient not initialized");
			return;
		}

		CIMValue retVal = null;
		try {
			retVal = client.invokeMethod(inst.getObjectPath(), op, null, null);

			if (retVal != null) {
				System.out.println(op + " return value : "
						+ retVal.getValue().toString());
			} else {
				System.out.println(op + " has no return value.");
			}
		} catch (Exception e) {
			System.out.println("InvokeMethod : " + op + " : Exception : "
					+ e.getMessage());
		}
	}

	/**
	 * CIMObjectPath, CIMInstance, pretty printing methods
	 * 
	 */

	public void printCimObjectPath(CIMObjectPath path) {
		printCimObjectPath(path, 0);
	}

	public void printCimObjectPath(CIMInstance inst) {
		if (inst == null) {
			return;
		}
		printCimObjectPath(inst.getObjectPath(), 0);
	}

	public void printCimInstance(CIMInstance inst) {
		if (inst == null) {
			return;
		}
		System.out.println("Classname : " + inst.getClassName());
		Vector properties = inst.getProperties();
		Iterator pit = properties.iterator();

		try {
			while (pit.hasNext()) {
				CIMProperty prop = (CIMProperty) pit.next();
				printCimProperty(prop, TABSTOP);
			}
		} catch (Exception e) {
			System.out.println("Dumping Instance : Exception : "
					+ e.getMessage());
		}
	}

	private void printCimObjectPath(CIMObjectPath path, int prefixWhiteSpace) {
		if (path == null) {
			return;
		}
		Vector keys = path.getKeys();
		Iterator kit = keys.iterator();
		try {
			printPrefixWhiteSpace(prefixWhiteSpace);
			System.out.println("NS : " + path.getNameSpace());
			printPrefixWhiteSpace(prefixWhiteSpace);
			System.out.println("Classname : " + path.getObjectName());
			while (kit.hasNext()) {
				CIMProperty keyProp = (CIMProperty) kit.next();
				printCimProperty(keyProp, prefixWhiteSpace + TABSTOP);
			}
		} catch (Exception e) {
			System.out.println("Dumping ObjectPath : Exception : "
					+ e.getMessage());
		}
	}

	private void printCimProperty(CIMProperty prop, int prefixWhiteSpace) {
		if (prop == null) {
			return;
		}
		try {
			if (!prop.isKey()
					&& ((prop.getValue() == null && !printNullValues) || printOnlyKeys)) {
				return;
			}
			printPrefixWhiteSpace(prefixWhiteSpace);

			if (prop.isKey()) {
				System.out.print("[Key] ");
			} else {
				printPrefixWhiteSpace(KEYPREFIXLEN);
			}
			System.out.print(prop.getName() + "=");

			if (prop.getValue() == null) {
				System.out.println("");
			} else if (prop.getValue().isNull()) {
				System.out.println("NULL");
			} else if (prop.isReference()) {
				int objPathWhiteSpace = prefixWhiteSpace + KEYPREFIXLEN
						+ prop.getName().length() + VALSUFFIXLEN;
				printCimObjectPath((CIMObjectPath) prop.getValue().getValue(),
						objPathWhiteSpace);
			} else if (prop.getType().isArrayType()) {
				printValueArray(prop.getValue());
			} else {
				System.out.println(prop.getValue().toString());
			}
		} catch (Exception e) {
			System.out.println("Dumping property : Exception : "
					+ e.getMessage());
		}
	}

	private void printValueArray(CIMValue arrayVal) {
		System.out.print("{");
		System.out.print(arrayVal.toString());
		System.out.println("}");
	}

	private void printPrefixWhiteSpace(int prefixWhiteSpace) {
		while (prefixWhiteSpace > 0) {
			System.out.print(" ");
			--prefixWhiteSpace;
		}
	}
}
