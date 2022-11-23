@Login
Feature: This is the login feature

  Scenario: This is login scenario
    Given user is on login page
    When the user enters the valid username
    And password clicks on the login button
    Then the user should be navigated to home page
