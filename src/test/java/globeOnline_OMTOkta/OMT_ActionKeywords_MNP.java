package globeOnline_OMTOkta;

import java.util.ArrayList;

import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;

import org.apache.commons.math3.dfp.DfpField;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
//import utility.Constant;
import utility.*;

import com.pages.ada.BasePage;
import com.pages.omt.MNP_OMT_Page;

import globeOnline_CommonMethods.DriverManager;
import globeOnline_CommonMethods.SetDriver;
import globeOnline_CommonMethods.util;

public class OMT_ActionKeywords_MNP extends SetDriver {
	public static util util = new util();
	private static OMT_Login K = new OMT_Login();
	private BasePage BP = new BasePage();
	private static OMT_ActionKeywords_MNP SC = new OMT_ActionKeywords_MNP();
	public static OMT_DriverScriptMNP DS = new OMT_DriverScriptMNP();

	private static OMT_MNP_Functions MF = new OMT_MNP_Functions();
	private static MNP_OMT_Page OMTMNP = new MNP_OMT_Page();
	private static String Status = "failed";
	private static LinkedHashMap<String, String> Map = new LinkedHashMap<>();
	private static LinkedHashMap<String, Integer> Map1 = new LinkedHashMap<>();

	public static String Rowvalue = Constant.RowValue;

	private static String Globeurl = "https://onlinepreprod.globe.com.ph/track-order";
	private static String OMTurl = "https://edo-dev-data-engineering.globe.com.ph/omt-uat/bbsp-admin/";

//	 public String ScenarioName= SC.getClass().getSimpleName();
//	 public String OrderReferenceId = "PRE-000002666"; // from excel
//	private String ScenarioName = "MNPHAPPYPATH"; // row number from
	// public static String RoleName = DS.AssignToAgent;

	public void ValidateOMTOrderDetails(String UserAgent) throws Exception {
		// String SCname=util.ReadFromRowExcel(Constant.RowValue, "Sheet1",
		// 29);
//		JavascriptExecutor jse = (JavascriptExecutor)DriverManager.getDriver();
//		jse.executeScript("lambda-name=OMTLOGIN");
		String TestCaseName = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.ScenarioColumn);// ScenarioName

		DriverManager.getDriver()
				.get("https://edo-dev-data-engineering.globe.com.ph/omt-uat/bbsp-admin/application-entry");
		// String SCname = util.ReadFromRowExcel(Constant.RowValue,
		// "Sheet1", Constant.FlowIdColumnValue);// flowid
	//	String User1 = util.ReadFromRowExcel(Constant.RowValue_FlowDetails, "FlowDetails", Constant.User1);

		K.OMT_Role_Login(Constant.FlowType, UserAgent);

		// SC.getClass().getSimpleName()
		Constant.dataMap.set(Map);
		// Constant.dataMap.get().put("TestClassName", ScenarioName);
		Constant.dataMap.get().put("OMT_LAS", "NOT FOUND");
		Constant.dataMap.get().put("OMT_DispositionStatus", "NOT FOUND");
		Constant.dataMap.get().put("OMT_UpdateDate", "NOT FOUND");
		Constant.dataMap.get().put("OMT_DateOrdered", "NOT FOUND");
		Constant.dataMap.get().put("OMT_EstimatedDayOfDelivery", "NOT FOUND");
		Constant.dataMap.get().put("OMT_OrderDetails", "NOT FOUND");

		// Constant.dataMap.get().put("OMT_OrderState", "NOT FOUND");
		// Constant.dataMap.get().put("OMT_FlowID", "FTA_HappyPath_Completed");
		Constant.dataMap.get().put("OMT_RecipientDetails", "NOT FOUND");
		Constant.dataMap.get().put("OMT_PaymentDetails", "NOT FOUND");
		Constant.dataMap.get().put("OMT_MobileNumber", "NOT FOUND");
		Constant.dataMap.get().put("OMT_OrderID", "NOT FOUND");
		Constant.dataMap.get().put("OMT_DateOrdered", "NOT FOUND");
		Constant.dataMap.get().put("OMT_UpdateDate", "NOT FOUND");
		Constant.dataMap.get().put("OMT_CustomerDetails", "NOT FOUND");
		Constant.dataMap.get().put("OMT_AddressDetails", "NOT FOUND");

		OMT_ValidateOrderDetails(TestCaseName);
		util.writeToExcelExistingRowFromMap("Sheet1", Constant.dataMap.get(),Constant.ScenarioName,1);
		// DriverManager.getDriver().quit();

	}

	// !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!functions!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!//

	public void OMT_ValidateOrderDetails(String ScName) throws Exception {
		Thread.sleep(3000);

		// OMTMNP.clickOnElement("Entities", "Entities", "Entities");
		OMTMNP.javascript_clickOnElement(OMTMNP.get_Entities());
		OMTMNP.javascript_clickOnElement(OMTMNP.get_ApplicationEntry());
		
		Control.takeScreenshot();

		MF.OMTSearch_and_ValidateDashboard1();

		WebElement a = DriverManager.getDriver().findElement(OMTMNP.Dashboard_Dispo);
		String status = a.getText();

		Constant.dataMap.get().put("OMT_DateOrdered", OMTMNP.get_Dashboard_DateSubmitted().getText());
		Constant.dataMap.get().put("OMT_OrderID", OMTMNP.get_Dashboard_RefNum().getText());

		Constant.dataMap.get().put("OMT_DispositionStatus", status);
		
		WebElement b = DriverManager.getDriver().findElement(OMTMNP.TimeStamp);
		
		String Timestamp = b.getText();
		String Timestamp_OMT1 = Timestamp.replaceAll("-", "_");
		String Timestamp_OMT2 = Timestamp_OMT1.replaceAll(" ", "_");
		String Timestamp_OMT = Timestamp_OMT2.replaceAll(":", "_");
		

		Constant.dataMap.get().put("OMT_TimeStamp", Timestamp_OMT);
		
		util.writeToExcelExistingRowFromMap("Sheet1", Constant.dataMap.get(),Constant.ScenarioName,1);

		ArrayList Time_Go = util.readExcelData(Constant.TimeStamp, ScName, "Sheet1");
		if (Time_Go.contains(Timestamp_OMT)) { // NEED TO CHECK
			System.out.println("Globe Online and OMT timestamp of order placed are matched");
		} else {
			System.out.println("Globe Online and OMT timestamp of order placed didnt matched");

		}
		// Click on View
		JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
		js1.executeScript("arguments[0].click();", OMTMNP.get_ViewBtn());
		
		Control.takeScreenshot();
		
		String ORDERID = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.OrderRefID);

		MF.Validate_ORDER(ORDERID, "Check MNPSTATUS Failed");
		ArrayList CustDet_GO = util.readExcelData(Constant.CustomerDetails, ScName, "Sheet1");
		
		String Customer_Details_OMT = MF.orderview_CustomerDetails();
		
		
		String B = CustDet_GO.toString();
		String C = B.replace("[", " ");
		String D = C.replace("]", " ");
		
		
		if (D.trim().equalsIgnoreCase(Customer_Details_OMT)) {
			System.out.println("Globe Online  and OMT Customer Details of order placed are matched");
		} else {
			System.out.println("Globe Online and OMT Customer Details of order placed didnt matched");

		}

		Constant.dataMap.get().put("OMT_CustomerDetails", Customer_Details_OMT);

		Constant.dataMap.get().put("OMT_MobileNumber", OMTMNP.get_Mobilenumber_input().getAttribute("value"));

		Constant.dataMap.get().put("OMT_CustomerDetails", Customer_Details_OMT);

		Constant.dataMap.get().put("OMT_MobileNumber", OMTMNP.get_Mobilenumber_input().getAttribute("value"));
		
		String Recipient_Details_OMT = OMTMNP.get_ReceipentDetails().getText();
		
		
		
		if (!Recipient_Details_OMT.isEmpty()) {
			Constant.dataMap.get().put("OMT_RecipientDetails", OMTMNP.get_ReceipentDetails().getText());
		}

//		String AddressDetails = MF.Validate_RegisteredAddress("Condo"); // i need to change also address po
//		Constant.dataMap.get().put("OMT_AddressDetails", AddressDetails);
		// //MF.Validate_ShippingAddress("Condo");
		
		MF.Validate_OMTMNPRegisteredAddressForPayment("House_Condo");
		
//		Constant.dataMap.get().put("OMT_AddressDetails", AddressDetails);
		
//		MF.orderview_CustomerDetails();
		
		MF.orderview_RecipentDetails();
		
		MF.orderview_AddressDetails();
		
//		MF.Validate_RegisteredAddress("House");

		// common.orderview_PaymentDetails();

		MF.orderview_OrderDetails1();
		Constant.dataMap.get().put("OMT_OrderDetails", OMTMNP.get_Producttype_input().getAttribute("value"));
		// MF.Validate_PaymentDetails();
		MF.orderview_PaymentDetails();
		

		Constant.dataMap.get().put("OMT_PaymentDetails", OMTMNP.get_Paymentmethod_input().getAttribute("value"));

		MF.orderview_FullfilmentDetails();
		
		
		MF.orderview_ActivationDetails();
		
		
		MF.orderview_RefundDetails();
		
		
//		
		// MFter sales is missing
		MF.orderview_Sale_OrderHistoryDetails();
		Control.takeScreenshot();

		// Click on Back
		JavascriptExecutor js2 = (JavascriptExecutor) DriverManager.getDriver();
		js2.executeScript("arguments[0].click();", OMTMNP.get_Backbutton());
		Thread.sleep(3000);
		
		Control.takeScreenshot();
		
		System.out.println("Disposition Status: " + OMTMNP.get_Dashboard_Dispo().getText());
		// Constant.dataMap.get().put("TimeStamp", util.getTimeStamp());
		// Signout
		MF.Signout();
		Control.takeScreenshot();
		Thread.sleep(30000);
	}
	/***********************************************************************************/
	public void VerifyOrder_CheckMNPStatusFailed(String UserAgent) throws Exception {
		// read from excel and make assign order as separate keyword
//		 AssignOrderOMT(DS.sActionKeywordAgent);
		DriverManager.getDriver().quit();
		LaunchBrowser_OMT();	
		DriverManager.getDriver()
		.get("https://edo-dev-data-engineering.globe.com.ph/omt-uat/bbsp-admin/application-entry");
		
		String SCname = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.FlowIdColumnValue);// flow
		Control.takeScreenshot();																								// i
		//String User2 = util.ReadFromRowExcel(SCname, "FlowDetails", Constant.User2);
		OMTOrderStatus_CheckMNPStatusFailed(Constant.FlowType, UserAgent, Constant.PortingReqStatusSuccess);
	}
	
//	Porting Under View Request Status Change
	
	/******************************************Porting Under Review ***********************************************/	
	public void VerifyOrder_PortingReqStatusPending(String UserAgent) throws Exception {
		// read from excel and make assign order as separate keyword
//		 AssignOrderOMT(DS.sActionKeywordAgent);
		DriverManager.getDriver().quit();
		LaunchBrowser_OMT();
		String SCname = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.FlowIdColumnValue);// flow
																												// id

	//	String User3 = util.ReadFromRowExcel(SCname, "FlowDetails", Constant.User3);
		OMTOrderStatus_PortingUnderView(Constant.FlowType, UserAgent, Constant.PortingReqStatusPeding);
	}
	
	/******************************************Porting Under Review ***********************************************/
	public void VerifyOrder_PortingReqStatusFailed(String UserAgent) throws Exception {
		// read from excel and make assign order as separate keyword
//		 AssignOrderOMT(DS.sActionKeywordAgent);
//		DriverManager.getDriver().quit();
		LaunchBrowser_OMT();
		String SCname = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.FlowIdColumnValue);// flow
																												// id

	//	String User3 = util.ReadFromRowExcel(SCname, "FlowDetails", Constant.User3);
		OMTOrderStatus_PortingReqStatusFailed(Constant.FlowType, UserAgent, Constant.PortingReqStatusFailed);
	}
	/******************************************Assign Order to OMT-GotS-TL***********************************************/
	
	public void AssignOrderOMT(String RoleName) throws Exception {
		DriverManager.getDriver().quit();
		LaunchBrowser_OMT();
		Thread.sleep(2000);
		// String User1 = util.ReadFromRowExcel(SCname,
		// "FlowDetails",Constant.User1);
		// String RoleName = util.ReadFromRowExcel(SCname,
		// "FlowDetails",Constant.User1);
		K.OMT_Role_Login(Constant.FlowType, Constant.AssignOrderTL);

		Thread.sleep(3000);

		// OMTMNP.clickOnElement("Entities", "Entities", "Entities");
		OMTMNP.javascript_clickOnElement(OMTMNP.get_Entities());
		OMTMNP.javascript_clickOnElement(OMTMNP.get_AppEntry());

		MF.OMTSearch_and_ValidateDashboard1();

		System.out.println("Disposition Status: " + OMTMNP.get_Dashboard_Dispo().getText());
		Constant.dataMap.set(Map);
		Constant.dataMap.get().put("OMT_DispositionStatus", OMTMNP.get_Dashboard_Dispo().getText());
		util.writeToExcelExistingRowFromMap("Sheet1", Constant.dataMap.get(),Constant.ScenarioName,1);
		Thread.sleep(4000);
		// Assign order to respective Agent
		// Click on Checkbox
		JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
		js1.executeScript("arguments[0].click();", OMTMNP.get_OrderCheckBox());
		JavascriptExecutor jsp = (JavascriptExecutor) DriverManager.getDriver();
		jsp.executeScript("arguments[0].click();", OMTMNP.get_RemoveAssigneRdbtn());
		JavascriptExecutor jsR = (JavascriptExecutor) DriverManager.getDriver();
		jsR.executeScript("arguments[0].click();", OMTMNP.get_RemoveButton());
		JavascriptExecutor jsA = (JavascriptExecutor) DriverManager.getDriver();
		jsA.executeScript("arguments[0].click();", OMTMNP.get_AssignRdBtn());
		//JavascriptExecutor jso = (JavascriptExecutor) DriverManager.getDriver();
		//jso.executeScript("arguments[0].click();", OMTMNP.get_OrderCheckBox());

		if ((OMTMNP.get_Assign_btn().isEnabled())) {
			/*
			 * JavascriptExecutor jsA = (JavascriptExecutor)
			 * DriverManager.getDriver();
			 * jsA.executeScript("arguments[0].click();",
			 * OMTMNP.get_AssigneRdBtn());
			 */
			String AgentName = util.ReadFromExcel(RoleName, "LoginDetails", Constant.AgentName);

			WebElement SelectAdmin = DriverManager.getDriver().findElement(OMTMNP.Select_Admin);
			SelectAdmin.sendKeys(AgentName);
			DriverManager.getDriver().findElement(OMTMNP.Assign_Result).click();
			// SelectAdmin.sendKeys(Keys.ENTER);
			JavascriptExecutor js2 = (JavascriptExecutor) DriverManager.getDriver();
			js2.executeScript("arguments[0].click();", OMTMNP.get_Assign_btn());
		} else if (OMTMNP.get_RemoveAssignee().isEnabled()) {
			JavascriptExecutor js3 = (JavascriptExecutor) DriverManager.getDriver();
			js3.executeScript("arguments[0].click();", OMTMNP.get_RemoveAssignee());
			Thread.sleep(3000);
			JavascriptExecutor js4 = (JavascriptExecutor) DriverManager.getDriver();
			js4.executeScript("arguments[0].click();", OMTMNP.get_OrderCheckBox());

			JavascriptExecutor js5 = (JavascriptExecutor) DriverManager.getDriver();
			js5.executeScript("arguments[0].click();", OMTMNP.get_AssignRdBtn());
			
			Generic.WriteTestData("User should be able to Assign Gots agent", "", "", "User should be able to Check assign","User should be able to  assigned to Respective agent", "Passed");
			Control.takeScreenshot();
			String AgentName = util.ReadFromExcel(RoleName, "LoginDetails", Constant.AgentName);
			WebElement SelectAdmin = DriverManager.getDriver().findElement(OMTMNP.Select_Admin);
			SelectAdmin.sendKeys(AgentName);
			DriverManager.getDriver().findElement(OMTMNP.Assign_Result).click();

			// SelectAdmin.sendKeys(Keys.ENTER);
			JavascriptExecutor js2 = (JavascriptExecutor) DriverManager.getDriver();
			js2.executeScript("arguments[0].click();", OMTMNP.get_Assign_btn());
			Control.takeScreenshot();
		}
		

		MF.Signout();
//		DriverManager.getDriver().quit();
	}				
	/****************************************LaunchBrowser OMT
	 * @throws Exception ***********************************************/	
	
 
	public void LaunchBrowser_OMT() throws Exception {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		DesiredCapabilities desiredCapabilities = DesiredCapabilities.chrome();
		// options.addArguments("user-data-dir=< path of the folder >");
		options.addArguments("user-data-dir=D:\\ChromeData");
		desiredCapabilities.setCapability(ChromeOptions.CAPABILITY, options);

		driver = new ChromeDriver(options);
		DriverManager.setWebDriver(driver);

		DriverManager.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		DriverManager.getDriver().manage().window().maximize();
		 DriverManager.getDriver().manage().deleteAllCookies();
		
		DriverManager.getDriver()
				.get("https://edo-dev-data-engineering.globe.com.ph/omt-uat/bbsp-admin/application-entry");
			
	}	
		
	/****************************************** Check MNPStatusFailed with Reason Change  Status to Success***********************************************/
	public void OMTOrderStatus_CheckMNPStatusFailed(String FlowType, String UserAgent, String Status) throws Exception {
		// Change the status Check MNPStatus Failed with Reason
		K.OMT_Role_Login(FlowType, UserAgent);
		Generic.WriteTestData("User should be able to Check MNP status ailed with reason and Changing the disposition Status", "", "", "User should be able to access OMT application","User is able to access OMT application", "Passed");
		Control.takeScreenshot();
		Thread.sleep(3000);

		OMTMNP.javascript_clickOnElement(OMTMNP.get_Entities());
		OMTMNP.javascript_clickOnElement(OMTMNP.get_AppEntry());

		MF.OMTSearch_and_ValidateDashboard1();

		// Click on edit
		JavascriptExecutor jsO = (JavascriptExecutor) DriverManager.getDriver();
		jsO.executeScript("arguments[0].click();", OMTMNP.get_EditBtn());
		 
		BP.scroll_vertical(300);
		
		JavascriptExecutor jsMNPDetails = (JavascriptExecutor) DriverManager.getDriver();
		jsMNPDetails.executeScript("arguments[0].click();", OMTMNP.get_MNPDetails());
		
		Control.takeScreenshot();
                    
//		Changing the Status to Success under Mobile Porting Details
		MF.UpdateOrderStatus("Success");
		
//		Control.takeScreenshot();
		BP.scroll_vertical(300);
		
		
		JavascriptExecutor jss = (JavascriptExecutor) DriverManager.getDriver();
		jss.executeScript("arguments[0].click();", OMTMNP.get_Savebutton());
		
//		Control.takeScreenshot();
		
		BP.scroll_vertical(690);
		JavascriptExecutor js6 = (JavascriptExecutor) DriverManager.getDriver();
		js6.executeScript("arguments[0].click();", OMTMNP.get_Confirmcorrect());
		
		Control.takeScreenshot();
		

		Thread.sleep(7000);
		
		Constant.dataMap.set(Map);
		Constant.dataMap.get().put("OMT_DispositionStatus", "NotFound");
		Constant.dataMap.get().put("OMT_DispositionStatus", OMTMNP.get_Dashboard_Dispo().getText());
		// util.writeToExcelExistingRowFromMap("Sheet1", Constant.dataMap.get(),
		// ScenarioName, 0);
		util.writeToExcelExistingRowFromMap("Sheet1", Constant.dataMap.get(),Constant.ScenarioName,1);
		
		Control.takeScreenshot();
		
		MF.Signout();
		
	}

	/****************************************** Checking Porting Under Review Status***********************************************/
	public void OMTOrderStatus_PortingUnderView(String FlowType, String UserAgent, String Status) throws Exception {		
		// Change the status Check MNPStatus Failed with Reason
		K.OMT_Role_Login(FlowType, UserAgent);

		Thread.sleep(3000);

		OMTMNP.javascript_clickOnElement(OMTMNP.get_Entities());
		OMTMNP.javascript_clickOnElement(OMTMNP.get_AppEntry());

		MF.OMTSearch_and_ValidateDashboard1();

		// Click on edit
		JavascriptExecutor jsO = (JavascriptExecutor) DriverManager.getDriver();
		jsO.executeScript("arguments[0].click();", OMTMNP.get_EditBtn());

//		Changing the Status to Success under Mobile Porting Details
		MF.UpdateOrderStatus("Pending");

		System.out.println("Disposition Status: " + OMTMNP.get_Dashboard_Dispo().getText());
		Constant.dataMap.set(Map);
		Constant.dataMap.get().put("OMT_DispositionStatus", "NotFound");
		Constant.dataMap.get().put("OMT_DispositionStatus", OMTMNP.get_Dashboard_Dispo().getText());
		// util.writeToExcelExistingRowFromMap("Sheet1", Constant.dataMap.get(),
		// ScenarioName, 0);
		util.writeToExcelExistingRowFromMap("Sheet1", Constant.dataMap.get(),Constant.ScenarioName,1);
		MF.Signout();
	}
	
	/****************************************** Porting Failed***********************************************/
	
	public void OMTOrderStatus_PortingReqStatusFailed(String FlowType, String UserAgent, String Status) throws Exception {
		/******************************************CheckMNPStatusFailed with Reason  ***********************************************/	 
		// Change the status Check MNPStatus Failed with Reason
		K.OMT_Role_Login(FlowType, UserAgent);

		Thread.sleep(3000);

		OMTMNP.javascript_clickOnElement(OMTMNP.get_Entities());
		OMTMNP.javascript_clickOnElement(OMTMNP.get_AppEntry());

		MF.OMTSearch_and_ValidateDashboard1();

		// Click on edit
		JavascriptExecutor jsO = (JavascriptExecutor) DriverManager.getDriver();
		jsO.executeScript("arguments[0].click();", OMTMNP.get_EditBtn());

//		Changing the Status to Success under Mobile Porting Details
		MF.UpdateOrderStatus("PortingReqStatusFailed");

		System.out.println("Disposition Status: " + OMTMNP.get_Dashboard_Dispo().getText());
		Constant.dataMap.set(Map);
		Constant.dataMap.get().put("OMT_DispositionStatus", "NotFound");
		Constant.dataMap.get().put("OMT_DispositionStatus", OMTMNP.get_Dashboard_Dispo().getText());
		// util.writeToExcelExistingRowFromMap("Sheet1", Constant.dataMap.get(),
		// ScenarioName, 0);
		util.writeToExcelExistingRowFromMap("Sheet1", Constant.dataMap.get(),Constant.ScenarioName,1);
		MF.Signout();
	}
	
}
