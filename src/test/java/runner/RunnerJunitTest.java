package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features",
glue="stepdefintions",monochrome=true, 
tags="@scenario1",
plugin= {"pretty","html:target/cucumber.html",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
		"rerun:target/failed_scenarios.txt"})
public class RunnerJunitTest {
	

}
