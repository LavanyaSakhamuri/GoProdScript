package com.pages.ada;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import globeOnline_CommonMethods.DriverManager;

public class ADAOrdersummary_Page extends BasePage {

	static File file;

	//	public static WebDriverManager.getDriver() DriverManager.getDriver();
	//
	//	public LandingPage(WebDriverManager.getDriver() DriverManager.getDriver()) {
	//		this.DriverManager.getDriver() = DriverManager.getDriver();
	//	}
	
	//----- RONNIE SCRIPT ADA5 -----
	
	By PlannameSim999 = By.xpath("//span[contains(text(), 'GPlan Plus SIM-Only 999 ')]");
	By OBLabel = By.xpath("//div[contains(text(), 'Overdue balance')]");
	By OBPrice = By.xpath("(//div[@class='fees-structure ng-star-inserted'])[1]//div[@class='amount']");
	By PlanAppSimOnlyName = By.xpath("(//div[contains(text(), 'GPlan Plus SIM-Only 999')])[1]");
	By MonthlyPaySimOnlyName = By.xpath("(//div[contains(text(), 'GPlan Plus SIM-Only 999')])[2]");
	By MonthlyPaySpiel = By.xpath("//div[contains(text(), ' No need to pay this today! This will be charged to your first bill. ')]");
	By MonthlyPay_PlanPrice = By.xpath("//div[@class='device-plan-amount darker']");
	By totalAddonsPrice= By.xpath("//span[@class='total-amount' and text()=' ₱ 99.00']");
	By GS99 = By.xpath("//div[contains(text(), ' GS Add Surf 99 ')]");
	By GS99Price = By.xpath("//div[@class='accordion-item ng-star-inserted']//div[@class='amount-section']");
	By totalmontlyBillPayment_1098 = By.xpath("//span[text()='₱ 1,098.00']");
//	By  = By.xpath("");
	
	
	
	
	
	//----- RONNIE SCRIPT ADA5 ENDS HERE -----

	By cookiesNotification = By.xpath("//p[contains(text(),'uses cookies to help')]");
	By privacyAccept = By.xpath("//button[text()=' I accept']");
	By acquisitionSummary = By.xpath("//h1[text()=' Acquisition - Summary ']");
	By buildPlan = By.xpath("//li[text()='Build plan']");
	By fillOut = By.xpath("//li[text()='Fill out']");
	By review = By.xpath("//li[text()='Review']");
	By pay = By.xpath("//li[text()='Pay']");
	By forProcessing = By.xpath("//li[text()='For processing']");
	By noticeBlock = By.xpath("//div[@class='go_notice-block']");
	By goIconGoNotice = By.xpath("//span[@class='go_icon go_notice']");
	By goTextPreamble = By.xpath("//p[@class='go_text-preamble-small-semibold']");
	By orderSummary = By.xpath("//span[text()='Order Summary']");
	By gSAD = By.xpath("//span[contains(text(),'GPlan 599 with Device')]");
	By access = By.xpath("//span[text()='All-access data']");
	By Gowifi = By.xpath("//span[text()='GoWifi access']");
	By imgMobile = By.xpath("//div/img[contains(@src,'/assets/files/media/call-and-text.png')]");
	By planInclusion = By.xpath("//div[text()='Plan inclusion']");
	By weCollectPayent = By.xpath("//p[contains(text(), 'We’ll only collect')]");
	By AcquisitionSummary = By.xpath("//h1[text()=' Acquisition - Summary ']");
	By planName = By.xpath("//div[@class='plan-name-heading']//span");
	By deviceImg = By.xpath("//div[@class='phone']//img");
	By deviceName = By.xpath("//div[@class='phone']//following::span[1]");
	By AllAccessData = By.xpath("//span[text()='All-access data']");
	By GoWifi = By.xpath("//span[text()='GoWifi access']");
	By CallAndText = By.xpath("//span[text()='Call and text']");
	By PlanInclusion = By.xpath("//div[text()='Plan inclusion']");
	By KonsultaMD = By.xpath("//li[text()='Free individual subscription to KonsultaMD']");
	By VIPAccessToiQIYI = By.xpath("//li[text()='3-month VIP Access to iQIYI']");
	By VIPAccessToweTV = By.xpath("//li[text()='3-month VIP Access to weTV']");
	By Addons = By.xpath("//div[text()='Add-ons']");
	By MySuperDuo = By.xpath("//li[text()='MySuperDuo']");
	By AmazonPrimeVideo = By.xpath("//li[text()='Amazon Prime Video']");
	By ViuPremium = By.xpath("//li[text()='Viu Premium']");
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

			//span[text()='Plan inclusion']");
	By konsulta = By.xpath("//li[text()='Konsulta MD']");
	By glnusure = By.xpath("//li[text()='Glnsure']");
	By addOns = By.xpath("//div[text()='Add-ons']");
			//span[text()='Add-ons']");
	By myDuo1 = By.xpath("//li[text()='MyDuo']");
	By aPV = By.xpath("//li[text()='Amazon Prime Video']");
	By oneTimePayment = By.xpath("//span[text()=' One-time Payment ']");
	By planapplication1 = By.xpath("(//div[contains(text(), 'Plan Application')])[1]");
	By planapplicationcollapse1 = By.xpath("(//button[@class='accordion-button pre-termination-fee collapsed'])[1]");
	By advanceMonthly = By.xpath("//div[text()=' Advance Monthly Service Charge ']");
	By advanceMonthlyamount = By.xpath("//div[@class='amount' and text()='₱599.00']");
	By advanceMonthlyamount999 = By.xpath("//div[@class='amount' and text()='₱999.00']");
	By textSimoOnltAllData1 = By.xpath("(//div[ text()=' GPlan SIM-Only All Data 599 '])[1]");
	By shipping = By.xpath("//div[contains(text(), ' Shipping ')]");
	By free = By.xpath("//div[contains(text(),'Free')]");
	By planAmountfirst = By.xpath("(//span[@class='total-amount'])[1]");
	By totalMonthlyBill = By.xpath("((//span[contains(text(),'Total monthly bill')])[1]");
	By totalMonthlyBillSimOnly = By.xpath("(//span[contains(text(),'Total amount')])[1]");
	By totalamountpay = By.xpath("//div[contains(@class,'total-amount-to-pay ampount-2')] //span[text()='₱ 599.00']");
	By totalamountpaySimOnly999 = By.xpath("(//div[contains(@class,'total-amount-to-pay ampount-2')]//span[contains(text(), '00')])[1]");
	By PromoIcon = By.xpath("//div[@class='promocode-icon']");
	By promoCode = By.xpath("//span[contains(text(),'Got a promo code?')]");
	By PromoClickHere = By.xpath("//button[contains(text(), 'Click Here')]");
	By shipicon = By.xpath("//div[@class='col-3 ship-icon']");
	By shippingAdress = By.xpath("//span[contains(text(),'Ship to this address')]");
	By changeAdress = By.xpath("//span[contains(text(),'Change address')]");
	By submitOrder = By.xpath("//button[text()=' Choose payment method ']");
	By planApplicationcollapsebutton2 = By.xpath("(//button[@class='accordion-button pre-termination-fee collapsed'])[2]");
	By monthlyPayment = By.xpath("//div[text()=' Monthly Payment ']");
	By planaction2 = By.xpath("(//div[contains(text(), 'Plan Application')])[2]");
	By textSimoOnltAllData2 = By.xpath("(//div[ text()=' GPlan SIM-Only All Data 599 '])[2]");
	By  gPlanSimOnlyAllDataprice599  = By.xpath("//div[@class='amount darker' and text()=' ₱ 599.00 ']");

	By addonbox = By.xpath("//div[@id='onetime-addon-collapse']");
	By addons = By.xpath("//div[text()=' Add-ons  ']");
	By myDuo = By.xpath("//div[text()=' MyDuo ']");
	By amazonprimeVideo = By.xpath("//div[@class='fees-type-desc' and text()=' Amazon Prime Video ']");
	By totaladdons = By.xpath("//div[@class='total-label' and text()=' Total add ons ']");	
	By totalMontlybill2 = By.xpath("//span[@class='total-amount' and text()=' ₱ 600.00']");
	By monthlyservice = By.xpath("//div[text()=' Monthly Service fee + add-ons and subcriptions ']");
	By totalmontlyBillPayment = By.xpath("//span[text()='₱ 1,199.00']");

//FTA5
	By gcashamount = By.xpath("(//div[@class='amount-section'])[1]");
	By gcashname1 = By.xpath("(//div[contains(text(),' GPlan 2499 with GCash ')])[1]");
	
	By gcashname2 = By.xpath("(//div[contains(text(),' GPlan 2499 with GCash ')])[2]");
	By gcashamount2 = By.xpath("(//div[@class='amount darker'])[1]");
	
	By Addonsheader = By.xpath("(//div[@class='summary-heading'])[3]");
	By Collapse = By.xpath("(//button[@type='button'])[4]");
	
	By Viupremium = By.xpath("//div[text()=' Viu Premium ']");
	By SpotifyPremium  = By.xpath("//div[text()=' Spotify Premium ']");
	By Easyroam = By.xpath("//div[text()=' Easy Roam ']");
	By Gocallid  = By.xpath("//div[text()=' GOCALLIDD 199 ']");
	By GSADdsurf  = By.xpath("//div[text()=' GS Add Surf 99 ']");
	
	By totaladdonsamount = By.xpath("(//span[@class='total-amount'])[2]");
	By Totalmonthlybillamount = By.xpath("(//div[@class='total-amount-to-pay ampount-2'])[2]");

	//Bhavana scripts starts here
	By gcash599 = By.xpath("//span[text()='GPlan 599 with GCash']");
    By Viupremiumaddons = By.xpath("//li[text()='Viu Premium']");
	By Spotifypremium = By.xpath("//li[text()='Spotify Premium']");
	By easyroam = By.xpath("//li[text()='Easy Roam']");
	By Gocallidaddons = By.xpath("//li[text()='GOCALLIDD 199']");
	By GSAddsurf = By.xpath("//li[text()='GS Add Surf 99']");
	By textgcash2 = By.xpath("(//div[ text()=' GPlan SIM-Only All Data 599 '])[2]");
	By  gcashamount599  = By.xpath("//div[@class='amount darker' and text()=' ₱ 599.00 ']");
	
//asma shaik script
	//ADA2
		By gSAD2=By.xpath("//div[@class='plan-name-heading']//span");
		By textGplanwithDiv=By.xpath("(//div[ text()=' GPlan 599 with Device '])[1]");

		By textwithdevice=By.xpath("(//div[ text()=' GPlan 599 with Device '])[2]");
		By gplangpalnwithdevice599=By.xpath("//div[@class='device-plan-amount darker' and text()=' ₱ 599.00 ']");
		By mysuperduo=By.xpath("//div[text()=' MySuperDuo ']");
		By GSADD=By.xpath("//div[text()=' GS Add Surf 99 ']");
		By TotalMonthlybill2=By.xpath("//span[@class='total-amount' and text()=' ₱ 848.00']");
		By TotalmonthlyBillPAYment=By.xpath("//span[text()='₱ 1,447.00']");
		//ADA6
		By gsad6=By.xpath("//div[@class='plan-name-heading']/span");
		
		By gpalnwithhalldata1799=By.xpath("//div[contains(text(),' GPlan All Data 1799  ')]");
		By gplangpalnwithalldata=By.xpath("(//div[contains(text(),' GPlan All Data 1799  ')])[2]");
		By totalmontlyBillPayment2=By.xpath("//span[text()='₱ 1,799.00']");
		
		//common for all
		By advancempnthlyamount1799=By.xpath("//div[@class='amount-section']/div");
		
		By totalmonthlybill1799=By.xpath("//div[@class='total-section']/span");
		By TOTALAMOUNTTOPAY=By.xpath("//div[@class='total-amount-to-pay ampount-2']/span");
		
		By MySuperduo=By.xpath("//li[text()='MySuperDuo']");
		By GSadd=By.xpath("//li[text()='GS Add Surf 99']");


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
	public WebElement get_addons() {
		return DriverManager.getDriver().findElement(addons);
	}
	public WebElement get_planapplication1() {
		return DriverManager.getDriver().findElement(planapplication1);
	}
	public WebElement get_planapplicationcollapse1() {
		return DriverManager.getDriver().findElement(planapplicationcollapse1);
	}
	public WebElement get_planApplicationcollapsebutton2() {
		return DriverManager.getDriver().findElement(planApplicationcollapsebutton2);
	}
	public WebElement get_Collapse() {
		return DriverManager.getDriver().findElement(Collapse);
	}
	public WebElement get_changeAddress()
	{
		return DriverManager.getDriver().findElement(changeAdress);
	}
	
	//=========== RONNIE SCRIPT STARTS HERE =============
	public void js_clickOnElement(String type, String eleName, String ele) {

		try {
			JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
            
			
			switch (ele) {
			case "submitOrder":
				js.executeScript("arguments[0].click();", get_submitOrder());
				break;
			case "planapplicationcollapse1":
				js.executeScript("arguments[0].click();", get_planapplicationcollapse1());
				break;
			case "PlanApplicationCollapseBtn":
		         js.executeScript("arguments[0].click();", get_PlanApplicationCollapseBtn());		
		         break;
			case "AddonscollapseBtn":
		         js.executeScript("arguments[0].click();", get_AddonscollapseBtn());		
		         break;
			case "Total_Addons":
		         js.executeScript("arguments[0].click();", get_Total_Addons());		
		         break;
			case "Total_MonthlyBill":
		         js.executeScript("arguments[0].click();", get_Total_MonthlyBill());		
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
	//=========== RONNIE SCRIPT ENDS HERE =============
	/********************************************************************************************************************************/

	public boolean isElementExist(String message, String element, int waitTime) {

		boolean flag = false;
		switch (element) {
		case "gcash599":
			flag = waitForElementVisibility(gcash599, waitTime);
			break;
		case "weCollectPayent":
			flag = waitForElementVisibility(weCollectPayent, waitTime);
			break;
		case "textgcash2":
			flag = waitForElementVisibility(textgcash2, waitTime);
			break;
		case "gcashamount599":
			flag = waitForElementVisibility(gcashamount599, waitTime);
			break;
		case "Viupremiumaddons":
			flag = waitForElementVisibility(Viupremiumaddons, waitTime);
			break;
		case "Spotifypremium":
			flag = waitForElementVisibility(Spotifypremium, waitTime);
			break;
		case "easyroam":
			flag = waitForElementVisibility(easyroam, waitTime);
			break;
		case "GSAddsurf":
			flag = waitForElementVisibility(GSAddsurf, waitTime);
			break;
		case "Gocallidaddons":
			flag = waitForElementVisibility(Gocallidaddons, waitTime);
			break;	
		case "totalmontlyBillPayment_1098":
			flag = waitForElementVisibility(totalmontlyBillPayment_1098, waitTime);
			break;
		case "totalAddonsPrice":
			flag = waitForElementVisibility(totalAddonsPrice, waitTime);
			break;
		case "GS99":
			flag = waitForElementVisibility(GS99, waitTime);
			break;
		case "GS99Price":
			flag = waitForElementVisibility(GS99Price, waitTime);
			break;
		case "PlannameSim999":
			flag = waitForElementVisibility(PlannameSim999, waitTime);
			break;
		case "OBLabel":
			flag = waitForElementVisibility(OBLabel, waitTime);
			break;
		case "OBPrice":
			flag = waitForElementVisibility(OBPrice, waitTime);
			break;
		case "PlanAppSimOnlyName":
			flag = waitForElementVisibility(PlanAppSimOnlyName, waitTime);
			break;
		case "MonthlyPaySimOnlyName":
			flag = waitForElementVisibility(MonthlyPaySimOnlyName, waitTime);
			break;
		case "MonthlyPaySpiel":
			flag = waitForElementVisibility(MonthlyPaySpiel, waitTime);
			break;
		case "MonthlyPay_PlanPrice":
			flag = waitForElementVisibility(MonthlyPay_PlanPrice, waitTime);
			break;
		case "gcashamount":
			flag = waitForElementVisibility(gcashamount, waitTime);
			break;
		case "gcashname1":
			flag = waitForElementVisibility(gcashname1, waitTime);
			break;
		case "gcashname2":
			flag = waitForElementVisibility(gcashname2, waitTime);
			break;
		case "gcashamount2":
			flag = waitForElementVisibility(gcashamount2, waitTime);
			break;
		case "Addonsheader":
			flag = waitForElementVisibility(Addonsheader, waitTime);
			break;
		case "Collapse":
			flag = waitForElementVisibility(Collapse, waitTime);
			break;
		case "Viupremium":
			flag = waitForElementVisibility(Viupremium, waitTime);
			break;
		case "Easyroam":
			flag = waitForElementVisibility(Easyroam, waitTime);
			break;
		case "Gocallid":
			flag = waitForElementVisibility(Gocallid, waitTime);
			break;
		case "GSADdsurf":
			flag = waitForElementVisibility(GSADdsurf, waitTime);
			break;
		case "totaladdonsamount":
			flag = waitForElementVisibility(totaladdonsamount, waitTime);
			break;
		case "Totalmonthlybillamount":
			flag = waitForElementVisibility(Totalmonthlybillamount, waitTime);
			break;		
		case "cookiesNotification":
			flag = waitForElementVisibility(cookiesNotification, waitTime);
			break;

		case "acquisitionSummary":
			flag = waitForElementVisibility(acquisitionSummary, waitTime);
			break;

		case "buildPlan":
			flag = waitForElementVisibility(buildPlan, waitTime);
			break;
		case "fillOut":
			flag = waitForElementVisibility(fillOut, waitTime);
			break;
		case "review":
			flag = waitForElementVisibility(review, waitTime);
			break;
		case "pay":
			flag = waitForElementVisibility(review, waitTime);
			break;
		case "forProcessing":
			flag = waitForElementVisibility(forProcessing, waitTime);
			break;
		case "noticeBlock":
			flag = waitForElementVisibility(noticeBlock, waitTime);
			break;
		case "goIconGoNotice":
			flag = waitForElementVisibility(goIconGoNotice, waitTime);
			break;
		case "goTextPreamble":
			flag = waitForElementVisibility(goTextPreamble, waitTime);
			break;
		case "orderSummary":
			flag = waitForElementVisibility(orderSummary, waitTime);
			break;
		case "gSAD":
			flag = waitForElementVisibility(gSAD, waitTime);
			break;
		case "gsad6":
			flag = waitForElementVisibility(gsad6, waitTime);
			break;

		case "access":
			flag = waitForElementVisibility(access, waitTime);
			break;
		case "Gowifi":
			flag = waitForElementVisibility(Gowifi, waitTime);
			break;
		case "imgMobile":
			flag = waitForElementVisibility(imgMobile, waitTime);
			break;
		case "planInclusion":
			flag = waitForElementVisibility(planInclusion, waitTime);
			break;
		case "konsulta":
			flag = waitForElementVisibility(konsulta, waitTime);
			break;
		case "glnusure":
			flag = waitForElementVisibility(glnusure, waitTime);
			break;
		case "addOns":
			flag = waitForElementVisibility(addOns, waitTime);
			break;
		case "myDuo1":
			flag = waitForElementVisibility(myDuo1, waitTime);
			break;	
		case "MySuperduo":
			flag = waitForElementVisibility(MySuperduo, waitTime);
			break;
		case "GSadd":
			flag = waitForElementVisibility(GSadd, waitTime);
			break;
		
		case "aPV":
			flag = waitForElementVisibility(aPV, waitTime);
			break;
		case "oneTimePayment":
			flag = waitForElementVisibility(oneTimePayment, waitTime);
			break;
		case "planapplication1":
			flag = waitForElementVisibility(planapplication1, waitTime);
			break;
		case "advanceMonthly":
			flag = waitForElementVisibility(advanceMonthly, waitTime);
			break;
		case "advanceMonthlyamount":
			flag = waitForElementVisibility(advanceMonthlyamount, waitTime);
			break;
		case "textSimoOnltAllData1":
			flag = waitForElementVisibility(textSimoOnltAllData1, waitTime);
			break;
		case "shipping":
			flag = waitForElementVisibility(shipping, waitTime);
			break;
		case "free":
			flag = waitForElementVisibility(free, waitTime);
			break;
		case "planAmountfirst":
			flag = waitForElementVisibility(planAmountfirst, waitTime);
			break;
		case "totalMonthlyBill":
			flag = waitForElementVisibility(totalMonthlyBill, waitTime);
			break;
		case "totalamountpay":
			flag = waitForElementVisibility(totalamountpay, waitTime);
			break;
		case "PromoIcon":
			flag = waitForElementVisibility(PromoIcon, waitTime);
			break;
		case "promoCode":
			flag = waitForElementVisibility(promoCode, waitTime);
			break;
		case "PromoClickHere":
			flag = waitForElementVisibility(PromoClickHere, waitTime);
			break;
		case "shipicon":
			flag = waitForElementVisibility(shipicon, waitTime);
			break;
		case "shippingAdress":
			flag = waitForElementVisibility(shippingAdress, waitTime);
			break;
		case "changeAdress":
			flag = waitForElementVisibility(changeAdress, waitTime);
			break;
		case "planApplicationcollapsebutton2":
			flag = waitForElementVisibility(planApplicationcollapsebutton2, waitTime);
			break;
		case "monthlyPayment":
			flag = waitForElementVisibility(monthlyPayment, waitTime);
			break;
		case "planaction2":
			flag = waitForElementVisibility(planaction2, waitTime);
			break;
		case "textSimoOnltAllData2":
			flag = waitForElementVisibility(textSimoOnltAllData2, waitTime);
			break;
		case "gPlanSimOnlyAllDataprice599":
			flag = waitForElementVisibility(gPlanSimOnlyAllDataprice599, waitTime);
			break;
		case "addonbox":
			flag = waitForElementVisibility(addonbox, waitTime);
			break;
		case "addons":
			flag = waitForElementVisibility(addons, waitTime);
			break;	
		case "myDuo":
			flag = waitForElementVisibility(myDuo, waitTime);
			break;
		case "amazonprimeVideo":
			flag = waitForElementVisibility(amazonprimeVideo, waitTime);
			break;
		case "totaladdons":
			flag = waitForElementVisibility(totaladdons, waitTime);
			break;
		case "totalMontlybill2":
			flag = waitForElementVisibility(totalMontlybill2, waitTime);
			break;
		case "monthlyservice":
			flag = waitForElementVisibility(monthlyservice, waitTime);
			break;
		case "totalmontlyBillPayment":
			flag = waitForElementVisibility(totalmontlyBillPayment, waitTime);
			break;	
		case "planapplicationcollapse1":
			flag = waitForElementVisibility(planapplicationcollapse1, waitTime);
			break;	
		case "textwithdevice":
			flag = waitForElementVisibility(textwithdevice, waitTime);
			break;
		case "gplangpalnwithdevice599":
			flag = waitForElementVisibility(gplangpalnwithdevice599, waitTime);
			break;
		case "mysuperduo":
			flag = waitForElementVisibility(mysuperduo, waitTime);
			break;
		case "GSADD":
			flag = waitForElementVisibility(GSADD, waitTime);
			break;
		case "TotalMonthlybill2":
			flag = waitForElementVisibility(TotalMonthlybill2, waitTime);
			break;
		case "TotalmonthlyBillPAYment":
			flag = waitForElementVisibility(TotalmonthlyBillPAYment, waitTime);
			break;
		case "gpalnwithhalldata1799":
			flag = waitForElementVisibility(gpalnwithhalldata1799, waitTime);
			break;
		case "gplangpalnwithalldata":
			flag = waitForElementVisibility(gplangpalnwithalldata, waitTime);
			break;
		case "advancempnthlyamount1799":
			flag = waitForElementVisibility(advancempnthlyamount1799, waitTime);
			break;
		case "totalmonthlybill1799":
			flag = waitForElementVisibility(totalmonthlybill1799, waitTime);
			break;
		case "TOTALAMOUNTTOPAY":
			flag = waitForElementVisibility(TOTALAMOUNTTOPAY, waitTime);
			break;
		case "totalmontlyBillPayment2":
			flag = waitForElementVisibility(totalmontlyBillPayment2, waitTime);
			break;
		case "AcquisitionSummary":
			flag = waitForElementVisibility(AcquisitionSummary, waitTime);
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
			//			ExtentTestManager.logInfo(message + " - exists");
			System.out.println(message + " - exists");
		} else {
			//			ExtentTestManager.logFail(message + " - do not exists");
			System.out.println(message + " - do not exist");
		}

		return flag;
	}

	/********************************************************************************************************************************/
	public boolean isClickable(String element, int waitTime) {

		boolean flag = false;

		switch (element) {

		case "PromoClickHere":
			flag = waitForElementClickable(PromoClickHere, waitTime);
			break;
		case "changeAdress":
			flag = waitForElementClickable(changeAdress, waitTime);
			break;
		case "submitOrder":
			flag = waitForElementClickable(submitOrder, waitTime);
			break;
		case "planapplicationcollapse1":
			flag = waitForElementClickable(planapplicationcollapse1, waitTime);
			break;
		case "planApplicationcollapsebutton2":
			flag = waitForElementClickable(planApplicationcollapsebutton2, waitTime);
			break;
		case "planapplication1":
			flag = waitForElementClickable(planapplication1, waitTime);
			break;
		case "addons":
			flag = waitForElementClickable(addons, waitTime);
			break;
		



		}

		return flag;
	}

	/********************************************************************************************************************************/
	public void moveToElement(String element) {

		WebElement ele = null;
		
				switch (element) {
				case "oneTimePayment":
					ele = DriverManager.getDriver().findElement(oneTimePayment);
					break;
				case "monthlyPayment":
					ele = DriverManager.getDriver().findElement(monthlyPayment);
					break;
				case "planapplicationcollapse1":
					ele = DriverManager.getDriver().findElement(planapplicationcollapse1);
					break;
				case "planApplicationcollapsebutton2":
					ele = DriverManager.getDriver().findElement(planApplicationcollapsebutton2);
					break;
				
					
				}

		try {
			Actions a = new Actions(DriverManager.getDriver());
			Thread.sleep(500L);
			a.moveToElement(ele).build().perform();
		} catch (Exception e) {

		}
	}

	/********************************************************************************************************************************/

	/********************************************************************************************************************************/
	public String getURLOfNewTab() {

		String title = "";
		try {
			Set<String> winID = DriverManager.getDriver().getWindowHandles();
			Iterator<String> winItr = winID.iterator();
			String parentID = winItr.next();
			String childID = winItr.next();

			DriverManager.getDriver().switchTo().window(childID);
			title = DriverManager.getDriver().getCurrentUrl();
			DriverManager.getDriver().close();
			DriverManager.getDriver().switchTo().window(parentID);

		} catch (Exception e) {
			System.out.println("FAIL : to get the tab title. Message :" + e.getMessage());
		}
		return title;
	}

	/********************************************************************************************************************************/

	/********************************************************************************************************************************/
	public void write_OrderID_in_PropertiesFile(String key, String data) {
		FileOutputStream fileOut = null;
		FileInputStream fileIn = null;
		try {
			Properties p = new Properties();

			File file = new File(".//OrderID.properties");
			fileIn = new FileInputStream(file);
			p.load(fileIn);
			p.setProperty(key, data);
			fileOut = new FileOutputStream(file);
			p.store(fileOut, null);

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {

			try {
				fileOut.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}

	/********************************************************************************************************************************/
	public void clickOnElement(String type, String eleName, String ele) {

		try {
			switch (ele) {

			case "submitOrder":
				get_submitOrder().click();
				break;
			case "planapplicationcollapse1":
				get_planapplicationcollapse1().click();
				break;
			case "planApplicationcollapsebutton2":
				get_planApplicationcollapsebutton2().click();
				break;
			case "Collapse":
				get_Collapse().click();
				break;
			case "planapplication1":
				get_planapplication1().click();
				break;
			case "addons":
				get_addons().click();
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


}
