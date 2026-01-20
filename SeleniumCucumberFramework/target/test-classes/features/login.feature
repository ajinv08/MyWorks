Feature: Validating Login Functionality

  @smoke
  Scenario: Login with valid credentials
    Given User is on the login page
    When User enters username "Admin" and password "admin123"
    And User clicks on login button
    Then User should be logged in successfully
