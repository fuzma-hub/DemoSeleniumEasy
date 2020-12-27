package com.GatewayWebAppTestCases;

import com.GatewayWebApp.ActionsAndValidations.LoginPgActionsAndValidation;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPgTestCases extends LoginPgActionsAndValidation {

	LoginPgActionsAndValidation LgnPgActnsandValds;
	private static final Logger logger = LogManager.getLogger(LoginPgTestCases.class);
	public String logStatement = "";
	
	public LoginPgTestCases()
	{
		super();
		
	}
	
	@BeforeMethod
	public void setup()
	{
	
		Initialize();
		logStatement = logStatement + ";AppID=od283746-bb64-4c55-9278-c811d8bdbeb1;";
		LgnPgActnsandValds = new LoginPgActionsAndValidation();
	
	}
	
	@Test (priority=1)
	public void ImageValidationTest()
	{
		logStatement = logStatement +";TestCase=ImageValidationTest;";
		boolean flag = LgnPgActnsandValds.ImageValidation();
		if (flag) {
			logStatement = logStatement +"ImageValidationTest=Passed;";
		}else{
			logStatement = logStatement +"ImageValidationTest=Failed;";
		}
    } 
	
	@Test (priority=2)
	public void CloseButtonValidationTest()
	{
		logStatement = logStatement +";TestCase=CloseButtonValidationTest;";
		boolean flag = LgnPgActnsandValds.CloseButtonValidation();
		if (flag) {
			logStatement = logStatement +"CloseButtonValidation=Passed;";
		}else{
			logStatement = logStatement +"CloseButtonValidation=Failed;";
		}
	}
	
	@Test (priority=3)
	public void LoginValidationTest() {
		logStatement = logStatement +";TestCase=LoginValidationTest;";
	boolean flag =	LgnPgActnsandValds.LoginValidation(prop.getProperty("User1"), prop.getProperty("Password1"));
		
		if (flag) {
		
		logStatement = logStatement +"LoginValidationTest=Passed;";
		} else {
			logStatement = logStatement +"LoginValidationTest=Failed;";
		}
	}
	
	@Test (priority=4)
	public void InvalidUserLoginValidationTest() {
		logStatement = logStatement +";TestCase=InvalidUserLoginValidationTest;";
	boolean flag =	LgnPgActnsandValds.InvalidUserLoginValidation(prop.getProperty("User2"), prop.getProperty("Password2"));
		
		if (flag) {
		
		logStatement = logStatement +"InvalidUserLoginValidationTest=Passed;";
		} else {
			logStatement = logStatement +"InvalidUserLoginValidationTest=Failed;";
		}
	}
	
	@Test (priority=5)
	public void InvalidPasswordLoginValidationTest() {
		logStatement = logStatement +";TestCase=InvalidPasswordLoginValidationTest;";
	boolean flag =	LgnPgActnsandValds.InvalidPasswordLoginValidation(prop.getProperty("User3"), prop.getProperty("Password3"));
		
		if (flag) {
		
		logStatement = logStatement +"InvalidPasswordLoginValidationTest=Passed;";
		} else {
			logStatement = logStatement +"InvalidPasswordLoginValidationTest=Failed;";
		}
	}
	
	@Test (priority=6)
	public void RememberMeValidationTest() {
		logStatement = logStatement +";TestCase=RememberMeValidationTest;";
	boolean flag =	LgnPgActnsandValds.RememberMeValidation();
		
		if (flag) {
		
		logStatement = logStatement +"RememberMeValidationTest=Passed;";
		} else {
			logStatement = logStatement +"RememberMeValidationTest=Failed;";
		}
	}
	
	@Test (priority=7)
	public void ForgotPasswordValidationTest() {
		logStatement = logStatement +";TestCase=ForgotPasswordValidationTest;";
	boolean flag =	LgnPgActnsandValds.ForgetPasswordValidation();
		
		if (flag) {
		
		logStatement = logStatement +"ForgotPasswordValidationTest=Passed;";
		} else {
			logStatement = logStatement +"ForgotPasswordValidationTest=Failed;";
		}
	}
	
	@AfterMethod
	public void TearDown()
	{
		System.out.println("I am in tear down");
		logger.info(logStatement.toString());
		 driver.quit();
		 logStatement = "";
	}
}
