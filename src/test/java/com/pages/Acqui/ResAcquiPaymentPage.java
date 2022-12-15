package com.pages.Acqui;

import java.util.NoSuchElementException;


import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.pages.Acqui.BasePage;

import globeOnline_CommonMethods.DriverManager;
import junit.framework.Assert;

public class ResAcquiPaymentPage extends BasePage {
	
	By AcquisitionPay = By.xpath("//h1[text()=' Acquisition - Pay ']");
	By WelCollectPayment = By.xpath("//p[text()='We’ll only collect payment when your application is approved. Amount subject to change.']");
	By SelectPaymentMethod = By.xpath("//span[text()='Select payment method']");
	By Gcash = By.xpath("//div[text()=' GCash ']");
	By CashOnDelivery = By.xpath("//div[text()=' Cash On Delivery ']");
	By CreditCard = By.xpath("//div[text()=' Credit Card (Straight Payment) ']");
	By HSBC = By.xpath("//div[text()=' Credit card (Installment For HSBC) ']");
	By Bpi = By.xpath("//div[text()=' Credit card (Installment For BPI) ']");
	
	By OneTimePaymentText = By.xpath("//span[text()='One-time Payment']");
	By PlanApplication = By.xpath("//div[text()='Plan application']");
	By PlanApplicationCollapseBtn = By.xpath("//div[text()='Plan application']//parent::button");
	By AdvanceMonthlyServiceCharge = By.xpath("//div[text()=' Advance Monthly Charge ']//following::div[3]");
	By DeviceCost = By.xpath("//div[text()=' Device cost ']//following::div[2]");
	By Shipping = By.xpath("//div[text()=' Shipping ']//following::div[2]");
	By TotalAmount = By.xpath("//span[text()='Total amount']//following::span[1]");
	By GotPromoCode = By.xpath("//span[text()='Got a promo code?']");
	By ShipToThisAddressText = By.xpath("//span[text()='Ship to this address']");
	By ClickHereBtn = By.xpath("//button[text()=' Click Here ']");
	By ShippingAddress = By.xpath("//span[text()='Ship to this address']//following::span[1]");
	By ChangeAddress = By.xpath("//span[text()='Change address']");
	By MonthlyPayment = By.xpath("//div[text()=' Monthly Payment ']");
	By NoNeddToPayToday = By.xpath("//div[text()=' No need to pay this today! This will be charged to your first bill. ']");
	By AddonsText = By.xpath("//div[text()=' Add-ons ']");
	By AddonscollapseBtn = By.xpath("//div[text()=' Add-ons ']//parent::button");
	By My_SuperDuo = By.xpath("//div[text()='MySuperDuo']");
	By Amazon_PrimeVideo = By.xpath("//div[text()='Amazon Prime Video']");
	By Viu_Premium = By.xpath("//div[text()='Viu Premium']");
	By Spotify_Premium = By.xpath("//div[text()='Spotify Premium']");
	By Easy_Roam = By.xpath("//div[text()='Easy Roam']");
	By GOCALLIDD_199 = By.xpath("//div[text()='GOCALLIDD 199']");
	By GS_Add_Surf = By.xpath("//div[text()='GS Add Surf 99']");
	By Total_Addons = By.xpath("//div[text()='Total add-ons ']//following::div[1]");
	By Total_MonthlyBill = By.xpath("//div[text()='Total monthly bill']//following::span[1]");
	By submitOrder = By.xpath("//button[text()=' Submit order ']");







	
	
	/********************************************************************************************************************************/
	public WebElement get_Gcash() {
		return DriverManager.getDriver().findElement(Gcash);
	}

	/********************************************************************************************************************************/
	public WebElement get_CashOnDelivery() {
		return DriverManager.getDriver().findElement(CashOnDelivery);
	}

	/********************************************************************************************************************************/
	public WebElement get_CreditCard() {
		return DriverManager.getDriver().findElement(CreditCard);
	}

	/********************************************************************************************************************************/
	public WebElement get_HSBC() {
		return DriverManager.getDriver().findElement(HSBC);
	}

	/********************************************************************************************************************************/
	public WebElement get_Bpi() {
		return DriverManager.getDriver().findElement(Bpi);
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
	public WebElement get_TotalAmount() {
		return DriverManager.getDriver().findElement(TotalAmount);
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
		case "AcquisitionPay":
			flag = waitForElementVisibility(AcquisitionPay, waitTime);
			break;
		case "WelCollectPayment":
			flag = waitForElementVisibility(WelCollectPayment, waitTime);
			break;
		case "SelectPaymentMethod":
			flag = waitForElementVisibility(SelectPaymentMethod, waitTime);
			break;
		case "Gcash":
			flag = waitForElementVisibility(Gcash, waitTime);
			break;
		case "CashOnDelivery":
			flag = waitForElementVisibility(CashOnDelivery, waitTime);
			break;
		case "CreditCard":
			flag = waitForElementVisibility(CreditCard, waitTime);
			break;
		case "HSBC":
			flag = waitForElementVisibility(HSBC, waitTime);
			break;
		case "Bpi":
			flag = waitForElementVisibility(Bpi, waitTime);
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
		case "TotalAmount":
			flag = waitForElementVisibility(TotalAmount, waitTime);
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
		case "submitOrder":
			flag = waitForElementVisibility(submitOrder, waitTime);
			break;
		case "PlanApplicationCollapseBtn":
			flag = waitForElementVisibility(PlanApplicationCollapseBtn, waitTime);
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
			case "Gcash":
		         jse.executeScript("arguments[0].click();", get_Gcash());		
		         break;
			case "CashOnDelivery":
		         jse.executeScript("arguments[0].click();", get_CashOnDelivery());		
		         break;
			case "CreditCard":
		         jse.executeScript("arguments[0].click();", get_CreditCard());		
		         break;
			case "HSBC":
		         jse.executeScript("arguments[0].click();", get_HSBC());		
		         break;
			case "Bpi":
		         jse.executeScript("arguments[0].click();", get_Bpi());		
		         break;
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
