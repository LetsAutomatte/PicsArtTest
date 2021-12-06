package com.org.picsartapp.Test;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.org.picsartapp.Base.Base;
import com.org.picsartapp.Page.CreatePage;
import com.org.picsartapp.Page.LoginPage;
import com.org.picsartapp.Utilies.Log;

public class LoginLogoutTest extends Base{

	LoginPage objLoginPage;
	String url;
	
	public LoginLogoutTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeTest
	public void setup() throws IOException
	{		
		url = prop.getProperty("url");
		Initilization(url);
		objLoginPage = new LoginPage();
	}
	
	@Test
	public void clickCreateTest() throws IOException, InterruptedException
	{
		Log.startLogger("clickCreateTest");
		objLoginPage.LogIn();
		
	   Assert.assertEquals(driver.getCurrentUrl(), prop.getProperty("loginConfirm"));
	    
		objLoginPage.Logout();
		Assert.assertEquals(driver.getCurrentUrl(), prop.getProperty("logoutConfirm"));
		Log.endLogger("clickCreateTest");
	}
	
	@AfterTest
	public void tearDown() throws IOException
	{		
		
		driver.quit();
	}
	

}
