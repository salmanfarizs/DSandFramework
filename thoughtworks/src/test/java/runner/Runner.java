package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
 features ="src/test/java/features/Automation.feature",
	glue= {"stepdefs"}
 )
public class Runner {
	
	
	 
	

}
