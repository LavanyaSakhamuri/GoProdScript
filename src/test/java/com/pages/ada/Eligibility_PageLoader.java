package com.pages.ada;
import org.openqa.selenium.By;

public class Eligibility_PageLoader extends BasePage{

	/*******************************************RONNIE SCRIPT START HERE*************************************************/
	
	By LoadingImg = By.xpath("//img[@alt='phase-1']");
	By LoadingHeader = By.xpath("//div[@class='go_loading-block']/div/h1");
	By LoadingMsg = By.xpath("//div[@class='go_loading-block']/div/p");
	By LoadingBanner = By.xpath("//div[@class='go_banner -go_loading-screen']");
	
	
	
	
	/*
	 * public WebElement get_street() { return
	 * DriverManager.getDriver().findElement(street); }
	 */
	
	public boolean isElementExist(String message, String element, int waitTime) {
		boolean flag = false;
		
		switch (element) {
		case "LoadingImg":
			flag = waitForElementVisibility(LoadingImg, waitTime);
			break;
		case "LoadingHeader":
			flag = waitForElementVisibility(LoadingHeader, waitTime);
			break;
		case "LoadingMsg":
			flag = waitForElementVisibility(LoadingMsg, waitTime);
			break;
		case "LoadingBanner":
			flag = waitForElementVisibility(LoadingBanner, waitTime);
			break;
			
		}

		if (flag) {
			System.out.println(message + " - exists");
		} else {
			System.out.println(message + " - do not exist");
		}

		return flag;
	}
	
	
	
	
}
