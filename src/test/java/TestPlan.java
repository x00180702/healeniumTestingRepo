
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

import java.util.Objects;

class TestPlan {
    WebDriver driver;

    WebForm webForm;

    @BeforeSuite
    public static void main(String[] args) {
        // ChromeDriver location set up in Utils class
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
    }



    public void submitForm(String bpOrbpc) {
        driver = new ChromeDriver();
        if(bpOrbpc.equals("Blood Pressure")){
          driver.get(Utils.BASE_URL);
        }else {
         driver.get(Utils.BASE_URL1);
        }


      //  webForm = new WebForm(driver);
        driver.manage().window().maximize();
    }

    public void inputSystolic(String arg1) {
        webForm.inputSystolic(arg1);
    }

    public void inputDiastolic(String arg1) {
        webForm.inputDiastolic(arg1);
    }

    public void inputAge(String arg1) {
        webForm.inputAge(arg1);
    }

    public void inputEmail(String arg1) {
        webForm.inputEmail(arg1);
    }
    public void pressSubmitButton() {
        webForm.pressSubmitButton();
    }

    public String getApplicationResults() {
        return webForm.getAppResults();
    }

    public String getListResults() {
        return webForm.getListedResults();
    }

    @AfterTest(alwaysRun = true)
    public void cleanUp() {
        System.out.println("TEST IS OVER!");
//        WebForm.driver.quit();
    }

    public void clearSystolic() {
        webForm.clearSystolic();
    }

    public void clearDiastolic() {
        webForm.clearDiastolic();
    }

    public void clearAge() {
        webForm.clearAge();
    }

    public String getFieldValues(String fieldValue) {
        return webForm.getFieldValues(fieldValue);
    }

    public String getContainerisedFieldValues(String fieldValue) {
        return webForm.getContainerisedFieldValues(fieldValue);
    }

    public String getFieldErrors(String fieldValue) {
        return webForm.getFieldErrors(fieldValue);
    }

    public void clickOnHomeTab() {
        webForm.selectHomeTab();
    }

    public void clickOnPrivacyTab() {
        webForm.selectPrivacyTab();
    }

    public void clickOnPrivacyHyperlink() {
        webForm.selectPrivacyHyperlink();
    }

    public String getPrivacyHeader() {
        return webForm.getPrivacyHeaderText();
    }

    public String getPrivacyBody() {
        return webForm.getPrivacyBodyText();
    }

    public String getHomeHeader() {
        return webForm.getHomeHeaderText();
    }

    public String getHomeFooter() {
        return webForm.getHomeFooterText();
    }


    public String getAgeResultText() {
        return webForm.getAgeResultText();
    }

    public String getMAPText() {
        return webForm.getMAPText();
    }

    public String getPPText() {
        return webForm.getPPText();
    }

    public String getBPCErrorText() {
        return webForm.getBloodPressureContainerErrorValues();
    }
}