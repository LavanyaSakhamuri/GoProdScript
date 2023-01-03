package com.pagesHPW;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import globeOnline_CommonMethods.DriverManager;

public class GCash_Page extends BasePage{
	By Merchant = By.xpath("//span[@class='merchant-name']");
	By HeaderText = By.xpath("//h1[@class='layout-header']//img");
	By AmountDue = By.xpath("//span[@class='amount']");
	By GCashEnterNum = By.xpath("//input[@pattern='[0-9]*']");
	By GCashNextBtn = By.xpath("//button[@accessbilityid='next-button']");
	By GCashSubmit = By.xpath("//button[@accessbilityid='submit-button']");
	
	By PayGCashPHPBtn = By.xpath("//button[@accessibilityid='button-pay']");
	By GCashAgreeBtn = By.xpath("//button[@class='agree-button-pay ap-button ap-button-primary']");
			//a[@class='ap-button ap-button-primary']");
			//+ "//button[@class='agree-button-pay ap-button ap-button-primary']");
	
	By Pin = By.xpath("//input[@type='tel']");
	By PinNext = By.xpath("//button[@accessbilityid='submit-button']");
	By GcashBalanceErrorIcon = By.xpath("//*[@class='error-icon']");
	By NotEnoughGcashBalance_Label = By.xpath("//*[contains(text(),'Not enough GCash Balance')]");
	By GcashBalanceErrorMessage = By.xpath("//*[contains(text(),'You have insufficient GCash balance to complete this transaction.')]");
	By BackToMerchant = By.xpath("//*[contains(text(),'BACK TO MERCHANT')]");
	By AgreeAndPay = By.xpath("//button[normalize-space()='AGREE AND PAY']");
	By Pay = By.xpath("//button[@accessibilityid='button-pay']");
	/********************************************************************************************************************************/
	public WebElement get_GCashAgreeBtn() {
		return DriverManager.getDriver().findElement(GCashAgreeBtn);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_PayGCashPHPBtn() {
		return DriverManager.getDriver().findElement(PayGCashPHPBtn);
	}
	/********************************************************************************************************************************/
	public WebElement get_GCashSubmit() {
		return DriverManager.getDriver().findElement(GCashSubmit);
	}
	/********************************************************************************************************************************/
	public WebElement get_GCashEnterNum() {
		return DriverManager.getDriver().findElement(GCashEnterNum);
	}
	/********************************************************************************************************************************/
	public WebElement get_GCashNextBtn() {
		return DriverManager.getDriver().findElement(GCashNextBtn);
	}
	/********************************************************************************************************************************/
	public WebElement get_GCashPIN() {
		return DriverManager.getDriver().findElement(Pin);
	}
	/********************************************************************************************************************************/
	public WebElement get_BackToMerchant() {
		return DriverManager.getDriver().findElement(BackToMerchant);
	}
	/********************************************************************************************************************************/
	public WebElement get_AgreeAndPay() {
		return DriverManager.getDriver().findElement(AgreeAndPay);
	}
	/********************************************************************************************************************************/
	public WebElement get_Pay() {
		return DriverManager.getDriver().findElement(Pay);
	}
	/********************************************************************************************************************************/
	public WebElement get_PinNext() {
		return DriverManager.getDriver().findElement(PinNext);
	}
	/********************************************************************************************************************************/
	
	
	
	public boolean isElementExist(String message, String element, int waitTime) {
		boolean flag = false;

		switch (element) {
		case "Merchant":
			flag = waitForElementVisibility(Merchant, waitTime);
			break;
		case "HeaderText":
			flag = waitForElementVisibility(HeaderText, waitTime);
			break;
		case "AmountDue":
			flag = waitForElementVisibility(AmountDue, waitTime);
			break;
		case "GCashEnterNum":
			flag = waitForElementVisibility(GCashEnterNum, waitTime);
			break;
		case "GCashNextBtn":
			flag = waitForElementVisibility(GCashNextBtn, waitTime);
			break;
		case "GcashBalanceErrorIcon":
			flag = waitForElementVisibility(Merchant, waitTime);
			break;
		case "NotEnoughGcashBalance_Label":
			flag = waitForElementVisibility(Merchant, waitTime);
			break;
		case "GcashBalanceErrorMessage":
			flag = waitForElementVisibility(GcashBalanceErrorMessage, waitTime);
			break;
		case "BackToMerchant":
			flag = waitForElementVisibility(BackToMerchant, waitTime);
			break;
	
		}

		if (flag) {
			System.out.println(message + " - exists");
		} else {
			System.out.println(message + " - do not exist");
		}

		return flag;
	}
	/********************************************************************************************************************************/
	public void clickOnElement(String type, String eleName, String ele) {

		try {
			switch (ele) {
			case "GCashNextBtn":
				get_GCashNextBtn().click();
				break;
			case "BackToMerchant":
				get_BackToMerchant().click();
				break;
			case "AgreeAndPay":
				get_PinNext().click();
				break;
			case "PinNext":
				get_AgreeAndPay().click();
				break;
			case "Pay":
				get_Pay().click();
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
	/********************************************************************************************************************************/
	public void scroll_vertical(int y_Axis) {
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("window.scrollBy(0," + y_Axis + ")", "");
	}
	
	/********************************************************************************************************************************/

	public String getText(String ele) {
		String text = "";

		try {
			switch (ele) {
			case "AmountDue":
				text = DriverManager.getDriver().findElement(AmountDue).getText();
				break;	
			case "NotEnoughGcashBalance_Label":
				text = DriverManager.getDriver().findElement(NotEnoughGcashBalance_Label).getText();
				break;
				}

		} catch (NoSuchElementException e) {
			System.out.println("Element : " + ele.toString() + " : " + "not found : " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Method : getText - Error : " + e.getMessage());
		}

		return text;
	}
	
}
