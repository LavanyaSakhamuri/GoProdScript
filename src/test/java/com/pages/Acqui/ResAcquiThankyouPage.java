package com.pages.Acqui;


import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import globeOnline_CommonMethods.DriverManager;


public class ResAcquiThankyouPage extends BasePage {
	
	By forProcessing = By.xpath("//h1[text()='For processing']");
	By thankYouText = By.xpath("//h1[text()=' Thank you! ']");
	By youOnTheListText = By.xpath("//p[contains(text(), 'on the list! Stand by for updates on your reservation via the email')]");
	By reservationRequestReceived = By.xpath("//h2[text()='Reservation request received']");
	By ReferenceNumber = By.xpath("//div[text()='Reference number']//following::div[2]");
	By OrderSummaryText = By.xpath("//span[text()='Order Summary']");
	By shippingAddress = By.xpath("//span[text()='Shipping address']//following::span[1]");
	By paymentMethod = By.xpath("//span[text()='Payment method']//following::span[1]");
	By AmountToPay = By.xpath("//span[text()='Amount to pay']//following::span[1]");
	By thankYouForReservationText = By.xpath("//span[contains(text(), 'Thank you for your reservation')]");
	By deviceImage = By.xpath("//div[contains(@class, 'device-image')]//img");
	By deviceName = By.xpath("//div[contains(@class, 'device-image')]//following::div[3]");
	By planName = By.xpath("//div[contains(@class, 'device-image')]//following::div[4]");
	By contractDurationText = By.xpath("//span[contains(text(), 'Contract Duration:')]");
	By color_CapacityText = By.xpath("//div[text()=' Color & Capacity ']");
	
	By planInclusionsText = By.xpath("//div[text()=' Plan inclusions ']");
	By KonsultaMD_Subscription = By.xpath("//div[text()=' Free subscription to KonsultaMD  ']");
	By iQIYI_Access = By.xpath("//div[text()=' 3-month VIP Access to iQIYI  ']");
	By weTV_Access = By.xpath("//div[text()=' 3-month VIP Access to weTV  ']");
	By addons_Text = By.xpath("//div[text()=' Add ons ']");
	By MySuperDuo = By.xpath("//div[text()=' MySuperDuo ']");
	By AmazonPrimeVideo = By.xpath("//div[text()=' Amazon Prime Video ']");
	By ViuPremium = By.xpath("//div[text()=' Viu Premium ']");
	By SpotifyPremium = By.xpath("//div[text()=' Spotify Premium ']");
	By GOCALLIDD = By.xpath("//div[text()=' GOCALLIDD 199 ']");
	By EasyRoam = By.xpath("//div[text()=' Easy Roam ']");
	By GSAddSurf99  = By.xpath("//div[text()=' GS Add Surf 99 ']");
	By Reminders = By.xpath("//div[text()=' Reminders: ']");











	
	
	/********************************************************************************************************************************/
	public WebElement get_ReferenceNumber() {
		return DriverManager.getDriver().findElement(ReferenceNumber);
	}

	/********************************************************************************************************************************/
	public WebElement get_shippingAddress() {
		return DriverManager.getDriver().findElement(shippingAddress);
	}

	/********************************************************************************************************************************/
	public WebElement get_paymentMethod() {
		return DriverManager.getDriver().findElement(paymentMethod);
	}

	/********************************************************************************************************************************/
	public WebElement get_AmountToPay() {
		return DriverManager.getDriver().findElement(AmountToPay);
	}

	/********************************************************************************************************************************/
	public WebElement get_deviceName() {
		return DriverManager.getDriver().findElement(deviceName);
	}

	/********************************************************************************************************************************/
	public WebElement get_planName() {
		return DriverManager.getDriver().findElement(planName);
	}

	/********************************************************************************************************************************/
	
	public boolean isElementExist(String message, String element, int waitTime) {
		boolean flag = false;

		switch (element) {
		case "forProcessing":
			flag = waitForElementVisibility(forProcessing, waitTime);
			break;
		case "thankYouText":
			flag = waitForElementVisibility(thankYouText, waitTime);
			break;
		case "youOnTheListText":
			flag = waitForElementVisibility(youOnTheListText, waitTime);
			break;
		case "reservationRequestReceived":
			flag = waitForElementVisibility(reservationRequestReceived, waitTime);
			break;
		case "ReferenceNumber":
			flag = waitForElementVisibility(ReferenceNumber, waitTime);
			break;
		case "OrderSummaryText":
			flag = waitForElementVisibility(OrderSummaryText, waitTime);
			break;
		case "shippingAddress":
			flag = waitForElementVisibility(shippingAddress, waitTime);
			break;
		case "paymentMethod":
			flag = waitForElementVisibility(paymentMethod, waitTime);
			break;
		case "AmountToPay":
			flag = waitForElementVisibility(AmountToPay, waitTime);
			break;
		case "thankYouForReservationText":
			flag = waitForElementVisibility(thankYouForReservationText, waitTime);
			break;
		case "deviceImage":
			flag = waitForElementVisibility(deviceImage, waitTime);
			break;
		case "deviceName":
			flag = waitForElementVisibility(deviceName, waitTime);
			break;
		case "planName":
			flag = waitForElementVisibility(planName, waitTime);
			break;
		case "color_CapacityText":
			flag = waitForElementVisibility(color_CapacityText, waitTime);
			break;
		case "contractDurationText":
			flag = waitForElementVisibility(contractDurationText, waitTime);
			break;
		case "planInclusionsText":
			flag = waitForElementVisibility(planInclusionsText, waitTime);
			break;
		case "KonsultaMD_Subscription":
			flag = waitForElementVisibility(KonsultaMD_Subscription, waitTime);
			break;
		case "iQIYI_Access":
			flag = waitForElementVisibility(iQIYI_Access, waitTime);
			break;
		case "weTV_Access":
			flag = waitForElementVisibility(weTV_Access, waitTime);
			break;
		case "addons_Text":
			flag = waitForElementVisibility(addons_Text, waitTime);
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
		case "GSAddSurf99":
			flag = waitForElementVisibility(GSAddSurf99, waitTime);
			break;
		case "Reminders":
			flag = waitForElementVisibility(Reminders, waitTime);
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
