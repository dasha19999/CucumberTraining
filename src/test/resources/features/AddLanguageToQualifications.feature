Feature: Add Language to qualifications

Background:
Given user is navigated to HRMS application
When user enters valid admin username and valid admin password
And user clicks on login button
Then user is successfully logged in

@addLanguage
  Scenario: Adding new language to qualifications
    When user selects admin option from dashboard
    And user clicks on qualifications
    And from dropdown user clicks on language
    And user clicks on Add button
    And user clicks textBox
    And user clicks save button
   Then user selects language checkbox
   And user clicks on delete button to delete the language

