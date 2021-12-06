package com.org.picsartapp.Page;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.org.picsartapp.Base.Base;
import com.org.picsartapp.Common.WebElementWrapper;
import com.org.picsartapp.Utilies.Log;

public class BlogPage extends Base{

	public BlogPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
       Log.info("----Blog Page--- ");
		
		// TODO Auto-generated constructor stub
		Log.info("Intitallizing the Page Factory ");
		PageFactory.initElements(driver,this);
	}

	
	@FindBy(xpath="//a[@href='/blog']")
	static 	WebElement blogLink;	
	
	@FindBy(xpath="//a[@href='/blog/category/design-school']")
	static 	WebElement designSchoolLink;	
	
	@FindBy(xpath="//a[@href='/blog/category/trends']")
	static 	WebElement trendsLink;	
	
	@FindBy(xpath="//a[@href='/blog/category/picsart-pro']")
	static 	WebElement picsartProLink;	
	
	@FindBy(xpath="//a[@href='/blog/category/news']")
	static 	WebElement newsLink;	
	
	@FindBy(xpath="//button[@class='search-form-searchButton-0-2-131']")
	static 	WebElement searchBttn;
	
	@FindBy(xpath="//input[@placeholder='Search']")
	static 	WebElement searchText;
	
	
	public static void clickBlogLink() throws Exception
	{
		WebElementWrapper.clickElementByXpath(blogLink, driver);
	
		
	}
	
	public static void clickDesignSchoolLink() throws Exception
	{
	
		WebElementWrapper.clickElementByXpath(designSchoolLink, driver);
	
		
	}
	
	public static void clickTrendsLink() throws Exception
	{
		
		WebElementWrapper.clickElementByXpath(trendsLink, driver);
	
		
	}
	
	public static void clickPicsartProLink() throws Exception
	{
	
		WebElementWrapper.clickElementByXpath(picsartProLink, driver);
		
		
	}
	
	public static void clickNewsLink() throws Exception
	{
		
		WebElementWrapper.clickElementByXpath(newsLink, driver);
		
	}
	

	public static void searchCategory() throws Exception
	{
		
		WebElementWrapper.clickElementByXpath(searchBttn, driver);
		WebElementWrapper.enterTextByXpath(searchText, driver,prop.getProperty("searchText"));
		
	}
	
}
