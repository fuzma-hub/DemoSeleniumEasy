package com.GatewayWebAppTestCases;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.GatewayWebApp.ActionsAndValidations.PortalPgActionsandValidations;

public class PortalPgTestCases extends PortalPgActionsandValidations {

	PortalPgActionsandValidations PrtlPgActnsndValds;
	private static final Logger logger = LogManager.getLogger(PortalPgTestCases.class);
	public String logStatement = "";
	
	public PortalPgTestCases()
	{
		super();
		
	}
	
	@BeforeMethod
	public void setup()
	{
	
		Initialize();
		logStatement = logStatement + ";AppID=od283746-bb64-4c55-9278-c811d8bdbeb1;";
		PrtlPgActnsndValds = new PortalPgActionsandValidations();
	
	}
	
	@Test (priority=8)
	public void CloudValidationTest()
	{
		logStatement = logStatement +";TestCase=CloudValidationTest;";
		boolean flag = PrtlPgActnsndValds.CloudApplicationValidation(prop.getProperty("User1"), prop.getProperty("Password1"));
		if (flag) {
			logStatement = logStatement +"CloudValidationTest=Passed;";
		}else{
			logStatement = logStatement +"CloudValidationTest=Failed;";
		}
    } 
	
	@Test (priority=9)
	public void ZomatoValidationTest()
	{
		logStatement = logStatement +";TestCase=ZomatoValidationTest;";
		boolean flag = PrtlPgActnsndValds.ZomatoApplicationValidation(prop.getProperty("User1"), prop.getProperty("Password1"));
		if (flag) {
			logStatement = logStatement +"ZomatoValidationTest=Passed;";
		}else{
			logStatement = logStatement +"ZomatoValidationTest=Failed;";
		}
    } 
	
	@Test (priority=10)
	public void RediffValidationTest()
	{
		logStatement = logStatement +";TestCase=RediffValidationTest;";
		boolean flag = PrtlPgActnsndValds.RediffApplicationValidation(prop.getProperty("User1"), prop.getProperty("Password1"));
		if (flag) {
			logStatement = logStatement +"RediffValidationTest=Passed;";
		}else{
			logStatement = logStatement +"RediffValidationTest=Failed;";
		}
    } 
	
	@Test (priority=11)
	public void KotakValidationTest()
	{
		logStatement = logStatement +";TestCase=KotakValidationTest;";
		boolean flag = PrtlPgActnsndValds.KotakApplicationValidation(prop.getProperty("User1"), prop.getProperty("Password1"));
		if (flag) {
			logStatement = logStatement +"KotakValidationTest=Passed;";
		}else{
			logStatement = logStatement +"KotakValidationTest=Failed;";
		}
    } 
	
	@Test (priority=12)
	public void QuickerValidationTest()
	{
		logStatement = logStatement +";TestCase=QuickerValidationTest;";
		boolean flag = PrtlPgActnsndValds.QuickerApplicationValidation(prop.getProperty("User1"), prop.getProperty("Password1"));
		if (flag) {
			logStatement = logStatement +"QuickerValidationTest=Passed;";
		}else{
			logStatement = logStatement +"QuickerValidationTest=Failed;";
		}
    } 
	
	@Test (priority=13)
	public void BenzValidationTest()
	{
		logStatement = logStatement +";TestCase=BenzValidationTest;";
		boolean flag = PrtlPgActnsndValds.BenzApplicationValidation(prop.getProperty("User1"), prop.getProperty("Password1"));
		if (flag) {
			logStatement = logStatement +"BenzValidationTest=Passed;";
		}else{
			logStatement = logStatement +"BenzValidationTest=Failed;";
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
