@bpTest
Feature: Check Privacy Hyperlink

  Scenario: Test Case 9

    Given user goes to the "Blood Pressure" application
    When user clicks on the 'Privacy' hyperlink on the 'Blood Pressure' calculator page
    Then 'Privacy Policy' header is displayed on the Privacy Tab on the 'Blood Pressure' calculator page
    Then 'Use this page to detail your site's privacy policy.' body is displayed on the Privacy Tab on the 'Blood Pressure' calculator page
    When user clicks on the 'Home' tab on the 'Blood Pressure' calculator page
    Then 'BP Category Calculator' header is displayed on the Home Tab on the 'Blood Pressure' calculator page
    Then '© 2020 - BPCalculator - Privacy' footer is displayed on the Home Tab on the 'Blood Pressure' calculator page