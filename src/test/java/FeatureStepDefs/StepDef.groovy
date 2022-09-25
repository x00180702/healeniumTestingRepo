package FeatureStepDefs

import helpers.TestPlan
import actions.WebFromActions
import org.junit.Assert
import static io.cucumber.groovy.EN.*

def webForm = new WebFromActions();

Given(~/^user goes to the "([^"]*)" application$/) { String appValue->
    TestPlan.submitForm(appValue);

}
When(~/^user enters "([^"]*)" in the Systolic field on the 'Blood Pressure' calculator page$/) { String arg1 ->
    webForm = new WebFromActions()
    webForm.inputSystolic(arg1)
}
When(~/^user enters "([^"]*)" in the Diastolic field on the 'Blood Pressure' calculator page$/) { String arg1 ->
    webForm = new WebFromActions()
    webForm.inputDiastolic(arg1)
}

When(~/^user enters "([^"]*)" in the Age field on the 'Blood Pressure' calculator page$/) { String arg1 ->
    webForm = new WebFromActions()
    webForm.inputAge(arg1)
}

When(~/^user enters "([^"]*)" in the Email field on the 'Blood Pressure' calculator page$/) { String arg1 ->
    webForm = new WebFromActions()
    webForm.inputEmail(arg1)
}

Then(~/^user clicks on the submit button on the 'Blood Pressure' calculator page$/) { ->
    webForm = new WebFromActions()
    webForm.pressSubmitButton()
}

Then(~/^user closes the 'Blood Pressure' calculator page$/) { ->
    webForm.cleanUp()
}
Then(~/^"([^"]*)" results are displayed on the 'Blood Pressure' calculator page$/) { String expectedResults ->
    webForm = new WebFromActions()
    String actualValue = webForm.getAppResults()
    Assert.assertEquals("Compared values are not equal", expectedResults, actualValue)
}

Then(~/^"([^"]*)" results are not displayed on the 'Blood Pressure' calculator page$/) { String expectedResults ->
    webForm = new WebFromActions()
    String actualValue = webForm.getAppResults()
    Assert.assertNotEquals("Compared values are not equal", expectedResults, actualValue)
}

When(~/^user clears the Systolic field on the 'Blood Pressure' calculator page$/) { ->
    webForm = new WebFromActions()
    webForm.clearSystolic()
}
When(~/^user clears the Diastolic field on the 'Blood Pressure' calculator page$/) {  ->
    webForm = new WebFromActions()
    webForm.clearDiastolic()
}

When(~/^user clears the Age field on the 'Blood Pressure' calculator page$/) {  ->
    webForm = new WebFromActions()
    webForm.clearAge()
}

Then(~/^'Systolic must be greater than Diastolic' error message is displayed on the 'Blood Pressure' calculator page$/) { ->
    webForm = new WebFromActions()
    String actualValue = webForm.getListedResults()
    Assert.assertEquals("Compared values are not equal", 'Systolic must be greater than Diastolic', actualValue)
}

Then(~/^"([^"]*)" error message is displayed under the "([^"]*)" field on the 'Blood Pressure' calculator page$/) { String expectedResults , String field ->
    webForm = new WebFromActions()
    String actualValue = webForm.getFieldValues(field)
    Assert.assertEquals("Compared values are not equal", expectedResults, actualValue)
}

Then(~/^"([^"]*)" error message is displayed under the "([^"]*)" field on the 'Blood Pressure Containerised' calculator page$/) { String expectedResults , String field ->
    webForm = new WebFromActions()
    String actualValue = webForm.getContainerisedFieldValues(field)
    Assert.assertEquals("Compared values are not equal", expectedResults, actualValue)
}

Then(~/^"([^"]*)" data validation message is displayed under the "([^"]*)" field on the 'Blood Pressure' calculator page$/) { String expectedResults , String field ->
    webForm = new WebFromActions()
    String actualValue = webForm.getFieldErrors(field)
    Assert.assertEquals("Compared values are not equal", expectedResults, actualValue)
}

Then(~/^user clicks on the 'Home' tab on the 'Blood Pressure' calculator page$/) { ->
    webForm = new WebFromActions()
    webForm.selectHomeTab()
}

Then(~/^user clicks on the 'Privacy' tab on the 'Blood Pressure' calculator page$/) { ->
    webForm = new WebFromActions()
    webForm.selectPrivacyTab()
}

Then(~/^user clicks on the 'Privacy' hyperlink on the 'Blood Pressure' calculator page$/) { ->
    webForm = new WebFromActions()
    webForm.selectPrivacyHyperlink()
}

Then(~/^'Privacy Policy' header is displayed on the Privacy Tab on the 'Blood Pressure' calculator page$/) { ->
    webForm = new WebFromActions()
    String actualValue = webForm.getPrivacyHeaderText()
    Assert.assertEquals("Compared values are not equal", 'Privacy Policy', actualValue)
}

Then(~/^'Use this page to detail your site's privacy policy.' body is displayed on the Privacy Tab on the 'Blood Pressure' calculator page$/) { ->
    webForm = new WebFromActions()
    String actualValue = webForm.getPrivacyBodyText()
    Assert.assertEquals("Compared values are not equal", 'Use this page to detail your site\'s privacy policy.', actualValue)
}


Then(~/^'BP Category Calculator' header is displayed on the Home Tab on the 'Blood Pressure' calculator page$/) { ->
    webForm = new WebFromActions()
    String actualValue = webForm.getHomeHeaderText()
    Assert.assertEquals("Compared values are not equal", 'BP Category Calculator', actualValue)
}

Then(~/^'© 2020 - BPCalculator - Privacy' footer is displayed on the Home Tab on the 'Blood Pressure' calculator page$/) { ->
    webForm = new WebFromActions()
    String actualValue = webForm.getHomeFooterText()
    Assert.assertEquals("Compared values are not equal", '© 2020 - BPCalculator - Privacy', actualValue)
}

Then(~/^"([^"]*)" results are displayed under the 'Age' Label on the 'Blood Pressure' calculator page$/) { String expectedResults ->
    webForm = new WebFromActions()
    String actualValue = webForm.getAgeResultText()
    Assert.assertEquals("Compared values are not equal", expectedResults, actualValue)
}

Then(~/^"([^"]*)" results are displayed under the 'Mean Arterial Pressure' Label on the 'Blood Pressure' calculator page$/) { String expectedResults ->
    webForm = new WebFromActions()
    String actualValue = webForm.getMAPText()
    Assert.assertEquals("Compared values are not equal", expectedResults, actualValue)
}

Then(~/^"([^"]*)" results are displayed under the 'Pulse Pressure' Label on the 'Blood Pressure' calculator page$/) { String expectedResults ->
    webForm = new WebFromActions()
    String actualValue = webForm.getPPText();
    Assert.assertEquals("Compared values are not equal", expectedResults, actualValue)
}


Then(~/^"([^"]*)" results are not displayed under the 'Age' Label on the 'Blood Pressure' calculator page$/) { String expectedResults ->
    webForm = new WebFromActions()
    String actualValue = webForm.getAgeResultText()
    Assert.assertNotEquals("Compared values are not equal", expectedResults, actualValue)
}

Then(~/^"([^"]*)" results are not displayed under the 'Mean Arterial Pressure' Label on the 'Blood Pressure' calculator page$/) { String expectedResults ->
    webForm = new WebFromActions()
    String actualValue = webForm.getMAPText()
    Assert.assertNotEquals("Compared values are not equal", expectedResults, actualValue)
}

Then(~/^"([^"]*)" results are not displayed under the 'Pulse Pressure' Label on the 'Blood Pressure' calculator page$/) { String expectedResults ->
    webForm = new WebFromActions()
    String actualValue = webForm.getPPText();
    Assert.assertNotEquals("Compared values are not equal", expectedResults, actualValue)
}

Then(~/^"([^"]*)" error message is displayed on the 'Blood Pressure Containerised' calculator page$/) { String expectedResults ->
    webForm = new WebFromActions()
    String actualValue = webForm.getBloodPressureContainerErrorValues()
    Assert.assertEquals("Compared values are not equal", expectedResults, actualValue)
}
