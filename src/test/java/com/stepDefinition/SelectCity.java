package com.stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import com.elementRepository.SelectCityPage;
import com.utilPackage.DriverFactory;
import com.utilityClasses.FileUtility;
import com.utilityClasses.WebDriverUtility;

import io.cucumber.java.en.When;

public class SelectCity {
	public WebDriver driver = DriverFactory.getDriver();
	WebDriverUtility Utility =new WebDriverUtility();
	SelectCityPage citypage =new SelectCityPage(driver);
	FileUtility fileUtility=new FileUtility();
	
	@When("user should be able to click on 1BHK Interior Design  and navigated")
	public void user_should_be_able_to_click_on_1bhk_interior_design_and_navigated() throws Exception{
		citypage.getBhkinteriordesign().click();
	    String title=fileUtility.getDataFromPropertiesFiles("bhkinterior");
	    Utility.switchToTabOnTitle(driver, title);
	    Assert.assertTrue(citypage.getSelectcity().isDisplayed());
	   Reporter.log("user is able to click on 1bhk interior design ",true);
	    
	}

	@When("user should be able to click on select city")
	public void user_should_be_able_to_click_on_select_city() {
		 citypage.getSelectcity().click();
		 Reporter.log("user is able to click on select city",true);
	}

	@When("user should be able to select on the {int} in the dropdown")
	public void user_should_be_able_to_select_on_the_in_the_dropdown(Integer int1) throws Exception {
		String se=fileUtility.getDataFromExcel("Sheet1",int1, 0);
	    driver.findElement(By.xpath("//label[text()='"+se+"']")).click();
	    Thread.sleep(2000);
	}
	


}
