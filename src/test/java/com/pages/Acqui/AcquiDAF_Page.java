package com.pages.Acqui;

import java.util.NoSuchElementException;


import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.pages.Acqui.BasePage;

import globeOnline_CommonMethods.DriverManager;
import junit.framework.Assert;

public class AcquiDAF_Page extends BasePage {
	
	
	By Mandatory_Fname = By.xpath("(//label[contains(text(), 'First Name')]/span[contains(text(), '*')])[1]");
	By Mandatory_Mname = By.xpath("(//label[contains(text(), 'Middle Name')]/span[contains(text(), '*')])[1]");
	By Mandatory_LName = By.xpath("//label[contains(text(), 'Last Name')]/span[contains(text(), '*')]");
	By Mandatory_Email = By.xpath("//label[contains(text(), 'Email Address')]/span[contains(text(), '*')]");
	By Mandatory_Birthday = By.xpath("//label[contains(text(), 'Birthday')]//span[contains(text(), '*')]");
	By Mandatory_MFName = By.xpath("//label[contains(text(), 's First Name ')]//span[contains(text(), '*')]");
	By Mandatory_MMName = By.xpath("//label[contains(text(), 'Maiden Middle Name ')]//span[contains(text(), '*')]");
	By Mandatory_MLName = By.xpath("//label[contains(text(), 'Maiden Last Name ')]//span[contains(text(), '*')]");
	By Mandatory_House = By.xpath("//label[contains(text(), 'House ')]//span[contains(text(), '*')]");
	By Mandatory_Street = By.xpath("//label[contains(text(), 'Street')]//span[contains(text(), '*')]");
	By Mandatory_Province = By.xpath("//label[contains(text(), 'Province')]//span[contains(text(), '*')]");
	By Mandatory_City = By.xpath("//label[contains(text(), 'City')]//span[contains(text(), '*')]");
	By Mandatory_Brgy = By.xpath("//label[contains(text(), 'Barangay')]//span[contains(text(), '*')]");
	By Mandatory_zip = By.xpath("//label[contains(text(), 'ZIP')]//span[contains(text(), '*')]");
	
	By personalInformation = By.xpath("//h1[text()=' Acquisition - Personal Information ']");
	By confirmDetails = By.xpath("//span[text()='Confirm details']");
	By firstName = By.xpath("//input[@placeholder='First Name']");
	By middleName = By.xpath("//input[@placeholder='Middle Name']");
	By lastName = By.xpath("//input[@placeholder='Last Name']");
	By mobileNumber = By.xpath("//input[@placeholder='Mobile Number']");
	By emailAddress = By.xpath("//input[@placeholder='Email Address']");
	By birthday = By.xpath("//input[@placeholder='Birthday']");
	By motherFirstName = By.xpath("//label[contains(text(), 's First Name ')]//parent::div//input");
	By motherMaidenMiddleName = By.xpath("//label[contains(text(), 's Maiden Middle Name ')]//parent::div//input");
	By motherMaidenLastName = By.xpath("//label[contains(text(), 's Maiden Last Name ')]//parent::div//input");
	
	
	By billingAddress = By.xpath("//span[text()='Billing address']");
	By house = By.xpath("//label[text()='House']//parent::div//input[@type='radio']");
	By condominium = By.xpath("//label[text()='Condominium']//parent::div//input[@type='radio']");
	By houseNo = By.xpath("//input[@placeholder='House no.']");
	By Street = By.xpath("//input[@placeholder='Street']");
	By Village = By.xpath("//input[@placeholder='Village / Subdivision']");
	By province = By.xpath("//select[@formcontrolname='province']");
	By city = By.xpath("//select[@formcontrolname='city']");
	By barangay = By.xpath("//select[@formcontrolname='barangay']");
	By ZIPcode = By.xpath("//input[@formcontrolname='zipCode']");
	By NextDeliveryInformation = By.xpath("//button[text()=' Next : Delivery information ']");
	
	
	By AcquisitionDeliveryInformation = By.xpath("//h1[text()=' Acquisition - Delivery Information  ']");
	By remainder = By.xpath("//span[contains(text(), 'Delivery for pre-orders and reservations is subject to device availability')]");
	By shippingAddressIsSameAsBilling = By.xpath("//span[text()='My shipping address is the same as my billing address.']");
	By slider = By.xpath("//span[@class='slider round']");
	
	
	By alternateAndRecipient = By.xpath("//span[text()='Alternate recipient and contact details (optional)']");
	By RecipentFname=By.xpath("//input[@formcontrolname='firstName']");
	By RecipentMname=By.xpath("//input[@formcontrolname='middleName']");
	By RecipentLname=By.xpath("//input[@formcontrolname='lastName']");
	By RecipentMobileno=By.xpath("//input[@formcontrolname='altMobile']");
	By NextUploadDoc=By.xpath("//button[@class='go_btn go_with-arrow go_text-base-action']");

	

	By AcquisitionUploadDocuments = By.xpath("//h1[text()=' Acquisition - Upload Documents ']");
	By ProofOfIdentification = By.xpath("//div[text()='Proof of Identification']");
	By ProofOfFinancialCapacity = By.xpath("//div[text()='Proof of Financial Capacity']");
	By POIDDropdown=By.xpath("//select[@id='poidDocIDType']");
	By POFCDropdown=By.xpath("//select[@id='pofcDocIDType']");
    By acceptAllTerms = By.xpath("//label[text()=' I accept all Terms and Conditions. ']");
	By btnAgree=By.xpath("//button[text()='Agree']");
	By btnNext=By.xpath("//button[@id='submit-document-btn']");







	


	
	
	










	
	
	
	/********************************************************************************************************************************/
	public WebElement get_firstName() {
		return DriverManager.getDriver().findElement(firstName);
	}

	/********************************************************************************************************************************/
	public WebElement get_middleName() {
		return DriverManager.getDriver().findElement(middleName);
	}

	/********************************************************************************************************************************/
	public WebElement get_lastName() {
		return DriverManager.getDriver().findElement(lastName);
	}

	/********************************************************************************************************************************/
	public WebElement get_mobileNumber() {
		return DriverManager.getDriver().findElement(mobileNumber);
	}

	/********************************************************************************************************************************/
	public WebElement get_emailAddress() {
		return DriverManager.getDriver().findElement(emailAddress);
	}

	/********************************************************************************************************************************/
	public WebElement get_birthday() {
		return DriverManager.getDriver().findElement(birthday);
	}

	/********************************************************************************************************************************/
	public WebElement get_motherFirstName() {
		return DriverManager.getDriver().findElement(motherFirstName);
	}

	/********************************************************************************************************************************/
	public WebElement get_motherMaidenMiddleName() {
		return DriverManager.getDriver().findElement(motherMaidenMiddleName);
	}

	/********************************************************************************************************************************/
	public WebElement get_motherMaidenLastName() {
		return DriverManager.getDriver().findElement(motherMaidenLastName);
	}

	/********************************************************************************************************************************/
	public WebElement get_house() {
		return DriverManager.getDriver().findElement(house);
	}

	/********************************************************************************************************************************/
	public WebElement get_ZIPcode() {
		return DriverManager.getDriver().findElement(ZIPcode);
	}

	/********************************************************************************************************************************/
	public WebElement get_condominium() {
		return DriverManager.getDriver().findElement(condominium);
	}

	/********************************************************************************************************************************/
	public WebElement get_houseNo() {
		return DriverManager.getDriver().findElement(houseNo);
	}

	/********************************************************************************************************************************/
	public WebElement get_Street() {
		return DriverManager.getDriver().findElement(Street);
	}
	/********************************************************************************************************************************/
	public WebElement get_Village() {
		return DriverManager.getDriver().findElement(Village);
	}

	/********************************************************************************************************************************/
	public void select_province(String option) {
		Select s = new Select(DriverManager.getDriver().findElement(province));
		s.selectByValue(option);
	}
	/********************************************************************************************************************************/
	public void select_city(String option) {
		Select s = new Select(DriverManager.getDriver().findElement(city));
		s.selectByValue(option);
	}

	/********************************************************************************************************************************/
	public void select_barangay(String option) {
		Select s = new Select(DriverManager.getDriver().findElement(barangay));
		s.selectByValue(option);
	}

	/********************************************************************************************************************************/
	public WebElement get_NextDeliveryInformation() {
		return DriverManager.getDriver().findElement(NextDeliveryInformation);
	}
	/********************************************************************************************************************************/
	public void javascript_clickCondominium() {
		WebElement ele = DriverManager.getDriver().findElement(condominium);
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("arguments[0].click();", ele);

	}
	/********************************************************************************************************************************/
	public void javascript_clickRadioBtn_House() {
		WebElement ele = DriverManager.getDriver().findElement(house);
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("arguments[0].click();", ele);

	}
	/********************************************************************************************************************************/
	public WebElement get_slider() {
		return DriverManager.getDriver().findElement(slider);
	}
	/********************************************************************************************************************************/
	public WebElement get_RecipentFname() {
		return DriverManager.getDriver().findElement(RecipentFname);
	}
	/********************************************************************************************************************************/
	public WebElement get_RecipentMname() {
		return DriverManager.getDriver().findElement(RecipentMname);
	}
	/********************************************************************************************************************************/
	public WebElement get_RecipentLname() {
		return DriverManager.getDriver().findElement(RecipentLname);
	}
	/********************************************************************************************************************************/
	public WebElement get_RecipentMobileno() {
		return DriverManager.getDriver().findElement(RecipentMobileno);
	}
	/********************************************************************************************************************************/
	public WebElement get_NextUploadDoc() {
		return DriverManager.getDriver().findElement(NextUploadDoc);
	}
	/********************************************************************************************************************************/
	public void Select_POIDDropdown(String option)
	{
		Select s = new Select(DriverManager.getDriver().findElement(POIDDropdown));
		s.selectByValue(option);
	} 
	/********************************************************************************************************************************/	
	public void Select_POFCDropdown(String option)
	{
		Select s = new Select(DriverManager.getDriver().findElement(POFCDropdown));
		s.selectByValue(option);
	} 
	/********************************************************************************************************************************/
	public WebElement get_acceptAllTerms() {
		return DriverManager.getDriver().findElement(acceptAllTerms);
	}
	/********************************************************************************************************************************/
	public WebElement get_btnAgree() {
		return DriverManager.getDriver().findElement(btnAgree);
	}
	/********************************************************************************************************************************/
	public WebElement get_btnNext() {
		return DriverManager.getDriver().findElement(btnNext);
	}
	/********************************************************************************************************************************/




	
	public boolean isElementExist(String message, String element, int waitTime) {
		boolean flag = false;

		switch (element) {
		case "Mandatory_Fname":
			flag = waitForElementVisibility(Mandatory_Fname, waitTime);
			break;
		case "Mandatory_Mname":
			flag = waitForElementVisibility(Mandatory_Mname, waitTime);
			break;
		case "Mandatory_LName":
			flag = waitForElementVisibility(Mandatory_LName, waitTime);
			break;
		case "Mandatory_Email":
			flag = waitForElementVisibility(Mandatory_Email, waitTime);
			break;
		case "Mandatory_Birthday":
			flag = waitForElementVisibility(Mandatory_Birthday, waitTime);
			break;
		case "Mandatory_MFName":
			flag = waitForElementVisibility(Mandatory_MFName, waitTime);
			break;
		case "Mandatory_MMName":
			flag = waitForElementVisibility(Mandatory_MMName, waitTime);
			break;
		case "Mandatory_MLName":
			flag = waitForElementVisibility(Mandatory_MLName, waitTime);
			break;
		case "Mandatory_House":
			flag = waitForElementVisibility(Mandatory_House, waitTime);
			break;
		case "Mandatory_Street":
			flag = waitForElementVisibility(Mandatory_Street, waitTime);
			break;
		case "Mandatory_City":
			flag = waitForElementVisibility(Mandatory_City, waitTime);
			break;
		case "Mandatory_Province":
			flag = waitForElementVisibility(Mandatory_Province, waitTime);
			break;
		case "Mandatory_zip":
			flag = waitForElementVisibility(Mandatory_zip, waitTime);
			break;
		case "Mandatory_Brgy":
			flag = waitForElementVisibility(Mandatory_Brgy, waitTime);
			break;	
		case "personalInformation":
			flag = waitForElementVisibility(personalInformation, waitTime);
			break;
		case "confirmDetails":
			flag = waitForElementVisibility(confirmDetails, waitTime);
			break;
		case "firstName":
			flag = waitForElementVisibility(firstName, waitTime);
			break;
		case "middleName":
			flag = waitForElementVisibility(middleName, waitTime);
			break;
		case "lastName":
			flag = waitForElementVisibility(lastName, waitTime);
			break;
		case "birthday":
			flag = waitForElementVisibility(birthday, waitTime);
			break;
		case "emailAddress":
			flag = waitForElementVisibility(emailAddress, waitTime);
			break;
		case "motherFirstName":
			flag = waitForElementVisibility(motherFirstName, waitTime);
			break;
		case "motherMaidenMiddleName":
			flag = waitForElementVisibility(motherMaidenMiddleName, waitTime);
			break;
		case "motherMaidenLastName":
			flag = waitForElementVisibility(motherMaidenLastName, waitTime);
			break;
		case "mobileNumber":
			flag = waitForElementVisibility(mobileNumber, waitTime);
			break;
		case "billingAddress":
			flag = waitForElementVisibility(billingAddress, waitTime);
			break;
		case "house":
			flag = waitForElementVisibility(house, waitTime);
			break;
		case "condominium":
			flag = waitForElementVisibility(condominium, waitTime);
			break;
		case "houseNo":
			flag = waitForElementVisibility(houseNo, waitTime);
			break;
		case "Street":
			flag = waitForElementVisibility(Street, waitTime);
			break;
		case "Village":
			flag = waitForElementVisibility(Village, waitTime);
			break;
		case "province":
			flag = waitForElementVisibility(province, waitTime);
			break;
		case "city":
			flag = waitForElementVisibility(city, waitTime);
			break;
		case "barangay":
			flag = waitForElementVisibility(barangay, waitTime);
			break;
		case "ZIPcode":
			flag = waitForElementVisibility(ZIPcode, waitTime);
			break;
		case "slider":
			flag = waitForElementVisibility(slider, waitTime);
			break;	
		case "NextDeliveryInformation":
			flag = waitForElementVisibility(NextDeliveryInformation, waitTime);
			break;	
		case "remainder":
			flag = waitForElementVisibility(remainder, waitTime);
			break;	
		case "shippingAddressIsSameAsBilling":
			flag = waitForElementVisibility(shippingAddressIsSameAsBilling, waitTime);
			break;	
		case "AcquisitionDeliveryInformation":
			flag = waitForElementVisibility(AcquisitionDeliveryInformation, waitTime);
			break;
		case "alternateAndRecipient":
			flag = waitForElementVisibility(alternateAndRecipient, waitTime);
			break;	
		case "acceptAllTerms":
			flag = waitForElementVisibility(acceptAllTerms, waitTime);
			break;
		case "btnAgree":
			flag = waitForElementVisibility(btnAgree, waitTime);
			break;
		case "btnNext":
			flag = waitForElementVisibility(btnNext, waitTime);
			break;
		case "AcquisitionUploadDocuments":
			flag = waitForElementVisibility(AcquisitionUploadDocuments, waitTime);
			break;
		case "ProofOfIdentification":
			flag = waitForElementVisibility(ProofOfIdentification, waitTime);
			break;
		case "ProofOfFinancialCapacity":
			flag = waitForElementVisibility(ProofOfFinancialCapacity, waitTime);
			break;
		case "POIDDropdown":
			flag = waitForElementVisibility(POIDDropdown, waitTime);
			break;
		case "POFCDropdown":
			flag = waitForElementVisibility(POFCDropdown, waitTime);
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
			case "house":
		         jse.executeScript("arguments[0].click();", get_house());		
		         break;
			case "condominium":
		         jse.executeScript("arguments[0].click();", get_condominium());		
		         break;
			case "NextDeliveryInformation":
		         jse.executeScript("arguments[0].click();", get_NextDeliveryInformation());		
		         break;
			case "slider":
		         jse.executeScript("arguments[0].click();", get_slider());		
		         break;
			case "NextUploadDoc":
		         jse.executeScript("arguments[0].click();", get_NextUploadDoc());		
		         break;
			case "acceptAllTerms":
		         jse.executeScript("arguments[0].click();", get_acceptAllTerms());		
		         break;
			case "btnAgree":
		         jse.executeScript("arguments[0].click();", get_btnAgree());		
		         break;
			case "btnNext":
		         jse.executeScript("arguments[0].click();", get_btnNext());		
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