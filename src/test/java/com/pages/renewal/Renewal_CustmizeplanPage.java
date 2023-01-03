package com.pages.renewal;

import java.util.NoSuchElementException;


import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.pages.Acqui.BasePage;

import globeOnline_CommonMethods.DriverManager;

public class Renewal_CustmizeplanPage extends BasePage {
	

	By customizePlan = By.xpath("//label[text()='Customize plan']");
	By gplan599WithDevice = By.xpath("(//div[contains(text(), ' GPlan 599 with Device ')])[1]");
	By chooseYourPhone = By.xpath("//span[text()='Choose your phone']");
	
	//Device detalis
	By deviceName = By.xpath("//div[@class='go_sc-choose-your-phone__img']//span");
	By deviceDetails = By.xpath("//div[text()='Device details']");
	By specifications = By.xpath("//div[text()='Device details']//following::p[2]");
	By screenSize = By.xpath("//div[text()='Device details']//following::li[1]");
	By camera = By.xpath("//div[text()='Device details']//following::li[2]");
	By battery = By.xpath("//div[text()='Device details']//following::li[3]");
	By memory = By.xpath("//div[text()='Device details']//following::li[4]");
	By display = By.xpath("//div[text()='Device details']//following::li[5]");
	By frontCamera = By.xpath("//div[text()='Device details']//following::li[6]");
	By RAM = By.xpath("//div[text()='Device details']//following::li[7]");
	By hideDetails = By.xpath("//a[text()='Hide details']");
	By showMoreDevices = By.xpath("//button[text()=' Show more devices ']");
	By changeLinkForPlans = By.xpath("(//a[text()='Change'])[1]");
	
	By PrefereSIMOrPhysicalSIMCard = By.xpath("//div[text()=' Prefer e-SIM or a physical SIM card? ']");
	By physicalSimCard = By.xpath("//span[text()='Physical SIM card']//parent::label//input");



	By all_AccessData = By.xpath("(//span[text()='All-access data ']//following::span)[1]");
	By GoWifi_Access = By.xpath("(//span[text()=' GoWifi access ']//following::span)[1]");
	By Call_and_text = By.xpath("(//span[text()=' Call and text '])[1]");
	By Contract_duration = By.xpath("(//span[text()='Contract duration']//following::span)[1]");
	
	//Inclusions
	By Inclusions = By.xpath("(//span[text()=' Inclusions '])[1]");
	By KonsultaMD = By.xpath("(//span[text()=' Free subscription to KonsultaMD  '])[1]");
	By iQIYI = By.xpath("(//span[text()=' 3-month VIP Access to iQIYI  '])[1]");
	By weTV = By.xpath("(//span[text()=' 3-month VIP Access to weTV  '])[1]");
	
	
	By chooseContractDuration = By.xpath("//span[text()='Choose your contract duration']");
	By chooseYourColor = By.xpath("//span[text()='Choose your color']");
	By deviceColors = By.xpath("//input[@class='gk-color-selector__radio']");
	By chooseStorageCapacity = By.xpath("//span[text()='Choose your storage capacity']//following::div[3]");
	
	
	//Addons
	By pickYourAdd_ons = By.xpath("//div[text()=' Pick your add-ons (as many as you want!) ']");
	By add_ons_Go_On_TopOfYour_Month = By.xpath("//div[text()=' These add-ons go on top of your monthly plan. ']");
	
	By Do_you_use_lots_of_data = By.xpath("//span[text()='Do you use lots of data?']");
	By GS_Add_Surf_99 = By.xpath("//div[text()=' GS Add Surf 99 ']");
	
	By Do_you_love_watching_shows_and_movies = By.xpath("//span[text()='Do you love watching shows and movies?']");
	By Amazon_Prime_Video = By.xpath("//div[text()=' Amazon Prime Video ']");
	By Viu_Premium = By.xpath("//div[text()=' Viu Premium ']");
	By Spotify_Premium = By.xpath("//div[text()=' Spotify Premium ']");
	
	
	By Prefer_talking_over_messaging = By.xpath("//span[text()='Prefer talking over messaging?']");
	By MyDuo = By.xpath("//div[text()=' MyDuo ']");
	By My_Super_Duo = By.xpath("//div[text()=' MySuperDuo ']");
	
	By Are_you_all_about_the_jet_setting_lifestyle = By.xpath("//span[text()='Are you all about the jet-setting lifestyle?']");
	By Easy_Roam = By.xpath("//div[text()=' Easy Roam ']");
	By GOCALLIDD_199 = By.xpath("//div[text()=' GOCALLIDD 199 ']");
	
	By shippingAddress = By.xpath("(//a[text()='Change'])[2]");
	By changeLinkForAddress = By.xpath("//span[text()='Shipping Address']");


    //Review my plan
	By See_my_new_plan = By.xpath("//span[text()=' See my new plan ']");
	By gplan599With_Device = By.xpath("(//div[contains(text(), ' GPlan 599 with Device ')])[3]");
	By nameOfDevice = By.xpath("//div[@class='go_sc-rnp-device-vw__details']//span[1]");
	By subscriptionsandAddons = By.xpath("//div[text()=' Subscriptions and Add-ons ']");
	By GSAddSurf = By.xpath("//span[text()='GS Add Surf 99']");
	By AmazonPrimeVideo = By.xpath("//span[text()='Amazon Prime Video']");
	By ViuPremium = By.xpath("//span[text()='Viu Premium']");
	By MySuperDuo = By.xpath("//span[text()='MySuperDuo']");
	By EasyRoam = By.xpath("//span[text()='Easy Roam']");
	By GOCALLIDD = By.xpath("//span[text()='GOCALLIDD 199']");
	By Totalsubscriptionsandaddons = By.xpath("//div[text()=' Total subscriptions and add-ons ']//span");
	By MonthlyPayment = By.xpath("//div[text()=' Monthly payment ']//span");
	By Monthlypaymentincludes = By.xpath("//div[text()=' Monthly payment includes service fee, subscriptions, and add-ons ']");
	By RenewingFor = By.xpath("//div[text()=' Renewing for ']//span");
	By AllAccessData = By.xpath("(//span[text()='All-access data '])[2]");
	By GoWifiAccess = By.xpath("(//span[text()=' GoWifi access '])[2]");
	By Callandtext = By.xpath("(//span[text()=' Call and text '])[2]");
	By ContractDuration = By.xpath("(//span[text()='Contract duration'])[2]");
	By FreesubscriptiontoKonsultaMD = By.xpath("(//span[text()=' Free subscription to KonsultaMD  '])[2]");
	By ThreemonthVIPAccesstoiQIYI = By.xpath("(//span[text()=' 3-month VIP Access to iQIYI  '])[2]");
	By ThreemonthVIPAccesstoweTV = By.xpath("(//span[text()=' 3-month VIP Access to weTV  '])[2]");
	By SelectPlan = By.xpath("(//button[text()=' Select plan '])[1]");






	/********************************************************************************************************************************/
	public WebElement get_deviceName() {
		return DriverManager.getDriver().findElement(deviceName);
	}

	/********************************************************************************************************************************/
	public WebElement get_hideDetails() {
		return DriverManager.getDriver().findElement(hideDetails);
	}

	/********************************************************************************************************************************/
	public WebElement get_showMoreDevices() {
		return DriverManager.getDriver().findElement(showMoreDevices);
	}

	/********************************************************************************************************************************/
	public WebElement get_screenSize() {
		return DriverManager.getDriver().findElement(screenSize);
	}

	/********************************************************************************************************************************/
	public WebElement get_camera() {
		return DriverManager.getDriver().findElement(camera);
	}

	/********************************************************************************************************************************/
	public WebElement get_battery() {
		return DriverManager.getDriver().findElement(battery);
	}

	/********************************************************************************************************************************/
	public WebElement get_memory() {
		return DriverManager.getDriver().findElement(memory);
	}

	/********************************************************************************************************************************/
	public WebElement get_display() {
		return DriverManager.getDriver().findElement(display);
	}

	/********************************************************************************************************************************/
	public WebElement get_frontCamera() {
		return DriverManager.getDriver().findElement(frontCamera);
	}

	/********************************************************************************************************************************/
	public WebElement get_RAM() {
		return DriverManager.getDriver().findElement(RAM);
	}

	/********************************************************************************************************************************/
	public WebElement get_all_AccessData() {
		return DriverManager.getDriver().findElement(all_AccessData);
	}

	/********************************************************************************************************************************/
	public WebElement get_GoWifi_Access() {
		return DriverManager.getDriver().findElement(GoWifi_Access);
	}

	/********************************************************************************************************************************/
	public WebElement get_Contract_duration() {
		return DriverManager.getDriver().findElement(Contract_duration);
	}

	/********************************************************************************************************************************/
	public WebElement get_chooseStorageCapacity() {
		return DriverManager.getDriver().findElement(chooseStorageCapacity);
	}

	/********************************************************************************************************************************/
	public WebElement get_Do_you_use_lots_of_data() {
		return DriverManager.getDriver().findElement(Do_you_use_lots_of_data);
	}

	/********************************************************************************************************************************/
	public WebElement get_GS_Add_Surf_99() {
		return DriverManager.getDriver().findElement(GS_Add_Surf_99);
	}

	/********************************************************************************************************************************/
	public WebElement get_Do_you_love_watching_shows_and_movies() {
		return DriverManager.getDriver().findElement(Do_you_love_watching_shows_and_movies);
	}

	/********************************************************************************************************************************/
	public WebElement get_Amazon_Prime_Video() {
		return DriverManager.getDriver().findElement(Amazon_Prime_Video);
	}

	/********************************************************************************************************************************/
	public WebElement get_Viu_Premium() {
		return DriverManager.getDriver().findElement(Viu_Premium);
	}

	/********************************************************************************************************************************/
	public WebElement get_Spotify_Premium() {
		return DriverManager.getDriver().findElement(Spotify_Premium);
	}

	/********************************************************************************************************************************/
	public WebElement get_Prefer_talking_over_messaging() {
		return DriverManager.getDriver().findElement(Prefer_talking_over_messaging);
	}

	/********************************************************************************************************************************/
	public WebElement get_MyDuo() {
		return DriverManager.getDriver().findElement(MyDuo);
	}

	/********************************************************************************************************************************/
	public WebElement get_My_Super_Duo() {
		return DriverManager.getDriver().findElement(My_Super_Duo);
	}

	/********************************************************************************************************************************/
	public WebElement get_Are_you_all_about_the_jet_setting_lifestyle() {
		return DriverManager.getDriver().findElement(Are_you_all_about_the_jet_setting_lifestyle);
	}

	/********************************************************************************************************************************/
	public WebElement get_Easy_Roam() {
		return DriverManager.getDriver().findElement(Easy_Roam);
	}

	/********************************************************************************************************************************/
	public WebElement get_GOCALLIDD_199() {
		return DriverManager.getDriver().findElement(GOCALLIDD_199);
	}

	/********************************************************************************************************************************/
	public WebElement get_changeLinkForAddress() {
		return DriverManager.getDriver().findElement(changeLinkForAddress);
	}

	/********************************************************************************************************************************/
	public WebElement get_See_my_new_plan() {
		return DriverManager.getDriver().findElement(See_my_new_plan);
	}

	/********************************************************************************************************************************/
	public WebElement get_nameOfDevice() {
		return DriverManager.getDriver().findElement(nameOfDevice);
	}

	/********************************************************************************************************************************/
	public WebElement get_Totalsubscriptionsandaddons() {
		return DriverManager.getDriver().findElement(Totalsubscriptionsandaddons);
	}

	/********************************************************************************************************************************/
	public WebElement get_MonthlyPayment() {
		return DriverManager.getDriver().findElement(MonthlyPayment);
	}

	/********************************************************************************************************************************/
	public WebElement get_RenewingFor() {
		return DriverManager.getDriver().findElement(RenewingFor);
	}

	/********************************************************************************************************************************/
	public WebElement get_SelectPlan() {
		return DriverManager.getDriver().findElement(SelectPlan);
	}

	/********************************************************************************************************************************/
	public WebElement get_physicalSimCard() {
		return DriverManager.getDriver().findElement(physicalSimCard);
	}

	/********************************************************************************************************************************/
	
	
	
	public boolean isElementExist(String message, String element, int waitTime) {
		boolean flag = false;

		switch (element) {
		case "customizePlan":
			flag = waitForElementVisibility(customizePlan, waitTime);
			break;
		case "gplan599WithDevice":
			flag = waitForElementVisibility(gplan599WithDevice, waitTime);
			break;
		case "chooseYourPhone":
			flag = waitForElementVisibility(chooseYourPhone, waitTime);
			break;	
		case "deviceName":
			flag = waitForElementVisibility(deviceName, waitTime);
			break;
		case "deviceDetails":
			flag = waitForElementVisibility(deviceDetails, waitTime);
			break;
		case "specifications":
			flag = waitForElementVisibility(specifications, waitTime);
			break;	
		case "screenSize":
			flag = waitForElementVisibility(screenSize, waitTime);
			break;	
		case "camera":
			flag = waitForElementVisibility(camera, waitTime);
			break;
		case "battery":
			flag = waitForElementVisibility(battery, waitTime);
			break;	
		case "memory":
			flag = waitForElementVisibility(memory, waitTime);
			break;
		case "display":
			flag = waitForElementVisibility(display, waitTime);
			break;
		case "frontCamera":
			flag = waitForElementVisibility(frontCamera, waitTime);
			break;
		case "RAM":
			flag = waitForElementVisibility(RAM, waitTime);
			break;
		case "hideDetails":
			flag = waitForElementVisibility(hideDetails, waitTime);
			break;	
		case "showMoreDevices":
			flag = waitForElementVisibility(showMoreDevices, waitTime);
			break;
		case "all_AccessData":
			flag = waitForElementVisibility(all_AccessData, waitTime);
			break;
		case "GoWifi_Access":
			flag = waitForElementVisibility(GoWifi_Access, waitTime);
			break;
		case "Call_and_text":
			flag = waitForElementVisibility(Call_and_text, waitTime);
			break;
		case "Contract_duration":
			flag = waitForElementVisibility(Contract_duration, waitTime);
			break;
		case "Inclusions":
			flag = waitForElementVisibility(Inclusions, waitTime);
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
		case "chooseContractDuration":
			flag = waitForElementVisibility(chooseContractDuration, waitTime);
			break;
		case "chooseYourColor":
			flag = waitForElementVisibility(chooseYourColor, waitTime);
			break;
		case "deviceColors":
			flag = waitForElementVisibility(deviceColors, waitTime);
			break;
		case "pickYourAdd_ons":
			flag = waitForElementVisibility(pickYourAdd_ons, waitTime);
			break;
		case "add_ons_Go_On_TopOfYour_Month":
			flag = waitForElementVisibility(add_ons_Go_On_TopOfYour_Month, waitTime);
			break;	
		case "Do_you_use_lots_of_data":
			flag = waitForElementVisibility(Do_you_use_lots_of_data, waitTime);
			break;	
		case "GS_Add_Surf_99":
			flag = waitForElementVisibility(GS_Add_Surf_99, waitTime);
			break;
		case "Do_you_love_watching_shows_and_movies":
			flag = waitForElementVisibility(Do_you_love_watching_shows_and_movies, waitTime);
			break;
		case "Amazon_Prime_Video":
			flag = waitForElementVisibility(Amazon_Prime_Video, waitTime);
			break;	
		case "Viu_Premium":
			flag = waitForElementVisibility(Viu_Premium, waitTime);
			break;	
		case "Spotify_Premium":
			flag = waitForElementVisibility(Spotify_Premium, waitTime);
			break;	
		case "Prefer_talking_over_messaging":
			flag = waitForElementVisibility(Prefer_talking_over_messaging, waitTime);
			break;
		case "MyDuo":
			flag = waitForElementVisibility(MyDuo, waitTime);
			break;
		case "My_Super_Duo":
			flag = waitForElementVisibility(My_Super_Duo, waitTime);
			break;
		case "Are_you_all_about_the_jet_setting_lifestyle":
			flag = waitForElementVisibility(Are_you_all_about_the_jet_setting_lifestyle, waitTime);
			break;	
		case "Easy_Roam":
			flag = waitForElementVisibility(Easy_Roam, waitTime);
			break;
		case "GOCALLIDD_199":
			flag = waitForElementVisibility(GOCALLIDD_199, waitTime);
			break;	
		case "changeLinkForAddress":
			flag = waitForElementVisibility(changeLinkForAddress, waitTime);
			break;
		case "shippingAddress":
			flag = waitForElementVisibility(shippingAddress, waitTime);
			break;
		case "See_my_new_plan":
			flag = waitForElementVisibility(See_my_new_plan, waitTime);
			break;
		case "changeLinkForPlans":
			flag = waitForElementVisibility(changeLinkForPlans, waitTime);
			break;	
		case "gplan599With_Device":
			flag = waitForElementVisibility(gplan599With_Device, waitTime);
			break;
		case "nameOfDevice":
			flag = waitForElementVisibility(nameOfDevice, waitTime);
			break;
		case "subscriptionsandAddons":
			flag = waitForElementVisibility(subscriptionsandAddons, waitTime);
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
		case "EasyRoam":
			flag = waitForElementVisibility(EasyRoam, waitTime);
			break;
		case "GOCALLIDD":
			flag = waitForElementVisibility(GOCALLIDD, waitTime);
			break;
		case "MySuperDuo":
			flag = waitForElementVisibility(MySuperDuo, waitTime);
			break;
		case "Totalsubscriptionsandaddons":
			flag = waitForElementVisibility(Totalsubscriptionsandaddons, waitTime);
			break;
		case "MonthlyPayment":
			flag = waitForElementVisibility(MonthlyPayment, waitTime);
			break;
		case "Monthlypaymentincludes":
			flag = waitForElementVisibility(Monthlypaymentincludes, waitTime);
			break;
		case "RenewingFor":
			flag = waitForElementVisibility(RenewingFor, waitTime);
			break;	
		case "AllAccessData":
			flag = waitForElementVisibility(AllAccessData, waitTime);
			break;	
		case "GoWifiAccess":
			flag = waitForElementVisibility(GoWifiAccess, waitTime);
			break;	
		case "Callandtext":
			flag = waitForElementVisibility(Callandtext, waitTime);
			break;	
		case "ContractDuration":
			flag = waitForElementVisibility(ContractDuration, waitTime);
			break;	
		case "FreesubscriptiontoKonsultaMD":
			flag = waitForElementVisibility(FreesubscriptiontoKonsultaMD, waitTime);
			break;	
		case "ThreemonthVIPAccesstoiQIYI":
			flag = waitForElementVisibility(ThreemonthVIPAccesstoiQIYI, waitTime);
			break;	
		case "ThreemonthVIPAccesstoweTV":
			flag = waitForElementVisibility(ThreemonthVIPAccesstoweTV, waitTime);
			break;
		case "SelectPlan":
			flag = waitForElementVisibility(SelectPlan, waitTime);
			break;
		case "PrefereSIMOrPhysicalSIMCard":
			flag = waitForElementVisibility(PrefereSIMOrPhysicalSIMCard, waitTime);
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
			case "hideDetails":
		         jse.executeScript("arguments[0].click();", get_hideDetails());		
		         break;
			case "showMoreDevices":
		         jse.executeScript("arguments[0].click();", get_showMoreDevices());		
		         break;
			case "Do_you_use_lots_of_data":
		         jse.executeScript("arguments[0].click();", get_Do_you_use_lots_of_data());		
		         break; 
			case "GS_Add_Surf_99":
		         jse.executeScript("arguments[0].click();", get_GS_Add_Surf_99());		
		         break; 
			case "Do_you_love_watching_shows_and_movies":
		         jse.executeScript("arguments[0].click();", get_Do_you_love_watching_shows_and_movies());		
		         break;  
			case "Amazon_Prime_Video":
		         jse.executeScript("arguments[0].click();", get_Amazon_Prime_Video());		
		         break;   
			case "Viu_Premium":
		         jse.executeScript("arguments[0].click();", get_Viu_Premium());		
		         break;
			case "Spotify_Premium":
		         jse.executeScript("arguments[0].click();", get_Spotify_Premium());		
		         break;
			case "Prefer_talking_over_messaging":
		         jse.executeScript("arguments[0].click();", get_Prefer_talking_over_messaging());		
		         break; 
			case "MyDuo":
		         jse.executeScript("arguments[0].click();", get_MyDuo());		
		         break; 
			case "My_Super_Duo":
		         jse.executeScript("arguments[0].click();", get_My_Super_Duo());		
		         break;
			case "Are_you_all_about_the_jet_setting_lifestyle":
		         jse.executeScript("arguments[0].click();", get_Are_you_all_about_the_jet_setting_lifestyle());		
		         break; 
			case "Easy_Roam":
		         jse.executeScript("arguments[0].click();", get_Easy_Roam());		
		         break;
			case "GOCALLIDD_199":
		         jse.executeScript("arguments[0].click();", get_GOCALLIDD_199());		
		         break;
			case "changeLinkForAddress":
		         jse.executeScript("arguments[0].click();", get_changeLinkForAddress());		
		         break; 
			case "See_my_new_plan":
		         jse.executeScript("arguments[0].click();", get_See_my_new_plan());		
		         break;
			case "SelectPlan":
		         jse.executeScript("arguments[0].click();", get_SelectPlan());		
		         break;
			case "physicalSimCard":
		         jse.executeScript("arguments[0].click();", get_physicalSimCard());		
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
	