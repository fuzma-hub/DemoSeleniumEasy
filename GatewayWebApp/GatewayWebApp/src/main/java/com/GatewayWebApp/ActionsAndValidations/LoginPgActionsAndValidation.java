package com.GatewayWebApp.ActionsAndValidations;


import com.GatewayWebApp.Pages.ObjectRepository.LoginPgOR;
import com.GatewayWebApp.Pages.ObjectRepository.PortalPgOR;


public class LoginPgActionsAndValidation extends LoginPgOR  {
	
	LoginPgOR LgnPgOR = new LoginPgOR();
	PortalPgOR PrtlPgOR = new PortalPgOR();
	
	public boolean ImageValidation() {
		boolean flag = false;
		if( LgnPgOR.GatewayWebApplicationImg().isDisplayed())
		{
	      flag = true;
	    }
		else {
			flag =false;
	    }
		return flag;
		}	
	
	
	
	public boolean CloseButtonValidation() {
		LgnPgOR.CloseButton().click();
		boolean flag = false;
	if	(LgnPgOR.CloseButton().getSize().equals(null))
	{
		flag = true;
	}
	
	else {
		flag= false;
	}
		return flag;
	}

	
	public  boolean LoginValidation(String User, String Passwd ) {
		LgnPgOR.UserName().sendKeys(User);
		LgnPgOR.Password().sendKeys(Passwd);
		LgnPgOR.LoginButton().click();
		boolean flag = false;
		if  (PrtlPgOR.OneStopPortalObj().getText().equals("One-Stop Portal"))
		{
			flag = true;
		}
		else { flag = false;
		}
		return flag;
		}
	
	public  boolean InvalidUserLoginValidation(String User, String Passwd ) {
		LgnPgOR.UserName().sendKeys(User);
		LgnPgOR.Password().sendKeys(Passwd);
		LgnPgOR.LoginButton().click();
		boolean flag = false;
		if  (LgnPgOR.LoginFailedText().getText().equals("Login Failed"))
		{
			flag = true;
		}
		else { flag = false;
		}
		return flag;
		}
	
	public  boolean InvalidPasswordLoginValidation(String User, String Passwd ) {
		LgnPgOR.UserName().sendKeys(User);
		LgnPgOR.Password().sendKeys(Passwd);
		LgnPgOR.LoginButton().click();
		boolean flag = false;
		if  (LgnPgOR.LoginFailedText().getText().equals("Login Failed"))
		{
			flag = true;
		}
		else { flag = false;
		}
		return flag;
		}
		
	
	public boolean RememberMeValidation()
	{
		
		boolean flag = false;
		if  (LgnPgOR.RememberMeCheckBox().isDisplayed())
		{
			flag = true;
		}
		else { flag = false;
		}
		return flag;
		}
		
	

public boolean ForgetPasswordValidation()
{
	
	boolean flag = false;
	if  (LgnPgOR.ForgotPasswordLink().isDisplayed())
	{
		flag = true;
	}
	else { flag = false;
	}
	return flag;
	}
	
}



