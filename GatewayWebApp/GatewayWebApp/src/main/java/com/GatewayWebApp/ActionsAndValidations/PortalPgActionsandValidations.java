package com.GatewayWebApp.ActionsAndValidations;

import com.GatewayWebApp.Pages.ObjectRepository.LoginPgOR;
import com.GatewayWebApp.Pages.ObjectRepository.PortalPgOR;

public class PortalPgActionsandValidations extends PortalPgOR {
	
	LoginPgOR LgnPgOR = new LoginPgOR();
	PortalPgOR PrtlPgORR = new PortalPgOR();
	
	public boolean CloudApplicationValidation(String User, String Passwd) {
		
		LgnPgOR.UserName().sendKeys(User);
		LgnPgOR.Password().sendKeys(Passwd);
		LgnPgOR.LoginButton().click();
		boolean flag = false;
		if( PrtlPgORR.CloudApp().getText().equals("Cloud") ) 
		{
	      flag = true;
	    }
		else {
			flag =false;
	    }
		return flag;
		}	
	
public boolean ZomatoApplicationValidation(String User, String Passwd) {
		
		LgnPgOR.UserName().sendKeys(User);
		LgnPgOR.Password().sendKeys(Passwd);
		LgnPgOR.LoginButton().click();
		boolean flag = false;
		if( PrtlPgORR.ZomatoApp().getText().equals("Zomato"))
		{
	      flag = true;
	    }
		else {
			flag =false;
	    }
		return flag;
		}	

public boolean RediffApplicationValidation(String User, String Passwd) {
	
	LgnPgOR.UserName().sendKeys(User);
	LgnPgOR.Password().sendKeys(Passwd);
	LgnPgOR.LoginButton().click();
	boolean flag = false;
	if( PrtlPgORR.RediffApp().getText().equals("Rediff"))
	{
      flag = true;
    }
	else {
		flag =false;
    }
	return flag;
	}	

public boolean KotakApplicationValidation(String User, String Passwd) {
	
	LgnPgOR.UserName().sendKeys(User);
	LgnPgOR.Password().sendKeys(Passwd);
	LgnPgOR.LoginButton().click();
	boolean flag = false;
	if( PrtlPgORR.KotakApp().getText().equals("Kotak"))
	{
      flag = true;
    }
	else {
		flag =false;
    }
	return flag;
	}

public boolean QuickerApplicationValidation(String User, String Passwd) {
	
	LgnPgOR.UserName().sendKeys(User);
	LgnPgOR.Password().sendKeys(Passwd);
	LgnPgOR.LoginButton().click();
	boolean flag = false;
	if( PrtlPgORR.QuickerApp().getText().equals("Quicker"))
	{
      flag = true;
    }
	else {
		flag =false;
    }
	return flag;
	}

public boolean BenzApplicationValidation(String User, String Passwd) {
	
	LgnPgOR.UserName().sendKeys(User);
	LgnPgOR.Password().sendKeys(Passwd);
	LgnPgOR.LoginButton().click();
	boolean flag = false;
	if( PrtlPgORR.BenzApp().getText().equals("Benz"))
	{
      flag = true;
    }
	else {
		flag =false;
    }
	return flag;
	}

}
