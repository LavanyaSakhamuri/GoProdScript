package globeOnline_ADA;
//import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertTrue;

import java.util.LinkedHashMap;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.pages.ada.ADADAF_Page;
import com.pages.ada.ADALanding_Page;
import com.pages.ada.ADAPDP_page;

import com.pages.ada.CheckoutPage;

//import GlobeOnlineFTA.Constant;
import globeOnline_CommonMethods.DriverManager;
import globeOnline_CommonMethods.SetDriver;
import globeOnline_CommonMethods.util;
import utility.Constant;

public class ADA6 extends SetDriver{

	

	private static ADA6 ADA6Scenario = new ADA6();
	private util util = new util();

	private ADAcommonmethods common = new ADAcommonmethods();
	private CheckoutPage checkout = new CheckoutPage();
	private ADADAF_Page Form = new ADADAF_Page();
	private ADALanding_Page LP = new ADALanding_Page();
	private ADAPDP_page PP = new ADAPDP_page();
	
	private String Status = "failed";
	private static LinkedHashMap<String,String> Map = new LinkedHashMap<>();
	@Test
	public void ADA6Scenario() throws Exception {
		JavascriptExecutor jse = (JavascriptExecutor)DriverManager.getDriver();
		jse.executeScript("lambda-name=ADA 6");
		
		
//User access URL 
		DriverManager.getDriver().get("https://onlinepreprod.globe.com.ph/");
		assertTrue(DriverManager.getDriver().getTitle().contains("Globe Online"));
		System.out.println("Validated title : Globe Online");
		// line 502
		if (LP.isElementExist("Cookies Notification", "cookiesNotification", 10)) {
			LP.get_privacyAccept().click();
			System.out.println("Clicked on 'Privacy - I accept' button");
		}
            Constant.dataMap.set(Map);
		    Constant.dataMap.get().put("TestClassName",ADA6Scenario.getClass().getSimpleName());
			Constant.dataMap.get().put("OMT_LAS", "NOT FOUND");
			Constant.dataMap.get().put("OMT_DispositionStatus", "NOT FOUND");
			Constant.dataMap.get().put("OMT_UpdateDate", "NOT FOUND");
			Constant.dataMap.get().put("OMT_DateOrdered", "NOT FOUND");
			Constant.dataMap.get().put("OMT_EstimatedDayOfDelivery", "NOT FOUND");
			Constant.dataMap.get().put("OMT_OrderDetails", "NOT FOUND");
			Constant.dataMap.get().put("Magento_Details", "NOT FOUND");
			Constant.dataMap.get().put("Magento_OrderAccountInfo", "NOT FOUND");
		
		// ************************************************************************************
				
		// Menu bar
		common.menuBar();
		
		// Apply landing page
		common.apply_LandingPage();

		// Build My Plan
		common.buildMyPlan();

		// FAQ page
		common.FAQ();
		
		//line 143-144 - Click on chevron of Apply in Hamburger menu && Click on Chevron of apply again 
		//common.NavigateTo_ApplyMenu();

		//line 146 - click on hamburger menu and click Help 
		//common.NavigateTo_HelpMenu();
				
		//line 147 - click on hamburger menu  and click track my order 
		//common.NavigateTo_TrackMyOrder();

		//line 149 - click on hamburger menu, click Chevron of Apply and click on mobile postpaid 
		//common.NavigateTo_Apply_MobilePostpaid();
				
		//line 148 -  click on hamburger menu, click Chevron of Apply and click View all devices
		//common.NavigateTo_Apply_ViewAllDevices();
				
		//line 150 - Click on hamburger menu and click on "Apply" Text 
		//common.NavigateTo_ApplyMenu();
		// Gplan with device dropdown
		common.selectAPlan();
		// Gplan with device dropdown
		//common.selectAPlanWithalldata1799();
	      // ************************************* PDP page ********************************************
//		if (PP.isClickable("Disc_starterbtn", 5)) {
//			LP.scroll_vertical(4053);
//			Thread.sleep(1000L);
//			PP.moveToElement("Disc_starterbtn");
//			//Thread.sleep(2000L);
//			//PP.clickOnElement("Button", "Disc_Starter", "Disc_starterbtn");
//			JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
//            js.executeScript("arguments[0].click();", PP.get_Disc_starterbtn());
//			
//		}
//		 
		 for (int i = 0; i < 4; i++) 
         {
			 if (LP.isClickable("owlnext", 5)) 
	           {
	           Thread.sleep(5000L);
	           LP.scroll_vertical(2000);
	           JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
	           js.executeScript("arguments[0].click();", LP.get_owlnext());

	           }
         }

		if (PP.isClickable("DiscooverPlus", 5)) {
			LP.scroll_vertical(4053);
			Thread.sleep(2000L);
			PP.moveToElement("DiscooverPlus");
//			Thread.sleep(2000L);
//			PP.clickOnElement("Button", "DiscooverPlus", "DiscooverPlus");
			JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
            js.executeScript("arguments[0].click();", PP.get_Discover_plus());
			
		}
		
		
		//Thread.sleep(10000L);
		 
			//Discovery page
			
	      
		common.Discover_pagepluse();
		
		//Click on Build my plan
	    Thread.sleep(10000);
		//PP.clickOnElement("Button", "Buildmyplan", "Build_btn");
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
        js.executeScript("arguments[0].click();", PP.get_Build_btn());
        
        Thread.sleep(10000);
        
      //Searching device 
      // common.searchDevice();
        
		//PDP page
		common.PDPGplanwithalldata1799();
		//Insert Mobile number
		//PP.moveToElement("Mobilenumfield");
		//Thread.sleep(10000);
		common.insert_phoneNo("09270009584");
		
		//Click on Proceed
		//PP.clickOnElement("Button", "Proceed", "Proceedbtn");
		JavascriptExecutor jsp = (JavascriptExecutor) DriverManager.getDriver();
        jsp.executeScript("arguments[0].click();", PP.get_proceedbtn1());
		
        
		
		if (checkout.isElementExist("Text OTP", "otpText", 30)) {
			System.out.println("Navigated to screen to insert OTP");
		}
		util.assertContainText("Validated title", DriverManager.getDriver().getTitle(), "One-Time Password");

		// ************************************************************************************
		// line - 52 - Click resend code after "Resend code" button is enabled
		// ************************************************************************************
		//common.resendOTP();

		// ************************************************************************************
		// line - 53 - Enter OTP
		// ************************************************************************************
		common.handle_and_insert_OTP();
		
		// Validate elgibility checks (Page loader)
			//common.validateEligibility_LoaderPage();	
			Thread.sleep(10000L);

	
		// Validate Aquisition Confirmation page
		common.validate_acquiConfirmationPage();
		
		//Validate Second set of acount checking 
//		common.validateEligibility_LoaderPage();	
		Thread.sleep(10000L);
//		

		common.validate_plan_breakdown1799();
		
		//click on proceed with my plan 26
		PP.isElementExist("Mobilenum", "Breakdown_Mobilenum", 10);
		//PP.clickOnElement("Buttonproceed", "Breakdown_proceedbutton", "Breakdown_proceedbutton");
		JavascriptExecutor jsb = (JavascriptExecutor) DriverManager.getDriver();
        jsb.executeScript("arguments[0].click();", PP.get_Breakdown_proceedbutton());
//		
		// validation DAF page FTA 27
		common.validateDAF();
		
		//mandatory recently
		
		common.validatePersonalInfo_MandatoryFields();
		
		
		
		//step 28  validate personal infor
	 // common.insert_personal_info_on_form_RandomName();
		

	  //validate billing address
		//common.insert_address_details_House();
		
//		common.insert_address_details("Condo","11","Annex 7, Amity circle","Better Living","METRO MANILA","PARANAQUE CITY","Don Bosco");
//
//		
//		//click next delivery information
//		//Form.clickOnElement("Button","NextDeliinfo","NextDeliinfo");
//		JavascriptExecutor jsn = (JavascriptExecutor) DriverManager.getDriver();
//        jsn.executeScript("arguments[0].click();", Form.get_nextdelivery());
//
//		
//		
//		common.insert_address_details_House();
//		//common.DeliveryAdd_page();
//		
//					
//		//alternative recipent 
//		common.Select_Alternative_recipentDetails();
		
		//line 578 - 579 - Validate Billing address && If billing address is not prefilled 
		
		//common.insert_personal_info_on_form_RandomName();
		common.insert_personal_info_on_form_RandomName("sakhamuri.lavanya@globe.com.ph");
		
				common.insert_billing_address_details("House","12","Madison St","Light Residences","METRO MANILA","CITY OF MANDALUYONG","Burol");

				//line 580 - click "Next: Delivery Information" 
				Form.js_clickOnElement("Button","NextDeliinfo","NextDeliinfo");
				
				//line 581-583 - Validate DAF - Delivery address page && Validate Shipping address && Select home button in radio button and input data 
				Thread.sleep(5000L);
				assertTrue(DriverManager.getDriver().getTitle().contains("Delivery Information"));
				System.out.println("Validated title : Delivery Information");	
				common.insert_address_details("House","11","Annex 7, Amity circle","Better Living","METRO MANILA","CITY OF MANDALUYONG","Burol");
				
				
				//line 584 - input Alternate recipients and contact details fields
				common.Select_Alternative_recipentDetails();
				
				//Instruction
				Form.get_AlternativeDeliveryInstruction().sendKeys("Call me");
				System.out.println("Alternative Delivery Instruction: Call me");

		
		//next Upload Documents button
		common.Next_uploadDocument();
		
		common.Upload_RequiredDocPOID();
		
		common.Upload_File1();
		
		//common.Upload_RequiredDocPOID();
		common.upload_file();
		

		//Form.DropDownDisplay2();
		common.Upload_RequiredDocPOFC();
		
		common.Upload_file2();

						
											
		// ************************************************************************************	
		
		//Order Summary page		
		common.orderSummaryGplan_withall_data1799();
						//Payment page
		common.paymentPageGplanwithalldata1799();
		
		//survey
		//common1.verify_handle_survey_popup();
		Thread.sleep(5000L);	
		System.out.println("\n"+"*********  SURVEY MODAL ************");
		common.verify_handle_survey_popup_withInput("VERY HAPPY", "", "VERY DISSATISFIED", "Unresponsive");
		assertTrue(DriverManager.getDriver().getTitle().contains("Thank you"));

//		assertTrue(DriverManager.getDriver().getTitle().contains("Thank you"));
//		common.capture_orderID();

		// Thank you Page
		common.ThankYou_Page1799();
		common.capture_orderID();
	
		Constant.dataMap.get().put("TimeStamp", util.getTimeStamp());
		util.writeToExcelLastRowFromMap("Sheet1", Constant.dataMap.get());
	//  Click Track my order
				// ************************************************************************************
			   /* AThanyou.get_linkTrackOrder().click();
				System.out.println("Clicked on Track Order link");

				Thread.sleep(2000L);
				assertTrue(DriverManager.getDriver().getTitle().contains("Track Your Order"));

				common.insertDetailsOnTrackYourOrder();

				Thread.sleep(2500L);

				common.validateOrderDetails();*/

		
		
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

}
