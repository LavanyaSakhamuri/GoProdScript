package globeOnline_Accquisition;

import static org.junit.Assert.assertTrue;


import java.util.LinkedHashMap;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebElement;

import com.pages.Acqui.AcquiCheckoutPage;
import com.pages.Acqui.AcquiConformationPage;
import com.pages.Acqui.AcquiDAF_Page;
import com.pages.Acqui.AcquiGalleryPage;
import com.pages.Acqui.AcquiLandingPage;
import com.pages.Acqui.AcquiOrderDetailsPage;
import com.pages.Acqui.AcquiTrackOrderPage;
import com.pages.Acqui.ProductDetailsPage;
import com.pages.Acqui.ResAcquiOrderSummaryPage;
import com.pages.Acqui.ResAcquiPaymentPage;
import com.pages.Acqui.ResAcquiSurveyPage;
import com.pages.Acqui.ResAcquiThankyouPage;

import globeOnline_CommonMethods.DriverManager;
import utility.Constant;

public class AcquiCommonMethods {

	private static LinkedHashMap<String, String> Map = new LinkedHashMap<>();
	private AcquiLandingPage LP = new AcquiLandingPage();
	private AcquiGalleryPage DL = new AcquiGalleryPage();
	private ProductDetailsPage ProDetails = new ProductDetailsPage();
	private AcquiCheckoutPage checkout = new AcquiCheckoutPage();
	private AcquiConformationPage Acquiconfirm = new AcquiConformationPage();
	private AcquiDAF_Page DAF = new AcquiDAF_Page();
	private ResAcquiOrderSummaryPage OP = new ResAcquiOrderSummaryPage();
	private ResAcquiPaymentPage PayP = new ResAcquiPaymentPage();
	private ResAcquiSurveyPage Survey = new ResAcquiSurveyPage();
	private ResAcquiThankyouPage TP = new ResAcquiThankyouPage();
	private AcquiTrackOrderPage TrackOrder = new AcquiTrackOrderPage();
	private AcquiOrderDetailsPage OrderDetails = new AcquiOrderDetailsPage();

	
    int noClors;
    String devicecapacity;
    String contractDuration;

	
	
	public void menubar() throws Exception {
		
			LP.isElementExist("Link Globe logo", "link_LogoGlobe", 10);
			LP.isElementExist("Menu bar link - Apply", "link_Apply", 10);
			LP.isElementExist("Menu bar link - Renew", "link_Renew", 10);
			LP.isElementExist("Menu bar link - Switch", "link_Switch", 10);
			LP.isElementExist("Menu bar link - Buy", "link_MenuBuy", 10);
			LP.isElementExist("Menu bar link - Help", "link_Help", 10);
			LP.isElementExist("Menu bar link - Cart Icon", "CartIcon", 10);
			LP.isElementExist("Menu bar link - Track my order", "link_TrackMyOrder", 10);
	}


	public void validate_ApplLandingPage() throws Exception {

		LP.isElementExist("Menu bar link - Apply", "link_Apply", 10);
		Thread.sleep(2000L);
		if (LP.isClickable("link_Apply", 5)) {
			Thread.sleep(2000L);
			LP.clickOnElement("Link", "Apply", "link_Apply");
			LP.clickOnElement("Link", "Apply", "link_Apply");


		}

		LP.isElementExist("Postpaid Plans and Smartphones", "postpaidPlansAndSmartphones", 20);
		LP.isElementExist("Build My Plan Link", "link_buildMyPlan", 10);
		LP.isElementExist("Picking the right plan isn't rocket science", "pickingTheRightPlanBanner", 10);
		LP.isElementExist("Shopping", "shopping", 10);
		LP.isElementExist("Social", "social", 10);
		LP.isElementExist("Videos", "videos", 10);
		LP.isElementExist("Music", "music", 10);
		LP.isElementExist("Work", "work", 10);
		LP.isElementExist("Games", "games", 10);
		LP.isElementExist("customSlider", "customSlider", 10);
		LP.isElementExist("How often do you watch live selling videos", "HowOftenDoYou", 10);
		LP.isElementExist("Rarely", "rarely", 10);
		LP.isElementExist("Occasionally", "occasionally", 10);
		LP.isElementExist("Sometimes", "sometimes", 10);
		LP.isElementExist("Always", "always", 10);
		LP.isElementExist("TellMeabout", "tellMeabout", 10);
		LP.isElementExist("introduction-block", "introductionBlock", 10);
		LP.isElementExist("Plan styles for all lifestyles", "planStylesForAll", 10);
		LP.isElementExist("Gplan With Device", "gplanWithDevice", 10);
		LP.isElementExist("Gplan With GCash", "gplanWithGCash", 10);
		LP.isElementExist("Gplan Plus SIMOnly", "gplanPlusSIMOnly", 10);
		LP.isElementExist("Gplan SIMOnly AllData", "gplanSIMOnlyAllData", 10);
		((JavascriptExecutor) DriverManager.getDriver()).executeScript(
		"arguments[0].scrollIntoView(true);", LP.get_starter());
		LP.isElementExist("Starter", "starter", 10);
		LP.isElementExist("Lite", "lite", 10);
		JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
		js1.executeScript("arguments[0].click();", LP.get_owlnext());
		LP.isElementExist("Basic", "basic", 10);
		LP.scroll_vertical(409);
		LP.isElementExist("NextIcon", "owlnext", 10);

		for (int i = 0; i < 3; i++) {
			if (LP.isClickable("owlnext", 5)) {
				Thread.sleep(5000L);
				LP.scroll_vertical(2000);
				JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
				js.executeScript("arguments[0].click();", LP.get_owlnext());
			}
		}

		LP.isElementExist("Previousicon", "previousicon", 10);
		LP.isElementExist("Value", "value", 10);
		LP.isElementExist("Essential", "essential", 10);
		LP.isElementExist("Plus", "plus", 10);

		for (int i = 0; i < 2; i++) {
			if (LP.isClickable("owlnext", 5)) {
				Thread.sleep(5000L);
				LP.scroll_vertical(2000);
				JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
				js.executeScript("arguments[0].click();", LP.get_owlnext());

			}
		}

		LP.isElementExist("Extra", "extra", 10);
		//LP.isElementExist("AlwaysOn", "alwaysOn", 10);
		
		//Validate FAQ's
		LP.isElementExist("What is Globe Postpaid's GPLAN?", "faqText1",10);
		LP.isElementExist("What are the requirements to avail this plan?", "faqText2",10);
		LP.isElementExist("How to upload your IDs and documents for application?", "faqText3",10);
		LP.isElementExist("What IDs are accepted as proof of identification? ", "faqText4",10);
		LP.isElementExist("What documents are accepted as proof of financial capacity?", "faqText5",10);
		LP.isElementExist("Are there additional requirements for foreign applicants?", "faqText6",10);
	}

	public void clickOnViewAllDevices() throws Exception {
		
		Thread.sleep(5000);
		((JavascriptExecutor) DriverManager.getDriver()).executeScript("arguments[0].scrollIntoView(true);",
				LP.get_link_Apply());
		Thread.sleep(5000);
		LP.moveToElement("link_Apply");
		if (LP.isClickable("link_ViewAllDevices", 10)) {
			Thread.sleep(2000L);
			LP.clickOnElement("link", "View all Devices", "link_ViewAllDevices");
		}
		Thread.sleep(5000);
	}

	public void selectingPlanValue(int n) throws Exception {

		if (DL.isClickable("Planvale_dropdownbtn", 10)) {
			System.out.println("****************WE ARE IN DEVICE GALLERY PAGE******************");
			DL.clickOnElement("Filter", "Plan value", "Planvale_dropdownbtn");
			System.out.println("Selecting plan value for the device");
			// JavascriptExecutor js2 = (JavascriptExecutor) DriverManager.getDriver();
			// js2.executeScript("arguments[0].click();", DL.get_Planvale_dropdownbtn());
		}

		DriverManager.getDriver()
				.findElement(By.xpath("(//h2[text()='" + n + "']//following::input[@type='radio'])[1]")).click();
		System.out.println("Selected "+n+"Plan Value");
	}

	public void clickOnApplyFilter() throws Exception {

		if (DL.isClickable("applyFilter_Button", 10)) {
			DL.clickOnElement("Filter", "Apply Filter ", "applyFilter_Button");
			// JavascriptExecutor js22 = (JavascriptExecutor) DriverManager.getDriver();
			// js22.executeScript("arguments[0].click();", DL.get_applyFilter_Button());
		}

	}

	public void searchDevice(String device) throws Exception {

		DL.isElementExist("Search field", "search_field", 10);

		System.out.println("Searching for" + device);

		DL.get_search_field().sendKeys(device);

		Thread.sleep(3000);

		DL.get_search_field().sendKeys(Keys.ENTER);
		Thread.sleep(8000);
	}

	public void validateDevice(String device) throws Exception {

		if (DriverManager.getDriver()
				.findElement(By.xpath("(//h2[text()='" + device + "']//following::input[@type='radio'])[1]"))
				.isDisplayed()) {
			System.out.println("Able to display searched device:"+device);
		}
	}

	public void validateForReservationTag() throws Exception {

		List<WebElement> elements = DL.get_colours();
		
	    DL.isElementExist("Device cashout in gallery page", "cashoutAmountinGalleryPage",10);
	    
	    String cost = DL.get_cashoutAmountinGalleryPage().getText();
	    System.out.println("Device casout:"+cost);

		
		if(elements.size()==1) {
			if (DL.isElementExist("ReservationTag", "ForReservation", 10)) {
				System.out.println("Able to display for reservation tag");
			}
			
		}
		else {
			
		  for (int i = 2; i <= elements.size(); i++) {
			  
            System.out.println("Devices with diffrent colors we have in gallery page are:"+elements.size());
            noClors = elements.size();
			if (DL.isElementExist("ReservationTag", "ForReservation", 10)) {
				System.out.println("Able to display for reservation tag");
				break;
			}

			WebElement element = DriverManager.getDriver().findElement(By.xpath("(//input[@class='go_color-radio'])["+i+"]"));
			//element.click();
			JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
			js.executeScript("arguments[0].click();", element);
			
			if (DL.isElementExist("ReservationTag", "ForReservation", 10)) {
				System.out.println("Able to display for reservation tag");
				break;
			}
		}
	}	

		Thread.sleep(2000L);
			
	}
	
	public void clickingOnReserveThisDeviceButtonINGalleryPage() throws Exception {
		
		DL.jsClick("For Reservation Button", "ForReservationButton");
	}
	
	public void OTPPage_(String b) throws InterruptedException {

		assertTrue(DriverManager.getDriver().getTitle().contains("One-Time Password"));

		System.out.println("Navigated to OTP page ");

		String number = String.valueOf(b);

		String[] digits = number.split("(?<=.)");

		for (int i = 1; i <= 6; i++) {
			// WebElement
			// y=DriverManager.getDriver().findElement(By.xpath("(//div[contains(.,'
			// We sent the code to')]//form//input)"+"[i]"));

			String xPathWithVariable = "(//div[contains(.,' We sent the code to')]//form//input)" + "[" + i + "]";
			// System.out.println(xPathWithVariable);
			DriverManager.getDriver().findElement(By.xpath(xPathWithVariable)).sendKeys(digits[i - 1]);
			// LP.get_MNP_OTP_Field1().sendKeys(digits[i]);
		}
		}
	
	public void validateProductDetailsPageByClickonMagnifyGlass() throws Exception {
		
		
		Thread.sleep(2000L);
		DL.jsClick("Magnify Button", "magnifybutton");
		
		if(ProDetails.isElementExist("Product details link", "productDetails", 10)) {
			System.out.println("*****************WE ARE IN PRODUCT DETAILS PAGE******************");
			ProDetails.isElementExist("product Gallery link", "productGallery", 10);
			
			ProDetails.isElementExist("Device Name", "deviceNameinPDPage",10);
			String deviceName = ProDetails.get_deviceNameinPDPage().getText();
			System.out.println("Device seleted:"+deviceName);
			
			List<WebElement> colors = ProDetails.get_color_Finish();
			int size = colors.size();
			
			if(size==noClors) {
				ProDetails.isElementExist("Color Finish", "color_Finish", 10);
				System.out.println("devices with diffrent colors we have in PDP page are:"+size);
			}
			
			ProDetails.isElementExist("Device capacity", "capacity",10);
			String devicecapacity = ProDetails.get_capacity().getText();
			System.out.println("Capacity of the device is:"+devicecapacity);
			
			ProDetails.isElementExist("Contract Duration", "contractDuration",10);
			String contractDuration = ProDetails.get_contractDuration().getText();
			System.out.println("Contract duration  of the device is:"+contractDuration);
			
			ProDetails.isElementExist("Note", "note",10);
			ProDetails.isElementExist("Discover Gplan Below link", "discoverGplanBelow",10);
			
			//redirect to discover after click on discovergplanbelow link
			((JavascriptExecutor) DriverManager.getDriver()).executeScript(
			"arguments[0].scrollIntoView(true);", ProDetails.get_discoverGplanBelow());
			Thread.sleep(4000);
			ProDetails.jsClick(" Discover Gplan Link", "discoverGplanBelow");
			Thread.sleep(4000);
			if(ProDetails.isElementExist("Build My Plan button", "buildMyPlan", 10)) {
				System.out.println("Redirected to discovery page of the corresponding plan");
			}
			
			//navigate back to PDP page
			DriverManager.getDriver().navigate().back();
			
			ProDetails.isElementExist("Plan Card", "planCard",10);
			ProDetails.isElementExist("applyWithThisDevice", "applyWithThisDevice",10);
			ProDetails.isElementExist("SelectAnotherDevice", "selectAnotherDevice",10);
			ProDetails.isElementExist("Features", "features",10);
			ProDetails.isElementExist("Promos", "promos",10);
			
			//Validate FAQ's
			ProDetails.isElementExist("FaqText1", "faqText1",10);
			ProDetails.isElementExist("FaqText2", "faqText2",10);
			ProDetails.isElementExist("FaqText3", "faqText3",10);
			ProDetails.isElementExist("FaqText4", "faqText4",10);
			ProDetails.isElementExist("FaqText5", "faqText5",10);
			ProDetails.isElementExist("FaqText6", "faqText6",10);	
			
			ProDetails.jsClick("Apply with this device button", "applyWithThisDevice");
			DriverManager.getDriver().navigate().refresh();
			Thread.sleep(5000);
		}
		else {
		   Thread.sleep(3000);
		   System.out.println("Product details page does not contain any details about selected plan");
		   DriverManager.getDriver().navigate().back();
		   Thread.sleep(3000);
	       selectingPlanValue(599);
	       clickOnApplyFilter();
	       searchDevice(utility.Constant.deviceUsed);
	       validateDevice(utility.Constant.deviceUsed);
	       validateForReservationTag();
		   DL.jsClick("Apply With This Device Button", "applywiththisButton");		
		}
	}
	
	
	
	public void mainProductDetailsPageValidation() throws Exception {
		
		Thread.sleep(3000);
		DriverManager.getDriver().navigate().refresh();
		Thread.sleep(3000);
		if(ProDetails.isElementExist("Customize Your Plan Text", "customizeYourplanText", 10)) {
			System.out.println("***************************WE ARE IN MAIN PDP PAGE****************************");
		}
		
		ProDetails.isElementExist("PDP_Device", "PDP_Device",10);
		ProDetails.isElementExist("PDP_Gcash", "PDP_Gcash",10);
		ProDetails.isElementExist("PDP_Simonly", "PDP_Simonly",10);
		ProDetails.isElementExist("PDP_Alldata", "PDP_Alldata",10);
		
		ProDetails.isElementExist("Plan Card", "PlanCard",10);
		ProDetails.isElementExist("Device carousel", "Devicecarousel",10);
		
//		if(ProDetails.isElementExist("View All Devices Link", "ViewAllDevicesLinkInPdPage",10)) {
//			
//			ProDetails.jsClick("View All Devices Link", "ViewAllDevicesLinkInPdPage");		
//		}
//		
//
//		//Navigate to device gallery page
//		if(DL.isElementExist("Filters", "Filters", 10)) {
//			
//			System.out.println("Navigated successfully to the device gallery page");
//		}
//		
//		//Navigate back to PDP page
//		DriverManager.getDriver().navigate().back();
//		Thread.sleep(6000);

		
//		((JavascriptExecutor) DriverManager.getDriver()).executeScript(
//		"arguments[0].scrollIntoView(true);", ProDetails.get_color_Finish1());
//		Thread.sleep(4000);
//		
		List<WebElement> colors = ProDetails.get_Diff_Colors();
		int size = colors.size();
		
		if(size==noClors) {
			ProDetails.isElementExist("Color Finish", "color_Finish1", 10);
			System.out.println("devices with diffrent colors we have in PDP page are:"+size);
		}
		
		ProDetails.isElementExist("Device capacity", "capacity1",10);
	    devicecapacity = ProDetails.get_capacity1().getText();
		System.out.println("Capacity of the device is:"+devicecapacity);
		
		ProDetails.isElementExist("Contract Duration", "contractDuration1",10);
		contractDuration = ProDetails.get_contractDuration1().getText();
		System.out.println("Contract duration  of the device is:"+contractDuration);
		
        if(ProDetails.isElementExist("Preper_esim_PhysicalSim", "Preper_esim_PhysicalSim", 10)) {
			Thread.sleep(3000);
			ProDetails.jsClick("esim", "esim");	
		}
		
		//Selecting Data addons
		if(ProDetails.isElementExist("DoYouUseLotsOfData", "DoYouUseLotsOfData", 10)) {
			
			((JavascriptExecutor) DriverManager.getDriver()).executeScript(
			"arguments[0].scrollIntoView(true);", ProDetails.get_Data_checkbox());
			Thread.sleep(3000);
			ProDetails.jsClick("Data_checkbox", "Data_checkbox");	
			ProDetails.jsClick("GSAddsurf99", "GSAddsurf99");					
		}
		
		//Selecting entertainment addons
       if(ProDetails.isElementExist("DoYouLoveWatchingShowsAndMovies", "DoYouLoveWatchingShowsAndMovies", 10)) {
			
			((JavascriptExecutor) DriverManager.getDriver()).executeScript(
			"arguments[0].scrollIntoView(true);", ProDetails.get_movie_checkbox());
			Thread.sleep(3000);
			ProDetails.jsClick("movie_checkbox", "movie_checkbox");	
			ProDetails.jsClick("Amazonprime", "Amazonprime");		
			ProDetails.jsClick("Viupremium", "Viupremium");					
			//ProDetails.jsClick("Spotifypremium", "Spotifypremium");					
		}
       
       //Selecting message addons
       if(ProDetails.isElementExist("PreferTalkingOverMessaging", "PreferTalkingOverMessaging", 10)) {
			
			((JavascriptExecutor) DriverManager.getDriver()).executeScript(
			"arguments[0].scrollIntoView(true);", ProDetails.get_message_checkbox());
			Thread.sleep(3000);
			ProDetails.jsClick("message_checkbox", "message_checkbox");	
			ProDetails.jsClick("MyDuo", "MyDuo");		
			ProDetails.jsClick("MySuperDuo", "MySuperDuo");					
		}
		
       //Selecting lifestyle addons
       if(ProDetails.isElementExist("AreYouAllAboutTheJetSettingLifestyle", "AreYouAllAboutTheJetSettingLifestyle", 10)) {
			
			((JavascriptExecutor) DriverManager.getDriver()).executeScript(
			"arguments[0].scrollIntoView(true);", ProDetails.get_lifestyle_checkbox());
			Thread.sleep(3000);
			ProDetails.jsClick("lifestyle_checkbox", "lifestyle_checkbox");	
			ProDetails.jsClick("easyRoam", "easyRoam");	
			ProDetails.jsClick("Gocallid199", "Gocallid199");					
		}		
	}
	
	
	//Validate Review my plan
    public void validateReviewMyPlan() throws Exception {
    	
    	if(ProDetails.isElementExist("Review MyPlan", "ReviewMyPlan", 10)) {
    	    ProDetails.jsClick("Review MyPlan", "ReviewMyPlan");
    	}
    	
    	ProDetails.isElementExist("Device Name InReviewMyPlan", "DeviceNameInReviewMyPlan", 10);
    	
    	String device_Capacity =  ProDetails.get_DeviceCapacityInReview().getText();
    	System.out.println("device_Capacity:"+device_Capacity);

    	
    	if(device_Capacity.equalsIgnoreCase(devicecapacity)) {
        	ProDetails.isElementExist("Device Capacity", "DeviceCapacityInReview", 10);
    	}
    	
    	String device_ContactDuration =  ProDetails.get_ContactDerationInReview().getText();
    	System.out.println("device_ContactDuration:"+device_ContactDuration);


    	
    	if(device_ContactDuration.equalsIgnoreCase(contractDuration)) {
        	ProDetails.isElementExist("Contact Duration", "ContactDerationInReview", 10);
    	}
    	
    	String GplanWithDevice =  ProDetails.get_gplan_withDevice().getText();
    	
    	if(ProDetails.isElementExist("gplan_withDevice", "gplan_withDevice", 10)) {
    	    System.out.println("Gplan Name:"+GplanWithDevice);
 
    	}
    	
    	ProDetails.isElementExist("My_Super_Duo", "My_Super_Duo", 10);
    	ProDetails.isElementExist("Amazon_Prime_Video", "Amazon_Prime_Video", 10);
    	ProDetails.isElementExist("Viu_Premium", "Viu_Premium", 10);
    	//ProDetails.isElementExist("Spotify_Premium", "Spotify_Premium", 10);
    	ProDetails.isElementExist("GOCALLIDD_199", "GOCALLIDD_199", 10);
    	ProDetails.isElementExist("Easy_Roam", "Easy_Roam", 10);
    	ProDetails.isElementExist("GS_Add_Surf_99", "GS_Add_Surf_99", 10);
    	
    	
        String Total_subscriptions_and_addons =  ProDetails.get_Total_subscriptions_and_addons().getText();
    	
    	if(ProDetails.isElementExist("Total_subscriptions_and_addons", "Total_subscriptions_and_addons", 10)) {
    	    System.out.println("Total_subscriptions_and_addons:"+Total_subscriptions_and_addons);
 
    	}
    	
    	 String MonthlyBill_subscriptions_and_addons =  ProDetails.get_MonthlyBill_subscriptions_and_addons().getText();
     	
     	if(ProDetails.isElementExist("MonthlyBill_subscriptions_and_addons", "MonthlyBill_subscriptions_and_addons", 10)) {
     	    System.out.println("MonthlyBill_subscriptions_and_addons:"+MonthlyBill_subscriptions_and_addons);
  
     	}
     	
        String Monthly_Payment =  ProDetails.get_Monthly_Payment().getText();
     	
     	if(ProDetails.isElementExist("Monthly_Payment", "Monthly_Payment", 10)) {
     	    System.out.println("Monthly_Payment:"+Monthly_Payment);
  
     	}
     	
        String OneTimeDevice_Cashout =  ProDetails.get_OneTimeDevice_Cashout().getText();
     	
     	if(ProDetails.isElementExist("OneTimeDevice_Cashout", "OneTimeDevice_Cashout", 10)) {
     	    System.out.println("OneTimeDevice_Cashout:"+OneTimeDevice_Cashout);
  
     	}	   
    }
    
    
    //Insert Phone Number
    public void insert_phoneNo(String phoneNo)
			throws Exception {

		Constant.dataMap.set(Map);
		ProDetails.get_Mobilenumfield().clear();
		ProDetails.get_Mobilenumfield().sendKeys(phoneNo);
		System.out.println("Inserted mobile no : " + phoneNo);
		ProDetails.scroll_vertical(600);
		Constant.dataMap.get().put("OMT_MobileNumber", phoneNo);
	}
    
    public void handle_and_insert_OTP() throws InterruptedException {
    	
    	if (checkout.isElementExist("One Time Password Text", "One_Time_Password", 30)) {
    		System.out.println("******************************WE ARE IN OTP PAGE*******************************");
    	}
    	checkout.isElementExist("We Sent Code To", "We_Sent_Code_To", 15);
    	checkout.isElementExist("Code ExpiresIn 5Min Text", "Code_ExpiresIn_5Min", 15);
    	checkout.isElementExist("Resend Code Link", "Resend_Code", 15);
    	checkout.isElementExist("Didnot Get Code Text", "Didnot_Get_Code", 15);


			for (int j = 0; j < checkout.get_OTP().size(); j++) {
				checkout.get_OTP().get(j).sendKeys(String.valueOf(j + 1));
			}
			System.out.println("Inserted OTP");
		
		if (checkout.isElementExist("Transaction timeout", "transactionTimeOut", 15)) {
			DriverManager.getDriver().navigate().refresh();
			Thread.sleep(10000);
			for (int j = 0; j < checkout.get_OTP().size(); j++) {
				checkout.get_OTP().get(j).sendKeys(String.valueOf(j + 1));
			}
		} else
			System.out.println("able to proceed");
	}
    
    
    public void validate_acquiConfirmationPage() throws Exception {

    	Acquiconfirm.isElementExist("Acqui Confirmation Text", "AcquiConfirmation", 10);
    	Acquiconfirm.isElementExist("Question Mark Symbol", "QuestionMarkSymbol", 10);
    	Acquiconfirm.isElementExist("Are You Applying or Revieing your Globe", "AreYouApplyingyourGlobe", 10);
    	Acquiconfirm.isElementExist("Postpaid Plan", "PostpaidPlan", 10);
    	Acquiconfirm.isElementExist("I'm Renewing My Plan", "RenewingMyPlan", 10);
    	Acquiconfirm.isElementExist("I'm Applying for an Additional Plan", "AdditionalPlan", 10);
		if (Acquiconfirm.isClickable("AdditionalPlan", 5)) {
			
			Acquiconfirm.jsClick("Applying for additional plan link", "AdditionalPlan");
		}
	}
    
    public void validatePlanBreakdown() throws Exception {
    	
	    if(ProDetails.isElementExist("Mobile_Number","Mobile_Number",15)){
	    	System.out.println("Mobile number displayed in plan breakdown page is:"+ProDetails.get_Mobile_Number().getText());
	    }
	    
    	ProDetails.isElementExist("Device Name InReviewMyPlan", "DeviceNameInReviewMyPlan", 10);
    	
    	String device_Capacity =  ProDetails.get_DeviceCapacityInReview().getText();
    	System.out.println("device_Capacity:"+device_Capacity);

    	
    	if(device_Capacity.equalsIgnoreCase(devicecapacity)) {
        	ProDetails.isElementExist("Device Capacity", "DeviceCapacityInReview", 10);
    	}
    	
    	String device_ContactDuration =  ProDetails.get_ContactDerationInReview().getText();
    	System.out.println("device_ContactDuration:"+device_ContactDuration);


    	
    	if(device_ContactDuration.equalsIgnoreCase(contractDuration)) {
        	ProDetails.isElementExist("Contact Duration", "ContactDerationInReview", 10);
    	}
    	
    	String GplanWithDevice =  ProDetails.get_gplan_withDevice().getText();
    	
    	if(ProDetails.isElementExist("gplan_withDevice", "gplan_withDevice", 10)) {
    	    System.out.println("Gplan Name:"+GplanWithDevice);
 
    	}
    	
    	ProDetails.isElementExist("My_Super_Duo", "My_Super_Duo", 10);
    	ProDetails.isElementExist("Amazon_Prime_Video", "Amazon_Prime_Video", 10);
    	ProDetails.isElementExist("Viu_Premium", "Viu_Premium", 10);
    	ProDetails.isElementExist("GOCALLIDD_199", "GOCALLIDD_199", 10);
    	ProDetails.isElementExist("Easy_Roam", "Easy_Roam", 10);
    	ProDetails.isElementExist("GS_Add_Surf_99", "GS_Add_Surf_99", 10);
    	
    	
        String Total_subscriptions_and_addons =  ProDetails.get_Total_subscriptions_and_addons().getText();
    	
    	if(ProDetails.isElementExist("Total_subscriptions_and_addons", "Total_subscriptions_and_addons", 10)) {
    	    System.out.println("Total_subscriptions_and_addons:"+Total_subscriptions_and_addons);
 
    	}
    	
    	 String MonthlyBill_subscriptions_and_addons =  ProDetails.get_MonthlyBill_subscriptions_and_addons().getText();
     	
     	if(ProDetails.isElementExist("MonthlyBill_subscriptions_and_addons", "MonthlyBill_subscriptions_and_addons", 10)) {
     	    System.out.println("MonthlyBill_subscriptions_and_addons:"+MonthlyBill_subscriptions_and_addons);
  
     	}
     	
        String Monthly_Payment =  ProDetails.get_Monthly_Payment().getText();
     	
     	if(ProDetails.isElementExist("Monthly_Payment", "Monthly_Payment", 10)) {
     	    System.out.println("Monthly_Payment:"+Monthly_Payment);
  
     	}
     	
        String OneTimeDevice_Cashout =  ProDetails.get_OneTimeDevice_Cashout().getText();
     	
     	if(ProDetails.isElementExist("OneTimeDevice_Cashout", "OneTimeDevice_Cashout", 10)) {
     	    System.out.println("OneTimeDevice_Cashout:"+OneTimeDevice_Cashout);
     	}	 
     	
     	if(ProDetails.isElementExist("ProceedWithMyPlanButton", "ProceedWithMyPlanButton", 10)){
     		ProDetails.jsClick("ProceedWithMyPlanButton", "ProceedWithMyPlanButton");
     	}
     	
     	Thread.sleep(10000);
    }
    
    private String RandomString(int j) 
	{
		// TODO Auto-generated method stub
		//return null;
		char c[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		int randomPosition;
		String randomString = "";
		for (int i = 0; i <j; i++) {
			randomPosition = generateRandomIntIntRange(0, 51);
			randomString = randomString + c[randomPosition]; 
		}
		//System.out.println(randomString);
		return randomString;        
	}
    
    public static int generateRandomIntIntRange(int min, int max) {
		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}
    
    
    public void validatePersonalInfoPage(String Email) throws InterruptedException {
    	
    	
    	DAF.isElementExist("Personal InDAFation Text","personalInDAFation" , 10);
    	DAF.isElementExist("Mandatory: First Name","Mandatory_Fname" , 10);
		DAF.isElementExist("Mandatory: Middle Name","Mandatory_Mname" , 10);
		DAF.isElementExist("Mandatory: Last Name","Mandatory_LName" , 10);
		DAF.isElementExist("Mandatory: Email","Mandatory_Email" , 10);
		DAF.isElementExist("Mandatory: Birthday","Mandatory_Birthday" , 10);
		DAF.isElementExist("Mandatory: Mother's First Name","Mandatory_MFName" , 10);
		DAF.isElementExist("Mandatory: Mother's Middle Name","Mandatory_MMName" , 10);
		DAF.isElementExist("Mandatory: Mother's Last Name","Mandatory_MLName" , 10);

		DAF.isElementExist("Mandatory: House","Mandatory_House" , 10);
		DAF.isElementExist("Mandatory: Province","Mandatory_Province" , 10);
		DAF.isElementExist("Mandatory: City","Mandatory_City" , 10);
		DAF.isElementExist("Mandatory: Barangay","Mandatory_Brgy" , 10);
		DAF.isElementExist("Mandatory: ZIP Code","Mandatory_zip" , 10);
		
		String Fname = "MARIA";
		String Mname = "SANTOS";
		String Lname = "DELA CRUZ";

		
		String Dob="03/16/1980";
		String MoFname=RandomString(1)+"alluyo";
		String MomMname=RandomString(1)+"dlltrsdo";
		String MomLname=RandomString(1)+"cselado";

		DAF.get_firstName().clear();
		DAF.get_firstName().sendKeys(Fname);
		System.out.println("First Name : "+Fname);
		DAF.get_middleName().clear();
		DAF.get_middleName().sendKeys(Mname);
		System.out.println("Middle Name : "+Mname);
		DAF.get_lastName().clear();
		DAF.get_lastName().sendKeys(Lname);
		System.out.println("Last Name : "+Lname);

		DAF.get_emailAddress().clear();
		DAF.get_emailAddress().sendKeys(Email);
		System.out.println("Email : " + Email);


		DAF.get_birthday().clear();
		DAF.get_birthday().sendKeys(Dob);
		System.out.println("Date of Birth:"+Dob);
		
		DAF.get_motherFirstName().clear();
		DAF.get_motherFirstName().sendKeys(MoFname);
		System.out.println("Mothers First name:"+MoFname);
		
		DAF.get_motherMaidenMiddleName().clear();
		DAF.get_motherMaidenMiddleName().sendKeys(MomMname);
		System.out.println("Mothers middle name:"+MomMname);
		
		DAF.get_motherMaidenLastName().clear();
		DAF.get_motherMaidenLastName().sendKeys(MomLname);
		System.out.println("Mothers last name name:"+MomLname);	
    }
    
    public void insertBillingAddressDetails(String House_Condo, String HouseNo_FloorNo, String Street, String Subdi_BuildingName, String Prov, String City, String Brgy) throws InterruptedException {
    	
    	((JavascriptExecutor) DriverManager.getDriver()).executeScript(
    	 "arguments[0].scrollIntoView(true);", DAF.get_houseNo());

		DAF.isElementExist("Billing Address","billingAddress" , 10);
		if(House_Condo.equalsIgnoreCase("Condo")) {
			DAF.javascript_clickCondominium();
			System.out.println("Selected radio button : Condominium");

			DAF.get_houseNo().sendKeys(HouseNo_FloorNo); System.out.println("Floor : "+HouseNo_FloorNo);
			DAF.get_Village().sendKeys(Subdi_BuildingName); System.out.println("Building Name : "+Subdi_BuildingName);
			

			DAF.get_Street().sendKeys(Street); System.out.println("Street : "+Street);

			DAF.select_province(Prov); System.out.println("Province : "+Prov);Thread.sleep(2000L);
			DAF.select_city(City); System.out.println("City : "+City);Thread.sleep(2000L);
			DAF.select_barangay(Brgy); System.out.println("Barangay : "+Brgy);Thread.sleep(2000L);

			String zipCOde = DAF.get_ZIPcode().getAttribute("value");
			if (zipCOde == null || zipCOde.isEmpty()) {
				System.out.println("FAIL : ZIP Code -  is blank");
			} else {
				System.out.println("ZIP Code is pre-populated : " + zipCOde);
			}

			Thread.sleep(1000L);
		}
		else {
			DAF.javascript_clickRadioBtn_House();
			System.out.println("Selected radio button : House");

			Thread.sleep(2000L);

			DAF.get_houseNo().sendKeys(HouseNo_FloorNo); System.out.println("House No : "+HouseNo_FloorNo);
			DAF.get_Village().sendKeys(Subdi_BuildingName); 
			System.out.println("Subdivision : "+Subdi_BuildingName);
			DAF.get_Street().clear();
			DAF.get_Street().sendKeys(Street); System.out.println("Street : "+Street);

			DAF.select_province(Prov); System.out.println("Province : "+Prov);Thread.sleep(2000L);
			DAF.select_city(City); System.out.println("City : "+City);Thread.sleep(2000L);
			DAF.select_barangay(Brgy); System.out.println("Barangay : "+Brgy);Thread.sleep(2000L);

			String zipCOde = DAF.get_ZIPcode().getAttribute("value");
			if (zipCOde == null || zipCOde.isEmpty()) {
				System.out.println("FAIL : ZIP Code -  is blank");
			} else {
				System.out.println("ZIP Code is pre-populated : " + zipCOde);
			}
			Thread.sleep(1000L);
		}
		
		DAF.jsClick("Next Delivery Information Button", "NextDeliveryInformation");			
}
		
   
    
    
    public void insertShippingDetails(String House_Condo, String HouseNo_FloorNo, String Street, String Subdi_BuildingName, String Prov, String City, String Brgy) throws InterruptedException {

		DAF.isElementExist("Acquisition Delivery Information","AcquisitionDeliveryInformation" , 10);
		DAF.isElementExist("Remainder","remainder" , 10);
		DAF.isElementExist("Shipping Address Is Same As Billing Text","shippingAddressIsSameAsBilling" , 10);

		if(House_Condo.equalsIgnoreCase("Condo")) {
			DAF.javascript_clickCondominium();
			System.out.println("Selected radio button : Condominium");

			DAF.get_houseNo().sendKeys(HouseNo_FloorNo); System.out.println("Floor : "+HouseNo_FloorNo);
			DAF.get_Village().sendKeys(Subdi_BuildingName); System.out.println("Building Name : "+Subdi_BuildingName);
			

			DAF.get_Street().sendKeys(Street); System.out.println("Street : "+Street);

			DAF.select_province(Prov); System.out.println("Province : "+Prov);Thread.sleep(2000L);
			DAF.select_city(City); System.out.println("City : "+City);Thread.sleep(2000L);
			DAF.select_barangay(Brgy); System.out.println("Barangay : "+Brgy);Thread.sleep(2000L);

			String zipCOde = DAF.get_ZIPcode().getAttribute("value");
			if (zipCOde == null || zipCOde.isEmpty()) {
				System.out.println("FAIL : ZIP Code -  is blank");
			} else {
				System.out.println("ZIP Code is pre-populated : " + zipCOde);
			}

			Thread.sleep(1000L);
		}
		else if(House_Condo.equalsIgnoreCase("House")) {
			DAF.javascript_clickRadioBtn_House();
			System.out.println("Selected radio button : House");

			DAF.scroll_vertical(375);
			Thread.sleep(2000L);

			DAF.get_houseNo().sendKeys(HouseNo_FloorNo); System.out.println("House No : "+HouseNo_FloorNo);
			DAF.get_Village().sendKeys(Subdi_BuildingName); 
			System.out.println("Subdivision : "+Subdi_BuildingName);
			DAF.get_Street().clear();
			DAF.get_Street().sendKeys(Street); System.out.println("Street : "+Street);

			DAF.select_province(Prov); System.out.println("Province : "+Prov);Thread.sleep(2000L);
			DAF.select_city(City); System.out.println("City : "+City);Thread.sleep(2000L);
			DAF.select_barangay(Brgy); System.out.println("Barangay : "+Brgy);Thread.sleep(2000L);

			String zipCOde = DAF.get_ZIPcode().getAttribute("value");
			if (zipCOde == null || zipCOde.isEmpty()) {
				System.out.println("FAIL : ZIP Code -  is blank");
			} else {
				System.out.println("ZIP Code is pre-populated : " + zipCOde);
			}
			Thread.sleep(1000L);
		}
		else {
			
			if(DAF.isElementExist("Slider for making shipping address as billing address ","slider" , 10)) {
				DAF.jsClick("Slider", "slider");
			}
			
		}
		
    }
    
    public void SelectAlternativeRecipentDetails() throws Exception {

		DAF.isElementExist("Alternate recipient and contact details (optional)","alternateAndRecipient" , 10);
		DAF.scroll_vertical(275);
		Thread.sleep(2000L);
		String RecipentFname = RandomString(1)+"shian";
		String RecipentMname = RandomString(1)+"rea";
		String RecipentLname = RandomString(1)+"lov";

		String   Mobileno="09270000133";


		DAF.get_RecipentFname().clear();
		DAF.get_RecipentFname().sendKeys(RecipentFname);
		System.out.println("Recipent Fname : "+RecipentFname);

		DAF.get_RecipentMname().clear();
		DAF.get_RecipentMname().sendKeys(RecipentMname);
		System.out.println("Recipent Middlename:"+RecipentMname);

		DAF.get_RecipentLname().clear();
		DAF.get_RecipentLname().sendKeys(RecipentLname);
		System.out.println("Recipent Lastname:"+RecipentLname);

		DAF.get_RecipentMobileno().clear();
		DAF.get_RecipentMobileno().sendKeys(Mobileno);
		System.out.println("Recipent Mobile Number:"+Mobileno);	
		
		DAF.jsClick("NextUploadDoc", "NextUploadDoc");

	}
    
    public void uploadPOID() throws InterruptedException {
    	
    	DAF.isElementExist("Acquisition Upload Documents Text", "AcquisitionUploadDocuments", 10);
    	DAF.isElementExist("Proof Of Identification Text", "ProofOfIdentification", 10);
    	DAF.isElementExist("POID Dropdown", "POIDDropdown", 10);
    	DAF.scroll_vertical(50);
		String POID="PASSPORT ID";
		DAF.Select_POIDDropdown(POID); 
		System.out.println("Select ID type: "+POID);
		
        Thread.sleep(3000);
    	
    	try
    	{
    	  	WebElement addFile = DriverManager.getDriver().findElement(By.xpath("//input[@id='poidDocRef']"));
    		((RemoteWebElement)addFile).setFileDetector(new LocalFileDetector());
    		addFile.sendKeys(System.getProperty("user.dir")+"\\resources\\Documents\\POIDF.jpg");
    	}
    	catch(Exception e)
    	{
    		System.out.println(e.getMessage());
    	}
    	
        Thread.sleep(4000);
    	
    	   	
    	try
    	{
	  		WebElement addFile = DriverManager.getDriver().findElement(By.xpath("//input[@id='poidBackDocRef']"));
			((RemoteWebElement)addFile).setFileDetector(new LocalFileDetector());
			addFile.sendKeys(System.getProperty("user.dir")+"\\resources\\Documents\\POIDBACK.jpg");
    	}
    	catch(Exception e)
    	{
    		System.out.println(e.getMessage());
    	}
	
    }
    
    
    public void uploadPOFC() throws InterruptedException {
    	
    	if(DAF.isElementExist("Proof Of FinancialCapacity", "ProofOfFinancialCapacity", 10)) {
			DAF.isElementExist("POFC Dropdown", "POFCDropdown", 10);
			DAF.scroll_vertical(130);
			Thread.sleep(2000L);
			String POFC = "BIR Form 1700";
			DAF.Select_POFCDropdown(POFC); 
			System.out.println("Select ID type: "+POFC);
			
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
    	
        
        if(DAF.isElementExist("acceptAllTerms", "acceptAllTerms", 10)) {
        	DAF.jsClick("Accept All Terms", "acceptAllTerms");    	
        }
		
    	
        if(DAF.isElementExist("Agree Button", "btnAgree", 10)) {
        	DAF.jsClick("btnAgree", "btnAgree");
       	
        }		
		Thread.sleep(3000);
		JavascriptExecutor js2 = (JavascriptExecutor) DriverManager.getDriver();
        js2.executeScript("arguments[0].click();", DAF.get_btnNext());
        
        Thread.sleep(6000);
    	
    }
    
    public void orderSummaryPageValidation() throws Exception {
    	
    	if(OP.isElementExist("Acquisition Summary Text", "AcquisitionSummary", 10)) {
    		System.out.println("********************************We are in Order summary Page*************************");
    	}
    	
    	OP.isElementExist("We Will Collect Payment Only When The Appication Is Approved Text", "WelCollectPayment", 10);
    	OP.isElementExist("Order Summary Text", "OrderSummary", 10);
    	OP.isElementExist("Order Summary Text", "OrderSummary", 10);
    	
    	if(OP.isElementExist("plan Name", "planName", 10)) {
    		String planName = OP.get_planName().getText();
    		System.out.println("Plan Name Selected: "+planName);
    	}
    	
    	OP.isElementExist("Device Image", "deviceImg", 10);
    	
    	if(OP.isElementExist("Device Name", "deviceName", 10)) {
    		String deviceName = OP.get_deviceName().getText();
    		System.out.println("Plan Name Selected: "+deviceName);
    	}
    	OP.isElementExist("All Access Data", "AllAccessData", 10);
    	OP.isElementExist("GoWifi", "GoWifi", 10);
    	OP.isElementExist("Call And Text", "CallAndText", 10);
    	OP.isElementExist("Plan Inclusion", "PlanInclusion", 10);
    	OP.isElementExist("KonsultaMD", "KonsultaMD", 10);
    	OP.isElementExist("3 Months VIP Access To iQIYI", "VIPAccessToiQIYI", 10);
    	OP.isElementExist("3 Months VIP Access To weTV", "VIPAccessToweTV", 10);
    	OP.isElementExist("Addons Text", "Addons", 10);
    	OP.isElementExist("My SuperDuo", "MySuperDuo", 10);
    	OP.isElementExist("Amazon Prime Video", "AmazonPrimeVideo", 10);
    	OP.isElementExist("Viu Premium", "ViuPremium", 10);
    	OP.isElementExist("Spotify Premium", "SpotifyPremium", 10);
    	OP.isElementExist("GOCALLIDD", "GOCALLIDD", 10);
    	OP.isElementExist("Easy Roam", "EasyRoam", 10);
    	OP.isElementExist("GSAddSurf", "GSAddSurf", 10);
    	OP.isElementExist("One Time Payment Text", "OneTimePaymentText", 10);
    	OP.isElementExist("PlanApplication", "PlanApplication", 10);
    	
    	if(OP.isElementExist("Plan Application Collapse Button", "PlanApplicationCollapseBtn", 10)) {
    		OP.jsClick("PlanApplicationCollapseBtn", "PlanApplicationCollapseBtn");		
    	}
    	if(OP.isElementExist("Advance Monthly Service Charge", "AdvanceMonthlyServiceCharge", 10)) {
    		String AdvanceMonthlyServiceCharge = OP.get_AdvanceMonthlyServiceCharge().getText();
    		System.out.println("Advance Monthly Service Charge: "+AdvanceMonthlyServiceCharge);		
    	}
    	if(OP.isElementExist("Device Cost", "DeviceCost", 10)) {
    		String DeviceCost = OP.get_DeviceCost().getText();
    		System.out.println("DeviceCost: "+DeviceCost);		
    	}
    	if(OP.isElementExist("Shipping", "Shipping", 10)) {
    		String Shipping = OP.get_Shipping().getText();
    		System.out.println("Shipping: "+Shipping);		
    	}
    	if(OP.isElementExist("One Time Payment", "OneTimePayment", 10)) {
    		String OneTimePayment = OP.get_OneTimePayment().getText();
    		System.out.println("OneTimePayment: "+OneTimePayment);		
    	}
    	
    	OP.isElementExist("Got PromoCode", "GotPromoCode", 10);
    	OP.isElementExist("Ship To This Address Text", "ShipToThisAddressText", 10);
    	OP.isElementExist("Click Here Btn", "ClickHereBtn", 10);
    	
    	if(OP.isElementExist("Shipping Address", "ShippingAddress", 10)) {
    		String ShippingAddress = OP.get_ShippingAddress().getText();
    		System.out.println("ShippingAddress: "+ShippingAddress);		
    	}
    	
    	OP.isElementExist("Change Address Link", "ChangeAddress", 10);
    	OP.isElementExist("Monthly Payment Text", "MonthlyPayment", 10);
    	OP.isElementExist("No Need To Pay Today Text", "NoNeddToPayToday", 10);
    	OP.isElementExist("Addons Text", "AddonsText", 10);
    	
    	if(OP.isElementExist("Addons Collapse Btn", "AddonscollapseBtn", 10)) {
    		OP.jsClick("AddonsCollapseBtn", "AddonscollapseBtn");		
    	}
    	
    	OP.isElementExist("My_SuperDuo", "My_SuperDuo", 10);
    	OP.isElementExist("Amazon_PrimeVideo", "Amazon_PrimeVideo", 10);
    	OP.isElementExist("Viu_Premium", "Viu_Premium", 10);
    	OP.isElementExist("Spotify_Premium", "Spotify_Premium", 10);
    	OP.isElementExist("Easy_Roam", "Easy_Roam", 10);
    	OP.isElementExist("GOCALLIDD_199", "GOCALLIDD_199", 10);
    	OP.isElementExist("GS_Add_Surf", "GS_Add_Surf", 10);
    	
    	if(OP.isElementExist("Total_Addons", "Total_Addons", 10)) {
    		String Total_Addons = OP.get_Total_Addons().getText();
    		System.out.println("Total_Addons: "+Total_Addons);		
    	}
    	
    	if(OP.isElementExist("Total_MonthlyBill", "Total_MonthlyBill", 10)) {
    		String Total_MonthlyBill = OP.get_Total_MonthlyBill().getText();
    		System.out.println("Total_MonthlyBill: "+Total_MonthlyBill);		
    	}
    	
    	if(OP.isElementExist("Submit Order Button", "submitOrder", 10)) {
    		OP.jsClick("Submit Order Button", "submitOrder");		
    	} 
    	
    	Thread.sleep(8000);
    }
    
    public void paymentPageValidation(String PaymentMode) throws Exception {
    	
    	if(PayP.isElementExist("Acquisition Pay Text", "AcquisitionPay", 10)) {
    		System.out.println("********************************We are in Payment Page*************************");
    	}
    	
    	PayP.isElementExist("We Will Collect Payment when appication is approved Text", "WelCollectPayment", 10);
    	PayP.isElementExist("Select Payment Method Text", "SelectPaymentMethod", 10);
    	PayP.isElementExist("Select Payment Method Text", "SelectPaymentMethod", 10);
    	
    	switch (PaymentMode) {
		case "Gcash":
    		PayP.jsClick("Gcash", "Gcash");
			break;
		case "COD":
    		PayP.jsClick("CashOnDelivery", "CashOnDelivery");
			break;
		case "HSBC":
    		PayP.jsClick("HSBC", "HSBC");
			break;
		case "CC":
    		PayP.jsClick("CreditCard", "CreditCard");
			break;
		case "Bpi":
    		PayP.jsClick("Bpi", "Bpi");
			break;
		default :
			System.out.println("Given mode of payment not exist");
    	}
    	
    	PayP.isElementExist("One Time Payment Text", "OneTimePaymentText", 10);
    	PayP.isElementExist("Plan Application Text", "PlanApplication", 10);
    	
    	if(PayP.isElementExist("Plan Application Collapse Button", "PlanApplicationCollapseBtn", 10)) {
    		PayP.jsClick("PlanApplicationCollapseBtn", "PlanApplicationCollapseBtn");		
    	}
    	
    	if(PayP.isElementExist("Advance MonthlyServiceCharge", "AdvanceMonthlyServiceCharge", 10)) {
    		String AdvanceMonthlyServiceCharge = PayP.get_AdvanceMonthlyServiceCharge().getText();
    		System.out.println("AdvanceMonthlyServiceCharge: "+AdvanceMonthlyServiceCharge);		
    	}
    	if(PayP.isElementExist("Device Cost", "DeviceCost", 10)) {
    		String DeviceCost = PayP.get_DeviceCost().getText();
    		System.out.println("DeviceCost: "+DeviceCost);		
    	}
    	if(PayP.isElementExist("Shipping", "Shipping", 10)) {
    		String Shipping = PayP.get_Shipping().getText();
    		System.out.println("Shipping: "+Shipping);		
    	}
    	if(PayP.isElementExist("TotalAmount", "TotalAmount", 10)) {
    		String TotalAmount = PayP.get_TotalAmount().getText();
    		System.out.println("TotalAmount: "+TotalAmount);		
    	}
    	
    	PayP.isElementExist("Got PromoCode Text", "GotPromoCode", 10);
    	PayP.isElementExist("Ship To This Address Text", "ShipToThisAddressText", 10);
    	PayP.isElementExist("Click Here Btn", "ClickHereBtn", 10);
    	
    	if(PayP.isElementExist("Shipping Address", "ShippingAddress", 10)) {
    		String ShippingAddress = PayP.get_ShippingAddress().getText();
    		System.out.println("ShippingAddress: "+ShippingAddress);		
    	}
    	
    	PayP.isElementExist("Change Address Link", "ChangeAddress", 10);
    	PayP.isElementExist("Monthly Payment Text", "MonthlyPayment", 10);
    	PayP.isElementExist("No Need To Pay Today Text", "NoNeddToPayToday", 10);
    	PayP.isElementExist("Addons Text", "AddonsText", 10);
    	
    	if(PayP.isElementExist("Addons Collapse Btn", "AddonscollapseBtn", 10)) {
    		PayP.jsClick("AddonscollapseBtn", "AddonscollapseBtn");		
    	}
    	
    	PayP.isElementExist("My_SuperDuo", "My_SuperDuo", 10);
    	PayP.isElementExist("Amazon_PrimeVideo", "Amazon_PrimeVideo", 10);
    	PayP.isElementExist("Viu_Premium", "Viu_Premium", 10);
    	PayP.isElementExist("Spotify_Premium", "Spotify_Premium", 10);
    	PayP.isElementExist("Easy_Roam", "Easy_Roam", 10);
    	PayP.isElementExist("GOCALLIDD_199", "GOCALLIDD_199", 10);
    	PayP.isElementExist("GS_Add_Surf", "GS_Add_Surf", 10);
    	
    	if(PayP.isElementExist("Total_Addons", "Total_Addons", 10)) {
    		String Total_Addons = PayP.get_Total_Addons().getText();
    		System.out.println("Total_Addons: "+Total_Addons);		
    	}
    	
    	if(PayP.isElementExist("Total_MonthlyBill", "Total_MonthlyBill", 10)) {
    		String Total_MonthlyBill = PayP.get_Total_MonthlyBill().getText();
    		System.out.println("Total_MonthlyBill: "+Total_MonthlyBill);		
    	}
    	
    	if(PayP.isElementExist("Submit Order Button", "submitOrder", 10)) {
    		PayP.jsClick("Submit Order Button", "submitOrder");		
    	}  
    	
    	Thread.sleep(10000);   	
    }
    
    
    public void handle_survey_popup(String Q1rate, String Q1Text, String Q2rate, String Q2Text) throws InterruptedException {

		String expShopExperience = "How did you like your shopping experience?";
		String expRecommendGlobe = "Based on your online purchases, how likely are you to recommend Globe to others?";
		String expTxtTellUs = "Tell us how you feel";
		String expshareWithOther = "Don’t keep it to yourself. Share the love! Send the link to your friends and let them know.";
		String exptxtThatsNice = "Awww that's nice.";

		String logSuccess = "Validated survery text. ";
		String logFail = "Failed to validate survey text. ";

		if (Survey.isElementExist("Survery popup", "surveyForm", 15)) {

			// validate text messages for shopping experience
			String actShopExperience = Survey.get_txt_shoppingExperience().getText();
			if (actShopExperience.equals(expShopExperience)) {
				System.out.println(logSuccess + " : " + expShopExperience);
			} else {
				System.out.println(logFail + "Expected : " + expShopExperience + " - Actual : " + actShopExperience);
			}

			String act_ShopExp_TellUs = Survey.get_txt_shopExperience_feedback_().getText();
			if (act_ShopExp_TellUs.equals(expTxtTellUs)) {
				System.out.println(logSuccess + " : " + expTxtTellUs);
			} else {
				System.out.println(logFail + "Expected : " + expTxtTellUs + " - Actual : " + act_ShopExp_TellUs);
			}

			// validate text messages for recommend Globe
			String actRecommendGlobe = Survey.get_txt_recommendGlobe().getText();
			if (actRecommendGlobe.equals(expRecommendGlobe)) {
				System.out.println(logSuccess + ": " + expRecommendGlobe);
			} else {
				System.out.println(logFail + "Expected : " + expRecommendGlobe + " - Actual : " + actRecommendGlobe);
			}

			String act_Recommend_TellUs = Survey.get_txt_recommend_feedback().getText();
			if (act_Recommend_TellUs.equals(expTxtTellUs)) {
				System.out.println(logSuccess + ": " + expTxtTellUs);
			} else {
				System.out.println(logFail + ". Expected : " + expTxtTellUs + " - Actual : " + act_Recommend_TellUs);
			}

			// validate shopping experience emoji
			System.out.println("Printing Shopping Experience Emoji");
			for (int i = 0; i < Survey.get_shopExpEmoji().size(); i++) {
				System.out.println(Survey.get_shopExpEmoji().get(i).getAttribute("id"));
			}

			if(Q1rate.equalsIgnoreCase("VERY DISSATISFIED")) {
				// select VERY DISSATISFIED emoji for shopping experience and give feedback
				Survey.get_shopExpEmoji().get(4).click();
				System.out.println("Select Shopping exp emoji : 5 - VERY DISSATISFIED");
				Survey.get_shopExpFeedbackTextArea().sendKeys(Q1Text);Thread.sleep(2500);
				System.out.println("Q1 Inserted feedback : "+Q1Text+"\n");}

			else if(Q1rate.equalsIgnoreCase("DISSATISFIED")) {
				// select DISSATISFIED emoji for shopping experience and give feedback
				Survey.get_shopExpEmoji().get(3).click();
				System.out.println("Select Shopping exp emoji : 4 - DISSATISFIED");
				Survey.get_shopExpFeedbackTextArea().sendKeys(Q1Text);Thread.sleep(2500);
				System.out.println("Q1 Inserted feedback : "+Q1Text+"\n");}

			else if(Q1rate.equalsIgnoreCase("FAIR")) {
				// select FAIR emoji for shopping experience and give feedback
				Survey.get_shopExpEmoji().get(2).click();Thread.sleep(2500);
				System.out.println("Select Shopping exp emoji : 3 - FAIR");}

			else if(Q1rate.equalsIgnoreCase("HAPPY")) {
				// select HAPPY emoji for shopping experience and give feedback
				Survey.get_shopExpEmoji().get(1).click();Thread.sleep(2500);
				System.out.println("Select Shopping exp emoji : 2 - HAPPY");}

			else if(Q1rate.equalsIgnoreCase("VERY HAPPY")) {
				// select HAPPY emoji for shopping experience and give feedback
				Survey.get_shopExpEmoji().get(0).click();Thread.sleep(5000);
				System.out.println("Select Shopping exp emoji : 1 - VERY HAPPY");}



			// validate recommend globe emoji
			System.out.println("Printing Recommend Globe Emoji");
			for (int i = 0; i < Survey.get_recomGlobeEmoji().size(); i++) {
				System.out.println(Survey.get_recomGlobeEmoji().get(i).getAttribute("id"));
			}

			if(Q2rate.equalsIgnoreCase("VERY DISSATISFIED")) {
				// select VERY DISSATISFIED emoji for recommend globe and give feedback
				Survey.get_recomGlobeEmoji().get(4).click();
				System.out.println("Select Recommend Globe emoji : 5 - VERY DISSATISFIED");
				Survey.get_RecomGlobeTextArea().sendKeys(Q2Text);Thread.sleep(5000);
				System.out.println("Inserted feedback : "+Q2Text+"\n");}

			else if(Q2rate.equalsIgnoreCase("DISSATISFIED")) {
				// select DISSATISFIED emoji for recommend globe and give feedback
				Survey.get_recomGlobeEmoji().get(3).click();
				System.out.println("Select Recommend Globe emoji : 4 - DISSATISFIED");
				Survey.get_RecomGlobeTextArea().sendKeys(Q2Text);Thread.sleep(5000);
				System.out.println("Inserted feedback : "+Q2Text+"\n");}

			else if(Q2rate.equalsIgnoreCase("FAIR")) {
				// select FAIR emoji for recommend globe and give feedback
				Survey.get_recomGlobeEmoji().get(2).click();Thread.sleep(5000);
				System.out.println("Select Recommend Globe emoji : 3 - FAIR");}

			else if(Q2rate.equalsIgnoreCase("HAPPY")) {
				// select FAIR emoji for recommend globe and give feedback
				Survey.get_recomGlobeEmoji().get(1).click();Thread.sleep(5000);
				System.out.println("Select Recommend Globe emoji : 2 - HAPPY");}

			else if(Q2rate.equalsIgnoreCase("VERY HAPPY")) {
				// select FAIR emoji for recommend globe and give feedback
				Survey.get_recomGlobeEmoji().get(0).click();Thread.sleep(5000);
				System.out.println("Select Recommend Globe emoji : 1 - VERY HAPPY");}


			// submit survey
			Survey.get_submitSurver().click();
			Thread.sleep(2000L);

			// validate thumbs up image
			if (Survey.isElementExist("Image - Survey success", "imgSurveySuccess", 10)) {
				System.out.println("Thumbs up image displayed");

				String actThatsNice = Survey.get_txt_thatsNice().getText();
				if (actThatsNice.equals(exptxtThatsNice)) {
					System.out.println(logSuccess + " : " + exptxtThatsNice);
				} else {
					System.out.println(logFail + " Expected : " + exptxtThatsNice + " - Actual : " + actThatsNice);
				}

				String actShareOthers = Survey.get_txt_shareOthers().getText();
				if (actShareOthers.equals(expshareWithOther)) {
					System.out.println(logSuccess + " : " + expshareWithOther);
				} else {
					System.out.println(logFail + " Expected : " + expshareWithOther + " - Actual : " + actShareOthers);
				}

				if (Survey.isElementExist("Survey - Close button", "closeButton", 15)) {
					Survey.get_closeButton().click();
				} else {
					System.out.println("Close icon not found on survey popup");
				}

			} else {
				System.out.println("Thumbs image not displayed");
			}

		} else {
			System.out.println("Feedback popup do not open");
		}


	}
    
    
    public void validateThankYouPage() throws Exception {
    	
    	if(TP.isElementExist("ThankYou Text", "thankYouText", 10)) {
    		System.out.println("*******************************We are in ThankYou page******************************************");
    	}
    	
    	TP.isElementExist("For Processing Text", "forProcessing", 10);
    	TP.isElementExist("You Are On The List Text", "youOnTheListText", 10);
    	TP.isElementExist("Reservation Request Received Text", "reservationRequestReceived", 10);
    	
    	
    	TP.isElementExist("Order Summary Text", "OrderSummaryText", 10);
    	
    	if(TP.isElementExist("shipping Address", "shippingAddress", 10)) {
    		String shippingAddress = TP.get_shippingAddress().getText();
    		System.out.println("shipping Address: "+shippingAddress);
    	}
    	
    	if(TP.isElementExist("Amount To Pay", "AmountToPay", 10)) {
    		String AmountToPay = TP.get_AmountToPay().getText();
    		System.out.println("Amount To Pay: "+AmountToPay);
    	}
    	
    	if(TP.isElementExist("paymentMethod Used", "paymentMethod", 10)) {
    		String paymentMethod = TP.get_paymentMethod().getText();
    		System.out.println("Payment Method: "+paymentMethod);
    	}
    	
    	TP.isElementExist("ThankYou For Reservation Text", "thankYouForReservationText", 10);
    	TP.isElementExist("Device Image", "deviceImage", 10);
    	
    	if(TP.isElementExist("Device Name Selected", "deviceName", 10)) {
    		String deviceName = TP.get_deviceName().getText();
    		System.out.println("Device Name Selected: "+deviceName);
    	}
    	
    	if(TP.isElementExist("PlanName", "planName", 10)) {
    		String planName = TP.get_planName().getText();
    		System.out.println("Plan Name: "+planName);
    	}
    	
    	TP.isElementExist("Contract Duration Text", "contractDurationText", 10);
    	TP.isElementExist("Color Capacity Text", "color_CapacityText", 10);
    	TP.isElementExist("Plan Inclusions Text", "planInclusionsText", 10);
    	TP.isElementExist("KonsultaMD Subscription", "KonsultaMD_Subscription", 10);
    	TP.isElementExist("iQIYI Access", "iQIYI_Access", 10);
    	TP.isElementExist("weTV Access", "weTV_Access", 10);
    	TP.isElementExist("addons Text", "addons_Text", 10);
    	TP.isElementExist("MySuperDuo", "MySuperDuo", 10);
    	TP.isElementExist("AmazonPrimeVideo", "AmazonPrimeVideo", 10);
    	TP.isElementExist("ViuPremium", "ViuPremium", 10);
    	TP.isElementExist("SpotifyPremium", "SpotifyPremium", 10);
    	TP.isElementExist("GOCALLIDD", "GOCALLIDD", 10);
    	TP.isElementExist("EasyRoam", "EasyRoam", 10);
    	TP.isElementExist("GSAddSurf99", "GSAddSurf99", 10);
    	TP.isElementExist("Reminders", "Reminders", 10);
    	
    	if(TP.isElementExist("ReferenceNo","ReferenceNumber", 10)) {
    	    Constant.ReferenceNo = TP.get_ReferenceNumber().getText();
        	System.out.println("ReferenceNo: "+Constant.ReferenceNo); 
        	Constant.dataMap.get().put("ReferenceNo", Constant.ReferenceNo);
    		System.out.println("Order Completed successfully : " + Constant.ReferenceNo);
    	}
    	
    }
    
public void validateOrderTrackerDetailsSimonly(String email) throws InterruptedException {
		
		TrackOrder.jsClick("trackOrderLink", "trackOrderLink");
		Thread.sleep(5000);
		TrackOrder.get_referenceNumber().sendKeys(Constant.ReferenceNo);
		System.out.println("Inserted Reference Number on Track your order screen : " + Constant.ReferenceNo);
		
		TrackOrder.get_email().sendKeys(email);
		System.out.println("Inserted email on Track your order screen :"+ email);
		
		TrackOrder.jsClick("btn_trackOrder", "btn_trackOrder");

		if(OrderDetails.isElementExist("OrderDetails", "OrderDetails", 10)) {
			System.out.println("*****************************We are in order tracker page******************************");
		} 
		
		OrderDetails.isElementExist("MyOrder", "MyOrder", 10);
		
		if(OrderDetails.isElementExist("REFERENCE NUMBER","REFERENCE_NUMBER", 10)) {
    		String REFERENCE_NUMBER = OrderDetails.get_REFERENCE_NUMBER().getText();
        	System.out.println("REFERENCE_NUMBER: "+REFERENCE_NUMBER);  
    	}
		
		OrderDetails.isElementExist("Processing", "Processing", 10);
		OrderDetails.isElementExist("Deliver", "Deliver", 10);
		OrderDetails.isElementExist("Receive", "Receive", 10);

		if(OrderDetails.isElementExist("orderTrackerStatus","orderTrackerStatus", 10)) {
    		String orderTrackerStatus = OrderDetails.get_orderTrackerStatus().getText();
        	System.out.println("orderTrackerStatus: "+orderTrackerStatus);  
    	}
		
		if(OrderDetails.isElementExist("DateOrdered","DateOrdered", 10)) {
    		String DateOrdered = OrderDetails.get_DateOrdered().getText();
        	System.out.println("DateOrdered: "+DateOrdered);  
    	}
		
		
		if(OrderDetails.isElementExist("Total Amount","totalAmount", 10)) {
    		String totalAmount = OrderDetails.get_totalAmount().getText();
        	System.out.println("totalAmount: "+totalAmount);  
    	}
		
		
		if(OrderDetails.isElementExist("ShipToThisAddress","ShipToThisAddress", 10)) {
    		String ShipToThisAddress = OrderDetails.get_ShipToThisAddress().getText();
        	System.out.println("ShipToThisAddress: "+ShipToThisAddress);  
    	}
		
		
		if(OrderDetails.isElementExist("planType","planType", 10)) {
    		String planType = OrderDetails.get_planType().getText();
        	System.out.println("planType: "+planType);  
    	}
		
		OrderDetails.isElementExist("AllAccessData", "AllAccessData", 10);
		OrderDetails.isElementExist("GoWifi", "GoWifi", 10);
		OrderDetails.isElementExist("CallAndtext", "CallAndtext", 10);
		OrderDetails.isElementExist("PlanInclusions", "PlanInclusions", 10);
		OrderDetails.isElementExist("KonsultaMD", "KonsultaMD", 10);
		OrderDetails.isElementExist("Add_ons", "Add_ons", 10);
		OrderDetails.isElementExist("AmazonPrimeVideo", "AmazonPrimeVideo", 10);
		OrderDetails.isElementExist("ViuPremium", "ViuPremium", 10);
		OrderDetails.isElementExist("MySuperDuo", "MySuperDuo", 10);
		OrderDetails.isElementExist("EasyRoam", "EasyRoam", 10);
		OrderDetails.isElementExist("GOCALLIDD", "GOCALLIDD", 10);		
	}



	
	

}
