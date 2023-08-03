@smoke
Feature: F01_Register | users could register with new accounts
  Scenario: guest user could register with valid data successfully
  Given user go to register page
  When user select gender type
  And user enter first name "eman automation"
  And user enter last name "tester"
  And user enter date of birth
  And user enter email "testeman@example.com" field
  And user fills Password field "P@ssw0rd"
  And user fills Confirm Password field "P@ssw0rd"
  And user clicks on register button
  Then success message is displayed
