package runner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;
import steps.BaseClass;

@CucumberOptions (features = "src/test/java/feature"
				, glue = "steps"
				, monochrome = true
				, dryRun = false
				, snippets = SnippetType.CAMELCASE
				, publish = true)
public class runner extends BaseClass{

}
