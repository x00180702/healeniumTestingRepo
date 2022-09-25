@bpTest
Feature: Invalid (char) values

  Scenario: Test Case 16

    Given user goes to the "Blood Pressure" application
    When user enters "e" in the Systolic field on the 'Blood Pressure' calculator page
    When user enters "e" in the Diastolic field on the 'Blood Pressure' calculator page
    When user enters "e" in the Age field on the 'Blood Pressure' calculator page
    Then user clicks on the submit button on the 'Blood Pressure' calculator page
    Then "Please enter a valid number." data validation message is displayed under the "Systolic" field on the 'Blood Pressure' calculator page
    Then "Please enter a valid number." data validation message is displayed under the "Diastolic" field on the 'Blood Pressure' calculator page
    Then "Please enter a valid number." data validation message is displayed under the "Age" field on the 'Blood Pressure' calculator page