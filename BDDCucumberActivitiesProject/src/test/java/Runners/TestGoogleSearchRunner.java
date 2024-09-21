package Runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/Features/Activity1.feature",
		glue= {"Steps"},
		monochrome=true,
		plugin = {"json:target/cucumber.json"},
		tags="@activity1"
		
		)
public class TestGoogleSearchRunner {

}
