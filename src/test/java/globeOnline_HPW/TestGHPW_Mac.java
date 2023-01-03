package globeOnline_HPW;

import static org.testng.Assert.assertTrue;
import utility.*;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import java.util.LinkedHashMap;
import java.util.Scanner;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.pagesHPW.*;

import globeOnline_CommonMethods.*;

public class TestGHPW_Mac extends SetDriver {

	private String invalid_GCash_No = "01234567890";

	private static TestGHPW_Mac ghpwMac = new TestGHPW_Mac();
	private util util = new util();
	private CommonMethods common = new CommonMethods();

	private LandingPage LP = new LandingPage();
	private ProductComparatorPage PC = new ProductComparatorPage();
	private CheckoutPage checkout = new CheckoutPage();
	private FormPage Form = new FormPage();
	private PayPage Pay = new PayPage();
	private ThankYouPage ThankYou = new ThankYouPage();
	private static  LinkedHashMap<String,String> Map = new LinkedHashMap<>();
	private String Status = "failed";

	@Test
	public void testGHPW_Mac() throws Exception {
		//JavascriptExecutor jse = (JavascriptExecutor)DriverManager.getDriver();
		//jse.executeScript("lambda-name=GHPW");
		String cashoutAmount_checkout = "";
		String shipping = "";
		String totalAmount = "";
		DriverManager.getDriver().get("https://new.globe.com.ph/");
		assertTrue(DriverManager.getDriver().getTitle().contains("Globe Online"));
		System.out.println("Validated title : Globe Online");
		
//			if (LP.isElementExist("Cookies Notification", "cookiesNotification", 10)) {
//				Thread.sleep(3000);
//				LP.get_privacyAccept().click();
//				System.out.println("Clicked on 'Privacy - I accept' button");
//			}
//		
		Constant.dataMap.set(Map);
		Constant.dataMap.get().put("TestClassName", ghpwMac.getClass().getSimpleName());
		Constant.dataMap.get().put("OMT_LAS", "NOT FOUND");
		Constant.dataMap.get().put("OMT_DispositionStatus", "NOT FOUND");
		Constant.dataMap.get().put("OMT_UpdateDate", "NOT FOUND");
		Constant.dataMap.get().put("OMT_DateOrdered", "NOT FOUND");
		Constant.dataMap.get().put("OMT_EstimatedDayOfDelivery", "NOT FOUND");
		Constant.dataMap.get().put("OMT_OrderDetails", "NOT FOUND");
		Constant.dataMap.get().put("Magento_Details", "NOT FOUND");
		Constant.dataMap.get().put("Magento_OrderAccountInfo", "NOT FOUND");

		// ************************************************************************************
		// line - 456, 457
		// ************************************************************************************
		common.menubar();
		util.assertContainText("Validated title", DriverManager.getDriver().getTitle(), "NEW Globe Online Shop");
		//common.clickBuyLinkOnHeader();
		

		// ************************************************************************************
		// line - 459 - Click Buy for Globe At Home Prepaid WiFi
		// ************************************************************************************
		common.selecle_GHPW();
		util.assertContainText("Validated title", DriverManager.getDriver().getTitle(),
				"Home Prepaid WiFi | Globe at Home");
		Thread.sleep(1000L);
		LP.moveToElement("floatingBuyNow");
		Thread.sleep(1000L);
		LP.isElementExist("Button - Download Manual", "downloadManual", 10);
		LP.isElementExist("Button - Buy now", "buyNow", 10);
		LP.isElementExist("Button - Floating Buy now", "floatingBuyNow", 10);

		if (LP.get_floatActualPrice().getCssValue("text-decoration").contains("line-through")) {
			System.out.println("Float Actual Price is 'Strikethrough'");
		} else {
			System.out.println("Float Actual Price is not 'Strikethrough'");
		}

		
		common.validateFooter();

		// ************************************************************************************
		// line - 274 - Validate All banner for LTE - not covered
		// ************************************************************************************

		// ************************************************************************************
		// line 275, 276, 277
		// Click Highlight tab - validation not covered, need clarity
		// Click Feature tab - validation not covered, need clarity
		// Click Compare - validation not covered, need clarity
		// ************************************************************************************
		LP.scroll_vertical(600);
		if (LP.isElementExist("Header - Highlights", "link_highlights", 10)) {
			Thread.sleep(1000L);
			if (LP.isClickable("link_highlights", 5)) {
				//LP.clickOnElement("Link", "Highlights", "link_highlights");
				JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
				js.executeScript("arguments[0].click();", LP.get_link_highlights());

			}
		}

		if (LP.isElementExist("Header - Features", "link_features", 10)) {
			Thread.sleep(1000L);
			if (LP.isClickable("link_features", 5)) {
				//LP.clickOnElement("Link", "Features", "link_features");
				JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
				js.executeScript("arguments[0].click();", LP.get_link_features());
			}
		}
		if (LP.isElementExist("Header - link_compare", "link_compare", 10)) {
			Thread.sleep(1000L);
			if (LP.isClickable("link_compare", 5)) {
				//LP.clickOnElement("Link", "link_compare", "link_compare");
				JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
				js.executeScript("arguments[0].click();", LP.get_link_compare());
	
			}
		}
		// ************************************************************************************
		// line 278 - Validate Product compare section
		// ************************************************************************************
		if (PC.get_Products().size() <= 3) {
			System.out.println("PASS - Atmost 3 products are available on comparator screen. Product available : "
					+ PC.get_Products().size());
		} else {
			System.out.println("FAIL - More than 3 products are available on comparator screen. Product available : "
					+ PC.get_Products().size());
		}

		common.compareProducts();

		PC.scroll_vertical(1200);
		if (PC.isClickable("BuyNow_Checkout", 5)) {
			Thread.sleep(500L);
			//PC.clickOnElement("Button", "BuyNow/Checkout", "BuyNow_Checkout");
			LP.get_floatBuy().click();
		}
		checkout.isElementExist("Header - Checkout", "hdrCheckout", 10);
		util.assertContainText("Validated title", DriverManager.getDriver().getTitle(), "Checkout");
		DriverManager.getDriver().navigate().refresh();

		// ************************************************************************************
		// line - 280 , Validate Express Checkout Page
		// ************************************************************************************
		System.out.println("*********  Express Checkout Page ************");
		Thread.sleep(2000L);
		checkout.scroll_vertical(150);

		String dataMap_qty = "";
		for (int i = 0; i < checkout.get_quantities().size(); i++) {

			String pName = checkout.get_productsName().get(i).getText();
			String qty = checkout.get_quantities().get(i).getText();
			System.out.println("For product : " + pName + " Quantity is : " + qty);

			dataMap_qty = dataMap_qty.concat(" | ").concat(qty);
		}

		cashoutAmount_checkout = checkout.getText("cashoutAmount");
		System.out.println("Cashout Amount : " + cashoutAmount_checkout);

		shipping = checkout.getText("shipping");
		System.out.println("Shipping : " + shipping);

		totalAmount = checkout.getText("totalAmount");
		System.out.println("Total Amount : " + totalAmount);

		Constant.dataMap.get().put("OMT_ProductQty", dataMap_qty.substring(2));
		Constant.dataMap.get().put("Magento_ItemsOrdered", dataMap_qty.substring(2));
		Constant.dataMap.get().put("OMT_AmountPaid", totalAmount);
		Constant.dataMap.get().put("Magento_OrderTotal", totalAmount);

		common.validateTotalAMount(cashoutAmount_checkout, shipping, totalAmount);


	
		checkout.scroll_vertical(1000);

		common.insert_phoneNo_select_checkout_option("09171163173", "StandardCheckout");
		//System.out.println("Insufficient Gcash number inserted : " + "09171163173");
		
		
		 Scanner myObj = new Scanner(System.in); 
			System.out.println("Enter OTP HERE"); String OTP = myObj.nextLine(); 
			// Read  user input 
		    System.out.println("OTP : " + OTP); 
		    
		    // Output user input
		    common.OTPPage_(OTP);

		String omt_pName = "";
		for (int i = 0; i < Form.get_topSectionProductsName().size(); i++) {
			String topSection_pName = Form.get_topSectionProductsName().get(i).getText();
			System.out.println("Form-TopSection-ProductName : " + topSection_pName);
			System.out.println("Form-TopSection-Price : " + Form.get_topSectionProductsPrice().get(i).getText());

			omt_pName = omt_pName.concat(" | ").concat(topSection_pName);
		}

		Constant.dataMap.get().put("OMT_ProductName", omt_pName.substring(2));

		Form.scroll_vertical(200);
		System.out.println("Form-Prefilled Mobile No : " + Form.getAttributeValue("mobileNumber", "value"));

		common.insert_personal_info_on_form_RandomName("shaik.asma@globe.com.ph", "StandardCheckout");

		// ************************************************************************************
		// line - 296 to 300 - Select toggle button for 'im giving this gift'
		// ************************************************************************************
		if (Form.check_AttirbuteNotEmpty("imgGiftOption", "src", 10)) {
			common.selectGiftOptionOnForm();
			Form.get_recipientName().sendKeys("Ron Dela Cruz");
			Constant.dataMap.get().put("OMT_RecipientDetails", "Ron Dela Cruz");

			common.insert_and_validate_recipientMobile("specialChar", "!@#$%^&*()");
			common.insert_and_validate_recipientMobile("incompleteNumber", "12345");
			common.insert_and_validate_recipientMobile("validNumber", "09270004201");
		}

		
		common.insert_address_details("House", "11","Annex 7 Amity Circle", "Betterliving",  "METRO MANILA", "CITY OF PARAÑAQUE", "Don Bosco");
		
		//PREPROD
		//common.insert_address_details("Condo", "12", "Burgos St", "The Horizon Tower", "NEGROS OCCIDENTAL", "BACOLOD", "Alangilan");
		
		// ************************************************************************************
		String zipCOde = Form.get_zipCode().getAttribute("value");
		if (zipCOde == null || zipCOde.isEmpty()) {
			System.out.println("FAIL : ZIP Code -  is blank");
		} else {
			System.out.println("ZIP Code is pre-populated : " + zipCOde);
		}

		// ************************************************************************************
		//  Validate delivery caveat
		// ************************************************************************************
		Form.scroll_vertical(350);
		if (Form.check_AttirbuteNotEmpty("imgSameDayDelivery", "src", 10)) {
			if (Form.getAttributeValue("imgSameDayDelivery", "src").contains("inactive")) {
			
				System.out.println("PASS: Same day delivery toggle is NOT AUTO - selected");
			} else {
				System.out.println("FAIL : Same day delivery toggle is auto - selected");
			}
		}
		// ************************************************************************************
		// line - 310 - Validate delivery caveat
		// ************************************************************************************
		System.out.println("Text - 1 : Delivery Caveat : " + Form.getText("txtdeliveryCaveat_1"));
		System.out.println("Text - 1 : Delivery Caveat : " + Form.getText("txtdeliveryCaveat_2"));

		// ************************************************************************************
		// line - 311 - Validate MAP / Pin location - not covered
		// ************************************************************************************

		// ************************************************************************************
		// line - 312 to 318 - Checked i accept all terms and conditions
		// ************************************************************************************
		LP.scroll_vertical(5000);
		Thread.sleep(2000L);
		common.validate_termsConditions_checkbox_toggle();
		common.select_chkbx_acceptAllTerms();

		// ************************************************************************************
		// line - 319 - Click Pay
		// ************************************************************************************
		common.click_pay_btn_on_form();

		// ************************************************************************************
		// line - 320 - Validate Payment Page
		// ************************************************************************************
		util.assertContainText("Validated title", DriverManager.getDriver().getTitle(), "Pay");

		// ************************************************************************************
		// line - 321, 322 - Validate order details, shipping address
		// ************************************************************************************
		common.validate_order_shipAdddress_Details_screenPay();

		// ************************************************************************************
		// line - 323 - Click COD as payment method and click Pay
		// ************************************************************************************
		common.select_payment_option_proceed_with_payment("COD","NoGCash");

		common.clickPayOrderOnPayScreen();

		// ************************************************************************************
		// line - 324 - validate the Survey Form
		// ************************************************************************************	// ************************************************************************************
				Thread.sleep(5000L);	
				System.out.println("\n"+"*********  SURVEY MODAL ************");
				common.verify_handle_survey_popup_withInput("HAPPY", "", "DISSATISFIED", "Unresponsive");
				assertTrue(DriverManager.getDriver().getTitle().contains("Thank you"));		

		// ************************************************************************************
		// line - 328 - Validate Thank you page
		// ************************************************************************************
		assertTrue(DriverManager.getDriver().getTitle().contains("Thank you"));
		common.capture_orderID();

		Constant.dataMap.get().put("TimeStamp", util.getTimeStamp());
		util.writeToExcelLastRowFromMap("Sheet1", Constant.dataMap.get());

		// ************************************************************************************
		// line - 329 - Click Copy icon
		// ************************************************************************************
		ThankYou.get_copyOrderID().click();
		System.out.println("Copied Order ID");

		// ************************************************************************************
		// line - 330 - Click Track my order
		// ************************************************************************************
		ThankYou.get_linkTrackOrder().click();
		System.out.println("Clicked on Track Order link");

		// ************************************************************************************
		// line - 331 - Go to Order Tracker and Validate tracking Page
		// ************************************************************************************
		Thread.sleep(2000L);
		assertTrue(DriverManager.getDriver().getTitle().contains("Track Your Order"));

		common.insertDetailsOnTrackYourOrder();

		Thread.sleep(2500L);

		common.validateOrderDetails();

		Status = "passed";
//		
		System.out.println("!!! Execution Completed for "+this.getClass().getName()+" !!!");
		DriverManager.getDriver().quit();
	}
	@AfterClass
    public void tearDown() throws Exception {
       if (DriverManager.getDriver() != null) {
            ((JavascriptExecutor) DriverManager.getDriver()).executeScript("lambda-status=" + Status);
            DriverManager.getDriver().quit();
        }
    }
	/********************************************************************************************************************************/

}