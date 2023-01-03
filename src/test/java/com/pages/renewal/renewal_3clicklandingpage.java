package com.pages.renewal;

import java.util.NoSuchElementException;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;

import com.pages.renewal.BasePage;

import globeOnline_CommonMethods.DriverManager;


public class renewal_3clicklandingpage extends BasePage{
	By clicklanding3=By.xpath("//div[text()='Welcome back to Globe!']");
	By banner1postpaidplan=By.xpath("//h1[contains(text(),' Get the postpaid plan made just for you.')] ");
	By banner1continueplan=By.xpath("//button[contains(text(),' Renew with my current plan ')] ");
	By banner1checrecomendedkplan=By.xpath("//button[@class='gk-button gk-btn:murmur ng-star-inserted']");
	By banner2checkout=By.xpath("//span[text()='Check out our newest plans']");
	By banner2simonly3799=By.xpath("//span[text()='GPlan SIM-Only 3799']");
	By banner2unlimit=By.xpath("//span[text()='Unlimited data surfing']");
	By banner2planstart=By.xpath("//span[text()='Plan starts at']");
	By banner2planstartvalue=By.xpath("(//div[@class='go_sc-same-plan-carousel__rate-box'])//span[2]");
	By banner2showplan=By.xpath("(//button[text()=' Show plan details '])[1]");
	By Planvale_dropdownbtn = By.xpath("(//span[@class='go_filter-dropdown-icon'])[3]");
	By banner2simonly2499=By.xpath("//span[text()='GPlan SIM-only 2499']");
	By banner2moredata=By.xpath("//span[text()='More data, more fun']");
	By banner2planstartat=By.xpath("(//span[text()='Plan starts at'])[2]");
	By banner2planstartvalue2=By.xpath("(//div[@class='go_sc-same-plan-carousel__rate-box'])[2]//span[2]");
	By banner2showplan2=By.xpath("(//button[text()=' Show plan details '])[2]");
	By ProdApplywithDevice = By.xpath("//a[@class='go_btn go_outline go_text-small-action :anchor-tag ng-star-inserted']");
	By looking=By.xpath("//span[text()='Looking for devices?']");
	By prev=By.xpath("//div[@class='owl-nav disabled ng-star-inserted']//div[1]");
	By next=By.xpath("//div[@class='owl-nav disabled ng-star-inserted']//div[2]");
	By enjoy=By.xpath("//h2[text()=' Enjoy a #LifeMadeGreater ']");
	By simonly=By.xpath("//li[text()=' SIM-Only ']");
	By device=By.xpath("//li[text()=' Device ']");
	By gcash=By.xpath("//li[text()=' GCash ']");
	By alldata=By.xpath("//li[text()=' All-Data ']");
	By prev2=By.xpath("//div[@class='owl-nav ng-star-inserted']//div[1]");
	By next2=By.xpath("//div[@class='owl-nav ng-star-inserted']//div[2]");
	
	By alldata2499=By.xpath("//div[text()=' GPlan SIM-Only All Data 2499 ']");
	By applyFilter_Button = By.xpath("//button[text()=' Apply Filter ']");
	By SearchField = By.xpath("//input[@placeholder='Search by brand, model, feature, plan value']");
	By search_field = By.xpath("//input[@placeholder='Search by brand, model, feature, plan value']");
	
	
	public WebElement get_search_field() {
		return DriverManager.getDriver().findElement(search_field);
	}
	
	public WebElement get_SearchField() {
		return DriverManager.getDriver().findElement(SearchField);
	}
	
	
	public WebElement get_banner1continueplan()
	{
		return DriverManager.getDriver().findElement(banner1continueplan);
				
	}
	public WebElement get_banner1checrecomendedkplan()
	{
		return DriverManager.getDriver().findElement(banner1checrecomendedkplan);
				
	}
	public WebElement get_simonly()
	{
		return DriverManager.getDriver().findElement(simonly);
		
	}
	public WebElement get_applyFilter_Button() {
		return DriverManager.getDriver().findElement(applyFilter_Button);
	}
	
	public WebElement get_device()
	{
		return DriverManager.getDriver().findElement(device);
		
	}
	public WebElement get_gcash()
	{
		return DriverManager.getDriver().findElement(gcash);
		
	}
	public WebElement get_alldata()
	{
		return DriverManager.getDriver().findElement(alldata);
		
	}
	public WebElement get_next()
	{
		return DriverManager.getDriver().findElement(next);
		
	}
	public WebElement get_prev()
	{
		return DriverManager.getDriver().findElement(prev);
		
	}
	public WebElement get_prev2()
	{
		return DriverManager.getDriver().findElement(prev2);
		
	}
	public WebElement get_next2()
	{
		return DriverManager.getDriver().findElement(next2);
		
	}
	
	public boolean isElementExist(String message, String element, int waitTime) {
		boolean flag = false;

		switch (element) {
		case "clicklanding3":
			flag = waitForElementVisibility(clicklanding3, waitTime);
			break;
		case "banner1postpaidplan":
			flag = waitForElementVisibility(banner1postpaidplan, waitTime);
			break;
		case "banner1continueplan":
			flag = waitForElementVisibility(banner1continueplan, waitTime);
			break;
		case "banner1checrecomendedkplan":
			flag = waitForElementVisibility(banner1checrecomendedkplan, waitTime);
			break;
		case "banner2checkout":
			flag = waitForElementVisibility(banner2checkout, waitTime);
			break;
		case "banner2simonly3799":
			flag = waitForElementVisibility(banner2simonly3799, waitTime);
			break;
		case "banner2unlimit":
			flag = waitForElementVisibility(banner2unlimit, waitTime);
			break;
		case "banner2planstart":
			flag = waitForElementVisibility(banner2planstart, waitTime);
			break;
		case "banner2planstartvalue":
			flag = waitForElementVisibility(banner2planstartvalue, waitTime);
			break;
		case "banner2showplan":
			flag = waitForElementVisibility(banner2showplan, waitTime);
			break;
		case "banner2simonly2499":
			flag = waitForElementVisibility(banner2simonly2499, waitTime);
			break;
		case "search_field":
			flag = waitForElementVisibility(search_field, waitTime);
			break;
		case "banner2moredata":
			flag = waitForElementVisibility(banner2moredata, waitTime);
			break;
		case "banner2planstartat":
			flag = waitForElementVisibility(banner2planstartat, waitTime);
			break;
		case "banner2planstartvalue2":
			flag = waitForElementVisibility(banner2planstartvalue2, waitTime);
			break;
		case "banner2showplan2":
			flag = waitForElementVisibility(banner2showplan2, waitTime);
			break;
		case "looking":
			flag = waitForElementVisibility(looking, waitTime);
			break;
		case "prev":
			flag = waitForElementVisibility(prev, waitTime);
			break;
		case "next":
			flag = waitForElementVisibility(next, waitTime);
			break;
		case "enjoy":
			flag = waitForElementVisibility(enjoy, waitTime);
			break;
		case "simonly":
			flag = waitForElementVisibility(simonly, waitTime);
			break;
		case "SearchField":
			flag = waitForElementVisibility(SearchField, waitTime);
			break;
	
			
		case "device":
				flag = waitForElementVisibility(device, waitTime);
				break;				
		case "gcash":
			flag = waitForElementVisibility(gcash, waitTime);
			break;
		case "alldata":
			flag = waitForElementVisibility(alldata, waitTime);
			break;
		case "prev2":
			flag = waitForElementVisibility(prev2, waitTime);
			break;
		case "next2":
			flag = waitForElementVisibility(next2, waitTime);
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
	public void clickOnElement(String type, String eleName, String ele) {

		try {
			switch (ele) {
			case "next":
				get_next().click();
				break;
			case "applyFilter_Button":
				get_applyFilter_Button().click();
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
	
	public boolean isClickable(String element, int waitTime) {

		boolean flag = false;

		switch (element) {
		case "next":
			flag = waitForElementClickable(next, waitTime);
			break;
		case "prev2":
			flag=waitForElementClickable(prev2,waitTime);
			break;
		case "ProdApplywithDevice":
			flag = waitForElementClickable(ProdApplywithDevice, waitTime);
			break;
		case "Planvale_dropdownbtn":
			flag = waitForElementClickable(Planvale_dropdownbtn, waitTime);
			break;	
		}
			
			
		
		return flag;
	}
	
}
	
			


