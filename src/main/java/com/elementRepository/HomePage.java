package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//a[text()='Home Interiors']")
		private WebElement HomeInteriorsLink;
	

	public WebElement getHomeInteriorsLink() {
		return HomeInteriorsLink;
	}

	@FindBy(xpath = "//div[text()='Explore our services']")
			private WebElement Exploreourservices ;

	
	public WebElement getExploreourservices() {
		return Exploreourservices;
	}

	@FindBy(xpath = "//a[text()='Home Interior Design Services']")
	private WebElement homeInteriorDesignServiceLink;



	public WebElement getHomeInteriorDesignServiceLink() {
		return homeInteriorDesignServiceLink;
	}
	

}
