Feature: delete user
  Scenario: delete existing user
    Given User open website immersive dashboard
    When User input username "admin@alta.com"
    And User input password "admin"
    And Click login button
    And User already on dashboard page
    And User click user menu
    Then User click any delete button
