Feature: This is the login feature for orange hrm

  Scenario Outline: This is the login scenario for hrm
    Given you are redirected to the login page
    When you can enter "<user>" and "<password>" 
    And click login button
    Then the user is redirected to home page
    
    Examples:
    |user|password|
    |Admin|admin123|
    |admin|admin321|