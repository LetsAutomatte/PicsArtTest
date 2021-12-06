package com.org.picsartapp.Base;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.org.picsartapp.Utilies.Log;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;



/**
 * @author Shruti Jindal
 * This class loads the config file and initalize the browser
 * This class is inherited by all Pages and Tests
 *
 */
public class Base {
	
	public static Properties prop = null;
	public static WebDriver driver = null;
	
	public Base() throws IOException
	{
		Log.info("Base class constructor");
		 prop = new Properties();
		FileInputStream configFile = new FileInputStream(System.getProperty("user.dir")+"//src//main//java//com//org//picsartapp//Properties//Config.properties");
		prop.load(configFile);
		
		
		
	}
	
	
	public  WebDriver Initilization(String url)
	{
		DOMConfigurator.configure(System.getProperty("user.dir")+"//src//main//java//com//org//picsartapp//Resources//log4j.xml");
		
		Log.info("App url"+url);
		
		String browserName = prop.getProperty("browser");
		Log.info("browserName"+browserName);
		if(browserName.equalsIgnoreCase("chrome"))
		{
			ChromeOptions  options = new ChromeOptions();
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//src//main//java//com//org//picsartapp//Drivers//chromedriver.exe");
			options.addArguments("start-maximized");
			options.addArguments("disable-popup-blocking");
			driver = new ChromeDriver(options);
			
			
		}
		else if(browserName.equalsIgnoreCase("IE"))
		{
			
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			
		}
		
		driver.get(url);
		
		return driver;
		
	}

}
