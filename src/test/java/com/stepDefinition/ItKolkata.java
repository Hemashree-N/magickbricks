package com.stepDefinition;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;

import com.elementRepository.ItKolkataPage;
import com.utilPackage.DriverFactory;
import com.utilityClasses.FileUtility;
import com.utilityClasses.WebDriverUtility;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ItKolkata {

	public WebDriver driver = DriverFactory.getDriver();
	WebDriverUtility utility = new WebDriverUtility();
	FileUtility fileUtility = new FileUtility();
	ItKolkataPage kolkata = new ItKolkataPage(driver);

	@When("user is able to mouse hover on the kolkata and navigated to kolkata page")
	public void user_is_able_to_mouse_hover_on_the_kolkata_and_navigated_to_kolkata_page() {
		utility.mouseHover(driver, kolkata.getHover());
		Assert.assertTrue(kolkata.getKolkata().isDisplayed());
		Reporter.log("mouse hover on Kolkata link", true);
		kolkata.getKolkata().click();
		Reporter.log("user clicks on Kolkata", true);
	}

	@When("user is able to scroll down and click on  Properties listed for you and navigated to House for Sale in Kolkata")
	public void user_is_able_to_click_on_properties_listed_for_you_and_navigated_to_house_for_sale_in_kolkata()throws Exception {
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1100);");
		kolkata.getviewallnewprojects().click();
		Reporter.log("user clicks on View All New projects", true);
		String title = fileUtility.getDataFromPropertiesFiles("Properties");
		utility.switchToTabOnTitle(driver, title);
		Thread.sleep(3000);
	}

	@When("user is able to click on new project and navigated to new project page")
	public void user_is_able_to_click_on_new_project_and_navigated_to_new_project_page() throws Exception {
		Reporter.log("user clicks on project",true);
	}

	@When("user is able to click on Expert Reviews")
	public void user_is_able_to_click_on_expert_reviews() throws Exception {
		Thread.sleep(1000);
		kolkata.getExpertreviews().click();
		Reporter.log("user clicks on expert reviews");
	}

	@When("user is able to click on sunrise meadows and scroll down to PropWorth Insights")
	public void user_is_able_to_click_on_sunrise_meadows_and_scroll_down_to_prop_worth_insights() throws Exception {
		Thread.sleep(4000);
		
		Actions act=new Actions(driver);
		act.click(kolkata.getSunrisemeadows()).perform();
		String title = fileUtility.getDataFromPropertiesFiles("sunrise");
		utility.switchToTabOnTitle(driver, title);
		
		utility.scrollToElementJS(driver, kolkata.getLocality());
		Thread.sleep(3000);
	}

	@Then("user is able to click on Locality and Park Circus and Purba Barisha and Kalyani")
	public void user_is_able_to_click_on_locality_and_park_circus_and_purba_barisha_and_kalyani()
			throws InterruptedException {
		utility.javascriptClick(driver, kolkata.getLocality());
		//.sleep(4000);
		utility.javascriptClick(driver, kolkata.getBijoygarh());
		Thread.sleep(4000);
		utility.javascriptClick(driver, kolkata.getBally());
		Thread.sleep(4000);
	}

}
