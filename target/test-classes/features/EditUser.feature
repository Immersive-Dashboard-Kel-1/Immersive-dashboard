@EditUser
  Feature: Edit user
    Scenario: Edit existing user with valid data
      Given User open website immersive dashboard
      When User input username "admin@alta.com"
      And User input password "admin"
      And Click login button
      And User already on dashboard page
      And User click user menu
      And User click edit button
      And User input new name "riski"
      And User click save button on edit page
      Then User has a new name

    Scenario: Create new user with empty email
      Given User open website immersive dashboard
      When User input username "admin@alta.com"
      And User input password "admin"
      And Click login button
      And User already on dashboard page
      And User click user menu
      And User click edit button
      And User input new name " "
      And User click save button on edit page
      Then System show any message

    Scenario: Edit existing user with cancel button
      Given User open website immersive dashboard
      When User input username "admin@alta.com"
      And User input password "admin"
      And Click login button
      And User already on dashboard page
      And User click user menu
      And User click edit button
      And User input new name "riski"
      And User click cancel button on edit page
      Then System show no change

