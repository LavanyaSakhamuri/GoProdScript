package globeOnline_renewal;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertTrue;


import java.util.LinkedHashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebElement;

import com.pages.renewal.Renewal_CustmizeplanPage;
import com.pages.renewal.renewal_landingpage;
import com.pages.renewal.Renewal_OrderTrackerPage;
import com.pages.renewal.Renewal_Otp_Page;
import com.pages.renewal.Renewal_PaymentPage;
import com.pages.renewal.Renewal_ProductDetails_Page;
import com.pages.renewal.Renewal_SuccessPage;

import globeOnline_CommonMethods.DriverManager;
import utility.Constant;

public class Renewal_commonmethods {

	private renewal_landingpage  DL = new renewal_landingpage();
	private Renewal_CustmizeplanPage CP = new Renewal_CustmizeplanPage();
	private Renewal_ProductDetails_Page PP = new Renewal_ProductDetails_Page();
	private Renewal_Otp_Page Otp = new Renewal_Otp_Page();
	private Renewal_PaymentPage PayP = new Renewal_PaymentPage();
	private Renewal_SuccessPage sucess = new Renewal_SuccessPage();
	private Renewal_OrderTrackerPage OT = new Renewal_OrderTrackerPage(); 

	String productName = "samsung";
	public static LinkedHashMap<String, String> Map = new LinkedHashMap<>();

	/****************************************************************************************************************/

	public void hoveronRenew() throws Exception {
		if (DL.isElementExist("Menu bar link - Renew", "link_Renew", 10)) {
			Thread.sleep(2000L);
			DL.moveToElement("link_Renew");
		}
		DL.isElementExist("Mobile post paid link", "link_MobilePostPaid", 10);

		DL.isElementExist("View all devices link", "link_ViewAllDevices", 10);
	}

	public void clickOnViewAllDevices() throws Exception {

		if (DL.isClickable("link_ViewAllDevices", 10)) {
			Thread.sleep(2000L);
			DL.clickOnElement("link", "View all Devices", "link_ViewAllDevices");
		}
		if (DL.isElementExist("Device Gallery text", "deviceGalleryText", 10)) {
			System.out.println("Able to direct to the device gallery page");
		}
		Thread.sleep(5000);

	}

	public void validatingDevicesPerPage() throws Exception {
		int noOfDevices = DL.get_FifteenDevicesPerPage();
		System.out.println(noOfDevices + "***************");
		if (noOfDevices == 15) {
			System.out.println("Able to display total of 15 devices per matrix");
		} else
			System.out.println("Not able to display 15 devices per matrix");

	}

	public void clickOnBackToTopButton() throws Exception {


		DL.isElementExist("Back to top button", "BackToTop_Button", 10);

		((JavascriptExecutor) DriverManager.getDriver()).executeScript(
				"arguments[0].scrollIntoView(true);", DL.get_BackToTop_Button());
		Thread.sleep(5000);   
		((JavascriptExecutor) DriverManager.getDriver()).executeScript(
				"arguments[0].scrollIntoView(true);", DL.get_BackToTop_Button());
		Thread.sleep(5000);
		((JavascriptExecutor)DriverManager.getDriver()).executeScript(
				"arguments[0].scrollIntoView(true);", DL.get_BackToTop_Button());
		Thread.sleep(5000);


		if (DL.isClickable("BackToTop_Button", 10)) { 
			Thread.sleep(2000L);
			DL.jsClick("Back to top button","BackToTop_Button"); 
		}

		Thread.sleep(5000);




		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		Long value = (Long) js.executeScript("return window.pageYOffset;");
		System.out.println(value); 
		if (value == 0) {
			System.out.println("Screen is able to auto navigate to the top"); }
		else
			System.out.println("Screen is not  able to auto navigate to the top");

		Thread.sleep(3000);


	}

	public void clickOnColourVariant() throws Exception {
		DL.isElementExist("Colour variant", "Color_Var", 10);

		((JavascriptExecutor) DriverManager.getDriver()).executeScript("arguments[0].scrollIntoView(true);",
				DL.get_Color_Var());
		Thread.sleep(4000);

		if (DL.isClickable("Color_Var", 10)) {
			Thread.sleep(2000L);
			DL.jsClick("Colour variant", "Color_Var");
			Thread.sleep(4000);
			System.out.println("Image showing device based on selected colour");
		}
	}

	public void clickOnSearchField() throws Exception {

		DriverManager.getDriver().navigate().refresh();
		Thread.sleep(15000);

		if(DL.isElementExist("Search field", "search_field", 10)) {
			System.out.println("search field Placed on top of the section");
			System.out.println("Has default text display");
		}

		System.out.println("Searching for" + productName);

		DL.get_search_field().sendKeys(productName);

		Thread.sleep(3000);

		if(DL.isElementExist("Recomendation text while seraching", "auto_search", 10)) {
			DL.jsClick("auto_search", "auto_search");
		}

		Thread.sleep(5000);

		DL.isElementExist("Searched device", "searched_Device", 10);



		DL.isElementExist("X button", "X_Button", 10);

		JavascriptExecutor jse = (JavascriptExecutor) DriverManager.getDriver();
		jse.executeScript("arguments[0].click();", DL.get_X_Button());
		Thread.sleep(3000);
		if(DL.isElementExist("X button", "X_Button", 10)) {
			System.out.println("Not Able to clear search results");		
		}
		else
			System.out.println("Able to clear search results");

		System.out.println("Searching for brand Guchi");

		DL.get_search_field().sendKeys("Guchi");

		Thread.sleep(3000);

		DL.get_search_field().sendKeys(Keys.ENTER);
		Thread.sleep(8000);

		DL.isElementExist("Not available msg", "notAvailable_Msg", 10);
	}

	public void searchingOutofStockItem() throws Exception {

		JavascriptExecutor jse = (JavascriptExecutor) DriverManager.getDriver();
		jse.executeScript("arguments[0].click();", DL.get_X_Button());

		Thread.sleep(3000);

		System.out.println("Searching for Apple iPhone 13 Pro which is out of stock ");
		DL.get_search_field().sendKeys("Apple iPhone 13 Pro");

		DL.get_search_field().sendKeys(Keys.ENTER);
		Thread.sleep(8000);

		DL.isElementExist("Out of stock text", "outOfStockText", 10);

		jse.executeScript("arguments[0].click();", DL.get_X_Button());

		Thread.sleep(3000);

		System.out.println("Entering a keyword without click on search icon & scroll down the end of the page");

		DL.get_search_field().sendKeys("Samsung");

		((JavascriptExecutor) DriverManager.getDriver()).executeScript("arguments[0].scrollIntoView(true);",
				DL.get_aboutUs());
		Thread.sleep(4000);

		((JavascriptExecutor) DriverManager.getDriver()).executeScript("arguments[0].scrollIntoView(true);",
				DL.get_search_field());

		if (DL.isElementExist("X button", "X_Button", 10)) {
			System.out.println("Entered keyword remained in the search bar only");

		}

		jse.executeScript("arguments[0].click();", DL.get_X_Button());

		Thread.sleep(3000);

		System.out.println("Searching for keyword 14");
		DL.get_search_field().sendKeys("14");

		DL.get_search_field().sendKeys(Keys.ENTER);

		if (DL.isElementExist("Relevant Item", "relevantItem", 10)) {
			System.out.println("Able to dosplay most relevant items first");
		}

		jse.executeScript("arguments[0].click();", DL.get_X_Button());

	}

	public void validateSortDropDown() throws Exception {

		DL.isElementExist("Sort Drop down", "sortDropDown", 10);

		// if(DL.isClickable("sortDropDown",10)) {
		// DL.clickOnElement("DropDown","sort DropDown","sortDropDown");

		// }

		JavascriptExecutor jse = (JavascriptExecutor) DriverManager.getDriver();
		jse.executeScript("arguments[0].click();", DL.get_sortDropDown());

		DL.isElementExist("priceHightoLow", "priceHightoLow", 10);
		DL.isElementExist("priceLowtoHigh", "priceLowtoHigh", 10);
		DL.isElementExist("featuredProducts", "featuredProducts", 10);

	}

	public void collapseFilter() throws Exception {
		DL.isElementExist("Collapse Filter", "collapse_Filter", 10);


		if(DL.isClickable("collapse_Filter",10)) {
			DL.jsClick("collapse Filter", "collapse_Filter");
			System.out.println("Able to show case only icons"); }


		/*DL.jsClick("collapse Filter", "collapse_Filter");
		System.out.println("Able to show case only icons");*/
		Thread.sleep(5000);

		JavascriptExecutor jse = (JavascriptExecutor) DriverManager.getDriver();
		jse.executeScript("arguments[0].click();", DL.get_collapse_Filter());

		DL.isElementExist("product Type", "productType", 10);
		DL.isElementExist("plan Value", "planValue", 10);
		DL.isElementExist("brand", "brand", 10);

		if (DL.isElementExist("clear filters Disabled", "clear_filters_Disabled", 10)) {
			System.out.println("All check boxes are unticked by default");
		}

		if (DL.isClickable("planValue", 10)) {
			DL.jsClick("Plan value filter", "planValue");
		}

		if (DL.isClickable("PlanValue_radioButton", 10)) {
			DL.jsClick("Radio button", "PlanValue_radioButton");
		}

		if (DL.isClickable("brand", 10)) {
			DL.jsClick("Brand Filter", "brand");
		}

		// jse.executeScript("arguments[0].click();", DL.get_brand_radioButton());

		DL.jsClick("Nokia radio button", "brand_radioButton");

		DL.jsClick("Apply Filter Button", "applyFilter_Button");

		if (DL.isElementExist("Huawei nova ", "planWithDevice", 10)) {
			System.out.println("Able to show the result based on selected filter");
		}

		if (DL.isClickable("clear_filters", 10)) {
			DL.jsClick("Clear filters", "clear_filters");
		}

		if (DL.isElementExist("clear filters Disabled", "clear_filters_Disabled", 10)) {
			System.out.println("Able to Reset the filter option back to its original state");
		}

		Thread.sleep(5000);

		// hover on renewal tab
		/*
		 * if (DL.isElementExist("Menu bar link - Renew", "link_Renew", 10)) {
		 * Thread.sleep(2000L); DL.moveToElement("link_Renew"); }
		 * 
		 * //click on view all devices if (DL.isClickable("link_ViewAllDevices", 10)) {
		 * Thread.sleep(2000L);
		 * DL.clickOnElement("link","View all Devices","link_ViewAllDevices"); }
		 * Thread.sleep(5000);
		 */
	}

	public void selectingPlanValue(int n) throws Exception {

		if (DL.isClickable("planValue", 10)) {
			System.out.println("****************WE ARE IN DEVICE GALLERY PAGE******************");
			DL.clickOnElement("Filter", "Plan value", "planValue");
			System.out.println("Selecting plan value for the device");
			// JavascriptExecutor js2 = (JavascriptExecutor) DriverManager.getDriver();
			// js2.executeScript("arguments[0].click();", DL.get_Planvale_dropdownbtn());
		}

		DriverManager.getDriver()
		.findElement(By.xpath("(//h2[text()='" + n + "']//following::input[@type='radio'])[1]")).click();
	}

	public void clickOnApplyFilter() throws Exception {

		if (DL.isElementExist("applyFilter_Button","applyFilter_Button", 10)) {
			DL.jsClick("Apply Filter ", "applyFilter_Button");
		}

	}


	public void searchingDevice(String device) throws Exception {

		System.out.println("Searching for "+device);
		DL.get_search_field().sendKeys(device);
		Thread.sleep(5000);

		DL.get_search_field().sendKeys(Keys.ENTER);
		Thread.sleep(5000);

		if (DriverManager.getDriver()
				.findElement(By.xpath("(//h2[text()='" + device + "']//following::input[@type='radio'])[1]"))
				.isDisplayed()) {
			System.out.println("Able to display searched device:"+device);
		}
	}

	public void validateFilterList() throws Exception {

		DriverManager.getDriver().navigate().refresh();

		if (DL.isElementExist("clear filters Disabled", "clear_filters_Disabled", 15)) {
			System.out.println("All check boxes are unticked");
		}

		if (DL.isElementExist("product Type Filter", "productType", 10)) {
			DL.jsClick("Product type filter", "productType");
			DL.jsClick("Smart phone Radio button", "Smart_Phone");
			DL.jsClick("Watch Radio button", "watch");
			System.out.println("Able to select multi/single type");

		}

		if (DL.isElementExist("planValue Filter","planValue", 10)) {
			DL.jsClick("Plan value", "planValue");
			DL.jsClick("Plan value 999 Radio button", "PlanValue999_radioButton");
			System.out.println("Able to select single type");

		}

		((JavascriptExecutor) DriverManager.getDriver()).executeScript("arguments[0].scrollIntoView(true);",
				DL.get_brand());

		Thread.sleep(3000);

		if (DL.isElementExist("brand Filter","brand", 10)) {
			DL.jsClick("Brand Filter", "brand");
			DL.jsClick("Huawei radio button", "huaweibrand_radioButton");
			DL.jsClick("Oppo Radio button", "Brand_Oppo");
			System.out.println("Able to select multi/single type");

		}

		DL.isElementExist("Apply Filter Button", "applyFilter_Button", 10);


		/* if(DL.isElementExist("Clear Filter Button", "clear_filters", 10)) {
		    DL.jsClick("Clear filters","clear_filters"); }*/

		DriverManager.getDriver().navigate().refresh();
		Thread.sleep(10000);


	}

	public void featureProductsValidation() throws Exception {
		if (DL.isElementExist("Feature_Products Filter","Feature_Products", 10)) {
			DL.jsClick("Feature_Products", "Feature_Products");
			DL.jsClick("BestSeller_Radio", "BestSeller_Radio");
		}	

		if(DL.isElementExist("BestsellerTag", "BestsellerTag", 10)) {
			System.out.println("Able to display list of best seller tagging devices");
		}
		DriverManager.getDriver().navigate().refresh();
		Thread.sleep(10000);

	}

	public void selectMultiFilter() throws Exception {

		if (DL.isElementExist("brand Filter","brand", 10)) {
			DL.jsClick("Brand Filter", "brand");
			DL.jsClick("applebrand_radioButton", "applebrand_radioButton");
		}

		if (DL.isElementExist("product Type Filter", "productType", 10)) {
			DL.jsClick("Product type filter", "productType");
			DL.jsClick("watch product type", "watch");
		}

		if(DL.isElementExist("appleWatchDevices", "appleWatchDevices", 10)) {
			List<WebElement> devices = DL.get_appleWatchDevices();
			System.out.println("Displayed  "+devices.size()+"  Apple Watch devices in the first matrix");
		}
		DriverManager.getDriver().navigate().refresh();
		Thread.sleep(10000);

	}

	public void clickOnMagnifyingGlass(String device) throws Exception {

		Thread.sleep(2000L);
		((JavascriptExecutor) DriverManager.getDriver()).executeScript(
				"arguments[0].scrollIntoView(true);", DL.get_magnifybutton());
		Thread.sleep(3000);

		DL.jsClick("Magnify link", "magnifybutton");

		Thread.sleep(5000);

		//assertTrue(DriverManager.getDriver().getCurrentUrl().contains(device));
		System.out.println("Validated Url : per device");
	}

	public void validateProductDetails() throws Exception {

		if(PP.isElementExist("Product details link", "productDetails", 10)) {
			System.out.println("*****************WE ARE IN PRODUCT DETAILS PAGE******************");
		}

		PP.isElementExist("product Gallery link", "productGallery", 10);

		PP.isElementExist("Device Name", "deviceNameinPDPage",10);
		String deviceName = PP.get_deviceNameinPDPage().getText();
		System.out.println("Device seleted:"+deviceName);

		//List<WebElement> colors = PP.get_color_Finish();
		//int size = colors.size();



		PP.isElementExist("Device capacity", "capacity",10);
		String devicecapacity = PP.get_capacity().getText();
		System.out.println("Capacity of the device is:"+devicecapacity);

		PP.isElementExist("Contract Duration", "contractDuration",10);
		String contractDuration = PP.get_contractDuration().getText();
		System.out.println("Contract duration  of the device is:"+contractDuration);

		PP.isElementExist("Available For Delivery", "availableForDelivery",10);
		PP.isElementExist("Discover Gplan Below link", "discoverGplanBelow",10);

//		//redirect to discover after click on discovergplanbelow link
//		((JavascriptExecutor) DriverManager.getDriver()).executeScript(
//				"arguments[0].scrollIntoView(true);", PP.get_discoverGplanBelow());
//		Thread.sleep(4000);
//		PP.jsClick(" Discover Gplan Link", "discoverGplanBelow");
//		Thread.sleep(4000);
//		if(PP.isElementExist("Build My Plan button", "buildMyPlan", 10)) {
//			System.out.println("Redirected to discovery page of the corresponding plan");
//		}
//
//		//navigate back to PDP page
//		DriverManager.getDriver().navigate().back();

		PP.isElementExist("Plan Card", "planCard",10);
		PP.isElementExist("RenewWithThisDevice", "renewwithThisDevice",10);
		PP.isElementExist("SelectAnotherDevice", "selectAnotherDevice",10);
		PP.isElementExist("Features", "features",10);
		PP.isElementExist("Promos", "promos",10);

		//Validate FAQ's
		PP.isElementExist("FaqText1", "faqText1",10);
		PP.isElementExist("FaqText2", "faqText2",10);
		PP.isElementExist("FaqText3", "faqText3",10);
		PP.isElementExist("FaqText4", "faqText4",10);
		PP.isElementExist("FaqText5", "faqText5",10);
		PP.isElementExist("FaqText6", "faqText6",10);	

	}

	public void clickOnRenewWithThisDevice() throws Exception {

		((JavascriptExecutor) DriverManager.getDriver()).executeScript(
				"arguments[0].scrollIntoView(true);", PP.get_renewwithThisDevice());
		Thread.sleep(4000);
		PP.jsClick("Renew with this device button", "renewwithThisDevice");
		Thread.sleep(5000);		
	}

	public void insertMobileNumberandValidateOtpPage(String mobileNumber) throws Exception {

		Otp.isElementExist("verificationNeeded", "verificationNeeded", 10);
		Otp.isElementExist("codeExpiresIn", "codeExpiresIn", 10);
		Otp.isElementExist("privacyPolicy", "privacyPolicy", 10);
		Otp.isElementExist("enterYourMobileNumber", "enterYourMobileNumber", 10);

		Constant.dataMap.set(Map);
		if(Otp.isElementExist("mobileNumField", "mobileNumField", 10)) {
			Otp.get_mobileNumField().clear();
			Otp.get_mobileNumField().sendKeys(mobileNumber); 		
		}
		Constant.dataMap.get().put("OMT_MobileNumber", mobileNumber);

		if(Otp.isElementExist("getCodeButton", "getCodeButton", 10)) {
			Otp.jsClick("getCodeButton", "getCodeButton");
		}

		Thread.sleep(3000);
	}


	public void handle_and_insert_OTP() throws InterruptedException {
		if (Otp.isElementExist("otpInput", "otpInput", 10)) {
			Thread.sleep(15000);
			if (Otp.isElementExist("cantSendOtp", "cantSendOtp", 15)) {
				Otp.jsClick("getCodeButton", "getCodeButton");		
				Thread.sleep(20000);
				for (int j = 0; j < Otp.get_otpInput().size(); j++) {
					Otp.get_otpInput().get(j).sendKeys(String.valueOf(j + 1));
				}
			} else
				for (int j = 0; j < Otp.get_otpInput().size(); j++) {
					Otp.get_otpInput().get(j).sendKeys(String.valueOf(j + 1));
				}
			System.out.println("Inserted OTP");
		}


		if(Otp.isElementExist("submitButton", "submitButton", 10)) {

			Otp.jsClick("submitButton", "submitButton");
		}
	}
	
	public void OTPPage_(String b) throws InterruptedException {

		//assertTrue(DriverManager.getDriver().getTitle().contains("One-Time Password"));

		System.out.println("Navigated to OTP page ");

		String number = String.valueOf(b);

		String[] digits = number.split("(?<=.)");
        Thread.sleep(15000);
		for (int i = 0; i <= 5; i++) {
			
			Otp.get_otpInput().get(i).sendKeys(digits[i]);
		}
			if(Otp.isElementExist("submitButton", "submitButton", 10)) {

				Otp.jsClick("submitButton", "submitButton");
			}
		
	}

	public void loadingScreenValidation() throws InterruptedException {
		Otp.isElementExist("renewalProcessing", "renewalProcessing", 10);
		Otp.isElementExist("checkingOutstandingBalance", "checkingOutstandingBalance", 10);
		Thread.sleep(10000);
		Otp.isElementExist("checkingYourEligibility", "checkingYourEligibility", 10);
		Thread.sleep(60000);
	}


	public void customizePlanValidation() throws InterruptedException {

		if(CP.isElementExist("Customize Plan Text","customizePlan", 10)) {
			System.out.println("We are in Customize Plan Page");
		}

		CP.isElementExist("Gplan 599 With Device","gplan599WithDevice", 10);
		CP.isElementExist("Choose Your Phone","chooseYourPhone", 10);

		String device_Name = CP.get_deviceName().getText();
		System.out.println("Device Selcted:"+device_Name);

		CP.isElementExist("Device Details Text","deviceDetails", 10);

		if(CP.isElementExist("specifications Text","specifications", 10)) {

			if(CP.isElementExist("Screen Size","screenSize", 10)) {
				String screen_Size = CP.get_screenSize().getText();
				System.out.println("Screen Size of the device:"+screen_Size);
			}

			if(CP.isElementExist("camera","camera", 10)) {
				String camera = CP.get_camera().getText();
				System.out.println("Camera details of the device:"+camera);
			}

			if(CP.isElementExist("battery","battery", 10)) {
				String battery = CP.get_battery().getText();
				System.out.println("Battery details of the device:"+battery);
			}

			if(CP.isElementExist("memory","memory", 10)) {
				String memory = CP.get_memory().getText();
				System.out.println("Memory details of the device:"+memory);
			}

			if(CP.isElementExist("Front Camera","frontCamera", 10)) {
				String front_Camera = CP.get_frontCamera().getText();
				System.out.println("Front Camera details of the device:"+front_Camera);
			}

			if(CP.isElementExist("RAM","RAM", 10)) {
				String RAM = CP.get_RAM().getText();
				System.out.println("RAM details of the device:"+RAM);
			}
		}

		CP.isElementExist("Hide Details link","hideDetails", 10);
		CP.isElementExist("Show More Devices Button","showMoreDevices", 10);
		CP.isElementExist("Change Link For Plans","changeLinkForPlans", 10);

		if(CP.isElementExist("Prefer eSIM Or Physical SIMCard","PrefereSIMOrPhysicalSIMCard", 10)) {
			CP.jsClick("physicalSimCard", "physicalSimCard");
		}

		if(CP.isElementExist("all_AccessData","all_AccessData", 10)) {
			String all_AccessData = CP.get_all_AccessData().getText();
			System.out.println("all_AccessData details of the device:"+all_AccessData);
		}

		if(CP.isElementExist("GoWifi_Access","GoWifi_Access", 10)) {
			String GoWifi_Access = CP.get_GoWifi_Access().getText();
			System.out.println("GoWifi_Access details of the device:"+GoWifi_Access);
		}

		if(CP.isElementExist("Contract_duration","Contract_duration", 10)) {
			String Contract_duration = CP.get_Contract_duration().getText();
			System.out.println("Contract_duration details of the device:"+Contract_duration);
		}

		CP.isElementExist("Call_and_text","Call_and_text", 10);
		CP.isElementExist("Inclusions Text","Inclusions", 10);
		CP.isElementExist("KonsultaMD","KonsultaMD", 10);
		CP.isElementExist("iQIYI","iQIYI", 10);
		CP.isElementExist("weTV","weTV", 10);

		CP.isElementExist("chooseContractDuration","chooseContractDuration", 10);
		CP.isElementExist("chooseYourColor","chooseYourColor", 10);
		CP.isElementExist("deviceColors","deviceColors", 10);


		if(CP.isElementExist("chooseStorageCapacity","chooseStorageCapacity", 10)) {
			String StorageCapacity = CP.get_chooseStorageCapacity().getText();
			System.out.println("Storage Capacity details of the device:"+StorageCapacity);
		}

		CP.isElementExist("Pick Your Add_ons Text","pickYourAdd_ons", 10);
		CP.isElementExist("Add_ons_Go_On_TopOfYour_Month Text","add_ons_Go_On_TopOfYour_Month", 10);

		if(CP.isElementExist("Do_you_use_lots_of_data","Do_you_use_lots_of_data", 10)) {
			((JavascriptExecutor) DriverManager.getDriver()).executeScript(
					"arguments[0].scrollIntoView(true);", CP.get_Do_you_use_lots_of_data());
			Thread.sleep(3000);
			CP.jsClick("Do_you_use_lots_of_data", "Do_you_use_lots_of_data");
			CP.jsClick("GS_Add_Surf_99", "GS_Add_Surf_99");
		}

		if(CP.isElementExist("Do_you_love_watching_shows_and_movies","Do_you_love_watching_shows_and_movies", 10)) {
			((JavascriptExecutor) DriverManager.getDriver()).executeScript(
					"arguments[0].scrollIntoView(true);", CP.get_Do_you_love_watching_shows_and_movies());
			Thread.sleep(3000);
			CP.jsClick("Amazon_Prime_Video", "Amazon_Prime_Video");
			CP.jsClick("Viu_Premium", "Viu_Premium");
		}

		if(CP.isElementExist("Prefer_talking_over_messaging","Prefer_talking_over_messaging", 10)) {
			((JavascriptExecutor) DriverManager.getDriver()).executeScript(
					"arguments[0].scrollIntoView(true);", CP.get_Prefer_talking_over_messaging());
			Thread.sleep(3000);
			CP.jsClick("My_Super_Duo", "My_Super_Duo");
		}

		if(CP.isElementExist("Are_you_all_about_the_jet_setting_lifestyle","Are_you_all_about_the_jet_setting_lifestyle", 10)) {
			((JavascriptExecutor) DriverManager.getDriver()).executeScript(
					"arguments[0].scrollIntoView(true);", CP.get_Are_you_all_about_the_jet_setting_lifestyle());
			Thread.sleep(3000);
			CP.jsClick("Easy_Roam", "Easy_Roam");
			CP.jsClick("GOCALLIDD_199", "GOCALLIDD_199");
		}

		CP.isElementExist("Shipping Address Text","shippingAddress", 10);
		CP.isElementExist("Change Link For Address Text","changeLinkForAddress", 10);
	}


	public void seeMyNewPlanValidation() throws InterruptedException {

		if(CP.isElementExist("See_my_new_plan","See_my_new_plan", 10)) {
			CP.jsClick("See_my_new_plan", "See_my_new_plan");
		}

		CP.isElementExist("gplan599With_Device","gplan599With_Device", 10);
		if(CP.isElementExist("nameOfDevice","nameOfDevice", 10)) {
			String NameOfDevice = CP.get_nameOfDevice().getText();
			System.out.println("Name of the device selected:"+NameOfDevice);  		
		}

		CP.isElementExist("subscriptionsandAddons","subscriptionsandAddons", 10);
		CP.isElementExist("GSAddSurf","GSAddSurf", 10);
		CP.isElementExist("AmazonPrimeVideo","AmazonPrimeVideo", 10);
		CP.isElementExist("ViuPremium","ViuPremium", 10);
		CP.isElementExist("MySuperDuo","MySuperDuo", 10);
		CP.isElementExist("EasyRoam","EasyRoam", 10);
		CP.isElementExist("GOCALLIDD","GOCALLIDD", 10);

		if(CP.isElementExist("Totalsubscriptionsandaddons","Totalsubscriptionsandaddons", 10)) {
			String costOfSubscriptions = CP.get_Totalsubscriptionsandaddons().getText();
			System.out.println("Total subscriptions and addons cost:"+costOfSubscriptions);  		
		}

		if(CP.isElementExist("MonthlyPayment","MonthlyPayment", 10)) {
			String MonthlyPayment = CP.get_MonthlyPayment().getText();
			System.out.println("MonthlyPayment :"+MonthlyPayment);  		
		}

		CP.isElementExist("Monthlypaymentincludes","Monthlypaymentincludes", 10);

		if(CP.isElementExist("RenewingFor","RenewingFor", 10)) {
			String renewingFor = CP.get_RenewingFor().getText();
			System.out.println("Renewing For :"+renewingFor);  		
		}

		CP.isElementExist("AllAccessData","AllAccessData", 10);
		CP.isElementExist("GoWifiAccess","GoWifiAccess", 10);
		CP.isElementExist("Callandtext","Callandtext", 10);
		CP.isElementExist("ContractDuration","ContractDuration", 10);
		CP.isElementExist("FreesubscriptiontoKonsultaMD","FreesubscriptiontoKonsultaMD", 10);
		CP.isElementExist("ThreemonthVIPAccesstoiQIYI","ThreemonthVIPAccesstoiQIYI", 10);
		CP.isElementExist("ThreemonthVIPAccesstoweTV","ThreemonthVIPAccesstoweTV", 10);

		if(CP.isElementExist("SelectPlan","SelectPlan", 10)) {
			CP.jsClick("SelectPlan", "SelectPlan"); 		
		} 

		Thread.sleep(10000);
	}

	public void payPageValidation() throws InterruptedException {

		if(PayP.isElementExist("payText","payText", 10)) {
			System.out.println("*********************We are in payment page***********************");		
		}

		PayP.isElementExist("howWouldYouLikeToPay","howWouldYouLikeToPay", 10);
		PayP.isElementExist("chargeToBill","chargeToBill", 10);
		PayP.isElementExist("OneTimePayment","OneTimePayment", 10);
		PayP.isElementExist("Installment Is Available Only For Selected CreditCards","installmentIsAvailableOnlyFoSelectCreditCards", 10);
		PayP.isElementExist("Supporting Document Needed please prepare your POFC","supportingDocumentNeeded", 10);

		PayP.isElementExist("planType","planType", 10);
		PayP.isElementExist("Change Link for plans & addons","ChangeLink", 10);
		PayP.isElementExist("AllAccessData","AllAccessData", 10);
		PayP.isElementExist("GoWifiAccess","GoWifiAccess", 10);
		PayP.isElementExist("Call_Text","Call_Text", 10);
		PayP.isElementExist("ContractDuration","ContractDuration", 10);

		//inclusions
		PayP.isElementExist("Inclusions Text","Inclusions", 10);
		PayP.isElementExist("KonsultaMD","KonsultaMD", 10);
		PayP.isElementExist("VIPAccessToiQIYI","VIPAccessToiQIYI", 10);
		PayP.isElementExist("VIPAccessToWeTV","VIPAccessToWeTV", 10);

		//AddonsAndSubscriptions
		PayP.isElementExist("Addons And Subscriptions Text","AddonsAndSubscriptions", 10);
		PayP.isElementExist("GSAddSurf","GSAddSurf", 10);
		PayP.isElementExist("AmazonPrimeVideo","AmazonPrimeVideo", 10);
		PayP.isElementExist("ViuPremium","ViuPremium", 10);
		PayP.isElementExist("MySuperDuo","MySuperDuo", 10);
		PayP.isElementExist("EasyRoam","EasyRoam", 10);
		PayP.isElementExist("GOCALLIDD","GOCALLIDD", 10);
		PayP.isElementExist("Change Link For Address","ChangeLinkForAddress", 10);

		if(PayP.isElementExist("defaultshippingAddress","defaultshippingAddress", 10)) {
			String shippingAddress = PayP.get_defaultshippingAddress().getText();
			System.out.println("Default shipping address:"+shippingAddress);  		
		}

		PayP.isElementExist("This Is What Your Monthly Bill Will Look Like Text","thisIsWhatYourMonthlyBillWillLookLike", 10);

		if(PayP.isElementExist("showBreakdown","showBreakdown", 10)) {
			PayP.jsClick("showBreakdown", "showBreakdown");
		}

		if(PayP.isElementExist("shippingFee","shippingFee", 10)) {
			String shippingFee = PayP.get_shippingFee().getText();
			System.out.println("Shipping Fee: "+shippingFee);  		
		}

		if(PayP.isElementExist("monthlyBill","monthlyBill", 10)) {
			String monthlyBill = PayP.get_monthlyBill().getText();
			System.out.println("monthlyBill: "+monthlyBill);  		
		}

		if(PayP.isElementExist("hideBreakdown","hideBreakdown", 10)) {
			PayP.jsClick("hideBreakdown", "hideBreakdown");
		}

		PayP.isElementExist("This Is What Your Monthly Bill Will Look Like Text","thisIsWhatYourMonthlyBillWillLookLike", 10);

		if(PayP.isElementExist("viewBreakdown","viewBreakdown", 10)) {
			PayP.jsClick("viewBreakdown", "viewBreakdown");
		}

		if(PayP.isElementExist("deviceSelected","deviceSelected", 10)) {
			String deviceSelected = PayP.get_deviceSelected().getText();
			System.out.println("Device Selected: "+deviceSelected);  		
		}

		if(PayP.isElementExist("costOfDevice","costOfDevice", 10)) {
			String costOfDevice = PayP.get_costOfDevice().getText();
			System.out.println("Cost Of Device: "+costOfDevice);  		
		}

		if(PayP.isElementExist("Shipping","Shipping", 10)) {
			String Shipping = PayP.get_Shipping().getText();
			System.out.println("Shipping: "+Shipping);       	  	
		}

		if(PayP.isElementExist("totalAmountToPay","totalAmountToPay", 10)) {
			String totalAmountToPay = PayP.get_totalAmountToPay().getText();
			System.out.println("Total Amount To Pay: "+totalAmountToPay);       	  	
		}
	}


	public void selectPayment(String PayMode) throws InterruptedException {

		PayP.isElementExist("How Will You Be Paying Text","howWillYouBePaying", 10);

		switch (PayMode) {
		case "Visa_MasterCard":
			PayP.jsClick("Visa_MasterCard", "Visa_MasterCard");
			break;
		case "GCash":
			PayP.jsClick("GCash", "GCash");
			break;
		case "cashOnDelivery":
			PayP.jsClick("cashOnDelivery", "cashOnDelivery");
			break;
		default :
			System.out.println("Given mode of payment not exist");
		} 
	}

	public void uploadPOFC() throws InterruptedException {

		if(PayP.isElementExist("Proof Of Financial Capacity Text", "ProofOfFinancialCapacity", 10)) {
			
			PayP.isElementExist("Your Chosen Plan MayBe Above Your Current Spending Limit text", "YourChosenPlanMayBeAboveYourCurrentSpendingLimit", 10);
			PayP.isElementExist("pofcDropdown", "pofcDropdown", 10);
	
			PayP.scroll_vertical(130);
			Thread.sleep(2000L);
			String POFC = "BIR Form 1700";
			PayP.Select_dropdown(POFC); 
			System.out.println("Select ID type: "+POFC);
	
			PayP.isElementExist("uploadScannedCopy", "uploadScannedCopy", 10);
			PayP.isElementExist("Maximum File Size Is 10MB", "MaximumFileSizeIs10MB", 10);
			PayP.isElementExist("Photos Must be In PNG, JPG, GIF,HEIC, PDF Format", "PhotosMustbeInPNG_JPG_GIF_HEIC_PDF_Format", 10);
			PayP.isElementExist("Make Sure Your Document Is Clear", "MakeSureYourDocumentIsClear", 10);
			PayP.isElementExist("Make Sure The Image Is Not Blurred And Not Cropped", "MakeSureTheImageIsNotBlurredAndNotCropped", 10);
	
			Thread.sleep(3000);
	}
		try
		{
			WebElement addFile = DriverManager.getDriver().findElement(By.xpath("//input[@id='pofcDocRef']"));
			((RemoteWebElement)addFile).setFileDetector(new LocalFileDetector());
			addFile.sendKeys(System.getProperty("user.dir")+"\\resources\\Documents\\POFCNEW.jpg");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		Thread.sleep(3000);
	}

	public void submitorder() throws InterruptedException {

		PayP.isElementExist("Select Delivery Method Text", "SelectDeliveryMethod", 10);
		PayP.isElementExist("StandardDelivery", "StandardDelivery", 10);
		PayP.isElementExist("FlatRate", "FlatRate", 10);

		PayP.jsClick("StandardDelivery", "StandardDelivery");

		if(PayP.isElementExist("IAcceptAllTerms_Conditions", "IAcceptAllTerms_Conditions", 10)) {
			PayP.jsClick("IAcceptAllTerms_Conditions", "IAcceptAllTerms_Conditions");			
		}

		if(PayP.isElementExist("SubmitOrder", "SubmitOrder", 10)) {
			PayP.jsClick("SubmitOrder", "SubmitOrder");			
		} 	

		Thread.sleep(80000);
	}

	public void enterPaymentdetails(String payMethod, String gcashNum ) throws InterruptedException {
      if(payMethod.equals("gcash")) {
		if(PayP.isElementExist("Merchant", "Merchant", 10)) {
			String Merchant = PayP.get_Merchant().getText();
			System.out.println("Merchant: "+Merchant);
		}

		if(PayP.isElementExist("AmountDue", "AmountDue", 10)) {
			String AmountDue = PayP.get_AmountDue().getText();
			System.out.println("AmountDue: "+AmountDue);
		}

		PayP.isElementExist("LoginToPayWithGCash", "LoginToPayWithGCash", 10);

		if(PayP.isElementExist("NumberField", "NumberField", 10)) {
			PayP.get_NumberField().sendKeys(gcashNum);		
		} 

		PayP.jsClick("nextButton", "nextButton");			

		Thread.sleep(10000);

		if (PayP.isElementExist("Enteryour4digitMPIN", "Enteryour4digitMPIN", 30)) {
			for (int j = 1; j <=4; j++) {
				PayP.get_gcashPin().sendKeys("1");			
			}
		}

		PayP.jsClick("nxtButton", "nxtButton");	

		Thread.sleep(50000);

		if(PayP.isElementExist("GCashBalance", "GCashBalance", 10)) {
			String GCashBalance = PayP.get_GCashBalance().getText();
			System.out.println("GCashBalance: "+GCashBalance);
		}

		PayP.jsClick("Agree Button", "agree");	

		Thread.sleep(30000);



		PayP.jsClick("payBtn", "payBtn");	

		Thread.sleep(90000);
      }	

	}

	public void successPageValidation() throws InterruptedException {

		if(sucess.isElementExist("OrderConfirmed", "OrderConfirmed", 10)) {
			System.out.println("*****************************We are in success page******************************");
		} 

		if(sucess.isElementExist("ReferenceNo","ReferenceNo", 10)) {
			String ReferenceNo = sucess.get_ReferenceNo().getText();
			System.out.println("ReferenceNo: "+ReferenceNo);  
		}

		sucess.isElementExist("Success", "Success", 10);
		sucess.isElementExist("Your Renewal Is Now In Progress Text", "YourRenewalIsNowInProgress", 10);
		sucess.isElementExist("planType", "planType", 10);
		sucess.isElementExist("deviceImg", "deviceImg", 10);


		if(sucess.isElementExist("deviceName","deviceName", 10)) {
			String deviceName = sucess.get_deviceName().getText();
			System.out.println("deviceName: "+deviceName);  
		}

		if(sucess.isElementExist("devicecolor_Data","devicecolor_Data", 10)) {
			String devicecolor_Data = sucess.get_devicecolor_Data().getText();
			System.out.println("devicecolor_Data: "+devicecolor_Data);  
		}

		sucess.isElementExist("AllAccessData", "AllAccessData", 10);
		sucess.isElementExist("GoWifiAccess", "GoWifiAccess", 10);
		sucess.isElementExist("CallAndText", "CallAndText", 10);
		sucess.isElementExist("ContractDuration", "ContractDuration", 10);

		sucess.isElementExist("Inclusions Text", "Inclusions", 10);
		sucess.isElementExist("KonsultaMD", "KonsultaMD", 10);
		sucess.isElementExist("Three month VIP Access To IQIYI", "ThreemonthVIPAccessToIQIYI", 10);
		sucess.isElementExist("Three month VIP Access To WeTV", "ThreemonthVIPAccessToWeTV", 10);


		sucess.jsClick("inclusionsChevron", "inclusionsChevron");	

		if(sucess.isElementExist("KonsultaMD", "KonsultaMD", 10)) {
			System.out.println("Inclusion chevron is not working");
		}
		else {
			System.out.println("Inclusion chevron is working properly");
		}	

		sucess.isElementExist("AddOns And Subscriptions Text", "AddOnsAndSubscriptions", 10);
		sucess.isElementExist("GSAddSurf", "GSAddSurf", 10);
		sucess.isElementExist("AmazonPrimeVideo", "AmazonPrimeVideo", 10);
		sucess.isElementExist("ViuPremium", "ViuPremium", 10);
		sucess.isElementExist("MySuperDuo", "MySuperDuo", 10);
		sucess.isElementExist("EasyRoam", "EasyRoam", 10);
		sucess.isElementExist("GOCALLIDD", "GOCALLIDD", 10);
		sucess.isElementExist("Shipping Address Text", "ShippingAddress", 10);

		if(sucess.isElementExist("ShippingAddressDisplayed","ShippingAddressDisplayed", 10)) {
			String ShippingAddressDisplayed = sucess.get_ShippingAddressDisplayed().getText();
			System.out.println("Shipping Address Displayed: "+ShippingAddressDisplayed);  
		}

		sucess.isElementExist("MonthlyBill", "MonthlyBill", 10);

		sucess.jsClick("ShowBreakdown", "ShowBreakdown");	

		if(sucess.isElementExist("MonthlyBillGenerated","MonthlyBillGenerated", 10)) {
			String MonthlyBillGenerated = sucess.get_MonthlyBillGenerated().getText();
			System.out.println("Monthly Bill Generated: "+MonthlyBillGenerated);  
		}

		sucess.isElementExist("WhatsNext", "WhatsNext", 10);
		sucess.isElementExist("PleaseGiveUsTimeToProcessYourOrder", "PleaseGiveUsTimeToProcessYourOrder", 10);

		if(sucess.isElementExist("ReferenceNo","ReferenceNo", 10)) {
			String ReferenceNo = sucess.get_ReferenceNo().getText();
			System.out.println("ReferenceNo: "+ReferenceNo);  
			Constant.dataMap.get().put("ReferenceNo", ReferenceNo);
			System.out.println("Order Completed successfully : " + ReferenceNo);
		}


		if(sucess.isElementExist("TrackMyOrder","TrackMyOrder", 10)) {
			System.out.println("Tracking the order");
			sucess.jsClick("TrackMyOrder", "TrackMyOrder");	
		}

	}

	public void orderTrackerValidation() throws InterruptedException {

		if(OT.isElementExist("OrderDetails", "OrderDetails", 10)) {
			System.out.println("*****************************We are in order tracker page******************************");
		} 

		OT.isElementExist("MyOrder", "MyOrder", 10);

		if(OT.isElementExist("REFERENCE NUMBER","REFERENCE_NUMBER", 10)) {
			String REFERENCE_NUMBER = OT.get_REFERENCE_NUMBER().getText();
			System.out.println("REFERENCE_NUMBER: "+REFERENCE_NUMBER);  
		}

		OT.isElementExist("Processing", "Processing", 10);
		OT.isElementExist("Deliver", "Deliver", 10);
		OT.isElementExist("Receive", "Receive", 10);

		if(OT.isElementExist("orderTrackerStatus","orderTrackerStatus", 10)) {
			String orderTrackerStatus = OT.get_orderTrackerStatus().getText();
			System.out.println("orderTrackerStatus: "+orderTrackerStatus);  
		}

		if(OT.isElementExist("DateOrdered","DateOrdered", 10)) {
			String DateOrdered = OT.get_DateOrdered().getText();
			System.out.println("DateOrdered: "+DateOrdered);  
		}
		if(OT.isElementExist("AmountPaidForOverdueBalance","AmountPaidForOverdueBalance", 10)) {
			String AmountPaidForOverdueBalance = OT.get_AmountPaidForOverdueBalance().getText();
			System.out.println("AmountPaidForOverdueBalance: "+AmountPaidForOverdueBalance);  
		}

		if(OT.isElementExist("AmountPaid","AmountPaid", 10)) {
			String AmountPaid = OT.get_AmountPaid().getText();
			System.out.println("AmountPaid: "+AmountPaid);  
		}

		if(OT.isElementExist("PaymentMethod","PaymentMethod", 10)) {
			String PaymentMethod = OT.get_PaymentMethod().getText();
			System.out.println("PaymentMethod: "+PaymentMethod);  
		}

		if(OT.isElementExist("Total_Amount_Paid","Total_Amount_Paid", 10)) {
			String Total_Amount_Paid = OT.get_Total_Amount_Paid().getText();
			System.out.println("Total_Amount_Paid: "+Total_Amount_Paid);  
		}

		if(OT.isElementExist("ShipToThisAddress","ShipToThisAddress", 10)) {
			String ShipToThisAddress = OT.get_ShipToThisAddress().getText();
			System.out.println("ShipToThisAddress: "+ShipToThisAddress);  
		}

		if(OT.isElementExist("EstimatedDayOfDelivery","EstimatedDayOfDelivery", 10)) {
			String EstimatedDayOfDelivery = OT.get_EstimatedDayOfDelivery().getText();
			System.out.println("EstimatedDayOfDelivery: "+EstimatedDayOfDelivery);  
		}

		if(OT.isElementExist("planType","planType", 10)) {
			String planType = OT.get_planType().getText();
			System.out.println("planType: "+planType);  
		}

		OT.isElementExist("DeviceImg", "DeviceImg", 10);
		OT.isElementExist("AllAccessData", "AllAccessData", 10);
		OT.isElementExist("GoWifi", "GoWifi", 10);
		OT.isElementExist("CallAndtext", "CallAndtext", 10);
		OT.isElementExist("PlanInclusions", "PlanInclusions", 10);
		OT.isElementExist("KonsultaMD", "KonsultaMD", 10);
		OT.isElementExist("iQIYI", "iQIYI", 10);
		OT.isElementExist("weTV", "weTV", 10);
		OT.isElementExist("Add_ons", "Add_ons", 10);
		OT.isElementExist("GSAddSurf", "GSAddSurf", 10);
		OT.isElementExist("AmazonPrimeVideo", "AmazonPrimeVideo", 10);
		OT.isElementExist("ViuPremium", "ViuPremium", 10);
		OT.isElementExist("MySuperDuo", "MySuperDuo", 10);
		OT.isElementExist("EasyRoam", "EasyRoam", 10);
		OT.isElementExist("GOCALLIDD", "GOCALLIDD", 10);		
	}

}
