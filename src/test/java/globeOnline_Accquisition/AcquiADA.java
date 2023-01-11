package globeOnline_Accquisition;

import java.util.LinkedHashMap;

import java.util.Scanner;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.pages.Acqui.AcquiLandingPage;
import com.pages.Acqui.ProductDetailsPage;

import globeOnline_CommonMethods.DriverManager;
import globeOnline_CommonMethods.SetDriver;
import globeOnline_CommonMethods.util;
import utility.Constant;

public class AcquiADA extends SetDriver {
	
	private static  AcquiADA RA = new   AcquiADA();
	private util util = new util();
	private AcquiLandingPage LP = new AcquiLandingPage();
	private AcquiCommonMethods cmethods = new AcquiCommonMethods();
	private ProductDetailsPage ProDetails = new ProductDetailsPage();
	
	
	
	
	
	private String Status = "failed";
	private static LinkedHashMap<String,String> Map = new LinkedHashMap<>();
	
	@Test
	public void AcquiADAScenario() throws Exception {
		
	    //JavascriptExecutor jse = (JavascriptExecutor)DriverManager.getDriver();
		//jse.executeScript("lambda-name=AcquisitionADA");
		
		//Access GO URL
		DriverManager.getDriver().get("https://new.globe.com.ph/prepaid-wifi");
		if(DriverManager.getDriver().getTitle().contains("Globe Online")) { 
		  System.out.println("Validated title :"+DriverManager.getDriver().getTitle());
		  System.out.println("Accessed GlobeOnline Successfully");
		}  
		 
		
		//Accept cookies Notification
		if (LP.isElementExist("Cookies Notification", "cookiesNotification", 5)) {
			LP.get_privacyAccept().click();
			System.out.println("Clicked on 'Privacy - I accept' button");
		}
		
		Constant.dataMap.set(Map);
	    Constant.dataMap.get().put("TestClassName",RA.getClass().getSimpleName());
		Constant.dataMap.get().put("OMT_LAS", "NOT FOUND");
		Constant.dataMap.get().put("OMT_DispositionStatus", "NOT FOUND");
		Constant.dataMap.get().put("OMT_UpdateDate", "NOT FOUND");
		Constant.dataMap.get().put("OMT_DateOrdered", "NOT FOUND");
		Constant.dataMap.get().put("OMT_EstimatedDayOfDelivery", "NOT FOUND");
		Constant.dataMap.get().put("OMT_OrderDetails", "NOT FOUND");
		Constant.dataMap.get().put("Magento_Details", "NOT FOUND");
		Constant.dataMap.get().put("Magento_OrderAccountInfo", "NOT FOUND");
		
	/*****************************************************************************************************************/
		//Validate home page links
		cmethods.menubar();
		
		//Validate Apply Landing page
		cmethods.validate_ApplLandingPage();
		
		//click on view all devices
		cmethods.clickOnViewAllDevices();
		
		//Selecting Plan value
		cmethods.selectingPlanValue(999);
		
		//clicking on apply filter
		cmethods.clickOnApplyFilter();
		
		Thread.sleep(5000);
		
		//Searching device in gallery page
		cmethods.searchDevice("Asus ROG Phone 6");
		
		//validating searched device
		//cmethods.validateDevice("Samsung Galaxy A13");
		
		
		//Validate device details in product details page
		cmethods.validateProductDetailsPageByClickonMagnifyGlass();
					
		//PDP page validation
		cmethods.mainProductDetailsPageValidation();
		
		//Validate Review my plan
		cmethods.validateReviewMyPlan();
		
	    //Insert Phone Number
		cmethods.insert_phoneNo(utility.Constant.ReservationADA_TestData);
		
		//Click on proceed button
		ProDetails.jsClick("Proceed button","Proceedbtn");
	    Thread.sleep(15000);

		Scanner myObj = new Scanner(System.in); // Create a Scanner object
		System.out.println("Enter OTP HERE"); String OTP = myObj.nextLine(); 
		// Read  user input 
	    System.out.println("OTP : " + OTP); // Output user input
		  
	    cmethods.OTPPage_(OTP);
		
		//Insert otp
		//cmethods.handle_and_insert_OTP();
		
		Thread.sleep(15000);
		
		//Validate Acquisition confirmation page
		cmethods.validate_acquiConfirmationPage();
		
		Thread.sleep(10000);
		
		//Validating Plan breakdown page
		cmethods.validatePlanBreakdown();
		
		//Validate Personal information page
		cmethods.validatePersonalInfoPage("sakhamuri.lavanya@globe.com.ph");
		
		//Insert Billing details
		cmethods.insertBillingAddressDetails("House","5","Light Residences","Madison St","METRO MANILA","CITY OF MANDALUYONG","Burol");
		
		//Insert Shipping Details in delivery page
		cmethods.insertShippingDetails("Same","5","Light Residences","Madison St","METRO MANILA","CITY OF MANDALUYONG","Burol");
		
		//Insert Alternate recipients and contact details fields
		cmethods.SelectAlternativeRecipentDetails();
		
		//Upload POID
		cmethods.uploadPOID();
		
		//Upload POFC
		cmethods.uploadPOFC();
		
		//Validate orderSummaryPage
		cmethods.orderSummaryPageValidation();
		
		//validate paymentPage
		cmethods.paymentPageValidation("COD");
		
		//Handle survey popup
		cmethods.handle_survey_popup("VERY HAPPY", "", "VERY DISSATISFIED", "Unresponsive");
		
		//Validate Thank you page
		cmethods.validateThankYouPage();
		
		//Validate Order tracker
		cmethods.validateOrderTrackerDetailsSimonly("sakhamuri.lavanya@globe.com.ph");
		
		
		
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





}
