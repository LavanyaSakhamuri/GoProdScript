package globeOnline_OMTOkta;

import java.util.ArrayList;

import java.util.LinkedHashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.pages.ada.ADALanding_Page;
import com.pages.ada.BasePage;
import com.pages.omt.ACQUI_omt_page;
import com.pages.omt.*;

import globeOnline_CommonMethods.DriverManager;
import globeOnline_CommonMethods.util;
import utility.*;

public class OMT_MNP_Functions {
	private static LinkedHashMap<String, String> Map = new LinkedHashMap<>();
	private util util = new util();
	private BasePage BP = new BasePage();
	public Constant Constant = new Constant();
//	private ACQUI_omt_page OMTMNP = new ACQUI_omt_page();
	private MNP_OMT_Page OMTMNP = new MNP_OMT_Page();
//	private OMT_MNP_Functions MF = new OMT_MNP_Functions();

	public void OMTSearch_and_ValidateDashboard1() throws Exception {

		String OrderRefId = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.OrderRefID);
		Generic.WriteTestData("User should be Validate the dashboardDetails", "", "",
				"User should be able to access OMT", "User is able to view the dashboard details", "Passed");
		Control.takeScreenshot();
		OMTMNP.get_SearchField().sendKeys(OrderRefId);
		Thread.sleep(5000L);
			
		OMTMNP.clickOnElement("Search button", "Search", "Search");
		Control.takeScreenshot();
		// Boolean SearchResult = OMTMNP.get_SearchError().isDisplayed();
		// if(SearchResult = true) {
		System.out.println("Order displayed in Dashboard as:" + "\n" + "Date Submitted: "
				+ OMTMNP.get_Dashboard_DateSubmitted().getText() + "\n" + "Reference Number: "
				+ OMTMNP.get_Dashboard_RefNum().getText() + "\n" + "Last Name: "
				+ OMTMNP.get_Dashboard_LName().getText() + "\n" + "First Name: "
				+ OMTMNP.get_Dashboard_FName().getText() + "\n" + "PRODUCT Availed: "
				+ OMTMNP.get_Dashboard_PRODUCTAvailed().getText() + "\n" + "Disposition Status: "
				+ OMTMNP.get_Dashboard_Dispo().getText());
//				"Reason / Remarks: " + OMTMNP.get_Dashboard_Reason().getText());
//				"Assignee: " + OMTMNP.get_Dashboard_Assignee().getText());

//		/Element exists

		OMTMNP.isElementExist("View Button", "ViewBtn", 10);
		OMTMNP.isElementExist("EditBtn", "EditBtn", 10);
		//
	}

	/******************************************************
	 * Validate Order Deails
	 ********************************/
	public String Validate_ORDER(String OrderNumber, String Dispo) {
		System.out.println("Order Info: " + "\n" + "Ordernumber :" + OMTMNP.get_OMT_OrderID().getAttribute("value")
				+ "\n" + "Ordermethod :" + OMTMNP.get_OMT_OrderType().getAttribute("value") + "\n" + "Order Sub Type: "
				+ OMTMNP.get_OMT_CustomerType().getAttribute("value") + "\n" + "Checkout Method: "
				+ OMTMNP.get_Checkoutmethod().getAttribute("value") + "\n" + "Giveasagift: "
				+ OMTMNP.get_Giveasagift().getAttribute("value"));

		if (OrderNumber.equalsIgnoreCase(OMTMNP.get_Giveasagift().getText())) {
			System.out.println("Customer Order Details: " + "\n" +

					"Order Type: " + OMTMNP.get_Customerdetails().getAttribute("value"));
		}
		// "OrderID: " + OMTMNP.get_OMT_OrderID().getAttribute("value") + "\n"
		// +
		else {
			System.out.println("OrderID did not match - Failed");
		}

		String a = OMTMNP.get_OMT_Disposition().getAttribute("value");
		System.out.println(a);
		By val = By.xpath("//option[@value='" + a + "']");
		String b = DriverManager.getDriver().findElement(val).getText();
		if (Dispo.equalsIgnoreCase(b)) {
			System.out.println("Disposition: " + b);
			// "Reason: " + OMTMNP.get_OMT_DispoReason().getText()
		} else {
			System.out.println("Disposition did not match - Failed");
		}
		return b;
	}

	/*******************************************************
	 * CustomerDetails
	 ********************************/
	/*******************************************************
	 * CustomerDetails
	 ********************************/
	public String orderview_CustomerDetails() throws Exception {

		// CustomerDetails
		OMTMNP.isElementExist("CustomerDetails", "Customerde6tails", 10);
		JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
		js1.executeScript("arguments[0].click();", OMTMNP.get_Customerdetails());
		Generic.WriteTestData("User should be Validate the Customer Details", "", "",
				"User should be able to access Customer details", "User is able to view the Customer details", "Passed");
		Control.takeScreenshot();
		OMTMNP.isElementExist("Firstname", "Firstname", 10);
		OMTMNP.isElementExist("Firstname_input", "Firstname_input", 10);
		OMTMNP.isElementExist("Middlename", "Middlename", 10);
		OMTMNP.isElementExist("Middlename Value", "Middlename_input", 10);
		OMTMNP.isElementExist("Lastname", "Lastname", 10);
		OMTMNP.isElementExist("Lastname Value", "Lastname_input", 10);
		OMTMNP.isElementExist("Emailaddress", "Emailaddress", 10);
		OMTMNP.isElementExist("Emailaddress Id", "Emailaddress_input", 10);
		OMTMNP.isElementExist("Mobilenumber", "Mobilenumber", 10);
		OMTMNP.isElementExist("Mobilenumber value", "Mobilenumber_input", 10);
		String FName = OMTMNP.get_Firstname_input().getAttribute("value");
		String MName = OMTMNP.get_Middlename_input().getAttribute("value");
		String LName = OMTMNP.get_Lastname_input().getAttribute("value");
		String Em = OMTMNP.get_Emailaddress_input().getAttribute("value");

		String CustomerDetails = FName + " " + MName + " " + LName + "," + Em;
		System.out.println(
				"PRIMARY CUSTOMER DETAILS: " + "\n" + "Firstname: " + OMTMNP.get_Firstname_input().getAttribute("value")
						+ "\n" + "Middle Name: " + OMTMNP.get_Middlename_input().getAttribute("value") + "\n "
						+ "Last Name: " + OMTMNP.get_Lastname_input().getAttribute("value") + "\n" + "Mobile Number: "
						+ OMTMNP.get_Mobilenumber_input().getAttribute("value") + "\n" + "Email Address: "
						+ OMTMNP.get_Emailaddress_input().getAttribute("value"));
		return CustomerDetails;
	}

	/******************************************************
	 * * RecipentDetails
	 ********************************/

	public void orderview_RecipentDetails() throws Exception {

		// Recipentdetails

		OMTMNP.isElementExist("Recipentdetails", "ReceipentDetails", 10);
		JavascriptExecutor jsre = (JavascriptExecutor) DriverManager.getDriver();
		jsre.executeScript("arguments[0].click();", OMTMNP.get_ReceipentDetails());

		BP.scroll_vertical(300);
		Generic.WriteTestData("User should be Validate the Receipient details", "", "",
				"User should be able to see Receipent Details", "User is able to check Receipent Details", "Passed");
		Control.takeScreenshot();
		OMTMNP.isElementExist("Name of the Receipent", "NameofRecipent", 10);
		OMTMNP.isElementExist("Name of the Receipent Value", "NameofRecipent_input", 10);
		OMTMNP.isElementExist("MobilenumberofRecipent", "MobilenumberofRecipent", 10);
		OMTMNP.isElementExist("MobilenumberofRecipent Value", "MobilenumberofRecipent_input", 10);
//	
		System.out.println("Recipient DETAILS: " + "\n" + "Recipient Name: "
				+ OMTMNP.get_NameofRecipent_input().getAttribute("value") + "\n" + "Mobile Number: "
				+ OMTMNP.get_MobilenumberofRecipent_input().getAttribute("value"));
	}

	/******************************************************
	 * AddressDetails
	 ********************************/ // *********************************************************************************************************
	public void orderview_AddressDetails() throws Exception {

		// AddressDetails
		OMTMNP.isElementExist("AddressDetails", "Addressdetails", 10);
		JavascriptExecutor js3 = (JavascriptExecutor) DriverManager.getDriver();
		js3.executeScript("arguments[0].click();", OMTMNP.get_Addressdetails());
		Generic.WriteTestData("User should be Validate the Address details", "", "",
				"User should be able to Validate address details ", "User is able to Check the Address details", "Passed");
		Control.takeScreenshot();
		OMTMNP.isElementExist("Addresstype", "Addresstype", 10);
		OMTMNP.isElementExist("House_select", "House_select", 10);
		OMTMNP.isElementExist("Condominum_select", "Condominum_select", 10);
		OMTMNP.isElementExist("House", "House", 10);
		OMTMNP.isElementExist("House Value", "House_input", 10);
		OMTMNP.isElementExist("Street", "Street", 10);
		OMTMNP.isElementExist("Street Value", "Street_input", 10);
		OMTMNP.isElementExist("Village", "Village", 10);
		OMTMNP.isElementExist("Village Input", "Village_input", 10);
		OMTMNP.isElementExist("Barangay", "Barangay", 10);
		OMTMNP.isElementExist("Barangay Value", "Barangay_input", 10);
		OMTMNP.isElementExist("City", "City", 10);
		OMTMNP.isElementExist("City Value", "City_input", 10);
		OMTMNP.isElementExist("Province", "Province", 10);
		OMTMNP.isElementExist("Province Values", "Province_input", 10);
		OMTMNP.isElementExist("Zipcode", "Zipcode", 10);
		OMTMNP.isElementExist("Zipcode value", "Zipcode_input", 10);
		OMTMNP.isElementExist("Longitude", "Longitude", 10);
		OMTMNP.isElementExist("Longitude Value", "Longitude_input", 10);
		OMTMNP.isElementExist("Latitude", "Latitude", 10);
		OMTMNP.isElementExist("Latitude Value", "Latitude_input", 10);
	}

	/******************************************************
	 * RegisteredAddress
	 ********************************/

	public String Validate_RegisteredAddress(String House_Condo) {
		BP.scroll_vertical(300);
		String a = OMTMNP.get_PrimaryRegAdd_Brgy().getAttribute("value");
		By b = By.xpath("//select[@name='barangay']//option[@value=" + "'" + a + "'" + "]");
		String Barangay = DriverManager.getDriver().findElement(b).getText();

		String c = OMTMNP.get_PrimaryRegAdd_City().getAttribute("value");
		By d = By.xpath("//select[@name='city']//option[@value=" + "'" + c + "'" + "]");
		String City = DriverManager.getDriver().findElement(d).getText();

		String e = OMTMNP.get_PrimaryRegAdd_Province().getAttribute("value");
		By f = By.xpath("//select[@name='province']//option[@value=" + "'" + e + "'" + "]");
		String Province = DriverManager.getDriver().findElement(f).getText();

		if (House_Condo.equalsIgnoreCase("House")) {

			System.out.println("Registered Address House: " + OMTMNP.get_PrimaryRegAdd_houseNo().getAttribute("value")
					+ " " + OMTMNP.get_PrimaryRegAdd_Street().getAttribute("value") + " "
					+ OMTMNP.get_PrimaryRegAdd_VillageSubdi().getAttribute("value") + " " + Barangay + " " + City + ", "
					+ Province + " " + OMTMNP.get_PrimaryRegAdd_Zipcode().getAttribute("value") + "\n" + "Longitude: "
					+ OMTMNP.get_PrimaryRegAdd_Longitude().getAttribute("value") + "\n" + "Latitude: "
					+ OMTMNP.get_PrimaryRegAdd_Latitude().getAttribute("value"));

			String AddressDetails = OMTMNP.get_PrimaryRegAdd_houseNo().getAttribute("value") + " "
					+ OMTMNP.get_PrimaryRegAdd_Street().getAttribute("value") + " "
					+ OMTMNP.get_PrimaryRegAdd_VillageSubdi().getAttribute("value") + " " + Barangay + " " + City + ", "
					+ Province + " " + OMTMNP.get_PrimaryRegAdd_Zipcode().getAttribute("value") + "\n" + "Longitude: "
					+ OMTMNP.get_PrimaryRegAdd_Longitude().getAttribute("value") + "\n" + "Latitude: "
					+ OMTMNP.get_PrimaryRegAdd_Latitude().getAttribute("value");
			return AddressDetails;
		} else {
			System.out.println("Registered Address Condo: " +

					OMTMNP.get_PrimaryRegAdd_FlrNo().getAttribute("value") + " "
					+ OMTMNP.get_PrimaryRegAdd_BuildingName().getAttribute("value") + " "
					+ OMTMNP.get_PrimaryRegAdd_Street().getAttribute("value") + " "
					+ OMTMNP.get_PrimaryRegAdd_Brgy().getAttribute("value") + " "
					+ OMTMNP.get_PrimaryRegAdd_City().getAttribute("value") + ", "
					+ OMTMNP.get_PrimaryRegAdd_Province().getAttribute("value") + " "
					+ OMTMNP.get_PrimaryRegAdd_Zipcode().getAttribute("value") + "\n" + "Longitude: "
					+ OMTMNP.get_PrimaryRegAdd_Longitude().getAttribute("value") + "\n" + "Latitude: "
					+ OMTMNP.get_PrimaryRegAdd_Latitude().getAttribute("value"));

			String AddressDetails = OMTMNP.get_PrimaryRegAdd_FlrNo().getAttribute("value") + " "
					+ OMTMNP.get_PrimaryRegAdd_BuildingName().getAttribute("value") + " "
					+ OMTMNP.get_PrimaryRegAdd_Street().getAttribute("value") + " "
					+ OMTMNP.get_PrimaryRegAdd_Brgy().getAttribute("value") + " "
					+ OMTMNP.get_PrimaryRegAdd_City().getAttribute("value") + ", "
					+ OMTMNP.get_PrimaryRegAdd_Province().getAttribute("value") + " "
					+ OMTMNP.get_PrimaryRegAdd_Zipcode().getAttribute("value") + "\n" + "Longitude: "
					+ OMTMNP.get_PrimaryRegAdd_Longitude().getAttribute("value") + "\n" + "Latitude: "
					+ OMTMNP.get_PrimaryRegAdd_Latitude().getAttribute("value");
			return AddressDetails;

		}
//		String AddressDetails = OMTMNP.get_PrimaryRegAdd_houseNo().getAttribute("value") + ","
//				+ OMTMNP.get_PrimaryRegAdd_Street().getAttribute("value") + ","
//				+ OMTMNP.get_PrimaryRegAdd_VillageSubdi().getAttribute("value") + "," + Barangay + "," + City + ", "
//				+ Province + "," + OMTMNP.get_PrimaryRegAdd_Zipcode().getAttribute("value");

	}

	// *********************************************************************************************************
	public String Validate_RegisteredAddressHouse_MNP(String House_Condo) {
		BP.scroll_vertical(300);
		String a = OMTMNP.get_PrimaryRegAdd_Brgy().getAttribute("value");
		By b = By.xpath("//select[@name='barangay']//option[@value=" + "'" + a + "'" + "]");
		String Barangay = DriverManager.getDriver().findElement(b).getText();

		String c = OMTMNP.get_PrimaryRegAdd_City().getAttribute("value");
		By d = By.xpath("//select[@name='city']//option[@value=" + "'" + c + "'" + "]");
		String City = DriverManager.getDriver().findElement(d).getText();

		String e = OMTMNP.get_PrimaryRegAdd_Province().getAttribute("value");
		By f = By.xpath("//select[@name='province']//option[@value=" + "'" + e + "'" + "]");
		String Province = DriverManager.getDriver().findElement(f).getText();

		if (House_Condo.equalsIgnoreCase("House")) {
			System.out.println("Registered Address House: " + OMTMNP.get_PrimaryRegAdd_houseNo().getAttribute("value")
					+ " " + OMTMNP.get_PrimaryRegAdd_Street().getAttribute("value") + " "
					+ OMTMNP.get_PrimaryRegAdd_VillageSubdi().getAttribute("value") + " " + Barangay + " " + City + ", "
					+ Province + " " + OMTMNP.get_PrimaryRegAdd_Zipcode().getAttribute("value") + "\n" + "Longitude: "
					+ OMTMNP.get_PrimaryRegAdd_Longitude().getAttribute("value") + "\n" + "Latitude: "
					+ OMTMNP.get_PrimaryRegAdd_Latitude().getAttribute("value"));
			String AddressDetails = OMTMNP.get_PrimaryRegAdd_houseNo().getAttribute("value") + ","
					+ OMTMNP.get_PrimaryRegAdd_Street().getAttribute("value") + ","
					+ OMTMNP.get_PrimaryRegAdd_VillageSubdi().getAttribute("value") + "," + Barangay + "," + City + ", "
					+ Province + "," + OMTMNP.get_PrimaryRegAdd_Zipcode().getAttribute("value");
			return AddressDetails;
		} else {
			System.out.println("Registered Address Condo: " + OMTMNP.get_PrimaryRegAdd_FlrNo().getAttribute("value")
					+ " " + OMTMNP.get_PrimaryRegAdd_BuildingName().getAttribute("value") + " "
					+ OMTMNP.get_PrimaryRegAdd_Street().getAttribute("value") + " "
					+ OMTMNP.get_PrimaryRegAdd_Brgy().getAttribute("value") + " "
					+ OMTMNP.get_PrimaryRegAdd_City().getAttribute("value") + ", "
					+ OMTMNP.get_PrimaryRegAdd_Province().getAttribute("value") + " "
					+ OMTMNP.get_PrimaryRegAdd_Zipcode().getAttribute("value") + "\n" + "Longitude: "
					+ OMTMNP.get_PrimaryRegAdd_Longitude().getAttribute("value") + "\n" + "Latitude: "
					+ OMTMNP.get_PrimaryRegAdd_Latitude().getAttribute("value"));

			String AddressDetails = OMTMNP.get_PrimaryRegAdd_FlrNo().getAttribute("value") + " "
					+ OMTMNP.get_PrimaryRegAdd_BuildingName().getAttribute("value") + " "
					+ OMTMNP.get_PrimaryRegAdd_Street().getAttribute("value") + " " + Barangay + " " + City + ", "
					+ Province + " " + OMTMNP.get_PrimaryRegAdd_Zipcode().getAttribute("value") + "\n" + "Longitude: "
					+ OMTMNP.get_PrimaryRegAdd_Longitude().getAttribute("value") + "\n" + "Latitude: "
					+ OMTMNP.get_PrimaryRegAdd_Latitude().getAttribute("value");
			return AddressDetails;
		}

		// return AddressDetails;

	}

	// *********************************************************************************************************
	/*****************************************************
	 * RegisteredAddress
	 ********************************/

	public void Validate_OMTMNPRegisteredAddressForPayment(String House_Condo) {

		if (House_Condo.equalsIgnoreCase("House")) {

			System.out.println("Registered Address House: " + "\n" + "House/Block No: "
					+ OMTMNP.get_House_input().getAttribute("value") + "\n" + "Street : "
					+ OMTMNP.get_Street_input().getAttribute("value") + "\n" + "Village/ Subdivision: "
					+ OMTMNP.get_Village_input().getAttribute("value") + "\n" + "Barangay:"
					+ OMTMNP.get_Barangay_input().getAttribute("value") + "\n" + "City:"
					+ OMTMNP.get_City_input().getAttribute("value") + "\n" + "Province/ Region:"
					+ OMTMNP.get_Province_input().getAttribute("value") + "\n" + "Zip Code: "
					+ OMTMNP.get_Zipcode_input().getAttribute("value") + "\n" + "Longitude: "
					+ OMTMNP.get_Longitude_input().getAttribute("value") + "\n" + "Latitude: "
					+ OMTMNP.get_Latitude_input().getAttribute("value"));
		} else {
			System.out.println("Registered Address Condo: " + OMTMNP.get_PrimaryRegAdd_FlrNo().getAttribute("value")
					+ " " + OMTMNP.get_PrimaryRegAdd_BuildingName().getAttribute("value") + " "
					+ OMTMNP.get_PrimaryRegAdd_Street().getAttribute("value") + " "
					+ OMTMNP.get_PrimaryRegAdd_Brgy().getAttribute("value") + " "
					+ OMTMNP.get_PrimaryRegAdd_City().getAttribute("value") + ", "
					+ OMTMNP.get_PrimaryRegAdd_Province().getAttribute("value") + " "
					+ OMTMNP.get_PrimaryRegAdd_Zipcode().getAttribute("value") + "\n" + "Longitude: "
					+ OMTMNP.get_PrimaryRegAdd_Longitude().getAttribute("value") + "\n" + "Latitude: "
					+ OMTMNP.get_PrimaryRegAdd_Latitude().getAttribute("value"));
		}
	}
	// *********************************************************************************************************

	public void Validate_ShippingAddress(String House_Condo_Sameasbilling) {
		if (House_Condo_Sameasbilling.equalsIgnoreCase("House")) {
			System.out.println("Shipping Address House: " + OMTMNP.get_PrimaryShipAdd_HouseNo().getAttribute("value")
					+ " " + OMTMNP.get_PrimaryShipAdd_VillageSubdi().getAttribute("value") + " "
					+ OMTMNP.get_PrimaryShipAdd_Street().getAttribute("value") + " "
					+ OMTMNP.get_PrimaryShipAdd_Brgy().getAttribute("value") + " "
					+ OMTMNP.get_PrimaryShipAdd_City().getAttribute("value") + ", "
					+ OMTMNP.get_PrimaryShipAdd_Province().getAttribute("value") + " "
					+ OMTMNP.get_PrimaryShipAdd_ZipCode().getAttribute("value") + "\n" + "Longitude: "
					+ OMTMNP.get_PrimaryShipAdd_Longitude().getAttribute("value") + "\n" + "Latitude: "
					+ OMTMNP.get_PrimaryShipAdd_Latitude().getAttribute("value"));

		}

		else if (House_Condo_Sameasbilling.equalsIgnoreCase("Condo")) {
			System.out.println("Shipping Address House: " + OMTMNP.get_PrimaryShipAdd_FlrNo().getText() + " "
					+ OMTMNP.get_PrimaryShipAdd_BuildingName().getText() + " "
					+ OMTMNP.get_PrimaryShipAdd_Street().getAttribute("value") + " "
					+ OMTMNP.get_PrimaryShipAdd_Brgy().getAttribute("value") + " "
					+ OMTMNP.get_PrimaryShipAdd_City().getAttribute("value") + ", "
					+ OMTMNP.get_PrimaryShipAdd_Province().getAttribute("value") + " "
					+ OMTMNP.get_PrimaryShipAdd_ZipCode().getAttribute("value") + "\n" + "Longitude: "
					+ OMTMNP.get_PrimaryShipAdd_Longitude().getAttribute("value") + "\n" + "Latitude: "
					+ OMTMNP.get_PrimaryShipAdd_Latitude().getAttribute("value"));

		} else {
			if (OMTMNP.get_PrimarySameasbilling().getText().equalsIgnoreCase(" same as billing ")) {
				System.out.println("Shipping Address same as Billing Address");
			} else {
				System.out.println("Shipping Address - Failed");
			}

		}
	}

	/*****************************************************
	 * OrderDetails1
	 ********************************/
	public void orderview_OrderDetails1() throws Exception {

		// Orderdetails
		OMTMNP.isElementExist("Orderdetails", "Orderdetails", 10);
		JavascriptExecutor js4 = (JavascriptExecutor) DriverManager.getDriver();
		js4.executeScript("arguments[0].click();", OMTMNP.get_Orderdetails());

		Generic.WriteTestData("User should be Validate the Order details", "", "",
				"User should be able to access order details", "User is able to see values are populated in Order details", "Passed");
		Control.takeScreenshot();
		OMTMNP.isElementExist("Quantity", "Quantity", 10);
		OMTMNP.isElementExist("Quantity Value", "Quantity_input", 10);

		OMTMNP.isElementExist("Producttype", "Producttype", 10);
		OMTMNP.isElementExist("Producttype_input", "Producttype_input", 10);

		OMTMNP.isElementExist("sku", "Sku", 10);
		OMTMNP.isElementExist("SKU Value", "Sku_input", 10);

		OMTMNP.isElementExist("Matcode", "Matcode", 10);
		OMTMNP.isElementExist("Matcode Value", "Matcode_input", 10);

		OMTMNP.isElementExist("BSSCasenumber", "BSSCasenumber", 10);
		OMTMNP.isElementExist("BSSCasenumber Value", "BSSCasenumber_input", 10);

		OMTMNP.isElementExist("Reservationid", "Reservationid", 10);
		OMTMNP.isElementExist("Reservationid Value", "Reservationid_input", 10);

		OMTMNP.isElementExist("Modemserial", "Modemserial", 10);
		OMTMNP.isElementExist("Modemserial Value", "Modemserial_input", 10);

		OMTMNP.isElementExist("Simserial", "Simserial", 10);
		BP.scroll_vertical(300);
		OMTMNP.isElementExist("Simserial Value", "Simserial_input", 10);

		OMTMNP.isElementExist("Promocode", "Promocode", 10);
		OMTMNP.isElementExist("Promocode Value", "Promocode_input", 10);

		OMTMNP.isElementExist("Discount", "Discount", 10);
		OMTMNP.isElementExist("Discount Value", "Discount_input", 10);

		OMTMNP.isElementExist("Projectname", "Projectname", 10);
		OMTMNP.isElementExist("Projectname Value", "Projectname_input", 10);

		System.out.println("Order Details: " + "\n" + "Quantity: " + OMTMNP.get_Quantity_input().getAttribute("value")
				+ "\n" + "Producttype: " + OMTMNP.get_Producttype_input().getAttribute("value") + "\n" + "Sku: "
				+ OMTMNP.get_Sku_input().getAttribute("value") + "\n" + "Matcode: "
				+ OMTMNP.get_Matcode_input().getAttribute("value") + "\n" + "BSSCasenumber: "
				+ OMTMNP.get_BSSCasenumber_input().getAttribute("value") + "\n" + "Reservationid: "
				+ OMTMNP.get_Reservationid_input().getAttribute("value") + "\n" + "Modemserial: "
				+ OMTMNP.get_Modemserial_input().getAttribute("value") + "\n" + "Simserial: "
				+ OMTMNP.get_Simserial_input().getAttribute("value") + "\n" + "Promocode: "
				+ OMTMNP.get_Promocode_input().getAttribute("value") + "\n" + "Discount: "
				+ OMTMNP.get_Discount_input().getAttribute("value") + "\n" + "Projectname: "
				+ OMTMNP.get_Projectname_input().getAttribute("value"));
	}

	/******************************************************
	 * Payment Details
	 ********************************/

	/*****************************************************
	 * Payment Details
	 ********************************/
	public void orderview_PaymentDetails() throws Exception {

		// PaymentDetails
		OMTMNP.isElementExist("PaymentDetails", "Paymentdeatils", 10);
		JavascriptExecutor js5 = (JavascriptExecutor) DriverManager.getDriver();
		js5.executeScript("arguments[0].click();", OMTMNP.get_Paymentdeatils());
		BP.scroll_vertical(600);
		Generic.WriteTestData("User should be Validate the Payment details", "", "",
				"User should be able to Payment Details", "User is able to Check the Payment Details", "Passed");
		Control.takeScreenshot();
		OMTMNP.isElementExist("Totalamount", "Totalamount", 10);
		OMTMNP.isElementExist("Totalamount Value", "Totalamount_input", 10);
		OMTMNP.isElementExist("Paymentmethod", "Paymentmethod", 10);
		OMTMNP.isElementExist("Paymentmethod Value", "Paymentmethod_input", 10);
		OMTMNP.isElementExist("Transaction", "Transaction", 10);
		OMTMNP.isElementExist("Transaction Value", "Transaction_input", 10);
		OMTMNP.isElementExist("Or", "Or", 10);
		OMTMNP.isElementExist("Or Value", "Or_input", 10);
//	
//	
		System.out.println(
				"Order Details: " + "\n" + "Total Amount: " + OMTMNP.get_Totalamount_input().getAttribute("value")
						+ "\n" + "Payment Method: " + OMTMNP.get_Paymentmethod_input().getAttribute("value") + "\n"
						+ "Transaction ID: " + OMTMNP.get_Transaction_input().getAttribute("value") + "\n" + "OR #: "
						+ OMTMNP.get_Or_input().getAttribute("value"));

	}

	/******************************************************
	 * Mobile Number Porting Details
	 ********************************/

	public void MobileNumberPortingRequestDetails() throws Exception {

		// PaymentDetails
		OMTMNP.isElementExist("MNPDetails", "MNPDetails", 10);
		JavascriptExecutor js5 = (JavascriptExecutor) DriverManager.getDriver();
		js5.executeScript("arguments[0].click();", OMTMNP.get_MNPDetails());
		BP.scroll_vertical(600);
		
		Generic.WriteTestData("User should be Validate the Mobile Porting Details", "", "", "User should be able to See Porting Request Values","User is able to Should display the Porting Request", "Passed");
	    Control.takeScreenshot();


		OMTMNP.isElementExist("USClabel", "USClabel ", 10);
		OMTMNP.isElementExist("USCinput", "USCinput", 10);

		OMTMNP.isElementExist("Porting Request Id", "PortingReqId", 10);

		System.out.println("Order Details: " + "\n" + "USC Code: " + OMTMNP.get_USCinput().getAttribute("value") + "\n"
				+ "Payment Method: " + OMTMNP.get_PortingReqStatus().getAttribute("value") + "\n"
				+ OMTMNP.get_PortingReqIdInput().getAttribute("value"));

	}

	/*****************************************************
	 * FullfilmentDetails
	 ********************************/
	/*****************************************************
	 * FullfilmentDetails
	 ********************************/
	public void orderview_FullfilmentDetails() throws Exception {

		// Fullfilmentdetails
		OMTMNP.isElementExist("Fullfilmentdetails", "Fullfilmentdetails", 10);
		JavascriptExecutor js6 = (JavascriptExecutor) DriverManager.getDriver();
		js6.executeScript("arguments[0].click();", OMTMNP.get_Fullfilmentdetails());
		Generic.WriteTestData("User should be Validate the Fullfillment Details", "", "", "User should be able to see Fullfillment details","User is able to access OMT application", "Passed");
	    Control.takeScreenshot();
		if (OMTMNP.get_FulfillDet_PALrbtn().isSelected()) {
			System.out.println("PAL is selected");
		} else if (OMTMNP.get_FulfillDet_FSOrbtn().isSelected()) {
			System.out.println("FSO TD is selected");
		} else if (OMTMNP.get_FulfillDet_RSOrbtn().isSelected()) {
			System.out.println("RSO TD is selected");
		} else {
			System.out.println("No Fullfilmen selected - Failed");
		}

		if (OMTMNP.get_FulfillDet_Xpressrbtn().isSelected()) {
			System.out.println("Express Delivery is selected");
		} else if (OMTMNP.get_FulfillDet_Regularrbtn().isSelected()) {
			System.out.println("Regular Delivery is selected");
		}

		OMTMNP.isElementExist("Fulfilment", "Fulfilment", 10);
		OMTMNP.isElementExist("Delivery", "Delivery", 10);
		OMTMNP.isElementExist("Assignedcourier", "Assignedcourier", 10);
		OMTMNP.isElementExist("Assignedagent", "Assignedagent", 10);
		OMTMNP.isElementExist("Schedule", "Schedule", 10);
		OMTMNP.isElementExist("Status", "Status", 10);
		OMTMNP.isElementExist("Remarks", "Remarks", 10);
		OMTMNP.isElementExist("Addnewrowbutton", "Addnewrowbutton", 10);
//	
		System.out.println("Fullfilmentdetails : " + OMTMNP.get_Fulfilment().getAttribute("value") + "\n" + "Delivery: "
				+ OMTMNP.get_Delivery().getAttribute("value") + "\n" + "Assigned Courier: "
//				+ OMTMNP.get_Delivery().getAttribute("value") + "\n" + "Assigned Agent: "
				+ OMTMNP.get_Assignedcourier().getAttribute("value") + "\n" + "Schedule: "
				+ OMTMNP.get_Assignedagent().getAttribute("value") + "\n" + "Status: "
				+ OMTMNP.get_Schedule().getAttribute("value") + "\n" + "Remarks: "
				+ OMTMNP.get_Remarks().getAttribute("value") + "\n" + "Remarks: "
				+ OMTMNP.get_Status().getAttribute("value") + "\n" + "Addnewrowbutton: "
				+ OMTMNP.get_Addnewrowbutton().getAttribute("value"));

		BP.scroll_vertical(400);

	}

	/*****************************************************
	 * ActivationDetails
	 ********************************/
	public void orderview_ActivationDetails() throws Exception {

		// Activationdetails
		OMTMNP.isElementExist("Activationdetails", "Activationdetails", 10);
		JavascriptExecutor js7 = (JavascriptExecutor) DriverManager.getDriver();
		js7.executeScript("arguments[0].click();", OMTMNP.get_Activationdetails());
		Generic.WriteTestData("User should be Validate the Activation Details", "", "", "User Able to access see Activation details","User should be Validate the Activation Details", "Passed");
	    Control.takeScreenshot();
		OMTMNP.isElementExist("Channel", "Channel", 10);
		OMTMNP.isElementExist("Channel Value", "Channel_input", 10);
		OMTMNP.isElementExist("Dateofactivation", "Dateofactivation", 10);
		OMTMNP.isElementExist("Dateofactivation Value", "Dateofactivation_input", 10);
		OMTMNP.isElementExist("Time", "Time", 10);
		OMTMNP.isElementExist("Time Entry", "Time_input", 10);
//	
		System.out.println("Fullfilmentdetails : " + OMTMNP.get_Channel_input().getAttribute("value") + "\n"
				+ "Channel: " + OMTMNP.get_Dateofactivation_input().getAttribute("value") + "\n" + "Dateofactivation: "
				+ OMTMNP.get_Status().getAttribute("value") + "\n" + "Time_input: "
				+ OMTMNP.get_Time_input().getAttribute("value"));
		BP.scroll_vertical(200);
	}

	/*****************************************************
	 * RefundDetails
	 ********************************/
	public void orderview_RefundDetails() throws Exception {

		// Refunddetails
		OMTMNP.isElementExist("Refunddetails", "RefundDetails", 10);
		JavascriptExecutor js8 = (JavascriptExecutor) DriverManager.getDriver();
		js8.executeScript("arguments[0].click();", OMTMNP.get_RefundDetails());
		
		Generic.WriteTestData("User should be Validate the Refund Details", "", "", "User Able to access see Refund fields","User should be see Validatio Activation Fields", "Passed");
	    Control.takeScreenshot();
		
		OMTMNP.isElementExist("RefundRequestdate", "RefundRequestdate", 10);
		OMTMNP.isElementExist("RefundRequestdate Value", "RefundRequestdate_input", 10);
		OMTMNP.isElementExist("ValidamountofRefund", "ValidamountofRefund", 10);
		OMTMNP.isElementExist("ValidamountofRefund Value", "ValidamountofRefund_input", 10);
		OMTMNP.isElementExist("IssuingBank", "IssuingBank", 10);
		OMTMNP.isElementExist("IssuingBank Value", "IssuingBank_input", 10);
		OMTMNP.isElementExist("Cardnumber", "Cardnumber", 10);
		OMTMNP.isElementExist("Cardnumber Value", "Cardnumber_input", 10);
		OMTMNP.isElementExist("Accountname", "Accountname", 10);
		OMTMNP.isElementExist("Accountname Value", "Accountname_input", 10);
		OMTMNP.isElementExist("Refunddetails", "Authorization", 10);
		OMTMNP.isElementExist("Refunddetails", "Authorization_input", 10);
		OMTMNP.isElementExist("Time_input", "Time_input", 10);
		OMTMNP.isElementExist("Authorization", "Authorization", 10);
		OMTMNP.isElementExist("Authorization Value", "Authorization_input", 10);
		OMTMNP.isElementExist("Remarks_Refund", "Remarks_Refund", 10);
		OMTMNP.isElementExist("Remarks Value", "Remarks_input", 10);
		OMTMNP.isElementExist("RefundReference", "RefundReference", 10);
		OMTMNP.isElementExist("RefundReference Value", "RefundReference_input", 10);
//	
		System.out.println("Refund details : " + OMTMNP.get_RefundRequestdate_input().getAttribute("value") + "\n"
				+ "ValidamountofRefund: " + OMTMNP.get_ValidamountofRefund_input().getAttribute("value") + "\n"
				+ "IssuingBank: " + OMTMNP.get_IssuingBank_input().getAttribute("value") + "\n" + "Cardnumber: "
				+ OMTMNP.get_Cardnumber_input().getAttribute("value") + "\n" + "Accountname: "
				+ OMTMNP.get_Accountname_input().getAttribute("value") + "\n" + "Authorization: "
				+ OMTMNP.get_Authorization_input().getAttribute("value") + "\n" + "Remarks: "
				+ OMTMNP.get_Time_input().getAttribute("value") + "\n" + "Remarks_Refund: "
				+ OMTMNP.get_Remarks_Refund().getAttribute("value") + "\n" + "Remarks: "
				+ OMTMNP.get_Remarks_input().getAttribute("value") + "\n" + "RefundReference: "
				+ OMTMNP.get_RefundReference_input().getAttribute("value"));

	}

	/*****************************************************
	 * OrderHistoryDetails
	 ********************************/
	public void orderview_Sale_OrderHistoryDetails() throws Exception {

		// AfterSale and OrderHistory
//	OMTMNP.isElementExist("Aftersale", "Aftersale", 10);
//	OMTMNP.isElementExist("OrderHistory", "OrderHistory", 10);
		JavascriptExecutor js9 = (JavascriptExecutor) DriverManager.getDriver();
		js9.executeScript("arguments[0].click();", OMTMNP.get_OrderHistory());
		
		Generic.WriteTestData("User should be Validate the Order History details", "", "", "User Able to access see Order details","User should be Validate the order History Details", "Passed");
	    Control.takeScreenshot();

		System.out.println("Order History Details : " + OMTMNP.get_Channel_input().getAttribute("value") + "\n"
				+ "Aftersale: " + OMTMNP.get_Aftersale().getAttribute("value") + "\n" + "Dateofactivation: "
				+ OMTMNP.get_OrderHistory().getAttribute("value"));

		OMTMNP.isElementExist("Backbutton", "Backbutton", 10);
		OMTMNP.isElementExist("Savebutton", "Savebutton", 10);

	}

	/*****************************************************
	 * Signout
	 ********************************/
	public void Signout() throws Exception {

		// Order
		OMTMNP.isElementExist("Order", "Accountbutton", 10);
		Thread.sleep(4000);
		JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
		js1.executeScript("arguments[0].click();", OMTMNP.get_Accountbutton());

		JavascriptExecutor js2 = (JavascriptExecutor) DriverManager.getDriver();
		js2.executeScript("arguments[0].click();", OMTMNP.get_Account_Signout());

//		/*
//		 * JavascriptExecutor js4 = (JavascriptExecutor)
//		 * DriverManager.getDriver(); js4.executeScript("arguments[0].click();",
//		 * OMTMNP.get_Account());
//		 * 
//		 * JavascriptExecutor js3 = (JavascriptExecutor)
//		 * DriverManager.getDriver(); js3.executeScript("arguments[0].click();",
//		 * OMTMNP.get_Account_Signin());
//		 * 
//		 * JavascriptExecutor js5 = (JavascriptExecutor)
//		 * DriverManager.getDriver(); js5.executeScript("arguments[0].click();",
//		 * OMTMNP.get_OKTA_SSO_Btn());
//		 */

	}

	/*******************************************
	 * I accept Cookies Notification
	 ********************************/

	public void IacceptClick() throws InterruptedException {
		if (OMTMNP.isElementExist("Cookies Notification", "cookiesNotification", 10)) {
			// if (OMTMNP.isClickable("privacyAccept", 5)) {
			// OMTMNP.clickOnElement("Link", "privacy Accept", "privacyAccept");
			JavascriptExecutor js4 = (JavascriptExecutor) DriverManager.getDriver();
			js4.executeScript("arguments[0].click();", OMTMNP.get_privacyAccept());
			// }
		}
	}

	// *********************************************************************************************************

//	public void OMT_Trackmyorderlogin(String ORDERID, String EMAIL) throws Exception {
//
//		Thread.sleep(6000);
//
//		JavascriptExecutor js4 = (JavascriptExecutor) DriverManager.getDriver();
//		js4.executeScript("arguments[0].click();", OMTMNP.get_Trackmyorder());
//		Thread.sleep(9000);
//
//		OMTMNP.get_Orderid_input().sendKeys(ORDERID);
//		OMTMNP.get_Orderid_email().sendKeys(EMAIL);
//
//		JavascriptExecutor js6 = (JavascriptExecutor) DriverManager.getDriver();
//		js6.executeScript("arguments[0].click();", OMTMNP.get_Trackmyorder_button());
//		Thread.sleep(4000);
//
//	}

	/*******************************************
	 * Under Mobile porting details Update Order Status
	 * 
	 * @throws Exception
	 ********************************/
	public String UpdateOrderStatus(String StatusUpdate) throws Exception {
		switch (StatusUpdate) {
		case "Success":
			OrderStatusChange("Success");
			break;
		case "PortingReqStatusPeding":
			OrderStatusChange("Pending");
			break;
		case "PortingReqStatusFailed":
			OrderStatusChange("Failed");
			break;
		}

		return StatusUpdate;

	}

	/******************************************
	 * Checking Order disposition Status and Changing the Value Under Mobile porting
	 * details
	 * 
	 * @throws Exception
	 ********************************/

	private void OrderStatusChange(String Status) throws Exception {
		// TODO Auto-generated method stub

//		String DispositionStatus = OMTMNP.get_Dashboard_Dispo().getText();

		if (Status.equalsIgnoreCase("Success")) {
			BP.scroll_vertical(450);

//			JavascriptExecutor jsstatus = (JavascriptExecutor) DriverManager.getDriver();
//			jsstatus.executeScript("arguments[0].click();", OMTMNP.get_ClickPortingStatus());
//			Success
			// Order Change Status
			Thread.sleep(2000L);

			OMTMNP.select_PortingReqStatusSuccess(Status);
			BP.scroll_vertical(100);
			System.out.println("Porting Status : " + Status);
			Thread.sleep(2000L);
			Control.takeScreenshot();
			JavascriptExecutor jss = (JavascriptExecutor) DriverManager.getDriver();
			jss.executeScript("arguments[0].click();", OMTMNP.get_Savebutton());
			Control.takeScreenshot();
			BP.scroll_vertical(690);
			JavascriptExecutor js6 = (JavascriptExecutor) DriverManager.getDriver();
			js6.executeScript("arguments[0].click();", OMTMNP.get_Confirmcorrect());
			Control.takeScreenshot();

		} else if (Status.equalsIgnoreCase("Failed")) {
			BP.scroll_vertical(380);
			// Order
			OMTMNP.select_PortingReqStatusFailed(Status);
			System.out.println("Porting Status : " + Status);
			Thread.sleep(2000L);

			JavascriptExecutor jss = (JavascriptExecutor) DriverManager.getDriver();
			jss.executeScript("arguments[0].click();", OMTMNP.get_Savebutton());

			BP.scroll_vertical(690);
			JavascriptExecutor js7 = (JavascriptExecutor) DriverManager.getDriver();
			js7.executeScript("arguments[0].click();", OMTMNP.get_Confirmcorrect());
		}

		else if (Status.equalsIgnoreCase("Pending")) {
			BP.scroll_vertical(380);
			// Order
			OMTMNP.select_PortingReqStatusSuccess(Status);
			System.out.println("Porting Status : " + Status);
			Thread.sleep(2000L);

			JavascriptExecutor jss = (JavascriptExecutor) DriverManager.getDriver();
			jss.executeScript("arguments[0].click();", OMTMNP.get_Savebutton());

			BP.scroll_vertical(690);
			JavascriptExecutor js7 = (JavascriptExecutor) DriverManager.getDriver();
			js7.executeScript("arguments[0].click();", OMTMNP.get_Confirmcorrect());
		}
		System.out.println("Execution Completed");
	}

	/*************************************************************************/

}
