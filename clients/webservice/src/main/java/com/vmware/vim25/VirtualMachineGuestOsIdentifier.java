/**
 * VirtualMachineGuestOsIdentifier.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VirtualMachineGuestOsIdentifier implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private java.lang.String _value_;
	private static java.util.HashMap _table_ = new java.util.HashMap();

	// Constructor
	protected VirtualMachineGuestOsIdentifier(java.lang.String value) {
		_value_ = value;
		_table_.put(_value_, this);
	}

	public static final java.lang.String _dosGuest = "dosGuest";
	public static final java.lang.String _win31Guest = "win31Guest";
	public static final java.lang.String _win95Guest = "win95Guest";
	public static final java.lang.String _win98Guest = "win98Guest";
	public static final java.lang.String _winMeGuest = "winMeGuest";
	public static final java.lang.String _winNTGuest = "winNTGuest";
	public static final java.lang.String _win2000ProGuest = "win2000ProGuest";
	public static final java.lang.String _win2000ServGuest = "win2000ServGuest";
	public static final java.lang.String _win2000AdvServGuest = "win2000AdvServGuest";
	public static final java.lang.String _winXPHomeGuest = "winXPHomeGuest";
	public static final java.lang.String _winXPProGuest = "winXPProGuest";
	public static final java.lang.String _winXPPro64Guest = "winXPPro64Guest";
	public static final java.lang.String _winNetWebGuest = "winNetWebGuest";
	public static final java.lang.String _winNetStandardGuest = "winNetStandardGuest";
	public static final java.lang.String _winNetEnterpriseGuest = "winNetEnterpriseGuest";
	public static final java.lang.String _winNetDatacenterGuest = "winNetDatacenterGuest";
	public static final java.lang.String _winNetBusinessGuest = "winNetBusinessGuest";
	public static final java.lang.String _winNetStandard64Guest = "winNetStandard64Guest";
	public static final java.lang.String _winNetEnterprise64Guest = "winNetEnterprise64Guest";
	public static final java.lang.String _winLonghornGuest = "winLonghornGuest";
	public static final java.lang.String _winLonghorn64Guest = "winLonghorn64Guest";
	public static final java.lang.String _winNetDatacenter64Guest = "winNetDatacenter64Guest";
	public static final java.lang.String _winVistaGuest = "winVistaGuest";
	public static final java.lang.String _winVista64Guest = "winVista64Guest";
	public static final java.lang.String _windows7Guest = "windows7Guest";
	public static final java.lang.String _windows7_64Guest = "windows7_64Guest";
	public static final java.lang.String _windows7Server64Guest = "windows7Server64Guest";
	public static final java.lang.String _freebsdGuest = "freebsdGuest";
	public static final java.lang.String _freebsd64Guest = "freebsd64Guest";
	public static final java.lang.String _redhatGuest = "redhatGuest";
	public static final java.lang.String _rhel2Guest = "rhel2Guest";
	public static final java.lang.String _rhel3Guest = "rhel3Guest";
	public static final java.lang.String _rhel3_64Guest = "rhel3_64Guest";
	public static final java.lang.String _rhel4Guest = "rhel4Guest";
	public static final java.lang.String _rhel4_64Guest = "rhel4_64Guest";
	public static final java.lang.String _rhel5Guest = "rhel5Guest";
	public static final java.lang.String _rhel5_64Guest = "rhel5_64Guest";
	public static final java.lang.String _rhel6Guest = "rhel6Guest";
	public static final java.lang.String _rhel6_64Guest = "rhel6_64Guest";
	public static final java.lang.String _suseGuest = "suseGuest";
	public static final java.lang.String _suse64Guest = "suse64Guest";
	public static final java.lang.String _slesGuest = "slesGuest";
	public static final java.lang.String _sles64Guest = "sles64Guest";
	public static final java.lang.String _sles10Guest = "sles10Guest";
	public static final java.lang.String _sles10_64Guest = "sles10_64Guest";
	public static final java.lang.String _sles11Guest = "sles11Guest";
	public static final java.lang.String _sles11_64Guest = "sles11_64Guest";
	public static final java.lang.String _nld9Guest = "nld9Guest";
	public static final java.lang.String _oesGuest = "oesGuest";
	public static final java.lang.String _sjdsGuest = "sjdsGuest";
	public static final java.lang.String _mandrivaGuest = "mandrivaGuest";
	public static final java.lang.String _mandriva64Guest = "mandriva64Guest";
	public static final java.lang.String _turboLinuxGuest = "turboLinuxGuest";
	public static final java.lang.String _turboLinux64Guest = "turboLinux64Guest";
	public static final java.lang.String _ubuntuGuest = "ubuntuGuest";
	public static final java.lang.String _ubuntu64Guest = "ubuntu64Guest";
	public static final java.lang.String _debian4Guest = "debian4Guest";
	public static final java.lang.String _debian4_64Guest = "debian4_64Guest";
	public static final java.lang.String _debian5Guest = "debian5Guest";
	public static final java.lang.String _debian5_64Guest = "debian5_64Guest";
	public static final java.lang.String _asianux3Guest = "asianux3Guest";
	public static final java.lang.String _asianux3_64Guest = "asianux3_64Guest";
	public static final java.lang.String _asianux4Guest = "asianux4Guest";
	public static final java.lang.String _asianux4_64Guest = "asianux4_64Guest";
	public static final java.lang.String _other24xLinuxGuest = "other24xLinuxGuest";
	public static final java.lang.String _other26xLinuxGuest = "other26xLinuxGuest";
	public static final java.lang.String _otherLinuxGuest = "otherLinuxGuest";
	public static final java.lang.String _other24xLinux64Guest = "other24xLinux64Guest";
	public static final java.lang.String _other26xLinux64Guest = "other26xLinux64Guest";
	public static final java.lang.String _otherLinux64Guest = "otherLinux64Guest";
	public static final java.lang.String _solaris6Guest = "solaris6Guest";
	public static final java.lang.String _solaris7Guest = "solaris7Guest";
	public static final java.lang.String _solaris8Guest = "solaris8Guest";
	public static final java.lang.String _solaris9Guest = "solaris9Guest";
	public static final java.lang.String _solaris10Guest = "solaris10Guest";
	public static final java.lang.String _solaris10_64Guest = "solaris10_64Guest";
	public static final java.lang.String _os2Guest = "os2Guest";
	public static final java.lang.String _netware4Guest = "netware4Guest";
	public static final java.lang.String _netware5Guest = "netware5Guest";
	public static final java.lang.String _netware6Guest = "netware6Guest";
	public static final java.lang.String _openServer5Guest = "openServer5Guest";
	public static final java.lang.String _openServer6Guest = "openServer6Guest";
	public static final java.lang.String _unixWare7Guest = "unixWare7Guest";
	public static final java.lang.String _darwinGuest = "darwinGuest";
	public static final java.lang.String _darwin64Guest = "darwin64Guest";
	public static final java.lang.String _otherGuest = "otherGuest";
	public static final java.lang.String _otherGuest64 = "otherGuest64";
	public static final VirtualMachineGuestOsIdentifier dosGuest = new VirtualMachineGuestOsIdentifier(
			_dosGuest);
	public static final VirtualMachineGuestOsIdentifier win31Guest = new VirtualMachineGuestOsIdentifier(
			_win31Guest);
	public static final VirtualMachineGuestOsIdentifier win95Guest = new VirtualMachineGuestOsIdentifier(
			_win95Guest);
	public static final VirtualMachineGuestOsIdentifier win98Guest = new VirtualMachineGuestOsIdentifier(
			_win98Guest);
	public static final VirtualMachineGuestOsIdentifier winMeGuest = new VirtualMachineGuestOsIdentifier(
			_winMeGuest);
	public static final VirtualMachineGuestOsIdentifier winNTGuest = new VirtualMachineGuestOsIdentifier(
			_winNTGuest);
	public static final VirtualMachineGuestOsIdentifier win2000ProGuest = new VirtualMachineGuestOsIdentifier(
			_win2000ProGuest);
	public static final VirtualMachineGuestOsIdentifier win2000ServGuest = new VirtualMachineGuestOsIdentifier(
			_win2000ServGuest);
	public static final VirtualMachineGuestOsIdentifier win2000AdvServGuest = new VirtualMachineGuestOsIdentifier(
			_win2000AdvServGuest);
	public static final VirtualMachineGuestOsIdentifier winXPHomeGuest = new VirtualMachineGuestOsIdentifier(
			_winXPHomeGuest);
	public static final VirtualMachineGuestOsIdentifier winXPProGuest = new VirtualMachineGuestOsIdentifier(
			_winXPProGuest);
	public static final VirtualMachineGuestOsIdentifier winXPPro64Guest = new VirtualMachineGuestOsIdentifier(
			_winXPPro64Guest);
	public static final VirtualMachineGuestOsIdentifier winNetWebGuest = new VirtualMachineGuestOsIdentifier(
			_winNetWebGuest);
	public static final VirtualMachineGuestOsIdentifier winNetStandardGuest = new VirtualMachineGuestOsIdentifier(
			_winNetStandardGuest);
	public static final VirtualMachineGuestOsIdentifier winNetEnterpriseGuest = new VirtualMachineGuestOsIdentifier(
			_winNetEnterpriseGuest);
	public static final VirtualMachineGuestOsIdentifier winNetDatacenterGuest = new VirtualMachineGuestOsIdentifier(
			_winNetDatacenterGuest);
	public static final VirtualMachineGuestOsIdentifier winNetBusinessGuest = new VirtualMachineGuestOsIdentifier(
			_winNetBusinessGuest);
	public static final VirtualMachineGuestOsIdentifier winNetStandard64Guest = new VirtualMachineGuestOsIdentifier(
			_winNetStandard64Guest);
	public static final VirtualMachineGuestOsIdentifier winNetEnterprise64Guest = new VirtualMachineGuestOsIdentifier(
			_winNetEnterprise64Guest);
	public static final VirtualMachineGuestOsIdentifier winLonghornGuest = new VirtualMachineGuestOsIdentifier(
			_winLonghornGuest);
	public static final VirtualMachineGuestOsIdentifier winLonghorn64Guest = new VirtualMachineGuestOsIdentifier(
			_winLonghorn64Guest);
	public static final VirtualMachineGuestOsIdentifier winNetDatacenter64Guest = new VirtualMachineGuestOsIdentifier(
			_winNetDatacenter64Guest);
	public static final VirtualMachineGuestOsIdentifier winVistaGuest = new VirtualMachineGuestOsIdentifier(
			_winVistaGuest);
	public static final VirtualMachineGuestOsIdentifier winVista64Guest = new VirtualMachineGuestOsIdentifier(
			_winVista64Guest);
	public static final VirtualMachineGuestOsIdentifier windows7Guest = new VirtualMachineGuestOsIdentifier(
			_windows7Guest);
	public static final VirtualMachineGuestOsIdentifier windows7_64Guest = new VirtualMachineGuestOsIdentifier(
			_windows7_64Guest);
	public static final VirtualMachineGuestOsIdentifier windows7Server64Guest = new VirtualMachineGuestOsIdentifier(
			_windows7Server64Guest);
	public static final VirtualMachineGuestOsIdentifier freebsdGuest = new VirtualMachineGuestOsIdentifier(
			_freebsdGuest);
	public static final VirtualMachineGuestOsIdentifier freebsd64Guest = new VirtualMachineGuestOsIdentifier(
			_freebsd64Guest);
	public static final VirtualMachineGuestOsIdentifier redhatGuest = new VirtualMachineGuestOsIdentifier(
			_redhatGuest);
	public static final VirtualMachineGuestOsIdentifier rhel2Guest = new VirtualMachineGuestOsIdentifier(
			_rhel2Guest);
	public static final VirtualMachineGuestOsIdentifier rhel3Guest = new VirtualMachineGuestOsIdentifier(
			_rhel3Guest);
	public static final VirtualMachineGuestOsIdentifier rhel3_64Guest = new VirtualMachineGuestOsIdentifier(
			_rhel3_64Guest);
	public static final VirtualMachineGuestOsIdentifier rhel4Guest = new VirtualMachineGuestOsIdentifier(
			_rhel4Guest);
	public static final VirtualMachineGuestOsIdentifier rhel4_64Guest = new VirtualMachineGuestOsIdentifier(
			_rhel4_64Guest);
	public static final VirtualMachineGuestOsIdentifier rhel5Guest = new VirtualMachineGuestOsIdentifier(
			_rhel5Guest);
	public static final VirtualMachineGuestOsIdentifier rhel5_64Guest = new VirtualMachineGuestOsIdentifier(
			_rhel5_64Guest);
	public static final VirtualMachineGuestOsIdentifier rhel6Guest = new VirtualMachineGuestOsIdentifier(
			_rhel6Guest);
	public static final VirtualMachineGuestOsIdentifier rhel6_64Guest = new VirtualMachineGuestOsIdentifier(
			_rhel6_64Guest);
	public static final VirtualMachineGuestOsIdentifier suseGuest = new VirtualMachineGuestOsIdentifier(
			_suseGuest);
	public static final VirtualMachineGuestOsIdentifier suse64Guest = new VirtualMachineGuestOsIdentifier(
			_suse64Guest);
	public static final VirtualMachineGuestOsIdentifier slesGuest = new VirtualMachineGuestOsIdentifier(
			_slesGuest);
	public static final VirtualMachineGuestOsIdentifier sles64Guest = new VirtualMachineGuestOsIdentifier(
			_sles64Guest);
	public static final VirtualMachineGuestOsIdentifier sles10Guest = new VirtualMachineGuestOsIdentifier(
			_sles10Guest);
	public static final VirtualMachineGuestOsIdentifier sles10_64Guest = new VirtualMachineGuestOsIdentifier(
			_sles10_64Guest);
	public static final VirtualMachineGuestOsIdentifier sles11Guest = new VirtualMachineGuestOsIdentifier(
			_sles11Guest);
	public static final VirtualMachineGuestOsIdentifier sles11_64Guest = new VirtualMachineGuestOsIdentifier(
			_sles11_64Guest);
	public static final VirtualMachineGuestOsIdentifier nld9Guest = new VirtualMachineGuestOsIdentifier(
			_nld9Guest);
	public static final VirtualMachineGuestOsIdentifier oesGuest = new VirtualMachineGuestOsIdentifier(
			_oesGuest);
	public static final VirtualMachineGuestOsIdentifier sjdsGuest = new VirtualMachineGuestOsIdentifier(
			_sjdsGuest);
	public static final VirtualMachineGuestOsIdentifier mandrivaGuest = new VirtualMachineGuestOsIdentifier(
			_mandrivaGuest);
	public static final VirtualMachineGuestOsIdentifier mandriva64Guest = new VirtualMachineGuestOsIdentifier(
			_mandriva64Guest);
	public static final VirtualMachineGuestOsIdentifier turboLinuxGuest = new VirtualMachineGuestOsIdentifier(
			_turboLinuxGuest);
	public static final VirtualMachineGuestOsIdentifier turboLinux64Guest = new VirtualMachineGuestOsIdentifier(
			_turboLinux64Guest);
	public static final VirtualMachineGuestOsIdentifier ubuntuGuest = new VirtualMachineGuestOsIdentifier(
			_ubuntuGuest);
	public static final VirtualMachineGuestOsIdentifier ubuntu64Guest = new VirtualMachineGuestOsIdentifier(
			_ubuntu64Guest);
	public static final VirtualMachineGuestOsIdentifier debian4Guest = new VirtualMachineGuestOsIdentifier(
			_debian4Guest);
	public static final VirtualMachineGuestOsIdentifier debian4_64Guest = new VirtualMachineGuestOsIdentifier(
			_debian4_64Guest);
	public static final VirtualMachineGuestOsIdentifier debian5Guest = new VirtualMachineGuestOsIdentifier(
			_debian5Guest);
	public static final VirtualMachineGuestOsIdentifier debian5_64Guest = new VirtualMachineGuestOsIdentifier(
			_debian5_64Guest);
	public static final VirtualMachineGuestOsIdentifier asianux3Guest = new VirtualMachineGuestOsIdentifier(
			_asianux3Guest);
	public static final VirtualMachineGuestOsIdentifier asianux3_64Guest = new VirtualMachineGuestOsIdentifier(
			_asianux3_64Guest);
	public static final VirtualMachineGuestOsIdentifier asianux4Guest = new VirtualMachineGuestOsIdentifier(
			_asianux4Guest);
	public static final VirtualMachineGuestOsIdentifier asianux4_64Guest = new VirtualMachineGuestOsIdentifier(
			_asianux4_64Guest);
	public static final VirtualMachineGuestOsIdentifier other24xLinuxGuest = new VirtualMachineGuestOsIdentifier(
			_other24xLinuxGuest);
	public static final VirtualMachineGuestOsIdentifier other26xLinuxGuest = new VirtualMachineGuestOsIdentifier(
			_other26xLinuxGuest);
	public static final VirtualMachineGuestOsIdentifier otherLinuxGuest = new VirtualMachineGuestOsIdentifier(
			_otherLinuxGuest);
	public static final VirtualMachineGuestOsIdentifier other24xLinux64Guest = new VirtualMachineGuestOsIdentifier(
			_other24xLinux64Guest);
	public static final VirtualMachineGuestOsIdentifier other26xLinux64Guest = new VirtualMachineGuestOsIdentifier(
			_other26xLinux64Guest);
	public static final VirtualMachineGuestOsIdentifier otherLinux64Guest = new VirtualMachineGuestOsIdentifier(
			_otherLinux64Guest);
	public static final VirtualMachineGuestOsIdentifier solaris6Guest = new VirtualMachineGuestOsIdentifier(
			_solaris6Guest);
	public static final VirtualMachineGuestOsIdentifier solaris7Guest = new VirtualMachineGuestOsIdentifier(
			_solaris7Guest);
	public static final VirtualMachineGuestOsIdentifier solaris8Guest = new VirtualMachineGuestOsIdentifier(
			_solaris8Guest);
	public static final VirtualMachineGuestOsIdentifier solaris9Guest = new VirtualMachineGuestOsIdentifier(
			_solaris9Guest);
	public static final VirtualMachineGuestOsIdentifier solaris10Guest = new VirtualMachineGuestOsIdentifier(
			_solaris10Guest);
	public static final VirtualMachineGuestOsIdentifier solaris10_64Guest = new VirtualMachineGuestOsIdentifier(
			_solaris10_64Guest);
	public static final VirtualMachineGuestOsIdentifier os2Guest = new VirtualMachineGuestOsIdentifier(
			_os2Guest);
	public static final VirtualMachineGuestOsIdentifier netware4Guest = new VirtualMachineGuestOsIdentifier(
			_netware4Guest);
	public static final VirtualMachineGuestOsIdentifier netware5Guest = new VirtualMachineGuestOsIdentifier(
			_netware5Guest);
	public static final VirtualMachineGuestOsIdentifier netware6Guest = new VirtualMachineGuestOsIdentifier(
			_netware6Guest);
	public static final VirtualMachineGuestOsIdentifier openServer5Guest = new VirtualMachineGuestOsIdentifier(
			_openServer5Guest);
	public static final VirtualMachineGuestOsIdentifier openServer6Guest = new VirtualMachineGuestOsIdentifier(
			_openServer6Guest);
	public static final VirtualMachineGuestOsIdentifier unixWare7Guest = new VirtualMachineGuestOsIdentifier(
			_unixWare7Guest);
	public static final VirtualMachineGuestOsIdentifier darwinGuest = new VirtualMachineGuestOsIdentifier(
			_darwinGuest);
	public static final VirtualMachineGuestOsIdentifier darwin64Guest = new VirtualMachineGuestOsIdentifier(
			_darwin64Guest);
	public static final VirtualMachineGuestOsIdentifier otherGuest = new VirtualMachineGuestOsIdentifier(
			_otherGuest);
	public static final VirtualMachineGuestOsIdentifier otherGuest64 = new VirtualMachineGuestOsIdentifier(
			_otherGuest64);

	public java.lang.String getValue() {
		return _value_;
	}

	public static VirtualMachineGuestOsIdentifier fromValue(
			java.lang.String value) throws java.lang.IllegalArgumentException {
		VirtualMachineGuestOsIdentifier enumeration = (VirtualMachineGuestOsIdentifier) _table_
				.get(value);
		if (enumeration == null) {
			throw new java.lang.IllegalArgumentException();
		}
		return enumeration;
	}

	public static VirtualMachineGuestOsIdentifier fromString(
			java.lang.String value) throws java.lang.IllegalArgumentException {
		return fromValue(value);
	}

	@Override
	public boolean equals(java.lang.Object obj) {
		return (obj == this);
	}

	@Override
	public int hashCode() {
		return toString().hashCode();
	}

	@Override
	public java.lang.String toString() {
		return _value_;
	}

	public java.lang.Object readResolve() throws java.io.ObjectStreamException {
		return fromValue(_value_);
	}

	public static org.apache.axis.encoding.Serializer getSerializer(
			java.lang.String mechType, java.lang.Class _javaType,
			javax.xml.namespace.QName _xmlType) {
		return new org.apache.axis.encoding.ser.EnumSerializer(_javaType,
				_xmlType);
	}

	public static org.apache.axis.encoding.Deserializer getDeserializer(
			java.lang.String mechType, java.lang.Class _javaType,
			javax.xml.namespace.QName _xmlType) {
		return new org.apache.axis.encoding.ser.EnumDeserializer(_javaType,
				_xmlType);
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			VirtualMachineGuestOsIdentifier.class);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VirtualMachineGuestOsIdentifier"));
	}

	/**
	 * Return type metadata object
	 */
	public static org.apache.axis.description.TypeDesc getTypeDesc() {
		return typeDesc;
	}

}
