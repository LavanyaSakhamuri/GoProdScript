package com.pages.renewal;

import java.util.NoSuchElementException;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.pages.Acqui.BasePage;

import globeOnline_CommonMethods.DriverManager;

public class Renewal_PaymentPage extends BasePage {
	
	By payText = By.xpath("//label[text()='Pay']");
	By howWouldYouLikeToPay = By.xpath("//span[text()=' How would you like to pay for your plan with device? ']");
	By chargeToBill = By.xpath("//button[text()=' Charge to Bill ']");
	By OneTimePayment = By.xpath("//button[text()=' One-time payment ']");
	By installmentIsAvailableOnlyFoSelectCreditCards = By.xpath("//span[text()=' Installment is available only for select credit cards at the moment. Click on \"One-time payment\" to check. ']");
	By supportingDocumentNeeded = By.xpath("//em[text()='Supporting document needed.']");
	
	By planType = By.xpath("//div[text()=' GPlan 599 with Device ']");
	By ChangeLink = By.xpath("//a[text()=' Change ']");
	By AllAccessData = By.xpath("//span[text()='All-access data']");
	By GoWifiAccess = By.xpath("//span[text()='GoWifi access']");
	By Call_Text = By.xpath("//span[text()='Call & Text']");
	By ContractDuration = By.xpath("//span[text()='Contract duration']");
	
	By Inclusions  = By.xpath("//span[text()=' Inclusions ']");
	By KonsultaMD = By.xpath("//span[text()=' Free subscription to KonsultaMD ']");
	By VIPAccessToiQIYI  = By.xpath("//span[text()=' 3-month VIP Access to iQIYI ']");
	By VIPAccessToWeTV  = By.xpath("//span[text()=' 3-month VIP Access to weTV ']");
	
	By AddonsAndSubscriptions   = By.xpath("//span[text()=' Add-ons and subscriptions ']");
	By GSAddSurf   = By.xpath("//span[text()=' GS Add Surf 99 ']");
	By AmazonPrimeVideo   = By.xpath("//span[text()=' Amazon Prime Video ']");
	By ViuPremium   = By.xpath("//span[text()=' Viu Premium ']");
	By MySuperDuo   = By.xpath("//span[text()=' MySuperDuo ']");
	By EasyRoam   = By.xpath("//span[text()=' Easy Roam ']");
	By GOCALLIDD   = By.xpath("//span[text()=' GOCALLIDD 199 ']");
	
	By ChangeLinkForAddress   = By.xpath("//a[text()='Change']");
	By defaultshippingAddress   = By.xpath("//a[text()='Change']//parent::div//span[2]");
	
	By thisIsWhatYourMonthlyBillWillLookLike = By.xpath("//span[text()=' This is what your monthly bill will look like ']");
	By showBreakdown = By.xpath("//span[text()=' Show breakdown ']");
	By shippingFee = By.xpath("//span[text()='Shipping fee']//following-sibling::span");
	By monthlyBill = By.xpath("//span[text()='Monthly bill']//following-sibling::span");
	By hideBreakdown = By.xpath("//span[text()=' Hide breakdown ']");
	
	By OneTime_PaymentText = By.xpath("//span[text()=' One-time payment ']");
	By viewBreakdown = By.xpath("//span[text()=' View breakdown ']");
	By deviceSelected = By.xpath("(//span[text()=' Hide breakdown ']//following::div[4]//span)[1]");
	By costOfDevice = By.xpath("//span[text()=' Hide breakdown ']//following::div[4]//following-sibling::span");
	By Shipping = By.xpath("//span[text()='Shipping']//following-sibling::span");
	By totalAmountToPay = By.xpath("//span[text()=' Total amount to pay ']//following-sibling::span");
	
	By pendingChargesWillReceiveMailText = By.xpath("//div[contains(text(), ' If you have pending charges to be')]");
	By enterPromoCodeField = By.xpath("//input[@placeholder='Enter promo code']");
	
	
	By howWillYouBePaying = By.xpath("//span[text()=' How will you be paying? ']");
	By Visa_MasterCard = By.xpath("//div[text()='Visa / MasterCard']");
	By GCash = By.xpath("//div[text()='GCash']");
	By cashOnDelivery = By.xpath("//div[text()=' Cash on Delivery ']");
	
	By ProofOfFinancialCapacity = By.xpath("//span[text()='Proof of Financial Capacity']");
	By YourChosenPlanMayBeAboveYourCurrentSpendingLimit = By.xpath("//p[contains(text(), ' Your chosen plan may be above your current spending limit.')]");
	By pofcDropdown=By.xpath("//select[@id='pofcDocIDType']");
	By uploadScannedCopy=By.xpath("//p[text()=' Upload a scanned copy of your document: ']");
	By MaximumFileSizeIs10MB=By.xpath("//li[text()='Maximum file size is 10MB.']");
	By PhotosMustbeInPNG_JPG_GIF_HEIC_PDF_Format=By.xpath("//li[text()='Photos must be in PNG, JPG, GIF, HEIC, or PDF format.']");
	By MakeSureYourDocumentIsClear=By.xpath("//li[text()='Make sure your document is clear and the details are readable.']");
	By MakeSureTheImageIsNotBlurredAndNotCropped=By.xpath("//li[text()='Make sure the image is not blurred and not cropped.']");



	By SelectDeliveryMethod=By.xpath("//span[text()='Select delivery method']");
	By StandardDelivery=By.xpath("//span[text()='Standard Delivery ']");
	By FlatRate=By.xpath("//span[text()='Flat Rate ']");
	By IAcceptAllTerms_Conditions=By.xpath("//span[text()='I accept all Terms & Conditions']");
	
	By SubmitOrder=By.xpath("(//button[text()=' Submit order '])[1]");
	
	By Merchant=By.xpath("//label[text()='Merchant']//following-sibling::span");
	By AmountDue=By.xpath("//label[text()='Amount Due']//following-sibling::span");
	By LoginToPayWithGCash=By.xpath("//h2[text()='Login to pay with GCash']");
	By NumberField=By.xpath("//input[@type='number']");
	By nextButton=By.xpath("//button[@accessbilityid='next-button']");
	By Enteryour4digitMPIN=By.xpath("//p[text()='Enter your 4-digit MPIN.']");
	By gcashPin=By.xpath("//input[@class='ap-password-focus']");
	By nxtButton=By.xpath("//button[@accessbilityid='submit-button']");
	By GCashBalance=By.xpath("//label[text()='GCash Balance']//following-sibling::span");
	By agree=By.xpath("//button[@type='button']");
	By payBtn=By.xpath("//button[@accessibilityid='button-pay']");
	By TrackMyOrder=By.xpath("(//button[text()=' Track my order '])[2]");


	










	/********************************************************************************************************************************/
	public WebElement get_showBreakdown() {
		return DriverManager.getDriver().findElement(showBreakdown);
	}

	/********************************************************************************************************************************/
	public WebElement get_hideBreakdown() {
		return DriverManager.getDriver().findElement(hideBreakdown);
	}

	/********************************************************************************************************************************/
	public WebElement get_shippingFee() {
		return DriverManager.getDriver().findElement(shippingFee);
	}

	/********************************************************************************************************************************/
	public WebElement get_monthlyBill() {
		return DriverManager.getDriver().findElement(monthlyBill);
	}

	/********************************************************************************************************************************/
	/********************************************************************************************************************************/
	public WebElement get_viewBreakdown() {
		return DriverManager.getDriver().findElement(viewBreakdown);
	}

	/********************************************************************************************************************************/
	public WebElement get_deviceSelected() {
		return DriverManager.getDriver().findElement(deviceSelected);
	}

	/********************************************************************************************************************************/
	public WebElement get_costOfDevice() {
		return DriverManager.getDriver().findElement(costOfDevice);
	}

	/********************************************************************************************************************************/
	public WebElement get_Shipping() {
		return DriverManager.getDriver().findElement(Shipping);
	}

	/********************************************************************************************************************************/
	public WebElement get_totalAmountToPay() {
		return DriverManager.getDriver().findElement(totalAmountToPay);
	}

	/********************************************************************************************************************************/
	public WebElement get_Visa_MasterCard() {
		return DriverManager.getDriver().findElement(Visa_MasterCard);
	}

	/********************************************************************************************************************************/
	public WebElement get_GCash() {
		return DriverManager.getDriver().findElement(GCash);
	}

	/********************************************************************************************************************************/
	public WebElement get_cashOnDelivery() {
		return DriverManager.getDriver().findElement(cashOnDelivery);
	}

	/********************************************************************************************************************************/
	public void Select_dropdown(String option)
	{
		Select s = new Select(DriverManager.getDriver().findElement(pofcDropdown));
		s.selectByValue(option);
	} 
	/********************************************************************************************************************************/
	public WebElement get_StandardDelivery() {
		return DriverManager.getDriver().findElement(StandardDelivery);
	}
	/********************************************************************************************************************************/
	public WebElement get_IAcceptAllTerms_Conditions() {
		return DriverManager.getDriver().findElement(IAcceptAllTerms_Conditions);
	}
	/********************************************************************************************************************************/
	public WebElement get_defaultshippingAddress() {
		return DriverManager.getDriver().findElement(defaultshippingAddress);
	}
	/********************************************************************************************************************************/
	/********************************************************************************************************************************/
	public WebElement get_SubmitOrder() {
		return DriverManager.getDriver().findElement(SubmitOrder);
	}
	/********************************************************************************************************************************/
	public WebElement get_NumberField() {
		return DriverManager.getDriver().findElement(NumberField);
	}
	/********************************************************************************************************************************/
	public WebElement get_nextButton() {
		return DriverManager.getDriver().findElement(nextButton);
	}
	/********************************************************************************************************************************/
	public WebElement get_gcashPin() {
		return DriverManager.getDriver().findElement(gcashPin);
	}
	/********************************************************************************************************************************/
	public WebElement get_nxtButton() {
		return DriverManager.getDriver().findElement(nxtButton);
	}
	/********************************************************************************************************************************/
	public WebElement get_agree() {
		return DriverManager.getDriver().findElement(agree);
	}
	/********************************************************************************************************************************/
	public WebElement get_payBtn() {
		return DriverManager.getDriver().findElement(payBtn);
	}
	/********************************************************************************************************************************/
	public WebElement get_Merchant() {
		return DriverManager.getDriver().findElement(Merchant);
	}
	/********************************************************************************************************************************/
	public WebElement get_AmountDue() {
		return DriverManager.getDriver().findElement(AmountDue);
	}
	/********************************************************************************************************************************/
	public WebElement get_GCashBalance() {
		return DriverManager.getDriver().findElement(GCashBalance);
	}
	/********************************************************************************************************************************/
	public WebElement get_TrackMyOrder() {
		return DriverManager.getDriver().findElement(TrackMyOrder);
	}
	/********************************************************************************************************************************/
	

	
	
	
	public boolean isElementExist(String message, String element, int waitTime) {
		boolean flag = false;

		switch (element) {
		case "payText":
			flag = waitForElementVisibility(payText, waitTime);
			break;
		case "howWouldYouLikeToPay":
			flag = waitForElementVisibility(howWouldYouLikeToPay, waitTime);
			break;
		case "chargeToBill":
			flag = waitForElementVisibility(chargeToBill, waitTime);
			break;
		case "OneTimePayment":
			flag = waitForElementVisibility(OneTimePayment, waitTime);
			break;	
		case "installmentIsAvailableOnlyFoSelectCreditCards":
			flag = waitForElementVisibility(installmentIsAvailableOnlyFoSelectCreditCards, waitTime);
			break;	
		case "supportingDocumentNeeded":
			flag = waitForElementVisibility(supportingDocumentNeeded, waitTime);
			break;
		case "thisIsWhatYourMonthlyBillWillLookLike":
			flag = waitForElementVisibility(thisIsWhatYourMonthlyBillWillLookLike, waitTime);
			break;
		case "showBreakdown":
			flag = waitForElementVisibility(showBreakdown, waitTime);
			break;
		case "shippingFee":
			flag = waitForElementVisibility(shippingFee, waitTime);
			break;
		case "monthlyBill":
			flag = waitForElementVisibility(monthlyBill, waitTime);
			break;
		case "hideBreakdown":
			flag = waitForElementVisibility(hideBreakdown, waitTime);
			break;
		case "OneTime_PaymentText":
			flag = waitForElementVisibility(OneTime_PaymentText, waitTime);
			break;
		case "viewBreakdown":
			flag = waitForElementVisibility(viewBreakdown, waitTime);
			break;
		case "deviceSelected":
			flag = waitForElementVisibility(deviceSelected, waitTime);
			break;
		case "costOfDevice":
			flag = waitForElementVisibility(costOfDevice, waitTime);
			break;	
		case "Shipping":
			flag = waitForElementVisibility(Shipping, waitTime);
			break;
		case "totalAmountToPay":
			flag = waitForElementVisibility(totalAmountToPay, waitTime);
			break;
		case "pendingChargesWillReceiveMailText":
			flag = waitForElementVisibility(pendingChargesWillReceiveMailText, waitTime);
			break;
		case "enterPromoCodeField":
			flag = waitForElementVisibility(enterPromoCodeField, waitTime);
			break;
		case "howWillYouBePaying":
			flag = waitForElementVisibility(howWillYouBePaying, waitTime);
			break;
		case "Visa_MasterCard":
			flag = waitForElementVisibility(Visa_MasterCard, waitTime);
			break;
		case "GCash":
			flag = waitForElementVisibility(GCash, waitTime);
			break;
		case "cashOnDelivery":
			flag = waitForElementVisibility(cashOnDelivery, waitTime);
			break;	
		case "ProofOfFinancialCapacity":
			flag = waitForElementVisibility(ProofOfFinancialCapacity, waitTime);
			break;
		case "YourChosenPlanMayBeAboveYourCurrentSpendingLimit":
			flag = waitForElementVisibility(YourChosenPlanMayBeAboveYourCurrentSpendingLimit, waitTime);
			break;
		case "pofcDropdown":
			flag = waitForElementVisibility(pofcDropdown, waitTime);
			break;
		case "uploadScannedCopy":
			flag = waitForElementVisibility(uploadScannedCopy, waitTime);
			break;
		case "MaximumFileSizeIs10MB":
			flag = waitForElementVisibility(MaximumFileSizeIs10MB, waitTime);
			break;
		case "PhotosMustbeInPNG_JPG_GIF_HEIC_PDF_Format":
			flag = waitForElementVisibility(PhotosMustbeInPNG_JPG_GIF_HEIC_PDF_Format, waitTime);
			break;
		case "MakeSureYourDocumentIsClear":
			flag = waitForElementVisibility(MakeSureYourDocumentIsClear, waitTime);
			break;
		case "MakeSureTheImageIsNotBlurredAndNotCropped":
			flag = waitForElementVisibility(MakeSureTheImageIsNotBlurredAndNotCropped, waitTime);
			break;
		case "SelectDeliveryMethod":
			flag = waitForElementVisibility(SelectDeliveryMethod, waitTime);
			break;
		case "StandardDelivery":
			flag = waitForElementVisibility(StandardDelivery, waitTime);
			break;
		case "FlatRate":
			flag = waitForElementVisibility(FlatRate, waitTime);
			break;
		case "IAcceptAllTerms_Conditions":
			flag = waitForElementVisibility(IAcceptAllTerms_Conditions, waitTime);
			break;
		case "planType":
			flag = waitForElementVisibility(planType, waitTime);
			break;
		case "ChangeLink":
			flag = waitForElementVisibility(ChangeLink, waitTime);
			break;
		case "AllAccessData":
			flag = waitForElementVisibility(AllAccessData, waitTime);
			break;
		case "GoWifiAccess":
			flag = waitForElementVisibility(GoWifiAccess, waitTime);
			break;
		case "Call_Text":
			flag = waitForElementVisibility(Call_Text, waitTime);
			break;
		case "ContractDuration":
			flag = waitForElementVisibility(ContractDuration, waitTime);
			break;
		case "Inclusions":
			flag = waitForElementVisibility(Inclusions, waitTime);
			break;
		case "KonsultaMD":
			flag = waitForElementVisibility(KonsultaMD, waitTime);
			break;
		case "VIPAccessToiQIYI":
			flag = waitForElementVisibility(VIPAccessToiQIYI, waitTime);
			break;
		case "VIPAccessToWeTV":
			flag = waitForElementVisibility(VIPAccessToWeTV, waitTime);
			break;
		case "AddonsAndSubscriptions":
			flag = waitForElementVisibility(AddonsAndSubscriptions, waitTime);
			break;
		case "GSAddSurf":
			flag = waitForElementVisibility(GSAddSurf, waitTime);
			break;
		case "AmazonPrimeVideo":
			flag = waitForElementVisibility(AmazonPrimeVideo, waitTime);
			break;
		case "ViuPremium":
			flag = waitForElementVisibility(ViuPremium, waitTime);
			break;
		case "MySuperDuo":
			flag = waitForElementVisibility(MySuperDuo, waitTime);
			break;
		case "EasyRoam":
			flag = waitForElementVisibility(EasyRoam, waitTime);
			break;
		case "GOCALLIDD":
			flag = waitForElementVisibility(GOCALLIDD, waitTime);
			break;
		case "ChangeLinkForAddress":
			flag = waitForElementVisibility(ChangeLinkForAddress, waitTime);
			break;
		case "defaultshippingAddress":
			flag = waitForElementVisibility(defaultshippingAddress, waitTime);
			break;
		case "SubmitOrder":
			flag = waitForElementVisibility(SubmitOrder, waitTime);
			break;
		case "NumberField":
			flag = waitForElementVisibility(NumberField, waitTime);
			break;
		case "nextButton":
			flag = waitForElementVisibility(nextButton, waitTime);
			break;
		case "gcashPin":
			flag = waitForElementVisibility(gcashPin, waitTime);
			break;
		case "Enteryour4digitMPIN":
			flag = waitForElementVisibility(Enteryour4digitMPIN, waitTime);
			break;
		case "nxtButton":
			flag = waitForElementVisibility(nxtButton, waitTime);
			break;
		case "agree":
			flag = waitForElementVisibility(agree, waitTime);
			break;
		case "payBtn":
			flag = waitForElementVisibility(payBtn, waitTime);
			break;
		case "Merchant":
			flag = waitForElementVisibility(Merchant, waitTime);
			break;
		case "AmountDue":
			flag = waitForElementVisibility(AmountDue, waitTime);
			break;
		case "LoginToPayWithGCash":
			flag = waitForElementVisibility(LoginToPayWithGCash, waitTime);
			break;
		case "GCashBalance":
			flag = waitForElementVisibility(GCashBalance, waitTime);
			break;
		case "TrackMyOrder":
			flag = waitForElementVisibility(TrackMyOrder, waitTime);
			break;
        }
		
		if (flag) {
			System.out.println(message + " - exists");
		} else {
			System.out.println(message + " - do not exist");
		}

		return flag;
	}	

	
	public void jsClick(String message, String element) {
		//Object S;
		JavascriptExecutor jse = (JavascriptExecutor)DriverManager.getDriver();
		try {
			switch (element) {
			case "showBreakdown":
		         jse.executeScript("arguments[0].click();", get_showBreakdown());		
		         break;
			case "hideBreakdown":
		         jse.executeScript("arguments[0].click();", get_hideBreakdown());		
		         break;     
			case "viewBreakdown":
		         jse.executeScript("arguments[0].click();", get_viewBreakdown());		
		         break;
			case "Visa_MasterCard":
		         jse.executeScript("arguments[0].click();", get_Visa_MasterCard());		
		         break;
			case "GCash":
		         jse.executeScript("arguments[0].click();", get_GCash());		
		         break;
			case "cashOnDelivery":
		         jse.executeScript("arguments[0].click();", get_cashOnDelivery());		
		         break;
			case "StandardDelivery":
		         jse.executeScript("arguments[0].click();", get_StandardDelivery());		
		         break;
			case "IAcceptAllTerms_Conditions":
		         jse.executeScript("arguments[0].click();", get_IAcceptAllTerms_Conditions());		
		         break; 
			case "SubmitOrder":
		         jse.executeScript("arguments[0].click();", get_SubmitOrder());		
		         break;
			case "nextButton":
		         jse.executeScript("arguments[0].click();", get_nextButton());		
		         break;
			case "nxtButton":
		         jse.executeScript("arguments[0].click();", get_nxtButton());		
		         break;
			case "agree":
		         jse.executeScript("arguments[0].click();", get_agree());		
		         break;
			case "payBtn":
		         jse.executeScript("arguments[0].click();", get_payBtn());		
		         break;
			case "TrackMyOrder":
		         jse.executeScript("arguments[0].click();", get_TrackMyOrder());		
		         break;
			}
		} catch (ElementClickInterceptedException e1) {
			System.out.println( " : " + element + " : " + "Element is not clickable : " + e1.getMessage());
			Assert.assertTrue(false);
		} catch (NoSuchElementException e2) {
			System.out.println( " : " + element + " : " + "Element not found : " + e2.getMessage());
			Assert.assertTrue(false);
		} catch (Exception e) {
			System.out.println( " : " + element + " : " + "Exception : " + e.getMessage());
			Assert.assertTrue(false);
		}

		System.out.println("Clicked on " + " : " + element);	
		
	}
  

	
}