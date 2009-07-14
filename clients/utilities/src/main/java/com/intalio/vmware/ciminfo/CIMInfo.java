package com.intalio.vmware.ciminfo;

import java.util.Enumeration;
import java.util.StringTokenizer;

import javax.wbem.cim.CIMDataType;
import javax.wbem.cim.CIMInstance;
import javax.wbem.cim.CIMProperty;

public class CIMInfo {

	/**
	 * class AssociationFilter
	 * 
	 * A specification for an association traversal filter.
	 * 
	 */
	public static class AssociationFilter {
		public String srcClassName;
		public String associatedClassName;
		public String resultClassName;

		/**
		 * resultClassFilter
		 * 
		 * Format : classname1,classname2
		 */
		public String resultClassFilter;

		/**
		 * srcPropertyFilter
		 * 
		 * Format : Tokens : Value ops : = (equals) * (partially equals one in
		 * set) ? (partially equals) Expression Ops : & (boolean and) | (boolean
		 * or) ! (negate) Examples : Property=value // property equals value
		 * Property?value // value is partially contained in retrieved value
		 * Property*value1,value2,value3 // one of the values is partially
		 * contained !Property*value,value2,value3 // value is not in the set of
		 * values Property1=value1&Property2=value2 // expression with 2
		 * properties
		 */
		public String srcPropertyFilter;
	}

	private static CIMUtil cimUtil = null;

	/**
	 * createAssocFilter
	 * 
	 * Create an instance of an Association Filter
	 * 
	 * @param srcClass
	 *            source class name.
	 * @param assocClass
	 *            association class name
	 * @param resultClass
	 *            result class name. unused at present.
	 * @param resultClassFilt
	 *            comma separated list of result classes. if not empty, only the
	 *            classes in this list are used.
	 * @param srcPropFilt
	 *            property filter for source class specified Property names and
	 *            expected values are specified
	 * @return AssociationFilter
	 */
	public static AssociationFilter createAssocFilter(String srcClass,
			String assocClass, String resultClass, String resultClassFilt,
			String srcPropFilt) {

		AssociationFilter inst = new AssociationFilter();
		inst.srcClassName = srcClass;
		inst.associatedClassName = assocClass;
		inst.resultClassName = resultClass;
		inst.resultClassFilter = resultClassFilt;
		inst.srcPropertyFilter = srcPropFilt;

		return inst;
	}

	public CIMInfo(boolean printNullValues, boolean printOnlyKeys,
			boolean ignoreCerts) {
		cimUtil = new CIMUtil(printNullValues, printOnlyKeys, ignoreCerts);
	}

	private boolean compareOpVal(String match, String prop, String op,
			boolean isArray) {
		if (!isArray) {
			if (op.equals("=")) {
				return match.equals(prop);
			} else if (op.equals("*")) {
				StringTokenizer matchToks = new StringTokenizer(match, ",");
				boolean isMatched = false;
				while (matchToks.hasMoreTokens() && !isMatched) {
					String mTok = matchToks.nextToken();
					isMatched = prop.indexOf(mTok) >= 0;
				}
				return isMatched;
			}
		}
		return prop.indexOf(match) >= 0;
	}

	/**
	 * execOperation
	 * 
	 * Get a single instance of the class provided, and Run the specified
	 * operation for that instance of the class.
	 * 
	 * @param className
	 *            the class name to get an instance of
	 * @param operation
	 *            the operation name to run
	 */
	public void execOperation(String className, String operation) {
		Enumeration enu = cimUtil.enumerateCIMInstances(className);
		if (enu == null || !enu.hasMoreElements()) {
			System.out.println("No instance found enumerating : " + className);
			return;
		}

		if (operation == null || operation.length() == 0) {
			System.out
					.println("No operation name specified for : " + className);
			return;
		}

		CIMInstance inst = (CIMInstance) enu.nextElement();
		cimUtil.execOperation(inst, operation);
	}

	/**
	 * getAssociatedCIMInstance
	 * 
	 * print all instances of classes retrieved using association filter
	 * specified
	 * 
	 * @param assocFilt
	 *            association filtering into
	 */
	public void getAssociatedCIMInstance(CIMInfo.AssociationFilter assocFilt) {
		if (assocFilt == null) {
			System.out.println("No association information provided.");
			return;
		}

		Enumeration srcEnum = cimUtil
				.enumerateCIMInstances(assocFilt.srcClassName);
		if (srcEnum == null || !srcEnum.hasMoreElements()) {
			System.out.println("No instance found for : "
					+ assocFilt.srcClassName);
			return;
		}

		while (srcEnum.hasMoreElements()) {
			CIMInstance inst = (CIMInstance) srcEnum.nextElement();
			if (!isInstanceMatch(inst, assocFilt.srcPropertyFilter)) {
				continue;
			}

			Enumeration assocEnum = cimUtil.associatedCIMInstances(inst,
					assocFilt.associatedClassName);
			if (assocEnum == null || !assocEnum.hasMoreElements()) {
				System.out.println("For : ");
				cimUtil.printCimObjectPath(inst);
				System.out.println("No instances found using Association : "
						+ assocFilt.associatedClassName);
				continue;
			}

			while (assocEnum.hasMoreElements()) {
				CIMInstance assocInst = (CIMInstance) assocEnum.nextElement();

				// filter out classnames we dont want
				String assocInstClass = assocInst.getClassName();
				if (isClassUsed(assocFilt.resultClassFilter, assocInstClass)) {
					cimUtil.printCimInstance(inst);
					System.out.println("traverses : "
							+ assocFilt.associatedClassName + " for : ");
					cimUtil.printCimInstance(assocInst);
				}

			}

		}

	}

	public void init(String nsStr, String url, String userName, String password) {
		cimUtil.init(nsStr, url, userName, password);
	}

	/**
	 * isClassUsed
	 * 
	 * checks if the class is in the list of classes to be used
	 * 
	 * @param classFilter
	 *            comma separated list of CIM leaf class names
	 * @param className
	 *            the class name to be verified
	 * @return true if the class is in the allowed list
	 */
	private boolean isClassUsed(String classFilter, String className) {
		return classFilter == null || classFilter.indexOf(className) >= 0;
	}

	/**
	 * isInstanceMatch
	 * 
	 * If a propertyFilter is specified, checks if the CIM instance has a
	 * property that matches the filter criteria specified.
	 * 
	 * @param inst
	 *            the CIM instance to validate
	 * @param propertyFilter
	 *            the property filter specification
	 * @see AssociationFilter.srcPropertyFilter
	 * @return true if the instance matches the filter criteria specified.
	 */
	private boolean isInstanceMatch(CIMInstance inst, String propertyFilter) {
		boolean instMatched = false;

		if (propertyFilter != null && propertyFilter.length() > 0) {
			// multiple property logical and
			StringTokenizer strTok = new StringTokenizer(propertyFilter,
					"!=*?&|", true);

			while (strTok.hasMoreTokens()) {
				String negateOp = "";
				String propName = strTok.nextToken();
				if (propName.equals("!")) {
					negateOp = propName;
					propName = strTok.nextToken();
				}
				String compareOp = strTok.nextToken();
				String matchValue = strTok.nextToken();
				if ("=*?".indexOf(compareOp) < 0) {
					return false; // invalid comparison op, no match.
				}
				String relnOp = "|";
				if (strTok.hasMoreTokens()) {
					relnOp = strTok.nextToken();
					if (!relnOp.equals("&") && !relnOp.equals("|")) {
						return false; // invalid expression operation, no match.
					}
				}

				CIMProperty matchProp = inst.getProperty(propName);
				if (matchProp != null && matchProp.getValue() != null
						&& matchProp.getValue().getValue() != null) {

					// this can be extended to support other types as well
					if (matchProp.getType().getType() == CIMDataType.STRING) {
						String propValue = (String) matchProp.getValue()
								.getValue();
						instMatched = negateOpVal(negateOp, relnOpVal(relnOp,
								instMatched, compareOpVal(matchValue,
										propValue, compareOp, false)));
					} else if (matchProp.getType().isArrayType()) {
						// supports array values that have unique elements like
						// states
						String propValue = matchProp.getValue().getValue()
								.toString();
						instMatched = negateOpVal(negateOp, relnOpVal(relnOp,
								instMatched, compareOpVal(matchValue,
										propValue, compareOp, true)));
					}
				}
			}
		} else {
			instMatched = true;
		}

		return instMatched;
	}

	private boolean negateOpVal(String negateOp, boolean prevVal) {
		if (negateOp.equals("!")) {
			return !prevVal;
		}
		return prevVal;
	}

	private boolean relnOpVal(String relnOp, boolean prevVal, boolean newVal) {
		if (relnOp.equals("&")) {
			return prevVal && newVal;
		}

		// defaults to ||
		return prevVal || newVal;
	}

	/**
	 * retrieveCIMInstance
	 * 
	 * retrieves instances of the CIM class specified, and prints them out.
	 * 
	 * @param className
	 *            name of the CIM class
	 */
	public void retrieveCIMInstance(String className) {
		Enumeration enu = cimUtil.enumerateCIMInstances(className);
		if (enu == null || !enu.hasMoreElements()) {
			System.out.println("No instance found enumerating : " + className);
			return;
		}

		while (enu.hasMoreElements()) {
			CIMInstance inst = (CIMInstance) enu.nextElement();
			cimUtil.printCimInstance(inst);
		}
	}

}
