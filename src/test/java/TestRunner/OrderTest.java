package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)
@CucumberOptions(
		features = {"src/test/java/AppFeature/Order.feature"},
		glue = {"StepDefinitions", "Hooks"},
		plugin = {"pretty", 
				   "json:target/MyReports/report.json", //Generate report in json format
				   "junit:target/MyReports/report.xml"}, // Generate report in junit
		monochrome = true, // Proper alignment in console
		publish = true, // If you want to publish report in cucumber cloud
		dryRun = true // If you not created step definition for any step it will flag that and it will not execute anything
		)

public class OrderTest {

}
