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

public class ADAPayment_Page extends BasePage {

	static File file;

//	public static WebDriverManager.getDriver() DriverManager.getDriver();
//
//	public LandingPage(WebDriverManager.getDriver() DriverManager.getDriver()) {
//		this.DriverManager.getDriver() = DriverManager.getDriver();
//	}
	By PlannameSim999 = By.xpath("//span[contains(text(), 'GPlan Plus SIM-Only 999 ')]");
	By OBLabel = By.xpath("//div[contains(text(), 'Overdue Balance')]");
	By OBPrice = By.xpath("(//div[@class='fees-structure ng-star-inserted'])[1]//div[@class='amount ng-star-inserted']");
	By PlanAppSimOnlyName = By.xpath("(//div[contains(text(), 'GPlan Plus SIM-Only 999')])[1]");
	By MonthlyPaySimOnlyName = By.xpath("(//div[contains(text(), 'GPlan Plus SIM-Only 999')])[2]");
	By MonthlyPaySpiel = By.xpath("//div[contains(text(), ' No need to pay this today! This will be charged to your first bill. ')]");
	By MonthlyPay_PlanPrice = By.xpath("//div[@class='device-plan-amount darker']");

	
	By Selectpaymentmethod = By.xpath("//span[contains(text(),'Select payment method')]");
	By PayReminder = By.xpath("//p[contains(text(), 'We’ll only collect payment when your application is approved. Amount subject to change.')]");
	
	By Gcash = By.xpath("//div[contains(text(),' GCash ')]");
	By CCStraightpayment = By.xpath("//div[contains(text(),' Credit Card (Straight Payment) ')]");
	By CCHSBC = By.xpath("//div[contains(text(),' Credit card (Installment For HSBC) ')]");
			//div[contains(text(),' Credit Card (Installment For HSBC) ')]");
	By CCBPI = By.xpath("//div[contains(text(),' Credit card (Installment For BPI) ')]");//preprod
			//div[contains(text(),' Credit Card (Installment For BPI) ')]");
	By COD = By.xpath("//div[contains(text(),' Cash On Delivery ')]");
	By COD_Statment = By.xpath("//div[@class='heading']");
	
	By Onetimepayment = By.xpath("//span[@class='one-time-payment']");
	By planApplicationHeader = By.xpath("//div[contains(text(),'Plan application')]");
	By Colapsebutton1 = By.xpath("(//button[@class='accordion-button pre-termination-fee collapsed'])[1]");
	By Planname = By.xpath("//div[@class='plan-name ng-star-inserted']");
	By Planamount = By.xpath("//div[@class='amount bold ng-star-inserted']");
	By TotalAmountHeader = By.xpath("//span[contains(text(),'Total amount')]");
	By TotalAmount = By.xpath("(//div[@class='total-amount-to-pay ampount-2'])[1]");
	By Gotapromocodeheader = By.xpath("//span[contains(text(),'Got a promo code?')]");
	By PromoClickhere = By.xpath("//button[contains(text(),' Click Here ')]");
	By ShiptothisaddressHeader = By.xpath("//span[contains(text(),'Ship to this address')]");	
	By Submitbutton = By.xpath("//button[contains(text(),' Submit order ')]");
	By Monthlypayment = By.xpath("//div[contains(text(),' Monthly Payment ')]");
	By Noneedtopaythistoday = By.xpath("//div[contains(text(),' No need to pay this today! This will be charged to your first bill. ')]");
	By Planname1 = By.xpath("(//div[@class='bold fees-type-desc'])[2]");
	By Addons = By.xpath("//div[contains(text(),' Add-ons ')]");
	By Colapsebutton2 = By.xpath("(//button[@class='accordion-button pre-termination-fee collapsed'])[2]");
	//(//button[@class='accordion-button pre-termination-fee collapsed'])[2]
	By TotalMonthlybill = By.xpath("//div[@class='total-monthly-amount']");
	By MonthlysvcplusAddons = By.xpath("//div[contains(text(),'Monthly Service fee + add-ons and subcriptions')]");
	By Tptalmonthlyamount = By.xpath("(//div[@class='total-amount-to-pay ampount-2'])[2]");
	
	By myDuo = By.xpath("//div[contains(text(),'//div[contains(text(),'MyDuo')]')]");
	
	By mysuperduo=By.xpath("//div[text()='MySuperDuo']");
	By GSADD=By.xpath("//div[text()='GS Add Surf 99']");
	
	By AmazonPrime = By.xpath("//div[contains(text(),'Amazon Prime Video')]");
	//Gcash
	
	
		By Plannamegcash = By.xpath("//div[@class='plan-name ng-star-inserted']");
		By Planamountgcash = By.xpath("(//div[@class='amount bold ng-star-inserted'])[1]");
		By Totalamountpay1 = By.xpath("(//div[@class='total-amount-to-pay ampount-2'])[1]");
		
		By Planamountgcash2 = By.xpath("(//div[@class='amount bold'])");
		By Plannamegcash2 = By.xpath("(//div[@class='bold fees-type-desc'])[2]");
		
		By Viupremium = By.xpath("//div[contains(text(),'Viu Premium')]");
		By Spotifypremium = By.xpath("//div[contains(text(),'Spotify Premium')]");
		By EasyRoam = By.xpath("//div[contains(text(),'Easy Roam')]");
		By Gocallid = By.xpath("//div[contains(text(),'GOCALLIDD 199')]");
		By Gsaddsurf = By.xpath("//div[contains(text(),'GS Add Surf 99')]");
		
		By Totalamount = By.xpath("(//div[@class='total-amount-to-pay ampount-2'])[2]");
		By Totalamountheader = By.xpath("(//div[@class='total-monthly-amount'])");
	//Gplan With device
		By Gplanwithdevice1799 = By.xpath("//div[contains(text(),' GPlan 1799 with Device')])[1]");
		
		
		By AcquisitionPay = By.xpath("//h1[text()=' Acquisition - Pay ']");
		By WelCollectPayment = By.xpath("//p[text()='We’ll only collect payment when your application is approved. Amount subject to change.']");
		By SelectPaymentMethod = By.xpath("//span[text()='Select payment method']");
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
		By Total_Amount = By.xpath("//span[text()='Total amount']//following::span[1]");
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
		public WebElement get_CCBPI() {
			return DriverManager.getDriver().findElement(CCBPI);
		}		
	/********************************************************************************************************************************/
	public WebElement get_CCStraightpayment() {
		return DriverManager.getDriver().findElement(CCStraightpayment);
	}
	/********************************************************************************************************/
	public WebElement get_Gcash()
	{
		return DriverManager.getDriver().findElement(Gcash);
		
	}
	/********************************************************************************************************************************/
	public WebElement get_COD() {
		return DriverManager.getDriver().findElement(COD);
	}
	/********************************************************************************************************************************/
	public WebElement get_Colapsebutton1() {
		return DriverManager.getDriver().findElement(Colapsebutton1);
	}
	/********************************************************************************************************************************/
	public WebElement get_Submitbutton() {
		return DriverManager.getDriver().findElement(Submitbutton);
	}
	/********************************************************************************************************************************/
	public WebElement get_Colapsebutton2() {
		return DriverManager.getDriver().findElement(Colapsebutton2);
	}
	public WebElement get_Addons()
	{
		return DriverManager.getDriver().findElement(Addons);
	}
	//FTA4
	public WebElement get_CCHSBC() {
		return DriverManager.getDriver().findElement(CCHSBC);
	}
	//FTA5
	public WebElement get_ccBPI()
	{
		return DriverManager.getDriver().findElement(CCBPI);
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
	public WebElement get_Total_Amount() {
		return DriverManager.getDriver().findElement(Total_Amount);
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
	
	
	
	/********************************************************************************************************************************/

	public boolean isElementExist(String message, String element, int waitTime) {
		boolean flag = false;

		switch (element) {
		case "Gplanwithdevice1799":
			flag = waitForElementVisibility(Gplanwithdevice1799, waitTime);
			break;
		case "PayReminder":
			flag = waitForElementVisibility(PayReminder, waitTime);
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

		case "Plannamegcash":
			flag = waitForElementVisibility(Plannamegcash, waitTime);
			break;
		case "Planamountgcash":
			flag = waitForElementVisibility(Planamountgcash, waitTime);
			break;
		case "Totalamountpay1":
			flag = waitForElementVisibility(Totalamountpay1, waitTime);
			break;
		case "Planamountgcash2":
			flag = waitForElementVisibility(Planamountgcash2, waitTime);
			break;
		case "Plannamegcash2":
			flag = waitForElementVisibility(Plannamegcash2, waitTime);
			break;
		case "Viupremium":
			flag = waitForElementVisibility(Viupremium, waitTime);
			break;
		case "Spotifypremium":
			flag = waitForElementVisibility(Spotifypremium, waitTime);
			break;
		case "EasyRoam":
			flag = waitForElementVisibility(EasyRoam, waitTime);
			break;
		case "Gocallid":
			flag = waitForElementVisibility(Gocallid, waitTime);
			break;
		case "Gsaddsurf":
			flag = waitForElementVisibility(Gsaddsurf, waitTime);
			break;
		case "Totalamount":
			flag = waitForElementVisibility(Totalamount, waitTime);
			break;
		case "Totalamountheader":
			flag = waitForElementVisibility(Totalamountheader, waitTime);
			break;
		case "Selectpaymentmethod":
			flag = waitForElementVisibility(Selectpaymentmethod, waitTime);
			break;
		case "CCStraightpayment":
			flag = waitForElementVisibility(CCStraightpayment, waitTime);
			break;
		case "CCHSBC":
			flag = waitForElementVisibility(CCHSBC, waitTime);
			break;
		case "CCBPI":
			flag = waitForElementVisibility(CCBPI, waitTime);
			break;
		case "COD":
			flag = waitForElementVisibility(COD, waitTime);
			break;
		case "COD_Statment":
			flag = waitForElementVisibility(COD_Statment, waitTime);
			break;
		case "Onetimepayment":
			flag = waitForElementVisibility(Onetimepayment, waitTime);
			break;
		case "planApplicationHeader":
			flag = waitForElementVisibility(planApplicationHeader, waitTime);
			break;
		case "Colapsebutton1":
			flag = waitForElementVisibility(Colapsebutton1, waitTime);
			break;
		case "Planname":
			flag = waitForElementVisibility(Planname, waitTime);
			break;
		case "Planamount":
			flag = waitForElementVisibility(Planamount, waitTime);
			break;
		case "TotalAmountHeader":
			flag = waitForElementVisibility(TotalAmountHeader, waitTime);
			break;
		case "Total_Amount":
			flag = waitForElementVisibility(Total_Amount, waitTime);
			break;
		case "Gotapromocodeheader":
			flag = waitForElementVisibility(Gotapromocodeheader, waitTime);
			break;
		case "PromoClickhere":
			flag = waitForElementVisibility(PromoClickhere, waitTime);
			break;
		case "ShiptothisaddressHeader":
			flag = waitForElementVisibility(ShiptothisaddressHeader, waitTime);
			break;
		case "Submitbutton":
			flag = waitForElementVisibility(Submitbutton, waitTime);
			break;
		case "Monthlypayment":
			flag = waitForElementVisibility(Monthlypayment, waitTime);
			break;
		case "Noneedtopaythistoday":
			flag = waitForElementVisibility(Noneedtopaythistoday, waitTime);
			break;
		case "Planname1":
			flag = waitForElementVisibility(Planname1, waitTime);
			break;
		case "Addons":
			flag = waitForElementVisibility(Addons, waitTime);
			break;
		case "Colapsebutton2":
			flag = waitForElementVisibility(Colapsebutton2, waitTime);
			break;
		case "TotalMonthlybill":
			flag = waitForElementVisibility(TotalMonthlybill, waitTime);
			break;
		case "MonthlysvcplusAddons":
			flag = waitForElementVisibility(MonthlysvcplusAddons, waitTime);
			break;
		case "Tptalmonthlyamount":
			flag = waitForElementVisibility(Tptalmonthlyamount, waitTime);
			break;
		case "myDuo":
			flag = waitForElementVisibility(myDuo, waitTime);
			break;	
		case "AmazonPrime":
			flag = waitForElementVisibility(AmazonPrime, waitTime);
			break;
		case "mysuperduo":
			flag = waitForElementVisibility(mysuperduo, waitTime);
			break;
		case "GSADD":
			flag = waitForElementVisibility(GSADD, waitTime);
			break;
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
	
		case "Submitbutton":
			flag = waitForElementClickable(Submitbutton, waitTime);
			break;
		case "Addons":
			flag = waitForElementClickable(Addons, waitTime);
			break;
		
			
		

		}

		return flag;
	}
	/********************************************************************************************************************************/
	public void moveToElement(String element) {

		WebElement ele = null;

		switch (element) {
		case "Colapsebutton1":
			ele = DriverManager.getDriver().findElement(Colapsebutton1);
			break;
		case "Colapsebutton2":
			ele = DriverManager.getDriver().findElement(Colapsebutton2);
			break;
		case "Onetimepayment":
			ele = DriverManager.getDriver().findElement(Onetimepayment);
			break;
		case "TotalMonthlybill":
			ele = DriverManager.getDriver().findElement(TotalMonthlybill);
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
	public void scroll_vertical(int y_Axis) {
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("window.scrollBy(0," + y_Axis + ")", "");
	}
	
	//=========== RONNIE SCRIPT STARTS HERE =============
	public void js_clickOnElement(String type, String eleName, String ele) {

		try {
			JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
            
			
			switch (ele) {
			case "COD":
				js.executeScript("arguments[0].click();", get_COD());
				break;
			case "Gcash":
				js.executeScript("arguments[0].click();", get_Gcash());
				break;			
			case "Colapsebutton1":
				js.executeScript("arguments[0].click();", get_Colapsebutton1());
				break;
			case "Submitbutton":
				js.executeScript("arguments[0].click();", get_Submitbutton());
				break;
			case "Colapsebutton2":
				js.executeScript("arguments[0].click();", get_Colapsebutton2());
				break;
			case "CCStraightpayment":
				js.executeScript("arguments[0].click();", get_CCStraightpayment());
				break;
			case "CCHSBC":
				js.executeScript("arguments[0].click();", get_CCHSBC());
				break;
			case "CCBPI":
				js.executeScript("arguments[0].click();", get_ccBPI());
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
	public void clickOnElement(String type, String eleName, String ele) {

		try {
			switch (ele) {
			
	
			case "COD":
				get_COD().click();
				break;
			case "Gcash":
				get_Gcash().click();
				break;
				
			case "Colapsebutton1":
				get_Colapsebutton1().click();
				break;
			case "Submitbutton":
				get_Submitbutton().click();
				break;
			case "Addons":
				get_Addons().click();
				break;
			
			case "Colapsebutton2":
				get_Colapsebutton2().click();
				break;
			case "CCStraightpayment":
				get_CCStraightpayment().click();
				break;
			case "CCHSBC":
				get_CCHSBC().click();
				break;
			case "CCBPI":
				get_ccBPI().click();
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