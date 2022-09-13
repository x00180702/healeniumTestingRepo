import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;



public class PageObject {
    protected static WebDriver driver;

    public PageObject(WebDriver driver){
       this.driver = driver;



        //driver.manage().window().maximize();
        PageFactory.initElements(driver, this);
    }



}