package com.stepDefinition;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import com.elementRepository.ServicesPage;
import com.utilPackage.DriverFactory;
import com.utilityClasses.FileUtility;
import com.utilityClasses.WebDriverUtility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Services {
	public WebDriver driver = DriverFactory.getDriver();
	 ServicesPage servicespage =new ServicesPage(driver);
	WebDriverUtility utility =new WebDriverUtility();
	FileUtility fileUtility=new FileUtility();
	
	@Given("user should be able to logged in")
	public void user_should_be_able_to_logged_in() throws Exception {
//		utility.mouseHover(driver, servicespage.getGetloginLink());
//		Thread.sleep(3000);
//		utility.javascriptClick(driver, servicespage.getGetloginButton());
//		Thread.sleep(3000);
//		utility.switchToTabOnTitle(driver, fileUtility.getDataFromPropertiesFiles("loginTitle"));
//		Thread.sleep(3000);
//		servicespage.getGetMobileTextField().sendKeys("9789214209");
//	    servicespage.getGetCaptLink().click();
//	    Thread.sleep(5000);
//	    servicespage.getNextButton().click();
//	    Thread.sleep(40000);
//	    servicespage.getContinueButton().click();
//	    Thread.sleep(5000);
//	    servicespage.getGetCrossLink().click();
//	    Reporter.log("The user should be logged in",true);
	}
	
	
	@When("user should be able to click on Home Interior Design Services")
	public void user_should_be_able_to_click_on_home_interior_design_services() throws Exception {
       servicespage.getHomeDesignServiceLink().click();
       String title=fileUtility.getDataFromPropertiesFiles("hometitle");
       utility.switchToTabOnTitle(driver, title);
	    Reporter.log("user is able to click on Home Interior Design Services ",true);
	    
	}

	@When("user should be able to navigated to  Home Interior Design Services page")
	public void user_should_be_able_to_navigated_to_home_interior_design_services_page() {
		Assert.assertTrue(servicespage.getBangalore().isDisplayed());
		Reporter.log("bangalore is dispalyed",true);
	   
	}

	@When("user should be able to click on bangalore")
	public void user_should_be_able_to_click_on_bangalore() throws Exception {
	    servicespage.getBangalore().click();
	    Thread.sleep(2000);
	    String title=fileUtility.getDataFromPropertiesFiles("Interiordesigners");
	    utility.switchToTabOnTitle(driver, title);
	    Reporter.log("user is able to click on banglore button",true);
	}

	@Then("user should be navigated to the Interior Designers in Bangalore")
	public void user_should_be_navigated_to_the_interior_designers_in_bangalore() {
		Assert.assertTrue(servicespage.getInteriorDesignersinBangalore().isDisplayed());
		Reporter.log("Squarepanels is displayed",true);
	}
}
