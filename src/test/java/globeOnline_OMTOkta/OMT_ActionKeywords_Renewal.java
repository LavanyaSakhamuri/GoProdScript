package globeOnline_OMTOkta;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.pages.omt.ACQUI_omt_page;

import globeOnline_CommonMethods.DriverManager;
import globeOnline_CommonMethods.SetDriver;
import globeOnline_CommonMethods.util;
import utility.Constant;
import utility.Control;

public class OMT_ActionKeywords_Renewal extends SetDriver {

	
	
	
	public static util util = new util();
	private static OMT_Login K = new OMT_Login();
	private static OMT_ActionKeywords_Acqui SC = new OMT_ActionKeywords_Acqui();
	public static OMT_DriverScript_Renewal DS = new OMT_DriverScript_Renewal();

	private static OMT_Renewal_Functions RF = new OMT_Renewal_Functions();
	private static ACQUI_omt_page OMTAcqui = new ACQUI_omt_page();
	private static String Status = "failed";
	private static LinkedHashMap<String, String> Map = new LinkedHashMap<>();
	private static LinkedHashMap<String, Integer> Map1 = new LinkedHashMap<>();

	public static String Rowvalue = Constant.RowValue;

	private static String Globeurl = "https://new.globe.com.ph/";
	private static String OMTurl = "https://edo-dev-data-engineering.globe.com.ph/omt-uat/bbsp-admin/";

	// public String ScenarioName= SC.getClass().getSimpleName();
	// public String OrderReferenceId = "PRE-000005167"; // from excel
	/*private String ScenarioName = "OMT_Acqui_FTA1_4NEW"; // row number from
	public static String RoleName = DS.AssignToAgent;*/

	public void ValidateOMTOrderDetails(String UserAgent) throws Exception {
		// String SCname=util.ReadFromRowExcel(Constant.RowValue, "Sheet1",
		// 29);
		String TestCaseName = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.ScenarioColumn);// ScenarioName

		DriverManager.getDriver()
				.get("https://edo-data-engineering.globe.com.ph/omt/");
		// String SCname = util.ReadFromRowExcel(Constant.RowValue,
		// "Sheet1", Constant.FlowIdColumnValue);// flowid
	//	String User1 = util.ReadFromRowExcel(Constant.RowValue_FlowDetails, "FlowDetails_Renewal", Constant.User1);

		K.OMT_Role_Login(Constant.FlowType, UserAgent);

		// SC.getClass().getSimpleName()o
		Constant.dataMap.set(Map);
		//Constant.dataMap.get().put("TestClassName", Constant.ScenarioName);
		Constant.dataMap.get().put("OMT_LAS", "NOT FOUND");
		Constant.dataMap.get().put("OMT_DispositionStatus", "NOT FOUND");
		Constant.dataMap.get().put("OMT_UpdateDate", "NOT FOUND");
		Constant.dataMap.get().put("OMT_DateOrdered", "NOT FOUND");
		Constant.dataMap.get().put("OMT_EstimatedDayOfDelivery", "NOT FOUND");
		Constant.dataMap.get().put("OMT_OrderDetails", "NOT FOUND");

		//Constant.dataMap.get().put("OMT_OrderState", "NOT FOUND");
		//Constant.dataMap.get().put("OMT_FlowID", Constant.OMT_FlowID);
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
	public void VerifyOMTOrder_PreOrderwithStock(String UserAgent) throws Exception
	{
		DriverManager.getDriver().quit();
		LaunchBrowser_OMT();
		String SCname = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.FlowIdColumnValue);// flow
																												// id

		//String User4 = util.ReadFromRowExcel(SCname, "FlowDetails_Renewal", Constant.User4);
		OMTOrderStatus_PreOrderwithStock(Constant.FlowType, UserAgent, Constant.PreOrderWithStock);

	}
	
	public void VerifyOrder_OnGoingStatus(String UserAgent) throws Exception {
		// read from excel and make assign order as separate keyword
		// AssignOrderOMT(DS.sActionKeywordAgent);
		DriverManager.getDriver().quit();
		LaunchBrowser_OMT();
		String SCname = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.FlowIdColumnValue);// flow
																												// id

		//String User3 = util.ReadFromRowExcel(SCname, "FlowDetails_Renewal", Constant.User3);
		OMTOrderStatus_OngoingVerification(Constant.FlowType, UserAgent, Constant.OngoingVerification);

	}
	

	
	
	public void VerifyOrder_ForOrderCreation(String UserAgent) throws Exception {
		// read from excel and make assign order as separate keyword
		// AssignOrderOMT(DS.sActionKeywordAgent);
	DriverManager.getDriver().quit(); //sc1 no need
		LaunchBrowser_OMT();
		String SCname = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.FlowIdColumnValue);// flow
																												// id
		String CaseName = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.ScenarioColumn);

		//String User9 = util.ReadFromRowExcel(SCname, "FlowDetails_Renewal", Constant.User9);
		OMTOrderStatus_ForOrderCreation(Constant.FlowType, UserAgent, Constant.ForOrderCreation,CaseName);

	}
	
	
	public void VerifyOrder_OrderCreated(String UserAgent) throws Exception {
		// read from excel and make assign order as separate keyword
		// AssignOrderOMT(DS.sActionKeywordAgent);
		DriverManager.getDriver().quit();
		LaunchBrowser_OMT();																												// id
		String CaseName = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.ScenarioColumn);
		OMTOrderStatus_OrderCreated(Constant.FlowType, UserAgent, Constant.OrderCreated,CaseName);

	}
	
	

	public void VerifyOrder_Approved(String UserAgent) throws Exception {
		// AssignOrderOMT(DS.sActionKeywordAgent);
		DriverManager.getDriver().quit();
		LaunchBrowser_OMT();
		String SCname = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.FlowIdColumnValue);// flow
																												// id

	//	String User5 = util.ReadFromRowExcel(SCname, "FlowDetails_Renewal", Constant.User5);
		OMTOrderStatus_Approved(Constant.FlowType, UserAgent, Constant.Approved);

	}

	public void VerifyOrder_Delivered(String UserAgent) throws Exception {
		// AssignOrderOMT(DS.sActionKeywordAgent);
		DriverManager.getDriver().quit();
		LaunchBrowser_OMT();
		OMTOrderStatus_Delivered(Constant.FlowType, UserAgent, Constant.Delivered);

	}

	public void VerifyOMTOrder_ReservedPhysicalStock(String UserAgent) throws Exception {
		// System.out.println(DS.sActionKeywordAgent);
		// AssignOrderOMT(DS.sActionKeywordAgent);
		DriverManager.getDriver().quit();
		LaunchBrowser_OMT();
		OMTOrderStatus_ReservedPhysicalStock(Constant.FlowType, UserAgent, Constant.ReservedPhysicalStock);

	}

	public void VerifyOMTOrder_RequestPayment(String UserAgent) throws Exception {
		// AssignOrderOMT(DS.sActionKeywordAgent);
		DriverManager.getDriver().quit();
		LaunchBrowser_OMT();
		String SCname = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.FlowIdColumnValue);// flow
																												// id

		//String User11 = util.ReadFromRowExcel(SCname, "FlowDetails_Renewal", Constant.User11);
		OMTOrderStatus_RequestPayment(Constant.FlowType, UserAgent, Constant.RequestPayment);

	}

	public void VerifyOMTOrder_AwaitingPayment(String UserAgent) throws Exception {
		// AssignOrderOMT(DS.sActionKeywordAgent);
		DriverManager.getDriver().quit();
		LaunchBrowser_OMT();

		// String SCName = util.ReadFromRowExcel(Constant.RowValue,
		// "Sheet1", Constant.ScenarioColumn);
		String SCName = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.FlowIdColumnValue);
		String CaseName = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.ScenarioColumn);

	//	String User7 = util.ReadFromRowExcel(SCName, "FlowDetails_Renewal", Constant.User7);
		String PaymentMethod = util.ReadFromExcel(CaseName, "Sheet1", Constant.PaymentMenthod);
		if (!(PaymentMethod.equalsIgnoreCase("COD"))) {
			OMTStatus_AwaitingPayment(Constant.FlowType, UserAgent, SCName, Constant.AwaitingPayment, CaseName);
		} /*
			 * else { OMTStatus_ForProcessing1(Constant.FlowType, User4,
			 * SCName,PaymentMethod);
			 * 
			 * }
			 */
	}

	public void VerifyOMTOrder_ForProcessing(String UserAgent) throws Exception {
		// AssignOrderOMT(DS.sActionKeywordAgent);
		DriverManager.getDriver().quit();
		LaunchBrowser_OMT();
		String SCName = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.FlowIdColumnValue);

		String CaseName = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.ScenarioColumn);

		//String User15 = util.ReadFromRowExcel(SCName, "FlowDetails_Renewal", Constant.User15);
		String PaymentMethod = util.ReadFromExcel(CaseName, "Sheet1", Constant.PaymentMenthod);

		OMTStatus_ForProcessing1(Constant.FlowType, UserAgent, SCName, PaymentMethod, Constant.ForProcessing,CaseName);
		// Rid refreshes 15 min

		/*Thread.sleep(60000);
		VerifyOMTOrder_ForProcessingRefresh();*/

	}

	public void VerifyOMTOrder_ForProcessingRefresh(String UserAgent) throws Exception {
		// AssignOrderOMT(DS.sActionKeywordAgent);
		DriverManager.getDriver().quit();
		LaunchBrowser_OMT();
		String SCName = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.FlowIdColumnValue);

		String CaseName = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.ScenarioColumn);

		//String User17 = util.ReadFromRowExcel(SCName, "FlowDetails_Renewal", Constant.User17);
		String PaymentMethod = util.ReadFromExcel(CaseName, "Sheet1", Constant.PaymentMenthod);

		OMTStatus_ForProcessing1(Constant.FlowType, UserAgent, SCName, PaymentMethod, Constant.Processed,CaseName);

	}

	public void VerifyOMTOrder_Processed(String UserAgent) throws Exception {
		// AssignOrderOMT(DS.sActionKeywordAgent);
		DriverManager.getDriver().quit();
		LaunchBrowser_OMT();
		String SCName = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.FlowIdColumnValue);

		String CaseName = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.ScenarioColumn);

		//String User14 = util.ReadFromRowExcel(SCName, "FlowDetails_Renewal", Constant.User14);
		OMTOrderStatus_Processed(Constant.FlowType, UserAgent, SCName, Constant.Processed,CaseName);
	}

	
	public void VerifyOMTOrder_Completed(String UserAgent) throws Exception {

		// AssignOrderOMT(DS.sActionKeywordAgent);
		DriverManager.getDriver().quit();
		LaunchBrowser_OMT();
		String SCName = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.FlowIdColumnValue);

		String CaseName = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.ScenarioColumn);

		//String User18 = util.ReadFromRowExcel(SCName, "FlowDetails_Renewal", Constant.User18);

		OMTOrderStatus_Completed(Constant.FlowType, UserAgent, SCName, Constant.Renewal_Completed,CaseName);
	}

	// !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!//

	public void OMT_ValidateOrderDetails(String ScName) throws Exception {
		Thread.sleep(3000);

		// OMTAcqui.clickOnElement("Entities", "Entities", "Entities");
		OMTAcqui.javascript_clickOnElement(OMTAcqui.get_Entities());
		OMTAcqui.javascript_clickOnElement(OMTAcqui.get_AppEntry());

		RF.OMTSearch_and_ValidateDashboard1();

		WebElement a = DriverManager.getDriver().findElement(OMTAcqui.DispositionStatus);
		String status = a.getText();

		Constant.dataMap.get().put("OMT_DateOrdered", OMTAcqui.get_Dashboard_DateSubmitted().getText());
		Constant.dataMap.get().put("OMT_OrderID", OMTAcqui.get_Dashboard_RefNum().getText());

		Constant.dataMap.get().put("OMT_DispositionStatus", status);
		WebElement b = DriverManager.getDriver().findElement(OMTAcqui.TimeStamp);
		String Timestamp = b.getText();
		String Timestamp_OMT1 = Timestamp.replaceAll("-", "_");
		String Timestamp_OMT2 = Timestamp_OMT1.replaceAll(" ", "_");		String Timestamp_OMT = Timestamp_OMT2.replaceAll(":", "_");

		Constant.dataMap.get().put("OMT_TimeStamp", Timestamp_OMT);
		util.writeToExcelExistingRowFromMap("Sheet1", Constant.dataMap.get(),Constant.ScenarioName,1);

		ArrayList Time_Go = util.readExcelData(Constant.TimeStamp, ScName, "Sheet1");
		if (Time_Go.contains(Timestamp_OMT)) {
			System.out.println("Globe Online and OMT timestamp of order placed are matched");
		} else {
			System.out.println("Globe Online and OMT timestamp of order placed didnt matched");

		}
		// Click on View
		JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
		js1.executeScript("arguments[0].click();", OMTAcqui.get_ViewBtn());

		String ORDERID = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.OrderRefID);

		RF.Validate_ORDER(ORDERID, Constant.OrderSubType, Constant.FlowType, Constant.OMT_DispoFirstTime);

		ArrayList CustDet_GO = util.readExcelData(Constant.CustomerDetails, ScName, "Sheet1");
		String Customer_Details_OMT = RF.Validate_PRIMARYCUSTOMERDETAILS();
		String B = CustDet_GO.toString();
		String C = B.replace("[", " ");
		String D = C.replace("]", " ");
		if (D.trim().contains(Customer_Details_OMT)) {
			System.out.println("Globe Online  and OMT Customer Details of order placed are matched");
		} else {
			System.out.println("Globe Online and OMT Customer Details of order placed didnt matched");

		}

		Constant.dataMap.get().put("OMT_CustomerDetails", Customer_Details_OMT);

		Constant.dataMap.get().put("OMT_MobileNumber", OMTAcqui.get_Primary_MobNum().getAttribute("value"));

		Constant.dataMap.get().put("OMT_RecipientDetails",
				OMTAcqui.get_Primary_RecipientName().getAttribute("value"));

		String AddressDetails = RF.Validate_RegisteredAddressRenewal(Constant.OMT_RegAddressType);
		Constant.dataMap.get().put("OMT_AddressDetails", AddressDetails);
		RF.Validate_ShippingAddress(Constant.OMT_RegAddressType);
		
		RF.Validate_PrimaryAccountDetails();
		RF.Validate_OrderDetails();
		Constant.dataMap.get().put("OMT_OrderDetails", OMTAcqui.get_NewPlan().getAttribute("value"));

		RF.Validate_DocumentSubmission();
		RF.Validate_PaymentDetails();

		Constant.dataMap.get().put("OMT_PaymentDetails", OMTAcqui.get_ReqPay_PaymentMethod().getAttribute("value"));

		RF.Validate_FullfillmentDetails();
		//RF.Validate_activationdetails();
		RF.Validate_planeprovisioningdetails();
		RF.Validate_SEEDINGDETAILS();
		RF.Validate_CALLOUTANDRECOVERY();
		RF.Validate_REFUNDDETAILS();
		RF.Validate_ORDERHISTORY();

		/*
		 * Constant.dataMap.get().put("OMT_UpdateDate",
		 * OMTAcqui.get_AutomaticUpdateDate().getText());
		 * util.writeToExcelExistingRowFromMap("Sheet1",
		 * Constant.dataMap.get());
		 */
		// Click on Back
		JavascriptExecutor js2 = (JavascriptExecutor) DriverManager.getDriver();
		js2.executeScript("arguments[0].click();", OMTAcqui.get_Backbutton());
		Thread.sleep(3000);

		System.out.println("Disposition Status: " + OMTAcqui.get_Dashboard_Dispo().getText());
		// Constant.dataMap.get().put("TimeStamp", util.getTimeStamp());
		// Signout
		RF.Signout();

	}
	
	
	public void OMTOrderStatus_PreOrderwithStock(String FlowType, String UserAgent, String Status) throws Exception {

		
		// Change the status to Ongoing verfication

		K.OMT_Role_Login(FlowType, UserAgent);

		Thread.sleep(3000);

		OMTAcqui.javascript_clickOnElement(OMTAcqui.get_Entities());
		OMTAcqui.javascript_clickOnElement(OMTAcqui.get_AppEntry());

		RF.OMTSearch_and_ValidateDashboard1();

		// Click on edit
		JavascriptExecutor jsO = (JavascriptExecutor) DriverManager.getDriver();
		jsO.executeScript("arguments[0].click();", OMTAcqui.get_EditBtn());

		RF.UpdateOrderStatus(Status);

		// RF.ongoingVerification("Ongoing Verification");
		/*System.out.println("Disposition Status: " + OMTAcqui.get_Dashboard_Dispo().getText());
		Constant.dataMap.set(Map);
		Constant.dataMap.get().put("OMT_DispositionStatus", "NotFound");
		Constant.dataMap.get().put("OMT_DispositionStatus", OMTAcqui.get_Dashboard_Dispo().getText());
		// util.writeToExcelExistingRowFromMap("Sheet1", Constant.dataMap.get(),
		// ScenarioName, 0);
		util.writeToExcelExistingRowFromMap("Sheet1", Constant.dataMap.get(),Constant.ScenarioName,1);
	*/
		// Signout
		RF.Signout();
	}
	
	
	public void OMTOrderStatus_OngoingVerification(String FlowType, String UserAgent, String Status) throws Exception {

		/******************************************
		 * ongoing verification
		 ***********************************************/
		// Change the status to Ongoing verfication

		K.OMT_Role_Login(FlowType, UserAgent);

		Thread.sleep(3000);

		OMTAcqui.javascript_clickOnElement(OMTAcqui.get_Entities());
		OMTAcqui.javascript_clickOnElement(OMTAcqui.get_AppEntry());

		RF.OMTSearch_and_ValidateDashboard1();

		// Click on edit
		JavascriptExecutor jsO = (JavascriptExecutor) DriverManager.getDriver();
		jsO.executeScript("arguments[0].click();", OMTAcqui.get_EditBtn());

		RF.UpdateOrderStatus(Status);

		// RF.ongoingVerification("Ongoing Verification");
		System.out.println("Disposition Status: " + OMTAcqui.get_Dashboard_Dispo().getText());
		Constant.dataMap.set(Map);
		Constant.dataMap.get().put("OMT_DispositionStatus", "NotFound");
		Constant.dataMap.get().put("OMT_DispositionStatus", OMTAcqui.get_Dashboard_Dispo().getText());
		// util.writeToExcelExistingRowFromMap("Sheet1", Constant.dataMap.get(),
		// ScenarioName, 0);
		util.writeToExcelExistingRowFromMap("Sheet1", Constant.dataMap.get(),Constant.ScenarioName,1);
		/*
		 * // Click on edit JavascriptExecutor js7 = (JavascriptExecutor)
		 * DriverManager.getDriver(); js7.executeScript("arguments[0].click();",
		 * OMTAcqui.get_EditBtn());
		 */

		/*
		 * // Change the status to Approved
		 * o
		 * RF.Approved("Approved");
		 * 
		 * // WATING for 10 min to change the dispo stastus to for reservastion
		 * Thread.sleep(600000); String ORDERID =
		 * util.ReadFromRowExcel(Constant.RowValue, "Sheet1",
		 * Constant.OrderRefID);
		 * 
		 * OMTAcqui.get_SearchField().sendKeys(ORDERID);
		 * System.out.println("Disposition Status: " +
		 * OMTAcqui.get_Dashboard_Dispo().getText());
		 * Constant.dataMap.get().put("OMT_DispositionStatus",
		 * OMTAcqui.get_Dashboard_Dispo().getText());
		 */
		// Signout
		RF.Signout();
	}
	
	public void VerifyOMTOrder_ForOrderCreation(String UserAgent) throws Exception {
		DriverManager.getDriver().quit();
		LaunchBrowser_OMT();
		String SCname = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.FlowIdColumnValue);
		K.OMT_Role_Login(Constant.FlowType, UserAgent);
		RF.OrderStatusVerifyInDashboard(Constant.ForOrderCreation);
	}
	public void VerifyOMTOrderStatus_ForProcessing(String UserAgent) throws Exception {
		DriverManager.getDriver().quit();
		LaunchBrowser_OMT();
		String SCname = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.FlowIdColumnValue);
		K.OMT_Role_Login(Constant.FlowType, UserAgent);
		RF.OrderStatusVerifyInDashboard(Constant.ForProcessing);
	}
	
	public void VerifyOMTOrderStatus_RenewalCompleted(String UserAgent) throws Exception {
		DriverManager.getDriver().quit();
		LaunchBrowser_OMT();
		String SCname = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.FlowIdColumnValue);
		K.OMT_Role_Login(Constant.FlowType, UserAgent);
		RF.OrderStatusVerifyInDashboard( Constant.Renewal_Completed);
	}

	
	
	public void OMTOrderStatus_ForOrderCreation(String FlowType, String UserAgent, String Status,String CaseName) throws Exception {

		/******************************************
		 For order creation
		 ***********************************************/
		// Change the status to order creation 

		K.OMT_Role_Login(FlowType, UserAgent);

		Thread.sleep(3000);

		OMTAcqui.javascript_clickOnElement(OMTAcqui.get_Entities());
		OMTAcqui.javascript_clickOnElement(OMTAcqui.get_AppEntry());

		RF.OMTSearch_and_ValidateDashboard1();

		// Click on edit
		JavascriptExecutor jsO = (JavascriptExecutor) DriverManager.getDriver();
		jsO.executeScript("arguments[0].click();", OMTAcqui.get_EditBtn());

		RF.UpdateOrderStatus(Status);

		// Signout
		RF.Signout();
		
	
	}
	
	
	public void OMTOrderStatus_OrderCreated(String FlowType, String UserAgent, String Status,String CaseName) throws Exception {

		/******************************************
		 For order created
		 ***********************************************/
		// Change the status to Order created

		K.OMT_Role_Login(FlowType, UserAgent);

		Thread.sleep(3000);

		OMTAcqui.javascript_clickOnElement(OMTAcqui.get_Entities());
		OMTAcqui.javascript_clickOnElement(OMTAcqui.get_AppEntry());

		RF.OMTSearch_and_ValidateDashboard1();

		// Click on edit
		JavascriptExecutor jsO = (JavascriptExecutor) DriverManager.getDriver();
		jsO.executeScript("arguments[0].click();", OMTAcqui.get_EditBtn());

		RF.UpdateOrderStatus(Status);

		// Signout
		RF.Signout();
		
		
	}
	public void VerifyOMTOrder_ForDelivery(String UserAgent) throws Exception {

		// AssignOrderOMT(DS.sActionKeywordAgent);
		DriverManager.getDriver().quit();
		LaunchBrowser_OMT();
		String SCName = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.FlowIdColumnValue);

		String CaseName = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.ScenarioColumn);


		OMTOrderStatus_ForDelivery(Constant.FlowType, UserAgent, SCName, Constant.ForDelivery, CaseName);
	}

	public void VerifyOrder_ForReDelivery1(String UserAgent) throws Exception {
		// read from excel and make assign order as separate keyword
		// AssignOrderOMT(DS.sActionKeywordAgent);
		DriverManager.getDriver().quit();
		LaunchBrowser_OMT();
		String SCname = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.FlowIdColumnValue);// flow
																												// id
		String CaseName = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.ScenarioColumn);

	//	String User18 = util.ReadFromRowExcel(SCname, "FlowDetails_Renewal", Constant.User18);
		OMTOrderStatus_ReDelivery1(Constant.FlowType, UserAgent, Constant.ForRedelivery1, CaseName);

	}

	public void VerifyOrder_ForReDelivery2(String UserAgent) throws Exception {
		// read from excel and make assign order as separate keyword
		// AssignOrderOMT(DS.sActionKeywordAgent);
		DriverManager.getDriver().quit();
		LaunchBrowser_OMT();
		String SCname = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.FlowIdColumnValue);// flow
																												// id
		String CaseName = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.ScenarioColumn);

		//String User22 = util.ReadFromRowExcel(SCname, "FlowDetails_Renewal", Constant.User22);
		OMTOrderStatus_ReDelivery2(Constant.FlowType, UserAgent, Constant.ForRedelivery2, CaseName);

	}

	public void VerifyOrder_ForReDelivery3(String UserAgent) throws Exception {
		// read from excel and make assign order as separate keyword
		// AssignOrderOMT(DS.sActionKeywordAgent);
		DriverManager.getDriver().quit();
		LaunchBrowser_OMT();
		String SCname = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.FlowIdColumnValue);// flow
																												// id
		String CaseName = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.ScenarioColumn);

		//String User26 = util.ReadFromRowExcel(SCname, "FlowDetails_Renewal", Constant.User26);
		OMTOrderStatus_ReDelivery3(Constant.FlowType, UserAgent, Constant.ForRedelivery3, CaseName);
		Constant.dataMap.set(Map);
		Constant.dataMap.get().put("OMT_DispositionStatus", "Cancelled");
	}
	
	public void OMTOrderStatus_Delivered(String FlowType, String UserAgent, String Status) throws Exception {

		K.OMT_Role_Login(FlowType, UserAgent);
		// RF.OMTverifier("omt-cbs-verifier-acqui-no-tcoe", "admin");
		Thread.sleep(3000);
		// OMTAcqui.clickOnElement("Entities", "Entities", "Entities");
		OMTAcqui.javascript_clickOnElement(OMTAcqui.get_Entities());
		OMTAcqui.javascript_clickOnElement(OMTAcqui.get_AppEntry());

		// RF.OMTSearch_and_ValidateDashboardverifier(OrderReferenceId);
		RF.OMTSearch_and_ValidateDashboard1();

		// Click on edit
		JavascriptExecutor jsO = (JavascriptExecutor) DriverManager.getDriver();
		jsO.executeScript("arguments[0].click();", OMTAcqui.get_EditBtn());

		// Change the status to Approved

		RF.UpdateOrderStatus(Status);
		/*System.out.println("Disposition Status: " + OMTAcqui.get_Dashboard_Dispo().getText());
		Constant.dataMap.set(Map);
		Constant.dataMap.get().put("OMT_DispositionStatus", OMTAcqui.get_Dashboard_Dispo().getText());

		util.writeToExcelExistingRowFromMap("Sheet1", Constant.dataMap.get(),Constant.ScenarioName,1);
*/
		 // Signout
		RF.Signout();
	}

	
	
	public void OMTOrderStatus_Approved(String FlowType, String UserAgent, String Status) throws Exception {

		K.OMT_Role_Login(FlowType, UserAgent);
		// RF.OMTverifier("omt-cbs-verifier-acqui-no-tcoe", "admin");
		Thread.sleep(3000);
		// OMTAcqui.clickOnElement("Entities", "Entities", "Entities");
		OMTAcqui.javascript_clickOnElement(OMTAcqui.get_Entities());
		OMTAcqui.javascript_clickOnElement(OMTAcqui.get_AppEntry());

		// RF.OMTSearch_and_ValidateDashboardverifier(OrderReferenceId);
		RF.OMTSearch_and_ValidateDashboard1();

		// Click on edit
		JavascriptExecutor jsO = (JavascriptExecutor) DriverManager.getDriver();
		jsO.executeScript("arguments[0].click();", OMTAcqui.get_EditBtn());

		// Change the status to Approved

		RF.UpdateOrderStatus(Status);
		System.out.println("Disposition Status: " + OMTAcqui.get_Dashboard_Dispo().getText());
		Constant.dataMap.set(Map);
		Constant.dataMap.get().put("OMT_DispositionStatus", OMTAcqui.get_Dashboard_Dispo().getText());

		util.writeToExcelExistingRowFromMap("Sheet1", Constant.dataMap.get(),Constant.ScenarioName,1);

		/*
		 * // WATING for 10 min to change the dispo stastus to for reservastion
		 * Thread.sleep(600000); String ORDERID =
		 * util.ReadFromRowExcel(Constant.RowValue, "Sheet1",
		 * Constant.OrderRefID);
		 * 
		 * OMTAcqui.get_SearchField().sendKeys(ORDERID);
		 * System.out.println("Disposition Status: " +
		 * OMTAcqui.get_Dashboard_Dispo().getText());
		 * Constant.dataMap.set(Map);
		 * Constant.dataMap.get().put("OMT_DispositionStatus",
		 * OMTAcqui.get_Dashboard_Dispo().getText());
		 * 
		 * util.writeToExcelExistingRowFromMap("Sheet1",
		 * Constant.dataMap.get());
		 * 
		 */ // Signout
		RF.Signout();
	}

	// UpdateOrder_ReservedPhysStock
	public void OMTOrderStatus_ReservedPhysicalStock(String FlowType, String UserAgent, String Status)
			throws Exception {
		K.OMT_Role_Login(FlowType, UserAgent);

		Thread.sleep(3000);
		// OMTAcqui.clickOnElement("Entities", "Entities", "Entities");
		OMTAcqui.javascript_clickOnElement(OMTAcqui.get_Entities());
		OMTAcqui.javascript_clickOnElement(OMTAcqui.get_AppEntry());

		// RF.OMTverifier("omt-cbs-encoder-acqui-no-tcoe", "admin");
		RF.OMTSearch_and_ValidateDashboard1();

		// Click on edit
		JavascriptExecutor js90 = (JavascriptExecutor) DriverManager.getDriver();
		js90.executeScript("arguments[0].click();", OMTAcqui.get_EditBtn());

		/***************************************
		 * reserve physical stock
		 ****************************************************************/
		RF.UpdateOrderStatus(Status);
		// RF.ReservedPhysicalStock(Status);

		/*
		 * Thread.sleep(500000);
		 * 
		 * // auto change awaitingBSS IN dasboared await for some times
		 * 
		 * System.out.println("Disposition Status: " +
		 * OMTAcqui.get_Dashboard_Dispo().getText());
		 * Constant.dataMap.set(Map);
		 * Constant.dataMap.get().put("OMT_DispositionStatus",
		 * OMTAcqui.get_Dashboard_Dispo().getText());
		 */

		/*
		 * Thread.sleep(600000); System.out.println("Disposition Status: " +
		 * OMTAcqui.get_Dashboard_Dispo().getText());
		 * Constant.dataMap.get().put("OMT_DispositionStatus",
		 * OMTAcqui.get_Dashboard_Dispo().getText());
		 */

		// Signout
		RF.Signout();
	}
	
	public void Halt_Execution(String RoleName) throws Exception {
		
System.out.println("The execution needs to stop in order to wait for the disposition status to change");		
DriverManager.getDriver().quit();

	}

	public void Halt_Execution1(String RoleName) throws Exception {
		String orderState = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.OrderState);
		//DriverManager.getDriver().quit();
		if (orderState.trim().equals("7")) {
			Thread.sleep(600000);
			K.OMT_Role_Login(Constant.FlowType, RoleName);
			Thread.sleep(3000);
			SearchForDispoStatus();
		}
		// Reserved Physical Stock
		else if (orderState.trim().equals("5")) {
			// wait for 10 min for Manual Case creation
			Thread.sleep(300000);
			K.OMT_Role_Login(Constant.FlowType, RoleName);
			Thread.sleep(3000);
			SearchForDispoStatus();
		}

		// Approved
		else if (orderState.trim().equals("6")) {
			// RID Refreshes wait for 10 min
			Thread.sleep(600000);
			K.OMT_Role_Login(Constant.FlowType, RoleName);
			Thread.sleep(3000);
			SearchForDispoStatus();
		}
		//for processing
		else if (orderState.trim().equals("1")) {
			// RID Refreshes wait for 15 min changes to for reservation in TL and again assign to encoder
			Thread.sleep(900000);
			AssignOrderOMT(RoleName);
			//K.OMT_Role_Login(Constant.FlowType, RoleName);
			Thread.sleep(3000);
//			SearchForDispoStatus();
		} 
		else if (orderState.trim().equals("17")) {
			// changes to FOR DISPATCH wait for some time
			Thread.sleep(20000);
			K.OMT_Role_Login(Constant.FlowType, RoleName);
			Thread.sleep(3000);
			SearchForDispoStatus();
		} else {
			// for processing1
			// RID Refreshes wait for 15 min changes to For Reservation again
			Thread.sleep(900000);
			K.OMT_Role_Login(Constant.FlowType, RoleName);
			Thread.sleep(3000);
			SearchForDispoStatus();

		}

	}

	public void OMTOrderStatus_RequestPayment(String FlowType, String UserAgent, String Status) throws Exception {
		K.OMT_Role_Login(FlowType, UserAgent);

		Thread.sleep(3000);
		// OMTAcqui.clickOnElement("Entities", "Entities", "Entities");
		OMTAcqui.javascript_clickOnElement(OMTAcqui.get_Entities());
		OMTAcqui.javascript_clickOnElement(OMTAcqui.get_AppEntry());

		// RF.OMTverifier("omt-cbs-encoder-acqui-no-tcoe", "admin");
		RF.OMTSearch_and_ValidateDashboard1();

		// Click on edit
		JavascriptExecutor jsr = (JavascriptExecutor) DriverManager.getDriver();
		jsr.executeScript("arguments[0].click();", OMTAcqui.get_EditBtn());

		// change disposition status to Requestpaymento
		RF.UpdateOrderStatus(Status);
		// RF.Requestpayment("Request Payment");

		/*
		 * System.out.println("Disposition Status: " +
		 * OMTAcqui.get_Dashboard_Dispo().getText());
		 * Constant.dataMap.set(Map);
		 * Constant.dataMap.get().put("OMT_DispositionStatus",
		 * OMTAcqui.get_Dashboard_Dispo().getText());
		 */
		Thread.sleep(1000);

		// Signoutoa
		RF.Signout();
	}

	public void OMTStatus_AwaitingPayment(String FlowType, String UserAgent, String SCName, String Status,
			String CaseName) throws Exception {

		K.OMT_Role_Login(FlowType, UserAgent);

		Thread.sleep(6000);
		// OMTAcqui.clickOnElement("Entities", "Entities", "Entities");
		OMTAcqui.javascript_clickOnElement(OMTAcqui.get_Entities());
		OMTAcqui.javascript_clickOnElement(OMTAcqui.get_AppEntry());
		Thread.sleep(4000);

		// RF.OMTverifier("omt-cbs-encoder-acqui-no-tcoe", "admin");
		RF.OMTSearch_and_ValidateDashboard1();

		/********************************************************************************************/

		/******************************
		 * IF it is EXCEPT COD we can follow these script
		 **********************************/

		// Click on edit
		JavascriptExecutor jsa = (JavascriptExecutor) DriverManager.getDriver();
		jsa.executeScript("arguments[0].click();", OMTAcqui.get_EditBtn());

		// in awaiting payemnt make Payemnt reference as "Paid" for happy
		// path
		// RF.Awaitingpayment(Status,PayementReference,StatusPayment);
		RF.UpdateOrderStatus(Status);
		System.out.println("Disposition Status: " + OMTAcqui.get_Dashboard_Dispo().getText());
		Constant.dataMap.set(Map);
		Constant.dataMap.get().put("OMT_DispositionStatus", OMTAcqui.get_Dashboard_Dispo().getText());

		OrderTracker_GlobeOnline(CaseName, Status);

		RF.Signout();

	}

	public void OMTStatus_ForProcessing(String FlowType, String UserAgent, String SCName, String PaymentMethod)
			throws Exception {

		K.OMT_Role_Login(FlowType, UserAgent);

		Thread.sleep(3000);
		// OMTAcqui.clickOnElement("Entities", "Entities", "Entities");
		OMTAcqui.javascript_clickOnElement(OMTAcqui.get_Entities());
		OMTAcqui.javascript_clickOnElement(OMTAcqui.get_AppEntry());

		RF.OMTSearch_and_ValidateDashboard1();

		// Click on edit
		JavascriptExecutor jsr = (JavascriptExecutor) DriverManager.getDriver();
		jsr.executeScript("arguments[0].click();", OMTAcqui.get_EditBtn());

		RF.forproccessing("For Processing");
		/*
		 * // RID Refreshes wait for 15 min Thread.sleep(900000);
		 * System.out.println("Disposition Status: " +
		 * OMTAcqui.get_Dashboard_Dispo().getText());
		 * Constant.dataMap.get().put("OMT_DispositionStatus",
		 * OMTAcqui.get_Dashboard_Dispo().getText());
		 */
		RF.Signout();

	}
	
	public void VerifyOMTOrder_Delivered(String UserAgent) throws Exception {

		// AssignOrderOMT(DS.sActionKeywordAgent);
		DriverManager.getDriver().quit();
		LaunchBrowser_OMT();
		String CaseName = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.ScenarioColumn);
		String SCName = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.FlowIdColumnValue);

		//String User21 = util.ReadFromRowExcel(SCName, "FlowDetails", Constant.User21);

		OMTOrderStatus_Delivered(Constant.FlowType, UserAgent, SCName, Constant.Delivered, CaseName);
	}
	
	public void OMTStatus_ForProcessing1(String FlowType, String UserAgent, String SCName, String PaymentMethod,
			String Status,String CaseName) throws Exception {

		K.OMT_Role_Login(FlowType, UserAgent);

		Thread.sleep(3000);
		// OMTAcqui.clickOnElement("Entities", "Entities", "Entities");
		OMTAcqui.javascript_clickOnElement(OMTAcqui.get_Entities());
		OMTAcqui.javascript_clickOnElement(OMTAcqui.get_AppEntry());

		RF.OMTSearch_and_ValidateDashboard1();
		// download las
				JavascriptExecutor jsL = (JavascriptExecutor) DriverManager.getDriver();
				jsL.executeScript("arguments[0].click();", OMTAcqui.get_LAS());

				if (OMTAcqui.get_LAS().isDisplayed()) {
					Constant.dataMap.set(Map);
					Constant.dataMap.get().put("OMT_LAS", "Downloaded");

					util.writeToExcelExistingRowFromMap("Sheet1", Constant.dataMap.get(),Constant.ScenarioName,1);

				}
		// Click on edit
		JavascriptExecutor jsr = (JavascriptExecutor) DriverManager.getDriver();
		jsr.executeScript("arguments[0].click();", OMTAcqui.get_EditBtn());
		RF.UpdateOrderStatus(Status);
		// RF.forproccessing("For Processing");
		// RID Refreshes wait for 15 min changes to For Reservation again
		//Halt_Execution(RoleName);
		/*
		 * Thread.sleep(900000); System.out.println("Disposition Status: " +
		 * OMTAcqui.get_Dashboard_Dispo().getText());
		 * Constant.dataMap.get().put("OMT_DispositionStatus",
		 * OMTAcqui.get_Dashboard_Dispo().getText());
		 */

		RF.Signout();

	}

	
	public void OMTOrderStatus_Processed(String FlowType, String UserAgent, String SCName, String Status,String CaseName)
			throws Exception {

		K.OMT_Role_Login(FlowType, UserAgent);
		Thread.sleep(6000);
		// OMTAcqui.clickOnElement("Entities", "Entities", "Entities");
		OMTAcqui.javascript_clickOnElement(OMTAcqui.get_Entities());
		OMTAcqui.javascript_clickOnElement(OMTAcqui.get_AppEntry());
		Thread.sleep(4000);
		RF.OMTSearch_and_ValidateDashboard1();

		/*// Click on edit
		JavascriptExecutor jsr = (JavascriptExecutor) DriverManager.getDriver();
		jsr.executeScript("arguments[0].click();", OMTAcqui.get_EditBtn());*/
		// RF.forproccessing("For Processing");

		// *************************************************************************************//*

		// download las
		/*
		 * JavascriptExecutor jsL = (JavascriptExecutor) DriverManager.getDriver();
		 * jsL.executeScript("arguments[0].click();", OMTAcqui.get_LAS());
		 */
		/*if (OMTAcqui.get_LAS().isDisplayed()) {
			Constant.dataMap.set(Map);
			Constant.dataMap.get().put("OMT_LAS", "Downloaded");

			util.writeToExcelExistingRowFromMap("Sheet1", Constant.dataMap.get(),Constant.ScenarioName,1);

		}*/

		JavascriptExecutor jsPP = (JavascriptExecutor) DriverManager.getDriver();
		jsPP.executeScript("arguments[0].click();", OMTAcqui.get_EditBtn());
		// RF.processed("Processed");
		RF.UpdateOrderStatus(Status);
		// changes to FOR DISPATCH wait for some time
		/*
		 * Thread.sleep(20000); System.out.println("Disposition Status: " +
		 * OMTAcqui.get_Dashboard_Dispo().getText());
		 * Constant.dataMap.get().put("OMT_DispositionStatus",
		 * OMTAcqui.get_Dashboard_Dispo().getText());
		 */
		// ********validate order
		// tracker********************************OrderTracker_Fordispatch*******************

		//OrderTracker_GlobeOnline(CaseName, "For Dispatch");

		// Signout
		RF.Signout();

	}

	
	public void OMTValidate_PALAgent(String FlowType, String UserType, String SCName) throws Exception {

		K.OMT_Role_Login(FlowType, UserType);
		Thread.sleep(6000);
		// OMTAcqui.clickOnElement("Entities", "Entities", "Entities");
		OMTAcqui.javascript_clickOnElement(OMTAcqui.get_Entities());
		OMTAcqui.javascript_clickOnElement(OMTAcqui.get_AppEntry());
		Thread.sleep(4000);
		RF.OMTSearch_and_ValidateDashboard1();

		// Click on edit
		JavascriptExecutor jsDE = (JavascriptExecutor) DriverManager.getDriver();
		jsDE.executeScript("arguments[0].click();", OMTAcqui.get_EditBtn());

		// For Delivery
		RF.Fordelivery("For Delivery");
		Thread.sleep(10000);
		System.out.println("Disposition Status: " + OMTAcqui.get_Dashboard_Dispo().getText());
		Constant.dataMap.set(Map);
		Constant.dataMap.get().put("OMT_DispositionStatus", OMTAcqui.get_Dashboard_Dispo().getText());

		/*************************
		 * //order tracker for delivry
		 **************************************/

		// open link
		OrderTracker_GlobeOnline(SCName, "For Delivery");
		// Signout
		RF.Signout();
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		JavascriptExecutor js4 = (JavascriptExecutor) DriverManager.getDriver();
		js4.executeScript("arguments[0].click();", OMTAcqui.get_Account());

		JavascriptExecutor js3 = (JavascriptExecutor) DriverManager.getDriver();
		js3.executeScript("arguments[0].click();", OMTAcqui.get_Account_Signin());

		Thread.sleep(5000);
		OMTAcqui.clickOnElement("OKTA_SSO", "OKTA_SSO_Btn", "OKTA_SSO_Btn");
		// K.OMT_Role_Login("FTA", "FTA_Acqui_PAL");
		Thread.sleep(6000);
		// OMTAcqui.clickOnElement("Entities", "Entities", "Entities");
		OMTAcqui.javascript_clickOnElement(OMTAcqui.get_Entities());
		OMTAcqui.javascript_clickOnElement(OMTAcqui.get_AppEntry());
		Thread.sleep(4000);
		// RF.OMTverifier("omt-pal-agent-acqui-tcoe", "admin");
		RF.OMTSearch_and_ValidateDashboard1();

		// Click on edit
		JavascriptExecutor js5 = (JavascriptExecutor) DriverManager.getDriver();
		js5.executeScript("arguments[0].click();", OMTAcqui.get_EditBtn());

		RF.Delivered("Delivered"); // some times auto change the status
		Thread.sleep(10000);

		// System.out.println("Disposition Status: " +
		// OMTAcqui.get_Dashboard_Dispo().getText());// reservation
		// Constant.dataMap.get().put("OMT_DispositionStatus",
		// OMTAcqui.get_Dashboard_Dispo().getText());

		// email,order tracker
		/**********************
		 * order tracking for activation
		 ***************************/

		OrderTracker_GlobeOnline(SCName, "For Activation");

		// Signout
		RF.Signout();
	}



	public void OMTOrderStatus_Completed(String Flowtype, String UserAgent, String SCName, String Status,String CaseName)
			throws Exception {

		// RF.OMTverifier("omt-activation-agent-acqui-no-tcoe", "admin");
		K.OMT_Role_Login(Flowtype, UserAgent);
		Thread.sleep(4000);
		OMTAcqui.javascript_clickOnElement(OMTAcqui.get_Entities());
		OMTAcqui.javascript_clickOnElement(OMTAcqui.get_AppEntry());
		Thread.sleep(4000);

		RF.OMTSearch_and_ValidateDashboard1();

		String a = util.ReadFromExcel(CaseName, "Sheet1", Constant.PaymentMenthod);
		// String a = util.ReadFromExcel(SC.getClass().getSimpleName(),
		// "Sheet1", Constant.PaymentMenthod);

		if (a.contains("CC") || a.contains("Straight Payement")|| a.contains("CC(Straight payemnet)")) {
			DriverManager.getDriver().quit();
			String SCname = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.FlowIdColumnValue);// flow
																													// id
			//String User18 = util.ReadFromRowExcel(SCname, "FlowDetails_Renewal", Constant.User18);
			Encoder_PlanCheck(Constant.FlowType, UserAgent, Status);
		}

		else {
			JavascriptExecutor jstl = (JavascriptExecutor) DriverManager.getDriver();
			jstl.executeScript("arguments[0].click();", OMTAcqui.get_EditBtn());
			RF.UpdateOrderStatus(Status);
			// RF.completed("Completed");
			Thread.sleep(10000);
			System.out.println("Disposition Status: " + OMTAcqui.get_Dashboard_Dispo().getText());// reservation
			Constant.dataMap.set(Map);
			Constant.dataMap.get().put("OMT_DispositionStatus", OMTAcqui.get_Dashboard_Dispo().getText());
		}
		// track order and sms
		// open link
		OrderTracker_GlobeOnline(CaseName, Status);

		Status = "passed";
		// DriverManager.getDriver().quit();
		System.out.println("!!! Execution Completed for " + SCName + " !!!");

	}



	public void TrackOrder_GlobeOnline(String SCName) throws Exception {
		// ORDER TRACKER NOT WRITTN //open link
		DriverManager.getDriver().get(Globeurl);
		Thread.sleep(1000); // Accpet
		// cookies
		RF.IacceptClick();
		Thread.sleep(5000);
		// Login Trackmyorder
		// ORDERID
		String ORDERID = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.OrderRefID);
		RF.OMT_Trackmyorderlogin(ORDERID, Constant.Email_GO);
		RF.ordertracker_Awaitingpayment(SCName);

		// open link
		DriverManager.getDriver().get(OMTurl);
		Thread.sleep(1000);

		/*
		 * //Signout RF.Signout();
		 * 
		 * RF.OMTLoginmonitor("omt-monitoring-agent-acqui-no-tcoe","admin");
		 * Thread.sleep(1000);
		 * RF.OMTSearch_and_ValidateDashboard("PRE-000005116");
		 */
	}

	private void Encoder_PlanCheck(String FlowType, String UserAgent, String Status) throws Exception {
		// TODO Auto-generated method stub

		LaunchBrowser_OMT();

		K.OMT_Role_Login(FlowType, UserAgent);
		Thread.sleep(4000);
		OMTAcqui.javascript_clickOnElement(OMTAcqui.get_Entities());
		OMTAcqui.javascript_clickOnElement(OMTAcqui.get_AppEntry());
		Thread.sleep(4000);

		RF.OMTSearch_and_ValidateDashboard1();

		JavascriptExecutor jstt = (JavascriptExecutor) DriverManager.getDriver();
		jstt.executeScript("arguments[0].click();", OMTAcqui.get_EditBtn());
		// RF.completed("Completed");
		RF.UpdateOrderStatus(Status);
		Thread.sleep(10000);
		OMTAcqui.clickOnElement("Search button", "SearchBtn", "SearchBtn");

		System.out.println("Disposition Status: " + OMTAcqui.get_Dashboard_Dispo().getText());
		Constant.dataMap.set(Map);
		Constant.dataMap.get().put("OMT_DispositionStatus", OMTAcqui.get_Dashboard_Dispo().getText());
	}

	public void OrderTracker_GlobeOnline(String CaseName, String DispositionStatus) throws Exception {
		// ORDER TRACKER NOT WRITTN //open link
		DriverManager.getDriver().get(Globeurl);
		Thread.sleep(1000); // Accpet
		// cookies
		RF.IacceptClick();
		Thread.sleep(5000);
		// Login Trackmyorder
		String ORDERID = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.OrderRefID);

		RF.OMT_Trackmyorderlogin(ORDERID, Constant.Email_GO);

		switch (DispositionStatus) {

		case "Awaiting Payment":

			RF.ordertracker_Awaitingpayment(CaseName);
			break;
		case "For Dispatch":

			RF.ordertracker_ForDispatch();
			break;
		

		case "For Delivery":

			RF.ordertracker_ForDelivery();
			break;

		case "For Activation":

			RF.ordertracker_ForaActivation();
			break;
		case "Renewal Completed":

			 RF.ordertracker_Completed();
			break;

		}

		// open link
		DriverManager.getDriver().get(OMTurl);
		Thread.sleep(1000);

	}

	public void AssignOrderOMT(String RoleName) throws Exception {
		DriverManager.getDriver().quit();
		LaunchBrowser_OMT();
		Thread.sleep(2000);
		K.OMT_Role_Login(Constant.FlowType, Constant.AssignOrderTL);

		Thread.sleep(3000);

		// OMTAcqui.clickOnElement("Entities", "Entities", "Entities");
		OMTAcqui.javascript_clickOnElement(OMTAcqui.get_Entities());
		OMTAcqui.javascript_clickOnElement(OMTAcqui.get_AppEntry());

		RF.OMTSearch_and_ValidateDashboard1();

		System.out.println("Disposition Status: " + OMTAcqui.get_Dashboard_Dispo().getText());
		Constant.dataMap.set(Map);
		Constant.dataMap.get().put("OMT_DispositionStatus", OMTAcqui.get_Dashboard_Dispo().getText());
		util.writeToExcelExistingRowFromMap("Sheet1", Constant.dataMap.get(),Constant.ScenarioName,1);
		Thread.sleep(4000);
		// Assign order to respective Agent
		// Click on Checkbox
		JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
		js1.executeScript("arguments[0].click();", OMTAcqui.get_OrderCheckBox());
		JavascriptExecutor jsp = (JavascriptExecutor) DriverManager.getDriver();
		jsp.executeScript("arguments[0].click();", OMTAcqui.get_RemoveAssigneRdbtn());
		JavascriptExecutor jsR = (JavascriptExecutor) DriverManager.getDriver();
		jsR.executeScript("arguments[0].click();", OMTAcqui.get_RemoveButton());
		Thread.sleep(2000);

		if(OMTAcqui.get_RemoveMessage().isDisplayed())
		{
			System.out.println("Removing an assignee to this application is not yet assigned to the admin");
			JavascriptExecutor jsC = (JavascriptExecutor) DriverManager.getDriver();
			jsC.executeScript("arguments[0].click();", OMTAcqui.get_OrderCheckBox());
		}
		 if(!(OMTAcqui.get_CheckBoxOrder().isSelected()))
		{
		// Click on Checkbox
				JavascriptExecutor jsC = (JavascriptExecutor) DriverManager.getDriver();
				jsC.executeScript("arguments[0].click();", OMTAcqui.get_OrderCheckBox());
		}
		JavascriptExecutor jsA = (JavascriptExecutor) DriverManager.getDriver();
		jsA.executeScript("arguments[0].click();", OMTAcqui.get_AssignRdBtn());

		if ((OMTAcqui.get_Assign_btn().isEnabled())) {
			/*
			 * JavascriptExecutor jsA = (JavascriptExecutor)
			 * DriverManager.getDriver();
			 * jsA.executeScript("arguments[0].click();",
			 * OMTAcqui.get_AssigneRdBtn());
			 */
			String AgentName = util.ReadFromExcel(RoleName, "LoginDetails", Constant.AgentName);

			WebElement SelectAdmin = DriverManager.getDriver().findElement(OMTAcqui.Select_Admin);
			SelectAdmin.sendKeys(AgentName);
			DriverManager.getDriver().findElement(OMTAcqui.Assign_Result).click();
			// SelectAdmin.sendKeys(Keys.ENTER);
			JavascriptExecutor js2 = (JavascriptExecutor) DriverManager.getDriver();
			js2.executeScript("arguments[0].click();", OMTAcqui.get_Assign_btn());
		} else if (OMTAcqui.get_RemoveAssignee().isEnabled()) {
			JavascriptExecutor js3 = (JavascriptExecutor) DriverManager.getDriver();
			js3.executeScript("arguments[0].click();", OMTAcqui.get_RemoveAssignee());
			Thread.sleep(3000);
			JavascriptExecutor js4 = (JavascriptExecutor) DriverManager.getDriver();
			js4.executeScript("arguments[0].click();", OMTAcqui.get_OrderCheckBox());

			JavascriptExecutor js5 = (JavascriptExecutor) DriverManager.getDriver();
			js5.executeScript("arguments[0].click();", OMTAcqui.get_AssignRdBtn());

			String AgentName = util.ReadFromExcel(RoleName, "LoginDetails", Constant.AgentName);
			WebElement SelectAdmin = DriverManager.getDriver().findElement(OMTAcqui.Select_Admin);
			SelectAdmin.sendKeys(AgentName);
			DriverManager.getDriver().findElement(OMTAcqui.Assign_Result).click();

			// SelectAdmin.sendKeys(Keys.ENTER);
			JavascriptExecutor js2 = (JavascriptExecutor) DriverManager.getDriver();
			js2.executeScript("arguments[0].click();", OMTAcqui.get_Assign_btn());
		}

		RF.Signout();
		DriverManager.getDriver().quit();

	}
	public void OMTOrderStatus_ForDelivery(String FlowType, String UserType, String SCName, String Status,
			String CaseName) throws Exception {

		K.OMT_Role_Login(FlowType, UserType);
		Thread.sleep(6000);
		// OMTAcqui.clickOnElement("Entities", "Entities", "Entities");
		OMTAcqui.javascript_clickOnElement(OMTAcqui.get_Entities());
		OMTAcqui.javascript_clickOnElement(OMTAcqui.get_AppEntry());
		Thread.sleep(4000);
		RF.OMTSearch_and_ValidateDashboard1();

		// Click on edit
		JavascriptExecutor jsDE = (JavascriptExecutor) DriverManager.getDriver();
		jsDE.executeScript("arguments[0].click();", OMTAcqui.get_EditBtn());

		// For Delivery
		// RF.Fordelivery("For Delivery");
		RF.UpdateOrderStatus(Status);
		Thread.sleep(10000);
		/*
		 * System.out.println("Disposition Status: " +
		 * OMTAcqui.get_Dashboard_Dispo().getText());
		 * Constant.dataMap.set(Map);
		 * Constant.dataMap.get().put("OMT_DispositionStatus",
		 * OMTAcqui.get_Dashboard_Dispo().getText());
		 */

		/*************************
		 * //order tracker for delivry
		 **************************************/

		// open link
		//OrderTracker_GlobeOnline(CaseName, Status);
		// Signout
		RF.Signout();

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
	
	public void OMTOrderStatus_ReDelivery1(String FlowType, String UserAgent, String Status, String CaseName)
			throws Exception {

		/******************************************
		 * For ReDelivery
		 ***********************************************/
		// Change the status to Ongoing verfication

		K.OMT_Role_Login(FlowType, UserAgent);

		Thread.sleep(3000);

		OMTAcqui.javascript_clickOnElement(OMTAcqui.get_Entities());
		OMTAcqui.javascript_clickOnElement(OMTAcqui.get_AppEntry());

		RF.OMTSearch_and_ValidateDashboard1();

		// Click on edit
		JavascriptExecutor jsO = (JavascriptExecutor) DriverManager.getDriver();
		jsO.executeScript("arguments[0].click();", OMTAcqui.get_EditBtn());

		RF.UpdateOrderStatus(Status);

		/*
		 * // RF.ongoingVerification("Ongoing Verification");
		 * System.out.println("Disposition Status: " +
		 * OMTAcqui.get_Dashboard_Dispo().getText());
		 * Constant.dataMap.set(Map);
		 * Constant.dataMap.get().put("OMT_DispositionStatus", "NotFound");
		 * Constant.dataMap.get().put("OMT_DispositionStatus",
		 * OMTAcqui.get_Dashboard_Dispo().getText()); //
		 * util.writeToExcelExistingRowFromMap("Sheet1", Constant.dataMap.get(),
		 * // ScenarioName, 0); util.writeToExcelExistingRowFromMap("Sheet1",
		 * Constant.dataMap.get());
		 */

		// Signout
		RF.Signout();
		/*************************
		 * //order tracker for Redelivry
		 **************************************/
		OrderTracker_GlobeOnline(CaseName, Status);
	}

	public void OMTOrderStatus_ReDelivery3(String FlowType, String UserAgent, String Status, String CaseName)
			throws Exception {

		/******************************************
		 * For ReDelivery
		 ***********************************************/
		// Change the status to Ongoing verfication

		K.OMT_Role_Login(FlowType, UserAgent);

		Thread.sleep(3000);

		OMTAcqui.javascript_clickOnElement(OMTAcqui.get_Entities());
		OMTAcqui.javascript_clickOnElement(OMTAcqui.get_AppEntry());

		RF.OMTSearch_and_ValidateDashboard1();

		// Click on edit
		JavascriptExecutor jsO = (JavascriptExecutor) DriverManager.getDriver();
		jsO.executeScript("arguments[0].click();", OMTAcqui.get_EditBtn());

		RF.UpdateOrderStatus(Status);

		// Signout
		RF.Signout();

		/*************************
		 * //order tracker for Redelivry
		 **************************************/
		OrderTracker_GlobeOnline(CaseName, Status);
	}

	public void OMTOrderStatus_ReDelivery2(String FlowType, String UserAgent, String Status, String CaseName)
			throws Exception {

		/******************************************
		 * For ReDelivery
		 ***********************************************/
		// Change the status to Ongoing verfication

		K.OMT_Role_Login(FlowType, UserAgent);

		Thread.sleep(3000);

		OMTAcqui.javascript_clickOnElement(OMTAcqui.get_Entities());
		OMTAcqui.javascript_clickOnElement(OMTAcqui.get_AppEntry());

		RF.OMTSearch_and_ValidateDashboard1();

		// Click on edit
		JavascriptExecutor jsO = (JavascriptExecutor) DriverManager.getDriver();
		jsO.executeScript("arguments[0].click();", OMTAcqui.get_EditBtn());

		RF.UpdateOrderStatus(Status);

		// Signout
		RF.Signout();

		/*************************
		 * //order tracker for Redelivry
		 **************************************/
		OrderTracker_GlobeOnline(CaseName, Status);
	}

	public void SearchForDispoStatus() throws Exception {
		Thread.sleep(1000);
		OMTAcqui.javascript_clickOnElement(OMTAcqui.get_Entities());
		OMTAcqui.javascript_clickOnElement(OMTAcqui.get_AppEntry());

		RF.OMTSearch_and_ValidateDashboard1();
if(OMTAcqui.isElementExist("Disposition status", "Dashboard_Dispo", 20))
{
		System.out.println("Disposition Status: " + OMTAcqui.get_Dashboard_Dispo().getText());
		Constant.dataMap.set(Map);
		Constant.dataMap.get().put("OMT_DispositionStatus", OMTAcqui.get_Dashboard_Dispo().getText());

		util.writeToExcelExistingRowFromMap("Sheet1", Constant.dataMap.get(),Constant.ScenarioName,1);
}
		RF.Signout();
	}
	

	
	
	
	public void OMTOrderStatus_Delivered(String FlowType, String UserType, String SCName, String Status,
			String CaseName) throws Exception {

		K.OMT_Role_Login(FlowType, UserType);
		Thread.sleep(6000);
		// OMTAcqui.clickOnElement("Entities", "Entities", "Entities");
		OMTAcqui.javascript_clickOnElement(OMTAcqui.get_Entities());
		OMTAcqui.javascript_clickOnElement(OMTAcqui.get_AppEntry());
		Thread.sleep(4000);
		RF.OMTSearch_and_ValidateDashboard1();

		// Click on edit
		JavascriptExecutor jsDE = (JavascriptExecutor) DriverManager.getDriver();
		jsDE.executeScript("arguments[0].click();", OMTAcqui.get_EditBtn());
		RF.UpdateOrderStatus(Status);
		// AF.Delivered("Delivered"); // some times auto change the status
		Thread.sleep(10000);

		/*
		 * System.out.println("Disposition Status: " +
		 * OMTAcqui.get_Dashboard_Dispo().getText());// reservation
		 * Constant.dataMap.set(Map);
		 * Constant.dataMap.get().put("OMT_DispositionStatus",
		 * OMTAcqui.get_Dashboard_Dispo().getText());
		 */

		// email,order tracker
		/**********************
		 * order tracking for Renewal Completed
		 ***************************/

		OrderTracker_GlobeOnline(CaseName, "Renewal Completed");

		// Signout
		RF.Signout();
	}
	
}
