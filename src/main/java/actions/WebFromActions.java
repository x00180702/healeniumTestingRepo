package actions;

import helpers.TestPlan;
import io.percy.selenium.Percy;
import locators.WebFormLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static helpers.TestPlan.getDriver;

public class WebFromActions {

    private static Percy percy;
     WebFormLocators webFormLocators = null;

    public WebFromActions(){
        this.webFormLocators = new WebFormLocators();
        PageFactory.initElements(TestPlan.getDriver(), webFormLocators);
    }

    public void inputSystolic(String arg1){
        webFormLocators.systolic.clear();
        webFormLocators.systolic.sendKeys(arg1);
    }

    public void percyScreenShot(String shotName){
        percy = new Percy(TestPlan.getDriver());
        percy.snapshot(shotName);
    }

    public void inputDiastolic(String arg1){
        webFormLocators.diastolic.clear();
        webFormLocators.diastolic.sendKeys(arg1);

    }

    public void inputAge(String arg1){
        webFormLocators.ageField.clear();
        webFormLocators.ageField.sendKeys(arg1);

    }

    public void inputEmail(String arg1){
        webFormLocators.emailField.clear();
        webFormLocators.emailField.sendKeys(arg1);

    }

    public void clearSystolic(){
        webFormLocators.systolic.clear();
    }

    public void clearDiastolic(){
        webFormLocators.diastolic.clear();

    }

    public void clearAge(){
        webFormLocators.ageField.clear();

    }

    public void pressSubmitButton(){
        webFormLocators.submitButton.click();
    }

    public String getAppResults(){
        return webFormLocators.getResults.getText();
    }

    public String getListedResults(){
        return webFormLocators.getListedResults.getText();
    }

    public String getPrivacyHeaderText(){
        return webFormLocators.getPrivacyHeader.getText();
    }

    public String getPrivacyBodyText(){
        return webFormLocators.getPrivacyBody.getText();
    }

    public void selectHomeTab(){
        webFormLocators.clickOnHomeTab.click();
    }

    public void selectPrivacyTab(){
        webFormLocators.clickOnPrivacyTab.click();
    }

    public void selectPrivacyHyperlink(){
        webFormLocators.clickOnPrivacyHyperlink.click();
    }

    public String getFieldValues(String fieldValue){

        WebElement fieldResult = getDriver().findElement(By.id("BP_"+fieldValue+"-error"));
        return fieldResult.getText();
    }

    public String getContainerisedFieldValues(String fieldValue){

        WebElement fieldResult = getDriver().findElement(By.id("BP_"+fieldValue+""));
        return fieldResult.getAttribute("validationMessage");
    }

    public String getFieldErrors(String fieldValue){

        WebElement fieldResult = getDriver().findElement(By.cssSelector("span[data-valmsg-for='BP."+fieldValue+"']"));
        return fieldResult.getText();
    }

    public String getHomeFooterText(){
        return webFormLocators.getHomeFooter.getText();
    }

    public String getHomeHeaderText(){
        return webFormLocators.getHomeHeader.getText();
    }

    public String getAgeResultText(){
        return webFormLocators.getAgeCalculation.getText();
    }

    public String getMAPText(){
        return webFormLocators.getMAPValue.getText();
    }

    public String getPPText(){
        return webFormLocators.getPPValue.getText();
    }

    public String getBloodPressureContainerErrorValues(){

        return webFormLocators.getBPCError.getText();
    }

    public String getBloodPressureContainerTableHeader(){

        return webFormLocators.getTableHeader.getText();
    }

    public boolean getBloodPressureContainerTableBody(String body){

        return webFormLocators.getTableBody.getText().contains(body);
    }
}
