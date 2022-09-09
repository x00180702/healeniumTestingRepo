@smokeTest
Feature: Check using scenario outline

  Scenario Outline: Test Case 17

    Given user goes to the "Blood Pressure" application
    When user enters "<Systolic>" in the Systolic field on the 'Blood Pressure' calculator page
    And user enters "<Diastolic>" in the Diastolic field on the 'Blood Pressure' calculator page
    And user enters "<AgeValue>" in the Age field on the 'Blood Pressure' calculator page
    Then user clicks on the submit button on the 'Blood Pressure' calculator page
    Then "<Result>" results are displayed on the 'Blood Pressure' calculator page
    Then "<AGE>" results are displayed under the 'Age' Label on the 'Blood Pressure' calculator page
    Then "<MAP>" results are displayed under the 'Mean Arterial Pressure' Label on the 'Blood Pressure' calculator page
    Then "<PP>" results are displayed under the 'Pulse Pressure' Label on the 'Blood Pressure' calculator page
    And user closes the 'Blood Pressure' calculator page

    Examples:
      | Systolic | Diastolic | AgeValue | Result                  | AGE                                                | MAP                         | PP                 |
      | 70       | 40        | 15       | Low Blood Pressure      | Average value for your age group [15-19] is 127/84 | Mean Arterial Pressure: 150 | Pulse Pressure: 41 |
      | 90       | 60        | 20       | Ideal Blood Pressure    | Average value for your age group [20-24] is 120/79 | Mean Arterial Pressure: 130 | Pulse Pressure: 31 |
      | 140      | 80        | 25       | Pre-High Blood Pressure | Average value for your age group [25-29] is 121/80 | Mean Arterial Pressure: 193 | Pulse Pressure: 61 |
      | 180      | 100       | 30       | High Blood Pressure     | Average value for your age group [30-34] is 123/82 | Mean Arterial Pressure: 246 | Pulse Pressure: 81 |