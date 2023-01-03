Feature: Add Language to qualifications

Background:
Given user is navigated to HRMS application
When user enters valid admin username and valid admin password
And user clicks on login button
Then user is successfully logged in

@test16
  Scenario: Adding new language to qualifications
    When user selects admin option from dashboard
    And user clicks on qualifications
    And from dropdown user clicks on language
    And user clicks on Add button
    And user inputs "Urdu" in textBox
    And user clicks save button
    Then language is succesfully added
  Then user can delete language "Urdu" for retesting


