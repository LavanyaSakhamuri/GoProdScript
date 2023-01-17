package com.pages.omt;
import java.util.NoSuchElementException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import globeOnline_CommonMethods.DriverManager;
//import globeOnline_OMT.$missing$;

public class ACQUI_omt_page extends BasePage{
	By Entities=By.xpath("//span[text()=' Entities ']");
	By SignIn_Btn=By.xpath("//input[@value='Sign in']");
	By SearchBtn=By.xpath("//button[text()='Search']");
	By AppEntry=By.xpath("//span[text()='Application Entry']");
	By Verify_Btn=By.xpath("//input[@type='submit' or @value='Verify']");
 By Next=By.xpath("//input[@type='submit' or @value='Next']");
	By OKTA_SSO_Btn=By.xpath("//button[text()=' Log in with OKTA SSO']");
	By AccountBtn = By.xpath("//span[contains(text(), 'Account')]");
	By SignInBtn = By.xpath("//span[contains(text(), 'Sign in')]");
	By LoginUsername = By.xpath("//input[@id='username']");
	By LoginPassword = By.xpath("//input[@id='password']");
	By LoginBtn = By.xpath("//button[contains(text(), 'Sign in')]");
	By EntitiesBtn = By.xpath("//span[contains(text(), ' Entities ')]");
	By AppllEntryBtn = By.xpath("//span[contains(text(), 'Application Entry')]");
	By SearchField = By.xpath("//input[@name='searchTerm']");
	By SearchError = By.xpath("//h6[contains(text(), 'No results found')]");
	By fCheckbox = By.xpath("(//input[@type='checkbox'])[1]");
	By ViewBtn = By.xpath("//span[contains(text(), 'View')]");
	By RadioAssignOrder=By.xpath("//input[@id='assignAppRB']");
	 By OrderCheckBox=By.xpath("//td//input[@type='checkbox']");
	 By RemoveAssignee=By.xpath("//span[text()='Remove Assignee']");
	 By RemoveButton=By.xpath("//button[text()='Remove']");
	 By RemoveAssigneeRdBtn=By.xpath("//input[@id='removeAppRB']");
	 By AssigneRdBtn=By.xpath("//input[@id='assignAppRB']");
	 By CheckBoxOrder=By.xpath("(//input[@ng-reflect-model='true'])[1]");
	 By CheckBoxOrder1=By.xpath("(//input[@ng-reflect-model='false'])[1]");
By RemoveMsg=By.xpath("//Pre[contains(text(),'Successfully') or contains(text(),'Removing')]");
	public By Select_Admin=By.xpath("//input[@id='typeahead-basic']");
	By EditBtn = By.xpath("(//button[@class='btn btn-primary btn-sm btn-block mb-1'])[1]");
			//button[@class='btn btn-primary btn-sm btn-block mb-1']");
			//button[@class='btn btn-primary btn-sm btn-block mb-1']");//monitor
			//span[contains(text(), 'Edit')]");//tlagent
	By DownloadBtn = By.xpath("//span[contains(text(), 'Download')]");
	public By DispositionStatus=By.xpath("(//th[text()='Disposition Status']//following::td//following::ngb-highlight)[6]");
	public By TimeStamp=By.xpath("(//th[text()='Date Submitted']//following::td//following::ngb-highlight)[1]");
public By ReferenceNumb=By.xpath("(//th[text()='Reference Number']//following::td//following::ngb-highlight)[2]");
public By OMT_MobileNumb=By.xpath("//input[@id='mobileNumber']");
	
	By Dashboard_DateSubmitted = By.xpath("//td//ngb-highlight[contains(text(), '2023')]");
	By Dashboard_RefNum = By.xpath("//span[contains(text(), 'GLE')]");
	By Dashboard_LName = By.xpath("(//td//ngb-highlight)[3]");
	By Dashboard_FName = By.xpath("(//td//ngb-highlight)[4]");
	By Dashboard_PlanAvailed = By.xpath("//td//ngb-highlight[contains(text(), 'GPlan')]");
	By Dashboard_Dispo = By.xpath("(//td//ngb-highlight)[6]");
	By Dashboard_Reason = By.xpath("(//td//ngb-highlight)[7]");
	By Dashboard_Assignee = By.xpath("(//td//ngb-highlight)[8]");
	
	By OMT_OrderID = By.xpath("//h2[contains(text(), 'GLE-')]");
	By OMT_OrderType = By.xpath("//input[@id='orderType']");
	By OMT_orderSubType = By.xpath("//input[@id='orderSubType']");
	By OMT_acquiType = By.xpath("//input[@id='acquiType']");
	By OMT_TransacType = By.xpath("//input[@id='transactionType']");
	By OMT_Disposition = By.xpath("//select[@id='dispositionStatus']");
	By OMT_DispoReason = By.xpath("//select[@id='dispositionReason']");
	
	//PRIMARY CUSTOMER DETAILS
	By Customerdetails = By.xpath("//label[contains(text(),' CUSTOMER DETAILS ')]");
	By Primary_Fname = By.xpath("//input[@id='firstName']");
	By Primary_MName = By.xpath("//input[@id='middleName']");
	By Primary_LName = By.xpath("//input[@id='lastName']");
	By Primary_MobNum = By.xpath("//input[@id='mobileNumber']");
	By Primary_Email = By.xpath("//input[@id='emailAddress']");
	By Primary_Bday = By.xpath("//input[@id='birthday']");
	By Primary_Gender = By.xpath("//select[@name='gender']");
	By Primary_Nationality = By.xpath("//select[@name='citizenship']");
	By Primary_FullMothersname = By.xpath("//input[contains(@id,'MaidenName')]");
	//=========Authorized Contact Person========
	By Primary_RecipientName = By.xpath("//input[@id='authorizedRepresentativeName' or @id='nameOfRecipient']");
	By Primary_RecipientMobNum = By.xpath("//input[@id='authorizedRepresentativeNumber' or @id='mobileNoOfRecipient']");
	//=========Registered Address========
	By PrimaryRegAdd_HouseRbtn = By.xpath("//input[@name='houseOrCondo' and @value='House']");
	By PrimaryRegAdd_CondoRbtn = By.xpath("//input[@name='houseOrCondo' and @value='Condominium']");
	By PrimaryRegAdd_houseNo = By.xpath("//input[@name='houseNo']");
	By PrimaryRegAdd_Street = By.xpath("//input[@name='street']");
	By seeMoreBtn1 = By.xpath("(//div[text()=' See More '])[1]");
	By seeMoreBtn2 = By.xpath("(//div[text()=' See More '])[2]");
	By seeMoreBtn3 = By.xpath("(//div[text()=' See More '])[1]");
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
	
	//ACCOUNT CHECKING RESULTS
	By Accountcheck=By.xpath("//label[contains(text(),' ACCOUNT CHECKING RESULTS ')]");
	By CreditLimit = By.xpath("//input[@name='creditLimit']");
	By GMI = By.xpath("//input[@name='gmi']");
	By PrequalResult = By.xpath("//select[@name='prequal_result']");
	By CNDBResult = By.xpath("//select[@name='cndbresults']");
	By CSLResult = By.xpath("//select[@name='cslResult']");
	By Balance = By.xpath("(//select[@name='balance'])");
	By Account = By.xpath("//span[contains(text(),' Account ')]");
			//(//input[@formcontrolname='accountNumber'])");
	By Account_Signout = By.xpath("//span[contains(text(),'Sign out')]");
	By Account_Signin = By.xpath("//span[contains(text(),'Sign in')]");
	
	By AmountDue = By.xpath("(//input[@formcontrolname='amountDue'])");
	
	//ORDER DETAILS
	By orderdetails=By.xpath("//label[contains(text(),' ORDER DETAILS ')]");
	By BrandOrderDetails=By.xpath("//input[@id='newBrand']");
	By NewPlan=By.xpath("//input[@id='newPostpaidPlan']");
	
	
	
	By BSSOrderID = By.xpath("//input[@id='bssOrderId']");
	By BSSOrderCaseID = By.xpath("//input[@id='bssOrderCaseID']");
	By ReservationID_Update=By.xpath("//small[text()='Please update this field']");
	By NewMobileNumber = By.xpath("//input[@id='newMobileNumber']");
	By DeliveryCaseTitle = By.xpath("//input[@id='caseTitle']");
	By DeliveryQueueName = By.xpath("//input[@id='queueName']");
	By DeliveryCaseId=By.xpath("//input[@id='deliveryCaseId']");
	
	By ProdType = By.xpath("//input[@id='newBrand']");
	//By NewPlan = By.xpath("//input[@id='newPostpaidPlan']");
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
	
	//Promo Code Details
	By Promocode = By.xpath("//input[@name='voucherPromoCode']");
	By PromoDiscount = By.xpath("//input[@name='promoCodeDiscount']");
	By ProjectName = By.xpath("//input[@name='projectName']");
	//Order Tagging
	By Channel = By.xpath("//input[@name='dafSource']");
	By SalesmanID = By.xpath("//input[@name='salesmanId']");
	public By KeepMeSignedIn=By.xpath("//input[@name='rememberMe']//following-sibling::label[text()='Keep me signed in']");
	public By Ordertracker_unavail=By.xpath("//span[contains(text(),'Sorry, reservation order tracking is not yet available.')]");
	public By OT_UN=By.xpath("//div[@class='text-danger']//span[contains(text(),'Sorry, reservation order tracking is not yet available.')]");
	By OrderId_Error=By.xpath("//div[@class='form-floating go_error']");
	//Document Submission
	By doumentsub=By.xpath("//label[contains(text(),' DOCUMENT SUBMISSION ')]");
	
	By POID_Img = By.xpath("(//img[@class='img-fluid'])[1]");
	By POID_Type = By.xpath("//select[@name='poidType']");
	By POID_Number = By.xpath("//input[@formcontrolname='poidNumber' and @id='reason']");
	By POID_Verification = By.xpath("//select[@name='poidVerification']");
	By POID_Reason = By.xpath("(//input[@id='reason'])[2]");
	By POID_DateReviewed = By.xpath("(//input[@id='dateReviewed'])[1]");
	By POID_Verficationfinding1=By.xpath("(//textarea[@id='verificationFindings'])[1]");
	
	
	
	By POFC_Img = By.xpath("(//img[@class='img-fluid'])[2]");
	By POFC_Type = By.xpath("//select[@name='pofcType']");
	By POFC_Verification = By.xpath("//select[@name='pofcVerification']");
	By POFC_Reason = By.xpath("(//input[@id='reason'])[3]");
	By POFC_DateReviewed = By.xpath("(//input[@id='dateReviewed'])[2]");
	By POFC_Verficationfinding1=By.xpath("(//textarea[@id='verificationFindings'])[2]");
	
	//primary account detaisl
	
	By PrimaryAccDetails=By.xpath("//div[@id='primary_account_details']//label[text()=' PRIMARY ACCOUNT DETAILS ']");
	By ApplDate=By.xpath("//input[@name='applicationDate']");
	By Tenure=By.xpath("//input[@name='tenure']");
	By LastRenewalDate=By.xpath("//input[@name='lastRenewDate']");
	By Brand=By.xpath("//input[@name='brand']");
	By CurrentPlan=By.xpath("//input[@name='currentPostpaidPlan']");
	By CNDBResults=By.xpath("//input[@name='cndbresults']");
	
	//POSTPAID CUSTOMER DETAILS
	By postpaid=By.xpath("//label[contains(text(),' POSTPAID CUSTOMER DETAILS ')]");
	
	By CustDet_FAID = By.xpath("//input[@id='financialAccountId']");
	By CustDet_BAID = By.xpath("//input[@id='billingArrangementID']");
	By CustDet_ContactID = By.xpath("//input[@id='personID']");
	By CustDet_CustomerID = By.xpath("//input[@id='customerID']");
	
	//PAYMENT DETAILS
	By payment=By.xpath("//label[contains(text(),' PAYMENT DETAILS ')]");
	//payment details for Renewal Order
	By BalancePretermFee=By.xpath("(//tr[@class='ng-untouched ng-pristine ng-valid'])//td[text()='Preterm Fee']");
	By AccountPretermFee=By.xpath("(//tr[@class='ng-untouched ng-pristine ng-valid'])//td[text()='Preterm Fee']//following-sibling::td[1]");
	By AmountDuePretermFee=By.xpath("(//tr[@class='ng-untouched ng-pristine ng-valid'])//td[text()='Preterm Fee']//following-sibling::td[2]");
	By StatusPretermFee=By.xpath("(//tr[@class='ng-untouched ng-pristine ng-valid'])//td[text()='Preterm Fee']//following-sibling::td[3]");
	By PaymentMethodPretermFee=By.xpath("(//tr[@class='ng-untouched ng-pristine ng-valid'])//td[text()='Preterm Fee']//following-sibling::td[4]");
	By TransactionPretermFee=By.xpath("(//tr[@class='ng-untouched ng-pristine ng-valid'])//td[text()='Preterm Fee']//following-sibling::td[5]");
	By ORNumberPretermFee=By.xpath("(//tr[@class='ng-untouched ng-pristine ng-valid'])//td[text()='Preterm Fee']//following-sibling::td[6]");
	
	
	By DevCashout = By.xpath("(//input[@id='balance'])[1]");
	By DevCashout_Account = By.xpath("(//input[@id='accountNumber'])[2]");
	By DevCashout_AmountDue = By.xpath("(//input[@id='amountDue'])[2]");
	By DevCashout_PaymentID = By.xpath("(//input[@id='transactionId'])[1]");
	By PTF = By.xpath("(//input[@id='balance'])[2]");
	By PTF_Account = By.xpath("(//input[@id='accountNumber'])[3]");
	By PTF_AmountDue = By.xpath("(//input[@id='amountDue'])[3]");
	By PTF_PaymentId = By.xpath("(//input[@id='transactionId'])[2]");
	//Request Payment
	By ReqPay_PayMethod = By.xpath("//input[@id='preferredPaymentMethod']");
	By ReqPay_TotalAmount = By.xpath("//input[@id='totalAmount']");
	By ReqPay_PaymentMethod = By.xpath("//select[@id='paymentMethod']");
	By ReqPay_DateLinkSeeding = By.xpath("//input[@id='dateOfLinkSending']");
	By ReqPay_PayReference = By.xpath("//input[@id='paymentReference']");
	By ReqPay_StatusPayment = By.xpath("//select[@id='acquiPaymentStatus' or @id='renewalPaymentStatus']");
	//Payment Posting Details
	By PostDet_TransacDate = By.xpath("//input[@id='paymentPostingTransactionDate']");
	By PostDet_PayID = By.xpath("//label[text()='Payment ID']//following-sibling::input[@id='transactionId']");
	By PostDet_PostingRemarks = By.xpath("//input[@id='paymentPostingBillingRemarks']");
	By PostDet_InvoiceID = By.xpath("//input[@id='paymentPostingInvoiceID']");
	By PostDet_OR = By.xpath("//input[@id='orNumber']");
	
	//FULFILLMENT DETAILS
	By fullfill=By.xpath("//label[contains(text(),' FULFILLMENT DETAILS ')]");
	By addnewrow=By.xpath("(//button[contains(text(),'Add New Row')])[1]");
	
	By FulfillDet_PALrbtn = By.xpath("//input[@name='palOrFsoTd' and @value='PAL']");
	By FulfillDet_FSOrbtn = By.xpath("//input[@name='palOrFsoTd' and @value='FSO TD']");
	By FulfillDet_RSOrbtn = By.xpath("//input[@name='palOrFsoTd' and @value='RSO']");
	By FulfillDet_Xpressrbtn = By.xpath("//input[@name='deliveryType' and @id='express']");
	By FulfillDet_Regularrbtn = By.xpath("//input[@name='deliveryType' and @id='regular']");
	By FulfillDet_PickupHub = By.xpath("//input[@id='pickUpHub']");
	By FulfillDet_AssignedCourier = By.xpath("//input[@id='assignedCourier']");
	By FulfillDet_AssignedAgent = By.xpath("//input[@id='assignedAgent']");
	By FulfillDet_Schedule = By.xpath("//input[@id='deliveryDate']");
	By FulfillDet_Schedule2=By.xpath("(//input[@id='deliveryDate'])[2]");
	By FulfillDet_Schedule3=By.xpath("(//input[@id='deliveryDate'])[3]");

	By FulfillDet_Status = By.xpath("//select[@id='status']");
	By FulfillDet_Status2=By.xpath("(//select[@id='status'])[2]");
	By FulfillDet_Status3=By.xpath("(//select[@id='status'])[2]");

	By FulfillDet_Remarks = By.xpath("//select[@id='remarks']");
	By FulfillDet_Remarks2 = By.xpath("(//select[@id='remarks'])[2]");
	By FulfillDet_Remarks3 = By.xpath("(//select[@id='remarks'])[2]");


	//ACTIVATION DETAILS
	By activation=By.xpath("//label[contains(text(),' ACTIVATION DETAILS ')]");
	
	By ActChannel = By.xpath("//input[@id='channel']");
	By DateofActivation = By.xpath("//input[@id='dateOfActivation']");
	By TimeofActivation = By.xpath("//input[@id='timeOfActivation']");
	
	//PLAN PROVISIONING DETAILS
	By planpro=By.xpath("//label[contains(text(),' PLAN PROVISIONING DETAILS ')]");
	
	By dateOfPlanProvisioning = By.xpath("//input[contains(@id,'dateOfNewPlanProvisioning') or contains(@id,'dateOfNewPlanProvisioning')]");
	By timeOfPlanProvisioning = By.xpath("//input[@id='timeOfPlanProvisioning' or @id='timeOfNewPlanProvisioning']");
	By dateOfOrderClosing = By.xpath("//input[@id='dateOfOrderClosing']");
	By timeOfOrderClosing = By.xpath("//input[@id='timeOfOrderClosing']");
	By startDateOfContract = By.xpath("//input[@id='startDateOfContract']");
	By endDateOfContract = By.xpath("//input[@id='endDateOfContract']");
	
	//SEEDING DETAILS
	By seeding=By.xpath("//label[contains(text(),' SEEDING DETAILS ')]");
	
	By GCashAccount = By.xpath("//input[@id='verifiedGcashAccount']");
	By GCashTagging = By.xpath("//input[@id='gcashTagging']");
	By SeedingReference = By.xpath("//input[@id='seedingReference']");
	By SeedingDate = By.xpath("//input[@id='seedingDate']");
	
	//CALLOUT AND RECOVERY
	By callout=By.xpath("//label[contains(text(),' CALLOUT AND RECOVERY ')]");
	
	By CalloutReason = By.xpath("//select[@formcontrolname='callOutReason']");
	By CallAttempt = By.xpath("//input[@formcontrolname='dateOfCallAttempt']");
	By CalloutData = By.xpath("//select[@formcontrolname='contactedOrUncontacted']");
	By CalloutDisposition = By.xpath("//select[@formcontrolname='callOutDisposition']");
	By CalloutNotes = By.xpath("//input[@formcontrolname='callOutNotes']");
	
	//REFUND DETAILS
	By refound=By.xpath("//label[contains(text(),' REFUND DETAILS ')]");
	
	By RefundRequestDate = By.xpath("//input[@formcontrolname='refundRequestDate']");
	By ValidAmountforRefund = By.xpath("//input[@formcontrolname='validAmountOfRefund']");
	By IssuingBank_Partner = By.xpath("//input[@formcontrolname='issuingBankPartner']");
	By CardNumber = By.xpath("//input[@formcontrolname='cardNumber']");
	By AccountName = By.xpath("//input[@formcontrolname='accountName']");
	By Authorization_ApprovalCode = By.xpath("//input[@formcontrolname='authorizationApprovalCode']");
	By Remarks = By.xpath("//select[@formcontrolname='refundRemarks']");
	By RefundReference = By.xpath("//input[@formcontrolname='refundReference']");
	
	//ORDER HISTORY
	By orderh=By.xpath("//label[contains(text(),' ORDER HISTORY ')]");
	By OrderReceived = By.xpath("//div[contains(text(), 'Order Received')]");
	By AutomaticUpdate = By.xpath("//span[contains(text(), 'Automatic Update')]");
	By DateOrder = By.xpath("(//div[@style='font-style: italic; color: #999999;'])[1]");
	By AutomaticUpdateDate=By.xpath("(//div[contains(text(), 'Update details in the order')])[1]//following-sibling::div[3]");
	By Primarydetails=By.xpath("//label[@class='form-control-label font-weight-bold text-primary']");
	
	
	By Backbutton = By.xpath("(//span[contains(text(),'Back')])");
	By Savebutton = By.xpath("(//span[contains(text(),'Save')])");
	
	
	By Aprovved = By.xpath("//select[@id='dispositionStatus']");
	By poidnumber=By.xpath("//input[@id='reason']");
	
	By confirmcorrect=By.xpath("//span[contains(text(),'Confirm Correct')]");
	
	//Assign to FSO agent
	
		By Checkbox = By.xpath("(//input[@type='checkbox'])[4]");
		By Assign_Checkbox = By.xpath("(//input[@name='assigneeMode'])[1]");
		By SelectAdmin = By.xpath("(//input[@id='typeahead-basic'])[1]");
		By SelectFSO = By.xpath("(//ngb-highlight[contains(text(),'AGENT OMT, TCOE FSOTD,  - ')])[1]");
		By Assign_btn = By.xpath("(//button[contains(text(),'Assign')])");	
		By AssignRdBtn=By.xpath("//input[@id='assignAppRB']");
		public By Assign_Result=By.xpath("//button[@class='dropdown-item active']");
	
			//option[contains(text(),' Approved ')]");
		public By Completed=By.xpath("//div[text()='Completed']");
		By DateOrdered=By.xpath("//span[text()='Date ordered']//following::span[1]");
		public By UserName1=By.xpath("//input[@name='identifier']");
		public By Password1=By.xpath("//input[@name='credentials.passcode']");
		public By OKTA_Notif=By.xpath("//h3[text()='Get a push notification']//following::div[@class='authenticator-button']//a");

		By LAS=By.xpath("//span[contains(text(),'Download')]");
		By AwaitingPayment=By.xpath("//span[text()='Awaiting Payment']");
		By cookiesNotification = By.xpath("//span[contains(text(),'Your privacy is important to us')]");
		By privacyAccept = By.xpath("//button[text()=' I accept']");
		//***************************OrderTracker*********************************
		//OrderTracker 	
		By Trackmyorder = By.xpath("(//a[contains(text(),' Track my order ')])[1]");
		By Trackmyorder_header = By.xpath("(//h1[contains(text(),'Track my order')])[1]");
		By Orderid_input = By.xpath("(//input[@id='floatingInput'])[1]");
		By Orderid_email = By.xpath("(//input[@id='floatingInput'])[2]");
		By Trackmyorder_button = By.xpath("(//button[@id='trackOrderDetailBtn'])");
		By OrderCancelled=By.xpath("//span[contains(text(),' Your order has been cancelled ')]");
		By OrderCancelledContext=By.xpath("//div[contains(text(),' You may have cancelled ')]");
		
		By MyOrder = By.xpath("//span[contains(text(),'My order')]");
		By referencenumber = By.xpath("//span[contains(text(),'REFERENCE NUMBER')]");
		By OT_Orderid = By.xpath("(//span[contains(text(),'PRE-00')])[2]");
		By Confirm = By.xpath("(//div[@class=\"d-flex flex-row order-status-title show-active-title\"])[1]");
		By Confirm_Subtitle = By.xpath("//div[contains(text(),' Completed: ')]");
		By OrderConfirmed=By.xpath("//span[text()='Order Confirmed']");
		By DeliverTitle=By.xpath("(//span[text()='Deliver'])[1]");
		By ForReDelivery=By.xpath("//div[text()='For Redelivery']");
		//***************************DISAPTCH*********************************
				By DISAPTCH = By.xpath("(//div[@class=\\\"d-flex flex-row order-status-title show-active-title\\\"])[2]");
				By DISAPTCH_Subtitle = By.xpath("//div[contains(text(),' Your order is on the way ')]");
				By DISAPTCH_Heading = By.xpath("//span[contains(text(),'For Dispatch')]");
				By DISAPTCH_Date = By.xpath("//div[@class='date-value']");
						//div[@class='col-sm-5 col-5 order-recieved-data']");
				//cod payment
				
				By Disaptchdateorderd=By.xpath("//div[@class='date-ordered-col-details']");
				By disaptchdateorderdvalue=By.xpath("//div[@class='date-ordered-col-value']");
				By dispatchamount=By.xpath("//div[@class='payment-details-col-label']");
				By dispatchamountvalue=By.xpath("//div[@class='payment-details-col-value-space_8']//following-sibling::span");
				//if different apyment
				By DISAPTCH_text = By.xpath("//div[@class='col-sm-12 col-12 order-recieved-text']");
				//By DISAPTCH_text_right = By.xpath("//div[@class='col-sm-12 col-12 deliver-text1']");
				By DISAPTCH_Paymentmethod = By.xpath("//span[contains(text(),'Payment method:')]");
				By DISAPTCH_Paymentmethod_val = By.xpath("//div[@class='col-sm-6 col-6 grab']");
				By DISAPTCH_Amountpaid = By.xpath("//span[contains(text(),'Amount paid:')]");
				By DISAPTCH_Amountpaid_Val = By.xpath("//div[@class='col-sm-6 col-6 grab']");
				By DISAPTCH_Shiptothisaddress_Header = By.xpath("//span[contains(text(),'Ship to this address')]");
				By DISAPTCH_Shiptothisaddress = By.xpath("(//div[@class='ship-text1'])[1]");
				By DISAPTCH_EstimatedDelivery = By.xpath("(//div[@class='ship-text'])[2]");
				By DISAPTCH_Estimated_deliverydate = By.xpath("//div[contains(text(),'business days')]");
			
		//
				//***************************Delivery*********************************
				By Deliver = By.xpath("(//div[@class=\\\"d-flex flex-row order-status-title show-active-title\\\"])[2]");
				By Deliver_Subtitle = By.xpath("//div[contains(text(),' Your order is on the way ')]");
				By Deliver_Heading = By.xpath("//div[contains(text(),'For Delivery')]");
						//div[@class='col-sm-7 col-7 order-deliver-heading']");
				
				By UpdatedDate=By.xpath("//span[text()='Updated: November 18, 2022']");
				By Deliver_Date = By.xpath("//div[@class='go_order-card-header']//span");
				By totalamount=By.xpath("//span[contains(text(),'Total amount')]");
				By totalamountvalue=By.xpath("//div[contains(@class,'go_total-amount-block')]//strong[contains(.,'₱')]");
				By ReDeliverContext=By.xpath("//p[contains(text(),'Our courier')]");
				By Deliver_text = By.xpath("//div[@class='col-sm-12 col-12 order-deliver-text']");
				By Deliver_text_right = By.xpath("//div[@class='col-sm-12 col-12 deliver-text1']");
				By Deliver_Paymentmethod = By.xpath("//span[contains(text(),'Payment method used:')]");
				By Deliver_Paymentmethod_val = By.xpath("//div[@class='col-sm-6 col-6 deliver-val2']");
				By Deliver_Amountpaid = By.xpath("//span[contains(text(),'Amount paid:')]");
				By Deliver_Amountpaid_Val = By.xpath("//div[@class='col-sm-6 col-6 deliver-val']");
				By Deliver_Shiptothisaddress_Header = By.xpath("//h2[contains(text(),'Ship to this address')]");
				By Deliver_Shiptothisaddress = By.xpath("(//div[@class='ship-text1'])[1]");
				By Deliver_EstimatedDelivery = By.xpath("Ship to this address");
				By Deliver_Estimated_deliverydate = By.xpath("//div[contains(text(),'business days')]");
				By OKTA_AccSignIn = By.xpath("//span[text()='Sign in']");
				
			//for activation 
				
				By Activation=By.xpath("//div[@class='go_order-card-header']//div");
				
			
				
		/********************************************************************************************************************************/
		public WebElement get_privacyAccept() {
			return DriverManager.getDriver().findElement(privacyAccept);
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
		
		public WebElement get_addnewrow()
		{
			return DriverManager.getDriver().findElement(addnewrow);
		}
	public WebElement get_LAS()
	{
		return DriverManager.getDriver().findElement(LAS);
	}
	public WebElement get_Checkbox()
	{
		return DriverManager.getDriver().findElement(Checkbox);
	}
	/**********************************Clicking on Headers****************************************************************/
	public WebElement get_Customerdetails() {
		return DriverManager.getDriver().findElement(Customerdetails);
	}
	public WebElement get_confirmcorrect()
	{
		return DriverManager.getDriver().findElement(confirmcorrect);
		
	}
	public WebElement get_Accountcheck()
	{
		return DriverManager.getDriver().findElement(Accountcheck);
		
	}
	public WebElement get_PrimaryAccDetails()
	{
		return DriverManager.getDriver().findElement(PrimaryAccDetails);
		
	}
	public WebElement get_ApplicationDate()
	{
		return DriverManager.getDriver().findElement(ApplDate);
		
	}
	public WebElement get_Tenure()
	{
		return DriverManager.getDriver().findElement(Tenure);
		
	}
	public WebElement get_LastRenewalDate()
	{
		return DriverManager.getDriver().findElement(LastRenewalDate);
		
	}
	public WebElement get_Brand()
	{
		return DriverManager.getDriver().findElement(Brand);
		
	}
	public WebElement get_CNDBResults()
	{
		return DriverManager.getDriver().findElement(CNDBResults);
		
	}
	
	public WebElement get_CurrentPlan()
	{
		return DriverManager.getDriver().findElement(CurrentPlan);
		
	}
	
	
	
	public WebElement get_orderdetails()
	{
		return DriverManager.getDriver().findElement(orderdetails);
		
	}
	public WebElement get_doumentsub()
	{
		return DriverManager.getDriver().findElement(doumentsub);
		
	}
	public WebElement get_postpaid()
	{
		return DriverManager.getDriver().findElement(postpaid);
		
	}
	public WebElement get_payment()
	{
		return DriverManager.getDriver().findElement(payment);
		
	}
	public WebElement get_fullfill()
	{
		return DriverManager.getDriver().findElement(fullfill);
		
	}
	public WebElement get_activation()
	{
		return DriverManager.getDriver().findElement(activation);
		
	}public WebElement get_planpro()
	{
		return DriverManager.getDriver().findElement(planpro);
		
	}
	public WebElement get_seeding()
	{
		return DriverManager.getDriver().findElement(seeding);
		
	}
	public WebElement get_callout()
	{
		return DriverManager.getDriver().findElement(callout);
	}
	
	public WebElement get_refound()
	{
		return DriverManager.getDriver().findElement(refound);
	}
	public  WebElement get_orderh()
	{
		return DriverManager.getDriver().findElement(orderh);
	}
	
	/*******************************************************************************************************************/
	public void select_Approved(String option) {
		Select s = new Select(DriverManager.getDriver().findElement(Aprovved));
		//s.selectByValue(option);
		s.selectByVisibleText(option);
	}
	public void select_POID_Verification(String option)
	{
		Select s = new Select(DriverManager.getDriver().findElement(POID_Verification));
		s.selectByVisibleText(option);
	}
	public void select_POFC_Verification(String option) {
		Select s = new Select(DriverManager.getDriver().findElement(POFC_Verification));
		s.selectByVisibleText(option);
	}
	public void select_get_ReqPay_StatusPayment(String option) {
		Select s = new Select(DriverManager.getDriver().findElement(ReqPay_StatusPayment));
		s.selectByVisibleText(option);
	}
	
	
	/********************************************************************************************************************************/
	public WebElement get_Backbutton() {
		return DriverManager.getDriver().findElement(Backbutton);
	}
	/********************************************************************************************************************************/
	public WebElement get_Savebutton() {
		return DriverManager.getDriver().findElement(Savebutton);
	}
	public WebElement get_Primarydetails()
	{
		return DriverManager.getDriver().findElement(Primarydetails);
	}
	/********************************************************************************************************************************/
	public WebElement get_SearchError() {
		return DriverManager.getDriver().findElement(SearchError);
	}
	/********************************************************************************************************************************/
	public WebElement get_Next_Btn() {
		return DriverManager.getDriver().findElement(Next);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_Entities() {
		return DriverManager.getDriver().findElement(Entities);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_OKTA_Notif() {
		return DriverManager.getDriver().findElement(OKTA_Notif);
	}
	/********************************************************************************************************************************/
	public WebElement get_SignIn_Btn() {
		return DriverManager.getDriver().findElement(SignIn_Btn);
	}
	/********************************************************************************************************************************/
	public WebElement get_Deliver_Ordered() {
		return DriverManager.getDriver().findElement(DateOrdered);
	}
	/********************************************************************************************************************************/
	public WebElement get_SearchBtn() {
		return DriverManager.getDriver().findElement(SearchBtn);
	}
	/********************************************************************************************************************************/
	public WebElement get_AppEntry() {
		return DriverManager.getDriver().findElement(AppEntry);
	}
	/********************************************************************************************************************************/
	public WebElement get_Verify_Btn() {
		return DriverManager.getDriver().findElement(Verify_Btn);
	}
	/********************************************************************************************************************************/
	public WebElement get_OKTA_SSO_Btn() {
		return DriverManager.getDriver().findElement(OKTA_SSO_Btn);
	}
	/********************************************************************************************************************************/
	public WebElement get_AccountBtn() {
		return DriverManager.getDriver().findElement(AccountBtn);
	}
	/********************************************************************************************************************************/
	public WebElement get_SignInBtn() {
		return DriverManager.getDriver().findElement(SignInBtn);
	}
	/********************************************************************************************************************************/
	public WebElement get_LoginUsername() {
		return DriverManager.getDriver().findElement(LoginUsername);
	}
	/********************************************************************************************************************************/
	public WebElement get_LoginPassword() {
		return DriverManager.getDriver().findElement(LoginPassword);
	}
	/********************************************************************************************************************************/
	public WebElement get_LoginBtn() {
		return DriverManager.getDriver().findElement(LoginBtn);
	}
	/********************************************************************************************************************************/
	public WebElement get_EntitiesBtn() {
		return DriverManager.getDriver().findElement(EntitiesBtn);
	}	
	/********************************************************************************************************************************/
	public WebElement get_AppllEntryBtn() {
		return DriverManager.getDriver().findElement(AppllEntryBtn);
	}
	/********************************************************************************************************************************/
	public WebElement get_SearchField() {
		return DriverManager.getDriver().findElement(SearchField);
	}
	/********************************************************************************************************************************/
	public WebElement get_fCheckbox() {
		return DriverManager.getDriver().findElement(fCheckbox);
	}	
	
	/********************************************************************************************************************************/
	public WebElement get_Assign_Result() {
		return DriverManager.getDriver().findElement(Assign_Result);
	}
	/********************************************************************************************************************************/
	public WebElement get_AssignRdBtn() {
		return DriverManager.getDriver().findElement(AssignRdBtn);
	}
	/********************************************************************************************************************************/
	public WebElement get_Assign_btn() {
		return DriverManager.getDriver().findElement(Assign_btn);
	}
	/********************************************************************************************************************************/
	public WebElement get_OrderCheckBox() {
		return DriverManager.getDriver().findElement(OrderCheckBox);
	}	
	/********************************************************************************************************************************/
	public WebElement get_RemoveAssigneRdbtn() {
		return DriverManager.getDriver().findElement(RemoveAssigneeRdBtn);
	}
	/********************************************************************************************************************************/
	public WebElement get_CheckBoxOrder() {
		return DriverManager.getDriver().findElement(CheckBoxOrder1);
	}
	
	public WebElement get_RemoveMessage(){
		return DriverManager.getDriver().findElement(RemoveMsg);
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
	
	
	public boolean get_RadioAssignOrder()
	{
		return DriverManager.getDriver().findElement(RadioAssignOrder).isSelected();
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
	public WebElement get_DownloadBtn() {
		return DriverManager.getDriver().findElement(DownloadBtn);
	}
	
	//-----DASHBOARD-----
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
	
	//------------ PRIMARY CUSTOMER DETAILS --------------	
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
	public WebElement get_OMT_acquiTypee() {
		return DriverManager.getDriver().findElement(OMT_acquiType);
	}
	/********************************************************************************************************************************/
	public WebElement get_OMT_TransacType() {
		return DriverManager.getDriver().findElement(OMT_TransacType);
	}
	/********************************************************************************************************************************/
	public WebElement get_OMT_Disposition() {
		return DriverManager.getDriver().findElement(OMT_Disposition);
	}
	/********************************************************************************************************************************/
	public WebElement get_OMT_DispoReason() {
		return DriverManager.getDriver().findElement(OMT_DispoReason);
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
	//+++++ Recepient Details +++++
	/********************************************************************************************************************************/
	public WebElement get_Primary_RecipientName() {
		return DriverManager.getDriver().findElement(Primary_RecipientName);
	}
	/********************************************************************************************************************************/
	public WebElement get_Primary_RecipientMobNum() {
		return DriverManager.getDriver().findElement(Primary_RecipientMobNum);
	}
	
	//+++++++++++++++ REGISTERED ADDRESS +++++++++++++++++++++
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
	
	//ACCOUNT CHECKING RESULTS	
	/********************************************************************************************************************************/
	public WebElement get_CreditLimit() {
		return DriverManager.getDriver().findElement(CreditLimit);
	}
	/********************************************************************************************************************************/
	public WebElement get_GMI() {
		return DriverManager.getDriver().findElement(GMI);
	}
	/********************************************************************************************************************************/
	public WebElement get_PrequalResult() {
		return DriverManager.getDriver().findElement(PrequalResult);
	}
	/********************************************************************************************************************************/
	public WebElement get_CNDBResult() {
		return DriverManager.getDriver().findElement(CNDBResult);
	}
	/********************************************************************************************************************************/
	public WebElement get_CSLResult() {
		return DriverManager.getDriver().findElement(CSLResult);
	}
	/********************************************************************************************************************************/
	public WebElement get_Balance() {
		return DriverManager.getDriver().findElement(Balance);
	}
	/********************************************************************************************************************************/
	public WebElement get_Account() {
		return DriverManager.getDriver().findElement(Account);
	}
	/********************************************************************************************************************************/
	public WebElement get_Account_Signout() {
		return DriverManager.getDriver().findElement(Account_Signout);
	}
	/********************************************************************************************************************************/
	public WebElement get_Account_Signin() {
		return DriverManager.getDriver().findElement(Account_Signin);
	}
	/********************************************************************************************************************************/
	
	/********************************************************************************************************************************/
	public WebElement get_AmountDue() {
		return DriverManager.getDriver().findElement(AmountDue);
	}
	//ORDER DETAILS
	
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
	public WebElement get_ReservationID_Update() {
		return DriverManager.getDriver().findElement(ReservationID_Update);
	}
	/********************************************************************************************************************************/
	public WebElement get_DeliveryCaseTitle() {
		return DriverManager.getDriver().findElement(DeliveryCaseTitle);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_DeliveryCaseId() {
		return DriverManager.getDriver().findElement(DeliveryCaseId);
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
	//Document Submission
	/********************************************************************************************************************************/
	public WebElement get_POID_Type() {
		return DriverManager.getDriver().findElement(POID_Type);
	}
	/********************************************************************************************************************************/
	public WebElement get_POID_Number() {
		return DriverManager.getDriver().findElement(POID_Number);
	}
	/********************************************************************************************************************************/
	public WebElement get_POID_Verification() {
		return DriverManager.getDriver().findElement(POID_Verification);
	}
	/********************************************************************************************************************************/
	public WebElement get_POID_Reason() {
		return DriverManager.getDriver().findElement(POID_Reason);
	}
	/********************************************************************************************************************************/
	public WebElement get_POID_DateReviewed() {
		return DriverManager.getDriver().findElement(POID_DateReviewed);
	}
	/********************************************************************************************************************************/
	public WebElement get_POID_Verficationfinding1()
	{
		return DriverManager.getDriver().findElement(POID_Verficationfinding1);
	}
	/*****************************************************************************************************/
	
	public WebElement get_POFC_Type() {
		return DriverManager.getDriver().findElement(POFC_Type);
	}
	/********************************************************************************************************************************/
	public WebElement get_POFC_Verification() {
		return DriverManager.getDriver().findElement(POFC_Verification);
	}
	/********************************************************************************************************************************/
	public WebElement get_POFC_Reason() {
		return DriverManager.getDriver().findElement(POFC_Reason);
	}
	/********************************************************************************************************************************/
	public WebElement get_POFC_DateReviewed() {
		return DriverManager.getDriver().findElement(POFC_DateReviewed);
	}
	
	public WebElement get_POFC_Verficationfinding1()
	{
		return DriverManager.getDriver().findElement(POFC_Verficationfinding1);
	}
	
	//POSTPAID CUSTOMER DETAILS
	/********************************************************************************************************************************/
	public WebElement get_CustDet_FAID() {
		return DriverManager.getDriver().findElement(CustDet_FAID);
	}
	/********************************************************************************************************************************/
	public WebElement get_CustDet_BAID() {
		return DriverManager.getDriver().findElement(CustDet_BAID);
	}
	/********************************************************************************************************************************/
	public WebElement get_CustDet_ContactID() {
		return DriverManager.getDriver().findElement(CustDet_ContactID);
	}
	/********************************************************************************************************************************/
	public WebElement get_CustDet_CustomerID() {
		return DriverManager.getDriver().findElement(CustDet_CustomerID);
	}
	//PAYMENT DETAILS
	/********************************************************************************************************************************/
	public WebElement get_DevCashout() {
		return DriverManager.getDriver().findElement(DevCashout);
	}
	/********************************************************************************************************************************/
	public WebElement get_BalancePretermFee() {
		return DriverManager.getDriver().findElement(BalancePretermFee);
	}
	/********************************************************************************************************************************/
	public WebElement get_AccountPretermFee() {
		return DriverManager.getDriver().findElement(AccountPretermFee);
	}
	/********************************************************************************************************************************/
	public WebElement get_AmountDuePretermFee() {
		return DriverManager.getDriver().findElement(AmountDuePretermFee);
	}
	/********************************************************************************************************************************/
	public WebElement get_StatusPretermFee() {
		return DriverManager.getDriver().findElement(StatusPretermFee);
	}
	/********************************************************************************************************************************/
	public WebElement get_PaymentMethodPretermFee() {
		return DriverManager.getDriver().findElement(PaymentMethodPretermFee);
	}
	/********************************************************************************************************************************/
	public WebElement get_ORNumberPretermFee() {
		return DriverManager.getDriver().findElement(ORNumberPretermFee);
	}
	/********************************************************************************************************************************/
	public WebElement get_TransactionPretermFee() {
		return DriverManager.getDriver().findElement(TransactionPretermFee);
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

	//FULFILLMENT DETAILS
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
	public WebElement get_FulfillDet_Schedule2() {
		return DriverManager.getDriver().findElement(FulfillDet_Schedule2);
	}
	/********************************************************************************************************************************/
	public WebElement get_FulfillDet_Schedule() {
		return DriverManager.getDriver().findElement(FulfillDet_Schedule);
	}
	/********************************************************************************************************************************/
	public WebElement get_FulfillDet_Schedule3() {
		return DriverManager.getDriver().findElement(FulfillDet_Schedule3);
	}
	/********************************************************************************************************************************/
	public WebElement get_FulfillDet_Status() {
		return DriverManager.getDriver().findElement(FulfillDet_Status);
	}
	/********************************************************************************************************************************/
	public WebElement get_FulfillDet_Status2() {
		return DriverManager.getDriver().findElement(FulfillDet_Status2);
	}
	/********************************************************************************************************************************/
	public WebElement get_FulfillDet_Status3() {
		return DriverManager.getDriver().findElement(FulfillDet_Status3);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_FulfillDet_Remarks() {
		return DriverManager.getDriver().findElement(FulfillDet_Remarks);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_FulfillDet_Remarks2() {
		return DriverManager.getDriver().findElement(FulfillDet_Remarks2);
	}
	/********************************************************************************************************************************/
	public WebElement get_FulfillDet_Remarks3() {
		return DriverManager.getDriver().findElement(FulfillDet_Remarks3);
	}
	public void select_get_FulfillDet_Status3(String option) {
		Select s = new Select(DriverManager.getDriver().findElement(FulfillDet_Status3));
		s.selectByVisibleText(option);
	}
	public void select_get_FulfillDet_Status2(String option) {
		Select s = new Select(DriverManager.getDriver().findElement(FulfillDet_Status2));
		s.selectByVisibleText(option);
	}
	public void select_get_FulfillDet_Status(String option) {
		Select s = new Select(DriverManager.getDriver().findElement(FulfillDet_Status));
		s.selectByVisibleText(option);
	}
	public void select_FulfillDet_Remarks(String option) {
		Select s = new Select(DriverManager.getDriver().findElement(FulfillDet_Remarks));
		s.selectByVisibleText(option);
	}
	public void select_FulfillDet_Remarks2(String option) {
		Select s = new Select(DriverManager.getDriver().findElement(FulfillDet_Remarks2));
		s.selectByVisibleText(option);
	}
	public void select_FulfillDet_Remarks3(String option) {
		Select s = new Select(DriverManager.getDriver().findElement(FulfillDet_Remarks3));
		s.selectByVisibleText(option);
	}
	
	
	
	//ACTIVATION DETAILS  Asma script start here
	/******************************************************************************************/
	public WebElement get_ActChannel()
	{
		return DriverManager.getDriver().findElement(ActChannel);
	}
	public WebElement get_DateofActivation()
	{
		return DriverManager.getDriver().findElement(DateofActivation);
		
	}
	public WebElement get_TimeofActivation()
	{
		return DriverManager.getDriver().findElement(TimeofActivation);
	}
	/******************************************************************************************************/
	//PLAN PROVISIONING DETAILS
	public WebElement get_dateOfPlanProvisioning()
	{
		return DriverManager.getDriver().findElement(dateOfPlanProvisioning);
		
	}
	public WebElement get_timeOfPlanProvisioning()
	{
		return DriverManager.getDriver().findElement(timeOfPlanProvisioning);
		
	}
	public WebElement get_dateOfOrderClosing()
	{
		return DriverManager.getDriver().findElement(dateOfOrderClosing);
		
	}
	public WebElement get_timeOfOrderClosing()
	{
	return DriverManager.getDriver().findElement(timeOfOrderClosing);
	
	}
	public WebElement get_startDateOfContract()
	{
		return DriverManager.getDriver().findElement(startDateOfContract);
		
	}
	public WebElement get_endDateOfContract()
	{
		return DriverManager.getDriver().findElement(endDateOfContract);
	}
	/***************************************************************************************************/
	////SEEDING DETAILS
	public WebElement get_GCashAccount()
	{
		return DriverManager.getDriver().findElement(GCashAccount);
	}
	public WebElement get_GCashTagging()
	{
		return DriverManager.getDriver().findElement(GCashTagging);
	}
	public WebElement get_SeedingReference()
	{
		return DriverManager.getDriver().findElement(SeedingReference);
	}
	public WebElement get_SeedingDate()
	{
		return DriverManager.getDriver().findElement(SeedingDate);
	}
	/****************************************************************************************************/
	//CALLOUT AND RECOVERY
	public WebElement get_CalloutReason()
	{
		return DriverManager.getDriver().findElement(CalloutReason);
	}
	public WebElement get_CallAttempt()
	{
		
		return DriverManager.getDriver().findElement(CallAttempt);
	}
	
	public WebElement get_CalloutDisposition()
	{
		return DriverManager.getDriver().findElement(CalloutDisposition);
	}
	public WebElement get_CalloutData()
	{
		return DriverManager.getDriver().findElement(CalloutData);
	}
	public WebElement get_CalloutNotes()
	{
		return DriverManager.getDriver().findElement(CalloutNotes);
	}
	public WebElement get_seeMoreBtn1()
	{
		return DriverManager.getDriver().findElement(seeMoreBtn1);
	}
	public WebElement get_seeMoreBtn2()
	{
		return DriverManager.getDriver().findElement(seeMoreBtn2);
	}
	public WebElement get_seeMoreBtn3()
	{
		return DriverManager.getDriver().findElement(seeMoreBtn3);
	}
	
	/********************************************************************************************************/
	//REFUND DETAILS
	public WebElement get_RefundRequestDate()
	{
		return DriverManager.getDriver().findElement(RefundRequestDate);
	}
	
	public WebElement get_ValidAmountforRefund()
	{
		return DriverManager.getDriver().findElement(ValidAmountforRefund);
	}
	public WebElement get_IssuingBank_Partner()
	{
		return DriverManager.getDriver().findElement(IssuingBank_Partner);
	}
	public WebElement get_CardNumber()
	{
		return DriverManager.getDriver().findElement(CardNumber);
	}
	public WebElement get_AccountName()
	{
		return DriverManager.getDriver().findElement(AccountName);
	}
	public WebElement get_Authorization_ApprovalCode()
	{
		return DriverManager.getDriver().findElement(Authorization_ApprovalCode);
	}
	public WebElement get_Remarks()
	{
		return DriverManager.getDriver().findElement(Remarks);
	}
	public WebElement get_RefundReference()
	{
		return DriverManager.getDriver().findElement(RefundReference);
	}
	/*******************************************************************************/
	//ORDER HISTORY
	public WebElement get_OrderReceived()
	{
		return DriverManager.getDriver().findElement(OrderReceived);
	}
	public WebElement get_AutomaticUpdate()
	{
		return DriverManager.getDriver().findElement(AutomaticUpdate);
	}
	public WebElement get_DateOrder()
	{
		return DriverManager.getDriver().findElement(DateOrder);
	}
	
	public WebElement get_AutomaticUpdateDate()
	{
		return DriverManager.getDriver().findElement(AutomaticUpdateDate);
	}
	
	
	//Approved
	public WebElement get_poidnumber()
	{
		return DriverManager.getDriver().findElement(poidnumber);
	}
	public WebElement get_Completed()
	{
		return DriverManager.getDriver().findElement(Completed);
	}
	public WebElement get_OKTA_AccSignIn()
	{
		return DriverManager.getDriver().findElement(OKTA_AccSignIn);
	}
	
	
	/********************************************************************************************************************************/

	public boolean isElementExist(String message, String element, int waitTime) {
		boolean flag = false;
		
		switch (element) {
		
		
		case "KeepMeSignedIn":
			flag = waitForElementVisibility(KeepMeSignedIn, waitTime);
			break;
		case "Ordertracker_unavail":
			flag = waitForElementVisibility(Ordertracker_unavail, waitTime);
			break;
		case "OrderId_Error":
			flag = waitForElementVisibility(OrderId_Error, waitTime);
			break;
			
		case "OT_UN":
			flag = waitForElementVisibility(OT_UN, waitTime);
			break;
			
		case "Channel":
			flag = waitForElementVisibility(Channel, waitTime);
			break;
		case "DeviceDetailsTable":
			flag = waitForElementVisibility(item1, waitTime);
			break;
		case "AutomaticUpdateDate":
			flag = waitForElementVisibility(AutomaticUpdateDate, waitTime);
			break;
		case "UserName1":
			flag = waitForElementVisibility(UserName1, waitTime);
			break;
		case "Password1":
			flag = waitForElementVisibility(Password1, waitTime);
			break;
		case "OKTA_Notif":
			flag = waitForElementVisibility(OKTA_Notif, waitTime);
			break;
		case "OKTA_SSO_Btn":
			flag = waitForElementVisibility(OKTA_SSO_Btn, waitTime);
			break;
			
		case "OrderCancelled":
			flag = waitForElementVisibility(OrderCancelled, waitTime);
			break;
		case "seeMoreBtn1":
			flag = waitForElementVisibility(seeMoreBtn1, waitTime);
			break;
		case "seeMoreBtn2":
			flag = waitForElementVisibility(seeMoreBtn1, waitTime);
			break;
		case "seeMoreBtn3":
			flag = waitForElementVisibility(seeMoreBtn3, waitTime);
			break;
		case "OrderCancelledContext":
			flag = waitForElementVisibility(OrderCancelledContext, waitTime);
			break;
				
			
			
		case "Deliver_Ordered":
			flag = waitForElementVisibility(DateOrdered, waitTime);
			break;
		case "Completed":
			flag = waitForElementVisibility(Completed, waitTime);
			break;
		case "AwaitingPayment":
			flag = waitForElementVisibility(AwaitingPayment, waitTime);
			break;
		case "cookiesNotification":
			flag = waitForElementVisibility(cookiesNotification, waitTime);
			break;
		case "POID_Img":
			flag = waitForElementVisibility(POID_Img, waitTime);
			break;
		case "POFC_Img":
			flag = waitForElementVisibility(POFC_Img, waitTime);
			break;
		case "AccountBtn":
			flag = waitForElementVisibility(AccountBtn, waitTime);
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
		case "Dashboard_PlanAvailed":
			flag = waitForElementVisibility(Dashboard_PlanAvailed, waitTime);
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
		case "ViewBtn":
			flag = waitForElementVisibility(ViewBtn, waitTime);
			break;
		case "EditBtn":
			flag = waitForElementVisibility(EditBtn, waitTime);
			break;
		case "poidnumber":
			flag = waitForElementVisibility(EditBtn, waitTime);
			break;
			
			//order tracker
			
		case "OrderConfirmed":
			flag = waitForElementVisibility(OrderConfirmed, waitTime);
			break;
		case "MyOrder":
			flag = waitForElementVisibility(MyOrder, waitTime);
			break;
		case "DeliverTitle":
			flag = waitForElementVisibility(DeliverTitle, waitTime);
			break;
		case "ForReDelivery":
			flag = waitForElementVisibility(ForReDelivery, waitTime);
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
			//cod payment for dispatch
		case "Disaptchdateorderd":
			flag = waitForElementVisibility(Disaptchdateorderd, waitTime);
			break;
			
		case "disaptchdateorderdvalue":
			flag = waitForElementVisibility(disaptchdateorderdvalue, waitTime);
			break;
		
		case "dispatchamount":
			flag = waitForElementVisibility(dispatchamount, waitTime);
			break;
		
		case "dispatchamountvalue":
			flag = waitForElementVisibility(dispatchamountvalue, waitTime);
			break;
		
		//dor delivery
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
		case "UpdatedDate":
			flag = waitForElementVisibility(UpdatedDate, waitTime);
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
			
		case "ReDeliverContext":
			flag = waitForElementVisibility(ReDeliverContext, waitTime);
			break;
		case "totalamount":
			flag = waitForElementVisibility(totalamount, waitTime);
			break;
		case "totalamountvalue":
			flag = waitForElementVisibility(totalamountvalue, waitTime);
			break;
		case "Activation":
			flag = waitForElementVisibility(Activation, waitTime);
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
		case "Primarydetails":
			flag = waitForElementClickable(Primarydetails, waitTime);
			break;
		case "AccountBtn":
			flag = waitForElementClickable(AccountBtn, waitTime);
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
	public void scroll_vertical(int y_Axis) {
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("window.scrollBy(0," + y_Axis + ")", "");
	}
	/********************************************************************************************************************************/
	public void clickOnElement(String type, String eleName, String ele) {
		
		try {
			switch (ele) {
			
			case "Deliver_Ordered":
				get_Deliver_Ordered().click();
				break;
			case "SignIn_Btn":
				get_SignIn_Btn().click();
				break;
			case "OKTA_Notif":
				get_OKTA_Notif().click();
				break;
			case "OKTA_AccSignIn":
				get_OKTA_AccSignIn().click();
				break;
				
			case "SearchBtn":
				get_SearchBtn().click();
				break;
			case "AppEntry":
				get_AppEntry().click();
				break;
			
			case "Entities":
				get_Entities().click();
				break;
			case "Verify_Btn":
				get_Verify_Btn().click();
				break;
			case "Next_Btn":
				get_Next_Btn().click();
				break;
			case "OKTA_SSO_Btn":
				get_OKTA_SSO_Btn().click();
				break;
			case "AccountBtn":
				get_AccountBtn().click();
				break;
			case "SignInBtn":
				get_SignInBtn().click();
				break;
			case "LoginBtn":
				get_LoginBtn().click();
				break;
			case "EntitiesBtn":
				get_EntitiesBtn().click();
				break;
			case "AppllEntryBtn":
				get_AppllEntryBtn().click();
				break;
			case "fCheckbox":
				get_fCheckbox().click();
				break;
			case "ViewBtn":
				get_ViewBtn().click();
				break;
			case "EditBtn":
				get_EditBtn().click();
				break;
			case "DownloadBtn":
				get_DownloadBtn().click();
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
/************************************************************************************************************************/
	public String getText(String ele) {
		String text = "";

		try {
			switch (ele) {
			case "Primary_Fname":
					text = DriverManager.getDriver().findElement(Primary_Fname).getText();
					break;
					
					
					
			}
		}catch (NoSuchElementException e) {
				System.out.println("Element : " + ele.toString() + " : " + "not found : " + e.getMessage());
			} catch (Exception e) {
				System.out.println("Method : getText - Error : " + e.getMessage());
			}

			return text;
		}
public void Encoder_PlanCheck() {
	// TODO Auto-generated method stub
	
}

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

