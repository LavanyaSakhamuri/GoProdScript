package globeOnline_OMTOkta;

import java.util.ArrayList;


import java.util.LinkedHashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

//import com.pages.ada.ADALanding_Page;
import com.pages.ada.BasePage;
//import com.pages.omt.ACQUI_omt_page;
import com.pages.omt.HPW_omt_page;

//import globeOnline_ADA.Constant;
//import globeOnline_OMT.Constant_OMT;
import utility.*;
import globeOnline_CommonMethods.DriverManager;
import globeOnline_CommonMethods.util;

public class OMT_HPW_Functions {
	private static LinkedHashMap<String, String> Map = new LinkedHashMap<>();
	private util util = new util();
	private BasePage BP = new BasePage();
	public Constant Constant = new Constant();
	private HPW_omt_page OMTHPW = new HPW_omt_page();

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
	public void OMTSearch_and_ValidateDashboard1() throws Exception {

		String OrderRefId = util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.OrderRefID);
		Control.takeScreenshot();
		OMTHPW.get_SearchField().sendKeys(OrderRefId);
		Thread.sleep(5000L);
		Control.takeScreenshot();
		OMTHPW.clickOnElement("Search button", "Search", "Search");
		// Boolean SearchResult = OMTHPW.get_SearchError().isDisplayed();
		// if(SearchResult = true) {
		System.out.println("Order displayed in Dashboard as:"+"\n"+
				"Date Submitted: " + OMTHPW.get_Dashboard_DateSubmitted().getText()+"\n"+
				"Reference Number: "+ OMTHPW.get_Dashboard_RefNum().getText()+"\n"+
				"Last Name: " + OMTHPW.get_Dashboard_LName().getText()+"\n"+
				"First Name: " + OMTHPW.get_Dashboard_FName().getText()+"\n"+
				"PRODUCT Availed: " + OMTHPW.get_Dashboard_PRODUCTAvailed().getText()+"\n"+
				"Disposition Status: " + OMTHPW.get_Dashboard_Dispo().getText());
//				"Reason / Remarks: " + OMTHPW.get_Dashboard_Reason().getText());
//				"Assignee: " + OMTHPW.get_Dashboard_Assignee().getText());
					
		// String Reason=OMTHPW.get_Dashboard_Reason().getAttribute("value");
		/*
		 * if(OMTHPW.get_Dashboard_Reason().isDisplayed()) {
		 * System.out.println("Reason / Remarks: " +
		 * OMTHPW.get_Dashboard_Reason().getText()); }
		 */
		// "Reason / Remarks: " + OMTHPW.get_Dashboard_Reason().getText()+"\n"
		// "Assignee: " +
		// OMTHPW.get_Dashboard_Assignee().getAttribute("value")
		Control.takeScreenshot();
		OMTHPW.isElementExist("View Button", "ViewBtn", 10);
		OMTHPW.isElementExist("Edit Button", "EditBtn", 10);
		// }
	}

	
	
	
	/****************************************NEED FOR THESE *******************************************/
		
	public String Validate_ORDER(String OrderNumber, String Dispo) {
		System.out.println("Order Info: "+ "\n" + 
				"Ordernumber :" + OMTHPW.get_Orderid().getAttribute("value") + "\n" +
				 "Ordermethod :" + OMTHPW.get_Ordermethod().getAttribute("value") + "\n" +
				"Customertyoe: " + OMTHPW.get_Customertyoe().getAttribute("value") + "\n" +
				"Checkoutmethod: " + OMTHPW.get_Checkoutmethod().getAttribute("value") + "\n" +
		    	"Giveasagift: " + OMTHPW.get_Giveasagift().getAttribute("value"));
		if (OrderNumber.equalsIgnoreCase(OMTHPW.get_Orderid().getText())) {
			System.out.println("Customer Order Details: " + "\n" +

					"Order Type: " + OMTHPW.get_Ordermethod().getAttribute("value"));
		}
		// "OrderID: " + OMTHPW.get_OMT_OrderID().getAttribute("value") + "\n"
		// +
		else {
			System.out.println("OrderID did not match - Failed");
		}

		String a = OMTHPW.get_OMT_Disposition().getAttribute("value");
		System.out.println(a);
		By val = By.xpath("//option[@value='" + a + "']");
		String b = DriverManager.getDriver().findElement(val).getText();
		if (Dispo.equalsIgnoreCase(b)) {
			System.out.println(
					"Disposition: " + b );
			//"Reason: " + OMTHPW.get_OMT_DispoReason().getText()
		} else {
			System.out.println("Disposition did not match - Failed");
		}
		return b;
	}

public String orderview_CustomerDetails() throws Exception {
		
		//CustomerDetails
	OMTHPW.isElementExist("CustomerDetails", "Customerde6tails", 10);
	BP.scroll_vertical(300);
		JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
		js1.executeScript("arguments[0].click();", OMTHPW.get_Customerdetails());
		Control.takeScreenshot();
//		OMTHPW.isElementExist("Firstname", "Firstname", 10);
//		OMTHPW.isElementExist("Firstname_input", "Firstname_input", 10);
//		OMTHPW.isElementExist("Middlename", "Middlename", 10);
//		OMTHPW.isElementExist("Middlename Value", "Middlename_input", 10);
//		OMTHPW.isElementExist("Lastname", "Lastname", 10);
//		OMTHPW.isElementExist("Lastname Value", "Lastname_input", 10);
//		OMTHPW.isElementExist("Emailaddress", "Emailaddress", 10);
//		OMTHPW.isElementExist("Emailaddress Id", "Emailaddress_input", 10);
//		OMTHPW.isElementExist("Mobilenumber", "Mobilenumber", 10);
//		OMTHPW.isElementExist("Mobilenumber value", "Mobilenumber_input", 10);
		String FName = OMTHPW.get_Firstname_input().getAttribute("value");
		String MName = OMTHPW.get_Middlename_input().getAttribute("value");
		String LName = OMTHPW.get_Lastname_input().getAttribute("value");
		String Em = OMTHPW.get_Emailaddress_input().getAttribute("value");

		String CustomerDetails = FName + " " + MName + " " + LName + "," + Em;


		
		System.out.println("PRIMARY CUSTOMER DETAILS: "+ "\n" + 
				"Firstname: " + OMTHPW.get_Firstname_input().getAttribute("value") +"\n"+ "Middle Name: " + OMTHPW.get_Middlename_input().getAttribute("value") + "\n " + "Last Name: " + OMTHPW.get_Lastname_input().getAttribute("value") + "\n" +
				"Mobile Number: " + OMTHPW.get_Mobilenumber_input().getAttribute("value") + "\n" +
				"Email Address: " + OMTHPW.get_Emailaddress_input().getAttribute("value"));
		return CustomerDetails;
		}	
	public void UPDATEmobilenumberforpaymentSCenario() throws Exception
	{
		OMTHPW.isElementExist("CustomerDetails", "Customerde6tails", 10);
		JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
		js1.executeScript("arguments[0].click();", OMTHPW.get_Customerdetails());
		Control.takeScreenshot();
		OMTHPW.get_Mobilenumber_input().clear();
		OMTHPW.get_Mobilenumber_input().sendKeys("09440000765");
		System.out.println("PRIMARY CUSTOMER DETAILS: "+ "\n" + 
				"Firstname: " + OMTHPW.get_Firstname_input().getAttribute("value") +"\n"+ "Middle Name: " + OMTHPW.get_Middlename_input().getAttribute("value") + "\n " + "Last Name: " + OMTHPW.get_Lastname_input().getAttribute("value") + "\n" +
				"Mobile Number: " + OMTHPW.get_Mobilenumber_input().getAttribute("value") + "\n" +
				"Email Address: " + OMTHPW.get_Emailaddress_input().getAttribute("value"));
		
		JavascriptExecutor js2 = (JavascriptExecutor) DriverManager.getDriver();
		js2.executeScript("arguments[0].click();", OMTHPW.get_Savebutton());

		BP.scroll_vertical(690);
		JavascriptExecutor js6 = (JavascriptExecutor) DriverManager.getDriver();
		js6.executeScript("arguments[0].click();", OMTHPW.get_Confirmcorrect());
		
	}
public void orderview_RecipentDetails() throws Exception {
	
	//Recipentdetails
	OMTHPW.isElementExist("Recipentdetails", "ReceipentDetails", 10);
	JavascriptExecutor jsre = (JavascriptExecutor) DriverManager.getDriver();
	jsre.executeScript("arguments[0].click();", OMTHPW.get_ReceipentDetails());
	BP.scroll_vertical(300);
	Control.takeScreenshot();
//	OMTHPW.isElementExist("Name of the Receipent", "NameofRecipent", 10);
//	OMTHPW.isElementExist("Name of the Receipent Value", "NameofRecipent_input", 10);
//	OMTHPW.isElementExist("MobilenumberofRecipent", "MobilenumberofRecipent", 10);
//	OMTHPW.isElementExist("MobilenumberofRecipent Value", "MobilenumberofRecipent_input", 10);
//	
	System.out.println("Recipient DETAILS: "+ "\n" + 
			"Recipient Name: " + OMTHPW.get_NameofRecipent_input().getAttribute("value") + "\n" +
			"Mobile Number: " + OMTHPW.get_MobilenumberofRecipent_input().getAttribute("value"));
	}
	//*********************************************************************************************************	
	public void orderview_AddressDetails() throws Exception {
		
	//AddressDetails
		OMTHPW.isElementExist("AddressDetails", "Addressdetails", 10);
		BP.scroll_vertical(300);
	JavascriptExecutor js3 = (JavascriptExecutor) DriverManager.getDriver();
	js3.executeScript("arguments[0].click();", OMTHPW.get_Addressdetails());
	Control.takeScreenshot();
//	OMTHPW.isElementExist("Addresstype", "Addresstype", 10);
//	OMTHPW.isElementExist("House_select", "House_select", 10);
//	OMTHPW.isElementExist("Condominum_select", "Condominum_select", 10);
//	OMTHPW.isElementExist("House", "House", 10);
//	OMTHPW.isElementExist("House Value", "House_input", 10);
//	OMTHPW.isElementExist("Street", "Street", 10);
//	OMTHPW.isElementExist("Street Value", "Street_input", 10);
//	OMTHPW.isElementExist("Village", "Village", 10);
//	OMTHPW.isElementExist("Village Input", "Village_input", 10);
//	OMTHPW.isElementExist("Barangay", "Barangay", 10);
//	OMTHPW.isElementExist("Barangay Value", "Barangay_input", 10);
//	OMTHPW.isElementExist("City", "City", 10);
//	OMTHPW.isElementExist("City Value", "City_input", 10);
//	OMTHPW.isElementExist("Province", "Province", 10);
//	OMTHPW.isElementExist("Province Values", "Province_input", 10);
//	OMTHPW.isElementExist("Zipcode", "Zipcode", 10);
//	OMTHPW.isElementExist("Zipcode value", "Zipcode_input", 10);
//	OMTHPW.isElementExist("Longitude", "Longitude", 10);
//	OMTHPW.isElementExist("Longitude Value", "Longitude_input", 10);
//	OMTHPW.isElementExist("Latitude", "Latitude", 10);
//	OMTHPW.isElementExist("Latitude Value", "Latitude_input", 10);
	}
	//*********************************************************************************************************	
	public String Validate_RegisteredAddress(String House_Condo) {
		BP.scroll_vertical(300);
		String a = OMTHPW.get_PrimaryRegAdd_Brgy().getAttribute("value");
		By b = By.xpath("//select[@name='barangay']//option[@value=" + "'" + a + "'" + "]");
		String Barangay = DriverManager.getDriver().findElement(b).getText();

		String c = OMTHPW.get_PrimaryRegAdd_City().getAttribute("value");
		By d = By.xpath("//select[@name='city']//option[@value=" + "'" + c + "'" + "]");
		String City = DriverManager.getDriver().findElement(d).getText();

		String e = OMTHPW.get_PrimaryRegAdd_Province().getAttribute("value");
		By f = By.xpath("//select[@name='province']//option[@value=" + "'" + e + "'" + "]");
		String Province = DriverManager.getDriver().findElement(f).getText();

		
		if(House_Condo.equalsIgnoreCase("House")) {
			System.out.println("Registered Address House: " + OMTHPW.get_PrimaryRegAdd_houseNo().getAttribute("value") + " " + OMTHPW.get_PrimaryRegAdd_Street().getAttribute("value") + " " +
					OMTHPW.get_PrimaryRegAdd_VillageSubdi().getAttribute("value") + " " + Barangay + " " + City + ", " +
					Province + " " + OMTHPW.get_PrimaryRegAdd_Zipcode().getAttribute("value") + "\n" +
					"Longitude: " + OMTHPW.get_PrimaryRegAdd_Longitude().getAttribute("value") + "\n" + "Latitude: " + OMTHPW.get_PrimaryRegAdd_Latitude().getAttribute("value"));		
			String AddressDetails = OMTHPW.get_PrimaryRegAdd_houseNo().getAttribute("value") + ","
					+ OMTHPW.get_PrimaryRegAdd_Street().getAttribute("value") + ","
					+ OMTHPW.get_PrimaryRegAdd_VillageSubdi().getAttribute("value") + "," + Barangay + "," + City
					+ ", " + Province + "," + OMTHPW.get_PrimaryRegAdd_Zipcode().getAttribute("value");
			return AddressDetails;}
	else {
			System.out.println("Registered Address Condo: " + OMTHPW.get_PrimaryRegAdd_FlrNo().getAttribute("value") + " " + OMTHPW.get_PrimaryRegAdd_BuildingName().getAttribute("value") + " " +
					OMTHPW.get_PrimaryRegAdd_Street().getAttribute("value") + " " + OMTHPW.get_PrimaryRegAdd_Brgy().getAttribute("value") + " " + OMTHPW.get_PrimaryRegAdd_City().getAttribute("value") + ", " +
					OMTHPW.get_PrimaryRegAdd_Province().getAttribute("value") + " " + OMTHPW.get_PrimaryRegAdd_Zipcode().getAttribute("value") + "\n" +
					"Longitude: " + OMTHPW.get_PrimaryRegAdd_Longitude().getAttribute("value") + "\n" + "Latitude: " + OMTHPW.get_PrimaryRegAdd_Latitude().getAttribute("value"));		
			
			String AddressDetails=OMTHPW.get_PrimaryRegAdd_FlrNo().getAttribute("value") + " " + OMTHPW.get_PrimaryRegAdd_BuildingName().getAttribute("value") + " " +
					OMTHPW.get_PrimaryRegAdd_Street().getAttribute("value") + " " +Barangay + " " + City + ", " +Province + " " + OMTHPW.get_PrimaryRegAdd_Zipcode().getAttribute("value") + "\n" +
					"Longitude: " + OMTHPW.get_PrimaryRegAdd_Longitude().getAttribute("value") + "\n" + "Latitude: " + OMTHPW.get_PrimaryRegAdd_Latitude().getAttribute("value");
			return AddressDetails;
	}
		
		//return AddressDetails;

	}

	//*********************************************************************************************************	
	
			public void Validate_OMTHPWRegisteredAddressForPayment(String House_Condo) {
				if(House_Condo.equalsIgnoreCase("House")) {
					System.out.println("Registered Address House: " + "\n" + "House/Block No: " + OMTHPW.get_House_input().getAttribute("value") + "\n" + "Street : " + OMTHPW.get_Street_input().getAttribute("value") + "\n" +
							"Village/ Subdivision: " + OMTHPW.get_Village_input().getAttribute("value") + "\n" + "Barangay:" + OMTHPW.get_Barangay_input().getAttribute("value") + "\n" + "City:" + OMTHPW.get_City_input().getAttribute("value") + "\n" +
							"Province/ Region:" + OMTHPW.get_Province_input().getAttribute("value") + "\n" + "Zip Code: " + OMTHPW.get_Zipcode_input().getAttribute("value") + "\n" +
							"Longitude: " + OMTHPW.get_Longitude_input().getAttribute("value") + "\n" + "Latitude: " + OMTHPW.get_Latitude_input().getAttribute("value"));		
				}
				else {
					System.out.println("Registered Address Condo: " + OMTHPW.get_PrimaryRegAdd_FlrNo().getAttribute("value") + " " + OMTHPW.get_PrimaryRegAdd_BuildingName().getAttribute("value") + " " +
							OMTHPW.get_PrimaryRegAdd_Street().getAttribute("value") + " " + OMTHPW.get_PrimaryRegAdd_Brgy().getAttribute("value") + " " + OMTHPW.get_PrimaryRegAdd_City().getAttribute("value") + ", " +
							OMTHPW.get_PrimaryRegAdd_Province().getAttribute("value") + " " + OMTHPW.get_PrimaryRegAdd_Zipcode().getAttribute("value") + "\n" +
							"Longitude: " + OMTHPW.get_PrimaryRegAdd_Longitude().getAttribute("value") + "\n" + "Latitude: " + OMTHPW.get_PrimaryRegAdd_Latitude().getAttribute("value"));		
				}
			}
	//*********************************************************************************************************	
				
	public void Validate_ShippingAddress(String House_Condo_Sameasbilling) {
		if(House_Condo_Sameasbilling.equalsIgnoreCase("House")) {
			System.out.println("Shipping Address House: " + OMTHPW.get_PrimaryShipAdd_HouseNo().getAttribute("value") + " " + OMTHPW.get_PrimaryShipAdd_VillageSubdi().getAttribute("value") + " " +
					OMTHPW.get_PrimaryShipAdd_Street().getAttribute("value") + " " + OMTHPW.get_PrimaryShipAdd_Brgy().getAttribute("value") + " " + OMTHPW.get_PrimaryShipAdd_City().getAttribute("value") + ", " +
					OMTHPW.get_PrimaryShipAdd_Province().getAttribute("value") + " " + OMTHPW.get_PrimaryShipAdd_ZipCode().getAttribute("value") + "\n" +
					"Longitude: " + OMTHPW.get_PrimaryShipAdd_Longitude().getAttribute("value") + "\n" + "Latitude: " + OMTHPW.get_PrimaryShipAdd_Latitude().getAttribute("value"));
			
		}
		
		else if(House_Condo_Sameasbilling.equalsIgnoreCase("Condo")) {
			System.out.println("Shipping Address House: " + OMTHPW.get_PrimaryShipAdd_FlrNo().getText() + " " + OMTHPW.get_PrimaryShipAdd_BuildingName().getText() + " " +
					OMTHPW.get_PrimaryShipAdd_Street().getAttribute("value") + " " + OMTHPW.get_PrimaryShipAdd_Brgy().getAttribute("value") + " " + OMTHPW.get_PrimaryShipAdd_City().getAttribute("value") + ", " +
					OMTHPW.get_PrimaryShipAdd_Province().getAttribute("value") + " " + OMTHPW.get_PrimaryShipAdd_ZipCode().getAttribute("value") + "\n" +
					"Longitude: " + OMTHPW.get_PrimaryShipAdd_Longitude().getAttribute("value") + "\n" + "Latitude: " + OMTHPW.get_PrimaryShipAdd_Latitude().getAttribute("value"));
			
		}
		else {
			if(OMTHPW.get_PrimarySameasbilling().getText().equalsIgnoreCase(" same as billing ")) {
				System.out.println("Shipping Address same as Billing Address");
			}
			else {
				System.out.println("Shipping Address - Failed");				
			}
			
		}
	}	
			
	
	//*********************************************************************************************************	
	public void orderview_OrderDetails1() throws Exception {
	
	//Orderdetails
		OMTHPW.isElementExist("Orderdetails", "Orderdetails", 10);
		BP.scroll_vertical(300);
	JavascriptExecutor js4 = (JavascriptExecutor) DriverManager.getDriver();
	js4.executeScript("arguments[0].click();", OMTHPW.get_Orderdetails());
	Control.takeScreenshot();
//	OMTHPW.isElementExist("Quantity", "Quantity", 10);
//	OMTHPW.isElementExist("Quantity Value", "Quantity_input", 10);
//	OMTHPW.isElementExist("Producttype", "Producttype", 10);
//	OMTHPW.isElementExist("Producttype_input", "Producttype_input", 10);
//	OMTHPW.isElementExist("sku", "Sku", 10);
//	OMTHPW.isElementExist("SKU Value", "Sku_input", 10);
//	OMTHPW.isElementExist("Matcode", "Matcode", 10);
//	OMTHPW.isElementExist("Matcode Value", "Matcode_input", 10);
//	OMTHPW.isElementExist("BSSCasenumber", "BSSCasenumber", 10);
//	OMTHPW.isElementExist("BSSCasenumber Value", "BSSCasenumber_input", 10);
//	OMTHPW.isElementExist("Reservationid", "Reservationid", 10);
//	OMTHPW.isElementExist("Reservationid Value", "Reservationid_input", 10);
//	OMTHPW.isElementExist("Modemserial", "Modemserial", 10);
//	OMTHPW.isElementExist("Modemserial Value", "Modemserial_input", 10);
//	OMTHPW.isElementExist("Simserial", "Simserial", 10);
//	BP.scroll_vertical(300);
//	OMTHPW.isElementExist("Simserial Value", "Simserial_input", 10);
//	OMTHPW.isElementExist("Deliverycasetitle", "Deliverycasetitle", 10);
//	OMTHPW.isElementExist("Deliverycasetitle Value", "Deliverycasetitle_input", 10);
//	OMTHPW.isElementExist("Deliveryqueuename", "Deliveryqueuename", 10);
//	OMTHPW.isElementExist("Deliveryqueuename value", "Deliveryqueuename_input", 10);
//	OMTHPW.isElementExist("Promocode", "Promocode", 10);
//	OMTHPW.isElementExist("Promocode Value", "Promocode_input", 10);
//	OMTHPW.isElementExist("Discount", "Discount", 10);
//	OMTHPW.isElementExist("Discount Value", "Discount_input", 10);
//	OMTHPW.isElementExist("Projectname", "Projectname", 10);
//	OMTHPW.isElementExist("Projectname Value", "Projectname_input", 10);
	System.out.println("Order Details: " + "\n" +
	"Quantity: " + OMTHPW.get_Quantity_input().getAttribute("value") + "\n" +
	"Producttype: " + OMTHPW.get_Producttype_input().getAttribute("value") + "\n" +
	"Sku: " + OMTHPW.get_Sku_input().getAttribute("value") + "\n" +
	"Matcode: " + OMTHPW.get_Matcode_input().getAttribute("value") + "\n" +
	"BSSCasenumber: " + OMTHPW.get_BSSCasenumber_input().getAttribute("value") + "\n" +
	"Reservationid: " + OMTHPW.get_Reservationid_input().getAttribute("value") + "\n" +
	"Modemserial: " + OMTHPW.get_Modemserial_input().getAttribute("value") + "\n" +
	"Simserial: " + OMTHPW.get_Simserial_input().getAttribute("value") + "\n" +
	"Deliverycasetitle: " + OMTHPW.get_Deliverycasetitle_input().getAttribute("value") + "\n" +
	"Deliveryqueuename: " + OMTHPW.get_Deliveryqueuename_input().getAttribute("value") + "\n" +
	"Promocode: " + OMTHPW.get_Promocode_input().getAttribute("value") + "\n" +
	"Discount: " + OMTHPW.get_Discount_input().getAttribute("value") + "\n" +
	"Projectname: " + OMTHPW.get_Projectname_input().getAttribute("value"));
	}
	
	//*********************************************************************************************************	
	public void orderview_PaymentDetails() throws Exception {
	
	//PaymentDetails
	OMTHPW.isElementExist("PaymentDetails", "Paymentdeatils", 10);
	JavascriptExecutor js5 = (JavascriptExecutor) DriverManager.getDriver();
	js5.executeScript("arguments[0].click();", OMTHPW.get_Paymentdeatils());
	BP.scroll_vertical(600);
	Control.takeScreenshot();
//	OMTHPW.isElementExist("Totalamount", "Totalamount", 10);
//	OMTHPW.isElementExist("Totalamount Value", "Totalamount_input", 10);
//	OMTHPW.isElementExist("Paymentmethod", "Paymentmethod", 10);
//	OMTHPW.isElementExist("Paymentmethod Value", "Paymentmethod_input", 10);
//	OMTHPW.isElementExist("Transaction", "Transaction", 10);
//	OMTHPW.isElementExist("Transaction Value", "Transaction_input", 10);
//	OMTHPW.isElementExist("Or", "Or", 10);
//	OMTHPW.isElementExist("Or Value", "Or_input", 10);
//	
//	
	System.out.println("Order Details: " + "\n" +
			"Total Amount: " + OMTHPW.get_Totalamount_input().getAttribute("value") + "\n" +
			"Payment Method: " + OMTHPW.get_Paymentmethod_input().getAttribute("value") + "\n" +
			"Transaction ID: " + OMTHPW.get_Transaction_input().getAttribute("value") + "\n" +
			"OR #: " + OMTHPW.get_Or_input().getAttribute("value"));
	
	}
	//*********************************************************************************************************	
	public void orderview_FullfilmentDetails() throws Exception {
		
	//Fullfilmentdetails
	OMTHPW.isElementExist("Fullfilmentdetails", "Fullfilmentdetails", 10);
	BP.scroll_vertical(650);
	JavascriptExecutor js6 = (JavascriptExecutor) DriverManager.getDriver();
	js6.executeScript("arguments[0].click();", OMTHPW.get_Fullfilmentdetails());
	Control.takeScreenshot();
	if(OMTHPW.get_FulfillDet_PALrbtn().isSelected()) {
		System.out.println("PAL is selected");
	}
	else if(OMTHPW.get_FulfillDet_FSOrbtn().isSelected()) {
		System.out.println("FSO TD is selected");
	}
	else if(OMTHPW.get_FulfillDet_RSOrbtn().isSelected()) {
		System.out.println("RSO TD is selected");
	}
	else {
		System.out.println("No Fullfilmen selected - Failed");
	}
	
	if(OMTHPW.get_FulfillDet_Xpressrbtn().isSelected()) {
		System.out.println("Express Delivery is selected");
	}
	else if(OMTHPW.get_FulfillDet_Regularrbtn().isSelected()) {
		System.out.println("Regular Delivery is selected");
	}
	
//	OMTHPW.isElementExist("Fulfilment", "Fulfilment", 10);
//	OMTHPW.isElementExist("Delivery", "Delivery", 10);
//	OMTHPW.isElementExist("Assignedcourier", "Assignedcourier", 10);
//	OMTHPW.isElementExist("Assignedagent", "Assignedagent", 10);
//	OMTHPW.isElementExist("Schedule", "Schedule", 10);
//	OMTHPW.isElementExist("Status", "Status", 10);
//	OMTHPW.isElementExist("Remarks", "Remarks", 10);
//	OMTHPW.isElementExist("Addnewrowbutton", "Addnewrowbutton", 10);
//	
	System.out.println("Fullfilmentdetails : " + OMTHPW.get_Fulfilment().getAttribute("value") + "\n" +
	"Delivery: " + OMTHPW.get_Delivery().getAttribute("value") + "\n" +
	"Assigned Courier: " + OMTHPW.get_Delivery().getAttribute("value") + "\n" +
	"Assigned Agent: " + OMTHPW.get_Assignedcourier().getAttribute("value") + "\n" +
	"Schedule: " + OMTHPW.get_Assignedagent().getAttribute("value") + "\n" +
	"Status: " + OMTHPW.get_Schedule().getAttribute("value") + "\n" +
	"Remarks: " + OMTHPW.get_Remarks().getAttribute("value") + "\n" +
	"Remarks: " + OMTHPW.get_Status().getAttribute("value")  + "\n" +
	"Addnewrowbutton: " + OMTHPW.get_Addnewrowbutton().getAttribute("value") );
	
	BP.scroll_vertical(800);
	
	}
	//*********************************************************************************************************	
	public void orderview_ActivationDetails() throws Exception {
	
	//Activationdetails
	OMTHPW.isElementExist("Activationdetails", "Activationdetails", 10);
	JavascriptExecutor js7 = (JavascriptExecutor) DriverManager.getDriver();
	js7.executeScript("arguments[0].click();", OMTHPW.get_Activationdetails());
	Control.takeScreenshot();
//	OMTHPW.isElementExist("Channel", "Channel", 10);
//	OMTHPW.isElementExist("Channel Value", "Channel_input", 10);
//	OMTHPW.isElementExist("Dateofactivation", "Dateofactivation", 10);
//	OMTHPW.isElementExist("Dateofactivation Value", "Dateofactivation_input", 10);
//	OMTHPW.isElementExist("Time", "Time", 10);
//	OMTHPW.isElementExist("Time Entry", "Time_input", 10);
//	
	System.out.println("Fullfilmentdetails : " + OMTHPW.get_Channel_input().getAttribute("value") + "\n" +	
			"Channel: " + OMTHPW.get_Dateofactivation_input().getAttribute("value") + "\n" +
			"Dateofactivation: " + OMTHPW.get_Status().getAttribute("value")  + "\n" +
			"Time_input: " + OMTHPW.get_Time_input().getAttribute("value") );
	//BP.scroll_vertical(200);
	}
	//*********************************************************************************************************	
	public void orderview_RefundDetails() throws Exception {
	
	//Refunddetails
		OMTHPW.isElementExist("Refunddetails", "RefundDetails", 10);
	JavascriptExecutor js8 = (JavascriptExecutor) DriverManager.getDriver();
	js8.executeScript("arguments[0].click();", OMTHPW.get_RefundDetails());
	Control.takeScreenshot();
//	OMTHPW.isElementExist("RefundRequestdate", "RefundRequestdate", 10);
//	OMTHPW.isElementExist("RefundRequestdate Value", "RefundRequestdate_input", 10);
//	OMTHPW.isElementExist("ValidamountofRefund", "ValidamountofRefund", 10);
//	OMTHPW.isElementExist("ValidamountofRefund Value", "ValidamountofRefund_input", 10);
//	OMTHPW.isElementExist("IssuingBank", "IssuingBank", 10);
//	OMTHPW.isElementExist("IssuingBank Value", "IssuingBank_input", 10);
//	OMTHPW.isElementExist("Cardnumber", "Cardnumber", 10);
//	OMTHPW.isElementExist("Cardnumber Value", "Cardnumber_input", 10);
//	OMTHPW.isElementExist("Accountname", "Accountname", 10);
//	OMTHPW.isElementExist("Accountname Value", "Accountname_input", 10);
//	OMTHPW.isElementExist("Refunddetails", "Authorization", 10);
//	OMTHPW.isElementExist("Refunddetails", "Authorization_input", 10);
//	OMTHPW.isElementExist("Time_input", "Time_input", 10);
//	OMTHPW.isElementExist("Authorization", "Authorization", 10);
//	OMTHPW.isElementExist("Authorization Value", "Authorization_input", 10);
//	OMTHPW.isElementExist("Remarks_Refund", "Remarks_Refund", 10);
//	OMTHPW.isElementExist("Remarks Value", "Remarks_input", 10);
//	OMTHPW.isElementExist("RefundReference", "RefundReference", 10);
//	OMTHPW.isElementExist("RefundReference Value", "RefundReference_input", 10);
//	
	System.out.println("Refund details : "  + OMTHPW.get_RefundRequestdate_input().getAttribute("value") + "\n" +
			"ValidamountofRefund: " + OMTHPW.get_ValidamountofRefund_input().getAttribute("value") + "\n" +
			"IssuingBank: " + OMTHPW.get_IssuingBank_input().getAttribute("value") + "\n" +
			"Cardnumber: " + OMTHPW.get_Cardnumber_input().getAttribute("value") + "\n" +
			"Accountname: " + OMTHPW.get_Accountname_input().getAttribute("value") + "\n" +
			"Authorization: " + OMTHPW.get_Authorization_input().getAttribute("value") + "\n" +
			//"Remarks: " + OMTHPW.get_Time_input().getAttribute("value") + "\n" +
			"Remarks_Refund: " + OMTHPW.get_Remarks_Refund().getAttribute("value")  + "\n" +
			"Remarks: " + OMTHPW.get_Remarks_input().getAttribute("value") + "\n" +
			"RefundReference: " + OMTHPW.get_RefundReference_input().getAttribute("value"));

	}
	//*********************************************************************************************************	
	public void orderview_Sale_OrderHistoryDetails() throws Exception {
	
	//AfterSale and OrderHistory
//	OMTHPW.isElementExist("Aftersale", "Aftersale", 10);
//	OMTHPW.isElementExist("OrderHistory", "OrderHistory", 10);
	JavascriptExecutor js9 = (JavascriptExecutor) DriverManager.getDriver();
	js9.executeScript("arguments[0].click();", OMTHPW.get_OrderHistory());
	Control.takeScreenshot();
	System.out.println("Order History Details : " + OMTHPW.get_Channel_input().getAttribute("value") + "\n" +	
			"Aftersale: " + OMTHPW.get_Aftersale().getAttribute("value") + "\n" +
			"Dateofactivation: " + OMTHPW.get_OrderHistory().getAttribute("value"));
			

	OMTHPW.isElementExist("Backbutton", "Backbutton", 10);
	OMTHPW.isElementExist("Savebutton", "Savebutton", 10);

}


/***********************************************************************************************************/
	public void forproccessing(String Status) throws Exception {

		// Order
		OMTHPW.select_DispositionStatus(Status);
		System.out.println("forproccessing : " + Status);
		Thread.sleep(2000L);

		BP.scroll_vertical(380);
		JavascriptExecutor js2 = (JavascriptExecutor) DriverManager.getDriver();
		js2.executeScript("arguments[0].click();", OMTHPW.get_Orderdetails());
		String a = OMTHPW.get_BSSCasenumber_input().getAttribute("value");
		if (a.isEmpty()) {
			OMTHPW.get_BSSCasenumber_input().sendKeys("764532");
			System.out.println("BSS Order ID: " + OMTHPW.get_BSSCasenumber_input().getAttribute("value"));
		}
		String b = OMTHPW.get_Reservationid_input().getAttribute("value");
		if (b.isEmpty()) {
			OMTHPW.get_Reservationid_input().sendKeys("43725");

			System.out.println("BSS Order Case ID: " + OMTHPW.get_Reservationid_input().getAttribute("value"));
		}
		JavascriptExecutor jss = (JavascriptExecutor) DriverManager.getDriver();

		jss.executeScript("arguments[0].click();", OMTHPW.get_Savebutton());

		BP.scroll_vertical(690);
		JavascriptExecutor js6 = (JavascriptExecutor) DriverManager.getDriver();
		js6.executeScript("arguments[0].click();", OMTHPW.get_Confirmcorrect());

	}
	// public void AssignAgent(String agentName) throws Exception{
	// if(OMTHPW.isElementExist("Checkbox Button", "Checkbox", 10)) {
	// OMTHPW.clickOnElement("AssignAgent: ", "Checkox", "Checkbox");
	// OMTHPW.clickOnElement("AssignAgent: ", "Assign_checbox",
	// "Assign_Checkbox");
	//
	// OMTHPW.get_SelectAdmin().sendKeys(agentName);
	//
	// OMTHPW.clickOnElement("AssignAgent: ", "FSO", "SelectFSO");
	//
	// OMTHPW.clickOnElement("AssignAgent: ", "Assignbutton", "Assign_btn");
	//
	//
	// }
	// }

	/**************************************************************************************************************/
	public void Fordelivery(String Status) throws Exception {

		// Order
		OMTHPW.select_DispositionStatus(Status);
		System.out.println("Fordelivery : " + Status);
		Thread.sleep(2000L);
		JavascriptExecutor jss = (JavascriptExecutor) DriverManager.getDriver();
		jss.executeScript("arguments[0].click();", OMTHPW.get_Savebutton());

		BP.scroll_vertical(690);
		JavascriptExecutor js6 = (JavascriptExecutor) DriverManager.getDriver();
		js6.executeScript("arguments[0].click();", OMTHPW.get_Confirmcorrect());

	}

	public void ForRedelivery1(String Status) throws Exception {

		// Order
		OMTHPW.select_DispositionStatus(Status);
		System.out.println("ForRedelivery : " + Status);
		Thread.sleep(2000L);
		BP.scroll_vertical(530);
		JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
		js1.executeScript("arguments[0].click();", OMTHPW.get_Fullfilmentdetails());

		OMTHPW.get_FulfillDet_Schedule().sendKeys("07/19/2022");
		System.out.println("Schedule: " + OMTHPW.get_FulfillDet_Schedule().getAttribute("value"));
		OMTHPW.select_get_FulfillDet_Status("Not Received");
		System.out.println("Status: " + OMTHPW.get_FulfillDet_Status().getAttribute("value"));
		OMTHPW.select_get_FulfillDet_Remarks("1st Delivery Attempt Failed");
		System.out.println("Remarks: " + OMTHPW.get_FulfillDet_Remarks().getAttribute("value"));

		JavascriptExecutor jss = (JavascriptExecutor) DriverManager.getDriver();
		jss.executeScript("arguments[0].click();", OMTHPW.get_Savebutton());

		BP.scroll_vertical(690);
		JavascriptExecutor js6 = (JavascriptExecutor) DriverManager.getDriver();
		js6.executeScript("arguments[0].click();", OMTHPW.get_Confirmcorrect());

	}

	public void ForRedelivery2(String Status) throws Exception {

		// Order
		OMTHPW.select_DispositionStatus(Status);
		System.out.println("ForRedelivery : " + Status);
		Thread.sleep(2000L);
		BP.scroll_vertical(530);
		JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
		js1.executeScript("arguments[0].click();", OMTHPW.get_Fullfilmentdetails());

		JavascriptExecutor jsrow = (JavascriptExecutor) DriverManager.getDriver();
		jsrow.executeScript("arguments[0].click();", OMTHPW.get_addnewrow());

		OMTHPW.get_FulfillDet_Schedule().sendKeys("07/20/2022");
		System.out.println("Schedule: " + OMTHPW.get_FulfillDet_Schedule().getAttribute("value"));

		OMTHPW.select_get_FulfillDet_Status("Not Received");
		System.out.println("Status: " + OMTHPW.get_FulfillDet_Status().getAttribute("value"));

		OMTHPW.select_get_FulfillDet_Remarks("2nd Delivery Attempt Failed");
		System.out.println("Remarks: " + OMTHPW.get_FulfillDet_Remarks().getAttribute("value"));

		JavascriptExecutor jss = (JavascriptExecutor) DriverManager.getDriver();
		jss.executeScript("arguments[0].click();", OMTHPW.get_Savebutton());

		BP.scroll_vertical(690);
		JavascriptExecutor js6 = (JavascriptExecutor) DriverManager.getDriver();
		js6.executeScript("arguments[0].click();", OMTHPW.get_Confirmcorrect());

	}

	public void ForRedelivery3(String Status) throws Exception {

		// Order
		OMTHPW.select_DispositionStatus(Status);
		System.out.println("ForRedelivery : " + Status);
		Thread.sleep(2000L);
		BP.scroll_vertical(530);
		JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
		js1.executeScript("arguments[0].click();", OMTHPW.get_Fullfilmentdetails());

		JavascriptExecutor jsrow = (JavascriptExecutor) DriverManager.getDriver();
		jsrow.executeScript("arguments[0].click();", OMTHPW.get_addnewrow());

		OMTHPW.get_FulfillDet_Schedule().sendKeys("07/20/2022");
		System.out.println("Schedule: " + OMTHPW.get_FulfillDet_Schedule().getAttribute("value"));

		OMTHPW.select_get_FulfillDet_Status("Not Received");
		System.out.println("Status: " + OMTHPW.get_FulfillDet_Status().getAttribute("value"));

		OMTHPW.select_get_FulfillDet_Remarks("3rd Delivery Attempt Failed");
		System.out.println("Remarks: " + OMTHPW.get_FulfillDet_Remarks().getAttribute("value"));

		JavascriptExecutor jss = (JavascriptExecutor) DriverManager.getDriver();
		jss.executeScript("arguments[0].click();", OMTHPW.get_Savebutton());

		BP.scroll_vertical(690);
		JavascriptExecutor js6 = (JavascriptExecutor) DriverManager.getDriver();
		js6.executeScript("arguments[0].click();", OMTHPW.get_Confirmcorrect());

	}

	public void Delivered(String Status) throws Exception {

		// Order
		OMTHPW.select_DispositionStatus(Status);
		System.out.println("Delivered : " + Status);
		Thread.sleep(2000L);

		JavascriptExecutor jss = (JavascriptExecutor) DriverManager.getDriver();
		jss.executeScript("arguments[0].click();", OMTHPW.get_Savebutton());

		BP.scroll_vertical(690);
		JavascriptExecutor js6 = (JavascriptExecutor) DriverManager.getDriver();
		js6.executeScript("arguments[0].click();", OMTHPW.get_Confirmcorrect());

	}

	public void Foractivation(String Status) throws Exception {

		// Order
		OMTHPW.select_DispositionStatus(Status);
		System.out.println("Foractivation : " + Status);
		Thread.sleep(2000L);
		BP.scroll_vertical(480);
		JavascriptExecutor jss = (JavascriptExecutor) DriverManager.getDriver();
		jss.executeScript("arguments[0].click();", OMTHPW.get_Activationdetails());
		
		OMTHPW.get_Channel_input().sendKeys(Keys.ENTER);
		OMTHPW.get_Channel_input().sendKeys("HPW");		
		System.out.println("Schedule: " + OMTHPW.get_Channel_input().getAttribute("value"));
		OMTHPW.get_Channel_input().clear();

		OMTHPW.get_Dateofactivation_input().sendKeys(Keys.ENTER);
		OMTHPW.get_Dateofactivation_input().sendKeys("HPW");		
		System.out.println("Schedule: " + OMTHPW.get_Dateofactivation_input().getAttribute("value"));
		OMTHPW.get_Dateofactivation_input().clear();

		OMTHPW.get_Time_input().sendKeys(Keys.ENTER);
		OMTHPW.get_Time_input().sendKeys("HPW");		
		System.out.println("Schedule: " + OMTHPW.get_Time_input().getAttribute("value"));
		OMTHPW.get_Time_input().clear();


		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("arguments[0].click();", OMTHPW.get_Savebutton());

		BP.scroll_vertical(690);
		JavascriptExecutor js6 = (JavascriptExecutor) DriverManager.getDriver();
		js6.executeScript("arguments[0].click();", OMTHPW.get_Confirmcorrect());

	}

	public void Fordispatch(String Status) throws Exception {
		OMTHPW.select_DispositionStatus(Status);
		System.out.println(" FOR DISPATCH  : " + Status);
		Thread.sleep(2000L);
		
		
		JavascriptExecutor jss = (JavascriptExecutor) DriverManager.getDriver();
		jss.executeScript("arguments[0].click();", OMTHPW.get_Customerdetails());
		
		
		System.out.println("Schedule: " + OMTHPW.get_Mobilenumber_input().getAttribute("value"));
		OMTHPW.get_Mobilenumber_input().clear();
		OMTHPW.get_Mobilenumber_input().sendKeys("09552885110");



		JavascriptExecutor jsS = (JavascriptExecutor) DriverManager.getDriver();
		jsS.executeScript("arguments[0].click();", OMTHPW.get_Savebutton());

		BP.scroll_vertical(690);
		JavascriptExecutor js6 = (JavascriptExecutor) DriverManager.getDriver();
		js6.executeScript("arguments[0].click();", OMTHPW.get_Confirmcorrect());


	}
	public void Activated(String Status) throws Exception {

		// Order
		OMTHPW.select_DispositionStatus(Status);
		System.out.println(" Activated  : " + Status);
		Thread.sleep(2000L);

		JavascriptExecutor jss = (JavascriptExecutor) DriverManager.getDriver();
		jss.executeScript("arguments[0].click();", OMTHPW.get_Savebutton());

		BP.scroll_vertical(690);
		JavascriptExecutor js6 = (JavascriptExecutor) DriverManager.getDriver();
		js6.executeScript("arguments[0].click();", OMTHPW.get_Confirmcorrect());

	}
	// *********************************************************************************************************
	public void Signout() throws Exception {

		// Order
		OMTHPW.isElementExist("Order", "Accountbutton", 10);
		Thread.sleep(4000);
		JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
		js1.executeScript("arguments[0].click();", OMTHPW.get_Accountbutton());

		JavascriptExecutor js2 = (JavascriptExecutor) DriverManager.getDriver();
		js2.executeScript("arguments[0].click();", OMTHPW.get_Account_Signout());

//		/*
//		 * JavascriptExecutor js4 = (JavascriptExecutor)
//		 * DriverManager.getDriver(); js4.executeScript("arguments[0].click();",
//		 * OMTHPW.get_Account());
//		 * 
//		 * JavascriptExecutor js3 = (JavascriptExecutor)
//		 * DriverManager.getDriver(); js3.executeScript("arguments[0].click();",
//		 * OMTHPW.get_Account_Signin());
//		 * 
//		 * JavascriptExecutor js5 = (JavascriptExecutor)
//		 * DriverManager.getDriver(); js5.executeScript("arguments[0].click();",
//		 * OMTHPW.get_OKTA_SSO_Btn());
//		 */

	}

	public void IacceptClick() throws InterruptedException {
		if (OMTHPW.isElementExist("Cookies Notification", "cookiesNotification", 10)) {
			// if (OMTHPW.isClickable("privacyAccept", 5)) {
			// OMTHPW.clickOnElement("Link", "privacy Accept", "privacyAccept");
			JavascriptExecutor js4 = (JavascriptExecutor) DriverManager.getDriver();
			js4.executeScript("arguments[0].click();", OMTHPW.get_privacyAccept());
			// }
		}
	}

	// *********************************************************************************************************

	public void OMT_Trackmyorderlogin(String ORDERID, String EMAIL) throws Exception {

		Thread.sleep(6000);

		JavascriptExecutor js4 = (JavascriptExecutor) DriverManager.getDriver();
		js4.executeScript("arguments[0].click();", OMTHPW.get_Trackmyorder());
		Thread.sleep(9000);

		OMTHPW.get_Orderid_input().sendKeys(ORDERID);
		OMTHPW.get_Orderid_email().sendKeys(EMAIL);

		JavascriptExecutor js6 = (JavascriptExecutor) DriverManager.getDriver();
		js6.executeScript("arguments[0].click();", OMTHPW.get_Trackmyorder_button());
		Thread.sleep(4000);

	}
//FOR PROCCESS .FOR DISPATCH ,FOR DELIVERY, FOR ACTIVATION, ACTIVATED,CANCELD
	// *********************************************************//
	public void ordertracker_ForDispatch() {
		OMTHPW.isElementExist("Ordertrackerheading", "MyOrder", 10);
		OMTHPW.isElementExist("Ordertrackerreferenceno", "referencenumber", 10);
		OMTHPW.isElementExist("Ordertrackerorderid", "OT_Orderid", 10);
		// OMTHPW.isElementExist("Ordertracker", "Confirm", 10);
		// OMTHPW.isElementExist("Ordertracker", "Confirm_Subtitle", 10);
		// OMTHPW.isElementExist("Ordertracker", "DISAPTCH", 10);
		// OMTHPW.isElementExist("Ordertracker", "DISAPTCH_Subtitle", 10);
		OMTHPW.isElementExist("Ordertrackerdispatchheading", "DISAPTCH_Heading", 10);//NEED TO CHECK
		// cod
//		OMTHPW.isElementExist("Disaptchdateorderd", "DISAPTCH_Date", 10);
//		OMTHPW.isElementExist("DISAPTCH_Paymentmethod", "DISAPTCH_Paymentmethod", 10);
//		OMTHPW.isElementExist("DISAPTCH_Paymentmethod_val", "DISAPTCH_Paymentmethod_val", 10);
//		OMTHPW.isElementExist("DISAPTCH_Amountpaid", "DISAPTCH_Amountpaid", 10);
//		OMTHPW.isElementExist("DISAPTCH_Estimated_deliverydate", "DISAPTCH_Estimated_deliverydate", 10);//NEED TO CHECK
//		// cod
//		OMTHPW.isElementExist("DISAPTCH_Amountpaid_Val", "DISAPTCH_Amountpaid_Val", 10);
//		OMTHPW.isElementExist("DISAPTCH_Shiptothisaddress_Header", "DISAPTCH_Shiptothisaddress_Header", 10);
//		OMTHPW.isElementExist("DISAPTCH_Shiptothisaddress", "DISAPTCH_Shiptothisaddress", 10);
//		OMTHPW.isElementExist("DISAPTCH_EstimatedDelivery", "DISAPTCH_EstimatedDelivery", 10);


		// for different payment

		// OMTHPW.isElementExist("Ordertrackerdisaptchdate", "DISAPTCH_Date",
		// 10);
		// OMTHPW.isElementExist("Ordertrackerdispathchtext", "DISAPTCH_text",
		// 10);
		// //OMTHPW.isElementExist("Ordertracker", "Deliver_text_right", 10);
		// OMTHPW.isElementExist("Ordertracker", "DISAPTCH_Paymentmethod",
		// 10);
		// OMTHPW.isElementExist("Ordertracker", "DISAPTCH_Paymentmethod_val",
		// 10);
		// OMTHPW.isElementExist("Ordertracker", "DISAPTCH_Amountpaid", 10);
		// OMTHPW.isElementExist("Ordertracker", "DISAPTCH_Amountpaid_Val",
		// 10);
		OMTHPW.isElementExist("Ordertracker", "DISAPTCH_Shiptothisaddress_Header", 10);
		// OMTHPW.isElementExist("Ordertracker", "DISAPTCH_Shiptothisaddress",
		// 10);
		// OMTHPW.isElementExist("Ordertracker", "DISAPTCH_EstimatedDelivery",
		// 10);
		// OMTHPW.isElementExist("Ordertracker",
		// "DISAPTCH_Estimated_deliverydate", 10);

	}
	public void ordertracker_Delivered() {
		OMTHPW.isElementExist("Ordertrackerheading", "MyOrder", 10);
		OMTHPW.isElementExist("Ordertrackerreferenceno", "referencenumber", 10);
		OMTHPW.isElementExist("Ordertrackerorderid", "OT_Orderid", 10);
		// OMTHPW.isElementExist("Ordertracker", "Confirm", 10);
		// OMTHPW.isElementExist("Ordertracker", "Confirm_Subtitle", 10);
		// OMTHPW.isElementExist("Ordertracker", "DISAPTCH", 10);
		// OMTHPW.isElementExist("Ordertracker", "DISAPTCH_Subtitle", 10);
		OMTHPW.isElementExist("Ordertrackerdispatchheading", "DISAPTCH_Heading", 10);//NEED TO CHECK
		// cod
//		OMTHPW.isElementExist("Disaptchdateorderd", "DISAPTCH_Date", 10);
//		OMTHPW.isElementExist("DISAPTCH_Paymentmethod", "DISAPTCH_Paymentmethod", 10);
//		OMTHPW.isElementExist("DISAPTCH_Paymentmethod_val", "DISAPTCH_Paymentmethod_val", 10);
//		OMTHPW.isElementExist("DISAPTCH_Amountpaid", "DISAPTCH_Amountpaid", 10);
//		OMTHPW.isElementExist("DISAPTCH_Estimated_deliverydate", "DISAPTCH_Estimated_deliverydate", 10);//NEED TO CHECK
//		// cod
//		OMTHPW.isElementExist("DISAPTCH_Amountpaid_Val", "DISAPTCH_Amountpaid_Val", 10);
//		OMTHPW.isElementExist("DISAPTCH_Shiptothisaddress_Header", "DISAPTCH_Shiptothisaddress_Header", 10);
//		OMTHPW.isElementExist("DISAPTCH_Shiptothisaddress", "DISAPTCH_Shiptothisaddress", 10);
//		OMTHPW.isElementExist("DISAPTCH_EstimatedDelivery", "DISAPTCH_EstimatedDelivery", 10);


		// for different payment

		// OMTHPW.isElementExist("Ordertrackerdisaptchdate", "DISAPTCH_Date",
		// 10);
		// OMTHPW.isElementExist("Ordertrackerdispathchtext", "DISAPTCH_text",
		// 10);
		// //OMTHPW.isElementExist("Ordertracker", "Deliver_text_right", 10);
		// OMTHPW.isElementExist("Ordertracker", "DISAPTCH_Paymentmethod",
		// 10);
		// OMTHPW.isElementExist("Ordertracker", "DISAPTCH_Paymentmethod_val",
		// 10);
		// OMTHPW.isElementExist("Ordertracker", "DISAPTCH_Amountpaid", 10);
		// OMTHPW.isElementExist("Ordertracker", "DISAPTCH_Amountpaid_Val",
		// 10);
		OMTHPW.isElementExist("Ordertracker", "DISAPTCH_Shiptothisaddress_Header", 10);
		// OMTHPW.isElementExist("Ordertracker", "DISAPTCH_Shiptothisaddress",
		// 10);
		// OMTHPW.isElementExist("Ordertracker", "DISAPTCH_EstimatedDelivery",
		// 10);
		// OMTHPW.isElementExist("Ordertracker",
		// "DISAPTCH_Estimated_deliverydate", 10);

	}



	public void ordertracker_cancelled() {
		OMTHPW.isElementExist("Ordertrackerheading", "MyOrder", 10);
		OMTHPW.isElementExist("Ordertrackerreferenceno", "referencenumber", 10);
		OMTHPW.isElementExist("Ordertrackerorderid", "OT_Orderid", 10);
		// OMTHPW.isElementExist("Ordertracker", "Confirm", 10);
		// OMTHPW.isElementExist("Ordertracker", "Confirm_Subtitle", 10);
		// OMTHPW.isElementExist("Ordertracker", "DISAPTCH", 10);
		// OMTHPW.isElementExist("Ordertracker", "DISAPTCH_Subtitle", 10);
		OMTHPW.isElementExist("Ordertrackerdispatchheading", "DISAPTCH_Heading", 10);//NEED TO CHECK
		// cod
		OMTHPW.isElementExist("Disaptchdateorderd", "DISAPTCH_Date", 10);
		OMTHPW.isElementExist("DISAPTCH_Paymentmethod", "DISAPTCH_Paymentmethod", 10);
		OMTHPW.isElementExist("DISAPTCH_Paymentmethod_val", "DISAPTCH_Paymentmethod_val", 10);
		OMTHPW.isElementExist("DISAPTCH_Amountpaid", "DISAPTCH_Amountpaid", 10);
		OMTHPW.isElementExist("DISAPTCH_Estimated_deliverydate", "DISAPTCH_Estimated_deliverydate", 10);//NEED TO CHECK
		// cod
		OMTHPW.isElementExist("DISAPTCH_Amountpaid_Val", "DISAPTCH_Amountpaid_Val", 10);
		OMTHPW.isElementExist("DISAPTCH_Shiptothisaddress_Header", "DISAPTCH_Shiptothisaddress_Header", 10);
		OMTHPW.isElementExist("DISAPTCH_Shiptothisaddress", "DISAPTCH_Shiptothisaddress", 10);
		OMTHPW.isElementExist("DISAPTCH_EstimatedDelivery", "DISAPTCH_EstimatedDelivery", 10);


		// for different payment

		// OMTHPW.isElementExist("Ordertrackerdisaptchdate", "DISAPTCH_Date",
		// 10);
		// OMTHPW.isElementExist("Ordertrackerdispathchtext", "DISAPTCH_text",
		// 10);
		// //OMTHPW.isElementExist("Ordertracker", "Deliver_text_right", 10);
		// OMTHPW.isElementExist("Ordertracker", "DISAPTCH_Paymentmethod",
		// 10);
		// OMTHPW.isElementExist("Ordertracker", "DISAPTCH_Paymentmethod_val",
		// 10);
		// OMTHPW.isElementExist("Ordertracker", "DISAPTCH_Amountpaid", 10);
		// OMTHPW.isElementExist("Ordertracker", "DISAPTCH_Amountpaid_Val",
		// 10);
		OMTHPW.isElementExist("Ordertracker", "DISAPTCH_Shiptothisaddress_Header", 10);
		// OMTHPW.isElementExist("Ordertracker", "DISAPTCH_Shiptothisaddress",
		// 10);
		// OMTHPW.isElementExist("Ordertracker", "DISAPTCH_EstimatedDelivery",
		// 10);
		// OMTHPW.isElementExist("Ordertracker",
		// "DISAPTCH_Estimated_deliverydate", 10);
		

	}

	// *********************************************************************************************************
	public void ordertracker_ForDelivery() throws Exception {

		OMTHPW.isElementExist("Ordertracker", "MyOrder", 10);
		OMTHPW.isElementExist("Ordertracker", "referencenumber", 10);
		OMTHPW.isElementExist("Ordertracker", "OT_Orderid", 10);
		OMTHPW.isElementExist("Ordertracker", "Confirm", 10);
		OMTHPW.isElementExist("Ordertracker", "Confirm_Subtitle", 10);
		// OMTHPW.isElementExist("Ordertracker", "Deliver", 10);
		// OMTHPW.isElementExist("Ordertracker", "Deliver_Subtitle", 10);
		OMTHPW.isElementExist("Ordertracker", "Deliver_Heading", 10);
		OMTHPW.isElementExist("Ordertracker", "Deliver_Date", 10);

		OMTHPW.isElementExist("Ordertrackeramount haeding", "totalamount", 10);
		OMTHPW.isElementExist("Ordertrackervalue", "totalamountvalue", 10);
		OMTHPW.isElementExist("Ordertrackerdispatchheading", "DISAPTCH_Heading", 10);//NEED TO CHECK
		// cod
//		OMTHPW.isElementExist("Disaptchdateorderd", "DISAPTCH_Date", 10);
//		OMTHPW.isElementExist("DISAPTCH_Paymentmethod", "DISAPTCH_Paymentmethod", 10);
//		OMTHPW.isElementExist("DISAPTCH_Paymentmethod_val", "DISAPTCH_Paymentmethod_val", 10);
//		OMTHPW.isElementExist("DISAPTCH_Amountpaid", "DISAPTCH_Amountpaid", 10);
//		OMTHPW.isElementExist("DISAPTCH_Estimated_deliverydate", "DISAPTCH_Estimated_deliverydate", 10);//NEED TO CHECK
//		// cod
//		OMTHPW.isElementExist("DISAPTCH_Amountpaid_Val", "DISAPTCH_Amountpaid_Val", 10);
//		OMTHPW.isElementExist("DISAPTCH_Shiptothisaddress_Header", "DISAPTCH_Shiptothisaddress_Header", 10);
//		OMTHPW.isElementExist("DISAPTCH_Shiptothisaddress", "DISAPTCH_Shiptothisaddress", 10);
//		OMTHPW.isElementExist("DISAPTCH_EstimatedDelivery", "DISAPTCH_EstimatedDelivery", 10);


		/*
		 * OMTHPW.isElementExist("Ordertracker", "Deliver_text", 10);
		 * OMTHPW.isElementExist("Ordertracker", "Deliver_text_right", 10);
		 * OMTHPW.isElementExist("Ordertracker", "Deliver_Paymentmethod", 10);
		 * OMTHPW.isElementExist("Ordertracker", "Deliver_Paymentmethod_val",
		 * 10); OMTHPW.isElementExist("Ordertracker", "Deliver_Amountpaid",
		 * 10); OMTHPW.isElementExist("Ordertracker",
		 * "Deliver_Amountpaid_Val", 10);
		 * OMTHPW.isElementExist("Ordertracker",
		 * "Deliver_Shiptothisaddress_Header", 10);
		 * OMTHPW.isElementExist("Ordertracker", "Deliver_Shiptothisaddress",
		 * 10); OMTHPW.isElementExist("Ordertracker",
		 * "Deliver_EstimatedDelivery", 10);
		 * OMTHPW.isElementExist("Ordertracker",
		 * "Deliver_Estimated_deliverydate", 10);
		 */

	}
	public void ordertracker_Foractivated() throws Exception {

		OMTHPW.isElementExist("Ordertracker", "MyOrder", 10);
		OMTHPW.isElementExist("Ordertracker", "referencenumber", 10);
		OMTHPW.isElementExist("Ordertracker", "OT_Orderid", 10);
		OMTHPW.isElementExist("Ordertracker", "Confirm", 10);
		OMTHPW.isElementExist("Ordertracker", "Confirm_Subtitle", 10);
		// OMTHPW.isElementExist("Ordertracker", "Deliver", 10);
		// OMTHPW.isElementExist("Ordertracker", "Deliver_Subtitle", 10);
		OMTHPW.isElementExist("Ordertracker", "Deliver_Heading", 10);
		OMTHPW.isElementExist("Ordertracker", "Deliver_Date", 10);

		OMTHPW.isElementExist("Ordertrackeramount haeding", "totalamount", 10);
		OMTHPW.isElementExist("Ordertrackervalue", "totalamountvalue", 10);
		OMTHPW.isElementExist("Ordertrackerdispatchheading", "DISAPTCH_Heading", 10);//NEED TO CHECK
		// cod
//		OMTHPW.isElementExist("Disaptchdateorderd", "DISAPTCH_Date", 10);
//		OMTHPW.isElementExist("DISAPTCH_Paymentmethod", "DISAPTCH_Paymentmethod", 10);
//		OMTHPW.isElementExist("DISAPTCH_Paymentmethod_val", "DISAPTCH_Paymentmethod_val", 10);
//		OMTHPW.isElementExist("DISAPTCH_Amountpaid", "DISAPTCH_Amountpaid", 10);
//		OMTHPW.isElementExist("DISAPTCH_Estimated_deliverydate", "DISAPTCH_Estimated_deliverydate", 10);//NEED TO CHECK
//		// cod
//		OMTHPW.isElementExist("DISAPTCH_Amountpaid_Val", "DISAPTCH_Amountpaid_Val", 10);
//		OMTHPW.isElementExist("DISAPTCH_Shiptothisaddress_Header", "DISAPTCH_Shiptothisaddress_Header", 10);
//		OMTHPW.isElementExist("DISAPTCH_Shiptothisaddress", "DISAPTCH_Shiptothisaddress", 10);
//		OMTHPW.isElementExist("DISAPTCH_EstimatedDelivery", "DISAPTCH_EstimatedDelivery", 10);


		/*
		 * OMTHPW.isElementExist("Ordertracker", "Deliver_text", 10);
		 * OMTHPW.isElementExist("Ordertracker", "Deliver_text_right", 10);
		 * OMTHPW.isElementExist("Ordertracker", "Deliver_Paymentmethod", 10);
		 * OMTHPW.isElementExist("Ordertracker", "Deliver_Paymentmethod_val",
		 * 10); OMTHPW.isElementExist("Ordertracker", "Deliver_Amountpaid",
		 * 10); OMTHPW.isElementExist("Ordertracker",
		 * "Deliver_Amountpaid_Val", 10);
		 * OMTHPW.isElementExist("Ordertracker",
		 * "Deliver_Shiptothisaddress_Header", 10);
		 * OMTHPW.isElementExist("Ordertracker", "Deliver_Shiptothisaddress",
		 * 10); OMTHPW.isElementExist("Ordertracker",
		 * "Deliver_EstimatedDelivery", 10);
		 * OMTHPW.isElementExist("Ordertracker",
		 * "Deliver_Estimated_deliverydate", 10);
		 */

	}

	// *********************************************************//

	// *********************************************************//
	public void ordertracker_ForaActivation() {
		OMTHPW.isElementExist("Ordertrackerheading", "MyOrder", 10);
		OMTHPW.isElementExist("Ordertrackerreferenceno", "referencenumber", 10);
		OMTHPW.isElementExist("Ordertrackerorderid", "OT_Orderid", 10);
		// OMTHPW.isElementExist("Ordertracker", "Confirm", 10);
		// OMTHPW.isElementExist("Ordertracker", "Confirm_Subtitle", 10);
		// OMTHPW.isElementExist("Ordertracker", "DISAPTCH", 10);
		// OMTHPW.isElementExist("Ordertracker", "DISAPTCH_Subtitle", 10);
		OMTHPW.isElementExist("OrdertrackerActivation", "Activation", 10);
		// cod
		OMTHPW.isElementExist("Ordertracker", "Deliver_Date", 10);

		OMTHPW.isElementExist("Ordertrackeramount haeding", "totalamount", 10);
		OMTHPW.isElementExist("Ordertrackervalue", "totalamountvalue", 10);

	}

	public String UpdateOrderStatus(String StatusUpdate) throws InterruptedException {
		switch (StatusUpdate) {
		case "For Dispatch":
			OrderStatusChange("For Dispatch");
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

		case "For Processing":
			OrderStatusChange("For Processing");
			break;
		case "For Activation":
			OrderStatusChange("For Activation");
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
		case "For Pickup":
			OrderStatusChange("For Pickup");
			break;

		}

		return StatusUpdate;

	}
	public void OrderStatusChange3(String Status) throws InterruptedException {
		// Order
		OMTHPW.select_DispositionStatus(Status);
		System.out.println("Updated Status to : " + Status);
		Thread.sleep(2000L);
		
		 if (Status.equalsIgnoreCase("For Redelivery")) {
			Thread.sleep(2000L);
			BP.scroll_vertical(530);
			JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
			js1.executeScript("arguments[0].click();", OMTHPW.get_Fullfilmentdetails());

			JavascriptExecutor jsrow = (JavascriptExecutor) DriverManager.getDriver();
			jsrow.executeScript("arguments[0].click();", OMTHPW.get_addnewrow());

			OMTHPW.get_FulfillDet_Schedule().sendKeys("12/05/2022");
			System.out.println("Schedule: " + OMTHPW.get_FulfillDet_Schedule().getAttribute("value"));

			OMTHPW.select_get_FulfillDet_Status("Not Received");
			System.out.println("Status: " + OMTHPW.get_FulfillDet_Status().getAttribute("value"));

			OMTHPW.select_get_FulfillDet_Remarks("3rd Delivery Attempt Failed");
			System.out.println("Remarks: " + OMTHPW.get_FulfillDet_Remarks().getAttribute("value"));
		}
		 
			JavascriptExecutor jss = (JavascriptExecutor) DriverManager.getDriver();
			jss.executeScript("arguments[0].click();", OMTHPW.get_Savebutton());

			BP.scroll_vertical(690);
			JavascriptExecutor js6 = (JavascriptExecutor) DriverManager.getDriver();
			js6.executeScript("arguments[0].click();", OMTHPW.get_Confirmcorrect());

	}
	public void OrderStatusChange2(String Status) throws InterruptedException {
		// Order
		OMTHPW.select_DispositionStatus(Status);
		System.out.println("Updated Status to : " + Status);
		Thread.sleep(2000L);
		
		 if (Status.equalsIgnoreCase("For Redelivery")) {
			Thread.sleep(2000L);
			BP.scroll_vertical(530);
			JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
			js1.executeScript("arguments[0].click();", OMTHPW.get_Fullfilmentdetails());

			JavascriptExecutor jsrow = (JavascriptExecutor) DriverManager.getDriver();
			jsrow.executeScript("arguments[0].click();", OMTHPW.get_addnewrow());

			OMTHPW.get_FulfillDet_Schedule().sendKeys("07/20/2022");
			System.out.println("Schedule: " + OMTHPW.get_FulfillDet_Schedule().getAttribute("value"));

			OMTHPW.select_get_FulfillDet_Status("Not Received");
			System.out.println("Status: " + OMTHPW.get_FulfillDet_Status().getAttribute("value"));

			OMTHPW.select_get_FulfillDet_Remarks("2nd Delivery Attempt Failed");
			System.out.println("Remarks: " + OMTHPW.get_FulfillDet_Remarks().getAttribute("value"));

		}
		 
			JavascriptExecutor jss = (JavascriptExecutor) DriverManager.getDriver();
			jss.executeScript("arguments[0].click();", OMTHPW.get_Savebutton());

			BP.scroll_vertical(690);
			JavascriptExecutor js6 = (JavascriptExecutor) DriverManager.getDriver();
			js6.executeScript("arguments[0].click();", OMTHPW.get_Confirmcorrect());

	}


	public void OrderStatusChange(String Status) throws InterruptedException {
		// Order
		OMTHPW.select_DispositionStatus(Status);
		System.out.println("Updated Status to : " + Status);
		Thread.sleep(2000L);

		if (Status.equalsIgnoreCase("Delivered") || Status.equalsIgnoreCase("For Delivery")
				|| Status.equalsIgnoreCase("For Processing") || Status.equalsIgnoreCase("Activated")
				|| Status.equalsIgnoreCase("For Dispatch") || Status.equalsIgnoreCase("For Activation") || Status.equalsIgnoreCase("For Pickup")) 
		{
//;;;;//
			if (Status.equalsIgnoreCase("For Pickup") || Status.equalsIgnoreCase("Delivered")
					|| Status.equalsIgnoreCase("Processed") || Status.equalsIgnoreCase("For Delivery")
					|| Status.equalsIgnoreCase("For Processing")) 
			{

			if (Status.equalsIgnoreCase("Delivered")) 
			{
					//fullfillment details change status to recived 
				BP.scroll_vertical(530);
				JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
				js.executeScript("arguments[0].click();", OMTHPW.get_Fullfilmentdetails());

				
				OMTHPW.select_get_FulfillDet_Status("Received");
				System.out.println("Status: " + OMTHPW.get_FulfillDet_Status().getAttribute("value"));


				
				}
			if(Status.equalsIgnoreCase("For Pickup"))
			{
				System.out.println("status is change to for pickup");
			}
				 
				 if (Status.equalsIgnoreCase("For Delivery")) {
				
					//get customer detailsCustomer details 
					 JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
						js1.executeScript("arguments[0].click();", OMTHPW.get_Customerdetails());						
						System.out.println("PRIMARY CUSTOMER DETAILS: "+ "\n" + 
								"Firstname: " + OMTHPW.get_Firstname_input().getAttribute("value") +"\n"+ "Middle Name: " + OMTHPW.get_Middlename_input().getAttribute("value") + "\n " + "Last Name: " + OMTHPW.get_Lastname_input().getAttribute("value") + "\n" +
								"Mobile Number: " + OMTHPW.get_Mobilenumber_input().getAttribute("value") + "\n" +
								"Email Address: " + OMTHPW.get_Emailaddress_input().getAttribute("value"));
						//Recipient details
						JavascriptExecutor jsre = (JavascriptExecutor) DriverManager.getDriver();
						jsre.executeScript("arguments[0].click();", OMTHPW.get_ReceipentDetails());
						BP.scroll_vertical(300);
						System.out.println("Recipient DETAILS: "+ "\n" + 
								"Recipient Name: " + OMTHPW.get_NameofRecipent_input().getAttribute("value") + "\n" +
								"Mobile Number: " + OMTHPW.get_MobilenumberofRecipent_input().getAttribute("value"));
						//Address details
						JavascriptExecutor js3 = (JavascriptExecutor) DriverManager.getDriver();
						js3.executeScript("arguments[0].click();", OMTHPW.get_Addressdetails());						
						System.out.println("Registered Address House: " + OMTHPW.get_PrimaryRegAdd_houseNo().getAttribute("value") + " " + OMTHPW.get_PrimaryRegAdd_Street().getAttribute("value") + " " +
								OMTHPW.get_PrimaryRegAdd_VillageSubdi().getAttribute("value") + " " + OMTHPW.get_PrimaryRegAdd_Brgy().getAttribute("value") + " " + OMTHPW.get_PrimaryRegAdd_City().getAttribute("value") + ", " +
								OMTHPW.get_PrimaryRegAdd_Province().getAttribute("value") + " " + OMTHPW.get_PrimaryRegAdd_Zipcode().getAttribute("value") + "\n" +
								"Longitude: " + OMTHPW.get_PrimaryRegAdd_Longitude().getAttribute("value") + "\n" + "Latitude: " + OMTHPW.get_PrimaryRegAdd_Latitude().getAttribute("value"));		

						//Order details
						 BP.scroll_vertical(380);
							JavascriptExecutor js2 = (JavascriptExecutor) DriverManager.getDriver();
							js2.executeScript("arguments[0].click();", OMTHPW.get_Orderdetails());
						System.out.println("Order Details: " + "\n" +
								"Quantity: " + OMTHPW.get_Quantity_input().getAttribute("value") + "\n" +
								"Producttype: " + OMTHPW.get_Producttype_input().getAttribute("value") + "\n" +
								"Sku: " + OMTHPW.get_Sku_input().getAttribute("value") + "\n" +
								"Matcode: " + OMTHPW.get_Matcode_input().getAttribute("value") + "\n" +
								"BSSCasenumber: " + OMTHPW.get_BSSCasenumber_input().getAttribute("value") + "\n" +
								"Reservationid: " + OMTHPW.get_Reservationid_input().getAttribute("value") + "\n" +
								"Modemserial: " + OMTHPW.get_Modemserial_input().getAttribute("value") + "\n" +
								"Simserial: " + OMTHPW.get_Simserial_input().getAttribute("value") + "\n" +
								"Deliverycasetitle: " + OMTHPW.get_Deliverycasetitle_input().getAttribute("value") + "\n" +
								"Deliveryqueuename: " + OMTHPW.get_Deliveryqueuename_input().getAttribute("value") + "\n" +
								"Promocode: " + OMTHPW.get_Promocode_input().getAttribute("value") + "\n" +
								"Discount: " + OMTHPW.get_Discount_input().getAttribute("value") + "\n" +
								"Projectname: " + OMTHPW.get_Projectname_input().getAttribute("value"));
						//Payment details fullfillment
						BP.scroll_vertical(530);
						JavascriptExecutor js5= (JavascriptExecutor) DriverManager.getDriver();
						js5.executeScript("arguments[0].click();", OMTHPW.get_Fullfilmentdetails());

						System.out.println("Fullfilmentdetails : " + OMTHPW.get_Fulfilment().getAttribute("value") + "\n" +
								"Delivery: " + OMTHPW.get_Delivery().getAttribute("value") + "\n" +
								"Assigned Courier: " + OMTHPW.get_Delivery().getAttribute("value") + "\n" +
								"Assigned Agent: " + OMTHPW.get_Assignedcourier().getAttribute("value") + "\n" +
								"Schedule: " + OMTHPW.get_Assignedagent().getAttribute("value") + "\n" +
								"Status: " + OMTHPW.get_Schedule().getAttribute("value") + "\n" +
								"Remarks: " + OMTHPW.get_Remarks().getAttribute("value") + "\n" +
								"Remarks: " + OMTHPW.get_Status().getAttribute("value")  + "\n" +
								"Addnewrowbutton: " + OMTHPW.get_Addnewrowbutton().getAttribute("value") );
								

				} 
			 if (Status.equalsIgnoreCase("For Processing")) {
				 BP.scroll_vertical(380);
					JavascriptExecutor js2 = (JavascriptExecutor) DriverManager.getDriver();
					js2.executeScript("arguments[0].click();", OMTHPW.get_Orderdetails());
					String a = OMTHPW.get_BSSCasenumber_input().getAttribute("value");
					if (a.isEmpty()) {
						OMTHPW.get_BSSCasenumber_input().sendKeys("764532");
						System.out.println("BSS Order ID: " + OMTHPW.get_BSSCasenumber_input().getAttribute("value"));
					}
					String b = OMTHPW.get_Reservationid_input().getAttribute("value");
					if (b.isEmpty()) {
						OMTHPW.get_Reservationid_input().sendKeys("43725");

						System.out.println("BSS Order Case ID: " + OMTHPW.get_Reservationid_input().getAttribute("value"));
					}

			}
				
									}
//;;;;//
				
			// ongoing verificaation and approved
			else {
				
				if (Status.equalsIgnoreCase("For Activation")) {
					BP.scroll_vertical(480);
					JavascriptExecutor jss = (JavascriptExecutor) DriverManager.getDriver();
					jss.executeScript("arguments[0].click();", OMTHPW.get_Activationdetails());
					
					OMTHPW.get_Channel_input().sendKeys(Keys.ENTER);
					OMTHPW.get_Channel_input().sendKeys("HPW");		
					System.out.println("Schedule: " + OMTHPW.get_Channel_input().getAttribute("value"));
					OMTHPW.get_Channel_input().clear();

					OMTHPW.get_Dateofactivation_input().sendKeys(Keys.ENTER);
					OMTHPW.get_Dateofactivation_input().sendKeys("HPW");		
					System.out.println("Schedule: " + OMTHPW.get_Dateofactivation_input().getAttribute("value"));
					OMTHPW.get_Dateofactivation_input().clear();

					OMTHPW.get_Time_input().sendKeys(Keys.ENTER);
					OMTHPW.get_Time_input().sendKeys("HPW");		
					System.out.println("Schedule: " + OMTHPW.get_Time_input().getAttribute("value"));
					OMTHPW.get_Time_input().clear();

					
								}

		

		 if (Status.equalsIgnoreCase("For Dispatch")) 
		{
			 BP.scroll_vertical(150);
				JavascriptExecutor jss = (JavascriptExecutor) DriverManager.getDriver();
				jss.executeScript("arguments[0].click();", OMTHPW.get_Customerdetails());
				
				
				System.out.println("Schedule: " + OMTHPW.get_Mobilenumber_input().getAttribute("value"));
				OMTHPW.get_Mobilenumber_input().clear();
				OMTHPW.get_Mobilenumber_input().sendKeys("09552885110");


			
		
		
		}

		
		 if (Status.equalsIgnoreCase("For Redelivery")) {
			 Thread.sleep(2000L);
				BP.scroll_vertical(530);
				JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
				js1.executeScript("arguments[0].click();", OMTHPW.get_Fullfilmentdetails());

				OMTHPW.get_FulfillDet_Schedule().sendKeys("07/19/2022");	
				System.out.println("Schedule: " + OMTHPW.get_FulfillDet_Schedule().getAttribute("value"));
				
				OMTHPW.select_get_FulfillDet_Status("Not Received");
				System.out.println("Status: " + OMTHPW.get_FulfillDet_Status().getAttribute("value"));
				
				OMTHPW.select_get_FulfillDet_Remarks("1st Delivery Attempt Failed");
				System.out.println("Remarks: " + OMTHPW.get_FulfillDet_Remarks().getAttribute("value"));

		 }
		 
			
		}
			JavascriptExecutor js2 = (JavascriptExecutor) DriverManager.getDriver();
			js2.executeScript("arguments[0].click();", OMTHPW.get_Savebutton());

			BP.scroll_vertical(690);
			JavascriptExecutor js6 = (JavascriptExecutor) DriverManager.getDriver();
			js6.executeScript("arguments[0].click();", OMTHPW.get_Confirmcorrect());


		

	}
			
	}
}
