package globeOnline_OMTOkta;

import java.util.ArrayList;


import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import utility.*;
import com.pages.omt.HPW_omt_page;
import globeOnline_CommonMethods.DriverManager;
import globeOnline_CommonMethods.SetDriver;
import globeOnline_CommonMethods.util;

public class OMT_ActionKeywordsHPW extends SetDriver {
	public static util util = new util();
	private static OMT_Login K = new OMT_Login();
	public static OMT_DriverScriptHPW DS = new OMT_DriverScriptHPW();
	private static OMT_HPW_Functions AF = new OMT_HPW_Functions();
	private static HPW_omt_page OMTHPW = new HPW_omt_page();	
	private static LinkedHashMap<String, String> Map = new LinkedHashMap<>();
	public static String Rowvalue = Constant.RowValue;
	private static String Globeurl = "https://online.globe.com.ph/";
	private static String OMTurl = "https://edo-data-engineering.globe.com.ph/omt/";


	public void ValidateOMTOrderDetails(String UserAgent) throws Exception {
		
		String TestCaseName = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.ScenarioColumn);// ScenarioName

		DriverManager.getDriver()
				.get("https://edo-data-engineering.globe.com.ph/omt/");
				
		K.OMT_Role_Login(Constant.FlowTypeHPW, UserAgent);
		Constant.dataMap.set(Map);
		//Constant.dataMap.get().put("TestClassName", ScenarioName);
		Constant.dataMap.get().put("OMT_LAS", "NOT FOUND");
		Constant.dataMap.get().put("OMT_DispositionStatus", "NOT FOUND");
		Constant.dataMap.get().put("OMT_UpdateDate", "NOT FOUND");
		Constant.dataMap.get().put("OMT_DateOrdered", "NOT FOUND");
		Constant.dataMap.get().put("OMT_EstimatedDayOfDelivery", "NOT FOUND");
		Constant.dataMap.get().put("OMT_OrderDetails", "NOT FOUND");

		// Constant.dataMap.get().put("OMT_OrderState", "NOT FOUND");
		//Constant.dataMap.get().put("OMT_FlowID", "FTA_HappyPath_Completed");
		Constant.dataMap.get().put("OMT_RecipientDetails", "NOT FOUND");
		Constant.dataMap.get().put("OMT_PaymentDetails", "NOT FOUND");
		Constant.dataMap.get().put("OMT_MobileNumber", "NOT FOUND");
		Constant.dataMap.get().put("OMT_OrderID", "NOT FOUND");
		Constant.dataMap.get().put("OMT_DateOrdered", "NOT FOUND");
		Constant.dataMap.get().put("OMT_UpdateDate", "NOT FOUND");
		Constant.dataMap.get().put("OMT_CustomerDetails", "NOT FOUND");
		Constant.dataMap.get().put("OMT_AddressDetails", "NOT FOUND");

		OMT_ValidateOrderDetails(TestCaseName);
		util.writeToExcelExistingRowFromMap("Sheet1", Constant.dataMap.get(),Constant.ScenarioNameHPW,1);

		// DriverManager.getDriver().quit();

	}

	
	
	public void VerifyOrder_ForReDelivery1(String UserAgent) throws Exception {
		// read from excel and make assign order as separate keyword
		// AssignOrderOMT(DS.sActionKeywordAgent);
		DriverManager.getDriver().quit();
		LaunchBrowser_OMT();
		String SCname = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.FlowIdColumnValue);// flow id
		String CaseName = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.ScenarioColumn);
																									
		//String User11 = util.ReadFromRowExcel(SCname, "FlowDetailsHPW", Constant.User11);
		OMTOrderStatus_ReDelivery1(Constant.FlowTypeHPW, UserAgent, Constant.ForRedelivery1,CaseName);

	}
	
	public void VerifyOrder_ForReDelivery2(String UserAgent) throws Exception {
		// read from excel and make assign order as separate keyword
		// AssignOrderOMT(DS.sActionKeywordAgent);
		DriverManager.getDriver().quit();
		LaunchBrowser_OMT();
		String SCname = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.FlowIdColumnValue);// flow
																												// id
		String CaseName = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.ScenarioColumn);

		//String User15 = util.ReadFromRowExcel(SCname, "FlowDetailsHPW", Constant.User15);
		OMTOrderStatus_ReDelivery2(Constant.FlowTypeHPW, UserAgent, Constant.ForRedelivery2,CaseName);

	}
	
	public void VerifyOrder_ForReDelivery3(String UserAgent) throws Exception {
		// read from excel and make assign order as separate keyword
		// AssignOrderOMT(DS.sActionKeywordAgent);
		DriverManager.getDriver().quit();
		LaunchBrowser_OMT();
		String SCname = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.FlowIdColumnValue);// flow
																												// id
		String CaseName = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.ScenarioColumn);

		//String User19 = util.ReadFromRowExcel(SCname, "FlowDetailsHPW", Constant.User19);
		OMTOrderStatus_ReDelivery3(Constant.FlowTypeHPW, UserAgent, Constant.ForRedelivery3,CaseName);

	}
	
	public void VerifyOMTOrder_ForProcessing(String UserAgent) throws Exception {
		// AssignOrderOMT(DS.sActionKeywordAgent);
		DriverManager.getDriver().quit();
		LaunchBrowser_OMT();
		String SCName = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.FlowIdColumnValue);

		String CaseName = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.ScenarioColumn);

		//String User3 = util.ReadFromRowExcel(SCName, "FlowDetailsHPW", Constant.User3);
		String PaymentMethod = util.ReadFromExcel(CaseName, "Sheet1", Constant.PaymentMenthod);

		OMTStatus_ForProcessing1(Constant.FlowTypeHPW, UserAgent, SCName, PaymentMethod, Constant.ForProcessing,CaseName);
		// Rid refreshes 15 min

		/*Thread.sleep(60000);
		VerifyOMTOrder_ForProcessingRefresh();*/

	}
	public void VerifyOMTOrder_ForDispatch(String UserAgent) throws Exception {
		// AssignOrderOMT(DS.sActionKeywordAgent);
		DriverManager.getDriver().quit();
		LaunchBrowser_OMT();
		String SCName = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.FlowIdColumnValue);

		String CaseName = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.ScenarioColumn);

		//String User5 = util.ReadFromRowExcel(SCName, "FlowDetailsHPW", Constant.User5);
		String PaymentMethod = util.ReadFromExcel(CaseName, "Sheet1", Constant.PaymentMenthod);

		OMTOrderStatus_ForDispach(Constant.FlowTypeHPW, UserAgent, SCName,Constant.ForDispatch,CaseName);
		// Rid refreshes 15 min

		/*Thread.sleep(60000);
		VerifyOMTOrder_ForProcessingRefresh();*/

	}
	public void Validateorderstatus(String UserAgent) throws Exception {

		// AssignOrderOMT(DS.sActionKeywordAgent);
		DriverManager.getDriver().quit();
		LaunchBrowser_OMT();
		String SCName = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.FlowIdColumnValue);

		String CaseName = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.ScenarioColumn);

		//String User7 = util.ReadFromRowExcel(SCName, "FlowDetailsHPW", Constant.User7);

		ValidateOrderStatustl(Constant.FlowTypeHPW, UserAgent, SCName,Constant.ForDispatch,CaseName);
	}
	public void VerifyOMTOrder_Forpickup(String UserAgent) throws Exception {

		// AssignOrderOMT(DS.sActionKeywordAgent);
		DriverManager.getDriver().quit();
		LaunchBrowser_OMT();
		String SCName = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.FlowIdColumnValue);

		String CaseName = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.ScenarioColumn);

		//String User9 = util.ReadFromRowExcel(SCName, "FlowDetailsHPW", Constant.User9);

		OMTOrder_Acqui_ForPickup(Constant.FlowTypeHPW, UserAgent, SCName, Constant.ForPickup,CaseName);
	}


	public void VerifyOMTOrder_ForDelivery(String UserAgent) throws Exception {

		// AssignOrderOMT(DS.sActionKeywordAgent);
		DriverManager.getDriver().quit();
		LaunchBrowser_OMT();
		String SCName = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.FlowIdColumnValue);

		String CaseName = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.ScenarioColumn);

		//String User9 = util.ReadFromRowExcel(SCName, "FlowDetailsHPW", Constant.User9);

		OMTOrderStatus_ForDelivery(Constant.FlowTypeHPW, UserAgent, SCName, Constant.ForDelivery,CaseName);
	}
	public void VerifyOMTOrder_ForDelivery2(String UserAgent) throws Exception {

		// AssignOrderOMT(DS.sActionKeywordAgent);
		DriverManager.getDriver().quit();
		LaunchBrowser_OMT();
		String SCName = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.FlowIdColumnValue);

		String CaseName = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.ScenarioColumn);

		//String User13 = util.ReadFromRowExcel(SCName, "FlowDetailsHPW", Constant.User13);

		OMTOrderStatus_ForDelivery(Constant.FlowTypeHPW, UserAgent, SCName, Constant.ForDelivery,CaseName);
	}

	public void VerifyOMTOrder_ForDelivery3(String UserAgent) throws Exception {

		// AssignOrderOMT(DS.sActionKeywordAgent);
		DriverManager.getDriver().quit();
		LaunchBrowser_OMT();
		String SCName = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.FlowIdColumnValue);

		String CaseName = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.ScenarioColumn);

		//String User17 = util.ReadFromRowExcel(SCName, "FlowDetailsHPW", Constant.User17);

		OMTOrderStatus_ForDelivery(Constant.FlowTypeHPW, UserAgent, SCName, Constant.ForDelivery,CaseName);
	}


	public void VerifyOMTOrder_Delivered(String UserAgent) throws Exception {

		// AssignOrderOMT(DS.sActionKeywordAgent);
		DriverManager.getDriver().quit();
		LaunchBrowser_OMT();
		String CaseName = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.ScenarioColumn);
		String SCName = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.FlowIdColumnValue);

		//String User13 = util.ReadFromRowExcel(SCName, "FlowDetailsHPW", Constant.User13);

		OMTOrderStatus_Delivered(Constant.FlowTypeHPW, UserAgent, SCName, Constant.Delivered,CaseName);
	}
	public void VerifyOMTOrder_ForActivated(String UserAgent) throws Exception {

		// AssignOrderOMT(DS.sActionKeywordAgent);
		DriverManager.getDriver().quit();
		LaunchBrowser_OMT();
		String SCName = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.FlowIdColumnValue);

		String CaseName = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.ScenarioColumn);

		//String User14= util.ReadFromRowExcel(SCName, "FlowDetailsHPW", Constant.User14);

		OMTOrder_Acqui_ForActivated(Constant.FlowTypeHPW, UserAgent, SCName, Constant.ForActivation,CaseName);
	}

	public void VerifyOMTOrder_Activated(String UserAgent) throws Exception {

		// AssignOrderOMT(DS.sActionKeywordAgent);
		DriverManager.getDriver().quit();
		LaunchBrowser_OMT();
		String SCName = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.FlowIdColumnValue);

		String CaseName = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.ScenarioColumn);

		//String User23 = util.ReadFromRowExcel(SCName, "FlowDetailsHPW", Constant.User23);

		OMTOrderStatus_Activated(Constant.FlowTypeHPW, UserAgent, SCName, Constant.Activated,CaseName);
	}
	
		
	

	// !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!functions!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!//

	public void OMT_ValidateOrderDetails(String ScName) throws Exception {
		Thread.sleep(3000);

		// OMTHPW.clickOnElement("Entities", "Entities", "Entities");
		OMTHPW.javascript_clickOnElement(OMTHPW.get_Entities());
		OMTHPW.javascript_clickOnElement(OMTHPW.get_ApplicationEntry());
		Generic.WriteTestData("User should be able to Validate omt dash board", "", "", "User should be able to Validate omt dash board","User is  able to Validate omt dash board", "Passed");
		Thread.sleep(4000);	    
		Control.takeScreenshot();

		AF.OMTSearch_and_ValidateDashboard1();

		WebElement a = DriverManager.getDriver().findElement(OMTHPW.Dashboard_Dispo);
		String status = a.getText();

		Constant.dataMap.get().put("OMT_DateOrdered", OMTHPW.get_Dashboard_DateSubmitted().getText());
		Constant.dataMap.get().put("OMT_OrderID", OMTHPW.get_Dashboard_RefNum().getText());

		Constant.dataMap.get().put("OMT_DispositionStatus", status);
		WebElement b = DriverManager.getDriver().findElement(OMTHPW.TimeStamp);
		String Timestamp = b.getText();
		String Timestamp_OMT1 = Timestamp.replaceAll("-", "_");
		String Timestamp_OMT2 = Timestamp_OMT1.replaceAll(" ", "_");
		String Timestamp_OMT = Timestamp_OMT2.replaceAll(":", "_");

		Constant.dataMap.get().put("OMT_TimeStamp", Timestamp_OMT);
		util.writeToExcelExistingRowFromMap("Sheet1", Constant.dataMap.get(),Constant.ScenarioNameHPW,1);

		ArrayList Time_Go = util.readExcelData(Constant.TimeStamp, ScName, "Sheet1");
		if (Time_Go.contains(Timestamp_OMT)) {    
			System.out.println("Globe Online and OMT timestamp of order placed are matched");
		} else {
			System.out.println("Globe Online and OMT timestamp of order placed didnt matched");

		}
		// Click on View
		JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
		js1.executeScript("arguments[0].click();", OMTHPW.get_ViewBtn());
		Control.takeScreenshot();
		String ORDERID = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.OrderRefID);

		AF.Validate_ORDER(ORDERID, "For Processing");// NEED TO change in every flow

		ArrayList CustDet_GO = util.readExcelData(Constant.CustomerDetails, ScName, "Sheet1");
		String Customer_Details_OMT = AF.orderview_CustomerDetails();
		
		String B = CustDet_GO.toString();
		String C = B.replace("[", " ");
		String D = C.replace("]", " ");
		if (D.trim().equalsIgnoreCase(Customer_Details_OMT)) {
			System.out.println("Globe Online  and OMT Customer Details of order placed are matched");
		} else {
			System.out.println("Globe Online and OMT Customer Details of order placed didnt matched");

		}

		Constant.dataMap.get().put("OMT_CustomerDetails", Customer_Details_OMT);

		Constant.dataMap.get().put("OMT_MobileNumber", OMTHPW.get_Mobilenumber_input().getAttribute("value"));
		String Recipient_Details_OMT=OMTHPW.get_Primary_RecipientName().getText();
		if(!Recipient_Details_OMT.isEmpty())
		{
				Constant.dataMap.get().put("OMT_RecipientDetails",
				OMTHPW.get_Primary_RecipientName().getText());
		}

		String AddressDetails = AF.Validate_RegisteredAddress("House");   // i need to change also address po
		Constant.dataMap.get().put("OMT_AddressDetails", AddressDetails);
		// //AF.Validate_ShippingAddress("Condo");
		
		
		AF.orderview_CustomerDetails();
		AF.orderview_RecipentDetails();
		AF.orderview_AddressDetails();
		AF.Validate_RegisteredAddress("House");
		
		//common.orderview_PaymentDetails();
				
	
		AF.orderview_OrderDetails1();
		Constant.dataMap.get().put("OMT_OrderDetails", OMTHPW.get_Producttype_input().getAttribute("value"));

		
		
		//AF.Validate_PaymentDetails();
		AF.orderview_PaymentDetails();

		Constant.dataMap.get().put("OMT_PaymentDetails", OMTHPW.get_Paymentmethod_input().getAttribute("value"));

		AF.orderview_FullfilmentDetails();
		AF.orderview_ActivationDetails();
		AF.orderview_RefundDetails();
		//after sales is missing
		AF.orderview_Sale_OrderHistoryDetails();
		
		
		
		
				
		JavascriptExecutor js2 = (JavascriptExecutor) DriverManager.getDriver();
		js2.executeScript("arguments[0].click();", OMTHPW.get_Backbutton());
		Thread.sleep(3000);
		Control.takeScreenshot();
		
		//need to change for these one
		// these for only sc5 modification list
//		JavascriptExecutor jsO = (JavascriptExecutor) DriverManager.getDriver();
//		jsO.executeScript("arguments[0].click();", OMTHPW.get_EditBtn());
//
//		
//	AF.UPDATEmobilenumberforpaymentSCenario();
		
		
		System.out.println("Disposition Status: " + OMTHPW.get_Dashboard_Dispo().getText());
		
		AF.Signout();
		//driver.quit();  for sc6 only 
		
	}

	public void OMTOrderStatus_ReDelivery1(String FlowType, String UserAgent, String Status,String CaseName) throws Exception {

		/******************************************
		 For ReDelivery
		 ***********************************************/
		// Change the status to Ongoing verfication

		K.OMT_Role_Login(FlowType, UserAgent);

		Thread.sleep(3000);

		OMTHPW.javascript_clickOnElement(OMTHPW.get_Entities());
		OMTHPW.javascript_clickOnElement(OMTHPW.get_ApplicationEntry());
		
		Generic.WriteTestData("User should be able to Validate omt dash board", "", "", "User should be able to Validate omt dash board","User is able to Validate omt dash board", "Passed");
		Thread.sleep(4000);	    
		Control.takeScreenshot();

		AF.OMTSearch_and_ValidateDashboard1();

		// Click on edit
		JavascriptExecutor jsO = (JavascriptExecutor) DriverManager.getDriver();
		jsO.executeScript("arguments[0].click();", OMTHPW.get_EditBtn());

		AF.UpdateOrderStatus(Status);//need to check these one 

		
		// Signout
		AF.Signout();
		/************************* //order tracker for Redelivry**************************************/	
		OrderTracker_GlobeOnline(CaseName, Status);
	}
	
	public void OMTOrderStatus_ReDelivery3(String FlowType, String UserAgent, String Status,String CaseName) throws Exception {

		/******************************************
		 For ReDelivery
		 ***********************************************/
		// Change the status to Ongoing verfication

		K.OMT_Role_Login(FlowType, UserAgent);

		Thread.sleep(3000);

		OMTHPW.javascript_clickOnElement(OMTHPW.get_Entities());
		OMTHPW.javascript_clickOnElement(OMTHPW.get_ApplicationEntry());

		AF.OMTSearch_and_ValidateDashboard1();//need to check 

		// Click on edit
		JavascriptExecutor jsO = (JavascriptExecutor) DriverManager.getDriver();
		jsO.executeScript("arguments[0].click();", OMTHPW.get_EditBtn());

		AF.UpdateOrderStatus(Status); // need to check 

		// Signout
		AF.Signout();
		
		/************************* //order tracker for Redelivry**************************************/	
		OrderTracker_GlobeOnline(CaseName, Status);
	}
	
	
	public void OMTOrderStatus_ReDelivery2(String FlowType, String UserAgent, String Status,String CaseName) throws Exception {

		/******************************************
		 For ReDelivery
		 ***********************************************/
		// Change the status to Ongoing verfication

		K.OMT_Role_Login(FlowType, UserAgent);

		Thread.sleep(3000);

		OMTHPW.javascript_clickOnElement(OMTHPW.get_Entities());
		OMTHPW.javascript_clickOnElement(OMTHPW.get_ApplicationEntry());

		AF.OMTSearch_and_ValidateDashboard1();

		// Click on edit
		JavascriptExecutor jsO = (JavascriptExecutor) DriverManager.getDriver();
		jsO.executeScript("arguments[0].click();", OMTHPW.get_EditBtn());

		AF.UpdateOrderStatus(Status); // need to check

		// Signout
		AF.Signout();
		
		/************************* //order tracker for Redelivry**************************************/	
		OrderTracker_GlobeOnline(CaseName, Status);
	}
	
	public void Halt_Execution(String RoleName) throws Exception {
		String orderState = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.OrderState);
		if (orderState.trim().equals("7")) {
			Thread.sleep(600000);
			K.OMT_Role_Login(Constant.FlowTypeHPW, RoleName);
			Thread.sleep(3000);
			SearchForDispoStatus();
		}
		// Reserved Physical Stock
		else if (orderState.trim().equals("5")) {
			// wait for 10 min for Manual Case creation
			Thread.sleep(300000);
			K.OMT_Role_Login(Constant.FlowTypeHPW, RoleName);
			Thread.sleep(3000);
			SearchForDispoStatus();
		}

		// Approved
		else if (orderState.trim().equals("6")) {
			// RID Refreshes wait for 10 min
			Thread.sleep(600000);
			K.OMT_Role_Login(Constant.FlowTypeHPW, RoleName);
			Thread.sleep(3000);
			SearchForDispoStatus();
		}
		//for processing
		else if (orderState.trim().equals("1")) {
			// RID Refreshes wait for 15 min changes to for reservation in TL and again assign to encoder
			//Thread.sleep(900000);
			AssignOrderOMT(RoleName);
			//K.OMT_Role_Login(Constant.FlowTypeHPW, RoleName);
			Thread.sleep(3000);
			//SearchForDispoStatus();
		} 
		else if (orderState.trim().equals("17")) {
			// changes to FOR DISPATCH wait for some time
			Thread.sleep(20000);
			K.OMT_Role_Login(Constant.FlowTypeHPW, RoleName);
			Thread.sleep(3000);
			SearchForDispoStatus();
		} else {
			// for processing1
			// RID Refreshes wait for 15 min changes to For Reservation again
			Thread.sleep(900000);
			K.OMT_Role_Login(Constant.FlowTypeHPW, RoleName);
			Thread.sleep(3000);
			SearchForDispoStatus();

		}

	}

	public void OMTStatus_ForProcessing1(String FlowType, String UserAgent, String SCName, String PaymentMethod,
			String Status,String CaseName) throws Exception {

		K.OMT_Role_Login(FlowType, UserAgent);

		Thread.sleep(3000);
		// OMTHPW.clickOnElement("Entities", "Entities", "Entities");
		OMTHPW.javascript_clickOnElement(OMTHPW.get_Entities());
		OMTHPW.javascript_clickOnElement(OMTHPW.get_ApplicationEntry());

		AF.OMTSearch_and_ValidateDashboard1();
		

		// Click on edit
		JavascriptExecutor jsr = (JavascriptExecutor) DriverManager.getDriver();
		jsr.executeScript("arguments[0].click();", OMTHPW.get_EditBtn());
		AF.UpdateOrderStatus(Status);
		
		//AF.OMTSearch_and_ValidateDashboard1();
		
		JavascriptExecutor jsL = (JavascriptExecutor) DriverManager.getDriver();
		jsL.executeScript("arguments[0].click();", OMTHPW.get_DownloadBtn());

		if (OMTHPW.get_DownloadBtn().isDisplayed()) {
			Constant.dataMap.set(Map);
			Constant.dataMap.get().put("OMT_LAS", "Downloaded");

			util.writeToExcelExistingRowFromMap("Sheet1", Constant.dataMap.get(),Constant.ScenarioNameHPW,1);

		}

		
		// AF.forproccessing("For Processing");
		// RID Refreshes wait for 15 min changes to For Reservation again
		//Halt_Execution(RoleName);
		/*
		 * Thread.sleep(900000); System.out.println("Disposition Status: " +
		 * OMTHPW.get_Dashboard_Dispo().getText());
		 * Constant.dataMap.get().put("OMT_DispositionStatus",
		 * OMTHPW.get_Dashboard_Dispo().getText());
		 */

		AF.Signout();

	}

	public void OMTOrderStatus_Processed(String FlowType, String UserAgent, String SCName, String Status,String CaseName)
			throws Exception {

		K.OMT_Role_Login(FlowType, UserAgent);
		Thread.sleep(6000);
		// OMTHPW.clickOnElement("Entities", "Entities", "Entities");
		OMTHPW.javascript_clickOnElement(OMTHPW.get_Entities());
		OMTHPW.javascript_clickOnElement(OMTHPW.get_ApplicationEntry());
		Thread.sleep(4000);
		AF.OMTSearch_and_ValidateDashboard1();

		// Click on edit
		JavascriptExecutor jsr = (JavascriptExecutor) DriverManager.getDriver();
		jsr.executeScript("arguments[0].click();", OMTHPW.get_EditBtn());
		// AF.forproccessing("For Processing");

		// *************************************************************************************//*

		// download las
		JavascriptExecutor jsL = (JavascriptExecutor) DriverManager.getDriver();
		jsL.executeScript("arguments[0].click();", OMTHPW.get_DownloadBtn());

		if (OMTHPW.get_DownloadBtn().isDisplayed()) {
			Constant.dataMap.set(Map);
			Constant.dataMap.get().put("OMT_LAS", "Downloaded");

			util.writeToExcelExistingRowFromMap("Sheet1", Constant.dataMap.get(),Constant.ScenarioNameHPW,1);

		}

		JavascriptExecutor jsPP = (JavascriptExecutor) DriverManager.getDriver();
		jsPP.executeScript("arguments[0].click();", OMTHPW.get_EditBtn());
		// AF.processed("Processed");
		AF.UpdateOrderStatus(Status);  // need to check 
		// changes to FOR DISPATCH wait for some time
		/*
		 * Thread.sleep(20000); System.out.println("Disposition Status: " +
		 * OMTHPW.get_Dashboard_Dispo().getText());
		 * Constant.dataMap.get().put("OMT_DispositionStatus",
		 * OMTHPW.get_Dashboard_Dispo().getText());
		 */
		// ********validate order
		// tracker********************************OrderTracker_Fordispatch*******************

		OrderTracker_GlobeOnline(CaseName, "For Dispatch");

		// Signout
		AF.Signout();

	}

	public void OMTOrderStatus_ForDelivery(String FlowType, String UserType, String SCName, String Status,String CaseName)
			throws Exception {

		K.OMT_Role_Login(FlowType, UserType);
		Thread.sleep(6000);
		// OMTHPW.clickOnElement("Entities", "Entities", "Entities");
		OMTHPW.javascript_clickOnElement(OMTHPW.get_Entities());
		OMTHPW.javascript_clickOnElement(OMTHPW.get_ApplicationEntry());
		Thread.sleep(4000);
		AF.OMTSearch_and_ValidateDashboard1();
		Generic.WriteTestData("User should be able to access OMT application", "", "", "User should be able to access OMT application","User is able to access OMT application", "Passed");
		Thread.sleep(4000);
	    Control.takeScreenshot();

		// Click on edit
		JavascriptExecutor jsDE = (JavascriptExecutor) DriverManager.getDriver();
		jsDE.executeScript("arguments[0].click();", OMTHPW.get_EditBtn());
		
		Generic.WriteTestData("User should be able to access OMT application", "", "", "User should be able to access OMT application","User is able to access OMT application", "Passed");
		Thread.sleep(4000);
	    Control.takeScreenshot();

		// For Delivery
		// AF.Fordelivery("For Delivery");
		AF.UpdateOrderStatus(Status);  // need to check
		Thread.sleep(10000);
		/*System.out.println("Disposition Status: " + OMTHPW.get_Dashboard_Dispo().getText());
		Constant.dataMap.set(Map);
		Constant.dataMap.get().put("OMT_DispositionStatus", OMTHPW.get_Dashboard_Dispo().getText());*/

		/*************************
		 * //order tracker for delivry
		 **************************************/
		AF.Signout();
		// open link
		//OrderTracker_GlobeOnline(CaseName, Status);
		// Signout
		

	}
	public void OMTOrderStatus_ForDispach(String FlowType, String UserType, String SCName, String Status,String CaseName)
			throws Exception {

		K.OMT_Role_Login(FlowType, UserType);
		Thread.sleep(6000);
		// OMTHPW.clickOnElement("Entities", "Entities", "Entities");
		OMTHPW.javascript_clickOnElement(OMTHPW.get_Entities());
		OMTHPW.javascript_clickOnElement(OMTHPW.get_ApplicationEntry());
		Thread.sleep(4000);
		AF.OMTSearch_and_ValidateDashboard1();

		// Click on edit
		//NEED TO REMOVE AFTER COMPLE THESE DOWNLOAD
		JavascriptExecutor jsL = (JavascriptExecutor) DriverManager.getDriver();
		jsL.executeScript("arguments[0].click();", OMTHPW.get_DownloadBtn());

		if (OMTHPW.get_DownloadBtn().isDisplayed()) {
			Constant.dataMap.set(Map);
			Constant.dataMap.get().put("OMT_LAS", "Downloaded");

			util.writeToExcelExistingRowFromMap("Sheet1", Constant.dataMap.get(),Constant.ScenarioNameHPW,1);

		}
		JavascriptExecutor jsDE = (JavascriptExecutor) DriverManager.getDriver();
		jsDE.executeScript("arguments[0].click();", OMTHPW.get_EditBtn());

		// For Delivery
		// AF.Fordelivery("For Delivery");
		AF.UpdateOrderStatus(Status);  // need to check
		Thread.sleep(10000);
		/*System.out.println("Disposition Status: " + OMTHPW.get_Dashboard_Dispo().getText());
		Constant.dataMap.set(Map);
		Constant.dataMap.get().put("OMT_DispositionStatus", OMTHPW.get_Dashboard_Dispo().getText());*/

		/*************************
		 * //order tracker for delivry
		 **************************************/
		AF.Signout();
		// open link
		//OrderTracker_GlobeOnline(CaseName, Status);
		// Signout
		

	}


	public void OMTOrderStatus_Delivered(String FlowType, String UserType, String SCName, String Status,String CaseName)
			throws Exception {

		K.OMT_Role_Login(FlowType, UserType);
		Thread.sleep(6000);
		// OMTHPW.clickOnElement("Entities", "Entities", "Entities");
		OMTHPW.javascript_clickOnElement(OMTHPW.get_Entities());
		OMTHPW.javascript_clickOnElement(OMTHPW.get_ApplicationEntry());
		Thread.sleep(4000);
		AF.OMTSearch_and_ValidateDashboard1();

		// Click on edit
		JavascriptExecutor jsDE = (JavascriptExecutor) DriverManager.getDriver();
		jsDE.executeScript("arguments[0].click();", OMTHPW.get_EditBtn());
		AF.UpdateOrderStatus(Status);// need to check
		// AF.Delivered("Delivered"); // some times auto change the status
		Thread.sleep(10000);

		/*System.out.println("Disposition Status: " + OMTHPW.get_Dashboard_Dispo().getText());// reservation
		Constant.dataMap.set(Map);
		Constant.dataMap.get().put("OMT_DispositionStatus", OMTHPW.get_Dashboard_Dispo().getText());*/

		// email,order tracker
		/**********************
		 * order tracking for activation
		 ***************************/

		OrderTracker_GlobeOnline(CaseName, "Delivered");

		// Signout
		AF.Signout();
	}

	public void OMTValidate_PALAgent(String FlowType, String UserType, String SCName) throws Exception {

		K.OMT_Role_Login(FlowType, UserType);
		Thread.sleep(6000);
		// OMTHPW.clickOnElement("Entities", "Entities", "Entities");
		OMTHPW.javascript_clickOnElement(OMTHPW.get_Entities());
		OMTHPW.javascript_clickOnElement(OMTHPW.get_ApplicationEntry());
		Thread.sleep(4000);
		AF.OMTSearch_and_ValidateDashboard1();
		Thread.sleep(10000);
		System.out.println("Disposition Status: " + OMTHPW.get_Dashboard_Dispo().getText());
		Constant.dataMap.set(Map);
		Constant.dataMap.get().put("OMT_DispositionStatus", OMTHPW.get_Dashboard_Dispo().getText());

				AF.Signout();
		}

	public void OMTOrderStatus_Activated(String Flowtype, String UserAgent, String SCName, String Status,String CaseName)
			throws Exception {

		// AF.OMTverifier("omt-activation-agent-acqui-no-tcoe", "admin");
		K.OMT_Role_Login(Flowtype, UserAgent);
		Thread.sleep(4000);
		OMTHPW.javascript_clickOnElement(OMTHPW.get_Entities());
		OMTHPW.javascript_clickOnElement(OMTHPW.get_ApplicationEntry());
		Thread.sleep(4000);

		AF.OMTSearch_and_ValidateDashboard1();

		JavascriptExecutor jstt = (JavascriptExecutor) DriverManager.getDriver();
		jstt.executeScript("arguments[0].click();", OMTHPW.get_EditBtn());
		AF.UpdateOrderStatus(Status);// need to check 
		// AF.Activated("Activated");
		Thread.sleep(6000);
//
		System.out.println("Disposition Status: " + OMTHPW.get_Dashboard_Dispo().getText());// reservation
		Constant.dataMap.set(Map);
		Constant.dataMap.get().put("OMT_DispositionStatus", OMTHPW.get_Dashboard_Dispo().getText());
		
		
		//OrderTracker_GlobeOnline(CaseName, "For Activation");

		// Signout
		AF.Signout();

	}
	public void OMTOrder_Acqui_Activation(String Flowtype, String UserAgent, String SCName, String Status)
			throws Exception {

		// AF.OMTverifier("omt-activation-agent-acqui-no-tcoe", "admin");
		K.OMT_Role_Login(Flowtype, UserAgent);
		Thread.sleep(4000);
		OMTHPW.javascript_clickOnElement(OMTHPW.get_Entities());
		OMTHPW.javascript_clickOnElement(OMTHPW.get_ApplicationEntry());
		Thread.sleep(4000);

		AF.OMTSearch_and_ValidateDashboard1();

		/*
		 * JavascriptExecutor jstt = (JavascriptExecutor)
		 * DriverManager.getDriver();
		 * jstt.executeScript("arguments[0].click();", OMTHPW.get_EditBtn());
		 * 
		 * AF.Activated("Activated"); Thread.sleep(6000);
		 */
		// Thread.sleep(600000);
		// if payment is Straight debit or credit then status autom changes to
		// manual posting
		// login as encoder
		// Click on edit
				JavascriptExecutor jsDE = (JavascriptExecutor) DriverManager.getDriver();
				jsDE.executeScript("arguments[0].click();", OMTHPW.get_EditBtn());

		
		AF.UpdateOrderStatus(Status);// need to check 
		// AF.Activated("Activated");
		Thread.sleep(6000);

		System.out.println("Disposition Status: " + OMTHPW.get_Dashboard_Dispo().getText());// reservation
		Constant.dataMap.set(Map);
		Constant.dataMap.get().put("OMT_DispositionStatus", OMTHPW.get_Dashboard_Dispo().getText());
	}
	public void ValidateOrderStatustl(String Flowtype, String UserAgent, String SCName,String Status, String CaseName)throws Exception {
		K.OMT_Role_Login(Flowtype, UserAgent);
		Thread.sleep(4000);
		OMTHPW.javascript_clickOnElement(OMTHPW.get_Entities());
		OMTHPW.javascript_clickOnElement(OMTHPW.get_ApplicationEntry());
		Thread.sleep(4000);
		Control.takeScreenshot();
		AF.OMTSearch_and_ValidateDashboard1();
		Thread.sleep(6000);
		
		

		System.out.println("Disposition Status: " + OMTHPW.get_Dashboard_Dispo().getText());// reservation
		Constant.dataMap.set(Map);
		Constant.dataMap.get().put("OMT_DispositionStatus", OMTHPW.get_Dashboard_Dispo().getText());
		
		
		OrderTracker_GlobeOnline(CaseName, Status);// need to change every sc 
		// Signout
		AF.Signout();



	}
	public void OMTOrder_Acqui_Activated(String Flowtype, String UserAgent, String SCName, String Status)
			throws Exception {

		// AF.OMTverifier("omt-activation-agent-acqui-no-tcoe", "admin");
		K.OMT_Role_Login(Flowtype, UserAgent);
		Thread.sleep(4000);
		OMTHPW.javascript_clickOnElement(OMTHPW.get_Entities());
		OMTHPW.javascript_clickOnElement(OMTHPW.get_ApplicationEntry());
		Thread.sleep(4000);

		AF.OMTSearch_and_ValidateDashboard1();

		// Click on edit
				JavascriptExecutor jsDE = (JavascriptExecutor) DriverManager.getDriver();
				jsDE.executeScript("arguments[0].click();", OMTHPW.get_EditBtn());

		AF.UpdateOrderStatus(Status);// need to check 
		// AF.Activated("Activated");
		Thread.sleep(6000);

		System.out.println("Disposition Status: " + OMTHPW.get_Dashboard_Dispo().getText());// reservation
		Constant.dataMap.set(Map);
		Constant.dataMap.get().put("OMT_DispositionStatus", OMTHPW.get_Dashboard_Dispo().getText());
	}
	public void OMTOrder_Acqui_ForActivated(String Flowtype, String UserAgent, String SCName, String Status,String CaseName)
			throws Exception {

		// AF.OMTverifier("omt-activation-agent-acqui-no-tcoe", "admin");
		K.OMT_Role_Login(Flowtype, UserAgent);
		Thread.sleep(4000);
		OMTHPW.javascript_clickOnElement(OMTHPW.get_Entities());
		OMTHPW.javascript_clickOnElement(OMTHPW.get_ApplicationEntry());
		Thread.sleep(4000);

		AF.OMTSearch_and_ValidateDashboard1();

		// Click on edit
				JavascriptExecutor jsDE = (JavascriptExecutor) DriverManager.getDriver();
				jsDE.executeScript("arguments[0].click();", OMTHPW.get_EditBtn());

		AF.UpdateOrderStatus(Status);// need to check 
		// AF.Activated("Activated");
		Thread.sleep(6000);

		
		System.out.println("Disposition Status: " + OMTHPW.get_Dashboard_Dispo().getText());// reservation
		Constant.dataMap.set(Map);
		Constant.dataMap.get().put("OMT_DispositionStatus", OMTHPW.get_Dashboard_Dispo().getText());
		}

	public void OMTOrder_Acqui_ForPickup(String Flowtype, String UserAgent, String SCName, String Status,String CaseName)
			throws Exception {

		// AF.OMTverifier("omt-activation-agent-acqui-no-tcoe", "admin");
		K.OMT_Role_Login(Flowtype, UserAgent);
		Thread.sleep(4000);
		OMTHPW.javascript_clickOnElement(OMTHPW.get_Entities());
		OMTHPW.javascript_clickOnElement(OMTHPW.get_ApplicationEntry());
		Thread.sleep(4000);

		AF.OMTSearch_and_ValidateDashboard1();

		// Click on edit
				JavascriptExecutor jsDE = (JavascriptExecutor) DriverManager.getDriver();
				jsDE.executeScript("arguments[0].click();", OMTHPW.get_EditBtn());

		AF.UpdateOrderStatus(Status);// need to check 
		// AF.Activated("Activated");
		Thread.sleep(6000);
//		JavascriptExecutor js2 = (JavascriptExecutor) DriverManager.getDriver();
//		js2.executeScript("arguments[0].click();", OMTHPW.get_Savebutton());
//
//		//BP.scroll_vertical(690);
//		JavascriptExecutor js6 = (JavascriptExecutor) DriverManager.getDriver();
//		js6.executeScript("arguments[0].click();", OMTHPW.get_Confirmcorrect());


//		System.out.println("Disposition Status: " + OMTHPW.get_Dashboard_Dispo().getText());// reservation
//		Constant.dataMap.set(Map);
//		Constant.dataMap.get().put("OMT_DispositionStatus", OMTHPW.get_Dashboard_Dispo().getText());
		}
		



	public void TrackOrder_GlobeOnline(String SCName) throws Exception {
		// ORDER TRACKER NOT WRITTN //open link
		DriverManager.getDriver().get(Globeurl);
		Thread.sleep(1000); // Accpet
		// cookies
		AF.IacceptClick();
		Thread.sleep(5000);
		// Login Trackmyorder
		// ORDERID
		String ORDERID = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.OrderRefID);
		AF.OMT_Trackmyorderlogin(ORDERID, Constant.Email_GO);
		//AF.ordertracker_Awaitingpayment(SCName);

		// open link
		DriverManager.getDriver().get(OMTurl);
		Thread.sleep(1000);

		/*
		 * //Signout AF.Signout();
		 * 
		 * AF.OMTLoginmonitor("omt-monitoring-agent-acqui-no-tcoe","admin");
		 * Thread.sleep(1000);
		 * AF.OMTSearch_and_ValidateDashboard("PRE-000005116");
		 */
	}

	public void OrderTracker_GlobeOnline(String CaseName, String DispositionStatus) throws Exception {
		// ORDER TRACKER NOT WRITTN //open link
		DriverManager.getDriver().get(Globeurl);
		Thread.sleep(1000); // Accpet
		// cookies
		AF.IacceptClick();
		Thread.sleep(5000);
		// Login Trackmyorder
		String ORDERID = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.OrderRefID);

		AF.OMT_Trackmyorderlogin(ORDERID, Constant.Email_GO);

		switch (DispositionStatus) {

		
		case "For Dispatch":
			AF.ordertracker_ForDispatch();
			break;
		case "Delivered":
			AF.ordertracker_Delivered();
			break;
		case "For Delivery":

			AF.ordertracker_ForDelivery();
			break;
		case "For Redelivery1":

			AF.ordertracker_ForReDelivery();
			break;
		case "For Redelivery2":

			AF.ordertracker_ForReDelivery();
			break;
		case "For Redelivery3":

			AF.ordertracker_Cancelled("cancelled");
			break;


		case "For Activation":

			AF.ordertracker_ForaActivation();
			break;
		case "Cancelled":

			AF.ordertracker_Cancelled("cancelled");
			
			break;

		}
		//driver.quit(); only for cancelled
		// open link
		DriverManager.getDriver().get(OMTurl);
		Thread.sleep(1000);

	}

	public void AssignOrderOMT(String RoleName) throws Exception {
		DriverManager.getDriver().quit();
		LaunchBrowser_OMT();
		Thread.sleep(2000);
		// String User1 = util.ReadFromRowExcel(SCname,
		// "FlowDetailsHPW",Constant.User1);
		// String RoleName = util.ReadFromRowExcel(SCname,
		// "FlowDetailsHPW",Constant.User1);
		K.OMT_Role_Login(Constant.FlowType, Constant.AssignOrderTLHPW);

		Thread.sleep(3000);

		// OMTHPW.clickOnElement("Entities", "Entities", "Entities");
		OMTHPW.javascript_clickOnElement(OMTHPW.get_Entities());
		OMTHPW.javascript_clickOnElement(OMTHPW.get_ApplicationEntry());
		Generic.WriteTestData("User should be able to access OMT application", "", "", "User should be able to access OMT application","User is able to access OMT application", "Passed");
		Thread.sleep(4000);
		Control.takeScreenshot();

		AF.OMTSearch_and_ValidateDashboard1();

		System.out.println("Disposition Status: " + OMTHPW.get_Dashboard_Dispo().getText());
		Constant.dataMap.set(Map);
		Constant.dataMap.get().put("OMT_DispositionStatus", OMTHPW.get_Dashboard_Dispo().getText());
		util.writeToExcelExistingRowFromMap("Sheet1", Constant.dataMap.get(),Constant.ScenarioNameHPW,1);
		Thread.sleep(4000);
		// Assign order to respective Agent
		// Click on Checkbox
		JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
		js1.executeScript("arguments[0].click();", OMTHPW.get_OrderCheckBox());
		JavascriptExecutor jsp = (JavascriptExecutor) DriverManager.getDriver();
		jsp.executeScript("arguments[0].click();", OMTHPW.get_RemoveAssigneRdbtn());
		JavascriptExecutor jsR = (JavascriptExecutor) DriverManager.getDriver();
		jsR.executeScript("arguments[0].click();", OMTHPW.get_RemoveButton());
		JavascriptExecutor jsA = (JavascriptExecutor) DriverManager.getDriver();
		jsA.executeScript("arguments[0].click();", OMTHPW.get_AssigneRdBtn());

		if ((OMTHPW.get_Assign_btn().isEnabled())) {
			/*
			 * JavascriptExecutor jsA = (JavascriptExecutor)
			 * DriverManager.getDriver();
			 * jsA.executeScript("arguments[0].click();",
			 * OMTHPW.get_AssigneRdBtn());
			 */
			String AgentName = util.ReadFromExcel(RoleName, "LoginDetails", Constant.AgentName);

			WebElement SelectAdmin = DriverManager.getDriver().findElement(OMTHPW.Select_Admin);
			SelectAdmin.sendKeys(AgentName);
			DriverManager.getDriver().findElement(OMTHPW.Assign_Result).click();
			// SelectAdmin.sendKeys(Keys.ENTER);
			JavascriptExecutor js2 = (JavascriptExecutor) DriverManager.getDriver();
			js2.executeScript("arguments[0].click();", OMTHPW.get_Assign_btn());
		} else if (OMTHPW.get_RemoveAssignee().isEnabled()) {
			JavascriptExecutor js3 = (JavascriptExecutor) DriverManager.getDriver();
			js3.executeScript("arguments[0].click();", OMTHPW.get_RemoveAssignee());
			Thread.sleep(3000);
			JavascriptExecutor js4 = (JavascriptExecutor) DriverManager.getDriver();
			js4.executeScript("arguments[0].click();", OMTHPW.get_OrderCheckBox());

			JavascriptExecutor js5 = (JavascriptExecutor) DriverManager.getDriver();
			js5.executeScript("arguments[0].click();", OMTHPW.get_AssigneRdBtn());

			String AgentName = util.ReadFromExcel(RoleName, "LoginDetails", Constant.AgentName);
			WebElement SelectAdmin = DriverManager.getDriver().findElement(OMTHPW.Select_Admin);
			SelectAdmin.sendKeys(AgentName);
			DriverManager.getDriver().findElement(OMTHPW.Assign_Result).click();

			// SelectAdmin.sendKeys(Keys.ENTER);
			JavascriptExecutor js2 = (JavascriptExecutor) DriverManager.getDriver();
			js2.executeScript("arguments[0].click();", OMTHPW.get_Assign_btn());
		}

		AF.Signout();
		DriverManager.getDriver().quit();

	}

	public void LaunchBrowser_OMT() {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		DesiredCapabilities desiredCapabilities = DesiredCapabilities.chrome();
		// options.addArguments("user-data-dir=< path of the folder >");
		options.addArguments("user-data-dir=C:\\ChromeData");
		desiredCapabilities.setCapability(ChromeOptions.CAPABILITY, options);

		driver = new ChromeDriver(options);
		DriverManager.setWebDriver(driver);

		DriverManager.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		DriverManager.getDriver().manage().window().maximize();
		// DriverManager.getDriver().manage().deleteAllCookies();

		DriverManager.getDriver()
				.get("https://edo-data-engineering.globe.com.ph/omt/");
	}

	public void SearchForDispoStatus() throws Exception {
		Thread.sleep(1000);
		OMTHPW.javascript_clickOnElement(OMTHPW.get_Entities());
		OMTHPW.javascript_clickOnElement(OMTHPW.get_ApplicationEntry());

		AF.OMTSearch_and_ValidateDashboard1();
if(OMTHPW.isElementExist("Disposition status", "Dashboard_Dispo", 20))
{
		System.out.println("Disposition Status: " + OMTHPW.get_Dashboard_Dispo().getText());
		Constant.dataMap.set(Map);
		Constant.dataMap.get().put("OMT_DispositionStatus", OMTHPW.get_Dashboard_Dispo().getText());

		util.writeToExcelExistingRowFromMap("Sheet1", Constant.dataMap.get(),Constant.ScenarioNameHPW,1);
}
		AF.Signout();
	}
}
