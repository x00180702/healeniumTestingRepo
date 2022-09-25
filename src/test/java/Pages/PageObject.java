package Pages;
import helpers.TestPlan;
import locators.WebFormLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;



public class PageObject {
    WebDriver driver;
    WebFormLocators webFormLocators = null;

    public PageObject(){
       this.webFormLocators = new WebFormLocators();
        PageFactory.initElements(TestPlan.getDriver(), webFormLocators);
    }



}