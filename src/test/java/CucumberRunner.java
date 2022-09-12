import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.testng.annotations.AfterSuite;

@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        plugin = {"pretty", "html:target/cucumber-html-report"},
        features="src/test/resources/",
        tags= "@sm1")

class CucumberRunner {
@BeforeClass
    public static void setScreen(){

    }
}

