package StepDefinitions;





import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;


@RunWith(Cucumber.class)
@CucumberOptions(
		

plugin= {"pretty", 

		"html:target/Cucumber/HtmlReports",
		"summary"}

,features="src/test/resources/features/Pfizer.feature"
,glue = {"StepDefinitions"}

,monochrome = true
,dryRun=false
,snippets = CAMELCASE
//,tags = "@test"
		)



public class TestRunner {

}


// to run test 1.right click 2. Run As 3 JUnit Test