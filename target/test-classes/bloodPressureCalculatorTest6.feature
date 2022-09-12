@bpTest
Feature: Out of range values

  Scenario: Test Case 6

    Given user goes to the "Blood Pressure" application
    When user enters "200" in the Systolic field on the 'Blood Pressure' calculator page
    When user enters "20" in the Diastolic field on the 'Blood Pressure' calculator page
    When user enters "99" in the Age field on the 'Blood Pressure' calculator page
    Then user clicks on the submit button on the 'Blood Pressure' calculator page
    Then "Invalid Systolic Value" error message is displayed under the "Systolic" field on the 'Blood Pressure' calculator page
    Then "Invalid Diastolic Value" error message is displayed under the "Diastolic" field on the 'Blood Pressure' calculator page
    And user closes the 'Blood Pressure' calculator page