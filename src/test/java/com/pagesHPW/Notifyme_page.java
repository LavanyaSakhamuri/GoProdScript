package com.pagesHPW;

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
import org.testng.Assert;

import globeOnline_CommonMethods.DriverManager;

public class Notifyme_page extends BasePage {
	
	By link_MenuBuy = By.xpath("//form[contains(@class,'menu-bar-height')] //a[text()='Buy']");
	By link_Home_Prepaid_Wifi = By.xpath("//a[text()='Globe At Home Prepaid WiFi']");
	By Out_Of_Stock_Msg = By.xpath("//span[text()='Out of stock']");
	By Out_Of_Stock_Txt = By.xpath("//span[text()='Out of Stock']");
	By Notify_Me_button = By.xpath("//button[text()=' Notify me ']");
	By Let_Me_Know_Msg = By.xpath("//span[contains(text(),'Let me know when')]");
	By Email_Address_Field = By.xpath("//label[text()='Email address']//parent::div//input");
	By Mobile_Number_Field = By.xpath("//label[text()='Mobile number']//parent::div//input");
	By Cancel_Button = By.xpath("(//span[text()='Cancel']//parent::button)[1]");
	By Notify_Me_Button1 = By.xpath("(//span[text()='Notify me']//parent::button)[1]");
	By Email_Is_mandatory_Error_Msg = By.xpath("//span[text()='Email is mandatory.']");
	By MobileNo_Is_mandatory_Error_Msg = By.xpath("//span[text()='Mobile number is mandatory.']");
	By Please_Provide_Valid_Email_Error_Msg = By.xpath("//span[text()='Please provide valid email.']");
	By Please_Provide_Valid_Number_Error_Msg = By.xpath("//span[text()='Please provide valid mobile number.']");
	By Already_A_Subscriber_Error_Msg = By.xpath("//span[text()='You are already subscribed for this alert']");
	By You_Are_In_Loop_Msg = By.xpath("//span[text()='Youâ€™re in the loop!']");
	By We_Will_Let_You_Know_When_HPW_Available = By.xpath("//div[@class='content-frame-text']//span[1]");
	By Okay_Button = By.xpath("//button[text()='Okay']");
	By LTE_AdvancedLink = By.xpath("//a[text()='LTE Advanced']");

	
	
	
	
	/********************************************************************************************************************************/
	public WebElement get_link_MenuBuy() {
		return DriverManager.getDriver().findElement(link_MenuBuy);
	}

	/********************************************************************************************************************************/
	public WebElement get_LTE_AdvancedLink() {
		return DriverManager.getDriver().findElement(LTE_AdvancedLink);
	}

	/********************************************************************************************************************************/
	public WebElement get_link_Home_Prepaid_Wifi() {
		return DriverManager.getDriver().findElement(link_Home_Prepaid_Wifi);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_Out_Of_Stock_Msg() {
		return DriverManager.getDriver().findElement(Out_Of_Stock_Msg);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_Out_Of_Stock_Txt() {
		return DriverManager.getDriver().findElement(Out_Of_Stock_Txt);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_Notify_Me_button() {
		return DriverManager.getDriver().findElement(Notify_Me_button);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_Let_Me_Know_Msg() {
		return DriverManager.getDriver().findElement(Let_Me_Know_Msg);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_Email_Address_Field() {
		return DriverManager.getDriver().findElement(Email_Address_Field);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_Mobile_Number_Field() {
		return DriverManager.getDriver().findElement(Mobile_Number_Field);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_Cancel_Button() {
		return DriverManager.getDriver().findElement(Cancel_Button);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_Notify_Me_Button1() {
		return DriverManager.getDriver().findElement(Notify_Me_Button1);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_Email_Is_mandatory_Error_Msg() {
		return DriverManager.getDriver().findElement(Email_Is_mandatory_Error_Msg);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_MobileNo_Is_mandatory_Error_Msg() {
		return DriverManager.getDriver().findElement(MobileNo_Is_mandatory_Error_Msg);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_Please_Provide_Valid_Email_Error_Msg() {
		return DriverManager.getDriver().findElement(Please_Provide_Valid_Email_Error_Msg);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_Please_Provide_Valid_Number_Error_Msg() {
		return DriverManager.getDriver().findElement(Please_Provide_Valid_Number_Error_Msg);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_Already_A_Subscriber_Error_Msg() {
		return DriverManager.getDriver().findElement(Already_A_Subscriber_Error_Msg);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_You_Are_In_Loop_Msg() {
		return DriverManager.getDriver().findElement(You_Are_In_Loop_Msg);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_We_Will_Let_You_Know_When_HPW_Available() {
		return DriverManager.getDriver().findElement(We_Will_Let_You_Know_When_HPW_Available);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_Okay_Button() {
		return DriverManager.getDriver().findElement(Okay_Button);
	}
	
	/********************************************************************************************************************************/
//	public WebElement get_acccordionButton() {
//		return DriverManager.getDriver().findElement(acccordionButton);
//	}
//	
	
	
	
	
	
	
	/********************************************************************************************************************************/

	public boolean isElementExist(String message, String element, int waitTime) {
		boolean flag = false;

		switch (element) {
		case "link_MenuBuy":
			flag = waitForElementVisibility(link_MenuBuy, waitTime);
			break;
		case "Out_Of_Stock_Msg":
			flag = waitForElementVisibility(Out_Of_Stock_Msg, waitTime);
			break;
		case "Notify_Me_button":
			flag = waitForElementVisibility(Notify_Me_button, waitTime);
			break;	
		case "Let_Me_Know_Msg":
			flag = waitForElementVisibility(Let_Me_Know_Msg, waitTime);
			break;
		case "Email_Address_Field":
			flag = waitForElementVisibility(Email_Address_Field, waitTime);
			break;
		case "Mobile_Number_Field":
			flag = waitForElementVisibility(Mobile_Number_Field, waitTime);
			break;
		case "link_Home_Prepaid_Wifi":
			flag = waitForElementVisibility(link_Home_Prepaid_Wifi, waitTime);
			break;
		case "Cancel_Button":
			flag = waitForElementVisibility(Cancel_Button, waitTime);
			break;
		case "Notify_Me_Button1":
			flag = waitForElementVisibility(Notify_Me_Button1, waitTime);
			break;
		case "Email_Is_mandatory_Error_Msg":
			flag = waitForElementVisibility(Email_Is_mandatory_Error_Msg, waitTime);
			break;
		case "MobileNo_Is_mandatory_Error_Msg":
			flag = waitForElementVisibility(MobileNo_Is_mandatory_Error_Msg, waitTime);
			break;
		case "Please_Provide_Valid_Email_Error_Msg":
			flag = waitForElementVisibility(Please_Provide_Valid_Email_Error_Msg, waitTime);
			break;
		case "Please_Provide_Valid_Number_Error_Msg":
			flag = waitForElementVisibility(Please_Provide_Valid_Number_Error_Msg, waitTime);
			break;
		case "Already_A_Subscriber_Error_Msg":
			flag = waitForElementVisibility(Already_A_Subscriber_Error_Msg, waitTime);
			break;
		case "You_Are_In_Loop_Msg":
			flag = waitForElementVisibility(You_Are_In_Loop_Msg, waitTime);
			break;
		case "We_Will_Let_You_Know_When_HPW_Available":
			flag = waitForElementVisibility(We_Will_Let_You_Know_When_HPW_Available, waitTime);
			break;
		case "Okay_Button":
			flag = waitForElementVisibility(Okay_Button, waitTime);
			break;
		case "LTE_AdvancedLink":
			flag = waitForElementVisibility(LTE_AdvancedLink, waitTime);
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
		
		case "link_MenuBuy":
			flag = waitForElementClickable(link_MenuBuy, waitTime);
			break;
		case "Notify_Me_button":
			flag = waitForElementClickable(Notify_Me_button, waitTime);
			break;
		case "link_Home_Prepaid_Wifi":
			flag = waitForElementClickable(link_Home_Prepaid_Wifi, waitTime);
			break;
		case "Notify_Me_Button1":
			flag = waitForElementClickable(Notify_Me_Button1, waitTime);
			break;
		case "Okay_Button":
			flag = waitForElementClickable(Okay_Button, waitTime);
			break;
		case "Cancel_Button":
			flag = waitForElementClickable(Cancel_Button, waitTime);
			break;
		
			
		}

		return flag;
	}
	/********************************************************************************************************************************/
	public void moveToElement(String element) {

		WebElement ele = null;

		switch (element) {
		case "link_MenuBuy":
			ele = DriverManager.getDriver().findElement(link_MenuBuy);
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
			
			case "privacyAccept":
				get_link_MenuBuy().click();
				break;
			case "Notify_Me_button":
				get_Notify_Me_button().click();
				break;
			case "Email_Address_Field":
				get_Email_Address_Field().click();
				break;
			case "Mobile_Number_Field":
				get_Mobile_Number_Field().click();
				break;
			case "Cancel_Button":
				get_Cancel_Button().click();
				break;
			case "link_Home_Prepaid_Wifi":
				get_link_Home_Prepaid_Wifi().click();
				break;
			case "Notify_Me_Button1":
				get_Notify_Me_Button1().click();
				break;
			case "Okay_Button":
				get_Okay_Button().click();
				break;
			case "LTE_AdvancedLink":
				get_LTE_AdvancedLink().click();
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
	
	public void jsClick(String message, String element) {
		//Object S;
		JavascriptExecutor jse = (JavascriptExecutor)DriverManager.getDriver();
		try {
			switch (element) {
			case "link_MenuBuy":
		         jse.executeScript("arguments[0].click();", get_link_MenuBuy());		
		         break;
			case "Notify_Me_button":
		         jse.executeScript("arguments[0].click();", get_Notify_Me_button());		
		         break;     
			case "Email_Address_Field":
		         jse.executeScript("arguments[0].click();", get_Email_Address_Field());		
		         break;          
		   }
		} catch (ElementClickInterceptedException e1) {
			System.out.println( " : " + element + " : " + "Element is not clickable : " + e1.getMessage());
			Assert.assertTrue(false);
		} catch (NoSuchElementException e2) {
			System.out.println( " : " + element + " : " + "Element not found : " + e2.getMessage());
			Assert.assertTrue(false);
		} catch (Exception e) {
			System.out.println( " : " + element + " : " + "Exception : " + e.getMessage());
			Assert.assertTrue(false);
		}

		System.out.println("Clicked on " + " : " + element);	
		
	}

}
