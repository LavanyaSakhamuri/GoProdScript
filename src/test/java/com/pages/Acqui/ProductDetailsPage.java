package com.pages.Acqui;

import java.util.List;

import java.util.NoSuchElementException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.pages.Acqui.BasePage;

import globeOnline_CommonMethods.DriverManager;

public class ProductDetailsPage extends BasePage {
	
	By productGallery = By.xpath("//li[text()='Product Gallery']");
	By productDetails = By.xpath("//li[text()='Product Details']");
	By deviceNameinPDPage = By.xpath("//div[@class='go_text-h1']");
	By color_Finish = By.xpath("//span[text()='Color/Finish']//following-sibling::div//label");
	By capacity = By.xpath("//span[text()='Capacity']//following::span[1]");
	By contractDuration = By.xpath("//span[text()='Contract duration']//following::span[1]");
	By cashoutAmount = By.xpath("//span[text()='Cashout Amount']//following-sibling::span");
	By forReservationTag = By.xpath("//span[text()='For reservation']");
	By note = By.xpath("//span[contains(text(),'Note:')]");
	By wantToknowAboutGplans = By.xpath("//div[text()='Want to know more about our new GPlans?']");
	By discoverGplanBelow = By.xpath("//span[text()='Discover GPlans below.']");
	By planCard = By.xpath("//div[@class='go_carousel-list-wrapper go_no-overflow']");
	By applyWithThisDevice = By.xpath("//button[text()=' Apply with this device ']");
	By selectAnotherDevice = By.xpath("//span[text()='Select another device']");
	By features = By.xpath("//a[text()='Features']");
	By promos = By.xpath("//a[text()='Promos']");
	By faqText1 = By.xpath("(//div[@class='item-text'])[1]");
	By faqText2 = By.xpath("(//div[@class='item-text'])[2]");
	By faqText3 = By.xpath("(//div[@class='item-text'])[3]");
	By faqText4 = By.xpath("(//div[@class='item-text'])[4]");
	By faqText5 = By.xpath("(//div[@class='item-text'])[5]");
	By faqText6 = By.xpath("(//div[@class='item-text'])[6]");
	By buildMyPlan = By.xpath("//div[text()=' Build my plan ']");
	
	/**************************************Main PDP Page****************************************************/
	By customizeYourplanText = By.xpath("//h1[contains(text(), ' Customize your GPlan')]");
	By PDP_Device = By.xpath("//button[contains(text(),' Device ')]");
	By PDP_Gcash = By.xpath("//button[contains(text(),' GCash ')]");
	By PDP_Simonly = By.xpath("//button[contains(text(),' Sim-Only ')]");
	By PDP_Alldata = By.xpath("//button[contains(text(),' All-Data ')]");
	By PlanCard = By.xpath("//div[@class='plan-card-list']");
	By Devicecarousel = By.xpath("//div[@class='pb-md-owl-carousel-wrapper ng-star-inserted']");
	By ViewAllDevicesLinkInPdPage = By.xpath("(//a[text()='View all devices'])[1]");
	By color_Finish1 = By.xpath("//span[text()='Color or Finish']");
	By Diff_Colors = By.xpath("//input[@name='inlineRadioOptions']");
	By capacity1 = By.xpath("//span[text()='Capacity']//following::div[4]//span");
	By contractDuration1 = By.xpath("//span[text()='Contract duration']//following::div[3]//span");
	By Preper_esim_PhysicalSim = By.xpath("//div[text()=' Prefer e-SIM or a physical SIM card? ']");
	By esim = By.xpath("//span[text()='e-SIM']//parent::label//input");
	By physicalSim = By.xpath("//span[text()='Physical SIM card']//parent::label//input");


	
	//Addons
	By DoYouUseLotsOfData = By.xpath("//div[contains(text(),' Do you use lots of data? ')]");
	By Data_checkbox = By.xpath("(//span[@class='slider round'])[1]");
	By GSAddsurf99 = By.xpath("//div[contains(text(),' GS Add Surf 99')]");
	
	By DoYouLoveWatchingShowsAndMovies = By.xpath("//div[contains(text(),' Do you love watching shows and movies? ')]");
	By movie_checkbox = By.xpath("(//span[@class='slider round'])[2]");
	By Amazonprime = By.xpath("//div[contains(text(),' Amazon Prime Video ')]");
	By Viupremium = By.xpath("//div[contains(text(),' Viu Premium ')]");
	By Spotifypremium = By.xpath("//div[contains(text(),' Spotify Premium ')]");
	
	By PreferTalkingOverMessaging = By.xpath("//div[contains(text(),' Prefer talking over messaging? ')]");
	By message_checkbox = By.xpath("(//span[@class='slider round'])[3]");
	By MyDuo = By.xpath("//div[contains(text(),' MyDuo')]");
	By MySuperDuo = By.xpath("//div[contains(text(),' MySuperDuo')]");
	
	By AreYouAllAboutTheJetSettingLifestyle = By.xpath("//div[contains(text(),' Are you all about the jet-setting lifestyle? ')]");
	By lifestyle_checkbox = By.xpath("(//span[@class='slider round'])[4]");
	By easyRoam = By.xpath("//div[contains(text(),' Easy Roam')]");
	By Gocallid199 = By.xpath("//div[contains(text(),' GOCALLIDD 199')]");
	
	
	
	//Review My plan details
	By ReviewMyPlan = By.xpath("//div[text()='Review my plan']");
    By DeviceNameInReviewMyPlan = By.xpath("(//div[@class='go_device-info go_plan-builder-sticky']//span)[1]");
	By DeviceCapacityInReview = By.xpath("(//div[@class='go_device-info go_plan-builder-sticky']//span)[3]");
	By ContactDerationInReview = By.xpath("(//span[text()='Contract Duration:']//following::strong)[1]");
	
	By All_access_data = By.xpath("//span[text()='All-access data ']//following::span[1]");
	By GoWifi_access = By.xpath("//span[text()=' GoWifi access ']//following::span[1]");
	
	By Unli_All_net = By.xpath("//span[text()=' Call and text ']//following::span[1]");
	By Plan_inclusions = By.xpath("//span[text()='Plan inclusions']");
	By Konsulta_Sub = By.xpath("//li[text()=' Konsulta MD Free personal subscription']");
	By Glnsure_Sub = By.xpath("//li[text()=' Glnsure 3-months subscription']");
	
	By gplan_withDevice = By.xpath("//div[@class='go_plan-breakdown-row go_plan-type']//strong");
	By Subscriptions_Addons = By.xpath("//span[text()='Subscriptions and Add‑ons']");
	By My_Super_Duo = By.xpath("//div[text()='MySuperDuo']//following::span[1]");
	By Amazon_Prime_Video = By.xpath("//div[text()='Amazon Prime Video']//following::span[1]");
	By Viu_Premium = By.xpath("//div[text()='Viu Premium']//following::span[1]");
	By Spotify_Premium = By.xpath("//div[text()='Spotify Premium']//following::span[1]");
	By GOCALLIDD_199 = By.xpath("//div[text()='GOCALLIDD 199']//following::span[1]");
	By Easy_Roam = By.xpath("//div[text()='Easy Roam']//following::span[1]");
	By GS_Add_Surf_99 = By.xpath("//div[text()='GS Add Surf 99']//following::span[1]");
	
	By Total_subscriptions_and_addons = By.xpath("//strong[contains(text(), 'Total subscriptions and')]//following::span[1]");
	By MonthlyBill_subscriptions_and_addons = By.xpath("//strong[contains(text(), 'Monthly bill, subscriptions, and')]//following::span[1]");
	By Monthly_Payment = By.xpath("(//span[text()='Monthly payment'])[2]//following::strong[1]");
	By OneTimeDevice_Cashout = By.xpath("//span[text()='One-time device cost']//following::strong");
	
	By Mobilenumfield = By.xpath("//input[@id='go_plan-breakdown-number']");
    By Proceedbtn = By.xpath("(//button[contains(text(),'Proceed')])[1]");
    
    
    //Plan Breakdown page
    By Mobile_Number = By.xpath("//div[@class='go_mobile-display']//span");
    By ProceedWithMyPlanButton = By.xpath("//button[contains(text(),'Proceed with my plan')]");


    





	/********************************************************************************************************************************/
	public WebElement get_productDetails() {
		return DriverManager.getDriver().findElement(productDetails);
	}

	/********************************************************************************************************************************/
	public WebElement get_productGallery() {
		return DriverManager.getDriver().findElement(productGallery);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_discoverGplanBelow() {
		return DriverManager.getDriver().findElement(discoverGplanBelow);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_applyWithThisDevice() {
		return DriverManager.getDriver().findElement(applyWithThisDevice);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_selectAnotherDevice() {
		return DriverManager.getDriver().findElement(selectAnotherDevice);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_deviceNameinPDPage() {
		return DriverManager.getDriver().findElement(deviceNameinPDPage);
	}
	
	/********************************************************************************************************************************/
	public List<WebElement> get_color_Finish() {
		return DriverManager.getDriver().findElements(color_Finish);
	}
	
	/********************************************************************************************************************************/
	public List<WebElement> get_Diff_Colors() {
		return DriverManager.getDriver().findElements(Diff_Colors);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_capacity() {
		return DriverManager.getDriver().findElement(capacity);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_contractDuration() {
		return DriverManager.getDriver().findElement(contractDuration);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_color_Finish1() {
		return DriverManager.getDriver().findElement(color_Finish1);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_capacity1() {
		return DriverManager.getDriver().findElement(capacity1);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_contractDuration1() {
		return DriverManager.getDriver().findElement(contractDuration1);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_ViewAllDevicesLinkInPdPage() {
		return DriverManager.getDriver().findElement(ViewAllDevicesLinkInPdPage);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_Data_checkbox() {
		return DriverManager.getDriver().findElement(Data_checkbox);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_GSAddsurf99() {
		return DriverManager.getDriver().findElement(GSAddsurf99);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_movie_checkbox() {
		return DriverManager.getDriver().findElement(movie_checkbox);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_message_checkbox() {
		return DriverManager.getDriver().findElement(message_checkbox);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_lifestyle_checkbox() {
		return DriverManager.getDriver().findElement(lifestyle_checkbox);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_Amazonprime() {
		return DriverManager.getDriver().findElement(Amazonprime);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_Viupremium() {
		return DriverManager.getDriver().findElement(Viupremium);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_Spotifypremium() {
		return DriverManager.getDriver().findElement(Spotifypremium);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_MyDuo() {
		return DriverManager.getDriver().findElement(MyDuo);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_MySuperDuo() {
		return DriverManager.getDriver().findElement(MySuperDuo);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_easyRoam() {
		return DriverManager.getDriver().findElement(easyRoam);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_Gocallid199() {
		return DriverManager.getDriver().findElement(Gocallid199);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_ReviewMyPlan() {
		return DriverManager.getDriver().findElement(ReviewMyPlan);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_DeviceNameInReviewMyPlan() {
		return DriverManager.getDriver().findElement(DeviceNameInReviewMyPlan);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_DeviceCapacityInReview() {
		return DriverManager.getDriver().findElement(DeviceCapacityInReview);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_ContactDerationInReview() {
		return DriverManager.getDriver().findElement(ContactDerationInReview);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_gplan_withDevice() {
		return DriverManager.getDriver().findElement(gplan_withDevice);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_My_Super_Duo() {
		return DriverManager.getDriver().findElement(My_Super_Duo);
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
	public WebElement get_GOCALLIDD_199() {
		return DriverManager.getDriver().findElement(GOCALLIDD_199);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_Easy_Roam() {
		return DriverManager.getDriver().findElement(Easy_Roam);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_GS_Add_Surf_99() {
		return DriverManager.getDriver().findElement(GS_Add_Surf_99);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_Total_subscriptions_and_addons() {
		return DriverManager.getDriver().findElement(Total_subscriptions_and_addons);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_MonthlyBill_subscriptions_and_addons() {
		return DriverManager.getDriver().findElement(MonthlyBill_subscriptions_and_addons);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_Monthly_Payment() {
		return DriverManager.getDriver().findElement(Monthly_Payment);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_OneTimeDevice_Cashout() {
		return DriverManager.getDriver().findElement(OneTimeDevice_Cashout);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_Mobilenumfield() {
		return DriverManager.getDriver().findElement(Mobilenumfield);
	}
	/********************************************************************************************************************************/
	public WebElement get_Proceedbtn() {
		return DriverManager.getDriver().findElement(Proceedbtn);
	}
	/********************************************************************************************************************************/
	public WebElement get_Mobile_Number() {
		return DriverManager.getDriver().findElement(Mobile_Number);
	}
	/********************************************************************************************************************************/
	public WebElement get_ProceedWithMyPlanButton() {
		return DriverManager.getDriver().findElement(ProceedWithMyPlanButton);
	}
	/********************************************************************************************************************************/
	public WebElement get_esim() {
		return DriverManager.getDriver().findElement(esim);
	}
	/********************************************************************************************************************************/
	public WebElement get_physicalSim() {
		return DriverManager.getDriver().findElement(physicalSim);
	}
	/********************************************************************************************************************************/
	
	public boolean isElementExist(String message, String element, int waitTime) {
		boolean flag = false;

		switch (element) {
		case "productDetails":
			flag = waitForElementVisibility(productDetails, waitTime);
			break;
		case "productGallery":
			flag = waitForElementVisibility(productGallery, waitTime);
			break;
		case "deviceNameinPDPage":
			flag = waitForElementVisibility(deviceNameinPDPage, waitTime);
			break;
		case "color_Finish":
			flag = waitForElementVisibility(color_Finish, waitTime);
			break;
		case "capacity":
			flag = waitForElementVisibility(capacity, waitTime);
			break;	
		case "contractDuration":
			flag = waitForElementVisibility(contractDuration, waitTime);
			break;	
		case "cashoutAmount":
			flag = waitForElementVisibility(cashoutAmount, waitTime);
			break;	
		case "forReservationTag":
			flag = waitForElementVisibility(forReservationTag, waitTime);
			break;
		case "note":
			flag = waitForElementVisibility(note, waitTime);
			break;
		case "wantToknowAboutGplans":
			flag = waitForElementVisibility(wantToknowAboutGplans, waitTime);
			break;	
		case "discoverGplanBelow":
			flag = waitForElementVisibility(discoverGplanBelow, waitTime);
			break;
		case "PlanCard":
			flag = waitForElementVisibility(PlanCard, waitTime);
			break;
		case "Devicecarousel":
			flag = waitForElementVisibility(Devicecarousel, waitTime);
			break;	
		case "applyWithThisDevice":
			flag = waitForElementVisibility(applyWithThisDevice, waitTime);
			break;	
		case "selectAnotherDevice":
			flag = waitForElementVisibility(selectAnotherDevice, waitTime);
			break;	
		case "buildMyPlan":
			flag = waitForElementVisibility(buildMyPlan, waitTime);
			break;	
		case "features":
			flag = waitForElementVisibility(features, waitTime);
			break;
		case "promos":
			flag = waitForElementVisibility(promos, waitTime);
			break;
		case "faqText1":
			flag = waitForElementVisibility(faqText1, waitTime);
			break;	
		case "faqText2":
			flag = waitForElementVisibility(faqText2, waitTime);
			break;	
		case "faqText3":
			flag = waitForElementVisibility(faqText3, waitTime);
			break;	
		case "faqText4":
			flag = waitForElementVisibility(faqText4, waitTime);
			break;	
		case "faqText5":
			flag = waitForElementVisibility(faqText5, waitTime);
			break;	
		case "faqText6":
			flag = waitForElementVisibility(faqText6, waitTime);
			break;	
		case "customizeYourplanText":
			flag = waitForElementVisibility(customizeYourplanText, waitTime);
			break;	
		case "PDP_Device":
			flag = waitForElementVisibility(PDP_Device, waitTime);
			break;
		case "PDP_Gcash":
			flag = waitForElementVisibility(PDP_Gcash, waitTime);
			break;
		case "PDP_Simonly":
			flag = waitForElementVisibility(PDP_Simonly, waitTime);
			break;
		case "PDP_Alldata":
			flag = waitForElementVisibility(PDP_Alldata, waitTime);
			break;
		case "planCard":
			flag = waitForElementVisibility(planCard, waitTime);
			break;	
		case "ViewAllDevicesLinkInPdPage":
			flag = waitForElementVisibility(ViewAllDevicesLinkInPdPage, waitTime);
			break;
		case "color_Finish1":
			flag = waitForElementVisibility(color_Finish1, waitTime);
			break;
		case "capacity1":
			flag = waitForElementVisibility(capacity1, waitTime);
			break;
		case "contractDuration1":
			flag = waitForElementVisibility(contractDuration1, waitTime);
			break;	
		case "DoYouUseLotsOfData":
			flag = waitForElementVisibility(DoYouUseLotsOfData, waitTime);
			break;
		case "DoYouLoveWatchingShowsAndMovies":
			flag = waitForElementVisibility(DoYouLoveWatchingShowsAndMovies, waitTime);
			break;
		case "PreferTalkingOverMessaging":
			flag = waitForElementVisibility(PreferTalkingOverMessaging, waitTime);
			break;
		case "AreYouAllAboutTheJetSettingLifestyle":
			flag = waitForElementVisibility(AreYouAllAboutTheJetSettingLifestyle, waitTime);
			break;
		case "ReviewMyPlan":
			flag = waitForElementVisibility(ReviewMyPlan, waitTime);
			break;
		case "DeviceNameInReviewMyPlan":
			flag = waitForElementVisibility(DeviceNameInReviewMyPlan, waitTime);
			break;
		case "DeviceCapacityInReview":
			flag = waitForElementVisibility(DeviceCapacityInReview, waitTime);
			break;
		case "ContactDerationInReview":
			flag = waitForElementVisibility(ContactDerationInReview, waitTime);
			break;	
		case "All_access_data":
			flag = waitForElementVisibility(All_access_data, waitTime);
			break;	
		case "GoWifi_access":
			flag = waitForElementVisibility(GoWifi_access, waitTime);
			break;
		case "Unli_All_net":
			flag = waitForElementVisibility(Unli_All_net, waitTime);
			break;
		case "Plan_inclusions":
			flag = waitForElementVisibility(Plan_inclusions, waitTime);
			break;
		case "Konsulta_Sub":
			flag = waitForElementVisibility(Konsulta_Sub, waitTime);
			break;
		case "Glnsure_Sub":
			flag = waitForElementVisibility(Glnsure_Sub, waitTime);
			break;
		case "gplan_withDevice":
			flag = waitForElementVisibility(gplan_withDevice, waitTime);
			break;
		case "My_Super_Duo":
			flag = waitForElementVisibility(My_Super_Duo, waitTime);
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
		case "GOCALLIDD_199":
			flag = waitForElementVisibility(GOCALLIDD_199, waitTime);
			break;
		case "Easy_Roam":
			flag = waitForElementVisibility(Easy_Roam, waitTime);
			break;
		case "GS_Add_Surf_99":
			flag = waitForElementVisibility(GS_Add_Surf_99, waitTime);
			break;
		case "Subscriptions_Addons":
			flag = waitForElementVisibility(Subscriptions_Addons, waitTime);
			break;
		case "Total_subscriptions_and_addons":
			flag = waitForElementVisibility(Total_subscriptions_and_addons, waitTime);
			break;
		case "MonthlyBill_subscriptions_and_addons":
			flag = waitForElementVisibility(MonthlyBill_subscriptions_and_addons, waitTime);
			break;
		case "Monthly_Payment":
			flag = waitForElementVisibility(Monthly_Payment, waitTime);
			break;
		case "OneTimeDevice_Cashout":
			flag = waitForElementVisibility(OneTimeDevice_Cashout, waitTime);
			break;
		case "Mobile_Number":
			flag = waitForElementVisibility(Mobile_Number, waitTime);
			break;
		case "ProceedWithMyPlanButton":
			flag = waitForElementVisibility(ProceedWithMyPlanButton, waitTime);
			break;
		case "Preper_esim_PhysicalSim":
			flag = waitForElementVisibility(Preper_esim_PhysicalSim, waitTime);
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
	
	
	public void clickOnElement(String type, String eleName, String ele) {

		try {
			switch (ele) {
			
			case "discoverGplanBelow":
				get_discoverGplanBelow().click();
				break;
			case "applyWithThisDevice":
				get_applyWithThisDevice().click();
				break;
			case "selectAnotherDevice":
				get_selectAnotherDevice().click();
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
		//Object S;
		JavascriptExecutor jse = (JavascriptExecutor)DriverManager.getDriver();
		try {
			switch (element) {
			case "discoverGplanBelow":
		         jse.executeScript("arguments[0].click();", get_discoverGplanBelow());		
		         break;
			case "applyWithThisDevice":
		         jse.executeScript("arguments[0].click();", get_applyWithThisDevice());		
		         break;      
			case "ViewAllDevicesLinkInPdPage":
		         jse.executeScript("arguments[0].click();", get_ViewAllDevicesLinkInPdPage());		
		         break;
			case "Data_checkbox":
		         jse.executeScript("arguments[0].click();", get_Data_checkbox());		
		         break; 
			case "movie_checkbox":
		         jse.executeScript("arguments[0].click();", get_movie_checkbox());		
		         break;
			case "message_checkbox":
		         jse.executeScript("arguments[0].click();", get_message_checkbox());		
		         break;
			case "lifestyle_checkbox":
		         jse.executeScript("arguments[0].click();", get_lifestyle_checkbox());		
		         break; 
			case "GSAddsurf99":
		         jse.executeScript("arguments[0].click();", get_GSAddsurf99());		
		         break;      
			case "Amazonprime":
		         jse.executeScript("arguments[0].click();", get_Amazonprime());		
		         break;
			case "Viupremium":
		         jse.executeScript("arguments[0].click();", get_Viupremium());		
		         break;
			case "MyDuo":
		         jse.executeScript("arguments[0].click();", get_MyDuo());		
		         break;
			case "Spotifypremium":
		         jse.executeScript("arguments[0].click();", get_Spotifypremium());		
		         break;
			case "MySuperDuo":
		         jse.executeScript("arguments[0].click();", get_MySuperDuo());		
		         break;
			case "easyRoam":
		         jse.executeScript("arguments[0].click();", get_easyRoam());		
		         break;
			case "Gocallid199":
		         jse.executeScript("arguments[0].click();", get_Gocallid199());		
		         break;
			case "ReviewMyPlan":
		         jse.executeScript("arguments[0].click();", get_ReviewMyPlan());		
		         break;  
			case "Proceedbtn":
		         jse.executeScript("arguments[0].click();", get_Proceedbtn());		
		         break; 
			case "ProceedWithMyPlanButton":
		         jse.executeScript("arguments[0].click();", get_ProceedWithMyPlanButton());		
		         break;
			case "esim":
		         jse.executeScript("arguments[0].click();", get_esim());		
		         break;
			case "physicalSim":
		         jse.executeScript("arguments[0].click();", get_physicalSim());		
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
