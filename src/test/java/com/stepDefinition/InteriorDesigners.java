package com.stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import com.elementRepository.InteriorDesignersPage;
import com.utilPackage.DriverFactory;
import com.utilityClasses.FileUtility;
import com.utilityClasses.WebDriverUtility;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InteriorDesigners {
	
	public WebDriver driver = DriverFactory.getDriver();
	InteriorDesignersPage interiordesignerspage=new InteriorDesignersPage(driver);
	WebDriverUtility utility =new WebDriverUtility();
	FileUtility fileUtility=new FileUtility();
	
	
	@When("user should be able to mouse hover on homeInteriorslink")
	public void user_should_be_able_to_mouse_hover_on_home_interiorslink() {
		utility.mouseHover(driver,interiordesignerspage.getHomeinteriordrop());
//		Assert.assertTrue(interiordesignerspage.getNewdelhi().isDisplayed());
		Reporter.log("mouse hover on homeInterior link",true);
	    
	}

	@When("user should be able to click on Interior Designers in New Delhi")
	public void user_should_be_able_to_click_on_interior_designers_in_new_delhi() throws Exception {
		   interiordesignerspage.getNewdelhi().click();
		   String title=fileUtility.getDataFromPropertiesFiles("newdelhi");
	       utility.switchToTabOnTitle(driver, title);
//	       Assert.assertTrue(interiordesignerspage.getBangaloredrop().isDisplayed());
		   Reporter.log("user is able to click on Home Interior Design Services ",true);
	}

	@When("user should be able to navigate to the Interior Designers in New Delhi")
	public void user_should_be_able_to_navigate_to_the_interior_designers_in_new_delhi() throws Exception {
	    Reporter.log("user is able to navigate to Interior Designers in New Delhi",true);
	}

	@When("user should be able to click on Select locality")
	public void user_should_be_able_to_click_on_select_locality() {
	    interiordesignerspage.getSelectlocality().click();
	    Reporter.log("user is able to click on the selectlocality",true);
	    
	}

	@When("user should be able to select on the Select locality in the dropdown")
	public void user_should_be_able_to_select_on_the_select_locality_in_the_dropdown() {
	    interiordesignerspage.getIndiranagar().click();
	    Reporter.log("user is able to click on indiranager");
	}

	@When("user should be able to navigate to Square Panels page")
	public void user_should_be_able_to_navigate_to_square_panels_page() throws Exception {
	    interiordesignerspage.getSquarpanels().click();
	    String title=fileUtility.getDataFromPropertiesFiles("Squarepanels");
	    utility.switchToTabOnTitle(driver, title);
	    Thread.sleep(5000);
	    JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1800);");
		Thread.sleep(3000);
	    
	    Reporter.log("user is able to click on squarpanels and navigate",true);
	}

	@Then("user should be able to see the maps and navigate to location")
	public void user_should_be_able_to_see_the_maps_and_navigate_to_location() throws InterruptedException {
		
//	   utility.action(driver,interiordesignerspage.getMaplink());
//	   Thread.sleep(5000);
//	   Reporter.log("user is able to click on showmore",true);
	   
	   interiordesignerspage.getMaplink().click();
	   Reporter.log("user is able to click on map and navigate to location",true);
	}




}
