package BDD;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature/OpenGoogle.feature", glue = "StepDefinitions")
public class OpenGoogle 
{

	//It must combine feature file and step definitions
}