package TestCase;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\2319871\\eclipse-workspace\\Hackathon2\\FeatureFiles\\login.feature", glue = "stepDefinition", plugin = { "pretty",
		"html:reports/myCucumberReport.html" })
public class testRunner {

}
