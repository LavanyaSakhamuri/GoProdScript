package globeOnline_ADA;
import static org.testng.Assert.assertTrue;


import java.util.LinkedHashMap;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

//import com.browserstack.DriverManager;
import com.pages.ada.ADADAF_Page;
import com.pages.ada.ADALanding_Page;
import com.pages.ada.ADAPDP_page;
import com.pages.ada.CheckoutPage;

import globeOnline_CommonMethods.DriverManager;
import globeOnline_CommonMethods.SetDriver;
import globeOnline_CommonMethods.util;
import utility.*;

public class ADA1 extends SetDriver{


	//**********************************************************************************************************************
	//Negative Scenario 



	private static ADA1 ADA1Scenario = new ADA1();
	private util util = new util();

	private ADAcommonmethods common = new ADAcommonmethods();
	private CheckoutPage checkout = new CheckoutPage();
	private ADADAF_Page Form = new ADADAF_Page();
	private ADALanding_Page LP = new ADALanding_Page();
	private ADAPDP_page PP = new ADAPDP_page();


	private String Status = "failed";
	private static LinkedHashMap<String,String> Map = new LinkedHashMap<>();
	@Test
	public void ADA5() throws Exception {
		//JavascriptExecutor jse = (JavascriptExecutor)DriverManager.getDriver();
		//jse.executeScript("lambda-name=ADA 1");

		//User access URL 
		DriverManager.getDriver().get("https://onlinepreprod.globe.com.ph/");
		assertTrue(DriverManager.getDriver().getTitle().contains("Globe Online"));
		System.out.println("Validated title : Globe Online");



		Constant.dataMap.set(Constant.LinkedMap);

		Constant.dataMap.get().put("TestClassName",ADA1Scenario.getClass().getSimpleName());
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

		/********************************************************************************************************************************/
		// Gplan with SimOnly dropdown
		common.selectAPlan();

		/********************************************************************************************************************************/


		//   Discover Starter Button

		if (PP.isClickable("Disc_starterbtn", 5)) {
			PP.isElementExist("Discover Stater", "Disc_starterbtn", 10);
			LP.scroll_vertical(4053);
			Thread.sleep(1000L);
			PP.moveToElement("Disc_starterbtn");
			JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
			js.executeScript("arguments[0].click();", PP.get_Disc_starterbtn());

		}

		/**************** Discovery page**************************/

		common.Discover_Page();
		/**************** Click on Build my plan**************************/

		Thread.sleep(10000);
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("arguments[0].click();", PP.get_Build_btn());
		/********************************************************************************************************************************/

		//PDP page
		common.PDPSimPlusOnly();

		// Insert Mobile number
		// PP.moveToElement("Mobilenumfield");
		Thread.sleep(4000);
		common.insert_phoneNo("09270009587");
		//
		// Click on Proceed
		PP.clickOnElement("Button", "Proceed", "Proceedbtn");

		if (checkout.isElementExist("Text OTP", "otpText", 30)) {
			System.out.println("Navigated to screen to insert OTP");
		}
		util.assertContainText("Validated title", DriverManager.getDriver().getTitle(), "One-Time Password");

		common.handle_and_insert_OTP();

		Thread.sleep(10000);

		// Validate Aquisition Confirmation page
		common.validate_acquiConfirmationPage();

		Thread.sleep(15000);

		common.validateSimOnlyBreakdownPage();

		Thread.sleep(10000L);

		assertTrue(DriverManager.getDriver().getTitle().contains("Personal Information"));
		System.out.println("Validated title : Personal Information");

		// Validate Personal information
		common.validatePersonalInfo_MandatoryFields();

		//Validate Personal information &&  input perosonal information details and billing address details (house)  
		common.insert_personal_info_on_form_RandomName("sakhamuri.lavanya@globe.com.ph");

		//Validate Billing address && If billing address is not prefilled 
		common.insert_billing_address_details("House","12","Anex","Light Residences","METRO MANILA","CITY OF MANDALUYONG","Burol");

		//click "Next: Delivery Information" 
		Form.js_clickOnElement("Button","NextDeliinfo","NextDeliinfo");

		//Validate DAF - Delivery address page && Validate Shipping address && Select home button in radio button and input data 
		Thread.sleep(5000L);
		assertTrue(DriverManager.getDriver().getTitle().contains("Delivery Information"));
		System.out.println("Validated title : Delivery Information");	
		common.insert_address_details("House","11","Annex 7  Amity circle","Better Living","METRO MANILA","CITY OF MANDALUYONG","Burol");

		//input Alternate recipients and contact details fields
		common.Select_Alternative_recipentDetails();

		//next Upload Documents button
		common.Next_uploadDocument();

		Thread.sleep(10000L);
		assertTrue(DriverManager.getDriver().getTitle().contains("Upload Documents"));
		System.out.println("Validated title : Upload Documents");	
		common.Upload_RequiredDocPOID();		
		common.Upload_File1();		
		//common.Upload_RequiredDocPOID();
		common.upload_file();
		//Form.DropDownDisplay2();
		common.Upload_RequiredDocPOFC();		
		common.Upload_file2();

		//Validate order summary page
		common.OrderSummarySimOnly599();

		//Validate Payment page
		common.paymentpageValidationSimonly599("COD");

		//Validate survey pop up
		common.verify_handle_survey_popup_withInput("FAIR", "", "HAPPY", "");

		assertTrue(DriverManager.getDriver().getTitle().contains("Thank you"));	
		//Validate Thank You page
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
