package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/java/features"}
        , tags = {"@loginWithDataTable,@loginSimple"}
        , glue = "stepsDefinition"
        , format = {"pretty", "html:target/cucumber"}
)
public class testRunners extends AbstractTestNGCucumberTests {


}

