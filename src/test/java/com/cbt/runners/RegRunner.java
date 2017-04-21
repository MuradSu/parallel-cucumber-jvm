package com.cbt.runners;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(
		glue = "com/cbt/stepdefs",
		features = "./src/test/resources/features/registration",
				format = {"html:target/cucumber-report/registration", 
						"json:target/cucumber-report/registration/cucumber.json"}
		)
public class RegRunner {

}