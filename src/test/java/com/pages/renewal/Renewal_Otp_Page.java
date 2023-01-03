package com.pages.renewal;

import java.util.List;

import java.util.NoSuchElementException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.pages.Acqui.BasePage;

import globeOnline_CommonMethods.DriverManager;

public class Renewal_Otp_Page extends BasePage {
	
	By verificationNeeded = By.xpath("//span[text()=' Verification needed ']");
	By enterYourMobileNumber = By.xpath("//span[contains(text(), 'Enter your mobile number')]");
	By codeExpiresIn = By.xpath("//label[text()='Code expires in ']");
	By privacyPolicy = By.xpath("//p[contains(text(), 'By submitting, I understand that')]");
	By submitButton = By.xpath("//button[text()=' Submit ']");
	By mobileNumField = By.xpath("//input[@id='otpMsisdnInput' or @placeholder= ' ']");
	By getCodeButton = By.xpath("//button[text()=' Get code ']");
	By otpInput = By.xpath("//input[contains(@class, 'gk-otp-fields__input')]");
	By cantSendOtp = By.xpath("//button[text()=' Get code ']//following::span[1]");

	
	
	//Loading screen
	By renewalProcessing = By.xpath("//h1[text()=' Renewal - Processing ']");
	By checkingOutstandingBalance = By.xpath("//div[text()=' We’re checking for outstanding balances. ']");
	By checkingYourEligibility = By.xpath("//div[text()=' We’re checking your eligibility. ']");



	//div[text()=' We’re checking your eligibility. ']
	//div[text()=' We’re checking for outstanding balances. ']




	/********************************************************************************************************************************/
	public WebElement get_submitButton() {
		return DriverManager.getDriver().findElement(submitButton);
	}

	/********************************************************************************************************************************/
	public WebElement get_mobileNumField() {
		return DriverManager.getDriver().findElement(mobileNumField);
	}
	/********************************************************************************************************************************/
	public WebElement get_getCodeButton() {
		return DriverManager.getDriver().findElement(getCodeButton);
	}
	/********************************************************************************************************************************/
	public List<WebElement> get_otpInput() {
		return DriverManager.getDriver().findElements(otpInput);
	}
	/********************************************************************************************************************************/

	
	
	public boolean isElementExist(String message, String element, int waitTime) {
		boolean flag = false;

		switch (element) {
		case "verificationNeeded":
			flag = waitForElementVisibility(verificationNeeded, waitTime);
			break;
		case "enterYourMobileNumber":
			flag = waitForElementVisibility(enterYourMobileNumber, waitTime);
			break;
		case "codeExpiresIn":
			flag = waitForElementVisibility(codeExpiresIn, waitTime);
			break;
		case "privacyPolicy":
			flag = waitForElementVisibility(privacyPolicy, waitTime);
			break;	
		case "submitButton":
			flag = waitForElementVisibility(submitButton, waitTime);
			break;	
		case "getCodeButton":
			flag = waitForElementVisibility(getCodeButton, waitTime);
			break;	
		case "otpInput":
			flag = waitForElementVisibility(otpInput, waitTime);
			break;
		case "renewalProcessing":
			flag = waitForElementVisibility(renewalProcessing, waitTime);
			break;
		case "checkingOutstandingBalance":
			flag = waitForElementVisibility(checkingOutstandingBalance, waitTime);
			break;
		case "checkingYourEligibility":
			flag = waitForElementVisibility(checkingYourEligibility, waitTime);
			break;
		case "mobileNumField":
			flag = waitForElementVisibility(mobileNumField, waitTime);
			break;	
		case "cantSendOtp":
			flag = waitForElementVisibility(cantSendOtp, waitTime);
			break;	
        }
		
		if (flag) {
			System.out.println(message + " - exists");
		} else {
			System.out.println(message + " - do not exist");
		}

		return flag;
	}	
	
	
	public void jsClick(String message, String element) {
		//Object S;
		JavascriptExecutor jse = (JavascriptExecutor)DriverManager.getDriver();
		try {
			switch (element) {
			case "submitButton":
		         jse.executeScript("arguments[0].click();", get_submitButton());		
		         break;
			case "getCodeButton":
		         jse.executeScript("arguments[0].click();", get_getCodeButton());		
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
