package helpers;

import com.epam.healenium.SelfHealingDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;



public class TestPlan {

    private static TestPlan testPlan;
    private static SelfHealingDriver driver;
    private static WebDriverWait wait;
    public final static int TIMEOUT = 10;

    private TestPlan(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--headless");
        WebDriver delegate = new ChromeDriver();
        driver = SelfHealingDriver.create(delegate);
        //driver.manage().window().maximize();
    }


    public static void submitForm(String bpOrbpc) {
        if(bpOrbpc.equals("Blood Pressure")){
            driver.get(Utils.BASE_URL);
        }else {
            driver.get(Utils.BASE_URL1);
        }
    }

    public static SelfHealingDriver getDriver(){
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
