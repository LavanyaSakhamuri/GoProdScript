package com.pages.Acqui;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.pages.Acqui.BasePage;

import globeOnline_CommonMethods.DriverManager;

public class ResAcquiSurveyPage extends BasePage {
	
	By surveyForm = By.xpath("//div[@id='feedback-block'] //div[@class='modal-box']");
	By txtSurveyShoppingExperience = By.xpath("//h2[contains(text(),'shopping experience?')]");
	By surveyText1 = By.xpath("//h2[contains(text(),'shopping experience?')]/../p");
	By txtSurveyRecommend = By.xpath("//h2[contains(text(),'are you to recommend Globe to others?')]");
	By surveyText2 = By.xpath("//h2[contains(text(),'are you to recommend Globe to others?')]/../p");
	By Emoji_ShoppingExp = By.xpath(
			"//h2[contains(text(),'shopping experience?')]/.. //ul[@class='rating'] //li[contains(@id,'rating-icon')]");
	By Emoji_Recommendation = By.xpath(
			"//h2[contains(text(),'are you to recommend Globe to others?')]/.. //ul[@class='rating'] //li[contains(@id,'rating-icon')]");
	By feedbackTextAread1 = By.xpath("//textarea[@id='feedback-block-feedback-1']");
	By feedbackTextAread2 = By.xpath("//textarea[@id='feedback-block-feedback-2']");
	By submitSurvey = By.xpath("//span[@id='rater-button']");
	By imgFeedbackSuccess = By.xpath("//div[@class='success-image']");
	By txtFeedbackSuccess_1 = By.xpath("//div[@class='success-image']/../h1");
	By txtFeedbackSuccess_2 = By.xpath("//div[@class='success-image']/../p");
	By btnClose = By.xpath("//span[@class='close-button']");

	/********************************************************************************************************************************/
	public WebElement get_txt_shoppingExperience() {
		return DriverManager.getDriver().findElement(txtSurveyShoppingExperience);
	}

	/********************************************************************************************************************************/
	public WebElement get_txt_recommendGlobe() {
		return DriverManager.getDriver().findElement(txtSurveyRecommend);
	}

	/********************************************************************************************************************************/
	public WebElement get_txt_shopExperience_feedback_() {
		return DriverManager.getDriver().findElement(surveyText1);
	}

	/********************************************************************************************************************************/
	public WebElement get_txt_recommend_feedback() {
		return DriverManager.getDriver().findElement(surveyText2);
	}

	/********************************************************************************************************************************/
	public List<WebElement> get_shopExpEmoji() {
		return DriverManager.getDriver().findElements(Emoji_ShoppingExp);
	}

	/********************************************************************************************************************************/
	public List<WebElement> get_recomGlobeEmoji() {
		return DriverManager.getDriver().findElements(Emoji_Recommendation);
	}

	/********************************************************************************************************************************/
	public WebElement get_shopExpFeedbackTextArea() {
		return DriverManager.getDriver().findElement(feedbackTextAread1);
	}

	/********************************************************************************************************************************/
	public WebElement get_RecomGlobeTextArea() {
		return DriverManager.getDriver().findElement(feedbackTextAread2);
	}

	/********************************************************************************************************************************/
	public WebElement get_submitSurver() {
		return DriverManager.getDriver().findElement(submitSurvey);
	}

	/********************************************************************************************************************************/
	public WebElement get_txt_thatsNice() {
		return DriverManager.getDriver().findElement(txtFeedbackSuccess_1);
	}

	/********************************************************************************************************************************/
	public WebElement get_txt_shareOthers() {
		return DriverManager.getDriver().findElement(txtFeedbackSuccess_2);
	}

	/********************************************************************************************************************************/
	public WebElement get_closeButton() {
		return DriverManager.getDriver().findElement(btnClose);
	}

	/********************************************************************************************************************************/
	public boolean isElementExist(String message, String element, int waitTime) {
		boolean flag = false;

		switch (element) {
		case "closeButton":
			flag = waitForElementVisibility(btnClose, waitTime);
			break;
		case "surveyForm":
			flag = waitForElementVisibility(surveyForm, waitTime);
			break;
		case "imgSurveySuccess":
			flag = waitForElementVisibility(imgFeedbackSuccess, waitTime);
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



