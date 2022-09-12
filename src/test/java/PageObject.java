import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;



public class PageObject {
    protected static WebDriver driver;

    public PageObject(WebDriver driver){
       // this.driver = driver;
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--headless");
        WebDriverManager.chromedriver().setup();

        //driver.manage().window().maximize();
        PageFactory.initElements(driver, this);
    }



}