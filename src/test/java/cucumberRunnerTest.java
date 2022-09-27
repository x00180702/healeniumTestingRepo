import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        features="src/test/resources/",
        glue = {"com.FeatureStepDefs"},
        plugin = {"json:target/cucumber.json",
                  "html:target/target/cucumber-html-report"},
        tags= "@bpTest",
        publish = true


)

public class cucumberRunnerTest {

}

