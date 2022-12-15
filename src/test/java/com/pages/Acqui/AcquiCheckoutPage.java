package com.pages.Acqui;

import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.pages.Acqui.BasePage;

import globeOnline_CommonMethods.DriverManager;

public class AcquiCheckoutPage extends BasePage {
	
	By We_Sent_Code_To = By.xpath("//div[contains(text(),' We sent the code to')]");
	By otp = By.xpath("//input[contains(@id,'otpInput')]");
	By transactionTimeOut= By.xpath("//span[text()='The transaction timed out!']");
	By One_Time_Password= By.xpath("//h1[text()=' One-Time Password ']");
	By Code_ExpiresIn_5Min= By.xpath("//div[text()=' Code expires in ']//span");
	By Resend_Code= By.xpath("//button[text()=' Resend code. ']");
	By Didnot_Get_Code= By.xpath("//span[text()='Didn’t get the code?']");


	
	
	
	/********************************************************************************************************************************/
	public List<WebElement> get_OTP() {
		return DriverManager.getDriver().findElements(otp);
	}
   /********************************************************************************************************************************/
	

	
	
	

	public boolean isElementExist(String message, String element, int waitTime) {
		boolean flag = false;

		switch (element) {
		case "We_Sent_Code_To":
			flag = waitForElementVisibility(We_Sent_Code_To, waitTime);
			break;
		case "transactionTimeOut":
			flag = waitForElementVisibility(transactionTimeOut, waitTime);
			break;
		case "One_Time_Password":
			flag = waitForElementVisibility(One_Time_Password, waitTime);
			break;	
		case "Code_ExpiresIn_5Min":
			flag = waitForElementVisibility(Code_ExpiresIn_5Min, waitTime);
			break;
		case "Resend_Code":
			flag = waitForElementVisibility(Resend_Code, waitTime);
			break;
		case "Didnot_Get_Code":
			flag = waitForElementVisibility(Didnot_Get_Code, waitTime);
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
	
	
	

}
