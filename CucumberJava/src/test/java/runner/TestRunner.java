package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

/*@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features", 
glue= {"steps"},
plugin = {"json:target/cucumber.json"})

*/
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/feature", glue= {"stepDefinations"},monochrome = true,
plugin = {"pretty","html:target/HTMLReport",
"json:target/cucumber.json",
"junit:target/cucumber.xml"},
tags = "@smoke"
)
public class TestRunner {

}
