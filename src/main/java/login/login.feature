Feature: Verify user is able to login to the shopsite
  Scenario: verify the login is working with right credentials
    Given user is on login page
    And user is able to enter credentials and press login button
    Then user is navigated to the login page

