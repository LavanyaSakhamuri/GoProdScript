package com.pages.omt;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


import globeOnline_CommonMethods.DriverManager;

public class HPW_omt_page extends BasePage {

	static File file;

//	public static WebDriverManager.getDriver() DriverManager.getDriver();
//
//	public LandingPage(WebDriverManager.getDriver() DriverManager.getDriver()) {
//		this.DriverManager.getDriver() = DriverManager.getDriver();
//	}form-control 
	
	//Signin
	By Signin = By.xpath("//span[contains(text(), 'Sign in')]");
	By Username = By.xpath("//input[@id='username']");
	By Password = By.xpath("//input[@id='password']");
	By Signinbutton = By.xpath("//button[@class='btn btn-primary']");
	
	
	By Entities = By.xpath("//span[contains(text(),' Entities ')]");
	By ApplicationEntry = By.xpath("//span[contains(text(),'Application Entry')]");
	//By View = By.xpath("(//button[@class='btn btn-info btn-sm btn-block mb-1'])[1]");
	//By edit = By.xpath("(//button[@class='btn btn-primary btn-sm btn-block mb-1'])[1]");
	By Search = By.xpath("//button[text()='Search']");
	By DownloadBtn = By.xpath("//span[contains(text(), 'Download')]");//--->las 
	By SearchField = By.xpath("//input[@name='searchTerm']");
	By SearchError = By.xpath("//h6[contains(text(), 'No results found')]");
	By ViewBtn = By.xpath("//span[contains(text(), 'View')]");
	By EditBtn = By.xpath("//span[contains(text(), 'Edit')]");
	
	By Accountbutton = By.xpath("//span[contains(text(),' Account ')]");
	//Account
	//By Account = By.xpath("//span[contains(text(),' Account ')]");
	By Account_Signout = By.xpath("//span[contains(text(),'Sign out')]");
	By Account_Signin = By.xpath("//span[contains(text(),'Sign in')]");
	
	//Dashboard	
	By Dashboard_DateSubmitted = By.xpath("//td//ngb-highlight[contains(text(), '2023')]");
	By Dashboard_RefNum = By.xpath("(//td//ngb-highlight)[2]");
	By Dashboard_LName = By.xpath("(//td//ngb-highlight)[3]");
	By Dashboard_FName = By.xpath("(//td//ngb-highlight)[4]");
	By Dashboard_PRODUCTAvailed = By.xpath("(//td//ngb-highlight)[5]");
	public By Dashboard_Dispo = By.xpath("(//td//ngb-highlight)[6]");
	By Dashboard_Reason = By.xpath("(//td//ngb-highlight)[7]");
	By Dashboard_Assignee = By.xpath("(//td//ngb-highlight)[8]");
	By Forpayment = By.xpath("//ngb-highlight[contains(text(),'For Payment')]");//NEED TO CHECK
	
	
	
	//clicking on view
	By Orderid = By.xpath("//h2[contains(text(),'GLE-000')]");
	By Ordertype = By.xpath("//label[contains(text(),'Order Type')]");
	By Ordermethod = By.xpath("//input[@id='orderType']");
	By Customertyoe = By.xpath("//input[@id='customerType']");
	By Checkoutmethod = By.xpath("//input[@id='checkoutMethod']");
	By Giveasagift = By.xpath("//input[@id='giveAsGift']");
	By giveasgiftvalue=By.xpath("//input[@id='giveAsGift']");
	By OMT_Disposition = By.xpath("//select[@id='dispositionStatus']");
	//select[@id='dispositionStatus']
	By OMT_DispoReason = By.xpath("//select[@id='reason']");
	
	
   //customer details
	By Customerdetails = By.xpath("//label[contains(text(),' CUSTOMER DETAILS ')]");
	By Firstname = By.xpath("//label[contains(text(),'First Name')]");
	public By Firstname_input = By.xpath("//input[@id='firstName']");
	By Middlename = By.xpath("//label[contains(text(),'Middle Name')]");
	By Middlename_input = By.xpath("//input[@id='middleName']");
	By Lastname = By.xpath("//label[contains(text(),'Last Name')]");
	By Lastname_input = By.xpath("//input[@id='lastName']");
	By Emailaddress = By.xpath("//label[contains(text(),'Email Address')]");
	By Emailaddress_input = By.xpath("//input[@id='emailAddress']");
	By Mobilenumber = By.xpath("(//label[contains(text(),'Mobile Number')])[1]");
	By Mobilenumber_input = By.xpath("//input[@id='mobileNumber']");
	
	//Extra Acqui Details no need 
	By Primary_Nationality = By.xpath("//select[@name='citizenship']");
	By Primary_FullMothersname = By.xpath("//input[@id='fullMothersMaidenName']");
	//=========Authorized Contact Person========
	By Primary_RecipientName = By.xpath("//input[@id='nameOfRecipient']");
	By Primary_RecipientMobNum = By.xpath("//input[@id='mobileNoOfRecipient']");
	
	//Recipentdetails  
	By ReceipentDetails = By.xpath("//label[@for='recipient_details']");
	By NameofRecipent = By.xpath("//label[contains(text(),'Name of Recipient')]");
	By NameofRecipent_input = By.xpath("//input[@id='nameOfRecipient']");
	By MobilenumberofRecipent = By.xpath("//label[contains(text(),'Mobile Number of Recipient')]");
	By MobilenumberofRecipent_input = By.xpath("//input[@id='mobileNoOfRecipient']");
	
	//AddressDetails
	By Addressdetails = By.xpath("//label[@for='address_details']");
	By Addresstype = By.xpath("//label[contains(text(),'Address Type')]");
	By House_select = By.xpath("//input[@id='house']");
	By Condominum_select = By.xpath("//input[@id='condominium']");
	By House = By.xpath("//label[contains(text(),'House/Block No.')]");
	By House_input = By.xpath("//input[@id='houseNo']");
	By Street = By.xpath("//label[contains(text(),'Street')]");
	By Street_input = By.xpath("//input[@id='street']");
	By Village = By.xpath("//label[contains(text(),'Village / Subdivision')]");
	By Village_input = By.xpath("//input[@id='subdivision']");
	By Barangay = By.xpath("//label[contains(text(),'Barangay')]");
	By Barangay_input = By.xpath("//select[@name='barangay']");
	By City = By.xpath("//label[contains(text(),'City')]");
	By City_input = By.xpath("//select[@id='city']");
	By Province = By.xpath("//label[contains(text(),'Province / Region')]");
	By Province_input = By.xpath("//select[@id='province']");
	By Zipcode = By.xpath("//label[contains(text(),'Zip Code')]");
	By Zipcode_input = By.xpath("//input[@id='zipCode']");
	By Longitude = By.xpath("//label[contains(text(),'Longitude')]");
	By Longitude_input = By.xpath("//input[@id='longitude']");
	By Latitude = By.xpath("//label[contains(text(),'Latitude')]");
	By Latitude_input = By.xpath("//input[@id='latitude']");
	
	//Additional AddressDetails
	//=========Registered Address========
		By PrimaryRegAdd_HouseRbtn = By.xpath("//input[@name='houseOrCondo' and @value='House']");
		By PrimaryRegAdd_CondoRbtn = By.xpath("//input[@name='houseOrCondo' and @value='Condominium']");
		By PrimaryRegAdd_houseNo = By.xpath("//input[@name='houseNo']");
		By PrimaryRegAdd_Street = By.xpath("//input[@name='street']");
		By PrimaryRegAdd_VillageSubdi = By.xpath("//input[@name='subdivision']");
		
		//condo
		By PrimaryRegAdd_FlrNo = By.xpath("//input[@name='unitNo']");
		By PrimaryRegAdd_BuildingName = By.xpath("//input[@name='buildingName']");	
		
		By PrimarySameasbilling = By.xpath("//button[@class='btn bt-secondary btn-rt']");		
		
		By PrimaryRegAdd_Brgy = By.xpath("//select[@name='barangay']");
		By PrimaryRegAdd_City = By.xpath("//select[@name='city']");
		By PrimaryRegAdd_Province = By.xpath("//select[@name='province']");
		By PrimaryRegAdd_Zipcode = By.xpath("//input[@name='zipCode']");
		By PrimaryRegAdd_Longitude = By.xpath("//input[@name='longitude']");
		By PrimaryRegAdd_Latitude = By.xpath("//input[@name='latitude']");
		//=========Shipping Address========
		By PrimaryShipAdd_houseRbtn = By.xpath("//input[@name='SAhouseOrCondo' and @value='House']");
		By PrimaryShipAdd_CondoRbtn = By.xpath("//input[@name='SAhouseOrCondo' and @value='Condominium']");
		By PrimaryShipAdd_HouseNo = By.xpath("//input[@name='SAhouseNo']");
		By PrimaryShipAdd_Street = By.xpath("//input[@name='SAstreet']");
		
		//condo
		By PrimaryShipAdd_FlrNo = By.xpath("//input[@name='SAunitNo']");
		By PrimaryShipAdd_BuildingName = By.xpath("//input[@name='buildingName']");		
		
		By PrimaryShipAdd_VillageSubdi = By.xpath("//input[@name='SAsubdivision']");
		By PrimaryShipAdd_Brgy = By.xpath("//select[@name='SAbarangay']");
		By PrimaryShipAdd_City = By.xpath("//select[@name='SAcity']");
		By PrimaryShipAdd_Province = By.xpath("//select[@name='SAprovince']");
		By PrimaryShipAdd_ZipCode = By.xpath("//input[@name='SAzipCode']");
		By PrimaryShipAdd_Longitude = By.xpath("//input[@name='SAlongitude']");
		By PrimaryShipAdd_Latitude = By.xpath("//input[@name='SAlatitude']");
	
	//Orderdetails
	By Orderdetails = By.xpath("//label[contains(text(),'ORDER DETAILS')]");
	By Quantity = By.xpath("//label[contains(text(),'Quantity')]");
	By Quantity_input = By.xpath("//input[@id='orderQty']");
	By Producttype = By.xpath("//label[contains(text(),'Product Type')]");
	By Producttype_input = By.xpath("//input[@id='productType']");
	By Sku = By.xpath("//label[contains(text(),'SKU')]");
	By Sku_input = By.xpath("//input[@id='sku']");
	By Matcode = By.xpath("//label[contains(text(),'Matcode')]");
	By Matcode_input = By.xpath("//input[@id='matcode']");
	By BSSCasenumber = By.xpath("//label[contains(text(),'BSS Case Number')]");
	By BSSCasenumber_input = By.xpath("//input[@id='bssCaseNo']");
	By Reservationid = By.xpath("//label[contains(text(),'Reservation ID')]");
	By Reservationid_input = By.xpath("//input[@id='reservationId']");
	By Modemserial = By.xpath("//label[contains(text(),'Modem Serial')]");
	By Modemserial_input = By.xpath("//input[@id='modemSerial']");
	By Simserial = By.xpath("//label[contains(text(),'SIM Serial')]");
	By Simserial_input = By.xpath("//input[@id='simSerial']");
	By Deliverycasetitle = By.xpath("//label[contains(text(),'Delivery Case Title')]");
	By Deliverycasetitle_input = By.xpath("//input[@id='caseTitle']");
	By Deliveryqueuename = By.xpath("//label[contains(text(),'Delivery Queue Name')]");
	By Deliveryqueuename_input = By.xpath("//input[@id='queueName']");
	By Promocode = By.xpath("//label[contains(text(),'Promo Code')]");
	By Promocode_input = By.xpath("//input[@id='promoCode']");
	By Discount = By.xpath("//label[contains(text(),'Discount')]");
	By Discount_input = By.xpath("//input[@id='discount']");
	By Projectname = By.xpath("//label[contains(text(),'Project Name')]");
	By Projectname_input = By.xpath("//input[@id='projectName']");
	
	//Payment Details
	By Paymentdeatils = By.xpath("//label[contains(text(),'PAYMENT DETAILS')]");
	By Totalamount = By.xpath("//label[contains(text(),'Total Amount')]");
	By Totalamount_input = By.xpath("//input[@id='totalAmount']");
	By Paymentmethod = By.xpath("//label[contains(text(),'Product Type')]");
	By Paymentmethod_input = By.xpath("//input[@id='paymentMethod']");
	By Transaction = By.xpath("//label[contains(text(),'SKU')]");
	By Transaction_input = By.xpath("//input[@id='transactionId']");
	By Or = By.xpath("//label[contains(text(),'OR #')]");
	By Or_input = By.xpath("//input[@id='orNumber']");
	
	//Fullfilmentdetails
	By Fullfilmentdetails = By.xpath("//label[contains(text(),' FULFILLMENT DETAILS ')]");
	By Fulfilment = By.xpath("//label[contains(text(),'Fulfillment')]");
	By Delivery = By.xpath("(//label[contains(text(),'Delivery')])[3]");
	By Assignedcourier = By.xpath("(//label[contains(text(),'Assigned Courier')])");
	By Assignedcourier_input=By.xpath("//input[@id='assignedCourier']");
	
	By Assignedagent = By.xpath("(//label[contains(text(),'Assigned Agent')])");
	By Assignedagent_input=By.xpath("//input[@id='assignedAgent']");
	By Schedule = By.xpath("(//div[contains(text(),'Schedule')])");
	By Schedule_input=By.xpath("//input[@id='deliveryDate']");
	
	By Status = By.xpath("(//div[contains(text(),'Status')])[1]");
	By Status_input=By.xpath("(//select[@id='status'])");
	By Remarks = By.xpath("(//div[contains(text(),'Remarks')])[1]");
	By Remarks_input=  By.xpath("(//select[@id='remarks'])");
	By Addnewrowbutton = By.xpath("(//button[contains(text(),' Add New Row ')])[1]");
	
	//Activationdetails
	By Activationdetails = By.xpath("//label[contains(text(),'ACTIVATION DETAILS')]");
	By Channel = By.xpath("//label[contains(text(),'Channel')]");
	By Channel_input = By.xpath("//input[@id='channel']");
	By Dateofactivation = By.xpath("(//label[contains(text(),'Date of Activation')])[1]");
	By Dateofactivation_input = By.xpath("//input[@id='dateOfActivation']");
	By Time = By.xpath("(//label[contains(text(),'Time')])[1]");
	By Time_input = By.xpath("//input[@id='timeOfActivation']");
	
	//RefundDetails
	By RefundDetails = By.xpath("//label[contains(text(),' REFUND DETAILS ')]");
	By RefundRequestdate = By.xpath("//label[contains(text(),'Refund Request Date')]");
	By RefundRequestdate_input = By.xpath("//input[@id='refundRequestDate']");
	By ValidamountofRefund = By.xpath("//label[contains(text(),'Valid Amount of Refund')]");
	By ValidamountofRefund_input = By.xpath("//input[@id='validAmountOfRefund']");
	By IssuingBank = By.xpath("//label[contains(text(),'Issuing Bank / Partner')]");
	By IssuingBank_input = By.xpath("//input[@id='issuingBank']");
	By Cardnumber = By.xpath("//label[contains(text(),'Card Number')]");
	By Cardnumber_input = By.xpath("//input[@id='cardNo']");
	By Accountname = By.xpath("(//label[contains(text(),'Account Name')])[1]");
	By Accountname_input = By.xpath("//input[@id='accountName']");
	By Authorization = By.xpath("(//label[contains(text(),'Authorization / Approval Code')])[1]");
	By Authorization_input = By.xpath("//input[@id='approvalCode']");
	By Remarks_Refund = By.xpath("(//label[contains(text(),'Remarks')])[1]");
	By Remarks_inputrefund = By.xpath("//label[text()='Remarks']//following-sibling::select");
	By RefundReference = By.xpath("(//label[contains(text(),'Refund Reference')])[1]");
	By RefundReference_input = By.xpath("(//input[@id='refundReference'])");			
	
	//After Sale 
	By Aftersale = By.xpath("(//label[contains(text(),' AFTERSALES ')])[1]");
	
	//OrderHistory
	By OrderHistory = By.xpath("(//label[contains(text(),' ORDER HISTORY ')])[1]");
	By Backbutton = By.xpath("(//span[contains(text(),'Back')])");
	By Savebutton = By.xpath("(//span[contains(text(),'Save')])");
	/**********************************updated***************************************/
	//DispositionStatus	
	//select[@id='dispositionStatus']
	By DispositionStatus = By.xpath("//select[@id='dispositionStatus']");
	By DispositionStatus_input = By.xpath("//select[@formcontrolname='dispositionStatus']");
	By ForDispatch = By.xpath("//option[contains(text(),' For Dispatch ')]");
	By ForDelivery = By.xpath("//option[contains(text(),' For Delivery ')]");
	By ForActivation = By.xpath("//option[contains(text(),' For Activation ')]");
	By Activated = By.xpath("//option[contains(text(),' Activated ')]");
	By ForRefund = By.xpath("//option[contains(text(),' For Refund ')]");
	By Refunded = By.xpath("//option[contains(text(),' Refunded ')]");
	By ForRedelivery = By.xpath("//option[contains(text(),' For Redelivery ')]");
	By Delivered = By.xpath("//option[contains(text(),' Delivered ')]");
	
	//FullFilment Details Status
	By Status1 = By.xpath("//select[@id='status']");
	By Recieved = By.xpath("//select[@id='status']");
	By NotRecieved = By.xpath("(//option[contains(text(),'Not Received')])[1]");
	By remarks = By.xpath("(//select[@id='remarks'])[1]");
	By FirstDeliveryAttempt = By.xpath("//option[contains(text(),' 1st Delivery Attempt Failed ')]");
	By SecondDeliveryAttempt = By.xpath("//option[contains(text(),' 2nd Delivery Attempt Failed ')]");
	By ThirdDeliveryAttempt = By.xpath("//option[contains(text(),' 3rd Delivery Attempt Failed ')]");
	By Addnewrow = By.xpath("//button[contains(text(),' Add New Row ')]");
	By Scheduledate = By.xpath("(//input[@name='deliveryDate'])[2]");
	By FulfillDet_PALrbtn = By.xpath("//input[@name='palOrFsoTd' and @value='PAL']");
	By FulfillDet_FSOrbtn = By.xpath("//input[@name='palOrFsoTd' and @value='FSO TD']");
	By FulfillDet_RSOrbtn = By.xpath("//input[@name='palOrFsoTd' and @value='RSO']");
	By FulfillDet_Xpressrbtn = By.xpath("//input[@name='expressOrRegular' and @value='Express']");
	By FulfillDet_Regularrbtn = By.xpath("//input[@name='expressOrRegular' and @value='Regular']");
	By FulfillDet_PickupHub = By.xpath("//input[@id='pickUpHub']");
	By FulfillDet_AssignedCourier = By.xpath("//input[@id='assignedCourier']");
	By FulfillDet_AssignedAgent = By.xpath("//input[@id='assignedAgent']");
	By FulfillDet_Schedule = By.xpath("//input[@id='deliveryDate']");
	By FulfillDet_Status = By.xpath("//select[@id='status']");
	By FulfillDet_Remarks = By.xpath("//select[@id='remarks']");
	//By addnewrow=By.xpath("//button[text()=' Add New Row ']");
	
	//ReviewSubmittedform
	By ReviewSubmittedform = By.xpath("(//h4[contains(text(),'Review Submitted Form')])");
	By Confirmcorrect = By.xpath("(//button[@id='saveOrder'])");
//	**************************Order Tracker**********************
	
	//Assign to FSO agent
	
	By Checkbox = By.xpath("(//input[@type='checkbox'])[3]");
	By Assign_Checkbox = By.xpath("(//input[@name='assigneeMode'])[1]");
	By SelectAdmin = By.xpath("(//input[@id='typeahead-basic'])[1]");
	By SelectGOTS = By.xpath("//ngb-highlight[@ng-reflect-result='Agent, GOTS,  - OMT-GOTS-AGENT']");
	By SelectFSO = By.xpath("(//span[@class='ngb-highlight'][contains(text(),'OMT-FSO-TD-AGENT')])[4]");
	By Assign_btn = By.xpath("(//button[contains(text(),'Assign')])");	
	
	//***************************OrderTracker*********************************
	//OrderTracker 	
	By Trackmyorder = By.xpath("(//a[contains(text(),' Track my order ')])[1]");
	By Trackmyorder_header = By.xpath("(//h1[contains(text(),'Track my order')])[1]");
	By Orderid_input = By.xpath("(//input[@id='floatingInput'])[1]");
	By Orderid_email = By.xpath("(//input[@id='floatingInput'])[2]");
	By Trackmyorder_button = By.xpath("(//button[@id='trackOrderDetailBtn'])");
	
	By MyOrder = By.xpath("//span[contains(text(),'My order')]");
	By referencenumber = By.xpath("//span[contains(text(),'REFERENCE NUMBER')]");
	By OT_Orderid = By.xpath("(//span[contains(text(),'PRE-00')])[2]");
	By Confirm = By.xpath("(//div[@class='d-flex flex-row order-status-title show-active-title'])[1]");
	By Confirm_Subtitle = By.xpath("//div[contains(text(),' Completed: ')]");
	
	//***************************Delivery*********************************
	By Deliver = By.xpath("(//div[@class='d-flex flex-row order-status-title show-active-title'])[2]");
	By reDeliver=By.xpath("(//div[@class='d-flex flex-row order-status-title show-error-title show-active-title'])");
	By Deliver_Subtitle = By.xpath("//div[contains(text(),' Your order is on the way ')]");
	By Deliver_Heading = By.xpath("//div[@class='col-sm-7 col-7 order-deliver-heading']");
	By Deliver_Date = By.xpath("//div[@class='col-sm-5 col-5 order-deliver-data']");
	By Deliver_text = By.xpath("//div[@class='col-sm-12 col-12 order-deliver-text']");
	By Deliver_text_right = By.xpath("//div[@class='col-sm-12 col-12 deliver-text1']");
	By Deliver_Paymentmethod = By.xpath("//span[contains(text(),'Payment method used:')]");
	By Deliver_Paymentmethod_val = By.xpath("//div[@class='col-sm-6 col-6 deliver-val2']");
	By Deliver_Amountpaid = By.xpath("//span[contains(text(),'Amount paid:')]");
	By Deliver_Amountpaid_Val = By.xpath("//div[@class='col-sm-6 col-6 deliver-val']");
	By Deliver_Shiptothisaddress_Header = By.xpath("//div[contains(text(),'Ship to this address')]");
	By Deliver_Shiptothisaddress = By.xpath("(//div[@class='ship-text1'])[1]");
	By Deliver_EstimatedDelivery = By.xpath("Ship to this address");
	By Deliver_Estimated_deliverydate = By.xpath("//div[contains(text(),'business days')]");
	
	
	//***************************DISAPTCH*********************************
		By DISAPTCH = By.xpath("(//div[@class='d-flex flex-row order-status-title show-active-title'])[2]");
		By DISAPTCH_Subtitle = By.xpath("//div[contains(text(),' Your order is on the way ')]");
		By DISAPTCH_Heading = By.xpath("//span[contains(text(),'For Dispatch')]");
		By DISAPTCH_Date = By.xpath("//div[@class='col-sm-5 col-5 order-recieved-data']");
		By DISAPTCH_text = By.xpath("//div[@class='col-sm-12 col-12 order-recieved-text']");
		//By DISAPTCH_text_right = By.xpath("//div[@class='col-sm-12 col-12 deliver-text1']");
		By DISAPTCH_Paymentmethod = By.xpath("//span[contains(text(),'Payment method:')]");
		By DISAPTCH_Paymentmethod_val = By.xpath("//div[@class='col-sm-6 col-6 grab']");
		By DISAPTCH_Amountpaid = By.xpath("//span[contains(text(),'Amount paid:')]");
		By DISAPTCH_Amountpaid_Val = By.xpath("//div[@class='col-sm-6 col-6 grab']");
		By DISAPTCH_Shiptothisaddress_Header = By.xpath("//div[contains(text(),'Ship to this address')]");
		By DISAPTCH_Shiptothisaddress = By.xpath("(//div[@class='ship-text1'])[1]");
		By DISAPTCH_EstimatedDelivery = By.xpath("(//div[@class='ship-text'])[2]");
		By DISAPTCH_Estimated_deliverydate = By.xpath("//div[contains(text(),'business days')]");
		//********Recieve********
	By recieve = By.xpath("(//div[@class='d-flex flex-row order-status-title show-active-title'])[3]");
	By Recieve_Subtitle = By.xpath("//div[contains(text(),' Your Package has arrived ')]");
	By Recieve_Img = By.xpath("//img[@class='globeImage1-1']");
	By Recieve_For_Activation = By.xpath("//span[contains(text(),'For Activation')]");
	By recieve_Date = By.xpath("//div[@class='col-sm-5 col-5 order-recieved-data']");
	By recieve_text = By.xpath("//span[contains(text(),'Your order has been received.')]");
	By recieve_dateordered = By.xpath("//span[contains(text(),'Date ordered:')]");
	By recieve_date = By.xpath("//div[@class='col-sm-7 col-7 grab']");
	By recieve_Amountpaid = By.xpath("//span[contains(text(),'Amount paid:')]");
	By recieve_Amount = By.xpath("//div[@class='col-sm-6 col-6 grab']");
	By recieve_Viewdetails = By.xpath("(//span[contains(text(),'View details')])[1]");
	By recieve_setupandconfiguration = By.xpath("(//span[contains(text(),'Setup & Configuration')])[1]");
	public By TimeStamp=By.xpath("(//th[text()='Date Submitted']//following::td//following::ngb-highlight)[1]");
	
	By cookiesNotification = By.xpath("//span[contains(text(),'Your privacy is important to us')]");
	By privacyAccept = By.xpath("//button[text()=' I accept']");
	 By OrderCheckBox=By.xpath("//td//input[@type='checkbox']");
	 By RemoveAssignee=By.xpath("//span[text()='Remove Assignee']");
	 By RemoveButton=By.xpath("//button[text()='Remove']");
	 By RemoveAssigneeRdBtn=By.xpath("//input[@id='removeAppRB']");
	 By AssigneRdBtn=By.xpath("//input[@id='assignAppRB']");

	 public By Select_Admin=By.xpath("//input[@id='typeahead-basic']");
	 public By Assign_Result=By.xpath("//button[@class='dropdown-item active']");
	 
	 
	 By houseaddress=By.xpath("//label[text()=' House ']//preceding-sibling::input");
	 By condoaddress=By.xpath("//label[text()=' Condominium ']//preceding-sibling::input");
	 By addnewrow=By.xpath("//button[text()=' Add New Row ']");
	 
	 
	 
	 //dynamic
	 By UPDATED=By.xpath("//span[contains(text(),'Updated')]");
	 By product=By.xpath("//div[@class='content-1']//div[2]");
	 By unit=By.xpath("//span[contains(text(),'unit')]");
	 
	 By OrderCancelled=By.xpath("//span[contains(text(),' Your order has been cancelled ')]");
	 By UpdatedDate=By.xpath("//div[contains(text(),'Updated')]");
	 By OrderCancelledContext=By.xpath("//div[@class='go_text-small-regular-content-big']");
	 By cancelimage=By.xpath("//img[@class='go_order-details-image-file']");
	 By prodname=By.xpath("//div[@class='go_order-details-device']//span[2]");
	 
	 
	 
	 public WebElement get_houseaddress() {
			return DriverManager.getDriver().findElement(houseaddress);
		}
	 
	 public WebElement get_condoaddress() {
			return DriverManager.getDriver().findElement(condoaddress);
		}
	
	//FULFILLMENT DETAILS
	 public List  <WebElement> get_Schedule_input()
	 {
		 return DriverManager.getDriver().findElements(Schedule_input);
	 }
	 public List  <WebElement> get_Status_input()
	 {
		 return DriverManager.getDriver().findElements(Status_input);
	 }
	 public List  <WebElement> get_Remarks_input()
	 {
		 return DriverManager.getDriver().findElements(Status_input);
	 }
	 
	public WebElement get_OMT_Disposition() {
		return DriverManager.getDriver().findElement(OMT_Disposition);
	}
	/********************************************************************************************************************************/
	public WebElement get_OMT_DispoReason() {
		return DriverManager.getDriver().findElement(OMT_DispoReason);
	}
//	public void select_get_FulfillDet_Status(String option) {
//		Select s = new Select(DriverManager.getDriver().findElement(FulfillDet_Status));
//		s.selectByVisibleText(option);
//	}
	public WebElement get_addnewrow()
	{
		return DriverManager.getDriver().findElement(addnewrow);
	}
	public WebElement get_DownloadBtn()
	{
		return DriverManager.getDriver().findElement(DownloadBtn);
	}
	public WebElement get_OrderCheckBox() {
		return DriverManager.getDriver().findElement(OrderCheckBox);
	}	
	/********************************************************************************************************************************/
	public WebElement get_RemoveAssigneRdbtn() {
		return DriverManager.getDriver().findElement(RemoveAssigneeRdBtn);
	}	
	/********************************************************************************************************************************/
	public WebElement get_RemoveAssignee() {
		return DriverManager.getDriver().findElement(RemoveAssignee);
	}	
	/********************************************************************************************************************************/
	public WebElement get_RemoveButton() {
		return DriverManager.getDriver().findElement(RemoveButton);
	}
	/********************************************************************************************************************************/
	public WebElement get_AssigneRdBtn() {
		return DriverManager.getDriver().findElement(AssigneRdBtn);
	}
	
	
	/********************************************************************************************************************************/
	public WebElement get_cookiesNotification() {
		return DriverManager.getDriver().findElement(cookiesNotification);
	}
	/********************************************************************************************************************************/
	public WebElement get_privacyAccept() {
		return DriverManager.getDriver().findElement(privacyAccept);
	}
		/********************************************************************************************************************************/
		public WebElement get_FulfillDet_PALrbtn() {
			return DriverManager.getDriver().findElement(FulfillDet_PALrbtn);
		}
		/********************************************************************************************************************************/
		public WebElement get_FulfillDet_FSOrbtn() {
			return DriverManager.getDriver().findElement(FulfillDet_FSOrbtn);
		}
		/********************************************************************************************************************************/
		public WebElement get_FulfillDet_RSOrbtn() {
			return DriverManager.getDriver().findElement(FulfillDet_RSOrbtn);
		}
		/********************************************************************************************************************************/
		public WebElement get_FulfillDet_Xpressrbtn() {
			return DriverManager.getDriver().findElement(FulfillDet_Xpressrbtn);
		}
		/********************************************************************************************************************************/
		public WebElement get_FulfillDet_Regularrbtn() {
			return DriverManager.getDriver().findElement(FulfillDet_Regularrbtn);
		}
		/********************************************************************************************************************************/
		public WebElement get_FulfillDet_PickupHub() {
			return DriverManager.getDriver().findElement(FulfillDet_PickupHub);
		}
		/********************************************************************************************************************************/
		public WebElement get_FulfillDet_AssignedCourier() {
			return DriverManager.getDriver().findElement(FulfillDet_AssignedCourier);
		}
		/********************************************************************************************************************************/
		public WebElement get_FulfillDet_AssignedAgent() {
			return DriverManager.getDriver().findElement(FulfillDet_AssignedAgent);
		}
		/********************************************************************************************************************************/
		public List<WebElement> get_FulfillDet_Schedule() {
			return DriverManager.getDriver().findElements(FulfillDet_Schedule);
		}
		/********************************************************************************************************************************/
		public List<WebElement> get_FulfillDet_Status() {
			return DriverManager.getDriver().findElements(FulfillDet_Status);
		}
		/********************************************************************************************************************************/
		public List<WebElement> get_FulfillDet_Remarks() {
			return DriverManager.getDriver().findElements(FulfillDet_Remarks);
		}
		
		
		public void select_get_FulfillDet_Status(String option) {
			Select s = new Select(DriverManager.getDriver().findElement(FulfillDet_Status));
			s.selectByVisibleText(option);
		}
		public void select_get_FulfillDet_Remarks(String option) {
			Select s = new Select(DriverManager.getDriver().findElement(FulfillDet_Remarks));
			s.selectByVisibleText(option);
		}
		
	
	//Address Details
		
		public WebElement get_Addresstype() {
			return DriverManager.getDriver().findElement(Addresstype);
		}
		/********************************************************************************************************************************/
		public WebElement get_House_select() {
			return DriverManager.getDriver().findElement(House_select);
		}
		public WebElement get_House_input() {
			return DriverManager.getDriver().findElement(House_input);
		}
		public WebElement get_Street () {
			return DriverManager.getDriver().findElement(Street );
		}
		public WebElement get_Street_input() {
			return DriverManager.getDriver().findElement(Street_input);
		}
		public WebElement get_Village() {
			return DriverManager.getDriver().findElement(Village);
		}
		public WebElement get_Village_input() {
			return DriverManager.getDriver().findElement(Village_input);
		}
		public WebElement get_Barangay_input() {
			return DriverManager.getDriver().findElement(Barangay_input);
		}
		public WebElement get_City_input() {
			return DriverManager.getDriver().findElement(City_input);
		}
		public WebElement get_Province_input() {
			return DriverManager.getDriver().findElement(Province_input);
		}
		public WebElement get_Zipcode_input() {
			return DriverManager.getDriver().findElement(Zipcode_input);
		}
		public WebElement get_Longitude_input() {
			return DriverManager.getDriver().findElement(Longitude_input);
		}
		public WebElement get_Latitude_input() {
			return DriverManager.getDriver().findElement(Latitude_input);
		}
		 
		
		
		
	//+++++++++++++++ REGISTERED ADDRESS +++++++++++++++++++++
		/********************************************************************************************************************************/
		public WebElement get_PrimaryRegAdd_HouseRbtn() {
			return DriverManager.getDriver().findElement(PrimaryRegAdd_HouseRbtn);
		}
		public WebElement get_PrimarySameasbilling() {
			return DriverManager.getDriver().findElement(PrimarySameasbilling);
		}
		/********************************************************************************************************************************/
		public WebElement get_PrimaryRegAdd_CondoRbtn() {
			return DriverManager.getDriver().findElement(PrimaryRegAdd_CondoRbtn);
		}
		/********************************************************************************************************************************/
		public WebElement get_PrimaryRegAdd_houseNo() {
			return DriverManager.getDriver().findElement(PrimaryRegAdd_houseNo);
		}
		/********************************************************************************************************************************/
		public WebElement get_PrimaryRegAdd_Street() {
			return DriverManager.getDriver().findElement(PrimaryRegAdd_Street);
		}
		/********************************************************************************************************************************/
		public WebElement get_PrimaryRegAdd_VillageSubdi() {
			return DriverManager.getDriver().findElement(PrimaryRegAdd_VillageSubdi);
		}
		/********************************************************************************************************************************/
		public WebElement get_PrimaryRegAdd_FlrNo() {
			return DriverManager.getDriver().findElement(PrimaryRegAdd_FlrNo);
		}
		/********************************************************************************************************************************/
		public WebElement get_PrimaryRegAdd_BuildingName() {
			return DriverManager.getDriver().findElement(PrimaryRegAdd_BuildingName);
		}
		/********************************************************************************************************************************/
		public WebElement get_PrimaryRegAdd_Brgy() {
			return DriverManager.getDriver().findElement(PrimaryRegAdd_Brgy);
		}
		/********************************************************************************************************************************/
		public WebElement get_PrimaryRegAdd_City() {
			return DriverManager.getDriver().findElement(PrimaryRegAdd_City);
		}
		/********************************************************************************************************************************/
		public WebElement get_PrimaryRegAdd_Province() {
			return DriverManager.getDriver().findElement(PrimaryRegAdd_Province);
		}
		/********************************************************************************************************************************/
		public WebElement get_PrimaryRegAdd_Zipcode() {
			return DriverManager.getDriver().findElement(PrimaryRegAdd_Zipcode);
		}
		/********************************************************************************************************************************/
		public WebElement get_PrimaryRegAdd_Longitude() {
			return DriverManager.getDriver().findElement(PrimaryRegAdd_Longitude);
		}
		/********************************************************************************************************************************/
		public WebElement get_PrimaryRegAdd_Latitude() {
			return DriverManager.getDriver().findElement(PrimaryRegAdd_Latitude);
		}
		
		//+++++++++++++++ SHIPPING ADDRESS +++++++++++++++++++++
		/********************************************************************************************************************************/
		public WebElement get_PrimaryShipAdd_houseRbtn() {
			return DriverManager.getDriver().findElement(PrimaryShipAdd_houseRbtn);
		}
		/********************************************************************************************************************************/
		public WebElement get_PrimaryShipAdd_CondoRbtn() {
			return DriverManager.getDriver().findElement(PrimaryShipAdd_CondoRbtn);
		}
		/********************************************************************************************************************************/
		public WebElement get_PrimaryShipAdd_HouseNo() {
			return DriverManager.getDriver().findElement(PrimaryShipAdd_HouseNo);
		}
		/********************************************************************************************************************************/
		public WebElement get_PrimaryShipAdd_Street() {
			return DriverManager.getDriver().findElement(PrimaryShipAdd_Street);
		}
		/********************************************************************************************************************************/
		public WebElement get_PrimaryShipAdd_FlrNo() {
			return DriverManager.getDriver().findElement(PrimaryShipAdd_FlrNo);
		}
		/********************************************************************************************************************************/
		public WebElement get_PrimaryShipAdd_BuildingName() {
			return DriverManager.getDriver().findElement(PrimaryShipAdd_BuildingName);
		}	
		/********************************************************************************************************************************/
		public WebElement get_PrimaryShipAdd_VillageSubdi() {
			return DriverManager.getDriver().findElement(PrimaryShipAdd_VillageSubdi);
		}
		/********************************************************************************************************************************/
		public WebElement get_PrimaryShipAdd_Brgy() {
			return DriverManager.getDriver().findElement(PrimaryShipAdd_Brgy);
		}
		/********************************************************************************************************************************/
		public WebElement get_PrimaryShipAdd_City() {
			return DriverManager.getDriver().findElement(PrimaryShipAdd_City);
		}
		/********************************************************************************************************************************/
		public WebElement get_PrimaryShipAdd_Province() {
			return DriverManager.getDriver().findElement(PrimaryShipAdd_Province);
		}
		/********************************************************************************************************************************/
		public WebElement get_PrimaryShipAdd_ZipCode() {
			return DriverManager.getDriver().findElement(PrimaryShipAdd_ZipCode);
		}
		/********************************************************************************************************************************/
		public WebElement get_PrimaryShipAdd_Longitude() {
			return DriverManager.getDriver().findElement(PrimaryShipAdd_Longitude);
		}
		/********************************************************************************************************************************/
		public WebElement get_PrimaryShipAdd_Latitude() {
			return DriverManager.getDriver().findElement(PrimaryShipAdd_Latitude);
		}
	
	
	
	//CustomerDetails
	/*********************************CustomerDetails**************************************************************************/
	public WebElement get_Firstname_input() {
		return DriverManager.getDriver().findElement(Firstname_input);
	}
	/********************************************************************************************************************************/
	public WebElement get_Middlename_input() {
		return DriverManager.getDriver().findElement(Middlename_input);
	}
	/********************************************************************************************************************************/
	public WebElement get_Lastname_input() {
		return DriverManager.getDriver().findElement(Lastname_input);
	}
	/********************************************************************************************************************************/
	public WebElement get_Mobilenumber_input() {
		return DriverManager.getDriver().findElement(Mobilenumber_input);
	}
	/********************************************************************************************************************************/
	public WebElement get_Emailaddress_input() {
		return DriverManager.getDriver().findElement(Emailaddress_input);
	}
	/********************************************************************************************************************************/
	public WebElement get_NameofRecipent_input() {
		return DriverManager.getDriver().findElement(NameofRecipent_input);
	}
	/********************************************************************************************************************************/
	public WebElement get_MobilenumberofRecipent_input() {
		return DriverManager.getDriver().findElement(MobilenumberofRecipent_input);
	}
	/********************************************************************************************************************************/
	
	public WebElement get_Primary_Nationality() {
		return DriverManager.getDriver().findElement(Primary_Nationality);
	}
	/********************************************************************************************************************************/
	public WebElement get_Primary_FullMothersname() {
		return DriverManager.getDriver().findElement(Primary_FullMothersname);
	}
	//+++++ Recepient Details +++++
	/********************************************************************************************************************************/
	public WebElement get_Primary_RecipientName() {
		return DriverManager.getDriver().findElement(Primary_RecipientName);
	}
	/********************************************************************************************************************************/
	public WebElement get_Primary_RecipientMobNum() {
		return DriverManager.getDriver().findElement(Primary_RecipientMobNum);
	}
	
	
	
	//-----DASHBOARD-----
	/*************************************DashBoard*********************************************************************/
	public WebElement get_SearchField() {
		return DriverManager.getDriver().findElement(SearchField);
	}
	/********************************************************************************************************************************/
	public WebElement get_SearchError() {
		return DriverManager.getDriver().findElement(SearchError);
	}
		/********************************************************************************************************************************/
		public WebElement get_Dashboard_DateSubmitted() {
			return DriverManager.getDriver().findElement(Dashboard_DateSubmitted);
		}
		/********************************************************************************************************************************/
		public WebElement get_Dashboard_RefNum() {
			return DriverManager.getDriver().findElement(Dashboard_RefNum);
		}
		/********************************************************************************************************************************/
		public WebElement get_Dashboard_LName() {
			return DriverManager.getDriver().findElement(Dashboard_LName);
		}
		/********************************************************************************************************************************/
		public WebElement get_Dashboard_FName() {
			return DriverManager.getDriver().findElement(Dashboard_FName);
		}
		/********************************************************************************************************************************/
		public WebElement get_Dashboard_PRODUCTAvailed() {
			return DriverManager.getDriver().findElement(Dashboard_PRODUCTAvailed);
		}
		/********************************************************************************************************************************/
		public WebElement get_Dashboard_Dispo() {
			return DriverManager.getDriver().findElement(Dashboard_Dispo);
		}
		/********************************************************************************************************************************/
		public WebElement get_Dashboard_Reason() {
			return DriverManager.getDriver().findElement(Dashboard_Reason);
		}
		/********************************************************************************************************************************/
		public WebElement get_Dashboard_Assignee() {
			return DriverManager.getDriver().findElement(Dashboard_Assignee);
		}
		
	/*******************************Sign In and Sign Out******************************************************************/
		
	public WebElement get_Accountbutton() {
			return DriverManager.getDriver().findElement(Accountbutton);
		}
	/********************************************************************************************************************************/
//	public WebElement get_Account() {
//		return DriverManager.getDriver().findElement(Account);
//	}
	/********************************************************************************************************************************/
	public WebElement get_Account_Signout() {
		return DriverManager.getDriver().findElement(Account_Signout);
	}
	/********************************************************************************************************************************/
	public WebElement get_Account_Signin() {
		return DriverManager.getDriver().findElement(Account_Signin);
	}
	/********************************************************************************************************************************/
	public WebElement get_Search() {
		return DriverManager.getDriver().findElement(Search);
	}
	/********************************************************************************************************************************/
	public WebElement get_Signin() {
		return DriverManager.getDriver().findElement(Signin);
	}
	/********************************************************************************************************************************/
	public WebElement get_Username() {
		return DriverManager.getDriver().findElement(Username);
	}
	/********************************************************************************************************************************/
	public WebElement get_Password() {
		return DriverManager.getDriver().findElement(Password);
	}
	/********************************************************************************************************************************/

	public WebElement get_Signinbutton() {
		return DriverManager.getDriver().findElement(Signinbutton);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_Entities() {
		return DriverManager.getDriver().findElement(Entities);
	}

	/********************************************************************************************************************************/
	public WebElement get_ApplicationEntry() {
		return DriverManager.getDriver().findElement(ApplicationEntry);
	}

	/********************************************************************************************************************************/
//	public WebElement get_View() {
//		return DriverManager.getDriver().findElement(View);
//	}
	/********************************************************************************************************************************/
	public WebElement get_ViewBtn() {
		return DriverManager.getDriver().findElement(ViewBtn);
	}	
	/********************************************************************************************************************************/
	public WebElement get_EditBtn() {
		return DriverManager.getDriver().findElement(EditBtn);
	}

	/********************************************************************************************************************************/
//	public WebElement get_edit() {
//		return DriverManager.getDriver().findElement(edit);
//	}
	/********************************************************************************************************************************/
	public WebElement get_Confirmcorrect() {
		return DriverManager.getDriver().findElement(Confirmcorrect);
	}
	/********************************************************************************************************************************/
	public WebElement get_Trackmyorder_button() {
		return DriverManager.getDriver().findElement(Trackmyorder_button);
	}
	/********************************************************************************************************************************/
	public WebElement get_Trackmyorder() {
		return DriverManager.getDriver().findElement(Trackmyorder);
	}
	/********************************************************************************************************************************/
	public WebElement get_Orderid_input() {
		return DriverManager.getDriver().findElement(Orderid_input);
	}
	/********************************************************************************************************************************/
	public WebElement get_Orderid_email() {
		return DriverManager.getDriver().findElement(Orderid_email);
	}
	/********************************************************************************************************************************/
	
	/********************************************************************************************************************************/
//	Order Info
	public WebElement get_Orderid() {
		return DriverManager.getDriver().findElement(Orderid);
	}
	/********************************************************************************************************************************/
	public WebElement get_Ordertype() {
		return DriverManager.getDriver().findElement(Ordertype);
	}
	/********************************************************************************************************************************/
	public WebElement get_Ordermethod() {
		return DriverManager.getDriver().findElement(Ordermethod);
	}
	/********************************************************************************************************************************/
	public WebElement get_Customertyoe() {
		return DriverManager.getDriver().findElement(Customertyoe);
	}
	/********************************************************************************************************************************/
	public WebElement get_Checkoutmethod() {
		return DriverManager.getDriver().findElement(Checkoutmethod);
	}
	/********************************************************************************************************************************/
	public WebElement get_Giveasagift() {
		return DriverManager.getDriver().findElement(Giveasagift);
	}
	/**********************************Clicking on Headers****************************************************************/
	public WebElement get_Customerdetails() {
		return DriverManager.getDriver().findElement(Customerdetails);
	}
	/********************************************************************************************************************************/
	public WebElement get_ReceipentDetails() {
		return DriverManager.getDriver().findElement(ReceipentDetails);
	}

	/********************************************************************************************************************************/
	public WebElement get_Addressdetails() {
		return DriverManager.getDriver().findElement(Addressdetails);
	}

	/********************************************************************************************************************************/
	// ORDER DEAILS
	public WebElement get_Orderdetails() {
		return DriverManager.getDriver().findElement(Orderdetails);
	}
	public WebElement get_Quantity_input() {
		return DriverManager.getDriver().findElement(Quantity_input);
	}
	public WebElement get_Producttype_input() {
		return DriverManager.getDriver().findElement(Producttype_input);
	}
	public WebElement get_Sku_input() {
		return DriverManager.getDriver().findElement(Sku_input);
	}
	public WebElement get_Matcode_input() {
		return DriverManager.getDriver().findElement(Matcode_input);
	}
	public WebElement get_BSSCasenumber_input() {
		return DriverManager.getDriver().findElement(BSSCasenumber_input);
	}
	public WebElement get_Reservationid_input() {
		return DriverManager.getDriver().findElement(Reservationid_input);
	}
	public WebElement get_Modemserial_input() {
		return DriverManager.getDriver().findElement(Modemserial_input);
	}
	public WebElement get_Simserial_input() {
		return DriverManager.getDriver().findElement(Simserial_input);
	}
	public WebElement get_Deliverycasetitle_input() {
		return DriverManager.getDriver().findElement(Deliverycasetitle_input);
	}
	public WebElement get_Deliveryqueuename_input() {
		return DriverManager.getDriver().findElement(Deliveryqueuename_input);
	}
	public WebElement get_Promocode_input() {
		return DriverManager.getDriver().findElement(Promocode_input);
	}
	public WebElement get_Discount_input() {
		return DriverManager.getDriver().findElement(Discount_input);
	}
	public WebElement get_Projectname_input() {
		return DriverManager.getDriver().findElement(Projectname_input);
	}
	    
	/********************************************************************************************************************************/
//	Payment Details
	public WebElement get_Paymentdeatils() {
		return DriverManager.getDriver().findElement(Paymentdeatils);
	}
	/********************************************************************************************************************************/
	public WebElement get_Totalamount_input() {
		return DriverManager.getDriver().findElement(Totalamount_input);
	}
	/********************************************************************************************************************************/
	public WebElement get_Paymentmethod_input() {
		return DriverManager.getDriver().findElement(Paymentmethod_input);
	}
	/********************************************************************************************************************************/
	public WebElement get_Transaction_input() {
		return DriverManager.getDriver().findElement(Transaction_input);
	}
	/********************************************************************************************************************************/
	public WebElement get_Or_input() {
		return DriverManager.getDriver().findElement(Or_input);
	}
	/********************************************************************************************************************************/
	
	/********************************************************************************************************************************/
	
//	Full fillment Details
	public WebElement get_Fullfilmentdetails() {
		return DriverManager.getDriver().findElement(Fullfilmentdetails);
	}
	/********************************************************************************************************************************/
	public WebElement get_Fulfilment() {
		return DriverManager.getDriver().findElement(Fulfilment);
	}
	/********************************************************************************************************************************/
	public WebElement get_Delivery() {
		return DriverManager.getDriver().findElement(Delivery);
	}
	/********************************************************************************************************************************/
	public WebElement get_Assignedcourier() {
		return DriverManager.getDriver().findElement(Assignedcourier);
	}
	/********************************************************************************************************************************/
	public WebElement get_Assignedagent() {
		return DriverManager.getDriver().findElement(Assignedagent);
	}
	/********************************************************************************************************************************/
	public WebElement get_Schedule() {
		return DriverManager.getDriver().findElement(Schedule);
	}
	/********************************************************************************************************************************/
	public WebElement get_Status() {
		return DriverManager.getDriver().findElement(Status);
	}
	/********************************************************************************************************************************/
	public WebElement get_Remarks() {
		return DriverManager.getDriver().findElement(Remarks);
	}
	/********************************************************************************************************************************/
	public WebElement get_Addnewrowbutton() {
		return DriverManager.getDriver().findElement(Addnewrowbutton);
	}
	/********************************************************************************************************************************/
	
	/********************************************************************************************************************************/
	
//	ACTIVATION DETAILS
	public WebElement get_Activationdetails() {
		return DriverManager.getDriver().findElement(Activationdetails);
	}
	public WebElement get_Channel_input() {
		return DriverManager.getDriver().findElement(Channel_input);
	}
	public WebElement get_Dateofactivation_input() {
		return DriverManager.getDriver().findElement(Dateofactivation_input);
	}
	public WebElement get_Time_input() {
		return DriverManager.getDriver().findElement(Time_input);
	}
	  
	/********************************************************************************************************************************/
	
//	Refund Details
	public WebElement get_RefundDetails() {
		return DriverManager.getDriver().findElement(RefundDetails);
	}
	public WebElement get_RefundRequestdate_input() {
		return DriverManager.getDriver().findElement(RefundRequestdate_input);
	}
	public WebElement get_ValidamountofRefund_input() {
		return DriverManager.getDriver().findElement(ValidamountofRefund_input);
	}
	public WebElement get_Cardnumber_input() {
		return DriverManager.getDriver().findElement(Cardnumber_input);
	}
	public WebElement get_Accountname_input() {
		return DriverManager.getDriver().findElement(Accountname_input);
	}
	public WebElement get_Authorization_input() {
		return DriverManager.getDriver().findElement(Authorization_input);
	}
	public WebElement get_IssuingBank_input() {
		return DriverManager.getDriver().findElement(IssuingBank_input);
	}
	public WebElement get_Remarks_inputrefund() {
		return DriverManager.getDriver().findElement(Remarks_inputrefund);
	}
	
	public WebElement get_Remarks_Refund() {
		return DriverManager.getDriver().findElement(Remarks_Refund);
	}
	public WebElement get_RefundReference_input() {
		return DriverManager.getDriver().findElement(RefundReference_input);
	}
	

	        
	/********************************************************************************************************************************/
//	Order Details
	
	public WebElement get_OrderHistory() {
		return DriverManager.getDriver().findElement(OrderHistory);
	}
	public WebElement get_Aftersale() {
		return DriverManager.getDriver().findElement(Aftersale);
	}
	
	
	/********************************************************************************************************************************/
	public WebElement get_Backbutton() {
		return DriverManager.getDriver().findElement(Backbutton);
	}
	/********************************************************************************************************************************/
	public WebElement get_Savebutton() {
		return DriverManager.getDriver().findElement(Savebutton);
	}
	/********************************************************************************************************************************/

	//*********************************SElect Disposition Status*****************************************
	
	/********************************************************************************************************************************/
	public void select_ForDispatch(String option) {
		Select s = new Select(DriverManager.getDriver().findElement(ForDispatch));
		s.selectByVisibleText(option);
	}
	/********************************************************************************************************************************/
	public void select_DispositionStatus(String option) {
		Select s = new Select(DriverManager.getDriver().findElement(DispositionStatus));
		s.selectByVisibleText(option);
	}
	/********************************************************************************************************************************/
	public void select_ForActivation(String option) {
		Select s = new Select(DriverManager.getDriver().findElement(ForActivation));
		s.selectByVisibleText(option);
	}
	/********************************************************************************************************************************/
	public void select_Activated(String option) {
		Select s = new Select(DriverManager.getDriver().findElement(Activated));
		s.selectByVisibleText(option);
	}
	/********************************************************************************************************************************/
	public void select_ForRefund(String option) {
		Select s = new Select(DriverManager.getDriver().findElement(ForRefund));
		s.selectByVisibleText(option);
	}
	/********************************************************************************************************************************/
	public void select_Refunded(String option) {
		Select s = new Select(DriverManager.getDriver().findElement(Refunded));
		s.selectByVisibleText(option);
	}
	/********************************************************************************************************************************/
	public void select_ForRedelivery(String option) {
		Select s = new Select(DriverManager.getDriver().findElement(ForRedelivery));
		s.selectByVisibleText(option);
	}

	/********************************************************************************************************************************/
	public void select_Delivered(String option) {
		Select s = new Select(DriverManager.getDriver().findElement(Delivered));
		s.selectByVisibleText(option);
	}
	/********************************************************************************************************************************/
	public void select_Recieved(String option) {
		Select s = new Select(DriverManager.getDriver().findElement(Recieved));
		s.selectByVisibleText(option);
	}
	
	//Disposition Status
	/********************************Disposition Status************************************************************************/
	public WebElement get_DispositionStatus() {
		return DriverManager.getDriver().findElement(DispositionStatus);
	}
	/********************************************************************************************************************************/
	public WebElement get_ForDispatch() {
		return DriverManager.getDriver().findElement(ForDispatch);
	}
	/********************************************************************************************************************************/
	public WebElement get_ForDelivery() {
		return DriverManager.getDriver().findElement(ForDelivery);
	}
	/********************************************************************************************************************************/
	public WebElement get_ForActivation() {
		return DriverManager.getDriver().findElement(ForActivation);
	}
	/********************************************************************************************************************************/
	public WebElement get_Activated() {
		return DriverManager.getDriver().findElement(Activated);
	}
	/********************************************************************************************************************************/
	public WebElement get_ForRefund() {
		return DriverManager.getDriver().findElement(ForRefund);
	}
	/********************************************************************************************************************************/
	public WebElement get_Refunded() {
		return DriverManager.getDriver().findElement(Refunded);
	}	
	/********************************************************************************************************************************/
	public WebElement get_ForRedelivery() {
		return DriverManager.getDriver().findElement(ForRedelivery);
	}
	/********************************************************************************************************************************/
	public WebElement get_Delivered() {
		return DriverManager.getDriver().findElement(Delivered);
	}
	/********************************************************************************************************************************/
	/********************************************************************************************************************************/
	public WebElement get_SelectAdmin() {
		return DriverManager.getDriver().findElement(SelectAdmin);
	}
	/********************************************************************************************************************************/
	public WebElement get_Checkbox() {
		return DriverManager.getDriver().findElement(Checkbox);
	}
	/********************************************************************************************************************************/
	public WebElement get_Assign_Checkbox() {
		return DriverManager.getDriver().findElement(Assign_Checkbox);
	}
	/********************************************************************************************************************************/
	public WebElement get_SelectFSO() {
		return DriverManager.getDriver().findElement(SelectFSO);
	}
	/********************************************************************************************************************************/
	public WebElement get_Assign_btn() {
		return DriverManager.getDriver().findElement(Assign_btn);
	}
	/********************************************************************************************************************************/
	public WebElement get_SelectGOTS() {
		return DriverManager.getDriver().findElement(SelectGOTS);
	}
	
	/********************************************************************************************************************************/

	public boolean isElementExist(String message, String element, int waitTime) {
		boolean flag = false;

		switch (element) {
	//dashboard
		case "cookiesNotification":
			flag = waitForElementVisibility(cookiesNotification, waitTime);
			break;
		case "OrderCancelled":
			flag = waitForElementVisibility(OrderCancelled, waitTime);
			break;
		case "UpdatedDate":
			flag = waitForElementVisibility(UpdatedDate, waitTime);
			break;
		case "OrderCancelledContext":
			flag = waitForElementVisibility(OrderCancelledContext, waitTime);
			break;
		case "cancelimage":
			flag = waitForElementVisibility(cancelimage, waitTime);
			break;
		case "prodname":
			flag = waitForElementVisibility(prodname, waitTime);
			break;
		case "UPDATED":
			flag = waitForElementVisibility(UPDATED, waitTime);
			break;
		case "unit":
			flag = waitForElementVisibility(unit, waitTime);
			break;
		case "reDeliver":
			flag = waitForElementVisibility(reDeliver, waitTime);
			break;
		case "product":
			flag = waitForElementVisibility(product, waitTime);
			break;
			
		case "Accountbutton":
			flag = waitForElementVisibility(Accountbutton, waitTime);
			break;
		case "Dashboard_DateSubmitted":
			flag = waitForElementVisibility(Dashboard_DateSubmitted, waitTime);
			break;
		case "Dashboard_RefNum":
			flag = waitForElementVisibility(Dashboard_RefNum, waitTime);
			break;
		case "Dashboard_LName":
			flag = waitForElementVisibility(Dashboard_LName, waitTime);
			break;
		case "Dashboard_FName":
			flag = waitForElementVisibility(Dashboard_FName, waitTime);
			break;
		case "Dashboard_PRODUCTAvailed":
			flag = waitForElementVisibility(Dashboard_PRODUCTAvailed, waitTime);
			break;
		case "Dashboard_Dispo":
			flag = waitForElementVisibility(Dashboard_Dispo, waitTime);
			break;
		case "Dashboard_Reason":
			flag = waitForElementVisibility(Dashboard_Reason, waitTime);
			break;
		case "Dashboard_Assignee":
			flag = waitForElementVisibility(Dashboard_Assignee, waitTime);
			break;
		case "Forpayment":
			flag = waitForElementVisibility(Forpayment, waitTime);
			break;
		case "ViewBtn":
			flag = waitForElementVisibility(ViewBtn, waitTime);
			break;
		case "EditBtn":
			flag = waitForElementVisibility(EditBtn, waitTime);
			break;
			
		//clicking on view
		case "Ordertype":
			flag = waitForElementVisibility(Ordertype, waitTime);
			break;
		case "Ordermethod":
			flag = waitForElementVisibility(Ordermethod, waitTime);
			break;
		case "Customertyoe":
			flag = waitForElementVisibility(Customertyoe, waitTime);
			break;
		case "Checkoutmethod":
			flag = waitForElementVisibility(Checkoutmethod, waitTime);
			break;
		case "Giveasagift":
			flag = waitForElementVisibility(Giveasagift, waitTime);
			break;
			
		//customer details
		case "Customerdetails":
			flag = waitForElementVisibility(Customerdetails, waitTime);
			break;
		case "Firstname":
			flag = waitForElementVisibility(Firstname, waitTime);
			break;
		case "Firstname_input":
			flag = waitForElementVisibility(Firstname_input, waitTime);
			break;
		case "Middlename":
			flag = waitForElementVisibility(Middlename, waitTime);
			break;
		case "Middlename_input":
			flag = waitForElementVisibility(Middlename_input, waitTime);
			break;
		case "Lastname":
			flag = waitForElementVisibility(Lastname, waitTime);
			break;
		case "Lastname_input":
			flag = waitForElementVisibility(Lastname_input, waitTime);
			break;
		case "Emailaddress":
			flag = waitForElementVisibility(Emailaddress, waitTime);
			break;
		case "Emailaddress_input":
			flag = waitForElementVisibility(Emailaddress_input, waitTime);
			break;
		case "Mobilenumber":
			flag = waitForElementVisibility(Mobilenumber, waitTime);
			break;
		case "Mobilenumber_input":
			flag = waitForElementVisibility(Mobilenumber_input, waitTime);
			break;
			
		//Recipentdetails	
		case "ReceipentDetails":
			flag = waitForElementVisibility(ReceipentDetails, waitTime);
			break;	
		case "NameofRecipent":
			flag = waitForElementVisibility(NameofRecipent, waitTime);
			break;
		case "NameofRecipent_input":
			flag = waitForElementVisibility(NameofRecipent_input, waitTime);
			break;
		case "MobilenumberofRecipent":
			flag = waitForElementVisibility(MobilenumberofRecipent, waitTime);
			break;
		case "MobilenumberofRecipent_input":
			flag = waitForElementVisibility(MobilenumberofRecipent_input, waitTime);
			break;
			
		//AddressDetails	
		case "Addressdetails":
			flag = waitForElementVisibility(Addressdetails, waitTime);
			break;
		case "Addresstype":
			flag = waitForElementVisibility(Addresstype, waitTime);
			break;
		case "House_select":
			flag = waitForElementVisibility(House_select, waitTime);
			break;
		case "Condominum_select":
			flag = waitForElementVisibility(Condominum_select, waitTime);
			break;
		case "House":
			flag = waitForElementVisibility(House, waitTime);
			break;
		case "House_input":
			flag = waitForElementVisibility(House_input, waitTime);
			break;
		case "Street":
			flag = waitForElementVisibility(Street, waitTime);
			break;
		case "Street_input":
			flag = waitForElementVisibility(Street_input, waitTime);
			break;
		case "Village":
			flag = waitForElementVisibility(Village, waitTime);
			break;
		case "Village_input":
			flag = waitForElementVisibility(Village_input, waitTime);
			break;
		case "Barangay":
			flag = waitForElementVisibility(Barangay, waitTime);
			break;	
		case "Barangay_input":
			flag = waitForElementVisibility(Barangay_input, waitTime);
			break;
		case "City":
			flag = waitForElementVisibility(City, waitTime);
			break;
		case "City_input":
			flag = waitForElementVisibility(City_input, waitTime);
			break;
		case "Province":
			flag = waitForElementVisibility(Province, waitTime);
			break;
		case "Province_input":
			flag = waitForElementVisibility(Province_input, waitTime);
			break;
		case "Zipcode":
			flag = waitForElementVisibility(Zipcode, waitTime);
			break;
		case "Zipcode_input":
			flag = waitForElementVisibility(Zipcode_input, waitTime);
			break;
		case "Longitude":
			flag = waitForElementVisibility(Longitude, waitTime);
			break;
		case "Longitude_input":
			flag = waitForElementVisibility(Longitude_input, waitTime);
			break;
		case "Latitude":
			flag = waitForElementVisibility(Latitude, waitTime);
			break;
		case "Latitude_input":
			flag = waitForElementVisibility(Latitude_input, waitTime);
			break;
			
		//Orderdetails	
		case "Orderdetails":
			flag = waitForElementVisibility(Orderdetails, waitTime);
			break;
		case "Quantity":
			flag = waitForElementVisibility(Quantity, waitTime);
			break;
		case "Quantity_input":
			flag = waitForElementVisibility(Quantity_input, waitTime);
			break;
		case "Producttype":
			flag = waitForElementVisibility(Producttype, waitTime);
			break;	
		case "Producttype_input":
			flag = waitForElementVisibility(Producttype_input, waitTime);
			break;
		case "Sku":
			flag = waitForElementVisibility(Sku, waitTime);
			break;
		case "Sku_input":
			flag = waitForElementVisibility(Sku_input, waitTime);
			break;
		case "Matcode":
			flag = waitForElementVisibility(Matcode, waitTime);
			break;
		case "Matcode_input":
			flag = waitForElementVisibility(Matcode_input, waitTime);
			break;
		case "BSSCasenumber":
			flag = waitForElementVisibility(BSSCasenumber, waitTime);
			break;
		case "BSSCasenumber_input":
			flag = waitForElementVisibility(BSSCasenumber_input, waitTime);
			break;
		case "Reservationid":
			flag = waitForElementVisibility(Reservationid, waitTime);
			break;
		case "Reservationid_input":
			flag = waitForElementVisibility(Reservationid_input, waitTime);
			break;
		case "Modemserial":
			flag = waitForElementVisibility(Modemserial, waitTime);
			break;
		case "Modemserial_input":
			flag = waitForElementVisibility(Modemserial_input, waitTime);
			break;
		case "Simserial":
			flag = waitForElementVisibility(Simserial, waitTime);
			break;
		case "Simserial_input":
			flag = waitForElementVisibility(Simserial_input, waitTime);
			break;
		case "Deliverycasetitle":
			flag = waitForElementVisibility(Deliverycasetitle, waitTime);
			break;
		case "Deliverycasetitle_input":
			flag = waitForElementVisibility(Deliverycasetitle_input, waitTime);
			break;
		case "Deliveryqueuename":
			flag = waitForElementVisibility(Deliveryqueuename, waitTime);
			break;
		case "Deliveryqueuename_input":
			flag = waitForElementVisibility(Deliveryqueuename_input, waitTime);
			break;
		case "Promocode":
			flag = waitForElementVisibility(Promocode, waitTime);
			break;	
		case "Promocode_input":
			flag = waitForElementVisibility(Promocode_input, waitTime);
			break;
		case "Discount":
			flag = waitForElementVisibility(Discount, waitTime);
			break;
		case "Discount_input":
			flag = waitForElementVisibility(Discount_input, waitTime);
			break;
		case "Projectname":
			flag = waitForElementVisibility(Projectname, waitTime);
			break;
		case "Projectname_input":
			flag = waitForElementVisibility(Projectname_input, waitTime);
			break;
			
			//Payment Details			
		case "Paymentdeatils":
			flag = waitForElementVisibility(Paymentdeatils, waitTime);
			break;
		case "Totalamount":
			flag = waitForElementVisibility(Totalamount, waitTime);
			break;
		case "Totalamount_input":
			flag = waitForElementVisibility(Totalamount_input, waitTime);
			break;
		case "Paymentmethod":
			flag = waitForElementVisibility(Paymentmethod, waitTime);
			break;
		case "Paymentmethod_input":
			flag = waitForElementVisibility(Paymentmethod_input, waitTime);
			break;
		case "Transaction":
			flag = waitForElementVisibility(Transaction, waitTime);
			break;
		case "Transaction_input":
			flag = waitForElementVisibility(Transaction_input, waitTime);
			break;
		case "Or":
			flag = waitForElementVisibility(Or, waitTime);
			break;
		case "Or_input":
			flag = waitForElementVisibility(Or_input, waitTime);
			break;
			
			//Fullfilmentdetails			
		case "Fullfilmentdetails":
			flag = waitForElementVisibility(Fullfilmentdetails, waitTime);
			break;
		case "Fulfilment":
			flag = waitForElementVisibility(Fulfilment, waitTime);
			break;
		case "Delivery":
			flag = waitForElementVisibility(Delivery, waitTime);
			break;
		case "Assignedcourier":
			flag = waitForElementVisibility(Assignedcourier, waitTime);
			break;	
		case "Assignedagent":
			flag = waitForElementVisibility(Assignedagent, waitTime);
			break;
		case "Schedule":
			flag = waitForElementVisibility(Schedule, waitTime);
			break;
		case "Status":
			flag = waitForElementVisibility(Status, waitTime);
			break;
		case "Remarks":
			flag = waitForElementVisibility(Remarks, waitTime);
			break;
		case "Addnewrowbutton":
			flag = waitForElementVisibility(Addnewrowbutton, waitTime);
			break;
			
			//Activationdetails			
		case "Activationdetails":
			flag = waitForElementVisibility(Activationdetails, waitTime);
			break;
		case "Channel":
			flag = waitForElementVisibility(Channel, waitTime);
			break;
		case "Channel_input":
			flag = waitForElementVisibility(Channel_input, waitTime);
			break;
		case "Dateofactivation":
			flag = waitForElementVisibility(Dateofactivation, waitTime);
			break;
		case "Dateofactivation_input":
			flag = waitForElementVisibility(Dateofactivation_input, waitTime);
			break;
		case "Time":
			flag = waitForElementVisibility(Time, waitTime);
			break;
		case "Time_input":
			flag = waitForElementVisibility(Time_input, waitTime);
			break;
			
			//RefundDetails			
		case "RefundDetails":
			flag = waitForElementVisibility(RefundDetails, waitTime);
			break;
		case "RefundRequestdate":
			flag = waitForElementVisibility(RefundRequestdate, waitTime);
			break;
		case "RefundRequestdate_input":
			flag = waitForElementVisibility(RefundRequestdate_input, waitTime);
			break;
		case "ValidamountofRefund":
			flag = waitForElementVisibility(ValidamountofRefund, waitTime);
			break;
		case "ValidamountofRefund_input":
			flag = waitForElementVisibility(ValidamountofRefund_input, waitTime);
			break;
		case "IssuingBank":
			flag = waitForElementVisibility(IssuingBank, waitTime);
			break;	
		case "IssuingBank_input":
			flag = waitForElementVisibility(IssuingBank_input, waitTime);
			break;
		case "Cardnumber":
			flag = waitForElementVisibility(Cardnumber, waitTime);
			break;
		case "Cardnumber_input":
			flag = waitForElementVisibility(Cardnumber_input, waitTime);
			break;
		case "Accountname":
			flag = waitForElementVisibility(Accountname, waitTime);
			break;
		case "Accountname_input":
			flag = waitForElementVisibility(Accountname_input, waitTime);
			break;
		case "Authorization":
			flag = waitForElementVisibility(Authorization, waitTime);
			break;
		case "Authorization_input":
			flag = waitForElementVisibility(Authorization_input, waitTime);
			break;
		case "Remarks_Refund":
			flag = waitForElementVisibility(Remarks_Refund, waitTime);
			break;
		case "Remarks_input":
			flag = waitForElementVisibility(Remarks_input, waitTime);
			break;
		case "RefundReference":
			flag = waitForElementVisibility(RefundReference, waitTime);
			break;
		case "RefundReference_input":
			flag = waitForElementVisibility(RefundReference_input, waitTime);
			break;
		
			//After Sale 			
		case "Aftersale":
			flag = waitForElementVisibility(Aftersale, waitTime);
			break;
			
			//OrderHistory
		case "OrderHistory":
			flag = waitForElementVisibility(OrderHistory, waitTime);
			break;
		case "Backbutton":
			flag = waitForElementVisibility(Backbutton, waitTime);
			break;
		case "Savebutton":
			flag = waitForElementVisibility(Savebutton, waitTime);
			break;
		case "Checkbox":
			flag = waitForElementVisibility(Checkbox, waitTime);
			break;	
		
		
		//order tracker
	case "MyOrder":
		flag = waitForElementVisibility(MyOrder, waitTime);
		break;
	case "referencenumber":
		flag = waitForElementVisibility(referencenumber, waitTime);
		break;
	case "OT_Orderid":
		flag = waitForElementVisibility(OT_Orderid, waitTime);
		break;
	case "Confirm":
		flag = waitForElementVisibility(Confirm, waitTime);
		break;
	case "Confirm_Subtitle":
		flag = waitForElementVisibility(Confirm_Subtitle, waitTime);
		break;
	case "Deliver":
		flag = waitForElementVisibility(Deliver, waitTime);
		break;	
	case "Deliver_Subtitle":
		flag = waitForElementVisibility(Deliver_Subtitle, waitTime);
		break;
	case "Deliver_Heading":
		flag = waitForElementVisibility(Deliver_Heading, waitTime);
		break;
	case "Deliver_Date":
		flag = waitForElementVisibility(Deliver_Date, waitTime);
		break;
	case "Deliver_text":
		flag = waitForElementVisibility(Deliver_text, waitTime);
		break;
	case "Deliver_text_right":
		flag = waitForElementVisibility(Deliver_text_right, waitTime);
		break;
	case "Deliver_Paymentmethod":
		flag = waitForElementVisibility(Deliver_Paymentmethod, waitTime);
		break;
	case "Deliver_Paymentmethod_val":
		flag = waitForElementVisibility(Deliver_Paymentmethod_val, waitTime);
		break;
	case "Deliver_Amountpaid":
		flag = waitForElementVisibility(Deliver_Amountpaid, waitTime);
		break;
	case "Deliver_Amountpaid_Val":
		flag = waitForElementVisibility(Deliver_Amountpaid_Val, waitTime);
		break;
	case "Deliver_Shiptothisaddress_Header":
		flag = waitForElementVisibility(Deliver_Shiptothisaddress_Header, waitTime);
		break;
	case "Deliver_Shiptothisaddress":
		flag = waitForElementVisibility(Deliver_Shiptothisaddress, waitTime);
		break;
	case "Deliver_EstimatedDelivery":
		flag = waitForElementVisibility(Deliver_EstimatedDelivery, waitTime);
		break;
	case "Deliver_Estimated_deliverydate":
		flag = waitForElementVisibility(Deliver_Estimated_deliverydate, waitTime);
		break;
	case "DISAPTCH":
		flag = waitForElementVisibility(DISAPTCH, waitTime);
		break;	
	case "DISAPTCH_Subtitle":
		flag = waitForElementVisibility(DISAPTCH_Subtitle, waitTime);
		break;
	case "DISAPTCH_Heading":
		flag = waitForElementVisibility(DISAPTCH_Heading, waitTime);
		break;
	case "DISAPTCH_Date":
		flag = waitForElementVisibility(DISAPTCH_Date, waitTime);
		break;
	case "DISAPTCH_text":
		flag = waitForElementVisibility(DISAPTCH_text, waitTime);
		break;
	
	case "DISAPTCH_Paymentmethod":
		flag = waitForElementVisibility(DISAPTCH_Paymentmethod, waitTime);
		break;
	case "DISAPTCH_Paymentmethod_val":
		flag = waitForElementVisibility(DISAPTCH_Paymentmethod_val, waitTime);
		break;
	case "DISAPTCH_Amountpaid":
		flag = waitForElementVisibility(DISAPTCH_Amountpaid, waitTime);
		break;
	case "DISAPTCH_Amountpaid_Val":
		flag = waitForElementVisibility(DISAPTCH_Amountpaid_Val, waitTime);
		break;
	case "DISAPTCH_Shiptothisaddress_Header":
		flag = waitForElementVisibility(DISAPTCH_Shiptothisaddress_Header, waitTime);
		break;
	case "DISAPTCH_Shiptothisaddress":
		flag = waitForElementVisibility(DISAPTCH_Shiptothisaddress, waitTime);
		break;
	case "DISAPTCH_EstimatedDelivery":
		flag = waitForElementVisibility(DISAPTCH_EstimatedDelivery, waitTime);
		break;
	case "DISAPTCH_Estimated_deliverydate":
		flag = waitForElementVisibility(DISAPTCH_Estimated_deliverydate, waitTime);
		break;
	case "recieve":
		flag = waitForElementVisibility(recieve, waitTime);
		break;
	case "Recieve_Subtitle":
		flag = waitForElementVisibility(Recieve_Subtitle, waitTime);
		break;
	case "Recieve_Img":
		flag = waitForElementVisibility(Recieve_Img, waitTime);
		break;
	case "Recieve_For_Activation":
		flag = waitForElementVisibility(Recieve_For_Activation, waitTime);
		break;	
	case "recieve_Date":
		flag = waitForElementVisibility(recieve_Date, waitTime);
		break;
	case "recieve_text":
		flag = waitForElementVisibility(recieve_text, waitTime);
		break;
	case "recieve_dateordered":
		flag = waitForElementVisibility(recieve_dateordered, waitTime);
		break;
	case "recieve_date":
		flag = waitForElementVisibility(recieve_date, waitTime);
		break;
	case "recieve_Amountpaid":
		flag = waitForElementVisibility(recieve_Amountpaid, waitTime);
		break;
	case "recieve_Amount":
		flag = waitForElementVisibility(recieve_Amount, waitTime);
		break;
	case "recieve_Viewdetails":
		flag = waitForElementVisibility(recieve_Viewdetails, waitTime);
		break;
	case "recieve_setupandconfiguration":
		flag = waitForElementVisibility(recieve_setupandconfiguration, waitTime);
		break;
		}
		if (flag) {
//			ExtentTestManager.logInfo(message + " - exists");
			System.out.println(message + " - exists");
		} else {
//			ExtentTestManager.logFail(message + " - do not exists");
			System.out.println(message + " - do not exist");
		}
		
		return flag;
	}
	
	/********************************************************************************************************************************/
	public boolean isClickable(String element, int waitTime) {

		boolean flag = false;

		switch (element) {
		
		case "Accountbutton":
			flag = waitForElementClickable(Accountbutton, waitTime);
			break;
		case "Username":
			flag = waitForElementClickable(Username, waitTime);
			break;
		case "Password":
			flag = waitForElementClickable(Password, waitTime);
			break;
		case "Signinbutton":
			flag = waitForElementClickable(Signinbutton, waitTime);
			break;
		case "privacyAccept":
			flag = waitForElementClickable(privacyAccept, waitTime);
			break;
			

		}

		return flag;
	}
	/********************************************************************************************************************************/
	public void moveToElement(String element) {

		WebElement ele = null;

		switch (element) {
		
		case "Accountbutton":
			ele = DriverManager.getDriver().findElement(Accountbutton);
			break;
		case "Username":
			ele = DriverManager.getDriver().findElement(Username);
			break;
		case "Password":
			ele = DriverManager.getDriver().findElement(Password);
			break;
		case "Signinbutton":
			ele = DriverManager.getDriver().findElement(Signinbutton);
			break;
		
		}	

		try {
			Actions a = new Actions(DriverManager.getDriver());
			Thread.sleep(500L);
			a.moveToElement(ele).build().perform();
		} catch (Exception e) {

		}
	}

	/********************************************************************************************************************************/
	

	/********************************************************************************************************************************/
	public String getURLOfNewTab() {

		String title = "";
		try {
			Set<String> winID = DriverManager.getDriver().getWindowHandles();
			Iterator<String> winItr = winID.iterator();
			String parentID = winItr.next();
			String childID = winItr.next();

			DriverManager.getDriver().switchTo().window(childID);
			title = DriverManager.getDriver().getCurrentUrl();
			DriverManager.getDriver().close();
			DriverManager.getDriver().switchTo().window(parentID);

		} catch (Exception e) {
			System.out.println("FAIL : to get the tab title. Message :" + e.getMessage());
		}
		return title;
	}

	/********************************************************************************************************************************/

	/********************************************************************************************************************************/
	public void write_OrderID_in_PropertiesFile(String key, String data) {
		FileOutputStream fileOut = null;
		FileInputStream fileIn = null;
		try {
			Properties p = new Properties();

			File file = new File(".//OrderID.properties");
			fileIn = new FileInputStream(file);
			p.load(fileIn);
			p.setProperty(key, data);
			fileOut = new FileOutputStream(file);
			p.store(fileOut, null);

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {

			try {
				fileOut.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
	/********************************************************************************************************************************/
	public void scroll_vertical(int y_Axis) {
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("window.scrollBy(0," + y_Axis + ")", "");
	}
	/********************************************************************************************************************************/
	public void clickOnElement(String type, String eleName, String ele) {

		try {
			switch (ele) {
			
			case "Accountbutton":
				get_Accountbutton().click();
				break;
			case "Signin":
				get_Signin().click();
				break;
			case "Username":
				get_Username().click();
				break;
			case "Password":
				get_Password().click();
				break;
			
			case "Signinbutton":
				get_Signinbutton().click();
				break;
			case "Entities":
				get_Entities().click();
				break;
			case "ApplicationEntry":
				get_ApplicationEntry().click();
				break;
			case "SearchError":
				get_SearchError().click();
				break;
//			case "View":
//				get_View().click();
//				break;
////			case "edit":
//				get_edit().click();
//				break;
			case "ViewBtn":
				get_ViewBtn().click();
				break;
			case "EditBtn":
				get_EditBtn().click();
				break;
			case "Customerdetails":
				get_Customerdetails().click();
				break;
			case "ReceipentDetails":
				get_ReceipentDetails().click();
				break;
			case "Addressdetails":
				get_Addressdetails().click();
				break;
			case "Orderdetails":
				get_Orderdetails().click();
				break;
			case "Paymentdeatils":
				get_Paymentdeatils().click();
				break;
			case "Fullfilmentdetails":
				get_Fullfilmentdetails().click();
				break;
			case "Activationdetails":
				get_Activationdetails().click();
				break;
			case "RefundDetails":
				get_RefundDetails().click();
				break;
			case "OrderHistory":
				get_OrderHistory().click();
				break;
			case "Backbutton":
				get_Backbutton().click();
				break;
			case "Savebutton":
				get_Savebutton().click();
				break;
			case "Search":
				get_Search().click();
				break;
//			case "Account":
//				get_Account().click();
//				break;
			case "Account_Signout":
				get_Account_Signout().click();
				break;
			case "Account_Signin":
				get_Account_Signin().click();
				break;
			case "DispositionStatus":
				get_DispositionStatus().click();
				break;
			case "ForDispatch":
				get_ForDispatch().click();
				break;
			case "ForDelivery":
				get_ForDelivery().click();
				break;
			case "ForActivation":
				get_ForActivation().click();
				break;
			case "Activated":
				get_Activated().click();
				break;
			case "ForRefund":
				get_ForRefund().click();
				break;
			case "Refunded":
				get_Refunded().click();
				break;
			case "ForRedelivery":
				get_ForRedelivery().click();
				break;
			case "Delivered":
				get_Delivered().click();
				break;	
			case "Confirmcorrect":
				get_Confirmcorrect().click();
				break;	
			case "SelectAdmin":
				get_SelectAdmin().click();
				break;	
			case "Checkbox":
				get_Checkbox().click();
				break;	
			case "Assign_Checkbox":
				get_Assign_Checkbox().click();
				break;	
			case "SelectFSO":
				get_SelectFSO().click();
				break;	
			case "SelectGOTS":
				get_SelectGOTS().click();
				break;
			case "Assign_btn":
				get_Assign_btn().click();
				break;	
			case "Trackmyorder_button":
				get_Trackmyorder_button().click();
				break;	
			case "privacyAccept":
				get_privacyAccept().click();
				break;	
			}
		} catch (ElementClickInterceptedException e1) {
			System.out.println(type + " : " + eleName + " : " + "Element is not clickable : " + e1.getMessage());
			Assert.assertTrue(false);
		} catch (NoSuchElementException e2) {
			System.out.println(type + " : " + eleName + " : " + "Element not found : " + e2.getMessage());
			Assert.assertTrue(false);
		} catch (Exception e) {
			System.out.println(type + " : " + eleName + " : " + "Exception : " + e.getMessage());
			Assert.assertTrue(false);
		}

		System.out.println("Clicked on " + type + " : " + eleName);
	}



}

