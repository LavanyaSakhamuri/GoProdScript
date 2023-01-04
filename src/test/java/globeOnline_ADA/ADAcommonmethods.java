package globeOnline_ADA;

import static org.junit.Assert.assertTrue;

import java.awt.AWTException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebElement;

import com.pages.ada.ADADAF_Page;
import com.pages.ada.ADAGallerypage;
import com.pages.ada.ADALanding_Page;
import com.pages.ada.ADAOrderDetailsPage;
import com.pages.ada.ADAOrdersummary_Page;
import com.pages.ada.ADAPDP_page;
import com.pages.ada.ADAPayment_Page;
import com.pages.ada.ADAThankyou_Page;
import com.pages.ada.ADATrackOrderPage;
import com.pages.ada.AcquisitionConfirmation;
import com.pages.ada.CheckoutPage;
import com.pages.ada.Eligibility_PageLoader;
import com.pages.ada.Notifyme_page;

import globeOnline_CommonMethods.DriverManager;
import globeOnline_CommonMethods.SurveyPage;
import globeOnline_CommonMethods.util;
import utility.Constant;


public class ADAcommonmethods 
{
	private static LinkedHashMap<String,String> Map = new LinkedHashMap<>();
	private util util = new util();

	private ADALanding_Page LP = new ADALanding_Page();
	private ADAPDP_page PP = new ADAPDP_page();
	private CheckoutPage checkout = new CheckoutPage();
	private ADADAF_Page Form = new ADADAF_Page();	
	private ADAOrdersummary_Page OS = new ADAOrdersummary_Page();
	private ADAThankyou_Page TP = new ADAThankyou_Page();
	private ADAPayment_Page PayP = new ADAPayment_Page();
	private AcquisitionConfirmation AcquiPage=new AcquisitionConfirmation();
	private Eligibility_PageLoader PageLoader = new Eligibility_PageLoader();
	private SurveyPage Survey =new SurveyPage();
	private ADAGallerypage Gallery = new ADAGallerypage();
	private ADATrackOrderPage TrackOrder = new ADATrackOrderPage();
	private ADAOrderDetailsPage OrderDetails = new ADAOrderDetailsPage();
	private Notifyme_page NP = new Notifyme_page();


	/************************************************************************************************************************/
	/*****RONNIE SCRIPT STARTS HERE
	 * @throws InterruptedException 

	 ******************************************************************************************************************************/
	public void handle_and_insert_OTP() throws InterruptedException {
		if (checkout.isElementExist("Text OTP", "otpText", 30)) {
			for (int j = 0; j < checkout.get_OTP().size(); j++) {
				checkout.get_OTP().get(j).sendKeys(String.valueOf(j + 1));
			}
			System.out.println("Inserted OTP");
		}
		if (checkout.isElementExist("Transaction timeout", "transactionTimeOut", 15)) {
			DriverManager.getDriver().navigate().refresh();
			Thread.sleep(10000);
			for (int j = 0; j < checkout.get_OTP().size(); j++) {
				checkout.get_OTP().get(j).sendKeys(String.valueOf(j + 1));
			}
		} else
			System.out.println("able to proceed");
	}

	/********************************************************************************************************************************/


	public void storeOrderIDinExcel() throws Exception{
		String orderID = TP.get_orderNumber().getText();
		System.out.println("Order Completed successfully : " + orderID);
		Constant.dataMap.get().put("OrderID", orderID);
	}



	public void ThankYouPage_ADA5() throws Exception {
		TP.isElementExist("Thank you label", "Thankyoulabel", 10);
		TP.isElementExist("for Processing", "forProcessing", 10);
		TP.isElementExist("notification", "notification", 10);
		TP.isElementExist("order", "order", 10);
		TP.isElementExist("reference Number", "referenceNumber", 10);
		TP.isElementExist("order Number", "orderNumber", 10);
		TP.isElementExist("purchase Summary", "purchaseSummary", 10);
		TP.isElementExist("Shipping Adress", "shippingAdress", 10);
		TP.isElementExist("shipping Adress Value", "shippingAdressValue", 10);
		TP.isElementExist("PaymentMethod", "paymentMethod", 10);
		TP.isElementExist("payment Method Value", "paymentMethodValue", 10);
		TP.isElementExist("Amount To Pay", "amountToPay", 10);
		TP.isElementExist("amount To Pay Value", "amountToPayValue", 10);

		/*
		 * TP.moveToElement("gplanSimOnly999");
		 * TP.isElementExist("GPlan Plus SIM-Only 999", "gplanSimOnly999", 10);
		 * TP.isElementExist("plan Inclusions", "planInclusions", 10);
		 * TP.isElementExist("konsulta MD", "konsultaMD", 10);
		 * TP.isElementExist("Glnsure", "glnsure", 10); TP.isElementExist("Addons",
		 * "addons", 10); TP.isElementExist("GS Add Surf 99", "GS99", 10);
		 */

		//System.out.println(TP.get_orderNumber().getText());
	}
	
	public void thankYouPageSimonly599() throws InterruptedException {
		
		if(TP.isElementExist("ThankYou Text", "thankYouText", 10)) {
    		System.out.println("*******************************We are in ThankYou page******************************************");
    	}
    	
    	TP.isElementExist("For Processing Text", "forProcessing", 10);
    	    	
    	if(TP.isElementExist("shipping Address", "shippingAddress", 10)) {
    		String shippingAddress = TP.get_shippingAddress().getText();
    		System.out.println("shipping Address: "+shippingAddress);
    	}
    	
    	if(TP.isElementExist("Amount To Pay", "AmountToPay", 10)) {
    		String AmountToPay = TP.get_AmountToPay().getText();
    		System.out.println("Amount To Pay: "+AmountToPay);
    	}
    	
    	if(TP.isElementExist("paymentMethod Used", "payment_Method", 10)) {
    		String paymentMethod = TP.get_payment_Method().getText();
    		System.out.println("Payment Method: "+paymentMethod);
    	}    	
    	
    	if(TP.isElementExist("PlanName", "planName", 10)) {
    		String planName = TP.get_planName().getText();
    		System.out.println("Plan Name: "+planName);
    	}
    	
    	TP.isElementExist("Plan Inclusions Text", "planInclusionsText", 10);
    	TP.isElementExist("KonsultaMD Subscription", "KonsultaMD_Subscription", 10);
    	TP.isElementExist("addons Text", "addons_Text", 10);
    	TP.isElementExist("MySuperDuo", "MySuperDuo", 10);
    	TP.isElementExist("AmazonPrimeVideo", "AmazonPrimeVideo", 10);
    	TP.isElementExist("ViuPremium", "ViuPremium", 10);
    	//TP.isElementExist("SpotifyPremium", "SpotifyPremium", 10);
    	TP.isElementExist("GOCALLIDD", "GOCALLIDD", 10);
    	TP.isElementExist("EasyRoam", "EasyRoam", 10);
    	
    	if(TP.isElementExist("ReferenceNo","ReferenceNumber", 10)) {
    		utility.Constant.ReferenceNo = TP.get_ReferenceNumber().getText();
        	System.out.println("ReferenceNo: "+utility.Constant.ReferenceNo); 
        	Constant.dataMap.get().put("ReferenceNo", utility.Constant.ReferenceNo);
    		System.out.println("Order Completed successfully : " + utility.Constant.ReferenceNo);
    	}
	}

	public void verify_handle_survey_popup_withInput(String Q1rate, String Q1Text, String Q2rate, String Q2Text) throws InterruptedException {

		String expShopExperience = "How did you like your shopping experience?";
		String expRecommendGlobe = "Based on your online purchases, how likely are you to recommend Globe to others?";
		String expTxtTellUs = "Tell us how you feel";
		String expshareWithOther = "Don’t keep it to yourself. Share the love! Send the link to your friends and let them know.";
		String exptxtThatsNice = "Awww that's nice.";

		String logSuccess = "Validated survery text. ";
		String logFail = "Failed to validate survey text. ";

		if (Survey.isElementExist("Survery popup", "surveyForm", 15)) {

			// validate text messages for shopping experience

			String actShopExperience = Survey.get_txt_shoppingExperience().getText();
			if (actShopExperience.equals(expShopExperience)) {
				System.out.println(logSuccess + " : " + expShopExperience);
			} else {
				System.out.println(logFail + "Expected : " + expShopExperience + " - Actual : " + actShopExperience);
			}

			String act_ShopExp_TellUs = Survey.get_txt_shopExperience_feedback_().getText();
			if (act_ShopExp_TellUs.equals(expTxtTellUs)) {
				System.out.println(logSuccess + " : " + expTxtTellUs);
			} else {
				System.out.println(logFail + "Expected : " + expTxtTellUs + " - Actual : " + act_ShopExp_TellUs);
			}

			// validate text messages for recommend Globe

			String actRecommendGlobe = Survey.get_txt_recommendGlobe().getText();
			if (actRecommendGlobe.equals(expRecommendGlobe)) {
				System.out.println(logSuccess + ": " + expRecommendGlobe);
			} else {
				System.out.println(logFail + "Expected : " + expRecommendGlobe + " - Actual : " + actRecommendGlobe);
			}

			String act_Recommend_TellUs = Survey.get_txt_recommend_feedback().getText();
			if (act_Recommend_TellUs.equals(expTxtTellUs)) {
				System.out.println(logSuccess + ": " + expTxtTellUs);
			} else {
				System.out.println(logFail + ". Expected : " + expTxtTellUs + " - Actual : " + act_Recommend_TellUs);
			}

			// validate shopping experience emoji
			System.out.println("Printing Shopping Experience Emoji");
			for (int i = 0; i < Survey.get_shopExpEmoji().size(); i++) {
				System.out.println(Survey.get_shopExpEmoji().get(i).getAttribute("id"));
			}

			if(Q1rate.equalsIgnoreCase("VERY DISSATISFIED")) {
				// select VERY DISSATISFIED emoji for shopping experience and give feedback
				Survey.get_shopExpEmoji().get(4).click();
				System.out.println("Select Shopping exp emoji : 5 - VERY DISSATISFIED");
				Survey.get_shopExpFeedbackTextArea().sendKeys(Q1Text);Thread.sleep(2500);
				System.out.println("Q1 Inserted feedback : "+Q1Text+"\n");}

			else if(Q1rate.equalsIgnoreCase("DISSATISFIED")) {
				// select DISSATISFIED emoji for shopping experience and give feedback
				Survey.get_shopExpEmoji().get(3).click();
				System.out.println("Select Shopping exp emoji : 4 - DISSATISFIED");
				Survey.get_shopExpFeedbackTextArea().sendKeys(Q1Text);Thread.sleep(2500);
				System.out.println("Q1 Inserted feedback : "+Q1Text+"\n");}

			else if(Q1rate.equalsIgnoreCase("FAIR")) {
				// select FAIR emoji for shopping experience and give feedback
				Survey.get_shopExpEmoji().get(2).click();Thread.sleep(2500);
				System.out.println("Select Shopping exp emoji : 3 - FAIR");}

			else if(Q1rate.equalsIgnoreCase("HAPPY")) {
				// select HAPPY emoji for shopping experience and give feedback
				Survey.get_shopExpEmoji().get(1).click();Thread.sleep(2500);
				System.out.println("Select Shopping exp emoji : 2 - HAPPY");}

			else if(Q1rate.equalsIgnoreCase("VERY HAPPY")) {
				// select HAPPY emoji for shopping experience and give feedback
				Survey.get_shopExpEmoji().get(0).click();Thread.sleep(5000);
				System.out.println("Select Shopping exp emoji : 1 - VERY HAPPY");}



			// validate recommend globe emoji
			System.out.println("Printing Recommend Globe Emoji");
			for (int i = 0; i < Survey.get_recomGlobeEmoji().size(); i++) {
				System.out.println(Survey.get_recomGlobeEmoji().get(i).getAttribute("id"));
			}

			if(Q2rate.equalsIgnoreCase("VERY DISSATISFIED")) {
				// select VERY DISSATISFIED emoji for recommend globe and give feedback
				Survey.get_recomGlobeEmoji().get(4).click();
				System.out.println("Select Recommend Globe emoji : 5 - VERY DISSATISFIED");
				Survey.get_RecomGlobeTextArea().sendKeys(Q2Text);Thread.sleep(5000);
				System.out.println("Inserted feedback : "+Q2Text+"\n");}

			else if(Q2rate.equalsIgnoreCase("DISSATISFIED")) {
				// select DISSATISFIED emoji for recommend globe and give feedback
				Survey.get_recomGlobeEmoji().get(3).click();
				System.out.println("Select Recommend Globe emoji : 4 - DISSATISFIED");
				Survey.get_RecomGlobeTextArea().sendKeys(Q2Text);Thread.sleep(5000);
				System.out.println("Inserted feedback : "+Q2Text+"\n");}

			else if(Q2rate.equalsIgnoreCase("FAIR")) {
				// select FAIR emoji for recommend globe and give feedback
				Survey.get_recomGlobeEmoji().get(2).click();Thread.sleep(5000);
				System.out.println("Select Recommend Globe emoji : 3 - FAIR");}

			else if(Q2rate.equalsIgnoreCase("HAPPY")) {
				// select FAIR emoji for recommend globe and give feedback
				Survey.get_recomGlobeEmoji().get(1).click();Thread.sleep(5000);
				System.out.println("Select Recommend Globe emoji : 2 - HAPPY");}

			else if(Q2rate.equalsIgnoreCase("VERY HAPPY")) {
				// select FAIR emoji for recommend globe and give feedback
				Survey.get_recomGlobeEmoji().get(0).click();Thread.sleep(5000);
				System.out.println("Select Recommend Globe emoji : 1 - VERY HAPPY");}


			// submit survey
			Survey.get_submitSurver().click();
			Thread.sleep(2000L);

			// validate thumbs up image
			if (Survey.isElementExist("Image - Survey success", "imgSurveySuccess", 10)) {
				System.out.println("Thumbs up image displayed");

				String actThatsNice = Survey.get_txt_thatsNice().getText();
				if (actThatsNice.equals(exptxtThatsNice)) {
					System.out.println(logSuccess + " : " + exptxtThatsNice);
				} else {
					System.out.println(logFail + " Expected : " + exptxtThatsNice + " - Actual : " + actThatsNice);
				}

				String actShareOthers = Survey.get_txt_shareOthers().getText();
				if (actShareOthers.equals(expshareWithOther)) {
					System.out.println(logSuccess + " : " + expshareWithOther);
				} else {
					System.out.println(logFail + " Expected : " + expshareWithOther + " - Actual : " + actShareOthers);
				}

				if (Survey.isElementExist("Survey - Close button", "closeButton", 15)) {
					Survey.get_closeButton().click();
				} else {
					System.out.println("Close icon not found on survey popup");
				}

			} else {
				System.out.println("Thumbs image not displayed");
			}

		} else {
			System.out.println("Feedback popup do not open");
			//assertTrue(false);
		}

		// validate text

	}

	/**
	 * @throws InterruptedException ******************************************************************************************************************************/




	public void paymentPage_ADA5_GS99withOB(String PaymentOption) throws InterruptedException {
		Thread.sleep(10000L);
		assertTrue(DriverManager.getDriver().getTitle().contains("Pay"));
		System.out.println("Validated title : Pay");	

		PayP.moveToElement("Onetimepayment");

		PayP.isElementExist("paymentpage: Reminder", "PayReminder", 10);
		PayP.isElementExist("paymentpage: Select payment method ", "Selectpaymentmethod", 10);
		PayP.isElementExist("paymentpage: Gcash", "Gcash", 10);
		PayP.isElementExist("paymentpage: CCStraightpayment", "CCStraightpayment", 10);
		PayP.isElementExist("paymentpage: CCHSBC", "CCHSBC", 10);
		PayP.isElementExist("paymentpage: CCBPI", "CCBPI", 10);
		PayP.isElementExist("paymentpage: COD", "COD", 10);

		if(PaymentOption.equalsIgnoreCase("COD")) {
			PayP.js_clickOnElement("Button", "paymentpage: COD", "COD");
			PayP.isElementExist("paymentpage: PayOption Statement", "COD_Statment", 10);} 		
		else if(PaymentOption.equalsIgnoreCase("CCStraightpayment")) {
			PayP.js_clickOnElement("Button", "paymentpage: CCStraightpayment", "CCStraightpayment");
			PayP.isElementExist("paymentpage: PayOption Statement", "COD_Statment", 10);} 		
		else if(PaymentOption.equalsIgnoreCase("CCHSBC")) {
			PayP.js_clickOnElement("Button", "paymentpage: CCHSBC", "CCHSBC");
			PayP.isElementExist("paymentpage: PayOption Statement", "COD_Statment", 10);}  		
		else if(PaymentOption.equalsIgnoreCase("CCBPI")) {
			PayP.js_clickOnElement("Button", "paymentpage: CCBPI", "CCBPI");
			PayP.isElementExist("paymentpage: PayOption Statement", "COD_Statment", 10);} 		
		else if(PaymentOption.equalsIgnoreCase("Gcash")) {
			PayP.js_clickOnElement("Button", "paymentpage: Gcash", "Gcash");
			PayP.isElementExist("paymentpage: PayOption Statement", "COD_Statment", 10);}


		PayP.isElementExist("paymentpage: Onetimepayment", "Onetimepayment", 10);
		PayP.isElementExist("paymentpage: planApplicationHeader", "planApplicationHeader", 10);
		PayP.isElementExist("paymentpage: Colapsebutton1", "Colapsebutton1", 10);

		PayP.clickOnElement("Button", "paymentpage: Colapsebutton1", "Colapsebutton1");

		PayP.isElementExist("paymentpage: OBLabel", "OBLabel", 10);
		PayP.isElementExist("paymentpage: OBPrice", "OBPrice", 10);
		PayP.isElementExist("paymentpage: Planname", "Planname", 10);
		PayP.isElementExist("paymentpage: Planamount", "Planamount", 10);
		PayP.isElementExist("paymentpage: TotalAmountHeader", "TotalAmountHeader", 10);
		PayP.isElementExist("paymentpage: TotalAmount", "TotalAmount", 10);
		PayP.isElementExist("paymentpage: Gotapromocodeheader", "Gotapromocodeheader", 10);
		PayP.isElementExist("paymentpage: PromoClickhere", "PromoClickhere", 10);  		
		PayP.isElementExist("paymentpage: ShiptothisaddressHeader", "ShiptothisaddressHeader", 10);

		PayP.isElementExist("paymentpage: Submitbutton", "Submitbutton", 10);
		PayP.isElementExist("paymentpage: Monthlypayment", "Monthlypayment", 10);
		PayP.isElementExist("paymentpage: Noneedtopaythistoday", "Noneedtopaythistoday", 10);
		PayP.isElementExist("paymentpage: Planname1", "Planname1", 10);
		PayP.isElementExist("paymentpage: Addons", "Addons", 10);

		PayP.moveToElement("Onetimepayment");
		PayP.isElementExist("paymentpage: TotalMonthlybill", "TotalMonthlybill", 10);
		PayP.isElementExist("paymentpage: MonthlysvcplusAddons", "MonthlysvcplusAddons", 10);
		PayP.isElementExist("paymentpage: Tptalmonthlyamount", "Tptalmonthlyamount", 10);

		//PayP.isElementExist("paymentpage: Colapsebutton2", "Colapsebutton2", 10);
		//PayP.clickOnElement("Button", "paymentpage: Colapsebutton2", "Colapsebutton2");

		PayP.isElementExist("paymentpage: Colapsebutton1", "Colapsebutton1", 10);		
		PayP.js_clickOnElement("Button", "paymentpage: Colapsebutton1", "Colapsebutton1");

		PayP.isElementExist("paymentpage:", "GSADD", 10);
		//PayP.isElementExist("paymentpage:", "AmazonPrime", 10);


		PayP.js_clickOnElement("Button", "Payment", "Submitbutton");


	}
	
	public void OrderSummarySimOnly599() throws InterruptedException {
		
		
		if(OS.isElementExist("Acquisition Summary Text", "AcquisitionSummary", 10)) {
    		System.out.println("********************************We are in Order summary Page*************************");
    	}
    	
		OS.isElementExist("We Will Collect Payment Only When The Appication Is Approved Text", "WelCollectPayment", 10);
		OS.isElementExist("Order Summary Text", "OrderSummary", 10);
    	
    	if(OS.isElementExist("plan Name", "planName", 10)) {
    		String planName = OS.get_planName().getText();
    		System.out.println("Plan Name Selected: "+planName);
    	}
    	
    	OS.isElementExist("All Access Data", "AllAccessData", 10);
    	OS.isElementExist("GoWifi", "GoWifi", 10);
    	OS.isElementExist("Call And Text", "CallAndText", 10);
    	OS.isElementExist("Plan Inclusion", "PlanInclusion", 10);
    	OS.isElementExist("KonsultaMD", "KonsultaMD", 10);
    	OS.isElementExist("Addons Text", "Addons", 10);
    	OS.isElementExist("My SuperDuo", "MySuperDuo", 10);
    	OS.isElementExist("Amazon Prime Video", "AmazonPrimeVideo", 10);
    	OS.isElementExist("Viu Premium", "ViuPremium", 10);
    	//OS.isElementExist("Spotify Premium", "SpotifyPremium", 10);
    	OS.isElementExist("GOCALLIDD", "GOCALLIDD", 10);
    	OS.isElementExist("Easy Roam", "EasyRoam", 10);
    	OS.isElementExist("One Time Payment Text", "OneTimePaymentText", 10);
    	OS.isElementExist("PlanApplication", "PlanApplication", 10);
    	
    	if(OS.isElementExist("Plan Application Collapse Button", "PlanApplicationCollapseBtn", 10)) {
    		OS.js_clickOnElement("PlanApplicationCollapseBtn","PlanApplicationCollapseBtn", "PlanApplicationCollapseBtn");		
    	}
    	if(OS.isElementExist("Advance Monthly Service Charge", "AdvanceMonthlyServiceCharge", 10)) {
    		String AdvanceMonthlyServiceCharge = OS.get_AdvanceMonthlyServiceCharge().getText();
    		System.out.println("Advance Monthly Service Charge: "+AdvanceMonthlyServiceCharge);		
    	}
    	
    	if(OS.isElementExist("Shipping", "Shipping", 10)) {
    		String Shipping = OS.get_Shipping().getText();
    		System.out.println("Shipping: "+Shipping);		
    	}
    	if(OS.isElementExist("One Time Payment", "OneTimePayment", 10)) {
    		String OneTimePayment = OS.get_OneTimePayment().getText();
    		System.out.println("OneTimePayment: "+OneTimePayment);		
    	}
    	
    	OS.isElementExist("Got PromoCode", "GotPromoCode", 10);
    	OS.isElementExist("Ship To This Address Text", "ShipToThisAddressText", 10);
    	OS.isElementExist("Click Here Btn", "ClickHereBtn", 10);
    	
    	if(OS.isElementExist("Shipping Address", "ShippingAddress", 10)) {
    		String ShippingAddress = OS.get_ShippingAddress().getText();
    		System.out.println("ShippingAddress: "+ShippingAddress);		
    	}
    	
    	OS.isElementExist("Change Address Link", "ChangeAddress", 10);
    	OS.isElementExist("Monthly Payment Text", "MonthlyPayment", 10);
    	OS.isElementExist("Addons Text", "AddonsText", 10);
    	
    	if(OS.isElementExist("Addons Collapse Btn", "AddonscollapseBtn", 10)) {
    		OS.js_clickOnElement("AddonsCollapseBtn","AddonsCollapseBtn", "AddonscollapseBtn");		
    	}
    	
    	OS.isElementExist("My_SuperDuo", "My_SuperDuo", 10);
    	OS.isElementExist("Amazon_PrimeVideo", "Amazon_PrimeVideo", 10);
    	OS.isElementExist("Viu_Premium", "Viu_Premium", 10);
    	//OS.isElementExist("Spotify_Premium", "Spotify_Premium", 10);
    	OS.isElementExist("Easy_Roam", "Easy_Roam", 10);
    	OS.isElementExist("GOCALLIDD_199", "GOCALLIDD_199", 10);
    	
    	if(OS.isElementExist("Total_Addons", "Total_Addons", 10)) {
    		String Total_Addons = OS.get_Total_Addons().getText();
    		System.out.println("Total_Addons: "+Total_Addons);		
    	}
    	
    	if(OS.isElementExist("Total_MonthlyBill", "Total_MonthlyBill", 10)) {
    		String Total_MonthlyBill = OS.get_Total_MonthlyBill().getText();
    		System.out.println("Total_MonthlyBill: "+Total_MonthlyBill);		
    	}
    	
    	if(OS.isElementExist("Submit Order Button", "submitOrder", 10)) {
    		OS.js_clickOnElement("submitOrder","Submit Order Button", "submitOrder");		
    	} 
    	
    	Thread.sleep(5000);
	}

	//	Order summary page
	public void orderSummaryADA5_GS99withOB() throws InterruptedException {
		Thread.sleep(10000L);
		assertTrue(DriverManager.getDriver().getTitle().contains("Summary"));
		System.out.println("Validated title : Summary");	

		OS.isElementExist("Acquisition Summary", "acquisitionSummary", 10);
		OS.isElementExist("Build My Plan", "buildPlan", 10);
		OS.isElementExist("Fill Out", "fillOut", 10);
		OS.isElementExist("Review", "review", 10);
		OS.isElementExist("Pay", "pay", 10);
		OS.isElementExist("For Processing", "forProcessing", 10);
		OS.isElementExist("Notice Block", "noticeBlock", 10);
		OS.isElementExist("Go Icon Notice", "goIconGoNotice", 10);
		OS.isElementExist("Go Text Preamble", "goTextPreamble", 10);
		OS.isElementExist("Order summary", "orderSummary", 10);

		//OS.isElementExist("GSAD", "gSAD", 10);
		OS.isElementExist("Planname: GPlan Plus SIM-Only 999", "PlannameSim999", 10);

		OS.isElementExist("Access", "access", 10);
		OS.isElementExist("go Wifi", "Gowifi", 10);
		OS.isElementExist("Img Mobile", "imgMobile", 10);
		OS.isElementExist("Plan Conclusion", "planInclusion", 10);
		OS.isElementExist("Konsulta", "konsulta", 10);
		OS.isElementExist("Glnusure", "glnusure", 10);
		OS.isElementExist("Add ons", "addOns", 10);
		//OS.isElementExist("MyDuo1", "myDuo1", 10);
		//OS.isElementExist("MySuperduo", "MySuperduo", 10);
		//OS.isElementExist("APV", "aPV", 10);

		//OS.isElementExist("GSadd", "GSadd",10);
		OS.moveToElement("oneTimePayment");
		OS.isElementExist("One Time Payment", "oneTimePayment", 10);
		OS.isElementExist("Plan Application1", "planapplication1", 10);

		//			Plan Application Collapse Button 1  
		//OS.isElementExist("Pretermination Fee", "planapplicationcollapse1", 10);
		if (OS.isClickable("planapplicationcollapse1", 5)) {
			//OS.clickOnElement("Link", "PreterminationDropDown1", "planapplicationcollapse1");
			OS.moveToElement("planapplicationcollapse1");
			Thread.sleep(2000L);
			JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
			js.executeScript("arguments[0].click();", OS.get_planapplicationcollapse1());


		}

		//OB
		/*OS.isElementExist("Overdue balance", "OBLabel", 10);
		OS.isElementExist("Overdue balance price", "OBPrice", 10);

		OS.isElementExist("Advance Monthly", "advanceMonthly", 10);
		OS.isElementExist("Advance Monthly amount", "advanceMonthlyamount999", 10);

		//OS.isElementExist("textGplaWithDevice", "textGplanwithDiv", 10);
		OS.isElementExist("Plan Application: GPlan Plus SIM-Only 999", "PlanAppSimOnlyName", 10);

		OS.moveToElement("monthlyPayment");Thread.sleep(10000L);

		OS.isElementExist("Shipping", "shipping", 10);
		OS.isElementExist("Free", "free", 10);
		OS.isElementExist("plan Amount First", "planAmountfirst", 10);
		OS.isElementExist("Total Monthly Bill", "totalMonthlyBillSimOnly", 10);
		OS.isElementExist("Total amount pay", "totalamountpaySimOnly999", 10);
		OS.isElementExist("Promo Icon", "PromoIcon", 10);
		OS.isElementExist("Promo Code", "promoCode", 10);
		OS.isElementExist("Promo Click Here", "PromoClickHere", 10);
		OS.isClickable("PromoClickHere", 10);
		OS.isElementExist("Ship Icon", "shipicon", 10);
		OS.isElementExist("Shipping Adress", "shippingAdress", 10);
		OS.isElementExist("Change Adress", "changeAdress", 10);
		OS.isClickable("changeAdress", 10);
		OS.isElementExist("submit Order", "submitOrder", 10);

		//			Plan Application Collapse Button 2  
		//OS.isElementExist("Pretermination Fee", "plan Application Collapse Button2", 10);
		if (OS.isClickable("planapplicationcollapse1", 5)) {
			//OS.clickOnElement("Link", "plan Application Collapse Button2", "planApplicationcollapsebutton2");
			OS.moveToElement("planapplicationcollapse1");
			Thread.sleep(2000L);
			JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
			js.executeScript("arguments[0].click();", OS.get_planapplicationcollapse1());

		}

		OS.isElementExist("Monthly Payment", "monthlyPayment", 10);
		//OS.isElementExist("plan Action2", "planaction2", 10);
		//OS.isElementExist("GPlan With Device 599", "gplangpalnwithdevice599", 10);
		OS.isElementExist("Monthly Payment: No need to pay this today! This will be charged to your first bill.", "MonthlyPaySpiel", 10);
		OS.isElementExist("Monthly Planname: GPlan Plus SIM-Only 999", "MonthlyPaySimOnlyName", 10);
		OS.isElementExist("Monthly Planname Price", "MonthlyPay_PlanPrice", 10);

		OS.isElementExist("Add On Box", "addonbox", 10);
		OS.isElementExist("Add ons", "addons", 10);
		//OS.isElementExist("my Duo", "myDuo", 10);
		//OS.isElementExist("mysuper Duo", "mysuperduo", 10);
		//OS.isElementExist("Amazon Prime Video", "amazonprimeVideo", 10);
		OS.isElementExist("GS Add Surf99", "GS99",10);
		OS.isElementExist("GS Add Surf99", "GS99Price",10);
		OS.isElementExist("Total Addons", "totaladdons", 10);
		OS.isElementExist("Total Addons Price", "totalAddonsPrice", 10);
		OS.isElementExist("Monthly service", "monthlyservice", 10);
		OS.isElementExist("totalmontlyBillPayment", "totalmontlyBillPayment_1098", 10);*/

		if (OS.isClickable("submitOrder", 5)) {
			//OS.clickOnElement("Button", "NextIcon", "submitOrder");
			OS.js_clickOnElement("Button", "Submit Order Btn", "submitOrder");
		}

	}
	//*********************************************************************************************************************************** 


	public void validateOB() throws InterruptedException
	{
		Thread.sleep(5000L);
		Form.isElementExist("OB Modal: Img", "OB_Img", 10);
		Form.isElementExist("OB Modal: Pay the amount shown in the breakdown", "OB_Header", 10);
		Form.isElementExist("OB Modal: Before we can add an additional postpaid line, please pay the amount shown in the breakdown.", "OB_Spiel", 10);
		Form.isElementExist("OB Modal: View breakdown link", "OB_ViewBreakdown", 10);
		//Form.clickOnElement("link", "View Breakdown", "OB_ViewBreakdown");
		JavascriptExecutor jsb = (JavascriptExecutor) DriverManager.getDriver();
		jsb.executeScript("arguments[0].click();", Form.OB_ViewBreakdown());

		Form.isElementExist("OB Modal: Clobe button", "OBModal_Close", 10);
		Form.isElementExist("OB Modal: Here's the breakdown", "OBModal_HeresBreakdown", 10);
		Form.isElementExist("OB Modal: Overdue Balance Header", "OBModal_OBHeader", 10);
		Form.isElementExist("OB Modal: This is the amount from all your unpaid billing statements.", "OBModal_OBMsg", 10);
		//Form.clickOnElement("Toggle", "OB Price", "OBModal_OBPrice");
		JavascriptExecutor jsob = (JavascriptExecutor) DriverManager.getDriver();
		jsob.executeScript("arguments[0].click();", Form.get_OBModal_OBPrice());

		Form.isElementExist("OB Modal: OB Price", "OBModal_OBPrice", 10);
		Form.isElementExist("OB Modal: Mobile Number", "OBModal_OBMobileNum", 10);
		Form.isElementExist("OB Modal: OB MobileNum Price", "OBModal_OBMobileNum_Price", 10);
		Form.isElementExist("OB Modal: OB SubTotal", "OBModal_OBSubTotal", 10);
		Form.isElementExist("OB Modal: OB Overall Total", "OBModal_OBOverallTotal", 10);
		//Form.clickOnElement("Btn", "Close Btn", "OBModal_Close");
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("arguments[0].click();", Form.get_OBModal_Close());

		

	}

	public void validateEligibility_LoaderPage() throws InterruptedException
	{
		assertTrue(DriverManager.getDriver().getTitle().contains("Account Check"));
		System.out.println("Validated title : Account Check");	

		PageLoader.isElementExist("Loader: Loading Icon", "LoadingImg", 10);
		PageLoader.isElementExist("Loader: Loading Header", "LoadingHeader", 10);
		PageLoader.isElementExist("Loader: Loading Spiel", "LoadingMsg", 10);
		PageLoader.isElementExist("Loader: Loading Banner", "LoadingBanner", 10);

	}


	//*********************************************************************************************************************************** 
	public void NavigateTo_Apply_MobilePostpaid() throws InterruptedException {
		Thread.sleep(2000L);
		LP.moveToElement("link_Apply");
		Thread.sleep(2000L);
		LP.isElementExist("Mobile postpaid", "link_MobilePostpaid", 10);
		LP.isElementExist("View all devices", "link_ViewAllDevices", 10);

		if (LP.isClickable("link_MobilePostpaid", 5)) {
			LP.clickOnElement("Link", "Apply: Mobile Postpaid", "link_MobilePostpaid");
		}

		Thread.sleep(5000L);
		assertTrue(DriverManager.getDriver().getTitle().contains("Globe Plans and Postpaid Smartphones"));
		System.out.println("Validated title : [Mobile Postpaid Page] Globe Plans and Postpaid Smartphones");
	}

	public void NavigateTo_Apply_ViewAllDevices() throws InterruptedException {
		Thread.sleep(5000L);
		LP.moveToElement("link_Apply");
		Thread.sleep(3000L);
		LP.isElementExist("Mobile postpaid", "link_MobilePostpaid", 10);
		LP.isElementExist("View all devices", "link_ViewAllDevices", 10);

		if (LP.isClickable("link_ViewAllDevices", 10)) {
			LP.moveToElement("link_Apply");
			LP.clickOnElement("Link", "Apply: View All Devices", "link_ViewAllDevices");
		}

		Thread.sleep(5000L);
		assertTrue(DriverManager.getDriver().getTitle().contains("Postpaid Devices"));
		System.out.println("Validated title : Apply Device Gallery page");
	}

	public void NavigateTo_ApplyMenu() throws InterruptedException {
		Thread.sleep(2000L);
		LP.moveToElement("link_Apply");
		Thread.sleep(2000L);
		LP.isElementExist("Mobile postpaid", "link_MobilePostpaid", 10);
		LP.isElementExist("View all devices", "link_ViewAllDevices", 10);

		if (LP.isClickable("link_Apply", 10)) {
			Thread.sleep(5000L);
			LP.moveToElement("link_Apply");
			LP.clickOnElement("Link", "Apply Menu", "link_Apply");
		}

		Thread.sleep(5000L);
		assertTrue(DriverManager.getDriver().getTitle().contains("Globe Plans and Postpaid Smartphones"));
		System.out.println("Validated title : [MAIN LANDING PAGE] Globe Plans and Postpaid Smartphones");
	}

	public void ValidateMenu() {
		LP.isElementExist("Link Globe logo", "link_LogoGlobe", 10);
		LP.isElementExist("Menu bar link - Apply", "link_Apply", 10);
		LP.isElementExist("Menu bar link - Renew", "link_Renew", 10);
		LP.isElementExist("Menu bar link - Switch", "link_Switch", 10);
		LP.isElementExist("Menu bar link - Buy", "link_MenuBuy", 10);
		LP.isElementExist("Menu bar link - Help", "link_Help", 10);
		LP.isElementExist("Menu bar link - Cart Icon", "CartIcon", 10);
		LP.isElementExist("Menu bar link - Track my order", "link_TrackMyOrder", 10);
	}
	public void IacceptClick() throws InterruptedException {
		if (LP.isElementExist("Cookies Notification", "cookiesNotification", 10)) {
			if (LP.isClickable("privacyAccept", 5)) {
				LP.clickOnElement("Link", "privacy Accept", "privacyAccept");
			}
		}
	}

	public void SelectPlanType(String plan) {
		LP.clickOnElement("Listbox", "Gplan with Device", "gplanWithDevice");
		LP.isElementExist("GPlan with Device", "gplanWithDevice", 10);
		LP.isElementExist("GPlan with GCash", "gplanWithGCash", 10);
		LP.isElementExist("GPlan Plus SIM-Only", "gplanPlusSIMOnly", 10);
		LP.isElementExist("GPlan SIM-Only All Data", "gplanSIMOnlyAllData", 10);

		if(plan.equalsIgnoreCase("GCash")) {
			LP.clickOnElement("Listbox", "Gplan with GCash", "gplanWithGCash");
		}
		else if(plan.equalsIgnoreCase("Sim Only")) {
			LP.clickOnElement("Listbox", "Gplan with Sim Only", "gplanPlusSIMOnly");
		}
		else if(plan.equalsIgnoreCase("All Data")) {
			LP.clickOnElement("Listbox", "Gplan with All Data", "gplanSIMOnlyAllData");
		}
		else {
			LP.clickOnElement("Listbox", "Gplan with Device", "gplanWithDevice");
		}
	}
	/********************************************************************************************************************************/	


	/************************************************************************************************************************/

	public void menuBar() throws Exception {

		// step 1
		LP.isElementExist("Link Globe logo", "link_LogoGlobe", 10);
		LP.isElementExist("Menu bar link - Apply", "link_Apply", 10);
		LP.isElementExist("Menu bar link - Renew", "link_Renew", 10);
		LP.isElementExist("Menu bar link - Switch", "link_Switch", 10);
		LP.isElementExist("Menu bar link - Buy", "link_MenuBuy", 10);
		LP.isElementExist("Menu bar link - Help", "link_Help", 10);
		LP.isElementExist("Menu bar link - Cart Icon", "CartIcon", 10);
		LP.isElementExist("Menu bar link - Track my order", "link_TrackMyOrder", 10);

		// step 2 : Hover on Apply button
		LP.moveToElement("link_Apply");

		LP.isElementExist("Mobile postpaid", "link_MobilePostpaid", 10);
		LP.isElementExist("View all devices", "link_ViewAllDevices", 10);

		
		if (LP.isClickable("link_MobilePostpaid", 5)) {
			LP.clickOnElement("Link", "Mobile postpaid", "link_MobilePostpaid");
		}

		// step 5: validating redirection of View All Devices
		LP.moveToElement("link_Apply");
		Thread.sleep(2000L);
		LP.isElementExist("View all devices", "link_ViewAllDevices", 10);

		// Clicking on View all devices
		if (LP.isClickable("link_ViewAllDevices", 5)) {
			LP.clickOnElement("Link", "View all devices", "link_ViewAllDevices");
			Thread.sleep(2000L);
		}
		LP.isElementExist("Postpaid Devices", "postpaidDevices", 10);
		LP.isElementExist("Filters", "filters", 10);

	}
	/********************************************************************************************************************************/

	public void apply_LandingPage() throws Exception {
		// step 6 : Go to Apply Landing Page
		LP.isElementExist("Menu bar link - Apply", "link_Apply", 10);
		Thread.sleep(2000L);
		if (LP.isClickable("link_Apply", 5)) {
			Thread.sleep(2000L);
			LP.clickOnElement("Link", "Apply", "link_Apply");
		}

		// step 7: validating Apply Landing Page
		LP.isElementExist("Postpaid Plans and Smartphones", "postpaidPlansAndSmartphones", 10);
		LP.isElementExist("Picking the right plan isn�t rocket science", "pickingTheRightPlanBanner", 10);
		LP.isElementExist("Shopping", "shopping", 10);
		LP.isElementExist("Social", "social", 10);
		LP.isElementExist("Videos", "videos", 10);
		LP.isElementExist("Music", "music", 10);
		LP.isElementExist("Work", "work", 10);
		LP.isElementExist("Games", "games", 10);
		LP.isElementExist("customSlider", "customSlider", 10);
		LP.isElementExist("How often do you watch live selling videos", "HowOftenDoYou", 10);
		LP.isElementExist("Rarely", "rarely", 10);
		LP.isElementExist("Occasionally", "occasionally", 10);
		LP.isElementExist("Sometimes", "sometimes", 10);
		LP.isElementExist("Always", "always", 10);
		LP.isElementExist("TellMeabout", "tellMeabout", 10);
		LP.isElementExist("introduction-block", "introductionBlock", 10);
		LP.isElementExist("Plan styles for all lifestyles", "planStylesForAll", 10);
		Thread.sleep(3000);
		((JavascriptExecutor) DriverManager.getDriver()).executeScript(
		"arguments[0].scrollIntoView(true);", LP.get_starter());
		/*LP.isElementExist("Starter", "starter", 10);
		LP.isElementExist("Lite", "lite", 10);
		JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
		js1.executeScript("arguments[0].click();", LP.get_owlnext());
		LP.isElementExist("Basic", "basic", 10);
		LP.scroll_vertical(409);
		LP.isElementExist("NextIcon", "owlnext", 10);

		

		for (int i = 0; i < 3; i++) {
			if (LP.isClickable("owlnext", 5)) {
				Thread.sleep(5000L);
				LP.scroll_vertical(2000);
				JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
				js.executeScript("arguments[0].click();", LP.get_owlnext());
			}
		}

		LP.isElementExist("Previousicon", "previousicon", 10);
		LP.isElementExist("Value", "value", 10);
		LP.isElementExist("Essential", "essential", 10);
		LP.isElementExist("Plus", "plus", 10);

		for (int i = 0; i < 2; i++) {
			if (LP.isClickable("owlnext", 5)) {
				Thread.sleep(5000L);
				LP.scroll_vertical(2000);
				JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
				js.executeScript("arguments[0].click();", LP.get_owlnext());

			}
		}

		LP.isElementExist("Extra", "extra", 10);
		
		((JavascriptExecutor) DriverManager.getDriver()).executeScript(
		"arguments[0].scrollIntoView(true);", LP.get_previousicon());
		
		Thread.sleep(3000);
		
		for (int i = 0; i <=6; i++) {
			if (LP.isClickable("previousicon", 5)) {
				Thread.sleep(5000L);
				JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
				js.executeScript("arguments[0].click();", LP.get_previousicon());
			}
		}*/
		
		}
	
	/********************************************************************************************************************************/
	// step 8 : validating Build My Plan
	public void buildMyPlan() {
		LP.isElementExist("Build my plan", "link_buildMyPlan", 10);
	}
	/**
	 * @throws InterruptedException ******************************************************************************************************************************/
	public void selectAPlanWithalldata1799() throws InterruptedException
	{
		Thread.sleep(5000);
		if (LP.isElementExist("All Data", "gplanAllData", 10)) {
			LP.clickOnElement("Button", "gplanSIMOnlyAllData", "gplanSIMOnlyAllData");
		}

	}
	// step 9: validating FAQ
	public void FAQ() throws InterruptedException {

		// Faq1 exists
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("arguments[0].click();", LP.get_acccordionButton1());
		LP.isElementExist("What is Globe", "faqText1", 10);		
		//LP.isElementExist("acccordionText1", "acccordionText1", 10);
		LP.scroll_vertical(4053);

		js.executeScript("arguments[0].click();", LP.get_acccordionButton2());
		LP.isElementExist("What are the requirements", "faqText2", 10);	
		//LP.isElementExist("acccordionText2", "acccordionText2", 10);
		LP.scroll_vertical(4300);

		js.executeScript("arguments[0].click();", LP.get_acccordionButton3());
		LP.isElementExist("How to upload your IDs", "faqText3", 10);
		//LP.isElementExist("acccordionText3", "acccordionText3", 10);
		LP.scroll_vertical(4600);

		js.executeScript("arguments[0].click();", LP.get_acccordionButton4());
		LP.isElementExist("What IDs are accepted", "faqText4", 10);
		//LP.isElementExist("acccordionText4", "acccordionText4", 10);
		LP.scroll_vertical(5000);

		js.executeScript("arguments[0].click();", LP.get_acccordionButton5());
		LP.isElementExist("What documents are accepted", "faqText5", 10);
		//LP.isElementExist("acccordionText5", "acccordionText5", 10);
		LP.scroll_vertical(5500);

		js.executeScript("arguments[0].click();", LP.get_acccordionButton6());
		LP.isElementExist("Are there additional requirements for foreign applicants?", "faqText6", 10);
		//LP.isElementExist("acccordionText6", "acccordionText6", 10);
		LP.scroll_vertical(5800);

	}
	/********************************************************************************************************************************/
	// step 10: select a plan in dropdown
	public void selectAPlan() {
		LP.isElementExist("GPlan with Device", "gplanWithDevice", 10);
		LP.isElementExist("GPlan with GCash", "gplanWithGCash", 10);
		LP.isElementExist("GPlan Plus SIM-Only", "gplanPlusSIMOnly", 10);
		LP.isElementExist("GPlan SIM-Only All Data", "gplanSIMOnlyAllData", 10);
		if (LP.isClickable("gplanPlusSIMOnly", 5)) {
			LP.clickOnElement("Button", "GPlan Sim only", "gplanPlusSIMOnly");
		}




	}
	//*********************************************************************************************************************************** 

	public void PDPGplanwithalldata1799() throws Exception {
		PP.isElementExist("Device", "PDP_Device", 10);
		PP.isElementExist("Gcash", "PDP_Gcash", 10);
		PP.isElementExist("Simonly", "PDP_Simonly", 10);
		PP.isElementExist("AllData", "PDP_Alldata", 10);
		Thread.sleep(3000L);
		PP.clickOnElement("AllData", "PDP_Alldata", "PDP_Alldata");

		PP.isElementExist("Gplan plus sim only 1799", "Gplan1799", 10);
		PP.isElementExist("Contract_duration", "Contractduration_header", 10);

		//Data Addon
		PP.isElementExist("Dataaddon", "Data_addon", 10);
		LP.scroll_vertical(353);
		Thread.sleep(3000L);
		PP.moveToElement("Data_checkbox");
		//PP.clickOnElement("Button", "Togglebutton", "Data_checkbox");
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("arguments[0].click();", PP.get_Data_checkbox());                 

		PP.isElementExist("GS99", "GSAddsurf99", 10);
		PP.clickOnElement("Button", "GSAddsurf99", "GSAddsurf99");

		//WebElement ele=DriverManager.getDriver().findElement(By.xpath("(//img[@class='bg-images grey-image'])[1]"));
  		//if(ele.isDisplayed()) {
  			//ele.click();
  		//}
		
		if(PP.isElementExist("Youtube Addon", "YoutubeAddon", 10)) {
  			PP.js_clickOnElement("Button", "Youtube Addon", "YoutubeAddon");
  		}
  		
  		Thread.sleep(5000);

		//Movies Addon
		PP.isElementExist("Moveaddon", "movie_addon", 10);
		LP.scroll_vertical(253);
		Thread.sleep(3000L);
		PP.moveToElement("movie_checkbox");
		//PP.clickOnElement("Button", "Togglebutton", "movie_checkbox");
		JavascriptExecutor js2 = (JavascriptExecutor) DriverManager.getDriver();
		js2.executeScript("arguments[0].click();", PP.get_movie_checkbox());                 

		PP.isElementExist("Amazon", "Amazonprime", 10);
		PP.isElementExist("Viu", "Viupremium", 10);
		PP.isElementExist("Spotify", "Spotifypremium", 10);
		PP.clickOnElement("Button", "Amazon", "Amazonprime");

		//Message Addon
		PP.isElementExist("messageaddon", "message_addon", 10);
		LP.scroll_vertical(253);
		Thread.sleep(3000L);
		PP.moveToElement("message_checkbox");
		//PP.clickOnElement("Button", "Togglebutton", "message_checkbox");
		JavascriptExecutor js3 = (JavascriptExecutor) DriverManager.getDriver();
		js3.executeScript("arguments[0].click();", PP.get_message_checkbox());                 

		PP.isElementExist("MyDuo", "MyDuo", 10);
		PP.isElementExist("MySuperDuo", "MySuperDuo", 10);
		PP.clickOnElement("Button", "MySuperDuo", "MySuperDuo");

		//Lifestyle Addon
		PP.isElementExist("lifestyleaddon", "lifestyle_addon", 10);
		LP.scroll_vertical(253);
		Thread.sleep(3000L);
		PP.moveToElement("lifestyle_checkbox");
		//PP.clickOnElement("Button", "Togglebutton", "lifestyle_checkbox");
		JavascriptExecutor js4 = (JavascriptExecutor) DriverManager.getDriver();
		js4.executeScript("arguments[0].click();", PP.get_lifestyle_checkbox());



		PP.isElementExist("easyRoam", "easyRoam", 10);
		PP.isElementExist("Gocallid199", "Gocallid199", 10);

		PP.isElementExist("Banner", "Banner2", 10);
		PP.isElementExist("Review", "Reviewmyplan", 10);
		PP.clickOnElement("Button", "dragbtn", "Dragbutton");
		Thread.sleep(1000);


		//PP.clickOnElement("Button", "Reviewmyplan", "Reviewmyplan");
		//					   		PP.isElementExist("lifestyleaddon", "Viewplanbreakdwn", 10);
		//					  		PP.clickOnElement("Button", "Dropdown", "dropdown_Planbreakdwn");	
		//					  	
		//					  		 //ViewBreakdown

		Thread.sleep(6000);
		PP.isElementExist("Planname", "Planname1799", 10);//
		PP.isElementExist("Planamount", "planeamount1799", 10);//
		PP.isElementExist("subs", "Subsandaddonheader", 10);
		PP.isElementExist("MyDuosuper", "mysuper", 10);
		PP.isElementExist("Amazon", "AmazonAddon", 10);
		PP.isElementExist("gs add surf", "SURF", 10);

		PP.isElementExist("Totalsubs", "Totalsubsandaddons", 10);
		PP.isElementExist("totalsubsaddon", "Totalsubsandaddons_amont", 10);
		PP.isElementExist("MothlyBillheader", "Monthlybill_header", 10);

		PP.isElementExist("Monthlybillamnt", "monthlybillpay1799", 10);//
		PP.isElementExist("Monthlypaymnt", "Monthly_payment", 10);
		PP.isElementExist("Monthlypaymentamount", "monthlypaymentamount1799", 10);//

	}	
	//********************************************************************//


	/**************************************************/
	public void Discover_pagepluse()
	{
		//							PP.isElementExist("Starterheader", "Starter_header", 10);
		//							PP.isElementExist("WithDevice", "Device_strtr_btn", 10);
		//							PP.isElementExist("Gcash", "GCash_strtr_btn", 10);
		PP.isElementExist("Banner1", "Bannerplus1", 10);
		PP.isElementExist("Banner2", "Bannerplus2", 10);
		PP.isElementExist("Banner3", "Bannerplus3", 10);
		PP.isElementExist("Banner4", "Bannerplus4", 10);
		PP.isElementExist("Banner5", "Bannerplus5", 10);
		PP.isElementExist("Banner6", "Bannerplus6", 10);
		PP.isElementExist("Banner7", "Bannerplus7", 10);
		PP.isElementExist("Banner8", "Bannerplus8", 10);
		PP.isElementExist("Banner9", "Bannerplus9", 10);

	}

	/********************************************************************************************************************************/
	public void selectAPlanWithDevice() {
		if (LP.isClickable("gplanWithDevice", 5)) {
			LP.clickOnElement("Button", "gplanWithDevice", "gplanWithDevice");
		}
		//LP.isElementExist("GPlan 599 with Device", "Gplanwithdevice599", 10);

	}
	public void Discover_Page()
	{
		PP.isElementExist("Starterheader", "Starter_header", 10);
		PP.isElementExist("WithDevice", "Device_strtr_btn", 10);
		PP.isElementExist("Gcash", "GCash_strtr_btn", 10);
		PP.isElementExist("Banner1", "starterbanner1", 10);
		PP.isElementExist("Banner2", "starterbanner2", 10);
		PP.isElementExist("Banner3", "starterbanner3", 10);
		PP.isElementExist("Banner4", "starterbanner4", 10);
		PP.isElementExist("Banner5", "starterbanner5", 10);
		PP.isElementExist("Banner6", "starterbanner6", 10);
		PP.isElementExist("Banner7", "starterbanner7", 10);
		PP.isElementExist("Banner8", "starterbanner8", 10);

	}
	//*********************************************************************************************************************************** 
	public void PDPGplanwithDevice599() throws Exception {
		PP.isElementExist("Device", "PDP_Device", 10);
		PP.isElementExist("Gcash", "PDP_Gcash", 10);
		PP.isElementExist("Simonly", "PDP_Simonly", 10);
		PP.isElementExist("AllData", "PDP_Alldata", 10);

		PP.isElementExist("selectedwithDevice599", "Price_599", 10);
		PP.isElementExist("Color", "Color_header", 10);		
		PP.isElementExist("Capacity", "Capacity_header", 10);
		PP.isElementExist("Contract_duration", "Contractduration_header", 10);

		//Data Addon
		PP.isElementExist("Dataaddon", "Data_addon", 10);
		LP.scroll_vertical(353);
		Thread.sleep(3000L);
		PP.moveToElement("Data_checkbox");
		//PP.clickOnElement("Button", "Togglebutton", "Data_checkbox");
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("arguments[0].click();", PP.get_Data_checkbox());                 

		PP.isElementExist("GS99", "GSAddsurf99", 10);
		PP.clickOnElement("Button", "GSAddsurf99", "GSAddsurf99");

		//Banner
		PP.isElementExist("withDevice_Banner", "Banner", 10);

		//Movies Addon
		PP.isElementExist("Moveaddon", "movie_addon", 10);
		LP.scroll_vertical(253);
		Thread.sleep(3000L);
		PP.moveToElement("movie_checkbox");
		//PP.clickOnElement("Button", "Togglebutton", "movie_checkbox");
		JavascriptExecutor js2 = (JavascriptExecutor) DriverManager.getDriver();
		js2.executeScript("arguments[0].click();", PP.get_movie_checkbox());                 

		PP.isElementExist("Amazon", "Amazonprime", 10);
		PP.isElementExist("Viu", "Viupremium", 10);
		PP.isElementExist("Spotify", "Spotifypremium", 10);
		PP.clickOnElement("Button", "Amazon", "Amazonprime");

		//Message Addon
		PP.isElementExist("messageaddon", "message_addon", 10);
		LP.scroll_vertical(253);
		Thread.sleep(3000L);
		PP.moveToElement("message_checkbox");
		//PP.clickOnElement("Button", "Togglebutton", "message_checkbox");
		JavascriptExecutor js3 = (JavascriptExecutor) DriverManager.getDriver();
		js3.executeScript("arguments[0].click();", PP.get_message_checkbox());                 

		PP.isElementExist("MyDuo", "MyDuo", 10);
		PP.isElementExist("MySuperDuo", "MySuperDuo", 10);
		PP.clickOnElement("Button", "MySuperDuo", "MySuperDuo");

		//Lifestyle Addon
		PP.isElementExist("lifestyleaddon", "lifestyle_addon", 10);
		LP.scroll_vertical(253);
		Thread.sleep(3000L);
		PP.moveToElement("lifestyle_checkbox");
		//PP.clickOnElement("Button", "Togglebutton", "lifestyle_checkbox");
		JavascriptExecutor js4 = (JavascriptExecutor) DriverManager.getDriver();
		js4.executeScript("arguments[0].click();", PP.get_lifestyle_checkbox());



		PP.isElementExist("easyRoam", "easyRoam", 10);
		PP.isElementExist("Gocallid199", "Gocallid199", 10);

		PP.isElementExist("Review", "Reviewmyplan", 10);
		PP.clickOnElement("Button", "dragbtn", "Dragbutton");
		Thread.sleep(1000);


		//PP.clickOnElement("Button", "Reviewmyplan", "Reviewmyplan");
		//					   		PP.isElementExist("lifestyleaddon", "Viewplanbreakdwn", 10);
		//					  		PP.clickOnElement("Button", "Dropdown", "dropdown_Planbreakdwn");	
		//					  	
		//					  		 //ViewBreakdown
		PP.isElementExist("Planname", "Planname", 10);
		PP.isElementExist("Planamount", "Plan_amount", 10);
		PP.isElementExist("subs", "Subsandaddonheader", 10);
		PP.isElementExist("MyDuo", "MyDuoaddon", 10);
		PP.isElementExist("Amazon", "AmazonAddon", 10);
		PP.isElementExist("Totalsubs", "Totalsubsandaddons", 10);
		PP.isElementExist("totalsubsaddon", "Totalsubsandaddons_amont", 10);
		PP.isElementExist("MothlyBillheader", "Monthlybill_header", 10);
		PP.isElementExist("Monthlybillamnt", "Monthlybill_amount", 10);
		PP.isElementExist("Monthlypaymnt", "Monthly_payment", 10);
		PP.isElementExist("Monthlypaymentamount", "Monthlypayment_amount", 10);

	}	
	//*********************************************************************************************************************************** 

	public void searchDevice() throws Exception {
		Thread.sleep(5000);

		PP.get_PdpSearchfield().sendKeys("Xiaomi 11T 5G");

		Thread.sleep(3000);

		PP.isElementExist("SearchField", "PdpSearchfield", 10);

		PP.get_PdpSearchfield().sendKeys(Keys.ENTER);
		Thread.sleep(5000);
	}
	
	public void PDPGplanwithDevice599ADA2() throws Exception {
		PP.isElementExist("Device", "PDP_Device", 10);
		PP.isElementExist("Gcash", "PDP_Gcash", 10);
		PP.isElementExist("Simonly", "PDP_Simonly", 10);
		PP.isElementExist("AllData", "PDP_Alldata", 10);

		PP.isElementExist("selectedwithDevice599", "Price_599", 10);
		PP.isElementExist("Color", "Color_header", 10);		
		PP.isElementExist("Capacity", "Capacity_header", 10);
		PP.isElementExist("Contract_duration", "Contractduration_header", 10);

		
		 if(PP.isElementExist("Preper_esim_PhysicalSim", "Preper_esim_PhysicalSim", 10)) {
				Thread.sleep(3000);
				PP.jsClick("esim", "esim");	
			}
			
		//Data Addon
		PP.isElementExist("Dataaddon", "Data_addon", 10);
		LP.scroll_vertical(353);
		Thread.sleep(3000L);
		PP.moveToElement("Data_checkbox");
		//PP.clickOnElement("Button", "Togglebutton", "Data_checkbox");
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("arguments[0].click();", PP.get_Data_checkbox());                 

		PP.isElementExist("GS99", "GSAddsurf99", 10);
		//PP.clickOnElement("Button", "GSAddsurf99", "GSAddsurf99");

		JavascriptExecutor js99 = (JavascriptExecutor) DriverManager.getDriver();
		js99.executeScript("arguments[0].click();", PP.get_GSAddsurf99());                 

		//Banner
		PP.isElementExist("withDevice_Banner", "Banner", 10);

		//Movies Addon
		PP.isElementExist("Moveaddon", "movie_addon", 10);
		LP.scroll_vertical(253);
		Thread.sleep(3000L);
		PP.moveToElement("movie_checkbox");
		//PP.clickOnElement("Button", "Togglebutton", "movie_checkbox");
		JavascriptExecutor js2 = (JavascriptExecutor) DriverManager.getDriver();
		js2.executeScript("arguments[0].click();", PP.get_movie_checkbox());                 

		PP.isElementExist("Amazon", "Amazonprime", 10);
		PP.isElementExist("Viu", "Viupremium", 10);
		PP.isElementExist("Spotify", "Spotifypremium", 10);
		//PP.clickOnElement("Button", "Amazon", "Amazonprime");
		JavascriptExecutor jsa = (JavascriptExecutor) DriverManager.getDriver();
		jsa.executeScript("arguments[0].click();", PP.get_Amazonprime());                 


		//Message Addon
		PP.isElementExist("messageaddon", "message_addon", 10);
		LP.scroll_vertical(253);
		Thread.sleep(3000L);
		PP.moveToElement("message_checkbox");
		//PP.clickOnElement("Button", "Togglebutton", "message_checkbox");
		JavascriptExecutor js3 = (JavascriptExecutor) DriverManager.getDriver();
		js3.executeScript("arguments[0].click();", PP.get_message_checkbox());                 

		PP.isElementExist("MyDuo", "MyDuo", 10);
		PP.isElementExist("MySuperDuo", "MySuperDuo", 10);
		//PP.clickOnElement("Button", "MySuperDuo", "MySuperDuo");
		JavascriptExecutor jssuper = (JavascriptExecutor) DriverManager.getDriver();
		jssuper.executeScript("arguments[0].click();", PP.get_MySuperDuo());                 


		//Lifestyle Addon
		PP.isElementExist("lifestyleaddon", "lifestyle_addon", 10);
		LP.scroll_vertical(253);
		Thread.sleep(3000L);
		PP.moveToElement("lifestyle_checkbox");
		//PP.clickOnElement("Button", "Togglebutton", "lifestyle_checkbox");
		JavascriptExecutor js4 = (JavascriptExecutor) DriverManager.getDriver();
		js4.executeScript("arguments[0].click();", PP.get_lifestyle_checkbox());



		PP.isElementExist("easyRoam", "easyRoam", 10);
		PP.isElementExist("Gocallid199", "Gocallid199", 10);

		PP.isElementExist("Review", "Reviewmyplan", 10);
		//PP.clickOnElement("Button", "dragbtn", "Dragbutton");
		JavascriptExecutor jsd = (JavascriptExecutor) DriverManager.getDriver();
		jsd.executeScript("arguments[0].click();", PP.get_Dragbutton());


		Thread.sleep(1000);


		//PP.clickOnElement("Button", "Reviewmyplan", "Reviewmyplan");
		//					   		PP.isElementExist("lifestyleaddon", "Viewplanbreakdwn", 10);
		//					  		PP.clickOnElement("Button", "Dropdown", "dropdown_Planbreakdwn");	
		//					  	
		//					  		 //ViewBreakdown
		PP.isElementExist("Planname", "Planname", 10);
		//String productname=PP.get_Planname().getAttribute("value");
		PP.isElementExist("Planamount", "Plan_amount", 10);
		PP.isElementExist("subs", "Subsandaddonheader", 10);
		PP.isElementExist("MyDuo", "MyDuoaddon", 10);
		PP.isElementExist("Amazon", "AmazonAddon", 10);
		PP.isElementExist("Totalsubs", "Totalsubsandaddons", 10);
		PP.isElementExist("totalsubsaddon", "Totalsubsandaddons_amont", 10);
		PP.isElementExist("MothlyBillheader", "Monthlybill_header", 10);
		PP.isElementExist("Monthlybillamnt", "Monthlybill_amount", 10);
		PP.isElementExist("Monthlypaymnt", "Monthly_payment", 10);
		PP.isElementExist("Monthlypaymentamount", "Monthlypayment_amount", 10);
		
		//Constant.dataMap.get().put("OMT_ProductName", productname);

	}	
	//*********************************************************************************************************************************** 

	public void WithDevice_Breakdown() {

		PP.isElementExist("Allaccessdata", "Allaccess_data", 10);
		PP.isElementExist("Gowifiaccess", "Gowifi_access", 10);
		//PP.isElementExist("List", "List_ul", 10);
		//PP.isElementExist("CashoutHeader", "Monthlycashout_header", 10);

		//PP.isElementExist("selectedwithDevice599", "Plan_name", 10);
		//PP.isElementExist("price", "Plan_price", 10);		
		PP.isElementExist("Addonheader", "Addonsheader", 10);
		PP.isElementExist("Monthly_header", "Monthlybillheader", 10);

	}
	//************************************//
	public void insert_phoneNo(String phoneNo)
			throws Exception {

		//Constant.dataMap.set(Map);
		//Constant.dataMap.set(Constant.LinkedMap);
		PP.get_Mobilenumfield().clear();
		PP.get_Mobilenumfield().sendKeys(phoneNo);
		System.out.println("Inserted mobile no : " + phoneNo);
		PP.scroll_vertical(600);
		Constant.dataMap.get().put("GO_MobileNumber", phoneNo);
	}

	/********************************************************************************************************************************/
	public void resendOTP() throws Exception {

		for (int i = 1; i <= 15; i++) {
			checkout.scroll_vertical(300);
			if (!isAttribtuePresent(checkout.get_btn_resendOPT(), "disabled")) {
				System.out.println("Resend OTP button gets enabled");

				Thread.sleep(2000L);
				checkout.get_btn_resendOPT().click();
				Thread.sleep(2000L);
				System.out.println("Clicked on Resend OTP button");

				if (checkout.isElementExist("Resend OTP - Confirmation", "confirmationResendOTP", 20)) {
					System.out.println("Got the confirmation for Resend OTP");
				} else {
					System.out.println("Did not got the confirmation for Resend OTP in given time");
				}

				break;
			} else {
				Thread.sleep(3000L);
				System.out.println("Waiting for Resend OTP button to get enabled. Seconds Elapsed : " + (i * 3));
			}
		}
	}
	private boolean isAttribtuePresent(WebElement get_btn_resendOPT, String string) {
		// TODO Auto-generated method stub
		return false;
	}
	//*********************************************************************//
	public void Eligibility_checkPageloader()
	{

	}

	public void  validate_plan_breakdown1799() throws InterruptedException
	{
		//PP.get_Mobilenumfield();
		Thread.sleep(10000);
		PP.isElementExist("Mobilenumberprefilled ", "Breakdown_Mobilenum", 10);
		PP.isElementExist("Planname", "planename1799", 10);
		PP.isElementExist("Planamount", "planeamount1799", 10);
		PP.isElementExist("subs", "Subsandaddonheader", 10);
		PP.isElementExist("MysuperDuo", "mysuper", 10);
		PP.isElementExist("Amazon", "AmazonAddon", 10);
		PP.isElementExist("GSADD SURF", "SURF", 10);
		PP.isElementExist("Totalsubs", "Totalsubsandaddons", 10);
		PP.isElementExist("totalsubsaddon", "Totalsubsandaddons_amont", 10);
		PP.isElementExist("MothlyBillheader", "Monthlybill_header", 10);
		PP.isElementExist("Monthlybillamnt", "monthlybillpay1799", 10);
		PP.isElementExist("Monthlypaymnt", "Monthly_payment", 10);
		PP.isElementExist("Monthlypaymentamount", "monthlypaymentamount1799", 10);

		//						    	PP.isElementExist("Device", "Device", 10);
		//						    	PP.isElementExist("Devicename", "Devicename", 10);
		//						    	PP.isElementExist("planname", "Planname", 10);
		//						    	PP.isElementExist("Devicedetails", "Devicedetails", 10);
		//						    	PP.isElementExist("Adonchechbox1", "Checkbox1", 10);
		//						    	PP.isElementExist("Adonchechbox2", "Checkbox2", 10);
		//						    	PP.isElementExist("Adonchechbox3", "Checkbox3", 10);
		//						    	PP.isElementExist("Adonchechbox4", "Checkbox4", 10);
		//						    	PP.isElementExist("Adonchechbox5", "Checkbox5", 10);
		//						    	PP.isElementExist("Proccedmyplan", "ProccedwithMyplan", 10);
		//						    	PP.get_checkbox1();
		//						    	PP.get_checkbox2();
		//						    	PP.get_checkbox3();
		//						    	PP.get_checkbox4();
		//						    	PP.get_checkbox5();
		//						   	
	}
	public void orderSummaryGplan_withall_data1799() throws InterruptedException {
		//OS.isElementExist("Cookies Notification", "cookiesNotification", 10);
		//OS.isElementExist("Privacy Accept", "privacyAccept", 10);
		OS.isElementExist("Acquisition Summary", "acquisitionSummary", 10);
		OS.isElementExist("Build My Plan", "buildPlan", 10);
		OS.isElementExist("Fill Out", "fillOut", 10);
		OS.isElementExist("Review", "review", 10);
		OS.isElementExist("Pay", "pay", 10);
		OS.isElementExist("For Processing", "forProcessing", 10);
		OS.isElementExist("Notice Block", "noticeBlock", 10);
		OS.isElementExist("Go Icon Notice", "goIconGoNotice", 10);
		OS.isElementExist("Go Text Preamble", "goTextPreamble", 10);
		OS.isElementExist("Order summary", "orderSummary", 10);
		OS.isElementExist("GSAD", "gsad6", 10);//

		OS.isElementExist("Access", "access", 10);
		OS.isElementExist("go Wifi", "Gowifi", 10);
		OS.isElementExist("Img Mobile", "imgMobile", 10);
		OS.isElementExist("Plan Conclusion", "planInclusion", 10);
		OS.isElementExist("Konsulta", "konsulta", 10);
		OS.isElementExist("Glnusure", "glnusure", 10);
		OS.isElementExist("Add ons", "addOns", 10);
		//OS.isElementExist("MyDuo1", "myDuo1", 10);

		OS.isElementExist("MySuperduo", "MySuperduo", 10);
		OS.isElementExist("APV", "aPV", 10);
		OS.isElementExist("GSadd", "GSadd",10);

		OS.isElementExist("One Time Payment", "oneTimePayment", 10);
		OS.isElementExist("Plan Application1", "planapplication1", 10);

		//			Plan Application Collapse Button 1  
		OS.isElementExist("Pretermination Fee collapse1", "planapplication1", 10);
		if (OS.isClickable("planapplication1", 5)) {
			Thread.sleep(2000L);
			//OS.clickOnElement("Link", "planapplication1", "planapplication1");
			//									OS.moveToElement("planapplicationcollapse1");
			//									Thread.sleep(2000L);
			JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
			js.executeScript("arguments[0].click();", OS.get_planapplication1());


		}
		OS.isElementExist("Advance Monthly", "advanceMonthly", 10);
		OS.isElementExist("Advance Monthly amount", "advancempnthlyamount1799", 10);//
		
		OS.isElementExist("submit Order", "submitOrder", 10);

		OS.isElementExist("Monthly Payment", "monthlyPayment", 10);
		OS.isElementExist("GPlan With all data", "gplangpalnwithalldata", 10);//
		OS.isElementExist("Add ons", "addons", 10);
		//			Plan Application Collapse Button 2  
		OS.isElementExist("Pretermination addon", "addons", 10);
		if (OS.isClickable("addons", 5)) {
			//OS.clickOnElement("Link", "plan Application Collapse Button2", "planApplicationcollapsebutton2");
			//OS.moveToElement("planApplicationcollapsebutton2");
			Thread.sleep(2000L);
			JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
			js.executeScript("arguments[0].click();", OS.get_addons());

		}

		//OS.isElementExist("plan Action2", "planaction2", 10);

		OS.isElementExist("Add On Box", "addonbox", 10);

		//OS.isElementExist("my Duo", "myDuo", 10);
		OS.isElementExist("mysuper Duo", "mysuperduo", 10);
		OS.isElementExist("Amazon Prime Video", "amazonprimeVideo", 10);
		OS.isElementExist("GS Add Surf99", "GSADD",10);
		OS.isElementExist("Total Addons", "totaladdons", 10);
		OS.isElementExist("Total Montly bill2", "totalMontlybill2", 10);
		OS.isElementExist("Monthly service", "monthlyservice", 10);
		OS.isElementExist("totalmontlyBillPayment", "totalmontlyBillPayment2", 10);//

		if (OS.isClickable("submitOrder", 5)) {
			Thread.sleep(4000);

			//OS.clickOnElement("Button", "NextIcon", "submitOrder");
			JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
			js.executeScript("arguments[0].click();", OS.get_submitOrder());

		}

	}
	public void paymentPageGplanwithalldata1799() throws InterruptedException {
		PayP.isElementExist("paymentpagemethod", "Selectpaymentmethod", 10);
		PayP.isElementExist("paymentpagegcash", "Gcash", 10);
		PayP.isElementExist("paymentpageccstrightpayment", "CCStraightpayment", 10);
		PayP.isElementExist("paymentpagecchsbc", "CCHSBC", 10);
		PayP.isElementExist("paymentpageccbpi", "CCBPI", 10);
		PayP.isElementExist("paymentpagecod", "COD", 10);
		//PayP.isElementExist("paymentpage", "COD_Statment", 10);
		PayP.isElementExist("paymentpageonetime apyment", "Onetimepayment", 10);
		PayP.isElementExist("paymentpageplane header", "planApplicationHeader", 10);
		PayP.isElementExist("paymentpagecolapsebutton", "Colapsebutton1", 10);

		//PayP.clickOnElement("Button", "paymentpage", "Colapsebutton1");
		PayP.moveToElement("Colapsebutton1");
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("arguments[0].click();", PayP.get_Colapsebutton1());

		PayP.isElementExist("paymentpageplane name", "Planname", 10);
		PayP.isElementExist("paymentpageplane amount", "Planamount", 10);
		PayP.isElementExist("paymentpagetotal amountheader", "TotalAmountHeader", 10);
		PayP.isElementExist("paymentpagetoatalamount", "TotalAmount", 10);
		PayP.isElementExist("paymentpagepromocode", "Gotapromocodeheader", 10);
		PayP.isElementExist("paymentpageclickhearepromo", "PromoClickhere", 10);  		
		PayP.isElementExist("paymentpageaddress", "ShiptothisaddressHeader", 10);

		//PayP.clickOnElement("Button", "paymentpage", "CCHSBC");
		JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
		js1.executeScript("arguments[0].click();", PayP.get_CCHSBC());
		
		
		

		PayP.isElementExist("paymentpagesubmit", "Submitbutton", 10);
		PayP.isElementExist("paymentpagemonthlypay", "Monthlypayment", 10);
		PayP.isElementExist("paymentpagenoneedthese", "Noneedtopaythistoday", 10);
		PayP.isElementExist("paymentpageplanename1", "Planname1", 10);
		PayP.isElementExist("paymentpageaddon", "Addons", 10);

		PayP.isElementExist("paymentpagetotal mothlybill", "TotalMonthlybill", 10);
		PayP.isElementExist("paymentpagetotal monthly pluse addon", "MonthlysvcplusAddons", 10);
		PayP.isElementExist("paymentpagepotaolmonthlyamount", "Tptalmonthlyamount", 10);

		//PayP.isElementExist("paymentpagecolapsebtn2", "Colapsebutton2", 10);
		//PayP.clickOnElement("Button", "paymentpage", "Colapsebutton2");
		//PayP.moveToElement("Colapsebutton2");
		JavascriptExecutor js3 = (JavascriptExecutor) DriverManager.getDriver();
		js3.executeScript("arguments[0].click();", PayP.get_Addons());

		//PayP.isElementExist("paymentpage", "myDuo", 10);
		PayP.isElementExist("paymentpagesuper", "mysuperduo", 10);
		PayP.isElementExist("paymentpagegsadd", "GSADD", 10);
		PayP.isElementExist("paymentpageapv", "AmazonPrime", 10);


		//PayP.clickOnElement("Button", "Payment", "Submitbutton");
		JavascriptExecutor jsP = (JavascriptExecutor) DriverManager.getDriver();
		jsP.executeScript("arguments[0].click();", PayP.get_Submitbutton());
		
		Thread.sleep(90000);
		
		JavascriptExecutor jsP1 = (JavascriptExecutor) DriverManager.getDriver();
		jsP1.executeScript("arguments[0].click();", PayP.get_Submitbutton());



	}
	//*********************************************************************************************//
	public void ThankYou_Page1799() throws Exception {
		TP.isElementExist("Thank you label", "Thankyoulabel", 10);
		TP.isElementExist("for Processing", "forProcessing", 10);
		TP.isElementExist("notification", "notification", 10);
		TP.isElementExist("order", "order", 10);
		TP.isElementExist("reference Number", "referenceNumber", 10);

		TP.isElementExist("order Number", "orderNumber", 10);

		TP.isElementExist("purchase Summary", "purchaseSummary", 10);
		TP.isElementExist("Shipping Adress", "shippingAdress", 10);
		TP.isElementExist("shipping Adress Value", "shippingAdressValue", 10);
		TP.isElementExist("PaymentMethod", "paymentMethod", 10);
		TP.isElementExist("payment Method Value", "paymentMethodValue", 10);
		TP.isElementExist("Amount To Pay", "amountToPay", 10);

		TP.isElementExist("amount To Pay Value", "amountToPayValue", 10);

		TP.isElementExist("gplan with all data", "thanyougplanename", 10);//

		TP.isElementExist("plan Inclusions", "planInclusions", 10);
		TP.isElementExist("konsulta MD", "konsultaMD", 10);//
		TP.isElementExist("Glnsure", "glnsure", 10);//
		TP.isElementExist("Addons", "addons", 10);
		//TP.isElementExist("My Duo", "myDuo", 10);
		TP.isElementExist("My Super Duo", "Mysuperduo", 10);
		TP.isElementExist("amazon Prime Video", "amazonPrimeVideo", 10);
		TP.isElementExist("GS Add surf99", "GSADD", 10);
	}


	//*********************************************************************************************************************************** 


	//*******************************************************************************************//

	//*******************************************************************************************//


	//   $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$  FTA1 Start$$$$$$$$$$$$$$$$$$$$$$$$$$$$
	public void  validate_plan_breakdown() throws InterruptedException
	{
		//PP.get_Mobilenumfield();
		Thread.sleep(3000);
		PP.isElementExist("Mobilenumberprefilled ", "Breakdown_Mobilenum", 10);
		PP.isElementExist("Planname", "Planname", 10);
		PP.isElementExist("Planamount", "Plan_amount", 10);
		PP.isElementExist("subs", "Subsandaddonheader", 10);
		PP.isElementExist("MysuperDuo", "mysuper", 10);
		PP.isElementExist("Amazon", "AmazonAddon", 10);
		PP.isElementExist("GSADD SURF", "SURF", 10);
		PP.isElementExist("Totalsubs", "Totalsubsandaddons", 10);
		PP.isElementExist("totalsubsaddon", "Totalsubsandaddons_amont", 10);
		PP.isElementExist("MothlyBillheader", "Monthlybill_header", 10);
		PP.isElementExist("Monthlybillamnt", "Monthlybill_amount", 10);
		PP.isElementExist("Monthlypaymnt", "Monthly_payment", 10);
		PP.isElementExist("Monthlypaymentamount", "Monthlypayment_amount", 10);

		//						    	PP.isElementExist("Device", "Device", 10);
		//						    	PP.isElementExist("Devicename", "Devicename", 10);
		//						    	PP.isElementExist("planname", "Planname", 10);
		//						    	PP.isElementExist("Devicedetails", "Devicedetails", 10);
		//						    	PP.isElementExist("Adonchechbox1", "Checkbox1", 10);
		//						    	PP.isElementExist("Adonchechbox2", "Checkbox2", 10);
		//						    	PP.isElementExist("Adonchechbox3", "Checkbox3", 10);
		//						    	PP.isElementExist("Adonchechbox4", "Checkbox4", 10);
		//						    	PP.isElementExist("Adonchechbox5", "Checkbox5", 10);
		//						    	PP.isElementExist("Proccedmyplan", "ProccedwithMyplan", 10);
		//						    	PP.get_checkbox1();
		//						    	PP.get_checkbox2();
		//						    	PP.get_checkbox3();
		//						    	PP.get_checkbox4();
		//						    	PP.get_checkbox5();
		//						   	
	}
	/**************************************************/
	public void  validate_plan_breakdownADA2() throws InterruptedException
	{
		//PP.get_Mobilenumfield();
		Thread.sleep(10000);
		PP.isElementExist("Mobilenumberprefilled ", "Breakdown_Mobilenum", 10);
		PP.isElementExist("Planname", "Planname", 10);
		PP.isElementExist("Planamount", "Plan_amount", 10);
		PP.isElementExist("subs", "Subsandaddonheader", 10);
		PP.isElementExist("MysuperDuo", "mysuper", 10);
		PP.isElementExist("Amazon", "AmazonAddon", 10);
		PP.isElementExist("GSADD SURF", "SURF", 10);
		PP.isElementExist("Totalsubs", "Totalsubsandaddons", 10);
		PP.isElementExist("totalsubsaddon", "Totalsubsandaddons_amont", 10);
		PP.isElementExist("MothlyBillheader", "Monthlybill_header", 10);
		PP.isElementExist("Monthlybillamnt", "Monthlybill_amount", 10);
		PP.isElementExist("Monthlypaymnt", "Monthly_payment", 10);
		PP.isElementExist("Monthlypaymentamount", "Monthlypayment_amount", 10);

	}


	//************************************************************************************************************

	public void validateDAF()
	{
		Form.isElementExist("journeystatus","journeystastus1" , 10);
		Form.isElementExist("planename", "planname", 10);
		Form.isElementExist("formPersonalinfrmation","formPersonalInfo" , 10);
		Form.isElementExist("Billinginformation","Billingaddressinfo", 10);
		Form.isElementExist("RadiobtnHouse", "rBtb_House", 10);
		Form.isElementExist("rtdbtncondomoni", "rBtn_condominium", 10);

	}
	/*********************************************************************/
	public void validatePersonalInfo_MandatoryFields()
	{
		Form.moveToElement("Mandatory_Fname");
		Form.isElementExist("Mandatory: First Name","Mandatory_Fname" , 10);
		Form.isElementExist("Mandatory: Middle Name","Mandatory_Mname" , 10);
		Form.isElementExist("Mandatory: Last Name","Mandatory_LName" , 10);
		Form.isElementExist("Mandatory: Email","Mandatory_Email" , 10);
		Form.isElementExist("Mandatory: Birthday","Mandatory_Birthday" , 10);
		Form.isElementExist("Mandatory: Mother's First Name","Mandatory_MFName" , 10);
		Form.isElementExist("Mandatory: Mother's Middle Name","Mandatory_MMName" , 10);
		Form.isElementExist("Mandatory: Mother's Last Name","Mandatory_MLName" , 10);

		Form.moveToElement("Mandatory_House");
		Form.isElementExist("Mandatory: House","Mandatory_House" , 10);
		Form.isElementExist("Mandatory: Province","Mandatory_Province" , 10);
		Form.isElementExist("Mandatory: City","Mandatory_City" , 10);
		Form.isElementExist("Mandatory: Barangay","Mandatory_Brgy" , 10);
		Form.isElementExist("Mandatory: ZIP Code","Mandatory_zip" , 10);

	}



	//*******************************************88//
	public void insert_personal_info_on_form_RandomName(String email) throws Exception {
		Form.scroll_vertical(25);
		//								if (payOption.equalsIgnoreCase("GCash")) {
		//									Thread.sleep(8000L);
		//								} else {
		//									Thread.sleep(2000L);
		//								}
//		String Fname = RandomString(1)+"urian";
//		String Mname = RandomString(1)+"mos";
//		String Lname = RandomString(1)+"kolado";
////		
		String Fname = "MARIA";
		String Mname = "SANTOS";
		String Lname = "DELA CRUZ";

		//String userName = ""+(int)(Math.random()*Integer.MAX_VALUE);

		//String email = "tcoe_globe_online_team@globe.com.ph";
		// String Dob=randomDataOfBirth(2,3);
		String Dob="03/16/1980";
		String MoFname=RandomString(1)+"alluyo";
		String MomMname=RandomString(1)+"dlltrsdo";
		String MomLname=RandomString(1)+"cselado";

		Form.get_firstName().clear();
		Form.get_firstName().sendKeys(Fname);
		System.out.println("First Name : "+Fname);
		Form.get_middleName().clear();
		Form.get_middleName().sendKeys(Mname);
		System.out.println("Middle Name : "+Mname);
		Form.get_lastName().clear();
		Form.get_lastName().sendKeys(Lname);
		System.out.println("Last Name : "+Lname);
		//Form.Select_Suffix(" II ");

		Form.get_email().clear();
		Form.get_email().sendKeys(email);
		System.out.println("Email : " + email);


		Form.get_dob().clear();
		Form.get_dob().sendKeys(Dob);
		System.out.println("Date of Birth:"+Dob);
		
		Form.get_mothersfirstname().clear();
		Form.get_mothersfirstname().sendKeys(MoFname);
		System.out.println("Mothers First name:"+MoFname);
		
		Form.get_mothersmiddlename().clear();
		Form.get_mothersmiddlename().sendKeys(MomMname);
		System.out.println("Mothers middle name:"+MomMname);
		
		Form.get_motherslastname().clear();
		Form.get_motherslastname().sendKeys(MomLname);
		System.out.println("Mothers last name name:"+MomLname);


		/*	
								Form.isElementExist("Mobile Number", "mobileNumber", 10);	
								System.out.println("Mobile Number : " + Form.getText("mobileNumber"));
		 */	
		//Constant.dataMap.get().get(Fname +" "+ Mname +" "+ Lname +" "+ email +" "+Dob +" "+MoFname +" "+MomMname +" "+ MomLname);
		Constant.dataMap.get().put("CustomerDetails",Fname +" "+ Mname +" "+ Lname +" "+ email +" "+Dob +" "+MoFname +" "+MomMname +" "+ MomLname);
		Form.scroll_vertical(450);
		Thread.sleep(1500L);
	}
	//*********************************************************//
	/*
	 * private String randomDataOfBirth(int yearStart, int yearEnd) {
	 * GregorianCalendar gc = new GregorianCalendar(); int year =
	 * randBetween(yearStart, yearEnd); gc.set(Calendar.YEAR, year); int dayOfYear =
	 * randBetween(1, gc.getActualMaximum(Calendar.DAY_OF_YEAR));
	 * 
	 * gc.set(Calendar.DAY_OF_YEAR, dayOfYear); String date = null;
	 * if(gc.get(Calendar.MONTH) == 0) { date =gc.get(Calendar.DAY_OF_MONTH) + 0 +
	 * "/ " + 1 + " / " + gc.get(Calendar.YEAR);
	 * 
	 * }else { date = gc.get(Calendar.YEAR) + "/ " + gc.get(Calendar.MONTH) + " / "
	 * + gc.get(Calendar.DAY_OF_MONTH); } return date; }
	 * 
	 * private int randBetween(int start, int end) { return start +
	 * (int)Math.round(Math.random() * (end - start)); }
	 */

	//*****************************************************************************************
	private String RandomString(int j) 
	{
		// TODO Auto-generated method stub
		//return null;
		char c[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		int randomPosition;
		String randomString = "";
		for (int i = 0; i <j; i++) {
			randomPosition = generateRandomIntIntRange(0, 51);
			randomString = randomString + c[randomPosition]; 
		}
		//System.out.println(randomString);
		return randomString;        
	}

	public static int generateRandomIntIntRange(int min, int max) {
		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}


	//****************************//
	public void insert_address_details_House() throws InterruptedException {
		// LP.get_condominium().click();
		Form.javascript_clickRadioBtn_House();
		System.out.println("Selected radio button : House");

		Form.scroll_vertical(150);
		//Thread.sleep(2000L);
		String Houseno="11";
		String Street="Annex 7, Amity circle";
		String Villagesub="Better Living";
		String Province="METRO MANILA";
		String City="PARANAQUE CITY";
		String Barangay="Don Bosco";
		Form.get_house().clear();
		Form.get_house().sendKeys(Houseno);
		System.out.println("House :"+Houseno);
		Form.get_street().clear();
		Form.get_street().sendKeys(Street);
		System.out.println("Street :"+Street);
		Form.select_province(Province); System.out.println("Province : "+Province);Thread.sleep(2000L);
		Form.select_city(City); System.out.println("City : "+City);Thread.sleep(2000L);
		Form.select_barangay(Barangay); System.out.println("Barangay : "+Barangay);Thread.sleep(2000L);

		Constant.dataMap.get().get(Houseno +" "+ Street +" "+ Villagesub +" "+ Province +" "+City +" "+Barangay);
		Form.scroll_vertical(450);
		Thread.sleep(1500L);
								Constant.dataMap.get().put("OMT_ShippingAddress",Houseno +" "+ Street +" "+ Villagesub +" "+ Province +" "+City +" "+Barangay);
		//								Constant.dataMap.get("OMT_AddressDetails");
		//								Constant.dataMap.get("Magento_AddressInformation");
	}

	/********************************************************************/
	public void insert_address_details(String House_Condo, String HouseNo_FloorNo, String Street, String Subdi_BuildingName, String Prov, String City, String Brgy) throws InterruptedException {


		if(House_Condo.equalsIgnoreCase("Condo")) {
			Form.javascript_clickCondominium();
			System.out.println("Selected radio button : Condominium");

			Form.moveToElement(HouseNo_FloorNo);
			Form.get_floor().sendKeys(HouseNo_FloorNo); System.out.println("Floor : "+HouseNo_FloorNo);
			Form.get_buildingName().sendKeys(Subdi_BuildingName); System.out.println("Building Name : "+Subdi_BuildingName);
			//Form.get_street().clear();
			/*
			 * String s = Keys.chord(Keys.CONTROL, "a"); Thread.sleep(5000);
			 * Form.get_street().sendKeys(s); Form.get_street().sendKeys(Keys.DELETE);
			 */

			Form.get_street().sendKeys(Street); System.out.println("Street : "+Street);

			Form.select_province(Prov); System.out.println("Province : "+Prov);Thread.sleep(2000L);
			Form.select_city(City); System.out.println("City : "+City);Thread.sleep(2000L);
			Form.select_barangay(Brgy); System.out.println("Barangay : "+Brgy);Thread.sleep(2000L);

			String zipCOde = Form.get_zipCode().getAttribute("value");
			if (zipCOde == null || zipCOde.isEmpty()) {
				System.out.println("FAIL : ZIP Code -  is blank");
			} else {
				System.out.println("ZIP Code is pre-populated : " + zipCOde);
			}

			Thread.sleep(1000L);
		}
		else {
			Form.javascript_clickRadioBtn_House();
			System.out.println("Selected radio button : House");

			Form.scroll_vertical(375);
			Thread.sleep(2000L);

			Form.get_house().sendKeys(HouseNo_FloorNo); System.out.println("House No : "+HouseNo_FloorNo);
			Form.get_subDivision().sendKeys(Subdi_BuildingName); 
			System.out.println("Subdivision : "+Subdi_BuildingName);
			Form.get_street().clear();
			Form.get_street().sendKeys(Street); System.out.println("Street : "+Street);

			Form.select_province(Prov); System.out.println("Province : "+Prov);Thread.sleep(2000L);
			Form.select_city(City); System.out.println("City : "+City);Thread.sleep(2000L);
			Form.select_barangay(Brgy); System.out.println("Barangay : "+Brgy);Thread.sleep(2000L);

			String zipCOde = Form.get_zipCode().getAttribute("value");
			if (zipCOde == null || zipCOde.isEmpty()) {
				System.out.println("FAIL : ZIP Code -  is blank");
			} else {
				System.out.println("ZIP Code is pre-populated : " + zipCOde);
			}


			Thread.sleep(1000L);

		}



		Constant.dataMap.get().put("ShippingAddress",
				HouseNo_FloorNo+", "+Subdi_BuildingName+", "+Street+", "+Prov+", "+City+", "
						+Brgy); 
//		Constant.dataMap.get().put("OMT_AddressDetails",
//								HouseNo_FloorNo+", "+Subdi_BuildingName+", "+Street+", "+Prov+", "+City+", "
//										+Brgy); 
						
						Constant.dataMap.get().put("Magento_AddressInformation",
												HouseNo_FloorNo+", "+Subdi_BuildingName+", "+Street+", "+Prov+", "+City+", "
														+Brgy);


										/*
										 * Constant.dataMap.get("OMT_ShippingAddress");
										 * Constant.dataMap.get("OMT_AddressDetails");
										 * Constant.dataMap.get("Magento_AddressInformation");
										 */
	}


	//**************************************************************************

	//toggled 
	public void Select_Alternative_recipentDetails() throws Exception {
		// LP.get_condominium().click();

		Form.scroll_vertical(275);
		Thread.sleep(2000L);
		String RecipentFname = RandomString(1)+"shian";
		String RecipentMname = RandomString(1)+"rea";
		String RecipentLname = RandomString(1)+"lov";

		String   Mobileno="09270000133";


		Form.get_RecipentFname().clear();
		Form.get_RecipentFname().sendKeys(RecipentFname);
		System.out.println("Recipent Fname : "+RecipentFname);

		Form.get_RecipentMname().clear();
		Form.get_RecipentMname().sendKeys(RecipentMname);
		System.out.println("Recipent Middlename:"+RecipentMname);

		Form.get_RecipentLname().clear();
		Form.get_RecipentLname().sendKeys(RecipentLname);
		System.out.println("Recipent Lastname:"+RecipentLname);

		Form.get_RecipentMobileno().clear();
		Form.get_RecipentMobileno().sendKeys(Mobileno);
		System.out.println("Recipent Mobile Number:"+Mobileno);



		Constant.dataMap.get().get(RecipentFname +" "+ RecipentMname +" "+ RecipentLname+" "+Mobileno);
		Form.scroll_vertical(450);
		Thread.sleep(1500L);
	}
	//********************************************//
	public void DeliveryAdd_page()
	{

		Form.isElementExist("journeystatus", "journeyDAF2", 10);
		 Form.isElementExist("recipentaddress", "Recipentaddress",10);
         Form.isElementExist("shippingaddress","shippingaddress",10);
        

		//toggled 

		Form.isElementExist("Toggledbtn","Toggledbtn",10);
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("arguments[0].click();", Form.Togglebtn_select());
	}

	/**
	 * @throws InterruptedException *******************************************************/
	public void Next_uploadDocument() throws InterruptedException
	{
		Form.isElementExist("NextUplodoc", "NextUplodoc", 10);
		//Form.clickOnElement("Button", "NextUplodoc", "NextUplodoc");
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("arguments[0].click();", Form.get_nextUploaddoc());
		Thread.sleep(3000);
	}

	public void Upload_RequiredDocPOID()
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




	/*******************************************************/
	public void validate_form_onClick_of_changeAddress(String addressType) throws InterruptedException {
		Thread.sleep(5000);
		//OS.get_changeAddress().click();
		OS.js_clickOnElement("Button","changeAdress","changeAdress");
		System.out.println("Clicked on Change Address button");

		Form.scroll_vertical(200);

		System.out.println("Validate FORM field values are pre-populated");

		System.out.println("First Name : " + Form.getAttributeValue("firstName", "value"));
		System.out.println("Middle Name : " + Form.getAttributeValue("middleName", "value"));
		System.out.println("Last Name : " + Form.getAttributeValue("lastName", "value"));
		System.out.println("Email : " + Form.getAttributeValue("email", "value"));
		System.out.println("Mobile Number : " + Form.getAttributeValue("mobileNumber", "value"));
		System.out.println("Mothers firstname : " + Form.getAttributeValue("motherfirst_name1", "value"));
		System.out.println("Mothers middle name : " + Form.getAttributeValue("mothers_middlename", "value"));
		System.out.println("Mothers lastname : " + Form.getAttributeValue("mothers_lastname", "value"));
		System.out.println("DOB : " + Form.getAttributeValue("Dob", "value"));

		Form.scroll_vertical(600);

		if (addressType.equalsIgnoreCase("house")) {
			System.out.println("House radio button is selected");

			System.out.println("House : " + Form.getAttributeValue("houseNo", "value"));
			System.out.println("Street : " + Form.getAttributeValue("street", "value"));
			System.out.println("Village/Subdivision : " + Form.getAttributeValue("village_subDivision", "value"));
			System.out.println("Province : " + Form.getAttributeValue("drpdwnProvince", "value"));
			System.out.println("City : " + Form.getAttributeValue("drpdwnCity", "value"));
			System.out.println("Barangay : " + Form.getAttributeValue("drpdwnBarangay", "value"));
			System.out.println("ZipCode : " + Form.getAttributeValue("zipCode", "value"));
		}
		Form.scroll_vertical(300);

		System.out.println("Special Instruction : " + Form.getAttributeValue("specialInstruction", "value"));

		Form.scroll_vertical(1500);
		Thread.sleep(5000);

		//click_pay_btn_on_form();
		//util.assertContainText("Validated title", DriverManager.getDriver().getTitle(), "Pay");

	}
	//********************************************************************************************************//

	//***************************************************************//
	//							Order summary page
	public void orderSummary() throws InterruptedException {
		//OS.isElementExist("Cookies Notification", "cookiesNotification", 10);
		//OS.isElementExist("Privacy Accept", "privacyAccept", 10);
		OS.isElementExist("Acquisition Summary", "acquisitionSummary", 10);
		OS.isElementExist("Build My Plan", "buildPlan", 10);
		OS.isElementExist("Fill Out", "fillOut", 10);
		OS.isElementExist("Review", "review", 10);
		OS.isElementExist("Pay", "pay", 10);
		OS.isElementExist("For Processing", "forProcessing", 10);
		OS.isElementExist("Notice Block", "noticeBlock", 10);
		OS.isElementExist("Go Icon Notice", "goIconGoNotice", 10);
		OS.isElementExist("Go Text Preamble", "goTextPreamble", 10);
		OS.isElementExist("Order summary", "orderSummary", 10);
		OS.isElementExist("GSAD", "gSAD", 10);

		OS.isElementExist("Access", "access", 10);
		OS.isElementExist("go Wifi", "Gowifi", 10);
		OS.isElementExist("Img Mobile", "imgMobile", 10);
		OS.isElementExist("Plan Conclusion", "planInclusion", 10);
		OS.isElementExist("Konsulta", "konsulta", 10);
		OS.isElementExist("Glnusure", "glnusure", 10);
		OS.isElementExist("Add ons", "addOns", 10);
		//OS.isElementExist("MyDuo1", "myDuo1", 10);

		OS.isElementExist("MySuperduo", "MySuperduo", 10);
		OS.isElementExist("APV", "aPV", 10);
		OS.isElementExist("GSadd", "GSadd",10);

		OS.isElementExist("One Time Payment", "oneTimePayment", 10);
		OS.isElementExist("Plan Application1", "planapplication1", 10);

		//			Plan Application Collapse Button 1  
		OS.isElementExist("Pretermination Fee", "planapplicationcollapse1", 10);
		if (OS.isClickable("preterminationDropDown", 5)) {
			//OS.clickOnElement("Link", "PreterminationDropDown1", "planapplicationcollapse1");
			OS.moveToElement("planapplicationcollapse1");
			Thread.sleep(2000L);
			JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
			js.executeScript("arguments[0].click();", OS.get_planapplicationcollapse1());


		}
		OS.isElementExist("Advance Monthly", "advanceMonthly", 10);
		OS.isElementExist("Advance Monthly amount", "advanceMonthlyamount999", 10);

		OS.isElementExist("textGplaWithDevice", "textGplanwithDiv", 10);
		OS.isElementExist("Shipping", "shipping", 10);
		OS.isElementExist("Free", "free", 10);
		OS.isElementExist("plan Amount First", "planAmountfirst", 10);
		OS.isElementExist("Total Monthly Bill", "totalMonthlyBillSimOnly", 10);
		OS.isElementExist("Total amount pay", "totalamountpaySimOnly999", 10);
		OS.isElementExist("Promo Icon", "PromoIcon", 10);
		OS.isElementExist("Promo Code", "promoCode", 10);
		OS.isElementExist("Promo Click Here", "PromoClickHere", 10);
		OS.isElementExist("Ship Icon", "shipicon", 10);
		OS.isElementExist("Shipping Adress", "shippingAdress", 10);
		OS.isElementExist("Change Adress", "changeAdress", 10);
		OS.isElementExist("submit Order", "submitOrder", 10);

		//			Plan Application Collapse Button 2  
		OS.isElementExist("Pretermination Fee", "plan Application Collapse Button2", 10);
		if (OS.isClickable("preterminationDropDown", 5)) {
			//OS.clickOnElement("Link", "plan Application Collapse Button2", "planApplicationcollapsebutton2");
			OS.moveToElement("planApplicationcollapsebutton2");
			Thread.sleep(2000L);
			JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
			js.executeScript("arguments[0].click();", OS.get_planApplicationcollapsebutton2());

		}
		OS.isElementExist("Monthly Payment", "monthlyPayment", 10);
		OS.isElementExist("plan Action2", "planaction2", 10);
		OS.isElementExist("GPlan With Device 599", "gplangpalnwithdevice599", 10);
		OS.isElementExist("Add On Box", "addonbox", 10);
		OS.isElementExist("Add ons", "addons", 10);
		//OS.isElementExist("my Duo", "myDuo", 10);
		OS.isElementExist("mysuper Duo", "mysuperduo", 10);
		OS.isElementExist("Amazon Prime Video", "amazonprimeVideo", 10);
		OS.isElementExist("GS Add Surf99", "GSADD",10);
		OS.isElementExist("Total Addons", "totaladdons", 10);
		OS.isElementExist("Total Montly bill2", "totalMontlybill2", 10);
		OS.isElementExist("Monthly service", "monthlyservice", 10);
		OS.isElementExist("totalmontlyBillPayment", "totalmontlyBillPayment", 10);

		if (OS.isClickable("submitOrder", 5)) {
			OS.clickOnElement("Button", "NextIcon", "submitOrder");
		}

	}
	//*********************************************************************************************************************************** 
	public void orderSummaryADA2() throws InterruptedException {
		//OS.isElementExist("Cookies Notification", "cookiesNotification", 10);
		//OS.isElementExist("Privacy Accept", "privacyAccept", 10);
		OS.isElementExist("Acquisition Summary", "acquisitionSummary", 10);
		OS.isElementExist("Build My Plan", "buildPlan", 10);
		OS.isElementExist("Fill Out", "fillOut", 10);
		OS.isElementExist("Review", "review", 10);
		OS.isElementExist("Pay", "pay", 10);
		OS.isElementExist("For Processing", "forProcessing", 10);
		OS.isElementExist("Notice Block", "noticeBlock", 10);
		OS.isElementExist("Go Icon Notice", "goIconGoNotice", 10);
		OS.isElementExist("Go Text Preamble", "goTextPreamble", 10);
		OS.isElementExist("Order summary", "orderSummary", 10);
		OS.isElementExist("GSAD", "gSAD", 10);

		OS.isElementExist("Access", "access", 10);
		OS.isElementExist("go Wifi", "Gowifi", 10);
		OS.isElementExist("Img Mobile", "imgMobile", 10);
		OS.isElementExist("Plan Conclusion", "planInclusion", 10);
		OS.isElementExist("Konsulta", "konsulta", 10);
		OS.isElementExist("Glnusure", "glnusure", 10);
		OS.isElementExist("Add ons", "addOns", 10);
		//OS.isElementExist("MyDuo1", "myDuo1", 10);

		OS.isElementExist("MySuperduo", "MySuperduo", 10);
		OS.isElementExist("APV", "aPV", 10);
		OS.isElementExist("GSadd", "GSadd",10);

		OS.isElementExist("One Time Payment", "oneTimePayment", 10);
		OS.isElementExist("Plan Application1", "planapplication1", 10);

		//			Plan Application Collapse Button 1  
		OS.isElementExist("Pretermination Fee", "planapplicationcollapse1", 10);
		if (OS.isClickable("planapplication1", 5)) {
			//OS.clickOnElement("Link", "PreterminationDropDown1", "planapplicationcollapse1");
			OS.moveToElement("planapplication1");
			
			JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
            js.executeScript("arguments[0].click();", OS.get_planapplication1());
			Thread.sleep(2000L);
			//OS.get_planapplicationcollapse1().click();
		}
		OS.isElementExist("Advance Monthly", "advanceMonthly", 10);
		OS.isElementExist("Advance Monthly amount", "advanceMonthlyamount999", 10);

		OS.isElementExist("textGplaWithDevice", "textGplanwithDiv", 10);
		OS.isElementExist("Shipping", "shipping", 10);
		OS.isElementExist("Free", "free", 10);
		OS.isElementExist("plan Amount First", "planAmountfirst", 10);
		OS.isElementExist("Total Monthly Bill", "totalMonthlyBillSimOnly", 10);
		OS.isElementExist("Total amount pay", "totalamountpaySimOnly999", 10);
		OS.isElementExist("Promo Icon", "PromoIcon", 10);
		OS.isElementExist("Promo Code", "promoCode", 10);
		OS.isElementExist("Promo Click Here", "PromoClickHere", 10);
		OS.isElementExist("Ship Icon", "shipicon", 10);
		OS.isElementExist("Shipping Adress", "shippingAdress", 10);
		OS.isElementExist("Change Adress", "changeAdress", 10);
		OS.isElementExist("submit Order", "submitOrder", 10);
		OS.isElementExist("Monthly Payment", "monthlyPayment", 10);
		OS.isElementExist("plan Action2", "planaction2", 10);
		OS.isElementExist("GPlan With Device 599", "gplangpalnwithdevice599", 10);
		OS.isElementExist("Add ons", "addons", 10);
		//			Plan Application Collapse Button 2  
		OS.isElementExist("Pretermination Fee", "plan Application Collapse Button2", 10);
		if (OS.isClickable("addons", 5)) {
			//OS.clickOnElement("Link", "plan Application Collapse Button2", "planApplicationcollapsebutton2");
			OS.moveToElement("addons");
			JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
            js.executeScript("arguments[0].click();", OS.get_addons());
			Thread.sleep(2000L);
			//OS.get_planApplicationcollapsebutton2().click();
		}
		
		OS.isElementExist("Add On Box", "addonbox", 10);
		
		//OS.isElementExist("my Duo", "myDuo", 10);
		OS.isElementExist("mysuper Duo", "mysuperduo", 10);
		OS.isElementExist("Amazon Prime Video", "amazonprimeVideo", 10);
		OS.isElementExist("GS Add Surf99", "GSADD",10);
		OS.isElementExist("Total Addons", "totaladdons", 10);
		OS.isElementExist("Total Montly bill2", "totalMontlybill2", 10);
		OS.isElementExist("Monthly service", "monthlyservice", 10);
		OS.isElementExist("totalmontlyBillPayment", "totalmontlyBillPayment", 10);

		//								if (OS.isClickable("submitOrder", 5)) {
		//									OS.clickOnElement("Button", "NextIcon", "submitOrder");
		//								}

	}
	//*********************************************************************************************************************************** 

	public void ordersummrysubmitbutton() throws InterruptedException
	{
		if (OS.isClickable("submitOrder", 5)) {
			Thread.sleep(4000);

			//OS.clickOnElement("Button", "NextIcon", "submitOrder");
			JavascriptExecutor jso = (JavascriptExecutor) DriverManager.getDriver();
			jso.executeScript("arguments[0].click();", OS.get_submitOrder());

		}

	}

	public void paymentPageGplanwithDevice() {
		PayP.isElementExist("paymentpage", "Selectpaymentmethod", 10);
		PayP.isElementExist("paymentpage", "Gcash", 10);
		PayP.isElementExist("paymentpage", "CCStraightpayment", 10);
		PayP.isElementExist("paymentpage", "CCHSBC", 10);
		PayP.isElementExist("paymentpage", "CCBPI", 10);
		PayP.isElementExist("paymentpage", "COD", 10);
		PayP.isElementExist("paymentpage", "COD_Statment", 10);
		PayP.isElementExist("paymentpage", "Onetimepayment", 10);
		PayP.isElementExist("paymentpage", "planApplicationHeader", 10);
		PayP.isElementExist("paymentpage", "Colapsebutton1", 10);

		PayP.clickOnElement("Button", "paymentpage", "Colapsebutton1");

		PayP.isElementExist("paymentpage", "Planname", 10);
		PayP.isElementExist("paymentpage", "Planamount", 10);
		PayP.isElementExist("paymentpage", "TotalAmountHeader", 10);
		PayP.isElementExist("paymentpage", "TotalAmount", 10);
		PayP.isElementExist("paymentpage", "Gotapromocodeheader", 10);
		PayP.isElementExist("paymentpage", "PromoClickhere", 10);  		
		PayP.isElementExist("paymentpage", "ShiptothisaddressHeader", 10);

		PayP.clickOnElement("Button", "paymentpage", "COD");

		PayP.isElementExist("paymentpage", "Submitbutton", 10);
		PayP.isElementExist("paymentpage", "Monthlypayment", 10);
		PayP.isElementExist("paymentpage", "Noneedtopaythistoday", 10);
		PayP.isElementExist("paymentpage", "Planname1", 10);
		PayP.isElementExist("paymentpage", "Addons", 10);

		PayP.isElementExist("paymentpage", "TotalMonthlybill", 10);
		PayP.isElementExist("paymentpage", "MonthlysvcplusAddons", 10);
		PayP.isElementExist("paymentpage", "Tptalmonthlyamount", 10);

		PayP.isElementExist("paymentpage", "Colapsebutton2", 10);
		PayP.clickOnElement("Button", "paymentpage", "Colapsebutton2");
		PayP.isElementExist("paymentpage", "myDuo", 10);
		PayP.isElementExist("paymentpage", "AmazonPrime", 10);


		PayP.clickOnElement("Button", "Payment", "Submitbutton");


	}
	/***************************************************************************/
	public void paymentPageGplanwithDevice599() {
		PayP.isElementExist("paymentpage", "Selectpaymentmethod", 10);
		PayP.isElementExist("paymentpage", "Gcash", 10);
		PayP.isElementExist("paymentpage", "CCStraightpayment", 10);
		PayP.isElementExist("paymentpage", "CCHSBC", 10);
		PayP.isElementExist("paymentpage", "CCBPI", 10);
		PayP.isElementExist("paymentpage", "COD", 10);
		//PayP.isElementExist("paymentpage", "COD_Statment", 10);
		PayP.isElementExist("paymentpage", "Onetimepayment", 10);
		PayP.isElementExist("paymentpage", "planApplicationHeader", 10);
		PayP.isElementExist("paymentpage", "Colapsebutton1", 10);

		PayP.clickOnElement("Button", "paymentpage", "Colapsebutton1");

		PayP.isElementExist("paymentpage", "Planname", 10);
		PayP.isElementExist("paymentpage", "Planamount", 10);
		PayP.isElementExist("paymentpage", "TotalAmountHeader", 10);
		PayP.isElementExist("paymentpage", "TotalAmount", 10);
		PayP.isElementExist("paymentpage", "Gotapromocodeheader", 10);
		PayP.isElementExist("paymentpage", "PromoClickhere", 10);  		
		PayP.isElementExist("paymentpage", "ShiptothisaddressHeader", 10);

		//PayP.clickOnElement("Button", "paymentpage", "COD");

		PayP.isElementExist("paymentpage", "Submitbutton", 10);
		PayP.isElementExist("paymentpage", "Monthlypayment", 10);
		PayP.isElementExist("paymentpage", "Noneedtopaythistoday", 10);
		PayP.isElementExist("paymentpage", "Planname1", 10);
		PayP.isElementExist("paymentpage", "Addons", 10);

		PayP.isElementExist("paymentpage", "TotalMonthlybill", 10);
		PayP.isElementExist("paymentpage", "MonthlysvcplusAddons", 10);
		PayP.isElementExist("paymentpage", "Tptalmonthlyamount", 10);

		PayP.isElementExist("paymentpage", "Colapsebutton2", 10);
		//PayP.clickOnElement("Button", "paymentpage", "Colapsebutton2");
		JavascriptExecutor js3 = (JavascriptExecutor) DriverManager.getDriver();
		js3.executeScript("arguments[0].click();", PayP.get_Addons());


		PayP.isElementExist("paymentpage", "myDuo", 10);
		PayP.isElementExist("paymentpage", "AmazonPrime", 10);


		//PayP.clickOnElement("Button", "Payment", "Submitbutton");
		JavascriptExecutor jsP = (JavascriptExecutor) DriverManager.getDriver();
		jsP.executeScript("arguments[0].click();", PayP.get_Submitbutton());



	}


	/******************************************************************************/

	//							Thank You Page
	public void ThankYou_Page() throws Exception {
		TP.isElementExist("Thank you label", "Thankyoulabel", 10);
		TP.isElementExist("for Processing", "forProcessing", 10);
		TP.isElementExist("notification", "notification", 10);
		TP.isElementExist("order", "order", 10);
		TP.isElementExist("reference Number", "referenceNumber", 10);
		TP.isElementExist("order Number", "orderNumber", 10);
		TP.isElementExist("purchase Summary", "purchaseSummary", 10);
		TP.isElementExist("Shipping Adress", "shippingAdress", 10);
		TP.isElementExist("shipping Adress Value", "shippingAdressValue", 10);
		TP.isElementExist("PaymentMethod", "paymentMethod", 10);
		TP.isElementExist("payment Method Value", "paymentMethodValue", 10);
		TP.isElementExist("Amount To Pay", "amountToPay", 10);
		TP.isElementExist("amount To Pay Value", "amountToPayValue", 10);
		TP.isElementExist("gplan Sim Only", "gplanSimOnly", 10);
		TP.isElementExist("plan Inclusions", "planInclusions", 10);
		TP.isElementExist("konsulta MD", "konsultaMD", 10);
		TP.isElementExist("Glnsure", "glnsure", 10);
		TP.isElementExist("Addons", "addons", 10);
		TP.isElementExist("My Duo", "myDuo", 10);
		TP.isElementExist("amazon Prime Video", "amazonPrimeVideo", 10);
	}


	//*********************************************************************************************************************************** 
	public void ThankYou_Page599() throws Exception {
		TP.isElementExist("Thank you label", "Thankyoulabel", 10);
		TP.isElementExist("for Processing", "forProcessing", 10);
		TP.isElementExist("notification", "notification", 10);
		TP.isElementExist("order", "order", 10);
		TP.isElementExist("reference Number", "referenceNumber", 10);
		TP.isElementExist("order Number", "orderNumber", 10);
		TP.isElementExist("purchase Summary", "purchaseSummary", 10);
		TP.isElementExist("Shipping Adress", "shippingAdress", 10);
		TP.isElementExist("shipping Adress Value", "shippingAdressValue", 10);
		TP.isElementExist("PaymentMethod", "paymentMethod", 10);
		TP.isElementExist("payment Method Value", "paymentMethodValue", 10);
		TP.isElementExist("Amount To Pay", "amountToPay", 10);
		TP.isElementExist("amount To Pay Value", "amountToPayValue", 10);
		TP.isElementExist("gplan Sim Only", "gplanSimOnly", 10);
		TP.isElementExist("plan Inclusions", "planInclusions", 10);
		TP.isElementExist("konsulta MD", "konsultaMD", 10);
		TP.isElementExist("Glnsure", "glnsure", 10);
		TP.isElementExist("Addons", "addons", 10);
		TP.isElementExist("My Duo", "myDuo", 10);
		TP.isElementExist("amazon Prime Video", "amazonPrimeVideo", 10);
	}

	/****************************************************/
	public void capture_orderID() {
		String dateTimeStamp = "";
		String orderID = TP.get_orderid().getText();
		dateTimeStamp = util.getTimeStamp();
		//Constant.dataMap.get().put("OrderID", orderID);
		Constant.dataMap.get().put("TimeStamp", dateTimeStamp);
		System.out.println("Order Completed successfully : " + orderID);
	}
public void validateThankYouPage() throws Exception {
    	
    	if(TP.isElementExist("ThankYou Text", "thankYouText", 10)) {
    		System.out.println("*******************************We are in ThankYou page******************************************");
    	}
    	
    	TP.isElementExist("For Processing Text", "forProcessing", 10);
    	TP.isElementExist("You Are On The List Text", "youOnTheListText", 10);
    	TP.isElementExist("Reservation Request Received Text", "reservationRequestReceived", 10);
    	
    	
    	TP.isElementExist("Order Summary Text", "OrderSummaryText", 10);
    	
    	if(TP.isElementExist("shipping Address", "shippingAddress", 10)) {
    		String shippingAddress = TP.get_shippingAddress().getText();
    		System.out.println("shipping Address: "+shippingAddress);
    	}
    	
    	if(TP.isElementExist("Amount To Pay", "AmountToPay", 10)) {
    		String AmountToPay = TP.get_AmountToPay().getText();
    		System.out.println("Amount To Pay: "+AmountToPay);
    	}
    	
    	if(TP.isElementExist("paymentMethod Used", "paymentMethod", 10)) {
    		String paymentMethod = TP.get_paymentMethod().getText();
    		System.out.println("Payment Method: "+paymentMethod);
    	}
    	
    	TP.isElementExist("ThankYou For Reservation Text", "thankYouForReservationText", 10);
    	TP.isElementExist("Device Image", "deviceImage", 10);
    	
    	if(TP.isElementExist("Device Name Selected", "deviceName", 10)) {
    		String deviceName = TP.get_deviceName().getText();
    		System.out.println("Device Name Selected: "+deviceName);
    	}
    	
    	if(TP.isElementExist("PlanName", "planName", 10)) {
    		String planName = TP.get_planName().getText();
    		System.out.println("Plan Name: "+planName);
    	}
    	
    	TP.isElementExist("Contract Duration Text", "contractDurationText", 10);
    	TP.isElementExist("Color Capacity Text", "color_CapacityText", 10);
    	TP.isElementExist("Plan Inclusions Text", "planInclusionsText", 10);
    	TP.isElementExist("KonsultaMD Subscription", "KonsultaMD_Subscription", 10);
    	TP.isElementExist("iQIYI Access", "iQIYI_Access", 10);
    	TP.isElementExist("weTV Access", "weTV_Access", 10);
    	TP.isElementExist("addons Text", "addons_Text", 10);
    	TP.isElementExist("MySuperDuo", "MySuperDuo", 10);
    	TP.isElementExist("AmazonPrimeVideo", "AmazonPrimeVideo", 10);
    	TP.isElementExist("ViuPremium", "ViuPremium", 10);
    	TP.isElementExist("SpotifyPremium", "SpotifyPremium", 10);
    	TP.isElementExist("GOCALLIDD", "GOCALLIDD", 10);
    	TP.isElementExist("EasyRoam", "EasyRoam", 10);
    	TP.isElementExist("GSAddSurf99", "GSAddSurf99", 10);
    	TP.isElementExist("Reminders", "Reminders", 10);
    	
    	if(TP.isElementExist("ReferenceNo","ReferenceNumber", 10)) {
    	    Constant.ReferenceNo = TP.get_ReferenceNumber().getText();
        	System.out.println("OrderID: "+Constant.ReferenceNo); 
        	Constant.dataMap.get().put("OrderID", Constant.ReferenceNo);
    		System.out.println("Order Completed successfully : " + Constant.ReferenceNo);
    	}
    	
    }




	//*********************************************************************************************************************************** 


	public void validate_acquiConfirmationPage() throws Exception {

		//AcquiPage.isElementExist("Acqui Confirmation", "AcquiConfirmation", 10);
		AcquiPage.isElementExist("Icon", "ErrorIcon", 10);
		AcquiPage.isElementExist("Are You Applying or Revieing your Globe", "AreYouApplyingyourGlobe", 10);
		AcquiPage.isElementExist("Postpaid Plan", "PostpaidPlan", 10);
		AcquiPage.isElementExist("I'm Renewing My Plan", "RenewingMyPlan", 10);
		AcquiPage.isElementExist("Applying Additional Plan", "AdditionalPlan", 10);
		if (AcquiPage.isClickable("AdditionalPlan", 5)) {
			//LP.clickOnElement("Link", "I 'm applying for a additional plan", "AdditionalPlan");
			JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
			js.executeScript("arguments[0].click();", AcquiPage.get_AdditionalPlan());
		}
	}

	//*************************************************************************************
	//*******************************Bhavana script starts here***************************

	/***********************************Ronnie script starts here***************************************************************/

	public void NavigateTo_TrackMyOrder() throws InterruptedException {
		Thread.sleep(2000L);
		if (LP.isClickable("link_TrackMyOrder", 5)) {
			JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
			js.executeScript("arguments[0].click();", LP.get_link_TrackMyOrder());
		}

		Thread.sleep(5000L);
		assertTrue(DriverManager.getDriver().getTitle().contains("Track Your Order"));
		System.out.println("Validated title : Track Your Order Page");									
	}

	/************************************************************************************************************************/

	public void NavigateTo_HelpMenu() throws InterruptedException {
		Thread.sleep(2000L);
		if (LP.isClickable("link_Help", 10)) {
			LP.moveToElement("link_Help");
			JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
			js.executeScript("arguments[0].click();", LP.get_link_Help());
		}
		Thread.sleep(10000L);

		//((JavascriptExecutor)DriverManager.getDriver()).executeScript("window.open()");
		ArrayList<String> tab1 = new ArrayList<String>(DriverManager.getDriver().getWindowHandles());
		//DriverManager.getDriver().close();
		DriverManager.getDriver().switchTo().window(tab1.get(0));

	}

	//*********************************************************************************************************************************** 					  	      
	// step 10: select a plan in dropdown
	public void selectAPlanwithGcash() {
		LP.isElementExist("GPlan with Device", "gplanWithDevice", 10);
		LP.isElementExist("GPlan with GCash", "gplanWithGCash", 10);
		LP.isElementExist("GPlan Plus SIM-Only", "gplanPlusSIMOnly", 10);
		LP.isElementExist("GPlan SIM-Only All Data", "gplanSIMOnlyAllData", 10);

		if (LP.isClickable("gplanWithGCash", 5)) {
			LP.clickOnElement("Button", "GPlan with Gcash", "gplanWithGCash");
		}
		LP.isElementExist("GPlan with Gcash", "gplanWithGCash", 10);
	}
	//	******************************************************************************************************************************/
	public void PDPGplanwithgcash599() throws Exception {

		PP.isElementExist("PDP", "gcashverifiedtext", 10);
		PP.isElementExist("PDp", "gcashcredits", 10);  
		PP.isElementExist("Contract_duration", "Contractduration_header", 10);

		//Addons
		//Data Addon
		PP.isElementExist("Dataaddon", "Data_addon", 10);
		LP.scroll_vertical(453);
		Thread.sleep(3000L);
		PP.moveToElement("Data_checkbox");
		PP.clickOnElement("Button", "Togglebutton", "Data_checkbox");
		PP.isElementExist("GS99", "GSAddsurf99", 10);
		LP.scroll_vertical(353);
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("arguments[0].click();", PP.get_GSAddsurf99());

		//Movies Addon
		PP.isElementExist("Moveaddon", "movie_addon", 10);

		Thread.sleep(3000L);
		PP.moveToElement("movie_checkbox");
		//PP.clickOnElement("Button", "Togglebutton", "movie_checkbox");
		JavascriptExecutor js12 = (JavascriptExecutor) DriverManager.getDriver();
		js12.executeScript("arguments[0].click();", PP.get_movie_checkbox());                 

		PP.isElementExist("Amazon", "Amazonprime", 10);
		PP.isElementExist("Viu", "Viupremium", 10);
		PP.isElementExist("Spotify", "Spotifypremium", 10);
		PP.clickOnElement("Button", "Amazon", "Amazonprime");
		PP.clickOnElement("Button", "Viu", "Viupremium");
		PP.clickOnElement("Button", "Spotify", "Spotifypremium");

		//Message Addon
		PP.isElementExist("messageaddon", "message_addon", 10);
		LP.scroll_vertical(253);
		Thread.sleep(3000L);
		PP.moveToElement("message_checkbox");
		PP.clickOnElement("Button", "Togglebutton", "message_checkbox");
		PP.isElementExist("MyDuo", "MyDuo", 10);
		PP.isElementExist("MySuperDuo", "MySuperDuo", 10);
		JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
		js1.executeScript("arguments[0].click();", PP.get_MyDuo());
		Thread.sleep(3000L);

		// lifestyle_addon Addon
		PP.isElementExist("messageaddon", "lifestyle_addon", 10);
		LP.scroll_vertical(253);
		Thread.sleep(3000L);
		PP.moveToElement("lifestyle_checkbox");
		PP.clickOnElement("Button", "Togglebutton", "lifestyle_checkbox");
		PP.isElementExist("MyDuo", "easyRoam", 10);
		PP.isElementExist("MySuperDuo", "Gocallid199", 10);
		JavascriptExecutor js2 = (JavascriptExecutor) DriverManager.getDriver();
		js2.executeScript("arguments[0].click();", PP.get_easyRoam());
		JavascriptExecutor js3 = (JavascriptExecutor) DriverManager.getDriver();
		js3.executeScript("arguments[0].click();", PP.get_Gocallid199());
		Thread.sleep(3000L);

		// Banner
		LP.scroll_vertical(253);
		PP.isElementExist("Banner", "Banner1", 10);

		// Reviewmybag
		PP.isElementExist("Review", "Reviewmyplan", 10);
		PP.clickOnElement("Button", "dragbtn", "Dragbutton");
		Thread.sleep(1000);

		// ViewBreakdown
		PP.isElementExist("Gcashcredits", "Breakdown_Gcashcredits", 10);

		PP.isElementExist("Planname", "Plannamegcash", 10);
		PP.isElementExist("Planamount", "Gcashamount", 10);
		PP.isElementExist("subs", "Subsandaddonheader", 10);
		PP.isElementExist("MyDuo", "MyDuoaddon", 10);
		PP.isElementExist("Amazon", "AmazonAddon", 10);
		PP.isElementExist("viu", "Breakdownn_Viupremium", 10);
		PP.isElementExist("spotify", "Breakdownn_Spotifypremium", 10);
		PP.isElementExist("Gocallid", "Breakdownn_Gocallid", 10);
		PP.isElementExist("Easyroam", "Breakdownn_EasyRoam", 10);
		PP.isElementExist("Goaddsurf", "Breakdownn_Gsaddsurf", 10);

		PP.isElementExist("Totalsubs", "Totalsubsandaddons", 10);
		PP.isElementExist("totalsubsaddon", "Addonsamount", 10);
		PP.isElementExist("MothlyBillheader", "Monthlybill_header", 10);
		PP.isElementExist("Monthlybillamnt", "Monthlyamount", 10);
		PP.isElementExist("Monthlypaymnt", "Monthly_payment", 10);
		PP.isElementExist("Monthlypaymentamount", "Monthlypayment_amount", 10);

	}
	//	******************************************************************************************************************************/

	public void Acceptallconditions() throws AWTException, InterruptedException {
		Thread.sleep(3000);
		// Form.clickOnElement("checkbox", "label_accept_all_terms", "chboxterms");
		JavascriptExecutor js3 = (JavascriptExecutor) DriverManager.getDriver();
		js3.executeScript("arguments[0].click();", Form.get_checkbox_acceptAll());

		Form.clickOnElement("Agree", "btnagree", "btnagre");
		// Form.clickOnElement("next", "btnNext", "btnnext");

		Thread.sleep(3000);
		JavascriptExecutor js2 = (JavascriptExecutor) DriverManager.getDriver();
		js2.executeScript("arguments[0].click();", Form.get_next());
		// Form.get_next().click();

	}

	//******************************************************************************************************************************/
	//	Order summary page
	public void orderSummaryGcash599() throws Exception {
		OS.isElementExist("Cookies Notification", "cookiesNotification", 10);
		OS.isElementExist("Privacy Accept", "privacyAccept", 10);
		OS.isElementExist("Acquisition Summary", "acquisitionSummary", 10);
		OS.isElementExist("Build My Plan", "buildPlan", 10);
		OS.isElementExist("Fill Out", "fillOut", 10);
		OS.isElementExist("Review", "review", 10);
		OS.isElementExist("Pay", "pay", 10);
		OS.isElementExist("For Processing", "forProcessing", 10);
		OS.isElementExist("Notice Block", "noticeBlock", 10);
		OS.isElementExist("Go Icon Notice", "goIconGoNotice", 10);
		OS.isElementExist("Go Text Preamble", "goTextPreamble", 10);
		OS.isElementExist("Order summary", "orderSummary", 10);
		OS.isElementExist("GSAD", "gcash599", 10);
		OS.isElementExist("Access", "access", 10);
		OS.isElementExist("go Wifi", "Gowifi", 10);
		OS.isElementExist("Img Mobile", "imgMobile", 10);
		OS.isElementExist("Plan Conclusion", "planInclusion", 10);
		OS.isElementExist("Konsulta", "konsulta", 10);
		OS.isElementExist("Glnusure", "glnusure", 10);
		OS.isElementExist("Add ons", "addOns", 10);
		OS.isElementExist("MyDuo1", "myDuo1", 10);
		OS.isElementExist("Amazon", "aPV", 10);
		OS.isElementExist("Viu", "Viupremiumaddons", 10);
		OS.isElementExist("Spotify", "Spotifypremium", 10);
		OS.isElementExist("easy", "easyroam", 10);
		OS.isElementExist("Gocall", "Gocallidaddons", 10);
		OS.isElementExist("GSaddsurf", "GSAddsurf", 10);

		OS.isElementExist("One Time Payment", "oneTimePayment", 10);
		OS.isElementExist("Plan Application1", "planapplication1", 10);

		//			Plan Application Collapse Button 1  
		OS.isElementExist("planapplication1", "planapplication1", 10);
		if (OS.isClickable("planapplication1", 5)) {
			Thread.sleep(2000L);
			JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
			js.executeScript("arguments[0].click();", OS.get_planapplication1());
			Thread.sleep(2000L);
		}
		OS.isElementExist("Advance Monthly", "advanceMonthly", 10);
		OS.isElementExist("Advance Monthly amount", "advanceMonthlyamount", 10);
		OS.isElementExist("text SimoOnltAllData1", "textgcash1", 10);
		OS.isElementExist("Shipping", "shipping", 10);
		OS.isElementExist("Free", "free", 10);
		OS.isElementExist("plan Amount First", "planAmountfirst", 10);
		OS.isElementExist("Total Monthly Bill", "totalMonthlyBill", 10);
		OS.isElementExist("Total amount pay", "totalamountpay", 10);
		OS.isElementExist("Promo Icon", "PromoIcon", 10);
		OS.isElementExist("Promo Code", "promoCode", 10);
		OS.isElementExist("Promo Click Here", "PromoClickHere", 10);
		OS.isElementExist("Ship Icon", "shipicon", 10);

		OS.isElementExist("Change Adress", "changeAdress", 10);
		OS.isElementExist("submit Order", "submitOrder", 10);

		OS.isElementExist("Monthly Payment", "monthlyPayment", 10);
		OS.isElementExist("plan Action2", "textgcash2", 10);
		OS.isElementExist("GPlangcash599", "gcashamount599", 10);

		OS.isElementExist("Add ons", "addons", 10);


		//			Plan Application Collapse Button 2  

		if (OS.isClickable("addons", 5)) {
			Thread.sleep(2000L);
			JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
			js.executeScript("arguments[0].click();", OS.get_addons());
			//	Thread.sleep(2000L);
		}

		OS.isElementExist("Add On Box", "Addonsheader", 10);

		OS.isElementExist("my Duo", "myDuo", 10);
		OS.isElementExist("viu", "Viupremium", 10);
		OS.isElementExist("spotify", "SpotifyPremium", 10);
		OS.isElementExist("Easy", "Easyroam", 10);
		OS.isElementExist("Gocallid", "Gocallid", 10);
		OS.isElementExist("Gsaddsurf", "GSADdsurf", 10);

		OS.isElementExist("Total Addons", "totaladdons", 10);
		OS.isElementExist("Total Montly bill2", "totaladdonsamount", 10);
		OS.isElementExist("Monthly service", "monthlyservice", 10);
		OS.isElementExist("totalmontlyBillPayment", "Totalmonthlybillamount", 10);

		if (OS.isClickable("submitOrder", 5)) {
			OS.clickOnElement("Button", "NextIcon", "submitOrder");
		}

	}	
	//***********************************************************************************************************************************			    
	//***********************************************************************************************************************************			    
	public void paymentPageGplaneithgcash599() {
		PayP.isElementExist("paymentpage", "Selectpaymentmethod", 10);
		PayP.isElementExist("Gcash", "Gcash", 10);
		PayP.isElementExist("CCstraight", "CCStraightpayment", 10);
		PayP.isElementExist("CCHSBC", "CCHSBC", 10);
		PayP.isElementExist("CCBPI", "CCBPI", 10);
		PayP.isElementExist("COD", "COD", 10);
		PayP.isElementExist("paymentpage", "Onetimepayment", 10);
		PayP.isElementExist("paymentpage", "planApplicationHeader", 10);


		PayP.clickOnElement("Button", "Planapplication", "planApplicationHeader");

		PayP.isElementExist("Plannamegcas", "Plannamegcash", 10);
		PayP.isElementExist("Planamountgcas", "Planamountgcash", 10);
		PayP.isElementExist("TotalAmountHeade", "TotalAmountHeader", 10);
		PayP.isElementExist("Totalamount", "Totalamountpay1", 10);
		PayP.isElementExist("Gotpromo", "Gotapromocodeheader", 10);
		PayP.isElementExist("Promo", "PromoClickhere", 10);  		
		PayP.isElementExist("Shipaddress", "ShiptothisaddressHeader", 10);

		// 	PayP.clickOnElement("Button", "Gcash", "Gcash");
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("arguments[0].click();", PayP.get_Gcash());

		PayP.isElementExist("paymentpage", "Submitbutton", 10);
		PayP.isElementExist("paymentpage", "Monthlypayment", 10);
		PayP.isElementExist("paymentpage", "Noneedtopaythistoday", 10);
		PayP.isElementExist("paymentpage", "Plannamegcash21", 10);

		//Addons
		PayP.isElementExist("Addons", "Addons", 10);		

		PayP.clickOnElement("Button", "Addons", "Addons");

		PayP.isElementExist("myDuo", "myDuo", 10);
		PayP.isElementExist("AmazonPrime", "AmazonPrime", 10);
		PayP.isElementExist("Viupremium", "Viupremium", 10);
		PayP.isElementExist("EasyRoam", "EasyRoam", 10);
		PayP.isElementExist("Gocallid", "Gocallid", 10);
		PayP.isElementExist("Gsaddsurf", "Gsaddsurf", 10);
		PayP.isElementExist("Addonamount", "totaladdonsamount", 10);
		PayP.isElementExist("Totalamountheader", "Totalamountheader", 10);
		PayP.isElementExist("Totalamount", "totalmontlyBillPayment", 10);

		//	PayP.clickOnElement("Button", "Payment", "Submitbutton");			  		
		JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
		js1.executeScript("arguments[0].click();", PayP.get_Submitbutton());

	}	
	/************************************************************************************************************************/										
	public void ValidateGalleryPage() throws InterruptedException {
		Thread.sleep(5000L);
		Gallery.isElementExist("Gallery page: Filter Label", "FilterBtn", 10);
		Gallery.isElementExist("Gallery page: Clear Filter Button", "ClearFilterBtn", 10);
		Gallery.isElementExist("Gallery page: Product Type Filter", "ProdTypeBtn", 10);
		Gallery.isElementExist("Gallery page: Plan Value Filter", "PlanValueBtn", 10);
		Gallery.isElementExist("Gallery page: Brand Filter", "BrandBtn", 10);
		Gallery.isElementExist("Gallery page: Featured Filter", "FeaturedBtn", 10);
		Gallery.isElementExist("Gallery page: Apply Filter button", "ApplyFilterBtn", 10);
		Gallery.isElementExist("Gallery page: Search Textfield", "SearchField", 10);
		Gallery.isElementExist("Gallery page: Sort by", "SortByList", 10);

		//Selecting a plan value
		Gallery.isElementExist("Planvalue","Planvalue",10);
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("arguments[0].click();", Gallery.get_Planvale_dropdownbtn());
		Thread.sleep(2000L);
		JavascriptExecutor js2 = (JavascriptExecutor) DriverManager.getDriver();
		js2.executeScript("arguments[0].click();", Gallery.get_plan2499());

		Thread.sleep(2000L);
		JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
		js1.executeScript("arguments[0].click();", Gallery.get_Applybutton());

		Thread.sleep(3000L);
		Gallery.get_SearchField().sendKeys("Samsung Galaxy A22 5G");
		Gallery.get_SearchField().sendKeys(Keys.ENTER);

		
		System.out.println("Gallery page: Search product Samsung Galaxy A22 5G");
		LP.scroll_vertical(1000);

		Gallery.isElementExist("Gallery page: Device Found", "DeviceFound", 10);
		Gallery.isElementExist("Gallery page: Product Name", "ProdName", 10);
		Gallery.isElementExist("Gallery page: Product Identifier", "ProdIdentifier", 10);
		Gallery.isElementExist("Gallery page: Product Cashout", "ProdCashout", 10);
		Gallery.isElementExist("Gallery page: Product Availibility", "ProdStockAvailability", 10);
		Gallery.isElementExist("Apply with Device ", "ProdApplywithDevice", 10);
		Thread.sleep(2000L);
		if (Gallery.isClickable("ProdApplywithDevice", 5)) {
			Thread.sleep(2000L);
			//							Gallery.clickOnElement("Link", "Prod Apply with Device", "ProdApplywithDevice");
			JavascriptExecutor js3 = (JavascriptExecutor) DriverManager.getDriver();
			js3.executeScript("arguments[0].click();", Gallery.get_ProdApplywithDevice());
		}
	}	
	/************************************************************************************************************************/										

	public void PDPGplanwithDevice_BrowseDevicesInCarousel() throws Exception {
		Thread.sleep(5000L);
		PP.moveToElement("CarouselDevicePrevBtn");
		PP.isElementExist("PDP Page: Device Carousel", "CarouselDevicePrevBtn", 5);
		PP.isElementExist("PDP Page: Device Carousel", "CarouselDeviceNextBtn", 5);
		LP.scroll_vertical(453);
		for (int i = 0; i < 5; i++) {				    			
			

			Thread.sleep(2000L);
			JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
			js.executeScript("arguments[0].click();", PP.get_CarouselDeviceNextBtn());
		}

		for (int i = 0; i < 2; i++) {
			Thread.sleep(2000L);
			PP.get_CarouselDeviceNextBtn().click();
		}
		

	}	
	public void Discover_pageAlwayson()
	{
		PP.isElementExist("AlwaysBanner1", "starterbanner1Always", 10);
		PP.isElementExist("AlwaysBanner2", "starterbanner2Always", 10);
		PP.isElementExist("AlwaysBanner3", "starterbanner3Always", 10);
		PP.isElementExist("AlwaysBanner4", "starterbanner4Always", 10);
		PP.isElementExist("AlwaysBanner5", "starterbanner5Always", 10);
		PP.isElementExist("AlwaysBanner6", "starterbanner6Always", 10);
		PP.isElementExist("AlwaysBanner7", "starterbanner7Always", 10);
		PP.isElementExist("AlwaysBanner8", "starterbanner8Always", 10);
		PP.isElementExist("AlwaysBanner9", "starterbanner9Always", 10);
	}
	//**************************************************************************	

	public void PDPGplanwithDevice2499() throws Exception {
		PP.isElementExist("Device", "PDP_Device", 10);
		PP.isElementExist("Gcash", "PDP_Gcash", 10);
		PP.isElementExist("Simonly", "PDP_Simonly", 10);
		PP.isElementExist("AllData", "PDP_Alldata", 10);

		PP.isElementExist("Color", "Color_header", 10);		
		PP.isElementExist("Capacity", "Capacity_header", 10);
		PP.isElementExist("Contract_duration", "Contractduration_header", 10);

		//Addons//Data Addon
		
		
		  PP.isElementExist("Dataaddon", "Data_addon", 10); LP.scroll_vertical(453);
		  Thread.sleep(3000L); PP.moveToElement("Data_checkbox");
		  //PP.clickOnElement("Button", "Togglebutton", "Data_checkbox");
		  JavascriptExecutor jsp2 = (JavascriptExecutor) DriverManager.getDriver();
		  jsp2.executeScript("arguments[0].click();", PP.get_Data_checkbox());
		  PP.isElementExist("GS99", "GSAddsurf99", 10); LP.scroll_vertical(353);
		  JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		  js.executeScript("arguments[0].click();", PP.get_GSAddsurf99());
		  
		  
		  //Banner PP.isElementExist("withDevice_Banner", "Banner", 10);
		  
		  //Movies Addon 
		  PP.isElementExist("Moveaddon", "movie_addon", 10);
		  LP.scroll_vertical(453); 
		  Thread.sleep(3000L);
		  PP.moveToElement("movie_checkbox"); 
		 // PP.clickOnElement("Button","Togglebutton", "movie_checkbox"); 
		  JavascriptExecutor jsp3 =(JavascriptExecutor) DriverManager.getDriver();
		  jsp3.executeScript("arguments[0].click();", PP.get_movie_checkbox());
		  PP.isElementExist("Amazon", "Amazonprime", 10);
		  PP.isElementExist("Viu", "Viupremium", 10); 
		  PP.isElementExist("Spotify", "Spotifypremium", 10);
		  PP.clickOnElement("Button", "Amazon", "Amazonprime");
		  PP.clickOnElement("Button", "Viu", "Viupremium");
		  PP.clickOnElement("Button", "Spotify", "Spotifypremium");
		  
		
		  
		 // Message Addon 
		  PP.isElementExist("messageaddon", "message_addon", 10);
		  LP.scroll_vertical(253);
		  Thread.sleep(3000L);
		  PP.moveToElement("message_checkbox");
		 // PP.clickOnElement("Button","Togglebutton", "message_checkbox"); 
		  JavascriptExecutor jsp4 =(JavascriptExecutor) DriverManager.getDriver();
		  jsp4.executeScript("arguments[0].click();", PP.get_message_checkbox());
		  PP.isElementExist("MyDuo", "MyDuo", 10); 
		  PP.isElementExist("MySuperDuo", "MySuperDuo", 10); 
		  JavascriptExecutor js1 = (JavascriptExecutor)
		  DriverManager.getDriver(); js1.executeScript("arguments[0].click();",
		  PP.get_MyDuo());
		  Thread.sleep(3000L);
		  
		  //lifestyle_addon Addon 
		    PP.isElementExist("messageaddon", "lifestyle_addon", 10); 
		    LP.scroll_vertical(253); 
		    Thread.sleep(3000L);
		  PP.moveToElement("lifestyle_checkbox");
		 // PP.clickOnElement("Button", "Togglebutton", "lifestyle_checkbox"); 
		  JavascriptExecutor jsp5 =(JavascriptExecutor) DriverManager.getDriver();
		  jsp5.executeScript("arguments[0].click();", PP.get_lifestyle_checkbox());
		  PP.isElementExist("MyDuo", "easyRoam", 10); 
		  PP.isElementExist("MySuperDuo","Gocallid199", 10); 
		  JavascriptExecutor js2 = (JavascriptExecutor)
		  DriverManager.getDriver(); js2.executeScript("arguments[0].click();",
		  PP.get_easyRoam()); JavascriptExecutor js3 = (JavascriptExecutor)
		  DriverManager.getDriver(); js3.executeScript("arguments[0].click();",
		  PP.get_Gocallid199());
		  Thread.sleep(3000L);
		 

		//Reviewmybag
		PP.isElementExist("Review", "Reviewmyplan", 10);
		PP.clickOnElement("Button", "dragbtn", "Dragbutton");
		Thread.sleep(1000);

		//ViewBreakdown

		PP.isElementExist("Planname", "PlannameGplanwithdevice", 10);
		PP.isElementExist("Planamount", "Gplanwithdeviceamount", 10);
		PP.isElementExist("Planname", "Selecteddevice", 10);
		
		  PP.isElementExist("Planamount", "Selecteddevice_amount", 10);
		  
		  PP.isElementExist("subs", "Subsandaddonheader", 10);
		  PP.isElementExist("MyDuo", "MyDuoaddon", 10); PP.isElementExist("Amazon",
		  "AmazonAddon", 10); PP.isElementExist("viu", "Breakdownn_Viupremium", 10);
		  PP.isElementExist("spotify", "Breakdownn_Spotifypremium", 10);
		  PP.isElementExist("Gocallid", "Breakdownn_Gocallid", 10);
		  PP.isElementExist("Easyroam", "Breakdownn_EasyRoam", 10);
		  PP.isElementExist("Goaddsurf", "Breakdownn_Gsaddsurf", 10);
		  
		  PP.isElementExist("Totalsubs", "Totalsubsandaddons", 10);
		  PP.isElementExist("totalsubsaddon", "Addonsamount", 10);
		  PP.isElementExist("MothlyBillheader", "Monthlybill_header", 10);
		  PP.isElementExist("Monthlybillamnt", "GplanwithdeviceMonthlyamount", 10);
		 


	}					        
	//***********************************************************************************************************************************			    

	public void Toggle_Shippingaddress()
	{

		Form.isElementExist("journeystatus", "journeyDAF2", 10);

		//toggled 

		Form.isElementExist("Toggledbtn","Toggledbtn",10);
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("arguments[0].click();", Form.Togglebtn_select());
	}

	//***********************************************************************************************************************************			    
	//***********************************************************************************************************************************
	//	Order summary page
	public void orderSummaryGplanwithdevice2499() throws Exception {
		OS.isElementExist("Cookies Notification", "cookiesNotification", 10);
		OS.isElementExist("Privacy Accept", "privacyAccept", 10);
		OS.isElementExist("Acquisition Summary", "acquisitionSummary", 10);
		OS.isElementExist("Build My Plan", "buildPlan", 10);
		OS.isElementExist("Fill Out", "fillOut", 10);
		OS.isElementExist("Review", "review", 10);
		OS.isElementExist("Pay", "pay", 10);
		OS.isElementExist("For Processing", "forProcessing", 10);
		OS.isElementExist("Notice Block", "noticeBlock", 10);
		OS.isElementExist("Go Icon Notice", "goIconGoNotice", 10);
		OS.isElementExist("Go Text Preamble", "goTextPreamble", 10);
		OS.isElementExist("Order summary", "orderSummary", 10);
		OS.isElementExist("GSAD", "gcash599", 10);
		OS.isElementExist("Access", "access", 10);
		OS.isElementExist("go Wifi", "Gowifi", 10);
		OS.isElementExist("Img Mobile", "imgMobile", 10);
		OS.isElementExist("Plan Conclusion", "planInclusion", 10);
		OS.isElementExist("Konsulta", "konsulta", 10);
		OS.isElementExist("Glnusure", "glnusure", 10);
		OS.isElementExist("Add ons", "addOns", 10);
		OS.isElementExist("MyDuo1", "myDuo1", 10);
		OS.isElementExist("Amazon", "aPV", 10);
		OS.isElementExist("Viu", "Viupremiumaddons", 10);
		OS.isElementExist("Spotify", "Spotifypremium", 10);
		OS.isElementExist("easy", "easyroam", 10);
		OS.isElementExist("Gocall", "Gocallidaddons", 10);
		OS.isElementExist("GSaddsurf", "GSAddsurf", 10);

		OS.isElementExist("One Time Payment", "oneTimePayment", 10);
		OS.isElementExist("Plan Application1", "planapplication1", 10);

		//			Plan Application Collapse Button 1  
		OS.isElementExist("planapplication1", "planapplication1", 10);
		if (OS.isClickable("planapplication1", 5)) {
			Thread.sleep(2000L);
			JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
			js.executeScript("arguments[0].click();", OS.get_planapplication1());
			Thread.sleep(2000L);
		}
		OS.isElementExist("Advance Monthly", "advanceMonthly", 10);
		OS.isElementExist("Advance Monthly amount", "advanceMonthlyamount", 10);
		OS.isElementExist("text SimoOnltAllData1", "textgcash1", 10);
		OS.isElementExist("Shipping", "shipping", 10);
		OS.isElementExist("Free", "free", 10);
		OS.isElementExist("plan Amount First", "planAmountfirst", 10);
		OS.isElementExist("Total Monthly Bill", "totalMonthlyBill", 10);
		OS.isElementExist("Total amount pay", "totalamountpay", 10);
		OS.isElementExist("Promo Icon", "PromoIcon", 10);
		OS.isElementExist("Promo Code", "promoCode", 10);
		OS.isElementExist("Promo Click Here", "PromoClickHere", 10);
		OS.isElementExist("Ship Icon", "shipicon", 10);

		OS.isElementExist("Change Adress", "changeAdress", 10);
		OS.isElementExist("submit Order", "submitOrder", 10);

		OS.isElementExist("Monthly Payment", "monthlyPayment", 10);
		OS.isElementExist("plan Action2", "textgcash2", 10);
		OS.isElementExist("GPlangcash599", "gcashamount599", 10);

		OS.isElementExist("Add ons", "addons", 10);


		//			Plan Application Collapse Button 2  

		if (OS.isClickable("addons", 5)) {
			Thread.sleep(2000L);
			JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
			js.executeScript("arguments[0].click();", OS.get_addons());
			//	Thread.sleep(2000L);
		}

		OS.isElementExist("Add On Box", "Addonsheader", 10);

		OS.isElementExist("my Duo", "myDuo", 10);
		OS.isElementExist("viu", "Viupremium", 10);
		OS.isElementExist("spotify", "SpotifyPremium", 10);
		OS.isElementExist("Easy", "Easyroam", 10);
		OS.isElementExist("Gocallid", "Gocallid", 10);
		OS.isElementExist("Gsaddsurf", "GSADdsurf", 10);

		OS.isElementExist("Total Addons", "totaladdons", 10);
		OS.isElementExist("Total Montly bill2", "totaladdonsamount", 10);
		OS.isElementExist("Monthly service", "monthlyservice", 10);
		OS.isElementExist("totalmontlyBillPayment", "Totalmonthlybillamount", 10);

		if (OS.isClickable("submitOrder", 5)) {
			OS.clickOnElement("Button", "NextIcon", "submitOrder");
		}

	}	
	//***********************************************************************************************************************************			    
	public void paymentPageGplanwithdevice2499() throws InterruptedException {
		PayP.isElementExist("paymentpage", "Selectpaymentmethod", 10);
		PayP.isElementExist("Gcash", "Gcash", 10);
		PayP.isElementExist("CCstraight", "CCStraightpayment", 10);
		PayP.isElementExist("CCHSBC", "CCHSBC", 10);
		PayP.isElementExist("CCBPI", "CCBPI", 10);
		PayP.isElementExist("COD", "COD", 10);
		PayP.isElementExist("paymentpage", "Onetimepayment", 10);
		PayP.isElementExist("paymentpage", "planApplicationHeader", 10);


		PayP.clickOnElement("Button", "Planapplication", "planApplicationHeader");

		PayP.isElementExist("Plannamegcas", "Plannamegcash", 10);
		PayP.isElementExist("Planamountgcas", "Planamountgcash", 10);
		PayP.isElementExist("TotalAmountHeade", "TotalAmountHeader", 10);
		PayP.isElementExist("Totalamount", "Totalamountpay1", 10);
		PayP.isElementExist("Gotpromo", "Gotapromocodeheader", 10);
		PayP.isElementExist("Promo", "PromoClickhere", 10);  		
		PayP.isElementExist("Shipaddress", "ShiptothisaddressHeader", 10);

		// PayP.clickOnElement("Button", "Gcash", "Gcash");
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("arguments[0].click();", PayP.get_CCBPI());

		PayP.isElementExist("paymentpage", "Submitbutton", 10);
		PayP.isElementExist("paymentpage", "Monthlypayment", 10);
		PayP.isElementExist("paymentpage", "Noneedtopaythistoday", 10);
		PayP.isElementExist("paymentpage", "Plannamegcash21", 10);

		//Addons
		PayP.isElementExist("Addons", "Addons", 10);		

		PayP.clickOnElement("Button", "Addons", "Addons");

		PayP.isElementExist("myDuo", "myDuo", 10);
		PayP.isElementExist("AmazonPrime", "AmazonPrime", 10);
		PayP.isElementExist("Viupremium", "Viupremium", 10);
		PayP.isElementExist("EasyRoam", "EasyRoam", 10);
		PayP.isElementExist("Gocallid", "Gocallid", 10);
		PayP.isElementExist("Gsaddsurf", "Gsaddsurf", 10);
		PayP.isElementExist("Addonamount", "totaladdonsamount", 10);
		PayP.isElementExist("Totalamountheader", "Totalamountheader", 10);
		PayP.isElementExist("Totalamount", "totalmontlyBillPayment", 10);

		//	PayP.clickOnElement("Button", "Payment", "Submitbutton");			  		
		JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
		js1.executeScript("arguments[0].click();", PayP.get_Submitbutton());
		
		Thread.sleep(110000);
		
		JavascriptExecutor js2 = (JavascriptExecutor) DriverManager.getDriver();
		js2.executeScript("arguments[0].click();", PayP.get_Submitbutton());


	}	
	//*************************************************************************************
	//*******************************Bhavana script ends here***************************				  	


	public void SelectPaymentOption(String PaymentOption) {
		PayP.moveToElement("Onetimepayment");
		PayP.isElementExist("paymentpage: Reminder", "PayReminder", 10);
		PayP.isElementExist("paymentpage: Select payment method ", "Selectpaymentmethod", 10);
		PayP.isElementExist("paymentpage: Gcash", "Gcash", 10);
		PayP.isElementExist("paymentpage: CCStraightpayment", "CCStraightpayment", 10);
		PayP.isElementExist("paymentpage: CCHSBC", "CCHSBC", 10);
		PayP.isElementExist("paymentpage: CCBPI", "CCBPI", 10);
		PayP.isElementExist("paymentpage: COD", "COD", 10);

		if(PaymentOption.equalsIgnoreCase("COD")) {
			PayP.js_clickOnElement("Button", "paymentpage: COD", "COD");
			PayP.isElementExist("paymentpage: PayOption Statement", "COD_Statment", 10);} 		
		else if(PaymentOption.equalsIgnoreCase("CCStraightpayment")) {
			PayP.js_clickOnElement("Button", "paymentpage: CCStraightpayment", "CCStraightpayment");
			PayP.isElementExist("paymentpage: PayOption Statement", "COD_Statment", 10);} 		
		else if(PaymentOption.equalsIgnoreCase("CCHSBC")) {
			PayP.js_clickOnElement("Button", "paymentpage: CCHSBC", "CCHSBC");
			PayP.isElementExist("paymentpage: PayOption Statement", "COD_Statment", 10);}  		
		else if(PaymentOption.equalsIgnoreCase("CCBPI")) {
			PayP.js_clickOnElement("Button", "paymentpage: CCBPI", "CCBPI");
			PayP.isElementExist("paymentpage: PayOption Statement", "COD_Statment", 10);} 		
		else if(PaymentOption.equalsIgnoreCase("Gcash")) {
			PayP.js_clickOnElement("Button", "paymentpage: Gcash", "Gcash");
			PayP.isElementExist("paymentpage: PayOption Statement", "COD_Statment", 10);}

		Constant.dataMap.get().put("Magento_PaymentShippingMethod", PaymentOption);
		Constant.dataMap.get().put("PaymentMethodUsed", PaymentOption);
	}
public void validateOrderTrackerDetailsSimonly(String email) throws InterruptedException {
		
		TrackOrder.jsClick("trackOrderLink", "trackOrderLink");
		Thread.sleep(5000);
		TrackOrder.get_referenceNumber().sendKeys(Constant.ReferenceNo);
		System.out.println("Inserted Reference Number on Track your order screen : " + Constant.ReferenceNo);
		
		TrackOrder.get_email().sendKeys(email);
		System.out.println("Inserted email on Track your order screen :"+ email);
		
		TrackOrder.jsClick("btn_trackOrder", "btn_trackOrder");

		if(OrderDetails.isElementExist("OrderDetails", "OrderDetails", 10)) {
			System.out.println("*****************************We are in order tracker page******************************");
		} 
		
		OrderDetails.isElementExist("MyOrder", "MyOrder", 10);
		
		if(OrderDetails.isElementExist("REFERENCE NUMBER","REFERENCE_NUMBER", 10)) {
    		String REFERENCE_NUMBER = OrderDetails.get_REFERENCE_NUMBER().getText();
        	System.out.println("REFERENCE_NUMBER: "+REFERENCE_NUMBER);  
    	}
		
		OrderDetails.isElementExist("Processing", "Processing", 10);
		OrderDetails.isElementExist("Deliver", "Deliver", 10);
		OrderDetails.isElementExist("Receive", "Receive", 10);

		if(OrderDetails.isElementExist("orderTrackerStatus","orderTrackerStatus", 10)) {
    		String orderTrackerStatus = OrderDetails.get_orderTrackerStatus().getText();
        	System.out.println("orderTrackerStatus: "+orderTrackerStatus);  
    	}
		
		if(OrderDetails.isElementExist("DateOrdered","DateOrdered", 10)) {
    		String DateOrdered = OrderDetails.get_DateOrdered().getText();
        	System.out.println("DateOrdered: "+DateOrdered);  
    	}
		
		
		if(OrderDetails.isElementExist("Total Amount","totalAmount", 10)) {
    		String totalAmount = OrderDetails.get_totalAmount().getText();
        	System.out.println("totalAmount: "+totalAmount);  
    	}
		
		
		if(OrderDetails.isElementExist("ShipToThisAddress","ShipToThisAddress", 10)) {
    		String ShipToThisAddress = OrderDetails.get_ShipToThisAddress().getText();
        	System.out.println("ShipToThisAddress: "+ShipToThisAddress);  
    	}
		
		
		if(OrderDetails.isElementExist("planType","planType", 10)) {
    		String planType = OrderDetails.get_planType().getText();
        	System.out.println("planType: "+planType);  
    	}
		
		OrderDetails.isElementExist("AllAccessData", "AllAccessData", 10);
		OrderDetails.isElementExist("GoWifi", "GoWifi", 10);
		OrderDetails.isElementExist("CallAndtext", "CallAndtext", 10);
		OrderDetails.isElementExist("PlanInclusions", "PlanInclusions", 10);
		OrderDetails.isElementExist("KonsultaMD", "KonsultaMD", 10);
		OrderDetails.isElementExist("Add_ons", "Add_ons", 10);
		OrderDetails.isElementExist("AmazonPrimeVideo", "AmazonPrimeVideo", 10);
		OrderDetails.isElementExist("ViuPremium", "ViuPremium", 10);
		OrderDetails.isElementExist("MySuperDuo", "MySuperDuo", 10);
		OrderDetails.isElementExist("EasyRoam", "EasyRoam", 10);
		OrderDetails.isElementExist("GOCALLIDD", "GOCALLIDD", 10);		
	}

	
	public void paymentpageValidationSimonly599(String PaymentMode) throws InterruptedException {
		
		if(PayP.isElementExist("Acquisition Pay Text", "AcquisitionPay", 10)) {
    		System.out.println("********************************We are in Payment Page*************************");
    	}
    	
    	PayP.isElementExist("We Will Collect Payment when appication is approved Text", "WelCollectPayment", 10);
    	PayP.isElementExist("Select Payment Method Text", "SelectPaymentMethod", 10);
    	PayP.isElementExist("Select Payment Method Text", "SelectPaymentMethod", 10);
    	
    	switch (PaymentMode) {
		case "Gcash":
    		PayP.jsClick("Gcash", "Gcash");
			break;
		case "COD":
    		PayP.jsClick("CashOnDelivery", "CashOnDelivery");
			break;
		case "HSBC":
    		PayP.jsClick("HSBC", "HSBC");
			break;
		case "CC":
    		PayP.jsClick("CreditCard", "CreditCard");
			break;
		case "Bpi":
    		PayP.jsClick("Bpi", "Bpi");
			break;
		default :
			System.out.println("Given mode of payment not exist");
    	}
    	
    	PayP.isElementExist("One Time Payment Text", "OneTimePaymentText", 10);
    	PayP.isElementExist("Plan Application Text", "PlanApplication", 10);
    	
    	if(PayP.isElementExist("Plan Application Collapse Button", "PlanApplicationCollapseBtn", 10)) {
    		PayP.jsClick("PlanApplicationCollapseBtn", "PlanApplicationCollapseBtn");		
    	}
    	
    	if(PayP.isElementExist("Advance MonthlyServiceCharge", "AdvanceMonthlyServiceCharge", 10)) {
    		String AdvanceMonthlyServiceCharge = PayP.get_AdvanceMonthlyServiceCharge().getText();
    		System.out.println("AdvanceMonthlyServiceCharge: "+AdvanceMonthlyServiceCharge);		
    	}
    	if(PayP.isElementExist("Shipping", "Shipping", 10)) {
    		String Shipping = PayP.get_Shipping().getText();
    		System.out.println("Shipping: "+Shipping);		
    	}
    	if(PayP.isElementExist("TotalAmount", "Total_Amount", 10)) {
    		String TotalAmount = PayP.get_Total_Amount().getText();
    		System.out.println("TotalAmount: "+TotalAmount);		
    	}
    	
    	PayP.isElementExist("Got PromoCode Text", "GotPromoCode", 10);
    	PayP.isElementExist("Ship To This Address Text", "ShipToThisAddressText", 10);
    	PayP.isElementExist("Click Here Btn", "ClickHereBtn", 10);
    	
    	if(PayP.isElementExist("Shipping Address", "ShippingAddress", 10)) {
    		String ShippingAddress = PayP.get_ShippingAddress().getText();
    		System.out.println("ShippingAddress: "+ShippingAddress);		
    	}
    	
    	PayP.isElementExist("Change Address Link", "ChangeAddress", 10);
    	PayP.isElementExist("Monthly Payment Text", "MonthlyPayment", 10);
    	PayP.isElementExist("No Need To Pay Today Text", "NoNeddToPayToday", 10);
    	PayP.isElementExist("Addons Text", "AddonsText", 10);
    	
    	if(PayP.isElementExist("Addons Collapse Btn", "AddonscollapseBtn", 10)) {
    		PayP.jsClick("AddonscollapseBtn", "AddonscollapseBtn");		
    	}
    	
    	PayP.isElementExist("My_SuperDuo", "My_SuperDuo", 10);
    	PayP.isElementExist("Amazon_PrimeVideo", "Amazon_PrimeVideo", 10);
    	PayP.isElementExist("Viu_Premium", "Viu_Premium", 10);
    	//PayP.isElementExist("Spotify_Premium", "Spotify_Premium", 10);
    	PayP.isElementExist("Easy_Roam", "Easy_Roam", 10);
    	PayP.isElementExist("GOCALLIDD_199", "GOCALLIDD_199", 10);
    	
    	if(PayP.isElementExist("Total_Addons", "Total_Addons", 10)) {
    		String Total_Addons = PayP.get_Total_Addons().getText();
    		System.out.println("Total_Addons: "+Total_Addons);		
    	}
    	
    	if(PayP.isElementExist("Total_MonthlyBill", "Total_MonthlyBill", 10)) {
    		String Total_MonthlyBill = PayP.get_Total_MonthlyBill().getText();
    		System.out.println("Total_MonthlyBill: "+Total_MonthlyBill);		
    	}
    	
    	if(PayP.isElementExist("Submit Order Button", "submitOrder", 10)) {
    		PayP.jsClick("Submit Order Button", "submitOrder");		
    	}  
    	
    	Thread.sleep(5000); 
    	Constant.dataMap.get().put("Magento_PaymentShippingMethod", PaymentMode);
		Constant.dataMap.get().put("PaymentMethodUsed", PaymentMode);
	}

	public void paymentPage_ADA5_GS99withOB() throws InterruptedException {
		Thread.sleep(10000L);
		assertTrue(DriverManager.getDriver().getTitle().contains("Pay"));
		System.out.println("Validated title : Pay");	

		PayP.isElementExist("paymentpage: Onetimepayment", "Onetimepayment", 10);
		PayP.isElementExist("paymentpage: planApplicationHeader", "planApplicationHeader", 10);
		PayP.isElementExist("paymentpage: Colapsebutton1", "Colapsebutton1", 10);

		PayP.clickOnElement("Button", "paymentpage: Colapsebutton1", "Colapsebutton1");

		PayP.isElementExist("paymentpage: OBLabel", "OBLabel", 10);
		PayP.isElementExist("paymentpage: OBPrice", "OBPrice", 10);
		PayP.isElementExist("paymentpage: Planname", "Planname", 10);
		PayP.isElementExist("paymentpage: Planamount", "Planamount", 10);
		PayP.isElementExist("paymentpage: TotalAmountHeader", "TotalAmountHeader", 10);
		PayP.isElementExist("paymentpage: TotalAmount", "TotalAmount", 10);
		PayP.isElementExist("paymentpage: Gotapromocodeheader", "Gotapromocodeheader", 10);
		PayP.isElementExist("paymentpage: PromoClickhere", "PromoClickhere", 10);  		
		PayP.isElementExist("paymentpage: ShiptothisaddressHeader", "ShiptothisaddressHeader", 10);

		PayP.isElementExist("paymentpage: Submitbutton", "Submitbutton", 10);
		PayP.isElementExist("paymentpage: Monthlypayment", "Monthlypayment", 10);
		PayP.isElementExist("paymentpage: Noneedtopaythistoday", "Noneedtopaythistoday", 10);
		PayP.isElementExist("paymentpage: Planname1", "Planname1", 10);
		PayP.isElementExist("paymentpage: Addons", "Addons", 10);

		PayP.moveToElement("Onetimepayment");
		PayP.isElementExist("paymentpage: TotalMonthlybill", "TotalMonthlybill", 10);
		PayP.isElementExist("paymentpage: MonthlysvcplusAddons", "MonthlysvcplusAddons", 10);
		PayP.isElementExist("paymentpage: Tptalmonthlyamount", "Tptalmonthlyamount", 10);

		//PayP.isElementExist("paymentpage: Colapsebutton2", "Colapsebutton2", 10);
		//PayP.clickOnElement("Button", "paymentpage: Colapsebutton2", "Colapsebutton2");

		//PayP.isElementExist("paymentpage: Colapsebutton1", "Colapsebutton1", 10);		
		//PayP.js_clickOnElement("Button", "paymentpage: Colapsebutton1", "Colapsebutton1");

		PayP.isElementExist("paymentpage:", "GSADD", 10);
		//PayP.isElementExist("paymentpage:", "AmazonPrime", 10);


		PayP.js_clickOnElement("Button", "Payment", "Submitbutton");
		
		Thread.sleep(110000);
		PayP.js_clickOnElement("Button", "Payment", "Submitbutton");
		
		Thread.sleep(20000);

	}
	/***********************************Ronnie script ends here***************************************************************/

	/***********************************ADA1 script STARTS here***************************************************************/				
	//					    SELECTING THE VALUE  GPLAN SIM-ONLY 599
	public void GplanSimOnly_599() {
		if (LP.isClickable("GplanSimOnly_599", 5)) {
			LP.clickOnElement("Button", "Gplan Sim-only", "GplanSimOnly_599");
		}

	}

	public void PDPSimPlusOnly() throws Exception {
		PP.isElementExist("Device", "PDP_Device", 10);
		PP.isElementExist("Gcash", "PDP_Gcash", 10);
		PP.isElementExist("Simonly", "PDP_Simonly", 10);
		PP.isElementExist("AllData", "PDP_Alldata", 10);

		if(PP.isElementExist("Youtube Addon", "YoutubeAddon", 10)) {
			PP.js_clickOnElement("Button", "Youtube Addon", "YoutubeAddon");
		}
	
		PP.isElementExist("Moveaddon", "movie_addon", 10);
		LP.scroll_vertical(253);
		Thread.sleep(3000L);
		PP.moveToElement("movie_checkbox");
		JavascriptExecutor js2 = (JavascriptExecutor) DriverManager.getDriver();
		js2.executeScript("arguments[0].click();", PP.get_movie_checkbox());                 



		PP.isElementExist("Amazon Prime Video", "AmazonprimeVideoaddon599", 10);
		PP.isElementExist("Viupremium", "viupremiuum599", 5);
		//PP.isElementExist("Spotifypremium", "Spotifypremium", 10);
		
		PP.js_clickOnElement("Button", "addonapv", "AmazonprimeVideoaddon599");
		PP.js_clickOnElement("Button", "addonviu", "viupremiuum599");
		//PP.js_clickOnElement("Button", "addonspotify", "Spotifypremium");

		
		PP.isElementExist("messageaddon", "message_addon", 10);
		LP.scroll_vertical(253);
		Thread.sleep(3000L);
		PP.moveToElement("message_checkbox");
		JavascriptExecutor js3 = (JavascriptExecutor) DriverManager.getDriver();
		js3.executeScript("arguments[0].click();", PP.get_message_checkbox());                 

		PP.isElementExist("MyDuo", "MyDuo", 10);
		PP.isElementExist("MySuperDuo", "MySuperDuo", 10);
		JavascriptExecutor jssuper = (JavascriptExecutor) DriverManager.getDriver();
		jssuper.executeScript("arguments[0].click();", PP.get_MySuperDuo());                 

		

		PP.isElementExist("lifestyleaddon", "lifestyle_addon", 10);
		LP.scroll_vertical(253);
		Thread.sleep(3000L);
		PP.moveToElement("lifestyle_checkbox");
		JavascriptExecutor js4 = (JavascriptExecutor) DriverManager.getDriver();
		js4.executeScript("arguments[0].click();", PP.get_lifestyle_checkbox());



		PP.isElementExist("easyRoam", "easyRoam", 10);
		PP.isElementExist("Gocallid199", "Gocallid199", 10);

		PP.js_clickOnElement("Button", "easyRoam", "easyRoam");
		PP.js_clickOnElement("Button", "Gocallid199", "Gocallid199");

		PP.clickOnElement("Button", "Reviewmyplan", "Reviewmyplan");

		// Banner
		LP.scroll_vertical(253);
		PP.isElementExist("Banner", "Banner1", 10);

		//ReviewMybag
		PP.isElementExist("Review", "Reviewmyplan", 10);
		PP.clickOnElement("Button", "dragbtn", "Dragbutton");
		Thread.sleep(1000);

		// ViewBreakdown		
		PP.isElementExist("GPlan Plus SIM-Only", "GplanSimonlyPlanName", 10);					
		PP.isElementExist("Planname", "Plannamegcash", 10);
		PP.isElementExist("Planamount", "Gcashamount", 10);
		PP.isElementExist("subs", "Subsandaddonheader", 10);
		PP.isElementExist("MySuperDuo", "mysuperDuoAddon", 10);
		PP.isElementExist("Amazon", "AmazonAddon", 10);
		PP.isElementExist("viu", "Breakdownn_Viupremium", 10);
		//PP.isElementExist("spotify", "spotifypremiuum599", 10);
		PP.isElementExist("Gocallid", "Breakdownn_Gocallid", 10);
		PP.isElementExist("Easyroam", "Breakdownn_EasyRoam", 10);
		PP.isElementExist("Totalsubs", "Totalsubsandaddons", 10);
		PP.isElementExist("totalsubsaddon", "Addonamount", 10);
		PP.isElementExist("MothlyBillheader", "Monthlybill_header", 10);
		PP.isElementExist("Monthlybillamnt", "Monthyaddon", 10);
		PP.isElementExist("Monthlypaymnt", "Monthly_payment", 10);
		PP.isElementExist("Monthlypaymentamount", "Totalmontlypaymentsimonly", 10);

	}	
	
	public void validateSimOnlyBreakdownPage() throws InterruptedException {
		
		if(PP.isElementExist("TestData Displayed In Breakdown", "testDataDisplayedInBreakdown", 10)) {
			String testData = PP.get_testDataDisplayedInBreakdown().getText();
			System.out.println("TestData displayed in breakdown page:"+testData);
		}
		
		if(PP.isElementExist("TestData Displayed In Breakdown", "nameOfThePlanInBreakDown", 10)) {
			String nameOfThePlan = PP.get_nameOfThePlanInBreakDown().getText();
			System.out.println("Name Of The Plan breakdown page:"+nameOfThePlan);
		}
		
		PP.isElementExist("contract Duration In BreakDown", "contractDurationInBreakDown", 10);
		PP.isElementExist("all Access Data In BreakDown", "allAccessDataInBreakDown", 10);
		PP.isElementExist("go Wifi Access In BreakDown", "goWifiAccessInBreakDown", 10);
		PP.isElementExist("call_TextInBreakdown", "call_TextInBreakdown", 10);
		PP.isElementExist("plan Inclusions In Breakdown", "planInclusionsInBreakdown", 10);
		PP.isElementExist("KonsultaMD In Breakdown", "KonsultaMDInBreakdown", 10);
		PP.isElementExist("MySuperDuo In Breakdown", "MySuperDuoInBreakdown", 10);
		PP.isElementExist("Amazon Prime Video In Breakdown", "AmazonPrimeVideoInBreakdown", 10);
		PP.isElementExist("Viu Premium In Breakdown", "ViuPremiumInBreakdown", 10);
		PP.isElementExist("EasyRoam", "EasyRoam", 10);
		PP.isElementExist("GOCALLIDD In Breakdown", "GOCALLIDDInBreakdown", 10);

		if(PP.isElementExist("TotalSubs_AddonsInBreakdown", "TotalSubs_AddonsInBreakdown", 10)) {
			String TotalSubs_AddonsInBreakdown = PP.get_TotalSubs_AddonsInBreakdown().getText();
			System.out.println("TotalSubs_AddonsInBreakdown:"+TotalSubs_AddonsInBreakdown);
		}
		
		if(PP.isElementExist("MonthlyBillSub_AddonsInBreakdown", "MonthlyBillSub_AddonsInBreakdown", 10)) {
			String MonthlyBillSub_AddonsInBreakdown = PP.get_MonthlyBillSub_AddonsInBreakdown().getText();
			System.out.println("MonthlyBillSub_AddonsInBreakdown: "+MonthlyBillSub_AddonsInBreakdown);
		}
		
		if(PP.isElementExist("MonthlyPaymentInBreakdown", "MonthlyPaymentInBreakdown", 10)) {
			String MonthlyPaymentInBreakdown = PP.get_MonthlyPaymentInBreakdown().getText();
			System.out.println("MonthlyPaymentInBreakdown:"+MonthlyPaymentInBreakdown);
		}
		
		PP.js_clickOnElement("Proceed With My Plan Button", "Breakdown_proceedbutton", "Breakdown_proceedbutton");		
	}
	
	//  Validate Second set of account checking Page starts
	public void validateEligibility_ProcessingLoaderPage() throws InterruptedException {

		Thread.sleep(5000L);
		assertTrue(DriverManager.getDriver().getTitle().contains("Processing"));
		System.out.println("Validated title : " + DriverManager.getDriver().getTitle().contains("Processing"));

		PageLoader.isElementExist("Loader: Loading Icon", "LoadingImg", 10);
		PageLoader.isElementExist("Loader: Loading Header", "LoadingHeader", 10);
		PageLoader.isElementExist("Loader: Loading Spiel", "LoadingMsg", 10);
		PageLoader.isElementExist("Loader: Loading Banner", "LoadingBanner", 10);
	}	
							


	/*
	 * public void ErrorPageSimOnlyPlan599() throws Exception{
	 * EP.isElementExist("AquisitionError","AquisitionError", 10);
	 * EP.isElementExist("uh oh","uh_oh", 10); EP.isElementExist("sorry message",
	 * "sorry", 10); EP.isElementExist("Mobile Number", "mobileNumber", 10);
	 * EP.isElementExist("Email Adress", "Email_Adress", 10);
	 * EP.isElementExist("SubmitButton", "SubmitButton", 10);
	 * EP.isElementExist("Go Back Button", "GoBackButton", 10);
	 * 
	 * }
	 */
	

	public void ValidateGalleryPageWithGplan1499() throws InterruptedException {
		Thread.sleep(5000L);
		Gallery.isElementExist("Gallery page: Filter Label", "FilterBtn", 10);
		Gallery.isElementExist("Gallery page: Clear Filter Button", "ClearFilterBtn", 10);
		Gallery.isElementExist("Gallery page: Product Type Filter", "ProdTypeBtn", 10);
		Gallery.isElementExist("Gallery page: Plan Value Filter", "PlanValueBtn", 10);
		Gallery.isElementExist("Gallery page: Brand Filter", "BrandBtn", 10);
		Gallery.isElementExist("Gallery page: Featured Filter", "FeaturedBtn", 10);
		Gallery.isElementExist("Gallery page: Apply Filter button", "ApplyFilterBtn", 10);
		Gallery.isElementExist("Gallery page: Search Textfield", "SearchField", 10);
		Gallery.isElementExist("Gallery page: Sort by", "SortByList", 10);
		
		// Need to select plan type and apply filter then search for device
		
		//Selecting a plan value
		Gallery.isElementExist("Planvalue","Planvalue",10);
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
	     js.executeScript("arguments[0].click();", Gallery.get_Planvale_dropdownbtn());
	     Thread.sleep(2000L);
	     JavascriptExecutor js2 = (JavascriptExecutor) DriverManager.getDriver();
	     js2.executeScript("arguments[0].click();", Gallery.get_plan1499());
	   //Click On Apply Filter
	     Thread.sleep(6000L);
	     Gallery.isElementExist("Cliked on Apply Filter","Applybutton",10);
	     JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
	     js1.executeScript("arguments[0].click();", Gallery.get_Applybutton());
	     Thread.sleep(6000L);
		Gallery.get_SearchField().sendKeys("Samsung Galaxy M12");
		Gallery.get_SearchField().sendKeys(Keys.ENTER);

		System.out.println("Gallery page: Search product Samsung Galaxy M12");
		LP.scroll_vertical(5000);
		
		 ((JavascriptExecutor) DriverManager.getDriver()).executeScript(
	     "arguments[0].scrollIntoView(true);", Gallery.get_Colour());
		
		 JavascriptExecutor jss = (JavascriptExecutor) DriverManager.getDriver();
		  jss.executeScript("arguments[0].click();",
		  Gallery.get_Colour()); 
		
		

		Gallery.isElementExist("Gallery page: Device Found", "DeviceFound", 10);
		Gallery.isElementExist("Gallery page: Product Name", "ProdName", 10);
		Gallery.isElementExist("Gallery page: Product Identifier", "ProdIdentifier", 10);
		Gallery.isElementExist("Gallery page: Product Cashout", "ProdCashout", 10);
		Gallery.isElementExist("Gallery page: Product Availibility", "ProdStockAvailability", 10);
		Gallery.isElementExist("Apply with Device ", "ProdApplywithDevice", 10);
		Thread.sleep(2000L);
		
		  if (Gallery.isClickable("ProdApplywithDevice", 5)) { Thread.sleep(2000L);
		  JavascriptExecutor js22 = (JavascriptExecutor) DriverManager.getDriver();
		  js22.executeScript("arguments[0].click();",
		  Gallery.get_ProdApplywithDevice()); }
		 
		/*
		 * JavascriptExecutor js22 = (JavascriptExecutor) DriverManager.getDriver();
		 * js22.executeScript("arguments[0].click();", Gallery.get_magnifybutton());
		 * 
		 * if(Gallery.isElementExist("Apply with this device","ApplyWithThisDevice",
		 * 10)) { Gallery.clickOnElement("apply with this device button",
		 * "ApplyWithThisDevice", "ApplyWithThisDevice"); }
		 */
		}
	public void ValidateGalleryPageWithGplan2499() throws InterruptedException {
		Thread.sleep(5000L);
		Gallery.isElementExist("Gallery page: Filter Label", "FilterBtn", 10);
		Gallery.isElementExist("Gallery page: Clear Filter Button", "ClearFilterBtn", 10);
		Gallery.isElementExist("Gallery page: Product Type Filter", "ProdTypeBtn", 10);
		Gallery.isElementExist("Gallery page: Plan Value Filter", "PlanValueBtn", 10);
		Gallery.isElementExist("Gallery page: Brand Filter", "BrandBtn", 10);
		Gallery.isElementExist("Gallery page: Featured Filter", "FeaturedBtn", 10);
		Gallery.isElementExist("Gallery page: Apply Filter button", "ApplyFilterBtn", 10);
		Gallery.isElementExist("Gallery page: Search Textfield", "SearchField", 10);
		Gallery.isElementExist("Gallery page: Sort by", "SortByList", 10);
		
		// Need to select plan type and apply filter then search for device
		
		//Selecting a plan value
		Gallery.isElementExist("Planvalue","Planvalue",10);
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
	     js.executeScript("arguments[0].click();", Gallery.get_Planvale_dropdownbtn());
	     Thread.sleep(2000L);
	     JavascriptExecutor js2 = (JavascriptExecutor) DriverManager.getDriver();
	     js2.executeScript("arguments[0].click();", Gallery.get_plan2499());
	   //Click On Apply Filter
	     Thread.sleep(6000L);
	     Gallery.isElementExist("Cliked on Apply Filter","Applybutton",10);
	     JavascriptExecutor js1 = (JavascriptExecutor) DriverManager.getDriver();
	     js1.executeScript("arguments[0].click();", Gallery.get_Applybutton());
	     Thread.sleep(6000L);
		Gallery.get_SearchField().sendKeys("Apple iPhone 13 Pro Max");
		Gallery.get_SearchField().sendKeys(Keys.ENTER);

		System.out.println("Gallery page: Search product Apple iPhone 13 Pro Max");
		LP.scroll_vertical(1000);
		
		Thread.sleep(5000);
		
		((JavascriptExecutor) DriverManager.getDriver()).executeScript(
	     "arguments[0].scrollIntoView(true);", Gallery.get_Colour());
				
		 JavascriptExecutor jss = (JavascriptExecutor) DriverManager.getDriver();
		 jss.executeScript("arguments[0].click();",
		 Gallery.get_Colour()); 

		Gallery.isElementExist("Gallery page: Device Found", "DeviceFound", 10);
		Gallery.isElementExist("Gallery page: Product Name", "ProdName", 10);
		Gallery.isElementExist("Gallery page: Product Identifier", "ProdIdentifier", 10);
		Gallery.isElementExist("Gallery page: Product Cashout", "ProdCashout", 10);
		Gallery.isElementExist("Gallery page: Product Availibility", "ProdStockAvailability", 10);
		Gallery.isElementExist("Apply with Device ", "ProdApplywithDevice", 10);
		Thread.sleep(2000L);
		if (Gallery.isClickable("ProdApplywithDevice", 5)) {
			Thread.sleep(2000L);
			JavascriptExecutor js22 = (JavascriptExecutor) DriverManager.getDriver();
			 js22.executeScript("arguments[0].click();", Gallery.get_ProdApplywithDevice());
		}
		}

	// Order summary page
	public void orderSummaryADA_1499() throws InterruptedException {
		OS.isElementExist("Acquisition Summary", "acquisitionSummary", 10);
		OS.isElementExist("Build My Plan", "buildPlan", 10);
		OS.isElementExist("Fill Out", "fillOut", 10);
		OS.isElementExist("Review", "review", 10);
		OS.isElementExist("Pay", "pay", 10);
		OS.isElementExist("For Processing", "forProcessing", 10);
		OS.isElementExist("Notice Block", "noticeBlock", 10);
		OS.isElementExist("Go Icon Notice", "goIconGoNotice", 10);
		OS.isElementExist("Go Text Preamble", "goTextPreamble", 10);
		OS.isElementExist("Order summary", "orderSummary", 10);
		OS.isElementExist("GSAD", "gSAD", 10);
		OS.isElementExist("Access", "access", 10);
		OS.isElementExist("go Wifi", "Gowifi", 10);
		OS.isElementExist("Img Mobile", "imgMobile", 10);
		OS.isElementExist("Plan Conclusion", "planInclusion", 10);
		OS.isElementExist("Konsulta", "konsulta", 10);
		OS.isElementExist("Glnusure", "glnusure", 10);
		OS.isElementExist("Add ons", "addOns", 10);
		OS.isElementExist("MyDuo1", "myDuo1", 10);
		OS.isElementExist("APV", "aPV", 10);
		OS.isElementExist("One Time Payment", "oneTimePayment", 10);
		OS.isElementExist("Plan Application1", "planapplication1", 10);

		// Plan Application Collapse Button 1
		OS.isElementExist("Pretermination Fee", "planapplicationcollapse1", 10);
		if (OS.isClickable("planapplication1", 5)) {
			//OS.clickOnElement("Link", "PreterminationDropDown1", "planapplicationcollapse1");
			OS.moveToElement("planapplication1");
			
			JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
            js.executeScript("arguments[0].click();", OS.get_planapplication1());
			Thread.sleep(2000L);
			//OS.get_planapplicationcollapse1().click();
		}
		OS.isElementExist("Advance Monthly", "advanceMonthly", 10);
		OS.isElementExist("Advance Monthly amount", "advanceMonthlyamount", 10);
		OS.isElementExist("text SimoOnltAllData1", "textSimoOnltAllData1", 10);
		OS.isElementExist("Shipping", "shipping", 10);
		OS.isElementExist("Free", "free", 10);
		OS.isElementExist("plan Amount First", "planAmountfirst", 10);
		OS.isElementExist("Total Monthly Bill", "totalMonthlyBill", 10);
		OS.isElementExist("Total amount pay", "totalamountpay", 10);
		OS.isElementExist("Promo Icon", "PromoIcon", 10);
		OS.isElementExist("Promo Code", "promoCode", 10);
		OS.isElementExist("Promo Click Here", "PromoClickHere", 10);
		OS.isElementExist("Ship Icon", "shipicon", 10);
		OS.isElementExist("Shipping Adress", "shippingAdress", 10);
		OS.isElementExist("Change Adress", "changeAdress", 10);
		OS.isElementExist("submit Order", "submitOrder", 10);
		OS.isElementExist("Monthly Payment", "monthlyPayment", 10);
		OS.isElementExist("plan Action2", "planaction2", 10);
		OS.isElementExist("GPlan Gplan with Device 1499", "Gplanwithdevice1499", 10);
		OS.isElementExist("Add ons", "addons", 10);

		// Plan Application Collapse Button 2
		OS.isElementExist("Pretermination Fee", "plan Application Collapse Button2", 10);
		if (OS.isClickable("addons", 5)) {
			//OS.clickOnElement("Link", "plan Application Collapse Button2", "planApplicationcollapsebutton2");
			OS.moveToElement("addons");
			JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
            js.executeScript("arguments[0].click();", OS.get_addons());
			Thread.sleep(2000L);
			//OS.get_planApplicationcollapsebutton2().click();
		}
		
		OS.isElementExist("Add On Box", "addonbox", 10);
		
		OS.isElementExist("my Duo", "myDuo", 10);
		OS.isElementExist("Spotify Premium", "Spotifypremium", 10);
		OS.isElementExist("MySuper Duo", "MySuperDuo", 10);
		OS.isElementExist("Easy Roam", "easyRoam", 10);
		OS.isElementExist("Gocallid199", "Gocallid199", 10);
		OS.isElementExist("Viu premium", "Viupremium", 10);
		OS.isElementExist("Total Addons", "totaladdons", 10);
		OS.isElementExist("Total Montly bill2", "totalMontlybill2", 10);
		OS.isElementExist("Monthly service", "monthlyservice", 10);
		OS.isElementExist("totalmontlyBillPayment", "totalmontlyBillPayment", 10);

//		if (OS.isClickable("submitOrder", 5)) {
//			OS.clickOnElement("Button", "NextIcon", "submitOrder");
//		}
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("arguments[0].click();", OS.get_submitOrder());
		


	}	// payment page
	
	public void paymentPageGplanwithDevice_1499_CC() throws InterruptedException {
		PayP.isElementExist("paymentpage", "Selectpaymentmethod", 10);
		PayP.isElementExist("paymentpage", "Gcash", 10);
		PayP.isElementExist("paymentpage", "CCStraightpayment", 10);
		PayP.isElementExist("paymentpage", "CCHSBC", 10);
		PayP.isElementExist("paymentpage", "CCBPI", 10);
		PayP.isElementExist("paymentpage", "COD", 10);
		PayP.isElementExist("paymentpage", "COD_Statment", 10);
		PayP.isElementExist("paymentpage", "Onetimepayment", 10);
		PayP.isElementExist("paymentpage", "planApplicationHeader", 10);
		PayP.isElementExist("paymentpage", "Colapsebutton1", 10);

		PayP.clickOnElement("Button", "paymentpage", "Colapsebutton1");

		PayP.isElementExist("paymentpage", "Planname", 10);
		PayP.isElementExist("paymentpage", "Planamount", 10);
		PayP.isElementExist("paymentpage", "TotalAmountHeader", 10);
		PayP.isElementExist("paymentpage", "TotalAmount", 10);
		PayP.isElementExist("paymentpage", "Gotapromocodeheader", 10);
		PayP.isElementExist("paymentpage", "PromoClickhere", 10);
		PayP.isElementExist("paymentpage", "ShiptothisaddressHeader", 10);

		//PayP.clickOnElement("Button", "paymentpage", "CCStraightpayment");

		PayP.isElementExist("paymentpage", "Submitbutton", 10);
		PayP.isElementExist("paymentpage", "Monthlypayment", 10);
		PayP.isElementExist("paymentpage", "Noneedtopaythistoday", 10);
		PayP.isElementExist("paymentpage", "Planname1", 10);
		PayP.isElementExist("paymentpage", "Addons", 10);

		PayP.isElementExist("paymentpage", "TotalMonthlybill", 10);
		PayP.isElementExist("paymentpage", "MonthlysvcplusAddons", 10);
		PayP.isElementExist("paymentpage", "Tptalmonthlyamount", 10);

		PayP.isElementExist("paymentpage", "Colapsebutton2", 10);
		//PayP.clickOnElement("Button", "paymentpage", "Colapsebutton2");
		PayP.moveToElement("Addons");
  		JavascriptExecutor js3 = (JavascriptExecutor) DriverManager.getDriver();
        js3.executeScript("arguments[0].click();", PayP.get_Addons());
		PayP.isElementExist("paymentpage", "myDuo", 10);
		PayP.isElementExist("paymentpage", "AmazonPrime", 10);

		//PayP.clickOnElement("Button", "Payment", "Submitbutton");

		JavascriptExecutor jsP = (JavascriptExecutor) DriverManager.getDriver();
        jsP.executeScript("arguments[0].click();", PayP.get_Submitbutton());
        
        Thread.sleep(110000);
        JavascriptExecutor jsP1 = (JavascriptExecutor) DriverManager.getDriver();
        jsP1.executeScript("arguments[0].click();", PayP.get_Submitbutton());
  		
  		
	}
	
	/********************************************************************/
	public void insert_billing_address_details(String House_Condo, String HouseNo_FloorNo, String Street, String Subdi_BuildingName, String Prov, String City, String Brgy) throws InterruptedException {

		
		if(House_Condo.equalsIgnoreCase("Condo")) {
		Form.javascript_clickCondominium();
		System.out.println("Selected radio button : Condominium");

		Form.moveToElement(HouseNo_FloorNo);
		Form.get_floor().sendKeys(HouseNo_FloorNo); System.out.println("Floor : "+HouseNo_FloorNo);
		Form.get_buildingName().sendKeys(Subdi_BuildingName); System.out.println("Building Name : "+Subdi_BuildingName);
		Form.get_street().sendKeys(Street); System.out.println("Street : "+Street);

		Form.select_province(Prov); System.out.println("Province : "+Prov);Thread.sleep(2000L);
		Form.select_city(City); System.out.println("City : "+City);Thread.sleep(2000L);
		Form.select_barangay(Brgy); System.out.println("Barangay : "+Brgy);Thread.sleep(2000L);
		
			String zipCOde = Form.get_zipCode().getAttribute("value");
			if (zipCOde == null || zipCOde.isEmpty()) {
				System.out.println("FAIL : ZIP Code -  is blank");
			} else {
				System.out.println("ZIP Code is pre-populated : " + zipCOde);
			}
			
		Thread.sleep(1000L);
		}
		else {
			Form.javascript_clickRadioBtn_House();
			System.out.println("Selected radio button : House");

			Thread.sleep(2000L);

			Form.get_house().sendKeys(HouseNo_FloorNo); System.out.println("House No : "+HouseNo_FloorNo);
			Form.get_subDivision().sendKeys(Subdi_BuildingName); 
			System.out.println("Subdivision : "+Subdi_BuildingName);
			Form.get_street().clear();
			Form.get_street().sendKeys(Street); System.out.println("Street : "+Street);

			Form.select_province(Prov); System.out.println("Province : "+Prov);Thread.sleep(2000L);
			Form.select_city(City); System.out.println("City : "+City);Thread.sleep(2000L);
			Form.select_barangay(Brgy); System.out.println("Barangay : "+Brgy);Thread.sleep(2000L);
			
			String zipCOde = Form.get_zipCode().getAttribute("value");
			if (zipCOde == null || zipCOde.isEmpty()) {
				System.out.println("FAIL : ZIP Code -  is blank");
			} else {
				System.out.println("ZIP Code is pre-populated : " + zipCOde);
			}

			
			Thread.sleep(1000L);
			
		}
		
		
		

		Constant.dataMap.get().put("ShippingAddress",
				HouseNo_FloorNo+", "+Subdi_BuildingName+", "+Street+", "+Prov+", "+City+", "
						+Brgy); 
//		Constant.dataMap.get().put("OMT_AddressDetails",
//								HouseNo_FloorNo+", "+Subdi_BuildingName+", "+Street+", "+Prov+", "+City+", "
//										+Brgy); 
						
						Constant.dataMap.get().put("Magento_AddressInformation",
												HouseNo_FloorNo+", "+Subdi_BuildingName+", "+Street+", "+Prov+", "+City+", "
														+Brgy);

	}
	
	/********************************************************************************************************************************/
	public void insertDetailsOnTrackYourOrder(String email) throws InterruptedException {
		String orderID = Constant.dataMap.get().get("OrderID");
		TrackOrder.get_referenceNumber().sendKeys(orderID);
		System.out.println("Inserted Reference Number on Track your order screen : " + orderID);

		TrackOrder.get_email().sendKeys(email);
		System.out.println("Inserted email on Track your order screen : shaik.asma@globe.com.ph");

		TrackOrder.scroll_vertical(2000);
		Thread.sleep(1500L);
		TrackOrder.get_btn_trackOrder().click();
	}

	/********************************************************************************************************************************/
	public void validateOrderDetails() throws InterruptedException {

		System.out.println("Reference Number : " + OrderDetails.get_referenceNumber().getText());
		System.out.println("Order Active Status : " + OrderDetails.get_orderActiveStatus().getText());
		System.out.println("Completed Date : " + OrderDetails.get_completedDate().getText());
		OrderDetails.scroll_vertical(4000);
		System.out.println("Product Name : " + OrderDetails.get_device().getText());
		System.out.println("Quantity : " + OrderDetails.get_quantity().getText());
		System.out.println("Product Image : " + OrderDetails.getAttributeValue("productImage", "alt"));
		System.out.println("Update Date : " + OrderDetails.get_updateDate().getText());
		System.out.println("Date Ordered : " + OrderDetails.get_dateOrdered().getText());
		System.out.println("Payment Method : " + OrderDetails.get_paymentMethod().getText());
		System.out.println("Amount Paid : " + OrderDetails.get_amountPaid().getText());
		System.out.println("Shipping Address : " + OrderDetails.get_shippingAddress().getText());
		System.out.println("Estimated Day of Delivery : " + OrderDetails.get_estDayOfDelivery().getText());
	}


	/***********************************ADA1 script Ends here
	 * @throws Exception ***************************************************************/
	
	public void validateOrderTrackerDetails(String email) throws Exception {
		
		TrackOrder.jsClick("trackOrderLink", "trackOrderLink");
		Thread.sleep(5000);
		//TrackOrder.get_referenceNumber().sendKeys(utility.Constant.ReferenceNo);
		
		String orderID =util.ReadFromExcelORDERID("OrderID", "Sheet1",Constant.iCol);
				//Constant.dataMap.get().get("OrderID");
		System.out.println("orderID is:"  +orderID);
		//util.ReadFromRowExcel(OrderID,"Sheet1");
		//util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.OrderRefID);
		
			//	util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.OrderRefID);
				//Constant.dataMap.get().get("OrderID");
		//util.ReadFromRowExcel(Constant.RowValue, "Sheet1", Constant.OrderRefID);
		TrackOrder.get_referenceNumber().sendKeys(orderID);
		System.out.println("Inserted Reference Number on Track your order screen : " + orderID);

		//System.out.println("Inserted Reference Number on Track your order screen : " + utility.Constant.ReferenceNo);
		
		TrackOrder.get_email().sendKeys(email);
		System.out.println("Inserted email on Track your order screen :"+ email);
		
		TrackOrder.jsClick("btn_trackOrder", "btn_trackOrder");

		if(OrderDetails.isElementExist("OrderDetails", "OrderDetails", 10)) {
			System.out.println("*****************************We are in order tracker page******************************");
		} 
		
		OrderDetails.isElementExist("MyOrder", "MyOrder", 10);
		
		if(OrderDetails.isElementExist("REFERENCE NUMBER","REFERENCE_NUMBER", 10)) {
    		String REFERENCE_NUMBER = OrderDetails.get_REFERENCE_NUMBER().getText();
        	System.out.println("REFERENCE_NUMBER: "+REFERENCE_NUMBER);  
    	}
		
		OrderDetails.isElementExist("Processing", "Processing", 10);
		OrderDetails.isElementExist("Deliver", "Deliver", 10);
		OrderDetails.isElementExist("Receive", "Receive", 10);
		OrderDetails.isElementExist("orderActiveStatus", "orderActiveStatus", 10);

		if(OrderDetails.isElementExist("orderTrackerStatus","orderTrackerStatus", 10)) {
    		String orderTrackerStatus = OrderDetails.get_orderTrackerStatus().getText();
        	System.out.println("orderTrackerStatus: "+orderTrackerStatus);  
    	}
		
		if(OrderDetails.isElementExist("DateOrdered","DateOrdered", 10)) {
    		String DateOrdered = OrderDetails.get_DateOrdered().getText();
        	System.out.println("DateOrdered: "+DateOrdered);  
    	}
		
		
		if(OrderDetails.isElementExist("Total Amount","totalAmount", 10)) {
    		String totalAmount = OrderDetails.get_totalAmount().getText();
        	System.out.println("totalAmount: "+totalAmount);  
    	}
		
		
		if(OrderDetails.isElementExist("ShipToThisAddress","ShipToThisAddress", 10)) {
    		String ShipToThisAddress = OrderDetails.get_ShipToThisAddress().getText();
        	System.out.println("ShipToThisAddress: "+ShipToThisAddress);  
    	}
		
		
		if(OrderDetails.isElementExist("planType","planType", 10)) {
    		String planType = OrderDetails.get_planType().getText();
        	System.out.println("planType: "+planType);  
    	}
		
		OrderDetails.isElementExist("AllAccessData", "AllAccessData", 10);
		OrderDetails.isElementExist("GoWifi", "GoWifi", 10);
		OrderDetails.isElementExist("CallAndtext", "CallAndtext", 10);
		OrderDetails.isElementExist("PlanInclusions", "PlanInclusions", 10);
		OrderDetails.isElementExist("KonsultaMD", "KonsultaMD", 10);
		OrderDetails.isElementExist("Add_ons", "Add_ons", 10);
		OrderDetails.isElementExist("AmazonPrimeVideo", "AmazonPrimeVideo", 10);
		OrderDetails.isElementExist("ViuPremium", "ViuPremium", 10);
		OrderDetails.isElementExist("MySuperDuo", "MySuperDuo", 10);
		OrderDetails.isElementExist("EasyRoam", "EasyRoam", 10);
		OrderDetails.isElementExist("GOCALLIDD", "GOCALLIDD", 10);		
	}
	
	public void hover_On_Menu_LinkApply() throws Exception {
		
		if(NP.isElementExist("link_Apply", "link_Apply", 10)) {
			NP.moveToElement("link_Apply");
		}
			
		if(NP.isElementExist("link_ViewAllDevices", "link_ViewAllDevices", 10)) {
			NP.jsClick("link_ViewAllDevices", "link_ViewAllDevices");
		}		
	}
	
	public void clickonMagnifyGlass(String Device) throws Exception {
		
		NP.get_searchBar().sendKeys(Device);
		NP.get_searchBar().sendKeys(Keys.ENTER);
		
		NP.jsClick("magnifyBtn", "magnifyBtn");
	}
	
  public void validateProductDetailsPageByClickonMagnifyGlass() throws Exception {
		
		if(NP.isElementExist("Product details link", "productDetails", 10)) {
			System.out.println("*****************WE ARE IN PRODUCT DETAILS PAGE******************");
			NP.isElementExist("product Gallery link", "productGallery", 10);
			NP.isElementExist("productGallery", "productGallery", 10);	
			NP.isElementExist("Device Name", "deviceNameinPDPage",10);
			String deviceName = NP.get_deviceNameinPDPage().getText();
			System.out.println("Device seleted:"+deviceName);
			
			List<WebElement> colors = NP.get_color_Finish();
			int size = colors.size();
			
			NP.isElementExist("Device capacity", "capacity",10);
			String devicecapacity = NP.get_capacity().getText();
			System.out.println("Capacity of the device is:"+devicecapacity);
			
			NP.isElementExist("Contract Duration", "contractDuration",10);
			String contractDuration = NP.get_contractDuration().getText();
			System.out.println("Contract duration  of the device is:"+contractDuration);
			
			NP.isElementExist("Note", "note",10);
			NP.isElementExist("Discover Gplan Below link", "discoverGplanBelow",10);
					
			
			NP.isElementExist("Plan Card", "planCard",10);
			NP.isElementExist("Notify_Me_button", "Notify_Me_button",10);
			NP.isElementExist("SelectAnotherDevice", "selectAnotherDevice",10);
			NP.isElementExist("Features", "features",10);
			NP.isElementExist("Promos", "promos",10);
			
			//Validate FAQ's
			NP.isElementExist("FaqText1", "faqText1",10);
			NP.isElementExist("FaqText2", "faqText2",10);
			NP.isElementExist("FaqText3", "faqText3",10);
			NP.isElementExist("FaqText4", "faqText4",10);
			NP.isElementExist("FaqText5", "faqText5",10);
			NP.isElementExist("FaqText6", "faqText6",10);	
		}	
			
			else {
				   Thread.sleep(3000);
				   System.out.println("Product details page does not contain any details about selected plan");
				   DriverManager.getDriver().navigate().back();	
				}
	}
  
   public void clickonProductGallery() throws Exception {
	   
	   if(NP.isElementExist("productGallery", "productGallery", 10)) {
			NP.jsClick("productGallery", "productGallery");	
	   }
	   if(NP.isElementExist("filters", "filters", 10)){
		   System.out.println("Successfully Navigated to Device Gallery Page");
	   }
   }
   
   public void enterValidData() throws InterruptedException {
		
	   NP.jsClick("Notify_Me_button","Notify_Me_button");
	   NP.get_Email_Address_Field().clear();
	   NP.get_Mobile_Number_Field().clear();
		
	   NP.get_Email_Address_Field().sendKeys("lavanya.sakhamuri@testingxperts.com");
		
	   NP.get_Mobile_Number_Field().sendKeys("09270000112");
		
	   NP.clickOnElement("Button","Cancel Button","Cancel_Button");
		
	   NP.jsClick("Notify me button","Notify_Me_button");
		
	   NP.get_Email_Address_Field().sendKeys("sakhamurilavanya.@globe.com.ph");
		
	   NP.get_Mobile_Number_Field().sendKeys("09270000112");
		
	   NP.clickOnElement("Button","Notify Me Button1","Notify_Me_Button1");
		
	}
   
   public void validateNotifyPopUp() throws InterruptedException {
		
	   NP.isElementExist("You Are In Loop Msg", "You_Are_In_Loop_Msg", 10);
		
	   NP.isElementExist("We Will Let You Know When device Available", "We_Will_Let_You_KnowText", 10);
		
		//click on Okay button
		if(NP.isElementExist("Okay_Button", "Okay_Button", 10)) {
			NP.clickOnElement("Button","Okay Button","Okay_Button");
		}	
	}

}
