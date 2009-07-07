package com.vmware.apputils;

/**************************************************
 * The OptionSpec class is the basis for all command-line arguments that get
 * passed to the sample applications. All sample applications use several 
 * basic command-line options defined as instances of this class. 
 * Use this class to define your own custom options for use with applications that you
 * create that use the helper classes in the {@link com.vmware.apputils} package.
*/
  

public class OptionSpec {
   private String optionName;
   private int optionRequired;
   private String optionDesc;
   private String optionType;
   private String optionDefault;
   
   
   
/****************************************************
 *@param optionName Unique string to specify the command-line argument.
 *@param optionType Datatype for the option, such as "string."
 *@param optionRequired Integer that specifies if the option is required (1), or not (0).
 *@param optionDesc Brief description of the option and its use.
 *@param optionDefault Default value of the option, if one exists. Can be null.
*/
  
   public OptionSpec(String optionName,String optionType,int optionRequired,String optionDesc, String optionDefault) {
      this.optionName = optionName;
      this.optionType = optionType;
      this.optionRequired = optionRequired;
      this.optionDesc = optionDesc;
      this.optionDefault = optionDefault;
   }
    
   public String getOptionName() {
      return optionName;
   }
  
   public int getOptionRequired() {
      return optionRequired;
   }
    
   public String getOptionDesc() {
      return optionDesc;
   }
    
   public String getOptionType() {
      return optionType;
   }
    
   public String getOptionDefault() {
      return optionDefault;
   }
}