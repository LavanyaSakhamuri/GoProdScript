package com.pages.Acqui;

import org.openqa.selenium.By;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import com.pages.Acqui.BasePage;

import globeOnline_CommonMethods.DriverManager;
import junit.framework.Assert;

public class AcquiConformationPage extends BasePage {
	
	By AcquiConfirmation = By.xpath("//h1[text()=' Acquisition - Confirmation ']");
	By QuestionMarkSymbol = By.xpath("//span[@class='go_error-icon -go_prompt']");
	By AreYouApplyingyourGlobe = By.xpath("//span[contains(@class,'go_text-h2-big-smallest')] //p[text()='Are you applying or renewing your Globe']");
	By PostpaidPlan = By.xpath("//span[contains(@class,'go_text-h2-big-smallest')] //p[text()='Postpaid plan?']");
	By RenewingMyPlan  = By.xpath("//span[text()=' I am renewing my plan ']");
	By AdditionalPlan = By.xpath("(//div[@class='go_button-block go_flex-end -go_prompt']//span)[2]");
	By Acquisition_Processing = By.xpath("//h1[text()=' Acquisition - Processing ']");
	By We_checking_few_things = By.xpath("//h1[text()='We're checking a few things!']");
	By Hang_in_there = By.xpath("//h1[text()='Hang in there!']");
	By Thanks_for_being_patient = By.xpath("//h1[text()='Thanks for being patient!']");




	
	
	
	
	
	
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
			
		case "QuestionMarkSymbol":
			flag = waitForElementVisibility(QuestionMarkSymbol, waitTime);
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
		case "Acquisition_Processing":
			flag = waitForElementVisibility(Acquisition_Processing, waitTime);
			break;
		case "We_checking_few_things":
			flag = waitForElementVisibility(We_checking_few_things, waitTime);
			break;
		case "Hang_in_there":
			flag = waitForElementVisibility(Hang_in_there, waitTime);
			break;
		case "Thanks_for_being_patient":
			flag = waitForElementVisibility(Thanks_for_being_patient, waitTime);
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
	
	
	public void jsClick(String message, String element) {
		
		JavascriptExecutor jse = (JavascriptExecutor)DriverManager.getDriver();
		try {
			switch (element) {
			case "AdditionalPlan":
		         jse.executeScript("arguments[0].click();", get_AdditionalPlan());		
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
