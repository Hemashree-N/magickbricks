package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ItKolkataPage {
	public ItKolkataPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "(//a[@class='mb-header__main__link js-menu-link'])[1]")
	private WebElement hover;

	public WebElement getHover() {
		return hover;
	}
	
	@FindBy (xpath = "//a[text()='Kolkata']")
	private WebElement kolkata;

	public WebElement getKolkata() {
		return kolkata;
	}
	
	@FindBy(xpath = "(//div[@class='mb-home__collection-search__card__title'])[1]")
	private WebElement Propertieslistedforyou;

	public WebElement getPropertieslistedforyou() {
		return Propertieslistedforyou;
	}
	
	@FindBy(xpath = "//a[text()='New Projects']")
	private WebElement newprojects;

	public WebElement getNewprojects() {
		return newprojects;
	}
	
	@FindBy(xpath = "//div[text()='Expert Reviews &']")
	private WebElement expertreviews;

	public WebElement getExpertreviews() {
		return expertreviews;
	}
	
	@FindBy(xpath = "//img[@alt='SUNRISE MEADOWS']")
	private WebElement sunrisemeadows;

	public WebElement getSunrisemeadows() {
		return sunrisemeadows;
	}
	@FindBy(xpath = "(//div[text()='Locality'])[2]")
	private WebElement locality;

	public WebElement getLocality() {
		return locality;
	}
	
	@FindBy(xpath = "//label[text()='Bijoygarh']")
	private WebElement Bijoygarh; 

	public WebElement getBijoygarh() {
		return Bijoygarh;
	}
	@FindBy (xpath = "//label[text()='Bally']")
	private WebElement Bally;

	public WebElement getBally() {
		return Bally;
	}
	
	@FindBy(xpath = "//a[text()='View All New projects']")
	private WebElement viewallnewprojects;

	public WebElement getviewallnewprojects() {
		return viewallnewprojects;
	}
	
	
	
	
	
}
