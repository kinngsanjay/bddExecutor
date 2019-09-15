package com.selendroid.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"src/test/java/com/selendroid/feature/ApplicationFeature.feature"},
		glue={"com/selendroid/stepdefinition"},
		plugin={"html:target/cucumber-html-report"},
		dryRun = false,
		//tags= {"@Prod"}, 
		monochrome=false)

public class TestRunner {

}
