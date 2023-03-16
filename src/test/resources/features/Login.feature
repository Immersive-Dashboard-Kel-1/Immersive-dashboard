@Login
  Feature: login
    Scenario: Login with valid email and password
      Given User open website immersive dashboard
      When User input username "admin@alta.com"
      And User input password "admin"
      And Click login button
      Then User already on dashboard page

    Scenario: Login with invalid email or password
      Given User open website immersive dashboard
      When User input username " "
      And User input password "admin"
      And Click login button
      Then System show wrong email or password