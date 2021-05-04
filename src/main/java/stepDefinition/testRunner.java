package stepDefinition;

import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
            features = "src/test/resources/features",
            glue = {"stepDefinition"},
            monochrome = true,
            tags = "@NonSmokeTest",
            plugin = {"pretty","junit:target/JUnitReports/report.xml"}
            )
public class testRunner {
}