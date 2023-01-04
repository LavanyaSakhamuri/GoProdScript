package globeOnline_ADA;
import static org.junit.Assert.assertTrue;

import java.util.LinkedHashMap;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.pages.ada.ADADAF_Page;
import com.pages.ada.ADAPDP_page;
import com.pages.ada.CheckoutPage;

import globeOnline_CommonMethods.DriverManager;
import globeOnline_CommonMethods.SetDriver;
import globeOnline_CommonMethods.util;
import utility.Constant;


public class ADA8 extends SetDriver{


	// **********************************************************************************************************************
	private static ADA8 ADA8Scenario = new ADA8();
	private util util = new util();

	private ADAcommonmethods common = new ADAcommonmethods();
	private CheckoutPage checkout = new CheckoutPage();
	private ADADAF_Page Form = new ADADAF_Page();
	private ADAPDP_page PP = new ADAPDP_page();
	private String Status = "failed";
	private static  LinkedHashMap<String,String> Map = new LinkedHashMap<>();

	@Test
	public void ADA8Scenario() throws Exception {
		JavascriptExecutor jse = (JavascriptExecutor)DriverManager.getDriver();
		jse.executeScript("lambda-name=ADA 8");	


		//User access URL 
		DriverManager.getDriver().get("https://onlinepreprod.globe.com.ph/");
		assertTrue(DriverManager.getDriver().getTitle().contains("Globe Online"));
		System.out.println("Validated title : Globe Online");
		Constant.dataMap.set(Map);
		Constant.dataMap.get().put("TestClassName",ADA8Scenario.getClass().getSimpleName());
		Constant.dataMap.get().put("OMT_LAS", "NOT FOUND");
		Constant.dataMap.get().put("OMT_DispositionStatus", "NOT FOUND");
		Constant.dataMap.get().put("OMT_UpdateDate", "NOT FOUND");
		Constant.dataMap.get().put("OMT_DateOrdered", "NOT FOUND");
		Constant.dataMap.get().put("OMT_EstimatedDayOfDelivery", "NOT FOUND");
		Constant.dataMap.get().put("OMT_OrderDetails", "NOT FOUND");
		Constant.dataMap.get().put("Magento_Details", "NOT FOUND");
		Constant.dataMap.get().put("Magento_OrderAccountInfo", "NOT FOUND");
		//	}
		//		System.out.println("Present Project Directory : "+ System.getProperty("user.dir"));
		// ************************************************************************************
		Thread.sleep(5000L);
		common.IacceptClick();
		common.NavigateTo_Apply_MobilePostpaid();

		common.SelectPlanType("gplanWithDevice");

		Thread.sleep(5000);
		if (PP.isClickable("Disc_Basicbtn", 5)) {
			Thread.sleep(2000L);
			PP.moveToElement("Disc_Basicbtn");
			Thread.sleep(2000L);
			PP.js_clickOnElement("Button", "Disc_Basicbtn", "Disc_Basicbtn");		
		}
		Thread.sleep(10000L);
		//PP.clickOnElement("Button", "Buildmyplan", "Build_btn");

		/*
		 * PP.isElementExist("Dataaddon", "Data_addon", 10);
		 * PP.js_clickOnElement("Button", "Togglebutton", "Data_checkbox");
		 * PP.isElementExist("GS99", "GSAddsurf99", 10); PP.js_clickOnElement("Button",
		 * "addon", "GSAddsurf99");
		 */

		//Searching device 
		common.searchDevice();

		if(PP.isElementExist("Youtube Addon", "YoutubeAddon", 10)) {
			PP.js_clickOnElement("Button", "Youtube Addon", "YoutubeAddon"); }


		PP.isElementExist("Review my plan", "Reviewmyplan", 10);
		PP.js_clickOnElement("Button", "Review my plan", "Reviewmyplan");

		common.insert_phoneNo(utility.Constant.ADA8_Testdata);

		PP.clickOnElement("Button", "Proceed", "proceedbtn1");

		//line 564 - ENTER OTP
		if (checkout.isElementExist("Text OTP", "otpText", 30)) {
			System.out.println("Navigated to screen to insert OTP");
		}
		Thread.sleep(10000);
		util.assertContainText("Validated title", DriverManager.getDriver().getTitle(), "One-Time Password");
		common.handle_and_insert_OTP();

		//			common.validateEligibility_LoaderPage();	
		Thread.sleep(25000L);

		common.validate_acquiConfirmationPage();

		//			common.validateEligibility_LoaderPage();	
		Thread.sleep(50000L);
		//PP.js_clickOnElement("Button", "Proceedbuttton", "Breakdown_proceedbutton");
		JavascriptExecutor jsp = (JavascriptExecutor) DriverManager.getDriver();
		jsp.executeScript("arguments[0].click();", PP.get_proceedbtn1());


		Thread.sleep(10000L);
		assertTrue(DriverManager.getDriver().getTitle().contains("Personal Information"));
		System.out.println("Validated title : "+DriverManager.getDriver().getTitle().contains("Personal Information"));	
		common.validateDAF();
		common.validatePersonalInfo_MandatoryFields();
		common.insert_personal_info_on_form_RandomName("sakhamuri.lavanya@globe.com.ph");

		common.insert_address_details("House","12","Main"," Mtgb","METRO MANILA","CITY OF MANDALUYONG","Burol");

		//line 580 - click "Next: Delivery Information" 
		Form.js_clickOnElement("Button","NextDeliinfo","NextDeliinfo");

		Thread.sleep(10000L);
		assertTrue(DriverManager.getDriver().getTitle().contains("Delivery Information"));
		System.out.println("Validated title : Delivery Information");	

		//"Enter ODA Address || Address: Abra, Bangued"
		common.insert_address_details("House","11","Abra St","","ABRA","BANGUED (Capital)","Agtangao");
		Form.moveToElement("ODA_Img");
		Form.isElementExist("ODA Img", "ODA_Img", 10);
		Form.isElementExist("ODA Header: Your address is out of our delivery area", "ODA_Header", 10);
		Form.isElementExist("ODA Spiel: Please provide a different address.", "ODA_Spiel", 10);

		Constant.dataMap.get().put("TimeStamp", util.getTimeStamp());
		util.writeToExcelLastRowFromMap("Sheet1", Constant.dataMap.get());

		Status = "passed";
		//			DriverManager.getDriver().quit();
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