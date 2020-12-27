package com.GatewayWebApp.Pages.ObjectRepository;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.GatewayWebApp.Base.GatewayBase;

public class PortalPgOR extends GatewayBase{
	
	public  PortalPgOR()
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement OneStopPortalObj()

	{
	WebElement OnestpPrtlObj = driver.findElement(By.xpath("//h1[text()='One-Stop Portal']"));
		return OnestpPrtlObj;
	}

	public WebElement CloudApp()
	{
		WebElement CldApp = driver.findElement(By.xpath("//h2[@style='background-color:#3B5998;color:white']/a"));
		return CldApp;
	}
	
	public WebElement ZomatoApp()
	{
		WebElement ZmtApp = driver.findElement(By.xpath("//h2[@style='background-color:#55ACEE;color:white']/a"));
		return ZmtApp;
	}
	
	public WebElement RediffApp()
	{
		WebElement RedApp = driver.findElement(By.xpath("//h2[@style='background-color:#dd4b39;color:white']/a"));
		return RedApp;
	}
	
	public WebElement KotakApp()
	{
		WebElement KtkApp = driver.findElement(By.xpath("//h2[@style='background-color:orange;color:white']/a"));
		return KtkApp;
	}
	
	public WebElement QuickerApp()
	{
		WebElement QkrApp = driver.findElement(By.xpath("//h2[@style='background-color:purple;color:white']/a"));
		return QkrApp;
	}
	
	public WebElement BenzApp()
	{
		WebElement QkrApp = driver.findElement(By.xpath("//h2[@style='background-color:darkblue;color:white']/a"));
		return QkrApp;
	}

	
}
