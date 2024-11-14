package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ServicesPage {
	
	public ServicesPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='Home Interior Design Services']")
	private WebElement homeDesignServiceLink;

	public WebElement getHomeDesignServiceLink() {
		return homeDesignServiceLink;
	}
	
	@FindBy(xpath = "//a[text()='Bangalore']")
	private WebElement Bangalore;
	
	
	public WebElement getBangalore() {
		return Bangalore;
	}

	@FindBy(xpath = "//li[@class='mbdes__breadcrumbs__list__val active']")
	private WebElement InteriorDesignersinBangalore;

	public WebElement getInteriorDesignersinBangalore() {
		return InteriorDesignersinBangalore;
	}
	
	@FindBy(xpath = "//div[text()='Select locality']")
	private WebElement Selectlocality;

	public WebElement getSelectlocality() {
		return Selectlocality;
	}
	
	@FindBy(xpath = "Filter by ")
	private WebElement filterby;

	public WebElement getFilterby() {
		return filterby;
	}
	@FindBy (xpath="//div[text()='Home Interiors']")
	private WebElement Homeinteriors;

	public WebElement getHomeinteriors() {
		return Homeinteriors;
	}
	
	@FindBy(xpath="//h3[text()='Square Panels']")
	private WebDriver squarepanels;

	public WebDriver getSquarepanels() {
		return squarepanels;
	}
	
	@FindBy(xpath = "//h1[@class='intsrp--pageTitle']")
	private WebElement InteriordesignersinBangalore;

	public WebElement getInteriordesignersinBangalore() {
		return InteriordesignersinBangalore;
	}
	
	
	
	
	
	
//	@FindBy(xpath="//li//a[text()='Bangalore']")
//	private WebElement Bangloresub;
//
//	public WebElement getBangloresub() {
//		return Bangloresub;
	
//	}
//
	
	@FindBy(xpath = "(//a[text()='Login'])[1]")
	private WebElement getloginLink;
	
	@FindBy(xpath = "(//a[text()='Login'])[2]")
	private WebElement getloginButton;
	
	@FindBy(xpath = "//input[@name='emailOrMobile']")
	private WebElement getMobileTextField;
	
	@FindBy(id = "captchaCodeSignIn")
	private WebElement getCaptLink;
	
	@FindBy(id = "btnStep1")
	private WebElement nextButton;
	
	@FindBy(xpath = "(//button[contains(text(),'Continue')])[2]")
	private WebElement continueButton;
	
	@FindBy(xpath = "//div[@class='onmodal__cross']")
	private WebElement getCrossLink;

	public WebElement getGetloginLink() {
		return getloginLink;
	}

	public WebElement getGetloginButton() {
		return getloginButton;
	}

	public WebElement getGetMobileTextField() {
		return getMobileTextField;
	}

	public WebElement getGetCaptLink() {
		return getCaptLink;
	}

	public WebElement getNextButton() {
		return nextButton;
	}

	public WebElement getContinueButton() {
		return continueButton;
	}

	public WebElement getGetCrossLink() {
		return getCrossLink;
	}
	
	
	
	

}
