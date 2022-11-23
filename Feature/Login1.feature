Feature: This is the login feature

  Scenario: This is login scenario
    Given user is on the login page
    When the user enters the valid credentials "Admin" and "admin123"
    And clicks on the login button
    Then the user should be navigated to the home page
