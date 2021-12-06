package com.org.picsartapp.Page;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.org.picsartapp.Utilies.Log;
import com.org.picsartapp.Common.WebElementWrapper;

import com.org.picsartapp.Base.Base;

public class LoginPage extends Base{

	public LoginPage() throws IOException {
		super();
		Log.info("----Login Page--- ");
		
		// TODO Auto-generated constructor stub
		Log.info("Intitallizing the Page Factory ");
		PageFactory.initElements(driver,this);
	}

	
	@FindBy(xpath="//a[@href='/create']")
	static 	WebElement createLink;	
	
	@FindBy(xpath="//button[@data-mode='login']")
	static WebElement loginBttn;
	
	
	@FindBy(name="username")
	static WebElement usenameText;
	
	@FindBy(name="password")
	static WebElement passwordText;
	
	@FindBy(xpath="//button[@type='submit']")
	static WebElement submitBttn;
	
	

	@FindBy(xpath="//img[@title='User avatar']")
	static WebElement downImg;
	
	@FindBy(xpath="//a[@href='/logout']")
	static WebElement logoutBttn;
	
	
	
	public static CreatePage LogIn() throws IOException
	{
		try
		{
		Log.info("Clicking Login");
		WebElementWrapper.clickElementByXpath(loginBttn, driver);
		WebElementWrapper.enterTextByXpath(usenameText, driver, prop.getProperty("username"));
		WebElementWrapper.enterTextByXpath(passwordText, driver, prop.getProperty("password"));
		WebElementWrapper.clickElementByXpath(submitBttn, driver);
		
		//createLink.click();
		
		
		}
		catch(Exception e)
		{
			Log.info("Exception"+e.getMessage());
		}
		return new CreatePage();
	}
	
	
	public static void Logout() throws IOException
	{
		try
		{
		Log.info("Logging Out");
		WebElementWrapper.clickElementByXpath(downImg, driver);
		WebElementWrapper.clickElementByXpath(logoutBttn, driver);
		//createLink.click();
		}
		catch(Exception e)
		{
			Log.info("Exception"+e.getMessage());
		}
		
		
	}
	
}
