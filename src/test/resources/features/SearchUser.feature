@SearchUser
  Feature: Search user
    Scenario: search user with alphabet
      Given User open website immersive dashboard
      When User input username "admin@alta.com"
      And User input password "admin"
      And Click login button
      And User already on dashboard page
      And User click user menu
      And User input search user "Admin"
      Then system show user related