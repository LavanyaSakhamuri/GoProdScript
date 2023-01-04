package com.pages.ada;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import globeOnline_CommonMethods.DriverManager;

public class ADALanding_Page extends BasePage {

	static File file;

//	public static WebDriverManager.getDriver() DriverManager.getDriver();
//
//	public LandingPage(WebDriverManager.getDriver() DriverManager.getDriver()) {
//		this.DriverManager.getDriver() = DriverManager.getDriver();
//	}
	
	By cookiesNotification = By.xpath("//span[contains(text(),'Your privacy is important to us')]");
	By privacyAccept = By.xpath("//button[text()=' I accept']");
	By link_LogoGlobe = By.xpath("//a/img[@alt = 'Globe Logo']");
	By link_Apply = By.xpath("//form[contains(@class,'menu-bar-height')] //a[text()='Apply']");
	By link_Renew = By.xpath("//form[contains(@class,'menu-bar-height')] //a[text()='Renew']");
	By link_Switch = By.xpath("//form[contains(@class,'menu-bar-height')] //a[text()='Switch']");
	By link_MenuBuy = By.xpath("//form[contains(@class,'menu-bar-height')] //a[text()='Buy']");
	By CartIcon = By.xpath("//a/img[contains(@src,'cart-icon')]");
	By link_TrackMyOrder = By.xpath("//form[contains(@class,'menu-bar-height')] //a[text()=' Track my order ']");
	By link_Help = By.xpath("//form[contains(@class,'menu-bar-height')] //a[text()=' Help ']");
	By link_MobilePostpaid = By.xpath("//a[text() = 'Mobile Postpaid']");
	By link_ViewAllDevices = By.xpath("//a[text() = 'View all devices']");
	By postpaidDevices = By.xpath("//h1[text() = ' Postpaid Devices ']");
	By filters = By.xpath("(//span[@class='go_filter-icon-open'])[1]");
	By link_buildMyPlan = By.xpath("//div[text() = ' Build my plan ']");
	By postpaidPlansAndSmartphones= By.xpath("//h1[contains(text(),' Postpaid Plans and Smartphones ')]");
	By acquiCarousel01 = By.xpath("(//div/img[@alt = 'OPPO Reno7 Z 5G'])[1]");
			//(//div/img[@alt = 'Huawei  Preorder'])[1]");
	By acquiCarousel02 = By.xpath("//div[@class='d-flex flex-column acqui-postpaid-banner1-wrapper']");
	By pickingTheRightPlanBanner= By.xpath("//h2[contains(text(),'Picking the right plan isn’t rocket science.')]");
			//h2[contains(text(),'Picking the right plan isn�t rocket science.')]");
	By customSlider = By.xpath("//div[@class='desktop-selector ng-star-inserted']");
	By HowOftenDoYou = By.xpath("//div[text() = 'How often do you watch live selling videos like LazLive or Shopee Live?']");
	By rarely = By.xpath("//span[text()='Rarely']");
	By occasionally = By.xpath("//span[text()='Occasionally']");
	By sometimes = By.xpath("//span[text()='Sometimes']");
	By always = By.xpath("//span[text()='Always']");
	By tellMeabout = By.xpath("(//button[text()=' Tell me more about this plan '])[1]");
	By introductionBlock = By.xpath("//div[@class='introduction-block']");
	By planStylesForAll = By.xpath("//span[text() = 'Plan styles for all lifestyles']");
	By shopping = By.xpath("(//div[@class='plan-type-label d-flex justify-content-center'])[1]");
	By social = By.xpath("(//div[@class='plan-type-label d-flex justify-content-center'])[2]");
	By videos= By.xpath("(//div[@class='plan-type-label d-flex justify-content-center'])[3]");
	By music = By.xpath("(//div[@class='plan-type-label d-flex justify-content-center'])[4]");
	By work = By.xpath("(//div[@class='plan-type-label d-flex justify-content-center'])[5]");
	By games = By.xpath("(//div[@class='plan-type-label d-flex justify-content-center'])[6]");
	By gplanWithDevice = By.xpath("//option[text()=' GPlan with Device ']");
	By gplanWithGCash = By.xpath("//option[text()=' GPlan with GCash ']");
	By gplanPlusSIMOnly = By.xpath("//option[text()=' GPlan SIM-Only ']");
			//option[text()=' GPlan Plus ']");
	By gplanSIMOnlyAllData = By.xpath("//option[text()=' GPlan SIM-Only All Data ']");
	By previousicon = By.xpath("(//div[@class='owl-prev'])[2]");
	By starter = By.xpath("//div[text()='Starter']");
	By lite = By.xpath("//div[text()='Lite']");
	By basic = By.xpath("//div[text()='Basic']");
	By owlnext = By.xpath("(//div[@class='owl-next'])[2]");
	By value = By.xpath("//div[text()='Value']");
	By essential = By.xpath("//div[text()='Essential']");
	By plus = By.xpath("//div[text()='Plus']");
	By extra = By.xpath("//div[text()='Extra']");
	By alwaysOn = By.xpath("//div[text()='Always On']");
	By faqText1 = By.xpath("(//div[@class='item-text'])[1]");
	By faqText2 = By.xpath("(//div[@class='item-text'])[2]");
	By faqText3 = By.xpath("(//div[@class='item-text'])[3]");
	By faqText4 = By.xpath("(//div[@class='item-text'])[4]");
	By faqText5 = By.xpath("(//div[@class='item-text'])[5]");
	By faqText6 = By.xpath("(//div[@class='item-text'])[6]");
	By accordianText1 = By.xpath("(//div[@class='accordian-text'])[1]");
	By accordianText2 = By.xpath("(//div[@class='accordian-text'])[2]");
	By accordianText3 = By.xpath("(//div[@class='accordian-text'])[3]");
	By accordianText4 = By.xpath("(//div[@class='accordian-text'])[4]");
	By accordianText5 = By.xpath("(//div[@class='accordian-text'])[5]");
	By accordianText6 = By.xpath("(//div[@class='accordian-text'])[6]");
	By acccordionButton1 = By.xpath("(//button[@id='faqExpandCollapse'])[1]");
	By acccordionButton2 = By.xpath("(//button[@id='faqExpandCollapse'])[2]");
	By acccordionButton3 = By.xpath("(//button[@id='faqExpandCollapse'])[3]");
	By acccordionButton4 = By.xpath("(//button[@id='faqExpandCollapse'])[4]");
	By acccordionButton5 = By.xpath("(//button[@id='faqExpandCollapse'])[5]");
	By acccordionButton6 = By.xpath("(//button[@id='faqExpandCollapse'])[6]");
	By simOnlyAllData599= By.xpath("//div[contains(text(),'GPlan SIM-Only All Data 599')]");
	
	//ADA2
	By Gplanwithdevice599=By.xpath("//div[contains(text(),'GPlan 599 with Device')]");
	
	
	
	
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
	
	public WebElement get_link_Switch() {
		return DriverManager.getDriver().findElement(link_Switch);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_link_MenuBuy() {
		return DriverManager.getDriver().findElement(link_MenuBuy);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_CartIcon() {
		return DriverManager.getDriver().findElement(CartIcon);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_link_TrackMyOrder() {
		return DriverManager.getDriver().findElement(link_TrackMyOrder);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_link_Help() {
		return DriverManager.getDriver().findElement(link_Help);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_link_MobilePostpaid() {
		return DriverManager.getDriver().findElement(link_MobilePostpaid);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_link_ViewAllDevices() {
		return DriverManager.getDriver().findElement(link_ViewAllDevices);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_link_buildMyPlan() {
		return DriverManager.getDriver().findElement(link_buildMyPlan);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_acccordionButton1() {
		return DriverManager.getDriver().findElement(acccordionButton1);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_acccordionButton2() {
		return DriverManager.getDriver().findElement(acccordionButton2);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_acccordionButton3() {
		return DriverManager.getDriver().findElement(acccordionButton3);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_acccordionButton4() {
		return DriverManager.getDriver().findElement(acccordionButton4);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_starter() {
		return DriverManager.getDriver().findElement(starter);
	}

	/********************************************************************************************************************************/
	public WebElement get_acccordionButton5() {
		return DriverManager.getDriver().findElement(acccordionButton5);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_acccordionButton6() {
		return DriverManager.getDriver().findElement(acccordionButton6);
	}
	
	/********************************************************************************************************************************/
//	public WebElement get_acccordionButton() {
//		return DriverManager.getDriver().findElement(acccordionButton);
//	}
//	
	/********************************************************************************************************************************/
	public WebElement get_gplanWithDevice() {
		return DriverManager.getDriver().findElement(gplanWithDevice);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_gplanWithGCash() {
		return DriverManager.getDriver().findElement(gplanWithGCash);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_gplanPlusSIMOnly() {
		return DriverManager.getDriver().findElement(gplanPlusSIMOnly);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_gplanSIMOnlyAllData() {
		return DriverManager.getDriver().findElement(gplanSIMOnlyAllData);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_previousicon() {
		return DriverManager.getDriver().findElement(previousicon);
	}
	
	
	/********************************************************************************************************************************/
	public WebElement get_owlnext() {
		return DriverManager.getDriver().findElement(owlnext);
	}
	
	
	
	
	
	/********************************************************************************************************************************/

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
		case "link_Switch":
			flag = waitForElementVisibility(link_Switch, waitTime);
			break;
		case "link_MenuBuy":
			flag = waitForElementVisibility(link_MenuBuy, waitTime);
			break;
		case "CartIcon":
			flag = waitForElementVisibility(CartIcon, waitTime);
			break;
		case "link_TrackMyOrder":
			flag = waitForElementVisibility(link_TrackMyOrder, waitTime);
			break;
		case "link_Help":
			flag = waitForElementVisibility(link_Help, waitTime);
			break;
		case "link_MobilePostpaid":
			flag = waitForElementVisibility(link_MobilePostpaid, waitTime);
			break;
		case "link_ViewAllDevices":
			flag = waitForElementVisibility(link_ViewAllDevices, waitTime);
			break;
		case "postpaidDevices":
			flag = waitForElementVisibility(postpaidDevices, waitTime);
			break;
		case "filters":
			flag = waitForElementVisibility(filters, waitTime);
			break;
		case "link_buildMyPlan":
			flag = waitForElementVisibility(link_buildMyPlan, waitTime);
			break;
		case "postpaidPlansAndSmartphones":
			flag = waitForElementVisibility(postpaidPlansAndSmartphones, waitTime);
			break;
		case "acquiCarousel01":
			flag = waitForElementVisibility(acquiCarousel01, waitTime);
			break;
		case "acquiCarousel02":
			flag = waitForElementVisibility(acquiCarousel02, waitTime);
			break;
		case "pickingTheRightPlanBanner":
			flag = waitForElementVisibility(pickingTheRightPlanBanner, waitTime);
			break;
		case "customSlider":
			flag = waitForElementVisibility(customSlider, waitTime);
			break;
		case "HowOftenDoYou":
			flag = waitForElementVisibility(HowOftenDoYou, waitTime);
			break;
		case "rarely":
			flag = waitForElementVisibility(rarely, waitTime);
			break;
		case "occasionally":
			flag = waitForElementVisibility(occasionally, waitTime);
			break;
		case "sometimes":
			flag = waitForElementVisibility(sometimes, waitTime);
			break;
		case "always":
			flag = waitForElementVisibility(always, waitTime);
			break;
        case "tellMeabout":
			flag = waitForElementVisibility(tellMeabout, waitTime);
			break;	
		case "introductionBlock":
			flag = waitForElementVisibility(introductionBlock, waitTime);
			break;
		case "planStylesForAll":
			flag = waitForElementVisibility(planStylesForAll, waitTime);
			break;
		case "shopping":
			flag = waitForElementVisibility(shopping, waitTime);
			break;
		case "social":
			flag = waitForElementVisibility(social, waitTime);
			break;
		case "videos":
			flag = waitForElementVisibility(videos, waitTime);
			break;
		case "music":
			flag = waitForElementVisibility(music, waitTime);
			break;
		case "work":
			flag = waitForElementVisibility(work, waitTime);
			break;
		case "games":
			flag = waitForElementVisibility(games, waitTime);
			break;	
		case "faqText1":
			flag = waitForElementVisibility(faqText1, waitTime);
			break;
		case "faqText2":
			flag = waitForElementVisibility(faqText2, waitTime);
			break;
		case "faqText3":
			flag = waitForElementVisibility(faqText3, waitTime);
			break;
		case "faqText4":
			flag = waitForElementVisibility(faqText4, waitTime);
			break;
		case "faqText5":
			flag = waitForElementVisibility(faqText5, waitTime);
			break;
		case "faqText6":
			flag = waitForElementVisibility(faqText6, waitTime);
			break;
		case "accordianText1":
			flag = waitForElementVisibility(accordianText1, waitTime);
			break;
		case "accordianText2":
			flag = waitForElementVisibility(accordianText2, waitTime);
			break;
		case "accordianText3":
			flag = waitForElementVisibility(accordianText3, waitTime);
			break;
		case "accordianText4":
			flag = waitForElementVisibility(accordianText4, waitTime);
			break;
		case "accordianText5":
			flag = waitForElementVisibility(accordianText5, waitTime);
			break;
		case "accordianText6":
			flag = waitForElementVisibility(accordianText6, waitTime);
			break;
		case "acccordionButton1":
			flag = waitForElementVisibility(acccordionButton1, waitTime);
			break;
		case "acccordionButton2":
			flag = waitForElementVisibility(acccordionButton2, waitTime);
			break;
		case "acccordionButton3":
			flag = waitForElementVisibility(acccordionButton3, waitTime);
			break;
		case "acccordionButton4":
			flag = waitForElementVisibility(acccordionButton4, waitTime);
			break;
		case "acccordionButton5":
			flag = waitForElementVisibility(acccordionButton5, waitTime);
			break;
		case "acccordionButton6":
			flag = waitForElementVisibility(acccordionButton6, waitTime);
			break;
		case "gplanWithDevice":
			flag = waitForElementVisibility(gplanWithDevice, waitTime);
			break;
		case "gplanWithGCash":
			flag = waitForElementVisibility(gplanWithGCash, waitTime);
			break;
		case "gplanPlusSIMOnly":
			flag = waitForElementVisibility(gplanPlusSIMOnly, waitTime);
			break;
		case "gplanSIMOnlyAllData":
			flag = waitForElementVisibility(gplanSIMOnlyAllData, waitTime);
			break;
		case "previousicon":
			flag = waitForElementVisibility(previousicon, waitTime);
			break;
		case "starter":
			flag = waitForElementVisibility(starter, waitTime);
			break;
		case "lite":
			flag = waitForElementVisibility(lite, waitTime);
			break;
		case "basic":
			flag = waitForElementVisibility(basic, waitTime);
			break;
		case "owlnext":
			flag = waitForElementVisibility(owlnext, waitTime);
			break;
		case "value":
			flag = waitForElementVisibility(value, waitTime);
			break;
		case "essential":
			flag = waitForElementVisibility(essential, waitTime);
			break;
		case "plus":
			flag = waitForElementVisibility(plus, waitTime);
			break;
		case "extra":
			flag = waitForElementVisibility(extra, waitTime);
			break;
		case "alwaysOn":
			flag = waitForElementVisibility(alwaysOn, waitTime);
			break;
		case "simOnlyAllData599":
			flag = waitForElementVisibility(simOnlyAllData599, waitTime);
			break;
		case "Gplanwithdevice599":
			flag = waitForElementVisibility(Gplanwithdevice599, waitTime);
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
		case "link_Switch":
			flag = waitForElementClickable(link_Switch, waitTime);
			break;
		case "link_MenuBuy":
			flag = waitForElementClickable(link_MenuBuy, waitTime);
			break;
		case "CartIcon":
			flag = waitForElementClickable(CartIcon, waitTime);
			break;
		case "link_TrackMyOrder":
			flag = waitForElementClickable(link_TrackMyOrder, waitTime);
			break;
		case "link_Help":
			flag = waitForElementClickable(link_Help, waitTime);
			break;
		case "link_MobilePostpaid":
			flag = waitForElementClickable(link_MobilePostpaid, waitTime);
			break;
		case "link_ViewAllDevices":
			flag = waitForElementClickable(link_ViewAllDevices, waitTime);
			break;
		case "link_buildMyPlan":
			flag = waitForElementClickable(link_buildMyPlan, waitTime);
			break;
		case "acccordionButton1":
			flag = waitForElementClickable(acccordionButton1, waitTime);
			break;
		case "acccordionButton2":
			flag = waitForElementClickable(acccordionButton2, waitTime);
			break;
		case "acccordionButton3":
			flag = waitForElementClickable(acccordionButton3, waitTime);
			break;
		case "acccordionButton4":
			flag = waitForElementClickable(acccordionButton4, waitTime);
			break;
		case "acccordionButton5":
			flag = waitForElementClickable(acccordionButton5, waitTime);
			break;
		case "acccordionButton6":
			flag = waitForElementClickable(acccordionButton6, waitTime);
			break;
		case "gplanWithDevice":
			flag = waitForElementClickable(gplanWithDevice, waitTime);
			break;
		case "gplanWithGCash":
			flag = waitForElementClickable(gplanWithGCash, waitTime);
			break;
		case "gplanPlusSIMOnly":
			flag = waitForElementClickable(gplanPlusSIMOnly, waitTime);
			break;
		case "gplanSIMOnlyAllData":
			flag = waitForElementClickable(gplanSIMOnlyAllData, waitTime);
			break;
		case "previousicon":
			flag = waitForElementClickable(previousicon, waitTime);
			break;
		case "owlnext":
			flag = waitForElementClickable(owlnext, waitTime);
			break;
			
			
		

		}

		return flag;
	}
	/********************************************************************************************************************************/
	public void moveToElement(String element) {

		WebElement ele = null;

		switch (element) {
		case "link_Apply":
			ele = DriverManager.getDriver().findElement(link_Apply);
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
			case "link_Switch":
				get_link_Switch().click();
				break;
			case "link_MenuBuy":
				get_link_MenuBuy().click();
				break;
			case "CartIcon":
				get_CartIcon().click();
				break;
			case "link_TrackMyOrder":
				get_link_TrackMyOrder().click();
				break;
			case "link_Help":
				get_link_Help().click();
				break;
			case "link_MobilePostpaid":
				get_link_MobilePostpaid().click();
				break;
			case "link_ViewAllDevices":
				get_link_ViewAllDevices().click();
				break;
			case "link_buildMyPlan":
				get_link_buildMyPlan().click();
				break;
			case "acccordionButton1":
				get_acccordionButton1().click();
				break;
			case "acccordionButton2":
				get_acccordionButton2().click();
				break;
			case "acccordionButton3":
				get_acccordionButton3().click();
				break;
			case "acccordionButton4":
				get_acccordionButton4().click();
				break;
			case "acccordionButton5":
				get_acccordionButton5().click();
				break;
			case "acccordionButton6":
				get_acccordionButton6().click();
				break;
			case "gplanWithDevice":
				get_gplanWithDevice().click();
				break;
			case "gplanWithGCash":
				get_gplanWithGCash().click();
				break;
			case "gplanPlusSIMOnly":
				get_gplanPlusSIMOnly().click();
				break;
			case "gplanSIMOnlyAllData":
				get_gplanSIMOnlyAllData().click();
				break;
			case "previousicon":
				get_previousicon().click();
				break;
			case "owlnext":
				get_owlnext().click();
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
