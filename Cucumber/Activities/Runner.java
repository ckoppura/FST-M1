package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features", glue = { "stepDefinition" }, tags = "@activity4", plugin = {
		"pretty" , "html: target/test-reports"}, monochrome = true)
public class Runner {

}
