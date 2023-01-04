	package com.pages.ada;
	
	import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import globeOnline_CommonMethods.DriverManager;
import junit.framework.Assert;
	
	public class ADAPDP_page extends BasePage {
	
		private static final By Checkbox1 = null;
	
		private static final By Chockbox2 = null;
	
		private static final By Chockbox3 = null;
	
		private static final By Chockbox4 = null;
	
		private static final By Chockbox5 = null;
	
		static File file;
	
		//	public static WebDriverManager.getDriver() DriverManager.getDriver();
		//
		//	public LandingPage(WebDriverManager.getDriver() DriverManager.getDriver()) {
		//		this.DriverManager.getDriver() = DriverManager.getDriver();
		//	}
		//RONNIE SCRIPT ADA5
		By BasicBanner1 = By.xpath("//h2[contains(text(),'MOVE BEYOND THE AVERAGE')]");
		By BasicBanner2 = By.xpath("//h2[contains(text(),'“Average” is boring')]");
		By BasicBanner3 = By.xpath("//h2[contains(text(),'All fun')]");
		By BasicBanner4 = By.xpath("//h2[contains(text(),'s simple pleasures')]");
		By BasicBanner5 = By.xpath("//h2[contains(text(),'Entertainment on the go')]");
		By BasicBanner6 = By.xpath("//h2[contains(text(),'Add to cart to your')]");
		By BasicBanner7 = By.xpath("//h2[contains(text(),'Find the ultimate companion')]");
		By BasicBanner8 = By.xpath("//h2[contains(text(),'Do you need more data?')]");
		By BasicBanner9 = By.xpath("//strong[contains(text(),'Plan styles for all lifestyles')]");
	
		By Planname_SimOnly599 = By.xpath("//strong[contains(text(),'GPlan SIM-Only 599')]");
		By Planname_SimOnly599_Price = By.xpath("//span[contains(text(),'₱ 599.00')]");
	
		By GSSurf99addon = By.xpath("(//div[contains(text(),'GS Add Surf 99')])[2]");
		By Monthlybill_amountSimOnly999_GS99addon = By.xpath("//span[contains(text(),'₱ 1,098.00')]");
		By Totalsubsandaddons_amountSimOnly999_GS99addon = By.xpath("//span[contains(text(),'₱ 99.00')]");
		By Monthlypayment_amountSimOnly999_GS99addon = By.xpath("(//strong[contains(text(),'₱ 1,098.00/mo.')])[2]");
		By Contractduration_Value = By.xpath("//span[contains(text(),'mos.')]");
		/********************************************************************************************************************************/
	
		/********************************************************************************************************************************/
		//Discovery Starter page
		By Disc_Basicbtn = By.xpath("(//button[contains(text(),' Get Started')])[3]");
		//button[contains(text(),' Discover Basic')]");
		By Disc_starterbtn = By.xpath("//button[contains(text(),' Discover Value ')]");
		By Disc_starterbtn_arrow = By.xpath("//span[@class='arrow-icon'])[4]");
		By Starter_header = By.xpath("//h2[contains(text(),'A GREAT LIFE STARTS HERE')]");
		By Build_btn = By.xpath("//div[contains(text(),' Build my plan ')]");	
		By Device_strtr_btn = By.xpath("//div[contains(text(),' Device ')]");
		By GCash_strtr_btn = By.xpath("//div[contains(text(),' GCash ')]");
		By Simonly_strtr_btn = By.xpath("//div[contains(text(),' Sim Only ')]");
		By Simonly_basic_btn = By.xpath("//div[contains(text(),' SIM Only ')]");
		By Alldata_strtr_btn = By.xpath("//div[contains(text(),' All-Data ')]");
		By starterbanner1 = By.xpath("//h2[contains(text(),'A GREAT LIFE STARTS HERE')]");
		By starterbanner2 = By.xpath("//h2[contains(text(),'For all the moments in-between')]");
		By starterbanner3 = By.xpath("//h2[contains(text(),'The Starter plan is made for the tireless go-getter.')]");
		By starterbanner4 = By.xpath("//h2[contains(text(),'The soundtrack of your life')]");
	
		//h2[contains(text(),'â€œLet me Google that!â€�')]");
		By starterbanner5 = By.xpath("//h2[contains(text(),'Reframe your lifestyle')]");
		By starterbanner6 = By.xpath("//h2[contains(text(),'Find the ultimate companion')]");
		By starterbanner7 = By.xpath("//h2[contains(text(),'Do you need more data?')]");
		By starterbanner8 = By.xpath("//strong[contains(text(),'Plan styles for all lifestyles')]");
	
	
		//	Discoverysc2 banners validation
		By bannervalidation1=By.xpath("//span[contains(text(),'You’ve got WiFi at work. You’ve got WiFi at home. Now get a plan is for the moments in between. The Starter Plan helps you stay connected when it matters!')]");
	
	
	
		//FTA_1-----PDP page for withdevice599
		By PDP_Device = By.xpath("//button[contains(text(),' Device ')]");
		By PDP_Gcash = By.xpath("//button[contains(text(),' GCash ')]");
		By PDP_Simonly = By.xpath("//button[contains(text(),' Sim-Only ')]");
		By PDP_Alldata = By.xpath("//button[contains(text(),' All-Data ')]");
		By Price_599 = By.xpath("(//span[contains(text(),'599')])[1]");
		By Color_header = By.xpath("//span[contains(text(),'Color or Finish')]");
		By Capacity_header = By.xpath("//span[contains(text(),'Capacity')]");
		By Contractduration_header = By.xpath("//span[contains(text(),'Contract duration')]");
		By Banner = By.xpath("//div[@class='getaplan-with-device-image-wrapper']");
		//Breakdown page
		By Allaccess_data = By.xpath("//span[contains(text(),'All-access data')]");
		By Gowifi_access = By.xpath("//span[contains(text(),'GoWifi access')]");
		By List_ul = By.xpath("//ul[@class='list-ul']");
		By Monthlycashout_header = By.xpath("//div[@class='monthly-with-onetime-cashout']");
		By Plan_name = By.xpath("(//div[@class='gplan-with-device'])[3]");
		By Plan_price = By.xpath("(//div[@class='plan-msf-price'])");
		By Addonsheader = By.xpath("//span[contains(text(),'Subscriptions and Add-ons')]");
		By Monthlybillheader = By.xpath("(//span[contains(text(),'Monthly Bill')])");
		By Device=By.xpath("//div[@class='go_device-wrapper-footer go_plan-builder-sticky ng-star-inserted']//img");
		By Devicename=By.xpath("//span[@class='go_text-h3-smallest-default']");
		By Planname1=By.xpath("//strong[@class='go_text-preamble']");
		By Devicedetails=By.xpath("");
		By Checkbox=By.xpath("");
		By Checkbox2=By.xpath("");
		By Checkbox3=By.xpath("");
		By ProccedwithMyplan=By.xpath("");
		By Preper_esim_PhysicalSim = By.xpath("//div[text()=' Prefer e-SIM or a physical SIM card? ']");
		By esim = By.xpath("//span[text()='e-SIM']//parent::label//input");
	
	
	
	
		By Proceedbtn = By.xpath("//button[@id='sticky-proceed']");
	
		//button[@id='sticky-proceed-plan']");
		//button[@id='sticky-proceed']");
	
		//button[contains(text(),' Proceed ')]");	
	
		//	//ada2-2----PDP page and view Breakdown for Gplan Alldata599
	
		By Banner1 = By.xpath("//div[@class='getaplan-with-device-image']");
		By Planname = By.xpath("//strong[contains(text(),'GPlan 599 with Device')]");
		By Plan_amount = By.xpath("//span[contains(text(),'₱ 599.00')]");
		By Subsandaddonheader = By.xpath("//span[contains(text(),'Subscriptions and Add‑ons')]");
		By MyDuoaddon = By.xpath("(//div[contains(text(),'MySuperDuo')])[2]");
		By AmazonAddon = By.xpath("(//div[contains(text(),'Amazon Prime Video')])[2]");
		By SURF=By.xpath("(//div[contains(text(),'GS Add Surf 99')])[2]");
		By mysuperDuoAddon=By.xpath("(//div[contains(text(),'MySuperDuo')])[2]");
	
	
		By Totalsubsandaddons = By.xpath("//strong[contains(text(),'Total subscriptions and add‑ons')]");
		By Totalsubsandaddons_amont = By.xpath("//span[contains(text(),'₱ 848.00')]");
		By Monthlybill_header = By.xpath("//strong[contains(text(),'Monthly bill, subscriptions, and add‑ons')]");
		By Monthlybill_amount = By.xpath("//span[contains(text(),'₱ 1,447.00')]");
		By Monthly_payment = By.xpath("(//span[text()='Monthly payment'])[2]");
		//li[@class='go_footer-total-row']//span[text()='Monthly payment']");
		By Monthlypayment_amount = By.xpath("//strong[contains(text(),'₱ 1,447.00/mo.')]");
		By inputmoblienum = By.xpath("//input[@id='go_plan-breakdown-number']");
		By proceedbtn1 = By.xpath("(//button[contains(text(),'Proceed')])[1]");
		By Breakdown_Mobilenum  = By.xpath("//span[@class='go_text-preamble-small']");
		By Breakdown_proceedbutton = By.xpath("//button[contains(text(),'Proceed with my plan')]");
		//By  = By.xpath("");
		//Bhavana ADA 4 and ADA 7
		//Gplanwith_Gcash599	
		By gcashverifiedtext = By.xpath("//div[@class='gcash-verify-text']");
		By gcashcredits = By.xpath("//div[@class='d-flex flex-row g-cash-block']");
		//Breakdownpage
		By Breakdown_Gcashcredits = By.xpath("(//span[contains(text(),'GCash Credits')])[2]");
		By Plannamegcash = By.xpath("//div[@class='go_text-preamble']");
		By Gcashamount = By.xpath("(//span[contains(text(),'₱ 599.00')])");		
		By Breakdownn_Viupremium = By.xpath("(//div[contains(text(),'Viu Premium')])[2]");
		By Breakdownn_Spotifypremium = By.xpath("(//div[contains(text(),'Spotify Premium')])[2]");
		By Breakdownn_EasyRoam = By.xpath("(//div[contains(text(),'Easy Roam')])[2]");
		By Breakdownn_Gocallid = By.xpath("(//div[contains(text(),'GOCALLIDD 199')])[2]");
		By Breakdownn_Gsaddsurf = By.xpath("(//div[contains(text(),'GS Add Surf 99')])[2]");
	
		By Addonsamount = By.xpath("//span[contains(text(),'₱ 1,275.00')]");
		By Monthlyamount = By.xpath("//span[contains(text(),'₱ 1,874.00')]");
		By Gcash_Monthlypayment_amount = By.xpath("(//strong[contains(text(),'₱ 1,874.00/mo.')])[2]");
	
	
		//Gplanwithdevice2499
	
		By PlannameGplanwithdevice = By.xpath("//div[@class='GPlan 2499 with Device']");
		By Gplanwithdeviceamount = By.xpath("(//span[contains(text(),'₱ 2,499.00')])");
	
		By Selecteddevice = By.xpath("(//strong[@class='go_text-preamble'])[2])");
		By Selecteddevice_amount = By.xpath("(//span[@class='go_text-preamble-small-semibold'])[2])");
		By GplanwithdeviceMonthlyamount = By.xpath("//span[contains(text(),'₱ 3,774.00/mo.')]");
	
	
	
	
		//Addons
		By Data_addon = By.xpath("//div[contains(text(),' Do you use lots of data? ')]");
		By Data_checkbox = By.xpath("(//span[@class='slider round'])[1]");
		By GSAddsurf99 = By.xpath("//div[contains(text(),' GS Add Surf 99')]");
	
		By movie_addon = By.xpath("//div[contains(text(),' Do you love watching shows and movies? ')]");
		By movie_checkbox = By.xpath("(//span[@class='slider round'])[2]");
		By Amazonprime = By.xpath("//div[contains(text(),' Amazon Prime Video ')]");
		By Viupremium = By.xpath("//div[contains(text(),' Viu Premium ')]");
		By Spotifypremium = By.xpath("//div[contains(text(),' Spotify Premium ')]");
	
		By message_addon = By.xpath("//div[contains(text(),' Prefer talking over messaging? ')]");
		By message_checkbox = By.xpath("(//span[@class='slider round'])[3]");
		By MyDuo = By.xpath("//div[contains(text(),' MyDuo')]");
		By MySuperDuo = By.xpath("//div[contains(text(),' MySuperDuo')]");
	
		By lifestyle_addon = By.xpath("//div[contains(text(),' Are you all about the jet-setting lifestyle? ')]");
		By lifestyle_checkbox = By.xpath("(//span[@class='slider round'])[4]");
		By easyRoam = By.xpath("//div[contains(text(),' Easy Roam')]");
		By Gocallid199 = By.xpath("//div[contains(text(),' GOCALLIDD 199')]");
	
		By Mobilenumfield = By.xpath("//input[@id='go_plan-breakdown-number']");
	
		//span[@class='go_text-preamble-small']");
	
		By Monthlybill = By.xpath("//div[@class='monthlybill-amount']");
		By Viewplanbreakdwn = By.xpath("//span[contains(text(),'View Plan Breakdown')]");
		By dropdown_Planbreakdwn = By.xpath("//div[@class='hide-tab-content-image']");
		By Reviewmyplan = By.xpath("//div[contains(text(),'Review my plan')]");
		By Dragbutton = By.xpath("//div[@class='go_sticky-footer-drag-arrow']");
		By CarouselDevicePrevBtn = By.xpath("(//div[@class='owl-prev'])[2]");
		By CarouselDeviceNextBtn = By.xpath("(//div[@class='owl-next'])[2]");
	
		// Vishnu - ADA3 Xpaths
	
	
	
		By PlanName = By.xpath("//strong[contains(text(),'GPlan 1499 with Device')]");
		By Plan_Amount = By.xpath("//span[contains(text(),'₱ 1,499.00')]");
		By DeviceName = By.xpath("//strong[contains(text(),'')]");
		By SubsAndAddonHeader = By.xpath("//span[contains(text(),'Subscriptions and Add‑ons')]");
		By MySuperDuo1 = By.xpath("(//div[contains(text(),'MySuperDuo')])[2]");
		By AmazonPrimeVideoAddon = By.xpath("(//div[contains(text(),'Amazon Prime Video')])[2]");
		By ViuPremiumAddon = By.xpath("(//div[contains(text(),'Viu Premium')])[2]");
		By SpotifyPremium1 = By.xpath("(//div[contains(text(),'Spotify Premium')])[2]");
		By EastRoamAddon = By.xpath("(//div[contains(text(),'Easy Roam')])[2]");
		By GOCALLIDDAddon = By.xpath("(//div[contains(text(),'GOCALLIDD 199')])[2]");
		By GSAddSurf = By.xpath("(//div[contains(text(),'GS Add Surf 99')])[2]");			
		//	By Totalsubsandaddons = By.xpath("//strong[contains(text(),'Total subscriptions and add‑ons')]");
		By TotalSubsandAddons_amount = By.xpath("//span[contains(text(),'₱ 1,424.00')]");
		//	By Monthlybill_header = By.xpath("//strong[contains(text(),'Monthly bill, subscriptions, and add‑ons')]");
		//	By Monthlybill_amount = By.xpath("//span[contains(text(),'₱ 2,923.00')]");
		//	By Monthly_payment = By.xpath("(//span[contains(text(),'Monthly payment')])[3]");
		//	By Monthlypayment_amount = By.xpath("(//strong[contains(text(),'₱ 2,923.00/mo.')])");
		By Inputmoblienum = By.xpath("//input[@id='go_plan-breakdown-number']");
		By ProceedBtn = By.xpath("(//button[contains(text(),'Proceed')])[1]");
		//	By Breakdown_Mobilenum  = By.xpath("//span[@class='go_text-preamble-small']");
		//	By Breakdown_proceedbutton = By.xpath("//button[contains(text(),'Proceed with my plan')]");
	
		//ADA6
		By DiscooverPlus=By.xpath("//button[contains(text(),' Discover Plus ')]");
		By Bannerplus1=By.xpath("//h2[contains(text(),'Do more, Get more, Be more')]");
		By Bannerplus2=By.xpath("//h2[contains(text(),'Embrace life’s positives')]");
		By Bannerplus3=By.xpath("//h2[contains(text(),'Everything you need, plus more')]");
		By Bannerplus4=By.xpath("//span[contains(text(),'Power up your playlist with over 3,000 high quality songs and enjoy up to 180 minutes of non-stop music streaming every day.')]");
		By Bannerplus5=By.xpath("//h2[contains(text(),'It’s a lifestyle')]");
		By Bannerplus6=By.xpath("//span[contains(text(),'Online shopping, made easy')]");
		By Bannerplus7=By.xpath("//h2[contains(text(),'Find the ultimate companion')]");
		By Bannerplus8=By.xpath("//h2[contains(text(),'Do you need more data?')]");
		By Bannerplus9=By.xpath("//strong[contains(text(),'Plan styles for all lifestyles')]");
	
		By Gplan1799=By.xpath("//span[contains(text(),'1799')]");
		//div[@class='price']//span[text()='1799']");
		//By Review=By.xpath("//div[text()='Review my plan']");
		By Banner2=By.xpath("//div[@class='getaplan-with-device-image']");
	
		By planename1799=By.xpath("//strong[contains(text(),'GPlan All Data 1799 ')]");
		By planeamount1799=By.xpath("//span[contains(text(),'₱ 1,799.00')]");
		By totalpluse=By.xpath("//span[contains(text(),'₱ 848.00')]");
		By monthlybillpay1799=By.xpath("//span[contains(text(),'₱ 2,647.00')]");
		By monthlypaymentamount1799=By.xpath("(//strong[contains(text(),'₱ 2,647.00/mo.')])[2]");
		By panenameDAF=By.xpath("//div[contains(text(),'GPlan All Data 1799 ')]");
	
		/***************ADA  1 STARTS HERE**********************/
		By GplanSimonlyPlanName = By.xpath("//span[text()='Starter']//following::strong[1]");
		By SimOnly599GOCALLIDD199 = By.xpath("(//div[contains(text(),'GOCALLIDD 199')])[2]");
		By Addonamount = By.xpath("//strong[text()='Total subscriptions and add‑ons']//following::span[1]");
		By Monthyaddon = By.xpath("//strong[text()='Monthly bill, subscriptions, and add‑ons']//following::span[1]");
		By Totalmontlypaymentsimonly= By.xpath("(//span[contains(text(),'Monthly payment')])[3]//following::strong");
		//			By movie_checkboxAddon1 = By.xpath("(//strong[contains(text(),'₱ 1,775.00/mo.')])[2]");
	
	
		By showsAndMoviesToggle = By.xpath("(//span[@class='slider round'])[1]");
		By AmazonprimeVideoaddon599 = By.xpath("(//div[contains(text(),'Amazon Prime Video')])[1]");
		By viupremiuum599 = 	By.xpath("(//div[contains(text(),' Viu Premium ')])[1]");
		By spotifypremiuum599 = 	By.xpath("(//div[contains(text(),'Spotify Premium')])[2]");
		//			Prefer talking over messaging? Addon
		By TalkingovermessageAddOn = By.xpath("(//span[@class='slider round'])[2]");
		//			Are you all about the jet-setting lifestyle? Addon
		By lifestylemessageAddOn = By.xpath("(//span[@class='slider round'])[3]");
		By YoutubeAddon = By.xpath("(//div[@class='entertainment-content-block ng-star-inserted'])[1]");
		By PdpSearchfield=By.xpath("//input[@placeholder='Search by device, brand']");
		By Esim=By.xpath("(//input[@type='radio'])[3]");
	
	
	
	
		/***************ADA  1 ENDS HERE**********************/	
	
		//ADA7
		By Discoveralwayson=By.xpath("//button[contains(text(),' Discover Always On ')]");
		By starterbanner1Always=By.xpath("//h2[contains(text(),'A NEW plan that can keep up with you')]");
		By starterbanner2Always=By.xpath("//h2[contains(text(),'A plan designed to keep up')]");
		By starterbanner3Always=By.xpath("//span[contains(text(),'Stay connected')]");
		By starterbanner4Always=By.xpath("//span[contains(text(),'HD. 4k. Prepare for impact.')]");
		By starterbanner5Always=By.xpath("//span[contains(text(),'Curate the soundtrack of your life ')]");
		By starterbanner6Always=By.xpath("//span[contains(text(),'Always on, always on call')]");
		By starterbanner7Always=By.xpath("//h2[contains(text(),'Find the ultimate companion')]");
		By starterbanner8Always=By.xpath("//h2[contains(text(),'Do you need more data?')]");
		By starterbanner9Always=By.xpath("//strong[contains(text(),'Plan styles for all lifestyles')]");
	
	
		By testDataDisplayedInBreakdown = By.xpath("//span[@class='go_text-preamble-small']");
		By nameOfThePlanInBreakDown = By.xpath("//strong[@class='go_text-preamble']");
		By contractDurationInBreakDown = By.xpath("//div[text()='Contract duration: 12 mos.']");
		By allAccessDataInBreakDown = By.xpath("//span[text()='All-access data ']");
		By goWifiAccessInBreakDown = By.xpath("//span[text()='  GoWifi access ']");
		By call_TextInBreakdown = By.xpath("//span[text()=' Call and text ']");
		By planInclusionsInBreakdown = By.xpath("//span[text()='Plan inclusions']");
		By KonsultaMDInBreakdown = By.xpath("//li[text()=' Free individual subscription to KonsultaMD ']");
		By MySuperDuoInBreakdown = By.xpath("//div[text()='MySuperDuo']");
		By AmazonPrimeVideoInBreakdown = By.xpath("//div[text()='Amazon Prime Video']");
		By ViuPremiumInBreakdown = By.xpath("//div[text()='Viu Premium']");
		By EasyRoam = By.xpath("//div[text()='Easy Roam']");
		By GOCALLIDDInBreakdown = By.xpath("//div[text()='GOCALLIDD 199']");
		By TotalSubs_AddonsInBreakdown = By.xpath("//strong[text()='Total subscriptions and add‑ons']//following-sibling::span");
		By MonthlyBillSub_AddonsInBreakdown = By.xpath("//strong[text()='Monthly bill, subscriptions, and add‑ons']//following-sibling::span");
		By MonthlyPaymentInBreakdown = By.xpath("(//span[text()='Monthly payment'])[2]//following-sibling::strong");
	
	
	
	
	
	
	
	
	
	
	
	
		//By  = By.xpath("");
		/********************************************************************************************************************************/
	
	
		public WebElement get_Planname_SimOnly599() {
			return DriverManager.getDriver().findElement(Planname_SimOnly599);}
	
		public WebElement get_GplanSimonlyPlanName() {
			return DriverManager.getDriver().findElement(GplanSimonlyPlanName);
	
		}
	
		public WebElement get_Esim() {
			return DriverManager.getDriver().findElement(Esim);}
	
	
		public WebElement get_CarouselDeviceNextBtn() {
			return DriverManager.getDriver().findElement(CarouselDeviceNextBtn);
	
		}
	
		/********************************************************************************************************************************/
		public WebElement get_Breakdown_proceedbutton() {
			return DriverManager.getDriver().findElement(Breakdown_proceedbutton);
		}
	
		/********************************************************************************************************************************/
		public WebElement get_Disc_starterbtn_arrow() {
			return DriverManager.getDriver().findElement(Disc_starterbtn_arrow);
		}
		/********************************************************************************************************************************/
		public WebElement get_Mobilenumfield() {
			return DriverManager.getDriver().findElement(Mobilenumfield);
		}
		/********************************************************************************************************************************/
		public WebElement get_Disc_starterbtn() {
			return DriverManager.getDriver().findElement(Disc_starterbtn);
		}
		public WebElement get_Discoveralwayson()
		{
			return DriverManager.getDriver().findElement(Discoveralwayson);
	
		}
	
		/*******************************************/
		public WebElement get_Discover_plus()
		{
			return DriverManager.getDriver().findElement(DiscooverPlus);
	
		}
	
		/********************************************************************************************************************************/
		public WebElement get_Build_btn() {
			return DriverManager.getDriver().findElement(Build_btn);
		}
	
		/********************************************************************************************************************************/
		public WebElement get_Device_strtr_btn() {
			return DriverManager.getDriver().findElement(Device_strtr_btn);
		}
	
		/********************************************************************************************************************************/
		public WebElement get_GCash_strtr_btn() {
			return DriverManager.getDriver().findElement(GCash_strtr_btn);
		}
	
		/********************************************************************************************************************************/
		public WebElement get_Simonly_strtr_btn() {
			return DriverManager.getDriver().findElement(Simonly_strtr_btn);
		}
	
		/********************************************************************************************************************************/
		public WebElement get_Alldata_strtr_btn() {
			return DriverManager.getDriver().findElement(Alldata_strtr_btn);
		}
	
		/********************************************************************************************************************************/
		public WebElement get_Data_addon() {
			return DriverManager.getDriver().findElement(Data_addon);
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
		public WebElement get_movie_addon() {
			return DriverManager.getDriver().findElement(movie_addon);
		}
	
		/********************************************************************************************************************************/
		public WebElement get_movie_checkbox() {
			return DriverManager.getDriver().findElement(movie_checkbox);
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
		public WebElement get_message_addon() {
			return DriverManager.getDriver().findElement(message_addon);
		}
	
		/********************************************************************************************************************************/
		public WebElement get_message_checkbox() {
			return DriverManager.getDriver().findElement(message_checkbox);
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
		public WebElement get_PdpSearchfield()
		{
			return DriverManager.getDriver().findElement(PdpSearchfield);
		}
		/***********************************************************************************************************************************/
		public WebElement get_lifestyle_addon() {
			return DriverManager.getDriver().findElement(lifestyle_addon);
		}
	
		/********************************************************************************************************************************/
		public WebElement get_lifestyle_checkbox() {
			return DriverManager.getDriver().findElement(lifestyle_checkbox);
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
		public WebElement get_dropdown_Planbreakdwn() {
			return DriverManager.getDriver().findElement(dropdown_Planbreakdwn);
		}
	
		/********************************************************************************************************************************/
		public WebElement get_Proceedbtn() {
			return DriverManager.getDriver().findElement(Proceedbtn);
		}
	
		/********************************************************************************************************************************/
		public WebElement get_Dragbutton() {
			return DriverManager.getDriver().findElement(Dragbutton);
		}
	
		/********************************************************************************************************************************/
		public WebElement get_inputmoblienum() {
			return DriverManager.getDriver().findElement(inputmoblienum);
		}
	
		/********************************************************************************************************************************/
		public WebElement get_proceedbtn1() {
			return DriverManager.getDriver().findElement(proceedbtn1);
		}
		/***********************************************************************/
		public WebElement get_Surf()
		{
			return DriverManager.getDriver().findElement(SURF);
		}
		/**********************************************************************/
		public WebElement get_mysuperDuoAddon()
		{
			return DriverManager.getDriver().findElement(mysuperDuoAddon);
		}
		public WebElement get_Reviewmyplan()
		{
			return DriverManager.getDriver().findElement(Reviewmyplan);
		}
		/*******************************************/
		public WebElement get_Gplan1799()
		{
			return DriverManager.getDriver().findElement(Gplan1799);	
		}
		/***************ADA  1 STARTS HERE**********************/
		//	Shows and Movies
		public WebElement get_showsAndMoviesToggle() {
			return DriverManager.getDriver().findElement(showsAndMoviesToggle);
		}
	
		public WebElement get_AmazonprimeVideoaddon599()
		{
			return DriverManager.getDriver().findElement(AmazonprimeVideoaddon599);
		}
		public WebElement get_viupremiuum599()
		{
			return DriverManager.getDriver().findElement(viupremiuum599);
		}
		public WebElement get_spotifypremiuum599()
		{
			return DriverManager.getDriver().findElement(spotifypremiuum599);
		}
		public WebElement get_TalkingovermessageAddOn()
		{
			return DriverManager.getDriver().findElement(TalkingovermessageAddOn);
		}
		public WebElement get_lifestylemessageAddOn()
		{
			return DriverManager.getDriver().findElement(lifestylemessageAddOn);
		}
		public WebElement get_YoutubeAddon()
		{
			return DriverManager.getDriver().findElement(YoutubeAddon);
		}
		public WebElement get_testDataDisplayedInBreakdown()
		{
			return DriverManager.getDriver().findElement(testDataDisplayedInBreakdown);
		}
		public WebElement get_nameOfThePlanInBreakDown()
		{
			return DriverManager.getDriver().findElement(nameOfThePlanInBreakDown);
		}
		public WebElement get_TotalSubs_AddonsInBreakdown()
		{
			return DriverManager.getDriver().findElement(TotalSubs_AddonsInBreakdown);
		}
		public WebElement get_MonthlyBillSub_AddonsInBreakdown()
		{
			return DriverManager.getDriver().findElement(MonthlyBillSub_AddonsInBreakdown);
		}
		public WebElement get_MonthlyPaymentInBreakdown()
		{
			return DriverManager.getDriver().findElement(MonthlyPaymentInBreakdown);
		}
		public WebElement get_esim() {
			return DriverManager.getDriver().findElement(esim);
		}
	
		/***************ADA  1 ENDS HERE**********************/
	
		//---- RONNI SCRIPT ADA5 Start here-----
		/********************************************************************************************************************************/
		public void js_clickOnElement(String type, String eleName, String ele) {
	
			try {
				JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
	
	
				switch (ele) {
				case "Breakdown_proceedbutton":
					js.executeScript("arguments[0].click();", get_Breakdown_proceedbutton());
					break;
				case "Disc_Basicbtn":
					js.executeScript("arguments[0].click();", get_Disc_Basicbtn());
					break;
				case "Data_checkbox":
					js.executeScript("arguments[0].click();", get_Data_checkbox());
					break;
				case "GSAddsurf99":
					js.executeScript("arguments[0].click();", get_GSAddsurf99());
					break;
				case "Reviewmyplan":
					js.executeScript("arguments[0].click();", get_Reviewmyplan());
					break;
					/***************ADA  1 STARTS HERE**********************/
				case "showsAndMoviesToggle":
					js.executeScript("arguments[0].click();", get_showsAndMoviesToggle());
					break;				
				case "AmazonprimeVideoaddon599":
					js.executeScript("arguments[0].click();", get_AmazonprimeVideoaddon599());
					break;
				case "viupremiuum599":
					js.executeScript("arguments[0].click();", get_viupremiuum599());
					break;
				case "spotifypremiuum599":
					js.executeScript("arguments[0].click();", get_spotifypremiuum599());
					break;
				case "TalkingovermessageAddOn":
					js.executeScript("arguments[0].click();", get_TalkingovermessageAddOn());
					break;
				case "lifestylemessageAddOn":
					js.executeScript("arguments[0].click();", get_lifestylemessageAddOn());
					break;
				case "YoutubeAddon":
					js.executeScript("arguments[0].click();", get_YoutubeAddon());
					break;
				case "easyRoam":
					js.executeScript("arguments[0].click();", get_easyRoam());
					break;
				case "Gocallid199":
					js.executeScript("arguments[0].click();", get_Gocallid199());
					break;
				case "Spotifypremium":
					js.executeScript("arguments[0].click();", get_Spotifypremium());
					break;
					
					/***************ADA  1 EndS HERE**********************/
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
	
		//---- RONNI SCRIPT ADA5 ENDS here-----
	
		/*************************************************************************************************/
	
		public WebElement get_Disc_Basicbtn() {
			return DriverManager.getDriver().findElement(Disc_Basicbtn);
		}
	
		public boolean isElementExist(String message, String element, int waitTime) {
			boolean flag = false;
	
			switch (element) {
	
			//------------------Bhavana script starts here--------
			case "Selecteddevice":
				flag = waitForElementVisibility(Selecteddevice, waitTime);
				break;
			case "Selecteddevice_amount":
				flag = waitForElementVisibility(Selecteddevice_amount, waitTime);
				break;
			case "Gplanwithdeviceamount":
				flag = waitForElementVisibility(Gplanwithdeviceamount, waitTime);
				break;
			case "PlannameGplanwithdevice":
				flag = waitForElementVisibility(PlannameGplanwithdevice, waitTime);
				break;
			case "GplanwithdeviceMonthlyamount":
				flag = waitForElementVisibility(GplanwithdeviceMonthlyamount, waitTime);
				break;	
			case "gcashverifiedtext":
				flag = waitForElementVisibility(gcashverifiedtext, waitTime);
				break;
			case "gcashcredits":
				flag = waitForElementVisibility(gcashcredits, waitTime);
				break;
			case "Breakdown_Gcashcredits":
				flag = waitForElementVisibility(Breakdown_Gcashcredits, waitTime);
				break;
			case "Plannamegcash":
				flag = waitForElementVisibility(Plannamegcash, waitTime);
				break;
			case "Gcashamount":
				flag = waitForElementVisibility(Gcashamount, waitTime);
				break;
			case "Breakdownn_Viupremium":
				flag = waitForElementVisibility(Breakdownn_Viupremium, waitTime);
				break;
			case "Breakdownn_EasyRoam":
				flag = waitForElementVisibility(Breakdownn_EasyRoam, waitTime);
				break;
			case "Breakdownn_Gocallid":
				flag = waitForElementVisibility(Breakdownn_Gocallid, waitTime);
				break;
			case "Breakdownn_Gsaddsurf":
				flag = waitForElementVisibility(Breakdownn_Gsaddsurf, waitTime);
				break;
			case "Addonsamount":
				flag = waitForElementVisibility(Addonsamount, waitTime);
				break;
			case "Monthlyamount":
				flag = waitForElementVisibility(Monthlyamount, waitTime);
				break;
			case "Gcash_Monthlypayment_amount":
				flag = waitForElementVisibility(Monthlypayment_amount, waitTime);
				break;
			case "YoutubeAddon":
				flag = waitForElementVisibility(YoutubeAddon, waitTime);
				break;
			case "Preper_esim_PhysicalSim":
				flag = waitForElementVisibility(Preper_esim_PhysicalSim, waitTime);
				break;
				//		case "selectGplanWithgcash2499":
				//			flag = waitForElementVisibility(selectGplanWithgcash2499, waitTime);
				//			break;
				//		case "gcashverifiedtext":
				//			flag = waitForElementVisibility(gcashverifiedtext, waitTime);
				//			break;
				//		case "gcashcredits":
				//			flag = waitForElementVisibility(gcashcredits, waitTime);
				//			break;
				//		case "Breakdown_Gcashcredits":
				//			flag = waitForElementVisibility(Breakdown_Gcashcredits, waitTime);
				//			break;
				//		case "Plannamegcash":
				//			flag = waitForElementVisibility(Plannamegcash, waitTime);
				//			break;
				//		case "Gcashamount":
				//			flag = waitForElementVisibility(Gcashamount, waitTime);
				//			break;
				//		case "Breakdownn_Viupremium":
				//			flag = waitForElementVisibility(Breakdownn_Viupremium, waitTime);
				//			break;
				//		case "Breakdownn_Spotifypremium":
				//			flag = waitForElementVisibility(Breakdownn_Spotifypremium, waitTime);
				//			break;
				//		case "Breakdownn_EasyRoam":
				//			flag = waitForElementVisibility(Breakdownn_EasyRoam, waitTime);
				//			break;
				//		case "Breakdownn_Gocallid":
				//			flag = waitForElementVisibility(Breakdownn_Gocallid, waitTime);
				//			break;
				//		case "Breakdownn_Gsaddsurf":
				//			flag = waitForElementVisibility(Breakdownn_Gsaddsurf, waitTime);
				//			break;
				//		case "Addonsamount":
				//			flag = waitForElementVisibility(Addonsamount, waitTime);
				//			break;
				//		case "Monthlyamount":
				//			flag = waitForElementVisibility(Monthlyamount, waitTime);
				//			break;
				//		
				//------ RONNIE SCRIPT ADA5---------
			case "Contractduration_Value":
				flag = waitForElementVisibility(Contractduration_Value, waitTime);
				break;
			case "Simonly_basic_btn":
				flag = waitForElementVisibility(Simonly_basic_btn, waitTime);
				break;
			case "Breakdown_Mobilenum":
				flag = waitForElementVisibility(Breakdown_Mobilenum, waitTime);
				break;
			case "Planname_SimOnly599":
				flag = waitForElementVisibility(Planname_SimOnly599, waitTime);
				break;
			case "Planname_SimOnly599_Price":
				flag = waitForElementVisibility(Planname_SimOnly599_Price, waitTime);
				break;
			case "GSSurf99addon":
				flag = waitForElementVisibility(GSSurf99addon, waitTime);
				break;
			case "Monthlybill_amountSimOnly999_GS99addon":
				flag = waitForElementVisibility(Monthlybill_amountSimOnly999_GS99addon, waitTime);
				break;
			case "Totalsubsandaddons_amountSimOnly999_GS99addon":
				flag = waitForElementVisibility(Totalsubsandaddons_amountSimOnly999_GS99addon, waitTime);
				break;
			case "Monthlypayment_amountSimOnly999_GS99addon":
				flag = waitForElementVisibility(Monthlypayment_amountSimOnly999_GS99addon, waitTime);
				break;
	
				//------ RONNIE SCRIPT ADA5 END HERE -------
	
			case "Disc_starterbtn":
				flag = waitForElementVisibility(Disc_starterbtn, waitTime);
				break;
			case "Starter_header":
				flag = waitForElementVisibility(Starter_header, waitTime);
				break;
			case "Build_btn":
				flag = waitForElementVisibility(Build_btn, waitTime);
				break;
			case "Device_strtr_btn":
				flag = waitForElementVisibility(Device_strtr_btn, waitTime);
				break;
			case "GCash_strtr_btn":
				flag = waitForElementVisibility(GCash_strtr_btn, waitTime);
				break;
			case "Simonly_strtr_btn":
				flag = waitForElementVisibility(Simonly_strtr_btn, waitTime);
				break;
			case "Alldata_strtr_btn":
				flag = waitForElementVisibility(Alldata_strtr_btn, waitTime);
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
			case "Price_599":
				flag = waitForElementVisibility(Price_599, waitTime);
				break;
			case "Color_header":
				flag = waitForElementVisibility(Color_header, waitTime);
				break;
			case "Capacity_header":
				flag = waitForElementVisibility(Capacity_header, waitTime);
				break;
			case "Contractduration_header":
				flag = waitForElementVisibility(Contractduration_header, waitTime);
				break;
			case "Data_addon":
				flag = waitForElementVisibility(Data_addon, waitTime);
				break;
			case "Data_checkbox":
				flag = waitForElementVisibility(Data_checkbox, waitTime);
				break;
			case "GSAddsurf99":
				flag = waitForElementVisibility(GSAddsurf99, waitTime);
				break;
			case "Banner":
				flag = waitForElementVisibility(Banner, waitTime);
				break;
			case "movie_addon":
				flag = waitForElementVisibility(movie_addon, waitTime);
				break;
			case "movie_checkbox":
				flag = waitForElementVisibility(movie_checkbox, waitTime);
				break;
			case "Amazonprime":
				flag = waitForElementVisibility(Amazonprime, waitTime);
				break;
			case "Viupremium":
				flag = waitForElementVisibility(Viupremium, waitTime);
				break;
			case "Spotifypremium":
				flag = waitForElementVisibility(Spotifypremium, waitTime);
				break;
			case "message_addon":
				flag = waitForElementVisibility(message_addon, waitTime);
				break;
			case "lifestyle_addon":
				flag = waitForElementVisibility(lifestyle_addon, waitTime);
				break;
			case "easyRoam":
				flag = waitForElementVisibility(easyRoam, waitTime);
				break;
			case "Gocallid199":
				flag = waitForElementVisibility(Gocallid199, waitTime);
				break;
			case "MyDuo":
				flag = waitForElementVisibility(MyDuo, waitTime);
				break;
			case "MySuperDuo":
				flag = waitForElementVisibility(MySuperDuo, waitTime);
				break;			
			case "Mobilenumfield":
				flag = waitForElementVisibility(Mobilenumfield, waitTime);
				break;
			case "Allaccess_data":
				flag = waitForElementVisibility(Allaccess_data, waitTime);
				break;
			case "Gowifi_access":
				flag = waitForElementVisibility(Gowifi_access, waitTime);
				break;
			case "List_ul":
				flag = waitForElementVisibility(List_ul, waitTime);
				break;
			case "Monthlycashout_header":
				flag = waitForElementVisibility(Monthlycashout_header, waitTime);
				break;
			case "Plan_name":
				flag = waitForElementVisibility(Plan_name, waitTime);
				break;
			case "Plan_price":
				flag = waitForElementVisibility(Plan_price, waitTime);
				break;
			case "Addonsheader":
				flag = waitForElementVisibility(Addonsheader, waitTime);
				break;
			case "Monthlybillheader":
				flag = waitForElementVisibility(Monthlybillheader, waitTime);
				break;
			case "starterbanner1":
				flag = waitForElementVisibility(starterbanner1, waitTime);
				break;
			case "starterbanner2":
				flag = waitForElementVisibility(starterbanner2, waitTime);
				break;
			case "starterbanner3":
				flag = waitForElementVisibility(starterbanner3, waitTime);
				break;
			case "starterbanner4":
				flag = waitForElementVisibility(starterbanner4, waitTime);
				break;
			case "starterbanner5":
				flag = waitForElementVisibility(starterbanner5, waitTime);
				break;
			case "starterbanner6":
				flag = waitForElementVisibility(starterbanner6, waitTime);
				break;
			case "starterbanner7":
				flag = waitForElementVisibility(starterbanner7, waitTime);
				break;
			case "starterbanner8":
				flag = waitForElementVisibility(starterbanner8, waitTime);
				break;
			case "Bannerplus1":
				flag = waitForElementVisibility(Bannerplus1, waitTime);
				break;
			case "Bannerplus2":
				flag = waitForElementVisibility(Bannerplus2, waitTime);
				break;
			case "Bannerplus3":
				flag = waitForElementVisibility(Bannerplus3, waitTime);
				break;
			case "Bannerplus4":
				flag = waitForElementVisibility(Bannerplus4, waitTime);
				break;
			case "Bannerplus5":
				flag = waitForElementVisibility(Bannerplus5, waitTime);
				break;
			case "Bannerplus6":
				flag = waitForElementVisibility(Bannerplus6, waitTime);
				break;
			case "Bannerplus7":
				flag = waitForElementVisibility(Bannerplus7, waitTime);
				break;
			case "Bannerplus8":
				flag = waitForElementVisibility(Bannerplus8, waitTime);
				break;
			case "Bannerplus9":
				flag = waitForElementVisibility(Bannerplus9, waitTime);
				break;
			case "starterbanner1Always":
				flag = waitForElementVisibility(starterbanner1Always, waitTime);
				break;
			case "starterbanner2Always":
				flag = waitForElementVisibility(starterbanner2Always, waitTime);
				break;
			case "starterbanner3Always":
				flag = waitForElementVisibility(starterbanner3Always, waitTime);
				break;
			case "starterbanner4Always":
				flag = waitForElementVisibility(starterbanner4Always, waitTime);
				break;
			case "starterbanner5Always":
				flag = waitForElementVisibility(starterbanner5Always, waitTime);
				break;
			case "starterbanner6Always":
				flag = waitForElementVisibility(starterbanner6Always, waitTime);
				break;
			case "starterbanner7Always":
				flag = waitForElementVisibility(starterbanner7Always, waitTime);
				break;
			case "starterbanner8Always":
				flag = waitForElementVisibility(starterbanner8Always, waitTime);
				break;
			case "starterbanner9Always":
				flag = waitForElementVisibility(starterbanner9Always, waitTime);
				break;
	
	
	
			case "Reviewmyplan":
				flag = waitForElementVisibility(Reviewmyplan, waitTime);
				break;
			case "Dragbutton":
				flag = waitForElementVisibility(Dragbutton, waitTime);
				break;
			case "Banner1":
				flag = waitForElementVisibility(Banner1, waitTime);
				break;
			case "Planname":
				flag = waitForElementVisibility(Planname, waitTime);
				break;
			case "Plan_amount":
				flag = waitForElementVisibility(Plan_amount, waitTime);
				break;
			case "Subsandaddonheader":
				flag = waitForElementVisibility(Subsandaddonheader, waitTime);
				break;
			case "MyDuoaddon":
				flag = waitForElementVisibility(MyDuoaddon, waitTime);
				break;
			case "AmazonAddon":
				flag = waitForElementVisibility(AmazonAddon, waitTime);
				break;
			case "SURF":
				flag = waitForElementVisibility(SURF, waitTime);
				break;
			case "mysuperDuoAddon":
				flag = waitForElementVisibility(mysuperDuoAddon, waitTime);
				break;
	
			case "Totalsubsandaddons":
				flag = waitForElementVisibility(Totalsubsandaddons, waitTime);
				break;
			case "Totalsubsandaddons_amont":
				flag = waitForElementVisibility(Totalsubsandaddons_amont, waitTime);
				break;
			case "Monthlybill_header":
				flag = waitForElementVisibility(Monthlybill_header, waitTime);
				break;
			case "Monthlybill_amount":
				flag = waitForElementVisibility(Monthlybill_amount, waitTime);
				break;
			case "Monthly_payment":
				flag = waitForElementVisibility(Monthly_payment, waitTime);
				break;
			case "Monthlypayment_amount":
				flag = waitForElementVisibility(Monthlypayment_amount, waitTime);
				break;
			case "inputmoblienum":
				flag = waitForElementVisibility(inputmoblienum, waitTime);
				break;
			case "proceedbtn1":
				flag = waitForElementVisibility(proceedbtn1, waitTime);
				break;
			case "Banner2":
				flag=waitForElementVisibility(Banner2, waitTime);
				break;
			case "Gplan1799":
				flag=waitForElementVisibility(Gplan1799, waitTime);
				break;
			case "Planname1799":
				flag=waitForElementVisibility(planename1799, waitTime);
				break;
			case "planeamount1799":
				flag=waitForElementVisibility(planeamount1799, waitTime);
				break;
			case "monthlybillpay1799":
				flag=waitForElementVisibility(monthlybillpay1799, waitTime);
				break;
			case "monthlypaymentamount1799":
				flag=waitForElementVisibility(monthlypaymentamount1799, waitTime);
				break;
			case "panenameDAF":
				flag=waitForElementVisibility(panenameDAF, waitTime);
				break;
	
	
				//----- RONNIE SCRIPT START HERE-----
			case "BasicBanner1":
				flag = waitForElementVisibility(BasicBanner1, waitTime);
				break;
			case "BasicBanner2":
				flag = waitForElementVisibility(BasicBanner2, waitTime);
				break;
			case "BasicBanner3":
				flag = waitForElementVisibility(BasicBanner3, waitTime);
				break;
			case "BasicBanner4":
				flag = waitForElementVisibility(BasicBanner4, waitTime);
				break;
			case "BasicBanner5":
				flag = waitForElementVisibility(BasicBanner5, waitTime);
				break;
			case "BasicBanner6":
				flag = waitForElementVisibility(BasicBanner6, waitTime);
				break;
			case "BasicBanner7":
				flag = waitForElementVisibility(BasicBanner7, waitTime);
				break;
			case "BasicBanner8":
				flag = waitForElementVisibility(BasicBanner8, waitTime);
				break;
			case "BasicBanner9":
				flag = waitForElementVisibility(BasicBanner9, waitTime);
				break;
				/***************ADA  1 STARTS HERE**********************/
			case "GplanSimonlyPlanName":
				flag = waitForElementVisibility(GplanSimonlyPlanName, waitTime);
				break;
			case "SimOnly599GOCALLIDD199":
				flag = waitForElementVisibility(SimOnly599GOCALLIDD199, waitTime);
				break;
			case "Addonamount":
				flag = waitForElementVisibility(Addonamount, waitTime);
				break;
			case "Monthyaddon":
				flag = waitForElementVisibility(Monthyaddon, waitTime);
				break;
			case "Totalmontlypaymentsimonly":
				flag = waitForElementVisibility(Totalmontlypaymentsimonly, waitTime);
				break;
			case "showsAndMoviesToggle":
				flag = waitForElementVisibility(showsAndMoviesToggle, waitTime);
				break;
	
			case "AmazonprimeVideoaddon599":
				flag = waitForElementVisibility(AmazonprimeVideoaddon599, waitTime);
				break;
	
			case "viupremiuum599":
				flag = waitForElementVisibility(viupremiuum599, waitTime);
				break;
	
			case "spotifypremiuum599":
				flag = waitForElementVisibility(spotifypremiuum599, waitTime);
				break;
			case "TalkingovermessageAddOn":
				flag = waitForElementVisibility(TalkingovermessageAddOn, waitTime);
				break;
			case "lifestylemessageAddOn":
				flag = waitForElementVisibility(lifestylemessageAddOn, waitTime);
				break;
			case "testDataDisplayedInBreakdown":
				flag = waitForElementVisibility(testDataDisplayedInBreakdown, waitTime);
				break;
			case "nameOfThePlanInBreakDown":
				flag = waitForElementVisibility(nameOfThePlanInBreakDown, waitTime);
				break;
			case "contractDurationInBreakDown":
				flag = waitForElementVisibility(contractDurationInBreakDown, waitTime);
				break;
			case "allAccessDataInBreakDown":
				flag = waitForElementVisibility(allAccessDataInBreakDown, waitTime);
				break;
			case "goWifiAccessInBreakDown":
				flag = waitForElementVisibility(goWifiAccessInBreakDown, waitTime);
				break;
			case "call_TextInBreakdown":
				flag = waitForElementVisibility(call_TextInBreakdown, waitTime);
				break;
			case "planInclusionsInBreakdown":
				flag = waitForElementVisibility(planInclusionsInBreakdown, waitTime);
				break;
			case "KonsultaMDInBreakdown":
				flag = waitForElementVisibility(KonsultaMDInBreakdown, waitTime);
				break;
			case "MySuperDuoInBreakdown":
				flag = waitForElementVisibility(MySuperDuoInBreakdown, waitTime);
				break;
			case "AmazonPrimeVideoInBreakdown":
				flag = waitForElementVisibility(AmazonPrimeVideoInBreakdown, waitTime);
				break;
			case "ViuPremiumInBreakdown":
				flag = waitForElementVisibility(ViuPremiumInBreakdown, waitTime);
				break;
			case "EasyRoam":
				flag = waitForElementVisibility(EasyRoam, waitTime);
				break;
			case "GOCALLIDDInBreakdown":
				flag = waitForElementVisibility(GOCALLIDDInBreakdown, waitTime);
				break;
			case "TotalSubs_AddonsInBreakdown":
				flag = waitForElementVisibility(TotalSubs_AddonsInBreakdown, waitTime);
				break;
			case "MonthlyBillSub_AddonsInBreakdown":
				flag = waitForElementVisibility(MonthlyBillSub_AddonsInBreakdown, waitTime);
				break;
			case "MonthlyPaymentInBreakdown":
				flag = waitForElementVisibility(MonthlyPaymentInBreakdown, waitTime);
				break;
				/***************ADA  1 ENDS HERE**********************/
	
				//------------ RONNIE SCRIPT ENDS HERE --------------
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
			case "Disc_Basicbtn":
				flag = waitForElementClickable(Disc_starterbtn, waitTime);
				break;
			case "DiscooverPlus":
				flag = waitForElementClickable(DiscooverPlus, waitTime);
				break;
			case "Disc_starterbtn":
				flag = waitForElementClickable(Disc_starterbtn, waitTime);
				break;
			case "Dragbutton":
				flag = waitForElementClickable(Disc_starterbtn, waitTime);
				break;
			case "inputmoblienum":
				flag = waitForElementClickable(Disc_starterbtn, waitTime);
				break;
			case "proceedbtn1":
				flag = waitForElementClickable(Disc_starterbtn, waitTime);
				break;
				/***************ADA  1 STARTS HERE**********************/
			case "GplanSimonlyPlanName":
				flag = waitForElementVisibility(GplanSimonlyPlanName, waitTime);
				break;
			case "SimOnly599GOCALLIDD199":
				flag = waitForElementVisibility(SimOnly599GOCALLIDD199, waitTime);
				break;
			case "Addonamount":
				flag = waitForElementVisibility(Addonamount, waitTime);
				break;
			case "Monthyaddon":
				flag = waitForElementVisibility(Monthyaddon, waitTime);
				break;
			case "Totalmontlypaymentsimonly":
				flag = waitForElementVisibility(Totalmontlypaymentsimonly, waitTime);
				break;
			case "showsAndMoviesToggle":
				flag = waitForElementVisibility(showsAndMoviesToggle, waitTime);
				break;
			case "AmazonprimeVideoaddon599":
				flag = waitForElementVisibility(AmazonprimeVideoaddon599, waitTime);
				break;
			case "viupremiuum599":
				flag = waitForElementVisibility(viupremiuum599, waitTime);
				break;
	
			case "spotifypremiuum599":
				flag = waitForElementVisibility(spotifypremiuum599, waitTime);
				break;
			case "TalkingovermessageAddOn":
				flag = waitForElementVisibility(TalkingovermessageAddOn, waitTime);
				break;
			case "lifestylemessageAddOn":
				flag = waitForElementVisibility(lifestylemessageAddOn, waitTime);
				break;
				/***************ADA  1 ENDS HERE**********************/
	
			}
	
			return flag;
		}
		/********************************************************************************************************************************/
		public void moveToElement(String element) {
	
			WebElement ele = null;
	
			switch (element) {
			case "Disc_starterbtn":
				ele = DriverManager.getDriver().findElement(Disc_starterbtn);
				break;
			case "Device_strtr_btn":
				ele = DriverManager.getDriver().findElement(Device_strtr_btn);
				break;
			case "Mobilenumfield":
				ele = DriverManager.getDriver().findElement(Mobilenumfield);
				break;
			case "DiscooverPlus":
				ele = DriverManager.getDriver().findElement(DiscooverPlus);
				break;
	
			case "BasicBanner1":
				ele = DriverManager.getDriver().findElement(BasicBanner1);
				break;
			case "BasicBanner2":
				ele = DriverManager.getDriver().findElement(BasicBanner2);
				break;
			case "BasicBanner3":
				ele = DriverManager.getDriver().findElement(BasicBanner3);
				break;
			case "BasicBanner4":
				ele = DriverManager.getDriver().findElement(BasicBanner4);
				break;
			case "BasicBanner5":
				ele = DriverManager.getDriver().findElement(BasicBanner5);
				break;
			case "BasicBanner6":
				ele = DriverManager.getDriver().findElement(BasicBanner6);
				break;
			case "BasicBanner7":
				ele = DriverManager.getDriver().findElement(BasicBanner7);
				break;
			case "BasicBanner8":
				ele = DriverManager.getDriver().findElement(BasicBanner8);
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
		public boolean get_checkbox1()
		{
			return DriverManager.getDriver().findElement(Checkbox1).isSelected();
		}
		public boolean get_checkbox2()
		{
			return DriverManager.getDriver().findElement(Chockbox2).isSelected();
	
	
		}
		public boolean get_checkbox3()
		{
			return DriverManager.getDriver().findElement(Chockbox3).isSelected();
	
		}
		public boolean get_checkbox4()
		{
			return DriverManager.getDriver().findElement(Chockbox4).isSelected();
	
		}
		public boolean get_checkbox5()
		{
			return DriverManager.getDriver().findElement(Chockbox5).isSelected();
	
	
		}
		/********************************************************************************************************************************/
		public void clickOnElement(String type, String eleName, String ele) {
	
			try {
				switch (ele) {
				case "CarouselDeviceNextBtn":
					get_CarouselDeviceNextBtn().click();
					break;
				case "Disc_Basicbtn":
					get_Disc_Basicbtn().click();
					break;
				case "Disc_starterbtn":
					get_Disc_starterbtn().click();
					break;
				case "Build_btn":
					get_Build_btn().click();
					break;
				case "Device_strtr_btn":
					get_Device_strtr_btn().click();
					break;
				case "GCash_strtr_btn":
					get_GCash_strtr_btn().click();
					break;
				case "Simonly_strtr_btn":
					get_Simonly_strtr_btn().click();
					break;
				case "Alldata_strtr_btn":
					get_Alldata_strtr_btn().click();
					break;
				case "Data_addon":
					get_Data_addon().click();
					break;
				case "Data_checkbox":
					get_Data_checkbox().click();
					break;
				case "GSAddsurf99":
					get_GSAddsurf99().click();
					break;
				case "movie_addon":
					get_movie_addon().click();
					break;
				case "movie_checkbox":
					get_movie_checkbox().click();
					break;
				case "Amazonprime":
					get_Amazonprime().click();
					break;
				case "Viupremium":
					get_Viupremium().click();
					break;
				case "Spotifypremium":
					get_Spotifypremium().click();
					break;
				case "message_addon":
					get_message_addon().click();
					break;
				case "message_checkbox":
					get_message_checkbox().click();
					break;
				case "MyDuo":
					get_MyDuo().click();
					break;
				case "MySuperDuo":
					get_MySuperDuo().click();
					break;
				case "lifestyle_addon":
					get_lifestyle_addon().click();
					break;
				case "lifestyle_checkbox":
					get_lifestyle_checkbox().click();
					break;
				case "easyRoam":
					get_easyRoam().click();
					break;
				case "Gocallid199":
					get_Gocallid199().click();
					break;
				case "dropdown_Planbreakdwn":
					get_dropdown_Planbreakdwn().click();
					break;
				case "Proceedbtn":
					get_Proceedbtn().click();
					break;
				case "Disc_starterbtn_arrow":
					get_Disc_starterbtn_arrow().click();
					break;	
				case "Dragbutton":
					get_Dragbutton().click();
					break;		
				case "proceedbtn1":
					get_proceedbtn1().click();
					break;	
				case "Breakdown_proceedbutton":
					get_Breakdown_proceedbutton().click();
					break;
	
					/***************ADA  1 STARTS HERE**********************/
				case "showsAndMoviesToggle":
					get_showsAndMoviesToggle().click();
					break;
	
				case "AmazonprimeVideoaddon599":
					get_AmazonprimeVideoaddon599().click();
					break;
				case "spotifypremiuum599":
					get_spotifypremiuum599().click();
					break;
	
				case "viupremiuum599":
					get_viupremiuum599().click();
					break;
				case "TalkingovermessageAddOn":
					get_TalkingovermessageAddOn().click();
					break;
				case "lifestylemessageAddOn":
					get_lifestylemessageAddOn().click();
					break;
					/***************ADA  1 ENDS HERE**********************/
	
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
				case "esim":
			         jse.executeScript("arguments[0].click();", get_esim());		
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
