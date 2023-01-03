package com.pagesHPW;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import globeOnline_CommonMethods.DriverManager;

public class PayPage extends BasePage {

	By hdrPay = By.xpath("//h1[text()=' Pay ']");
	By cod = By.xpath("//div[text()=' Cash On Delivery ']");
	By payOptionGCash = By.xpath("//h2[contains(@class,'payoption')] //div[text()=' GCash ']");
	By payOption_Visa_MasterCard = By.xpath("//h2[contains(@class,'payoption')] //div[text()=' Visa / MasterCard ']");
	By payOption_overTheCounter = By.xpath("//div[text()=' Over the Counter ']");
	By payOrder = By.xpath("//button[@id='payOrder']");
//	By payOrder = By.xpath("//*[contains(text(), 'Pay ₱')]");
	
	By quantity = By.xpath("//div[contains(@class,'onex')]/span");
	By productName = By.xpath("//div[contains(@class,'cashout')]/span");
	By price = By.xpath("//div[contains(@class,'amount-1')]/span");
	By shipping = By.xpath("//span[contains(@class,'float-end')]");
	By totalAmount = By.xpath("//div[contains(@class,'ampount-2')]/span");

	By shipAddress = By.xpath("//div[contains(@class,'ship-address')]/span");

	By notification_OTC = By.xpath("//div[text()='Paying Over the Counter']");
	By notification_OTC_text = By
			.xpath("//div[text()='Paying Over the Counter']/../../following-sibling::div/div/span");
	By nearestECPay = By.xpath("//a[text()='Find the nearest ECPay near me']");
	By promoCode = By.xpath("//div[contains(@class,'promo-code-part-content')]");
	By changeAddress = By.xpath("//div[@id='changeAddress']/span");
	
	By textCreditCard = By.xpath("//span[text()='Credit Card']");	
	By cardNumberFrame = By.xpath("//span[@data-encrypted-field='encryptedCardNumber']/iframe");
	By cardNumber = By.xpath("//input[@aria-label='Credit or debit card number']");
	
	By cardExpiryDateFrame = By.xpath("//span[@data-encrypted-field='encryptedExpiryDate']/iframe");
	By cardExpiryDate = By.xpath("//input[@id='encryptedExpiryDate']");
	
	By cvvFrame = By.xpath("//span[@data-encrypted-field='encryptedSecurityCode']/iframe");
	By cvv = By.xpath("//input[@id='encryptedSecurityCode']");
	
	By btnPay_CC = By.xpath("//button[contains(@class,'js-chckt-button--submit')]");
	
//RONNIE SCRIPT	
	//By hdrPay = By.xpath("//h1[text()=' Pay ']");
	By ImgVisaCC = By.xpath("//img[@alt='adyen']");
	By BtnVisaCC = By.xpath("//div[contains(text(), ' Visa')]");
	By ImgGCash = By.xpath("//img[@alt='gcash']");
	By BtnGCash = By.xpath("//div[contains(text(), 'GCash')]");
	By ImgOTC = By.xpath("//img[@alt='otc']");
	By BtnOTC = By.xpath("//div[contains(text(), 'Over the Counter')]");
	By DescOTC = By.xpath("//div[contains(text(), 'Paying Over the Counter')]");
	By OTCDesc1 = By.xpath("//span[contains(text(), 'You can pay Over the Counter through ECPay partners near you.')]");
	By OTCNearestECPayLink = By.xpath("//a[contains(text(), 'Find the nearest ECPay near me')]");
	By ImgCOD = By.xpath("//img[@alt='cashondelivery']");
	By BtnCOD = By.xpath("//div[contains(text(), 'Cash On Delivery')]");
	
	By OrderDetailsHeader = By.xpath("//span[contains(text(), 'Order details')]");
	By Prod1_Qty = By.xpath("(//span[contains(text(), '1x')])[1]");
	By Prod1_Name = By.xpath("(//div[@class='col-7 cashout'])[1]");
	By Prod1_Price = By.xpath("(//div[@class='col-4 amount-1'])[1]");
	By ShippingLbl = By.xpath("//span[contains(text(), 'Shipping')]");
	By ShippingVal = By.xpath("//span[contains(text(), 'Free')]");
	By AddImg = By.xpath("//img[@class='ship-img']");
	By AddShiptoAddLbl = By.xpath("//span[contains(text(), 'Ship to this address')]");
	By AddVal = By.xpath("//div[@class='col-12 ship-address mt-1']/span");
	By changeAdd = By.xpath("//span[contains(text(), 'Change address')]");
	By PromoIcon = By.xpath("//div[@class='promocode-icon']");
	By PromoGotPromoLbl = By.xpath("//span[contains(text(), 'Got a promo code?')]");
	By PromoClickHere = By.xpath("//button[contains(text(), 'Click Here')]");
	By TotalLbl = By.xpath("//span[contains(text(), 'Total')]");
	By TotalVal = By.xpath("//div[@class='col-6 ampount-2']");
//	By cod = By.xpath("//div[text()=' Cash On Delivery ']");
//	By payOptionGCash = By.xpath("//h2[contains(@class,'payoption')] //div[text()=' GCash ']");
//	By payOrder = By.xpath("//button[@id='payOrder']");
	
	By AccMerchants = By.xpath("//*[text()='Accredited ECPay Merchants']");
	By OrderNames = By.xpath("//div[@class='col-7 cashout']/span");
	By PromoCode = By.xpath("//div[@class='col-7 promo-code-part-content']");//span[@class='discount-amount-end']
	By PromoCodeDiscountAmt = By.xpath("//span[@class='discount-amount-end']");
	By PromoImgApplied = By.xpath("//div[@class='col-3 promo-code-part1-icon']/img");
	By PromoCodeApplied = By.xpath("//div[@class='col-12 promo-code-part1-content-text1']");
	
	
	
	By EditPromoCodeApplied = By.xpath("//button[text()=' Edit Promo Code ']");
	/********************************************************************************************************************************/
	public WebElement get_PromoCodeApplied() {
		return DriverManager.getDriver().findElement(PromoCodeApplied);
	}

	/********************************************************************************************************************************/
	public List<WebElement> get_OrderNames() {
		return DriverManager.getDriver().findElements(OrderNames);
	}


	/********************************************************************************************************************************/
	public WebElement get_cod() {
		return DriverManager.getDriver().findElement(cod);
	}

	/********************************************************************************************************************************/
	public WebElement get_payOpt_Gcash() {
		return DriverManager.getDriver().findElement(payOptionGCash);
	}

	/********************************************************************************************************************************/
	public WebElement get_payOpt_VisaMasterCard() {
		return DriverManager.getDriver().findElement(payOption_Visa_MasterCard);
	}

	/********************************************************************************************************************************/
	public WebElement get_payOpt_overTheCounter() {
		return DriverManager.getDriver().findElement(payOption_overTheCounter);
	}

	/********************************************************************************************************************************/
	public WebElement get_notification_OTC() {
		return DriverManager.getDriver().findElement(notification_OTC);
	}

	/********************************************************************************************************************************/
	public WebElement get_notification_OTC_text() {
		return DriverManager.getDriver().findElement(notification_OTC_text);
	}

	/********************************************************************************************************************************/
	public WebElement get_nearestECPay() {
		return DriverManager.getDriver().findElement(nearestECPay);
	}

	/********************************************************************************************************************************/
	public WebElement get_payOrder() {
		return DriverManager.getDriver().findElement(payOrder);
	}

	/********************************************************************************************************************************/
	public List<WebElement> get_quantity() {
		return DriverManager.getDriver().findElements(quantity);
	}

	/********************************************************************************************************************************/
	public List<WebElement> get_productName() {
		return DriverManager.getDriver().findElements(productName);
	}

	/********************************************************************************************************************************/
	public List<WebElement> get_price() {
		return DriverManager.getDriver().findElements(price);
	}

	/********************************************************************************************************************************/
	public WebElement get_shipping() {
		return DriverManager.getDriver().findElement(shipping);
	}

	/********************************************************************************************************************************/
	public WebElement get_totalAmount() {
		return DriverManager.getDriver().findElement(totalAmount);
	}

	/********************************************************************************************************************************/
	public WebElement get_shipAddress() {
		return DriverManager.getDriver().findElement(shipAddress);
	}

	/********************************************************************************************************************************/
	public WebElement get_promoCode() {
		return DriverManager.getDriver().findElement(promoCode);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_changeAddress() {
		return DriverManager.getDriver().findElement(changeAddress);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_cardNumberFrame() {
		return DriverManager.getDriver().findElement(cardNumberFrame);
	}
	/********************************************************************************************************************************/
	public WebElement get_cardNumber() {
		return DriverManager.getDriver().findElement(cardNumber);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_cardExpiryDateFrame() {
		return DriverManager.getDriver().findElement(cardExpiryDateFrame);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_cardExpiryDate() {
		return DriverManager.getDriver().findElement(cardExpiryDate);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_cvvFrame() {
		return DriverManager.getDriver().findElement(cvvFrame);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_cvv() {
		return DriverManager.getDriver().findElement(cvv);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_btnPay_CC() {
		return DriverManager.getDriver().findElement(btnPay_CC);
	}
//RONNIE SCRIPT
	/********************************************************************************************************************************/
	public WebElement get_PayingOTCDesc() {
		return DriverManager.getDriver().findElement(DescOTC);
	}
	/********************************************************************************************************************************/
	public WebElement get_FindNearestECPay() {
		return DriverManager.getDriver().findElement(OTCNearestECPayLink);
	}
	/********************************************************************************************************************************/
	public WebElement get_otc() {
		return DriverManager.getDriver().findElement(BtnOTC);
	}



	
	

	/********************************************************************************************************************************/
	public boolean isElementExist(String message, String element, int waitTime) {
		boolean flag = false;

		switch (element) {
		case "hdrPay":
			flag = waitForElementVisibility(hdrPay, waitTime);
			break;
		case "payOpt_VisaMaster":
			flag = waitForElementVisibility(payOption_Visa_MasterCard, waitTime);
			break;
		case "payOpt_GCash":
			flag = waitForElementVisibility(payOptionGCash, waitTime);
			break;
		case "payOpt_overTheCounter":
			flag = waitForElementVisibility(payOption_overTheCounter, waitTime);
			break;
		case "payOpt_COD":
			flag = waitForElementVisibility(cod, waitTime);
			break;
		case "notification_OTC":
			flag = waitForElementVisibility(notification_OTC, waitTime);
			break;
		case "creditCardPage":
			flag = waitForElementVisibility(textCreditCard, waitTime);
			break;
			
			//RONNIE SCRIPT
		case "ImgVisaCC":
			flag = waitForElementVisibility(ImgVisaCC, waitTime);
			break;
		case "BtnVisaCC":
			flag = waitForElementVisibility(BtnVisaCC, waitTime);
			break;
		case "ImgGCash":
			flag = waitForElementVisibility(ImgGCash, waitTime);
			break;
		case "BtnGCash":
			flag = waitForElementVisibility(BtnGCash, waitTime);
			break;
		case "ImgOTC":
			flag = waitForElementVisibility(ImgOTC, waitTime);
			break;
		case "BtnOTC":
			flag = waitForElementVisibility(BtnOTC, waitTime);
			break;
		case "DescOTC":
			flag = waitForElementVisibility(DescOTC, waitTime);
			break;
		case "OTCDesc1":
			flag = waitForElementVisibility(OTCDesc1, waitTime);
			break;
		case "OTCNearestECPayLink":
			flag = waitForElementVisibility(OTCNearestECPayLink, waitTime);
			break;
		case "ImgCOD":
			flag = waitForElementVisibility(ImgCOD, waitTime);
			break;
		case "BtnCOD":
			flag = waitForElementVisibility(BtnCOD, waitTime);
			break;
			
			
		case "OrderDetailsHeader":
			flag = waitForElementVisibility(OrderDetailsHeader, waitTime);
			break;
		case "Prod1_Qty":
			flag = waitForElementVisibility(Prod1_Qty, waitTime);
			break;
		case "Prod1_Name":
			flag = waitForElementVisibility(Prod1_Name, waitTime);
			break;
		case "Prod1_Price":
			flag = waitForElementVisibility(Prod1_Price, waitTime);
			break;
		case "ShippingLbl":
			flag = waitForElementVisibility(ShippingLbl, waitTime);
			break;
		case "ShippingVal":
			flag = waitForElementVisibility(ShippingVal, waitTime);
			break;
		case "AddImg":
			flag = waitForElementVisibility(AddImg, waitTime);
			break;
		case "AddShiptoAddLbl":
			flag = waitForElementVisibility(AddShiptoAddLbl, waitTime);
			break;
		case "AddVal":
			flag = waitForElementVisibility(AddVal, waitTime);
			break;
		case "changeAdd":
			flag = waitForElementVisibility(changeAdd, waitTime);
			break;
		case "PromoIcon":
			flag = waitForElementVisibility(PromoIcon, waitTime);
			break;
		case "PromoGotPromoLbl":
			flag = waitForElementVisibility(PromoGotPromoLbl, waitTime);
			break;
		case "PromoClickHere":
			flag = waitForElementVisibility(PromoClickHere, waitTime);
			break;
		case "TotalLbl":
			flag = waitForElementVisibility(TotalLbl, waitTime);
			break;
		case "TotalVal":
			flag = waitForElementVisibility(TotalVal, waitTime);
			break;
		case "payOrder":
			flag = waitForElementVisibility(payOrder, waitTime);
			break;
		case "AccMerchants":
			flag = waitForElementVisibility(AccMerchants, waitTime);
			break;
		case "PromoCode":
			flag = ElementVisibility(PromoCode, waitTime);
			break;
		case "PromoCodeDiscountAmt":
			flag = waitForElementVisibility(PromoCodeDiscountAmt, waitTime);
			break;			
			
		case "PromoImgApplied":
			flag = waitForElementVisibility(PromoImgApplied, waitTime);
			break;
		case "PromoCodeApplied":
			flag = waitForElementVisibility(PromoCodeApplied, waitTime);
			break;
		case "EditPromoCodeApplied":
			flag = waitForElementVisibility(EditPromoCodeApplied, waitTime);
			break;
		}

		if (flag) {
			System.out.println(message + " - exists");
		} else {
			System.out.println(message + " - do not exist");
		}

		return flag;
	}

	/********************************************************************************************************************************/
	public boolean isClickable(String element, int waitTime) {

		boolean flag = false;

		switch (element) {
		case "payOrder":
			flag = waitForElementClickable(payOrder, waitTime);
			break;
		case "nearestECPay":
			flag = waitForElementClickable(nearestECPay, waitTime);
			break;
			
		case "btnPay_CC":
			flag = waitForElementClickable(btnPay_CC, waitTime);
			break;

		}

		return flag;
	}
	
	/*****************************************************************************************************************************************/
	public String getText(String ele) {
		String text = "";

		try {
			switch (ele) {
			case "Prod1_Qty":
				text = DriverManager.getDriver().findElement(Prod1_Qty).getText();
				break;
			case "Prod1_Name":
				text = DriverManager.getDriver().findElement(Prod1_Name).getText();
				break;
	
			case "Prod1_Price":
				text = DriverManager.getDriver().findElement(Prod1_Price).getText();
				break;
	
			case "ShippingVal":
				text = DriverManager.getDriver().findElement(ShippingVal).getText();
				break;
	
			case "TotalVal":
				text = DriverManager.getDriver().findElement(TotalVal).getText();
				break;
			case "DescOTC":
				text = DriverManager.getDriver().findElement(DescOTC).getText();
				break;
			case "OTCDesc1":
				text = DriverManager.getDriver().findElement(OTCDesc1).getText();
				break;
			case "AddVal":
				text = DriverManager.getDriver().findElement(AddVal).getText();
				break;
			case "PromoCode":
				text = DriverManager.getDriver().findElement(PromoCode).getText();
				break;
			case "PromoCodeDiscountAmt":
				text = DriverManager.getDriver().findElement(PromoCodeDiscountAmt).getText();
				break;
	

	
	

			}

		} catch (NoSuchElementException e) {
			System.out.println("Element : " + ele.toString() + " : " + "not found : " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Method : getText - Error : " + e.getMessage());
		}

		return text;
	}
	
	/********************************************************************************************************************************/
	public void clickOnElement(String type, String eleName, String ele) {

		try {
			switch (ele) {
			case "OTCNearestECPayLink":
				get_FindNearestECPay().click();
				break;
			case "BtnOTC":
				get_otc().click();
				break;
			case "DescOTC":
				get_PayingOTCDesc().click();
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
	public void scroll_vertical(int y_Axis) {
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("window.scrollBy(0," + y_Axis + ")", "");
	}
	
}
