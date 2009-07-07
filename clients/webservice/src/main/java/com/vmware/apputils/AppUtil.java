package com.vmware.apputils;

import java.util.*;
import java.util.regex.*;
import java.io.*;

import org.w3c.dom.Document;
import org.w3c.dom.*;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import java.lang.reflect.Method;
import javax.xml.validation.*;
import javax.xml.*;
import javax.xml.transform.dom.*;
import com.vmware.security.credstore.*;

/*************************************************************
 * The AppUtil class handles basic setup needed to create a connection to a
 * VMware Infrastructure server, such as ESX, ESXi, or VirtualCenter server.  
 * This class validates user input (in terms of correct datatypes) and creates 
 * instances of the built-in options (command-line arguments) for servername,
 * username, password, and so on. 
 * <p>  
 * This class also creates an instance of the Logger for outputting messages 
 * to the console, and parses and validates any additional command-line 
 * options (creating by using the {@link OptionSpec} class) that might be 
 * passed to it from a sample application. 
 * </p>
 */
    


public class AppUtil {
      
   public Log log;  
   private HashMap<String, String> optsEntered = new HashMap<String, String>();     
   private HashMap userOpts = new HashMap();
   private HashMap builtInOpts = new HashMap();
   
   private String logfilepath = "";   
   private String _cname;
   private com.vmware.apputils.vim.ServiceConnection _connection;
   private ClientUtil _util;
   private com.vmware.apputils.vim.ServiceUtil _svcUtil;
   
   /**
   * If there is a global logger already available
   */
   private static Log gLog;

   public static AppUtil initialize(String name, OptionSpec [] userOptions , String [] args) throws Exception{
      AppUtil cb = new AppUtil(name);
      if(userOptions != null) {
         cb.addOptions(userOptions);
         cb.parseInput(args);
         cb.validate();
      }
      else {
         cb.parseInput(args);
         cb.validate();
      }  
      return cb;
   }
   
   public static AppUtil initialize(String name, String [] args) throws Exception{
      AppUtil cb = initialize(name, null, args);
      return cb;
   }
   
   public static void ALog(Log glog) {
      gLog = glog;
   }  
   
   public AppUtil(String name) {
      _util = new ClientUtil(this);
      setup();
      init(name);          
   }
   public void setup() {
      _svcUtil = com.vmware.apputils.vim.ServiceUtil.CreateServiceUtil();
      _connection = com.vmware.apputils.vim.ServiceConnection.CreateServiceConnection("ServiceInstance");
   }
   public void init(String name) {
      builtinOptions();
      if (gLog == null) {
         String logDir = System.getProperty("java.io.tmpdir", "/tmp/");
         if (logDir == null || logDir.length() == 0) {
            logDir = "";
         }
         logfilepath = logDir + "/" + name + "_";
         log = new Log();
         log.init(logfilepath, true, true);
      }
      else {
         log = gLog;
      }
      _cname = name;
   }
   public void initConnection() throws Exception {                  
      getServiceUtil().init(this,_connection);      
   }
   public void addOptions(OptionSpec [] userOptions) throws Exception {          
      for(int i=0; i < userOptions.length; i++) {
      	 if(userOptions[i].getOptionName() != null && userOptions[i].getOptionName().length() > 0 &&
      	    userOptions[i].getOptionDesc() != null && userOptions[i].getOptionDesc().length() > 0 &&
      	    userOptions[i].getOptionType() != null && userOptions[i].getOptionType().length() > 0 &&
      	    (userOptions[i].getOptionRequired() == 0 || userOptions[i].getOptionName().length() > 1)) {
            userOpts.put(userOptions[i].getOptionName(),userOptions[i]);            
         }
         else {
            System.out.println("Option " + userOptions[i].getOptionName() 
                               + " definition is not valid");
            throw new ArgumentHandlingException("Option " + userOptions[i].getOptionName() 
                                                + " definition is not valid");
         }
      }       
   }
   
/****************************************************************
 * Creates common built-in options used (or available to be used) by all sample applications. 
 * @param url Required. Complete URL for the VI API Web service for the connection.
 * @param username Required. User account with privileges to connect to the host. 
 * @param password Required. Password for the user account.
 * @param config Location of an optional configuration file that contains the required parameters.
 * @param protocol Protocol for the server connection (HTTP, HTTPS; HTTPS is the default).
 * @param server Fully-qualified name of the server to connect to, such as myserver.mycompany.com.
 * @param portnumber Server port for the VI API Web service. Defaults is 443 (for HTTPS).
 * @param servicepath Service path for the VI API, such as /sdk, /sdk/webService
 * @param sessionfile = File containing a previously saved session cookie, for re-establishing connection to the server.
 * @param help Display usage information for the application or script.
 * @param ignorecert Avoid the SSL server-certificate validation process.
 */
 
   
   private void builtinOptions() {
      OptionSpec url = new OptionSpec("url","String", 1, "Required. Complete URL for the VI API Web service to connect to",null);
      OptionSpec userName = new OptionSpec("userName","String", 1, "Required. User account with privileges to connect to the host",null);
      OptionSpec password = new OptionSpec("password","String", 1, "Required. Password for the user account",null);
      OptionSpec config = new OptionSpec("config","String", 0, "Location of the VI Perl Toolkit configuration file",null);
      OptionSpec protocol = new OptionSpec("protocol","String", 0, "Protocol for the server connection (HTTP, HTTPS)",null);
      OptionSpec server = new OptionSpec("server","String", 0, "Server to connect to",null);
      OptionSpec portNumber = new OptionSpec("portNumber","String", 0, "Port to connect to server","443");
      OptionSpec servicePath = new OptionSpec("servicePath","String", 0, "Service path used to connect to server",null);
      OptionSpec sessionFile = new OptionSpec("sessionFile","String", 0, "File containing previously saved session cookie",null);      
      OptionSpec help = new OptionSpec("help","String", 0, "Display usage information for the application or script",null);
      OptionSpec ignorecert = new OptionSpec("ignorecert","String", 0, "Ignore the server certificate validation",null);
      builtInOpts.put("url",url);
      builtInOpts.put("username",userName);
      builtInOpts.put("password",password);
      builtInOpts.put("password",password);
      builtInOpts.put("config",config);
      builtInOpts.put("protocol",protocol);
      builtInOpts.put("server",server);
      builtInOpts.put("portnumber",portNumber);
      builtInOpts.put("servicepath",servicePath);
      builtInOpts.put("sessionfile",sessionFile);      
      builtInOpts.put("help",help);
      builtInOpts.put("ignorecert",ignorecert);
   }
   public void  parseInput(String args[]) throws Exception {   
      try{
         getCmdArguments(args);
      }
      catch(Exception e){      
          throw new ArgumentHandlingException("Exception running : " + e); 
      }
      Iterator It = optsEntered.keySet().iterator();     
      while (It.hasNext()) {
         String keyValue = It.next().toString();
         String keyOptions = optsEntered.get(keyValue);
         boolean result = checkInputOptions(builtInOpts,keyValue);         
         boolean valid = checkInputOptions(userOpts,keyValue);         
         if(result==false && valid==false) { 
            System.out.println("Invalid Input Option '"+keyValue+"'");           
            displayUsage();
            throw new ArgumentHandlingException("Invalid Input Option '"+keyValue+"'");
         }
         result = checkDatatypes(builtInOpts,keyValue,keyOptions);
         valid = checkDatatypes(userOpts,keyValue,keyOptions);
         if(result==false && valid==false) { 
             System.out.println("Invalid datatype for Input Option '"+keyValue+"'");
             displayUsage();
             throw new ArgumentHandlingException("Invalid Input Option '"+keyValue+"'");
         }
      }
   }
   private void getCmdArguments(String args[]) throws Exception {
      int len = args.length;  
      int i=0;
      boolean flag = false;
      if(len==0) {
         displayUsage();
         throw new ArgumentHandlingException("usage");
      }     
      while (i < args.length) {
         String val= "";
         String opt= args[i];
         if(opt.startsWith("--") && optsEntered.containsKey(opt.substring(2))){  
           System.out.println("key '"+opt.substring(2)+"' already exists ");
            displayUsage();
            throw new ArgumentHandlingException("key '"+opt.substring(2)+"' already exists ");
         }
         if(args[i].startsWith("--")) {           
            if(args.length>i+1) {
               if(!args[i+1].startsWith("--")) {
                  val = args[i+1];                     
                  optsEntered.put(opt.substring(2),val);                  
               }
               else {
                  optsEntered.put(opt.substring(2),null);
               }  
            }
            else {
               optsEntered.put(opt.substring(2),null);
            }
         }
         i++;
      }
   }

   private boolean  checkDatatypes(HashMap Opts,String keyValue, String keyOptions){
      boolean valid = false;
      valid = Opts.containsKey(keyValue);  
      if(valid){
         OptionSpec oSpec = (OptionSpec)Opts.get(keyValue);  
         String dataType = oSpec.getOptionType();
         boolean result = validateDataType(dataType,keyOptions);
         return result;
      }
      else{
         return false;
      }
   }

   private boolean validateDataType(String dataType, String keyValue) {
      try {
         if(dataType.equalsIgnoreCase("Boolean")) {
            if(keyValue.equalsIgnoreCase("true") || keyValue.equalsIgnoreCase("false")) {
               return true;
            }
            else {
               return false;
            }          
         }
         else if(dataType.equalsIgnoreCase("Integer")) {
            int val =  Integer.parseInt(keyValue);
            return true;
         }
         else if(dataType.equalsIgnoreCase("Float")) {
            Float.parseFloat(keyValue);
            return true;
         }
         else if(dataType.equalsIgnoreCase("Long")) {
            Long.parseLong(keyValue);
            return true;
         }
         else {
            // DO NOTHING
         }
         return true;
      }
      catch(NumberFormatException e){
        return false;
      }
   }


   private boolean  checkInputOptions(HashMap checkOptions, String value) {
      boolean valid = false;
      valid = checkOptions.containsKey(value);         
      return valid;        
   }
 
   public void validate() throws Exception {
      validate(null,null);
   }

   public void validate(Object className, String functionName) throws Exception {
      boolean flag = false;
      if(optsEntered.isEmpty()){
         displayUsage();
         throw new ArgumentHandlingException("---help");     
      }
      if(optsEntered.get("help")!=null){
         displayUsage();
         System.exit(1);
      }
      if(option_is_set("help")){
         displayUsage();
         System.exit(1);
      }
      Vector<String> vec = getValue(builtInOpts); 
      boolean flagUsername = true;
      boolean flagPassword = true;
      for(int i=0;i<vec.size();i++){
         if(optsEntered.get(vec.get(i))==null){
            String missingArg = vec.get(i);            
            if(missingArg.equalsIgnoreCase("password")) {
               flagPassword = false;
            }
            else if(missingArg.equalsIgnoreCase("username")) {               
               flagUsername = false;
            }
            else {
               System.out.print("----ERROR: "+vec.get(i)+" not specified \n");                      
               displayUsage();
               throw new ArgumentHandlingException("----ERROR: "+vec.get(i)+" not specified \n");            
            }            
         }
      }
      searchForUsernameAndPassword(flagUsername, flagPassword);   
      vec = getValue(userOpts); 
      for(int i=0;i<vec.size();i++){
         if(optsEntered.get(vec.get(i))==null){            
            System.out.print("----ERROR: "+vec.get(i)+" not specified \n");          
            displayUsage();
            throw new ArgumentHandlingException("----ERROR: "+vec.get(i)+" not specified \n");
         }
      }      
      if((optsEntered.get("sessionfile")==null)&&
        ((optsEntered.get("username")==null) &&(optsEntered.get("password")==null))){  
         System.out.println("Must have one of command options 'sessionfile' or a 'username' and 'password' pair\n");             
         displayUsage();
         throw new ArgumentHandlingException("Must have one of command options 'sessionfile' or a 'username' and 'password' pair\n");
      }     
   }   
   
   /*Search Order for Username and Password
   * 1. Command Line Arguments
   * 2. Session File
   * 3. Enviroment Variable
   * 4. Credential Store
   * 5. Prompt the User for Username and Password
   */
   private void searchForUsernameAndPassword(boolean flagUsername, 
                                             boolean flagPassword) 
      throws Exception {
      String username = null;
      String password = null;      
      if(flagUsername && flagPassword) {
         // User provided the user name and passowrd 
         // from command prompt
      }
      else if(optsEntered.get("sessionfile")!=null) {            
         // User provided the Session File
      }
      else {
         /*if(flagUsername == false) {
            username = System.getenv("VI_Username");
            if(username == null) {               
               username = readUsername("Enter Username: ");
               optsEntered.put("username", username); 
            }
         }*/
         if(flagPassword == false) {
            password = System.getenv("VI_Password");                     
            optsEntered.put("password", password); 
            if(password == null) {               
               String host = null;
               if(optsEntered.get("server")!=null) {
                  host = optsEntered.get("server");
               }
               else {
                  String urlString = optsEntered.get("url");
                  if(urlString.indexOf("https://") !=-1) {
                     int sind = 8;
                     int lind = urlString.indexOf("/sdk");
                     host = urlString.substring(sind,lind);
                  }
                  else if(urlString.indexOf("http://") !=-1) {
                     int sind = 7;
                     int lind = urlString.indexOf("/sdk");
                     host = urlString.substring(sind,lind);
                  }
                  else {
                     host = urlString;
                  }
               }
               try {
                  CredentialStore csObj = CredentialStoreFactory.getCredentialStore();  
                  if(flagUsername == false) {
                     username = System.getenv("VI_Username");
                     optsEntered.put("username", username); 
                     if(username == null) {
                        Set userNameSet = csObj.getUsernames(host);
                        if(userNameSet.size() == 1) {
                           username = (String)userNameSet.iterator().next();
                           optsEntered.put("username", username);
                        }
                     }
                     if(username == null) {
                        username = readUsername("Enter Username: ");
                        optsEntered.put("username", username); 
                     }
                        flagUsername = true;
                    }
                    else
                      {
                        username = get_option("username");
                      }                                    
                  char [] arr = csObj.getPassword(host,username);
                     if(arr!=null && arr.length > 0) {
                     password = new String(arr);                
                     optsEntered.put("password", password); 
               	  }
               }
               catch(Exception e) {
                  // Do Nothing
                  // Not able to find password from the Cred Store   
               }                           
            }
            if (flagUsername == false) {
                username = System.getenv("VI_Username");
                optsEntered.put("username", username);
                if (username == null) {
                   // Read It From The Console
                    if(username == null) {               
                       username = readUsername("Enter Username: ");
                       optsEntered.put("username", username); 
                     }
                }
            }	
            if(password == null) {                          
               password = readPassword("Enter password: ");               
               optsEntered.put("password", password);  
            }
         }
      }                      	
   }   
   
   /*
   *taking out value of a particular key in the hashmap 
   *i.e checking for required =1 options
   */
   private Vector getValue(HashMap checkOptions){
       Iterator It = checkOptions.keySet().iterator();
       Vector<String> vec = new Vector<String>();
       while(It.hasNext()){
          String str = It.next().toString();                 
          OptionSpec oSpec = (OptionSpec)checkOptions.get(str);
          if(oSpec.getOptionRequired() == 1) {
             vec.add(str);
          }
       }
       return vec;       
   }
  
   public void displayUsage()  {                   
      System.out.println("Common Java Options :");
      print_options(builtInOpts);      
      System.out.println("\nCommand specific options: ");
      print_options(userOpts);
   }
  
   private void print_options(HashMap Opts) {
      String type ="";
      String defaultVal="";
      Iterator It;
      String help="";
      Set generalKeys = Opts.keySet();
      It = generalKeys.iterator();
      while (It.hasNext()) {
         String keyValue = It.next().toString();
         OptionSpec oSpec = (OptionSpec)Opts.get(keyValue);
         if((oSpec.getOptionType()!= null)&&(oSpec.getOptionDefault()!= null)){
            type = oSpec.getOptionType();
            defaultVal = oSpec.getOptionDefault();
            System.out.println("   --"+keyValue+ " < type "+type+", default "+defaultVal+ ">");
          }    
          if((oSpec.getOptionDefault()!= null)&&(oSpec.getOptionType()== null)){
             defaultVal = oSpec.getOptionDefault();
             System.out.println("   --"+keyValue+ " < default "+defaultVal+" >");
          }
          else if((oSpec.getOptionType()!= null)&&(oSpec.getOptionDefault()== null)){
             type = oSpec.getOptionType();
             System.out.println("   --"+keyValue+ " < type "+type+" >");
          }
          else if((oSpec.getOptionType()== null)&&(oSpec.getOptionDefault()== null)){
             System.out.println("   --"+keyValue+ " ");
          }
          help = oSpec.getOptionDesc();        
          System.out.println("      "+help);          
      } 
   }

   public boolean option_is_set(String option){
      boolean valid = false;
      Iterator It = optsEntered.keySet().iterator();
      while(It.hasNext()){
         String keyVal = It.next().toString();
         if(option.equals(keyVal)){
            valid = true;
         }
      }     
      return valid;  
   }
   
   public String get_option(String key)  {   
      if(optsEntered.get(key)!= null){
         return optsEntered.get(key).toString();
      }
      else if(checkInputOptions(builtInOpts,key)) {        
         if(((OptionSpec)builtInOpts.get(key)).getOptionDefault() != null) {
            String str = ((OptionSpec)builtInOpts.get(key)).getOptionDefault();            
            return str;
         }
         else {
           return null;
         }
      }
      else if(checkInputOptions(userOpts,key)) {
         if(((OptionSpec)userOpts.get(key)).getOptionDefault() != null) {
            String str = ((OptionSpec)userOpts.get(key)).getOptionDefault();
            return str;
         }
         else{
           return null;
         }
      }
      else {
         System.out.println("undefined variable");
      }
      return null;   
   }  
    
   public void connect() throws Exception {
      log.logLine("Started " );
      try{
         initConnection();
         getServiceUtil().clientConnect();
      }
      catch(Exception e) {
         log.logLine("Exception running : " + getAppName());
         getUtil().logException(e);
         log.close();
         throw e;
      }
   }
   
   public void loadSession() throws Exception {
      initConnection();
      getServiceUtil().clientLoadSession(getServiceUrl(),get_option("sessionfile"));
   }
   
   public void saveSession(String fileName) throws Exception {   	
      getServiceUtil().clientSaveSession(fileName);
   }
   
   public void disConnect() throws Exception {
      log.logLine("Ended " + getAppName());
      try {        
         getServiceUtil().clientDisconnect();        
      }
      catch(Exception e) {
         log.logLine("Exception running : " + getAppName());
         getUtil().logException(e);
         log.close();
         throw new ArgumentHandlingException("Exception running : " + getAppName()); 
      }
   }
      
   /**
    * @return name of the client application
    */
   public String getAppName() {
    return _cname;
   }

   /**
    * @return current log
    */
   public Log getLog() {
      return log;
   }

   /** 
    * @return the service connection object 
    */
   public com.vmware.apputils.vim.ServiceConnection getConnection() {
      return _connection;
   }

   /** 
    * @return Client Util object 
    */
   public ClientUtil getUtil() {
      return _util;
   }

   /** 
    * @return Service Util object 
    */
   public com.vmware.apputils.vim.ServiceUtil getServiceUtil() {
      return _svcUtil;
   }

   /** 
    * @return web service url 
    */
   public String getServiceUrl() throws Exception{
      //return _args[ARG_URL];
      return get_option("url");
   }

   /** 
    * @return web service username 
    */
   public String getUsername() throws Exception{
      //return _args[ARG_USER];
      return get_option("username");
   }

   /** 
    * @return web service password 
    */
   public String getPassword() throws Exception{
      /*if (_args.length > ARG_PASSWD) {
         return _args[ARG_PASSWD];
      } else {
         return ""; 
      }*/
      return get_option("password");
   }
   private String readPassword (String prompt) {
      try { 
         PasswordMask consoleEraser = new PasswordMask();
         System.out.print(prompt);
         BufferedReader stdin = new BufferedReader(new
                             InputStreamReader(System.in));
         consoleEraser.start();                       
         String pass = stdin.readLine();
         consoleEraser.halt();
         System.out.print("\b");
         return pass;
      }
      catch(Exception e) {
         return null;
      }
   }
   
   private String readUsername (String prompt) {
      try { 
         PasswordMask consoleEraser = new PasswordMask();
         System.out.print(prompt);
         BufferedReader stdin = new BufferedReader(new
                             InputStreamReader(System.in));         
         String username = stdin.readLine();                  
         return username;
      }
      catch(Exception e) {
         return null;
      }
   }  
      
   class PasswordMask extends Thread {
      private boolean running = true;
      public void run() {
         while (running) {
            System.out.print("\b ");
         }
      }
      public synchronized void halt() {
         running = false;
      }
   } 
}
