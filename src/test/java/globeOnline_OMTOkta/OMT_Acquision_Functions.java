package globeOnline_OMTOkta;

import java.awt.AWTException;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebElement;

import com.pages.ada.ADADAF_Page;
import com.pages.ada.BasePage;
import com.pages.omt.ACQUI_omt_page;

import globeOnline_CommonMethods.DriverManager;
import globeOnline_CommonMethods.util;
import utility.Constant;
import utility.Control;
import utility.Generic;

public class OMT_Acquision_Functions {
	private util util = new util();
	private BasePage BP = new BasePage();
	private ACQUI_omt_page OMTAcqui = new ACQUI_omt_page();
	private static LinkedHashMap<String, String> Map = new LinkedHashMap<>();

private ADADAF_Page Form=new ADADAF_Page();
	/*****
	 * RONNIE SCRIPT STARTS HERE
	 * 
	 ******************************************************************************************************************************/

	public void GotoURL(String agentName, String agentPassword) throws Exception {
		// public void GotoURL() throws Exception{
		// ((JavascriptExecutor)DriverManager.getDriver()).executeScript("window.open()");
		ArrayList<String> tab = new ArrayList<String>(DriverManager.getDriver().getWindowHandles());
		DriverManager.getDriver().switchTo().window(tab.get(1));
		DriverManager.getDriver().get("https://edo-dev-data-engineering.globe.com.ph/omt-sat/bbsp-admin/");
	}

	// *********************************************************************************************************
	public void insert_Usr_pswd(String usr, String Pswd) throws Exception {

		OMTAcqui.get_LoginUsername().clear();
		OMTAcqui.get_LoginUsername().sendKeys(usr);
		System.out.println("User name : " + usr);
		BP.scroll_vertical(600);
		Constant.dataMap.get().put("OMT_Username", usr);

		OMTAcqui.get_LoginPassword().clear();
		OMTAcqui.get_LoginPassword().sendKeys(usr);
		System.out.println("Password : " + Pswd);
		BP.scroll_vertical(600);
		Constant.dataMap.get().put("OMT_Password", Pswd);

		// Signin
		OMTAcqui.isElementExist("Signin button", "Signinbutton", 10);
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("arguments[0].click();", OMTAcqui.get_SignInBtn());
		Thread.sleep(400);

		OMTAcqui.isElementExist("Entities drop down", "Entities", 10);
		JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
		js1.executeScript("arguments[0].click();", OMTAcqui.get_EntitiesBtn());
		Thread.sleep(400);

		OMTAcqui.isElementExist("Application Entry", "ApplicationEntry", 10);
		JavascriptExecutor js2 = (JavascriptExecutor) DriverManager.getDriver();
		js2.executeScript("arguments[0].click();", OMTAcqui.get_AppllEntryBtn());
		Thread.sleep(400);
	}

	// *********************************************************************************************************

	public void OMTLogin(String agentName, String agentPassword) throws Exception {
		if (OMTAcqui.isElementExist("Account Button", "AccountBtn", 10)) {
			OMTAcqui.clickOnElement("OMT Button: ", "AccountBtn", "AccountBtn");

			OMTAcqui.clickOnElement("OMT Button: ", "SignInBtn", "SignInBtn");
			OMTAcqui.get_LoginUsername().sendKeys(agentName);
			OMTAcqui.get_LoginPassword().sendKeys(agentPassword);
			OMTAcqui.clickOnElement("OMT Button: ", "LoginBtn", "LoginBtn");

			OMTAcqui.clickOnElement("OMT Button: ", "EntitiesBtn", "EntitiesBtn");
			OMTAcqui.clickOnElement("OMT Button: ", "AppllEntryBtn", "AppllEntryBtn");
		}

	}

	public void OMTverifier(String agentName, String agentPassword) throws Exception {

		OMTAcqui.get_LoginUsername().sendKeys(agentName);
		OMTAcqui.get_LoginPassword().sendKeys(agentPassword);
		OMTAcqui.clickOnElement("OMT Button: ", "LoginBtn", "LoginBtn");

		OMTAcqui.clickOnElement("OMT Button: ", "EntitiesBtn", "EntitiesBtn");
		OMTAcqui.clickOnElement("OMT Button: ", "AppllEntryBtn", "AppllEntryBtn");

	}

	public void OMTLoginmonitor(String agentName, String agentPassword) throws Exception {

		OMTAcqui.get_LoginUsername().sendKeys(agentName);
		OMTAcqui.get_LoginPassword().sendKeys(agentPassword);
		OMTAcqui.clickOnElement("OMT Button: ", "LoginBtn", "LoginBtn");

		OMTAcqui.clickOnElement("OMT Button: ", "EntitiesBtn", "EntitiesBtn");
		OMTAcqui.clickOnElement("OMT Button: ", "AppllEntryBtn", "AppllEntryBtn");

		// }
	}

	public void OMTSearch_and_ValidateDashboard1() throws Exception {

		String OrderRefId = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.OrderRefID);
		Thread.sleep(2000);
		OMTAcqui.get_SearchField().sendKeys(OrderRefId);
		Thread.sleep(5000L);
		OMTAcqui.clickOnElement("Search button", "SearchBtn", "SearchBtn");
		Thread.sleep(2000);
		// Boolean SearchResult = OMTAcqui.get_SearchError().isDisplayed();
		// if(SearchResult = true) {
		System.out.println("Order displayed in Dashboard as:" + "\n" + "Date Submitted: "
				+ OMTAcqui.get_Dashboard_DateSubmitted().getText() + "\n" + "Reference Number: "
				+ OMTAcqui.get_Dashboard_RefNum().getText() + "\n" + "Last Name: "
				+ OMTAcqui.get_Dashboard_LName().getText() + "\n" + "First Name: "
				+ OMTAcqui.get_Dashboard_FName().getText() + "\n" + "Plan Availed: "
				+ OMTAcqui.get_Dashboard_PlanAvailed().getText() + "\n" + "Disposition Status: "
				+ OMTAcqui.get_Dashboard_Dispo().getText() + "\n");
		// String Reason=OMTAcqui.get_Dashboard_Reason().getAttribute("value");
		/*
		 * if(OMTAcqui.get_Dashboard_Reason().isDisplayed()) {
		 * System.out.println("Reason / Remarks: " +
		 * OMTAcqui.get_Dashboard_Reason().getText()); }
		 */
		// "Reason / Remarks: " + OMTAcqui.get_Dashboard_Reason().getText()+"\n"
		// "Assignee: " +
		// OMTAcqui.get_Dashboard_Assignee().getAttribute("value")
		OMTAcqui.isElementExist("View Button", "ViewBtn", 10);
		OMTAcqui.isElementExist("Edit Button", "EditBtn", 10);
		// }
	}
	
	public void OMTSearch_and_ValidateDashboard(String OrderRefId) throws Exception {

		OMTAcqui.get_SearchField().sendKeys(OrderRefId);
		Thread.sleep(5000L);
		OMTAcqui.clickOnElement("Search button", "SearchBtn", "SearchBtn");
		// Boolean SearchResult = OMTAcqui.get_SearchError().isDisplayed();
		// if(SearchResult = true) {
		System.out.println("Order displayed in Dashboard as:" + "\n" + "Date Submitted: "
				+ OMTAcqui.get_Dashboard_DateSubmitted().getText() + "\n" + "Reference Number: "
				+ OMTAcqui.get_Dashboard_RefNum().getText() + "\n" + "Last Name: "
				+ OMTAcqui.get_Dashboard_LName().getText() + "\n" + "First Name: "
				+ OMTAcqui.get_Dashboard_FName().getText() + "\n" + "Plan Availed: "
				+ OMTAcqui.get_Dashboard_PlanAvailed().getText() + "\n" + "Disposition Status: "
				+ OMTAcqui.get_Dashboard_Dispo().getText() + "\n");
		// String Reason=OMTAcqui.get_Dashboard_Reason().getAttribute("value");
		/*
		 * if(OMTAcqui.get_Dashboard_Reason().isDisplayed()) {
		 * System.out.println("Reason / Remarks: " +
		 * OMTAcqui.get_Dashboard_Reason().getText()); }
		 */
		// "Reason / Remarks: " + OMTAcqui.get_Dashboard_Reason().getText()+"\n"
		// "Assignee: " +
		// OMTAcqui.get_Dashboard_Assignee().getAttribute("value")
		OMTAcqui.isElementExist("View Button", "ViewBtn", 10);
		OMTAcqui.isElementExist("Edit Button", "EditBtn", 10);
		// }
	}

	

	public void OMTSearch_and_ValidateDashboardverifier(String OrderNumber) throws Exception {
		OMTAcqui.get_SearchField().sendKeys(OrderNumber);
		OMTAcqui.get_SearchBtn().click();
		Thread.sleep(5000L);
		// Boolean SearchResult = OMTAcqui.get_SearchError().isDisplayed();
		// if(SearchResult = true) {
		System.out.println("Order displayed in Dashboard as:" + "\n" + "Date Submitted: "
				+ OMTAcqui.get_Dashboard_DateSubmitted().getText() + "\n" + "Reference Number: "
				+ OMTAcqui.get_Dashboard_RefNum().getText() + "\n" + "Last Name: "
				+ OMTAcqui.get_Dashboard_LName().getText() + "\n" + "First Name: "
				+ OMTAcqui.get_Dashboard_FName().getText() + "\n" + "Plan Availed: "
				+ OMTAcqui.get_Dashboard_PlanAvailed().getText() + "\n" + "Disposition Status: "
				+ OMTAcqui.get_Dashboard_Dispo().getText() + "\n");
		// "Reason / Remarks: " +
		// OMTAcqui.get_Dashboard_Reason().getAttribute(name)
		// "Assignee: " + OMTAcqui.get_Dashboard_Assignee().getText());

		OMTAcqui.isElementExist("View Button", "ViewBtn", 10);
		OMTAcqui.isElementExist("Edit Button", "EditBtn", 10);
		// }
	}

	public void OMTSearch_and_ValidateDashboarddispatch(String OrderNumber) throws Exception {
		OMTAcqui.get_SearchField().sendKeys(OrderNumber);
		Thread.sleep(5000L);
		// Boolean SearchResult = OMTAcqui.get_SearchError().isDisplayed();
		// if(SearchResult = true) {
		System.out.println("Order displayed in Dashboard as:" + "\n" + "Date Submitted: "
				+ OMTAcqui.get_Dashboard_DateSubmitted().getText() + "\n" + "Reference Number: "
				+ OMTAcqui.get_Dashboard_RefNum().getText() + "\n" + "Last Name: "
				+ OMTAcqui.get_Dashboard_LName().getText() + "\n" + "First Name: "
				+ OMTAcqui.get_Dashboard_FName().getText() + "\n" + "Plan Availed: "
				+ OMTAcqui.get_Dashboard_PlanAvailed().getText() + "\n" + "Disposition Status: "
				+ OMTAcqui.get_Dashboard_Dispo().getText());
		// "Reason / Remarks: " + OMTAcqui.get_Dashboard_Reason().getText());
		// "Assignee: " + OMTAcqui.get_Dashboard_Assignee().getText());

		OMTAcqui.isElementExist("View Button", "ViewBtn", 10);
		OMTAcqui.isElementExist("Edit Button", "EditBtn", 10);
		// }
	}
	
	public void OrderStatusVerifyInDashboard(String ExpStatus) throws Exception {

		String OrderRefId = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.OrderRefID);
        
		OMTAcqui.javascript_clickOnElement(OMTAcqui.get_Entities());
		OMTAcqui.javascript_clickOnElement(OMTAcqui.get_AppEntry());
		
		OMTAcqui.get_SearchField().sendKeys(OrderRefId);
		Thread.sleep(5000L);
		OMTAcqui.clickOnElement("Search button", "SearchBtn", "SearchBtn");
		// Boolean SearchResult = OMTAcqui.get_SearchError().isDisplayed();
		// if(SearchResult = true) {
		System.out.println("Order displayed in Dashboard as:" + "\n" + "Date Submitted: "
				+ OMTAcqui.get_Dashboard_DateSubmitted().getText() + "\n" + "Reference Number: "
				+ OMTAcqui.get_Dashboard_RefNum().getText() + "\n" + "Last Name: "
				+ OMTAcqui.get_Dashboard_LName().getText() + "\n" + "First Name: "
				+ OMTAcqui.get_Dashboard_FName().getText() + "\n" + "Plan Availed: "
				+ OMTAcqui.get_Dashboard_PlanAvailed().getText() + "\n" + "Disposition Status: "
				+ OMTAcqui.get_Dashboard_Dispo().getText() + "\n");
		
		// OMTAcqui.get_Dashboard_Assignee().getAttribute("value")
		if(OrderRefId.equalsIgnoreCase(OMTAcqui.get_Dashboard_RefNum().getText())) {
			Generic.WriteTestData("User should be able to see the searched order id: ", "", "", "should be able to see the searched order id in dash board","User is able to see the searched order id in dash board", "Passed");
			Control.takeScreenshot();
		}else {
			Generic.WriteTestData("User should be able to see the searched order id: ", "", "", "should be able to see the searched order id in dash board","User is not able to see the searched order id in dash board", "Failed");
			Control.takeScreenshot();
		}
		
		if(ExpStatus.equalsIgnoreCase(OMTAcqui.get_Dashboard_Dispo().getText())) {
			Generic.WriteTestData("Order Status Should change to:"+ExpStatus+" ", "", "", "Order Status Should change to:"+ExpStatus+"","Order Status changed to:"+ExpStatus+"", "Passed");
			Control.takeScreenshot();
		}else {
			Generic.WriteTestData("Order Status Should change to:"+ExpStatus+" ", "", "", "Order Status Should change to:"+ExpStatus+"","Order Status is changed to:"+ExpStatus+"", "Failed");
			Control.takeScreenshot();
		}
		
	   Signout();		
		
	}


	public String Validate_ORDER(String OrderNumber, String OrderSubType, String FlowType, String Dispo) {
		if (OrderNumber.equalsIgnoreCase(OMTAcqui.get_OMT_OrderID().getText())) {
			System.out.println("Customer Order Details: " + "\n" +

					"Order Type: " + OMTAcqui.get_OMT_OrderType().getAttribute("value"));
		}
		// "OrderID: " + OMTAcqui.get_OMT_OrderID().getAttribute("value") + "\n"
		// +
		else {
			System.out.println("OrderID did not match - Failed");
		}

		if (OrderSubType.equalsIgnoreCase(OMTAcqui.get_OMT_orderSubType().getAttribute("value"))) {
			System.out.println("Order Sub-Type: " + OMTAcqui.get_OMT_orderSubType().getAttribute("value"));
		} else {
			System.out.println("Order Sub-type did not match - Failed");
		}
		if (FlowType.equalsIgnoreCase("FTA_ADA") || FlowType.equalsIgnoreCase("Acqui")
				|| FlowType.equalsIgnoreCase("ADA")) {
			if (FlowType.contentEquals(OMTAcqui.get_OMT_acquiTypee().getAttribute("value"))) {
				System.out.println("Acquisition Type: " + OMTAcqui.get_OMT_acquiTypee().getAttribute("value"));
			} else {
				System.out.println("Acquisition type did not match - Failed");
			}
		}
		String a = OMTAcqui.get_OMT_Disposition().getAttribute("value");
		By val = By.xpath("//option[@value='" + a + "']");
		String b = DriverManager.getDriver().findElement(val).getText();
		if (Dispo.equalsIgnoreCase(b)) {
			System.out.println(
					"Disposition: " + b + "\n" + "Reason: " + OMTAcqui.get_OMT_DispoReason().getAttribute("value"));
		} else {
			System.out.println("Disposition did not match - Failed");
		}
		return b;
	}
	
	public String Validate_DispoStatus(String Dispo) throws Exception {
		
		String a = OMTAcqui.get_OMT_Disposition().getAttribute("value");
		By val = By.xpath("//option[@value='" + a + "']");
		String b = DriverManager.getDriver().findElement(val).getText();
		if (Dispo.equalsIgnoreCase(b)) {
			Generic.WriteTestData("Order Status should be display as: ", "", "","Order Status should be display as  "+Dispo+" ", "Order status is able to display as "+Dispo+"","Passed");
			Control.takeScreenshot();
			System.out.println(
					"Disposition: " + b + "\n" + "Reason: " + OMTAcqui.get_OMT_DispoReason().getAttribute("value"));
		} else {
			Generic.WriteTestData("Order Status should be display as: ", "", "","Order Status should be display as  "+Dispo+" ", "Order status is not able to display as "+Dispo+"","Failed");
			Control.takeScreenshot();
			System.out.println("Disposition did not match - Failed");
		}
		return b;
		
	}

	public String Validate_PRIMARYCUSTOMERDETAILS() {
		/*
		 * System.out.println("PRIMARY CUSTOMER DETAILS: "); String
		 * Fullname=OMTAcqui.get_Primary_Fname().getAttribute("");
		 * System.out.println("Primary_Fname is:"+Fullname);
		 */
		JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
		js1.executeScript("arguments[0].click();", OMTAcqui.get_Customerdetails());

		System.out.println(
				"PRIMARY CUSTOMER DETAILS: " + "\n" + "Fullname: " + OMTAcqui.get_Primary_Fname().getAttribute("value")
						+ " " + OMTAcqui.get_Primary_MName().getAttribute("value") + " "
						+ OMTAcqui.get_Primary_LName().getAttribute("value") + "\n" + "Mobile Number: "
						+ OMTAcqui.get_Primary_MobNum().getAttribute("value") + "\n" + "Email Address: "
						+ OMTAcqui.get_Primary_Email().getAttribute("value") + "\n" + "Birthday: "
						+ OMTAcqui.get_Primary_Bday().getAttribute("value") );
		
	 
		if(OMTAcqui.isElementExist("Primary_Gender", "Primary_Gender", 10))
		{
			System.out.println("Primary_Gender: " + OMTAcqui.get_Primary_Gender().getAttribute("value"));
	
		}
		if (OMTAcqui.get_Primary_Nationality().getAttribute("value").equalsIgnoreCase("Filipino")) {
			System.out.println("Nationality: " + OMTAcqui.get_Primary_Nationality().getAttribute("value"));
		} else {
			System.out.println("Nationality did not match - Failed");
		}

		String FName = OMTAcqui.get_Primary_Fname().getAttribute("value");
		String MName = OMTAcqui.get_Primary_MName().getAttribute("value");
		String LName = OMTAcqui.get_Primary_LName().getAttribute("value");
		String Em = OMTAcqui.get_Primary_Email().getAttribute("value");

		String CustomerDetails = FName + " " + MName + " " + LName + "," + Em;

		System.out
				.println("Full Mother's Maiden Name: " + OMTAcqui.get_Primary_FullMothersname().getAttribute("value"));
		System.out.println("Authorized Contact Person: " + OMTAcqui.get_Primary_RecipientName().getAttribute("value")
				+ " | " + OMTAcqui.get_Primary_RecipientMobNum().getAttribute("value"));
		return CustomerDetails;

	}

	public String Validate_RegisteredAddress(String House_Condo) {
		BP.scroll_vertical(320);

		String a = OMTAcqui.get_PrimaryRegAdd_Brgy().getAttribute("value");
		By b = By.xpath("//select[@name='barangay']//option[@value=" + "'" + a + "'" + "]");
		String Barangay = DriverManager.getDriver().findElement(b).getText();

		String c = OMTAcqui.get_PrimaryRegAdd_City().getAttribute("value");
		By d = By.xpath("//select[@name='city']//option[@value=" + "'" + c + "'" + "]");
		String City = DriverManager.getDriver().findElement(d).getText();

		String e = OMTAcqui.get_PrimaryRegAdd_Province().getAttribute("value");
		By f = By.xpath("//select[@name='province']//option[@value=" + "'" + e + "'" + "]");
		String Province = DriverManager.getDriver().findElement(f).getText();

		if (House_Condo.equalsIgnoreCase("House")) {

			System.out.println("Registered Address House: " + OMTAcqui.get_PrimaryRegAdd_houseNo().getAttribute("value")
					+ " " + OMTAcqui.get_PrimaryRegAdd_Street().getAttribute("value") + " "
					+ OMTAcqui.get_PrimaryRegAdd_VillageSubdi().getAttribute("value") + " " + Barangay + " " + City
					+ ", " + Province + " " + OMTAcqui.get_PrimaryRegAdd_Zipcode().getAttribute("value") + "\n"
					+ "Longitude: " + OMTAcqui.get_PrimaryRegAdd_Longitude().getAttribute("value") + "\n" + "Latitude: "
					+ OMTAcqui.get_PrimaryRegAdd_Latitude().getAttribute("value"));

			String AddressDetails = OMTAcqui.get_PrimaryRegAdd_houseNo().getAttribute("value") + ","
					+ OMTAcqui.get_PrimaryRegAdd_Street().getAttribute("value") + ","
					+ OMTAcqui.get_PrimaryRegAdd_VillageSubdi().getAttribute("value") + "," + Barangay + "," + City
					+ ", " + Province + "," + OMTAcqui.get_PrimaryRegAdd_Zipcode().getAttribute("value");
			return AddressDetails;

		}

		else {
			System.out.println("Registered Address Condo: " + OMTAcqui.get_PrimaryRegAdd_FlrNo().getAttribute("value")
					+ " " + OMTAcqui.get_PrimaryRegAdd_BuildingName().getAttribute("value") + " "
					+ OMTAcqui.get_PrimaryRegAdd_Street().getAttribute("value") + " " + Barangay + " " + City + ", "
					+ Province + " " + OMTAcqui.get_PrimaryRegAdd_Zipcode().getAttribute("value") + "\n" + "Longitude: "
					+ OMTAcqui.get_PrimaryRegAdd_Longitude().getAttribute("value") + "\n" + "Latitude: "
					+ OMTAcqui.get_PrimaryRegAdd_Latitude().getAttribute("value"));

			String AddressDetails = OMTAcqui.get_PrimaryRegAdd_FlrNo().getAttribute("value") + ","
					+ OMTAcqui.get_PrimaryRegAdd_BuildingName().getAttribute("value") + ","
					+ OMTAcqui.get_PrimaryRegAdd_Street().getAttribute("value") + "," + Barangay + "," + City + ", "
					+ Province + "," + OMTAcqui.get_PrimaryRegAdd_Zipcode().getAttribute("value");
			return AddressDetails;

		}

	}

	public void Validate_ShippingAddress(String House_Condo_Sameasbilling) {
		BP.scroll_vertical(300);

		if (House_Condo_Sameasbilling.equalsIgnoreCase("House")) {
			System.out.println("Shipping Address House: " + OMTAcqui.get_PrimaryShipAdd_HouseNo().getAttribute("value")
					+ " " + OMTAcqui.get_PrimaryShipAdd_VillageSubdi().getAttribute("value") + " "
					+ OMTAcqui.get_PrimaryShipAdd_Street().getAttribute("value") + " "
					+ OMTAcqui.get_PrimaryShipAdd_Brgy().getAttribute("value") + " "
					+ OMTAcqui.get_PrimaryShipAdd_City().getAttribute("value") + ", "
					+ OMTAcqui.get_PrimaryShipAdd_Province().getAttribute("value") + " "
					+ OMTAcqui.get_PrimaryShipAdd_ZipCode().getAttribute("value") + "\n" + "Longitude: "
					+ OMTAcqui.get_PrimaryShipAdd_Longitude().getAttribute("value") + "\n" + "Latitude: "
					+ OMTAcqui.get_PrimaryShipAdd_Latitude().getAttribute("value"));

		}

		else if (House_Condo_Sameasbilling.equalsIgnoreCase("Condo")) {
			System.out.println("Shipping Address House: " + OMTAcqui.get_PrimaryShipAdd_FlrNo().getAttribute("value")
					+ " " + OMTAcqui.get_PrimaryShipAdd_BuildingName().getAttribute("value") + " "
					+ OMTAcqui.get_PrimaryShipAdd_Street().getAttribute("value") + " "
					+ OMTAcqui.get_PrimaryShipAdd_Brgy().getAttribute("value") + " "
					+ OMTAcqui.get_PrimaryShipAdd_City().getAttribute("value") + ", "
					+ OMTAcqui.get_PrimaryShipAdd_Province().getAttribute("value") + " "
					+ OMTAcqui.get_PrimaryShipAdd_ZipCode().getAttribute("value") + "\n" + "Longitude: "
					+ OMTAcqui.get_PrimaryShipAdd_Longitude().getAttribute("value") + "\n" + "Latitude: "
					+ OMTAcqui.get_PrimaryShipAdd_Latitude().getAttribute("value"));

		} else {
			if (OMTAcqui.get_PrimarySameasbilling().getAttribute("value").equalsIgnoreCase(" same as billing ")) {
				System.out.println("Shipping Address same as Billing Address");
			} else {
				System.out.println("Shipping Address - Failed");
			}

		}
	}

	public void Validate_AccountCheckResults() {
		BP.scroll_vertical(360);
		JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
		js1.executeScript("arguments[0].click();", OMTAcqui.get_Accountcheck());

		System.out.println("ACCOUNT CHECKING RESULTS: ");
		System.out.println("Credit Limit (CL): " + OMTAcqui.get_CreditLimit().getAttribute("value"));
		System.out.println("GMI: " + OMTAcqui.get_GMI().getAttribute("value"));
		System.out.println("Prequal Result: " + OMTAcqui.get_PrequalResult().getAttribute("value"));
		System.out.println("CNDB Result: " + OMTAcqui.get_CNDBResult().getAttribute("value"));
		System.out.println("CSL Result: " + OMTAcqui.get_CSLResult().getAttribute("value"));
		System.out.println("Balance: " + OMTAcqui.get_Balance().getAttribute("value"));
		System.out.println("Account: " + OMTAcqui.get_Account().getAttribute("value"));
		System.out.println("Amount Due: " + OMTAcqui.get_AmountDue().getAttribute("value"));
	}
	
	
	public void Validate_OrderDetails() {

		BP.scroll_vertical(380);
		JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
		js1.executeScript("arguments[0].click();", OMTAcqui.get_orderdetails());

		System.out.println("ACCOUNT CHECKING RESULTS: ");
		System.out.println("BSS Order ID: " + OMTAcqui.get_BSSOrderID().getAttribute("value"));
		System.out.println("BSS Order Case ID: " + OMTAcqui.get_BSSOrderCaseID().getAttribute("value"));
		System.out.println("New Mobile Number: " + OMTAcqui.get_NewMobileNumber().getAttribute("value"));
		System.out.println("Delivery Case Title: " + OMTAcqui.get_DeliveryCaseTitle().getAttribute("value"));
		System.out.println("Delivery Queue Name: " + OMTAcqui.get_DeliveryQueueName().getAttribute("value"));

		System.out.println("Product Type: " + OMTAcqui.get_ProdType().getAttribute("value"));
		System.out.println("New Plan: " + OMTAcqui.get_NewPlan().getAttribute("value"));
		System.out.println("Data: " + OMTAcqui.get_Data().getAttribute("value"));
		System.out.println("Lockup: " + OMTAcqui.get_Lockup().getAttribute("value"));
		System.out.println("Plan Inclusions: " + OMTAcqui.get_PlanInclusions().getAttribute("value"));
		System.out.println("Paid Add-ons: " + OMTAcqui.get_PaidAddOns().getAttribute("value"));

		System.out.println("Device Details 1: " + OMTAcqui.get_item1().getAttribute("value") + " | "
				+ OMTAcqui.get_SKU1().getAttribute("value") + " | " + OMTAcqui.get_Matcode1().getAttribute("value")
				+ " | " + OMTAcqui.get_Sloc1().getAttribute("value") + " | "
				+ OMTAcqui.get_Serial1().getAttribute("value"));
		// System.out.println("Device Details 2: " +
		// OMTAcqui.get_item2().getText() + " | " +
		// OMTAcqui.get_SKU2().getText() + " | " +
		// OMTAcqui.get_Matcode2().getText() + " | " +
		// OMTAcqui.get_Sloc2().getText() + " | " +
		// OMTAcqui.get_Serial2().getText());

		System.out.println("Reservation ID: " + OMTAcqui.get_ReservationID().getAttribute("value"));
		System.out.println("Promo Code Details: " + OMTAcqui.get_Promocode().getAttribute("value") + " | "
				+ OMTAcqui.get_PromoDiscount().getAttribute("value") + " | "
				+ OMTAcqui.get_ProjectName().getAttribute("value"));
		System.out.println("Order Tagging: " + OMTAcqui.get_Channel().getAttribute("value") + " | "
				+ OMTAcqui.get_SalesmanID().getAttribute("value"));
	}

	public void Validate_DocumentSubmission() {
		BP.scroll_vertical(400);
		JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
		js1.executeScript("arguments[0].click();", OMTAcqui.get_doumentsub());

		System.out.println("DOCUMENT SUBMISSION: ");
		OMTAcqui.isElementExist("POID Img", "POID_Img", 10);
		System.out.println("POID Type: " + OMTAcqui.get_POID_Type().getAttribute("value"));
		System.out.println("POID Number: " + OMTAcqui.get_POID_Number().getAttribute("value"));
		System.out.println("POID Verification: " + OMTAcqui.get_POID_Verification().getAttribute("value"));
		System.out.println("POID Reason: " + OMTAcqui.get_POID_Reason().getAttribute("value"));
		System.out.println("POID Date Reviewed: " + OMTAcqui.get_POID_DateReviewed().getAttribute("value"));
		System.out
				.println("POID VERIFICATION FINDING:" + OMTAcqui.get_POID_Verficationfinding1().getAttribute("value"));

		OMTAcqui.isElementExist("POFC Img", "POFC_Img", 10);
		System.out.println("POFC Type: " + OMTAcqui.get_POFC_Type().getAttribute("value"));
		System.out.println("POFC Verification: " + OMTAcqui.get_POFC_Verification().getAttribute("value"));
		System.out.println("POFC Reason: " + OMTAcqui.get_POFC_Reason().getAttribute("value"));
		System.out.println("POFC Date Reviewed: " + OMTAcqui.get_POFC_DateReviewed().getAttribute("value"));
		System.out
				.println("POFC VERIFICATION FINDING:" + OMTAcqui.get_POFC_Verficationfinding1().getAttribute("value"));
	}

	public void Validate_PostpaidCustomerDetails() {
		BP.scroll_vertical(750);

		JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
		js1.executeScript("arguments[0].click();", OMTAcqui.get_postpaid());

		System.out.println("POSTPAID CUSTOMER DETAILS: ");
		System.out.println("FA ID: " + OMTAcqui.get_CustDet_FAID().getAttribute("value"));
		System.out.println("Billing Arrangement ID (BA ID): " + OMTAcqui.get_CustDet_BAID().getAttribute("value"));
		System.out.println("Contact ID: " + OMTAcqui.get_CustDet_ContactID().getAttribute("value"));
		System.out.println("Customer ID: " + OMTAcqui.get_CustDet_CustomerID().getAttribute("value"));
	}


	public void Validate_PaymentDetails() {

		BP.scroll_vertical(480);
		JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
		js1.executeScript("arguments[0].click();", OMTAcqui.get_payment());

		System.out.println("PAYMENT DETAILS: ");
		System.out.println("Balance - Device Cashout: " + OMTAcqui.get_DevCashout().getAttribute("value"));
		System.out.println("Account - Device Cashout: " + OMTAcqui.get_DevCashout_Account().getAttribute("value"));
		System.out.println("Amount Due - Device Cashout: " + OMTAcqui.get_DevCashout_AmountDue().getAttribute("value"));
		System.out.println("Payment ID - Device Cashout: " + OMTAcqui.get_DevCashout_PaymentID().getAttribute("value"));

		System.out.println("Balance - PTF: " + OMTAcqui.get_PTF().getAttribute("value"));
		System.out.println("Account - PTF: " + OMTAcqui.get_PTF_Account().getAttribute("value"));
		System.out.println("Amount Due - PTF: " + OMTAcqui.get_PTF_AmountDue().getAttribute("value"));
		System.out.println("Payment ID - PTF: " + OMTAcqui.get_PTF_PaymentId().getAttribute("value"));

		System.out.println("Request Payment: ");
		System.out.println("Preferred Payment Method: " + OMTAcqui.get_ReqPay_PayMethod().getAttribute("value"));
		System.out.println("Total Amount: " + OMTAcqui.get_ReqPay_TotalAmount().getAttribute("value"));
		System.out.println("Payment Method: " + OMTAcqui.get_ReqPay_PaymentMethod().getAttribute("value"));
		System.out.println("Date of Link Sending: " + OMTAcqui.get_ReqPay_DateLinkSeeding().getAttribute("value"));
		System.out.println("Payment Reference: " + OMTAcqui.get_ReqPay_PayReference().getAttribute("value"));
		System.out.println("Status of Payment: " + OMTAcqui.get_ReqPay_StatusPayment().getAttribute("value"));

		System.out.println("Payment Posting Details: ");
		System.out.println("Transaction Date: " + OMTAcqui.get_PostDet_TransacDate().getAttribute("value"));
		System.out.println("Payment ID: " + OMTAcqui.get_PostDet_PayID().getAttribute("value"));
		System.out.println("Posting Remarks: " + OMTAcqui.get_PostDet_PostingRemarks().getAttribute("value"));
		System.out.println("Invoice ID: " + OMTAcqui.get_PostDet_InvoiceID().getAttribute("value"));
		System.out.println("OR: " + OMTAcqui.get_PostDet_OR().getAttribute("value"));
	}


	public void Validate_FullfillmentDetails() {
		BP.scroll_vertical(530);
		JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
		js1.executeScript("arguments[0].click();", OMTAcqui.get_fullfill());

		if (OMTAcqui.get_FulfillDet_PALrbtn().isSelected()) {
			System.out.println("PAL is selected");
		} else if (OMTAcqui.get_FulfillDet_FSOrbtn().isSelected()) {
			System.out.println("FSO TD is selected");
		} else if (OMTAcqui.get_FulfillDet_RSOrbtn().isSelected()) {
			System.out.println("RSO TD is selected");
		} else {
			System.out.println("No Fullfilmen selected - Failed");
		}

		if (OMTAcqui.get_FulfillDet_Xpressrbtn().isSelected()) {
			System.out.println("Express Delivery is selected");
		} else if (OMTAcqui.get_FulfillDet_Regularrbtn().isSelected()) {
			System.out.println("Regular Delivery is selected");
		}
		System.out.println("Pickup Hub: " + OMTAcqui.get_FulfillDet_PickupHub().getAttribute("value"));
		System.out.println("Assigned Courier: " + OMTAcqui.get_FulfillDet_AssignedCourier().getAttribute("value"));
		System.out.println("Assigned Agent: " + OMTAcqui.get_FulfillDet_AssignedAgent().getAttribute("value"));
		System.out.println("Schedule: " + OMTAcqui.get_FulfillDet_Schedule().getAttribute("value"));
		System.out.println("Status: " + OMTAcqui.get_FulfillDet_Status().getAttribute("value"));
		System.out.println("Remarks: " + OMTAcqui.get_FulfillDet_Remarks().getAttribute("value"));

	}

	public void Validate_activationdetails() {
		if(OMTAcqui.isElementExist("ActivationDetails", "activation", 10))
				{
				BP.scroll_vertical(550);
		JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
		js1.executeScript("arguments[0].click();", OMTAcqui.get_activation());

		System.out.println("ActChannel: " + OMTAcqui.get_ActChannel().getAttribute("value"));
		System.out.println("DateofActivation: " + OMTAcqui.get_DateofActivation().getAttribute("value"));
		System.out.println("TimeofActivation: " + OMTAcqui.get_TimeofActivation().getAttribute("value"));
				}
	}

	public void Validate_planeprovisioningdetails() {
		
		BP.scroll_vertical(580);
		if(OMTAcqui.isElementExist("PlanProvisioning details", "planpro", 10))
		{
		JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
		js1.executeScript("arguments[0].click();", OMTAcqui.get_planpro());

		System.out.println("dateOfPlanProvisioning: " + OMTAcqui.get_dateOfPlanProvisioning().getAttribute("value"));
		System.out.println("timeOfPlanProvisioning: " + OMTAcqui.get_timeOfPlanProvisioning().getAttribute("value"));
		System.out.println("dateOfOrderClosing: " + OMTAcqui.get_dateOfOrderClosing().getAttribute("value"));
		System.out.println("timeOfOrderClosing: " + OMTAcqui.get_timeOfOrderClosing().getAttribute("value"));
		System.out.println("startDateOfContract: " + OMTAcqui.get_startDateOfContract().getAttribute("value"));
		System.out.println("endDateOfContract: " + OMTAcqui.get_endDateOfContract().getAttribute("value"));
		}
	}
	public void Validate_SEEDINGDETAILS() {
		if(OMTAcqui.isElementExist("SeedingDetails", "seeding", 10))
		{
		BP.scroll_vertical(600);
		JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
		js1.executeScript("arguments[0].click();", OMTAcqui.get_seeding());

		System.out.println("GCashAccount: " + OMTAcqui.get_GCashAccount().getAttribute("value"));
		System.out.println("GCashTagging: " + OMTAcqui.get_GCashTagging().getAttribute("value"));
		System.out.println("SeedingReference: " + OMTAcqui.get_SeedingReference().getAttribute("value"));
		System.out.println("SeedingDate: " + OMTAcqui.get_SeedingDate().getAttribute("value"));
		}
	}

	public void Validate_CALLOUTANDRECOVERY() {
		if(OMTAcqui.isElementExist("CalloutAndRecovery", "callout", 10))
		{
		BP.scroll_vertical(630);
		JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
		js1.executeScript("arguments[0].click();", OMTAcqui.get_callout());

		System.out.println("CalloutReason: " + OMTAcqui.get_CalloutReason().getAttribute("value"));
		System.out.println("CallAttempt: " + OMTAcqui.get_CallAttempt().getAttribute("value"));
		System.out.println("CalloutData: " + OMTAcqui.get_CalloutData().getAttribute("value"));
		System.out.println("CalloutDisposition: " + OMTAcqui.get_CalloutDisposition().getAttribute("value"));
		System.out.println("CalloutNotes: " + OMTAcqui.get_CalloutNotes().getAttribute("value"));
		}
	}

	public void Validate_REFUNDDETAILS() {
		BP.scroll_vertical(650);
		JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
		js1.executeScript("arguments[0].click();", OMTAcqui.get_refound());

		System.out.println("RefundRequestDate: " + OMTAcqui.get_RefundRequestDate().getAttribute("value"));
		System.out.println("ValidAmountforRefund: " + OMTAcqui.get_ValidAmountforRefund().getAttribute("value"));
		System.out.println("IssuingBank_Partner: " + OMTAcqui.get_IssuingBank_Partner().getAttribute("value"));
		System.out.println("CardNumber: " + OMTAcqui.get_CardNumber().getAttribute("value"));
		System.out.println("AccountName: " + OMTAcqui.get_AccountName().getAttribute("value"));
		System.out.println(
				"Authorization_ApprovalCode: " + OMTAcqui.get_Authorization_ApprovalCode().getAttribute("value"));
		System.out.println("Remarks: " + OMTAcqui.get_Remarks().getAttribute("value"));
		System.out.println("RefundReference: " + OMTAcqui.get_RefundReference().getAttribute("value"));
	}


	public void Validate_ORDERHISTORY() throws Exception {
		BP.scroll_vertical(690);
		JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
		js1.executeScript("arguments[0].click();", OMTAcqui.get_orderh());

		if (!(OMTAcqui.get_OrderReceived().getText().isEmpty())) {
			System.out.println("OrderReceived: " + OMTAcqui.get_OrderReceived().getText());
		} else {
			System.out.println("OrderReceived: " + OMTAcqui.get_OrderReceived().getAttribute("value"));

		}
		if (!(OMTAcqui.get_AutomaticUpdate().getText().isEmpty())) {
			System.out.println("AutomaticUpdate: " + OMTAcqui.get_AutomaticUpdate().getText());

		} else {
			System.out.println("AutomaticUpdate: " + OMTAcqui.get_AutomaticUpdate().getAttribute("value"));

		}

		if (!(OMTAcqui.get_DateOrder().getText().isEmpty())) {
			System.out.println("DateOrder: " + OMTAcqui.get_DateOrder().getText());
		} else {
			System.out.println("DateOrder: " + OMTAcqui.get_DateOrder().getAttribute("value"));

		}

		if (OMTAcqui.isElementExist("update date", "AutomaticUpdateDate", 5)) {
			System.out.println("AutomaticUpadateDate: " + OMTAcqui.get_AutomaticUpdateDate().getText());
			// System.out.println("AutomaticUpadateDate: " +
			// OMTAcqui.get_AutomaticUpdateDate().getAttribute("value"));
			Constant.dataMap.get().put("OMT_UpdateDate", OMTAcqui.get_AutomaticUpdateDate().getText());
			util.writeToExcelExistingRowFromMap("Sheet1", Constant.dataMap.get(), Constant.ScenarioName, 1);
		}

	}

	
	/*********************************************************************************************/
	public void ongoingVerification(String Status) throws Exception {

		// Order
		OMTAcqui.select_Approved(Status);
		System.out.println("Updated Status to : " + Status);
		Thread.sleep(2000L);

		BP.scroll_vertical(400);
		JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
		js1.executeScript("arguments[0].click();", OMTAcqui.get_doumentsub());

		OMTAcqui.get_POID_Verficationfinding1().clear();
		OMTAcqui.get_POID_Verficationfinding1().sendKeys(Status);

		System.out
				.println("POID VERIFICATION FINDING:" + OMTAcqui.get_POID_Verficationfinding1().getAttribute("value"));

		OMTAcqui.get_POFC_Verficationfinding1().clear();
		OMTAcqui.get_POFC_Verficationfinding1().sendKeys(Status);

		System.out
				.println("POFC VERIFICATION FINDING:" + OMTAcqui.get_POFC_Verficationfinding1().getAttribute("value"));

		JavascriptExecutor js2 = (JavascriptExecutor) DriverManager.getDriver();
		js2.executeScript("arguments[0].click();", OMTAcqui.get_Savebutton());

		BP.scroll_vertical(690);
		JavascriptExecutor js6 = (JavascriptExecutor) DriverManager.getDriver();
		js6.executeScript("arguments[0].click();", OMTAcqui.get_confirmcorrect());

	}

	// *********************************************************************************************************
	public void Approved(String Status) throws Exception {

		// Order
		OMTAcqui.select_Approved(Status);
		System.out.println("Updated Status to : " + Status);
		Thread.sleep(2000L);

		BP.scroll_vertical(400);

		JavascriptExecutor js3 = (JavascriptExecutor) DriverManager.getDriver();
		js3.executeScript("arguments[0].click();", OMTAcqui.get_doumentsub());
		///////////////////////
		OMTAcqui.get_POID_Number().clear();
		OMTAcqui.get_POID_Number().sendKeys("p005643");
		System.out.println("POID Number: " + OMTAcqui.get_POID_Number().getAttribute("value"));
		///////////////////////
		OMTAcqui.select_POID_Verification(Status);
		System.out.println("POID Verification: " + OMTAcqui.get_POID_Verification().getAttribute("value"));

		// OMTAcqui.get_POID_DateReviewed().sendKeys("05252022");

		OMTAcqui.get_POID_Verficationfinding1().clear();
		OMTAcqui.get_POID_Verficationfinding1().sendKeys(Status);

		System.out
				.println("POID VERIFICATION FINDING:" + OMTAcqui.get_POID_Verficationfinding1().getAttribute("value"));

		OMTAcqui.select_POFC_Verification(Status);
		System.out.println("POFC Verification: " + OMTAcqui.get_POFC_Verification().getAttribute("value"));
		// OMTAcqui.get_POFC_DateReviewed().sendKeys("05252022");

		OMTAcqui.get_POFC_Verficationfinding1().clear();
		OMTAcqui.get_POFC_Verficationfinding1().sendKeys(Status);

		System.out
				.println("POFC VERIFICATION FINDING:" + OMTAcqui.get_POFC_Verficationfinding1().getAttribute("value"));

		JavascriptExecutor js2 = (JavascriptExecutor) DriverManager.getDriver();
		js2.executeScript("arguments[0].click();", OMTAcqui.get_Savebutton());

		BP.scroll_vertical(690);
		JavascriptExecutor js6 = (JavascriptExecutor) DriverManager.getDriver();
		js6.executeScript("arguments[0].click();", OMTAcqui.get_confirmcorrect());

		//
	}

	// *********************************************************************************************************
	// *********************************************************************************************************
	public void ForComplaincePOFC(String Status) throws Exception {

		// Order
		OMTAcqui.select_Approved(Status);
		System.out.println("Approved : " + Status);
		Thread.sleep(2000L);

		BP.scroll_vertical(400);

		JavascriptExecutor js3 = (JavascriptExecutor) DriverManager.getDriver();
		js3.executeScript("arguments[0].click();", OMTAcqui.get_doumentsub());

		OMTAcqui.get_POID_Number().clear();
		OMTAcqui.get_POID_Number().sendKeys("p005643");
		System.out.println("POID Number: " + OMTAcqui.get_POID_Number().getAttribute("value"));

		OMTAcqui.select_POID_Verification("Approved");
		System.out.println("POID Verification: " + OMTAcqui.get_POID_Verification().getAttribute("value"));

		// OMTAcqui.get_POID_DateReviewed().sendKeys("05252022");

		OMTAcqui.get_POID_Verficationfinding1().clear();
		OMTAcqui.get_POID_Verficationfinding1().sendKeys("ONGOING VERFICATION");

		System.out
				.println("POID VERIFICATION FINDING:" + OMTAcqui.get_POID_Verficationfinding1().getAttribute("value"));

		OMTAcqui.select_POFC_Verification("Disapproved");
		System.out.println("POFC Verification: " + OMTAcqui.get_POFC_Verification().getAttribute("value"));
		// OMTAcqui.get_POFC_DateReviewed().sendKeys("05252022");

		OMTAcqui.get_POFC_Verficationfinding1().clear();
		OMTAcqui.get_POFC_Verficationfinding1().sendKeys("ONGOING VERFICATION");

		System.out
				.println("POFC VERIFICATION FINDING:" + OMTAcqui.get_POFC_Verficationfinding1().getAttribute("value"));

		JavascriptExecutor js2 = (JavascriptExecutor) DriverManager.getDriver();
		js2.executeScript("arguments[0].click();", OMTAcqui.get_Savebutton());

		BP.scroll_vertical(690);
		JavascriptExecutor js6 = (JavascriptExecutor) DriverManager.getDriver();
		js6.executeScript("arguments[0].click();", OMTAcqui.get_confirmcorrect());

		//
	}
	// *********************************************************************************************************

	// *********************************************************************************************************
	public void ForComplaincePOID_POFC(String Status) throws Exception {

		// Order
		OMTAcqui.select_Approved(Status);
		System.out.println("Approved : " + Status);
		Thread.sleep(2000L);

		BP.scroll_vertical(400);

		JavascriptExecutor js3 = (JavascriptExecutor) DriverManager.getDriver();
		js3.executeScript("arguments[0].click();", OMTAcqui.get_doumentsub());

		OMTAcqui.get_POID_Number().clear();
		OMTAcqui.get_POID_Number().sendKeys("p005643");
		System.out.println("POID Number: " + OMTAcqui.get_POID_Number().getAttribute("value"));

		OMTAcqui.select_POID_Verification("Disapproved");
		System.out.println("POID Verification: " + OMTAcqui.get_POID_Verification().getAttribute("value"));

		// OMTAcqui.get_POID_DateReviewed().sendKeys("05252022");

		OMTAcqui.get_POID_Verficationfinding1().clear();
		OMTAcqui.get_POID_Verficationfinding1().sendKeys("ONGOING VERFICATION");

		System.out
				.println("POID VERIFICATION FINDING:" + OMTAcqui.get_POID_Verficationfinding1().getAttribute("value"));

		OMTAcqui.select_POFC_Verification("Disapproved");
		System.out.println("POFC Verification: " + OMTAcqui.get_POFC_Verification().getAttribute("value"));
		// OMTAcqui.get_POFC_DateReviewed().sendKeys("05252022");

		OMTAcqui.get_POFC_Verficationfinding1().clear();
		OMTAcqui.get_POFC_Verficationfinding1().sendKeys("ONGOING VERFICATION");

		System.out
				.println("POFC VERIFICATION FINDING:" + OMTAcqui.get_POFC_Verficationfinding1().getAttribute("value"));

		JavascriptExecutor js2 = (JavascriptExecutor) DriverManager.getDriver();
		js2.executeScript("arguments[0].click();", OMTAcqui.get_Savebutton());

		BP.scroll_vertical(690);
		JavascriptExecutor js6 = (JavascriptExecutor) DriverManager.getDriver();
		js6.executeScript("arguments[0].click();", OMTAcqui.get_confirmcorrect());

		//
	}

	// *********************************************************************************************************
	public void ApprovedPOID(String Status) throws Exception {

		// Order
		OMTAcqui.select_Approved(Status);
		System.out.println("Approved : " + Status);
		Thread.sleep(2000L);

		JavascriptExecutor js3 = (JavascriptExecutor) DriverManager.getDriver();
		js3.executeScript("arguments[0].click();", OMTAcqui.get_doumentsub());

		OMTAcqui.get_POID_Number().clear();
		OMTAcqui.get_POID_Number().sendKeys("p005643");
		System.out.println("POID Number: " + OMTAcqui.get_POID_Number().getAttribute("value"));

		OMTAcqui.select_POID_Verification("Approved");
		System.out.println("POID Verification: " + OMTAcqui.get_POID_Verification().getAttribute("value"));

		OMTAcqui.get_POID_DateReviewed().sendKeys("05252022");

		// OMTAcqui.select_POFC_Verification("Approved");
		// System.out.println("POFC Verification: " +
		// OMTAcqui.get_POFC_Verification().getAttribute("value"));
		// OMTAcqui.get_POFC_DateReviewed().sendKeys("05252022");
		//

		JavascriptExecutor js2 = (JavascriptExecutor) DriverManager.getDriver();
		js2.executeScript("arguments[0].click();", OMTAcqui.get_Savebutton());

		BP.scroll_vertical(690);
		JavascriptExecutor js6 = (JavascriptExecutor) DriverManager.getDriver();
		js6.executeScript("arguments[0].click();", OMTAcqui.get_confirmcorrect());

		//
	}

	// *********************************************************************************************************
	public void ReservedPhysicalStock(String Status) throws Exception {

		// Order
		OMTAcqui.select_Approved(Status);
		System.out.println("ReservedPhysicalStock : " + Status);
		Thread.sleep(2000L);

		BP.scroll_vertical(380);
		JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
		js1.executeScript("arguments[0].click();", OMTAcqui.get_orderdetails());

		OMTAcqui.get_ReservationID().sendKeys("9845673216");

		System.out.println("Reservation ID: " + OMTAcqui.get_ReservationID().getAttribute("value"));

		JavascriptExecutor js2 = (JavascriptExecutor) DriverManager.getDriver();
		js2.executeScript("arguments[0].click();", OMTAcqui.get_Savebutton());

		BP.scroll_vertical(690);
		JavascriptExecutor js6 = (JavascriptExecutor) DriverManager.getDriver();
		js6.executeScript("arguments[0].click();", OMTAcqui.get_confirmcorrect());

	}

	/***********************************************************************************************************/

	public void Requestpayment(String Status) throws Exception {

		// Order
		OMTAcqui.select_Approved(Status);
		System.out.println("Requestpayment : " + Status);
		Thread.sleep(2000L);

		JavascriptExecutor js2 = (JavascriptExecutor) DriverManager.getDriver();
		js2.executeScript("arguments[0].click();", OMTAcqui.get_orderdetails());

		///////////////////////////////////////////////////////

		OMTAcqui.get_BSSOrderID().sendKeys("764532");
		System.out.println("BSS Order ID: " + OMTAcqui.get_BSSOrderID().getAttribute("value"));

		OMTAcqui.get_BSSOrderCaseID().sendKeys("43725");
		System.out.println("BSS Order Case ID: " + OMTAcqui.get_BSSOrderCaseID().getAttribute("value"));
		OMTAcqui.get_NewMobileNumber().clear();
		OMTAcqui.get_NewMobileNumber().sendKeys("09270000112");
		System.out.println("New Mobile Number: " + OMTAcqui.get_NewMobileNumber().getAttribute("value"));

		JavascriptExecutor jsp = (JavascriptExecutor) DriverManager.getDriver();
		jsp.executeScript("arguments[0].click();", OMTAcqui.get_postpaid());

		OMTAcqui.get_CustDet_FAID().sendKeys("452738");
		System.out.println("FA ID: " + OMTAcqui.get_CustDet_FAID().getAttribute("value"));

		OMTAcqui.get_CustDet_BAID().sendKeys("829384");
		System.out.println("Billing Arrangement ID (BA ID): " + OMTAcqui.get_CustDet_BAID().getAttribute("value"));

		OMTAcqui.get_CustDet_ContactID().sendKeys("863945");
		System.out.println("Contact ID: " + OMTAcqui.get_CustDet_ContactID().getAttribute("value"));

		///////////////////////////////////

		JavascriptExecutor jss = (JavascriptExecutor) DriverManager.getDriver();
		jss.executeScript("arguments[0].click();", OMTAcqui.get_Savebutton());

		BP.scroll_vertical(690);
		JavascriptExecutor js6 = (JavascriptExecutor) DriverManager.getDriver();
		js6.executeScript("arguments[0].click();", OMTAcqui.get_confirmcorrect());

	}

	/*************************************************************************************************************/
	public void RequestpaymentFTA1(String Status) throws Exception {

		// Order
		OMTAcqui.select_Approved(Status);
		System.out.println("Requestpayment : " + Status);
		Thread.sleep(2000L);
		BP.scroll_vertical(480);
		JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
		js1.executeScript("arguments[0].click();", OMTAcqui.get_payment());

		OMTAcqui.get_ReqPay_DateLinkSeeding().sendKeys("DATE");
		System.out.println("Date of Link Sending: " + OMTAcqui.get_ReqPay_DateLinkSeeding().getAttribute("value"));

		OMTAcqui.get_ReqPay_PayReference().sendKeys("FreeText");
		System.out.println("Payment Reference: " + OMTAcqui.get_ReqPay_PayReference().getAttribute("value"));

		OMTAcqui.select_get_ReqPay_StatusPayment("Pending");
		System.out.println("Status of Payment: " + OMTAcqui.get_ReqPay_StatusPayment().getAttribute("value"));

		JavascriptExecutor jss = (JavascriptExecutor) DriverManager.getDriver();
		jss.executeScript("arguments[0].click();", OMTAcqui.get_Savebutton());

		BP.scroll_vertical(690);
		JavascriptExecutor js6 = (JavascriptExecutor) DriverManager.getDriver();
		js6.executeScript("arguments[0].click();", OMTAcqui.get_confirmcorrect());

	}

	public void RequestpaymentFTA11(String Status) throws Exception {

		// Order
		OMTAcqui.select_Approved(Status);
		System.out.println("Requestpayment : " + Status);
		Thread.sleep(2000L);
		BP.scroll_vertical(480);
		JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
		js1.executeScript("arguments[0].click();", OMTAcqui.get_payment());

		OMTAcqui.get_ReqPay_DateLinkSeeding().sendKeys("DATE");
		System.out.println("Date of Link Sending: " + OMTAcqui.get_ReqPay_DateLinkSeeding().getAttribute("value"));

		OMTAcqui.get_ReqPay_PayReference().sendKeys("FreeText");
		System.out.println("Payment Reference: " + OMTAcqui.get_ReqPay_PayReference().getAttribute("value"));

		OMTAcqui.select_get_ReqPay_StatusPayment("Paid");
		System.out.println("Status of Payment: " + OMTAcqui.get_ReqPay_StatusPayment().getAttribute("value"));

		JavascriptExecutor jss = (JavascriptExecutor) DriverManager.getDriver();
		jss.executeScript("arguments[0].click();", OMTAcqui.get_Savebutton());

		BP.scroll_vertical(690);
		JavascriptExecutor js6 = (JavascriptExecutor) DriverManager.getDriver();
		js6.executeScript("arguments[0].click();", OMTAcqui.get_confirmcorrect());

	}

	public void Awaitingpayment(String Status, String PayementReference, String StatusPayment) throws Exception {

		// Order
		OMTAcqui.select_Approved(Status);
		System.out.println("Awaitingpayment : " + Status);
		Thread.sleep(2000L);

		////////////////////////////////////////////////////////////////////////////////////////
		JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
		js1.executeScript("arguments[0].click();", OMTAcqui.get_payment());

		OMTAcqui.get_ReqPay_DateLinkSeeding().sendKeys(Constant.DateLinkSeeding);
		OMTAcqui.get_ReqPay_DateLinkSeeding().sendKeys(Keys.SPACE);
		OMTAcqui.get_ReqPay_DateLinkSeeding().sendKeys(Keys.ENTER);

		System.out.println("Date of Link Sending: " + OMTAcqui.get_ReqPay_DateLinkSeeding().getAttribute("value"));
		OMTAcqui.get_ReqPay_PayReference().sendKeys(PayementReference);
		// make payment Reference as "Pending" for NON happy path(cancelled
		// flow)

		System.out.println("Payment Reference: " + OMTAcqui.get_ReqPay_PayReference().getAttribute("value"));
		OMTAcqui.get_ReqPay_StatusPayment().sendKeys(Constant.StatusPay_happypath);
		System.out.println("Status of Payment: " + OMTAcqui.get_ReqPay_StatusPayment().getAttribute("value"));

		///////////////////////////////////////////////////////////////////////////////////////////////////////////

		JavascriptExecutor jss = (JavascriptExecutor) DriverManager.getDriver();
		jss.executeScript("arguments[0].click();", OMTAcqui.get_Savebutton());

		BP.scroll_vertical(690);
		JavascriptExecutor js6 = (JavascriptExecutor) DriverManager.getDriver();
		js6.executeScript("arguments[0].click();", OMTAcqui.get_confirmcorrect());

	}

	/*****************************************************************************************************************/

	public void forproccessing(String Status) throws Exception {

		// Order
		OMTAcqui.select_Approved(Status);
		System.out.println("forproccessing : " + Status);
		Thread.sleep(2000L);

		BP.scroll_vertical(380);
		JavascriptExecutor js2 = (JavascriptExecutor) DriverManager.getDriver();
		js2.executeScript("arguments[0].click();", OMTAcqui.get_orderdetails());

		/*
		 * OMTAcqui.get_ReservationID().clear();
		 * OMTAcqui.get_ReservationID().sendKeys("8745321678");
		 * System.out.println("Reservation ID: " +
		 * OMTAcqui.get_ReservationID().getAttribute("value"));
		 */

		String g = OMTAcqui.get_DeliveryCaseTitle().getAttribute("value");
		if (g.isEmpty()) {
			OMTAcqui.get_DeliveryCaseTitle().sendKeys("Test");
		}
		String h = OMTAcqui.get_DeliveryQueueName().getAttribute("value");
		if (h.isEmpty()) {
			OMTAcqui.get_DeliveryQueueName().sendKeys("Test");
		}
		String a = OMTAcqui.get_BSSOrderID().getAttribute("value");
		if (a.isEmpty()) {
			OMTAcqui.get_BSSOrderID().sendKeys("764532");
			System.out.println("BSS Order ID: " + OMTAcqui.get_BSSOrderID().getAttribute("value"));
		}
		String b = OMTAcqui.get_BSSOrderCaseID().getAttribute("value");
		if (b.isEmpty()) {
			OMTAcqui.get_BSSOrderCaseID().sendKeys("43725");

			System.out.println("BSS Order Case ID: " + OMTAcqui.get_BSSOrderCaseID().getAttribute("value"));
		}
		String c = OMTAcqui.get_NewMobileNumber().getAttribute("value");
		if (c.isEmpty()) {
			OMTAcqui.get_NewMobileNumber().sendKeys("09270000011");
			System.out.println("New Mobile Number: " + OMTAcqui.get_NewMobileNumber().getAttribute("value"));
		}

		if (OMTAcqui.get_ReservationID_Update().isDisplayed()) {
			OMTAcqui.get_ReservationID().clear();
			OMTAcqui.get_ReservationID().sendKeys("09876543211");
		}
		// if cod use below steps

		BP.scroll_vertical(450);
		JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
		js1.executeScript("arguments[0].click();", OMTAcqui.get_postpaid());

		String d = OMTAcqui.get_CustDet_FAID().getAttribute("value");
		if (d.isEmpty()) {
			OMTAcqui.get_CustDet_FAID().sendKeys("967435");
			System.out.println("FA ID: " + OMTAcqui.get_CustDet_FAID().getAttribute("value"));
		}
		String e = OMTAcqui.get_CustDet_BAID().getAttribute("value");
		if (e.isEmpty()) {
			OMTAcqui.get_CustDet_BAID().sendKeys("764325");
			System.out.println("Billing Arrangement ID (BA ID): " + OMTAcqui.get_CustDet_BAID().getAttribute("value"));
		}

		String f = OMTAcqui.get_CustDet_ContactID().getAttribute("value");
		if (f.isEmpty()) {
			OMTAcqui.get_CustDet_ContactID().sendKeys("09270000133");
			System.out.println("Contact ID: " + OMTAcqui.get_CustDet_ContactID().getAttribute("value"));
		}

		JavascriptExecutor jss = (JavascriptExecutor) DriverManager.getDriver();

		jss.executeScript("arguments[0].click();", OMTAcqui.get_Savebutton());

		BP.scroll_vertical(690);
		JavascriptExecutor js6 = (JavascriptExecutor) DriverManager.getDriver();
		js6.executeScript("arguments[0].click();", OMTAcqui.get_confirmcorrect());

	}
	// public void AssignAgent(String agentName) throws Exception{
	// if(OMTAcqui.isElementExist("Checkbox Button", "Checkbox", 10)) {
	// OMTAcqui.clickOnElement("AssignAgent: ", "Checkox", "Checkbox");
	// OMTAcqui.clickOnElement("AssignAgent: ", "Assign_checbox",
	// "Assign_Checkbox");
	//
	// OMTAcqui.get_SelectAdmin().sendKeys(agentName);
	//
	// OMTAcqui.clickOnElement("AssignAgent: ", "FSO", "SelectFSO");
	//
	// OMTAcqui.clickOnElement("AssignAgent: ", "Assignbutton", "Assign_btn");
	//
	//
	// }
	// }


	/**************************************************************************************************************/
	public void processed(String Status) throws Exception {

		// Order
		OMTAcqui.select_Approved(Status);
		System.out.println("processed : " + Status);
		Thread.sleep(2000L);
		BP.scroll_vertical(380);
		JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
		js1.executeScript("arguments[0].click();", OMTAcqui.get_orderdetails());

		OMTAcqui.get_ReservationID().clear();
		OMTAcqui.get_ReservationID().sendKeys("9845321678");
		System.out.println("Reservation ID: " + OMTAcqui.get_ReservationID().getAttribute("value"));

		JavascriptExecutor jss = (JavascriptExecutor) DriverManager.getDriver();
		jss.executeScript("arguments[0].click();", OMTAcqui.get_Savebutton());

		BP.scroll_vertical(690);
		JavascriptExecutor js6 = (JavascriptExecutor) DriverManager.getDriver();
		js6.executeScript("arguments[0].click();", OMTAcqui.get_confirmcorrect());

	}


	public void Fordelivery(String Status) throws Exception {

		// Order
		OMTAcqui.select_Approved(Status);
		System.out.println("Fordelivery : " + Status);
		Thread.sleep(2000L);
		JavascriptExecutor jss = (JavascriptExecutor) DriverManager.getDriver();
		jss.executeScript("arguments[0].click();", OMTAcqui.get_Savebutton());

		BP.scroll_vertical(690);
		JavascriptExecutor js6 = (JavascriptExecutor) DriverManager.getDriver();
		js6.executeScript("arguments[0].click();", OMTAcqui.get_confirmcorrect());

	}

	public void ForRedelivery1(String Status) throws Exception {

		// Order
		OMTAcqui.select_Approved(Status);
		System.out.println("ForRedelivery : " + Status);
		Thread.sleep(2000L);
		BP.scroll_vertical(530);
		JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
		js1.executeScript("arguments[0].click();", OMTAcqui.get_fullfill());

		OMTAcqui.get_FulfillDet_Schedule().sendKeys("07/19/2022");
		System.out.println("Schedule: " + OMTAcqui.get_FulfillDet_Schedule().getAttribute("value"));
		OMTAcqui.select_get_FulfillDet_Status("Not Received");
		System.out.println("Status: " + OMTAcqui.get_FulfillDet_Status().getAttribute("value"));
		OMTAcqui.select_FulfillDet_Remarks("1st Delivery Attempt Failed");
		System.out.println("Remarks: " + OMTAcqui.get_FulfillDet_Remarks().getAttribute("value"));

		JavascriptExecutor jss = (JavascriptExecutor) DriverManager.getDriver();
		jss.executeScript("arguments[0].click();", OMTAcqui.get_Savebutton());

		BP.scroll_vertical(690);
		JavascriptExecutor js6 = (JavascriptExecutor) DriverManager.getDriver();
		js6.executeScript("arguments[0].click();", OMTAcqui.get_confirmcorrect());

	}

	public void ForRedelivery2(String Status) throws Exception {

		// Order
		OMTAcqui.select_Approved(Status);
		System.out.println("ForRedelivery : " + Status);
		Thread.sleep(2000L);
		BP.scroll_vertical(530);
		JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
		js1.executeScript("arguments[0].click();", OMTAcqui.get_fullfill());

		JavascriptExecutor jsrow = (JavascriptExecutor) DriverManager.getDriver();
		jsrow.executeScript("arguments[0].click();", OMTAcqui.get_addnewrow());

		OMTAcqui.get_FulfillDet_Schedule().sendKeys("07/20/2022");
		System.out.println("Schedule: " + OMTAcqui.get_FulfillDet_Schedule().getAttribute("value"));

		OMTAcqui.select_get_FulfillDet_Status("Not Received");
		System.out.println("Status: " + OMTAcqui.get_FulfillDet_Status().getAttribute("value"));

		OMTAcqui.select_FulfillDet_Remarks("2nd Delivery Attempt Failed");
		System.out.println("Remarks: " + OMTAcqui.get_FulfillDet_Remarks().getAttribute("value"));

		JavascriptExecutor jss = (JavascriptExecutor) DriverManager.getDriver();
		jss.executeScript("arguments[0].click();", OMTAcqui.get_Savebutton());

		BP.scroll_vertical(690);
		JavascriptExecutor js6 = (JavascriptExecutor) DriverManager.getDriver();
		js6.executeScript("arguments[0].click();", OMTAcqui.get_confirmcorrect());

	}

	public void ForRedelivery3(String Status) throws Exception {

		// Order
		OMTAcqui.select_Approved(Status);
		System.out.println("ForRedelivery : " + Status);
		Thread.sleep(2000L);
		BP.scroll_vertical(530);
		JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
		js1.executeScript("arguments[0].click();", OMTAcqui.get_fullfill());

		JavascriptExecutor jsrow = (JavascriptExecutor) DriverManager.getDriver();
		jsrow.executeScript("arguments[0].click();", OMTAcqui.get_addnewrow());

		OMTAcqui.get_FulfillDet_Schedule().sendKeys("07/25/2022");
		System.out.println("Schedule: " + OMTAcqui.get_FulfillDet_Schedule().getAttribute("value"));

		OMTAcqui.select_get_FulfillDet_Status("Not Received");
		System.out.println("Status: " + OMTAcqui.get_FulfillDet_Status().getAttribute("value"));

		OMTAcqui.select_FulfillDet_Remarks("3rd Delivery Attempt Failed");
		System.out.println("Remarks: " + OMTAcqui.get_FulfillDet_Remarks().getAttribute("value"));

		JavascriptExecutor jss = (JavascriptExecutor) DriverManager.getDriver();
		jss.executeScript("arguments[0].click();", OMTAcqui.get_Savebutton());

		BP.scroll_vertical(690);
		JavascriptExecutor js6 = (JavascriptExecutor) DriverManager.getDriver();
		js6.executeScript("arguments[0].click();", OMTAcqui.get_confirmcorrect());

	}

	public void Delivered(String Status) throws Exception {

		// Order
		OMTAcqui.select_Approved(Status);
		System.out.println("Delivered : " + Status);
		Thread.sleep(2000L);

		JavascriptExecutor jss = (JavascriptExecutor) DriverManager.getDriver();
		jss.executeScript("arguments[0].click();", OMTAcqui.get_Savebutton());

		BP.scroll_vertical(690);
		JavascriptExecutor js6 = (JavascriptExecutor) DriverManager.getDriver();
		js6.executeScript("arguments[0].click();", OMTAcqui.get_confirmcorrect());

	}
	
	public void Foractivation(String Status) throws Exception {

		// Order
		OMTAcqui.select_Approved(Status);
		System.out.println("Foractivation : " + Status);
		Thread.sleep(2000L);

		JavascriptExecutor jss = (JavascriptExecutor) DriverManager.getDriver();
		jss.executeScript("arguments[0].click();", OMTAcqui.get_Savebutton());

		BP.scroll_vertical(690);
		JavascriptExecutor js6 = (JavascriptExecutor) DriverManager.getDriver();
		js6.executeScript("arguments[0].click();", OMTAcqui.get_confirmcorrect());

	}

	public void Activated(String Status) throws Exception {

		// Order
		OMTAcqui.select_Approved(Status);
		System.out.println(" Activated  : " + Status);
		Thread.sleep(2000L);

		BP.scroll_vertical(580);
		JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
		js1.executeScript("arguments[0].click();", OMTAcqui.get_planpro());

		System.out.println("dateOfPlanProvisioning: " + OMTAcqui.get_dateOfPlanProvisioning().getAttribute("value"));
		System.out.println("timeOfPlanProvisioning: " + OMTAcqui.get_timeOfPlanProvisioning().getAttribute("value"));
		System.out.println("dateOfOrderClosing: " + OMTAcqui.get_dateOfOrderClosing().getAttribute("value"));
		System.out.println("timeOfOrderClosing: " + OMTAcqui.get_timeOfOrderClosing().getAttribute("value"));
		System.out.println("startDateOfContract: " + OMTAcqui.get_startDateOfContract().getAttribute("value"));
		System.out.println("endDateOfContract: " + OMTAcqui.get_endDateOfContract().getAttribute("value"));

		JavascriptExecutor jss = (JavascriptExecutor) DriverManager.getDriver();
		jss.executeScript("arguments[0].click();", OMTAcqui.get_Savebutton());

		BP.scroll_vertical(690);
		JavascriptExecutor js6 = (JavascriptExecutor) DriverManager.getDriver();
		js6.executeScript("arguments[0].click();", OMTAcqui.get_confirmcorrect());

	}
	public void completed(String Status) throws Exception {

		// Order
		OMTAcqui.select_Approved(Status);
		System.out.println(" completed  : " + Status);
		Thread.sleep(2000L);

		BP.scroll_vertical(380);
		JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
		js1.executeScript("arguments[0].click();", OMTAcqui.get_orderdetails());

		OMTAcqui.get_ReservationID().clear();
		OMTAcqui.get_ReservationID().sendKeys("9845321678");
		System.out.println("Reservation ID: " + OMTAcqui.get_ReservationID().getAttribute("value"));
		BP.scroll_vertical(380);
		JavascriptExecutor js2 = (JavascriptExecutor) DriverManager.getDriver();
		js2.executeScript("arguments[0].click();", OMTAcqui.get_payment());

		OMTAcqui.get_PostDet_TransacDate().sendKeys("05262022");
		System.out.println("Transaction Date: " + OMTAcqui.get_PostDet_TransacDate().getAttribute("value"));

		OMTAcqui.get_PostDet_PayID().sendKeys("3472892");
		System.out.println("Payment ID: " + OMTAcqui.get_PostDet_PayID().getAttribute("value"));
		OMTAcqui.get_PostDet_PostingRemarks().sendKeys("4327156");
		System.out.println("Posting Remarks: " + OMTAcqui.get_PostDet_PostingRemarks().getAttribute("value"));
		OMTAcqui.get_PostDet_InvoiceID().sendKeys("56831854842");
		System.out.println("Invoice ID: " + OMTAcqui.get_PostDet_InvoiceID().getAttribute("value"));

		JavascriptExecutor jss = (JavascriptExecutor) DriverManager.getDriver();
		jss.executeScript("arguments[0].click();", OMTAcqui.get_Savebutton());

		BP.scroll_vertical(690);
		JavascriptExecutor js6 = (JavascriptExecutor) DriverManager.getDriver();
		js6.executeScript("arguments[0].click();", OMTAcqui.get_confirmcorrect());

	}

	// *********************************************************************************************************
	public void Signout() throws Exception {

		// Order
		OMTAcqui.isElementExist("Order", "AccountBtn", 10);
		Thread.sleep(4000);
		JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
		js1.executeScript("arguments[0].click();", OMTAcqui.get_Account());

		JavascriptExecutor js2 = (JavascriptExecutor) DriverManager.getDriver();
		js2.executeScript("arguments[0].click();", OMTAcqui.get_Account_Signout());

		/*
		 * JavascriptExecutor js4 = (JavascriptExecutor)
		 * DriverManager.getDriver(); js4.executeScript("arguments[0].click();",
		 * OMTAcqui.get_Account());
		 * 
		 * JavascriptExecutor js3 = (JavascriptExecutor)
		 * DriverManager.getDriver(); js3.executeScript("arguments[0].click();",
		 * OMTAcqui.get_Account_Signin());
		 * 
		 * JavascriptExecutor js5 = (JavascriptExecutor)
		 * DriverManager.getDriver(); js5.executeScript("arguments[0].click();",
		 * OMTAcqui.get_OKTA_SSO_Btn());
		 */

	}
	public void IacceptClick() throws InterruptedException {
		if (OMTAcqui.isElementExist("Cookies Notification", "cookiesNotification", 10)) {
			// if (OMTAcqui.isClickable("privacyAccept", 5)) {
			// HPW.clickOnElement("Link", "privacy Accept", "privacyAccept");
			JavascriptExecutor js4 = (JavascriptExecutor) DriverManager.getDriver();
			js4.executeScript("arguments[0].click();", OMTAcqui.get_privacyAccept());
			// }
		}
	}


	// *********************************************************************************************************

	public void OMT_Trackmyorderlogin(String ORDERID, String EMAIL) throws Exception {

		Thread.sleep(6000);
if(OMTAcqui.isElementExist("TrackMyOrder", "Trackmyorder", 10))
{
		JavascriptExecutor js4 = (JavascriptExecutor) DriverManager.getDriver();
		js4.executeScript("arguments[0].click();", OMTAcqui.get_Trackmyorder());
		Thread.sleep(9000);

		OMTAcqui.get_Orderid_input().sendKeys(ORDERID);
		OMTAcqui.get_Orderid_email().sendKeys(EMAIL);

		JavascriptExecutor js6 = (JavascriptExecutor) DriverManager.getDriver();
		js6.executeScript("arguments[0].click();", OMTAcqui.get_Trackmyorder_button());
		Thread.sleep(12000);
}
	}

	public void UploadDocuments_POFC() throws InterruptedException, AWTException {
		Upload_RequiredDocPOFC();

		Upload_file2inordertracker();
	submitbutton();

		Thread.sleep(3000);

	}
	public void UploadDocuments_POID_POFC() throws Exception {
		String SCname = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.FlowIdColumnValue);
		if (SCname.contains("Callout")) {
			System.out.println("Documents should not be uploaded");
			Thread.sleep(300000);

		}
		Upload_RequiredDocPOID();

		Upload_File1();

		upload_file();

		// Form.DropDownDisplay2();
		Upload_RequiredDocPOFC();

	Upload_file2inordertracker();
		submitbutton();

		Thread.sleep(3000);
	}

	public void UploadDocuments_POID() throws Exception {
		Upload_RequiredDocPOID();

		Upload_File1();

		upload_file();

	submitbutton();

		Thread.sleep(3000);
	}
	
	// *********************************************************//
	// *********************************************************//
		public void ordertracker_ForDispatch() {
			OMTAcqui.isElementExist("Ordertrackerheading", "MyOrder", 10);
			OMTAcqui.isElementExist("Ordertrackerreferenceno", "referencenumber", 10);
			OMTAcqui.isElementExist("Ordertrackerorderid", "OT_Orderid", 10);
			// OMTAcqui.isElementExist("Ordertracker", "Confirm", 10);
			// OMTAcqui.isElementExist("Ordertracker", "Confirm_Subtitle", 10);
			// OMTAcqui.isElementExist("Ordertracker", "DISAPTCH", 10);
			// OMTAcqui.isElementExist("Ordertracker", "DISAPTCH_Subtitle", 10);
			OMTAcqui.isElementExist("Ordertrackerdispatchheading", "DISAPTCH_Heading", 10);
			// cod
			OMTAcqui.isElementExist("Disaptchdateorderd", "Disaptchdateorderd", 10);
			OMTAcqui.isElementExist("disaptchdateorderdvalue", "disaptchdateorderdvalue", 10);
			OMTAcqui.isElementExist("dispatchamount", "dispatchamount", 10);
			OMTAcqui.isElementExist("dispatchamountvalue", "dispatchamountvalue", 10);

			// for different payment

			// OMTAcqui.isElementExist("Ordertrackerdisaptchdate", "DISAPTCH_Date",
			// 10);
			// OMTAcqui.isElementExist("Ordertrackerdispathchtext", "DISAPTCH_text",
			// 10);
			// //HPW.isElementExist("Ordertracker", "Deliver_text_right", 10);
			// OMTAcqui.isElementExist("Ordertracker", "DISAPTCH_Paymentmethod",
			// 10);
			// OMTAcqui.isElementExist("Ordertracker", "DISAPTCH_Paymentmethod_val",
			// 10);
			// OMTAcqui.isElementExist("Ordertracker", "DISAPTCH_Amountpaid", 10);
			// OMTAcqui.isElementExist("Ordertracker", "DISAPTCH_Amountpaid_Val",
			// 10);
			OMTAcqui.isElementExist("Ordertracker", "DISAPTCH_Shiptothisaddress_Header", 10);
			// OMTAcqui.isElementExist("Ordertracker", "DISAPTCH_Shiptothisaddress",
			// 10);
			// OMTAcqui.isElementExist("Ordertracker", "DISAPTCH_EstimatedDelivery",
			// 10);
			// OMTAcqui.isElementExist("Ordertracker",
			// "DISAPTCH_Estimated_deliverydate", 10);

		}

	// *********************************************************************************************************
		public void ordertracker_ForReDelivery() throws Exception {

			OMTAcqui.isElementExist("Ordertracker", "MyOrder", 10);
			OMTAcqui.isElementExist("Ordertracker", "referencenumber", 10);
			OMTAcqui.isElementExist("Ordertracker", "OT_Orderid", 10);
			OMTAcqui.isElementExist("ForReDelivery title", "ForReDelivery", 10);

			OMTAcqui.isElementExist("Ordertracker Deliver", "Deliver", 10);
			OMTAcqui.isElementExist("Ordertracker Updated Date", "UpdatedDate", 10);

			OMTAcqui.isElementExist("Ordertracker ReDelivery Context content", "ReDeliverContext", 10);
			OMTAcqui.isElementExist("Ordertracker Shipping Address", "Deliver_Shiptothisaddress_Header", 10);

		}

		// *********************************************************************************************************
		public void ordertracker_Cancelled(String Cancelled) throws Exception {

			OMTAcqui.isElementExist("Ordertracker", "referencenumber", 10);
			OMTAcqui.isElementExist("Ordertracker", "OT_Orderid", 10);

			OMTAcqui.isElementExist("Ordertracker Order_Cancelled", "OrderCancelled", 10);
			OMTAcqui.isElementExist("Ordertracker Updated Date", "UpdatedDate", 10);

			OMTAcqui.isElementExist("Ordertracker Order Cancelled Context content", "OrderCancelledContext", 10);

			Constant.dataMap.set(Map);
			Constant.dataMap.get().put("OMT_DispositionStatus", Cancelled);
			util.writeToExcelExistingRowFromMap("Sheet1", Constant.dataMap.get(), Constant.ScenarioName, 1);

		}
	// *********************************************************//
		public void ordertracker_ForDelivery() throws Exception {

			OMTAcqui.isElementExist("Ordertracker My Order", "MyOrder", 10);
			OMTAcqui.isElementExist("Ordertracker Reference Number", "referencenumber", 10);
			OMTAcqui.isElementExist("Ordertracker Order ID", "OT_Orderid", 10);
			OMTAcqui.isElementExist("Ordertracker", "Confirm", 10);
			// OMTAcqui.isElementExist("Ordertracker", "Confirm_Subtitle", 10);
			// OMTAcqui.isElementExist("Ordertracker", "Deliver", 10);
			// OMTAcqui.isElementExist("Ordertracker", "Deliver_Subtitle", 10);
			OMTAcqui.isElementExist("Ordertracker", "Deliver_Heading", 10);
			OMTAcqui.isElementExist("Ordertracker", "Deliver_Date", 10);

			OMTAcqui.isElementExist("Ordertrackeramount haeding", "totalamount", 10);
			OMTAcqui.isElementExist("OrdertrackerAmountvalue", "totalamountvalue", 10);

			/*
			 * OMTAcqui.isElementExist("Ordertracker", "Deliver_text", 10);
			 * OMTAcqui.isElementExist("Ordertracker", "Deliver_text_right", 10);
			 * OMTAcqui.isElementExist("Ordertracker", "Deliver_Paymentmethod", 10);
			 * OMTAcqui.isElementExist("Ordertracker", "Deliver_Paymentmethod_val",
			 * 10); OMTAcqui.isElementExist("Ordertracker", "Deliver_Amountpaid",
			 * 10); OMTAcqui.isElementExist("Ordertracker",
			 * "Deliver_Amountpaid_Val", 10);
			 * OMTAcqui.isElementExist("Ordertracker",
			 * "Deliver_Shiptothisaddress_Header", 10);
			 * OMTAcqui.isElementExist("Ordertracker", "Deliver_Shiptothisaddress",
			 * 10); OMTAcqui.isElementExist("Ordertracker",
			 * "Deliver_EstimatedDelivery", 10);
			 * OMTAcqui.isElementExist("Ordertracker",
			 * "Deliver_Estimated_deliverydate", 10);
			 */

		}
		
		public void ordertracker_ForaActivation() {
			OMTAcqui.isElementExist("Ordertrackerheading", "MyOrder", 10);
			OMTAcqui.isElementExist("Ordertrackerreferenceno", "referencenumber", 10);
			OMTAcqui.isElementExist("Ordertrackerorderid", "OT_Orderid", 10);
			// OMTAcqui.isElementExist("Ordertracker", "Confirm", 10);
			// OMTAcqui.isElementExist("Ordertracker", "Confirm_Subtitle", 10);
			// OMTAcqui.isElementExist("Ordertracker", "DISAPTCH", 10);
			// OMTAcqui.isElementExist("Ordertracker", "DISAPTCH_Subtitle", 10);
			OMTAcqui.isElementExist("OrdertrackerActivation", "Activation", 10);
			// cod
			OMTAcqui.isElementExist("Ordertracker", "Deliver_Date", 10);

			OMTAcqui.isElementExist("Ordertrackeramount haeding", "totalamount", 10);
			OMTAcqui.isElementExist("Ordertrackervalue", "totalamountvalue", 10);

		}

	

		public String ordertracker_Completed() {
			OMTAcqui.isElementExist("Ordertrackerheading", "MyOrder", 10);
			OMTAcqui.isElementExist("Ordertrackerreferenceno", "referencenumber", 10);
			OMTAcqui.isElementExist("Ordertrackerorderid", "OT_Orderid", 10);
			// OMTAcqui.isElementExist("Ordertracker", "Confirm", 10);
			// OMTAcqui.isElementExist("Ordertracker", "Confirm_Subtitle", 10);
			// OMTAcqui.isElementExist("Ordertracker", "DISAPTCH", 10);
			// OMTAcqui.isElementExist("Ordertracker", "DISAPTCH_Subtitle", 10);
			OMTAcqui.isElementExist("OrdertrackerCompleted", "Completed", 10);
			String Status = DriverManager.getDriver().findElement(OMTAcqui.Completed).getText();

			OMTAcqui.isElementExist("Ordertracker", "Deliver_Ordered", 10);
			System.out.println("Date Ordered: " + OMTAcqui.get_Deliver_Ordered().getText());

			OMTAcqui.isElementExist("Ordertrackeramount haeding", "totalamount", 10);
			OMTAcqui.isElementExist("Ordertrackervalue", "totalamountvalue", 10);

			return Status;

		}

		// *********************************************************//
		public void ordertracker_Awaitingpayment(String ScenarioName) throws Exception {
			OMTAcqui.isElementExist("Ordertrackerheading", "MyOrder", 10);
			OMTAcqui.isElementExist("Ordertrackerreferenceno", "referencenumber", 10);
			OMTAcqui.isElementExist("Ordertrackerorderid", "OT_Orderid", 10);
			// OMTAcqui.isElementExist("Ordertracker", "Confirm", 10);
			// OMTAcqui.isElementExist("Ordertracker", "Confirm_Subtitle", 10);
			// OMTAcqui.isElementExist("Ordertracker", "DISAPTCH", 10);
			// OMTAcqui.isElementExist("Ordertracker", "DISAPTCH_Subtitle", 10);
			// OMTAcqui.isElementExist("OrdertrackerActivation", "Activation", 10);
			OMTAcqui.isElementExist("AwaitingPayment", "AwaitingPayment", 10);

			String a = util.ReadFromExcel(ScenarioName, "Sheet1", Constant.PaymentMenthod);
			if (a.contains("COD")) {
				// cod
				OMTAcqui.isElementExist("Ordertracker", "Deliver_Date", 10);

				OMTAcqui.isElementExist("Ordertrackeramount haeding", "totalamount", 10);
				OMTAcqui.isElementExist("Ordertrackervalue", "totalamountvalue", 10);
			}

		}

		// *********************************************************//
		public void ordertracker_Awaitingpayment() throws Exception {
			OMTAcqui.isElementExist("Ordertrackerheading", "MyOrder", 10);
			OMTAcqui.isElementExist("Ordertrackerreferenceno", "referencenumber", 10);
			OMTAcqui.isElementExist("Ordertrackerorderid", "OT_Orderid", 10);
			// OMTAcqui.isElementExist("Ordertracker", "Confirm", 10);
			// OMTAcqui.isElementExist("Ordertracker", "Confirm_Subtitle", 10);
			// OMTAcqui.isElementExist("Ordertracker", "DISAPTCH", 10);
			// OMTAcqui.isElementExist("Ordertracker", "DISAPTCH_Subtitle", 10);
			// OMTAcqui.isElementExist("OrdertrackerActivation", "Activation", 10);
			OMTAcqui.isElementExist("AwaitingPayment", "AwaitingPayment", 10);

			// cod
			OMTAcqui.isElementExist("Ordertracker", "Deliver_Date", 10);

			OMTAcqui.isElementExist("Ordertrackeramount haeding", "totalamount", 10);
			OMTAcqui.isElementExist("Ordertrackervalue", "totalamountvalue", 10);

		}

		public String UpdateOrderStatus(String StatusUpdate) throws InterruptedException {
			switch (StatusUpdate) {
			case "ONGOING VERIFICATION":
				OrderStatusChange("Ongoing Verification");
				break;
			case "Approved":
				OrderStatusChange("Approved");
				break;
			case "For Compliance - POFC":
				OrderStatusChange("For Compliance - POFC");
				break;
			case "Reserved Physical Stock":
				OrderStatusChange("Reserved Physical Stock");
				break;
			case "ForCompliancePOID_POFC":
				OrderStatusChange("For Compliance - POID/POFC");
				break;

			case "ForCompliancePOID":
				OrderStatusChange("For Compliance - POID");
				break;
			case "For Redelivery1":
				OrderStatusChange("For Redelivery");
				break;
			case "For Redelivery2":
				OrderStatusChange2("For Redelivery");
				break;
			case "For Redelivery3":
				OrderStatusChange3("For Redelivery");
				break;
			case "Request Payment":
				OrderStatusChange("Request Payment");
				break;
			case "Awaiting Payment":
				OrderStatusChange("Awaiting Payment");
				break;

			case "For Processing":
				OrderStatusChange("For Processing");
				break;
			case "Processed":
				OrderStatusChange("Processed");
				break;
			case "For Delivery":
				OrderStatusChange("For Delivery");
				break;
			case "Delivered":
				OrderStatusChange("Delivered");
				break;
			case "Activated":
				OrderStatusChange("Activated");
				break;
			case "Completed":
				OrderStatusChange("Completed");
				break;

			}

			return StatusUpdate;

		}

		public void OrderStatusChange3(String Status) throws InterruptedException {
			// Order
			OMTAcqui.select_Approved(Status);
			System.out.println("Updated Status to : " + Status);
			Thread.sleep(2000L);

			if (Status.equalsIgnoreCase("For Redelivery")) {
				Thread.sleep(2000L);
				BP.scroll_vertical(530);
				JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
				js1.executeScript("arguments[0].click();", OMTAcqui.get_fullfill());

				JavascriptExecutor jsrow = (JavascriptExecutor) DriverManager.getDriver();
				jsrow.executeScript("arguments[0].click();", OMTAcqui.get_addnewrow());

				OMTAcqui.get_FulfillDet_Schedule3().sendKeys("07/25/2022");
				System.out.println("Schedule: " + OMTAcqui.get_FulfillDet_Schedule3().getAttribute("value"));

				OMTAcqui.select_get_FulfillDet_Status3("Not Received");
				System.out.println("Status: " + OMTAcqui.get_FulfillDet_Status3().getAttribute("value"));

				OMTAcqui.select_FulfillDet_Remarks3("3rd Delivery Attempt Failed");
				System.out.println("Remarks: " + OMTAcqui.get_FulfillDet_Remarks3().getAttribute("value"));
			}

			JavascriptExecutor jss = (JavascriptExecutor) DriverManager.getDriver();
			jss.executeScript("arguments[0].click();", OMTAcqui.get_Savebutton());

			BP.scroll_vertical(690);
			JavascriptExecutor js6 = (JavascriptExecutor) DriverManager.getDriver();
			js6.executeScript("arguments[0].click();", OMTAcqui.get_confirmcorrect());

		}

		public void OrderStatusChange2(String Status) throws InterruptedException {
			// Order
			OMTAcqui.select_Approved(Status);
			System.out.println("Updated Status to : " + Status);
			Thread.sleep(2000L);

			if (Status.equalsIgnoreCase("For Redelivery")) {
				Thread.sleep(2000L);
				BP.scroll_vertical(530);
				JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
				js1.executeScript("arguments[0].click();", OMTAcqui.get_fullfill());

				JavascriptExecutor jsrow = (JavascriptExecutor) DriverManager.getDriver();
				jsrow.executeScript("arguments[0].click();", OMTAcqui.get_addnewrow());

				OMTAcqui.get_FulfillDet_Schedule2().sendKeys("07/20/2022");
				System.out.println("Schedule: " + OMTAcqui.get_FulfillDet_Schedule2().getAttribute("value"));

				OMTAcqui.select_get_FulfillDet_Status2("Not Received");
				System.out.println("Status: " + OMTAcqui.get_FulfillDet_Status2().getAttribute("value"));

				OMTAcqui.select_FulfillDet_Remarks2("2nd Delivery Attempt Failed");
				System.out.println("Remarks: " + OMTAcqui.get_FulfillDet_Remarks2().getAttribute("value"));

			}

			JavascriptExecutor jss = (JavascriptExecutor) DriverManager.getDriver();
			jss.executeScript("arguments[0].click();", OMTAcqui.get_Savebutton());

			BP.scroll_vertical(690);
			JavascriptExecutor js6 = (JavascriptExecutor) DriverManager.getDriver();
			js6.executeScript("arguments[0].click();", OMTAcqui.get_confirmcorrect());

		}
	
		public void OrderStatusChange(String Status) throws InterruptedException {
			// Order
			OMTAcqui.select_Approved(Status);
			System.out.println("Updated Status to : " + Status);
			Thread.sleep(2000L);

			if (Status.equalsIgnoreCase("ONGOING VERIFICATION") || Status.equalsIgnoreCase("Completed")
					|| Status.equalsIgnoreCase("For Processing") || Status.equalsIgnoreCase("Processed")
					|| Status.equalsIgnoreCase("Approved") || Status.equalsIgnoreCase("Reserved Physical Stock")
					|| Status.equalsIgnoreCase("Request Payment")) {

				if (Status.equalsIgnoreCase("Reserved Physical Stock") || Status.equalsIgnoreCase("Completed")
						|| Status.equalsIgnoreCase("Processed") || Status.equalsIgnoreCase("Request Payment")
						|| Status.equalsIgnoreCase("For Processing")) {
					BP.scroll_vertical(380);
					JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
					js1.executeScript("arguments[0].click();", OMTAcqui.get_orderdetails());

					if (Status.equalsIgnoreCase("Reserved Physical Stock"))  {
						OMTAcqui.get_ReservationID().clear();

						OMTAcqui.get_ReservationID().sendKeys(Constant.ReservationID);

						System.out.println("Reservation ID: " + OMTAcqui.get_ReservationID().getAttribute("value"));

					}
					if (Status.equalsIgnoreCase("Processed")) {
						OMTAcqui.get_ReservationID().clear();

						OMTAcqui.get_ReservationID().sendKeys(Constant.ReservationID1);

						System.out.println("Reservation ID: " + OMTAcqui.get_ReservationID().getAttribute("value"));

					} else if (Status.equalsIgnoreCase("Completed")) {
						OMTAcqui.get_ReservationID().clear();
						OMTAcqui.get_ReservationID().sendKeys(Constant.ReservationID);
						System.out.println("Reservation ID: " + OMTAcqui.get_ReservationID().getAttribute("value"));
						BP.scroll_vertical(380);
						JavascriptExecutor js2 = (JavascriptExecutor) DriverManager.getDriver();
						js2.executeScript("arguments[0].click();", OMTAcqui.get_payment());

						OMTAcqui.get_PostDet_TransacDate().sendKeys(Constant.PostDet_Transactiondate);
						System.out.println("Transaction Date: " + OMTAcqui.get_PostDet_TransacDate().getAttribute("value"));

						OMTAcqui.get_PostDet_PayID().sendKeys(Constant.PostDet_PayId);
						System.out.println("Payment ID: " + OMTAcqui.get_PostDet_PayID().getAttribute("value"));
						OMTAcqui.get_PostDet_PostingRemarks().sendKeys(Constant.PostDet_PostingRemarks);
						System.out
								.println("Posting Remarks: " + OMTAcqui.get_PostDet_PostingRemarks().getAttribute("value"));
						OMTAcqui.get_PostDet_InvoiceID().sendKeys(Constant.PostDet_InvoiceID);
						System.out.println("Invoice ID: " + OMTAcqui.get_PostDet_InvoiceID().getAttribute("value"));

					} else if (Status.equalsIgnoreCase("For Processing")) {
						String g = OMTAcqui.get_DeliveryCaseTitle().getAttribute("value");
						if (g.isEmpty()) {
							OMTAcqui.get_DeliveryCaseTitle().sendKeys("Test");
						}
						String h = OMTAcqui.get_DeliveryQueueName().getAttribute("value");
						if (h.isEmpty()) {
							OMTAcqui.get_DeliveryQueueName().sendKeys("Test");
						}
						String a = OMTAcqui.get_BSSOrderID().getAttribute("value");
						if (a.isEmpty()) {
							OMTAcqui.get_BSSOrderID().sendKeys(Constant.BSSorderID);
							System.out.println("BSS Order ID: " + OMTAcqui.get_BSSOrderID().getAttribute("value"));
						}
						String b = OMTAcqui.get_BSSOrderCaseID().getAttribute("value");
						if (b.isEmpty()) {
							OMTAcqui.get_BSSOrderCaseID().sendKeys(Constant.BSSorderCaseID);

							System.out.println("BSS Order Case ID: " + OMTAcqui.get_BSSOrderCaseID().getAttribute("value"));
						}
						String c = OMTAcqui.get_NewMobileNumber().getAttribute("value");
						if (c.isEmpty()) {
							OMTAcqui.get_NewMobileNumber().sendKeys(Constant.MobilenUmb);
							System.out
									.println("New Mobile Number: " + OMTAcqui.get_NewMobileNumber().getAttribute("value"));
						}

						/*
						 * if (OMTAcqui.get_ReservationID_Update().isDisplayed()) {
						 * OMTAcqui.get_ReservationID().clear();
						 * OMTAcqui.get_ReservationID().sendKeys(Constant_OMT.
						 * ReservationID); }
						 */
						// if cod use below steps

						BP.scroll_vertical(450);
						JavascriptExecutor js2 = (JavascriptExecutor) DriverManager.getDriver();
						js2.executeScript("arguments[0].click();", OMTAcqui.get_postpaid());

						String d = OMTAcqui.get_CustDet_FAID().getAttribute("value");
						if (d.isEmpty()) {
							OMTAcqui.get_CustDet_FAID().sendKeys(Constant.CustFAID);
							System.out.println("FA ID: " + OMTAcqui.get_CustDet_FAID().getAttribute("value"));
						}
						String e = OMTAcqui.get_CustDet_BAID().getAttribute("value");
						if (e.isEmpty()) {
							OMTAcqui.get_CustDet_BAID().sendKeys(Constant.CustBAID);
							System.out.println(
									"Billing Arrangement ID (BA ID): " + OMTAcqui.get_CustDet_BAID().getAttribute("value"));
						}

						String f = OMTAcqui.get_CustDet_ContactID().getAttribute("value");
						if (f.isEmpty()) {
							OMTAcqui.get_CustDet_ContactID().sendKeys(Constant.CustContactID);
							System.out.println("Contact ID: " + OMTAcqui.get_CustDet_ContactID().getAttribute("value"));
						}

					}

					 else if (Status.equalsIgnoreCase("Request Payment")) {
						// Request Payment
						OMTAcqui.get_BSSOrderID().clear();
						OMTAcqui.get_BSSOrderID().sendKeys(Constant.BSSorderID);
						System.out.println("BSS Order ID: " + OMTAcqui.get_BSSOrderID().getAttribute("value"));

						OMTAcqui.get_BSSOrderCaseID().clear();
						OMTAcqui.get_BSSOrderCaseID().sendKeys(Constant.BSSorderCaseID);
						System.out.println("BSS Order Case ID: " + OMTAcqui.get_BSSOrderCaseID().getAttribute("value"));
						
						OMTAcqui.get_NewMobileNumber().clear();
						OMTAcqui.get_NewMobileNumber().sendKeys(Constant.MobilenUmb);
						System.out.println("New Mobile Number: " + OMTAcqui.get_NewMobileNumber().getAttribute("value"));

						JavascriptExecutor jsp = (JavascriptExecutor) DriverManager.getDriver();
						jsp.executeScript("arguments[0].click();", OMTAcqui.get_postpaid());
						
						OMTAcqui.get_CustDet_FAID().clear();
						OMTAcqui.get_CustDet_FAID().sendKeys(Constant.CustFAID);
						System.out.println("FA ID: " + OMTAcqui.get_CustDet_FAID().getAttribute("value"));
						
						OMTAcqui.get_CustDet_BAID().clear();
						OMTAcqui.get_CustDet_BAID().sendKeys(Constant.CustContactID);
						System.out.println(
								"Billing Arrangement ID (BA ID): " + OMTAcqui.get_CustDet_BAID().getAttribute("value"));
						
						OMTAcqui.get_CustDet_ContactID().clear();
						OMTAcqui.get_CustDet_ContactID().sendKeys("9876543321");
						System.out.println("Contact ID: " + OMTAcqui.get_CustDet_ContactID().getAttribute("value"));

					}
				}
				// ongoing verificaation and approved
				else {
					JavascriptExecutor jsL = (JavascriptExecutor) DriverManager.getDriver();
					jsL.executeScript("arguments[0].click();", OMTAcqui.get_Accountcheck());
					OMTAcqui.get_GMI().clear();
					OMTAcqui.get_GMI().sendKeys("12345");

					BP.scroll_vertical(150);
					JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
					js1.executeScript("arguments[0].click();", OMTAcqui.get_doumentsub());
					// if(Status.equalsIgnoreCase("Approved"))

					if (Status.equalsIgnoreCase("Approved")) {
						OMTAcqui.get_POID_Number().clear();
						OMTAcqui.get_POID_Number().sendKeys("p005643");
						System.out.println("POID Number: " + OMTAcqui.get_POID_Number().getAttribute("value"));
						OMTAcqui.select_POID_Verification(Status);
						System.out.println("POID Verification: " + OMTAcqui.get_POID_Verification().getAttribute("value"));

					}
					OMTAcqui.get_POID_Verficationfinding1().clear();
					OMTAcqui.get_POID_Verficationfinding1().sendKeys(Status);

					System.out.println(
							"POID VERIFICATION FINDING:" + OMTAcqui.get_POID_Verficationfinding1().getAttribute("value"));

					if (Status.equalsIgnoreCase("Approved")) {
						OMTAcqui.select_POFC_Verification(Status);
						System.out.println("POFC Verification: " + OMTAcqui.get_POFC_Verification().getAttribute("value"));
					}

					OMTAcqui.get_POFC_Verficationfinding1().clear();
					OMTAcqui.get_POFC_Verficationfinding1().sendKeys(Status);

					System.out.println(
							"POFC VERIFICATION FINDING:" + OMTAcqui.get_POFC_Verficationfinding1().getAttribute("value"));

					JavascriptExecutor jsP = (JavascriptExecutor) DriverManager.getDriver();
					jsP.executeScript("arguments[0].click();", OMTAcqui.get_postpaid());
					OMTAcqui.get_CustDet_FAID().clear();
					OMTAcqui.get_CustDet_FAID().sendKeys("1234");
					OMTAcqui.get_CustDet_BAID().clear();
					OMTAcqui.get_CustDet_BAID().sendKeys("4342");
					OMTAcqui.get_CustDet_ContactID().clear();
					OMTAcqui.get_CustDet_ContactID().sendKeys("877863257");

					JavascriptExecutor jsO = (JavascriptExecutor) DriverManager.getDriver();
					jsO.executeScript("arguments[0].click();", OMTAcqui.get_orderdetails());
					OMTAcqui.get_BSSOrderID().clear();
					OMTAcqui.get_BSSOrderID().sendKeys("1234");
					OMTAcqui.get_BSSOrderCaseID().clear();
					OMTAcqui.get_BSSOrderCaseID().sendKeys("456");
					OMTAcqui.get_NewMobileNumber().clear();
					OMTAcqui.get_NewMobileNumber().sendKeys("09765433219");
				}

			}

			else if (Status.equalsIgnoreCase("Awaiting Payment")) {
				JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
				js1.executeScript("arguments[0].click();", OMTAcqui.get_payment());

				OMTAcqui.get_ReqPay_DateLinkSeeding().sendKeys(Constant.DateLinkSeeding);
				OMTAcqui.get_ReqPay_DateLinkSeeding().sendKeys(Keys.SPACE);
				OMTAcqui.get_ReqPay_DateLinkSeeding().sendKeys(Keys.ENTER);

				System.out.println("Date of Link Sending: " + OMTAcqui.get_ReqPay_DateLinkSeeding().getAttribute("value"));
				OMTAcqui.get_ReqPay_PayReference().sendKeys(Constant.PayementRef_happypath);
				// make payment Reference as "Pending" for NON happy path(cancelled
				// flow)

				System.out.println("Payment Reference: " + OMTAcqui.get_ReqPay_PayReference().getAttribute("value"));
				OMTAcqui.get_ReqPay_StatusPayment().sendKeys(Constant.StatusPay_happypath);
				System.out.println("Status of Payment: " + OMTAcqui.get_ReqPay_StatusPayment().getAttribute("value"));

			}

			else if (Status.equalsIgnoreCase("Activated")) {
				BP.scroll_vertical(580);
				JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
				js1.executeScript("arguments[0].click();", OMTAcqui.get_planpro());

				System.out
						.println("dateOfPlanProvisioning: " + OMTAcqui.get_dateOfPlanProvisioning().getAttribute("value"));
				System.out
						.println("timeOfPlanProvisioning: " + OMTAcqui.get_timeOfPlanProvisioning().getAttribute("value"));
				System.out.println("dateOfOrderClosing: " + OMTAcqui.get_dateOfOrderClosing().getAttribute("value"));
				System.out.println("timeOfOrderClosing: " + OMTAcqui.get_timeOfOrderClosing().getAttribute("value"));
				System.out.println("startDateOfContract: " + OMTAcqui.get_startDateOfContract().getAttribute("value"));
				System.out.println("endDateOfContract: " + OMTAcqui.get_endDateOfContract().getAttribute("value"));

			}

			else if (Status.equalsIgnoreCase("For Redelivery")) {
				Thread.sleep(2000L);
				BP.scroll_vertical(530);
				JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
				js1.executeScript("arguments[0].click();", OMTAcqui.get_fullfill());

				OMTAcqui.get_FulfillDet_Schedule().sendKeys("07/19/2022");
				System.out.println("Schedule: " + OMTAcqui.get_FulfillDet_Schedule().getAttribute("value"));

				OMTAcqui.select_get_FulfillDet_Status("Not Received");
				System.out.println("Status: " + OMTAcqui.get_FulfillDet_Status().getAttribute("value"));

				OMTAcqui.select_FulfillDet_Remarks("1st Delivery Attempt Failed");
				System.out.println("Remarks: " + OMTAcqui.get_FulfillDet_Remarks().getAttribute("value"));

			}

			else if (Status.equalsIgnoreCase("For Compliance - POFC")
					|| Status.equalsIgnoreCase("For Compliance - POID/POFC")
					|| Status.equalsIgnoreCase("For Compliance - POID")) {
				Thread.sleep(2000L);
				BP.scroll_vertical(400);

				JavascriptExecutor js3 = (JavascriptExecutor) DriverManager.getDriver();
				js3.executeScript("arguments[0].click();", OMTAcqui.get_doumentsub());

				OMTAcqui.get_POID_Number().clear();
				OMTAcqui.get_POID_Number().sendKeys("p005643");
				System.out.println("POID Number: " + OMTAcqui.get_POID_Number().getAttribute("value"));

				if (Status.equalsIgnoreCase("For Compliance - POFC")) {
					OMTAcqui.select_POID_Verification("Approved");
				} else {
					OMTAcqui.select_POID_Verification("Disapproved");

				}
				System.out.println("POID Verification: " + OMTAcqui.get_POID_Verification().getAttribute("value"));

				// OMTAcqui.get_POID_DateReviewed().sendKeys("05252022");

				OMTAcqui.get_POID_Verficationfinding1().clear();
				OMTAcqui.get_POID_Verficationfinding1().sendKeys("ONGOING VERFICATION");

				System.out.println(
						"POID VERIFICATION FINDING:" + OMTAcqui.get_POID_Verficationfinding1().getAttribute("value"));
				if (Status.equalsIgnoreCase("For Compliance - POID")) {
					OMTAcqui.select_POFC_Verification("Approved");

				}
				OMTAcqui.select_POFC_Verification("Disapproved");
				System.out.println("POFC Verification: " + OMTAcqui.get_POFC_Verification().getAttribute("value"));
				// OMTAcqui.get_POFC_DateReviewed().sendKeys("05252022");

				OMTAcqui.get_POFC_Verficationfinding1().clear();
				OMTAcqui.get_POFC_Verficationfinding1().sendKeys("ONGOING VERFICATION");

				System.out.println(
						"POFC VERIFICATION FINDING:" + OMTAcqui.get_POFC_Verficationfinding1().getAttribute("value"));

			}

			JavascriptExecutor js2 = (JavascriptExecutor) DriverManager.getDriver();
			js2.executeScript("arguments[0].click();", OMTAcqui.get_Savebutton());

			BP.scroll_vertical(690);
			JavascriptExecutor js6 = (JavascriptExecutor) DriverManager.getDriver();
			js6.executeScript("arguments[0].click();", OMTAcqui.get_confirmcorrect());

		}
		
		
		public void Upload_RequiredDocPOID() throws InterruptedException
		{
			Form.isElementExist("Dropdown1", "Dropdown1", 10);

			// String Poid=" Philippine Passport ";

			//						    JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
			//				            js.executeScript("arguments[0].click();", Form.DropDownDisplay1());
			Form.scroll_vertical(50);
			String POID="PASSPORT ID";
			Form.Select_dropdown(POID); 
			System.out.println("Select ID type: "+POID);

		}  
		
		public void Upload_File1() throws Exception
		{

			Thread.sleep(3000);
	    	
	    	//Form.Choosefile1Click().sendKeys(System.getProperty("user.dir")+"\\resources\\Documents\\POIDF.jpg");
	    	try
	    	{
	    	  		WebElement addFile = DriverManager.getDriver().findElement(By.xpath("//input[@id='poidDocRef']"));
	    			((RemoteWebElement)addFile).setFileDetector(new LocalFileDetector());
	    			addFile.sendKeys(System.getProperty("user.dir")+"\\resources\\Documents\\POIDF.jpg");
	    	}
	    	catch(Exception e)
	    	{
	    		System.out.println(e.getMessage());
	    	}
		}
		public void upload_file() throws AWTException, InterruptedException
		{

			Thread.sleep(4000);
	    	
	    	//JavascriptExecutor js2 = (JavascriptExecutor) DriverManager.getDriver();
	    	//Form.Choosefile2Click().sendKeys(System.getProperty("user.dir") +"\\resources\\Documents\\POIDBACK.jpg");
	    		//Form.Choosefile2Click().sendKeys("D:\\lambda\\GlobeOnline_Lambda-master\\GlobeOnline_Lambda-master\\src\\test\\resources\\Documents\\POIDBACK.jpg");
//	    	
	    	try
	    	{
	    	  		WebElement addFile = DriverManager.getDriver().findElement(By.xpath("//input[@id='poidBackDocRef']"));
	    			((RemoteWebElement)addFile).setFileDetector(new LocalFileDetector());
	    			addFile.sendKeys(System.getProperty("user.dir")+"\\resources\\Documents\\POIDBACK.jpg");
	    	}
	    	catch(Exception e)
	    	{
	    		System.out.println(e.getMessage());
	    	}
	    	}
		//**************************************************************************
		public void Upload_file2() throws AWTException, InterruptedException
		{
			Thread.sleep(3000);
	    	//JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
	       // js1.executeScript("arguments[0].click();", Form.Choosefile3Click());
	    	//Form.Choosefile3Click().sendKeys(System.getProperty("user.dir") +"\\resources\\Documents\\POFCNEW.jpg");		    
	    	//Form.Choosefile3Click().sendKeys("D:\\lambda\\GlobeOnline_Lambda-master\\GlobeOnline_Lambda-master\\src\\test\\resources\\Documents\\POFCNEW.jpg");
	    	
	    	try
	    	{
	    	  		WebElement addFile = DriverManager.getDriver().findElement(By.xpath("//input[@id='pofcDocRef']"));
	    			((RemoteWebElement)addFile).setFileDetector(new LocalFileDetector());
	    			addFile.sendKeys(System.getProperty("user.dir")+"\\resources\\Documents\\POFCNEW.jpg");
	    	}
	    	catch(Exception e)
	    	{
	    		System.out.println(e.getMessage());
	    	}
	    	Thread.sleep(3000);
	    	//Form.clickOnElement("checkbox", "label_accept_all_terms", "chboxterms");
	    	JavascriptExecutor jsa = (JavascriptExecutor) DriverManager.getDriver();
	        jsa.executeScript("arguments[0].click();", Form.get_label_accept_all_terms());
			
	    	
			Form.clickOnElement("Agree", "btnagree", "btnagre");
			//Form.clickOnElement("next", "btnNext", "btnnext");
			
			Thread.sleep(3000);
			JavascriptExecutor js2 = (JavascriptExecutor) DriverManager.getDriver();
	        js2.executeScript("arguments[0].click();", Form.get_next());
			//Form.get_next().click(); 
			
	    
		}
		public void Upload_file2inordertracker() throws AWTException, InterruptedException
		{
			Thread.sleep(3000);
	    	//JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
	       // js1.executeScript("arguments[0].click();", Form.Choosefile3Click());
	    	//Form.Choosefile3Click().sendKeys(System.getProperty("user.dir") +"\\resources\\Documents\\POFCNEW.jpg");		    
	    	//Form.Choosefile3Click().sendKeys("D:\\lambda\\GlobeOnline_Lambda-master\\GlobeOnline_Lambda-master\\src\\test\\resources\\Documents\\POFCNEW.jpg");
	    	
	    	try
	    	{
	    	  		WebElement addFile = DriverManager.getDriver().findElement(By.xpath("//input[@id='pofcDocRef']"));
	    			((RemoteWebElement)addFile).setFileDetector(new LocalFileDetector());
	    			addFile.sendKeys(System.getProperty("user.dir")+"\\resources\\Documents\\POFCNEW.jpg");
	    	}
	    	catch(Exception e)
	    	{
	    		System.out.println(e.getMessage());
	    	}
	    	
	    	
			
	    
		}

		public void Upload_RequiredDocPOFC() throws InterruptedException
		{
			Form.isElementExist("Dropdown2", "Dropdown2", 10);

			Form.scroll_vertical(130);
			Thread.sleep(2000L);
			String POFC = "BIR Form 1700";
			Form.Select_dropdown2(POFC); 
			System.out.println("Select ID type: "+POFC);

		}
		public void submitbutton() throws InterruptedException
		{
			Thread.sleep(3000);
			JavascriptExecutor js2 = (JavascriptExecutor) DriverManager.getDriver();
	        js2.executeScript("arguments[0].click();", Form.get_submitdocument());
			
			
		}
}
