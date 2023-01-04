package com.pages.ada;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import globeOnline_CommonMethods.DriverManager;
import junit.framework.Assert;

public class ADADAF_Page extends BasePage {
	
	//---- RONNIE SCRIPT ADA5 -----
	By ODA_Img = By.xpath("//div[@class='go_snackbar-icon']");
	By ODA_Header = By.xpath("//div[contains(text(), 'Your address is out of our delivery area')]");
	By ODA_Spiel = By.xpath("//div[contains(text(), 'Please provide a different address.')]");
	
	By OB_Img = By.xpath("//div[@class='go_notif-message-block-icon']");
	By OB_Header = By.xpath("//div[contains(text(), 'Pay the amount shown in the breakdown')]");
	By OB_Spiel = By.xpath("//p[contains(text(), 'Before we can add an additional postpaid line, please pay the amount shown in the ')]");
	By OB_ViewBreakdown = By.xpath("//a[contains(text(), 'View breakdown')]");
	
	By OBModal_Close = By.xpath("//img[contains(@src, 'cross')]");
	By OBModal_HeresBreakdown = By.xpath("//span[contains(text(), 's the breakdown: ')]");
	By OBModal_OBHeader = By.xpath("//div[contains(text(), 'Overdue Balance')]");
	By OBModal_OBPrice = By.xpath("//div[@class='ob-price-section']");
	By OBModal_OBMsg = By.xpath("//span[contains(text(), 'This is the amount from all your unpaid billing statements.')]");
	By OBModal_OBMobileNum = By.xpath("//div[@class='left-content-item']/span");
	By OBModal_OBMobileNum_Price = By.xpath("//div[@class='right-content-item']/span");
	By OBModal_OBSubTotal = By.xpath("//div[@class='d-flex flex-row overdue-bal-total-amt']/span");
	By OBModal_OBOverallTotal = By.xpath("//div[contains(@class, 'breakdown-container-total-amt')]/span");

	By AlternativeDeliveryInstruction = By.xpath("//input[@placeholder='Special delivery instructions']");
	
	//----- RONNIE SCRIPT ENDS HERE ------

	By AddressLbl = By.xpath("//span[text()='Address']");
	By rBtb_House = By.xpath("//label[text()='House']");
	By rBtn_condominium = By.xpath("//label[text()='Condominium']");
	
	By hdrForm = By.xpath("//h1[text()=' Form ']");
	By firstName = By.xpath("//input[@formcontrolname='firstName']");
	By middleName = By.xpath("//input[@formcontrolname='middleName']");
	By lastName = By.xpath("//input[@formcontrolname='lastName']");
	By email = By.xpath("//input[@formcontrolname='email']");
	By mobileNumber = By.xpath("//input[@formcontrolname='mobile']");
	
	//**************************************************************
	
	
	//*******************************************************
	By rBtn_house = By.xpath("//label[text()='House']");
	By SignalStrengthWarning = By.xpath("//div[contains(@class,'address-sub-section-flex-content')]/span");
	By houseNo = By.xpath("//input[@formcontrolname='houseNo']");
			//input[@formcontrolname='HouseNo']");
	By street = By.xpath("//input[@formcontrolname='street']");
	By village_subDivision = By.xpath("//input[@placeholder='Village / Subdivision']");
	
			//input[@formcontrolname='subDivision']");
	By subDivision = By.xpath("//input[@formcontrolname='subDivision']");
	By floor = By.xpath("//input[@formcontrolname='floor']");
			//input[@formcontrolname='FloorNo']");
	By buildingName = By.xpath("//input[@formcontrolname='buildingName']");
	By drpdwnProvince = By.xpath("//select[@formcontrolname='province']");
	By drpdwnCity = By.xpath("//select[@formcontrolname='city']");
	By drpdwnBarangay = By.xpath("//select[@formcontrolname='barangay']");
	By chkbx_acceptAll = By.xpath("//input[@formcontrolname='all']");
	By btnPay = By.xpath("//button[contains(@class,'btn-primary-custom pay-button')][1]");
	By topSectionImgXPW = By.xpath("//div[@class='top-section'] //img[@alt='Xtreme Home Prepaid WiFi']");
	By topSectionImgGHPW = By.xpath("//div[@class='top-section'] //img[@alt='Globe At Home Prepaid WiFi']");
	By topSectionImgBlackPink = By.xpath("//div[@class='top-section'] //img[@alt='Blackpink LTE Advanced with TP Link']");

	By topSectionProductName = By.xpath("//div[@class='top-section'] //div[@class='prepaid-text']/span");
	By topSectionPrice = By.xpath("//div[@class='top-section'] //div[@class='prepaid-cost']/span");
	By btnReviewBag = By.xpath("//button[text()=' Review my bag ']");
	By formPersonalInfo = By.xpath("//span[text()='Personal information']");
	
	//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
	//ASMA$x("//div[text()='Personal information']"
	By journeyDAF=By.xpath("//div[text()='Personal information']");
	By journeyDAF2=By.xpath("//div[text()='Delivery information']");
	
	By Suffix=By.xpath("//select[@formcontrolname='suffix']");
	By motherfirst_name1=By.xpath("//input[@formcontrolname='mothersFirstName']");
	By mothers_middlename=By.xpath("//input[@formcontrolname='mothersMiddleName']");
	By mothers_lastname=By.xpath("//input[@formcontrolname='mothersLastName']");

	By journeystastus1=By.xpath("//li[@class='go_stepper-progress-item go_active ng-star-inserted']");
	By planname=By.xpath("//div[@class='go_highlighted']");
			//div[text()='GPlan 599 with Device']");
	By planenamevalue=By.xpath("//div[@class='go_text-form-base-alt go_selected-plan-note ng-star-inserted']");
	By Billingaddressinfo=By.xpath("//span[text()='Billing address']");
	By Dob=By.xpath("//input[@id='dateOfBirth']");
	By NextDeliinfo=By.xpath("//button[@class='go_btn go_with-arrow go_text-base-action']");
	By NextUplodoc=By.xpath("//button[@class='go_btn go_with-arrow go_text-base-action']");
	By Toggledbtn=By.xpath("//span[@class='slider round']");
	By RecipentFname=By.xpath("//input[@formcontrolname='firstName']");
	By RecipentMname=By.xpath("//input[@formcontrolname='middleName']");
	By RecipentLname=By.xpath("//input[@formcontrolname='lastName']");
	By RecipentMobileno=By.xpath("//input[@formcontrolname='altMobile']");
	
	By Dropdown1=By.xpath("//select[@id='poidDocIDType']");
	By Dropdown2=By.xpath("//select[@id='pofcDocIDType']");
	
	By ChooseFile1=By.xpath("//input[@id='poidDocRef']");
	//following-sibling::label");
	
	By ChooseFile2=By.xpath("//input[@id='poidBackDocRef']");
	//following-sibling::label");
	
	By ChooseFile3=By.xpath("//input[@id='pofcDocRef']");
	//following-sibling::label");
			
	
	
	
	
	//####################################################################################		

	By imgGiftOption = By.xpath("//div[@formgroupname='giftOption'] //img");
	By toggleGiftOption = By.xpath("//div[@formgroupname='giftOption'] //span[@class='slider round']");
	By recipientName = By.xpath("//input[@formcontrolname='recipientName']");
	By recipientMobile = By.xpath("//input[@formcontrolname='recipientMobile']");
	By errRecipientMobile = By.xpath("//input[@formcontrolname='recipientMobile'] /../following-sibling::div/span");
	By zipCode = By.xpath("//input[@formcontrolname='zipCode']");
	By imgSameDayDelivery = By.xpath("//input[@formcontrolname='isSameDay']/../../img");
	By txtdeliveryCaveat_1 = By.xpath("//div[contains(@class,'delivery-msg-block')]/div[1]");
	By txtdeliveryCaveat_2 = By.xpath("//div[contains(@class,'delivery-msg-block')]/div[2]/p");
	By chkbxTermsConditions = By.xpath("//div[@class='terms-and-condition-wrapper'] // input[@type='checkbox']");
	By get_chkbxLabelTermsConditions = By.xpath("//div[@class='terms-and-condition-wrapper'] // input[@type='checkbox']/../../following-sibling::div //span[1]");
    By label_accept_all_terms = By.xpath("//label[text()=' I accept all Terms and Conditions. ']");
	By btnagree=By.xpath("//button[text()='Agree']");
	By btnNext=By.xpath("//button[@id='submit-document-btn']");
	
			//button[text()='Next']");
	
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


	
	
	By specialInstruction = By.xpath("//input[@formcontrolname='instruction']");
	By DeliveryInfoCTA=By.xpath("//button[text()=' Next : Delivery information ']");
	
	//Ordertracker
	By submitdocument=By.xpath("(//div[@id='submit-document-btn'])[2]");
	By BtnNextUploadDocs=By.xpath("//button[text()=' Next: upload documents ']");
	
	/*******************************************************************************/
	public WebElement get_BtnNextUploadDocs()
	{
		return DriverManager.getDriver().findElement(BtnNextUploadDocs);
		
	}
	
	public WebElement get_submitdocument()
	{
		return DriverManager.getDriver().findElement(submitdocument);
	}
	/********************************************************************************************************************************/
	public WebElement get_Suffix() {
		return DriverManager.getDriver().findElement(Suffix);
	}

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
	public WebElement get_email() {
		return DriverManager.getDriver().findElement(email);
	}
	//ASMA************************************//
	public WebElement get_dob()
	{
		return DriverManager.getDriver().findElement(Dob);
		
	}
	public WebElement get_mothersfirstname()
	{
		return DriverManager.getDriver().findElement(motherfirst_name1);
		
	}
	public WebElement get_mothersmiddlename()
	{
		return DriverManager.getDriver().findElement(mothers_middlename);
		
	}
	public WebElement get_motherslastname()
	{
		return DriverManager.getDriver().findElement(mothers_lastname);
	}
	public WebElement get_RecipentFname()
	{
		return DriverManager.getDriver().findElement(RecipentFname);
		
	}
	public WebElement get_RecipentMname()
	{
		return DriverManager.getDriver().findElement(RecipentMname);
	}
	public WebElement get_RecipentLname()
	{
		return DriverManager.getDriver().findElement(RecipentLname);
		
	}
	public WebElement get_RecipentMobileno()
	{
		return DriverManager.getDriver().findElement(RecipentMobileno);
		
	}
	public WebElement get_nextUploaddoc()
	{
		return DriverManager.getDriver().findElement(NextUplodoc);
		
	}


	/********************************************************************************************************************************/
	public WebElement get_condominium() {
		return DriverManager.getDriver().findElement(rBtn_condominium);
	}

	/********************************************************************************************************************************/
	public WebElement get_house() {
		return DriverManager.getDriver().findElement(houseNo);
	}

	/********************************************************************************************************************************/
	public WebElement get_street() {
		return DriverManager.getDriver().findElement(street);
	}

	/********************************************************************************************************************************/
	public WebElement get_village_subDivision() {
		return DriverManager.getDriver().findElement(village_subDivision);
	}

	/********************************************************************************************************************************/
	public WebElement get_floor() {
		return DriverManager.getDriver().findElement(floor);
	}

	/********************************************************************************************************************************/
	public WebElement get_buildingName() {
		return DriverManager.getDriver().findElement(buildingName);
	}

	/********************************************************************************************************************************/
	public WebElement get_subDivision() {
		return DriverManager.getDriver().findElement(village_subDivision);
	}
	
	// asma******************************************
	public void  Select_Suffix(String option)
	{
		Select s=new Select(DriverManager.getDriver().findElement(Suffix));
		s.selectByValue(option);
	}
	/**
	 * @return *******************************************************************/
	public WebElement Togglebtn_select()
	{
		return DriverManager.getDriver().findElement(Toggledbtn);
		
		
	}
	/**************************************************/
	
	/***ASMA*****************************************************************/
	public void Select_dropdown(String option)
	{
		Select s = new Select(DriverManager.getDriver().findElement(Dropdown1));
		s.selectByValue(option);
	} 
	/********************************************************************/
	public boolean DropDownDisplay1()
	{
		return DriverManager.getDriver().findElement(Dropdown1).isDisplayed();
		
	}
	/****************************************************************/
	public boolean DropDownDisplay2()
	{
		return DriverManager.getDriver().findElement(Dropdown2).isDisplayed();
		
	}
	/*******************************************************************/
	public void Select_dropdown2(String option)
	{
		Select s = new Select(DriverManager.getDriver().findElement(Dropdown2));
		s.selectByValue(option);
	} 

	
	 
	 

	/********************************************************************************************************************************/
	public void select_province(String option) {
		Select s = new Select(DriverManager.getDriver().findElement(drpdwnProvince));
		s.selectByValue(option);
	}

	/********************************************************************************************************************************/
	public void select_city(String option) {
		Select s = new Select(DriverManager.getDriver().findElement(drpdwnCity));
		s.selectByValue(option);
	}

	/********************************************************************************************************************************/
	public void select_barangay(String option) {
		Select s = new Select(DriverManager.getDriver().findElement(drpdwnBarangay));
		s.selectByValue(option);
	}

	/********************************************************************************************************************************/
	public WebElement get_checkbox_acceptAll() {
		return DriverManager.getDriver().findElement(chkbx_acceptAll);
	}

	/********************************************************************************************************************************/
	public WebElement get_btnPay() {
		return DriverManager.getDriver().findElement(btnPay);
	}

	/********************************************************************************************************************************/
	public WebElement get_reviewBag() {
		return DriverManager.getDriver().findElement(btnReviewBag);
	}

	/********************************************************************************************************************************/
	public WebElement get_toggleGiftOption() {
		return DriverManager.getDriver().findElement(toggleGiftOption);
	}

	/********************************************************************************************************************************/
	public WebElement get_recipientName() {
		return DriverManager.getDriver().findElement(recipientName);
	}

	/********************************************************************************************************************************/
	public WebElement get_recipientMobile() {
		return DriverManager.getDriver().findElement(recipientMobile);
	}

	/********************************************************************************************************************************/
	public List<WebElement> get_SignalStrengthWarning() {
		return DriverManager.getDriver().findElements(SignalStrengthWarning);
	}

	/********************************************************************************************************************************/
	public WebElement get_ImgGiftOption() {
		return DriverManager.getDriver().findElement(imgGiftOption);
	}

	/********************************************************************************************************************************/
	public WebElement get_zipCode() {
		return DriverManager.getDriver().findElement(zipCode);
	}

	/********************************************************************************************************************************/
	public List<WebElement> get_chkbxTermsConditions() {
		return DriverManager.getDriver().findElements(chkbxTermsConditions);
	}

	/********************************************************************************************************************************/
	public List<WebElement> get_chkbxLabelTermsConditions() {
		return DriverManager.getDriver().findElements(get_chkbxLabelTermsConditions);
	}

	/********************************************************************************************************************************/
	public List<WebElement> get_topSectionProductsName() {
		return DriverManager.getDriver().findElements(topSectionProductName);
	}

	/********************************************************************************************************************************/
	public List<WebElement> get_topSectionProductsPrice() {
		return DriverManager.getDriver().findElements(topSectionPrice);
	}

	/********************************************************************************************************************************/
	public WebElement get_nextdelivery()
	{
		return DriverManager.getDriver().findElement(NextDeliinfo);
	}
	/********************************************************************************************************************************/

	public WebElement get_specialInstruction() {
		return DriverManager.getDriver().findElement(specialInstruction);
	}

	/********************************************************************************************************************************/
	public WebElement get_radioBtnHouse() {
		return DriverManager.getDriver().findElement(rBtn_house);
	}
	
	/********************************************************************************************************************************/
	public WebElement get_label_accept_all_terms() {
		return DriverManager.getDriver().findElement(label_accept_all_terms);
	}

	/********************************************************************************************************************************/
	public WebElement get_btnagree()
	{
		return DriverManager.getDriver().findElement(btnagree);
		
		
	}
	
	/********************************************************************************************************************************/

	public WebElement get_DeliveryInfoCTA() {
		return DriverManager.getDriver().findElement(NextDeliinfo);
	}
	/*******************************************************************************/
	public WebElement get_next()
	{
		return DriverManager.getDriver().findElement(btnNext);
		
	}
	/*********************************************************************************/
	public WebElement Choosefile2Click()
	{
		return DriverManager.getDriver().findElement(ChooseFile2);
		
	}
	/****************************************************************/
	public WebElement Choosefile3Click()
	{
		return DriverManager.getDriver().findElement(ChooseFile3);
		
	}
	/*********************************************************************/
	public boolean isClickable(String element, int waitTime) {

		boolean flag = false;

		switch (element) {
		case "rBtn_condominium":
			flag = waitForElementClickable(rBtn_condominium, waitTime);
			break;
		case "btnNext":
			flag = waitForElementClickable(btnNext, waitTime);
			break;
		case "Pay":
			flag = waitForElementClickable(btnPay, waitTime);
			break;
		case "reviewBag":
			flag = waitForElementClickable(btnReviewBag, waitTime);
			break;
		case "toggleGiftOption":
			flag = waitForElementClickable(toggleGiftOption, waitTime);
			break;
		case "DeliveryInfoCTA":
			flag=waitForElementClickable(DeliveryInfoCTA, waitTime);
			break;
		case "NextDeliinfo":
			flag=waitForElementClickable(NextDeliinfo, waitTime);
			break;
		case "NextUplodoc":
			flag=waitForElementClickable(NextUplodoc, waitTime);
			break;
		case "ChooseFile1":
			flag=waitForElementClickable(ChooseFile1, waitTime);
			break;
		case "ChooseFile2":
			flag=waitForElementClickable(ChooseFile2, waitTime);
			break;
		case "ChooseFile3":
			flag=waitForElementClickable(ChooseFile3, waitTime);
			break;
		

			

		}
		return flag;
	}

	/********************************************************************************************************************************/
	public void javascript_clickCondominium() {
		WebElement ele = DriverManager.getDriver().findElement(rBtn_condominium);
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("arguments[0].click();", ele);

	}

	/********************************************************************************************************************************/
	public void javascript_clickRadioBtn_House() {
		WebElement ele = DriverManager.getDriver().findElement(rBtn_house);
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("arguments[0].click();", ele);

	}
	
	/**************************************************************************************************/
	
	//----- RONNIE SCRIPT STARTS HERE -----
	/********************************************************************************************************************************/
	public WebElement OB_ViewBreakdown() {
		return DriverManager.getDriver().findElement(OB_ViewBreakdown);
	}
	/********************************************************************************************************************************/
	public WebElement get_OBModal_Close() {
		return DriverManager.getDriver().findElement(OBModal_Close);
	}
	/********************************************************************************************************************************/
	public WebElement get_OBModal_OBPrice() {
		return DriverManager.getDriver().findElement(OBModal_OBPrice);
	}
	public WebElement get_AlternativeDeliveryInstruction() {
		return DriverManager.getDriver().findElement(AlternativeDeliveryInstruction);
	}
	
	//----- RONNIE SCRIPT ENDS HERE -----
	
	/********************************************************************************************************************************/
	public boolean isElementExist(String message, String element, int waitTime) {
		boolean flag = false;
		switch (element) {
		
		//---- RONNIE SCRIPT ADA5 -----
		case "ODA_Img":
			flag = waitForElementVisibility(ODA_Img, waitTime);
			break;
		case "ODA_Header":
			flag = waitForElementVisibility(ODA_Header, waitTime);
			break;
		case "ODA_Spiel":
			flag = waitForElementVisibility(ODA_Spiel, waitTime);
			break;
		
		case "OB_Img":
			flag = waitForElementVisibility(OB_Img, waitTime);
			break;
		case "OB_Header":
			flag = waitForElementVisibility(OB_Header, waitTime);
			break;
		case "OB_Spiel":
			flag = waitForElementVisibility(OB_Spiel, waitTime);
			break;
		case "OB_ViewBreakdown":
			flag = waitForElementVisibility(OB_ViewBreakdown, waitTime);
			break;
		case "OBModal_Close":
			flag = waitForElementVisibility(OBModal_Close, waitTime);
			break;
		case "OBModal_HeresBreakdown":
			flag = waitForElementVisibility(OBModal_HeresBreakdown, waitTime);
			break;
		case "OBModal_OBHeader":
			flag = waitForElementVisibility(OBModal_OBHeader, waitTime);
			break;
		case "OBModal_OBPrice":
			flag = waitForElementVisibility(OBModal_OBPrice, waitTime);
			break;
		case "OBModal_OBMsg":
			flag = waitForElementVisibility(OBModal_OBMsg, waitTime);
			break;
		case "OBModal_OBMobileNum":
			flag = waitForElementVisibility(OBModal_OBMobileNum, waitTime);
			break;
		case "OBModal_OBMobileNum_Price":
			flag = waitForElementVisibility(OBModal_OBMobileNum_Price, waitTime);
			break;
		case "OBModal_OBSubTotal":
			flag = waitForElementVisibility(OBModal_OBSubTotal, waitTime);
			break;
		case "OBModal_OBOverallTotal":
			flag = waitForElementVisibility(OBModal_OBOverallTotal, waitTime);
			break;
		
		//----- RONNIE SCRIPT END HERE ------
		
		
		case "chkbx_acceptAll":
			flag = waitForElementVisibility(chkbx_acceptAll, waitTime);
			break;
		case "hdrForm":
			flag = waitForElementVisibility(hdrForm, waitTime);
			break;
		case "topSectionImgXPW":
			flag = waitForElementVisibility(topSectionImgXPW, waitTime);
			break;
		case "topSectionImgGHPW":
			flag = waitForElementVisibility(topSectionImgGHPW, waitTime);
			break;
		case "formPersonalInfo":
			flag = waitForElementVisibility(formPersonalInfo, waitTime);
			break;
			//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&ASMA
		case "journeyDAF":
			flag = waitForElementVisibility(journeyDAF, waitTime);
			break;
		case "journeyDAF2":
			flag = waitForElementVisibility(journeyDAF2, waitTime);
			break;
		case "journeystastus1":
			flag = waitForElementVisibility(journeystastus1, waitTime);
			break;
			
		case "planname":
			flag = waitForElementVisibility(planname, waitTime);
			break;
		case "Billingaddressinfo":
			flag = waitForElementVisibility(Billingaddressinfo, waitTime);
			break;
		case "NextUplodoc":
			flag = waitForElementVisibility(NextUplodoc, waitTime);
			break;
		case "Dropdown1":
			flag = waitForElementVisibility(Dropdown1, waitTime);
			break;
		case "Dropdown2":
			flag = waitForElementVisibility(Dropdown2, waitTime);
			break;
			
			
			
			

		//$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$	
			
		case "errRecipientMobile":
			flag = waitForElementVisibility(errRecipientMobile, waitTime);
			break;
		case "specialInstruction":
			flag = waitForElementVisibility(specialInstruction, waitTime);
			break;
		case "topSectionImgBlackPink":
			flag = waitForElementVisibility(topSectionImgBlackPink, waitTime);
			break;
		case "AddressLbl":
			flag = waitForElementVisibility(AddressLbl, waitTime);
			break;
		case "rBtb_House":
			flag = waitForElementVisibility(rBtb_House, waitTime);
			break;
		case "rBtn_condominium":
			flag = waitForElementVisibility(rBtn_condominium, waitTime);
			break;
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
		case "Mandatory_Province":
			flag = waitForElementVisibility(Mandatory_Province, waitTime);
			break;
		case "Mandatory_City":
			flag = waitForElementVisibility(Mandatory_City, waitTime);
			break;
		case "Mandatory_Brgy":
			flag = waitForElementVisibility(Mandatory_Brgy, waitTime);
			break;
		case "Mandatory_zip":
			flag = waitForElementVisibility(Mandatory_zip, waitTime);
			break;
		case "DeliveryInfoCTA":
			flag = waitForElementVisibility(DeliveryInfoCTA, waitTime);
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
	public String getText(String ele) {
		String text = "";

		try {
			switch (ele) {
			case "topSectionProductName":
				text = DriverManager.getDriver().findElement(topSectionProductName).getText();
				break;
			case "topSectionPrice":
				text = DriverManager.getDriver().findElement(topSectionPrice).getText();
				break;
			case "errRecipientMobile":
				text = DriverManager.getDriver().findElement(errRecipientMobile).getText();
				break;
			case "txtdeliveryCaveat_1":
				text = DriverManager.getDriver().findElement(txtdeliveryCaveat_1).getText();
				break;
			case "txtdeliveryCaveat_2":
				text = DriverManager.getDriver().findElement(txtdeliveryCaveat_2).getText();
				break;
			case "firstName":
				text = DriverManager.getDriver().findElement(firstName).getText();
				break;
			case "middleName":
				text = DriverManager.getDriver().findElement(middleName).getText();
				break;
			case "lastName":
				text = DriverManager.getDriver().findElement(lastName).getText();
				break;
			case "email":
				text = DriverManager.getDriver().findElement(email).getText();
				break;
			case "mobileNumber":
				text = DriverManager.getDriver().findElement(mobileNumber).getText();
				break;
			case "houseNo":
				text = DriverManager.getDriver().findElement(houseNo).getText();
				break;
			case "street":
				text = DriverManager.getDriver().findElement(street).getText();
				break;
			case "village_subDivision":
				text = DriverManager.getDriver().findElement(village_subDivision).getText();
				break;
			case "drpdwnProvince":
				text = DriverManager.getDriver().findElement(drpdwnProvince).getText();
				break;
			case "drpdwnCity":
				text = DriverManager.getDriver().findElement(drpdwnCity).getText();
				break;
			case "drpdwnBarangay":
				text = DriverManager.getDriver().findElement(drpdwnBarangay).getText();
				break;
			case "zipCode":
				text = DriverManager.getDriver().findElement(zipCode).getText();
				break;
			case "specialInstruction":
				text = DriverManager.getDriver().findElement(specialInstruction).getText();
				break;
			case "Suffix":
				text = DriverManager.getDriver().findElement(Suffix).getText();
				break;
			case "motherfirst_name1":
				text = DriverManager.getDriver().findElement(motherfirst_name1).getText();
				break;
			case "mothers_middlename":
				text = DriverManager.getDriver().findElement(mothers_middlename).getText();
				break;
			case "mothers_lastname":
				text = DriverManager.getDriver().findElement(mothers_lastname).getText();
				break;
			case "RecipentFname":
				text = DriverManager.getDriver().findElement(RecipentFname).getText();
				break;
			case "RecipentMname":
				text = DriverManager.getDriver().findElement(RecipentMname).getText();
				break;
			case "RecipentLname":
				text = DriverManager.getDriver().findElement(RecipentLname).getText();
				break;
			case "RecipentMobileno":
				text = DriverManager.getDriver().findElement(RecipentMobileno).getText();
				break;
				


			}

		} catch (NoSuchElementException e) {
			System.out.println("Element : " + ele.toString() + " : " + "not found : " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Method : getText - Error : " + e.getMessage());
		}

		return text;
	}

	/****************************************************************/
	public void moveToElement(String element) {

		WebElement ele = null;
		
		switch (element) {
		case "ODA_Img":
			ele = DriverManager.getDriver().findElement(ODA_Img);
			break;
		case "Mandatory_Fname":
			ele = DriverManager.getDriver().findElement(Mandatory_Fname);
			break;
		case "Mandatory_House":
			ele = DriverManager.getDriver().findElement(Mandatory_House);
			break;
		}	

		try {
			Actions a = new Actions(DriverManager.getDriver());
			Thread.sleep(500L);
			a.moveToElement(ele).build().perform();
		} catch (Exception e) {

		}
	}

	public void js_clickOnElement(String type, String eleName, String ele) {

		try {
			JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
            
			
			switch (ele) {
			case "NextDeliinfo":
				js.executeScript("arguments[0].click();", get_nextdelivery());
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
	
	//---- RONNI SCRIPT ADA5 ENDS here-----
	
	
	/********************************************************************************************************************************/
	public void clickOnElement(String type, String eleName, String ele) {

		try {
			switch (ele) {
			// ----- RONNIE SCRIPT ADA5 STARTS HERE -----
			case "OB_ViewBreakdown":
				OB_ViewBreakdown().click();
				break;
			case "OBModal_Close":
				get_OBModal_Close().click();
				break;
			case "OBModal_OBPrice":
				get_OBModal_OBPrice().click();
				break;
			// ----- RONNIE SCRIPT ENDS HERE -----
				
				
			case "reviewBag":
				get_reviewBag().click();
				break;
			case "ChooseFile1":
				Choosefile1Click().click();
				break;
			case "ChooseFile2":
				Choosefile2Click().click();
				break;
			case "ChooseFile3":
				Choosefile3Click().click();
				break;
			case "chboxterms":
				get_label_accept_all_terms().click();
				break;
			case "btnagre":
				get_btnagree().click();
				break;
							
			case "btnnext":
				get_next().click();
				break;
			case "NextUplodoc":
				get_nextUploaddoc().click();
				break;
			case "NextDeliinfo":
				get_nextdelivery().click();
				break;
			case "Toggledbtn":
				Togglebtn_select().click();
				break;
			case "DeliveryInfoCTA":
				get_DeliveryInfoCTA().click();
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
	public String getAttributeValue(String ele, String attribute) {
		String text = "";

		try {
			switch (ele) {
			case "imgGiftOption":
				text = DriverManager.getDriver().findElement(imgGiftOption).getAttribute(attribute);
				break;
			case "imgSameDayDelivery":
				text = DriverManager.getDriver().findElement(imgSameDayDelivery).getAttribute(attribute);
				break;
			case "mobileNumber":
				text = DriverManager.getDriver().findElement(mobileNumber).getAttribute(attribute);
				break;
				
			case "firstName":
				text = DriverManager.getDriver().findElement(firstName).getAttribute(attribute);
				break;
			case "middleName":
				text = DriverManager.getDriver().findElement(middleName).getAttribute(attribute);
				break;
			case "lastName":
				text = DriverManager.getDriver().findElement(lastName).getAttribute(attribute);
				break;
			case "email":
				text = DriverManager.getDriver().findElement(email).getAttribute(attribute);
				break;
			case "houseNo":
				text = DriverManager.getDriver().findElement(houseNo).getAttribute(attribute);
				break;
			case "street":
				text = DriverManager.getDriver().findElement(street).getAttribute(attribute);
				break;
			case "village_subDivision":
				text = DriverManager.getDriver().findElement(village_subDivision).getAttribute(attribute);
				break;
			case "drpdwnProvince":
				text = DriverManager.getDriver().findElement(drpdwnProvince).getAttribute(attribute);
				break;
			case "drpdwnCity":
				text = DriverManager.getDriver().findElement(drpdwnCity).getAttribute(attribute);
				break;
			case "drpdwnBarangay":
				text = DriverManager.getDriver().findElement(drpdwnBarangay).getAttribute(attribute);
				break;
			case "zipCode":
				text = DriverManager.getDriver().findElement(zipCode).getAttribute(attribute);
				break;
			case "specialInstruction":
				text = DriverManager.getDriver().findElement(specialInstruction).getAttribute(attribute);
				break;
			case "Suffix":
				text = DriverManager.getDriver().findElement(Suffix).getAttribute(attribute);
				break;
			case "motherfirst_name1":
					text = DriverManager.getDriver().findElement(motherfirst_name1).getAttribute(attribute);
					break;
			case "mothers_middlename":
				text = DriverManager.getDriver().findElement(mothers_middlename).getAttribute(attribute);
				break;
			
			case "mothers_lastname":
				text = DriverManager.getDriver().findElement(mothers_lastname).getAttribute(attribute);
				break;
			case "RecipentFname":
				text = DriverManager.getDriver().findElement(RecipentFname).getAttribute(attribute);
				break;
			case "RecipentMname":
					text = DriverManager.getDriver().findElement(RecipentMname).getAttribute(attribute);
					break;
			case "RecipentLname":
				text = DriverManager.getDriver().findElement(RecipentLname).getAttribute(attribute);
				break;
			
			case "RecipentMobileno":
				text = DriverManager.getDriver().findElement(RecipentMobileno).getAttribute(attribute);
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
	public boolean check_AttirbuteNotEmpty(String eleName, String attribute, int waitTime) {

		boolean success = false;

		switch (eleName) {
		case "imgGiftOption":
			success = waitForElementAttributeToBeNotEmpty(imgGiftOption, "src", 10);
			break;
		case "imgSameDayDelivery":
			success = waitForElementAttributeToBeNotEmpty(imgSameDayDelivery, "src", 10);
			break;
		}

		return success;
	}

	public WebElement Choosefile1Click() {
		
		 return DriverManager.getDriver().findElement(ChooseFile1);
	}


}
