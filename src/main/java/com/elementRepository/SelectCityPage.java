package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectCityPage {

	public SelectCityPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='1BHK Interior Design']")
	private WebElement bhkinteriordesign;

	public WebElement getBhkinteriordesign() {
		return bhkinteriordesign;
	}

	@FindBy(xpath = "//div[text()='Select City']")
	private WebElement selectcity;

	public WebElement getSelectcity() {
		return selectcity;
	}
	
	@FindBy(xpath = "//div[text()='Bangalore']")
	private WebElement Bangalorebutton;
	
	
	public WebElement getBangalorebutton() {
		return Bangalorebutton;
	}


	@FindBy(xpath = "//div[text()='New Delhi']")
	private WebElement newdelhibutton;

	public WebElement getNewdelhibutton() {
		return newdelhibutton;
	}
	
	
	@FindBy(xpath = "//div[text()='Gurgaon']")
	private WebElement gurgaonbutton;

	public WebElement getGurgaonbutton() {
		return gurgaonbutton;
	}
	
	
	@FindBy(xpath = "//div[text()='Noida']")
	private WebElement noidabutton;
	
	
	public WebElement getNoidabutton() {
		return noidabutton;
	}
	
	@FindBy(xpath = "//div[text()='Hyderabad']")
	private WebDriver hyderabadbutton;
	
	
	
	

}
