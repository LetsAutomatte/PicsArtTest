package com.org.picsartapp.Test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.org.picsartapp.Base.Base;
import com.org.picsartapp.Page.BlogPage;
import com.org.picsartapp.Page.LoginPage;
import com.org.picsartapp.Utilies.Log;

public class LinkAndSearchTest extends Base {

	
	LoginPage objLoginPage;
	BlogPage objBlogPage;
	String url;
	public LinkAndSearchTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@BeforeTest
	public void setup() throws IOException
	{		
		url = prop.getProperty("blogUrl");
		Initilization(url);
		objLoginPage = new LoginPage();
		objBlogPage = new BlogPage();
	}
	
	@Test
	public void clickLinkTest() throws IOException
	{
		try {
		Log.startLogger("clickLinkTest");
		
		
		objBlogPage.clickBlogLink();
		Assert.assertEquals(driver.getCurrentUrl(),  prop.getProperty("blogConfirm"));
		
		objBlogPage.clickDesignSchoolLink();
		Assert.assertEquals(driver.getCurrentUrl(),  prop.getProperty("designSchoolConfirm"));
		
		objBlogPage.clickTrendsLink();
		Assert.assertEquals(driver.getCurrentUrl(),  prop.getProperty("trendsConfirm"));
		
		objBlogPage.clickPicsartProLink();
		Assert.assertEquals(driver.getCurrentUrl(),  prop.getProperty("piscartProConfirm"));
		
		objBlogPage.clickNewsLink();
		Assert.assertEquals(driver.getCurrentUrl(),  prop.getProperty("newConfirm"));
		
		
		Log.endLogger("clickLinkTest");
		}
		catch(Exception e)
		{
			Log.info("Exception"+e.getMessage());
		}
	}
	
	
	
	@Test
	public void serachCategory() throws IOException
	{
		try {
		Log.startLogger("Search Category");
		objBlogPage.searchCategory();
		Assert.assertEquals(driver.getCurrentUrl(),  prop.getProperty("newConfirm"));
		
		
		
		Log.endLogger("Search Category");
		}
		catch(Exception e)
		{
			Log.info("Exception"+e.getMessage());
		}
		
	}
	
	@AfterTest
	public void tearDown() throws IOException
	{		
		
		driver.quit();
	}
	

}
