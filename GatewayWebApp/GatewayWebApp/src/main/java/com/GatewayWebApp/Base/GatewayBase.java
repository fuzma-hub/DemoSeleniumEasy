package com.GatewayWebApp.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.Gateway.Util.GatewayUtility;
import com.Gateway.Util.GatewayWebEventListener;

public class GatewayBase {
	public static WebDriver driver;
	public static Properties prop;
	public  static EventFiringWebDriver e_driver;
	public static GatewayWebEventListener eventListener;
	
	
	public GatewayBase()
	{
		try
		{
		prop = new Properties();
		FileInputStream ip = new FileInputStream(
		"C:\\My Code\\GatewayWebApp\\GatewayWebApp\\src\\main\\java\\com\\GatewayWebApp\\Config\\configFile");
		     prop.load(ip);
		     
		}     catch  (FileNotFoundException e) {
		     e.printStackTrace();
		     } catch (IOException e) {
		     e.printStackTrace();
		     }
		     
	}
	
	public static void Initialize()
	{
		String browserName = prop.getProperty("browser");
		{
		if(browserName.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\farah\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		
		e_driver = new EventFiringWebDriver(driver);
		eventListener = new GatewayWebEventListener();
		e_driver.register(eventListener);
		driver = e_driver;
				
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(GatewayUtility.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(GatewayUtility.IMPLICIT_WAIT, TimeUnit.SECONDS);

		driver.get(prop.getProperty("url"));
		}
	}
	
	
	
		
	
}



