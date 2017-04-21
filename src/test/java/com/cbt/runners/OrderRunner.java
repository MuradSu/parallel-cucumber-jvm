package com.cbt.runners;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(
		glue = "com/cbt/stepdefs",
		features = "./src/test/resources/features/order/",
		format = {"html:target/cucumber-report/order", 
				"json:target/cucumber-report/order/cucumber.json"}
		)
public class OrderRunner {

}