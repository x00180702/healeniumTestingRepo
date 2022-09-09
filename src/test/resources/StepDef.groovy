import org.junit.Assert

import static io.cucumber.groovy.EN.*

def TestPlan = new TestPlan();

Given(~/^user goes to the "([^"]*)" application$/) { String appValue->
    TestPlan.submitForm(appValue)

}
When(~/^user enters "([^"]*)" in the Systolic field on the 'Blood Pressure' calculator page$/) { String arg1 ->
    TestPlan.inputSystolic(arg1)
}
When(~/^user enters "([^"]*)" in the Diastolic field on the 'Blood Pressure' calculator page$/) { String arg1 ->
    TestPlan.inputDiastolic(arg1)
}

When(~/^user enters "([^"]*)" in the Age field on the 'Blood Pressure' calculator page$/) { String arg1 ->
    TestPlan.inputAge(arg1)
}

When(~/^user enters "([^"]*)" in the Email field on the 'Blood Pressure' calculator page$/) { String arg1 ->
    TestPlan.inputEmail(arg1)
}

Then(~/^user clicks on the submit button on the 'Blood Pressure' calculator page$/) { ->
    TestPlan.pressSubmitButton()
}

Then(~/^user closes the 'Blood Pressure' calculator page$/) { ->
    TestPlan.cleanUp()
}
Then(~/^"([^"]*)" results are displayed on the 'Blood Pressure' calculator page$/) { String expectedResults ->
    String actualValue = TestPlan.getApplicationResults()
    Assert.assertEquals("Compared values are not equal", expectedResults, actualValue)
}

Then(~/^"([^"]*)" results are not displayed on the 'Blood Pressure' calculator page$/) { String expectedResults ->
    String actualValue = TestPlan.getApplicationResults()
    Assert.assertNotEquals("Compared values are not equal", expectedResults, actualValue)
}

When(~/^user clears the Systolic field on the 'Blood Pressure' calculator page$/) { ->
    TestPlan.clearSystolic()
}
When(~/^user clears the Diastolic field on the 'Blood Pressure' calculator page$/) {  ->
    TestPlan.clearDiastolic()
}

When(~/^user clears the Age field on the 'Blood Pressure' calculator page$/) {  ->
    TestPlan.clearAge()
}

Then(~/^'Systolic must be greater than Diastolic' error message is displayed on the 'Blood Pressure' calculator page$/) { ->
    String actualValue = TestPlan.getListResults()
    Assert.assertEquals("Compared values are not equal", 'Systolic must be greater than Diastolic', actualValue)
}

Then(~/^"([^"]*)" error message is displayed under the "([^"]*)" field on the 'Blood Pressure' calculator page$/) { String expectedResults , String field ->
    String actualValue = TestPlan.getFieldValues(field)
    Assert.assertEquals("Compared values are not equal", expectedResults, actualValue)
}

Then(~/^"([^"]*)" error message is displayed under the "([^"]*)" field on the 'Blood Pressure Containerised' calculator page$/) { String expectedResults , String field ->
    String actualValue = TestPlan.getContainerisedFieldValues(field)
    Assert.assertEquals("Compared values are not equal", expectedResults, actualValue)
}

Then(~/^"([^"]*)" data validation message is displayed under the "([^"]*)" field on the 'Blood Pressure' calculator page$/) { String expectedResults , String field ->
    String actualValue = TestPlan.getFieldErrors(field)
    Assert.assertEquals("Compared values are not equal", expectedResults, actualValue)
}

Then(~/^user clicks on the 'Home' tab on the 'Blood Pressure' calculator page$/) { ->
    TestPlan.clickOnHomeTab()
}

Then(~/^user clicks on the 'Privacy' tab on the 'Blood Pressure' calculator page$/) { ->
    TestPlan.clickOnPrivacyTab()
}

Then(~/^user clicks on the 'Privacy' hyperlink on the 'Blood Pressure' calculator page$/) { ->
    TestPlan.clickOnPrivacyHyperlink()
}

Then(~/^'Privacy Policy' header is displayed on the Privacy Tab on the 'Blood Pressure' calculator page$/) { ->
    String actualValue = TestPlan.getPrivacyHeader()
    Assert.assertEquals("Compared values are not equal", 'Privacy Policy', actualValue)
}

Then(~/^'Use this page to detail your site's privacy policy.' body is displayed on the Privacy Tab on the 'Blood Pressure' calculator page$/) { ->
    String actualValue = TestPlan.getPrivacyBody()
    Assert.assertEquals("Compared values are not equal", 'Use this page to detail your site\'s privacy policy.', actualValue)
}


Then(~/^'BP Category Calculator' header is displayed on the Home Tab on the 'Blood Pressure' calculator page$/) { ->
    String actualValue = TestPlan.getHomeHeader()
    Assert.assertEquals("Compared values are not equal", 'BP Category Calculator', actualValue)
}

Then(~/^'© 2020 - BPCalculator - Privacy' footer is displayed on the Home Tab on the 'Blood Pressure' calculator page$/) { ->
    String actualValue = TestPlan.getHomeFooter()
    Assert.assertEquals("Compared values are not equal", '© 2020 - BPCalculator - Privacy', actualValue)
}

Then(~/^"([^"]*)" results are displayed under the 'Age' Label on the 'Blood Pressure' calculator page$/) { String expectedResults ->
    String actualValue = TestPlan.getAgeResultText()
    Assert.assertEquals("Compared values are not equal", expectedResults, actualValue)
}

Then(~/^"([^"]*)" results are displayed under the 'Mean Arterial Pressure' Label on the 'Blood Pressure' calculator page$/) { String expectedResults ->
    String actualValue = TestPlan.getMAPText()
    Assert.assertEquals("Compared values are not equal", expectedResults, actualValue)
}

Then(~/^"([^"]*)" results are displayed under the 'Pulse Pressure' Label on the 'Blood Pressure' calculator page$/) { String expectedResults ->
    String actualValue = TestPlan.getPPText();
    Assert.assertEquals("Compared values are not equal", expectedResults, actualValue)
}


Then(~/^"([^"]*)" results are not displayed under the 'Age' Label on the 'Blood Pressure' calculator page$/) { String expectedResults ->
    String actualValue = TestPlan.getAgeResultText()
    Assert.assertNotEquals("Compared values are not equal", expectedResults, actualValue)
}

Then(~/^"([^"]*)" results are not displayed under the 'Mean Arterial Pressure' Label on the 'Blood Pressure' calculator page$/) { String expectedResults ->
    String actualValue = TestPlan.getMAPText()
    Assert.assertNotEquals("Compared values are not equal", expectedResults, actualValue)
}

Then(~/^"([^"]*)" results are not displayed under the 'Pulse Pressure' Label on the 'Blood Pressure' calculator page$/) { String expectedResults ->
    String actualValue = TestPlan.getPPText();
    Assert.assertNotEquals("Compared values are not equal", expectedResults, actualValue)
}

Then(~/^"([^"]*)" error message is displayed on the 'Blood Pressure Containerised' calculator page$/) { String expectedResults ->
    String actualValue = TestPlan.getBPCErrorText()
    Assert.assertEquals("Compared values are not equal", expectedResults, actualValue)
}
