package com.FeatureStepDefs;

import actions.WebFromActions;
import helpers.TestPlan;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class stepDefs {
WebFromActions webForm = new WebFromActions();
@Given("user goes to the {string} application")
public void user_goes_to_the_application(String string) {
TestPlan.submitForm(string);
}

@When("user enters {string} in the Systolic field on the {string} calculator page")
public void user_enters_in_the_systolic_field_on_the_calculator_page(String string, String string2) {
    webForm = new WebFromActions();
    webForm.inputSystolic(string);
}

@When("user enters {string} in the Diastolic field on the {string} calculator page")
public void user_enters_in_the_diastolic_field_on_the_calculator_page(String string, String string2) {
    webForm = new WebFromActions();
    webForm.inputDiastolic(string);
}

@When("user enters {string} in the Age field on the {string} calculator page")
public void user_enters_in_the_age_field_on_the_calculator_page(String string, String string2) {
    webForm = new WebFromActions();
    webForm.inputAge(string);
}

@When("user enters {string} in the Email field on the {string} calculator page")
public void user_enters_in_the_email_field_on_the_calculator_page(String string, String string2) {
    webForm = new WebFromActions();
    webForm.inputEmail(string);
}

@Then("user clicks on the submit button on the {string} calculator page")
public void user_clicks_on_the_submit_button_on_the_calculator_page(String string) {
    webForm = new WebFromActions();
    webForm.pressSubmitButton();
}

@Then("{string} results are displayed on the {string} calculator page")
public void results_are_displayed_on_the_calculator_page(String expectedResults, String string2) {
    webForm = new WebFromActions();
    String actualValue = webForm.getAppResults();
    Assert.assertEquals("Compared values are not equal", expectedResults, actualValue);
}

@Then("{string} results are not displayed on the {string} calculator page")
public void results_are_not_displayed_on_the_calculator_page(String expectedResults, String string2){
    webForm = new WebFromActions();
    String actualValue = webForm.getAppResults();
    Assert.assertNotEquals("Compared values are not equal", expectedResults, actualValue);
}

@When("user clears the Systolic field on the {string} calculator page")
    public void clear_systolic_field(String field){
    webForm = new WebFromActions();
    webForm.clearSystolic();
}
@When("user clears the Diastolic field on the {string} calculator page")
    public void clear_diastolic_field(String field){
    webForm = new WebFromActions();
    webForm.clearDiastolic();
}

@When("user clears the Age field on the {string} calculator page")
    public void clear_age_field(String field){
    webForm = new WebFromActions();
    webForm.clearAge();
}

@Then("'Systolic must be greater than Diastolic' error message is displayed on the {string} calculator page")
    public void get_list_result(String field){
    webForm = new WebFromActions();
    String actualValue = webForm.getListedResults();
    Assert.assertEquals("Compared values are not equal", "Systolic must be greater than Diastolic", actualValue);
}

@Then("{string} error message is displayed under the {string} field on the {string} calculator page")
    public void get_error_result(String expectedResults, String field, String f2){
    webForm = new WebFromActions();
    String actualValue = webForm.getFieldValues(field);
    Assert.assertEquals("Compared values are not equal", expectedResults, actualValue);
}

@Then("{string} error message is displayed under the {string} field on the 'Blood Pressure Containerised' calculator page")
    public void get_error_result2(String expectedResults, String field){
    webForm = new WebFromActions();
    String actualValue = webForm.getContainerisedFieldValues(field);
    Assert.assertEquals("Compared values are not equal", expectedResults, actualValue);
}

@Then("{string} data validation message is displayed under the {string} field on the {string} calculator page")
    public void get_error_result3(String expectedResults, String field, String f2){
    webForm = new WebFromActions();
    String actualValue = webForm.getFieldErrors(field);
    Assert.assertEquals("Compared values are not equal", expectedResults, actualValue);
}

@Then("user clicks on the 'Home' tab on the {string} calculator page")
    public void click_on_tab(String string){
    webForm = new WebFromActions();
    webForm.selectHomeTab();
}

@Then("user clicks on the 'Privacy' tab on the {string} calculator page")
    public void click_on_tab2(String string){
    webForm = new WebFromActions();
    webForm.selectPrivacyTab();
}

@Then("user clicks on the 'Privacy' hyperlink on the {string} calculator page")
    public void click_on_tab3(String string){
    webForm = new WebFromActions();
    webForm.selectPrivacyHyperlink();
}

@Then("'Privacy Policy' header is displayed on the Privacy Tab on the {string} calculator page")
    public void get_header_tab(String string){
    webForm = new WebFromActions();
    String actualValue = webForm.getPrivacyHeaderText();
    Assert.assertEquals("Compared values are not equal", "Privacy Policy", actualValue);
}

@Then("'Use this page to detail your site's privacy policy.' body is displayed on the Privacy Tab on the {string} calculator page")
    public void get_header_tab2(String string){
    webForm = new WebFromActions();
    String actualValue = webForm.getPrivacyBodyText();
    Assert.assertEquals("Compared values are not equal", "Use this page to detail your site's privacy policy.", actualValue);
}


@Then("'BP Category Calculator' header is displayed on the Home Tab on the {string} calculator page")
    public void get_header_tab3(String string){
    webForm = new WebFromActions();
    String actualValue = webForm.getHomeHeaderText();
    Assert.assertEquals("Compared values are not equal", "BP Category Calculator", actualValue);
}

@Then("'© 2020 - BPCalculator - Privacy' footer is displayed on the Home Tab on the {string} calculator page")
    public void get_header_tab4(String string){
    webForm = new WebFromActions();
    String actualValue = webForm.getHomeFooterText();
    Assert.assertEquals("Compared values are not equal", "© 2020 - BPCalculator - Privacy", actualValue);
}

@Then("{string} results are displayed under the 'Age' Label on the {string} calculator page")
    public void get_age_tab(String expectedResults, String string){
    webForm = new WebFromActions();
    String actualValue = webForm.getAgeResultText();
    Assert.assertEquals("Compared values are not equal", expectedResults, actualValue);
    }

@Then("{string} results are displayed under the 'Mean Arterial Pressure' Label on the {string} calculator page")
    public void get_map_tab(String expectedResults, String string){
    webForm = new WebFromActions();
    String actualValue = webForm.getMAPText();
    Assert.assertEquals("Compared values are not equal", expectedResults, actualValue);
}

@Then("{string} results are displayed under the 'Pulse Pressure' Label on the {string} calculator page")
    public void get_pp_tab(String expectedResults, String string){
    webForm = new WebFromActions();
    String actualValue = webForm.getPPText();
    Assert.assertEquals("Compared values are not equal", expectedResults, actualValue);
}


@Then("{string} results are not displayed under the 'Age' Label on the {string} calculator page")
    public void get_agep_tab(String expectedResults, String string){
    webForm = new WebFromActions();
    String actualValue = webForm.getAgeResultText();
    Assert.assertNotEquals("Compared values are not equal", expectedResults, actualValue);
}

@Then("{string} results are not displayed under the 'Mean Arterial Pressure' Label on the {string} calculator page")
    public void get_map_neg_tab(String expectedResults, String string){
    webForm = new WebFromActions();
    String actualValue = webForm.getMAPText();
    Assert.assertNotEquals("Compared values are not equal", expectedResults, actualValue);
}

@Then("{string} results are not displayed under the 'Pulse Pressure' Label on the {string} calculator page")
    public void get_pp_neg_tab(String expectedResults, String string){
    webForm = new WebFromActions();
    String actualValue = webForm.getPPText();
    Assert.assertNotEquals("Compared values are not equal", expectedResults, actualValue);
}

@Then("{string} error message is displayed on the 'Blood Pressure Containerised' calculator page")
    public void get_bpcp_tab(String expectedResults, String string){
    webForm = new WebFromActions();
    String actualValue = webForm.getBloodPressureContainerErrorValues();
    Assert.assertEquals("Compared values are not equal", expectedResults, actualValue);
}

@Then("'Your Previous Readings' header is displayed on the Table 'Blood Pressure Containerised' calculator page")
public void get_BloodPressureContainer_TableHeader(){
    webForm = new WebFromActions();
    String actualValue = webForm.getBloodPressureContainerTableHeader();
    Assert.assertEquals("Compared values are not equal", "Your Previous Readings", actualValue);
}

@Then("{string} is displayed on Table on the the 'Blood Pressure Containerised' calculator page")
public void get_BloodPressureContainer_TableBody(String expectedResults){
    webForm = new WebFromActions();
    Assert.assertTrue("Compared values are not equal", webForm.getBloodPressureContainerTableBody(expectedResults));

}

@Then("{string} is not displayed on Table on the the 'Blood Pressure Containerised' calculator page")
public void get_BloodPressureContainer_Not_TableBody(String expectedResults){
    webForm = new WebFromActions();
    Assert.assertFalse("Compared values are not equal", webForm.getBloodPressureContainerTableBody(expectedResults));

}


}
