package com.pages.renewal;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import com.pages.Acqui.BasePage;

import globeOnline_CommonMethods.DriverManager;

public class Renewal_OrderTrackerPage extends BasePage {
	
	By OrderDetails = By.xpath("//h1[text()=' Order Details ']");
	By MyOrder = By.xpath("//span[text()='My order']");
	By REFERENCE_NUMBER = By.xpath("//span[text()='REFERENCE NUMBER']//following::span[1]");
	By Processing = By.xpath("(//span[text()='Processing'])[1]");
	By Deliver = By.xpath("(//span[text()='Deliver'])[1]");
	By Receive = By.xpath("(//span[text()='Receive'])[1]");
	By orderTrackerStatus = By.xpath("//div[@class='title-heading']");
	By DateOrdered = By.xpath("//span[text()='Date ordered']//following::div[2]//span");
	By AmountPaidForOverdueBalance = By.xpath("//span[text()='Amount paid for overdue balance:']//following::div[2]//span");
	By AmountPaid = By.xpath("//span[text()='Amount paid:']//following::div[2]//span");
	By PaymentMethod = By.xpath("//span[text()='Payment method: ']//following::div[2]//following::span[1]");
	By Total_Amount_Paid = By.xpath("//span[text()='Total Amount Paid:']//following::div[2]//following::span[1]");
	By ShipToThisAddress = By.xpath("//span[text()='Ship to this address']//following::div[2]//span");
	By EstimatedDayOfDelivery = By.xpath("//span[text()='Estimated day of delivery']//following::div[2]//span");
	By planType = By.xpath("//div[@class='plan-name-heading']//span");
	By DeviceImg = By.xpath("//div[@class='phone']//img");
	By AllAccessData = By.xpath("//span[text()='All-access data ']");
	By GoWifi = By.xpath("//span[text()=' GoWifi access ']");
	By CallAndtext = By.xpath("//span[text()=' Call and text ']");
	By PlanInclusions = By.xpath("//div[text()='Plan inclusions']");
	By KonsultaMD = By.xpath("//li[text()='Free subscription to KonsultaMD']");
	By iQIYI = By.xpath("//li[text()=' 3-month VIP Access to iQIYI']");
	By weTV = By.xpath("//li[text()=' 3-month VIP Access to weTV']");
	By Add_ons = By.xpath("//div[text()='Add ons']");
	By GSAddSurf = By.xpath("//li[text()='GS Add Surf 99']");
	By AmazonPrimeVideo = By.xpath("//li[text()='Amazon Prime Video']");
	By ViuPremium = By.xpath("//li[text()='Viu Premium']");
	By MySuperDuo = By.xpath("//li[text()='MySuperDuo']");
	By EasyRoam = By.xpath("//li[text()='Easy Roam']");
	By GOCALLIDD = By.xpath("//li[text()='GOCALLIDD 199']");





	
	
	
	
	
	
	public WebElement get_REFERENCE_NUMBER() {
		return DriverManager.getDriver().findElement(REFERENCE_NUMBER);
	}

	/********************************************************************************************************************************/
	public WebElement get_orderTrackerStatus() {
		return DriverManager.getDriver().findElement(orderTrackerStatus);
	}

	/********************************************************************************************************************************/
	public WebElement get_DateOrdered() {
		return DriverManager.getDriver().findElement(DateOrdered);
	}

	/********************************************************************************************************************************/
	public WebElement get_AmountPaidForOverdueBalance() {
		return DriverManager.getDriver().findElement(AmountPaidForOverdueBalance);
	}

	/********************************************************************************************************************************/
	public WebElement get_AmountPaid() {
		return DriverManager.getDriver().findElement(AmountPaid);
	}

	/********************************************************************************************************************************/
	public WebElement get_PaymentMethod() {
		return DriverManager.getDriver().findElement(PaymentMethod);
	}

	/********************************************************************************************************************************/
	public WebElement get_Total_Amount_Paid() {
		return DriverManager.getDriver().findElement(Total_Amount_Paid);
	}

	/********************************************************************************************************************************/
	public WebElement get_ShipToThisAddress() {
		return DriverManager.getDriver().findElement(ShipToThisAddress);
	}

	/********************************************************************************************************************************/
	public WebElement get_EstimatedDayOfDelivery() {
		return DriverManager.getDriver().findElement(EstimatedDayOfDelivery);
	}

	/********************************************************************************************************************************/
	public WebElement get_planType() {
		return DriverManager.getDriver().findElement(planType);
	}

	/********************************************************************************************************************************/
	
	public boolean isElementExist(String message, String element, int waitTime) {
		boolean flag = false;

		switch (element) {
		case "OrderDetails":
			flag = waitForElementVisibility(OrderDetails, waitTime);
			break;
		case "MyOrder":
			flag = waitForElementVisibility(MyOrder, waitTime);
			break;
		case "REFERENCE_NUMBER":
			flag = waitForElementVisibility(REFERENCE_NUMBER, waitTime);
			break;
		case "Processing":
			flag = waitForElementVisibility(Processing, waitTime);
			break;
		case "Deliver":
			flag = waitForElementVisibility(Deliver, waitTime);
			break;
		case "Receive":
			flag = waitForElementVisibility(Receive, waitTime);
			break;
		case "orderTrackerStatus":
			flag = waitForElementVisibility(orderTrackerStatus, waitTime);
			break;
		case "DateOrdered":
			flag = waitForElementVisibility(DateOrdered, waitTime);
			break;
		case "AmountPaidForOverdueBalance":
			flag = waitForElementVisibility(AmountPaidForOverdueBalance, waitTime);
			break;
		case "AmountPaid":
			flag = waitForElementVisibility(AmountPaid, waitTime);
			break;
		case "PaymentMethod":
			flag = waitForElementVisibility(PaymentMethod, waitTime);
			break;
		case "Total_Amount_Paid":
			flag = waitForElementVisibility(Total_Amount_Paid, waitTime);
			break;
		case "ShipToThisAddress":
			flag = waitForElementVisibility(ShipToThisAddress, waitTime);
			break;
		case "EstimatedDayOfDelivery":
			flag = waitForElementVisibility(EstimatedDayOfDelivery, waitTime);
			break;
		case "planType":
			flag = waitForElementVisibility(planType, waitTime);
			break;
		case "DeviceImg":
			flag = waitForElementVisibility(DeviceImg, waitTime);
			break;
		case "AllAccessData":
			flag = waitForElementVisibility(AllAccessData, waitTime);
			break;
		case "GoWifi":
			flag = waitForElementVisibility(GoWifi, waitTime);
			break;
		case "CallAndtext":
			flag = waitForElementVisibility(CallAndtext, waitTime);
			break;
		case "PlanInclusions":
			flag = waitForElementVisibility(PlanInclusions, waitTime);
			break;
		case "KonsultaMD":
			flag = waitForElementVisibility(KonsultaMD, waitTime);
			break;
		case "iQIYI":
			flag = waitForElementVisibility(iQIYI, waitTime);
			break;
		case "weTV":
			flag = waitForElementVisibility(weTV, waitTime);
			break;
		case "Add_ons":
			flag = waitForElementVisibility(Add_ons, waitTime);
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
        }
		
		if (flag) {
			System.out.println(message + " - exists");
		} else {
			System.out.println(message + " - do not exist");
		}

		return flag;
	}	
		
 
	
}	