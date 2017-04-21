package com.cbt.stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cbt.utilities.SharedDriver;

import cucumber.api.java.en.Given;

public class OrderStepDefs {
	WebDriver driver;

	public OrderStepDefs(SharedDriver driver) {
		this.driver = driver;
	}

	@Given("^I am on the home page$")
	public void I_am_on_the_home_page() throws Throwable {
		driver.get("http://google.com");
	}

	@Given("^I say (.*)$")
	public void I_say_order_one(String option) throws Throwable {
	    driver.findElement(By.name("q")).sendKeys(option);
	    Thread.sleep(2000);
	}
}
