/*package runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/java/features",
		glue="stepdefinitions")
public class Runner extends AbstractTestNGCucumberTests {

//	@Override
//	@DataProvider(parallel = true)
//	public Object[][] scenarios() {
//	return super.scenarios();
//	}
}*/
//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&

package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

    features = "src/test/java/features",

    glue = {
        "stepdefinitions",
        "hooks"
    },

    plugin = {
        "pretty",

        "html:target/cucumber-report/cucumber.html",

        "json:target/cucumber-report/cucumber.json",

        "junit:target/cucumber-report/cucumber.xml"
    },

    monochrome = true,

    publish = false
)
public class Runner extends AbstractTestNGCucumberTests {
}

