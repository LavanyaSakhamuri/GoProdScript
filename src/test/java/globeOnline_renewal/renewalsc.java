package globeOnline_renewal;

import static org.testng.Assert.assertTrue;


import java.util.LinkedHashMap;
import java.util.Scanner;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.pages.renewal.renewal_landingpage;

import globeOnline_CommonMethods.DriverManager;
import globeOnline_CommonMethods.SetDriver;
import utility.Constant;
public class renewalsc extends SetDriver {
	
	private static  renewalsc DG = new   renewalsc();
	private Renewal_commonmethods common = new Renewal_commonmethods();
	
	private renewal_landingpage DL = new renewal_landingpage();
	


	
	private String Status = "failed";
	private static LinkedHashMap<String,String> Map = new LinkedHashMap<>();
	
	@Test
	public void deviceGallery() throws Exception {
		//JavascriptExecutor jse = (JavascriptExecutor)DriverManager.getDriver();
		//jse.executeScript("lambda-name=Notify_Me_HPW");
		
		
		DriverManager.getDriver().get("https://new.globe.com.ph/");
		assertTrue(DriverManager.getDriver().getTitle().contains("Globe Online"));
		System.out.println("Validated title : Globe Online");
		
			if (DL.isElementExist("Cookies Notification", "cookiesNotification", 10)) {
				Thread.sleep(3000);
				DL.get_privacyAccept().click();
				System.out.println("Clicked on 'Privacy - I accept' button");
			}
			Constant.dataMap.set(Map);
		    Constant.dataMap.get().put("TestClassName",DG.getClass().getSimpleName());
			Constant.dataMap.get().put("OMT_LAS", "NOT FOUND");
			Constant.dataMap.get().put("OMT_DispositionStatus", "NOT FOUND");
			Constant.dataMap.get().put("OMT_UpdateDate", "NOT FOUND");
			Constant.dataMap.get().put("OMT_DateOrdered", "NOT FOUND");
			Constant.dataMap.get().put("OMT_EstimatedDayOfDelivery", "NOT FOUND");
			Constant.dataMap.get().put("OMT_OrderDetails", "NOT FOUND");
			Constant.dataMap.get().put("Magento_Details", "NOT FOUND");
			Constant.dataMap.get().put("Magento_OrderAccountInfo", "NOT FOUND");
			
	
	
	/********************************************************************************************************/
	//Hover on Renew(Step 1 to 4)
	common.hoveronRenew();
	
	//click on viewAllDevices
	common.clickOnViewAllDevices();
	
    //Selecting plan value
    common.selectingPlanValue(599);
    
    //Click on filter
    common.clickOnApplyFilter();
    
    //step 29
    //searching for iPhone
    common.searchingDevice("Samsung Galaxy A13");
    
    //Clicking on magnifying glass
    common.clickOnMagnifyingGlass("Samsung");
    
    //validating product details
    common.validateProductDetails();
    
  //click on renew with this device
    common.clickOnRenewWithThisDevice();
    
    //Enter mobile number in otp page
    common.insertMobileNumberandValidateOtpPage("09171421883");
    
    // Create a Scanner object
    Scanner myObj = new Scanner(System.in); 
	System.out.println("Enter OTP HERE"); String OTP = myObj.nextLine(); 
	// Read  user input 
    System.out.println("OTP : " + OTP); 
    
    // Output user input
    common.OTPPage_(OTP);

    //Insert otp
    //common.handle_and_insert_OTP();
    
    //Validate loading changes
    common.loadingScreenValidation();
    
    //Customize plan page validation
    common.customizePlanValidation();
    
    //See my new plan validation
    common.seeMyNewPlanValidation();
    
    //Pay page validation
    common.payPageValidation();
    
    //select payment
    common.selectPayment("cashOnDelivery");
    
    //upload pofc
  //  common.uploadPOFC();
    
    //submit order
    common.submitorder();
    
    //gCash Credentials
    common.enterPaymentdetails("cashOnDelivery","9278945164");
    
    //success page
    common.successPageValidation();
    
    //order tracker
    common.orderTrackerValidation();
    
    
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
