package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features",
        glue = "stepDefinitions"
, tags = "@dummyLogin",
        plugin = {"pretty","html:target/cucumber.html",
                "json:target/cucumber.json",
                "junit:target/cuckes.xml"}
/*,dryRun = true*/)
public class TestRunner {
}
