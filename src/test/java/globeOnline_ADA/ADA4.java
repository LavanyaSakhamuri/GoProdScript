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


public class ADA4 extends SetDriver{
	
	private static ADA4 ADA4Scenario = new ADA4();
	private util util = new util();

	private ADAcommonmethods common = new ADAcommonmethods();
	private CheckoutPage checkout = new CheckoutPage();
	private ADADAF_Page Form = new ADADAF_Page();
	private ADALanding_Page LP = new ADALanding_Page();
	private ADAPDP_page PP = new ADAPDP_page();
	
	private String Status = "failed";
	private static LinkedHashMap<String,String> Map = new LinkedHashMap<>();
	@Test
	public void ADA4Scenario() throws Exception {
		JavascriptExecutor jse = (JavascriptExecutor)DriverManager.getDriver();
		jse.executeScript("lambda-name=ADA4");
		
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

		Constant.dataMap.get().put("TestClassName",ADA4Scenario.getClass().getSimpleName());
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
				
		// Menu bar
		
		common.menuBar();
		
		// Apply landing page
		common.apply_LandingPage();

		// Build My Plan
		common.buildMyPlan();

		// FAQ page
		common.FAQ();
		
		//line 143-144 - Click on chevron of Apply in Hamburger menu && Click on Chevron of apply again 
		common.NavigateTo_ApplyMenu();

		//line 146 - click on hamburger menu and click Help 
		common.NavigateTo_HelpMenu();
				
		//line 147 - click on hamburger menu  and click track my order 
		common.NavigateTo_TrackMyOrder();

		//line 149 - click on hamburger menu, click Chevron of Apply and click on mobile postpaid 
		common.NavigateTo_Apply_MobilePostpaid();
				
		//line 148 -  click on hamburger menu, click Chevron of Apply and click View all devices
		common.NavigateTo_Apply_ViewAllDevices();
				
		//line 150 - Click on hamburger menu and click on "Apply" Text 
		common.NavigateTo_ApplyMenu();
				
		// Gplan with device dropdown
		common.selectAPlanwithGcash();
					
	// ************************************* PDP page ********************************************
		
		  //Click on Discover starter
		if (PP.isClickable("Disc_starterbtn", 5)) {
			LP.scroll_vertical(4053);
			Thread.sleep(2000L);
			PP.moveToElement("Disc_starterbtn");
			Thread.sleep(2000L);
			PP.clickOnElement("Button", "Disc_Starter", "Disc_starterbtn");
			
		}
		
//		
//		 for (int i = 0; i < 5; i++) 
//         {
//			 if (LP.isClickable("owlnext", 5)) 
//	           {
//	           Thread.sleep(5000L);
//	           LP.scroll_vertical(2000);
//	           JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
//	           js.executeScript("arguments[0].click();", LP.get_owlnext());
//
//	           }
//         }
//			  //Click on Discover starter
//				if (PP.isClickable("Discoveralwayson", 5)) {
//					LP.scroll_vertical(4050);
//					Thread.sleep(2000L);
//					PP.moveToElement("Discoveralwayson");
//					//Thread.sleep(2000L);
//					//PP.clickOnElement("Button", "Discoveralwayson", "Discoveralwayson");
//					JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
//		            js.executeScript("arguments[0].click();", PP.get_Discoveralwayson());
//					
//				}
//								 //Thread.sleep(10000L);
////			 
//				//Discovery page
//				
//				common.Discover_pageAlwayson();
//	
////
		
	//Click on Build my plan
	    Thread.sleep(10000);
		PP.clickOnElement("Button", "Buildmyplan", "Build_btn");
		
	    Thread.sleep(5000);

		
		
		//PDP page
		common.PDPGplanwithgcash599();
		
		//Insert Mobile number
		common.insert_phoneNo("09270009562");
		
		//Click on Proceed
		PP.clickOnElement("Button", "Proceed", "proceedbtn1");
		
		if (checkout.isElementExist("Text OTP", "otpText", 30)) {
			System.out.println("Navigated to screen to insert OTP");
		}
		util.assertContainText("Validated title", DriverManager.getDriver().getTitle(), "One-Time Password");
	
		// ************************************************************************************
		// line - 53 - Enter OTP
		// ************************************************************************************
		common.handle_and_insert_OTP();
		
		
		//ELIGIBILITY CHECK
		//common.validateEligibility_LoaderPage();	
		Thread.sleep(10000);
				
		// Validate Aquisition Confirmation page		
		common.validate_acquiConfirmationPage();
		//Thread.sleep(10000L);
		
		//ELIGIBILITY CHECK
       // common.validateEligibility_LoaderPage();	
		Thread.sleep(1000L);
		
		Thread.sleep(20000);
		
		
				
		// View Plan Breakdown page
		PP.isElementExist("Mobilenum", "Breakdown_Mobilenum", 10);
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("arguments[0].click();", PP.get_Breakdown_proceedbutton());
		//DAF page
		
		//line 166-167 - Validate DAF page  FTA
		Thread.sleep(10000L);
		assertTrue(DriverManager.getDriver().getTitle().contains("Personal Information"));
		System.out.println("Validated title : "+DriverManager.getDriver().getTitle().contains("Personal Information"));	
		common.validateDAF();
				
		//line 170 - Verify the Mandatory fields in Personal info page
		common.validatePersonalInfo_MandatoryFields();

		//line 167 - Validate Personal information && line 171 - input perosonal information details and billing address details (Condo)  
		common.insert_personal_info_on_form_RandomName("sakhamuri.lavanya@globe.com.ph");
			
		//line 168 - Validate Billing address && line 171 - input perosonal information details and billing address details (Condo) 
	    common.insert_address_details("Condo","5","Light Residences","Madison St","METRO MANILA","CITY OF MANDALUYONG","Burol");
				
	  		Form.get_DeliveryInfoCTA().click();
	    
		//validate DAF delivery address page
		Form.isElementExist("journeystatus", "journeyDAF2", 10);
		Thread.sleep(10000L);
		
		//line 175 - Input Shipping address 
		common.insert_address_details("Condo","5","Light Residences","Madison St","METRO MANILA","CITY OF MANDALUYONG","Burol");				
							
		//line 178 - input Alternate recipients and contact details fields
		common.Select_Alternative_recipentDetails();
								
		//next Upload Documents button
		common.Next_uploadDocument();
					
		//Dropdown upload requrire documents
		//Form.DropDownDisplay1();
			
		common.Upload_RequiredDocPOID();
				
		common.Upload_File1();
				
		//common.Upload_RequiredDocPOID();
		common.upload_file();
			
		//Form.DropDownDisplay2();
//		common.Upload_RequiredDocPOFC();
				
//		common.Upload_file2();
		
		common.Acceptallconditions();
		
		//Order Summary page		
		common.orderSummaryGcash599();
	
		//Payment page
		common.paymentPageGplaneithgcash599();
		
		// ********************SRUVEY MODAL**********************
		Thread.sleep(5000L);	
		System.out.println("\n"+"*********  SURVEY MODAL ************");
		common.verify_handle_survey_popup_withInput("HAPPY", "", "DISSATISFIED", "Unresponsive");
		assertTrue(DriverManager.getDriver().getTitle().contains("Thank you"));		
		
		// Thank you Page
		common.ThankYou_Page();
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

				common.validateOrderDetails();
*/
		
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

