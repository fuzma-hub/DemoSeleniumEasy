package com.GatewayWebApp.Pages.ObjectRepository;
import com.GatewayWebApp.Base.GatewayBase;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class LoginPgOR extends GatewayBase{
	
	public LoginPgOR()
	{
		PageFactory.initElements(driver, this);
    }
	
	public WebElement GatewayWebApplicationImg()

	{
	WebElement Gtwaywebappimg = driver.findElement(By.xpath("//img[@alt='img_avatar2.png']"));
		return Gtwaywebappimg;
	}
	
	public WebElement CloseButton()
	{
		WebElement ClsBtn = driver.findElement(By.xpath("//span[@title='Close Modal']"));
		return ClsBtn;
	}
	
	public WebElement UserName()
	{
		WebElement Usrname = driver.findElement(By.xpath("//input[@id='username']"));
		return Usrname;
	}
	
	public WebElement Password()
	{
		WebElement Paswd = driver.findElement(By.xpath("//input[@id='password']"));
		return Paswd;
	}
	
	public WebElement LoginButton()
	
	{
		WebElement LgnBtn = driver.findElement(By.xpath("//button[text()='Login']"));
		return LgnBtn;
	}
	
	public WebElement RememberMeCheckBox()
	{
		WebElement RemMeChkBx = driver.findElement(By.xpath("//input[@name='remember']"));
		return RemMeChkBx;
	}
	
	public WebElement CancelButton()
	{
		WebElement CanclBtn = driver.findElement(By.xpath("//button[text()='Cancel']"));
		return CanclBtn;
	}
	
	public WebElement ForgotPasswordLink()
	{
		WebElement FrgtPaswdLnk = driver.findElement(By.xpath("//a[text()='password?']"));
		return FrgtPaswdLnk;
	}
	
	public WebElement LoginFailedText()
	{
		WebElement LgnFldTxt = driver.findElement(By.xpath("//h1[text()='Login Failed']"));
		return LgnFldTxt;
	}
}
