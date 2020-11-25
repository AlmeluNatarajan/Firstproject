package CucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= "D:\\Automation Project//SampleProject//src//test//java//Feature",
		glue = "StepDefinition",
		//tags="RegTest",
		plugin= {"pretty","html:target/cucumber.html" , "json:target/cucumber1.json"})

public class TestRunner
{
	
}