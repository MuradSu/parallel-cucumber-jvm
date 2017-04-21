package com.cbt.runners;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(
		glue = "com/cbt/stepdefs",
		features = "./src/test/resources/features/login",
				format = {"html:target/cucumber-report/login"}
		)
public class LoginRunner {

}