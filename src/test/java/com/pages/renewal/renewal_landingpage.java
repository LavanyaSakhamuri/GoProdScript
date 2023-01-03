package com.pages.renewal;

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

import com.pages.Acqui.BasePage;

import globeOnline_CommonMethods.DriverManager;

public class renewal_landingpage extends BasePage {
	
	By cookiesNotification = By.xpath("//span[contains(text(),'Your privacy is important to us')]");
	By privacyAccept = By.xpath("//button[text()=' I accept']");
	By link_LogoGlobe = By.xpath("//a/img[@alt = 'Globe Logo']");
	By link_Apply = By.xpath("//form[contains(@class,'menu-bar-height')] //a[text()='Apply']");
	By link_Renew = By.xpath("//form[contains(@class,'menu-bar-height')] //a[text()='Renew']");
	By link_MobilePostPaid = By.xpath("//a[text()='Mobile Postpaid']");
	By deviceGalleryText = By.xpath("//p[text()='Device Gallery']");
	By link_ViewAllDevices = By.xpath("//a[text()='View all devices']");
	By BackToTop_Button = By.xpath("//div[@class='back-to-top-btn']");
	By Colour_Variant = By.xpath("(//span[text()='Black']//parent::label//input)[1]");
	By search_field = By.xpath("//input[@placeholder='Search by brand, model, feature, plan value']");
	By auto_search = By.xpath("//b[text()='samsung']");
	By searched_Device = By.xpath("//h2[text()='Samsung Galaxy M12']");
	By X_Button = By.xpath("//i[text()='close']");
	By notAvailable_Msg = By.xpath("//div[text()='Sorry, the device you are looking for is not available at this time.']");
	By FifteenDevicesPerPage = By.xpath("//div[@class='go_device-image-wrapper']");
	By outOfStockText = By.xpath("//span[text()='Out of Stock']");
	By aboutUs = By.xpath("//a[text()='About Us']");
	By relevantItem = By.xpath("(//h2[contains(text(), ' 14')])[1]");
	By sortDropDown = By.xpath("//div[@class='go_sort-by-dropdown-wrapper']");
	By priceHightoLow = By.xpath("//option[text()=' Price: High to Low ']");
	By featuredProducts = By.xpath("//option[text()=' Featured Products ']");
	By priceLowtoHigh = By.xpath("//option[text()=' Price: Low to High ']");
	By collapse_Filter = By.xpath("//span[@class='go_hide-btn']");
	By productType = By.xpath("(//span[@class='go_filter-dropdown-icon'])[2]");
	By planValue = By.xpath("(//span[@class='go_filter-dropdown-icon'])[3]");
	By brand = By.xpath("(//span[@class='go_filter-dropdown-icon'])[1]");
	By clear_filters_Disabled = By.xpath("//span[@class='go_text-base-action go_clear-btn clear-filters-disable']");
	By clear_filters = By.xpath("//span[text()='Clear filters']");
	By PlanValue999_radioButton = By.xpath("(//h2[text()='999']//following::input[@type='radio'])[1]");
	By huaweibrand_radioButton = By.xpath("(//h2[text()='Huawei']//following::input[@type='checkbox'])[1]");
	By applebrand_radioButton = By.xpath("(//h2[text()='Apple']//following::input[@type='checkbox'])[1]");
	By applyFilter_Button = By.xpath("//button[text()=' Apply Filter ']");
	By planWithDevice = By.xpath("//h2[contains(text(), 'Huawei nova')]");
	By ebike_radioButton = By.xpath("(//h2[text()='e-Bike']//following::input[@type='checkbox'])[1]");
	By electricStudio_radioButton = By.xpath("//h2[text()='Electric Studio']//following-sibling::input");
	By electricstudio_Device = By.xpath("(//h2[contains(text(), 'Electric Studio ')])[1]");
	By magnifying_glass = By.xpath("//div[@class='go_card-zoom']");
	By magnifybutton = By.xpath("//div[@class='go_card-zoom']");
	By samsung_device = By.xpath("//h2[text()='Samsung Galaxy S21 Ultra 5G']");
	By colourOr_Finish = By.xpath("//span[text()='Color/Finish']");
	By capacity = By.xpath("//span[text()='Capacity']");
	By contract_duration = By.xpath("//span[text()='Contract duration']");
	By cashout_amount = By.xpath("//span[text()='Cashout Amount']");
	By renewWithThisDevice = By.xpath("//a[text()='Renew with this device']");
	By InStock_Text = By.xpath("//span[text()=' In Stock']");

	By selectAnotherDevice = By.xpath("//span[text()='Select another device']");
	By Color_Var = By.xpath("(//input[@class='go_color-radio'])[2]");
	By Smart_Phone = By.xpath("//h2[text()='Smartphone']//following-sibling::input");//h2[text()='Mobile Phone']//following-sibling::input
	By watch = By.xpath("//h2[text()='watch']//following-sibling::input");
	By Brand_Oppo = By.xpath("//h2[text()='Oppo']//following-sibling::input");
	By Feature_Products = By.xpath("(//span[@class='go_filter-dropdown-icon'])[4]");
	By New_Radio = By.xpath("//h2[text()='New']//following-sibling::input");
	By BestSeller_Radio = By.xpath("//h2[text()='Bestseller']//following-sibling::input");
	By Vocher_Radio = By.xpath("//h2[text()='Voucher']//following-sibling::input");
	By newTagged_Devices = By.xpath("//span[text()='New']");
	By bestSellerTagged_Devices = By.xpath("//span[text()='Bestseller']");
	By Tab_Devices = By.xpath("(//h2[contains(text(), 'iPad ')])[1]");
	By Nokia_Devices = By.xpath("//h2[contains(text(), 'Nokia ')]");
	By Nokia_Radio = By.xpath("//h2[text()='Nokia']//following-sibling::input");
	By GplanWithDevice999Text = By.xpath("//div[contains(text(), 'GPlan 999 with Device')]");
	By Plan2499 = By.xpath("(//h2[text()='2499']//following::input[@type='radio'])[1]");
	
	By link_CheckYourEligibility = By.xpath("//div[text() = 'Check your eligibility to renew']");
	
	By Checkbutton = By.xpath("//input[@class='go_primary-button mnp-check-eligibility']");
	
	By RenewalProcessing = By.xpath("//h1[text()=' Plan Renewal - Processing ']");
	By BestsellerTag = By.xpath("//span[text()=' Bestseller ']");
	By appleWatchDevices = By.xpath("//h2[contains(text(), 'Apple Watch')]");




















	









	
	/********************************************************************************************************************************/
	public WebElement get_privacyAccept() {
		return DriverManager.getDriver().findElement(privacyAccept);
	}

	/********************************************************************************************************************************/
	public WebElement get_link_LogoGlobe() {
		return DriverManager.getDriver().findElement(link_LogoGlobe);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_link_Apply() {
		return DriverManager.getDriver().findElement(link_Apply);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_link_Renew() {
		return DriverManager.getDriver().findElement(link_Renew);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_link_MobilePostPaid() {
		return DriverManager.getDriver().findElement(link_MobilePostPaid);
	}
	/********************************************************************************************************************************/
	public WebElement get_link_ViewAllDevices() {
		return DriverManager.getDriver().findElement(link_ViewAllDevices);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_BackToTop_Button() {
		return DriverManager.getDriver().findElement(BackToTop_Button);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_Colour_Variant() {
		return DriverManager.getDriver().findElement(Colour_Variant);
	}
	
	/********************************************************************************************************************************/

	public WebElement get_search_field() {
		return DriverManager.getDriver().findElement(search_field);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_searched_Device() {
		return DriverManager.getDriver().findElement(search_field);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_auto_search() {
		return DriverManager.getDriver().findElement(auto_search);
	}
	
	/********************************************************************************************************************************/


	public WebElement get_X_Button() {
		return DriverManager.getDriver().findElement(X_Button);
	}
	
	/********************************************************************************************************************************/
	
	public int get_FifteenDevicesPerPage() {
		//List<WebElement> element=new ArrayList<WebElement>();

		int size= DriverManager.getDriver().findElements(FifteenDevicesPerPage).size();
		return size;
	}
	
	/********************************************************************************************************************************/
	
	public WebElement get_notAvailable_Msg() {
		return DriverManager.getDriver().findElement(notAvailable_Msg);
	}
	
	/********************************************************************************************************************************/
	
	public WebElement get_aboutUs() {
		return DriverManager.getDriver().findElement(aboutUs);
	}
	
	/********************************************************************************************************************************/
	
	public WebElement get_relevantItem() {
		return DriverManager.getDriver().findElement(relevantItem);
	}
	
	/********************************************************************************************************************************/
	
	public WebElement get_sortDropDown() {
		return DriverManager.getDriver().findElement(sortDropDown);
	}
	
	/********************************************************************************************************************************/
	
	public WebElement get_priceHightoLow() {
		return DriverManager.getDriver().findElement(priceHightoLow);
	}
	
	/********************************************************************************************************************************/
	
	public WebElement get_priceLowtoHigh() {
		return DriverManager.getDriver().findElement(priceLowtoHigh);
	}
	
	/********************************************************************************************************************************/
	
	public WebElement get_featuredProducts() {
		return DriverManager.getDriver().findElement(featuredProducts);
	}
	
	/********************************************************************************************************************************/
	
	public WebElement get_collapse_Filter() {
		return DriverManager.getDriver().findElement(collapse_Filter);
	}
	
	/********************************************************************************************************************************/
	
	public WebElement get_planValue() {
		return DriverManager.getDriver().findElement(planValue);
	}
	
	/********************************************************************************************************************************/
	
	public WebElement get_productType() {
		return DriverManager.getDriver().findElement(productType);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_magnifybutton() {
		return DriverManager.getDriver().findElement(magnifybutton);
	}
	
	/********************************************************************************************************************************/
	
	public WebElement get_brand() {
		return DriverManager.getDriver().findElement(brand);
	}
	
	/********************************************************************************************************************************/
	
	public WebElement get_clear_filters_Disabled() {
		return DriverManager.getDriver().findElement(clear_filters_Disabled);
	}
	
	/********************************************************************************************************************************/
	
	public WebElement get_clear_filters() {
		return DriverManager.getDriver().findElement(clear_filters);
	}
	
	/********************************************************************************************************************************/
	
	public WebElement get_PlanValue999_radioButton() {
		return DriverManager.getDriver().findElement(PlanValue999_radioButton);
	}
	
	/********************************************************************************************************************************/
	
	public WebElement get_huaweibrand_radioButton() {
		return DriverManager.getDriver().findElement(huaweibrand_radioButton);
	}
	
	/********************************************************************************************************************************/
	
	public WebElement get_applyFilter_Button() {
		return DriverManager.getDriver().findElement(applyFilter_Button);
	}
	
	/********************************************************************************************************************************/
	
	public WebElement get_planWithDevice() {
		return DriverManager.getDriver().findElement(planWithDevice);
	}
	
	/********************************************************************************************************************************/
	
	public WebElement get_ebike_radioButton() {
		return DriverManager.getDriver().findElement(ebike_radioButton);
	}
	
	/********************************************************************************************************************************/
	
	public WebElement get_magnifying_glass() {
		return DriverManager.getDriver().findElement(magnifying_glass);
	}
	
	/********************************************************************************************************************************/
	
	public WebElement get_renewWithThisDevice() {
		return DriverManager.getDriver().findElement(renewWithThisDevice);
	}
	
	/********************************************************************************************************************************/
	
	public WebElement get_Smart_Phone() {
		return DriverManager.getDriver().findElement(Smart_Phone);
	}
	
	/********************************************************************************************************************************/
	
	public WebElement get_watch() {
		return DriverManager.getDriver().findElement(watch);
	}
	
	/********************************************************************************************************************************/
	
	public WebElement get_Brand_Oppo() {
		return DriverManager.getDriver().findElement(Brand_Oppo);
	}
	
	/********************************************************************************************************************************/
	
	public WebElement get_Color_Var() {
		return DriverManager.getDriver().findElement(Color_Var);
	}
	
	/********************************************************************************************************************************/
	
	public WebElement get_Feature_Products() {
		return DriverManager.getDriver().findElement(Feature_Products);
	}
	
	/********************************************************************************************************************************/
	
	public WebElement get_New_Radio() {
		return DriverManager.getDriver().findElement(New_Radio);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_BestSeller_Radio() {
		return DriverManager.getDriver().findElement(BestSeller_Radio);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_Vocher_Radio() {
		return DriverManager.getDriver().findElement(Vocher_Radio);
	}
	
	/********************************************************************************************************************************/
	
	public int get_newTagged_Devices() {

		int size= DriverManager.getDriver().findElements(newTagged_Devices).size();
		return size;
	}
/********************************************************************************************************************************/
	
	public int get_bestSellerTagged_Devices() {

		int size= DriverManager.getDriver().findElements(bestSellerTagged_Devices).size();
		return size;
	}
/********************************************************************************************************************************/
	
	public WebElement get_electricStudio_radioButton() {
		return DriverManager.getDriver().findElement(electricStudio_radioButton);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_Nokia_Radio() {
		return DriverManager.getDriver().findElement(Nokia_Radio);
	}
	
	/********************************************************************************************************************************/
	public int get_GplanWithDevice999Text() {
		//List<WebElement> element=new ArrayList<WebElement>();

		int size= DriverManager.getDriver().findElements(GplanWithDevice999Text).size();
		return size;
	}
	
	/********************************************************************************************************************************/
	public WebElement get_Plan2499() {
		return DriverManager.getDriver().findElement(Plan2499);
	}
	
	/********************************************************************************************************************************/
	
	public WebElement get_link_CheckYourEligibility() {
		return DriverManager.getDriver().findElement(link_CheckYourEligibility);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_Checkbutton() {
		return DriverManager.getDriver().findElement(Checkbutton);
	}
	/**********************************************************************************************************************************/
	public WebElement get_applebrand_radioButton() {
		return DriverManager.getDriver().findElement(applebrand_radioButton);
	}
	/***********************************************************************************************************************************/
	public List<WebElement> get_appleWatchDevices() {
		return DriverManager.getDriver().findElements(appleWatchDevices);
	}
	/***********************************************************************************************************************************/
	

	
	
	
	


	public boolean isElementExist(String message, String element, int waitTime) {
		boolean flag = false;

		switch (element) {
		case "cookiesNotification":
			flag = waitForElementVisibility(cookiesNotification, waitTime);
			break;
		case "privacyAccept":
			flag = waitForElementVisibility(privacyAccept, waitTime);
			break;
		case "link_LogoGlobe":
			flag = waitForElementVisibility(link_LogoGlobe, waitTime);
			break;	
		case "link_Apply":
			flag = waitForElementVisibility(link_Apply, waitTime);
			break;
		case "link_Renew":
			flag = waitForElementVisibility(link_Renew, waitTime);
			break;
		case "link_MobilePostPaid":
			flag = waitForElementVisibility(link_MobilePostPaid, waitTime);
			break;
		case "link_ViewAllDevices":
			flag = waitForElementVisibility(link_ViewAllDevices, waitTime);
			break;
		case "BackToTop_Button":
			flag = waitForElementVisibility(BackToTop_Button, waitTime);
			break;
		case "Colour_Variant":
			flag = waitForElementVisibility(Colour_Variant, waitTime);
			break;
		case "search_field":
			flag = waitForElementVisibility(search_field, waitTime);
			break;
		case "auto_search":
			flag = waitForElementVisibility(auto_search, waitTime);
			break;	
		case "searched_Device":
			flag = waitForElementVisibility(searched_Device, waitTime);
			break;
		case "X_Button":
			flag = waitForElementVisibility(X_Button, waitTime);
			break;
		case "notAvailable_Msg":
			flag = waitForElementVisibility(notAvailable_Msg, waitTime);
			break;	
		case "outOfStockText":
			flag = waitForElementVisibility(outOfStockText, waitTime);
			break;	
		case "relevantItem":
			flag = waitForElementVisibility(relevantItem, waitTime);
			break;	
		case "sortDropDown":
			flag = waitForElementVisibility(sortDropDown, waitTime);
			break;	
		case "priceHightoLow":
			flag = waitForElementVisibility(priceHightoLow, waitTime);
			break;	
		case "priceLowtoHigh":
			flag = waitForElementVisibility(priceLowtoHigh, waitTime);
			break;	
		case "featuredProducts":
			flag = waitForElementVisibility(featuredProducts, waitTime);
			break;	
		case "collapse_Filter":
			flag = waitForElementVisibility(collapse_Filter, waitTime);
			break;	
		case "productType":
			flag = waitForElementVisibility(productType, waitTime);
			break;	
		case "planValue":
			flag = waitForElementVisibility(planValue, waitTime);
			break;	
		case "brand":
			flag = waitForElementVisibility(brand, waitTime);
			break;	
		case "clear_filters_Disabled":
			flag = waitForElementVisibility(clear_filters_Disabled, waitTime);
			break;	
		case "clear_filters":
			flag = waitForElementVisibility(clear_filters, waitTime);
			break;	
		case "PlanValue999_radioButton":
			flag = waitForElementVisibility(PlanValue999_radioButton, waitTime);
			break;	
		case "huaweibrand_radioButton":
			flag = waitForElementVisibility(huaweibrand_radioButton, waitTime);
			break;	
		case "applyFilter_Button":
			flag = waitForElementVisibility(applyFilter_Button, waitTime);
			break;
		case "planWithDevice":
			flag = waitForElementVisibility(planWithDevice, waitTime);
			break;	
		case "samsung_device":
			flag = waitForElementVisibility(samsung_device, waitTime);
			break;		
		case "colourOr_Finish":
			flag = waitForElementVisibility(colourOr_Finish, waitTime);
			break;	
		case "capacity":
			flag = waitForElementVisibility(capacity, waitTime);
			break;
		case "contract_duration":
			flag = waitForElementVisibility(contract_duration, waitTime);
			break;	
		case "cashout_amount":
			flag = waitForElementVisibility(cashout_amount, waitTime);
			break;	
		case "applyWithThisDevice":
			flag = waitForElementVisibility(renewWithThisDevice, waitTime);
			break;
		case "Color_Var":
			flag = waitForElementVisibility(Color_Var, waitTime);
			break;
		case "Feature_Products":
			flag = waitForElementVisibility(Feature_Products, waitTime);
			break;
		case "New_Radio":
			flag = waitForElementVisibility(New_Radio, waitTime);
			break;
		case "BestSeller_Radio":
			flag = waitForElementVisibility(BestSeller_Radio, waitTime);
			break;
		case "Vocher_Radio":
			flag = waitForElementVisibility(Vocher_Radio, waitTime);
			break;	
		case "electricstudio_Device":
			flag = waitForElementVisibility(electricstudio_Device, waitTime);
			break;	
		case "Tab_Devices":
			flag = waitForElementVisibility(Tab_Devices, waitTime);
			break;
		case "Nokia_Devices":
			flag = waitForElementVisibility(Nokia_Devices, waitTime);
			break;	
		case "InStock_Text":
			flag = waitForElementVisibility(InStock_Text, waitTime);
			break;
		case "renewWithThisDevice":
			flag = waitForElementVisibility(renewWithThisDevice, waitTime);
			break;	
		case "link_CheckYourEligibility":
			flag = waitForElementVisibility(link_CheckYourEligibility, waitTime);
			break;
		case "RenewalProcessing":
			flag = waitForElementVisibility(RenewalProcessing, waitTime);
			break;	
		case "deviceGalleryText":
			flag = waitForElementVisibility(deviceGalleryText, waitTime);
			break;	
		case "BestsellerTag":
			flag = waitForElementVisibility(BestsellerTag, waitTime);
			break;
		case "appleWatchDevices":
			flag = waitForElementVisibility(appleWatchDevices, waitTime);
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
		
		case "privacyAccept":
			flag = waitForElementClickable(privacyAccept, waitTime);
			break;
		case "link_LogoGlobe":
			flag = waitForElementClickable(link_LogoGlobe, waitTime);
			break;
		case "link_Apply":
			flag = waitForElementClickable(link_Apply, waitTime);
			break;
		case "link_Renew":
			flag = waitForElementClickable(link_Renew, waitTime);
			break;
		case "link_MobilePostPaid":
			flag = waitForElementClickable(link_MobilePostPaid, waitTime);
			break;
		case "link_ViewAllDevices":
			flag = waitForElementClickable(link_ViewAllDevices, waitTime);
			break;	
		case "BackToTop_Button":
			flag = waitForElementClickable(BackToTop_Button, waitTime);
			break;	
		case "Colour_Variant":
			flag = waitForElementClickable(Colour_Variant, waitTime);
			break;
		case "Color_Var":
			flag = waitForElementClickable(Color_Var, waitTime);
			break;	
		case "search_field":
			flag = waitForElementClickable(search_field, waitTime);
			break;	
		case "searched_Device":
			flag = waitForElementClickable(searched_Device, waitTime);
			break;
		case "X_Button":
			flag = waitForElementClickable(searched_Device, waitTime);
			break;	
		case "sortDropDown":
			flag = waitForElementClickable(sortDropDown, waitTime);
			break;	
		case "priceHightoLow":
			flag = waitForElementClickable(priceHightoLow, waitTime);
			break;	
		case "priceLowtoHigh":
			flag = waitForElementClickable(priceLowtoHigh, waitTime);
			break;	
		case "featuredProducts":
			flag = waitForElementClickable(featuredProducts, waitTime);
			break;	
		case "collapse_Filter":
			flag = waitForElementClickable(collapse_Filter, waitTime);
			break;	
		case "productType":
			flag = waitForElementClickable(productType, waitTime);
			break;
		case "planValue":
			flag = waitForElementClickable(planValue, waitTime);
			break;
		case "brand":
			flag = waitForElementClickable(brand, waitTime);
			break;
		case "clear_filters_Disabled":
			flag = waitForElementClickable(clear_filters_Disabled, waitTime);
			break;
		case "clear_filters":
			flag = waitForElementClickable(clear_filters, waitTime);
			break;	
		case "PlanValue999_radioButton":
			flag = waitForElementClickable(PlanValue999_radioButton, waitTime);
			break;
		case "huaweibrand_radioButton":
			flag = waitForElementClickable(huaweibrand_radioButton, waitTime);
			break;	
		case "applyFilter_Button":
			flag = waitForElementClickable(applyFilter_Button, waitTime);
			break;
		case "planWithDevice":
			flag = waitForElementClickable(planWithDevice, waitTime);
			break;	
		case "applyWithThisDevice":
			flag = waitForElementClickable(renewWithThisDevice, waitTime);
			break;		
		case "selectAnotherDevice":
			flag = waitForElementClickable(selectAnotherDevice, waitTime);
			break;			
	
		
	
	
			
		}

		return flag;
	}
	/********************************************************************************************************************************/
	public void moveToElement(String element) {

		WebElement ele = null;

		switch (element) {
		case "link_Renew":
			ele = DriverManager.getDriver().findElement(link_Renew);
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
			
			case "privacyAccept":
				get_privacyAccept().click();
				break;
			case "link_LogoGlobe":
				get_link_LogoGlobe().click();
				break;
			case "link_Apply":
				get_link_Apply().click();
				break;
			case "link_Renew":
				get_link_Renew().click();
				break;
			case "link_MobilePostPaid":
				get_link_MobilePostPaid().click();
				break;
			case "link_ViewAllDevices":
				get_link_ViewAllDevices().click();
				break;
			case "BackToTop_Button":
				get_BackToTop_Button().click();
				break;
			case "Colour_Variant":
				get_Colour_Variant().click();
				break;
			case "search_field":
				get_search_field().click();
				break;
			case "auto_search":
				get_auto_search().click();
				break;	
			case "searched_Device":
				get_searched_Device().click();
				break;	
			case "X_Button":
				get_X_Button().click();
				break;	
			case "sortDropDown":
				get_sortDropDown().click();
				break;	
			case "priceHightoLow":
				get_priceHightoLow().click();
				break;	
			case "priceLowtoHigh":
				get_priceLowtoHigh().click();
				break;	
			case "featuredProducts":
				get_featuredProducts().click();
				break;	
			case "collapse_Filter":
				get_collapse_Filter().click();
				break;	
			case "productType":
				get_productType().click();
				break;	
			case "planValue":
				get_planValue().click();
				break;	
			case "brand":
				get_brand().click();
				break;	
			case "clear_filters_Disabled":
				get_clear_filters_Disabled().click();
				break;	
			case "clear_filters":
				get_clear_filters().click();
				break;	
			case "PlanValue999_radioButton":
				get_PlanValue999_radioButton().click();
				break;	
			case "huaweibrand_radioButton":
				get_huaweibrand_radioButton().click();
				break;	
			case "applyFilter_Button":
				get_applyFilter_Button().click();
				break;	
			case "planWithDevice":
				get_planWithDevice().click();
				break;	
			case "applyWithThisDevice":
				get_renewWithThisDevice().click();
				break;
			case "Smart_Phone":
				get_Smart_Phone().click();
				break;
			case "watch":
				get_watch().click();
				break;	
			case "Brand_Oppo":
				get_Brand_Oppo().click();
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
	
	public void jsClick(String message, String element) {
		//Object S;
		JavascriptExecutor jse = (JavascriptExecutor)DriverManager.getDriver();
		try {
			switch (element) {
			case "collapse_Filter":
		         jse.executeScript("arguments[0].click();", get_collapse_Filter());		
		         break;
			case "applyFilter_Button":
			      jse.executeScript("arguments[0].click();", get_applyFilter_Button());		
			      break;
			case "huaweibrand_radioButton":
			      jse.executeScript("arguments[0].click();", get_huaweibrand_radioButton());		
			      break;   
			case "ebike_radioButton":
			      jse.executeScript("arguments[0].click();", get_ebike_radioButton());		
			      break;     
			case "productType":
			      jse.executeScript("arguments[0].click();", get_productType());		
			      break;  
			case "magnifying_glass":
			      jse.executeScript("arguments[0].click();", get_magnifying_glass());		
			      break;   
			case "renewWithThisDevice":
			      jse.executeScript("arguments[0].click();", get_renewWithThisDevice());		
			      break;  
			case "PlanValue999_radioButton":
			      jse.executeScript("arguments[0].click();", get_PlanValue999_radioButton());		
			      break;
			case "Smart_Phone":
			      jse.executeScript("arguments[0].click();", get_Smart_Phone());		
			      break;   
			case "watch":
			      jse.executeScript("arguments[0].click();", get_watch());		
			      break;   
			case "brand":
			      jse.executeScript("arguments[0].click();", get_brand());		
			      break; 
			case "Brand_Oppo":
			      jse.executeScript("arguments[0].click();", get_Brand_Oppo());		
			      break; 
			case "Color_Var":
			      jse.executeScript("arguments[0].click();", get_Color_Var());		
			      break;       
			case "Feature_Products":
			      jse.executeScript("arguments[0].click();", get_Feature_Products());		
			      break; 
			case "New_Radio":
			      jse.executeScript("arguments[0].click();", get_New_Radio());		
			      break;
			case "BestSeller_Radio":
			      jse.executeScript("arguments[0].click();", get_BestSeller_Radio());		
			      break;
			case "Vocher_Radio":
			      jse.executeScript("arguments[0].click();", get_Vocher_Radio());		
			      break;   
			case "electricStudio_radioButton":
			      jse.executeScript("arguments[0].click();", get_electricStudio_radioButton());		
			      break;  
			case "Nokia_Radio":
			      jse.executeScript("arguments[0].click();", get_Nokia_Radio());		
			      break;      
			case "planValue":
			      jse.executeScript("arguments[0].click();", get_planValue());		
			      break;  
			case "clear_filters":
			      jse.executeScript("arguments[0].click();", get_clear_filters());		
			      break;     
			case "Plan2499":
			      jse.executeScript("arguments[0].click();", get_Plan2499());		
			      break; 
			case "BackToTop_Button":
			      jse.executeScript("arguments[0].click();", get_BackToTop_Button());		
			      break; 
			case "magnifybutton":
			      jse.executeScript("arguments[0].click();", get_magnifybutton());		
			      break; 
			case "auto_search":
			      jse.executeScript("arguments[0].click();", get_auto_search());		
			      break;
			case "applebrand_radioButton":
			      jse.executeScript("arguments[0].click();", get_applebrand_radioButton());		
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
