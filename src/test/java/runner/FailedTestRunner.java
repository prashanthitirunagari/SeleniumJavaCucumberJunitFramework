package runner;

import io.cucumber.junit.CucumberOptions;

@CucumberOptions(
		features = "@target/failed_scenarios.txt",glue = "stepdefintions",monochrome=true,
				plugin= {"html:target/cucumber.html",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class FailedTestRunner{
	
}
