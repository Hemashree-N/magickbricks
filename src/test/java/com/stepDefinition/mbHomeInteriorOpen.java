package com.stepDefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import com.elementRepository.HomePage;
import com.utilPackage.DriverFactory;
import com.utilityClasses.FileUtility;
import com.utilityClasses.WebDriverUtility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class mbHomeInteriorOpen {
	WebDriver driver = DriverFactory.getDriver();
	HomePage homepage = new HomePage(driver);
	FileUtility utility = new FileUtility();
	WebDriverUtility webUtility = new WebDriverUtility();

	@Given("Browser should be launched and url should be navigated")
	public void browser_should_be_launched_and_url_should_be_navigated() throws Exception {
		String actualURL = driver.getCurrentUrl();
		String expectedURL = utility.getDataFromPropertiesFiles("url");
		Assert.assertEquals(actualURL, expectedURL, "URL is not navigated");
		Reporter.log("lunching Browser and Navigating to the url", true);
	}

	@When("user should be able to mouse hover on homeInterior link")
	public void user_should_be_able_to_mouse_hover_on_home_interior_link() {
		webUtility.mouseHover(driver, homepage.getHomeInteriorsLink());
		Assert.assertTrue(homepage.getExploreourservices().isDisplayed());
		Reporter.log("mouse hover on homeInterior link", true);
	}

	@Then("user should be able to see the submobules after hovering")
	public void user_should_be_able_to_see_the_submobules_after_hovering() {
		Assert.assertTrue(homepage.getHomeInteriorDesignServiceLink().isDisplayed());
		Reporter.log("mouse hover on homeInterior link can see submobules", true);

	}

}
