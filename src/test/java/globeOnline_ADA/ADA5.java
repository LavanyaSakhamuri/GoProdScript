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


public class ADA5 extends SetDriver{


	private static ADA5 ADA5Scenario = new ADA5();
	private util util = new util();

	private ADAcommonmethods common = new ADAcommonmethods();
	private CheckoutPage checkout = new CheckoutPage();
	private ADADAF_Page Form = new ADADAF_Page();
	private ADALanding_Page LP = new ADALanding_Page();
	private ADAPDP_page PP = new ADAPDP_page();
	
	private String Status = "failed";
	private static  LinkedHashMap<String,String> Map = new LinkedHashMap<>();
	@Test
	public void ADA5Scenario() throws Exception {
		//JavascriptExecutor jse = (JavascriptExecutor)DriverManager.getDriver();
		//jse.executeScript("lambda-name=ADA 5");


		//User access URL 
		DriverManager.getDriver().get("https://onlinepreprod.globe.com.ph/");
		assertTrue(DriverManager.getDriver().getTitle().contains("Globe Online"));
		System.out.println("Validated title : Globe Online");

		if (LP.isElementExist("Cookies Notification", "cookiesNotification", 10)) {
			LP.get_privacyAccept().click();
			System.out.println("Clicked on 'Privacy - I accept' button");
		}

		Constant.dataMap.set(Map);
		Constant.dataMap.get().put("TestClassName",ADA5Scenario.getClass().getSimpleName());
		Constant.dataMap.get().put("OMT_LAS", "NOT FOUND");
		Constant.dataMap.get().put("OMT_DispositionStatus", "NOT FOUND");
		Constant.dataMap.get().put("OMT_UpdateDate", "NOT FOUND");
		Constant.dataMap.get().put("OMT_DateOrdered", "NOT FOUND");
		Constant.dataMap.get().put("OMT_EstimatedDayOfDelivery", "NOT FOUND");
		Constant.dataMap.get().put("OMT_OrderDetails", "NOT FOUND");
		Constant.dataMap.get().put("Magento_Details", "NOT FOUND");
		Constant.dataMap.get().put("Magento_OrderAccountInfo", "NOT FOUND");


		/************************************************************************************/
		//Accept cookies
		common.IacceptClick();

		//line 546 - Validate Page header 
		common.ValidateMenu();

		//line 547-548 - Hover over apply tab and validate  && Validate redirection of page when Clicking apply tab 
		common.NavigateTo_ApplyMenu();

		//line 550 - Validate redirection of page when clicking view all device from navigation bar 
		common.NavigateTo_Apply_ViewAllDevices();

		//line 549 - Validate redirection of page when hovering Apply then click Mobile Postpaid
		common.NavigateTo_Apply_MobilePostpaid();

		//line 552 - Validate Apply landing page
		common.apply_LandingPage();

		//line 553 - Validate floating button "Build my plan now" 
		LP.isElementExist("Build my plan", "link_buildMyPlan", 10);

		//line 554 - Validate FAQ's 
		common.FAQ();	

		//line 555 - select a plan in dropdown (Gplan sim-only) 
		common.SelectPlanType("Sim Only");

		//line 556 - click on plan 999 discovery BASIC button 
		if (PP.isClickable("Disc_Basicbtn", 5)) {
			//LP.scroll_vertical(4053);
			Thread.sleep(2000L);
			PP.moveToElement("Disc_Basicbtn");
			Thread.sleep(2000L);
			//PP.moveToElement("Disc_Basicbtn");
			PP.js_clickOnElement("Button", "Disc_Basicbtn", "Disc_Basicbtn");		
		}


		//line 557 - Validate Discovery page
		/*
		 * Thread.sleep(5000L); //
		 * assertTrue(DriverManager.getDriver().getTitle().contains("GPlan 999"));
		 * System.out.println("Validated title : GPlan 999 | Globe Online");
		 * PP.moveToElement("BasicBanner1"); PP.isElementExist("Banner1","BasicBanner1",
		 * 10); PP.moveToElement("Device_strtr_btn"); PP.isElementExist("WithDevice",
		 * "Device_strtr_btn", 10); PP.isElementExist("Gcash", "GCash_strtr_btn", 10);
		 * PP.isElementExist("Gcash", "Simonly_basic_btn", 10);
		 * PP.isElementExist("Gcash", "Alldata_strtr_btn", 10);
		 * PP.isElementExist("Banner2", "BasicBanner2", 10);
		 * PP.moveToElement("BasicBanner2"); PP.isElementExist("Banner3",
		 * "BasicBanner3", 10);PP.moveToElement("BasicBanner3");
		 * PP.isElementExist("Banner4", "BasicBanner4", 10);
		 * PP.moveToElement("BasicBanner4"); PP.isElementExist("Banner5","BasicBanner5",
		 * 10); PP.moveToElement("BasicBanner5"); PP.isElementExist("Banner6",
		 * "BasicBanner6", 10); PP.moveToElement("BasicBanner6");
		 * PP.isElementExist("Banner7","BasicBanner7", 10);
		 * PP.moveToElement("BasicBanner7"); PP.isElementExist("Banner8",
		 * "BasicBanner8", 10); PP.moveToElement("BasicBanner8"); //line 558 - Click on
		 * Build my plan in discovery page Thread.sleep(10000L);
		 * PP.clickOnElement("Button", "Buildmyplan", "Build_btn");
		 */ 

		//line 559 - Validate plan builder page 
		Thread.sleep(5000L);

		assertTrue(DriverManager.getDriver().getTitle().contains("Customize Your Globe Plan"));
		System.out.println("Validated title : Customize Your Globe Plan");

		//PDP Page
		common.PDPSimPlusOnly();
		
		common.insert_phoneNo(utility.Constant.ADA5_Testdata);

		//line 563 - Click "Proceed" button
		PP.clickOnElement("Button", "Proceed", "proceedbtn1");

		//line 564 - ENTER OTP
		if (checkout.isElementExist("Text OTP", "otpText", 30)) {
			System.out.println("Navigated to screen to insert OTP");
		}

		Thread.sleep(50000L);
		common.handle_and_insert_OTP();

		//line 565 - Validate elgibility checks (Page loader)
		//common.validateEligibility_LoaderPage();	
		Thread.sleep(10000);

		//line 566-567 - Validate brand Globe postpaid && click "I 'm applying for a additional plan "
		common.validate_acquiConfirmationPage();

		//line568 - Validate Second set of acount checking 
		//common.validateEligibility_LoaderPage();	
		Thread.sleep(50000L);

		//Validate Breakdown Page
		common.validateSimOnlyBreakdownPage();

		//line 575 - Validate  ADA DAF page 
		Thread.sleep(10000L);
		assertTrue(DriverManager.getDriver().getTitle().contains("Personal Information"));
		System.out.println("Validated title : Personal Information");	
		common.validateDAF();

		//line 576 - Validate Overdue balance breakdown 
		//common.validateOB();

		//line 577 - Validate Personal information
		common.validatePersonalInfo_MandatoryFields();

		//line 447 - Validate Personal information &&  input perosonal information details and billing address details (house)  
		common.insert_personal_info_on_form_RandomName("sakhamuri.lavanya@globe.com.ph");

		//line 578 - 579 - Validate Billing address && If billing address is not prefilled 
		common.insert_billing_address_details("House","12","Anex","Light Residences","METRO MANILA","CITY OF MANDALUYONG","Burol");

		//line 580 - click "Next: Delivery Information" 
		Form.js_clickOnElement("Button","NextDeliinfo","NextDeliinfo");

		//line 581-583 - Validate DAF - Delivery address page && Validate Shipping address && Select home button in radio button and input data 
		Thread.sleep(5000L);
		assertTrue(DriverManager.getDriver().getTitle().contains("Delivery Information"));
		System.out.println("Validated title : Delivery Information");	
		common.insert_address_details("House","11","Annex 7  Amity circle","Better Living","METRO MANILA","CITY OF MANDALUYONG","Burol");


		//line 584 - input Alternate recipients and contact details fields
		common.Select_Alternative_recipentDetails();

		//Instruction
		Form.get_AlternativeDeliveryInstruction().sendKeys("Call me");
		System.out.println("Alternative Delivery Instruction: Call me");

		//line 585 - 591
		//next Upload Documents button
		common.Next_uploadDocument();		

		Thread.sleep(10000L);
		assertTrue(DriverManager.getDriver().getTitle().contains("Upload Documents"));
		System.out.println("Validated title : Upload Documents");
		
		//common.Upload_RequiredDocPOID();
		common.Upload_RequiredDocPOID();		
		common.Upload_File1();		
		common.upload_file();
		
		//common.Upload_RequiredDocPOFC();
		common.Upload_RequiredDocPOFC();		
		common.Upload_file2();

		//line 592-599 - Validate plan order summary page. 
		common.orderSummaryADA5_GS99withOB();

		//line 600-602 - validate payment page 
		common.SelectPaymentOption("CCStraightpayment");
		common.paymentPage_ADA5_GS99withOB();

		
		// ********************SRUVEY MODAL**********************
		Thread.sleep(5000L);	
		System.out.println("\n"+"*********  SURVEY MODAL ************");
		common.verify_handle_survey_popup_withInput("FAIR", "", "HAPPY", "");
		assertTrue(DriverManager.getDriver().getTitle().contains("Thank you"));	

		     
		//line 603 - Validate Order received page 
		common.storeOrderIDinExcel();
		common.ThankYouPage_ADA5();
		common.capture_orderID();
		
		//Validate OrderTracker
		common.validateOrderTrackerDetails("sakhamuri.lavanya@globe.com.ph");
		
		Constant.dataMap.get().put("TimeStamp", util.getTimeStamp());
		util.writeToExcelLastRowFromMap("Sheet1", Constant.dataMap.get());

		
		Status = "passed";
		System.out.println("!!! Execution Completed for "+this.getClass().getName()+" !!!");

	}


	@AfterClass
	public void tearDown() throws Exception {
		if (DriverManager.getDriver() != null) {
			((JavascriptExecutor) DriverManager.getDriver()).executeScript("lambda-status=" + Status);
			DriverManager.getDriver().quit();
		}
	}
	/********************************************************************************************************************************/

}
