package com.pages.ada;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
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
	
	By link_Apply = By.xpath("//form[contains(@class,'menu-bar-height')] //a[text()='Apply']");
	By cookiesNotification = By.xpath("//span[contains(text(),'Your privacy is important to us')]");
	By privacyAccept = By.xpath("//button[text()=' I accept']");
	By link_ViewAllDevices = By.xpath("//a[text() = 'View all devices']");
	By Out_Of_Stock_Msg = By.xpath("//span[text()='Out of stock']");
	By Out_Of_Stock_Txt = By.xpath("//span[text()='Out of Stock']");
	By Notify_Me_button = By.xpath("//button[text()='Notify Me']");
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
	By You_Are_In_Loop_Msg = By.xpath("//span[text()='You’re in the loop!']");
	By We_Will_Let_You_KnowText = By.xpath("//div[@class='content-frame-text']//span[1]");
	By Okay_Button = By.xpath("//button[text()='Okay']");
	By magnifyBtn = By.xpath("//div[@class='go_card-zoom']");
	By searchBar = By.xpath("//input[@placeholder='Search by brand, model, feature, plan value']");
	By filters = By.xpath("//h2[text()=' Filters ']");

	By productGallery = By.xpath("//li[text()='Product Gallery']");
	By productDetails = By.xpath("//li[text()='Product Details']");
	By deviceNameinPDPage = By.xpath("//div[@class='go_text-h1']");
	By color_Finish = By.xpath("//span[text()='Color/Finish']//following-sibling::div//label");
	By capacity = By.xpath("//span[text()='Capacity']//following::span[1]");
	By contractDuration = By.xpath("//span[text()='Contract duration']//following::span[1]");
	By cashoutAmount = By.xpath("//span[text()='Cashout Amount']//following-sibling::span");
	By forReservationTag = By.xpath("//span[text()='For reservation']");
	By note = By.xpath("//span[contains(text(),'Note:')]");
	By wantToknowAboutGplans = By.xpath("//div[text()='Want to know more about our new GPlans?']");
	By discoverGplanBelow = By.xpath("//span[text()='Discover GPlans below.']");
	By planCard = By.xpath("//div[@class='go_carousel-list-wrapper go_no-overflow']");
	By reserveWithThisDevice = By.xpath("//button[text()=' Reserve this device ']");
	By selectAnotherDevice = By.xpath("//span[text()='Select another device']");
	By features = By.xpath("//a[text()='Features']");
	By promos = By.xpath("//a[text()='Promos']");
	By faqText1 = By.xpath("(//div[@class='item-text'])[1]");
	By faqText2 = By.xpath("(//div[@class='item-text'])[2]");
	By faqText3 = By.xpath("(//div[@class='item-text'])[3]");
	By faqText4 = By.xpath("(//div[@class='item-text'])[4]");
	By faqText5 = By.xpath("(//div[@class='item-text'])[5]");
	By faqText6 = By.xpath("(//div[@class='item-text'])[6]");
	By buildMyPlan = By.xpath("//div[text()=' Build my plan ']");
	

	
	
	
	
	
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
	public WebElement get_We_Will_Let_You_KnowText() {
		return DriverManager.getDriver().findElement(We_Will_Let_You_KnowText);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_Okay_Button() {
		return DriverManager.getDriver().findElement(Okay_Button);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_link_Apply() {
		return DriverManager.getDriver().findElement(link_Apply);
	}
	/********************************************************************************************************************************/
	public WebElement get_link_ViewAllDevices() {
		return DriverManager.getDriver().findElement(link_ViewAllDevices);
	}
	/********************************************************************************************************************************/
	public WebElement get_privacyAccept() {
		return DriverManager.getDriver().findElement(privacyAccept);
	}
	/********************************************************************************************************************************/
	public WebElement get_magnifyBtn() {
		return DriverManager.getDriver().findElement(magnifyBtn);
	}
	/********************************************************************************************************************************/
	public WebElement get_searchBar() {
		return DriverManager.getDriver().findElement(searchBar);
	}
	/********************************************************************************************************************************/


	/********************************************************************************************************************************/
	public WebElement get_productDetails() {
		return DriverManager.getDriver().findElement(productDetails);
	}

	/********************************************************************************************************************************/
	public WebElement get_productGallery() {
		return DriverManager.getDriver().findElement(productGallery);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_discoverGplanBelow() {
		return DriverManager.getDriver().findElement(discoverGplanBelow);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_reserveWithThisDevice() {
		return DriverManager.getDriver().findElement(reserveWithThisDevice);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_selectAnotherDevice() {
		return DriverManager.getDriver().findElement(selectAnotherDevice);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_deviceNameinPDPage() {
		return DriverManager.getDriver().findElement(deviceNameinPDPage);
	}
	
	/********************************************************************************************************************************/
	public List<WebElement> get_color_Finish() {
		return DriverManager.getDriver().findElements(color_Finish);
	}
		
	/********************************************************************************************************************************/
	public WebElement get_capacity() {
		return DriverManager.getDriver().findElement(capacity);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_contractDuration() {
		return DriverManager.getDriver().findElement(contractDuration);
	}
	
	/********************************************************************************************************************************/
	
	
	
	
	
	
	/********************************************************************************************************************************/

	public boolean isElementExist(String message, String element, int waitTime) {
		boolean flag = false;

		switch (element) {
		
		case "link_Apply":
			flag = waitForElementVisibility(link_Apply, waitTime);
			break;
		case "link_ViewAllDevices":
			flag = waitForElementVisibility(link_ViewAllDevices, waitTime);
			break;
		case "cookiesNotification":
			flag = waitForElementVisibility(cookiesNotification, waitTime);
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
		case "We_Will_Let_You_KnowText":
			flag = waitForElementVisibility(We_Will_Let_You_KnowText, waitTime);
			break;
		case "Okay_Button":
			flag = waitForElementVisibility(Okay_Button, waitTime);
			break;
		case "filters":
			flag = waitForElementVisibility(filters, waitTime);
			break;
			
		case "productDetails":
			flag = waitForElementVisibility(productDetails, waitTime);
			break;
		case "productGallery":
			flag = waitForElementVisibility(productGallery, waitTime);
			break;
		case "deviceNameinPDPage":
			flag = waitForElementVisibility(deviceNameinPDPage, waitTime);
			break;
		case "color_Finish":
			flag = waitForElementVisibility(color_Finish, waitTime);
			break;
		case "capacity":
			flag = waitForElementVisibility(capacity, waitTime);
			break;	
		case "contractDuration":
			flag = waitForElementVisibility(contractDuration, waitTime);
			break;	
		case "cashoutAmount":
			flag = waitForElementVisibility(cashoutAmount, waitTime);
			break;	
		case "forReservationTag":
			flag = waitForElementVisibility(forReservationTag, waitTime);
			break;
		case "note":
			flag = waitForElementVisibility(note, waitTime);
			break;
		case "wantToknowAboutGplans":
			flag = waitForElementVisibility(wantToknowAboutGplans, waitTime);
			break;	
		case "discoverGplanBelow":
			flag = waitForElementVisibility(discoverGplanBelow, waitTime);
			break;
		case "planCard":
			flag = waitForElementVisibility(planCard, waitTime);
			break;
		case "reserveWithThisDevice":
			flag = waitForElementVisibility(reserveWithThisDevice, waitTime);
			break;	
		case "selectAnotherDevice":
			flag = waitForElementVisibility(selectAnotherDevice, waitTime);
			break;	
		case "buildMyPlan":
			flag = waitForElementVisibility(buildMyPlan, waitTime);
			break;	
		case "features":
			flag = waitForElementVisibility(features, waitTime);
			break;
		case "promos":
			flag = waitForElementVisibility(promos, waitTime);
			break;
		case "faqText1":
			flag = waitForElementVisibility(faqText1, waitTime);
			break;	
		case "faqText2":
			flag = waitForElementVisibility(faqText2, waitTime);
			break;	
		case "faqText3":
			flag = waitForElementVisibility(faqText3, waitTime);
			break;	
		case "faqText4":
			flag = waitForElementVisibility(faqText4, waitTime);
			break;	
		case "faqText5":
			flag = waitForElementVisibility(faqText5, waitTime);
			break;	
		case "faqText6":
			flag = waitForElementVisibility(faqText6, waitTime);
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
		case "Notify_Me_button":
			flag = waitForElementClickable(Notify_Me_button, waitTime);
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
		case "link_Apply":
			ele = DriverManager.getDriver().findElement(link_Apply);
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
			
			case "link_Apply":
				get_link_Apply().click();
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
			case "Notify_Me_Button1":
				get_Notify_Me_Button1().click();
				break;
			case "Okay_Button":
				get_Okay_Button().click();
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
			case "link_Apply":
		         jse.executeScript("arguments[0].click();", get_link_Apply());		
		         break;
			case "Notify_Me_button":
		         jse.executeScript("arguments[0].click();", get_Notify_Me_button());		
		         break;
			case "Notify_Me_Button1":
		         jse.executeScript("arguments[0].click();", get_Notify_Me_Button1());		
		         break;
			case "Email_Address_Field":
		         jse.executeScript("arguments[0].click();", get_Email_Address_Field());		
		         break; 
			case "link_ViewAllDevices":
		         jse.executeScript("arguments[0].click();", get_link_ViewAllDevices());		
		         break;
			case "magnifyBtn":
		         jse.executeScript("arguments[0].click();", get_magnifyBtn());		
		         break;
			case "productGallery":
		         jse.executeScript("arguments[0].click();", get_productGallery());		
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
