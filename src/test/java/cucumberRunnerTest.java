import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        features="src/test/resources/",
        glue = {"com.FeatureStepDefs"},
        plugin = {"json:target/cucumber.json",
                  "html:target/target/cucumber-html-report.html", "pretty"},
        tags = "@test1",
        publish = true


)

public class cucumberRunnerTest {

}

