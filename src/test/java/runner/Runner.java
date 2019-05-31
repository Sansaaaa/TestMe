package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Cucumber/Sample5.feature", 
glue="Stepdefnition",
plugin="html:c:\\Cucumber-html-report")
              

public class Runner {

}
