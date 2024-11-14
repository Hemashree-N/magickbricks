package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InteriorDesignersPage {
	
	public InteriorDesignersPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//li//span[contains(text(),'Home Interiors')]")
	private WebElement homeinteriordrop;
	
	
	
	
	public WebElement getHomeinteriordrop() {
		return homeinteriordrop;
	}


	@FindBy(xpath = "//li//a[text()='Interior Designers in New Delhi']")
	private WebElement newdelhi;




	public WebElement getNewdelhi() {
		return newdelhi;
	}
	
	@FindBy(xpath = "(//div[@class='intsrp__topfilter__component']//child::div[@class='intsrp__topfilter__item has-dropdown  has-selected'])[2]")
	private WebElement selectlocality;

//	@FindBy(xpath = "(//div[contains(@class,'intsrp__topfilter__item has-dropdown')])[2]")
//	private WebElement selectlocality;


	public WebElement getSelectlocality() {
		return selectlocality;
	}
	
	@FindBy(xpath = "//div[@class='intsrp__topfilter__component']//div[text()='Bangalore']")
	private WebElement bangaloredrop;
	
	
	
	public WebElement getBangaloredrop() {
		return bangaloredrop;
	}


	@FindBy(xpath = "//label[text()='Whitefield']")
	private WebElement whitefield;




	public WebElement getWhitefield() {
		return whitefield;
	}
	
//	@FindBy(xpath = "//div[@class='intsrp__topfilter__component']//child::div[text()='Indiranagar']")
//	private WebElement indiranagar;

	@FindBy(xpath = "//label[text()='Indiranagar']")
	private WebElement indiranagar;


	public WebElement getIndiranagar() {
		return indiranagar;
	}
	
	@FindBy (xpath = "//h3[text()='Square Panels']")
	private WebElement squarpanels;




	public WebElement getSquarpanels() {
		return squarpanels;
	}
	
	@FindBy(xpath = "//span[@class='text-bold showmore']")
	private WebElement  showmore;




	public WebElement getShowmore() {
		return showmore;
	}
	
	@FindBy (xpath = "//a[@class='maplink']")
	private WebElement maplink;




	public WebElement getMaplink() {
		return maplink;
	}
	

}
