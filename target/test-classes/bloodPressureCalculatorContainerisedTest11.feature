@bpcTest
  Feature: Out of range age value

  Scenario: Test Case 11

    Given user goes to the "Blood Pressure Containerised" application
    When user enters "bloodpressureTest11" in the Email field on the 'Blood Pressure' calculator page
    When user enters "200" in the Systolic field on the 'Blood Pressure' calculator page
    When user enters "60" in the Diastolic field on the 'Blood Pressure' calculator page
    When user enters "99" in the Age field on the 'Blood Pressure' calculator page
    Then user clicks on the submit button on the 'Blood Pressure' calculator page
    Then "Invalid Systolic Value - too high. Please enter value below 190" error message is displayed on the 'Blood Pressure Containerised' calculator page
    When user enters "bloodpressureTest11" in the Email field on the 'Blood Pressure' calculator page
    When user enters "180" in the Systolic field on the 'Blood Pressure' calculator page
    When user enters "600" in the Diastolic field on the 'Blood Pressure' calculator page
    When user enters "99" in the Age field on the 'Blood Pressure' calculator page
    Then user clicks on the submit button on the 'Blood Pressure' calculator page
    Then "Invalid Diastolic Value - too high. Please enter value below 190" error message is displayed on the 'Blood Pressure Containerised' calculator page
    When user enters "bloodpressureTest11" in the Email field on the 'Blood Pressure' calculator page
    When user enters "180" in the Systolic field on the 'Blood Pressure' calculator page
    When user enters "70" in the Diastolic field on the 'Blood Pressure' calculator page
    When user enters "101" in the Age field on the 'Blood Pressure' calculator page
    Then user clicks on the submit button on the 'Blood Pressure' calculator page
    Then "Invalid Age Range. Calculations are for ages over 15 & under 100" error message is displayed on the 'Blood Pressure Containerised' calculator page
