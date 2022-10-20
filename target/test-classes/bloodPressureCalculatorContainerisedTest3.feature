@bpcTest
Feature: Ideal Blood Pressure

  Scenario: Test Case 3

    Given user goes to the "Blood Pressure Containerised" application
    When user enters "bloodpressureTest3" in the Email field on the 'Blood Pressure' calculator page
    When user enters "100" in the Systolic field on the 'Blood Pressure' calculator page
    When user enters "60" in the Diastolic field on the 'Blood Pressure' calculator page
    When user enters "60" in the Age field on the 'Blood Pressure' calculator page
    Then user clicks on the submit button on the 'Blood Pressure' calculator page
    Then "Normal Blood Pressure" results are displayed on the 'Blood Pressure' calculator page
