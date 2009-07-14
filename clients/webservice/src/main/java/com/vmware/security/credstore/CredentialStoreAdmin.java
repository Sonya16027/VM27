package com.vmware.security.credstore;

import java.io.File;
import java.io.IOException;

// TODO: Shall we leave the error handling the way it is, print error message/show usage and exit or add Exceptions?
// TODO: Complete the overloaded ShowUsage() functions.

/***********************************************************************************
 * The CredentialStoreAdmin class is a command-line tool that provides complete
 * access to the credential store backing file on the local machine. </p>
 * <p>
 * <strong>Usage Notes
 * </p>
 * </strong>
 * <p>
 * Generally, only accounts created expressly for the purpose of running
 * automated applications or agents should be stored in the credential store.
 * The CredentialStoreAdmin tool can display user accounts and passwords stored
 * in the credential store in clear text, at the console prompt. Here are some
 * additional usage guidelines:
 * <ul>
 * <li>Keep this tool in a password-protected sub-directory that can be accessed
 * only by appropriate administrators.</li>
 * <li>Do not allow this tool to be used by non-administrator users.</li>
 * <li>Do not use CredentialStoreAdmin for the root or Administrator user
 * account and password. Instead, create special user accounts for automated,
 * agent-style software. Grant such user accounts specifically created roles, or
 * use appropriately privileged, non-Administrator roles for these accounts.</li>
 * </ul>
 * <p>
 * <b>Command Line:</b>
 * </p>
 * <code>java com.vmware.security.CredentialStoreAdmin [command -arg1 -arg2...] </code>
 * <p>
 * <b>Commands</b>
 * </p>
 * <ul>
 * <li><b>add</b> Add a user account and password for a specified host to the
 * credential store</li>
 * <li><b>get</b> Obtain the password for a specified user account and host</li>
 * <li><b>help</b> Display help for the commands for this tool</li>
 * <li><b>list</b> List all host names and user accounts contained in the
 * credential store.<br/>
 * &nbsp;&nbsp;&nbsp;Use with <code>--showpw</code> argument to display in
 * cleartext.<br/>
 * &nbsp;&nbsp;&nbsp;Use with <code>-h</code> argument to list user name and
 * password for the host.</li>
 * <li><b>remove</b> Remove the user account and password from the credential
 * store for the specified account</li>
 * <li><b>clear</b> Clear all content from the credential store</li>
 * </ul>
 * 
 * <p>
 * <b>Arguments:</b>
 * </p>
 * <ul>
 * <li><b>-f</b> filename. Optional. Specify a different name, including path,
 * for the credential store backing file.
 * <li><b>-h</b> hostname. Required for add, get, and remove. Optional for list.
 * </li>
 * <li><b>-u</b> user account. Required for add, get, and remove.</li>
 * <li><b>-p</b> password. Required for add.</li>
 * <li><b>--showpw</b> Displays password in cleartext.</li>
 * </ul>
 * 
 *<p>
 * <b>Usage Examples:</b>
 * </p>
 *<code>java com.vmware.security.credstore.CredentialStoreAdmin clear</code><br/>
 *<code>java com.vmware.security.credstore.CredentialStoreAdmin add -h myhostname -u myuser -p mypass</code>
 * <br/>
 *<code>java com.vmware.security.credstore.CredentialStoreAdmin list -h myhostname</code>
 * <br/>
 * 
 */

public class CredentialStoreAdmin {
	private static void showUsage() {
		System.out
				.println("Usage: CredentialStoreAdmin <command> [-f <filename>]");
		System.out.println("\tcommand is one of:");
		System.out.println("\thelp [<command name>]");
		System.out.println("\tadd -h <host> -u <username> -p <password>");
		System.out.println("\tget -h <host> -u <username>");
		System.out.println("\tremove -h <host> -u <username>");
		System.out.println("\tclear");
		System.out.println("\tlist [--showpw] [-h <host>]");
	}

	private static void showUsage(String command) {
		System.out
				.println("Usage: CredentialStoreAdmin <command> [-f <filename>]");
		System.out.println("\tcommand is one of:");
		System.out.println("\thelp [<command name>]");
		System.out.println("\tadd -h <host> -u <username> -p <password>");
		System.out.println("\tget -h <host> -u <username>");
		System.out.println("\tremove -h <host> -u <username>");
		System.out.println("\tclear");
		System.out.println("\tlist [--showpw] [-h <host>]");
	}

	private static CredentialStore getCredentialStoreObject(
			boolean flagFilename, File file) throws IOException {
		CredentialStore csObj;

		if (flagFilename) {
			csObj = CredentialStoreFactory.getCredentialStore(file);
		} else {
			String path = System.getenv("VI_CREDSTORE");
			if (path == null) {
				csObj = CredentialStoreFactory.getCredentialStore();
			} else {
				csObj = CredentialStoreFactory
						.getCredentialStore(new File(path));
			}
		}
		return csObj;
	}

	private static void missingOptionValueExit() {
		System.out.println("Missing option value.");
		showUsage();
		System.exit(1);
	}

	public static void main(String[] args) {
		if (args.length == 0) {
			showUsage();
			System.exit(0);
		}

		String showPwdFlag = "--showpw";
		String filenameFlag = "-f";
		String hostnameFlag = "-h";
		String usernameFlag = "-u";
		String passwordFlag = "-p";
		String cmdHelp = "help";
		String cmdAddPwd = "add";
		String cmdGetPwd = "get";
		String cmdDeletePwd = "remove";
		String cmdClear = "clear";
		String cmdList = "list";
		boolean flagShowPwd = false; // Is --showpw specified or not.
		boolean flagFilename = false; // Is -f specified or not.
		boolean flagHostname = false; // Is -h specified or not.
		boolean flagUsername = false; // Is -u specified or not.
		boolean flagPassword = false; // Is -p specified or not.
		String helpCommand = ""; // Stores command to show help for.
		String command = ""; // The command specified by user.
		File file = null; // Stores filename, specified with -f.
		String hostname = ""; // Stores hostname, specified with -h.
		String username = ""; // Stores username, specified with -u.
		String password = ""; // Stores password, specified with -p.

		for (int i = 0; i < args.length; ++i) {
			if (args[i].charAt(0) == '-') {
				// Got a flag
				if (args[i].compareTo(showPwdFlag) == 0) {
					flagShowPwd = true;
				} else if (args[i].compareTo(filenameFlag) == 0) {
					flagFilename = true;
					++i;
					if (i == args.length) {
						missingOptionValueExit();
					}
					file = new File(args[i]);
				} else if (args[i].compareTo(hostnameFlag) == 0) {
					flagHostname = true;
					++i;
					if (i == args.length) {
						missingOptionValueExit();
					}
					hostname = args[i];
				} else if (args[i].compareTo(usernameFlag) == 0) {
					flagUsername = true;
					++i;
					if (i == args.length) {
						missingOptionValueExit();
					}
					username = args[i];
				} else if (args[i].compareTo(passwordFlag) == 0) {
					flagPassword = true;
					++i;
					if (i == args.length) {
						missingOptionValueExit();
					}
					password = args[i];
				} else {
					System.out.println("Invalid flag " + args[i] + "\n");
					showUsage();
					System.exit(1);
				}
			} else {
				if (i != 0) {
					System.out.println("Incorrect usage");
					showUsage();
					System.exit(1);
				}
				if (args[i].compareTo(cmdHelp) == 0) {
					helpCommand = args[i];
				} else if (helpCommand.length() > 0) {
					/*
					 * We have received "help" before, so this is the command
					 * for which help is to be shown.
					 */
					helpCommand = args[i];
				} else {
					// This is the command for which action needs to be taken,
					command = args[i];
				}
			}
		} // for

		if (helpCommand.length() > 0) {
			showUsage(helpCommand);
			System.exit(0);
		}

		if (command.length() == 0) {
			System.out.println("Missing command.");
			showUsage();
			System.exit(1);
		}

		try {
			if (command.compareTo(cmdAddPwd) == 0) {
				if (flagHostname && flagUsername && flagPassword) {
					if (flagShowPwd) {
						System.out
								.println("Invalid option(s) specified for command "
										+ command);
						showUsage(command);
						System.exit(1);
					}

					CredentialStore csObj = getCredentialStoreObject(
							flagFilename, file);
					csObj.addPassword(hostname, username, password
							.toCharArray());
				} else {
					System.out.println("Missing argument(s) for command "
							+ command);
					showUsage(command);
					System.exit(1);
				}
				System.exit(0);
			}

			if (command.compareTo(cmdGetPwd) == 0) {
				if (flagHostname && flagUsername) {
					if (flagShowPwd || flagPassword) {
						System.out
								.println("Invalid option(s) specified for command "
										+ command);
						showUsage(command);
						System.exit(1);
					}

					CredentialStore csObj = getCredentialStoreObject(
							flagFilename, file);
					char[] pwd = csObj.getPassword(hostname, username);
					if (pwd != null) {
						System.out.println(csObj
								.getPassword(hostname, username));
					}
				} else {
					System.out.println("Missing argument(s) for command "
							+ command);
					showUsage(command);
					System.exit(1);
				}
				System.exit(0);
			}

			if (command.compareTo(cmdDeletePwd) == 0) {
				if (flagHostname && flagUsername) {
					if (flagShowPwd || flagPassword) {
						System.out
								.println("Invalid option(s) specified for command "
										+ command);
						showUsage(command);
						System.exit(1);
					}

					CredentialStore csObj = getCredentialStoreObject(
							flagFilename, file);
					csObj.removePassword(hostname, username);
				} else {
					System.out.println("Missing argument(s) for command "
							+ command);
					showUsage(command);
					System.exit(1);
				}
				System.exit(0);
			}

			if (command.compareTo(cmdClear) == 0) {
				if (flagHostname || flagUsername || flagPassword || flagShowPwd) {
					System.out
							.println("Invalid option(s) specified for command "
									+ command);
					showUsage(command);
					System.exit(1);
				}

				CredentialStore csObj = getCredentialStoreObject(flagFilename,
						file);
				csObj.clearPasswords();
				System.exit(0);
			}

			if (command.compareTo(cmdList) == 0) {
				if (flagUsername || flagPassword) {
					System.out
							.println("Invalid option(s) specified for command "
									+ command);
					showUsage(command);
					System.exit(1);
				}

				CredentialStore csObj = getCredentialStoreObject(flagFilename,
						file);

				if (flagHostname) {
					for (String usernameStr : csObj.getUsernames(hostname)) {
						if (flagShowPwd) {
							System.out.print(usernameStr + "\t");
							System.out.println(csObj.getPassword(hostname,
									usernameStr));
						} else {
							System.out.println(usernameStr);
						}
					}
				} else {
					for (String hostStr : csObj.getHosts()) {
						for (String usernameStr : csObj.getUsernames(hostStr)) {
							if (flagShowPwd) {
								System.out.print(hostStr + "\t" + usernameStr
										+ "\t");
								System.out.println(csObj.getPassword(hostStr,
										usernameStr));
							} else {
								System.out
										.println(hostStr + "\t" + usernameStr);
							}
						}
					}
				}
				System.exit(0);
			}

			// If reached here means invalid command.
			System.out.println("Invalid command " + command);
			System.exit(1);
			showUsage(command);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		System.exit(0);
	}
}
