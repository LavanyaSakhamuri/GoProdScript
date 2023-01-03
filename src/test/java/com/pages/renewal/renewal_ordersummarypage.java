package com.pages.renewal;

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

import com.pages.renewal.BasePage;

import globeOnline_CommonMethods.DriverManager;

public class renewal_ordersummarypage extends BasePage {

	static File file;

	// public static WebDriverManager.getDriver() DriverManager.getDriver();
	//
	// public LandingPage(WebDriverManager.getDriver() DriverManager.getDriver()) {
	// this.DriverManager.getDriver() = DriverManager.getDriver();
	// }


	By RenewalSummary = By.xpath("//span[text()='Renewal Summary']");
	By buildPlan = By.xpath("//li[text()='Build plan']");
	By fillOut = By.xpath("//li[text()='Fill out']");
	By review = By.xpath("//li[text()='Review']");
	By pay = By.xpath("//li[text()='Pay']");
	By forProcessing = By.xpath("//li[text()='For processing']");
	By GPlannameWithDevice1799 = By.xpath("//span[contains(text(), 'GPlan 1799 with Device')]");
	By GPlannameWithGCash2499 = By.xpath("//span[contains(text(), 'GPlan 2499 with ')]");

	By SelectedPlan = By.xpath("//div[@class='plan-name-heading']");
	By mobileImage = By
			.xpath("//div/img[contains(@src,'/media/catalog/product/i/p/iphone-13-pro-max-silver-front_1.png')]");

	By noticeBlock = By.xpath("//div[@class='go_notice-block']");
	By goIconGoNotice = By.xpath("//span[@class='go_icon go_notice']");
	By goTextPreamble = By.xpath("//p[@class='go_text-preamble-small-semibold']");
	By orderSummary = By.xpath("//span[text()='Order Summary']");
	By gSAD = By.xpath("//span[contains(text(),'GPlan 599 with Device')]");
	
	By access = By.xpath("//span[text()='All-access data']");
	By accessValue = By.xpath("(//div[@class='text16gb'])[1]");
	
	By Gowifi = By.xpath("//span[text()='GoWifi access']");
	By GowifiValue = By.xpath("(//div[@class='text16gb'])[2]");
	
	
	By imgMobile = By.xpath("//div/img[contains(@src,'/assets/files/media/call-and-text.png')]");
	
	By planInclusion = By.xpath("//div[text()='Plan inclusion']");

	By konsulta = By.xpath("//li[text()='Konsulta MD']");
	By glnusure = By.xpath("//li[text()='Glnsure']");
	By addOns = By.xpath("//div[text()='Add-ons']");
	By AddOns=By.xpath("//div[text()=' Add-ons ']");

//		Add ons 	
	By myDuo1 = By.xpath("//li[text()='MyDuo']");
	By aPV = By.xpath("//li[text()='Amazon Prime Video']");
	By Viupremiumaddons = By.xpath("//li[text()='Viu Premium']");
	By Spotifypremium = By.xpath("//li[text()='Spotify Premium']");
	By easyroam = By.xpath("//li[text()='Easy Roam']");
	By Gocallidaddons = By.xpath("//li[text()='GOCALLIDD 199']");
	By GSAddsurf = By.xpath("//li[text()='GS Add Surf 99']");

	By oneTimePayment = By.xpath("//span[text()=' One-time Payment ']");
	
	By MonthlyPayment = By.xpath("//div[text()=' Monthly Payment ']");
	By planRenewal = By.xpath("//div[contains(text(), 'Plan Renewal')]");
	By DeviceCost = By.xpath("//div[@class='fees-type-desc' and text()=' Device cost ']");
	By planRenewalcollapse1 = By.xpath("(//button[@class='accordion-button pre-termination-fee collapsed'])[1]");
	By DeviceCostValue = By.xpath("(//div[@class='amount'])[1]']");

	
	By RenewalProductName = By.xpath("(//div[@class='fees-type-desc bold'])[1]");
	By RenewalProductCost = By.xpath("(//div[@class='amount-section'])[1]");
	

	By GplanWithDeviceName = By.xpath("//div[text()=' GPlan 1799 with Device ']");

	By addons = By.xpath("//div[text()=' Add-ons  ']");
	By myDuo = By.xpath("//div[text()=' MyDuo ']");
	By amazonprimeVideo = By.xpath("//div[@class='fees-type-desc' and text()=' Amazon Prime Video ']");
	By ViuPremium = By.xpath("//div[text()=' Viu Premium ']");
	By SpotifyPremiumaddon = By.xpath("//div[text()=' Spotify Premium ']");
	By EasyRoam = By.xpath("//div[text()=' Easy Roam ']");
	By GOCALLIDD = By.xpath("//div[text()=' GOCALLIDD 199 ']");
	By GSAdd = By.xpath("//div[text()=' GS Add Surf 99 ']");

	By totaladdons = By.xpath("//div[@class='total-label' and text()=' Total add ons ']");
	By totalMontlybill2 = By.xpath("//span[@class='total-amount']");
	By monthlyservice = By.xpath("//div[text()=' Monthly Service fee + add-ons and subcriptions ']");
	By totalmontlyBillPayment = By.xpath("//div[@class='total-amount-to-pay ampount-2']");
	
//	----------------------------------------------------------------------------------------------------------------------

	By shipping = By.xpath("//div[contains(text(), ' Shipping ')]");
	By free = By.xpath("//div[contains(text(),'Free')]");
	By PretermFee=By.xpath("//div[contains(text(),' Preterm fee ')]");
	
	By planAmountfirst = By.xpath("(//span[@class='total-amount'])[1]");
	By totalMonthlyBill = By.xpath("(//span[contains(text(),'Total monthly bill')])[1]");
	
	
	
	By PromoIcon = By.xpath("//div[@class='promocode-icon']");
	By promoCode = By.xpath("//span[contains(text(),'Got a promo code?')]");
	By PromoClickHere = By.xpath("//button[contains(text(), 'Click Here')]");
	
	By shipicon = By.xpath("//div[@class='col-3 ship-icon']");
	By shippingAdress = By.xpath("//span[contains(text(),'Ship to this address')]");
	By changeAdress = By.xpath("//span[contains(text(),'Change address')]");
	By submitOrder = By.xpath("//button[text()=' Submit order ' or @id='payOrder']");

	By monthlyPayment = By.xpath("//div[text()=' Monthly Payment ']");
	By planRenewalcollapseAddons = By.xpath("(//button[@class='accordion-button pre-termination-fee collapsed'])");
			//(//button[@class='accordion-button pre-termination-fee collapsed'])[2]");
	By planRenewalcollapseAddons1=By.xpath("(//button[@class='accordion-button pre-termination-fee collapsed'])[1]");


	By addonbox = By.xpath("//div[@id='onetime-addon-collapse']");



	By Viupremium = By.xpath("//div[text()=' Viu Premium ']");
	By SpotifyPremium = By.xpath("//div[text()=' Spotify Premium ']");
	By Easyroam = By.xpath("//div[text()=' Easy Roam ']");
	By Gocallid = By.xpath("//div[text()=' GOCALLIDD 199 ']");
	By GSADdsurf = By.xpath("//div[text()=' GS Add Surf 99 ']");

	By totaladdonsamount = By.xpath("(//span[@class='total-amount'])[2]");
	By Totalmonthlybillamount = By.xpath("//span[text()='Total monthly bill']");

	By textgcash2 = By.xpath("(//div[ text()=' GPlan SIM-Only All Data 599 '])[2]");
	By gcashamount599 = By.xpath("//div[@class='amount darker' and text()=' â‚± 599.00 ']");
	
	By OBLabel1=By.xpath("//div[contains(text(),' Overdue balance ')]");
	By OBPrice=By.xpath("(//div[contains(@class,'amount') and contains(text(),'₱')])[1]");
	By GPlanWithDevice1499=By.xpath("//span[text()='GPlan 1499 with Device']");

	// ADA2
	By gSAD2 = By.xpath("//div[@class='plan-name-heading']//span");
	By textGplanwithDiv = By.xpath("(//div[ text()=' GPlan 599 with Device '])[1]");

	By textwithdevice = By.xpath("(//div[ text()=' GPlan 599 with Device '])[2]");
	By gplangpalnwithdevice599 = By.xpath("//div[@class='device-plan-amount darker' and text()=' â‚± 599.00 ']");
	By mysuperduo = By.xpath("//div[text()=' MySuperDuo ']");
	By GSADD = By.xpath("//div[text()=' GS Add Surf 99 ']");
	By TotalMonthlybill2 = By.xpath("//span[@class='total-amount' and text()=' â‚± 848.00']");
	By TotalmonthlyBillPAYment = By.xpath("//span[text()='â‚± 1,447.00']");
	// ADA6
	By gsad6 = By.xpath("//div[@class='plan-name-heading']/span");

	By gpalnwithhalldata1799 = By.xpath("//div[contains(text(),' GPlan All Data 1799  ')]");
	By gplangpalnwithalldata = By.xpath("(//div[contains(text(),' GPlan All Data 1799  ')])[2]");
	By totalmontlyBillPayment2 = By.xpath("//span[text()='â‚± 1,799.00']");

	// common for all
	By advancempnthlyamount1799 = By.xpath("//div[@class='amount-section']/div");

	By totalmonthlybill1799 = By.xpath("//div[@class='total-section']/span");
	By TOTALAMOUNTTOPAY = By.xpath("//div[@class='total-amount-to-pay ampount-2']/span");

	By MySuperduo = By.xpath("//li[text()='MySuperDuo']");
	By GSadd = By.xpath("//li[text()='GS Add Surf 99']");

	/********************************************************************************************************************************/
	public WebElement get_submitOrder() {
		return DriverManager.getDriver().findElement(submitOrder);
	}
	public WebElement get_RenewalSummary() {
		return DriverManager.getDriver().findElement(RenewalSummary);
	}
	
	public WebElement get_buildPlan() {
		return DriverManager.getDriver().findElement(buildPlan);
	}
	public WebElement get_fillOut() {
		return DriverManager.getDriver().findElement(fillOut);
	}
	public WebElement get_review() {
		return DriverManager.getDriver().findElement(review);
	}
	public WebElement get_pay() {
		return DriverManager.getDriver().findElement(pay);
	}
	public WebElement get_forProcessing() {
		return DriverManager.getDriver().findElement(forProcessing);
	}    
	public WebElement get_SelectedPlan() {
		return DriverManager.getDriver().findElement(SelectedPlan);
	}
	public WebElement get_mobileImage() {
		return DriverManager.getDriver().findElement(mobileImage);
	}
	public WebElement get_access() {
		return DriverManager.getDriver().findElement(access);
	}
	public WebElement get_accessValue() {
		return DriverManager.getDriver().findElement(accessValue);
	}
	public WebElement get_Gowifi() {
		return DriverManager.getDriver().findElement(Gowifi);
	}
	public WebElement get_GowifiValue() {
		return DriverManager.getDriver().findElement(GowifiValue);
	}
	public WebElement get_planInclusion() {
		return DriverManager.getDriver().findElement(planInclusion);
	}
	public WebElement get_konsulta() {
		return DriverManager.getDriver().findElement(konsulta);
	}
	public WebElement get_glnusure() {
		return DriverManager.getDriver().findElement(glnusure);
	}
	public WebElement get_addOns() {
		return DriverManager.getDriver().findElement(addOns);
	}
	public WebElement get_aPV() {
		return DriverManager.getDriver().findElement(aPV);
	}
	public WebElement get_Viupremiumaddons() {
		return DriverManager.getDriver().findElement(Viupremiumaddons);
	}
	public WebElement get_Spotifypremium() {
		return DriverManager.getDriver().findElement(Spotifypremium);
	}
	public WebElement get_easyroam() {
		return DriverManager.getDriver().findElement(easyroam);
	}
	public WebElement get_Gocallidaddons() {
		return DriverManager.getDriver().findElement(Gocallidaddons);
	}
	public WebElement get_GSAddsurf() {
		return DriverManager.getDriver().findElement(GSAddsurf);
	}
	
	public WebElement get_MonthlyPayment() {
		return DriverManager.getDriver().findElement(MonthlyPayment);
	}
	public WebElement get_planRenewal() {
		return DriverManager.getDriver().findElement(planRenewal);
	} 
	public WebElement get_planRenewalcollapse1() {
		return DriverManager.getDriver().findElement(planRenewalcollapse1);
	} 
	
	public WebElement get_RenewalProductName() {
		return DriverManager.getDriver().findElement(RenewalProductName);
	} 
	public WebElement get_RenewalProductCost() {
		return DriverManager.getDriver().findElement(RenewalProductCost);
	} 
	
	public WebElement get_addons() {
		return DriverManager.getDriver().findElement(addons);
	}
	public WebElement get_myDuo() {
		return DriverManager.getDriver().findElement(myDuo);
	}
	
	public WebElement get_amazonprimeVideo() {
		return DriverManager.getDriver().findElement(amazonprimeVideo);
	}
	public WebElement get_ViuPremium() {
		return DriverManager.getDriver().findElement(ViuPremium);
	}
	public WebElement get_SpotifyPremiumaddon() {
		return DriverManager.getDriver().findElement(SpotifyPremiumaddon);
	}
	public WebElement get_EasyRoam() {
		return DriverManager.getDriver().findElement(EasyRoam);
	}
	public WebElement get_GOCALLIDD() {
		return DriverManager.getDriver().findElement(GOCALLIDD);
	}
	public WebElement get_GSAdd() {
		return DriverManager.getDriver().findElement(GSAdd);
	}
	public WebElement get_totaladdons() {
		return DriverManager.getDriver().findElement(totaladdons);
	}
	
	
	public WebElement get_totalMontlybill2() {
		return DriverManager.getDriver().findElement(totalMontlybill2);
	}
	public WebElement get_monthlyservice() {
		return DriverManager.getDriver().findElement(monthlyservice);
	}
	public WebElement get_totalmontlyBillPayment() {
		return DriverManager.getDriver().findElement(totalmontlyBillPayment);
	}
	
	public WebElement get_DeviceCostValue() {
		return DriverManager.getDriver().findElement(DeviceCostValue);
	}
	

	public WebElement get_planRenewalcollapseAddons() {
		return DriverManager.getDriver().findElement(planRenewalcollapseAddons);
	}

	public WebElement get_changeAddress() {
		return DriverManager.getDriver().findElement(changeAdress);
	}

	// =========== RONNIE SCRIPT STARTS HERE =============
	public void js_clickOnElement(String type, String eleName, String ele) {

		try {
			JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();

			switch (ele) {
			case "submitOrder":
				js.executeScript("arguments[0].click();", get_submitOrder());
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

	// =========== RONNIE SCRIPT ENDS HERE =============
	/********************************************************************************************************************************/

	public boolean isElementExist(String message, String element, int waitTime) {

		boolean flag = false;
		switch (element) {
		
		case "OBPrice":
			flag = waitForElementVisibility(OBPrice, waitTime);
			break;
		case "GPlanWithDevice1499":
			flag = waitForElementVisibility(GPlanWithDevice1499, waitTime);
			break;
		case "OBLabel1":
			flag = waitForElementVisibility(OBLabel1, waitTime);
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
		case "GPlannameWithDevice1799":
			flag = waitForElementVisibility(GPlannameWithDevice1799, waitTime);
			break;
		case "SelectedPlan":
			flag = waitForElementVisibility(SelectedPlan, waitTime);
			break;
			
		case "GPlannameWithGCash2499":
			flag = waitForElementVisibility(GPlannameWithGCash2499, waitTime);
			break;
			
		case "mobileImage":
			flag = waitForElementVisibility(mobileImage, waitTime);
			break;
		case "GplanWithDeviceName":
			flag = waitForElementVisibility(GplanWithDeviceName, waitTime);
			break;
		case "Viupremium":
			flag = waitForElementVisibility(Viupremium, waitTime);
			break;
		case "SpotifyPremium":
			flag = waitForElementVisibility(SpotifyPremium, waitTime);
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

		case "RenewalSummary":
			flag = waitForElementVisibility(RenewalSummary, waitTime);
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
		case "AddOns":
			flag = waitForElementVisibility(AddOns, waitTime);
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
		case "MonthlyPayment":
			flag = waitForElementVisibility(MonthlyPayment, waitTime);
			break;		
		case "planRenewal":
			flag = waitForElementVisibility(planRenewal, waitTime);
			break;
		case "RenewalProductName":
			flag = waitForElementVisibility(RenewalProductName, waitTime);
			break;
			
			
		case "DeviceCost":
			flag = waitForElementVisibility(DeviceCost, waitTime);
			break;
		case "DeviceCostValue":
			flag = waitForElementVisibility(DeviceCostValue, waitTime);
			break;
		case "shipping":
			flag = waitForElementVisibility(shipping, waitTime);
			break;
		case "free":
			flag = waitForElementVisibility(free, waitTime);
			break;
		case "PretermFee":
			flag = waitForElementVisibility(PretermFee, waitTime);
			break;
			
		case "planAmountfirst":
			flag = waitForElementVisibility(planAmountfirst, waitTime);
			break;
		case "totalMonthlyBill":
			flag = waitForElementVisibility(totalMonthlyBill, waitTime);
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
		case "submitOrder":
			flag = waitForElementVisibility(submitOrder, waitTime);
			break;
		case "planRenewalcollapseAddons":
			flag = waitForElementVisibility(planRenewalcollapseAddons, waitTime);
			break;
		case "monthlyPayment":
			flag = waitForElementVisibility(monthlyPayment, waitTime);
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
		case "ViuPremium":
			flag = waitForElementVisibility(ViuPremium, waitTime);
			break;
		case "SpotifyPremiumaddon":
			flag = waitForElementVisibility(SpotifyPremiumaddon, waitTime);
			break;
		case "EasyRoam":
			flag = waitForElementVisibility(EasyRoam, waitTime);
			break;
		case "GOCALLIDD":
			flag = waitForElementVisibility(GOCALLIDD, waitTime);
			break;
		case "GSAdd":
			flag = waitForElementVisibility(GSAdd, waitTime);
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
		case "planRenewalcollapse1":
			flag = waitForElementVisibility(planRenewalcollapse1, waitTime);
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

		}

		if (flag) {
			// ExtentTestManager.logInfo(message + " - exists");
			System.out.println(message + " - exists");
		} else {
			// ExtentTestManager.logFail(message + " - do not exists");
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
		case "planRenewalcollapse1":
			flag = waitForElementClickable(planRenewalcollapse1, waitTime);
			break;
		case "planRenewalcollapseAddons1":
			flag = waitForElementClickable(planRenewalcollapseAddons1, waitTime);
			break;
			
		case "planRenewalcollapseAddons":
			flag = waitForElementClickable(planRenewalcollapseAddons, waitTime);
			break;
		case "planRenewal":
			flag = waitForElementClickable(planRenewal, waitTime);
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
		case "planRenewalcollapse1":
			ele = DriverManager.getDriver().findElement(planRenewalcollapse1);
			break;
		case "planRenewalcollapseAddons":
			ele = DriverManager.getDriver().findElement(planRenewalcollapseAddons);
			break;
		case "changeAdress":
			ele = DriverManager.getDriver().findElement(changeAdress);
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
			case "planRenewalcollapse1":
				get_planRenewalcollapse1().click();
				break;
			case "planRenewalcollapseAddons":
				get_planRenewalcollapseAddons().click();
				break;
			case "planRenewal":
				get_planRenewal().click();
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
