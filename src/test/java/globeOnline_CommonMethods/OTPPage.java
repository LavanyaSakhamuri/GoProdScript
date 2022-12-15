package globeOnline_CommonMethods;
import java.util.NoSuchElementException;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;

import com.pages.Acqui.BasePage;


public class OTPPage extends BasePage {
	By OTPImg = By.xpath("//img[@alt='One-time password']");
	By OTPHeader = By.xpath("//h1[text()=' One-time password (OTP) ']");
	By OTPWesentcode = By.xpath("//div[contains(text(), 'We sent the code to 09')]");
	By OTPExpiresin = By.xpath("//div[contains(text(), ' Code expires in ')]");
	By OTPDidntGetode = By.xpath("//span[contains(text(), 'Didn’t get the code?')]");
	By OTPResendCode = By.xpath("//button[contains(text(), ' Resend code. ')]");
	By ResendModal_Icon = By.xpath("//div[@class='col-2 tick-icon']//img");
	By ResendModal_Header = By.xpath("//div[contains(text(), 'OTP sent.')]");
	By ResendModal_Desc = By.xpath("//div[contains(text(), 'We resent your OTP!')]");

	/********************************************************************************************************************************/
	public WebElement get_ResendCode() {
		return DriverManager.getDriver().findElement(OTPResendCode);
	}

	/********************************************************************************************************************************/

	
	public boolean isElementExist(String message, String element, int waitTime) {
		boolean flag = false;

		switch (element) {
		case "OTPImg":
			flag = waitForElementVisibility(OTPImg, waitTime);
			break;
		case "OTPHeader":
			flag = waitForElementVisibility(OTPHeader, waitTime);
			break;
		case "OTPWesentcode":
			flag = waitForElementVisibility(OTPWesentcode, waitTime);
			break;
		case "OTPExpiresin":
			flag = waitForElementVisibility(OTPExpiresin, waitTime);
			break;
		case "OTPDidntGetode":
			flag = waitForElementVisibility(OTPDidntGetode, waitTime);
			break;
		case "OTPResendCode":
			flag = waitForElementVisibility(OTPResendCode, waitTime);
			break;
		case "ResendModal_Icon":
			flag = waitForElementVisibility(ResendModal_Icon, waitTime);
			break;
		case "ResendModal_Header":
			flag = waitForElementVisibility(ResendModal_Header, waitTime);
			break;
		case "ResendModal_Desc":
			flag = waitForElementVisibility(ResendModal_Desc, waitTime);
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
		case "OTPResendCode":
			flag = waitForElementClickable(OTPResendCode, waitTime);
			break;
		}
		return flag;
	}
	/********************************************************************************************************************************/
	public void clickOnElement(String type, String eleName, String ele) {

		try {
			switch (ele) {
			case "OTPResendCode":
				get_ResendCode().click();
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


}