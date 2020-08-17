package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/test/java/features",
                             glue="steps", 
                             monochrome=true,
                             plugin = {"html:report"}
                            // tags = {"@regression,@smoke"}
                         )
                            // tags = {"@Functional","@Regression"})
public class RunLogin extends AbstractTestNGCucumberTests {

	
}
