@bpTest
Feature: Empty Age field

  Scenario: Test Case 10

    Given user goes to the "Blood Pressure" application
    When user clears the Systolic field on the 'Blood Pressure' calculator page
    When user clears the Diastolic field on the 'Blood Pressure' calculator page
    And user clears the Age field on the 'Blood Pressure' calculator page
    Then user clicks on the submit button on the 'Blood Pressure' calculator page
    Then "The Systolic field is required." error message is displayed under the "Systolic" field on the 'Blood Pressure' calculator page
    Then "The Diastolic field is required." error message is displayed under the "Diastolic" field on the 'Blood Pressure' calculator page
    Then "The Age field is required." error message is displayed under the "Age" field on the 'Blood Pressure' calculator page
    And user closes the 'Blood Pressure' calculator page