Feature: contact details
Background:
  When user enters valid admin username and valid admin password
  And user clicks on login button
  Then user is successfully logged in
  When user clicks on PIM option
  And user clicks on Employee List button
  When user enters valid employee id
  And user clicks the search button
  And user clicks the employee
  Then employee's personal page is displayed
  And user clicks on Contact Details button
@test6
  Scenario: editing employee contact details

    Given the contact details are displayed

    And user clicks on Edit button

    When I enter "123 West ln" in the Address Street First textbox

    And I enter "apt 103" in the Address Street Second textbox

    And I enter "Kazan" in the City textbox

    And I enter "Tatarstan" or province in the State textbox

    And I enter "23456" in the Zip Postal Code textbox

    And I select "Albania" from the Country dropdown

    And I enter "567-678-5678" number in the Home Phone textbox

    And I enter "345-678-8909" number in the Mobile Phone textbox

    And I enter "757-024-4758" number in the Work Phone textbox

    And I enter "superhero23456@gmail.com" in the Work Email textbox

    And I enter "supermario34567@yahoo.com" in the Other Email textbox

    Then I should be able to submit the form

    And  contact information should be saved successfully.
