// Page
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebForm extends PageObject{

    @FindBy(id="BP_Systolic")
    WebElement systolic;

    @FindBy(id="BP_Diastolic")
    WebElement diastolic;

    @FindBy(id="BP_Age")
    WebElement ageField;

    @FindBy(id="BP_Email")
    WebElement emailField;

    @FindBy(css="input[value='Submit']")
    WebElement submitButton;

    @FindBy(xpath="//label[@name='calcResults']")
    WebElement getResults;

    @FindBy(css="div[class*=text-danger] > ul > li")
    WebElement getListedResults;

    @FindBy(xpath = "//ul/li/a[text()='Privacy']")
    WebElement clickOnPrivacyTab;

    @FindBy(xpath = "//ul/li/a[text()='Home']")
    WebElement clickOnHomeTab;

    @FindBy(xpath = "//footer/div/a[text()='Privacy']")
    WebElement clickOnPrivacyHyperlink;

    @FindBy(css="main[role='main'] > h1")
    WebElement getPrivacyHeader;

    @FindBy(css="main[role='main'] > p")
    WebElement getPrivacyBody;

    @FindBy(css="main[role='main'] > h4")
    WebElement getHomeHeader;

    @FindBy(css="footer>div")
    WebElement getHomeFooter;


    @FindBy(xpath="//label[@name='AgeResults']")
    WebElement getAgeCalculation;

    @FindBy(xpath="//label[@id='mapResults']")
    WebElement getMAPValue;

    @FindBy(xpath="//label[@id='ppResults']")
    WebElement getPPValue;

    @FindBy(xpath="//div[@name='error']")
    WebElement getBPCError;

    public WebForm(WebDriver driver) {
        super(driver);
    }

    public void inputSystolic(String arg1){
        systolic.clear();
        systolic.sendKeys(arg1);
    }

    public void inputDiastolic(String arg1){
        diastolic.clear();
        diastolic.sendKeys(arg1);

    }

    public void inputAge(String arg1){
        ageField.clear();
        ageField.sendKeys(arg1);

    }

    public void inputEmail(String arg1){
        emailField.clear();
        emailField.sendKeys(arg1);

    }

    public void clearSystolic(){
        systolic.clear();
    }

    public void clearDiastolic(){
        diastolic.clear();

    }

    public void clearAge(){
        ageField.clear();

    }

    public void pressSubmitButton(){
        submitButton.click();
    }

    public String getAppResults(){
        return getResults.getText();
    }

    public String getListedResults(){
        return getListedResults.getText();
    }

    public String getPrivacyHeaderText(){
        return getPrivacyHeader.getText();
    }

    public String getPrivacyBodyText(){
        return getPrivacyBody.getText();
    }

    public void selectHomeTab(){
        clickOnHomeTab.click();
    }

    public void selectPrivacyTab(){
        clickOnPrivacyTab.click();
    }

    public void selectPrivacyHyperlink(){
        clickOnPrivacyHyperlink.click();
    }

    public String getFieldValues(String fieldValue){

        WebElement fieldResult = driver.findElement(By.id("BP_"+fieldValue+"-error"));
        return fieldResult.getText();
    }

    public String getContainerisedFieldValues(String fieldValue){

        WebElement fieldResult = driver.findElement(By.id("BP_"+fieldValue+""));
        return fieldResult.getAttribute("validationMessage");
    }

    public String getFieldErrors(String fieldValue){

        WebElement fieldResult = driver.findElement(By.cssSelector("span[data-valmsg-for='BP."+fieldValue+"']"));
        return fieldResult.getText();
    }

    public String getHomeFooterText(){
        return getHomeFooter.getText();
    }

    public String getHomeHeaderText(){
        return getHomeHeader.getText();
    }

    public String getAgeResultText(){
        return getAgeCalculation.getText();
    }

    public String getMAPText(){
        return getMAPValue.getText();
    }

    public String getPPText(){
        return getPPValue.getText();
    }

    public String getBloodPressureContainerErrorValues(){

        return getBPCError.getText();
    }
}