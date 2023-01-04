package com.pages.ada;

import java.util.NoSuchElementException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;

import globeOnline_CommonMethods.DriverManager;




public class ADAGallerypage extends BasePage{
	
	
	By FilterBtn = By.xpath("//h2[contains(text(), ' Filters ')]");
	By ProdTypeBtn = By.xpath("//span[contains(text(), 'Product type')]");
	By PlanValueBtn = By.xpath("//span[contains(text(), 'Plan Value')]");
	By BrandBtn = By.xpath("//span[contains(text(), 'Brand')]");
	By FeaturedBtn = By.xpath("//span[contains(text(), 'Featured Products')]");
	By ClearFilterBtn = By.xpath("//span[contains(text(), 'Clear filters')]");
	By ApplyFilterBtn = By.xpath("//button[contains(text(), ' Apply Filter ')]");
	By SearchField = By.xpath("//input[@placeholder='Search by brand, model, feature, plan value']");
	By SortByList = By.xpath("//select[@name='sort']");
	
	By DeviceFound = By.xpath("//p[@class='go_text-h2 go_results ng-star-inserted']/p");
	By ProdName = By.xpath("//h2[contains(text(), 'Samsung Galaxy S21 Plus 5G')]");
	By ProdIdentifier = By.xpath("//span[@class='go_tag go_text-preamble-chip ng-star-inserted']");
	By ProdImg = By.xpath("//img[@class='go_device-image']");
	By ProdColor = By.xpath("//div[@class='go_card-row go_color-palette-block']");
	By ProdStorage = By.xpath("//span[@class='go_selection-value']");
	By ProdCashout = By.xpath("//span[@class='go_text-small-bold-content']");
	By ProdCashoutValue = By.xpath("//div[contains(text(), ' GPlan 1499 with Device ')] ");
	
//	By ProdStockAvailability = By.xpath("//div[@class='go_card-row go_status-block']/span");
	By ProdStockAvailability = By.xpath("//div[@class='go_card-row go_status-block']/span");
	
	By ProdApplywithDevice = By.xpath("//a[@class='go_btn go_outline go_text-small-action :anchor-tag ng-star-inserted']");
	
	
//selecting the planvalue	
	By Planvalue = By.xpath("//span[contains(text(),'Plan Value')]");	
	By Planvale_dropdownbtn = By.xpath("(//span[@class='go_filter-dropdown-icon'])[3]");//preprod
			//(//span[@class='go_filter-dropdown-icon'])[2]");	//UAT
	By plan2499 = By.xpath("//h2[contains(text(),'2499')]");	
	By Applybutton = By.xpath("//button[contains(text(),' Apply Filter ')]");	
	
	//selecting the plan value 1499
	By plan1499 = By.xpath("//h2[contains(text(),'1499')]");
    By magnifybutton = By.xpath("//div[@class='go_card-zoom']");
	By ApplyWithThisDevice = By.xpath("//button[text()='Apply with this device']");
	By Colour = By.xpath("(//input[@class='go_color-radio'])[4]");


	
	/********************************************************************************************************************************/
	public WebElement get_magnifybutton() {
		return DriverManager.getDriver().findElement(magnifybutton);
	}
	/********************************************************************************************************************************/
	public WebElement get_Applybutton() {
		return DriverManager.getDriver().findElement(Applybutton);
	}
	/********************************************************************************************************************************/
	public WebElement get_plan1499() {
		return DriverManager.getDriver().findElement(plan1499);
	}

	/********************************************************************************************************************************/
	public WebElement get_plan2499() {
		return DriverManager.getDriver().findElement(plan2499);
	}
	/********************************************************************************************************************************/
	public WebElement get_Planvale_dropdownbtn() {
		return DriverManager.getDriver().findElement(Planvale_dropdownbtn);
	}
	/********************************************************************************************************************************/
	public WebElement get_DeviceFound() {
		return DriverManager.getDriver().findElement(DeviceFound);
	}
	/********************************************************************************************************************************/
	public WebElement get_ProdName() {
		return DriverManager.getDriver().findElement(ProdName);
	}
	/********************************************************************************************************************************/
	public WebElement get_ProdIdentifier() {
		return DriverManager.getDriver().findElement(ProdIdentifier);
	}
	/********************************************************************************************************************************/
	public WebElement get_ProdCashout() {
		return DriverManager.getDriver().findElement(ProdCashout);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_ProdCashoutValue() {
			return DriverManager.getDriver().findElement(ProdCashoutValue);
		}
		/********************************************************************************************************************************/
	public WebElement get_ProdStockAvailability() {
		return DriverManager.getDriver().findElement(ProdStockAvailability);
	}
	/********************************************************************************************************************************/
	public WebElement get_ProdApplywithDevice() {
		return DriverManager.getDriver().findElement(ProdApplywithDevice);
	}
	/********************************************************************************************************************************/
	public WebElement get_SearchField() {
		return DriverManager.getDriver().findElement(SearchField);
	}
	/********************************************************************************************************************************/
	public WebElement get_ApplyWithThisDevice() {
		return DriverManager.getDriver().findElement(ApplyWithThisDevice);
	}
	/********************************************************************************************************************************/
	public WebElement get_Colour() {
		return DriverManager.getDriver().findElement(Colour);
	}
	/********************************************************************************************************************************/

	public boolean isElementExist(String message, String element, int waitTime) {
		
		boolean flag = false;
		
		switch (element) {
		case "FilterBtn":
			flag = waitForElementVisibility(FilterBtn, waitTime);
			break;
		case "Planvalue":
			flag = waitForElementVisibility(Planvalue, waitTime);
			break;
			
		case "ProdTypeBtn":
			flag = waitForElementVisibility(ProdTypeBtn, waitTime);
			break;
	
		case "PlanValueBtn":
			flag = waitForElementVisibility(PlanValueBtn, waitTime);
			break;

		case "BrandBtn":
			flag = waitForElementVisibility(BrandBtn, waitTime);
			break;
		
		case "FeaturedBtn":
			flag = waitForElementVisibility(FeaturedBtn, waitTime);
			break;
		
		case "ClearFilterBtn":
			flag = waitForElementVisibility(ClearFilterBtn, waitTime);
			break;
				
		case "ApplyFilterBtn":
			flag = waitForElementVisibility(ApplyFilterBtn, waitTime);
			break;
				
		case "SearchField":
			flag = waitForElementVisibility(SearchField, waitTime);
			break;
			
		case "SortByList":
			flag = waitForElementVisibility(SortByList, waitTime);
			break;	
		case "DeviceFound":
			flag = waitForElementVisibility(DeviceFound, waitTime);
			break;	
		case "ProdName":
			flag = waitForElementVisibility(ProdName, waitTime);
			break;
			case "ProdIdentifier":
			flag = waitForElementVisibility(ProdIdentifier, waitTime);
			break;		
		case "ProdImg":
			flag = waitForElementVisibility(ProdImg, waitTime);
			break;
		case "ProdColor":
			flag = waitForElementVisibility(ProdColor, waitTime);
			break;
		case "ProdStorage":
			flag = waitForElementVisibility(ProdStorage, waitTime);
			break;
		case "ProdCashout":
			flag = waitForElementVisibility(ProdCashout, waitTime);
			break;	
		case "ProdCashoutValue":
			flag = waitForElementVisibility(ProdCashoutValue, waitTime);
			break;
		case "ProdStockAvailability":
			flag = waitForElementVisibility(ProdStockAvailability, waitTime);
			break;
		case "ProdApplywithDevice":
			flag = waitForElementVisibility(ProdApplywithDevice, waitTime);
			break;
		case "ApplyWithThisDevice":
			flag = waitForElementVisibility(ApplyWithThisDevice, waitTime);
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
	
	
// *******************************************************************************************************************************
	
	public boolean isClickable(String element, int waitTime) {

		boolean flag = false;

		switch (element) {
		case "ProdApplywithDevice":
			flag = waitForElementClickable(ProdApplywithDevice, waitTime);
			break;
		}
		return flag;
	}
	// *******************************************************************************************************************************
	
	public void clickOnElement(String type, String eleName, String ele) {

		try {
			switch (ele) {
			
			case "ProdApplywithDevice":
				get_ProdApplywithDevice().click();
				break;
			case "Planvale_dropdownbtn":
				get_Planvale_dropdownbtn().click();
				break;
			case "plan1499":
				get_plan1499().click();
				break;		
			case "plan2499":
				get_plan2499().click();
				break;
			case "Applybutton":
				get_Applybutton().click();
				break;
			case "ApplyWithThisDevice":
				get_ApplyWithThisDevice().click();
				break;	
			case "Colour":
				get_Colour().click();
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

