package com.pages.Acqui;

import java.util.NoSuchElementException;


import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.pages.Acqui.BasePage;

import globeOnline_CommonMethods.DriverManager;
import junit.framework.Assert;

public class ResAcquiOrderSummaryPage extends BasePage {
	
	By AcquisitionSummary = By.xpath("//h1[text()=' Acquisition - Summary ']");
	By WelCollectPayment = By.xpath("//p[text()='We’ll only collect payment when your application is approved. Amount subject to change.']");
	By OrderSummary = By.xpath("//span[text()='Order Summary']");
	By planName = By.xpath("//div[@class='plan-name-heading']//span");
	By deviceImg = By.xpath("//div[@class='phone']//img");
	By deviceName = By.xpath("//div[@class='phone']//following::span[1]");
	By AllAccessData = By.xpath("//span[text()='All-access data']");
	By GoWifi = By.xpath("//span[text()='GoWifi access']");
	By CallAndText = By.xpath("//span[text()='Call and text']");
	By PlanInclusion = By.xpath("//div[text()='Plan inclusion']");
	By KonsultaMD = By.xpath("//li[text()='Free subscription to KonsultaMD']");
	By VIPAccessToiQIYI = By.xpath("//li[text()='3-month VIP Access to iQIYI']");
	By VIPAccessToweTV = By.xpath("//li[text()='3-month VIP Access to weTV']");
	By Addons = By.xpath("//div[text()='Add-ons']");
	By MySuperDuo = By.xpath("//li[text()='MySuperDuo']");
	By AmazonPrimeVideo = By.xpath("//li[text()='Amazon Prime Video']");
	By ViuPremium = By.xpath("//li[text()='Viu Premium']");
	By SpotifyPremium = By.xpath("//li[text()='Spotify Premium']");
	By GOCALLIDD = By.xpath("//li[text()='GOCALLIDD 199']");
	By EasyRoam = By.xpath("//li[text()='Easy Roam']");
	By GSAddSurf = By.xpath("//li[text()='GS Add Surf 99']");
	By OneTimePaymentText = By.xpath("//span[text()=' One-time Payment ']");
	By PlanApplication = By.xpath("//div[text()='Plan Application']");
	By PlanApplicationCollapseBtn = By.xpath("//div[text()='Plan Application']//parent::button");
	By AdvanceMonthlyServiceCharge = By.xpath("//div[text()=' Advance Monthly Service Charge ']//following::div[3]");
	By DeviceCost = By.xpath("//div[text()=' Device Cost ']//following::div[2]");
	By Shipping = By.xpath("//div[text()=' Shipping ']//following::div[2]");
	By OneTimePayment = By.xpath("//span[text()='One-time Payment']//following::span[1]");
	By GotPromoCode = By.xpath("//span[text()='Got a promo code?']");
	By ShipToThisAddressText = By.xpath("//span[text()='Ship to this address']");
	By ClickHereBtn = By.xpath("//button[text()=' Click Here ']");
	By ShippingAddress = By.xpath("//span[text()='Ship to this address']//following::span[1]");
	By ChangeAddress = By.xpath("//span[text()='Change address']");
	By MonthlyPayment = By.xpath("//div[text()=' Monthly Payment ']");
	By NoNeddToPayToday = By.xpath("//div[text()=' No need to pay this today! This will be charged to your first bill. ']");
	By AddonsText = By.xpath("//div[text()=' Add-ons ']");
	By AddonscollapseBtn = By.xpath("//div[text()=' Add-ons ']//parent::button");
	By My_SuperDuo = By.xpath("//div[text()=' MySuperDuo ']");
	By Amazon_PrimeVideo = By.xpath("//div[text()=' Amazon Prime Video ']");
	By Viu_Premium = By.xpath("//div[text()=' Viu Premium ']");
	By Spotify_Premium = By.xpath("//div[text()=' Spotify Premium ']");
	By Easy_Roam = By.xpath("//div[text()=' Easy Roam ']");
	By GOCALLIDD_199 = By.xpath("//div[text()=' GOCALLIDD 199 ']");
	By GS_Add_Surf = By.xpath("//div[text()=' GS Add Surf 99 ']");
	By Total_Addons = By.xpath("//div[text()=' Total add ons ']//following::span[1]");
	By Total_MonthlyBill = By.xpath("//span[text()='Total monthly bill']//following::div[2]");
	By submitOrder = By.xpath("//button[text()=' Choose payment method ']");






	
	/********************************************************************************************************************************/
	public WebElement get_planName() {
		return DriverManager.getDriver().findElement(planName);
	}

	/********************************************************************************************************************************/
	public WebElement get_deviceName() {
		return DriverManager.getDriver().findElement(deviceName);
	}

	/********************************************************************************************************************************/
	public WebElement get_PlanApplicationCollapseBtn() {
		return DriverManager.getDriver().findElement(PlanApplicationCollapseBtn);
	}

	/********************************************************************************************************************************/
	public WebElement get_AdvanceMonthlyServiceCharge() {
		return DriverManager.getDriver().findElement(AdvanceMonthlyServiceCharge);
	}

	/********************************************************************************************************************************/
	public WebElement get_DeviceCost() {
		return DriverManager.getDriver().findElement(DeviceCost);
	}

	/********************************************************************************************************************************/
	public WebElement get_Shipping() {
		return DriverManager.getDriver().findElement(Shipping);
	}

	/********************************************************************************************************************************/
	public WebElement get_OneTimePayment() {
		return DriverManager.getDriver().findElement(OneTimePayment);
	}

	/********************************************************************************************************************************/
	public WebElement get_ShippingAddress() {
		return DriverManager.getDriver().findElement(ShippingAddress);
	}

	/********************************************************************************************************************************/
	public WebElement get_AddonscollapseBtn() {
		return DriverManager.getDriver().findElement(AddonscollapseBtn);
	}

	/********************************************************************************************************************************/
	public WebElement get_Total_Addons() {
		return DriverManager.getDriver().findElement(Total_Addons);
	}

	/********************************************************************************************************************************/
	public WebElement get_Total_MonthlyBill() {
		return DriverManager.getDriver().findElement(Total_Addons);
	}

	/********************************************************************************************************************************/
	public WebElement get_submitOrder() {
		return DriverManager.getDriver().findElement(submitOrder);
	}

	/********************************************************************************************************************************/




	
	
	public boolean isElementExist(String message, String element, int waitTime) {
		boolean flag = false;

		switch (element) {
		case "AcquisitionSummary":
			flag = waitForElementVisibility(AcquisitionSummary, waitTime);
			break;
		case "WelCollectPayment":
			flag = waitForElementVisibility(WelCollectPayment, waitTime);
			break;
		case "OrderSummary":
			flag = waitForElementVisibility(OrderSummary, waitTime);
			break;
		case "planName":
			flag = waitForElementVisibility(planName, waitTime);
			break;
		case "deviceImg":
			flag = waitForElementVisibility(deviceImg, waitTime);
			break;
		case "deviceName":
			flag = waitForElementVisibility(deviceName, waitTime);
			break;
		case "AllAccessData":
			flag = waitForElementVisibility(AllAccessData, waitTime);
			break;
		case "GoWifi":
			flag = waitForElementVisibility(GoWifi, waitTime);
			break;
		case "CallAndText":
			flag = waitForElementVisibility(CallAndText, waitTime);
			break;
		case "PlanInclusion":
			flag = waitForElementVisibility(PlanInclusion, waitTime);
			break;
		case "KonsultaMD":
			flag = waitForElementVisibility(KonsultaMD, waitTime);
			break;
		case "VIPAccessToiQIYI":
			flag = waitForElementVisibility(VIPAccessToiQIYI, waitTime);
			break;
		case "VIPAccessToweTV":
			flag = waitForElementVisibility(VIPAccessToweTV, waitTime);
			break;
		case "Addons":
			flag = waitForElementVisibility(Addons, waitTime);
			break;
		case "MySuperDuo":
			flag = waitForElementVisibility(MySuperDuo, waitTime);
			break;
		case "AmazonPrimeVideo":
			flag = waitForElementVisibility(AmazonPrimeVideo, waitTime);
			break;
		case "ViuPremium":
			flag = waitForElementVisibility(ViuPremium, waitTime);
			break;
		case "SpotifyPremium":
			flag = waitForElementVisibility(SpotifyPremium, waitTime);
			break;
		case "GOCALLIDD":
			flag = waitForElementVisibility(GOCALLIDD, waitTime);
			break;
		case "EasyRoam":
			flag = waitForElementVisibility(EasyRoam, waitTime);
			break;
		case "GSAddSurf":
			flag = waitForElementVisibility(GSAddSurf, waitTime);
			break;
		case "OneTimePaymentText":
			flag = waitForElementVisibility(OneTimePaymentText, waitTime);
			break;
		case "PlanApplication":
			flag = waitForElementVisibility(PlanApplication, waitTime);
			break;
		case "AdvanceMonthlyServiceCharge":
			flag = waitForElementVisibility(AdvanceMonthlyServiceCharge, waitTime);
			break;
		case "DeviceCost":
			flag = waitForElementVisibility(DeviceCost, waitTime);
			break;
		case "Shipping":
			flag = waitForElementVisibility(Shipping, waitTime);
			break;
		case "OneTimePayment":
			flag = waitForElementVisibility(OneTimePayment, waitTime);
			break;
		case "GotPromoCode":
			flag = waitForElementVisibility(GotPromoCode, waitTime);
			break;
		case "ShipToThisAddressText":
			flag = waitForElementVisibility(ShipToThisAddressText, waitTime);
			break;
		case "ClickHereBtn":
			flag = waitForElementVisibility(ClickHereBtn, waitTime);
			break;
		case "ShippingAddress":
			flag = waitForElementVisibility(ShippingAddress, waitTime);
			break;
		case "ChangeAddress":
			flag = waitForElementVisibility(ChangeAddress, waitTime);
			break;
		case "MonthlyPayment":
			flag = waitForElementVisibility(MonthlyPayment, waitTime);
			break;
		case "NoNeddToPayToday":
			flag = waitForElementVisibility(NoNeddToPayToday, waitTime);
			break;
		case "AddonsText":
			flag = waitForElementVisibility(AddonsText, waitTime);
			break;
		case "AddonscollapseBtn":
			flag = waitForElementVisibility(AddonscollapseBtn, waitTime);
			break;
		case "My_SuperDuo":
			flag = waitForElementVisibility(My_SuperDuo, waitTime);
			break;
		case "Amazon_PrimeVideo":
			flag = waitForElementVisibility(Amazon_PrimeVideo, waitTime);
			break;
		case "Viu_Premium":
			flag = waitForElementVisibility(Viu_Premium, waitTime);
			break;
		case "Spotify_Premium":
			flag = waitForElementVisibility(Spotify_Premium, waitTime);
			break;
		case "Easy_Roam":
			flag = waitForElementVisibility(Easy_Roam, waitTime);
			break;
		case "GOCALLIDD_199":
			flag = waitForElementVisibility(GOCALLIDD_199, waitTime);
			break;
		case "GS_Add_Surf":
			flag = waitForElementVisibility(GS_Add_Surf, waitTime);
			break;
		case "Total_Addons":
			flag = waitForElementVisibility(Total_Addons, waitTime);
			break;
		case "Total_MonthlyBill":
			flag = waitForElementVisibility(Total_MonthlyBill, waitTime);
			break;
		case "PlanApplicationCollapseBtn":
			flag = waitForElementVisibility(PlanApplicationCollapseBtn, waitTime);
			break;
		case "submitOrder":
			flag = waitForElementVisibility(submitOrder, waitTime);
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
			case "PlanApplicationCollapseBtn":
		         jse.executeScript("arguments[0].click();", get_PlanApplicationCollapseBtn());		
		         break;
			case "AddonscollapseBtn":
		         jse.executeScript("arguments[0].click();", get_AddonscollapseBtn());		
		         break;
			case "Total_Addons":
		         jse.executeScript("arguments[0].click();", get_Total_Addons());		
		         break;
			case "Total_MonthlyBill":
		         jse.executeScript("arguments[0].click();", get_Total_MonthlyBill());		
		         break;
			case "submitOrder":
		         jse.executeScript("arguments[0].click();", get_submitOrder());		
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
