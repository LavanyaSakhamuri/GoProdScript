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

public class ADA7 extends SetDriver{

	
	private static ADA7 ADA7Scenario = new ADA7();
	private util util = new util();
/*	private ADAcommonmethods common = new ADAcommonmethods();
	private CommonMethods common1 = new CommonMethods();
	private CheckoutPage checkout = new CheckoutPage();
	
	private FTALandingpage LP = new FTALandingpage();
	private PDPpage PP = new PDPpage();
	private DAF Form = new DAF();
*/	
	private ADAcommonmethods common = new ADAcommonmethods();
	private CheckoutPage checkout = new CheckoutPage();
	private ADADAF_Page Form = new ADADAF_Page();
	private ADALanding_Page LP = new ADALanding_Page();
	private ADAPDP_page PP = new ADAPDP_page();
	private String Status = "failed";
	private static LinkedHashMap<String,String> Map = new LinkedHashMap<>();
	
	@Test
	public void ADA7Scenaru() throws Exception {
		JavascriptExecutor jse = (JavascriptExecutor)DriverManager.getDriver();
		jse.executeScript("lambda-name=ADA 7");
		
		
//User access URL 
		DriverManager.getDriver().get("https://onlinepreprod.globe.com.ph/");
		assertTrue(DriverManager.getDriver().getTitle().contains("Globe Online"));
		System.out.println("Validated title : Globe Online");
		if (LP.isElementExist("Cookies Notification", "cookiesNotification", 10)) {
			LP.get_privacyAccept().click();
			System.out.println("Clicked on 'Privacy - I accept' button");
		}
		 Constant.dataMap.set(Map);
			Constant.dataMap.get().put("TestClassName",ADA7Scenario.getClass().getSimpleName());
			Constant.dataMap.get().put("OMT_LAS", "NOT FOUND");
			Constant.dataMap.get().put("OMT_DispositionStatus", "NOT FOUND");
			Constant.dataMap.get().put("OMT_UpdateDate", "NOT FOUND");
			Constant.dataMap.get().put("OMT_DateOrdered", "NOT FOUND");
			Constant.dataMap.get().put("OMT_EstimatedDayOfDelivery", "NOT FOUND");
			Constant.dataMap.get().put("OMT_OrderDetails", "NOT FOUND");
			Constant.dataMap.get().put("Magento_Details", "NOT FOUND");
			Constant.dataMap.get().put("Magento_OrderAccountInfo", "NOT FOUND");
			
		// ****************************Landing page****************************************
				
		// Menu bar
		common.menuBar();
		
		// Apply landing page
		common.apply_LandingPage();

		// Build My Plan
		common.buildMyPlan();

		// FAQ page
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



		
//		// Gplan with device dropdown
//				common.selectAPlan();
//				
//				// Gplan with device dropdown
//				common.selectAPlanWithDevice();
//			      // ************************************* PDP page ********************************************
//				
//				 for (int i = 0; i < 5; i++) 
//		         {
//					 if (LP.isClickable("owlnext", 5)) 
//			           {
//			           Thread.sleep(5000L);
//			           LP.scroll_vertical(2000);
//			           JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
//			           js.executeScript("arguments[0].click();", LP.get_owlnext());
//
//			           }
//		         }
//				  //Click on Discover starter
//					if (PP.isClickable("Discoveralwayson", 5)) {
//						LP.scroll_vertical(4053);
//						Thread.sleep(2000L);
//						PP.moveToElement("Discoveralwayson");
//						//Thread.sleep(2000L);
//						//PP.clickOnElement("Button", "Discoveralwayson", "Discoveralwayson");
//						JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
//			            js.executeScript("arguments[0].click();", PP.get_Discoveralwayson());
//						
//					}
//									 //Thread.sleep(10000L);
//				 
//				//Discovery page
//					
//					common.Discover_pageAlwayson();
//	//	
//			
//				//Click on Build my plan
//			    Thread.sleep(10000);
//				//PP.clickOnElement("Button", "Buildmyplan", "Build_btn");
//				JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
//		        js.executeScript("arguments[0].click();", PP.get_Build_btn());
////		        
//				

		//click Chevron of Apply and click View all devices
		common.NavigateTo_Apply_ViewAllDevices();
		
	 	// Gplan with device dropdown
        common.ValidateGalleryPageWithGplan2499();
		
		//***********************************PDP PAGE***********************************
		//line 425 - Browse all device in device carousel in plan builder page 
		common.PDPGplanwithDevice_BrowseDevicesInCarousel();
		
           //PDP page
	      common.PDPGplanwithDevice2499();
		
		//Insert Mobile number
		common.insert_phoneNo("09270009588");
		
		//Click on Proceed
		//PP.clickOnElement("Button", "Proceed", "proceedbtn1");
		JavascriptExecutor jsp = (JavascriptExecutor) DriverManager.getDriver();
        jsp.executeScript("arguments[0].click();", PP.get_proceedbtn1());
		
		if (checkout.isElementExist("Text OTP", "otpText", 30)) {
			System.out.println("Navigated to screen to insert OTP");
		}
		util.assertContainText("Validated title", DriverManager.getDriver().getTitle(), "One-Time Password");
	

		// ****************************OTP PAge************************************
		common.handle_and_insert_OTP();
		
		
		//ELIGIBILITY CHECK
		//common.validateEligibility_LoaderPage();	
		Thread.sleep(10000L);
				
		// Validate Aquisition Confirmation page		
		common.validate_acquiConfirmationPage();
		
		//ELIGIBILITY CHECK
		//common.validateEligibility_LoaderPage();	
		Thread.sleep(10000L);
	
		// View Plan Breakdown page
		PP.isElementExist("Mobilenum", "Breakdown_Mobilenum", 10);
		//PP.clickOnElement("Button", "Proceedbuttton", "Breakdown_proceedbutton");
		JavascriptExecutor jsb = (JavascriptExecutor) DriverManager.getDriver();
        jsb.executeScript("arguments[0].click();", PP.get_Breakdown_proceedbutton());
		
				
		//***********************************DAF page***********************************
		
//        common.validateDAF();
//		//line 166-167 - Validate DAF page  FTA
//		Thread.sleep(10000L);
//		assertTrue(DriverManager.getDriver().getTitle().contains("Personal Information"));
//		System.out.println("Validated title : "+DriverManager.getDriver().getTitle().contains("Personal Information"));	
		common.validateDAF();
				
		//line 170 - Verify the Mandatory fields in Personal info page
		common.validatePersonalInfo_MandatoryFields();

		//line 167 - Validate Personal information && line 171 - input perosonal information details and billing address details (Condo)  
		common.insert_personal_info_on_form_RandomName("sakhamuri.lavanya@globe.com.ph");
			
		//line 168 - Validate Billing address && line 171 - input perosonal information details and billing address details (Condo) 
		common.insert_address_details("Condo","5","Light Residences","Madison St","METRO MANILA","MANDALUYONG CITY","Barangka Ilaya");
				
		//line 169 - click next: delivery infromation CTA 
		JavascriptExecutor jsn = (JavascriptExecutor) DriverManager.getDriver();
        jsn.executeScript("arguments[0].click();", Form.get_nextdelivery());

	common.DeliveryAdd_page();

		//Form.get_next().click();
//				
//		//line 173 - Validate page loader screen
//		common.validateEligibility_LoaderPage();
//		Thread.sleep(1000L);
//				
//		
//		common.DeliveryAdd_page();
//							
		//line 178 - input Alternate recipients and contact details fields
		common.Select_Alternative_recipentDetails();
		
		//***********************************Upload doccuments***********************************
		
		//next Upload Documents button
		common.Next_uploadDocument();
					
		//Dropdown upload requrire documents
		//Form.DropDownDisplay1();
			
		common.Upload_RequiredDocPOID();
				
		common.Upload_File1();
				
		//common.Upload_RequiredDocPOID();
		common.upload_file();
			
		//Form.DropDownDisplay2();
		common.Upload_RequiredDocPOFC();
				
		common.Upload_file2();

		//***********************************Ordersummary/payment***********************************
		
		//Order Summary page		
		common.orderSummaryGplanwithdevice2499();
	
		//Payment page
		common.paymentPageGplanwithdevice2499();
		
		// **********************************SRUVEY MODAL************************************
		
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
	/*
	 * //
	 * *****************************************************************************
	 * ******* AThanyou.get_linkTrackOrder().click();
	 * System.out.println("Clicked on Track Order link");
	 * 
	 * Thread.sleep(2000L);
	 * assertTrue(DriverManager.getDriver().getTitle().contains("Track Your Order"))
	 * ;
	 * 
	 * common.insertDetailsOnTrackYourOrder();
	 * 
	 * Thread.sleep(2500L);
	 * 
	 * common.validateOrderDetails();
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