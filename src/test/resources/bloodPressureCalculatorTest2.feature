@bpTest
Feature: Pre-High Blood Pressure

  Scenario: Test Case 2

   Given user goes to the "Blood Pressure" application
   When user enters "100" in the Systolic field on the 'Blood Pressure' calculator page
   When user enters "80" in the Diastolic field on the 'Blood Pressure' calculator page
   When user enters "80" in the Age field on the 'Blood Pressure' calculator page
    Then user clicks on the submit button on the 'Blood Pressure' calculator page
   Then "Pre-High Blood Pressure" results are displayed on the 'Blood Pressure' calculator page
   And user closes the 'Blood Pressure' calculator page
