package com.org.picsartapp.Common;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.org.picsartapp.Utilies.Log;

public class WebElementWrapper {
	
	int shortWait = 6000;
	static int mediumWait = 10000;
	
	static WebDriverWait wait ;
	
	public static void clickElementByXpath(WebElement ele,WebDriver driver) throws Exception
	{
		try
		{
		Log.info("Searching for element"+ele );
		wait = new WebDriverWait(driver,mediumWait);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		Log.info(ele+" is clickable");
		ele.click();
		Thread.sleep(2000);
		Log.info("Element: '"+ele +"' clicked successful.");
		
		}
		catch(StaleElementReferenceException stale)
		{
			Log.info("StaleElementReferenceException");
			driver.navigate().refresh();
			ele.click();
		}
		catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Log.info("xpath : "+ele +"click by xpath failed");
			throw new Exception("NoSuchElementException!");
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Log.info("xpath : "+ele +"click by xpath failed");
			throw new Exception("Error at UI Execution!");
		}
		
		
	}
	
	
	public static void enterTextByXpath(WebElement ele,WebDriver driver,String text) throws Exception
	{
		try
		{
		Log.info("Searching for element"+ele );
		wait = new WebDriverWait(driver,mediumWait);
		wait.until(ExpectedConditions.visibilityOfAllElements(ele));
		Log.info(ele+" is clickable");
		ele.sendKeys(text);
		Log.info("Text enetered in element: '"+ele +"--"+text);
		Thread.sleep(2000);
		}
		catch(StaleElementReferenceException stale)
		{
			Log.info("StaleElementReferenceException");
			driver.navigate().refresh();
			ele.click();
		}
		catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Log.info("xpath : "+ele +"click by xpath failed");
			throw new Exception("NoSuchElementException!");
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Log.info("xpath : "+ele +"click by xpath failed");
			throw new Exception("Error at UI Execution!");
		}
		
	}
	
	

}
