@bpTest
Feature: High Blood Pressure

  Scenario: Test Case 4

    Given user goes to the "Blood Pressure" application
    When user enters "180" in the Systolic field on the 'Blood Pressure' calculator page
    When user enters "90" in the Diastolic field on the 'Blood Pressure' calculator page
    When user enters "40" in the Age field on the 'Blood Pressure' calculator page
    Then user clicks on the submit button on the 'Blood Pressure' calculator page
    Then "High Blood Pressure" results are displayed on the 'Blood Pressure' calculator page
