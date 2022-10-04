@bpcTest
Feature: Invalid (double) values

  Scenario: Test Case 15

    Given user goes to the "Blood Pressure Containerised" application
    When user enters "bloodpressureTest15" in the Email field on the 'Blood Pressure' calculator page
    When user enters "172.5" in the Systolic field on the 'Blood Pressure' calculator page
    When user enters "66.5" in the Diastolic field on the 'Blood Pressure' calculator page
    When user enters "18.2" in the Age field on the 'Blood Pressure' calculator page
    Then user clicks on the submit button on the 'Blood Pressure' calculator page
    Then "Please enter a valid value. The two nearest values are 172 and 173." error message is now displayed under the "Systolic" field on the 'Blood Pressure Containerised' calculator page
    When user enters "172" in the Systolic field on the 'Blood Pressure' calculator page
    Then user clicks on the submit button on the 'Blood Pressure' calculator page
    Then "Please enter a valid value. The two nearest values are 66 and 67." error message is now displayed under the "Diastolic" field on the 'Blood Pressure Containerised' calculator page
    When user enters "66" in the Diastolic field on the 'Blood Pressure' calculator page
    Then user clicks on the submit button on the 'Blood Pressure' calculator page
    Then "Please enter a valid value. The two nearest values are 18 and 19." error message is now displayed under the "Age" field on the 'Blood Pressure Containerised' calculator page