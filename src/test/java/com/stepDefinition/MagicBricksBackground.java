package com.stepDefinition;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import com.elementRepository.InteriorDesignersPage;
import com.elementRepository.MagicBricksBackgroundPage;
import com.utilPackage.DriverFactory;
import com.utilityClasses.FileUtility;
import com.utilityClasses.WebDriverUtility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class MagicBricksBackground {
	public WebDriver driver = DriverFactory.getDriver();
	WebDriverUtility utility =new WebDriverUtility();
	FileUtility fileUtility=new FileUtility();
	MagicBricksBackgroundPage background = new MagicBricksBackgroundPage(driver);

	@Given("user should be able to click on Modular Kitchen Design Ideas")
	public void user_should_be_able_to_click_on_modular_kitchen_design_ideas() throws Exception {
	    background.getModularkitchendesign().click();
	    String title=fileUtility.getDataFromPropertiesFiles("kitchendesign");
	    utility.switchToTabOnTitle(driver, title);
	    Thread.sleep(5000);
	    JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300);");
	    Reporter.log("user is  able click on Modular Kitchen Design Ideas",true);
	}

	@When("user  should be able to scroll down and click on L-shape and island")
	public void user_should_be_able_to_scroll_down_and_click_on_l_shape_and_island(){
		background.getLshape().click();
		Reporter.log("user is be able to click on l-shape",true);
//		background.getIsland().click();
//		Reporter.log("user is  able to click on Island",true);
	   
	}

	@Given("user should be able to click on Bathroom Design Ideas")
	public void user_should_be_able_to_click_on_bedrooms_design_ideas() throws Exception {
		background.getBathroom().click();
	    String title=fileUtility.getDataFromPropertiesFiles("Bathroom");
	    utility.switchToTabOnTitle(driver, title);
	    Thread.sleep(5000);
	    JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300);");
	    Reporter.log("user is able click on Bathroom Design Ideas",true);
	}

	@When("user should be able to scroll down and click on Contemporary and Traditional")
	public void user_should_be_able_to_scroll_down_and_click_on_contemporary_and_traditional() {
	    background.getContemporary().click();
	    Reporter.log("user is able to click on Contemporary",true);
//	    background.getTraditional().click();
//	    Reporter.log("user is able to click on Traditional",true);
	}

}
