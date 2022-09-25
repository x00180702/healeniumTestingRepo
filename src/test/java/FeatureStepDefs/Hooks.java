package FeatureStepDefs;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import helpers.TestPlan;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;



public class Hooks {
    
    @Before
    public static void setUp(){

        TestPlan.setUpDriver();
    }
    
    @After
    public static void tearDown(Scenario scenario){
        
        if(scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot) TestPlan.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
       TestPlan.tearDown(); 
    }
}
