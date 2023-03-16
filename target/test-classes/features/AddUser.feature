@AddUser
  Feature: Add new user data
    Scenario: Create new user with valid all data
      Given User open website immersive dashboard
      When User input username "admin@alta.com"
      And User input password "admin"
      And Click login button
      And User already on dashboard page
      And User click user menu
      And User click add new button
      And User input nama "riski"
      And User input email "coba@gmail.com"
      And User input password registration "coba"
      And User select team "Mentor"
      And User select status "Active"
      And User click save button
      Then User created

    Scenario: Create new user with empty email
      Given User open website immersive dashboard
      When User input username "admin@alta.com"
      And User input password "admin"
      And Click login button
      And User already on dashboard page
      And User click user menu
      And User click add new button
      And User input nama "riski"
      And User input email " "
      And User input password registration "coba"
      And User select team "Mentor"
      And User select status "Active"
      And User click save button
      Then System show message email can not empty
