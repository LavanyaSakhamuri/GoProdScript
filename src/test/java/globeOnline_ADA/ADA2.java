package globeOnline_ADA;

import static org.testng.Assert.assertTrue;

import java.util.LinkedHashMap;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.pages.ada.ADADAF_Page;
import com.pages.ada.ADALanding_Page;
import com.pages.ada.ADAPDP_page;
import com.pages.ada.ADAThankyou_Page;
import com.pages.ada.CheckoutPage;

import globeOnline_CommonMethods.DriverManager;
import globeOnline_CommonMethods.SetDriver;
import globeOnline_CommonMethods.util;

import utility.Constant;

public class ADA2 extends SetDriver{


	private static ADA2 ADA2Scenario = new ADA2();
	private util util = new util();

	private ADAcommonmethods common = new ADAcommonmethods();
	private CheckoutPage checkout = new CheckoutPage();
	private ADADAF_Page Form = new ADADAF_Page();
	private ADALanding_Page LP = new ADALanding_Page();
	private ADAPDP_page PP = new ADAPDP_page();
	private ADAThankyou_Page TP = new ADAThankyou_Page();
	private String Status = "failed";
	//private static LinkedHashMap<String,String> Map = new LinkedHashMap<>();

	@Test
	public void ADA2Scenario() throws Exception {

		JavascriptExecutor jse = (JavascriptExecutor)DriverManager.getDriver();
		//jse.executeScript("lambda-name=ADA 2");


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

		Constant.dataMap.get().put("TestClassName",ADA2Scenario.getClass().getSimpleName());
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

		common.selectAPlanWithDevice();

		for (int i = 0; i < 3; i++) 
		{
			if (LP.isClickable("owlnext", 5)) 
			{
				Thread.sleep(5000L);

				JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
				js.executeScript("arguments[0].click();", LP.get_owlnext());

			}
		}

		if (PP.isClickable("Disc_starterbtn", 5)) {
			//LP.scroll_vertical(4053);
			Thread.sleep(1000L);
			PP.moveToElement("Disc_starterbtn");
			//Thread.sleep(2000L);
			//PP.clickOnElement("Button", "Disc_Starter", "Disc_starterbtn");
			JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
			js.executeScript("arguments[0].click();", PP.get_Disc_starterbtn());

		}

		common.Discover_Page();

		Thread.sleep(10000);
		//		//PP.clickOnElement("Button", "Buildmyplan", "Build_btn");
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("arguments[0].click();", PP.get_Build_btn());

		Thread.sleep(6000);

		common.searchDevice();

		//PDP page
		common.PDPGplanwithDevice599ADA2();

		common.insert_phoneNo("09270009623");//172//161//182

		JavascriptExecutor jsp = (JavascriptExecutor) DriverManager.getDriver();
		jsp.executeScript("arguments[0].click();", PP.get_proceedbtn1());


		if (checkout.isElementExist("Text OTP", "otpText", 30)) {
			System.out.println("Navigated to screen to insert OTP");
		}
		util.assertContainText("Validated title", DriverManager.getDriver().getTitle(), "One-Time Password");
		common.handle_and_insert_OTP();

		// Validate Aquisition Confirmation page
		common.validate_acquiConfirmationPage();



		common.validate_plan_breakdownADA2();

		//click on proceed with my plan 26
		PP.isElementExist("Mobilenum", "Breakdown_Mobilenum", 10);
		//PP.clickOnElement("Buttonproceed", "Breakdown_proceedbutton", "Breakdown_proceedbutton");
		//		
		JavascriptExecutor jsb = (JavascriptExecutor) DriverManager.getDriver();
		jsb.executeScript("arguments[0].click();", PP.get_Breakdown_proceedbutton());
		//		
		// validation DAF page FTA 27
		common.validateDAF();

		//mandatory recently

		common.validatePersonalInfo_MandatoryFields();

		common.insert_personal_info_on_form_RandomName("shaik.asma@globe.com.ph");

		common.insert_address_details("Condo","11", "Annex 7 Amity Circle", "Betterliving",  "RIZAL", "TAYTAY",  "Santa Ana");


		//line 580 - click "Next: Delivery Information" 
		Form.js_clickOnElement("Button","NextDeliinfo","NextDeliinfo");
		Thread.sleep(5000L);
		assertTrue(DriverManager.getDriver().getTitle().contains("Delivery Information"));
		System.out.println("Validated title : Delivery Information");

		common.DeliveryAdd_page();


		//alternative recipent 
		common.Select_Alternative_recipentDetails();

		//next Upload Documents button
		common.Next_uploadDocument();

		common.Upload_RequiredDocPOID();

		common.Upload_File1();

		//common.Upload_RequiredDocPOID();
		common.upload_file();


		//Form.DropDownDisplay2();
		common.Upload_RequiredDocPOFC();

		common.Upload_file2();

		//		Thread.sleep(3000);
		//    	//Form.clickOnElement("checkbox", "label_accept_all_terms", "chboxterms");
		//    	JavascriptExecutor jsa = (JavascriptExecutor) DriverManager.getDriver();
		//        jsa.executeScript("arguments[0].click();", Form.get_label_accept_all_terms());
		//		
		//    	
		//		Form.clickOnElement("Agree", "btnagree", "btnagre");
		//		//Form.clickOnElement("next", "btnNext", "btnnext");
		//		
		//		Thread.sleep(3000);
		//		JavascriptExecutor js2 = (JavascriptExecutor) DriverManager.getDriver();
		//        js2.executeScript("arguments[0].click();", Form.get_next());
		//		//Form.get_next().click(); 
		//		

		// ************************************************************************************	

		//Order Summary page		
		common.orderSummaryADA2();


		// Click change address
		//OS.scroll_vertical(800);

		common.validate_form_onClick_of_changeAddress("House");

		JavascriptExecutor js7 = (JavascriptExecutor) DriverManager.getDriver();
		js7.executeScript("arguments[0].click();", Form.get_nextdelivery());

		Thread.sleep(5000L);

		common.Next_uploadDocument();
		Thread.sleep(3000);
		//Form.clickOnElement("checkbox", "label_accept_all_terms", "chboxterms");
		JavascriptExecutor jsF = (JavascriptExecutor) DriverManager.getDriver();
		jsF.executeScript("arguments[0].click();", Form.get_label_accept_all_terms());

		Form.clickOnElement("Agree", "btnagree", "btnagre");
		//Form.clickOnElement("next", "btnNext", "btnnext");

		Thread.sleep(3000);
		JavascriptExecutor jsH= (JavascriptExecutor) DriverManager.getDriver();
		jsH.executeScript("arguments[0].click();", Form.get_next());
		//Form.get_next().click(); 

		common.ordersummrysubmitbutton();

		//Payment page
		common.SelectPaymentOption("COD");
		common.paymentPageGplanwithDevice599();

		//survey
		Thread.sleep(90000);	
		System.out.println("\n"+"*********  SURVEY MODAL ************");
		common.verify_handle_survey_popup_withInput("VERY HAPPY", "", "VERY DISSATISFIED", "Unresponsive");
		assertTrue(DriverManager.getDriver().getTitle().contains("Thank you"));

		common.validateThankYouPage();
		common.capture_orderID();
		Constant.dataMap.get().put("TimeStamp", util.getTimeStamp());
		util.writeToExcelLastRowFromMap("Sheet1", Constant.dataMap.get());


		Thread.sleep(2500L);

		//common.validateOrderTrackerDetails("shaik.asma@globe.com.ph");
		common.validateOrderTrackerDetailsSimonly("shaik.asma@globe.com.ph");

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
