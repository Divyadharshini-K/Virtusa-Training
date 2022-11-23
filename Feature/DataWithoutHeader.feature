Feature: This is the login feature for orangehrm

  Scenario: This is the login scenario
    Given you are on the login page
    When you can enter the valid credentials 
    | Admin |
    | admin123 |
    And click on the login button
    Then the user is navigated to the home page
