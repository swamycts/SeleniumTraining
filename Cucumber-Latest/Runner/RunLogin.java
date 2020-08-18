package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features= {"src/test/java/features/TC-002-CreateLead.feature","src/test/java/features/TC-003-EditLead.feature"},
                             glue="steps", 
                             monochrome=true,
                             plugin = {"html:report"}
                            // tags = {"@regression,@smoke"}
                         )
                            // tags = {"@Functional","@Regression"})
public class RunLogin extends AbstractTestNGCucumberTests {

	
}
