package globeOnline_ADA;
import static org.testng.Assert.assertTrue;

import java.util.LinkedHashMap;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.pages.ada.ADADAF_Page;
import com.pages.ada.ADALanding_Page;
import com.pages.ada.ADAPDP_page;
import com.pages.ada.CheckoutPage;

import globeOnline_CommonMethods.DriverManager;
import globeOnline_CommonMethods.SetDriver;
import globeOnline_CommonMethods.util;
import utility.Constant;


public class ADA3 extends SetDriver{

	private static ADA3 ADA3Scenario = new ADA3();
	private util util = new util();

	private ADAcommonmethods common = new ADAcommonmethods();
	private CheckoutPage checkout = new CheckoutPage();
	private ADADAF_Page Form = new ADADAF_Page();
	private ADALanding_Page LP = new ADALanding_Page();
	private ADAPDP_page PP = new ADAPDP_page();

	private String Status = "failed";
	private static LinkedHashMap<String,String> Map = new LinkedHashMap<>();
	@Test
	public void ADA3Scenario() throws Exception {
		JavascriptExecutor jse = (JavascriptExecutor)DriverManager.getDriver();
		jse.executeScript("lambda-name=ADA 3");


		//User access URL 
		DriverManager.getDriver().get("https://onlinepreprod.globe.com.ph/");
		assertTrue(DriverManager.getDriver().getTitle().contains("Globe Online"));
		System.out.println("Validated title : Globe Online");
		// line 502
		if (LP.isElementExist("Cookies Notification", "cookiesNotification", 10)) {
			LP.get_privacyAccept().click();
			System.out.println("Clicked on 'Privacy - I accept' button");
		}
		Constant.dataMap.set(Constant.LinkedMap);

		Constant.dataMap.get().put("TestClassName",ADA3Scenario.getClass().getSimpleName());
		Constant.dataMap.get().put("OMT_TimeStamp", "NOT_FOUND");
		Constant.dataMap.get().put("OMT_OrderState", "NOT_FOUND");
		Constant.dataMap.get().put("OMT_OrderID", "NOT_FOUND");
		Constant.dataMap.get().put("OMT_LAS", "NOT_FOUND");
		Constant.dataMap.get().put("OMT_DispositionStatus", "NOT_FOUND");
		Constant.dataMap.get().put("OMT_MobileNumber", "NOT_FOUND");
		Constant.dataMap.get().put("ProductName", "NOT_FOUND");
		Constant.dataMap.get().put("ProductQty", "NOT_FOUND");

		Constant.dataMap.get().put("AmountPaid", "NOT_FOUND");
		Constant.dataMap.get().put("OMT_UpdateDate", "NOT_FOUND");
		Constant.dataMap.get().put("OMT_DateOrdered", "NOT_FOUND");
		Constant.dataMap.get().put("OMT_EstimatedDayOfDelivery", "NOT_FOUND");
		Constant.dataMap.get().put("OMT_CustomerDetails", "NOT_FOUND");
		Constant.dataMap.get().put("OMT_RecipientDetails", "NOT_FOUND");
		Constant.dataMap.get().put("OMT_AddressDetails", "NOT_FOUND");
		Constant.dataMap.get().put("OMT_OrderDetails", "NOT_FOUND");
		Constant.dataMap.get().put("OMT_PaymentDetails", "NOT_FOUND");

		Constant.dataMap.get().put("Magento_Details","NOT_FOUND");
		Constant.dataMap.get().put("Magento_OrderAccountInfo","NOT_FOUND");
		Constant.dataMap.get().put("Magento_AddressInformation","NOT_FOUND");
		Constant.dataMap.get().put("Magento_PaymentShippingMethod","NOT_FOUND");
		Constant.dataMap.get().put("Magento_ItemsOrdered","NOT_FOUND");
		Constant.dataMap.get().put("Magento_OrderTotal","NOT_FOUND");


		// ************************************************************************************

		//line 412-414 Validate Main landing page 
		common.apply_LandingPage();
		LP.isElementExist("Build my plan", "link_buildMyPlan", 10);
		common.FAQ();		

		//line 413 - Validate Hamburger menu 
		common.ValidateMenu();

		//line 414-415 - Click on chevron of Apply in Hamburger menu && Click on Chevron of apply again 
		common.NavigateTo_ApplyMenu();

		//line 417 - click on hamburger menu and click Help 
		common.NavigateTo_HelpMenu();

		//line 418 - click on hamburger menu  and click track my order 
		common.NavigateTo_TrackMyOrder();

		//line 419 -  click on hamburger menu, click Chevron of Apply and click View all devices
		common.NavigateTo_Apply_ViewAllDevices();

		//line 420 - click on hamburger menu, click Chevron of Apply and click on mobile postpaid 
		common.NavigateTo_Apply_MobilePostpaid();

		//line 421 -422  Go back to hamburger menu and click on View all devices 
		common.NavigateTo_Apply_ViewAllDevices();

		//line 423-424 - Validate Gallery page && click on apply with this device 		
		//		common.ValidateGalleryPage();
		common.ValidateGalleryPageWithGplan1499();

		//================ PDP PAGE ===============
		//line 425 - Browse all device in device carousel in plan builder page 
		//common.PDPGplanwithDevice_BrowseDevicesInCarousel();

		//Searching device 
		//common.searchDevice();

		Thread.sleep(5000);


		common.PDPGplanwithDevice2499();

		common.insert_phoneNo("09270009586");  //09271050268");//09270999566




		JavascriptExecutor jsp = (JavascriptExecutor) DriverManager.getDriver();
		jsp.executeScript("arguments[0].click();", PP.get_proceedbtn1());

		//line 435 - Enter the valid  6 digit otp code, Validate if user can input only 6 digit code not more than 
		if (checkout.isElementExist("Text OTP", "otpText", 30)) {
			System.out.println("Navigated to screen to insert OTP");
		}
		util.assertContainText("Validated title", DriverManager.getDriver().getTitle(), "One-Time Password");

		common.handle_and_insert_OTP();

		Thread.sleep(10000);


		//line 437-438 - Validate brand Globe postpaid && click "I 'm applying for a additional plan "	
		common.validate_acquiConfirmationPage();


		Thread.sleep(10000L);


		//line 442-443 - Validate plan builder page after OTP && Validate plan breakdown
		PP.isElementExist("Mobilenum", "Breakdown_Mobilenum", 10);
		PP.isElementExist("Planname", "PlanName", 10);
		PP.isElementExist("Planamount", "Plan_amount", 10);
		PP.isElementExist("subs", "Subsandaddonheader", 10);
		PP.isElementExist("MyDuo", "MyDuo", 10);
		PP.isElementExist("AmazonPrimeVideoAddon", "AmazonPrimeVideoAddon", 10);	
		PP.isElementExist("Viu Premium Addon", "ViuPremiumAddon", 10);
		PP.isElementExist("Spotify Premium", "SpotifyPremium1", 10);
		PP.isElementExist("subs", "Subsandaddonheader", 10);
		PP.isElementExist("MyDuo", "MyDuo", 10);
		PP.isElementExist("Amazon", "AmazonPrimeVideoAddon", 10);
		PP.isElementExist("EastRoamAddon", "EastRoamAddon", 10);
		PP.isElementExist("GOCALLIDDAddon", "GOCALLIDDAddon", 10);
		PP.isElementExist("GOCALLIDDAddon", "GSAddSurf", 10);
		PP.isElementExist("Totalsubsandaddons", "Totalsubsandaddons", 10);
		PP.isElementExist("totalsubsaddon", "TotalSubsandAddons_amount", 10);
		PP.isElementExist("MothlyBillheader", "Monthlybill_header", 10);
		PP.isElementExist("Monthlybillamnt", "Monthlybill_amount", 10);
		PP.isElementExist("Monthlypaymnt", "Monthly_payment", 10);
		PP.isElementExist("Monthlypaymentamount", "Monthlypayment_amount", 10);
		//line 164-165 - Click on proceed with this plan && Proceed with transaction
		PP.isElementExist("Breakdown_proceedbutton", "Breakdown_proceedbutton", 10);
		//		PP.clickOnElement("Button", "Proceedbuttton", "Breakdown_proceedbutton");
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("arguments[0].click();", PP.get_Breakdown_proceedbutton());



		//line 445 - Validate ADA DAF page 
		Thread.sleep(10000L);

		common.validateDAF();

		//line 446 - Validate Overdue balance breakdown 
		//common.validateOB();

		//line 447 - Verify the Mandatory fields in Personal info page
		common.validatePersonalInfo_MandatoryFields();

		//line 447 - Validate Personal information &&  input perosonal information details and billing address details (Condo)  
		common.insert_personal_info_on_form_RandomName("sakhamuri.lavanya@globe.com.ph");

		//line 448 - Validate Billing address && line 171 - input perosonal information details and billing address details (Condo) 
		common.insert_address_details("Condo","11", "Annex 7 Amity Circle", "Betterliving",  "METRO MANILA", "CITY OF MANDALUYONG",  "Burol");

		//line 450 - click next: delivery infromation CTA 
		Form.get_DeliveryInfoCTA().click();

		//line 451 - Validate DAF - Delivery address page 
		Form.isElementExist("journeystatus", "journeyDAF2", 10);

		//line 452 - Validate Shipping address 
		//line 453 - Toggle on My shipping address is same from my billing address
		//		Form.Togglebtn_select();
		common.DeliveryAdd_page();
		//line 454 - input Alternate recipients and contact details fields
		common.Select_Alternative_recipentDetails();

		//line - 455- Next Upload Documents button
		common.Next_uploadDocument();


		common.Upload_RequiredDocPOID();

		common.Upload_File1();

		//common.Upload_RequiredDocPOID();
		common.upload_file();

		//Form.DropDownDisplay2();
		common.Upload_RequiredDocPOFC();

		common.Upload_file2();

		Thread.sleep(5000);

		common.orderSummaryADA_1499();

		//line 471-472 - validate payment page && Select CC (Straight payment) && Click Pay "Submit" and process payment
		common.SelectPaymentOption("CCStraightpayment");
		common.paymentPageGplanwithDevice_1499_CC();

		// ********************SRUVEY MODAL**********************
		Thread.sleep(5000L);	
		System.out.println("\n"+"*********  SURVEY MODAL ************");
		common.verify_handle_survey_popup_withInput("HAPPY", "", "DISSATISFIED", "Unresponsive");
		assertTrue(DriverManager.getDriver().getTitle().contains("Thank you"));		

		common.validateThankYouPage();
		common.capture_orderID();
		Constant.dataMap.get().put("TimeStamp", util.getTimeStamp());
		util.writeToExcelLastRowFromMap("Sheet1", Constant.dataMap.get());


		Thread.sleep(2500L);

		//common.validateOrderTrackerDetails("shaik.asma@globe.com.ph");
		common.validateOrderTrackerDetailsSimonly("shaik.asma@globe.com.ph");

		Status = "passed";
		//		DriverManager.getDriver().quit();
		System.out.println("!!! Execution Completed for "+this.getClass().getName()+" !!!");

	}

	@AfterClass
	public void tearDown() throws Exception {
		if (DriverManager.getDriver() != null) {
			((JavascriptExecutor) DriverManager.getDriver()).executeScript("lambda-status=" + Status);
			DriverManager.getDriver().quit();
		}
	}

}





