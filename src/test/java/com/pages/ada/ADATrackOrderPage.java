package com.pages.ada;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import globeOnline_CommonMethods.DriverManager;

public class ADATrackOrderPage extends BasePage {

	By referenceNumber = By.xpath("//input[@formcontrolname='referenceNumber']");
	By email = By.xpath("//input[@formcontrolname='email']");
	By btn_trackOrder = By.xpath("//button[text()=' Track order']");
	By trackOrderLink = By.xpath("(//a[text()=' Track my order '])[1]");


	/********************************************************************************************************************************/
	public WebElement get_referenceNumber() {
		return DriverManager.getDriver().findElement(referenceNumber);
	}

	/********************************************************************************************************************************/
	public WebElement get_email() {
		return DriverManager.getDriver().findElement(email);
	}

	/********************************************************************************************************************************/
	public WebElement get_btn_trackOrder() {
		return DriverManager.getDriver().findElement(btn_trackOrder);
	}
	/********************************************************************************************************************************/
	public WebElement get_trackOrderLink() {
		return DriverManager.getDriver().findElement(trackOrderLink);
	}
	
    public void jsClick(String message, String element) {
		
		JavascriptExecutor jse = (JavascriptExecutor)DriverManager.getDriver();
		try {
			switch (element) {
			case "trackOrderLink":
				jse.executeScript("arguments[0].click();", get_trackOrderLink());
				break;
			case "btn_trackOrder":
				jse.executeScript("arguments[0].click();", get_btn_trackOrder());
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
