@bpcTest
Feature: Empty Age field

  Scenario: Test Case 10

    Given user goes to the "Blood Pressure Containerised" application
    When user enters "bloodpressureTest10" in the Email field on the 'Blood Pressure' calculator page
    When user clears the Systolic field on the 'Blood Pressure' calculator page
    When user clears the Diastolic field on the 'Blood Pressure' calculator page
    Then user clicks on the submit button on the 'Blood Pressure' calculator page
    Then "Please fill in this field." error message is now displayed under the "Systolic" field on the 'Blood Pressure Containerised' calculator page
    When user enters "120" in the Systolic field on the 'Blood Pressure' calculator page
    Then "Please fill in this field." error message is now displayed under the "Diastolic" field on the 'Blood Pressure Containerised' calculator page
    Then user clicks on the submit button on the 'Blood Pressure' calculator page
    When user enters "40" in the Diastolic field on the 'Blood Pressure' calculator page
    Then "Please fill in this field." error message is now displayed under the "Age" field on the 'Blood Pressure Containerised' calculator page
    Then user clicks on the submit button on the 'Blood Pressure' calculator page
