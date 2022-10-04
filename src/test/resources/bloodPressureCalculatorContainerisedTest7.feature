@bpcTest
Feature: Empty Field

  Scenario: Test Case 7

    Given user goes to the "Blood Pressure Containerised" application
    When user enters "bloodpressureTest7" in the Email field on the 'Blood Pressure' calculator page
    When user clears the Systolic field on the 'Blood Pressure' calculator page
    When user clears the Diastolic field on the 'Blood Pressure' calculator page
    Then user clicks on the submit button on the 'Blood Pressure' calculator page
    Then "Please fill out this field." error message is now displayed under the "Systolic" field on the 'Blood Pressure Containerised' calculator page
    When user enters "120" in the Systolic field on the 'Blood Pressure' calculator page
    Then "Please fill out this field." error message is now displayed under the "Diastolic" field on the 'Blood Pressure Containerised' calculator page
    Then user clicks on the submit button on the 'Blood Pressure' calculator page