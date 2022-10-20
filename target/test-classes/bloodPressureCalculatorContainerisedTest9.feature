@bpcTest
Feature: Check Table results - Negative

  Scenario: Test Case 9

    Given user goes to the "Blood Pressure Containerised" application
    When user enters "bloodpressureTest8" in the Email field on the 'Blood Pressure' calculator page
    When user enters "180" in the Systolic field on the 'Blood Pressure' calculator page
    When user enters "90" in the Diastolic field on the 'Blood Pressure' calculator page
    When user enters "40" in the Age field on the 'Blood Pressure' calculator page
    Then user clicks on the submit button on the 'Blood Pressure' calculator page
    Then "High Blood Pressure" results are displayed on the 'Blood Pressure' calculator page
    Then 'Your Previous Readings' header is displayed on the Table 'Blood Pressure Containerised' calculator page
    Then "Low" is not displayed on Table on the the 'Blood Pressure Containerised' calculator page
    Then "120" is not displayed on Table on the the 'Blood Pressure Containerised' calculator page
    Then "60" is not displayed on Table on the the 'Blood Pressure Containerised' calculator page