package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebFormLocators {

    @FindBy(id="BP_Systolic")
    public WebElement systolic;

    @FindBy(id="BP_Diastolic")
    public WebElement diastolic;

    @FindBy(id="BP_Age")
    public WebElement ageField;

    @FindBy(id="BP_Email")
    public WebElement emailField;

    @FindBy(css="input[value='Submit']")
    public WebElement submitButton;

    @FindBy(xpath="//label[@name='calcResults']")
    public WebElement getResults;

    @FindBy(css="div[class*=text-danger] > ul > li")
    public WebElement getListedResults;

    @FindBy(xpath = "//ul/li/a[text()='Privacy']")
    public WebElement clickOnPrivacyTab;

    @FindBy(xpath = "//ul/li/a[text()='Home']")
    public WebElement clickOnHomeTab;

    @FindBy(xpath = "//footer/div/a[text()='Privacy']")
    public WebElement clickOnPrivacyHyperlink;

    @FindBy(css="main[role='main'] > h1")
    public WebElement getPrivacyHeader;

    @FindBy(css="main[role='main'] > p")
    public WebElement getPrivacyBody;

    @FindBy(css="main[role='main'] > h4")
    public WebElement getHomeHeader;

    @FindBy(css="footer>div")
    public WebElement getHomeFooter;


    @FindBy(xpath="//label[@name='AgeResults']")
    public WebElement getAgeCalculation;

    @FindBy(xpath="//label[@id='mapResults']")
    public WebElement getMAPValue;

    @FindBy(xpath="//label[@id='ppResults']")
    public WebElement getPPValue;

    @FindBy(xpath="//div[@name='error']")
    public WebElement getBPCError;


}