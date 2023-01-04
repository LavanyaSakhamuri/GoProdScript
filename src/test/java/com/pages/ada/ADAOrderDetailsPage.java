package com.pages.ada;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import globeOnline_CommonMethods.DriverManager;

public class ADAOrderDetailsPage extends BasePage {

	By referenceNumber = By.xpath("//span[@class='refNo']");
	By orderActiveStatus = By.xpath("(//div[contains(@class,'show-active-title')])[1]/span");
	By completedDate = By.xpath("//div[contains(@class,'show-active-title')]/following-sibling::div");
	By productName = By.xpath("//div[contains(@class,'card-description')] //div[contains(@class,'sub-heading')]");
	By quantity = By.xpath("//div[contains(@class,'row unit-section')]/div/span");
	By productImage = By.xpath("//img[contains(@class,'globeImage')]");
	By updateDate = By.xpath("//div[contains(@class,'order-recieved-data')]");
	By dateOrdered = By.xpath("(//div[contains(@class,'grab')])[1]/span");
	By paymentMethod = By.xpath("(//div[contains(@class,'grab')])[2]/span");
	By amountPaid = By.xpath("(//div[contains(@class,'grab')])[3]/span");
	By shippingAddress = By.xpath("//div[text()='Ship to this address']/following-sibling::div");
	By estDayOfDelivery = By.xpath("//div[text()='Estimated day of delivery']/following-sibling::div");
	By device=By.xpath("//div[contains(@class,'phone')]");
	By OrderDetails = By.xpath("//h1[text()=' Order Details ']");
	By MyOrder = By.xpath("//span[text()='My order']");
	By REFERENCE_NUMBER = By.xpath("//span[text()='REFERENCE NUMBER']//following::span[1]");
	By Processing = By.xpath("(//span[text()='Processing'])[1]");
	By Deliver = By.xpath("(//span[text()='Deliver'])[1]");
	By Receive = By.xpath("(//span[text()='Receive'])[1]");
	By orderTrackerStatus = By.xpath("//div[@class='title-heading']");
	By DateOrdered = By.xpath("//span[text()='Date ordered']//following::div[2]//span");
	By PaymentMethod = By.xpath("//span[text()='Payment method: ']//following::div[2]//following::span[1]");
	By ShipToThisAddress = By.xpath("//span[text()='Ship to this address']//following::div[2]//span");
	By planType = By.xpath("//div[@class='plan-name-heading']//span");
	By AllAccessData = By.xpath("//span[text()='All-access data ']");
	By totalAmount = By.xpath("//span[text()='Total amount']//following::span[1]");
	By GoWifi = By.xpath("//span[text()='  GoWifi access ']");
	By CallAndtext = By.xpath("//span[text()=' Call and text ']");
	By PlanInclusions = By.xpath("//div[text()='Plan inclusions']");
	By KonsultaMD = By.xpath("//li[text()='Free individual subscription to KonsultaMD']");
	By Add_ons = By.xpath("//div[text()='Add ons']");
	By GSAddSurf = By.xpath("//li[text()='GS Add Surf 99']");
	By AmazonPrimeVideo = By.xpath("//li[text()='Amazon Prime Video']");
	By ViuPremium = By.xpath("//li[text()='Viu Premium']");
	By MySuperDuo = By.xpath("//li[text()='MySuperDuo']");
	By EasyRoam = By.xpath("//li[text()='Easy Roam']");
	By GOCALLIDD = By.xpath("//li[text()='GOCALLIDD 199']");

	/********************************************************************************************************************************/
	public WebElement get_referenceNumber() {
		return DriverManager.getDriver().findElement(referenceNumber);
	}

	/********************************************************************************************************************************/
	public WebElement get_orderActiveStatus() {
		return DriverManager.getDriver().findElement(orderActiveStatus);
	}

	/********************************************************************************************************************************/
	public WebElement get_completedDate() {
		return DriverManager.getDriver().findElement(completedDate);
	}
	public WebElement get_device()
	{
		return DriverManager.getDriver().findElement(device);
	}
	/********************************************************************************************************************************/
	public WebElement get_productName() {
		return DriverManager.getDriver().findElement(productName);
	}

	/********************************************************************************************************************************/
	public WebElement get_quantity() {
		return DriverManager.getDriver().findElement(quantity);
	}

	/********************************************************************************************************************************/
	public WebElement get_updateDate() {
		return DriverManager.getDriver().findElement(updateDate);
	}

	/********************************************************************************************************************************/
	public WebElement get_dateOrdered() {
		return DriverManager.getDriver().findElement(dateOrdered);
	}

	/********************************************************************************************************************************/
	public WebElement get_paymentMethod() {
		return DriverManager.getDriver().findElement(paymentMethod);
	}

	/********************************************************************************************************************************/
	public WebElement get_amountPaid() {
		return DriverManager.getDriver().findElement(amountPaid);
	}

	/********************************************************************************************************************************/
	public WebElement get_shippingAddress() {
		return DriverManager.getDriver().findElement(shippingAddress);
	}

	/********************************************************************************************************************************/
	public WebElement get_estDayOfDelivery() {
		return DriverManager.getDriver().findElement(estDayOfDelivery);
	}

	/********************************************************************************************************************************/
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
	
	public WebElement get_totalAmount() {
		return DriverManager.getDriver().findElement(totalAmount);
	}

	/********************************************************************************************************************************/
	public WebElement get_PaymentMethod() {
		return DriverManager.getDriver().findElement(PaymentMethod);
	}

	/********************************************************************************************************************************/
	
	public WebElement get_ShipToThisAddress() {
		return DriverManager.getDriver().findElement(ShipToThisAddress);
	}

	/********************************************************************************************************************************/
	
	public WebElement get_planType() {
		return DriverManager.getDriver().findElement(planType);
	}

	/********************************************************************************************************************************/
	public boolean isElementExist(String message, String element, int waitTime) {
		boolean flag = false;

		switch (element) {
//		case "privacyAccept":
//			flag = waitForElementVisibility(privacyAccept, waitTime);
//			break;
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
		case "totalAmount":
			flag = waitForElementVisibility(totalAmount, waitTime);
			break;
		case "PaymentMethod":
			flag = waitForElementVisibility(PaymentMethod, waitTime);
			break;
		case "ShipToThisAddress":
			flag = waitForElementVisibility(ShipToThisAddress, waitTime);
			break;
		case "planType":
			flag = waitForElementVisibility(planType, waitTime);
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

	/********************************************************************************************************************************/
	public boolean isClickable(String element, int waitTime) {

		boolean flag = false;

		switch (element) {
//		case "link_LTE_Advanced":
//			flag = waitForElementClickable(link_LTE_Advanced, waitTime);
//			break;

		}

		return flag;
	}

	/********************************************************************************************************************************/
	public void moveToElement(String element) {

		WebElement ele = null;

		switch (element) {
//		case "menuBuy":
//			ele = DriverManager.getDriver().findElement(link_MenuBuy);
//			break;

		}

		try {
			Actions a = new Actions(DriverManager.getDriver());
			Thread.sleep(500L);
			a.moveToElement(ele).build().perform();
		} catch (Exception e) {

		}
	}

	/********************************************************************************************************************************/
	public void clickOnElement(String type, String eleName, String ele) {

		try {
			switch (ele) {
//			case "menuBuy":
//				get_menuBuy().click();
//				break;

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
	public String getAttributeValue(String ele, String attribute) {
		String text = "";

		try {
			switch (ele) {
			case "productImage":
				text = DriverManager.getDriver().findElement(productImage).getAttribute(attribute);
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
