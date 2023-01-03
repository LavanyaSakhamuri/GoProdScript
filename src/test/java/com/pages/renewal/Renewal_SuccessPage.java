package com.pages.renewal;

import java.util.NoSuchElementException;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.pages.Acqui.BasePage;

import globeOnline_CommonMethods.DriverManager;

public class Renewal_SuccessPage extends BasePage {
	
	By OrderConfirmed = By.xpath("//label[text()='Order confirmed']");
	By ReferenceNo = By.xpath("//span[text()=' Reference No. ']//following-sibling::span[1]");
	By Success = By.xpath("//h1[text()=' Success! ']");
	By YourRenewalIsNowInProgress = By.xpath("//p[text()=' Your renewal is now in progress. Congratulations! ']");
	By planType = By.xpath("//div[text()=' GPlan 599 with Device ']");
	By deviceImg = By.xpath("//div[@class='go_sc-rnp-device-vw']//img");
	By deviceName = By.xpath("//div[@class='go_sc-rnp-device-vw__details']//span[1]");
	By devicecolor_Data = By.xpath("//div[@class='go_sc-rnp-device-vw__details']//span[2]");
	By AllAccessData = By.xpath("//span[text()='All-access data']");
	By GoWifiAccess = By.xpath("//span[text()='GoWifi access']");
	By CallAndText = By.xpath("//span[text()='Call and text']");
	By ContractDuration = By.xpath("//span[text()='Contract duration']");
	By Inclusions = By.xpath("//span[text()=' Inclusions ']");
	By KonsultaMD = By.xpath("//div[text()=' Free subscription to KonsultaMD ']");
	By ThreemonthVIPAccessToIQIYI = By.xpath("//div[text()=' 3-month VIP Access to iQIYI ']");
	By ThreemonthVIPAccessToWeTV = By.xpath("//div[text()=' 3-month VIP Access to weTV ']");
	By inclusionsChevron = By.xpath("(//i[@class='go_sc-icon-16 go_sc-icon:chevron'])[1]");
	By AddOnsAndSubscriptions = By.xpath("//span[text()=' Add-ons and subscriptions ']");
	By GSAddSurf = By.xpath("//div[text()='GS Add Surf 99']");
	By AmazonPrimeVideo = By.xpath("//div[text()='Amazon Prime Video']");
	By ViuPremium = By.xpath("//div[text()='Viu Premium']");
	By MySuperDuo = By.xpath("//div[text()='MySuperDuo']");
	By EasyRoam = By.xpath("//div[text()='Easy Roam']");
	By GOCALLIDD = By.xpath("//div[text()='GOCALLIDD 199']");
	By ShippingAddress = By.xpath("//span[text()='Shipping Address']");
	By ShippingAddressDisplayed = By.xpath("//span[text()='Shipping Address']//following-sibling::span");
	By MonthlyBill = By.xpath("//span[text()=' Monthly bill ']");
	By ShowBreakdown = By.xpath("//span[text()=' Show breakdown ']");
	By MonthlyBillGenerated = By.xpath("//span[text()='Monthly bill']//following::span[1]");
	By WhatsNext = By.xpath("//span[text()='What’s next?'])[2]");
	By PleaseGiveUsTimeToProcessYourOrder = By.xpath("Please give us time to process your order. We’ve sent the details to ");
	By TrackMyOrder = By.xpath("(//button[text()=' Track my order '])[2]");

	
	




























	
	/********************************************************************************************************************************/
	public WebElement get_ReferenceNo() {
		return DriverManager.getDriver().findElement(ReferenceNo);
	}

	/********************************************************************************************************************************/
	public WebElement get_deviceName() {
		return DriverManager.getDriver().findElement(deviceName);
	}

	/********************************************************************************************************************************/
	public WebElement get_devicecolor_Data() {
		return DriverManager.getDriver().findElement(devicecolor_Data);
	}

	/********************************************************************************************************************************/
	public WebElement get_inclusionsChevron() {
		return DriverManager.getDriver().findElement(inclusionsChevron);
	}

	/********************************************************************************************************************************/
	public WebElement get_ShippingAddressDisplayed() {
		return DriverManager.getDriver().findElement(ShippingAddressDisplayed);
	}

	/********************************************************************************************************************************/
	public WebElement get_ShowBreakdown() {
		return DriverManager.getDriver().findElement(ShowBreakdown);
	}

	/********************************************************************************************************************************/
	public WebElement get_MonthlyBillGenerated() {
		return DriverManager.getDriver().findElement(MonthlyBillGenerated);
	}

	/********************************************************************************************************************************/
	public WebElement get_TrackMyOrder() {
		return DriverManager.getDriver().findElement(TrackMyOrder);
	}

	/********************************************************************************************************************************/
	
	
	public boolean isElementExist(String message, String element, int waitTime) {
		boolean flag = false;

		switch (element) {
		case "OrderConfirmed":
			flag = waitForElementVisibility(OrderConfirmed, waitTime);
			break;
		case "ReferenceNo":
			flag = waitForElementVisibility(ReferenceNo, waitTime);
			break;
		case "Success":
			flag = waitForElementVisibility(Success, waitTime);
			break;
		case "YourRenewalIsNowInProgress":
			flag = waitForElementVisibility(YourRenewalIsNowInProgress, waitTime);
			break;
		case "planType":
			flag = waitForElementVisibility(planType, waitTime);
			break;
		case "deviceImg":
			flag = waitForElementVisibility(deviceImg, waitTime);
			break;
		case "deviceName":
			flag = waitForElementVisibility(deviceName, waitTime);
			break;
		case "devicecolor_Data":
			flag = waitForElementVisibility(devicecolor_Data, waitTime);
			break;
		case "AllAccessData":
			flag = waitForElementVisibility(AllAccessData, waitTime);
			break;
		case "GoWifiAccess":
			flag = waitForElementVisibility(GoWifiAccess, waitTime);
		case "CallAndText":
			flag = waitForElementVisibility(CallAndText, waitTime);
			break;
		case "ContractDuration":
			flag = waitForElementVisibility(ContractDuration, waitTime);
			break;
		case "Inclusions":
			flag = waitForElementVisibility(Inclusions, waitTime);
			break;
		case "KonsultaMD":
			flag = waitForElementVisibility(KonsultaMD, waitTime);
			break;
		case "ThreemonthVIPAccessToIQIYI":
			flag = waitForElementVisibility(ThreemonthVIPAccessToIQIYI, waitTime);
			break;
		case "ThreemonthVIPAccessToWeTV":
			flag = waitForElementVisibility(ThreemonthVIPAccessToWeTV, waitTime);
			break;
		case "inclusionsChevron":
			flag = waitForElementVisibility(inclusionsChevron, waitTime);
			break;
		case "AddOnsAndSubscriptions":
			flag = waitForElementVisibility(AddOnsAndSubscriptions, waitTime);
			break;
		case "GSAddSurf":
			flag = waitForElementVisibility(GSAddSurf, waitTime);
			break;
		case "AmazonPrimeVideo":
			flag = waitForElementVisibility(AmazonPrimeVideo, waitTime);
			break;
		case "ViuPremium":
			flag = waitForElementVisibility(ViuPremium, waitTime);
			break;
		case "MySuperDuo":
			flag = waitForElementVisibility(MySuperDuo, waitTime);
			break;
		case "EasyRoam":
			flag = waitForElementVisibility(EasyRoam, waitTime);
			break;
		case "GOCALLIDD":
			flag = waitForElementVisibility(GOCALLIDD, waitTime);
			break;
		case "ShippingAddress":
			flag = waitForElementVisibility(ShippingAddress, waitTime);
			break;
		case "ShippingAddressDisplayed":
			flag = waitForElementVisibility(ShippingAddressDisplayed, waitTime);
			break;
		case "MonthlyBill":
			flag = waitForElementVisibility(MonthlyBill, waitTime);
			break;
		case "ShowBreakdown":
			flag = waitForElementVisibility(ShowBreakdown, waitTime);
			break;
		case "MonthlyBillGenerated":
			flag = waitForElementVisibility(MonthlyBillGenerated, waitTime);
			break;
		case "WhatsNext":
			flag = waitForElementVisibility(WhatsNext, waitTime);
			break;
		case "PleaseGiveUsTimeToProcessYourOrder":
			flag = waitForElementVisibility(PleaseGiveUsTimeToProcessYourOrder, waitTime);
			break;
		case "TrackMyOrder":
			flag = waitForElementVisibility(TrackMyOrder, waitTime);
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
		
		JavascriptExecutor jse = (JavascriptExecutor)DriverManager.getDriver();
		try {
			switch (element) {
			case "inclusionsChevron":
		         jse.executeScript("arguments[0].click();", get_inclusionsChevron());		
		         break; 
			case "TrackMyOrder":
		         jse.executeScript("arguments[0].click();", get_TrackMyOrder());		
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