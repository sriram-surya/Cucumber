package in.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features",glue = "in.steps",
snippets = SnippetType.CAMELCASE.UNDERSCORE, dryRun = false, monochrome = true,tags = {"@smoke or @sanity"},
plugin = {"html:target","json:target/report/FB.json","junit:target/report/FB.xml"})
public class TestRunner {
//,tags = {"@first","@second","@third"}
	@AfterClass 
	public static void reportGeneration() {
		
	}
}

