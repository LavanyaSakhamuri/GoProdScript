package com.pages.ada;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import globeOnline_CommonMethods.DriverManager;
import junit.framework.Assert;

public class AcquisitionConfirmation extends BasePage{
	
//	Acquisition Confirmation Xpaths
	By AcquiConfirmation = By.xpath("//h1[text()=' Acquisition - Confirmation ']");
	By ErrorIcon = By.xpath("//span[@class='go_error-icon -go_prompt']");
	By AreYouApplyingyourGlobe = By.xpath("//span[contains(@class,'go_text-h2-big-smallest')] //p[text()='Are you applying or renewing your Globe']");
	By PostpaidPlan = By.xpath("//span[contains(@class,'go_text-h2-big-smallest')] //p[text()='Postpaid plan?']");
	By RenewingMyPlan  = By.xpath("//span[text()=' I am renewing my plan ']");
	By AdditionalPlan = By.xpath("//div[@class='go_button-block go_flex-end -go_prompt']//span[2]");
	
	
	
	
	
	
	/********************************************************************************************************************************/
	public WebElement get_RenewingMyPlan() {
		return DriverManager.getDriver().findElement(RenewingMyPlan);
	}
	public WebElement get_AdditionalPlan() {
		return DriverManager.getDriver().findElement(AdditionalPlan);
	}
	
	/********************************************************************************************************************************/

	/********************************************************************************************************************************/

	public boolean isElementExist(String message, String element, int waitTime) {
		
		boolean flag = false;

		switch (element) {
		case "AcquiConfirmation":
			flag = waitForElementVisibility(AcquiConfirmation, waitTime);
			break;
			
		case "ErrorIcon":
			flag = waitForElementVisibility(ErrorIcon, waitTime);
			break;
	
		case "AreYouApplyingyourGlobe":
			flag = waitForElementVisibility(AreYouApplyingyourGlobe, waitTime);
			break;

		case "PostpaidPlan":
			flag = waitForElementVisibility(PostpaidPlan, waitTime);
			break;
		
		case "RenewingMyPlan":
			flag = waitForElementVisibility(RenewingMyPlan, waitTime);
			break;
		
		case "AdditionalPlan":
			flag = waitForElementVisibility(AdditionalPlan, waitTime);
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
	public boolean isClickable(String element, int waitTime) {

		boolean flag = false;

		switch (element) {
		
		case "RenewingMyPlan":
			flag = waitForElementClickable(RenewingMyPlan, waitTime);
			break;
		case "AdditionalPlan":
			flag = waitForElementClickable(AdditionalPlan, waitTime);
			break;
			
		

		}

		return flag;
	}
	

	public void clickOnElement(String type, String eleName, String ele) {

		try {
			switch (ele) {
			
			case "RenewingMyPlan":
				get_RenewingMyPlan().click();
				break;
			case "AdditionalPlan":
				get_AdditionalPlan().click();
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
