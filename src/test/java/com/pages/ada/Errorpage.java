package com.pages.ada;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

//import com.browserstack.DriverManager;
//import com.ExtentListeners.ExtentManager;
//import com.ExtentListeners.ExtentTestManager;
//import com.browserstack.DriverManager;
import com.pages.ada.BasePage;

import globeOnline_CommonMethods.DriverManager;
import junit.framework.Assert;
public class Errorpage extends BasePage {

	private static final By Checkbox1 = null;

	private static final By Chockbox2 = null;

	private static final By Chockbox3 = null;

	private static final By Chockbox4 = null;

	private static final By Chockbox5 = null;

	static File file;

	//	public static WebDriverManager.getDriver() DriverManager.getDriver();
	//
	//	public LandingPage(WebDriverManager.getDriver() DriverManager.getDriver()) {
	//		this.DriverManager.getDriver() = DriverManager.getDriver();
	//	}
	//	error page

	/********************************************************************************************************************************/

	By AquisitionError = By.xpath("(//h1[contains(text(),' Acquisition - Error ')])[1]");
	By uh_oh = By.xpath("//span[contains(text(),'Uh-oh!')]");
	By sorry = By.xpath("//div[@class='still-processing-subtext ng-star-inserted']");
	By mobileNumber = By.xpath("//input[@placeholder='Mobile number']");
	By Email_Adress = By.xpath("//input[@placeholder='Email address']");
	By SubmitButton = By.xpath("//button[contains(text(),' Submit ')]");
	By GoBackButton = By.xpath("//button[contains(text(),'Go back')]");
	/********************************************************************************************************************************/

	//  Click on Goback Button
	public WebElement get_GoBackButton() {
		return DriverManager.getDriver().findElement(GoBackButton);
	}

	/********************************************************************************************************************************/


	public boolean isElementExist(String message, String element, int waitTime) {
		boolean flag = false;

		switch (element) {

		case "AquisitionError":
			flag = waitForElementVisibility(AquisitionError, waitTime);
			break;
		case "uh_oh":
			flag = waitForElementVisibility(uh_oh, waitTime);
			break;
		case "sorry":
			flag = waitForElementVisibility(sorry, waitTime);
			break;
		case "mobileNumber":
			flag = waitForElementVisibility(mobileNumber, waitTime);
			break;
		case "Email_Adress":
			flag = waitForElementVisibility(Email_Adress, waitTime);
			break;
		case "SubmitButton":
			flag = waitForElementVisibility(SubmitButton, waitTime);
			break;
		case "GoBackButton":
			flag = waitForElementVisibility(GoBackButton, waitTime);
			break;	

		}

		if (flag) {
			//			ExtentTestManager.logInfo(message + " - exists");
			System.out.println(message + " - exists");
		} else {
			//			ExtentTestManager.logFail(message + " - do not exists");
			System.out.println(message + " - do not exist");
		}

		return flag;
	}

	/********************************************************************************************************************************/

	/********************************************************************************************************************************/
	public void js_clickOnElement(String type, String eleName, String ele) {

		try {
			JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();


			switch (ele) {
			case "GoBackButton":
				js.executeScript("arguments[0].click();", get_GoBackButton());
				break;



			}
		} catch (ElementClickInterceptedException e1) {
			System.out.println(type + " : " + eleName + " : " + "Element is not clickable : " + e1.getMessage());
			Assert.assertTrue(false);
		} catch (NoSuchElementException e2) {
			System.out.println(type + " : " + eleName + " : " + "Element not found : " + e2.getMessage());
			Assert.assertTrue(false);
		} catch (Exception e) {
			System.out.println(type + " : " + eleName + " : " + "Exception : " + e.getMessage());
			Assert.assertTrue(false);
		}

		System.out.println("Clicked on " + type + " : " + eleName);
	}



	/*************************************************************************************************/


	/********************************************************************************************************************************/
	public boolean isClickable(String element, int waitTime) {

		boolean flag = false;

		switch (element) {
		case "GoBackButton":
			flag = waitForElementClickable(GoBackButton, waitTime);
			break;


		}

		return flag;
	}
	/********************************************************************************************************************************/
	public void moveToElement(String element) {

		WebElement ele = null;

		switch (element) {
		case "GoBackButton":
			ele = DriverManager.getDriver().findElement(GoBackButton);
			break;


		}

		try {
			Actions a = new Actions(DriverManager.getDriver());
			Thread.sleep(500L);
			a.moveToElement(ele).build().perform();
		} catch (Exception e) {

		}
	}	

	/********************************************************************************************************************************/
	public String getURLOfNewTab() {

		String title = "";
		try {
			Set<String> winID = DriverManager.getDriver().getWindowHandles();
			Iterator<String> winItr = winID.iterator();
			String parentID = winItr.next();
			String childID = winItr.next();

			DriverManager.getDriver().switchTo().window(childID);
			title = DriverManager.getDriver().getCurrentUrl();
			DriverManager.getDriver().close();
			DriverManager.getDriver().switchTo().window(parentID);

		} catch (Exception e) {
			System.out.println("FAIL : to get the tab title. Message :" + e.getMessage());
		}
		return title;
	}

	/********************************************************************************************************************************/
	public void write_OrderID_in_PropertiesFile(String key, String data) {
		FileOutputStream fileOut = null;
		FileInputStream fileIn = null;
		try {
			Properties p = new Properties();

			File file = new File(".//OrderID.properties");
			fileIn = new FileInputStream(file);
			p.load(fileIn);
			p.setProperty(key, data);
			fileOut = new FileOutputStream(file);
			p.store(fileOut, null);

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {

			try {
				fileOut.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
	//	public boolean get_checkbox1()
	//	{
	//		return DriverManager.getDriver().findElement(Checkbox1).isSelected();
	//	}

	/********************************************************************************************************************************/
	public void clickOnElement(String type, String eleName, String ele) {

		try {
			switch (ele) {
			case "GoBackButton":
				get_GoBackButton().click();
				break;


			}
		} catch (ElementClickInterceptedException e1) {
			System.out.println(type + " : " + eleName + " : " + "Element is not clickable : " + e1.getMessage());
			Assert.assertTrue(false);
		} catch (NoSuchElementException e2) {
			System.out.println(type + " : " + eleName + " : " + "Element not found : " + e2.getMessage());
			Assert.assertTrue(false);
		} catch (Exception e) {
			System.out.println(type + " : " + eleName + " : " + "Exception : " + e.getMessage());
			Assert.assertTrue(false);
		}

		System.out.println("Clicked on " + type + " : " + eleName);
	}





}