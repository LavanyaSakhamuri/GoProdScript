package com.pages.omt;

//package globeOnline_MNP;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import globeOnline_CommonMethods.DriverManager;

public class MNP_OMT_Page extends BasePage {

	By privacyAccept = By.xpath("//button[text()=' I accept']");
	By AccountMenu = By.xpath("//a[@id='account-menu']");
	By Signin = By.xpath("//a[@id='login']");
	By SigninBtn = By.xpath("//button[text()='Sign in']");
	By Entities = By.xpath("//span[text()=' Entities ']");
	By AppEntry = By.xpath("//span[text()='Application Entry']");
	By SearchField = By.xpath("//input[@name='searchTerm']");
	By Confirmcorrect = By.xpath("(//button[@id='saveOrder'])");

	By OrderIDResult = By.xpath("//span[@class='ngb-highlight' and contains(.,'PRE-')]");
	By OrderReceivedStatus = By.xpath("(//*[text()='Order Received'])[2]");
	By AwaitingBSS = By.xpath("(//*[text()='Awaiting BSS'])[2]");
	By Edit = By.xpath("//span[text()='Edit']");

	By Save = By.xpath("//span[text()='Save']");
	By ReviewSubmittedForm = By.xpath("//h4[text()='Review Submitted Form']");
	// Signin
//	By Signin = By.xpath("//span[contains(text(), 'Sign in')]");
	By Username = By.xpath("//input[@id='username']");
	By Password = By.xpath("//input[@id='password']");
	By Signinbutton = By.xpath("//button[@class='btn btn-primary']");

	By ApplicationEntry = By.xpath("//span[contains(text(),'Application Entry')]");
	By View = By.xpath("(//button[@class='btn btn-info btn-sm btn-block mb-1'])[1]");
	By edit = By.xpath("(//button[@class='btn btn-primary btn-sm btn-block mb-1'])[1]");
	By Search = By.xpath("//button[text()='Search']");
	By DownloadBtn = By.xpath("//span[contains(text(), 'Download')]");// --->las
	By SearchError = By.xpath("//h6[contains(text(), 'No results found')]");
	By ViewBtn = By.xpath("//span[contains(text(), 'View')]");
	By EditBtn = By.xpath("//span[contains(text(), 'Edit')]");

	By Accountbutton = By.xpath("//span[contains(text(),' Account ')]");
	// Account
	// By Account = By.xpath("//span[contains(text(),' Account ')]");
	By Account_Signout = By.xpath("//span[contains(text(),'Sign out')]");
	By Account_Signin = By.xpath("//span[contains(text(),'Sign in')]");

	// DispositionStatus
	public By DispositionStatus = By.xpath("//select[@id='dispositionStatus']");
	By DispositionStatus_input = By.xpath("//select[@formcontrolname='dispositionStatus']");
	By Awaitingbss = By.xpath("//option[contains(text(),' Awaiting BSS ')]");
	By CheckigMNPStatus = By.xpath("//option[contains(text(),'Check MNP Status')]");
	By PortingFailed = By.xpath("//option[contains(text(),' Porting Failed ')]");
	By PortingUnderView = By.xpath("//option[contains(text(),' Porting Under Review ')]");
	By OrderRecevied = By.xpath("//option[contains(text(),' Order Received ')]");

	By Dashboard_DateSubmitted = By.xpath("//td//ngb-highlight[contains(text(), '2022')]");
	By Dashboard_RefNum = By.xpath("//span[contains(text(), 'PRE')]");
	By Dashboard_LName = By.xpath("(//td//ngb-highlight[@ng-reflect-result])[3]");
	By Dashboard_FName = By.xpath("(//td//ngb-highlight[@ng-reflect-result])[4]");
	By Dashboard_PlanAvailed = By.xpath("//td//ngb-highlight[contains(text(), 'GPlan')]");
	By Dashboard_PRODUCTAvailed = By.xpath("(//td//ngb-highlight[@ng-reflect-result])[5]");
	public By Dashboard_Dispo = By.xpath("(//th[text()='Disposition Status']//following::td//following::ngb-highlight)[6]");
	By Dashboard_Reason = By.xpath("(//td//ngb-highlight[@ng-reflect-result])[7]");
	By Dashboard_Assignee = By.xpath("(//td//ngb-highlight[@ng-reflect-result])[8]");
	///
	By OMT_OrderID = By.xpath("//h2[contains(text(), 'UAT-') or contains(text(),'PRE-')]");
	By OMT_OrderType = By.xpath("//input[@id='orderType']");
	By OMT_orderSubType = By.xpath("//input[@id='orderSubType']");
	By OMT_CustomerType = By.xpath("//input[@id='customerType']");
	By Checkoutmethod = By.xpath("//input[@id='checkoutMethod']");
	By Giveasagift = By.xpath("//input[@id='giveAsGift']");

	By OMT_Disposition = By.xpath("//select[@id='dispositionStatus']");
	By OMT_Dispo_Reason = By.xpath("//select[@id='reason']");

	By OrderCheckBox = By.xpath("//td//input[@type='checkbox']");
	By RemoveAssignee = By.xpath("//span[text()='Remove Assignee']");
	By RemoveButton = By.xpath("//button[text()='Remove']");
	By RemoveAssigneeRdBtn = By.xpath("//input[@id='removeAppRB']");
	By AssigneRdBtn = By.xpath("//input[@id='assignAppRB']");

	public By Select_Admin = By.xpath("//input[@id='typeahead-basic']");
	public By Assign_Result = By.xpath("//button[@class='dropdown-item active']");

//	By Giveasagift = By.xpath("//label[contains(text(),\"Give as Gift\")]");

	By SelectGOTS = By.xpath("//ngb-highlight[@ng-reflect-result='Agent, GOTS,  - OMT-GOTS-AGENT']");
//	By SelectFSO = By.xpath("(//span[@class='ngb-highlight'][contains(text(),'OMT-FSO-TD-AGENT')])[4]");
//	By Assign_btn = By.xpath("(//button[contains(text(),'Assign')])");

//	By OMT_acquiType = By.xpath("//input[@id='acquiType']");
//	By OMT_TransacType = By.xpath("//input[@id='transactionType']");	
//	By OMT_DispoReason = By.xpath("//select[@id='dispositionReason']");

	// customer details
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

	// Receipent Details
	By ReceipentDetails = By.xpath("//label[@for='recipient_details']");
	By NameofRecipent = By.xpath("//label[contains(text(),'Name of Recipient')]");
	By NameofRecipent_input = By.xpath("//input[@id='nameOfRecipient']");
	By MobilenumberofRecipent = By.xpath("//label[contains(text(),'Mobile Number of Recipient')]");
	By MobilenumberofRecipent_input = By.xpath("//input[@id='mobileNoOfRecipient']");

//	//condo
	By PrimaryRegAdd_FlrNo = By.xpath("//input[@name='unitNo']");
	By PrimaryRegAdd_BuildingName = By.xpath("//input[@name='buildingName']");

	By PrimarySameasbilling = By.xpath("//button[@class='btn bt-secondary btn-rt']");

	By PrimaryRegAdd_Brgy = By.xpath("//select[@name='barangay']");
	By PrimaryRegAdd_City = By.xpath("//select[@name='city']");
	By PrimaryRegAdd_Province = By.xpath("//select[@name='province']");
	By PrimaryRegAdd_Zipcode = By.xpath("//input[@name='zipCode']");
	By PrimaryRegAdd_Longitude = By.xpath("//input[@name='longitude']");
	By PrimaryRegAdd_Latitude = By.xpath("//input[@name='latitude']");

	// =========Shipping Address========
	By PrimaryShipAdd_houseRbtn = By.xpath("//input[@name='SAhouseOrCondo' and @value='House']");
	By PrimaryShipAdd_CondoRbtn = By.xpath("//input[@name='SAhouseOrCondo' and @value='Condominium']");
	By PrimaryShipAdd_HouseNo = By.xpath("//input[@name='SAhouseNo']");
	By PrimaryShipAdd_Street = By.xpath("//input[@name='SAstreet']");

	// condo
	By PrimaryShipAdd_FlrNo = By.xpath("//input[@name='SAunitNo']");
	By PrimaryShipAdd_BuildingName = By.xpath("//input[@name='buildingName']");

	By PrimaryShipAdd_VillageSubdi = By.xpath("//input[@name='SAsubdivision']");
	By PrimaryShipAdd_Brgy = By.xpath("//select[@name='SAbarangay']");
	By PrimaryShipAdd_City = By.xpath("//select[@name='SAcity']");
	By PrimaryShipAdd_Province = By.xpath("//select[@name='SAprovince']");
	By PrimaryShipAdd_ZipCode = By.xpath("//input[@name='SAzipCode']");
	By PrimaryShipAdd_Longitude = By.xpath("//input[@name='SAlongitude']");
	By PrimaryShipAdd_Latitude = By.xpath("//input[@name='SAlatitude']");

	// Address Details
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

	// Orderdetails
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
//		By Deliverycasetitle = By.xpath("//label[contains(text(),'Delivery Case Title')]");
//		By Deliverycasetitle_input = By.xpath("//input[@id='caseTitle']");
//		By Deliveryqueuename = By.xpath("//label[contains(text(),'Delivery Queue Name')]");
//		By Deliveryqueuename_input = By.xpath("//input[@id='queueName']");
	By Promocodes = By.xpath("//label[contains(text(),'Promo Code')]");
	By Promocode_input = By.xpath("//input[@id='promoCode']");
	By Discount = By.xpath("//label[contains(text(),'Discount')]");
	By Discount_input = By.xpath("//input[@id='discount']");
	By Projectname = By.xpath("//label[contains(text(),'Project Name')]");
	By Projectname_input = By.xpath("//input[@id='projectName']");

//		Mobile Porting Details

	By MNPDetails = By.xpath("//label[text()=' MOBILE NUMBER PORTING DETAILS ']");
	By USClabel = By.xpath("//label[text()='Unique Subscriber Code']");
	By USCinput = By.xpath("//input[@id='uscCode']");
	By Porting = By.xpath("//label[text()='Porting Request Status']");
	
	By PortingReqStatus = By.xpath("//option[contains(text(),'Porting Request Status')");
	
	By ClickPortingStatus = By.xpath("//select[@id='isMnpEligible']");
	

	By PortingReqStatusPendig = By.xpath("//option[contains(text(),' Pending ')]");
	By PortingReqStatusSuccess = By.xpath("//option[text()=' Success ']");
	By PortingReqStatusFailed = By.xpath("//option[contains(text(),'  Failed  ')]");

	By PortingReqId = By.xpath("//label[text()='Porting Reference ID']");
	By PortingReqIdInput = By.xpath("//input[@id='portingReferenceId']");

//		MNPDetails USClabel USCinput Porting PortingReqStatus PortingReqId	
//		By USCField=By.xpath("//div[@class='collapse show']//input[@id='uscCode']");

	// Payment Details
	By Paymentdeatils = By.xpath("//label[contains(text(),'PAYMENT DETAILS')]");
	By Totalamount = By.xpath("//label[contains(text(),'Total Amount')]");
	By Totalamount_input = By.xpath("//input[@id='totalAmount']");
	By Paymentmethod = By.xpath("//label[contains(text(),'Payment Method')]");
	By Paymentmethod_input = By.xpath("//input[@id='paymentMethod']");
	By Transaction = By.xpath("//label[contains(text(),'Transaction ID')]");
	By Transaction_input = By.xpath("//input[@id='transactionId']");
	By Or = By.xpath("//label[contains(text(),'OR #')]");
	By Or_input = By.xpath("//input[@id='orNumber']");

	// Fullfilmentdetails
	By Fullfilmentdetails = By.xpath("//label[contains(text(),' FULFILLMENT DETAILS ')]");
	By Fulfilment = By.xpath("//label[contains(text(),'Fulfillment')]");
	
	By Delivery = By.xpath("//label[contains(text(),'Delivery')]");
	
	By Assignedcourier = By.xpath("(//label[contains(text(),'Assigned Courier')])");
	By Assignedcourier_input = By.xpath("//input[@id='assignedCourier']");
	By AssignRdBtn=By.xpath("//input[@id='assignAppRB']");

	By Assignedagent = By.xpath("(//label[contains(text(),'Assigned Agent')])");
	By Assignedagent_input = By.xpath("//input[@id='assignedAgent']");
	By Schedule = By.xpath("(//div[contains(text(),'Schedule')])");
	By Schedule_input = By.xpath("//input[@id='deliveryDate']");

	By Status = By.xpath("(//div[contains(text(),'Status')])[1]");
	By Status_input = By.xpath("");
	By Remarks = By.xpath("(//div[contains(text(),'Remarks')])[1]");
	By Addnewrowbutton = By.xpath("(//button[contains(text(),' Add New Row ')])[1]");

	// FullFilment Details Status

	By fullfill = By.xpath("//label[contains(text(),' FULFILLMENT DETAILS ')]");
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
//		By FulfillDet_PickupHub = By.xpath("//input[@id='pickUpHub']");
	By FulfillDet_AssignedCourier = By.xpath("//input[@id='assignedCourier']");
	By FulfillDet_AssignedAgent = By.xpath("//input[@id='assignedAgent']");
	By FulfillDet_Schedule = By.xpath("//input[@id='deliveryDate']");
	By FulfillDet_Status = By.xpath("//select[@id='status']");
	By FulfillDet_Remarks = By.xpath("//select[@id='remarks']");
	By addnewrow = By.xpath("//button[text()=' Add New Row ']");

	// ORDER DETAILS
	By orderdetails = By.xpath("//label[contains(text(),' ORDER DETAILS ')]");

	By BSSOrderID = By.xpath("//input[@id='bssOrderId']");
	By BSSOrderCaseID = By.xpath("//input[@id='bssOrderCaseID']");
	By NewMobileNumber = By.xpath("//input[@id='newMobileNumber']");
	By DeliveryCaseTitle = By.xpath("//input[@id='caseTitle']");
	By DeliveryQueueName = By.xpath("//input[@id='queueName']");
	By ProdType = By.xpath("//input[@id='newBrand']");
	By NewPlan = By.xpath("//input[@id='newPostpaidPlan']");
	By Data = By.xpath("//input[@id='newData']");
	By Lockup = By.xpath("//input[@id='newLockup']");
	By PlanInclusions = By.xpath("//div[@class='textarea-custom']");
	By PaidAddOns = By.xpath("//button[@class='btn bg-secondary text-white']");
	By item1 = By.xpath("((//table[@class='table table--device-details'])[2]//tr//td)[1]");
	By SKU1 = By.xpath("((//table[@class='table table--device-details'])[2]//tr//td)[2]");
	By Matcode1 = By.xpath("((//table[@class='table table--device-details'])[2]//tr//td)[3]");
	By Sloc1 = By.xpath("((//table[@class='table table--device-details'])[2]//tr//td)[4]");
	By Serial1 = By.xpath("((//table[@class='table table--device-details'])[2]//tr//td)[5]");

	By item2 = By.xpath("((//table[@class='table table--device-details'])[2]//tr//td)[6]");
	By SKU2 = By.xpath("((//table[@class='table table--device-details'])[2]//tr//td)[7]");
	By Matcode2 = By.xpath("((//table[@class='table table--device-details'])[2]//tr//td)[8]");
	By Sloc2 = By.xpath("((//table[@class='table table--device-details'])[2]//tr//td)[9]");
	By Serial2 = By.xpath("((//table[@class='table table--device-details'])[2]//tr//td)[10]");
	By ReservationID = By.xpath("//input[@name='reservationIdNo']");

	// Promo Code Details
	By Promocode = By.xpath("//input[@name='voucherPromoCode']");
	By PromoDiscount = By.xpath("//input[@name='promoCodeDiscount']");
	By ProjectName = By.xpath("//input[@name='projectName']");
	// Order Tagging
	By Channel = By.xpath("//input[@name='dafSource']");
	By SalesmanID = By.xpath("//input[@name='salesmanId']");

	// PAYMENT DETAILS
	By payment = By.xpath("//label[contains(text(),' PAYMENT DETAILS ')]");
	By Primary_Fname = By.xpath("//input[@id='firstName']");
//		By Customerdetails = By.xpath("//label[contains(text(),' CUSTOMER DETAILS ')]");
	By Primary_MName = By.xpath("//input[@id='middleName']");
	By Primary_LName = By.xpath("//input[@id='lastName']");
	By Primary_MobNum = By.xpath("//input[@id='mobileNumber']");
	By Primary_Email = By.xpath("//input[@id='emailAddress']");
	By Primary_Bday = By.xpath("//input[@id='birthday']");
	By Primary_Gender = By.xpath("//select[@name='gender']");
	By Primary_Nationality = By.xpath("//select[@name='citizenship']");
	By Primary_FullMothersname = By.xpath("//input[@id='fullMothersMaidenName']");
	
	// =========Authorized Contact Person========
	By Primary_RecipientName = By.xpath("//input[@id='authorizedRepresentativeName']");
	By Primary_RecipientMobNum = By.xpath("//input[@id='authorizedRepresentativeNumber']");
	
	// =========Registered Address========
	By PrimaryRegAdd_HouseRbtn = By.xpath("//input[@name='houseOrCondo' and @value='House']");
	By PrimaryRegAdd_CondoRbtn = By.xpath("//input[@name='houseOrCondo' and @value='Condominium']");
	By PrimaryRegAdd_houseNo = By.xpath("//input[@name='houseNo']");
	By PrimaryRegAdd_Street = By.xpath("//input[@name='street']");
	By PrimaryRegAdd_VillageSubdi = By.xpath("//input[@name='subdivision']");

	By DevCashout = By.xpath("(//input[@id='balance'])[1]");
	By DevCashout_Account = By.xpath("(//input[@id='accountNumber'])[2]");
	By DevCashout_AmountDue = By.xpath("(//input[@id='amountDue'])[2]");
	By DevCashout_PaymentID = By.xpath("(//input[@id='transactionId'])[1]");
	By PTF = By.xpath("(//input[@id='balance'])[2]");
	By PTF_Account = By.xpath("(//input[@id='accountNumber'])[3]");
	By PTF_AmountDue = By.xpath("(//input[@id='amountDue'])[3]");
	By PTF_PaymentId = By.xpath("(//input[@id='transactionId'])[2]");
	// Request Payment
	By ReqPay_PayMethod = By.xpath("//input[@id='preferredPaymentMethod']");
	By ReqPay_TotalAmount = By.xpath("//input[@id='totalAmount']");
	By ReqPay_PaymentMethod = By.xpath("//select[@id='paymentMethod']");
	By ReqPay_DateLinkSeeding = By.xpath("//input[@id='dateOfLinkSending']");
	By ReqPay_PayReference = By.xpath("//input[@id='paymentReference']");
	By ReqPay_StatusPayment = By.xpath("//select[@id='acquiPaymentStatus']");
	// Payment Posting Details
	By PostDet_TransacDate = By.xpath("//input[@id='paymentPostingTransactionDate']");
	By PostDet_PayID = By.xpath("(//input[@id='transactionId'])[3]");
	By PostDet_PostingRemarks = By.xpath("//input[@id='paymentPostingBillingRemarks']");
	By PostDet_InvoiceID = By.xpath("//input[@id='paymentPostingInvoiceID']");
	By PostDet_OR = By.xpath("//input[@id='orNumber']");

	;
	// Activation details
	By Activationdetails = By.xpath("//label[contains(text(),'ACTIVATION DETAILS')]");
	By ActivationChannel = By.xpath("//label[contains(text(),'Channel')]");
	By Channel_input = By.xpath("//input[@id='channel']");
	By Dateofactivation = By.xpath("(//label[contains(text(),'Date of Activation')])[1]");
	By Dateofactivation_input = By.xpath("//input[@id='dateOfActivation']");
	By Time = By.xpath("(//label[contains(text(),'Time')])[1]");
	By Time_input = By.xpath("//input[@id='timeOfActivation']");

	// After Sale
	By Aftersale = By.xpath("(//label[contains(text(),' AFTERSALES ')])[1]");
	// OrderHistory
	By OrderHistory = By.xpath("(//label[contains(text(),' ORDER HISTORY ')])[1]");
	By Backbutton = By.xpath("(//span[contains(text(),'Back')])");
	By Savebutton = By.xpath("(//span[contains(text(),'Save')])");

	// RefundDetails
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
	By Remarks_input = By.xpath("(//select[@id='remarks'])[2]");
	By RefundReference = By.xpath("(//label[contains(text(),'Refund Reference')])[1]");
	By RefundReference_input = By.xpath("(//input[@id='refundReference'])");

	// ORDER HISTORY
	By orderh = By.xpath("//label[contains(text(),' ORDER HISTORY ')]");
	By OrderReceived = By.xpath("//div[contains(text(), 'Order Received')]");
	By AutomaticUpdate = By.xpath("//span[contains(text(), 'Automatic Update')]");
	By DateOrder = By.xpath("(//div[@style='font-style: iStalic; color: #999999;'])[1]");
	By Primarydetails = By.xpath(" //label[@class='form-control-label font-weight-bold text-primary']");
	By confirmcorrect = By.xpath("//span[contains(text(),'Confirm Correct')]");

	// Assign to GOt agent

	By Checkbox = By.xpath("(//input[@type='checkbox'])[4]");
	By Assign_Checkbox = By.xpath("(//input[@name='assigneeMode'])[1]");
	By SelectAdmin = By.xpath("(//input[@id='typeahead-basic'])[1]");
	By SelectFSO = By.xpath("(//ngb-highlight[contains(text(),'AGENT OMT, TCOE FSOTD,  - ')])[1]");
	By Assign_btn = By.xpath("(//button[contains(text(),'Assign')])");
	public By TimeStamp=By.xpath("(//th[text()='Date Submitted']//following::td//following::ngb-highlight)[1]");

	/**********************************
	 * Clicking on Headers
	 ****************************************************************/
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
	public WebElement get_ClickPortingStatus() {
		return DriverManager.getDriver().findElement(ClickPortingStatus);
	}
	/********************************************************************************************************************************/
	public WebElement get_RemoveButton() {
		return DriverManager.getDriver().findElement(RemoveButton);
	}

	/********************************************************************************************************************************/
	public WebElement get_AssigneRdBtn() {
		return DriverManager.getDriver().findElement(AssigneRdBtn);
	}

	public WebElement get_Customerdetails() {
		return DriverManager.getDriver().findElement(Customerdetails);
	}

	/****************************************************************/
	public WebElement get_SearchField() {
		return DriverManager.getDriver().findElement(SearchField);
	}

	/****************************************************************/
	public WebElement get_Checkoutmethod() {
		return DriverManager.getDriver().findElement(Checkoutmethod);
	}

	/****************************************************************/
	public WebElement get_Giveasagift() {
		return DriverManager.getDriver().findElement(Giveasagift);
	}

	/********************************************************************************************************************************/
	public WebElement get_ReceipentDetails() {
		return DriverManager.getDriver().findElement(ReceipentDetails);
	}

	/********************************************************************************************************************************/
	public WebElement get_Village_input() {
		return DriverManager.getDriver().findElement(Village_input);
	}

	/********************************************************************************************************************************/
	public WebElement get_Barangay_input() {
		return DriverManager.getDriver().findElement(Barangay_input);
	}

	/********************************************************************************************************************************/
	public WebElement get_Province_input() {
		return DriverManager.getDriver().findElement(Province_input);
	}

	/********************************************************************************************************************************/
	public WebElement get_House_input() {
		return DriverManager.getDriver().findElement(House_input);
	}

	/********************************************************************************************************************************/
	public WebElement get_Street_input() {
		return DriverManager.getDriver().findElement(Street_input);
	}

	/********************************************************************************************************************************/
	public WebElement get_Zipcode_input() {
		return DriverManager.getDriver().findElement(Zipcode_input);
	}

	/********************************************************************************************************************************/
	public WebElement get_Dashboard_PRODUCTAvailed() {
		return DriverManager.getDriver().findElement(Dashboard_PRODUCTAvailed);
	}

	/********************************************************************************************************************************/
	public WebElement get_Latitude_input() {
		return DriverManager.getDriver().findElement(Latitude_input);
	}

	/********************************************************************************************************************************/
	public WebElement get_Longitude_input() {
		return DriverManager.getDriver().findElement(Longitude_input);
	}

	/********************************************************************************************************************************/
	public WebElement get_City_input() {
		return DriverManager.getDriver().findElement(City_input);
	}

	/********************************************************************************************************************************/
	public WebElement get_privacyAccept() {
		return DriverManager.getDriver().findElement(privacyAccept);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_AssignRdBtn() {
		return DriverManager.getDriver().findElement(AssignRdBtn);
	}
	/********************************************************************************************************************************/
	public WebElement get_PortingReqIdInput() {
		return DriverManager.getDriver().findElement(PortingReqIdInput);
	}
	
	

	/********************************************************************************************************************************/
	public boolean isElementExist(String message, String element, int waitTime) {
		boolean flag = false;

		switch (element) {
		case "SearchField":
			flag = waitForElementVisibility(SearchField, waitTime);
			break;		
		case "Savebutton":
			flag = waitForElementVisibility(Savebutton, waitTime);
			break;
		case "Backbutton":
			flag = waitForElementVisibility(Backbutton, waitTime);
			break;		
		case "Dashboard_PRODUCTAvailed":
			flag = waitForElementVisibility(Dashboard_PRODUCTAvailed, waitTime);
			break;
		case "OrderIDResult":
			flag = waitForElementVisibility(OrderIDResult, waitTime);
			break;
		case "ReviewSubmittedForm":
			flag = waitForElementVisibility(ReviewSubmittedForm, waitTime);
			break;
		case "AwaitingBSS":
			flag = waitForElementVisibility(AwaitingBSS, waitTime);
			break;
		case "OrderReceivedStatus":
			flag = waitForElementVisibility(OrderReceivedStatus, waitTime);
			break;
		// customer details
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
		// Recipentdetails
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

		// AddressDetails
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
		// Orderdetails
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
//				case "Deliverycasetitle":
//					flag = waitForElementVisibility(Deliverycasetitle, waitTime);
//					break;
//				case "Deliverycasetitle_input":
//					flag = waitForElementVisibility(Deliverycasetitle_input, waitTime);
//					break;
//				case "Deliveryqueuename":
//					flag = waitForElementVisibility(Deliveryqueuename, waitTime);
//					break;
//				case "Deliveryqueuename_input":
//					flag = waitForElementVisibility(Deliveryqueuename_input, waitTime);
//					break;
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

		// Mobile Porting Details
		case "MNPDetails":
			flag = waitForElementVisibility(MNPDetails, waitTime);
			break;
		case "USClabel":
			flag = waitForElementVisibility(USClabel, waitTime);
			break;
		case "USCinput":
			flag = waitForElementVisibility(USCinput, waitTime);
			break;
		case "Porting":
			flag = waitForElementVisibility(Porting, waitTime);
			break;
		case "PortingReqStatus":
			flag = waitForElementVisibility(PortingReqStatus, waitTime);
			break;
		case "PortingReqId":
			flag = waitForElementVisibility(PortingReqId, waitTime);
			break;
		case "PortingReqIdInput":
			flag = waitForElementVisibility(PortingReqIdInput, waitTime);
			break;
			
		// Payment Details
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

		// Fullfilmentdetails
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

		// RefundDetails
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

		// Activationdetails
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
		// After Sale
		case "Aftersale":
			flag = waitForElementVisibility(Aftersale, waitTime);
			break;
		// OrderHistory
		case "OrderHistory":
			flag = waitForElementVisibility(OrderHistory, waitTime);
			break;
		case "ViewBtn":
			flag = waitForElementVisibility(ViewBtn, waitTime);
			break;
		case "EditBtn":
			flag = waitForElementVisibility(EditBtn, waitTime);
			break;
			
			
		}

		if (flag) {
			// ExtentTestManager.logInfo(message + " - exists");
			System.out.println(message + " - exists");
		} else {
			// ExtentTestManager.logFail(message + " - do not exists");
			System.out.println(message + " - do not exist");
		}

		return flag;
	}

	public void clickOnElement(String type, String eleName, String ele) {

		try {
			switch (ele) {
			case "SigninBtn":
				get_SigninBtn().click();
				break;
			case "Save":
				get_Save().click();
				break;
			case "Entities":
				get_Entities().click();
				break;
			case "AppEntry":
				get_AppEntry().click();
				break;
			case "Edit":
				get_Edit().click();
				break;
			case "MNPDetails":
				get_MNPDetails().click();
				break;
			case "USCinput":
				get_USCinput().click();
				break;
			case "PortingReqStatus":
				get_PortingReqStatus().click();
				break;
			case "SelectGOTS":
				get_SelectGOTS().click();
				break;
			case "Assign_btn":
				get_Assign_btn().click();
				break;
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
			case "ApplicationEntry":
				get_ApplicationEntry().click();
				break;
			case "SearchError":
				get_SearchError().click();
				break;
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

	/********************************************************************************************************************************/
	public WebElement get_AccountMenu() {
		return DriverManager.getDriver().findElement(AccountMenu);
	}

	/********************************************************************************************************************************/
	public WebElement get_SearchError() {
		return DriverManager.getDriver().findElement(SearchError);
	}

	/********************************************************************************************************************************/
	public WebElement get_SigninBtn() {
		return DriverManager.getDriver().findElement(SigninBtn);
	}

	/********************************************************************************************************************************/
	public WebElement get_Save() {
		return DriverManager.getDriver().findElement(Save);
	}

	/********************************************************************************************************************************/
	public WebElement get_Entities() {
		return DriverManager.getDriver().findElement(Entities);
	}

	/********************************************************************************************************************************/
	public WebElement get_AppEntry() {
		return DriverManager.getDriver().findElement(AppEntry);
	}

	/********************************************************************************************************************************/
	public WebElement get_Edit() {
		return DriverManager.getDriver().findElement(Edit);
	}
//	/********************************************************************************************************************************/
//	public WebElement get_MNPDetails() {
//		return DriverManager.getDriver().findElement(MNPDetails);
//	}

	/*******************************
	 * Sign In and Sign Out
	 ******************************************************************/

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

	/********************************************************************************************************************************/
	public WebElement get_ApplicationEntry() {
		return DriverManager.getDriver().findElement(ApplicationEntry);
	}

	/********************************************************************************************************************************/
	public WebElement get_View() {
		return DriverManager.getDriver().findElement(View);
	}
	/********************************************************************************************************************************/
	public WebElement get_ViewBtn() {
		return DriverManager.getDriver().findElement(ViewBtn);
	}

	/********************************************************************************************************************************/
	public WebElement get_EditBtn() {
		return DriverManager.getDriver().findElement(EditBtn);
	}

	/********************************************************************************************************************************/
	public void implicitWait() {
		DriverManager.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	/********************************************************************************************************************************/
	public WebElement get_Confirmcorrect() {
		return DriverManager.getDriver().findElement(Confirmcorrect);
	}

	// -----DASHBOARD-----
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
	public WebElement get_Dashboard_PlanAvailed() {
		return DriverManager.getDriver().findElement(Dashboard_PlanAvailed);
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

	// CustomerDetails
	/*********************************
	 * CustomerDetails
	 **************************************************************************/
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

//		Receipent Details
	/********************************************************************************************************************************/
	public WebElement get_NameofRecipent_input() {
		return DriverManager.getDriver().findElement(NameofRecipent_input);
	}

	/********************************************************************************************************************************/
	public WebElement get_MobilenumberofRecipent_input() {
		return DriverManager.getDriver().findElement(MobilenumberofRecipent_input);
	}

	/********************************************************************************************************************************/
	// ORDER DEAILS
	public WebElement get_Orderdetails() {
		return DriverManager.getDriver().findElement(Orderdetails);
	}

	/********************************************************************************************************************************/
	public WebElement get_Quantity_input() {
		return DriverManager.getDriver().findElement(Quantity_input);
	}

	/********************************************************************************************************************************/
	public WebElement get_Producttype_input() {
		return DriverManager.getDriver().findElement(Producttype_input);
	}

	/********************************************************************************************************************************/
	public WebElement get_Sku_input() {
		return DriverManager.getDriver().findElement(Sku_input);
	}

	/********************************************************************************************************************************/
	public WebElement get_Matcode_input() {
		return DriverManager.getDriver().findElement(Matcode_input);
	}

	/********************************************************************************************************************************/
	public WebElement get_BSSCasenumber_input() {
		return DriverManager.getDriver().findElement(BSSCasenumber_input);
	}

	/********************************************************************************************************************************/
	public WebElement get_Reservationid_input() {
		return DriverManager.getDriver().findElement(Reservationid_input);
	}

	/********************************************************************************************************************************/
	public WebElement get_Modemserial_input() {
		return DriverManager.getDriver().findElement(Modemserial_input);
	}

	/********************************************************************************************************************************/
	public WebElement get_Simserial_input() {
		return DriverManager.getDriver().findElement(Simserial_input);
	}

	/********************************************************************************************************************************/
	public WebElement get_Addressdetails() {
		return DriverManager.getDriver().findElement(Addressdetails);
	}

	/********************************************************************************************************************************/
//		public WebElement get_Deliverycasetitle_input() {
//			return DriverManager.getDriver().findElement(Deliverycasetitle_input);
//		}
//		public WebElement get_Deliveryqueuename_input() {
//			return DriverManager.getDriver().findElement(Deliveryqueuename_input);
//		}
	public WebElement get_Promocode_input() {
		return DriverManager.getDriver().findElement(Promocode_input);
	}

	/********************************************************************************************************************************/
	public WebElement get_Discount_input() {
		return DriverManager.getDriver().findElement(Discount_input);
	}

	/********************************************************************************************************************************/
	public WebElement get_Projectname_input() {
		return DriverManager.getDriver().findElement(Projectname_input);
	}

	/********************************************************************************************************************************/
//		Mobile Portind details
	public WebElement get_MNPDetails() {
		return DriverManager.getDriver().findElement(MNPDetails);
	}

	/********************************************************************************************************************************/
	public WebElement get_USCinput() {
		return DriverManager.getDriver().findElement(USCinput);
	}

	/********************************************************************************************************************************/
	public WebElement get_PortingReqStatus() {
		return DriverManager.getDriver().findElement(PortingReqStatus);
	}

	/********************************************************************************************************************************/
	public WebElement get_Transaction_PortingReqId() {
		return DriverManager.getDriver().findElement(PortingReqId);
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
	public WebElement get_Remark() {
		return DriverManager.getDriver().findElement(Remarks);
	}

	/********************************************************************************************************************************/
	public WebElement get_Addnewrowbutton() {
		return DriverManager.getDriver().findElement(Addnewrowbutton);
	}

	/********************************************************************************************************************************/
//	Refund Details
	public WebElement get_RefundDetails() {
		return DriverManager.getDriver().findElement(RefundDetails);
	}

	/********************************************************************************************************************************/
	public WebElement get_RefundRequestdate_input() {
		return DriverManager.getDriver().findElement(RefundRequestdate_input);
	}

	/********************************************************************************************************************************/
	public WebElement get_ValidamountofRefund_input() {
		return DriverManager.getDriver().findElement(ValidamountofRefund_input);
	}

	/********************************************************************************************************************************/
	public WebElement get_Cardnumber_input() {
		return DriverManager.getDriver().findElement(Cardnumber_input);
	}

	/********************************************************************************************************************************/
	public WebElement get_Accountname_input() {
		return DriverManager.getDriver().findElement(Accountname_input);
	}

	/********************************************************************************************************************************/
	public WebElement get_Authorization_input() {
		return DriverManager.getDriver().findElement(Authorization_input);
	}

	/********************************************************************************************************************************/
	public WebElement get_IssuingBank_input() {
		return DriverManager.getDriver().findElement(IssuingBank_input);
	}

	/********************************************************************************************************************************/
	public WebElement get_Remarks_input() {
		return DriverManager.getDriver().findElement(Remarks_input);
	}

	/********************************************************************************************************************************/

	public WebElement get_Remarks_Refund() {
		return DriverManager.getDriver().findElement(Remarks_Refund);
	}

	/********************************************************************************************************************************/
	public WebElement get_RefundReference_input() {
		return DriverManager.getDriver().findElement(RefundReference_input);
	}

	/********************************************************************************************************************************/

//	ACTIVATION DETAILS
	public WebElement get_Activationdetails() {
		return DriverManager.getDriver().findElement(Activationdetails);
	}

	/********************************************************************************************************************************/
	public WebElement get_Channel_input() {
		return DriverManager.getDriver().findElement(Channel_input);
	}

	/********************************************************************************************************************************/
	public WebElement get_Dateofactivation_input() {
		return DriverManager.getDriver().findElement(Dateofactivation_input);
	}

	/********************************************************************************************************************************/
	public WebElement get_Time_input() {
		return DriverManager.getDriver().findElement(Time_input);
	}

	/********************************************************************************************************************************/

//	Order Details	
	public WebElement get_OrderHistory() {
		return DriverManager.getDriver().findElement(OrderHistory);
	}

	/********************************************************************************************************************************/
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
	// Disposition Status
	/********************************
	 * Disposition Status
	 ************************************************************************/
	/********************************************************************************************************************************/
	public WebElement get_OrderRecevied() {
		return DriverManager.getDriver().findElement(OrderRecevied);
	}

	/********************************************************************************************************************************/
	public WebElement get_DispositionStatus() {
		return DriverManager.getDriver().findElement(DispositionStatus);
	}

	/********************************************************************************************************************************/
	public WebElement get_SelectAdmin() {
		return DriverManager.getDriver().findElement(SelectAdmin);
	}

	/********************************************************************************************************************************/
	public WebElement get_SelectGOTS() {
		return DriverManager.getDriver().findElement(SelectGOTS);
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
	public WebElement get_Assign_btn() {
		return DriverManager.getDriver().findElement(Assign_btn);
	}

//		Awaitingbss CheckigMNPStatus PortingFailed PortingUnderView   OrderRecevied		
	/********************************************************************************************************************************/

	/********************************************************************************************************************************/
	public WebElement get_Awaitingbss() {
		return DriverManager.getDriver().findElement(Awaitingbss);
	}

	/********************************************************************************************************************************/
	public WebElement get_CheckigMNPStatus() {
		return DriverManager.getDriver().findElement(CheckigMNPStatus);
	}

	/********************************************************************************************************************************/
	public WebElement get_PortingFailed() {
		return DriverManager.getDriver().findElement(PortingFailed);
	}

	/********************************************************************************************************************************/
	public WebElement get_PortingUnderView() {
		return DriverManager.getDriver().findElement(PortingUnderView);
	}

//		/********************************************************************************************************************************/
//		
//		public WebElement get_Primary_Nationality() {
//			return DriverManager.getDriver().findElement(Primary_Nationality);
//		}
//		/********************************************************************************************************************************/
//		public WebElement get_Primary_FullMothersname() {
//			return DriverManager.getDriver().findElement(Primary_FullMothersname);
//		}

	// ------------ PRIMARY CUSTOMER DETAILS --------------
	/********************************************************************************************************************************/
	public WebElement get_PrimarySameasbilling() {
		return DriverManager.getDriver().findElement(PrimarySameasbilling);
	}

	/********************************************************************************************************************************/
	public WebElement get_OMT_OrderID() {
		return DriverManager.getDriver().findElement(OMT_OrderID);
	}

	/********************************************************************************************************************************/
	public WebElement get_OMT_OrderType() {
		return DriverManager.getDriver().findElement(OMT_OrderType);
	}

	/********************************************************************************************************************************/
	public WebElement get_OMT_orderSubType() {
		return DriverManager.getDriver().findElement(OMT_orderSubType);
	}

	/********************************************************************************************************************************/
	public WebElement get_OMT_CustomerType() {
		return DriverManager.getDriver().findElement(OMT_CustomerType);
	}
	/********************************************************************************************************************************/

//		public WebElement get_OMT_acquiTypee() {
//			return DriverManager.getDriver().findElement(OMT_acquiType);
//		}
	/********************************************************************************************************************************/

//		public WebElement get_OMT_TransacType() {
//			return DriverManager.getDriver().findElement(OMT_TransacType);
//		}
	/********************************************************************************************************************************/
	public WebElement get_OMT_Disposition() {
		return DriverManager.getDriver().findElement(OMT_Disposition);
	}

	/********************************************************************************************************************************/
	public WebElement get_OMT_Dispo_Reason() {
		return DriverManager.getDriver().findElement(OMT_Dispo_Reason);
	}

	/********************************************************************************************************************************/
	public WebElement get_Primary_Fname() {
		return DriverManager.getDriver().findElement(Primary_Fname);
	}

	/********************************************************************************************************************************/
	public WebElement get_Primary_MName() {
		return DriverManager.getDriver().findElement(Primary_MName);
	}

	/********************************************************************************************************************************/
	public WebElement get_Primary_LName() {
		return DriverManager.getDriver().findElement(Primary_LName);
	}

	/********************************************************************************************************************************/
	public WebElement get_Primary_MobNum() {
		return DriverManager.getDriver().findElement(Primary_MobNum);
	}

	/********************************************************************************************************************************/
	public WebElement get_Primary_Email() {
		return DriverManager.getDriver().findElement(Primary_Email);
	}

	/********************************************************************************************************************************/
	public WebElement get_Primary_Bday() {
		return DriverManager.getDriver().findElement(Primary_Bday);
	}

	/********************************************************************************************************************************/
	public WebElement get_Primary_Gender() {
		return DriverManager.getDriver().findElement(Primary_Gender);
	}

	/********************************************************************************************************************************/
	public WebElement get_Primary_Nationality() {
		return DriverManager.getDriver().findElement(Primary_Nationality);
	}

	/********************************************************************************************************************************/
	public WebElement get_Primary_FullMothersname() {
		return DriverManager.getDriver().findElement(Primary_FullMothersname);
	}

	// +++++ Recepient Details +++++
	/********************************************************************************************************************************/
	public WebElement get_Primary_RecipientName() {
		return DriverManager.getDriver().findElement(Primary_RecipientName);
	}

	/********************************************************************************************************************************/
	public WebElement get_Primary_RecipientMobNum() {
		return DriverManager.getDriver().findElement(Primary_RecipientMobNum);
	}

	// +++++++++++++++ REGISTERED ADDRESS +++++++++++++++++++++
	/********************************************************************************************************************************/
	public WebElement get_PrimaryRegAdd_HouseRbtn() {
		return DriverManager.getDriver().findElement(PrimaryRegAdd_HouseRbtn);
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

	// +++++++++++++++ SHIPPING ADDRESS +++++++++++++++++++++
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

	/********************************************************************************************************************************/

	// ORDER DETAILS

	/********************************************************************************************************************************/
	public WebElement get_BSSOrderID() {
		return DriverManager.getDriver().findElement(BSSOrderID);
	}

	/********************************************************************************************************************************/
	public WebElement get_BSSOrderCaseID() {
		return DriverManager.getDriver().findElement(BSSOrderCaseID);
	}

	/********************************************************************************************************************************/
	public WebElement get_NewMobileNumber() {
		return DriverManager.getDriver().findElement(NewMobileNumber);
	}

	/********************************************************************************************************************************/
	public WebElement get_DeliveryCaseTitle() {
		return DriverManager.getDriver().findElement(DeliveryCaseTitle);
	}

	/********************************************************************************************************************************/
	public WebElement get_DeliveryQueueName() {
		return DriverManager.getDriver().findElement(DeliveryQueueName);
	}

	/********************************************************************************************************************************/
	public WebElement get_ProdType() {
		return DriverManager.getDriver().findElement(ProdType);
	}

	/********************************************************************************************************************************/
	public WebElement get_NewPlan() {
		return DriverManager.getDriver().findElement(NewPlan);
	}

	/********************************************************************************************************************************/
	public WebElement get_Data() {
		return DriverManager.getDriver().findElement(Data);
	}

	/********************************************************************************************************************************/
	public WebElement get_Lockup() {
		return DriverManager.getDriver().findElement(Lockup);
	}

	/********************************************************************************************************************************/
	public WebElement get_PlanInclusions() {
		return DriverManager.getDriver().findElement(PlanInclusions);
	}

	/********************************************************************************************************************************/
	public WebElement get_PaidAddOns() {
		return DriverManager.getDriver().findElement(PaidAddOns);
	}

	/********************************************************************************************************************************/
	public WebElement get_item1() {
		return DriverManager.getDriver().findElement(item1);
	}

	/********************************************************************************************************************************/
	public WebElement get_SKU1() {
		return DriverManager.getDriver().findElement(SKU1);
	}

	/********************************************************************************************************************************/
	public WebElement get_Matcode1() {
		return DriverManager.getDriver().findElement(Matcode1);
	}

	/********************************************************************************************************************************/
	public WebElement get_Serial1() {
		return DriverManager.getDriver().findElement(Serial1);
	}

	/********************************************************************************************************************************/
	public WebElement get_Sloc1() {
		return DriverManager.getDriver().findElement(Sloc1);
	}

	/********************************************************************************************************************************/
	public WebElement get_item2() {
		return DriverManager.getDriver().findElement(item2);
	}

	/********************************************************************************************************************************/
	public WebElement get_SKU2() {
		return DriverManager.getDriver().findElement(SKU2);
	}

	/********************************************************************************************************************************/
	public WebElement get_Matcode2() {
		return DriverManager.getDriver().findElement(Matcode2);
	}

	/********************************************************************************************************************************/
	public WebElement get_Sloc2() {
		return DriverManager.getDriver().findElement(Sloc2);
	}

	/********************************************************************************************************************************/
	public WebElement get_Serial2() {
		return DriverManager.getDriver().findElement(Serial2);
	}

	/********************************************************************************************************************************/
	public WebElement get_ReservationID() {
		return DriverManager.getDriver().findElement(ReservationID);
	}

	/********************************************************************************************************************************/
	public WebElement get_Promocode() {
		return DriverManager.getDriver().findElement(Promocode);
	}

	/********************************************************************************************************************************/
	public WebElement get_PromoDiscount() {
		return DriverManager.getDriver().findElement(PromoDiscount);
	}

	/********************************************************************************************************************************/
	public WebElement get_ProjectName() {
		return DriverManager.getDriver().findElement(ProjectName);
	}

	/********************************************************************************************************************************/
	public WebElement get_Channel() {
		return DriverManager.getDriver().findElement(Channel);
	}

	/********************************************************************************************************************************/
	public WebElement get_SalesmanID() {
		return DriverManager.getDriver().findElement(SalesmanID);
	}

	// PAYMENT DETAILS
	/********************************************************************************************************************************/
	public WebElement get_DevCashout() {
		return DriverManager.getDriver().findElement(DevCashout);
	}

	/********************************************************************************************************************************/
	public WebElement get_DevCashout_Account() {
		return DriverManager.getDriver().findElement(DevCashout_Account);
	}

	/********************************************************************************************************************************/
	public WebElement get_DevCashout_AmountDue() {
		return DriverManager.getDriver().findElement(DevCashout_AmountDue);
	}

	/********************************************************************************************************************************/
	public WebElement get_DevCashout_PaymentID() {
		return DriverManager.getDriver().findElement(DevCashout_PaymentID);
	}

	/********************************************************************************************************************************/
	public WebElement get_PTF() {
		return DriverManager.getDriver().findElement(PTF);
	}

	/********************************************************************************************************************************/
	public WebElement get_PTF_Account() {
		return DriverManager.getDriver().findElement(PTF_Account);
	}

	/********************************************************************************************************************************/
	public WebElement get_PTF_AmountDue() {
		return DriverManager.getDriver().findElement(PTF_AmountDue);
	}

	/********************************************************************************************************************************/
	public WebElement get_PTF_PaymentId() {
		return DriverManager.getDriver().findElement(PTF_PaymentId);
	}

	/********************************************************************************************************************************/
	public WebElement get_ReqPay_PayMethod() {
		return DriverManager.getDriver().findElement(ReqPay_PayMethod);
	}

	/********************************************************************************************************************************/
	public WebElement get_ReqPay_TotalAmount() {
		return DriverManager.getDriver().findElement(ReqPay_TotalAmount);
	}

	/********************************************************************************************************************************/
	public WebElement get_ReqPay_PaymentMethod() {
		return DriverManager.getDriver().findElement(ReqPay_PaymentMethod);
	}

	/********************************************************************************************************************************/
	public WebElement get_ReqPay_DateLinkSeeding() {
		return DriverManager.getDriver().findElement(ReqPay_DateLinkSeeding);
	}

	/********************************************************************************************************************************/
	public WebElement get_ReqPay_PayReference() {
		return DriverManager.getDriver().findElement(ReqPay_PayReference);
	}

	/********************************************************************************************************************************/
	public WebElement get_ReqPay_StatusPayment() {
		return DriverManager.getDriver().findElement(ReqPay_StatusPayment);
	}

	/********************************************************************************************************************************/
	public WebElement get_PostDet_TransacDate() {
		return DriverManager.getDriver().findElement(PostDet_TransacDate);
	}

	/********************************************************************************************************************************/
	public WebElement get_PostDet_PayID() {
		return DriverManager.getDriver().findElement(PostDet_PayID);
	}

	/********************************************************************************************************************************/
	public WebElement get_PostDet_PostingRemarks() {
		return DriverManager.getDriver().findElement(PostDet_PostingRemarks);
	}

	/********************************************************************************************************************************/
	public WebElement get_PostDet_InvoiceID() {
		return DriverManager.getDriver().findElement(PostDet_InvoiceID);
	}

	/********************************************************************************************************************************/
	public WebElement get_PostDet_OR() {
		return DriverManager.getDriver().findElement(PostDet_OR);
	}

	// FULFILLMENT DETAILS
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

//		/********************************************************************************************************************************/
//		public WebElement get_FulfillDet_PickupHub() {
//			return DriverManager.getDriver().findElement(FulfillDet_PickupHub);
//		}
	/********************************************************************************************************************************/
	public WebElement get_PortingReqStatusPendig() {
		return DriverManager.getDriver().findElement(PortingReqStatusPendig);
	}

	/********************************************************************************************************************************/
	public WebElement get_PortingReqStatusSuccess() {
		return DriverManager.getDriver().findElement(PortingReqStatusSuccess);
	}

	/********************************************************************************************************************************/
	public WebElement get_PortingReqStatusFailed() {
		return DriverManager.getDriver().findElement(PortingReqStatusFailed);
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
	public WebElement get_FulfillDet_Schedule() {
		return DriverManager.getDriver().findElement(FulfillDet_Schedule);
	}

	/********************************************************************************************************************************/
	public WebElement get_FulfillDet_Status() {
		return DriverManager.getDriver().findElement(FulfillDet_Status);
	}

	/********************************************************************************************************************************/
	public WebElement get_FulfillDet_Remarks() {
		return DriverManager.getDriver().findElement(FulfillDet_Remarks);
	}

	public void select_get_FulfillDet_Status(String option) {
		Select s = new Select(DriverManager.getDriver().findElement(FulfillDet_Status));
		s.selectByVisibleText(option);
	}

	public void select_FulfillDet_Remarks(String option) {
		Select s = new Select(DriverManager.getDriver().findElement(FulfillDet_Remarks));
		s.selectByVisibleText(option);
	}

	/********************************************************************************************************/
	public WebElement get_Remarks() {
		return DriverManager.getDriver().findElement(Remarks);
	}

	public WebElement get_RefundReference() {
		return DriverManager.getDriver().findElement(RefundReference);
	}

	/*******************************************************************************/
	// ORDER HISTORY
	public WebElement get_OrderReceived() {
		return DriverManager.getDriver().findElement(OrderReceived);
	}

	public WebElement get_AutomaticUpdate() {
		return DriverManager.getDriver().findElement(AutomaticUpdate);
	}

	public WebElement get_DateOrder() {
		return DriverManager.getDriver().findElement(DateOrder);
	}

	/********************************************************************************************************************************/
	public boolean isClickable(String element, int waitTime) {

		boolean flag = false;

		switch (element) {
		case "Primarydetails":
			flag = waitForElementClickable(Primarydetails, waitTime);
			break;

		}

		return flag;
	}

	/********************************************************************************************************************************/
	public void moveToElement(String element) {

		WebElement ele = null;

		switch (element) {

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
	public void select_Dropdown(String option) {
		Select s = new Select(DriverManager.getDriver().findElement(PortingReqStatus));
		s.selectByValue(option);
	}

	/********************************************************************************************************************************/

	public void select_PortingReqStatusPendig(String option) {
		Select s = new Select(DriverManager.getDriver().findElement(PortingReqStatusPendig));
		s.selectByVisibleText(option);
	}

	/********************************************************************************************************************************/

	/********************************************************************************************************************************/

	public void select_PortingReqStatusSuccess(String option) {
		Select s = new Select(DriverManager.getDriver().findElement(ClickPortingStatus));
		s.selectByVisibleText(option);
		
	}

	/********************************************************************************************************************************/
	/********************************************************************************************************************************/

	public void select_PortingReqStatusFailed(String option) {
		Select s = new Select(DriverManager.getDriver().findElement(PortingReqStatusFailed));
		s.selectByVisibleText(option);
	}
	/********************************************************************************************************************************/
//	public void select_DispositionStatus(String option) {
//		Select s = new Select(DriverManager.getDriver().findElement(DispositionStatus));
//		s.selectByVisibleText(option);
//	}

	/********************************************************************************************************************************/
	public void scroll_vertical(int y_Axis) {
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("window.scrollBy(0," + y_Axis + ")", "");
	}

	/********************************************************************************************************************************/
	public void javascript_clickOnElement(WebElement ele) {
		JavascriptExecutor executor = (JavascriptExecutor) DriverManager.getDriver();
		executor.executeScript("arguments[0].click();", ele);
	}

	// *********************************SElect Disposition
	// Status*****************************************
	/********************************************************************************************************************************/
	public void select_DispositionStatus(String option) {
		Select s = new Select(DriverManager.getDriver().findElement(DispositionStatus));
		s.selectByValue(option);
	}

	public void select_Awaitingbss(String option) {
		Select s = new Select(DriverManager.getDriver().findElement(Awaitingbss));
		s.selectByValue(option);
	}

	/********************************************************************************************************************************/
	public void select_CheckigMNPStatus(String option) {
		Select s = new Select(DriverManager.getDriver().findElement(CheckigMNPStatus));
		s.selectByValue(option);
	}

	/********************************************************************************************************************************/
	public void select_PortingFailed(String option) {
		Select s = new Select(DriverManager.getDriver().findElement(PortingFailed));
		s.selectByValue(option);
	}

	/********************************************************************************************************************************/
	public void select_PortingUnderView(String option) {
		Select s = new Select(DriverManager.getDriver().findElement(PortingUnderView));
		s.selectByValue(option);
	}

	/********************************************************************************************************************************/
	public void select_OrderRecevied(String option) {
		Select s = new Select(DriverManager.getDriver().findElement(OrderRecevied));
		s.selectByValue(option);
	}
	/********************************************************************************************************************************/
//		public void select_Recieved(String option) {
//			Select s = new Select(DriverManager.getDriver().findElement(Recieved));
//			s.selectByValue(option);
//		}
}
