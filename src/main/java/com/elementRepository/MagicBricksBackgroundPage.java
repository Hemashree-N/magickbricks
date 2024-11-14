package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MagicBricksBackgroundPage {
	
	public MagicBricksBackgroundPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='Modular Kitchen Design Ideas']")
	private WebElement modularkitchendesign;
	
	
	public WebElement getModularkitchendesign() {
		return modularkitchendesign;
	}

	@FindBy(xpath = "//div[text()='L-shape']")
	private WebElement lshape;


	public WebElement getLshape() {
		return lshape;
	}
	
	@FindBy(xpath = "//div[text()='Island']")
	private WebElement island;


	public WebElement getIsland() {
		return island;
	}
	
	
	@FindBy(xpath = "//a[text()='Bathroom Design Ideas']")
	private WebElement Bathroom;


	public WebElement getBathroom() {
		return Bathroom;
	}
	
	@FindBy(xpath = "//div[text()='Contemporary']")
	private WebElement Contemporary;


	public WebElement getContemporary() {
		return Contemporary;
	}
	
	@FindBy(xpath = "//div[text()='Traditional']")
	private WebElement Traditional;


	public WebElement getTraditional() {
		return Traditional;
	}
	
	
	
	

}
