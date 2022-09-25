package helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;



public class TestPlan {

    private static TestPlan testPlan;
    private static WebDriver driver;
    private static WebDriverWait wait;
    public final static int TIMEOUT = 10;

    private TestPlan(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }


    public static void submitForm(String bpOrbpc) {
        if(bpOrbpc.equals("Blood Pressure")){
            driver.get(Utils.BASE_URL);
        }else {
            driver.get(Utils.BASE_URL1);
        }
    }

    public static WebDriver getDriver(){
        return driver;
    }

    public static void setUpDriver(){
        if (testPlan==null){
            testPlan = new TestPlan();
        }
    }

    public static void tearDown(){
        if (driver!=null){
            driver.close();
            driver.quit();
        }
        testPlan = null;
    }


}