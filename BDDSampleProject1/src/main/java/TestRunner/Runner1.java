package TestRunner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features= "C:\\JavaT\\workspace\\BDDSampleProject1\\src\\main\\java\\Fearure\\login.feature",
		glue= {"StepDefinition"},
	//	plugin= {"html:target/cucumber-html-report", "json:target/cucumber-json-report.json"}
		plugin= {"pretty","html:test-output"}
		)

public class Runner1 {
	
	

}
