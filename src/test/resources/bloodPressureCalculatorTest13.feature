@bpTest
Feature: Check Pulse Pressure

  Scenario: Test Case 13

    Given user goes to the "Blood Pressure" application
    When user enters "106" in the Systolic field on the 'Blood Pressure' calculator page
    And user enters "66" in the Diastolic field on the 'Blood Pressure' calculator page
    And user enters "45" in the Age field on the 'Blood Pressure' calculator page
    Then user clicks on the submit button on the 'Blood Pressure' calculator page
    Then "Ideal Blood Pressure" results are displayed on the 'Blood Pressure' calculator page
    Then "Average value for your age group [45-49] is 127/84" results are displayed under the 'Age' Label on the 'Blood Pressure' calculator page
    Then "Mean Arterial Pressure: 150" results are displayed under the 'Mean Arterial Pressure' Label on the 'Blood Pressure' calculator page
    Then "Pulse Pressure: 41" results are displayed under the 'Pulse Pressure' Label on the 'Blood Pressure' calculator page
    And user closes the 'Blood Pressure' calculator page