package com.pages.omt;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import globeOnline_CommonMethods.DriverManager;

public class Renewal_OMT_page extends BasePage {
	//Signin
	By AccountBtn = By.xpath("//span[contains(text(), 'Account')]");
	By SignInBtn = By.xpath("//span[contains(text(), 'Sign in')]");
	By LoginUsername = By.xpath("//input[@id='username']");
	By LoginPassword = By.xpath("//input[@id='password']");
	By LoginBtn = By.xpath("//button[contains(text(), 'Sign in')]");
	By EntitiesBtn = By.xpath("//span[contains(text(), ' Entities ')]");
	By AppllEntryBtn = By.xpath("//span[contains(text(), 'Application Entry')]");
	By SearchField = By.xpath("//input[@name='searchTerm']");
	By SearchError = By.xpath("//h6[contains(text(), 'No results found')]");
	By fCheckbox = By.xpath("(//input[@type='checkbox'])[1]");
	By ViewBtn = By.xpath("//span[contains(text(), 'View')]");
	By EditBtn = By.xpath("//button[@class='btn btn-primary btn-sm btn-block mb-1']");
	By Backbutton = By.xpath("(//span[contains(text(),'Back')])");

	By Accountbutton = By.xpath("//span[contains(text(),' Account ')]");
	//Account
	By Account = By.xpath("//span[contains(text(),' Account ')]");
	By Account_Signout = By.xpath("//span[contains(text(),'Sign out')]");
	By Account_Signin = By.xpath("//span[contains(text(),'Sign in')]");

	//Dashboard	
	By Dashboard_DateSubmitted = By.xpath("//td//ngb-highlight[contains(text(), '2023')]");
	By Dashboard_RefNum = By.xpath("//span[contains(text(), 'GLE')]");
	By Dashboard_LName = By.xpath("(//td//ngb-highlight)[3]");
	By Dashboard_FName = By.xpath("(//td//ngb-highlight)[4]");
	By Dashboard_PlanAvailed = By.xpath("//td//ngb-highlight[contains(text(), 'GPlan')]");
	By Dashboard_Dispo = By.xpath("(//td//ngb-highlight)[6]");
	By Dashboard_Reason = By.xpath("(//td//ngb-highlight)[7]");
	By Dashboard_Assignee = By.xpath("(//td//ngb-highlight)[8]");
	By ForVerification = By.xpath("//ngb-highlight[contains(text(),'For Payment')]");
	
	By POFC_Img = By.xpath("(//img[@class='img-fluid'])");
	By POFC_Type = By.xpath("//select[@name='pofcType']");
	By POFC_Verification = By.xpath("//select[@name='pofcVerification']");
	By POFC_Reason = By.xpath("(//input[@id='reason'])");
	By POFC_DateReviewed = By.xpath("(//input[@id='dateReviewed'])");
	By POFC_Verficationfinding1=By.xpath("(//textarea[@id='verificationFindings'])");
	
	


	//-----DASHBOARD-----
	/*************************************DashBoard*********************************************************************/
	public WebElement get_SearchField() {
		return DriverManager.getDriver().findElement(SearchField);
	}
	/********************************************************************************************************************************/
	public WebElement get_SearchError() {
		return DriverManager.getDriver().findElement(SearchError);
	}
	/********************************************************************************************************************************/
	public WebElement get_Dashboard_DateSubmitted() {
		return DriverManager.getDriver().findElement(Dashboard_DateSubmitted);
	}
	/********************************************************************************************************************************/
	public WebElement get_Dashboard_RefNum() {
		return DriverManager.getDriver().findElement(Dashboard_RefNum);
	}
	/********************************************************************************************************************************/
	public WebElement get_Dashboard_LName() {
		return DriverManager.getDriver().findElement(Dashboard_LName);
	}
	/********************************************************************************************************************************/
	public WebElement get_Dashboard_FName() {
		return DriverManager.getDriver().findElement(Dashboard_FName);
	}
	/********************************************************************************************************************************/
	public WebElement get_Dashboard_PlanAvailed() {
		return DriverManager.getDriver().findElement(Dashboard_PlanAvailed);
	}
	/********************************************************************************************************************************/
	public WebElement get_Dashboard_Dispo() {
		return DriverManager.getDriver().findElement(Dashboard_Dispo);
	}
	/********************************************************************************************************************************/
	public WebElement get_Dashboard_Reason() {
		return DriverManager.getDriver().findElement(Dashboard_Reason);
	}
	/********************************************************************************************************************************/
	public WebElement get_Dashboard_Assignee() {
		return DriverManager.getDriver().findElement(Dashboard_Assignee);
	}

	/*******************************Sign In and Sign Out******************************************************************/

	public WebElement get_Accountbutton() {
		return DriverManager.getDriver().findElement(Accountbutton);
	}
	/********************************************************************************************************************************/
	public WebElement get_Account() {
		return DriverManager.getDriver().findElement(Account);
	}
	/********************************************************************************************************************************/
	public WebElement get_Account_Signout() {
		return DriverManager.getDriver().findElement(Account_Signout);
	}
	/********************************************************************************************************************************/
	public WebElement get_Account_Signin() {
		return DriverManager.getDriver().findElement(Account_Signin);
	}
	/********************************************************************************************************************************/
	/********************************************************************************************************************************/
	public WebElement get_LoginUsername() {
		return DriverManager.getDriver().findElement(LoginUsername);
	}
	/********************************************************************************************************************************/
	public WebElement get_LoginPassword() {
		return DriverManager.getDriver().findElement(LoginPassword);
	}
	/********************************************************************************************************************************/
	public WebElement get_LoginBtn() {
		return DriverManager.getDriver().findElement(LoginBtn);
	}
	/********************************************************************************************************************************/
	public WebElement get_EntitiesBtn() {
		return DriverManager.getDriver().findElement(EntitiesBtn);
	}	
	/********************************************************************************************************************************/
	public WebElement get_AppllEntryBtn() {
		return DriverManager.getDriver().findElement(AppllEntryBtn);
	}
	/********************************************************************************************************************************/
	public WebElement get_fCheckbox() {
		return DriverManager.getDriver().findElement(fCheckbox);
	}	
	/********************************************************************************************************************************/
	public WebElement get_ViewBtn() {
		return DriverManager.getDriver().findElement(ViewBtn);
	}	
	/********************************************************************************************************************************/
	public WebElement get_EditBtn() {
		return DriverManager.getDriver().findElement(EditBtn);
	}
	/********************************************************************************************************************************/
	public WebElement get_Backbutton() {
		return DriverManager.getDriver().findElement(Backbutton);
	}
	/********************************************************************************************************************************/
	public WebElement get_SignInBtn() {
		return DriverManager.getDriver().findElement(SignInBtn);
	}


	/********************************************************************************************************************************/
	public WebElement get_POFC_Type() {
		return DriverManager.getDriver().findElement(POFC_Type);
	}
	/********************************************************************************************************************************/
	public WebElement get_POFC_Verification() {
		return DriverManager.getDriver().findElement(POFC_Verification);
	}
	/********************************************************************************************************************************/
	public WebElement get_POFC_Reason() {
		return DriverManager.getDriver().findElement(POFC_Reason);
	}
	/********************************************************************************************************************************/
	public WebElement get_POFC_DateReviewed() {
		return DriverManager.getDriver().findElement(POFC_DateReviewed);
	}
	
	public WebElement get_POFC_Verficationfinding1()
	{
		return DriverManager.getDriver().findElement(POFC_Verficationfinding1);
	}


	public boolean isElementExist(String message, String element, int waitTime) {
		boolean flag = false;

		switch (element) {
		//dashboard
		case "Accountbutton":
			flag = waitForElementVisibility(Accountbutton, waitTime);
			break;
		case "Dashboard_DateSubmitted":
			flag = waitForElementVisibility(Dashboard_DateSubmitted, waitTime);
			break;
		case "Dashboard_RefNum":
			flag = waitForElementVisibility(Dashboard_RefNum, waitTime);
			break;
		case "Dashboard_LName":
			flag = waitForElementVisibility(Dashboard_LName, waitTime);
			break;
		case "Dashboard_FName":
			flag = waitForElementVisibility(Dashboard_FName, waitTime);
			break;
		case "Dashboard_PlanAvailed":
			flag = waitForElementVisibility(Dashboard_PlanAvailed, waitTime);
			break;
		case "Dashboard_Dispo":
			flag = waitForElementVisibility(Dashboard_Dispo, waitTime);
			break;
		case "Dashboard_Reason":
			flag = waitForElementVisibility(Dashboard_Reason, waitTime);
			break;
		case "Dashboard_Assignee":
			flag = waitForElementVisibility(Dashboard_Assignee, waitTime);
			break;
		case "ForVerification":
			flag = waitForElementVisibility(ForVerification, waitTime);
			break;
		case "ViewBtn":
			flag = waitForElementVisibility(ViewBtn, waitTime);
			break;
		case "EditBtn":
			flag = waitForElementVisibility(EditBtn, waitTime);
			break;
		case "POFC_Img":
			flag = waitForElementVisibility(POFC_Img, waitTime);
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
	public boolean isClickable(String element, int waitTime) {

		boolean flag = false;

		switch (element) {
		
		case "Accountbutton":
			flag = waitForElementClickable(Accountbutton, waitTime);
			break;
		case "LoginUsername":
			flag = waitForElementClickable(LoginUsername, waitTime);
			break;
		case "LoginPassword":
			flag = waitForElementClickable(LoginPassword, waitTime);
			break;
		case "SignInBtn":
			flag = waitForElementClickable(SignInBtn, waitTime);
			break;

		}

		return flag;
	}
	/********************************************************************************************************************************/
	public void moveToElement(String element) {

		WebElement ele = null;

		switch (element) {
		
		case "Accountbutton":
			ele = DriverManager.getDriver().findElement(Accountbutton);
			break;
		case "LoginUsername":
			ele = DriverManager.getDriver().findElement(LoginUsername);
			break;
		case "LoginPassword":
			ele = DriverManager.getDriver().findElement(LoginPassword);
			break;
		case "SignInBtn":
			ele = DriverManager.getDriver().findElement(SignInBtn);
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
	/********************************************************************************************************************************/
	public void scroll_vertical(int y_Axis) {
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("window.scrollBy(0," + y_Axis + ")", "");
	}
	/********************************************************************************************************************************/
	public void clickOnElement(String type, String eleName, String ele) {

		try {
			switch (ele) {
			
			case "Accountbutton":
				get_Accountbutton().click();
				break;
			case "LoginUsername":
				get_LoginUsername().click();
				break;
			case "LoginPassword":
				get_LoginPassword().click();
				break;
			
			case "SignInBtn":
				get_SignInBtn().click();
				break;
			case "EntitiesBtn":
				get_EntitiesBtn().click();
				break;
			case "AppllEntryBtn":
				get_AppllEntryBtn().click();
				break;
			case "SearchError":
				get_SearchError().click();
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

