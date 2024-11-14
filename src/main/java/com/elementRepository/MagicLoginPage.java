package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MagicLoginPage {
	public MagicLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}
	@FindBy(id = "emailOrMobile")
	private WebElement emailOrPhoneTextFeild;

	public WebElement getEmailOrPhoneTextFeild() {
		return emailOrPhoneTextFeild;
	}
	
	@FindBy(id = "btnStep1")
	private WebElement nextButton;

	public WebElement getNextButton() {
		return nextButton;
	}
	
	@FindBy(xpath = "(//button[contains(text(),'Continue')])[2]")
	private WebElement continueButton;

	public WebElement getContinueButton() {
		return continueButton;
	}
	@FindBy(xpath = "(//a[text()='Login'])[1]")
	private WebElement loginLink;
	
	public WebElement getLoginLink() {
		return loginLink;
	}
	
	@FindBy(xpath = "(//a[text()='Login'])[2]")
	private WebElement loginButton;

	public WebElement getLoginButton() {
		return loginButton;
	}

}
